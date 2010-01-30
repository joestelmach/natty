// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g 2010-01-29 13:56:24
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INTEGER", "HOURS", "MINUTES", "AM_PM", "DAY_OF_MONTH", "DAY_OF_WEEK", "SPAN", "SEEK_DIRECTION", "SEEK_TYPE", "EXPLICIT_TIME", "EXPLICIT_DATE", "RELATIVE_DATE", "DATE_TIME", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "TODAY", "TOMORROW", "YESTERDAY", "DAY", "WEEK", "MONTH", "YEAR", "MIDNIGHT", "NOON", "DASH", "SLASH", "AM", "PM", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN", "TWENTY", "THIRTY", "FIRST", "SECOND", "THIRD", "FOURTH", "FIFTH", "SIXTH", "SEVENTH", "EIGHTH", "NINTH", "TENTH", "ELEVENTH", "TWELFTH", "THIRTEENTH", "FOURTEENTH", "FIFTEENTH", "SIXTEENTH", "SEVENTEENTH", "EIGHTEENTH", "NINETEENTH", "TWENTIETH", "TWENTY_FIRST", "TWENTY_SECOND", "TWENTY_THIRD", "TWENTY_FOURTH", "TWENTY_FIFTH", "TWENTY_SIXTH", "TWENTY_SEVENTH", "TWENTY_EIGHTH", "TWENTY_NINTH", "THIRTIETH", "THIRTY_FIRST", "THREE_DIGIT", "FOUR_DIGIT", "ONE_TO_TWELVE", "TWO_ZEROS", "THIRTEEN_TO_TWENTY_THREE", "TWENTY_FOUR_TO_THIRTY_ONE", "THIRTY_TWO_TO_FIFTY_NINE", "SIXTY_TO_NINETY_NINE", "DIGIT", "WHITE_SPACE", "'at'", "'on'", "','", "'of'", "':'", "'the'", "'day after '", "'day before '", "'this'", "'last'", "'next'", "'past'", "'coming'", "'upcoming'", "'from now'", "'ago'", "'\\''", "'in the'"
    };
    public static final int NINETEEN=67;
    public static final int SEPTEMBER=25;
    public static final int WEEK=40;
    public static final int THIRTEEN_TO_TWENTY_THREE=105;
    public static final int WEDNESDAY=32;
    public static final int TWENTY_EIGHTH=97;
    public static final int TWENTY=68;
    public static final int JULY=23;
    public static final int APRIL=20;
    public static final int NINETEENTH=88;
    public static final int OCTOBER=26;
    public static final int DAY=39;
    public static final int ONE=49;
    public static final int MIDNIGHT=43;
    public static final int MARCH=19;
    public static final int EOF=-1;
    public static final int MONTH=41;
    public static final int SEVENTEEN=65;
    public static final int DATE_TIME=16;
    public static final int AM_PM=7;
    public static final int SIXTY_TO_NINETY_NINE=108;
    public static final int TWENTY_SEVENTH=96;
    public static final int TWENTY_FIFTH=94;
    public static final int EIGHTEENTH=87;
    public static final int SPAN=10;
    public static final int THIRTIETH=99;
    public static final int NOON=44;
    public static final int EIGHTEEN=66;
    public static final int TWENTY_FOUR_TO_THIRTY_ONE=106;
    public static final int RELATIVE_DATE=15;
    public static final int TOMORROW=37;
    public static final int FOUR_DIGIT=102;
    public static final int FIFTEENTH=84;
    public static final int TODAY=36;
    public static final int FOURTH=73;
    public static final int SECOND=71;
    public static final int NOVEMBER=27;
    public static final int SATURDAY=35;
    public static final int FOUR=52;
    public static final int SEVENTH=76;
    public static final int TEN=58;
    public static final int FEBRUARY=18;
    public static final int MONDAY=30;
    public static final int DAY_OF_WEEK=9;
    public static final int SUNDAY=29;
    public static final int SEVEN=55;
    public static final int ELEVEN=59;
    public static final int THIRTEEN=61;
    public static final int JUNE=22;
    public static final int EXPLICIT_DATE=14;
    public static final int SIX=54;
    public static final int FIFTH=74;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int TWENTY_NINTH=98;
    public static final int T__127=127;
    public static final int THURSDAY=33;
    public static final int DECEMBER=28;
    public static final int AUGUST=24;
    public static final int PM=48;
    public static final int EXPLICIT_TIME=13;
    public static final int TUESDAY=31;
    public static final int THIRTY_TWO_TO_FIFTY_NINE=107;
    public static final int EIGHTH=77;
    public static final int THIRD=72;
    public static final int YEAR=42;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int TENTH=79;
    public static final int MAY=21;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int TWENTY_FOURTH=93;
    public static final int THREE_DIGIT=101;
    public static final int WHITE_SPACE=110;
    public static final int SEEK_TYPE=12;
    public static final int FRIDAY=34;
    public static final int EIGHT=56;
    public static final int TWENTY_SIXTH=95;
    public static final int SLASH=46;
    public static final int NINTH=78;
    public static final int FIVE=53;
    public static final int THIRTY=69;
    public static final int TWENTIETH=89;
    public static final int TWENTY_SECOND=91;
    public static final int T__111=111;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int TWO_ZEROS=104;
    public static final int DIGIT=109;
    public static final int AM=47;
    public static final int INTEGER=4;
    public static final int DASH=45;
    public static final int FOURTEENTH=83;
    public static final int SIXTEEN=64;
    public static final int SEEK_DIRECTION=11;
    public static final int TWELVE=60;
    public static final int ELEVENTH=80;
    public static final int TWO=50;
    public static final int SIXTEENTH=85;
    public static final int JANUARY=17;
    public static final int THIRTEENTH=82;
    public static final int MINUTES=6;
    public static final int DAY_OF_MONTH=8;
    public static final int FIFTEEN=63;
    public static final int TWELFTH=81;
    public static final int NINE=57;
    public static final int SIXTH=75;
    public static final int TWENTY_FIRST=90;
    public static final int THREE=51;
    public static final int FOURTEEN=62;
    public static final int ONE_TO_TWELVE=103;
    public static final int TWENTY_THIRD=92;
    public static final int YESTERDAY=38;
    public static final int SEVENTEENTH=86;
    public static final int HOURS=5;
    public static final int THIRTY_FIRST=100;
    public static final int FIRST=70;

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:26:1: datetime options {backtrack=true; } : ( date ( 'at' )? ( time )? -> ^( DATE_TIME date ( time )? ) | time ( 'on' )? date -> ^( DATE_TIME date time ) | time -> ^( DATE_TIME ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"0\"] ) time ) );
    public final DateParser.datetime_return datetime() throws RecognitionException {
        DateParser.datetime_return retval = new DateParser.datetime_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal2=null;
        Token string_literal5=null;
        DateParser.date_return date1 = null;

        DateParser.time_return time3 = null;

        DateParser.time_return time4 = null;

        DateParser.date_return date6 = null;

        DateParser.time_return time7 = null;


        Object string_literal2_tree=null;
        Object string_literal5_tree=null;
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleSubtreeStream stream_time=new RewriteRuleSubtreeStream(adaptor,"rule time");
        RewriteRuleSubtreeStream stream_date=new RewriteRuleSubtreeStream(adaptor,"rule date");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:28:3: ( date ( 'at' )? ( time )? -> ^( DATE_TIME date ( time )? ) | time ( 'on' )? date -> ^( DATE_TIME date time ) | time -> ^( DATE_TIME ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"0\"] ) time ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:28:5: date ( 'at' )? ( time )?
                    {
                    pushFollow(FOLLOW_date_in_datetime118);
                    date1=date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_date.add(date1.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:28:10: ( 'at' )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==111) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:28:10: 'at'
                            {
                            string_literal2=(Token)match(input,111,FOLLOW_111_in_datetime120); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_111.add(string_literal2);


                            }
                            break;

                    }

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:28:16: ( time )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( ((LA2_0>=MIDNIGHT && LA2_0<=NOON)||(LA2_0>=ONE_TO_TWELVE && LA2_0<=THIRTEEN_TO_TWENTY_THREE)) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:28:16: time
                            {
                            pushFollow(FOLLOW_time_in_datetime123);
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
                    // 28:22: -> ^( DATE_TIME date ( time )? )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:28:25: ^( DATE_TIME date ( time )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DATE_TIME, "DATE_TIME"), root_1);

                        adaptor.addChild(root_1, stream_date.nextTree());
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:28:42: ( time )?
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:29:5: time ( 'on' )? date
                    {
                    pushFollow(FOLLOW_time_in_datetime141);
                    time4=time();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_time.add(time4.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:29:10: ( 'on' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==112) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:29:10: 'on'
                            {
                            string_literal5=(Token)match(input,112,FOLLOW_112_in_datetime143); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_112.add(string_literal5);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_date_in_datetime146);
                    date6=date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_date.add(date6.getTree());


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
                    // 29:21: -> ^( DATE_TIME date time )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:29:24: ^( DATE_TIME date time )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:5: time
                    {
                    pushFollow(FOLLOW_time_in_datetime162);
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
                    // 30:10: -> ^( DATE_TIME ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"0\"] ) time )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:13: ^( DATE_TIME ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"0\"] ) time )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DATE_TIME, "DATE_TIME"), root_1);

                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:25: ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"0\"] )
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:33:1: date : ( relative_date | explicit_date );
    public final DateParser.date_return date() throws RecognitionException {
        DateParser.date_return retval = new DateParser.date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.relative_date_return relative_date8 = null;

        DateParser.explicit_date_return explicit_date9 = null;



        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:34:3: ( relative_date | explicit_date )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:34:5: relative_date
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_relative_date_in_date195);
                    relative_date8=relative_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, relative_date8.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:35:5: explicit_date
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_explicit_date_in_date202);
                    explicit_date9=explicit_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, explicit_date9.getTree());

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:38:1: time : explicit_time ;
    public final DateParser.time_return time() throws RecognitionException {
        DateParser.time_return retval = new DateParser.time_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.explicit_time_return explicit_time10 = null;



        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:39:3: ( explicit_time )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:39:5: explicit_time
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_explicit_time_in_time218);
            explicit_time10=explicit_time();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, explicit_time10.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:42:1: relative_date : ( today_or_tomorrow | relative_prefix modifiable_target -> ^( RELATIVE_DATE relative_prefix modifiable_target ) | spelled_or_numeric_1_to_31 modifiable_target relative_suffix -> ^( RELATIVE_DATE relative_suffix spelled_or_numeric_1_to_31 modifiable_target ) );
    public final DateParser.relative_date_return relative_date() throws RecognitionException {
        DateParser.relative_date_return retval = new DateParser.relative_date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.today_or_tomorrow_return today_or_tomorrow11 = null;

        DateParser.relative_prefix_return relative_prefix12 = null;

        DateParser.modifiable_target_return modifiable_target13 = null;

        DateParser.spelled_or_numeric_1_to_31_return spelled_or_numeric_1_to_3114 = null;

        DateParser.modifiable_target_return modifiable_target15 = null;

        DateParser.relative_suffix_return relative_suffix16 = null;


        RewriteRuleSubtreeStream stream_relative_suffix=new RewriteRuleSubtreeStream(adaptor,"rule relative_suffix");
        RewriteRuleSubtreeStream stream_relative_prefix=new RewriteRuleSubtreeStream(adaptor,"rule relative_prefix");
        RewriteRuleSubtreeStream stream_spelled_or_numeric_1_to_31=new RewriteRuleSubtreeStream(adaptor,"rule spelled_or_numeric_1_to_31");
        RewriteRuleSubtreeStream stream_modifiable_target=new RewriteRuleSubtreeStream(adaptor,"rule modifiable_target");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:43:3: ( today_or_tomorrow | relative_prefix modifiable_target -> ^( RELATIVE_DATE relative_prefix modifiable_target ) | spelled_or_numeric_1_to_31 modifiable_target relative_suffix -> ^( RELATIVE_DATE relative_suffix spelled_or_numeric_1_to_31 modifiable_target ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case TODAY:
            case TOMORROW:
            case YESTERDAY:
            case 116:
            case 117:
            case 118:
                {
                alt6=1;
                }
                break;
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
                {
                alt6=2;
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
            case ONE_TO_TWELVE:
            case THIRTEEN_TO_TWENTY_THREE:
            case TWENTY_FOUR_TO_THIRTY_ONE:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:43:5: today_or_tomorrow
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_today_or_tomorrow_in_relative_date231);
                    today_or_tomorrow11=today_or_tomorrow();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, today_or_tomorrow11.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:45:5: relative_prefix modifiable_target
                    {
                    pushFollow(FOLLOW_relative_prefix_in_relative_date240);
                    relative_prefix12=relative_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_prefix.add(relative_prefix12.getTree());
                    pushFollow(FOLLOW_modifiable_target_in_relative_date242);
                    modifiable_target13=modifiable_target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifiable_target.add(modifiable_target13.getTree());


                    // AST REWRITE
                    // elements: relative_prefix, modifiable_target
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 46:5: -> ^( RELATIVE_DATE relative_prefix modifiable_target )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:46:8: ^( RELATIVE_DATE relative_prefix modifiable_target )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        adaptor.addChild(root_1, stream_relative_prefix.nextTree());
                        adaptor.addChild(root_1, stream_modifiable_target.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:48:5: spelled_or_numeric_1_to_31 modifiable_target relative_suffix
                    {
                    pushFollow(FOLLOW_spelled_or_numeric_1_to_31_in_relative_date268);
                    spelled_or_numeric_1_to_3114=spelled_or_numeric_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_or_numeric_1_to_31.add(spelled_or_numeric_1_to_3114.getTree());
                    pushFollow(FOLLOW_modifiable_target_in_relative_date270);
                    modifiable_target15=modifiable_target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifiable_target.add(modifiable_target15.getTree());
                    pushFollow(FOLLOW_relative_suffix_in_relative_date272);
                    relative_suffix16=relative_suffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_suffix.add(relative_suffix16.getTree());


                    // AST REWRITE
                    // elements: relative_suffix, spelled_or_numeric_1_to_31, modifiable_target
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 49:5: -> ^( RELATIVE_DATE relative_suffix spelled_or_numeric_1_to_31 modifiable_target )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:49:8: ^( RELATIVE_DATE relative_suffix spelled_or_numeric_1_to_31 modifiable_target )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        adaptor.addChild(root_1, stream_relative_suffix.nextTree());
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

    public static class explicit_date_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "explicit_date"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:53:1: explicit_date options {backtrack=true; } : ( numeric_1_to_12 date_separator numeric_1_to_31 ( date_separator four_digits )? -> ^( EXPLICIT_DATE numeric_1_to_31 numeric_1_to_31 ( four_digits )? ) | four_digits date_separator numeric_1_to_12 date_separator numeric_1_to_31 -> ^( EXPLICIT_DATE numeric_1_to_12 numeric_1_to_31 four_digits ) | month day_of_month ( ( ',' )? year )? -> ^( EXPLICIT_DATE month day_of_month ( year )? ) | day_of_month ( 'of' )? month ( ( ',' )? year )? -> ^( EXPLICIT_DATE month day_of_month ( year )? ) );
    public final DateParser.explicit_date_return explicit_date() throws RecognitionException {
        DateParser.explicit_date_return retval = new DateParser.explicit_date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal29=null;
        Token string_literal32=null;
        Token char_literal34=null;
        DateParser.numeric_1_to_12_return numeric_1_to_1217 = null;

        DateParser.date_separator_return date_separator18 = null;

        DateParser.numeric_1_to_31_return numeric_1_to_3119 = null;

        DateParser.date_separator_return date_separator20 = null;

        DateParser.four_digits_return four_digits21 = null;

        DateParser.four_digits_return four_digits22 = null;

        DateParser.date_separator_return date_separator23 = null;

        DateParser.numeric_1_to_12_return numeric_1_to_1224 = null;

        DateParser.date_separator_return date_separator25 = null;

        DateParser.numeric_1_to_31_return numeric_1_to_3126 = null;

        DateParser.month_return month27 = null;

        DateParser.day_of_month_return day_of_month28 = null;

        DateParser.year_return year30 = null;

        DateParser.day_of_month_return day_of_month31 = null;

        DateParser.month_return month33 = null;

        DateParser.year_return year35 = null;


        Object char_literal29_tree=null;
        Object string_literal32_tree=null;
        Object char_literal34_tree=null;
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleSubtreeStream stream_four_digits=new RewriteRuleSubtreeStream(adaptor,"rule four_digits");
        RewriteRuleSubtreeStream stream_month=new RewriteRuleSubtreeStream(adaptor,"rule month");
        RewriteRuleSubtreeStream stream_year=new RewriteRuleSubtreeStream(adaptor,"rule year");
        RewriteRuleSubtreeStream stream_day_of_month=new RewriteRuleSubtreeStream(adaptor,"rule day_of_month");
        RewriteRuleSubtreeStream stream_numeric_1_to_31=new RewriteRuleSubtreeStream(adaptor,"rule numeric_1_to_31");
        RewriteRuleSubtreeStream stream_numeric_1_to_12=new RewriteRuleSubtreeStream(adaptor,"rule numeric_1_to_12");
        RewriteRuleSubtreeStream stream_date_separator=new RewriteRuleSubtreeStream(adaptor,"rule date_separator");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:55:3: ( numeric_1_to_12 date_separator numeric_1_to_31 ( date_separator four_digits )? -> ^( EXPLICIT_DATE numeric_1_to_31 numeric_1_to_31 ( four_digits )? ) | four_digits date_separator numeric_1_to_12 date_separator numeric_1_to_31 -> ^( EXPLICIT_DATE numeric_1_to_12 numeric_1_to_31 four_digits ) | month day_of_month ( ( ',' )? year )? -> ^( EXPLICIT_DATE month day_of_month ( year )? ) | day_of_month ( 'of' )? month ( ( ',' )? year )? -> ^( EXPLICIT_DATE month day_of_month ( year )? ) )
            int alt13=4;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:55:5: numeric_1_to_12 date_separator numeric_1_to_31 ( date_separator four_digits )?
                    {
                    pushFollow(FOLLOW_numeric_1_to_12_in_explicit_date312);
                    numeric_1_to_1217=numeric_1_to_12();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_numeric_1_to_12.add(numeric_1_to_1217.getTree());
                    pushFollow(FOLLOW_date_separator_in_explicit_date314);
                    date_separator18=date_separator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_date_separator.add(date_separator18.getTree());
                    pushFollow(FOLLOW_numeric_1_to_31_in_explicit_date316);
                    numeric_1_to_3119=numeric_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_numeric_1_to_31.add(numeric_1_to_3119.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:55:52: ( date_separator four_digits )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0>=DASH && LA7_0<=SLASH)) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:55:53: date_separator four_digits
                            {
                            pushFollow(FOLLOW_date_separator_in_explicit_date319);
                            date_separator20=date_separator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_date_separator.add(date_separator20.getTree());
                            pushFollow(FOLLOW_four_digits_in_explicit_date321);
                            four_digits21=four_digits();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_four_digits.add(four_digits21.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: numeric_1_to_31, four_digits, numeric_1_to_31
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 56:5: -> ^( EXPLICIT_DATE numeric_1_to_31 numeric_1_to_31 ( four_digits )? )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:56:8: ^( EXPLICIT_DATE numeric_1_to_31 numeric_1_to_31 ( four_digits )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_1);

                        adaptor.addChild(root_1, stream_numeric_1_to_31.nextTree());
                        adaptor.addChild(root_1, stream_numeric_1_to_31.nextTree());
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:56:56: ( four_digits )?
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:58:5: four_digits date_separator numeric_1_to_12 date_separator numeric_1_to_31
                    {
                    pushFollow(FOLLOW_four_digits_in_explicit_date351);
                    four_digits22=four_digits();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_four_digits.add(four_digits22.getTree());
                    pushFollow(FOLLOW_date_separator_in_explicit_date353);
                    date_separator23=date_separator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_date_separator.add(date_separator23.getTree());
                    pushFollow(FOLLOW_numeric_1_to_12_in_explicit_date355);
                    numeric_1_to_1224=numeric_1_to_12();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_numeric_1_to_12.add(numeric_1_to_1224.getTree());
                    pushFollow(FOLLOW_date_separator_in_explicit_date357);
                    date_separator25=date_separator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_date_separator.add(date_separator25.getTree());
                    pushFollow(FOLLOW_numeric_1_to_31_in_explicit_date359);
                    numeric_1_to_3126=numeric_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_numeric_1_to_31.add(numeric_1_to_3126.getTree());


                    // AST REWRITE
                    // elements: numeric_1_to_31, numeric_1_to_12, four_digits
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 59:5: -> ^( EXPLICIT_DATE numeric_1_to_12 numeric_1_to_31 four_digits )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:59:8: ^( EXPLICIT_DATE numeric_1_to_12 numeric_1_to_31 four_digits )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_1);

                        adaptor.addChild(root_1, stream_numeric_1_to_12.nextTree());
                        adaptor.addChild(root_1, stream_numeric_1_to_31.nextTree());
                        adaptor.addChild(root_1, stream_four_digits.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:61:5: month day_of_month ( ( ',' )? year )?
                    {
                    pushFollow(FOLLOW_month_in_explicit_date386);
                    month27=month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_month.add(month27.getTree());
                    pushFollow(FOLLOW_day_of_month_in_explicit_date388);
                    day_of_month28=day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_day_of_month.add(day_of_month28.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:61:24: ( ( ',' )? year )?
                    int alt9=2;
                    switch ( input.LA(1) ) {
                        case 113:
                        case 127:
                            {
                            alt9=1;
                            }
                            break;
                        case TWO_ZEROS:
                            {
                            alt9=1;
                            }
                            break;
                        case ONE_TO_TWELVE:
                            {
                            alt9=1;
                            }
                            break;
                        case THREE_DIGIT:
                        case FOUR_DIGIT:
                        case THIRTEEN_TO_TWENTY_THREE:
                        case TWENTY_FOUR_TO_THIRTY_ONE:
                        case THIRTY_TWO_TO_FIFTY_NINE:
                        case SIXTY_TO_NINETY_NINE:
                        case 128:
                            {
                            alt9=1;
                            }
                            break;
                    }

                    switch (alt9) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:61:25: ( ',' )? year
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:61:25: ( ',' )?
                            int alt8=2;
                            int LA8_0 = input.LA(1);

                            if ( (LA8_0==113) ) {
                                alt8=1;
                            }
                            switch (alt8) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:61:25: ','
                                    {
                                    char_literal29=(Token)match(input,113,FOLLOW_113_in_explicit_date391); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_113.add(char_literal29);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_year_in_explicit_date394);
                            year30=year();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_year.add(year30.getTree());

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
                    // 62:5: -> ^( EXPLICIT_DATE month day_of_month ( year )? )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:62:8: ^( EXPLICIT_DATE month day_of_month ( year )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_1);

                        adaptor.addChild(root_1, stream_month.nextTree());
                        adaptor.addChild(root_1, stream_day_of_month.nextTree());
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:62:43: ( year )?
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:64:5: day_of_month ( 'of' )? month ( ( ',' )? year )?
                    {
                    pushFollow(FOLLOW_day_of_month_in_explicit_date424);
                    day_of_month31=day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_day_of_month.add(day_of_month31.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:64:18: ( 'of' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==114) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:64:18: 'of'
                            {
                            string_literal32=(Token)match(input,114,FOLLOW_114_in_explicit_date426); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_114.add(string_literal32);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_month_in_explicit_date429);
                    month33=month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_month.add(month33.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:64:30: ( ( ',' )? year )?
                    int alt12=2;
                    switch ( input.LA(1) ) {
                        case 113:
                        case 127:
                            {
                            alt12=1;
                            }
                            break;
                        case TWO_ZEROS:
                            {
                            alt12=1;
                            }
                            break;
                        case ONE_TO_TWELVE:
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
                        case 128:
                            {
                            alt12=1;
                            }
                            break;
                    }

                    switch (alt12) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:64:31: ( ',' )? year
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:64:31: ( ',' )?
                            int alt11=2;
                            int LA11_0 = input.LA(1);

                            if ( (LA11_0==113) ) {
                                alt11=1;
                            }
                            switch (alt11) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:64:31: ','
                                    {
                                    char_literal34=(Token)match(input,113,FOLLOW_113_in_explicit_date432); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_113.add(char_literal34);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_year_in_explicit_date435);
                            year35=year();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_year.add(year35.getTree());

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
                    // 65:5: -> ^( EXPLICIT_DATE month day_of_month ( year )? )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:65:8: ^( EXPLICIT_DATE month day_of_month ( year )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_1);

                        adaptor.addChild(root_1, stream_month.nextTree());
                        adaptor.addChild(root_1, stream_day_of_month.nextTree());
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:65:43: ( year )?
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:69:1: explicit_time : ( numeric_0_to_23 ( meridian_indicator )? -> ^( EXPLICIT_TIME numeric_0_to_23 MINUTES[\"0\"] ( meridian_indicator )? ) | numeric_0_to_23 ':' numeric_0_to_59 ( meridian_indicator )? -> ^( EXPLICIT_TIME numeric_0_to_23 numeric_0_to_59 ( meridian_indicator )? ) | time_identifier );
    public final DateParser.explicit_time_return explicit_time() throws RecognitionException {
        DateParser.explicit_time_return retval = new DateParser.explicit_time_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal39=null;
        DateParser.numeric_0_to_23_return numeric_0_to_2336 = null;

        DateParser.meridian_indicator_return meridian_indicator37 = null;

        DateParser.numeric_0_to_23_return numeric_0_to_2338 = null;

        DateParser.numeric_0_to_59_return numeric_0_to_5940 = null;

        DateParser.meridian_indicator_return meridian_indicator41 = null;

        DateParser.time_identifier_return time_identifier42 = null;


        Object char_literal39_tree=null;
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleSubtreeStream stream_meridian_indicator=new RewriteRuleSubtreeStream(adaptor,"rule meridian_indicator");
        RewriteRuleSubtreeStream stream_numeric_0_to_59=new RewriteRuleSubtreeStream(adaptor,"rule numeric_0_to_59");
        RewriteRuleSubtreeStream stream_numeric_0_to_23=new RewriteRuleSubtreeStream(adaptor,"rule numeric_0_to_23");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:71:3: ( numeric_0_to_23 ( meridian_indicator )? -> ^( EXPLICIT_TIME numeric_0_to_23 MINUTES[\"0\"] ( meridian_indicator )? ) | numeric_0_to_23 ':' numeric_0_to_59 ( meridian_indicator )? -> ^( EXPLICIT_TIME numeric_0_to_23 numeric_0_to_59 ( meridian_indicator )? ) | time_identifier )
            int alt16=3;
            switch ( input.LA(1) ) {
            case TWO_ZEROS:
                {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==EOF||(LA16_1>=JANUARY && LA16_1<=DECEMBER)||(LA16_1>=TODAY && LA16_1<=YESTERDAY)||(LA16_1>=AM && LA16_1<=SIXTY_TO_NINETY_NINE)||LA16_1==112||(LA16_1>=116 && LA16_1<=124)) ) {
                    alt16=1;
                }
                else if ( (LA16_1==115) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
                }
                break;
            case ONE_TO_TWELVE:
                {
                int LA16_2 = input.LA(2);

                if ( (LA16_2==EOF||(LA16_2>=JANUARY && LA16_2<=DECEMBER)||(LA16_2>=TODAY && LA16_2<=YESTERDAY)||(LA16_2>=AM && LA16_2<=SIXTY_TO_NINETY_NINE)||LA16_2==112||(LA16_2>=116 && LA16_2<=124)) ) {
                    alt16=1;
                }
                else if ( (LA16_2==115) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;
                }
                }
                break;
            case THIRTEEN_TO_TWENTY_THREE:
                {
                int LA16_3 = input.LA(2);

                if ( (LA16_3==115) ) {
                    alt16=2;
                }
                else if ( (LA16_3==EOF||(LA16_3>=JANUARY && LA16_3<=DECEMBER)||(LA16_3>=TODAY && LA16_3<=YESTERDAY)||(LA16_3>=AM && LA16_3<=SIXTY_TO_NINETY_NINE)||LA16_3==112||(LA16_3>=116 && LA16_3<=124)) ) {
                    alt16=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 3, input);

                    throw nvae;
                }
                }
                break;
            case MIDNIGHT:
            case NOON:
                {
                alt16=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:71:5: numeric_0_to_23 ( meridian_indicator )?
                    {
                    pushFollow(FOLLOW_numeric_0_to_23_in_explicit_time476);
                    numeric_0_to_2336=numeric_0_to_23();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_numeric_0_to_23.add(numeric_0_to_2336.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:71:21: ( meridian_indicator )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( ((LA14_0>=AM && LA14_0<=PM)) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:71:21: meridian_indicator
                            {
                            pushFollow(FOLLOW_meridian_indicator_in_explicit_time478);
                            meridian_indicator37=meridian_indicator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_meridian_indicator.add(meridian_indicator37.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: meridian_indicator, numeric_0_to_23
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 72:5: -> ^( EXPLICIT_TIME numeric_0_to_23 MINUTES[\"0\"] ( meridian_indicator )? )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:72:8: ^( EXPLICIT_TIME numeric_0_to_23 MINUTES[\"0\"] ( meridian_indicator )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        adaptor.addChild(root_1, stream_numeric_0_to_23.nextTree());
                        adaptor.addChild(root_1, (Object)adaptor.create(MINUTES, "0"));
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:72:53: ( meridian_indicator )?
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:75:5: numeric_0_to_23 ':' numeric_0_to_59 ( meridian_indicator )?
                    {
                    pushFollow(FOLLOW_numeric_0_to_23_in_explicit_time510);
                    numeric_0_to_2338=numeric_0_to_23();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_numeric_0_to_23.add(numeric_0_to_2338.getTree());
                    char_literal39=(Token)match(input,115,FOLLOW_115_in_explicit_time512); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_115.add(char_literal39);

                    pushFollow(FOLLOW_numeric_0_to_59_in_explicit_time514);
                    numeric_0_to_5940=numeric_0_to_59();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_numeric_0_to_59.add(numeric_0_to_5940.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:75:41: ( meridian_indicator )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( ((LA15_0>=AM && LA15_0<=PM)) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:75:41: meridian_indicator
                            {
                            pushFollow(FOLLOW_meridian_indicator_in_explicit_time516);
                            meridian_indicator41=meridian_indicator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_meridian_indicator.add(meridian_indicator41.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: numeric_0_to_59, numeric_0_to_23, meridian_indicator
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 76:5: -> ^( EXPLICIT_TIME numeric_0_to_23 numeric_0_to_59 ( meridian_indicator )? )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:76:8: ^( EXPLICIT_TIME numeric_0_to_23 numeric_0_to_59 ( meridian_indicator )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        adaptor.addChild(root_1, stream_numeric_0_to_23.nextTree());
                        adaptor.addChild(root_1, stream_numeric_0_to_59.nextTree());
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:76:56: ( meridian_indicator )?
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:78:5: time_identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_time_identifier_in_explicit_time544);
                    time_identifier42=time_identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, time_identifier42.getTree());

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

    public static class month_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "month"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:81:1: month : ( JANUARY -> MONTH[\"1\"] | FEBRUARY -> MONTH[\"2\"] | MARCH -> MONTH[\"3\"] | APRIL -> MONTH[\"4\"] | MAY -> MONTH[\"5\"] | JUNE -> MONTH[\"6\"] | JULY -> MONTH[\"7\"] | AUGUST -> MONTH[\"8\"] | SEPTEMBER -> MONTH[\"9\"] | OCTOBER -> MONTH[\"10\"] | NOVEMBER -> MONTH[\"11\"] | DECEMBER -> MONTH[\"12\"] );
    public final DateParser.month_return month() throws RecognitionException {
        DateParser.month_return retval = new DateParser.month_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token JANUARY43=null;
        Token FEBRUARY44=null;
        Token MARCH45=null;
        Token APRIL46=null;
        Token MAY47=null;
        Token JUNE48=null;
        Token JULY49=null;
        Token AUGUST50=null;
        Token SEPTEMBER51=null;
        Token OCTOBER52=null;
        Token NOVEMBER53=null;
        Token DECEMBER54=null;

        Object JANUARY43_tree=null;
        Object FEBRUARY44_tree=null;
        Object MARCH45_tree=null;
        Object APRIL46_tree=null;
        Object MAY47_tree=null;
        Object JUNE48_tree=null;
        Object JULY49_tree=null;
        Object AUGUST50_tree=null;
        Object SEPTEMBER51_tree=null;
        Object OCTOBER52_tree=null;
        Object NOVEMBER53_tree=null;
        Object DECEMBER54_tree=null;
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:82:3: ( JANUARY -> MONTH[\"1\"] | FEBRUARY -> MONTH[\"2\"] | MARCH -> MONTH[\"3\"] | APRIL -> MONTH[\"4\"] | MAY -> MONTH[\"5\"] | JUNE -> MONTH[\"6\"] | JULY -> MONTH[\"7\"] | AUGUST -> MONTH[\"8\"] | SEPTEMBER -> MONTH[\"9\"] | OCTOBER -> MONTH[\"10\"] | NOVEMBER -> MONTH[\"11\"] | DECEMBER -> MONTH[\"12\"] )
            int alt17=12;
            switch ( input.LA(1) ) {
            case JANUARY:
                {
                alt17=1;
                }
                break;
            case FEBRUARY:
                {
                alt17=2;
                }
                break;
            case MARCH:
                {
                alt17=3;
                }
                break;
            case APRIL:
                {
                alt17=4;
                }
                break;
            case MAY:
                {
                alt17=5;
                }
                break;
            case JUNE:
                {
                alt17=6;
                }
                break;
            case JULY:
                {
                alt17=7;
                }
                break;
            case AUGUST:
                {
                alt17=8;
                }
                break;
            case SEPTEMBER:
                {
                alt17=9;
                }
                break;
            case OCTOBER:
                {
                alt17=10;
                }
                break;
            case NOVEMBER:
                {
                alt17=11;
                }
                break;
            case DECEMBER:
                {
                alt17=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:82:5: JANUARY
                    {
                    JANUARY43=(Token)match(input,JANUARY,FOLLOW_JANUARY_in_month559); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_JANUARY.add(JANUARY43);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 82:15: -> MONTH[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:83:5: FEBRUARY
                    {
                    FEBRUARY44=(Token)match(input,FEBRUARY,FOLLOW_FEBRUARY_in_month572); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FEBRUARY.add(FEBRUARY44);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 83:15: -> MONTH[\"2\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "2"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:84:5: MARCH
                    {
                    MARCH45=(Token)match(input,MARCH,FOLLOW_MARCH_in_month584); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MARCH.add(MARCH45);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 84:15: -> MONTH[\"3\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "3"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:85:5: APRIL
                    {
                    APRIL46=(Token)match(input,APRIL,FOLLOW_APRIL_in_month599); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_APRIL.add(APRIL46);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 85:15: -> MONTH[\"4\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "4"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:86:5: MAY
                    {
                    MAY47=(Token)match(input,MAY,FOLLOW_MAY_in_month614); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MAY.add(MAY47);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 86:15: -> MONTH[\"5\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "5"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:87:5: JUNE
                    {
                    JUNE48=(Token)match(input,JUNE,FOLLOW_JUNE_in_month631); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_JUNE.add(JUNE48);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 87:15: -> MONTH[\"6\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "6"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:88:5: JULY
                    {
                    JULY49=(Token)match(input,JULY,FOLLOW_JULY_in_month647); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_JULY.add(JULY49);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 88:15: -> MONTH[\"7\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "7"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:89:5: AUGUST
                    {
                    AUGUST50=(Token)match(input,AUGUST,FOLLOW_AUGUST_in_month663); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AUGUST.add(AUGUST50);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 89:15: -> MONTH[\"8\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "8"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:90:5: SEPTEMBER
                    {
                    SEPTEMBER51=(Token)match(input,SEPTEMBER,FOLLOW_SEPTEMBER_in_month677); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEPTEMBER.add(SEPTEMBER51);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 90:15: -> MONTH[\"9\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "9"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:91:5: OCTOBER
                    {
                    OCTOBER52=(Token)match(input,OCTOBER,FOLLOW_OCTOBER_in_month688); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OCTOBER.add(OCTOBER52);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 91:15: -> MONTH[\"10\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "10"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:92:5: NOVEMBER
                    {
                    NOVEMBER53=(Token)match(input,NOVEMBER,FOLLOW_NOVEMBER_in_month701); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOVEMBER.add(NOVEMBER53);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 92:15: -> MONTH[\"11\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "11"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:93:5: DECEMBER
                    {
                    DECEMBER54=(Token)match(input,DECEMBER,FOLLOW_DECEMBER_in_month713); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DECEMBER.add(DECEMBER54);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 93:15: -> MONTH[\"12\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "12"));

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:96:1: day_of_month : ( spelled_number_1_to_31 -> DAY_OF_MONTH[$spelled_number_1_to_31.text] | spelled_sequence_1_to_31 -> DAY_OF_MONTH[$spelled_sequence_1_to_31.text] | numeric_1_to_31 -> DAY_OF_MONTH[$numeric_1_to_31.text] );
    public final DateParser.day_of_month_return day_of_month() throws RecognitionException {
        DateParser.day_of_month_return retval = new DateParser.day_of_month_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.spelled_number_1_to_31_return spelled_number_1_to_3155 = null;

        DateParser.spelled_sequence_1_to_31_return spelled_sequence_1_to_3156 = null;

        DateParser.numeric_1_to_31_return numeric_1_to_3157 = null;


        RewriteRuleSubtreeStream stream_spelled_sequence_1_to_31=new RewriteRuleSubtreeStream(adaptor,"rule spelled_sequence_1_to_31");
        RewriteRuleSubtreeStream stream_spelled_number_1_to_31=new RewriteRuleSubtreeStream(adaptor,"rule spelled_number_1_to_31");
        RewriteRuleSubtreeStream stream_numeric_1_to_31=new RewriteRuleSubtreeStream(adaptor,"rule numeric_1_to_31");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:97:3: ( spelled_number_1_to_31 -> DAY_OF_MONTH[$spelled_number_1_to_31.text] | spelled_sequence_1_to_31 -> DAY_OF_MONTH[$spelled_sequence_1_to_31.text] | numeric_1_to_31 -> DAY_OF_MONTH[$numeric_1_to_31.text] )
            int alt18=3;
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
                {
                alt18=1;
                }
                break;
            case TWENTY:
                {
                switch ( input.LA(2) ) {
                case DASH:
                    {
                    int LA18_6 = input.LA(3);

                    if ( ((LA18_6>=FIRST && LA18_6<=NINTH)) ) {
                        alt18=2;
                    }
                    else if ( ((LA18_6>=ONE && LA18_6<=NINE)) ) {
                        alt18=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
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
                case TWO_ZEROS:
                case THIRTEEN_TO_TWENTY_THREE:
                case TWENTY_FOUR_TO_THIRTY_ONE:
                case THIRTY_TWO_TO_FIFTY_NINE:
                case SIXTY_TO_NINETY_NINE:
                case 111:
                case 113:
                case 114:
                case 127:
                case 128:
                    {
                    alt18=1;
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
                    alt18=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 2, input);

                    throw nvae;
                }

                }
                break;
            case THIRTY:
                {
                switch ( input.LA(2) ) {
                case DASH:
                    {
                    int LA18_7 = input.LA(3);

                    if ( (LA18_7==ONE) ) {
                        alt18=1;
                    }
                    else if ( (LA18_7==FIRST) ) {
                        alt18=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 7, input);

                        throw nvae;
                    }
                    }
                    break;
                case FIRST:
                    {
                    alt18=2;
                    }
                    break;
                case EOF:
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
                case TWO_ZEROS:
                case THIRTEEN_TO_TWENTY_THREE:
                case TWENTY_FOUR_TO_THIRTY_ONE:
                case THIRTY_TWO_TO_FIFTY_NINE:
                case SIXTY_TO_NINETY_NINE:
                case 111:
                case 113:
                case 114:
                case 127:
                case 128:
                    {
                    alt18=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 3, input);

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
                alt18=2;
                }
                break;
            case ONE_TO_TWELVE:
            case THIRTEEN_TO_TWENTY_THREE:
            case TWENTY_FOUR_TO_THIRTY_ONE:
                {
                alt18=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:97:5: spelled_number_1_to_31
                    {
                    pushFollow(FOLLOW_spelled_number_1_to_31_in_day_of_month734);
                    spelled_number_1_to_3155=spelled_number_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_number_1_to_31.add(spelled_number_1_to_3155.getTree());


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 97:31: -> DAY_OF_MONTH[$spelled_number_1_to_31.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, (spelled_number_1_to_3155!=null?input.toString(spelled_number_1_to_3155.start,spelled_number_1_to_3155.stop):null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:98:5: spelled_sequence_1_to_31
                    {
                    pushFollow(FOLLOW_spelled_sequence_1_to_31_in_day_of_month748);
                    spelled_sequence_1_to_3156=spelled_sequence_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_sequence_1_to_31.add(spelled_sequence_1_to_3156.getTree());


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 98:32: -> DAY_OF_MONTH[$spelled_sequence_1_to_31.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, (spelled_sequence_1_to_3156!=null?input.toString(spelled_sequence_1_to_3156.start,spelled_sequence_1_to_3156.stop):null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:99:5: numeric_1_to_31
                    {
                    pushFollow(FOLLOW_numeric_1_to_31_in_day_of_month761);
                    numeric_1_to_3157=numeric_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_numeric_1_to_31.add(numeric_1_to_3157.getTree());


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 99:21: -> DAY_OF_MONTH[$numeric_1_to_31.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, (numeric_1_to_3157!=null?input.toString(numeric_1_to_3157.start,numeric_1_to_3157.stop):null)));

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:102:1: day_of_week : ( SUNDAY -> DAY_OF_WEEK[\"1\"] | MONDAY -> DAY_OF_WEEK[\"2\"] | TUESDAY -> DAY_OF_WEEK[\"3\"] | WEDNESDAY -> DAY_OF_WEEK[\"4\"] | THURSDAY -> DAY_OF_WEEK[\"5\"] | FRIDAY -> DAY_OF_WEEK[\"6\"] | SATURDAY -> DAY_OF_WEEK[\"7\"] );
    public final DateParser.day_of_week_return day_of_week() throws RecognitionException {
        DateParser.day_of_week_return retval = new DateParser.day_of_week_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SUNDAY58=null;
        Token MONDAY59=null;
        Token TUESDAY60=null;
        Token WEDNESDAY61=null;
        Token THURSDAY62=null;
        Token FRIDAY63=null;
        Token SATURDAY64=null;

        Object SUNDAY58_tree=null;
        Object MONDAY59_tree=null;
        Object TUESDAY60_tree=null;
        Object WEDNESDAY61_tree=null;
        Object THURSDAY62_tree=null;
        Object FRIDAY63_tree=null;
        Object SATURDAY64_tree=null;
        RewriteRuleTokenStream stream_MONDAY=new RewriteRuleTokenStream(adaptor,"token MONDAY");
        RewriteRuleTokenStream stream_SUNDAY=new RewriteRuleTokenStream(adaptor,"token SUNDAY");
        RewriteRuleTokenStream stream_WEDNESDAY=new RewriteRuleTokenStream(adaptor,"token WEDNESDAY");
        RewriteRuleTokenStream stream_THURSDAY=new RewriteRuleTokenStream(adaptor,"token THURSDAY");
        RewriteRuleTokenStream stream_SATURDAY=new RewriteRuleTokenStream(adaptor,"token SATURDAY");
        RewriteRuleTokenStream stream_TUESDAY=new RewriteRuleTokenStream(adaptor,"token TUESDAY");
        RewriteRuleTokenStream stream_FRIDAY=new RewriteRuleTokenStream(adaptor,"token FRIDAY");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:103:3: ( SUNDAY -> DAY_OF_WEEK[\"1\"] | MONDAY -> DAY_OF_WEEK[\"2\"] | TUESDAY -> DAY_OF_WEEK[\"3\"] | WEDNESDAY -> DAY_OF_WEEK[\"4\"] | THURSDAY -> DAY_OF_WEEK[\"5\"] | FRIDAY -> DAY_OF_WEEK[\"6\"] | SATURDAY -> DAY_OF_WEEK[\"7\"] )
            int alt19=7;
            switch ( input.LA(1) ) {
            case SUNDAY:
                {
                alt19=1;
                }
                break;
            case MONDAY:
                {
                alt19=2;
                }
                break;
            case TUESDAY:
                {
                alt19=3;
                }
                break;
            case WEDNESDAY:
                {
                alt19=4;
                }
                break;
            case THURSDAY:
                {
                alt19=5;
                }
                break;
            case FRIDAY:
                {
                alt19=6;
                }
                break;
            case SATURDAY:
                {
                alt19=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:103:5: SUNDAY
                    {
                    SUNDAY58=(Token)match(input,SUNDAY,FOLLOW_SUNDAY_in_day_of_week781); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUNDAY.add(SUNDAY58);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 103:15: -> DAY_OF_WEEK[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:104:5: MONDAY
                    {
                    MONDAY59=(Token)match(input,MONDAY,FOLLOW_MONDAY_in_day_of_week795); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MONDAY.add(MONDAY59);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 104:15: -> DAY_OF_WEEK[\"2\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "2"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:105:5: TUESDAY
                    {
                    TUESDAY60=(Token)match(input,TUESDAY,FOLLOW_TUESDAY_in_day_of_week809); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TUESDAY.add(TUESDAY60);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 105:15: -> DAY_OF_WEEK[\"3\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "3"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:106:5: WEDNESDAY
                    {
                    WEDNESDAY61=(Token)match(input,WEDNESDAY,FOLLOW_WEDNESDAY_in_day_of_week822); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WEDNESDAY.add(WEDNESDAY61);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 106:15: -> DAY_OF_WEEK[\"4\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "4"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:107:5: THURSDAY
                    {
                    THURSDAY62=(Token)match(input,THURSDAY,FOLLOW_THURSDAY_in_day_of_week833); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THURSDAY.add(THURSDAY62);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 107:15: -> DAY_OF_WEEK[\"5\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "5"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:108:5: FRIDAY
                    {
                    FRIDAY63=(Token)match(input,FRIDAY,FOLLOW_FRIDAY_in_day_of_week845); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FRIDAY.add(FRIDAY63);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 108:15: -> DAY_OF_WEEK[\"6\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "6"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:109:5: SATURDAY
                    {
                    SATURDAY64=(Token)match(input,SATURDAY,FOLLOW_SATURDAY_in_day_of_week859); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SATURDAY.add(SATURDAY64);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 109:15: -> DAY_OF_WEEK[\"7\"]
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

    public static class today_or_tomorrow_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "today_or_tomorrow"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:112:1: today_or_tomorrow : ( TODAY -> ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"0\"] ) | TOMORROW -> ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"1\"] ) | YESTERDAY -> ^( RELATIVE_DATE SEEK_DIRECTION[\"<\"] INTEGER[\"1\"] ) | ( 'the' )? 'day after ' TOMORROW -> ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"2\"] ) | ( 'the' )? 'day before ' YESTERDAY -> ^( RELATIVE_DATE SEEK_DIRECTION[\"<\"] INTEGER[\"2\"] ) );
    public final DateParser.today_or_tomorrow_return today_or_tomorrow() throws RecognitionException {
        DateParser.today_or_tomorrow_return retval = new DateParser.today_or_tomorrow_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TODAY65=null;
        Token TOMORROW66=null;
        Token YESTERDAY67=null;
        Token string_literal68=null;
        Token string_literal69=null;
        Token TOMORROW70=null;
        Token string_literal71=null;
        Token string_literal72=null;
        Token YESTERDAY73=null;

        Object TODAY65_tree=null;
        Object TOMORROW66_tree=null;
        Object YESTERDAY67_tree=null;
        Object string_literal68_tree=null;
        Object string_literal69_tree=null;
        Object TOMORROW70_tree=null;
        Object string_literal71_tree=null;
        Object string_literal72_tree=null;
        Object YESTERDAY73_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_TODAY=new RewriteRuleTokenStream(adaptor,"token TODAY");
        RewriteRuleTokenStream stream_YESTERDAY=new RewriteRuleTokenStream(adaptor,"token YESTERDAY");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleTokenStream stream_TOMORROW=new RewriteRuleTokenStream(adaptor,"token TOMORROW");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:113:3: ( TODAY -> ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"0\"] ) | TOMORROW -> ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"1\"] ) | YESTERDAY -> ^( RELATIVE_DATE SEEK_DIRECTION[\"<\"] INTEGER[\"1\"] ) | ( 'the' )? 'day after ' TOMORROW -> ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"2\"] ) | ( 'the' )? 'day before ' YESTERDAY -> ^( RELATIVE_DATE SEEK_DIRECTION[\"<\"] INTEGER[\"2\"] ) )
            int alt22=5;
            switch ( input.LA(1) ) {
            case TODAY:
                {
                alt22=1;
                }
                break;
            case TOMORROW:
                {
                alt22=2;
                }
                break;
            case YESTERDAY:
                {
                alt22=3;
                }
                break;
            case 116:
                {
                int LA22_4 = input.LA(2);

                if ( (LA22_4==118) ) {
                    alt22=5;
                }
                else if ( (LA22_4==117) ) {
                    alt22=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 4, input);

                    throw nvae;
                }
                }
                break;
            case 117:
                {
                alt22=4;
                }
                break;
            case 118:
                {
                alt22=5;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:113:5: TODAY
                    {
                    TODAY65=(Token)match(input,TODAY,FOLLOW_TODAY_in_today_or_tomorrow880); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TODAY.add(TODAY65);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 113:11: -> ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"0\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:113:14: ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"0\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:114:5: TOMORROW
                    {
                    TOMORROW66=(Token)match(input,TOMORROW,FOLLOW_TOMORROW_in_today_or_tomorrow898); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TOMORROW.add(TOMORROW66);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 114:14: -> ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"1\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:114:17: ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"1\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:115:5: YESTERDAY
                    {
                    YESTERDAY67=(Token)match(input,YESTERDAY,FOLLOW_YESTERDAY_in_today_or_tomorrow916); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_YESTERDAY.add(YESTERDAY67);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 115:15: -> ^( RELATIVE_DATE SEEK_DIRECTION[\"<\"] INTEGER[\"1\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:115:18: ^( RELATIVE_DATE SEEK_DIRECTION[\"<\"] INTEGER[\"1\"] )
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
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:118:5: ( 'the' )? 'day after ' TOMORROW
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:118:5: ( 'the' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==116) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:118:5: 'the'
                            {
                            string_literal68=(Token)match(input,116,FOLLOW_116_in_today_or_tomorrow940); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_116.add(string_literal68);


                            }
                            break;

                    }

                    string_literal69=(Token)match(input,117,FOLLOW_117_in_today_or_tomorrow943); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_117.add(string_literal69);

                    TOMORROW70=(Token)match(input,TOMORROW,FOLLOW_TOMORROW_in_today_or_tomorrow945); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TOMORROW.add(TOMORROW70);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 118:34: -> ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"2\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:118:37: ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"2\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(SEEK_DIRECTION, ">"));
                        adaptor.addChild(root_1, (Object)adaptor.create(INTEGER, "2"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:119:5: ( 'the' )? 'day before ' YESTERDAY
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:119:5: ( 'the' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==116) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:119:5: 'the'
                            {
                            string_literal71=(Token)match(input,116,FOLLOW_116_in_today_or_tomorrow963); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_116.add(string_literal71);


                            }
                            break;

                    }

                    string_literal72=(Token)match(input,118,FOLLOW_118_in_today_or_tomorrow966); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_118.add(string_literal72);

                    YESTERDAY73=(Token)match(input,YESTERDAY,FOLLOW_YESTERDAY_in_today_or_tomorrow968); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_YESTERDAY.add(YESTERDAY73);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 119:36: -> ^( RELATIVE_DATE SEEK_DIRECTION[\"<\"] INTEGER[\"2\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:119:39: ^( RELATIVE_DATE SEEK_DIRECTION[\"<\"] INTEGER[\"2\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(SEEK_DIRECTION, "<"));
                        adaptor.addChild(root_1, (Object)adaptor.create(INTEGER, "2"));

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
    // $ANTLR end "today_or_tomorrow"

    public static class date_span_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "date_span"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:122:1: date_span : ( DAY -> SPAN[\"day\"] | WEEK -> SPAN[\"week\"] | MONTH -> SPAN[\"month\"] | YEAR -> SPAN[\"year\"] );
    public final DateParser.date_span_return date_span() throws RecognitionException {
        DateParser.date_span_return retval = new DateParser.date_span_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DAY74=null;
        Token WEEK75=null;
        Token MONTH76=null;
        Token YEAR77=null;

        Object DAY74_tree=null;
        Object WEEK75_tree=null;
        Object MONTH76_tree=null;
        Object YEAR77_tree=null;
        RewriteRuleTokenStream stream_WEEK=new RewriteRuleTokenStream(adaptor,"token WEEK");
        RewriteRuleTokenStream stream_DAY=new RewriteRuleTokenStream(adaptor,"token DAY");
        RewriteRuleTokenStream stream_YEAR=new RewriteRuleTokenStream(adaptor,"token YEAR");
        RewriteRuleTokenStream stream_MONTH=new RewriteRuleTokenStream(adaptor,"token MONTH");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:123:3: ( DAY -> SPAN[\"day\"] | WEEK -> SPAN[\"week\"] | MONTH -> SPAN[\"month\"] | YEAR -> SPAN[\"year\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:123:5: DAY
                    {
                    DAY74=(Token)match(input,DAY,FOLLOW_DAY_in_date_span995); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DAY.add(DAY74);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 123:11: -> SPAN[\"day\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SPAN, "day"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:124:5: WEEK
                    {
                    WEEK75=(Token)match(input,WEEK,FOLLOW_WEEK_in_date_span1008); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WEEK.add(WEEK75);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 124:11: -> SPAN[\"week\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SPAN, "week"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:125:5: MONTH
                    {
                    MONTH76=(Token)match(input,MONTH,FOLLOW_MONTH_in_date_span1020); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MONTH.add(MONTH76);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 125:11: -> SPAN[\"month\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SPAN, "month"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:126:5: YEAR
                    {
                    YEAR77=(Token)match(input,YEAR,FOLLOW_YEAR_in_date_span1031); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_YEAR.add(YEAR77);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 126:11: -> SPAN[\"year\"]
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

    public static class time_identifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "time_identifier"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:130:1: time_identifier : ( MIDNIGHT -> ^( EXPLICIT_TIME INTEGER[\"12\"] INTEGER[\"0\"] AM_PM[\"am\"] ) | NOON -> ^( EXPLICIT_TIME INTEGER[\"12\"] INTEGER[\"0\"] AM_PM[\"pm\"] ) );
    public final DateParser.time_identifier_return time_identifier() throws RecognitionException {
        DateParser.time_identifier_return retval = new DateParser.time_identifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MIDNIGHT78=null;
        Token NOON79=null;

        Object MIDNIGHT78_tree=null;
        Object NOON79_tree=null;
        RewriteRuleTokenStream stream_NOON=new RewriteRuleTokenStream(adaptor,"token NOON");
        RewriteRuleTokenStream stream_MIDNIGHT=new RewriteRuleTokenStream(adaptor,"token MIDNIGHT");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:131:3: ( MIDNIGHT -> ^( EXPLICIT_TIME INTEGER[\"12\"] INTEGER[\"0\"] AM_PM[\"am\"] ) | NOON -> ^( EXPLICIT_TIME INTEGER[\"12\"] INTEGER[\"0\"] AM_PM[\"pm\"] ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==MIDNIGHT) ) {
                alt24=1;
            }
            else if ( (LA24_0==NOON) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:131:5: MIDNIGHT
                    {
                    MIDNIGHT78=(Token)match(input,MIDNIGHT,FOLLOW_MIDNIGHT_in_time_identifier1053); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MIDNIGHT.add(MIDNIGHT78);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 131:14: -> ^( EXPLICIT_TIME INTEGER[\"12\"] INTEGER[\"0\"] AM_PM[\"am\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:131:17: ^( EXPLICIT_TIME INTEGER[\"12\"] INTEGER[\"0\"] AM_PM[\"am\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INTEGER, "12"));
                        adaptor.addChild(root_1, (Object)adaptor.create(INTEGER, "0"));
                        adaptor.addChild(root_1, (Object)adaptor.create(AM_PM, "am"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:132:5: NOON
                    {
                    NOON79=(Token)match(input,NOON,FOLLOW_NOON_in_time_identifier1074); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOON.add(NOON79);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 132:14: -> ^( EXPLICIT_TIME INTEGER[\"12\"] INTEGER[\"0\"] AM_PM[\"pm\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:132:17: ^( EXPLICIT_TIME INTEGER[\"12\"] INTEGER[\"0\"] AM_PM[\"pm\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INTEGER, "12"));
                        adaptor.addChild(root_1, (Object)adaptor.create(INTEGER, "0"));
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

    public static class modifiable_target_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "modifiable_target"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:136:1: modifiable_target : ( day_of_week | date_span | month );
    public final DateParser.modifiable_target_return modifiable_target() throws RecognitionException {
        DateParser.modifiable_target_return retval = new DateParser.modifiable_target_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.day_of_week_return day_of_week80 = null;

        DateParser.date_span_return date_span81 = null;

        DateParser.month_return month82 = null;



        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:137:3: ( day_of_week | date_span | month )
            int alt25=3;
            switch ( input.LA(1) ) {
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
            case DAY:
            case WEEK:
            case MONTH:
            case YEAR:
                {
                alt25=2;
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
                alt25=3;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:137:5: day_of_week
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_day_of_week_in_modifiable_target1109);
                    day_of_week80=day_of_week();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, day_of_week80.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:138:5: date_span
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_date_span_in_modifiable_target1116);
                    date_span81=date_span();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, date_span81.getTree());

                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:139:5: month
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_month_in_modifiable_target1122);
                    month82=month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, month82.getTree());

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

    public static class relative_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relative_prefix"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:142:1: relative_prefix : ( ( 'this' )? 'last' -> SEEK_DIRECTION[\"<\"] SEEK_TYPE[\"by_week\"] INTEGER[\"1\"] | ( 'this' )? 'next' -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_week\"] INTEGER[\"1\"] | ( 'this' )? 'past' -> SEEK_DIRECTION[\"<\"] SEEK_TYPE[\"by_day\"] INTEGER[\"1\"] | ( 'this' )? 'coming' -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] INTEGER[\"1\"] | ( 'this' )? 'upcoming' -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] INTEGER[\"1\"] );
    public final DateParser.relative_prefix_return relative_prefix() throws RecognitionException {
        DateParser.relative_prefix_return retval = new DateParser.relative_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal83=null;
        Token string_literal84=null;
        Token string_literal85=null;
        Token string_literal86=null;
        Token string_literal87=null;
        Token string_literal88=null;
        Token string_literal89=null;
        Token string_literal90=null;
        Token string_literal91=null;
        Token string_literal92=null;

        Object string_literal83_tree=null;
        Object string_literal84_tree=null;
        Object string_literal85_tree=null;
        Object string_literal86_tree=null;
        Object string_literal87_tree=null;
        Object string_literal88_tree=null;
        Object string_literal89_tree=null;
        Object string_literal90_tree=null;
        Object string_literal91_tree=null;
        Object string_literal92_tree=null;
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:143:3: ( ( 'this' )? 'last' -> SEEK_DIRECTION[\"<\"] SEEK_TYPE[\"by_week\"] INTEGER[\"1\"] | ( 'this' )? 'next' -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_week\"] INTEGER[\"1\"] | ( 'this' )? 'past' -> SEEK_DIRECTION[\"<\"] SEEK_TYPE[\"by_day\"] INTEGER[\"1\"] | ( 'this' )? 'coming' -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] INTEGER[\"1\"] | ( 'this' )? 'upcoming' -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] INTEGER[\"1\"] )
            int alt31=5;
            switch ( input.LA(1) ) {
            case 119:
                {
                switch ( input.LA(2) ) {
                case 121:
                    {
                    alt31=2;
                    }
                    break;
                case 124:
                    {
                    alt31=5;
                    }
                    break;
                case 120:
                    {
                    alt31=1;
                    }
                    break;
                case 122:
                    {
                    alt31=3;
                    }
                    break;
                case 123:
                    {
                    alt31=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;
                }

                }
                break;
            case 120:
                {
                alt31=1;
                }
                break;
            case 121:
                {
                alt31=2;
                }
                break;
            case 122:
                {
                alt31=3;
                }
                break;
            case 123:
                {
                alt31=4;
                }
                break;
            case 124:
                {
                alt31=5;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:143:5: ( 'this' )? 'last'
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:143:5: ( 'this' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==119) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:143:5: 'this'
                            {
                            string_literal83=(Token)match(input,119,FOLLOW_119_in_relative_prefix1137); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_119.add(string_literal83);


                            }
                            break;

                    }

                    string_literal84=(Token)match(input,120,FOLLOW_120_in_relative_prefix1140); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_120.add(string_literal84);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 143:24: -> SEEK_DIRECTION[\"<\"] SEEK_TYPE[\"by_week\"] INTEGER[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIRECTION, "<"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_week"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:144:5: ( 'this' )? 'next'
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:144:5: ( 'this' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==119) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:144:5: 'this'
                            {
                            string_literal85=(Token)match(input,119,FOLLOW_119_in_relative_prefix1161); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_119.add(string_literal85);


                            }
                            break;

                    }

                    string_literal86=(Token)match(input,121,FOLLOW_121_in_relative_prefix1164); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_121.add(string_literal86);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 144:24: -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_week\"] INTEGER[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIRECTION, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_week"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:145:5: ( 'this' )? 'past'
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:145:5: ( 'this' )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==119) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:145:5: 'this'
                            {
                            string_literal87=(Token)match(input,119,FOLLOW_119_in_relative_prefix1185); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_119.add(string_literal87);


                            }
                            break;

                    }

                    string_literal88=(Token)match(input,122,FOLLOW_122_in_relative_prefix1188); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_122.add(string_literal88);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 145:24: -> SEEK_DIRECTION[\"<\"] SEEK_TYPE[\"by_day\"] INTEGER[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIRECTION, "<"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_day"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:146:5: ( 'this' )? 'coming'
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:146:5: ( 'this' )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==119) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:146:5: 'this'
                            {
                            string_literal89=(Token)match(input,119,FOLLOW_119_in_relative_prefix1209); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_119.add(string_literal89);


                            }
                            break;

                    }

                    string_literal90=(Token)match(input,123,FOLLOW_123_in_relative_prefix1212); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_123.add(string_literal90);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 146:24: -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] INTEGER[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIRECTION, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_day"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:147:5: ( 'this' )? 'upcoming'
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:147:5: ( 'this' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==119) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:147:5: 'this'
                            {
                            string_literal91=(Token)match(input,119,FOLLOW_119_in_relative_prefix1231); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_119.add(string_literal91);


                            }
                            break;

                    }

                    string_literal92=(Token)match(input,124,FOLLOW_124_in_relative_prefix1234); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_124.add(string_literal92);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 147:24: -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] INTEGER[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIRECTION, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_day"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "1"));

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:151:1: relative_suffix : ( 'from now' -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] | 'ago' -> SEEK_DIRECTION[\"<\"] SEEK_TYPE[\"by_day\"] );
    public final DateParser.relative_suffix_return relative_suffix() throws RecognitionException {
        DateParser.relative_suffix_return retval = new DateParser.relative_suffix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal93=null;
        Token string_literal94=null;

        Object string_literal93_tree=null;
        Object string_literal94_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:152:3: ( 'from now' -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] | 'ago' -> SEEK_DIRECTION[\"<\"] SEEK_TYPE[\"by_day\"] )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==125) ) {
                alt32=1;
            }
            else if ( (LA32_0==126) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:152:5: 'from now'
                    {
                    string_literal93=(Token)match(input,125,FOLLOW_125_in_relative_suffix1263); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_125.add(string_literal93);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 152:16: -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIRECTION, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_day"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:153:5: 'ago'
                    {
                    string_literal94=(Token)match(input,126,FOLLOW_126_in_relative_suffix1277); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_126.add(string_literal94);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 153:16: -> SEEK_DIRECTION[\"<\"] SEEK_TYPE[\"by_day\"]
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

    public static class year_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "year"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:156:1: year options {backtrack=true; } : ( ( '\\'' )? numeric_0_to_99 -> YEAR[$numeric_0_to_99.text] | ( 'in the' YEAR )? four_digits -> YEAR[$four_digits.text] );
    public final DateParser.year_return year() throws RecognitionException {
        DateParser.year_return retval = new DateParser.year_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal95=null;
        Token string_literal97=null;
        Token YEAR98=null;
        DateParser.numeric_0_to_99_return numeric_0_to_9996 = null;

        DateParser.four_digits_return four_digits99 = null;


        Object char_literal95_tree=null;
        Object string_literal97_tree=null;
        Object YEAR98_tree=null;
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_YEAR=new RewriteRuleTokenStream(adaptor,"token YEAR");
        RewriteRuleSubtreeStream stream_four_digits=new RewriteRuleSubtreeStream(adaptor,"rule four_digits");
        RewriteRuleSubtreeStream stream_numeric_0_to_99=new RewriteRuleSubtreeStream(adaptor,"rule numeric_0_to_99");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:158:3: ( ( '\\'' )? numeric_0_to_99 -> YEAR[$numeric_0_to_99.text] | ( 'in the' YEAR )? four_digits -> YEAR[$four_digits.text] )
            int alt35=2;
            switch ( input.LA(1) ) {
            case 127:
                {
                alt35=1;
                }
                break;
            case TWO_ZEROS:
                {
                int LA35_2 = input.LA(2);

                if ( (synpred6_Date()) ) {
                    alt35=1;
                }
                else if ( (true) ) {
                    alt35=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 2, input);

                    throw nvae;
                }
                }
                break;
            case ONE_TO_TWELVE:
                {
                int LA35_3 = input.LA(2);

                if ( (synpred6_Date()) ) {
                    alt35=1;
                }
                else if ( (true) ) {
                    alt35=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 3, input);

                    throw nvae;
                }
                }
                break;
            case THIRTEEN_TO_TWENTY_THREE:
                {
                int LA35_4 = input.LA(2);

                if ( (synpred6_Date()) ) {
                    alt35=1;
                }
                else if ( (true) ) {
                    alt35=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 4, input);

                    throw nvae;
                }
                }
                break;
            case TWENTY_FOUR_TO_THIRTY_ONE:
                {
                int LA35_5 = input.LA(2);

                if ( (synpred6_Date()) ) {
                    alt35=1;
                }
                else if ( (true) ) {
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
            case THIRTY_TWO_TO_FIFTY_NINE:
                {
                int LA35_6 = input.LA(2);

                if ( (synpred6_Date()) ) {
                    alt35=1;
                }
                else if ( (true) ) {
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
            case SIXTY_TO_NINETY_NINE:
                {
                int LA35_7 = input.LA(2);

                if ( (synpred6_Date()) ) {
                    alt35=1;
                }
                else if ( (true) ) {
                    alt35=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 7, input);

                    throw nvae;
                }
                }
                break;
            case THREE_DIGIT:
            case FOUR_DIGIT:
            case 128:
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:158:5: ( '\\'' )? numeric_0_to_99
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:158:5: ( '\\'' )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==127) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:158:5: '\\''
                            {
                            char_literal95=(Token)match(input,127,FOLLOW_127_in_year1314); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_127.add(char_literal95);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_numeric_0_to_99_in_year1317);
                    numeric_0_to_9996=numeric_0_to_99();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_numeric_0_to_99.add(numeric_0_to_9996.getTree());


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 158:27: -> YEAR[$numeric_0_to_99.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(YEAR, (numeric_0_to_9996!=null?input.toString(numeric_0_to_9996.start,numeric_0_to_9996.stop):null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:159:5: ( 'in the' YEAR )? four_digits
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:159:5: ( 'in the' YEAR )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==128) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:159:6: 'in the' YEAR
                            {
                            string_literal97=(Token)match(input,128,FOLLOW_128_in_year1329); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_128.add(string_literal97);

                            YEAR98=(Token)match(input,YEAR,FOLLOW_YEAR_in_year1331); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_YEAR.add(YEAR98);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_four_digits_in_year1335);
                    four_digits99=four_digits();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_four_digits.add(four_digits99.getTree());


                    // AST REWRITE
                    // elements: YEAR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 159:34: -> YEAR[$four_digits.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(YEAR, (four_digits99!=null?input.toString(four_digits99.start,four_digits99.stop):null)));

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:162:1: date_separator : ( DASH | SLASH );
    public final DateParser.date_separator_return date_separator() throws RecognitionException {
        DateParser.date_separator_return retval = new DateParser.date_separator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set100=null;

        Object set100_tree=null;

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:163:3: ( DASH | SLASH )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:
            {
            root_0 = (Object)adaptor.nil();

            set100=(Token)input.LT(1);
            if ( (input.LA(1)>=DASH && input.LA(1)<=SLASH) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set100));
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:167:1: hours : numeric_0_to_23 -> HOURS[$numeric_0_to_23.text] ;
    public final DateParser.hours_return hours() throws RecognitionException {
        DateParser.hours_return retval = new DateParser.hours_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.numeric_0_to_23_return numeric_0_to_23101 = null;


        RewriteRuleSubtreeStream stream_numeric_0_to_23=new RewriteRuleSubtreeStream(adaptor,"rule numeric_0_to_23");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:168:3: ( numeric_0_to_23 -> HOURS[$numeric_0_to_23.text] )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:168:5: numeric_0_to_23
            {
            pushFollow(FOLLOW_numeric_0_to_23_in_hours1374);
            numeric_0_to_23101=numeric_0_to_23();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_numeric_0_to_23.add(numeric_0_to_23101.getTree());


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 168:21: -> HOURS[$numeric_0_to_23.text]
            {
                adaptor.addChild(root_0, (Object)adaptor.create(HOURS, (numeric_0_to_23101!=null?input.toString(numeric_0_to_23101.start,numeric_0_to_23101.stop):null)));

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:171:1: minutes : numeric_0_to_59 -> MINUTES[$numeric_0_to_59.text] ;
    public final DateParser.minutes_return minutes() throws RecognitionException {
        DateParser.minutes_return retval = new DateParser.minutes_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.numeric_0_to_59_return numeric_0_to_59102 = null;


        RewriteRuleSubtreeStream stream_numeric_0_to_59=new RewriteRuleSubtreeStream(adaptor,"rule numeric_0_to_59");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:172:3: ( numeric_0_to_59 -> MINUTES[$numeric_0_to_59.text] )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:172:5: numeric_0_to_59
            {
            pushFollow(FOLLOW_numeric_0_to_59_in_minutes1394);
            numeric_0_to_59102=numeric_0_to_59();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_numeric_0_to_59.add(numeric_0_to_59102.getTree());


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 172:21: -> MINUTES[$numeric_0_to_59.text]
            {
                adaptor.addChild(root_0, (Object)adaptor.create(MINUTES, (numeric_0_to_59102!=null?input.toString(numeric_0_to_59102.start,numeric_0_to_59102.stop):null)));

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:175:1: meridian_indicator : ( AM -> AM_PM[\"am\"] | PM -> AM_PM[\"pm\"] );
    public final DateParser.meridian_indicator_return meridian_indicator() throws RecognitionException {
        DateParser.meridian_indicator_return retval = new DateParser.meridian_indicator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AM103=null;
        Token PM104=null;

        Object AM103_tree=null;
        Object PM104_tree=null;
        RewriteRuleTokenStream stream_PM=new RewriteRuleTokenStream(adaptor,"token PM");
        RewriteRuleTokenStream stream_AM=new RewriteRuleTokenStream(adaptor,"token AM");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:176:3: ( AM -> AM_PM[\"am\"] | PM -> AM_PM[\"pm\"] )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==AM) ) {
                alt36=1;
            }
            else if ( (LA36_0==PM) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:176:5: AM
                    {
                    AM103=(Token)match(input,AM,FOLLOW_AM_in_meridian_indicator1414); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AM.add(AM103);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 176:8: -> AM_PM[\"am\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(AM_PM, "am"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:177:5: PM
                    {
                    PM104=(Token)match(input,PM,FOLLOW_PM_in_meridian_indicator1425); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PM.add(PM104);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 177:8: -> AM_PM[\"pm\"]
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

    public static class spelled_number_1_to_31_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "spelled_number_1_to_31"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:181:1: spelled_number_1_to_31 : ( ONE -> INTEGER[\"1\"] | TWO -> INTEGER[\"2\"] | THREE -> INTEGER[\"3\"] | FOUR -> INTEGER[\"4\"] | FIVE -> INTEGER[\"5\"] | SIX -> INTEGER[\"6\"] | SEVEN -> INTEGER[\"7\"] | EIGHT -> INTEGER[\"8\"] | NINE -> INTEGER[\"9\"] | TEN -> INTEGER[\"10\"] | ELEVEN -> INTEGER[\"11\"] | TWELVE -> INTEGER[\"12\"] | THIRTEEN -> INTEGER[\"13\"] | FOURTEEN -> INTEGER[\"14\"] | FIFTEEN -> INTEGER[\"15\"] | SIXTEEN -> INTEGER[\"16\"] | SEVENTEEN -> INTEGER[\"17\"] | EIGHTEEN -> INTEGER[\"18\"] | NINETEEN -> INTEGER[\"19\"] | TWENTY -> INTEGER[\"20\"] | TWENTY ( DASH )? ONE -> INTEGER[\"21\"] | TWENTY ( DASH )? TWO -> INTEGER[\"22\"] | TWENTY ( DASH )? THREE -> INTEGER[\"23\"] | TWENTY ( DASH )? FOUR -> INTEGER[\"24\"] | TWENTY ( DASH )? FIVE -> INTEGER[\"25\"] | TWENTY ( DASH )? SIX -> INTEGER[\"26\"] | TWENTY ( DASH )? SEVEN -> INTEGER[\"27\"] | TWENTY ( DASH )? EIGHT -> INTEGER[\"28\"] | TWENTY ( DASH )? NINE -> INTEGER[\"29\"] | THIRTY -> INTEGER[\"30\"] | THIRTY ( DASH )? ONE -> INTEGER[\"31\"] );
    public final DateParser.spelled_number_1_to_31_return spelled_number_1_to_31() throws RecognitionException {
        DateParser.spelled_number_1_to_31_return retval = new DateParser.spelled_number_1_to_31_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ONE105=null;
        Token TWO106=null;
        Token THREE107=null;
        Token FOUR108=null;
        Token FIVE109=null;
        Token SIX110=null;
        Token SEVEN111=null;
        Token EIGHT112=null;
        Token NINE113=null;
        Token TEN114=null;
        Token ELEVEN115=null;
        Token TWELVE116=null;
        Token THIRTEEN117=null;
        Token FOURTEEN118=null;
        Token FIFTEEN119=null;
        Token SIXTEEN120=null;
        Token SEVENTEEN121=null;
        Token EIGHTEEN122=null;
        Token NINETEEN123=null;
        Token TWENTY124=null;
        Token TWENTY125=null;
        Token DASH126=null;
        Token ONE127=null;
        Token TWENTY128=null;
        Token DASH129=null;
        Token TWO130=null;
        Token TWENTY131=null;
        Token DASH132=null;
        Token THREE133=null;
        Token TWENTY134=null;
        Token DASH135=null;
        Token FOUR136=null;
        Token TWENTY137=null;
        Token DASH138=null;
        Token FIVE139=null;
        Token TWENTY140=null;
        Token DASH141=null;
        Token SIX142=null;
        Token TWENTY143=null;
        Token DASH144=null;
        Token SEVEN145=null;
        Token TWENTY146=null;
        Token DASH147=null;
        Token EIGHT148=null;
        Token TWENTY149=null;
        Token DASH150=null;
        Token NINE151=null;
        Token THIRTY152=null;
        Token THIRTY153=null;
        Token DASH154=null;
        Token ONE155=null;

        Object ONE105_tree=null;
        Object TWO106_tree=null;
        Object THREE107_tree=null;
        Object FOUR108_tree=null;
        Object FIVE109_tree=null;
        Object SIX110_tree=null;
        Object SEVEN111_tree=null;
        Object EIGHT112_tree=null;
        Object NINE113_tree=null;
        Object TEN114_tree=null;
        Object ELEVEN115_tree=null;
        Object TWELVE116_tree=null;
        Object THIRTEEN117_tree=null;
        Object FOURTEEN118_tree=null;
        Object FIFTEEN119_tree=null;
        Object SIXTEEN120_tree=null;
        Object SEVENTEEN121_tree=null;
        Object EIGHTEEN122_tree=null;
        Object NINETEEN123_tree=null;
        Object TWENTY124_tree=null;
        Object TWENTY125_tree=null;
        Object DASH126_tree=null;
        Object ONE127_tree=null;
        Object TWENTY128_tree=null;
        Object DASH129_tree=null;
        Object TWO130_tree=null;
        Object TWENTY131_tree=null;
        Object DASH132_tree=null;
        Object THREE133_tree=null;
        Object TWENTY134_tree=null;
        Object DASH135_tree=null;
        Object FOUR136_tree=null;
        Object TWENTY137_tree=null;
        Object DASH138_tree=null;
        Object FIVE139_tree=null;
        Object TWENTY140_tree=null;
        Object DASH141_tree=null;
        Object SIX142_tree=null;
        Object TWENTY143_tree=null;
        Object DASH144_tree=null;
        Object SEVEN145_tree=null;
        Object TWENTY146_tree=null;
        Object DASH147_tree=null;
        Object EIGHT148_tree=null;
        Object TWENTY149_tree=null;
        Object DASH150_tree=null;
        Object NINE151_tree=null;
        Object THIRTY152_tree=null;
        Object THIRTY153_tree=null;
        Object DASH154_tree=null;
        Object ONE155_tree=null;
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:182:3: ( ONE -> INTEGER[\"1\"] | TWO -> INTEGER[\"2\"] | THREE -> INTEGER[\"3\"] | FOUR -> INTEGER[\"4\"] | FIVE -> INTEGER[\"5\"] | SIX -> INTEGER[\"6\"] | SEVEN -> INTEGER[\"7\"] | EIGHT -> INTEGER[\"8\"] | NINE -> INTEGER[\"9\"] | TEN -> INTEGER[\"10\"] | ELEVEN -> INTEGER[\"11\"] | TWELVE -> INTEGER[\"12\"] | THIRTEEN -> INTEGER[\"13\"] | FOURTEEN -> INTEGER[\"14\"] | FIFTEEN -> INTEGER[\"15\"] | SIXTEEN -> INTEGER[\"16\"] | SEVENTEEN -> INTEGER[\"17\"] | EIGHTEEN -> INTEGER[\"18\"] | NINETEEN -> INTEGER[\"19\"] | TWENTY -> INTEGER[\"20\"] | TWENTY ( DASH )? ONE -> INTEGER[\"21\"] | TWENTY ( DASH )? TWO -> INTEGER[\"22\"] | TWENTY ( DASH )? THREE -> INTEGER[\"23\"] | TWENTY ( DASH )? FOUR -> INTEGER[\"24\"] | TWENTY ( DASH )? FIVE -> INTEGER[\"25\"] | TWENTY ( DASH )? SIX -> INTEGER[\"26\"] | TWENTY ( DASH )? SEVEN -> INTEGER[\"27\"] | TWENTY ( DASH )? EIGHT -> INTEGER[\"28\"] | TWENTY ( DASH )? NINE -> INTEGER[\"29\"] | THIRTY -> INTEGER[\"30\"] | THIRTY ( DASH )? ONE -> INTEGER[\"31\"] )
            int alt47=31;
            alt47 = dfa47.predict(input);
            switch (alt47) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:182:5: ONE
                    {
                    ONE105=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_number_1_to_311444); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE.add(ONE105);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 182:16: -> INTEGER[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:183:5: TWO
                    {
                    TWO106=(Token)match(input,TWO,FOLLOW_TWO_in_spelled_number_1_to_311462); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO.add(TWO106);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 183:16: -> INTEGER[\"2\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "2"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:184:5: THREE
                    {
                    THREE107=(Token)match(input,THREE,FOLLOW_THREE_in_spelled_number_1_to_311480); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THREE.add(THREE107);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 184:16: -> INTEGER[\"3\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "3"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:185:5: FOUR
                    {
                    FOUR108=(Token)match(input,FOUR,FOLLOW_FOUR_in_spelled_number_1_to_311496); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOUR.add(FOUR108);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 185:16: -> INTEGER[\"4\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "4"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:186:5: FIVE
                    {
                    FIVE109=(Token)match(input,FIVE,FOLLOW_FIVE_in_spelled_number_1_to_311513); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIVE.add(FIVE109);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 186:16: -> INTEGER[\"5\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "5"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:187:5: SIX
                    {
                    SIX110=(Token)match(input,SIX,FOLLOW_SIX_in_spelled_number_1_to_311530); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIX.add(SIX110);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 187:16: -> INTEGER[\"6\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "6"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:188:5: SEVEN
                    {
                    SEVEN111=(Token)match(input,SEVEN,FOLLOW_SEVEN_in_spelled_number_1_to_311548); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVEN.add(SEVEN111);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 188:16: -> INTEGER[\"7\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "7"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:189:5: EIGHT
                    {
                    EIGHT112=(Token)match(input,EIGHT,FOLLOW_EIGHT_in_spelled_number_1_to_311564); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHT.add(EIGHT112);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 189:16: -> INTEGER[\"8\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "8"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:190:5: NINE
                    {
                    NINE113=(Token)match(input,NINE,FOLLOW_NINE_in_spelled_number_1_to_311580); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINE.add(NINE113);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 190:16: -> INTEGER[\"9\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "9"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:191:5: TEN
                    {
                    TEN114=(Token)match(input,TEN,FOLLOW_TEN_in_spelled_number_1_to_311597); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TEN.add(TEN114);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 191:16: -> INTEGER[\"10\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "10"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:192:5: ELEVEN
                    {
                    ELEVEN115=(Token)match(input,ELEVEN,FOLLOW_ELEVEN_in_spelled_number_1_to_311615); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELEVEN.add(ELEVEN115);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 192:16: -> INTEGER[\"11\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "11"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:193:5: TWELVE
                    {
                    TWELVE116=(Token)match(input,TWELVE,FOLLOW_TWELVE_in_spelled_number_1_to_311630); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWELVE.add(TWELVE116);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 193:16: -> INTEGER[\"12\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "12"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:194:5: THIRTEEN
                    {
                    THIRTEEN117=(Token)match(input,THIRTEEN,FOLLOW_THIRTEEN_in_spelled_number_1_to_311645); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEEN.add(THIRTEEN117);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 194:16: -> INTEGER[\"13\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "13"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 14 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:195:5: FOURTEEN
                    {
                    FOURTEEN118=(Token)match(input,FOURTEEN,FOLLOW_FOURTEEN_in_spelled_number_1_to_311658); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOURTEEN.add(FOURTEEN118);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 195:16: -> INTEGER[\"14\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "14"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 15 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:196:5: FIFTEEN
                    {
                    FIFTEEN119=(Token)match(input,FIFTEEN,FOLLOW_FIFTEEN_in_spelled_number_1_to_311671); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIFTEEN.add(FIFTEEN119);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 196:16: -> INTEGER[\"15\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "15"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 16 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:197:5: SIXTEEN
                    {
                    SIXTEEN120=(Token)match(input,SIXTEEN,FOLLOW_SIXTEEN_in_spelled_number_1_to_311685); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTEEN.add(SIXTEEN120);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 197:16: -> INTEGER[\"16\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "16"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 17 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:198:5: SEVENTEEN
                    {
                    SEVENTEEN121=(Token)match(input,SEVENTEEN,FOLLOW_SEVENTEEN_in_spelled_number_1_to_311699); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVENTEEN.add(SEVENTEEN121);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 198:16: -> INTEGER[\"17\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "17"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 18 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:199:5: EIGHTEEN
                    {
                    EIGHTEEN122=(Token)match(input,EIGHTEEN,FOLLOW_EIGHTEEN_in_spelled_number_1_to_311711); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHTEEN.add(EIGHTEEN122);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 199:16: -> INTEGER[\"18\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "18"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 19 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:200:5: NINETEEN
                    {
                    NINETEEN123=(Token)match(input,NINETEEN,FOLLOW_NINETEEN_in_spelled_number_1_to_311724); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINETEEN.add(NINETEEN123);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 200:16: -> INTEGER[\"19\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "19"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 20 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:201:5: TWENTY
                    {
                    TWENTY124=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_number_1_to_311737); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY124);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 201:16: -> INTEGER[\"20\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "20"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 21 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:202:5: TWENTY ( DASH )? ONE
                    {
                    TWENTY125=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_number_1_to_311752); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY125);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:202:12: ( DASH )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==DASH) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:202:12: DASH
                            {
                            DASH126=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_number_1_to_311754); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH126);


                            }
                            break;

                    }

                    ONE127=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_number_1_to_311757); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE.add(ONE127);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 202:24: -> INTEGER[\"21\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "21"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 22 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:203:5: TWENTY ( DASH )? TWO
                    {
                    TWENTY128=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_number_1_to_311770); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY128);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:203:12: ( DASH )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==DASH) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:203:12: DASH
                            {
                            DASH129=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_number_1_to_311772); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH129);


                            }
                            break;

                    }

                    TWO130=(Token)match(input,TWO,FOLLOW_TWO_in_spelled_number_1_to_311775); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO.add(TWO130);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 203:24: -> INTEGER[\"22\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "22"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 23 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:204:5: TWENTY ( DASH )? THREE
                    {
                    TWENTY131=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_number_1_to_311788); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY131);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:204:12: ( DASH )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==DASH) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:204:12: DASH
                            {
                            DASH132=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_number_1_to_311790); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH132);


                            }
                            break;

                    }

                    THREE133=(Token)match(input,THREE,FOLLOW_THREE_in_spelled_number_1_to_311793); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THREE.add(THREE133);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 204:24: -> INTEGER[\"23\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "23"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 24 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:205:5: TWENTY ( DASH )? FOUR
                    {
                    TWENTY134=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_number_1_to_311804); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY134);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:205:12: ( DASH )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==DASH) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:205:12: DASH
                            {
                            DASH135=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_number_1_to_311806); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH135);


                            }
                            break;

                    }

                    FOUR136=(Token)match(input,FOUR,FOLLOW_FOUR_in_spelled_number_1_to_311809); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOUR.add(FOUR136);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 205:24: -> INTEGER[\"24\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "24"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 25 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:206:5: TWENTY ( DASH )? FIVE
                    {
                    TWENTY137=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_number_1_to_311821); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY137);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:206:12: ( DASH )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==DASH) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:206:12: DASH
                            {
                            DASH138=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_number_1_to_311823); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH138);


                            }
                            break;

                    }

                    FIVE139=(Token)match(input,FIVE,FOLLOW_FIVE_in_spelled_number_1_to_311826); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIVE.add(FIVE139);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 206:24: -> INTEGER[\"25\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "25"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 26 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:207:5: TWENTY ( DASH )? SIX
                    {
                    TWENTY140=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_number_1_to_311838); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY140);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:207:12: ( DASH )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==DASH) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:207:12: DASH
                            {
                            DASH141=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_number_1_to_311840); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH141);


                            }
                            break;

                    }

                    SIX142=(Token)match(input,SIX,FOLLOW_SIX_in_spelled_number_1_to_311843); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIX.add(SIX142);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 207:24: -> INTEGER[\"26\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "26"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 27 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:208:5: TWENTY ( DASH )? SEVEN
                    {
                    TWENTY143=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_number_1_to_311856); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY143);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:208:12: ( DASH )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==DASH) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:208:12: DASH
                            {
                            DASH144=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_number_1_to_311858); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH144);


                            }
                            break;

                    }

                    SEVEN145=(Token)match(input,SEVEN,FOLLOW_SEVEN_in_spelled_number_1_to_311861); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVEN.add(SEVEN145);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 208:24: -> INTEGER[\"27\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "27"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 28 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:209:5: TWENTY ( DASH )? EIGHT
                    {
                    TWENTY146=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_number_1_to_311872); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY146);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:209:12: ( DASH )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==DASH) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:209:12: DASH
                            {
                            DASH147=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_number_1_to_311874); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH147);


                            }
                            break;

                    }

                    EIGHT148=(Token)match(input,EIGHT,FOLLOW_EIGHT_in_spelled_number_1_to_311877); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHT.add(EIGHT148);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 209:24: -> INTEGER[\"28\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "28"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 29 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:210:5: TWENTY ( DASH )? NINE
                    {
                    TWENTY149=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_number_1_to_311888); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY149);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:210:12: ( DASH )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==DASH) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:210:12: DASH
                            {
                            DASH150=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_number_1_to_311890); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH150);


                            }
                            break;

                    }

                    NINE151=(Token)match(input,NINE,FOLLOW_NINE_in_spelled_number_1_to_311893); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINE.add(NINE151);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 210:24: -> INTEGER[\"29\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "29"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 30 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:211:5: THIRTY
                    {
                    THIRTY152=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_number_1_to_311905); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY152);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 211:24: -> INTEGER[\"30\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "30"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 31 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:212:5: THIRTY ( DASH )? ONE
                    {
                    THIRTY153=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_number_1_to_311928); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY153);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:212:12: ( DASH )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==DASH) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:212:12: DASH
                            {
                            DASH154=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_number_1_to_311930); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH154);


                            }
                            break;

                    }

                    ONE155=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_number_1_to_311933); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE.add(ONE155);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 212:24: -> INTEGER[\"31\"]
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:215:1: spelled_or_numeric_1_to_31 : ( spelled_number_1_to_31 | numeric_1_to_31 );
    public final DateParser.spelled_or_numeric_1_to_31_return spelled_or_numeric_1_to_31() throws RecognitionException {
        DateParser.spelled_or_numeric_1_to_31_return retval = new DateParser.spelled_or_numeric_1_to_31_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.spelled_number_1_to_31_return spelled_number_1_to_31156 = null;

        DateParser.numeric_1_to_31_return numeric_1_to_31157 = null;



        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:216:3: ( spelled_number_1_to_31 | numeric_1_to_31 )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=ONE && LA48_0<=THIRTY)) ) {
                alt48=1;
            }
            else if ( (LA48_0==ONE_TO_TWELVE||(LA48_0>=THIRTEEN_TO_TWENTY_THREE && LA48_0<=TWENTY_FOUR_TO_THIRTY_ONE)) ) {
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:216:5: spelled_number_1_to_31
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_spelled_number_1_to_31_in_spelled_or_numeric_1_to_311955);
                    spelled_number_1_to_31156=spelled_number_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, spelled_number_1_to_31156.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:217:5: numeric_1_to_31
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numeric_1_to_31_in_spelled_or_numeric_1_to_311961);
                    numeric_1_to_31157=numeric_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_1_to_31157.getTree());

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:222:1: spelled_sequence_1_to_31 : ( FIRST -> INTEGER[\"1\"] | SECOND -> INTEGER[\"2\"] | THIRD -> INTEGER[\"3\"] | FOURTH -> INTEGER[\"4\"] | FIFTH -> INTEGER[\"5\"] | SIXTH -> INTEGER[\"6\"] | SEVENTH -> INTEGER[\"7\"] | EIGHTH -> INTEGER[\"8\"] | NINTH -> INTEGER[\"9\"] | TENTH -> INTEGER[\"10\"] | ELEVENTH -> INTEGER[\"11\"] | TWELFTH -> INTEGER[\"12\"] | THIRTEENTH -> INTEGER[\"13\"] | FOURTEENTH -> INTEGER[\"14\"] | FIFTEENTH -> INTEGER[\"15\"] | SIXTEENTH -> INTEGER[\"16\"] | SEVENTEENTH -> INTEGER[\"17\"] | EIGHTEENTH -> INTEGER[\"18\"] | NINETEENTH -> INTEGER[\"19\"] | TWENTIETH -> INTEGER[\"20\"] | TWENTY_FIRST | ( TWENTY ( DASH )? FIRST ) -> INTEGER[\"21\"] | TWENTY_SECOND | ( TWENTY ( DASH )? SECOND ) -> INTEGER[\"22\"] | TWENTY_THIRD | ( TWENTY ( DASH )? THIRD ) -> INTEGER[\"23\"] | TWENTY_FOURTH | ( TWENTY ( DASH )? FOURTH ) -> INTEGER[\"24\"] | TWENTY_FIFTH | ( TWENTY ( DASH )? FIFTH ) -> INTEGER[\"25\"] | TWENTY_SIXTH | ( TWENTY ( DASH )? SIXTH ) -> INTEGER[\"26\"] | TWENTY_SEVENTH | ( TWENTY ( DASH )? SEVENTH ) -> INTEGER[\"27\"] | TWENTY_EIGHTH | ( TWENTY ( DASH )? EIGHTH ) -> INTEGER[\"28\"] | TWENTY_NINTH | ( TWENTY ( DASH )? NINTH ) -> INTEGER[\"29\"] | THIRTIETH -> INTEGER[\"30\"] | THIRTY_FIRST | ( THIRTY ( DASH )? FIRST ) -> INTEGER[\"31\"] );
    public final DateParser.spelled_sequence_1_to_31_return spelled_sequence_1_to_31() throws RecognitionException {
        DateParser.spelled_sequence_1_to_31_return retval = new DateParser.spelled_sequence_1_to_31_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FIRST158=null;
        Token SECOND159=null;
        Token THIRD160=null;
        Token FOURTH161=null;
        Token FIFTH162=null;
        Token SIXTH163=null;
        Token SEVENTH164=null;
        Token EIGHTH165=null;
        Token NINTH166=null;
        Token TENTH167=null;
        Token ELEVENTH168=null;
        Token TWELFTH169=null;
        Token THIRTEENTH170=null;
        Token FOURTEENTH171=null;
        Token FIFTEENTH172=null;
        Token SIXTEENTH173=null;
        Token SEVENTEENTH174=null;
        Token EIGHTEENTH175=null;
        Token NINETEENTH176=null;
        Token TWENTIETH177=null;
        Token TWENTY_FIRST178=null;
        Token TWENTY179=null;
        Token DASH180=null;
        Token FIRST181=null;
        Token TWENTY_SECOND182=null;
        Token TWENTY183=null;
        Token DASH184=null;
        Token SECOND185=null;
        Token TWENTY_THIRD186=null;
        Token TWENTY187=null;
        Token DASH188=null;
        Token THIRD189=null;
        Token TWENTY_FOURTH190=null;
        Token TWENTY191=null;
        Token DASH192=null;
        Token FOURTH193=null;
        Token TWENTY_FIFTH194=null;
        Token TWENTY195=null;
        Token DASH196=null;
        Token FIFTH197=null;
        Token TWENTY_SIXTH198=null;
        Token TWENTY199=null;
        Token DASH200=null;
        Token SIXTH201=null;
        Token TWENTY_SEVENTH202=null;
        Token TWENTY203=null;
        Token DASH204=null;
        Token SEVENTH205=null;
        Token TWENTY_EIGHTH206=null;
        Token TWENTY207=null;
        Token DASH208=null;
        Token EIGHTH209=null;
        Token TWENTY_NINTH210=null;
        Token TWENTY211=null;
        Token DASH212=null;
        Token NINTH213=null;
        Token THIRTIETH214=null;
        Token THIRTY_FIRST215=null;
        Token THIRTY216=null;
        Token DASH217=null;
        Token FIRST218=null;

        Object FIRST158_tree=null;
        Object SECOND159_tree=null;
        Object THIRD160_tree=null;
        Object FOURTH161_tree=null;
        Object FIFTH162_tree=null;
        Object SIXTH163_tree=null;
        Object SEVENTH164_tree=null;
        Object EIGHTH165_tree=null;
        Object NINTH166_tree=null;
        Object TENTH167_tree=null;
        Object ELEVENTH168_tree=null;
        Object TWELFTH169_tree=null;
        Object THIRTEENTH170_tree=null;
        Object FOURTEENTH171_tree=null;
        Object FIFTEENTH172_tree=null;
        Object SIXTEENTH173_tree=null;
        Object SEVENTEENTH174_tree=null;
        Object EIGHTEENTH175_tree=null;
        Object NINETEENTH176_tree=null;
        Object TWENTIETH177_tree=null;
        Object TWENTY_FIRST178_tree=null;
        Object TWENTY179_tree=null;
        Object DASH180_tree=null;
        Object FIRST181_tree=null;
        Object TWENTY_SECOND182_tree=null;
        Object TWENTY183_tree=null;
        Object DASH184_tree=null;
        Object SECOND185_tree=null;
        Object TWENTY_THIRD186_tree=null;
        Object TWENTY187_tree=null;
        Object DASH188_tree=null;
        Object THIRD189_tree=null;
        Object TWENTY_FOURTH190_tree=null;
        Object TWENTY191_tree=null;
        Object DASH192_tree=null;
        Object FOURTH193_tree=null;
        Object TWENTY_FIFTH194_tree=null;
        Object TWENTY195_tree=null;
        Object DASH196_tree=null;
        Object FIFTH197_tree=null;
        Object TWENTY_SIXTH198_tree=null;
        Object TWENTY199_tree=null;
        Object DASH200_tree=null;
        Object SIXTH201_tree=null;
        Object TWENTY_SEVENTH202_tree=null;
        Object TWENTY203_tree=null;
        Object DASH204_tree=null;
        Object SEVENTH205_tree=null;
        Object TWENTY_EIGHTH206_tree=null;
        Object TWENTY207_tree=null;
        Object DASH208_tree=null;
        Object EIGHTH209_tree=null;
        Object TWENTY_NINTH210_tree=null;
        Object TWENTY211_tree=null;
        Object DASH212_tree=null;
        Object NINTH213_tree=null;
        Object THIRTIETH214_tree=null;
        Object THIRTY_FIRST215_tree=null;
        Object THIRTY216_tree=null;
        Object DASH217_tree=null;
        Object FIRST218_tree=null;
        RewriteRuleTokenStream stream_THIRD=new RewriteRuleTokenStream(adaptor,"token THIRD");
        RewriteRuleTokenStream stream_FIFTH=new RewriteRuleTokenStream(adaptor,"token FIFTH");
        RewriteRuleTokenStream stream_FIFTEENTH=new RewriteRuleTokenStream(adaptor,"token FIFTEENTH");
        RewriteRuleTokenStream stream_FOURTH=new RewriteRuleTokenStream(adaptor,"token FOURTH");
        RewriteRuleTokenStream stream_SECOND=new RewriteRuleTokenStream(adaptor,"token SECOND");
        RewriteRuleTokenStream stream_TWENTY=new RewriteRuleTokenStream(adaptor,"token TWENTY");
        RewriteRuleTokenStream stream_DASH=new RewriteRuleTokenStream(adaptor,"token DASH");
        RewriteRuleTokenStream stream_NINTH=new RewriteRuleTokenStream(adaptor,"token NINTH");
        RewriteRuleTokenStream stream_FOURTEENTH=new RewriteRuleTokenStream(adaptor,"token FOURTEENTH");
        RewriteRuleTokenStream stream_EIGHTEENTH=new RewriteRuleTokenStream(adaptor,"token EIGHTEENTH");
        RewriteRuleTokenStream stream_SEVENTH=new RewriteRuleTokenStream(adaptor,"token SEVENTH");
        RewriteRuleTokenStream stream_THIRTY=new RewriteRuleTokenStream(adaptor,"token THIRTY");
        RewriteRuleTokenStream stream_NINETEENTH=new RewriteRuleTokenStream(adaptor,"token NINETEENTH");
        RewriteRuleTokenStream stream_TWENTIETH=new RewriteRuleTokenStream(adaptor,"token TWENTIETH");
        RewriteRuleTokenStream stream_THIRTIETH=new RewriteRuleTokenStream(adaptor,"token THIRTIETH");
        RewriteRuleTokenStream stream_TENTH=new RewriteRuleTokenStream(adaptor,"token TENTH");
        RewriteRuleTokenStream stream_TWELFTH=new RewriteRuleTokenStream(adaptor,"token TWELFTH");
        RewriteRuleTokenStream stream_ELEVENTH=new RewriteRuleTokenStream(adaptor,"token ELEVENTH");
        RewriteRuleTokenStream stream_SIXTH=new RewriteRuleTokenStream(adaptor,"token SIXTH");
        RewriteRuleTokenStream stream_SIXTEENTH=new RewriteRuleTokenStream(adaptor,"token SIXTEENTH");
        RewriteRuleTokenStream stream_SEVENTEENTH=new RewriteRuleTokenStream(adaptor,"token SEVENTEENTH");
        RewriteRuleTokenStream stream_THIRTEENTH=new RewriteRuleTokenStream(adaptor,"token THIRTEENTH");
        RewriteRuleTokenStream stream_FIRST=new RewriteRuleTokenStream(adaptor,"token FIRST");
        RewriteRuleTokenStream stream_EIGHTH=new RewriteRuleTokenStream(adaptor,"token EIGHTH");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:223:3: ( FIRST -> INTEGER[\"1\"] | SECOND -> INTEGER[\"2\"] | THIRD -> INTEGER[\"3\"] | FOURTH -> INTEGER[\"4\"] | FIFTH -> INTEGER[\"5\"] | SIXTH -> INTEGER[\"6\"] | SEVENTH -> INTEGER[\"7\"] | EIGHTH -> INTEGER[\"8\"] | NINTH -> INTEGER[\"9\"] | TENTH -> INTEGER[\"10\"] | ELEVENTH -> INTEGER[\"11\"] | TWELFTH -> INTEGER[\"12\"] | THIRTEENTH -> INTEGER[\"13\"] | FOURTEENTH -> INTEGER[\"14\"] | FIFTEENTH -> INTEGER[\"15\"] | SIXTEENTH -> INTEGER[\"16\"] | SEVENTEENTH -> INTEGER[\"17\"] | EIGHTEENTH -> INTEGER[\"18\"] | NINETEENTH -> INTEGER[\"19\"] | TWENTIETH -> INTEGER[\"20\"] | TWENTY_FIRST | ( TWENTY ( DASH )? FIRST ) -> INTEGER[\"21\"] | TWENTY_SECOND | ( TWENTY ( DASH )? SECOND ) -> INTEGER[\"22\"] | TWENTY_THIRD | ( TWENTY ( DASH )? THIRD ) -> INTEGER[\"23\"] | TWENTY_FOURTH | ( TWENTY ( DASH )? FOURTH ) -> INTEGER[\"24\"] | TWENTY_FIFTH | ( TWENTY ( DASH )? FIFTH ) -> INTEGER[\"25\"] | TWENTY_SIXTH | ( TWENTY ( DASH )? SIXTH ) -> INTEGER[\"26\"] | TWENTY_SEVENTH | ( TWENTY ( DASH )? SEVENTH ) -> INTEGER[\"27\"] | TWENTY_EIGHTH | ( TWENTY ( DASH )? EIGHTH ) -> INTEGER[\"28\"] | TWENTY_NINTH | ( TWENTY ( DASH )? NINTH ) -> INTEGER[\"29\"] | THIRTIETH -> INTEGER[\"30\"] | THIRTY_FIRST | ( THIRTY ( DASH )? FIRST ) -> INTEGER[\"31\"] )
            int alt59=41;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:223:5: FIRST
                    {
                    FIRST158=(Token)match(input,FIRST,FOLLOW_FIRST_in_spelled_sequence_1_to_311978); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIRST.add(FIRST158);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 223:17: -> INTEGER[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:224:5: SECOND
                    {
                    SECOND159=(Token)match(input,SECOND,FOLLOW_SECOND_in_spelled_sequence_1_to_311995); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SECOND.add(SECOND159);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 224:17: -> INTEGER[\"2\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "2"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:225:5: THIRD
                    {
                    THIRD160=(Token)match(input,THIRD,FOLLOW_THIRD_in_spelled_sequence_1_to_312011); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRD.add(THIRD160);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 225:17: -> INTEGER[\"3\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "3"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:226:5: FOURTH
                    {
                    FOURTH161=(Token)match(input,FOURTH,FOLLOW_FOURTH_in_spelled_sequence_1_to_312028); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOURTH.add(FOURTH161);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 226:17: -> INTEGER[\"4\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "4"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:227:5: FIFTH
                    {
                    FIFTH162=(Token)match(input,FIFTH,FOLLOW_FIFTH_in_spelled_sequence_1_to_312044); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIFTH.add(FIFTH162);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 227:17: -> INTEGER[\"5\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "5"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:228:5: SIXTH
                    {
                    SIXTH163=(Token)match(input,SIXTH,FOLLOW_SIXTH_in_spelled_sequence_1_to_312061); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTH.add(SIXTH163);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 228:17: -> INTEGER[\"6\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "6"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:229:5: SEVENTH
                    {
                    SEVENTH164=(Token)match(input,SEVENTH,FOLLOW_SEVENTH_in_spelled_sequence_1_to_312078); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVENTH.add(SEVENTH164);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 229:17: -> INTEGER[\"7\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "7"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:230:5: EIGHTH
                    {
                    EIGHTH165=(Token)match(input,EIGHTH,FOLLOW_EIGHTH_in_spelled_sequence_1_to_312093); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHTH.add(EIGHTH165);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 230:17: -> INTEGER[\"8\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "8"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:231:5: NINTH
                    {
                    NINTH166=(Token)match(input,NINTH,FOLLOW_NINTH_in_spelled_sequence_1_to_312109); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINTH.add(NINTH166);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 231:17: -> INTEGER[\"9\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "9"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:232:5: TENTH
                    {
                    TENTH167=(Token)match(input,TENTH,FOLLOW_TENTH_in_spelled_sequence_1_to_312126); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TENTH.add(TENTH167);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 232:17: -> INTEGER[\"10\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "10"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:233:5: ELEVENTH
                    {
                    ELEVENTH168=(Token)match(input,ELEVENTH,FOLLOW_ELEVENTH_in_spelled_sequence_1_to_312143); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELEVENTH.add(ELEVENTH168);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 233:17: -> INTEGER[\"11\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "11"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:234:5: TWELFTH
                    {
                    TWELFTH169=(Token)match(input,TWELFTH,FOLLOW_TWELFTH_in_spelled_sequence_1_to_312157); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWELFTH.add(TWELFTH169);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 234:17: -> INTEGER[\"12\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "12"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:235:5: THIRTEENTH
                    {
                    THIRTEENTH170=(Token)match(input,THIRTEENTH,FOLLOW_THIRTEENTH_in_spelled_sequence_1_to_312172); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEENTH.add(THIRTEENTH170);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 235:17: -> INTEGER[\"13\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "13"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 14 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:236:5: FOURTEENTH
                    {
                    FOURTEENTH171=(Token)match(input,FOURTEENTH,FOLLOW_FOURTEENTH_in_spelled_sequence_1_to_312184); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOURTEENTH.add(FOURTEENTH171);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 236:17: -> INTEGER[\"14\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "14"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 15 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:237:5: FIFTEENTH
                    {
                    FIFTEENTH172=(Token)match(input,FIFTEENTH,FOLLOW_FIFTEENTH_in_spelled_sequence_1_to_312196); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIFTEENTH.add(FIFTEENTH172);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 237:17: -> INTEGER[\"15\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "15"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 16 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:238:5: SIXTEENTH
                    {
                    SIXTEENTH173=(Token)match(input,SIXTEENTH,FOLLOW_SIXTEENTH_in_spelled_sequence_1_to_312209); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTEENTH.add(SIXTEENTH173);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 238:17: -> INTEGER[\"16\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "16"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 17 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:239:5: SEVENTEENTH
                    {
                    SEVENTEENTH174=(Token)match(input,SEVENTEENTH,FOLLOW_SEVENTEENTH_in_spelled_sequence_1_to_312222); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVENTEENTH.add(SEVENTEENTH174);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 239:17: -> INTEGER[\"17\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "17"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 18 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:240:5: EIGHTEENTH
                    {
                    EIGHTEENTH175=(Token)match(input,EIGHTEENTH,FOLLOW_EIGHTEENTH_in_spelled_sequence_1_to_312233); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHTEENTH.add(EIGHTEENTH175);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 240:17: -> INTEGER[\"18\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "18"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 19 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:241:5: NINETEENTH
                    {
                    NINETEENTH176=(Token)match(input,NINETEENTH,FOLLOW_NINETEENTH_in_spelled_sequence_1_to_312245); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINETEENTH.add(NINETEENTH176);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 241:17: -> INTEGER[\"19\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "19"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 20 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:242:5: TWENTIETH
                    {
                    TWENTIETH177=(Token)match(input,TWENTIETH,FOLLOW_TWENTIETH_in_spelled_sequence_1_to_312257); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTIETH.add(TWENTIETH177);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 242:17: -> INTEGER[\"20\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "20"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 21 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:243:5: TWENTY_FIRST
                    {
                    root_0 = (Object)adaptor.nil();

                    TWENTY_FIRST178=(Token)match(input,TWENTY_FIRST,FOLLOW_TWENTY_FIRST_in_spelled_sequence_1_to_312270); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TWENTY_FIRST178_tree = (Object)adaptor.create(TWENTY_FIRST178);
                    adaptor.addChild(root_0, TWENTY_FIRST178_tree);
                    }

                    }
                    break;
                case 22 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:243:22: ( TWENTY ( DASH )? FIRST )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:243:22: ( TWENTY ( DASH )? FIRST )
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:243:23: TWENTY ( DASH )? FIRST
                    {
                    TWENTY179=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_312277); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY179);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:243:30: ( DASH )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==DASH) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:243:30: DASH
                            {
                            DASH180=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312279); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH180);


                            }
                            break;

                    }

                    FIRST181=(Token)match(input,FIRST,FOLLOW_FIRST_in_spelled_sequence_1_to_312282); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIRST.add(FIRST181);


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
                    // 243:45: -> INTEGER[\"21\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "21"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 23 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:244:5: TWENTY_SECOND
                    {
                    root_0 = (Object)adaptor.nil();

                    TWENTY_SECOND182=(Token)match(input,TWENTY_SECOND,FOLLOW_TWENTY_SECOND_in_spelled_sequence_1_to_312296); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TWENTY_SECOND182_tree = (Object)adaptor.create(TWENTY_SECOND182);
                    adaptor.addChild(root_0, TWENTY_SECOND182_tree);
                    }

                    }
                    break;
                case 24 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:244:22: ( TWENTY ( DASH )? SECOND )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:244:22: ( TWENTY ( DASH )? SECOND )
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:244:23: TWENTY ( DASH )? SECOND
                    {
                    TWENTY183=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_312302); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY183);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:244:30: ( DASH )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==DASH) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:244:30: DASH
                            {
                            DASH184=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312304); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH184);


                            }
                            break;

                    }

                    SECOND185=(Token)match(input,SECOND,FOLLOW_SECOND_in_spelled_sequence_1_to_312307); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SECOND.add(SECOND185);


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
                    // 244:45: -> INTEGER[\"22\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "22"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 25 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:245:5: TWENTY_THIRD
                    {
                    root_0 = (Object)adaptor.nil();

                    TWENTY_THIRD186=(Token)match(input,TWENTY_THIRD,FOLLOW_TWENTY_THIRD_in_spelled_sequence_1_to_312320); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TWENTY_THIRD186_tree = (Object)adaptor.create(TWENTY_THIRD186);
                    adaptor.addChild(root_0, TWENTY_THIRD186_tree);
                    }

                    }
                    break;
                case 26 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:245:22: ( TWENTY ( DASH )? THIRD )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:245:22: ( TWENTY ( DASH )? THIRD )
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:245:23: TWENTY ( DASH )? THIRD
                    {
                    TWENTY187=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_312327); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY187);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:245:30: ( DASH )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==DASH) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:245:30: DASH
                            {
                            DASH188=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312329); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH188);


                            }
                            break;

                    }

                    THIRD189=(Token)match(input,THIRD,FOLLOW_THIRD_in_spelled_sequence_1_to_312332); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRD.add(THIRD189);


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
                    // 245:45: -> INTEGER[\"23\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "23"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 27 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:5: TWENTY_FOURTH
                    {
                    root_0 = (Object)adaptor.nil();

                    TWENTY_FOURTH190=(Token)match(input,TWENTY_FOURTH,FOLLOW_TWENTY_FOURTH_in_spelled_sequence_1_to_312346); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TWENTY_FOURTH190_tree = (Object)adaptor.create(TWENTY_FOURTH190);
                    adaptor.addChild(root_0, TWENTY_FOURTH190_tree);
                    }

                    }
                    break;
                case 28 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:22: ( TWENTY ( DASH )? FOURTH )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:22: ( TWENTY ( DASH )? FOURTH )
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:23: TWENTY ( DASH )? FOURTH
                    {
                    TWENTY191=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_312352); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY191);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:30: ( DASH )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==DASH) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:30: DASH
                            {
                            DASH192=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312354); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH192);


                            }
                            break;

                    }

                    FOURTH193=(Token)match(input,FOURTH,FOLLOW_FOURTH_in_spelled_sequence_1_to_312357); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOURTH.add(FOURTH193);


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
                    // 246:45: -> INTEGER[\"24\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "24"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 29 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:247:5: TWENTY_FIFTH
                    {
                    root_0 = (Object)adaptor.nil();

                    TWENTY_FIFTH194=(Token)match(input,TWENTY_FIFTH,FOLLOW_TWENTY_FIFTH_in_spelled_sequence_1_to_312370); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TWENTY_FIFTH194_tree = (Object)adaptor.create(TWENTY_FIFTH194);
                    adaptor.addChild(root_0, TWENTY_FIFTH194_tree);
                    }

                    }
                    break;
                case 30 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:247:22: ( TWENTY ( DASH )? FIFTH )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:247:22: ( TWENTY ( DASH )? FIFTH )
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:247:23: TWENTY ( DASH )? FIFTH
                    {
                    TWENTY195=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_312377); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY195);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:247:30: ( DASH )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==DASH) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:247:30: DASH
                            {
                            DASH196=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312379); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH196);


                            }
                            break;

                    }

                    FIFTH197=(Token)match(input,FIFTH,FOLLOW_FIFTH_in_spelled_sequence_1_to_312382); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIFTH.add(FIFTH197);


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
                    // 247:45: -> INTEGER[\"25\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "25"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 31 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:248:5: TWENTY_SIXTH
                    {
                    root_0 = (Object)adaptor.nil();

                    TWENTY_SIXTH198=(Token)match(input,TWENTY_SIXTH,FOLLOW_TWENTY_SIXTH_in_spelled_sequence_1_to_312396); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TWENTY_SIXTH198_tree = (Object)adaptor.create(TWENTY_SIXTH198);
                    adaptor.addChild(root_0, TWENTY_SIXTH198_tree);
                    }

                    }
                    break;
                case 32 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:248:22: ( TWENTY ( DASH )? SIXTH )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:248:22: ( TWENTY ( DASH )? SIXTH )
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:248:23: TWENTY ( DASH )? SIXTH
                    {
                    TWENTY199=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_312403); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY199);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:248:30: ( DASH )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==DASH) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:248:30: DASH
                            {
                            DASH200=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312405); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH200);


                            }
                            break;

                    }

                    SIXTH201=(Token)match(input,SIXTH,FOLLOW_SIXTH_in_spelled_sequence_1_to_312408); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTH.add(SIXTH201);


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
                    // 248:45: -> INTEGER[\"26\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "26"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 33 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:249:5: TWENTY_SEVENTH
                    {
                    root_0 = (Object)adaptor.nil();

                    TWENTY_SEVENTH202=(Token)match(input,TWENTY_SEVENTH,FOLLOW_TWENTY_SEVENTH_in_spelled_sequence_1_to_312422); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TWENTY_SEVENTH202_tree = (Object)adaptor.create(TWENTY_SEVENTH202);
                    adaptor.addChild(root_0, TWENTY_SEVENTH202_tree);
                    }

                    }
                    break;
                case 34 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:249:22: ( TWENTY ( DASH )? SEVENTH )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:249:22: ( TWENTY ( DASH )? SEVENTH )
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:249:23: TWENTY ( DASH )? SEVENTH
                    {
                    TWENTY203=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_312427); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY203);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:249:30: ( DASH )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==DASH) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:249:30: DASH
                            {
                            DASH204=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312429); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH204);


                            }
                            break;

                    }

                    SEVENTH205=(Token)match(input,SEVENTH,FOLLOW_SEVENTH_in_spelled_sequence_1_to_312432); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVENTH.add(SEVENTH205);


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
                    // 249:45: -> INTEGER[\"27\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "27"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 35 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:250:5: TWENTY_EIGHTH
                    {
                    root_0 = (Object)adaptor.nil();

                    TWENTY_EIGHTH206=(Token)match(input,TWENTY_EIGHTH,FOLLOW_TWENTY_EIGHTH_in_spelled_sequence_1_to_312444); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TWENTY_EIGHTH206_tree = (Object)adaptor.create(TWENTY_EIGHTH206);
                    adaptor.addChild(root_0, TWENTY_EIGHTH206_tree);
                    }

                    }
                    break;
                case 36 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:250:22: ( TWENTY ( DASH )? EIGHTH )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:250:22: ( TWENTY ( DASH )? EIGHTH )
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:250:23: TWENTY ( DASH )? EIGHTH
                    {
                    TWENTY207=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_312450); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY207);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:250:30: ( DASH )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==DASH) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:250:30: DASH
                            {
                            DASH208=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312452); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH208);


                            }
                            break;

                    }

                    EIGHTH209=(Token)match(input,EIGHTH,FOLLOW_EIGHTH_in_spelled_sequence_1_to_312455); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHTH.add(EIGHTH209);


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
                    // 250:45: -> INTEGER[\"28\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "28"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 37 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:251:5: TWENTY_NINTH
                    {
                    root_0 = (Object)adaptor.nil();

                    TWENTY_NINTH210=(Token)match(input,TWENTY_NINTH,FOLLOW_TWENTY_NINTH_in_spelled_sequence_1_to_312468); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TWENTY_NINTH210_tree = (Object)adaptor.create(TWENTY_NINTH210);
                    adaptor.addChild(root_0, TWENTY_NINTH210_tree);
                    }

                    }
                    break;
                case 38 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:251:22: ( TWENTY ( DASH )? NINTH )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:251:22: ( TWENTY ( DASH )? NINTH )
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:251:23: TWENTY ( DASH )? NINTH
                    {
                    TWENTY211=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_312475); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY211);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:251:30: ( DASH )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==DASH) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:251:30: DASH
                            {
                            DASH212=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312477); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH212);


                            }
                            break;

                    }

                    NINTH213=(Token)match(input,NINTH,FOLLOW_NINTH_in_spelled_sequence_1_to_312480); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINTH.add(NINTH213);


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
                    // 251:45: -> INTEGER[\"29\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "29"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 39 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:252:5: THIRTIETH
                    {
                    THIRTIETH214=(Token)match(input,THIRTIETH,FOLLOW_THIRTIETH_in_spelled_sequence_1_to_312494); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTIETH.add(THIRTIETH214);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 252:45: -> INTEGER[\"30\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "30"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 40 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:253:5: THIRTY_FIRST
                    {
                    root_0 = (Object)adaptor.nil();

                    THIRTY_FIRST215=(Token)match(input,THIRTY_FIRST,FOLLOW_THIRTY_FIRST_in_spelled_sequence_1_to_312535); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THIRTY_FIRST215_tree = (Object)adaptor.create(THIRTY_FIRST215);
                    adaptor.addChild(root_0, THIRTY_FIRST215_tree);
                    }

                    }
                    break;
                case 41 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:253:22: ( THIRTY ( DASH )? FIRST )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:253:22: ( THIRTY ( DASH )? FIRST )
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:253:23: THIRTY ( DASH )? FIRST
                    {
                    THIRTY216=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_sequence_1_to_312542); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY216);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:253:30: ( DASH )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==DASH) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:253:30: DASH
                            {
                            DASH217=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312544); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH217);


                            }
                            break;

                    }

                    FIRST218=(Token)match(input,FIRST,FOLLOW_FIRST_in_spelled_sequence_1_to_312547); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIRST.add(FIRST218);


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
                    // 253:45: -> INTEGER[\"31\"]
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:257:1: four_digits : ( numeric_0_to_99 | THREE_DIGIT -> INTEGER[$THREE_DIGIT.text] | FOUR_DIGIT -> INTEGER[$FOUR_DIGIT.text] );
    public final DateParser.four_digits_return four_digits() throws RecognitionException {
        DateParser.four_digits_return retval = new DateParser.four_digits_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THREE_DIGIT220=null;
        Token FOUR_DIGIT221=null;
        DateParser.numeric_0_to_99_return numeric_0_to_99219 = null;


        Object THREE_DIGIT220_tree=null;
        Object FOUR_DIGIT221_tree=null;
        RewriteRuleTokenStream stream_FOUR_DIGIT=new RewriteRuleTokenStream(adaptor,"token FOUR_DIGIT");
        RewriteRuleTokenStream stream_THREE_DIGIT=new RewriteRuleTokenStream(adaptor,"token THREE_DIGIT");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:258:3: ( numeric_0_to_99 | THREE_DIGIT -> INTEGER[$THREE_DIGIT.text] | FOUR_DIGIT -> INTEGER[$FOUR_DIGIT.text] )
            int alt60=3;
            switch ( input.LA(1) ) {
            case ONE_TO_TWELVE:
            case TWO_ZEROS:
            case THIRTEEN_TO_TWENTY_THREE:
            case TWENTY_FOUR_TO_THIRTY_ONE:
            case THIRTY_TWO_TO_FIFTY_NINE:
            case SIXTY_TO_NINETY_NINE:
                {
                alt60=1;
                }
                break;
            case THREE_DIGIT:
                {
                alt60=2;
                }
                break;
            case FOUR_DIGIT:
                {
                alt60=3;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:258:5: numeric_0_to_99
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numeric_0_to_99_in_four_digits2571);
                    numeric_0_to_99219=numeric_0_to_99();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_0_to_99219.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:259:5: THREE_DIGIT
                    {
                    THREE_DIGIT220=(Token)match(input,THREE_DIGIT,FOLLOW_THREE_DIGIT_in_four_digits2577); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THREE_DIGIT.add(THREE_DIGIT220);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 259:17: -> INTEGER[$THREE_DIGIT.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (THREE_DIGIT220!=null?THREE_DIGIT220.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:260:5: FOUR_DIGIT
                    {
                    FOUR_DIGIT221=(Token)match(input,FOUR_DIGIT,FOLLOW_FOUR_DIGIT_in_four_digits2588); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOUR_DIGIT.add(FOUR_DIGIT221);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 260:17: -> INTEGER[$FOUR_DIGIT.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (FOUR_DIGIT221!=null?FOUR_DIGIT221.getText():null)));

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

    public static class numeric_1_to_12_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numeric_1_to_12"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:263:1: numeric_1_to_12 : ONE_TO_TWELVE -> INTEGER[$numeric_1_to_12.text] ;
    public final DateParser.numeric_1_to_12_return numeric_1_to_12() throws RecognitionException {
        DateParser.numeric_1_to_12_return retval = new DateParser.numeric_1_to_12_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ONE_TO_TWELVE222=null;

        Object ONE_TO_TWELVE222_tree=null;
        RewriteRuleTokenStream stream_ONE_TO_TWELVE=new RewriteRuleTokenStream(adaptor,"token ONE_TO_TWELVE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:264:3: ( ONE_TO_TWELVE -> INTEGER[$numeric_1_to_12.text] )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:264:5: ONE_TO_TWELVE
            {
            ONE_TO_TWELVE222=(Token)match(input,ONE_TO_TWELVE,FOLLOW_ONE_TO_TWELVE_in_numeric_1_to_122609); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ONE_TO_TWELVE.add(ONE_TO_TWELVE222);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 264:19: -> INTEGER[$numeric_1_to_12.text]
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
    // $ANTLR end "numeric_1_to_12"

    public static class numeric_0_to_23_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numeric_0_to_23"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:268:1: numeric_0_to_23 : ( TWO_ZEROS -> INTEGER[$TWO_ZEROS.text] | ONE_TO_TWELVE -> INTEGER[$ONE_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INTEGER[$THIRTEEN_TO_TWENTY_THREE.text] );
    public final DateParser.numeric_0_to_23_return numeric_0_to_23() throws RecognitionException {
        DateParser.numeric_0_to_23_return retval = new DateParser.numeric_0_to_23_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TWO_ZEROS223=null;
        Token ONE_TO_TWELVE224=null;
        Token THIRTEEN_TO_TWENTY_THREE225=null;

        Object TWO_ZEROS223_tree=null;
        Object ONE_TO_TWELVE224_tree=null;
        Object THIRTEEN_TO_TWENTY_THREE225_tree=null;
        RewriteRuleTokenStream stream_TWO_ZEROS=new RewriteRuleTokenStream(adaptor,"token TWO_ZEROS");
        RewriteRuleTokenStream stream_THIRTEEN_TO_TWENTY_THREE=new RewriteRuleTokenStream(adaptor,"token THIRTEEN_TO_TWENTY_THREE");
        RewriteRuleTokenStream stream_ONE_TO_TWELVE=new RewriteRuleTokenStream(adaptor,"token ONE_TO_TWELVE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:269:3: ( TWO_ZEROS -> INTEGER[$TWO_ZEROS.text] | ONE_TO_TWELVE -> INTEGER[$ONE_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INTEGER[$THIRTEEN_TO_TWENTY_THREE.text] )
            int alt61=3;
            switch ( input.LA(1) ) {
            case TWO_ZEROS:
                {
                alt61=1;
                }
                break;
            case ONE_TO_TWELVE:
                {
                alt61=2;
                }
                break;
            case THIRTEEN_TO_TWENTY_THREE:
                {
                alt61=3;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:269:5: TWO_ZEROS
                    {
                    TWO_ZEROS223=(Token)match(input,TWO_ZEROS,FOLLOW_TWO_ZEROS_in_numeric_0_to_232630); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO_ZEROS.add(TWO_ZEROS223);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 269:30: -> INTEGER[$TWO_ZEROS.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (TWO_ZEROS223!=null?TWO_ZEROS223.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:270:5: ONE_TO_TWELVE
                    {
                    ONE_TO_TWELVE224=(Token)match(input,ONE_TO_TWELVE,FOLLOW_ONE_TO_TWELVE_in_numeric_0_to_232656); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE_TO_TWELVE.add(ONE_TO_TWELVE224);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 270:30: -> INTEGER[$ONE_TO_TWELVE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (ONE_TO_TWELVE224!=null?ONE_TO_TWELVE224.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:271:5: THIRTEEN_TO_TWENTY_THREE
                    {
                    THIRTEEN_TO_TWENTY_THREE225=(Token)match(input,THIRTEEN_TO_TWENTY_THREE,FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_numeric_0_to_232678); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEEN_TO_TWENTY_THREE.add(THIRTEEN_TO_TWENTY_THREE225);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 271:30: -> INTEGER[$THIRTEEN_TO_TWENTY_THREE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (THIRTEEN_TO_TWENTY_THREE225!=null?THIRTEEN_TO_TWENTY_THREE225.getText():null)));

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
    // $ANTLR end "numeric_0_to_23"

    public static class numeric_0_to_59_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numeric_0_to_59"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:275:1: numeric_0_to_59 : ( TWO_ZEROS -> INTEGER[\"0\"] | ONE_TO_TWELVE -> INTEGER[$ONE_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INTEGER[$THIRTEEN_TO_TWENTY_THREE.text] | TWENTY_FOUR_TO_THIRTY_ONE -> INTEGER[$TWENTY_FOUR_TO_THIRTY_ONE.text] | THIRTY_TWO_TO_FIFTY_NINE -> INTEGER[$THIRTY_TWO_TO_FIFTY_NINE.text] );
    public final DateParser.numeric_0_to_59_return numeric_0_to_59() throws RecognitionException {
        DateParser.numeric_0_to_59_return retval = new DateParser.numeric_0_to_59_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TWO_ZEROS226=null;
        Token ONE_TO_TWELVE227=null;
        Token THIRTEEN_TO_TWENTY_THREE228=null;
        Token TWENTY_FOUR_TO_THIRTY_ONE229=null;
        Token THIRTY_TWO_TO_FIFTY_NINE230=null;

        Object TWO_ZEROS226_tree=null;
        Object ONE_TO_TWELVE227_tree=null;
        Object THIRTEEN_TO_TWENTY_THREE228_tree=null;
        Object TWENTY_FOUR_TO_THIRTY_ONE229_tree=null;
        Object THIRTY_TWO_TO_FIFTY_NINE230_tree=null;
        RewriteRuleTokenStream stream_TWO_ZEROS=new RewriteRuleTokenStream(adaptor,"token TWO_ZEROS");
        RewriteRuleTokenStream stream_THIRTEEN_TO_TWENTY_THREE=new RewriteRuleTokenStream(adaptor,"token THIRTEEN_TO_TWENTY_THREE");
        RewriteRuleTokenStream stream_ONE_TO_TWELVE=new RewriteRuleTokenStream(adaptor,"token ONE_TO_TWELVE");
        RewriteRuleTokenStream stream_THIRTY_TWO_TO_FIFTY_NINE=new RewriteRuleTokenStream(adaptor,"token THIRTY_TWO_TO_FIFTY_NINE");
        RewriteRuleTokenStream stream_TWENTY_FOUR_TO_THIRTY_ONE=new RewriteRuleTokenStream(adaptor,"token TWENTY_FOUR_TO_THIRTY_ONE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:276:3: ( TWO_ZEROS -> INTEGER[\"0\"] | ONE_TO_TWELVE -> INTEGER[$ONE_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INTEGER[$THIRTEEN_TO_TWENTY_THREE.text] | TWENTY_FOUR_TO_THIRTY_ONE -> INTEGER[$TWENTY_FOUR_TO_THIRTY_ONE.text] | THIRTY_TWO_TO_FIFTY_NINE -> INTEGER[$THIRTY_TWO_TO_FIFTY_NINE.text] )
            int alt62=5;
            switch ( input.LA(1) ) {
            case TWO_ZEROS:
                {
                alt62=1;
                }
                break;
            case ONE_TO_TWELVE:
                {
                alt62=2;
                }
                break;
            case THIRTEEN_TO_TWENTY_THREE:
                {
                alt62=3;
                }
                break;
            case TWENTY_FOUR_TO_THIRTY_ONE:
                {
                alt62=4;
                }
                break;
            case THIRTY_TWO_TO_FIFTY_NINE:
                {
                alt62=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:276:5: TWO_ZEROS
                    {
                    TWO_ZEROS226=(Token)match(input,TWO_ZEROS,FOLLOW_TWO_ZEROS_in_numeric_0_to_592699); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO_ZEROS.add(TWO_ZEROS226);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 276:31: -> INTEGER[\"0\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "0"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:277:5: ONE_TO_TWELVE
                    {
                    ONE_TO_TWELVE227=(Token)match(input,ONE_TO_TWELVE,FOLLOW_ONE_TO_TWELVE_in_numeric_0_to_592726); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE_TO_TWELVE.add(ONE_TO_TWELVE227);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 277:31: -> INTEGER[$ONE_TO_TWELVE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (ONE_TO_TWELVE227!=null?ONE_TO_TWELVE227.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:278:5: THIRTEEN_TO_TWENTY_THREE
                    {
                    THIRTEEN_TO_TWENTY_THREE228=(Token)match(input,THIRTEEN_TO_TWENTY_THREE,FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_numeric_0_to_592749); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEEN_TO_TWENTY_THREE.add(THIRTEEN_TO_TWENTY_THREE228);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 278:31: -> INTEGER[$THIRTEEN_TO_TWENTY_THREE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (THIRTEEN_TO_TWENTY_THREE228!=null?THIRTEEN_TO_TWENTY_THREE228.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:279:5: TWENTY_FOUR_TO_THIRTY_ONE
                    {
                    TWENTY_FOUR_TO_THIRTY_ONE229=(Token)match(input,TWENTY_FOUR_TO_THIRTY_ONE,FOLLOW_TWENTY_FOUR_TO_THIRTY_ONE_in_numeric_0_to_592761); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY_FOUR_TO_THIRTY_ONE.add(TWENTY_FOUR_TO_THIRTY_ONE229);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 279:31: -> INTEGER[$TWENTY_FOUR_TO_THIRTY_ONE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (TWENTY_FOUR_TO_THIRTY_ONE229!=null?TWENTY_FOUR_TO_THIRTY_ONE229.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:280:5: THIRTY_TWO_TO_FIFTY_NINE
                    {
                    THIRTY_TWO_TO_FIFTY_NINE230=(Token)match(input,THIRTY_TWO_TO_FIFTY_NINE,FOLLOW_THIRTY_TWO_TO_FIFTY_NINE_in_numeric_0_to_592772); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY_TWO_TO_FIFTY_NINE.add(THIRTY_TWO_TO_FIFTY_NINE230);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 280:31: -> INTEGER[$THIRTY_TWO_TO_FIFTY_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (THIRTY_TWO_TO_FIFTY_NINE230!=null?THIRTY_TWO_TO_FIFTY_NINE230.getText():null)));

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
    // $ANTLR end "numeric_0_to_59"

    public static class numeric_0_to_99_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numeric_0_to_99"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:284:1: numeric_0_to_99 : ( TWO_ZEROS -> INTEGER[$TWO_ZEROS.text] | ONE_TO_TWELVE -> INTEGER[$ONE_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INTEGER[$THIRTEEN_TO_TWENTY_THREE.text] | TWENTY_FOUR_TO_THIRTY_ONE -> INTEGER[$TWENTY_FOUR_TO_THIRTY_ONE.text] | THIRTY_TWO_TO_FIFTY_NINE -> INTEGER[$THIRTY_TWO_TO_FIFTY_NINE.text] | SIXTY_TO_NINETY_NINE -> INTEGER[$SIXTY_TO_NINETY_NINE.text] );
    public final DateParser.numeric_0_to_99_return numeric_0_to_99() throws RecognitionException {
        DateParser.numeric_0_to_99_return retval = new DateParser.numeric_0_to_99_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TWO_ZEROS231=null;
        Token ONE_TO_TWELVE232=null;
        Token THIRTEEN_TO_TWENTY_THREE233=null;
        Token TWENTY_FOUR_TO_THIRTY_ONE234=null;
        Token THIRTY_TWO_TO_FIFTY_NINE235=null;
        Token SIXTY_TO_NINETY_NINE236=null;

        Object TWO_ZEROS231_tree=null;
        Object ONE_TO_TWELVE232_tree=null;
        Object THIRTEEN_TO_TWENTY_THREE233_tree=null;
        Object TWENTY_FOUR_TO_THIRTY_ONE234_tree=null;
        Object THIRTY_TWO_TO_FIFTY_NINE235_tree=null;
        Object SIXTY_TO_NINETY_NINE236_tree=null;
        RewriteRuleTokenStream stream_SIXTY_TO_NINETY_NINE=new RewriteRuleTokenStream(adaptor,"token SIXTY_TO_NINETY_NINE");
        RewriteRuleTokenStream stream_TWO_ZEROS=new RewriteRuleTokenStream(adaptor,"token TWO_ZEROS");
        RewriteRuleTokenStream stream_THIRTEEN_TO_TWENTY_THREE=new RewriteRuleTokenStream(adaptor,"token THIRTEEN_TO_TWENTY_THREE");
        RewriteRuleTokenStream stream_ONE_TO_TWELVE=new RewriteRuleTokenStream(adaptor,"token ONE_TO_TWELVE");
        RewriteRuleTokenStream stream_THIRTY_TWO_TO_FIFTY_NINE=new RewriteRuleTokenStream(adaptor,"token THIRTY_TWO_TO_FIFTY_NINE");
        RewriteRuleTokenStream stream_TWENTY_FOUR_TO_THIRTY_ONE=new RewriteRuleTokenStream(adaptor,"token TWENTY_FOUR_TO_THIRTY_ONE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:285:3: ( TWO_ZEROS -> INTEGER[$TWO_ZEROS.text] | ONE_TO_TWELVE -> INTEGER[$ONE_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INTEGER[$THIRTEEN_TO_TWENTY_THREE.text] | TWENTY_FOUR_TO_THIRTY_ONE -> INTEGER[$TWENTY_FOUR_TO_THIRTY_ONE.text] | THIRTY_TWO_TO_FIFTY_NINE -> INTEGER[$THIRTY_TWO_TO_FIFTY_NINE.text] | SIXTY_TO_NINETY_NINE -> INTEGER[$SIXTY_TO_NINETY_NINE.text] )
            int alt63=6;
            switch ( input.LA(1) ) {
            case TWO_ZEROS:
                {
                alt63=1;
                }
                break;
            case ONE_TO_TWELVE:
                {
                alt63=2;
                }
                break;
            case THIRTEEN_TO_TWENTY_THREE:
                {
                alt63=3;
                }
                break;
            case TWENTY_FOUR_TO_THIRTY_ONE:
                {
                alt63=4;
                }
                break;
            case THIRTY_TWO_TO_FIFTY_NINE:
                {
                alt63=5;
                }
                break;
            case SIXTY_TO_NINETY_NINE:
                {
                alt63=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:285:5: TWO_ZEROS
                    {
                    TWO_ZEROS231=(Token)match(input,TWO_ZEROS,FOLLOW_TWO_ZEROS_in_numeric_0_to_992794); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO_ZEROS.add(TWO_ZEROS231);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 285:31: -> INTEGER[$TWO_ZEROS.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (TWO_ZEROS231!=null?TWO_ZEROS231.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:286:5: ONE_TO_TWELVE
                    {
                    ONE_TO_TWELVE232=(Token)match(input,ONE_TO_TWELVE,FOLLOW_ONE_TO_TWELVE_in_numeric_0_to_992821); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE_TO_TWELVE.add(ONE_TO_TWELVE232);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 286:31: -> INTEGER[$ONE_TO_TWELVE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (ONE_TO_TWELVE232!=null?ONE_TO_TWELVE232.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:287:5: THIRTEEN_TO_TWENTY_THREE
                    {
                    THIRTEEN_TO_TWENTY_THREE233=(Token)match(input,THIRTEEN_TO_TWENTY_THREE,FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_numeric_0_to_992844); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEEN_TO_TWENTY_THREE.add(THIRTEEN_TO_TWENTY_THREE233);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 287:31: -> INTEGER[$THIRTEEN_TO_TWENTY_THREE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (THIRTEEN_TO_TWENTY_THREE233!=null?THIRTEEN_TO_TWENTY_THREE233.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:288:5: TWENTY_FOUR_TO_THIRTY_ONE
                    {
                    TWENTY_FOUR_TO_THIRTY_ONE234=(Token)match(input,TWENTY_FOUR_TO_THIRTY_ONE,FOLLOW_TWENTY_FOUR_TO_THIRTY_ONE_in_numeric_0_to_992856); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY_FOUR_TO_THIRTY_ONE.add(TWENTY_FOUR_TO_THIRTY_ONE234);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 288:31: -> INTEGER[$TWENTY_FOUR_TO_THIRTY_ONE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (TWENTY_FOUR_TO_THIRTY_ONE234!=null?TWENTY_FOUR_TO_THIRTY_ONE234.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:289:5: THIRTY_TWO_TO_FIFTY_NINE
                    {
                    THIRTY_TWO_TO_FIFTY_NINE235=(Token)match(input,THIRTY_TWO_TO_FIFTY_NINE,FOLLOW_THIRTY_TWO_TO_FIFTY_NINE_in_numeric_0_to_992867); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY_TWO_TO_FIFTY_NINE.add(THIRTY_TWO_TO_FIFTY_NINE235);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 289:31: -> INTEGER[$THIRTY_TWO_TO_FIFTY_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (THIRTY_TWO_TO_FIFTY_NINE235!=null?THIRTY_TWO_TO_FIFTY_NINE235.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:290:5: SIXTY_TO_NINETY_NINE
                    {
                    SIXTY_TO_NINETY_NINE236=(Token)match(input,SIXTY_TO_NINETY_NINE,FOLLOW_SIXTY_TO_NINETY_NINE_in_numeric_0_to_992879); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTY_TO_NINETY_NINE.add(SIXTY_TO_NINETY_NINE236);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 290:31: -> INTEGER[$SIXTY_TO_NINETY_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (SIXTY_TO_NINETY_NINE236!=null?SIXTY_TO_NINETY_NINE236.getText():null)));

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
    // $ANTLR end "numeric_0_to_99"

    public static class numeric_1_to_31_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numeric_1_to_31"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:294:1: numeric_1_to_31 : ( ONE_TO_TWELVE -> INTEGER[$ONE_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INTEGER[$THIRTEEN_TO_TWENTY_THREE.text] | TWENTY_FOUR_TO_THIRTY_ONE -> INTEGER[$TWENTY_FOUR_TO_THIRTY_ONE.text] );
    public final DateParser.numeric_1_to_31_return numeric_1_to_31() throws RecognitionException {
        DateParser.numeric_1_to_31_return retval = new DateParser.numeric_1_to_31_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ONE_TO_TWELVE237=null;
        Token THIRTEEN_TO_TWENTY_THREE238=null;
        Token TWENTY_FOUR_TO_THIRTY_ONE239=null;

        Object ONE_TO_TWELVE237_tree=null;
        Object THIRTEEN_TO_TWENTY_THREE238_tree=null;
        Object TWENTY_FOUR_TO_THIRTY_ONE239_tree=null;
        RewriteRuleTokenStream stream_THIRTEEN_TO_TWENTY_THREE=new RewriteRuleTokenStream(adaptor,"token THIRTEEN_TO_TWENTY_THREE");
        RewriteRuleTokenStream stream_ONE_TO_TWELVE=new RewriteRuleTokenStream(adaptor,"token ONE_TO_TWELVE");
        RewriteRuleTokenStream stream_TWENTY_FOUR_TO_THIRTY_ONE=new RewriteRuleTokenStream(adaptor,"token TWENTY_FOUR_TO_THIRTY_ONE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:295:3: ( ONE_TO_TWELVE -> INTEGER[$ONE_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INTEGER[$THIRTEEN_TO_TWENTY_THREE.text] | TWENTY_FOUR_TO_THIRTY_ONE -> INTEGER[$TWENTY_FOUR_TO_THIRTY_ONE.text] )
            int alt64=3;
            switch ( input.LA(1) ) {
            case ONE_TO_TWELVE:
                {
                alt64=1;
                }
                break;
            case THIRTEEN_TO_TWENTY_THREE:
                {
                alt64=2;
                }
                break;
            case TWENTY_FOUR_TO_THIRTY_ONE:
                {
                alt64=3;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:295:5: ONE_TO_TWELVE
                    {
                    ONE_TO_TWELVE237=(Token)match(input,ONE_TO_TWELVE,FOLLOW_ONE_TO_TWELVE_in_numeric_1_to_312905); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE_TO_TWELVE.add(ONE_TO_TWELVE237);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 295:31: -> INTEGER[$ONE_TO_TWELVE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (ONE_TO_TWELVE237!=null?ONE_TO_TWELVE237.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:296:5: THIRTEEN_TO_TWENTY_THREE
                    {
                    THIRTEEN_TO_TWENTY_THREE238=(Token)match(input,THIRTEEN_TO_TWENTY_THREE,FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_numeric_1_to_312928); if (state.failed) return retval; 
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
                    // 296:31: -> INTEGER[$THIRTEEN_TO_TWENTY_THREE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (THIRTEEN_TO_TWENTY_THREE238!=null?THIRTEEN_TO_TWENTY_THREE238.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:297:5: TWENTY_FOUR_TO_THIRTY_ONE
                    {
                    TWENTY_FOUR_TO_THIRTY_ONE239=(Token)match(input,TWENTY_FOUR_TO_THIRTY_ONE,FOLLOW_TWENTY_FOUR_TO_THIRTY_ONE_in_numeric_1_to_312940); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY_FOUR_TO_THIRTY_ONE.add(TWENTY_FOUR_TO_THIRTY_ONE239);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 297:31: -> INTEGER[$TWENTY_FOUR_TO_THIRTY_ONE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (TWENTY_FOUR_TO_THIRTY_ONE239!=null?TWENTY_FOUR_TO_THIRTY_ONE239.getText():null)));

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
    // $ANTLR end "numeric_1_to_31"

    // $ANTLR start synpred1_Date
    public final void synpred1_Date_fragment() throws RecognitionException {   
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:28:5: ( date ( 'at' )? ( time )? )
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:28:5: date ( 'at' )? ( time )?
        {
        pushFollow(FOLLOW_date_in_synpred1_Date118);
        date();

        state._fsp--;
        if (state.failed) return ;
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:28:10: ( 'at' )?
        int alt65=2;
        int LA65_0 = input.LA(1);

        if ( (LA65_0==111) ) {
            alt65=1;
        }
        switch (alt65) {
            case 1 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:28:10: 'at'
                {
                match(input,111,FOLLOW_111_in_synpred1_Date120); if (state.failed) return ;

                }
                break;

        }

        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:28:16: ( time )?
        int alt66=2;
        int LA66_0 = input.LA(1);

        if ( ((LA66_0>=MIDNIGHT && LA66_0<=NOON)||(LA66_0>=ONE_TO_TWELVE && LA66_0<=THIRTEEN_TO_TWENTY_THREE)) ) {
            alt66=1;
        }
        switch (alt66) {
            case 1 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:28:16: time
                {
                pushFollow(FOLLOW_time_in_synpred1_Date123);
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
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:29:5: ( time ( 'on' )? date )
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:29:5: time ( 'on' )? date
        {
        pushFollow(FOLLOW_time_in_synpred2_Date141);
        time();

        state._fsp--;
        if (state.failed) return ;
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:29:10: ( 'on' )?
        int alt67=2;
        int LA67_0 = input.LA(1);

        if ( (LA67_0==112) ) {
            alt67=1;
        }
        switch (alt67) {
            case 1 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:29:10: 'on'
                {
                match(input,112,FOLLOW_112_in_synpred2_Date143); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_date_in_synpred2_Date146);
        date();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Date

    // $ANTLR start synpred3_Date
    public final void synpred3_Date_fragment() throws RecognitionException {   
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:55:5: ( numeric_1_to_12 date_separator numeric_1_to_31 ( date_separator four_digits )? )
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:55:5: numeric_1_to_12 date_separator numeric_1_to_31 ( date_separator four_digits )?
        {
        pushFollow(FOLLOW_numeric_1_to_12_in_synpred3_Date312);
        numeric_1_to_12();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_date_separator_in_synpred3_Date314);
        date_separator();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_numeric_1_to_31_in_synpred3_Date316);
        numeric_1_to_31();

        state._fsp--;
        if (state.failed) return ;
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:55:52: ( date_separator four_digits )?
        int alt68=2;
        int LA68_0 = input.LA(1);

        if ( ((LA68_0>=DASH && LA68_0<=SLASH)) ) {
            alt68=1;
        }
        switch (alt68) {
            case 1 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:55:53: date_separator four_digits
                {
                pushFollow(FOLLOW_date_separator_in_synpred3_Date319);
                date_separator();

                state._fsp--;
                if (state.failed) return ;
                pushFollow(FOLLOW_four_digits_in_synpred3_Date321);
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
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:58:5: ( four_digits date_separator numeric_1_to_12 date_separator numeric_1_to_31 )
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:58:5: four_digits date_separator numeric_1_to_12 date_separator numeric_1_to_31
        {
        pushFollow(FOLLOW_four_digits_in_synpred4_Date351);
        four_digits();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_date_separator_in_synpred4_Date353);
        date_separator();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_numeric_1_to_12_in_synpred4_Date355);
        numeric_1_to_12();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_date_separator_in_synpred4_Date357);
        date_separator();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_numeric_1_to_31_in_synpred4_Date359);
        numeric_1_to_31();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_Date

    // $ANTLR start synpred6_Date
    public final void synpred6_Date_fragment() throws RecognitionException {   
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:158:5: ( ( '\\'' )? numeric_0_to_99 )
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:158:5: ( '\\'' )? numeric_0_to_99
        {
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:158:5: ( '\\'' )?
        int alt71=2;
        int LA71_0 = input.LA(1);

        if ( (LA71_0==127) ) {
            alt71=1;
        }
        switch (alt71) {
            case 1 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:158:5: '\\''
                {
                match(input,127,FOLLOW_127_in_synpred6_Date1314); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_numeric_0_to_99_in_synpred6_Date1317);
        numeric_0_to_99();

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
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA59 dfa59 = new DFA59(this);
    static final String DFA4_eotS =
        "\42\uffff";
    static final String DFA4_eofS =
        "\2\uffff\5\27\1\uffff\14\1\2\27\2\uffff\5\27\3\uffff\2\27";
    static final String DFA4_minS =
        "\1\21\1\uffff\5\21\1\147\14\53\2\21\2\uffff\5\21\3\0\2\21";
    static final String DFA4_maxS =
        "\1\174\1\uffff\5\174\1\153\14\u0080\2\174\2\uffff\5\174\3\0\2\174";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\24\uffff\1\2\1\3\12\uffff";
    static final String DFA4_specialS =
        "\35\uffff\1\0\1\1\1\2\2\uffff}>";
    static final String[] DFA4_transitionS = {
            "\14\1\7\uffff\3\1\4\uffff\1\5\1\6\4\uffff\66\1\1\2\1\4\1\3\3"+
            "\1\7\uffff\11\1",
            "",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
            "\7\1\3\26\4\1\2\uffff\2\1\1\24\1\25\74\26\3\uffff\1\26\1\uffff"+
            "\1\1\1\7\11\26",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
            "\7\1\3\26\4\1\2\uffff\2\1\1\24\1\25\74\26\3\uffff\1\26\1\uffff"+
            "\1\1\1\7\11\26",
            "\14\26\7\uffff\3\26\6\uffff\2\1\1\24\1\25\74\26\3\uffff\1\26"+
            "\2\uffff\1\7\11\26",
            "\14\26\7\uffff\3\26\12\uffff\74\26\3\uffff\1\26\3\uffff\11"+
            "\26",
            "\14\26\7\uffff\3\26\12\uffff\74\26\3\uffff\1\26\3\uffff\11"+
            "\26",
            "\1\31\1\30\1\32\1\33\1\34",
            "\2\1\4\uffff\64\26\2\1\1\35\1\1\1\36\1\37\2\1\2\uffff\1\1\1"+
            "\uffff\1\1\13\uffff\4\1",
            "\2\1\4\uffff\64\26\2\1\1\35\1\1\1\36\1\37\2\1\2\uffff\1\1\1"+
            "\uffff\1\1\13\uffff\4\1",
            "\2\1\4\uffff\64\26\2\1\1\35\1\1\1\36\1\37\2\1\2\uffff\1\1\1"+
            "\uffff\1\1\13\uffff\4\1",
            "\2\1\4\uffff\64\26\2\1\1\35\1\1\1\36\1\37\2\1\2\uffff\1\1\1"+
            "\uffff\1\1\13\uffff\4\1",
            "\2\1\4\uffff\64\26\2\1\1\35\1\1\1\36\1\37\2\1\2\uffff\1\1\1"+
            "\uffff\1\1\13\uffff\4\1",
            "\2\1\4\uffff\64\26\2\1\1\35\1\1\1\36\1\37\2\1\2\uffff\1\1\1"+
            "\uffff\1\1\13\uffff\4\1",
            "\2\1\4\uffff\64\26\2\1\1\35\1\1\1\36\1\37\2\1\2\uffff\1\1\1"+
            "\uffff\1\1\13\uffff\4\1",
            "\2\1\4\uffff\64\26\2\1\1\35\1\1\1\36\1\37\2\1\2\uffff\1\1\1"+
            "\uffff\1\1\13\uffff\4\1",
            "\2\1\4\uffff\64\26\2\1\1\35\1\1\1\36\1\37\2\1\2\uffff\1\1\1"+
            "\uffff\1\1\13\uffff\4\1",
            "\2\1\4\uffff\64\26\2\1\1\35\1\1\1\36\1\37\2\1\2\uffff\1\1\1"+
            "\uffff\1\1\13\uffff\4\1",
            "\2\1\4\uffff\64\26\2\1\1\35\1\1\1\36\1\37\2\1\2\uffff\1\1\1"+
            "\uffff\1\1\13\uffff\4\1",
            "\2\1\4\uffff\64\26\2\1\1\35\1\1\1\36\1\37\2\1\2\uffff\1\1\1"+
            "\uffff\1\1\13\uffff\4\1",
            "\14\26\7\uffff\3\26\12\uffff\74\26\3\uffff\1\26\3\uffff\11"+
            "\26",
            "\14\26\7\uffff\3\26\12\uffff\74\26\3\uffff\1\26\3\uffff\11"+
            "\26",
            "",
            "",
            "\14\26\7\uffff\3\26\10\uffff\1\40\1\41\74\26\3\uffff\1\26\3"+
            "\uffff\11\26",
            "\14\26\7\uffff\3\26\10\uffff\1\40\1\41\74\26\3\uffff\1\26\3"+
            "\uffff\11\26",
            "\14\26\7\uffff\3\26\10\uffff\1\40\1\41\74\26\3\uffff\1\26\3"+
            "\uffff\11\26",
            "\14\26\7\uffff\3\26\10\uffff\1\40\1\41\74\26\3\uffff\1\26\3"+
            "\uffff\11\26",
            "\14\26\7\uffff\3\26\10\uffff\1\40\1\41\74\26\3\uffff\1\26\3"+
            "\uffff\11\26",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\14\26\7\uffff\3\26\12\uffff\74\26\3\uffff\1\26\3\uffff\11"+
            "\26",
            "\14\26\7\uffff\3\26\12\uffff\74\26\3\uffff\1\26\3\uffff\11"+
            "\26"
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
            return "26:1: datetime options {backtrack=true; } : ( date ( 'at' )? ( time )? -> ^( DATE_TIME date ( time )? ) | time ( 'on' )? date -> ^( DATE_TIME date time ) | time -> ^( DATE_TIME ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"0\"] ) time ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_29 = input.LA(1);

                         
                        int index4_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 22;}

                         
                        input.seek(index4_29);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_30 = input.LA(1);

                         
                        int index4_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 22;}

                         
                        input.seek(index4_30);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA4_31 = input.LA(1);

                         
                        int index4_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 22;}

                         
                        input.seek(index4_31);
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
        "\63\uffff";
    static final String DFA5_eofS =
        "\33\uffff\14\32\14\uffff";
    static final String DFA5_minS =
        "\1\21\1\uffff\30\21\1\uffff\14\53\1\61\11\21\1\61\1\21";
    static final String DFA5_maxS =
        "\1\174\1\uffff\30\162\1\uffff\14\u0080\1\116\11\162\1\106\1\162";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\30\uffff\1\2\30\uffff";
    static final String DFA5_specialS =
        "\63\uffff}>";
    static final String[] DFA5_transitionS = {
            "\14\32\7\uffff\3\1\12\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
            "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
            "\1\26\41\32\1\27\1\32\1\30\1\31\2\32\7\uffff\11\1",
            "",
            "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
            "\7\1\3\uffff\4\1\107\uffff\1\32",
            "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
            "\7\1\3\uffff\4\1\107\uffff\1\32",
            "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
            "\7\1\3\uffff\4\1\107\uffff\1\32",
            "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
            "\7\1\3\uffff\4\1\107\uffff\1\32",
            "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
            "\7\1\3\uffff\4\1\107\uffff\1\32",
            "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
            "\7\1\3\uffff\4\1\107\uffff\1\32",
            "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
            "\7\1\3\uffff\4\1\107\uffff\1\32",
            "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
            "\7\1\3\uffff\4\1\107\uffff\1\32",
            "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
            "\7\1\3\uffff\4\1\107\uffff\1\32",
            "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
            "\7\1\3\uffff\4\1\107\uffff\1\32",
            "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
            "\7\1\3\uffff\4\1\107\uffff\1\32",
            "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
            "\7\1\3\uffff\4\1\107\uffff\1\32",
            "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
            "\7\1\3\uffff\4\1\107\uffff\1\32",
            "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
            "\7\1\3\uffff\4\1\107\uffff\1\32",
            "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
            "\7\1\3\uffff\4\1\107\uffff\1\32",
            "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
            "\7\1\3\uffff\4\1\107\uffff\1\32",
            "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
            "\7\1\3\uffff\4\1\107\uffff\1\32",
            "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
            "\7\1\3\uffff\4\1\107\uffff\1\32",
            "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
            "\7\1\3\uffff\4\1\107\uffff\1\32",
            "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
            "\7\1\3\uffff\4\1\2\uffff\1\47\3\uffff\1\53\1\60\1\54\1\52\1"+
            "\51\1\50\1\56\1\55\1\57\14\uffff\11\32\43\uffff\1\32",
            "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
            "\7\1\3\uffff\4\1\2\uffff\1\61\3\uffff\1\62\24\uffff\1\32\53"+
            "\uffff\1\32",
            "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
            "\7\1\3\uffff\4\1\2\uffff\2\32\103\uffff\1\32",
            "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
            "\7\1\3\uffff\4\1\2\uffff\2\32\103\uffff\1\32",
            "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
            "\7\1\3\uffff\4\1\2\uffff\2\32\103\uffff\1\32",
            "",
            "\2\32\70\uffff\10\32\2\uffff\1\32\1\uffff\1\32\13\uffff\2\1"+
            "\2\32",
            "\2\32\70\uffff\10\32\2\uffff\1\32\1\uffff\1\32\13\uffff\2\1"+
            "\2\32",
            "\2\32\70\uffff\10\32\2\uffff\1\32\1\uffff\1\32\13\uffff\2\1"+
            "\2\32",
            "\2\32\70\uffff\10\32\2\uffff\1\32\1\uffff\1\32\13\uffff\2\1"+
            "\2\32",
            "\2\32\70\uffff\10\32\2\uffff\1\32\1\uffff\1\32\13\uffff\2\1"+
            "\2\32",
            "\2\32\70\uffff\10\32\2\uffff\1\32\1\uffff\1\32\13\uffff\2\1"+
            "\2\32",
            "\2\32\70\uffff\10\32\2\uffff\1\32\1\uffff\1\32\13\uffff\2\1"+
            "\2\32",
            "\2\32\70\uffff\10\32\2\uffff\1\32\1\uffff\1\32\13\uffff\2\1"+
            "\2\32",
            "\2\32\70\uffff\10\32\2\uffff\1\32\1\uffff\1\32\13\uffff\2\1"+
            "\2\32",
            "\2\32\70\uffff\10\32\2\uffff\1\32\1\uffff\1\32\13\uffff\2\1"+
            "\2\32",
            "\2\32\70\uffff\10\32\2\uffff\1\32\1\uffff\1\32\13\uffff\2\1"+
            "\2\32",
            "\2\32\70\uffff\10\32\2\uffff\1\32\1\uffff\1\32\13\uffff\2\1"+
            "\2\32",
            "\1\53\1\60\1\54\1\52\1\51\1\50\1\56\1\55\1\57\14\uffff\11\32",
            "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
            "\7\1\3\uffff\4\1\107\uffff\1\32",
            "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
            "\7\1\3\uffff\4\1\107\uffff\1\32",
            "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
            "\7\1\3\uffff\4\1\107\uffff\1\32",
            "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
            "\7\1\3\uffff\4\1\107\uffff\1\32",
            "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
            "\7\1\3\uffff\4\1\107\uffff\1\32",
            "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
            "\7\1\3\uffff\4\1\107\uffff\1\32",
            "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
            "\7\1\3\uffff\4\1\107\uffff\1\32",
            "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
            "\7\1\3\uffff\4\1\107\uffff\1\32",
            "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
            "\7\1\3\uffff\4\1\107\uffff\1\32",
            "\1\62\24\uffff\1\32",
            "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
            "\7\1\3\uffff\4\1\107\uffff\1\32"
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
            return "33:1: date : ( relative_date | explicit_date );";
        }
    }
    static final String DFA13_eotS =
        "\16\uffff";
    static final String DFA13_eofS =
        "\10\uffff\1\11\5\uffff";
    static final String DFA13_minS =
        "\2\21\1\uffff\2\21\2\uffff\1\147\1\53\1\uffff\1\145\3\0";
    static final String DFA13_maxS =
        "\1\154\1\162\1\uffff\2\162\2\uffff\1\152\1\157\1\uffff\1\154\3\0";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\2\uffff\1\3\1\4\2\uffff\1\1\4\uffff";
    static final String DFA13_specialS =
        "\13\uffff\1\0\1\1\1\2}>";
    static final String[] DFA13_transitionS = {
            "\14\5\24\uffff\64\6\2\2\1\1\1\2\1\3\1\4\2\2",
            "\14\6\20\uffff\2\7\103\uffff\1\6",
            "",
            "\14\6\20\uffff\2\2\103\uffff\1\6",
            "\14\6\20\uffff\2\2\103\uffff\1\6",
            "",
            "",
            "\1\10\1\uffff\2\11",
            "\2\11\2\12\70\uffff\3\11\5\uffff\1\11",
            "",
            "\2\11\1\13\1\11\1\14\1\15\2\11",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "53:1: explicit_date options {backtrack=true; } : ( numeric_1_to_12 date_separator numeric_1_to_31 ( date_separator four_digits )? -> ^( EXPLICIT_DATE numeric_1_to_31 numeric_1_to_31 ( four_digits )? ) | four_digits date_separator numeric_1_to_12 date_separator numeric_1_to_31 -> ^( EXPLICIT_DATE numeric_1_to_12 numeric_1_to_31 four_digits ) | month day_of_month ( ( ',' )? year )? -> ^( EXPLICIT_DATE month day_of_month ( year )? ) | day_of_month ( 'of' )? month ( ( ',' )? year )? -> ^( EXPLICIT_DATE month day_of_month ( year )? ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_11 = input.LA(1);

                         
                        int index13_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 9;}

                        else if ( (synpred4_Date()) ) {s = 2;}

                         
                        input.seek(index13_11);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_12 = input.LA(1);

                         
                        int index13_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 9;}

                        else if ( (synpred4_Date()) ) {s = 2;}

                         
                        input.seek(index13_12);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_13 = input.LA(1);

                         
                        int index13_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 9;}

                        else if ( (synpred4_Date()) ) {s = 2;}

                         
                        input.seek(index13_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA47_eotS =
        "\43\uffff";
    static final String DFA47_eofS =
        "\24\uffff\1\32\1\41\15\uffff";
    static final String DFA47_minS =
        "\1\61\23\uffff\2\21\1\61\14\uffff";
    static final String DFA47_maxS =
        "\1\105\23\uffff\2\u0080\1\71\14\uffff";
    static final String DFA47_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\3\uffff\1\35\1\32\1\27\1\24\1"+
        "\30\1\25\1\34\1\26\1\33\1\31\1\36\1\37";
    static final String DFA47_specialS =
        "\43\uffff}>";
    static final String[] DFA47_transitionS = {
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
            "\23\32\3\uffff\6\32\1\26\3\uffff\1\34\1\36\1\31\1\33\1\40\1"+
            "\30\1\37\1\35\1\27\53\uffff\10\32\2\uffff\1\32\1\uffff\2\32"+
            "\14\uffff\2\32",
            "\23\41\3\uffff\6\41\1\42\3\uffff\1\42\63\uffff\10\41\2\uffff"+
            "\1\41\1\uffff\2\41\14\uffff\2\41",
            "\1\34\1\36\1\31\1\33\1\40\1\30\1\37\1\35\1\27",
            "",
            "",
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

    static final short[] DFA47_eot = DFA.unpackEncodedString(DFA47_eotS);
    static final short[] DFA47_eof = DFA.unpackEncodedString(DFA47_eofS);
    static final char[] DFA47_min = DFA.unpackEncodedStringToUnsignedChars(DFA47_minS);
    static final char[] DFA47_max = DFA.unpackEncodedStringToUnsignedChars(DFA47_maxS);
    static final short[] DFA47_accept = DFA.unpackEncodedString(DFA47_acceptS);
    static final short[] DFA47_special = DFA.unpackEncodedString(DFA47_specialS);
    static final short[][] DFA47_transition;

    static {
        int numStates = DFA47_transitionS.length;
        DFA47_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA47_transition[i] = DFA.unpackEncodedString(DFA47_transitionS[i]);
        }
    }

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = DFA47_eot;
            this.eof = DFA47_eof;
            this.min = DFA47_min;
            this.max = DFA47_max;
            this.accept = DFA47_accept;
            this.special = DFA47_special;
            this.transition = DFA47_transition;
        }
        public String getDescription() {
            return "181:1: spelled_number_1_to_31 : ( ONE -> INTEGER[\"1\"] | TWO -> INTEGER[\"2\"] | THREE -> INTEGER[\"3\"] | FOUR -> INTEGER[\"4\"] | FIVE -> INTEGER[\"5\"] | SIX -> INTEGER[\"6\"] | SEVEN -> INTEGER[\"7\"] | EIGHT -> INTEGER[\"8\"] | NINE -> INTEGER[\"9\"] | TEN -> INTEGER[\"10\"] | ELEVEN -> INTEGER[\"11\"] | TWELVE -> INTEGER[\"12\"] | THIRTEEN -> INTEGER[\"13\"] | FOURTEEN -> INTEGER[\"14\"] | FIFTEEN -> INTEGER[\"15\"] | SIXTEEN -> INTEGER[\"16\"] | SEVENTEEN -> INTEGER[\"17\"] | EIGHTEEN -> INTEGER[\"18\"] | NINETEEN -> INTEGER[\"19\"] | TWENTY -> INTEGER[\"20\"] | TWENTY ( DASH )? ONE -> INTEGER[\"21\"] | TWENTY ( DASH )? TWO -> INTEGER[\"22\"] | TWENTY ( DASH )? THREE -> INTEGER[\"23\"] | TWENTY ( DASH )? FOUR -> INTEGER[\"24\"] | TWENTY ( DASH )? FIVE -> INTEGER[\"25\"] | TWENTY ( DASH )? SIX -> INTEGER[\"26\"] | TWENTY ( DASH )? SEVEN -> INTEGER[\"27\"] | TWENTY ( DASH )? EIGHT -> INTEGER[\"28\"] | TWENTY ( DASH )? NINE -> INTEGER[\"29\"] | THIRTY -> INTEGER[\"30\"] | THIRTY ( DASH )? ONE -> INTEGER[\"31\"] );";
        }
    }
    static final String DFA59_eotS =
        "\54\uffff";
    static final String DFA59_eofS =
        "\54\uffff";
    static final String DFA59_minS =
        "\1\104\25\uffff\1\55\13\uffff\1\106\11\uffff";
    static final String DFA59_maxS =
        "\1\144\25\uffff\1\116\13\uffff\1\116\11\uffff";
    static final String DFA59_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\uffff\1\27\1\31\1"+
        "\33\1\35\1\37\1\41\1\43\1\45\1\47\1\50\1\51\1\uffff\1\42\1\36\1"+
        "\40\1\44\1\34\1\46\1\32\1\30\1\26";
    static final String DFA59_specialS =
        "\54\uffff}>";
    static final String[] DFA59_transitionS = {
            "\1\26\1\41\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
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
            "\1\42\30\uffff\1\53\1\52\1\51\1\47\1\44\1\45\1\43\1\46\1\50",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\53\1\52\1\51\1\47\1\44\1\45\1\43\1\46\1\50",
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
            return "222:1: spelled_sequence_1_to_31 : ( FIRST -> INTEGER[\"1\"] | SECOND -> INTEGER[\"2\"] | THIRD -> INTEGER[\"3\"] | FOURTH -> INTEGER[\"4\"] | FIFTH -> INTEGER[\"5\"] | SIXTH -> INTEGER[\"6\"] | SEVENTH -> INTEGER[\"7\"] | EIGHTH -> INTEGER[\"8\"] | NINTH -> INTEGER[\"9\"] | TENTH -> INTEGER[\"10\"] | ELEVENTH -> INTEGER[\"11\"] | TWELFTH -> INTEGER[\"12\"] | THIRTEENTH -> INTEGER[\"13\"] | FOURTEENTH -> INTEGER[\"14\"] | FIFTEENTH -> INTEGER[\"15\"] | SIXTEENTH -> INTEGER[\"16\"] | SEVENTEENTH -> INTEGER[\"17\"] | EIGHTEENTH -> INTEGER[\"18\"] | NINETEENTH -> INTEGER[\"19\"] | TWENTIETH -> INTEGER[\"20\"] | TWENTY_FIRST | ( TWENTY ( DASH )? FIRST ) -> INTEGER[\"21\"] | TWENTY_SECOND | ( TWENTY ( DASH )? SECOND ) -> INTEGER[\"22\"] | TWENTY_THIRD | ( TWENTY ( DASH )? THIRD ) -> INTEGER[\"23\"] | TWENTY_FOURTH | ( TWENTY ( DASH )? FOURTH ) -> INTEGER[\"24\"] | TWENTY_FIFTH | ( TWENTY ( DASH )? FIFTH ) -> INTEGER[\"25\"] | TWENTY_SIXTH | ( TWENTY ( DASH )? SIXTH ) -> INTEGER[\"26\"] | TWENTY_SEVENTH | ( TWENTY ( DASH )? SEVENTH ) -> INTEGER[\"27\"] | TWENTY_EIGHTH | ( TWENTY ( DASH )? EIGHTH ) -> INTEGER[\"28\"] | TWENTY_NINTH | ( TWENTY ( DASH )? NINTH ) -> INTEGER[\"29\"] | THIRTIETH -> INTEGER[\"30\"] | THIRTY_FIRST | ( THIRTY ( DASH )? FIRST ) -> INTEGER[\"31\"] );";
        }
    }
 

    public static final BitSet FOLLOW_date_in_datetime118 = new BitSet(new long[]{0x0000180000000002L,0x0000838000000000L});
    public static final BitSet FOLLOW_111_in_datetime120 = new BitSet(new long[]{0x0000180000000002L,0x0000038000000000L});
    public static final BitSet FOLLOW_time_in_datetime123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_in_datetime141 = new BitSet(new long[]{0xFFFE00701FFE0000L,0x1FF11FFFFFFFFFFFL});
    public static final BitSet FOLLOW_112_in_datetime143 = new BitSet(new long[]{0xFFFE00701FFE0000L,0x1FF11FFFFFFFFFFFL});
    public static final BitSet FOLLOW_date_in_datetime146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_in_datetime162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relative_date_in_date195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_explicit_date_in_date202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_explicit_time_in_time218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_today_or_tomorrow_in_relative_date231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relative_prefix_in_relative_date240 = new BitSet(new long[]{0x0000078FFFFE0000L});
    public static final BitSet FOLLOW_modifiable_target_in_relative_date242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_or_numeric_1_to_31_in_relative_date268 = new BitSet(new long[]{0x0000078FFFFE0000L});
    public static final BitSet FOLLOW_modifiable_target_in_relative_date270 = new BitSet(new long[]{0x0000000000000000L,0x6000000000000000L});
    public static final BitSet FOLLOW_relative_suffix_in_relative_date272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_1_to_12_in_explicit_date312 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_date_separator_in_explicit_date314 = new BitSet(new long[]{0xFFFE007000000000L,0x1FF006800000003FL});
    public static final BitSet FOLLOW_numeric_1_to_31_in_explicit_date316 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_date_separator_in_explicit_date319 = new BitSet(new long[]{0x0000000000000000L,0x00001FE000000000L});
    public static final BitSet FOLLOW_four_digits_in_explicit_date321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_four_digits_in_explicit_date351 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_date_separator_in_explicit_date353 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_numeric_1_to_12_in_explicit_date355 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_date_separator_in_explicit_date357 = new BitSet(new long[]{0xFFFE007000000000L,0x1FF006800000003FL});
    public static final BitSet FOLLOW_numeric_1_to_31_in_explicit_date359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_month_in_explicit_date386 = new BitSet(new long[]{0xFFFE00701FFE0000L,0x1FF11FFFFFFFFFFFL});
    public static final BitSet FOLLOW_day_of_month_in_explicit_date388 = new BitSet(new long[]{0x0000000000000002L,0x80021FE000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_113_in_explicit_date391 = new BitSet(new long[]{0x0000000000000000L,0x80021FE000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_year_in_explicit_date394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_day_of_month_in_explicit_date424 = new BitSet(new long[]{0x000000001FFE0000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_explicit_date426 = new BitSet(new long[]{0x000000001FFE0000L});
    public static final BitSet FOLLOW_month_in_explicit_date429 = new BitSet(new long[]{0x0000000000000002L,0x80021FE000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_113_in_explicit_date432 = new BitSet(new long[]{0x0000000000000000L,0x80021FE000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_year_in_explicit_date435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_0_to_23_in_explicit_time476 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_meridian_indicator_in_explicit_time478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_0_to_23_in_explicit_time510 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_explicit_time512 = new BitSet(new long[]{0x0000000000000000L,0x00000F8000000000L});
    public static final BitSet FOLLOW_numeric_0_to_59_in_explicit_time514 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_meridian_indicator_in_explicit_time516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_identifier_in_explicit_time544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JANUARY_in_month559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FEBRUARY_in_month572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MARCH_in_month584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APRIL_in_month599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAY_in_month614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JUNE_in_month631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JULY_in_month647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AUGUST_in_month663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEPTEMBER_in_month677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OCTOBER_in_month688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOVEMBER_in_month701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECEMBER_in_month713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_number_1_to_31_in_day_of_month734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_sequence_1_to_31_in_day_of_month748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_1_to_31_in_day_of_month761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUNDAY_in_day_of_week781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MONDAY_in_day_of_week795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TUESDAY_in_day_of_week809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEDNESDAY_in_day_of_week822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THURSDAY_in_day_of_week833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FRIDAY_in_day_of_week845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SATURDAY_in_day_of_week859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TODAY_in_today_or_tomorrow880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOMORROW_in_today_or_tomorrow898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YESTERDAY_in_today_or_tomorrow916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_today_or_tomorrow940 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_today_or_tomorrow943 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_TOMORROW_in_today_or_tomorrow945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_today_or_tomorrow963 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_today_or_tomorrow966 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_YESTERDAY_in_today_or_tomorrow968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DAY_in_date_span995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEEK_in_date_span1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MONTH_in_date_span1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YEAR_in_date_span1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MIDNIGHT_in_time_identifier1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOON_in_time_identifier1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_day_of_week_in_modifiable_target1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_span_in_modifiable_target1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_month_in_modifiable_target1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_relative_prefix1137 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_relative_prefix1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_relative_prefix1161 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_relative_prefix1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_relative_prefix1185 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_relative_prefix1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_relative_prefix1209 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_relative_prefix1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_relative_prefix1231 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_relative_prefix1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_relative_suffix1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_relative_suffix1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_year1314 = new BitSet(new long[]{0x0000000000000000L,0x00001F8000000000L});
    public static final BitSet FOLLOW_numeric_0_to_99_in_year1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_year1329 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_YEAR_in_year1331 = new BitSet(new long[]{0x0000000000000000L,0x00001FE000000000L});
    public static final BitSet FOLLOW_four_digits_in_year1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_date_separator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_0_to_23_in_hours1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_0_to_59_in_minutes1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AM_in_meridian_indicator1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PM_in_meridian_indicator1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_in_spelled_number_1_to_311444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWO_in_spelled_number_1_to_311462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THREE_in_spelled_number_1_to_311480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOUR_in_spelled_number_1_to_311496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIVE_in_spelled_number_1_to_311513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIX_in_spelled_number_1_to_311530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVEN_in_spelled_number_1_to_311548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHT_in_spelled_number_1_to_311564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINE_in_spelled_number_1_to_311580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEN_in_spelled_number_1_to_311597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEVEN_in_spelled_number_1_to_311615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWELVE_in_spelled_number_1_to_311630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_in_spelled_number_1_to_311645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOURTEEN_in_spelled_number_1_to_311658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIFTEEN_in_spelled_number_1_to_311671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTEEN_in_spelled_number_1_to_311685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVENTEEN_in_spelled_number_1_to_311699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHTEEN_in_spelled_number_1_to_311711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINETEEN_in_spelled_number_1_to_311724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_number_1_to_311737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_number_1_to_311752 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_number_1_to_311754 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ONE_in_spelled_number_1_to_311757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_number_1_to_311770 = new BitSet(new long[]{0x0004200000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_number_1_to_311772 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_TWO_in_spelled_number_1_to_311775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_number_1_to_311788 = new BitSet(new long[]{0x0008200000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_number_1_to_311790 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_THREE_in_spelled_number_1_to_311793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_number_1_to_311804 = new BitSet(new long[]{0x0010200000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_number_1_to_311806 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_FOUR_in_spelled_number_1_to_311809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_number_1_to_311821 = new BitSet(new long[]{0x0020200000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_number_1_to_311823 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_FIVE_in_spelled_number_1_to_311826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_number_1_to_311838 = new BitSet(new long[]{0x0040200000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_number_1_to_311840 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_SIX_in_spelled_number_1_to_311843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_number_1_to_311856 = new BitSet(new long[]{0x0080200000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_number_1_to_311858 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_SEVEN_in_spelled_number_1_to_311861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_number_1_to_311872 = new BitSet(new long[]{0x0100200000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_number_1_to_311874 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_EIGHT_in_spelled_number_1_to_311877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_number_1_to_311888 = new BitSet(new long[]{0x0200200000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_number_1_to_311890 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_NINE_in_spelled_number_1_to_311893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_in_spelled_number_1_to_311905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_in_spelled_number_1_to_311928 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_number_1_to_311930 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ONE_in_spelled_number_1_to_311933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_number_1_to_31_in_spelled_or_numeric_1_to_311955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_1_to_31_in_spelled_or_numeric_1_to_311961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIRST_in_spelled_sequence_1_to_311978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SECOND_in_spelled_sequence_1_to_311995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRD_in_spelled_sequence_1_to_312011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOURTH_in_spelled_sequence_1_to_312028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIFTH_in_spelled_sequence_1_to_312044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTH_in_spelled_sequence_1_to_312061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVENTH_in_spelled_sequence_1_to_312078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHTH_in_spelled_sequence_1_to_312093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINTH_in_spelled_sequence_1_to_312109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TENTH_in_spelled_sequence_1_to_312126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEVENTH_in_spelled_sequence_1_to_312143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWELFTH_in_spelled_sequence_1_to_312157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEENTH_in_spelled_sequence_1_to_312172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOURTEENTH_in_spelled_sequence_1_to_312184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIFTEENTH_in_spelled_sequence_1_to_312196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTEENTH_in_spelled_sequence_1_to_312209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVENTEENTH_in_spelled_sequence_1_to_312222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHTEENTH_in_spelled_sequence_1_to_312233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINETEENTH_in_spelled_sequence_1_to_312245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTIETH_in_spelled_sequence_1_to_312257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FIRST_in_spelled_sequence_1_to_312270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_312277 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312279 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_FIRST_in_spelled_sequence_1_to_312282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_SECOND_in_spelled_sequence_1_to_312296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_312302 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312304 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_SECOND_in_spelled_sequence_1_to_312307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_THIRD_in_spelled_sequence_1_to_312320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_312327 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312329 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_THIRD_in_spelled_sequence_1_to_312332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FOURTH_in_spelled_sequence_1_to_312346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_312352 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_FOURTH_in_spelled_sequence_1_to_312357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FIFTH_in_spelled_sequence_1_to_312370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_312377 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312379 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_FIFTH_in_spelled_sequence_1_to_312382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_SIXTH_in_spelled_sequence_1_to_312396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_312403 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312405 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_SIXTH_in_spelled_sequence_1_to_312408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_SEVENTH_in_spelled_sequence_1_to_312422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_312427 = new BitSet(new long[]{0x0000200000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_SEVENTH_in_spelled_sequence_1_to_312432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_EIGHTH_in_spelled_sequence_1_to_312444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_312450 = new BitSet(new long[]{0x0000200000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312452 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_EIGHTH_in_spelled_sequence_1_to_312455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_NINTH_in_spelled_sequence_1_to_312468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_312475 = new BitSet(new long[]{0x0000200000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312477 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_NINTH_in_spelled_sequence_1_to_312480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTIETH_in_spelled_sequence_1_to_312494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_FIRST_in_spelled_sequence_1_to_312535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_in_spelled_sequence_1_to_312542 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312544 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_FIRST_in_spelled_sequence_1_to_312547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_0_to_99_in_four_digits2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THREE_DIGIT_in_four_digits2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOUR_DIGIT_in_four_digits2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_TO_TWELVE_in_numeric_1_to_122609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWO_ZEROS_in_numeric_0_to_232630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_TO_TWELVE_in_numeric_0_to_232656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_numeric_0_to_232678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWO_ZEROS_in_numeric_0_to_592699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_TO_TWELVE_in_numeric_0_to_592726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_numeric_0_to_592749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FOUR_TO_THIRTY_ONE_in_numeric_0_to_592761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_TWO_TO_FIFTY_NINE_in_numeric_0_to_592772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWO_ZEROS_in_numeric_0_to_992794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_TO_TWELVE_in_numeric_0_to_992821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_numeric_0_to_992844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FOUR_TO_THIRTY_ONE_in_numeric_0_to_992856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_TWO_TO_FIFTY_NINE_in_numeric_0_to_992867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTY_TO_NINETY_NINE_in_numeric_0_to_992879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_TO_TWELVE_in_numeric_1_to_312905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_numeric_1_to_312928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FOUR_TO_THIRTY_ONE_in_numeric_1_to_312940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_in_synpred1_Date118 = new BitSet(new long[]{0x0000180000000002L,0x0000838000000000L});
    public static final BitSet FOLLOW_111_in_synpred1_Date120 = new BitSet(new long[]{0x0000180000000002L,0x0000038000000000L});
    public static final BitSet FOLLOW_time_in_synpred1_Date123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_in_synpred2_Date141 = new BitSet(new long[]{0xFFFE00701FFE0000L,0x1FF11FFFFFFFFFFFL});
    public static final BitSet FOLLOW_112_in_synpred2_Date143 = new BitSet(new long[]{0xFFFE00701FFE0000L,0x1FF11FFFFFFFFFFFL});
    public static final BitSet FOLLOW_date_in_synpred2_Date146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_1_to_12_in_synpred3_Date312 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_date_separator_in_synpred3_Date314 = new BitSet(new long[]{0xFFFE007000000000L,0x1FF006800000003FL});
    public static final BitSet FOLLOW_numeric_1_to_31_in_synpred3_Date316 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_date_separator_in_synpred3_Date319 = new BitSet(new long[]{0x0000000000000000L,0x00001FE000000000L});
    public static final BitSet FOLLOW_four_digits_in_synpred3_Date321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_four_digits_in_synpred4_Date351 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_date_separator_in_synpred4_Date353 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_numeric_1_to_12_in_synpred4_Date355 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_date_separator_in_synpred4_Date357 = new BitSet(new long[]{0xFFFE007000000000L,0x1FF006800000003FL});
    public static final BitSet FOLLOW_numeric_1_to_31_in_synpred4_Date359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_synpred6_Date1314 = new BitSet(new long[]{0x0000000000000000L,0x00001F8000000000L});
    public static final BitSet FOLLOW_numeric_0_to_99_in_synpred6_Date1317 = new BitSet(new long[]{0x0000000000000002L});

}