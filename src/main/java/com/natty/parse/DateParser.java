// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g 2010-02-03 23:18:08
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INT", "HOURS", "MINUTES", "AM_PM", "SPAN", "MONTH_OF", "DAY_OF_WEEK", "DAY_OF_MONTH", "YEAR_OF", "SEEK_DIR", "SEEK_TYPE", "EXPLICIT_TIME", "EXPLICIT_DATE", "RELATIVE_DATE", "DATE_TIME", "COMMA", "ON", "OF", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER", "IN", "THE", "YEAR", "SINGLE_QUOTE", "DASH", "SLASH", "COLON", "MIDNIGHT", "NOON", "AM", "PM", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN", "TWENTY", "THIRTY", "FIRST", "SECOND", "THIRD", "FOURTH", "FIFTH", "SIXTH", "SEVENTH", "EIGHTH", "NINTH", "TENTH", "ELEVENTH", "TWELFTH", "THIRTEENTH", "FOURTEENTH", "FIFTEENTH", "SIXTEENTH", "SEVENTEENTH", "EIGHTEENTH", "NINETEENTH", "TWENTIETH", "TWENTY_FIRST", "TWENTY_SECOND", "TWENTY_THIRD", "TWENTY_FOURTH", "TWENTY_FIFTH", "TWENTY_SIXTH", "TWENTY_SEVENTH", "TWENTY_EIGHTH", "TWENTY_NINTH", "THIRTIETH", "THIRTY_FIRST", "THREE_DIGIT", "FOUR_DIGIT", "PREFIXED_ONE_TO_NINE", "ONE_TO_NINE", "TEN_TO_TWELVE", "TWO_ZEROS", "ZERO", "THIRTEEN_TO_TWENTY_THREE", "TWENTY_FOUR_TO_THIRTY_ONE", "THIRTY_TWO_TO_FIFTY_NINE", "SIXTY_TO_NINETY_NINE", "AT", "THIS", "AFTER", "BEFORE", "LAST", "PAST", "NEXT", "COMING", "UPCOMING", "FROM_NOW", "AGO", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "TODAY", "TOMORROW", "YESTERDAY", "DAY", "WEEK", "MONTH", "DIGIT", "WHITE_SPACE"
    };
    public static final int NINETEEN=63;
    public static final int WEEK=130;
    public static final int SEPTEMBER=30;
    public static final int THIRTEEN_TO_TWENTY_THREE=104;
    public static final int WEDNESDAY=122;
    public static final int TWENTY_EIGHTH=93;
    public static final int TWENTY=64;
    public static final int FROM_NOW=117;
    public static final int JULY=28;
    public static final int APRIL=25;
    public static final int COMING=115;
    public static final int NINETEENTH=84;
    public static final int OCTOBER=31;
    public static final int DAY=129;
    public static final int ONE=45;
    public static final int MIDNIGHT=41;
    public static final int MARCH=24;
    public static final int EOF=-1;
    public static final int MONTH=131;
    public static final int PAST=113;
    public static final int SEVENTEEN=61;
    public static final int DATE_TIME=18;
    public static final int AM_PM=7;
    public static final int SIXTY_TO_NINETY_NINE=107;
    public static final int TWENTY_SEVENTH=92;
    public static final int TWENTY_FIFTH=90;
    public static final int EIGHTEENTH=83;
    public static final int SPAN=8;
    public static final int SEEK_DIR=13;
    public static final int THIS=109;
    public static final int THIRTIETH=95;
    public static final int NOON=42;
    public static final int LAST=112;
    public static final int EIGHTEEN=62;
    public static final int TOMORROW=127;
    public static final int TWENTY_FOUR_TO_THIRTY_ONE=105;
    public static final int RELATIVE_DATE=17;
    public static final int ONE_TO_NINE=100;
    public static final int FOUR_DIGIT=98;
    public static final int TODAY=126;
    public static final int FOURTH=69;
    public static final int FIFTEENTH=80;
    public static final int SECOND=67;
    public static final int NOVEMBER=32;
    public static final int SATURDAY=125;
    public static final int FOUR=48;
    public static final int SEVENTH=72;
    public static final int TEN=54;
    public static final int FEBRUARY=23;
    public static final int ON=20;
    public static final int MONDAY=120;
    public static final int SUNDAY=119;
    public static final int DAY_OF_WEEK=10;
    public static final int SEVEN=51;
    public static final int ELEVEN=55;
    public static final int THIRTEEN=57;
    public static final int JUNE=27;
    public static final int INT=4;
    public static final int EXPLICIT_DATE=16;
    public static final int OF=21;
    public static final int UPCOMING=116;
    public static final int SIX=50;
    public static final int FIFTH=70;
    public static final int TWENTY_NINTH=94;
    public static final int THURSDAY=123;
    public static final int DECEMBER=33;
    public static final int AUGUST=29;
    public static final int PM=44;
    public static final int EXPLICIT_TIME=15;
    public static final int TUESDAY=121;
    public static final int THIRTY_TWO_TO_FIFTY_NINE=106;
    public static final int EIGHTH=73;
    public static final int THIRD=68;
    public static final int YEAR=36;
    public static final int THE=35;
    public static final int MAY=26;
    public static final int TENTH=75;
    public static final int TWENTY_FOURTH=89;
    public static final int THREE_DIGIT=97;
    public static final int MONTH_OF=9;
    public static final int WHITE_SPACE=133;
    public static final int SEEK_TYPE=14;
    public static final int FRIDAY=124;
    public static final int ZERO=103;
    public static final int PREFIXED_ONE_TO_NINE=99;
    public static final int EIGHT=52;
    public static final int AT=108;
    public static final int TWENTY_SIXTH=91;
    public static final int SINGLE_QUOTE=37;
    public static final int SLASH=39;
    public static final int IN=34;
    public static final int NINTH=74;
    public static final int COMMA=19;
    public static final int FIVE=49;
    public static final int THIRTY=65;
    public static final int TWENTIETH=85;
    public static final int TWENTY_SECOND=87;
    public static final int NEXT=114;
    public static final int TWO_ZEROS=102;
    public static final int DIGIT=132;
    public static final int AM=43;
    public static final int DASH=38;
    public static final int FOURTEENTH=79;
    public static final int SIXTEEN=60;
    public static final int YEAR_OF=12;
    public static final int TEN_TO_TWELVE=101;
    public static final int TWELVE=56;
    public static final int AGO=118;
    public static final int ELEVENTH=76;
    public static final int BEFORE=111;
    public static final int AFTER=110;
    public static final int TWO=46;
    public static final int SIXTEENTH=81;
    public static final int JANUARY=22;
    public static final int THIRTEENTH=78;
    public static final int COLON=40;
    public static final int MINUTES=6;
    public static final int DAY_OF_MONTH=11;
    public static final int FIFTEEN=59;
    public static final int TWELFTH=77;
    public static final int NINE=53;
    public static final int SIXTH=71;
    public static final int THREE=47;
    public static final int TWENTY_FIRST=86;
    public static final int FOURTEEN=58;
    public static final int TWENTY_THIRD=88;
    public static final int YESTERDAY=128;
    public static final int HOURS=5;
    public static final int SEVENTEENTH=82;
    public static final int THIRTY_FIRST=96;
    public static final int FIRST=66;

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:28:1: date_time options {backtrack=true; } : ( ( ( ( date ( COMMA | AT )? time )=> date time ) | time ( COMMA | ON )? date ) -> ^( DATE_TIME date time ) | date -> ^( DATE_TIME date ) | time -> ^( DATE_TIME time ) );
    public final DateParser.date_time_return date_time() throws RecognitionException {
        DateParser.date_time_return retval = new DateParser.date_time_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA4=null;
        Token ON5=null;
        DateParser.date_return date1 = null;

        DateParser.time_return time2 = null;

        DateParser.time_return time3 = null;

        DateParser.date_return date6 = null;

        DateParser.date_return date7 = null;

        DateParser.time_return time8 = null;


        Object COMMA4_tree=null;
        Object ON5_tree=null;
        RewriteRuleTokenStream stream_ON=new RewriteRuleTokenStream(adaptor,"token ON");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_time=new RewriteRuleSubtreeStream(adaptor,"rule time");
        RewriteRuleSubtreeStream stream_date=new RewriteRuleSubtreeStream(adaptor,"rule date");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:3: ( ( ( ( date ( COMMA | AT )? time )=> date time ) | time ( COMMA | ON )? date ) -> ^( DATE_TIME date time ) | date -> ^( DATE_TIME date ) | time -> ^( DATE_TIME time ) )
            int alt3=3;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:5: ( ( ( date ( COMMA | AT )? time )=> date time ) | time ( COMMA | ON )? date )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:5: ( ( ( date ( COMMA | AT )? time )=> date time ) | time ( COMMA | ON )? date )
                    int alt2=2;
                    alt2 = dfa2.predict(input);
                    switch (alt2) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:6: ( ( date ( COMMA | AT )? time )=> date time )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:6: ( ( date ( COMMA | AT )? time )=> date time )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:7: ( date ( COMMA | AT )? time )=> date time
                            {
                            pushFollow(FOLLOW_date_in_date_time152);
                            date1=date();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_date.add(date1.getTree());
                            pushFollow(FOLLOW_time_in_date_time154);
                            time2=time();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_time.add(time2.getTree());

                            }


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:48: time ( COMMA | ON )? date
                            {
                            pushFollow(FOLLOW_time_in_date_time159);
                            time3=time();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_time.add(time3.getTree());
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:53: ( COMMA | ON )?
                            int alt1=3;
                            int LA1_0 = input.LA(1);

                            if ( (LA1_0==COMMA) ) {
                                alt1=1;
                            }
                            else if ( (LA1_0==ON) ) {
                                alt1=2;
                            }
                            switch (alt1) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:54: COMMA
                                    {
                                    COMMA4=(Token)match(input,COMMA,FOLLOW_COMMA_in_date_time162); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA4);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:62: ON
                                    {
                                    ON5=(Token)match(input,ON,FOLLOW_ON_in_date_time166); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_ON.add(ON5);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_date_in_date_time170);
                            date6=date();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_date.add(date6.getTree());

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
                    // 31:5: -> ^( DATE_TIME date time )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:31:8: ^( DATE_TIME date time )
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
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:33:5: date
                    {
                    pushFollow(FOLLOW_date_in_date_time196);
                    date7=date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_date.add(date7.getTree());


                    // AST REWRITE
                    // elements: date
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 34:5: -> ^( DATE_TIME date )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:34:8: ^( DATE_TIME date )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DATE_TIME, "DATE_TIME"), root_1);

                        adaptor.addChild(root_1, stream_date.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:36:5: time
                    {
                    pushFollow(FOLLOW_time_in_date_time217);
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
                    // 37:5: -> ^( DATE_TIME time )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:37:8: ^( DATE_TIME time )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DATE_TIME, "DATE_TIME"), root_1);

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
    // $ANTLR end "date_time"

    public static class date_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "date"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:40:1: date : ( formal_date | month_and_day_date );
    public final DateParser.date_return date() throws RecognitionException {
        DateParser.date_return retval = new DateParser.date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.formal_date_return formal_date9 = null;

        DateParser.month_and_day_date_return month_and_day_date10 = null;



        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:41:3: ( formal_date | month_and_day_date )
            int alt4=2;
            switch ( input.LA(1) ) {
            case FOUR_DIGIT:
                {
                alt4=1;
                }
                break;
            case PREFIXED_ONE_TO_NINE:
                {
                int LA4_2 = input.LA(2);

                if ( ((LA4_2>=OF && LA4_2<=DECEMBER)) ) {
                    alt4=2;
                }
                else if ( ((LA4_2>=DASH && LA4_2<=SLASH)) ) {
                    alt4=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case ONE_TO_NINE:
                {
                int LA4_3 = input.LA(2);

                if ( ((LA4_3>=OF && LA4_3<=DECEMBER)) ) {
                    alt4=2;
                }
                else if ( ((LA4_3>=DASH && LA4_3<=SLASH)) ) {
                    alt4=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;
                }
                }
                break;
            case TEN_TO_TWELVE:
                {
                int LA4_4 = input.LA(2);

                if ( ((LA4_4>=DASH && LA4_4<=SLASH)) ) {
                    alt4=1;
                }
                else if ( ((LA4_4>=OF && LA4_4<=DECEMBER)) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 4, input);

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
            case THIRTEEN_TO_TWENTY_THREE:
            case TWENTY_FOUR_TO_THIRTY_ONE:
                {
                alt4=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:41:5: formal_date
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_formal_date_in_date244);
                    formal_date9=formal_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formal_date9.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:42:5: month_and_day_date
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_month_and_day_date_in_date250);
                    month_and_day_date10=month_and_day_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, month_and_day_date10.getTree());

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

    public static class formal_date_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formal_date"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:45:1: formal_date : ( int_4_digits date_separator int_1_to_12 date_separator int_1_to_31 -> ^( EXPLICIT_DATE ^( MONTH_OF int_1_to_12 ) ^( DAY_OF_MONTH int_1_to_31 ) ^( YEAR_OF int_4_digits ) ) | int_1_to_12 date_separator int_1_to_31 ( date_separator int_up_to_4_digits )? -> ^( EXPLICIT_DATE ^( MONTH_OF int_1_to_31 ) ^( DAY_OF_MONTH int_1_to_31 ) ^( YEAR_OF ( int_up_to_4_digits )? ) ) );
    public final DateParser.formal_date_return formal_date() throws RecognitionException {
        DateParser.formal_date_return retval = new DateParser.formal_date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_4_digits_return int_4_digits11 = null;

        DateParser.date_separator_return date_separator12 = null;

        DateParser.int_1_to_12_return int_1_to_1213 = null;

        DateParser.date_separator_return date_separator14 = null;

        DateParser.int_1_to_31_return int_1_to_3115 = null;

        DateParser.int_1_to_12_return int_1_to_1216 = null;

        DateParser.date_separator_return date_separator17 = null;

        DateParser.int_1_to_31_return int_1_to_3118 = null;

        DateParser.date_separator_return date_separator19 = null;

        DateParser.int_up_to_4_digits_return int_up_to_4_digits20 = null;


        RewriteRuleSubtreeStream stream_int_1_to_31=new RewriteRuleSubtreeStream(adaptor,"rule int_1_to_31");
        RewriteRuleSubtreeStream stream_int_up_to_4_digits=new RewriteRuleSubtreeStream(adaptor,"rule int_up_to_4_digits");
        RewriteRuleSubtreeStream stream_int_4_digits=new RewriteRuleSubtreeStream(adaptor,"rule int_4_digits");
        RewriteRuleSubtreeStream stream_date_separator=new RewriteRuleSubtreeStream(adaptor,"rule date_separator");
        RewriteRuleSubtreeStream stream_int_1_to_12=new RewriteRuleSubtreeStream(adaptor,"rule int_1_to_12");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:47:3: ( int_4_digits date_separator int_1_to_12 date_separator int_1_to_31 -> ^( EXPLICIT_DATE ^( MONTH_OF int_1_to_12 ) ^( DAY_OF_MONTH int_1_to_31 ) ^( YEAR_OF int_4_digits ) ) | int_1_to_12 date_separator int_1_to_31 ( date_separator int_up_to_4_digits )? -> ^( EXPLICIT_DATE ^( MONTH_OF int_1_to_31 ) ^( DAY_OF_MONTH int_1_to_31 ) ^( YEAR_OF ( int_up_to_4_digits )? ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==FOUR_DIGIT) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=PREFIXED_ONE_TO_NINE && LA6_0<=TEN_TO_TWELVE)) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:47:5: int_4_digits date_separator int_1_to_12 date_separator int_1_to_31
                    {
                    pushFollow(FOLLOW_int_4_digits_in_formal_date268);
                    int_4_digits11=int_4_digits();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_4_digits.add(int_4_digits11.getTree());
                    pushFollow(FOLLOW_date_separator_in_formal_date270);
                    date_separator12=date_separator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_date_separator.add(date_separator12.getTree());
                    pushFollow(FOLLOW_int_1_to_12_in_formal_date272);
                    int_1_to_1213=int_1_to_12();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_1_to_12.add(int_1_to_1213.getTree());
                    pushFollow(FOLLOW_date_separator_in_formal_date274);
                    date_separator14=date_separator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_date_separator.add(date_separator14.getTree());
                    pushFollow(FOLLOW_int_1_to_31_in_formal_date276);
                    int_1_to_3115=int_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_1_to_31.add(int_1_to_3115.getTree());


                    // AST REWRITE
                    // elements: int_1_to_12, int_1_to_31, int_4_digits
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 48:5: -> ^( EXPLICIT_DATE ^( MONTH_OF int_1_to_12 ) ^( DAY_OF_MONTH int_1_to_31 ) ^( YEAR_OF int_4_digits ) )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:48:8: ^( EXPLICIT_DATE ^( MONTH_OF int_1_to_12 ) ^( DAY_OF_MONTH int_1_to_31 ) ^( YEAR_OF int_4_digits ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_1);

                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:48:24: ^( MONTH_OF int_1_to_12 )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF, "MONTH_OF"), root_2);

                        adaptor.addChild(root_2, stream_int_1_to_12.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:48:48: ^( DAY_OF_MONTH int_1_to_31 )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_MONTH, "DAY_OF_MONTH"), root_2);

                        adaptor.addChild(root_2, stream_int_1_to_31.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:48:76: ^( YEAR_OF int_4_digits )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:51:5: int_1_to_12 date_separator int_1_to_31 ( date_separator int_up_to_4_digits )?
                    {
                    pushFollow(FOLLOW_int_1_to_12_in_formal_date315);
                    int_1_to_1216=int_1_to_12();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_1_to_12.add(int_1_to_1216.getTree());
                    pushFollow(FOLLOW_date_separator_in_formal_date317);
                    date_separator17=date_separator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_date_separator.add(date_separator17.getTree());
                    pushFollow(FOLLOW_int_1_to_31_in_formal_date319);
                    int_1_to_3118=int_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_1_to_31.add(int_1_to_3118.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:51:44: ( date_separator int_up_to_4_digits )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0>=DASH && LA5_0<=SLASH)) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:51:45: date_separator int_up_to_4_digits
                            {
                            pushFollow(FOLLOW_date_separator_in_formal_date322);
                            date_separator19=date_separator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_date_separator.add(date_separator19.getTree());
                            pushFollow(FOLLOW_int_up_to_4_digits_in_formal_date324);
                            int_up_to_4_digits20=int_up_to_4_digits();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_int_up_to_4_digits.add(int_up_to_4_digits20.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: int_1_to_31, int_up_to_4_digits, int_1_to_31
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 52:5: -> ^( EXPLICIT_DATE ^( MONTH_OF int_1_to_31 ) ^( DAY_OF_MONTH int_1_to_31 ) ^( YEAR_OF ( int_up_to_4_digits )? ) )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:52:8: ^( EXPLICIT_DATE ^( MONTH_OF int_1_to_31 ) ^( DAY_OF_MONTH int_1_to_31 ) ^( YEAR_OF ( int_up_to_4_digits )? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_1);

                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:52:24: ^( MONTH_OF int_1_to_31 )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF, "MONTH_OF"), root_2);

                        adaptor.addChild(root_2, stream_int_1_to_31.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:52:48: ^( DAY_OF_MONTH int_1_to_31 )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_MONTH, "DAY_OF_MONTH"), root_2);

                        adaptor.addChild(root_2, stream_int_1_to_31.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:52:76: ^( YEAR_OF ( int_up_to_4_digits )? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(YEAR_OF, "YEAR_OF"), root_2);

                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:52:86: ( int_up_to_4_digits )?
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
    // $ANTLR end "formal_date"

    public static class month_and_day_date_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "month_and_day_date"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:56:1: month_and_day_date : ( day_of_month ( OF )? month ( year )? | month day_of_month ( year )? ) -> ^( EXPLICIT_DATE month day_of_month ( year )? ) ;
    public final DateParser.month_and_day_date_return month_and_day_date() throws RecognitionException {
        DateParser.month_and_day_date_return retval = new DateParser.month_and_day_date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OF22=null;
        DateParser.day_of_month_return day_of_month21 = null;

        DateParser.month_return month23 = null;

        DateParser.year_return year24 = null;

        DateParser.month_return month25 = null;

        DateParser.day_of_month_return day_of_month26 = null;

        DateParser.year_return year27 = null;


        Object OF22_tree=null;
        RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
        RewriteRuleSubtreeStream stream_month=new RewriteRuleSubtreeStream(adaptor,"rule month");
        RewriteRuleSubtreeStream stream_year=new RewriteRuleSubtreeStream(adaptor,"rule year");
        RewriteRuleSubtreeStream stream_day_of_month=new RewriteRuleSubtreeStream(adaptor,"rule day_of_month");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:57:3: ( ( day_of_month ( OF )? month ( year )? | month day_of_month ( year )? ) -> ^( EXPLICIT_DATE month day_of_month ( year )? ) )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:57:5: ( day_of_month ( OF )? month ( year )? | month day_of_month ( year )? )
            {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:57:5: ( day_of_month ( OF )? month ( year )? | month day_of_month ( year )? )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=ONE && LA10_0<=THIRTY_FIRST)||(LA10_0>=PREFIXED_ONE_TO_NINE && LA10_0<=TEN_TO_TWELVE)||(LA10_0>=THIRTEEN_TO_TWENTY_THREE && LA10_0<=TWENTY_FOUR_TO_THIRTY_ONE)) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=JANUARY && LA10_0<=DECEMBER)) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:57:6: day_of_month ( OF )? month ( year )?
                    {
                    pushFollow(FOLLOW_day_of_month_in_month_and_day_date370);
                    day_of_month21=day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_day_of_month.add(day_of_month21.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:57:19: ( OF )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==OF) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:57:19: OF
                            {
                            OF22=(Token)match(input,OF,FOLLOW_OF_in_month_and_day_date372); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OF.add(OF22);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_month_in_month_and_day_date375);
                    month23=month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_month.add(month23.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:57:29: ( year )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==COMMA) ) {
                        int LA8_1 = input.LA(2);

                        if ( (LA8_1==IN||LA8_1==SINGLE_QUOTE||(LA8_1>=THREE_DIGIT && LA8_1<=FOUR_DIGIT)) ) {
                            alt8=1;
                        }
                    }
                    else if ( (LA8_0==IN||LA8_0==SINGLE_QUOTE||(LA8_0>=THREE_DIGIT && LA8_0<=FOUR_DIGIT)) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:57:29: year
                            {
                            pushFollow(FOLLOW_year_in_month_and_day_date377);
                            year24=year();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_year.add(year24.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:57:37: month day_of_month ( year )?
                    {
                    pushFollow(FOLLOW_month_in_month_and_day_date382);
                    month25=month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_month.add(month25.getTree());
                    pushFollow(FOLLOW_day_of_month_in_month_and_day_date384);
                    day_of_month26=day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_day_of_month.add(day_of_month26.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:57:56: ( year )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==COMMA) ) {
                        int LA9_1 = input.LA(2);

                        if ( (LA9_1==IN||LA9_1==SINGLE_QUOTE||(LA9_1>=THREE_DIGIT && LA9_1<=FOUR_DIGIT)) ) {
                            alt9=1;
                        }
                    }
                    else if ( (LA9_0==IN||LA9_0==SINGLE_QUOTE||(LA9_0>=THREE_DIGIT && LA9_0<=FOUR_DIGIT)) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:57:56: year
                            {
                            pushFollow(FOLLOW_year_in_month_and_day_date386);
                            year27=year();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_year.add(year27.getTree());

                            }
                            break;

                    }


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
            // 58:5: -> ^( EXPLICIT_DATE month day_of_month ( year )? )
            {
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:58:8: ^( EXPLICIT_DATE month day_of_month ( year )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_1);

                adaptor.addChild(root_1, stream_month.nextTree());
                adaptor.addChild(root_1, stream_day_of_month.nextTree());
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:58:43: ( year )?
                if ( stream_year.hasNext() ) {
                    adaptor.addChild(root_1, stream_year.nextTree());

                }
                stream_year.reset();

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
    // $ANTLR end "month_and_day_date"

    public static class month_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "month"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:61:1: month : ( JANUARY -> ^( MONTH_OF INT[\"1\"] ) | FEBRUARY -> ^( MONTH_OF INT[\"2\"] ) | MARCH -> ^( MONTH_OF INT[\"3\"] ) | APRIL -> ^( MONTH_OF INT[\"4\"] ) | MAY -> ^( MONTH_OF INT[\"5\"] ) | JUNE -> ^( MONTH_OF INT[\"6\"] ) | JULY -> ^( MONTH_OF INT[\"7\"] ) | AUGUST -> ^( MONTH_OF INT[\"8\"] ) | SEPTEMBER -> ^( MONTH_OF INT[\"9\"] ) | OCTOBER -> ^( MONTH_OF INT[\"10\"] ) | NOVEMBER -> ^( MONTH_OF INT[\"11\"] ) | DECEMBER -> ^( MONTH_OF INT[\"12\"] ) );
    public final DateParser.month_return month() throws RecognitionException {
        DateParser.month_return retval = new DateParser.month_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token JANUARY28=null;
        Token FEBRUARY29=null;
        Token MARCH30=null;
        Token APRIL31=null;
        Token MAY32=null;
        Token JUNE33=null;
        Token JULY34=null;
        Token AUGUST35=null;
        Token SEPTEMBER36=null;
        Token OCTOBER37=null;
        Token NOVEMBER38=null;
        Token DECEMBER39=null;

        Object JANUARY28_tree=null;
        Object FEBRUARY29_tree=null;
        Object MARCH30_tree=null;
        Object APRIL31_tree=null;
        Object MAY32_tree=null;
        Object JUNE33_tree=null;
        Object JULY34_tree=null;
        Object AUGUST35_tree=null;
        Object SEPTEMBER36_tree=null;
        Object OCTOBER37_tree=null;
        Object NOVEMBER38_tree=null;
        Object DECEMBER39_tree=null;
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:62:3: ( JANUARY -> ^( MONTH_OF INT[\"1\"] ) | FEBRUARY -> ^( MONTH_OF INT[\"2\"] ) | MARCH -> ^( MONTH_OF INT[\"3\"] ) | APRIL -> ^( MONTH_OF INT[\"4\"] ) | MAY -> ^( MONTH_OF INT[\"5\"] ) | JUNE -> ^( MONTH_OF INT[\"6\"] ) | JULY -> ^( MONTH_OF INT[\"7\"] ) | AUGUST -> ^( MONTH_OF INT[\"8\"] ) | SEPTEMBER -> ^( MONTH_OF INT[\"9\"] ) | OCTOBER -> ^( MONTH_OF INT[\"10\"] ) | NOVEMBER -> ^( MONTH_OF INT[\"11\"] ) | DECEMBER -> ^( MONTH_OF INT[\"12\"] ) )
            int alt11=12;
            switch ( input.LA(1) ) {
            case JANUARY:
                {
                alt11=1;
                }
                break;
            case FEBRUARY:
                {
                alt11=2;
                }
                break;
            case MARCH:
                {
                alt11=3;
                }
                break;
            case APRIL:
                {
                alt11=4;
                }
                break;
            case MAY:
                {
                alt11=5;
                }
                break;
            case JUNE:
                {
                alt11=6;
                }
                break;
            case JULY:
                {
                alt11=7;
                }
                break;
            case AUGUST:
                {
                alt11=8;
                }
                break;
            case SEPTEMBER:
                {
                alt11=9;
                }
                break;
            case OCTOBER:
                {
                alt11=10;
                }
                break;
            case NOVEMBER:
                {
                alt11=11;
                }
                break;
            case DECEMBER:
                {
                alt11=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:62:5: JANUARY
                    {
                    JANUARY28=(Token)match(input,JANUARY,FOLLOW_JANUARY_in_month420); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_JANUARY.add(JANUARY28);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 62:15: -> ^( MONTH_OF INT[\"1\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:62:18: ^( MONTH_OF INT[\"1\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:63:5: FEBRUARY
                    {
                    FEBRUARY29=(Token)match(input,FEBRUARY,FOLLOW_FEBRUARY_in_month437); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FEBRUARY.add(FEBRUARY29);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 63:15: -> ^( MONTH_OF INT[\"2\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:63:18: ^( MONTH_OF INT[\"2\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:64:5: MARCH
                    {
                    MARCH30=(Token)match(input,MARCH,FOLLOW_MARCH_in_month453); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MARCH.add(MARCH30);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 64:15: -> ^( MONTH_OF INT[\"3\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:64:18: ^( MONTH_OF INT[\"3\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:65:5: APRIL
                    {
                    APRIL31=(Token)match(input,APRIL,FOLLOW_APRIL_in_month472); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_APRIL.add(APRIL31);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 65:15: -> ^( MONTH_OF INT[\"4\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:65:18: ^( MONTH_OF INT[\"4\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:66:5: MAY
                    {
                    MAY32=(Token)match(input,MAY,FOLLOW_MAY_in_month491); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MAY.add(MAY32);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 66:15: -> ^( MONTH_OF INT[\"5\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:66:18: ^( MONTH_OF INT[\"5\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:67:5: JUNE
                    {
                    JUNE33=(Token)match(input,JUNE,FOLLOW_JUNE_in_month512); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_JUNE.add(JUNE33);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 67:15: -> ^( MONTH_OF INT[\"6\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:67:18: ^( MONTH_OF INT[\"6\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:68:5: JULY
                    {
                    JULY34=(Token)match(input,JULY,FOLLOW_JULY_in_month532); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_JULY.add(JULY34);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 68:15: -> ^( MONTH_OF INT[\"7\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:68:18: ^( MONTH_OF INT[\"7\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:69:5: AUGUST
                    {
                    AUGUST35=(Token)match(input,AUGUST,FOLLOW_AUGUST_in_month552); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AUGUST.add(AUGUST35);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 69:15: -> ^( MONTH_OF INT[\"8\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:69:18: ^( MONTH_OF INT[\"8\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:70:5: SEPTEMBER
                    {
                    SEPTEMBER36=(Token)match(input,SEPTEMBER,FOLLOW_SEPTEMBER_in_month570); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEPTEMBER.add(SEPTEMBER36);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 70:15: -> ^( MONTH_OF INT[\"9\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:70:18: ^( MONTH_OF INT[\"9\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:71:5: OCTOBER
                    {
                    OCTOBER37=(Token)match(input,OCTOBER,FOLLOW_OCTOBER_in_month585); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OCTOBER.add(OCTOBER37);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 71:15: -> ^( MONTH_OF INT[\"10\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:71:18: ^( MONTH_OF INT[\"10\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:72:5: NOVEMBER
                    {
                    NOVEMBER38=(Token)match(input,NOVEMBER,FOLLOW_NOVEMBER_in_month602); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOVEMBER.add(NOVEMBER38);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 72:15: -> ^( MONTH_OF INT[\"11\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:72:18: ^( MONTH_OF INT[\"11\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:73:5: DECEMBER
                    {
                    DECEMBER39=(Token)match(input,DECEMBER,FOLLOW_DECEMBER_in_month618); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DECEMBER.add(DECEMBER39);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 73:15: -> ^( MONTH_OF INT[\"12\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:73:18: ^( MONTH_OF INT[\"12\"] )
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:76:1: day_of_month : ( spelled_or_int_1_to_31 -> ^( DAY_OF_MONTH spelled_or_int_1_to_31 ) | spelled_sequence_1_to_31 -> ^( DAY_OF_MONTH spelled_sequence_1_to_31 ) );
    public final DateParser.day_of_month_return day_of_month() throws RecognitionException {
        DateParser.day_of_month_return retval = new DateParser.day_of_month_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.spelled_or_int_1_to_31_return spelled_or_int_1_to_3140 = null;

        DateParser.spelled_sequence_1_to_31_return spelled_sequence_1_to_3141 = null;


        RewriteRuleSubtreeStream stream_spelled_or_int_1_to_31=new RewriteRuleSubtreeStream(adaptor,"rule spelled_or_int_1_to_31");
        RewriteRuleSubtreeStream stream_spelled_sequence_1_to_31=new RewriteRuleSubtreeStream(adaptor,"rule spelled_sequence_1_to_31");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:77:3: ( spelled_or_int_1_to_31 -> ^( DAY_OF_MONTH spelled_or_int_1_to_31 ) | spelled_sequence_1_to_31 -> ^( DAY_OF_MONTH spelled_sequence_1_to_31 ) )
            int alt12=2;
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
            case ONE_TO_NINE:
            case TEN_TO_TWELVE:
            case THIRTEEN_TO_TWENTY_THREE:
            case TWENTY_FOUR_TO_THIRTY_ONE:
                {
                alt12=1;
                }
                break;
            case TWENTY:
                {
                switch ( input.LA(2) ) {
                case DASH:
                    {
                    int LA12_5 = input.LA(3);

                    if ( ((LA12_5>=ONE && LA12_5<=NINE)) ) {
                        alt12=1;
                    }
                    else if ( ((LA12_5>=FIRST && LA12_5<=NINTH)) ) {
                        alt12=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 5, input);

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
                    alt12=2;
                    }
                    break;
                case EOF:
                case COMMA:
                case OF:
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
                case IN:
                case SINGLE_QUOTE:
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
                case PREFIXED_ONE_TO_NINE:
                case ONE_TO_NINE:
                case TEN_TO_TWELVE:
                case TWO_ZEROS:
                case ZERO:
                case THIRTEEN_TO_TWENTY_THREE:
                case AT:
                    {
                    alt12=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;
                }

                }
                break;
            case THIRTY:
                {
                switch ( input.LA(2) ) {
                case EOF:
                case COMMA:
                case OF:
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
                case IN:
                case SINGLE_QUOTE:
                case MIDNIGHT:
                case NOON:
                case ONE:
                case THREE_DIGIT:
                case FOUR_DIGIT:
                case PREFIXED_ONE_TO_NINE:
                case ONE_TO_NINE:
                case TEN_TO_TWELVE:
                case TWO_ZEROS:
                case ZERO:
                case THIRTEEN_TO_TWENTY_THREE:
                case AT:
                    {
                    alt12=1;
                    }
                    break;
                case DASH:
                    {
                    int LA12_6 = input.LA(3);

                    if ( (LA12_6==FIRST) ) {
                        alt12=2;
                    }
                    else if ( (LA12_6==ONE) ) {
                        alt12=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case FIRST:
                    {
                    alt12=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 3, input);

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
                alt12=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:77:5: spelled_or_int_1_to_31
                    {
                    pushFollow(FOLLOW_spelled_or_int_1_to_31_in_day_of_month643);
                    spelled_or_int_1_to_3140=spelled_or_int_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_or_int_1_to_31.add(spelled_or_int_1_to_3140.getTree());


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
                    // 77:30: -> ^( DAY_OF_MONTH spelled_or_int_1_to_31 )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:77:33: ^( DAY_OF_MONTH spelled_or_int_1_to_31 )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:78:5: spelled_sequence_1_to_31
                    {
                    pushFollow(FOLLOW_spelled_sequence_1_to_31_in_day_of_month659);
                    spelled_sequence_1_to_3141=spelled_sequence_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_sequence_1_to_31.add(spelled_sequence_1_to_3141.getTree());


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
                    // 78:30: -> ^( DAY_OF_MONTH spelled_sequence_1_to_31 )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:78:33: ^( DAY_OF_MONTH spelled_sequence_1_to_31 )
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

    public static class year_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "year"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:81:1: year : ( ( COMMA )? ( IN THE YEAR )? SINGLE_QUOTE int_0_to_99_with_prefix -> ^( YEAR_OF int_0_to_99_with_prefix ) | ( COMMA )? ( IN THE YEAR )? int_3_or_4_digits -> ^( YEAR_OF int_3_or_4_digits ) );
    public final DateParser.year_return year() throws RecognitionException {
        DateParser.year_return retval = new DateParser.year_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA42=null;
        Token IN43=null;
        Token THE44=null;
        Token YEAR45=null;
        Token SINGLE_QUOTE46=null;
        Token COMMA48=null;
        Token IN49=null;
        Token THE50=null;
        Token YEAR51=null;
        DateParser.int_0_to_99_with_prefix_return int_0_to_99_with_prefix47 = null;

        DateParser.int_3_or_4_digits_return int_3_or_4_digits52 = null;


        Object COMMA42_tree=null;
        Object IN43_tree=null;
        Object THE44_tree=null;
        Object YEAR45_tree=null;
        Object SINGLE_QUOTE46_tree=null;
        Object COMMA48_tree=null;
        Object IN49_tree=null;
        Object THE50_tree=null;
        Object YEAR51_tree=null;
        RewriteRuleTokenStream stream_SINGLE_QUOTE=new RewriteRuleTokenStream(adaptor,"token SINGLE_QUOTE");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_YEAR=new RewriteRuleTokenStream(adaptor,"token YEAR");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_THE=new RewriteRuleTokenStream(adaptor,"token THE");
        RewriteRuleSubtreeStream stream_int_0_to_99_with_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_0_to_99_with_prefix");
        RewriteRuleSubtreeStream stream_int_3_or_4_digits=new RewriteRuleSubtreeStream(adaptor,"rule int_3_or_4_digits");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:82:3: ( ( COMMA )? ( IN THE YEAR )? SINGLE_QUOTE int_0_to_99_with_prefix -> ^( YEAR_OF int_0_to_99_with_prefix ) | ( COMMA )? ( IN THE YEAR )? int_3_or_4_digits -> ^( YEAR_OF int_3_or_4_digits ) )
            int alt17=2;
            switch ( input.LA(1) ) {
            case COMMA:
                {
                switch ( input.LA(2) ) {
                case IN:
                    {
                    int LA17_2 = input.LA(3);

                    if ( (LA17_2==THE) ) {
                        int LA17_5 = input.LA(4);

                        if ( (LA17_5==YEAR) ) {
                            int LA17_6 = input.LA(5);

                            if ( (LA17_6==SINGLE_QUOTE) ) {
                                alt17=1;
                            }
                            else if ( ((LA17_6>=THREE_DIGIT && LA17_6<=FOUR_DIGIT)) ) {
                                alt17=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 17, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 17, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case THREE_DIGIT:
                case FOUR_DIGIT:
                    {
                    alt17=2;
                    }
                    break;
                case SINGLE_QUOTE:
                    {
                    alt17=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }

                }
                break;
            case IN:
                {
                int LA17_2 = input.LA(2);

                if ( (LA17_2==THE) ) {
                    int LA17_5 = input.LA(3);

                    if ( (LA17_5==YEAR) ) {
                        int LA17_6 = input.LA(4);

                        if ( (LA17_6==SINGLE_QUOTE) ) {
                            alt17=1;
                        }
                        else if ( ((LA17_6>=THREE_DIGIT && LA17_6<=FOUR_DIGIT)) ) {
                            alt17=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 17, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 5, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;
                }
                }
                break;
            case SINGLE_QUOTE:
                {
                alt17=1;
                }
                break;
            case THREE_DIGIT:
            case FOUR_DIGIT:
                {
                alt17=2;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:82:5: ( COMMA )? ( IN THE YEAR )? SINGLE_QUOTE int_0_to_99_with_prefix
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:82:5: ( COMMA )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==COMMA) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:82:5: COMMA
                            {
                            COMMA42=(Token)match(input,COMMA,FOLLOW_COMMA_in_year683); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA42);


                            }
                            break;

                    }

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:82:12: ( IN THE YEAR )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==IN) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:82:13: IN THE YEAR
                            {
                            IN43=(Token)match(input,IN,FOLLOW_IN_in_year687); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IN.add(IN43);

                            THE44=(Token)match(input,THE,FOLLOW_THE_in_year689); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THE.add(THE44);

                            YEAR45=(Token)match(input,YEAR,FOLLOW_YEAR_in_year691); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_YEAR.add(YEAR45);


                            }
                            break;

                    }

                    SINGLE_QUOTE46=(Token)match(input,SINGLE_QUOTE,FOLLOW_SINGLE_QUOTE_in_year695); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SINGLE_QUOTE.add(SINGLE_QUOTE46);

                    pushFollow(FOLLOW_int_0_to_99_with_prefix_in_year697);
                    int_0_to_99_with_prefix47=int_0_to_99_with_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_0_to_99_with_prefix.add(int_0_to_99_with_prefix47.getTree());


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
                    // 82:65: -> ^( YEAR_OF int_0_to_99_with_prefix )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:82:68: ^( YEAR_OF int_0_to_99_with_prefix )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:83:5: ( COMMA )? ( IN THE YEAR )? int_3_or_4_digits
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:83:5: ( COMMA )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==COMMA) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:83:5: COMMA
                            {
                            COMMA48=(Token)match(input,COMMA,FOLLOW_COMMA_in_year712); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA48);


                            }
                            break;

                    }

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:83:12: ( IN THE YEAR )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==IN) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:83:13: IN THE YEAR
                            {
                            IN49=(Token)match(input,IN,FOLLOW_IN_in_year716); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IN.add(IN49);

                            THE50=(Token)match(input,THE,FOLLOW_THE_in_year718); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THE.add(THE50);

                            YEAR51=(Token)match(input,YEAR,FOLLOW_YEAR_in_year720); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_YEAR.add(YEAR51);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_int_3_or_4_digits_in_year724);
                    int_3_or_4_digits52=int_3_or_4_digits();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_3_or_4_digits.add(int_3_or_4_digits52.getTree());


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
                    // 83:65: -> ^( YEAR_OF int_3_or_4_digits )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:83:68: ^( YEAR_OF int_3_or_4_digits )
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:86:1: date_separator : ( DASH | SLASH );
    public final DateParser.date_separator_return date_separator() throws RecognitionException {
        DateParser.date_separator_return retval = new DateParser.date_separator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set53=null;

        Object set53_tree=null;

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:87:3: ( DASH | SLASH )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:
            {
            root_0 = (Object)adaptor.nil();

            set53=(Token)input.LT(1);
            if ( (input.LA(1)>=DASH && input.LA(1)<=SLASH) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set53));
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

    public static class time_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "time"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:91:1: time : ( hours ( ( COLON )? minutes )? ( meridian_indicator )? -> ^( EXPLICIT_TIME hours ( minutes )? ( meridian_indicator )? ) | time_identifier );
    public final DateParser.time_return time() throws RecognitionException {
        DateParser.time_return retval = new DateParser.time_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON55=null;
        DateParser.hours_return hours54 = null;

        DateParser.minutes_return minutes56 = null;

        DateParser.meridian_indicator_return meridian_indicator57 = null;

        DateParser.time_identifier_return time_identifier58 = null;


        Object COLON55_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_meridian_indicator=new RewriteRuleSubtreeStream(adaptor,"rule meridian_indicator");
        RewriteRuleSubtreeStream stream_minutes=new RewriteRuleSubtreeStream(adaptor,"rule minutes");
        RewriteRuleSubtreeStream stream_hours=new RewriteRuleSubtreeStream(adaptor,"rule hours");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:92:3: ( hours ( ( COLON )? minutes )? ( meridian_indicator )? -> ^( EXPLICIT_TIME hours ( minutes )? ( meridian_indicator )? ) | time_identifier )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=PREFIXED_ONE_TO_NINE && LA21_0<=THIRTEEN_TO_TWENTY_THREE)) ) {
                alt21=1;
            }
            else if ( ((LA21_0>=MIDNIGHT && LA21_0<=NOON)) ) {
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:92:5: hours ( ( COLON )? minutes )? ( meridian_indicator )?
                    {
                    pushFollow(FOLLOW_hours_in_time789);
                    hours54=hours();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_hours.add(hours54.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:92:11: ( ( COLON )? minutes )?
                    int alt19=2;
                    alt19 = dfa19.predict(input);
                    switch (alt19) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:92:12: ( COLON )? minutes
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:92:12: ( COLON )?
                            int alt18=2;
                            int LA18_0 = input.LA(1);

                            if ( (LA18_0==COLON) ) {
                                alt18=1;
                            }
                            switch (alt18) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:92:12: COLON
                                    {
                                    COLON55=(Token)match(input,COLON,FOLLOW_COLON_in_time792); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_COLON.add(COLON55);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_minutes_in_time795);
                            minutes56=minutes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_minutes.add(minutes56.getTree());

                            }
                            break;

                    }

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:92:29: ( meridian_indicator )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( ((LA20_0>=AM && LA20_0<=PM)) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:92:29: meridian_indicator
                            {
                            pushFollow(FOLLOW_meridian_indicator_in_time799);
                            meridian_indicator57=meridian_indicator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_meridian_indicator.add(meridian_indicator57.getTree());

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
                    // 93:5: -> ^( EXPLICIT_TIME hours ( minutes )? ( meridian_indicator )? )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:93:8: ^( EXPLICIT_TIME hours ( minutes )? ( meridian_indicator )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        adaptor.addChild(root_1, stream_hours.nextTree());
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:93:30: ( minutes )?
                        if ( stream_minutes.hasNext() ) {
                            adaptor.addChild(root_1, stream_minutes.nextTree());

                        }
                        stream_minutes.reset();
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:93:39: ( meridian_indicator )?
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:95:5: time_identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_time_identifier_in_time827);
                    time_identifier58=time_identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, time_identifier58.getTree());

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

    public static class time_identifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "time_identifier"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:99:1: time_identifier : ( MIDNIGHT -> ^( EXPLICIT_TIME ^( HOURS INT[\"12\"] ) AM_PM[\"am\"] ) | NOON -> ^( EXPLICIT_TIME ^( HOURS INT[\"12\"] ) AM_PM[\"pm\"] ) );
    public final DateParser.time_identifier_return time_identifier() throws RecognitionException {
        DateParser.time_identifier_return retval = new DateParser.time_identifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MIDNIGHT59=null;
        Token NOON60=null;

        Object MIDNIGHT59_tree=null;
        Object NOON60_tree=null;
        RewriteRuleTokenStream stream_NOON=new RewriteRuleTokenStream(adaptor,"token NOON");
        RewriteRuleTokenStream stream_MIDNIGHT=new RewriteRuleTokenStream(adaptor,"token MIDNIGHT");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:100:3: ( MIDNIGHT -> ^( EXPLICIT_TIME ^( HOURS INT[\"12\"] ) AM_PM[\"am\"] ) | NOON -> ^( EXPLICIT_TIME ^( HOURS INT[\"12\"] ) AM_PM[\"pm\"] ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==MIDNIGHT) ) {
                alt22=1;
            }
            else if ( (LA22_0==NOON) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:100:5: MIDNIGHT
                    {
                    MIDNIGHT59=(Token)match(input,MIDNIGHT,FOLLOW_MIDNIGHT_in_time_identifier843); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MIDNIGHT.add(MIDNIGHT59);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 100:14: -> ^( EXPLICIT_TIME ^( HOURS INT[\"12\"] ) AM_PM[\"am\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:100:17: ^( EXPLICIT_TIME ^( HOURS INT[\"12\"] ) AM_PM[\"am\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:100:33: ^( HOURS INT[\"12\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:101:5: NOON
                    {
                    NOON60=(Token)match(input,NOON,FOLLOW_NOON_in_time_identifier865); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOON.add(NOON60);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 101:14: -> ^( EXPLICIT_TIME ^( HOURS INT[\"12\"] ) AM_PM[\"pm\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:101:17: ^( EXPLICIT_TIME ^( HOURS INT[\"12\"] ) AM_PM[\"pm\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:101:33: ^( HOURS INT[\"12\"] )
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

    public static class hours_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "hours"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:104:1: hours : int_0_to_23 -> ^( HOURS int_0_to_23 ) ;
    public final DateParser.hours_return hours() throws RecognitionException {
        DateParser.hours_return retval = new DateParser.hours_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_0_to_23_return int_0_to_2361 = null;


        RewriteRuleSubtreeStream stream_int_0_to_23=new RewriteRuleSubtreeStream(adaptor,"rule int_0_to_23");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:105:3: ( int_0_to_23 -> ^( HOURS int_0_to_23 ) )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:105:5: int_0_to_23
            {
            pushFollow(FOLLOW_int_0_to_23_in_hours900);
            int_0_to_2361=int_0_to_23();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_0_to_23.add(int_0_to_2361.getTree());


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
            // 105:17: -> ^( HOURS int_0_to_23 )
            {
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:105:20: ^( HOURS int_0_to_23 )
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:108:1: minutes : int_0_to_59 -> ^( MINUTES int_0_to_59 ) ;
    public final DateParser.minutes_return minutes() throws RecognitionException {
        DateParser.minutes_return retval = new DateParser.minutes_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_0_to_59_return int_0_to_5962 = null;


        RewriteRuleSubtreeStream stream_int_0_to_59=new RewriteRuleSubtreeStream(adaptor,"rule int_0_to_59");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:109:3: ( int_0_to_59 -> ^( MINUTES int_0_to_59 ) )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:109:5: int_0_to_59
            {
            pushFollow(FOLLOW_int_0_to_59_in_minutes923);
            int_0_to_5962=int_0_to_59();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_0_to_59.add(int_0_to_5962.getTree());


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
            // 109:17: -> ^( MINUTES int_0_to_59 )
            {
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:109:20: ^( MINUTES int_0_to_59 )
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:112:1: meridian_indicator : ( AM -> AM_PM[\"am\"] | PM -> AM_PM[\"pm\"] );
    public final DateParser.meridian_indicator_return meridian_indicator() throws RecognitionException {
        DateParser.meridian_indicator_return retval = new DateParser.meridian_indicator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AM63=null;
        Token PM64=null;

        Object AM63_tree=null;
        Object PM64_tree=null;
        RewriteRuleTokenStream stream_PM=new RewriteRuleTokenStream(adaptor,"token PM");
        RewriteRuleTokenStream stream_AM=new RewriteRuleTokenStream(adaptor,"token AM");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:113:3: ( AM -> AM_PM[\"am\"] | PM -> AM_PM[\"pm\"] )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==AM) ) {
                alt23=1;
            }
            else if ( (LA23_0==PM) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:113:5: AM
                    {
                    AM63=(Token)match(input,AM,FOLLOW_AM_in_meridian_indicator946); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AM.add(AM63);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 113:8: -> AM_PM[\"am\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(AM_PM, "am"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:114:5: PM
                    {
                    PM64=(Token)match(input,PM,FOLLOW_PM_in_meridian_indicator957); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PM.add(PM64);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 114:8: -> AM_PM[\"pm\"]
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:118:1: spelled_or_int_1_to_31 : ( int_1_to_31 | spelled_1_to_31 );
    public final DateParser.spelled_or_int_1_to_31_return spelled_or_int_1_to_31() throws RecognitionException {
        DateParser.spelled_or_int_1_to_31_return retval = new DateParser.spelled_or_int_1_to_31_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_1_to_31_return int_1_to_3165 = null;

        DateParser.spelled_1_to_31_return spelled_1_to_3166 = null;



        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:119:3: ( int_1_to_31 | spelled_1_to_31 )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=PREFIXED_ONE_TO_NINE && LA24_0<=TEN_TO_TWELVE)||(LA24_0>=THIRTEEN_TO_TWENTY_THREE && LA24_0<=TWENTY_FOUR_TO_THIRTY_ONE)) ) {
                alt24=1;
            }
            else if ( ((LA24_0>=ONE && LA24_0<=THIRTY)) ) {
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:119:5: int_1_to_31
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_int_1_to_31_in_spelled_or_int_1_to_31978);
                    int_1_to_3165=int_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, int_1_to_3165.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:120:5: spelled_1_to_31
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_spelled_1_to_31_in_spelled_or_int_1_to_31984);
                    spelled_1_to_3166=spelled_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, spelled_1_to_3166.getTree());

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

    public static class spelled_1_to_31_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "spelled_1_to_31"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:123:1: spelled_1_to_31 : ( ONE -> INT[\"1\"] | TWO -> INT[\"2\"] | THREE -> INT[\"3\"] | FOUR -> INT[\"4\"] | FIVE -> INT[\"5\"] | SIX -> INT[\"6\"] | SEVEN -> INT[\"7\"] | EIGHT -> INT[\"8\"] | NINE -> INT[\"9\"] | TEN -> INT[\"10\"] | ELEVEN -> INT[\"11\"] | TWELVE -> INT[\"12\"] | THIRTEEN -> INT[\"13\"] | FOURTEEN -> INT[\"14\"] | FIFTEEN -> INT[\"15\"] | SIXTEEN -> INT[\"16\"] | SEVENTEEN -> INT[\"17\"] | EIGHTEEN -> INT[\"18\"] | NINETEEN -> INT[\"19\"] | TWENTY -> INT[\"20\"] | TWENTY ( DASH )? ONE -> INT[\"21\"] | TWENTY ( DASH )? TWO -> INT[\"22\"] | TWENTY ( DASH )? THREE -> INT[\"23\"] | TWENTY ( DASH )? FOUR -> INT[\"24\"] | TWENTY ( DASH )? FIVE -> INT[\"25\"] | TWENTY ( DASH )? SIX -> INT[\"26\"] | TWENTY ( DASH )? SEVEN -> INT[\"27\"] | TWENTY ( DASH )? EIGHT -> INT[\"28\"] | TWENTY ( DASH )? NINE -> INT[\"29\"] | THIRTY -> INT[\"30\"] | THIRTY ( DASH )? ONE -> INT[\"31\"] );
    public final DateParser.spelled_1_to_31_return spelled_1_to_31() throws RecognitionException {
        DateParser.spelled_1_to_31_return retval = new DateParser.spelled_1_to_31_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ONE67=null;
        Token TWO68=null;
        Token THREE69=null;
        Token FOUR70=null;
        Token FIVE71=null;
        Token SIX72=null;
        Token SEVEN73=null;
        Token EIGHT74=null;
        Token NINE75=null;
        Token TEN76=null;
        Token ELEVEN77=null;
        Token TWELVE78=null;
        Token THIRTEEN79=null;
        Token FOURTEEN80=null;
        Token FIFTEEN81=null;
        Token SIXTEEN82=null;
        Token SEVENTEEN83=null;
        Token EIGHTEEN84=null;
        Token NINETEEN85=null;
        Token TWENTY86=null;
        Token TWENTY87=null;
        Token DASH88=null;
        Token ONE89=null;
        Token TWENTY90=null;
        Token DASH91=null;
        Token TWO92=null;
        Token TWENTY93=null;
        Token DASH94=null;
        Token THREE95=null;
        Token TWENTY96=null;
        Token DASH97=null;
        Token FOUR98=null;
        Token TWENTY99=null;
        Token DASH100=null;
        Token FIVE101=null;
        Token TWENTY102=null;
        Token DASH103=null;
        Token SIX104=null;
        Token TWENTY105=null;
        Token DASH106=null;
        Token SEVEN107=null;
        Token TWENTY108=null;
        Token DASH109=null;
        Token EIGHT110=null;
        Token TWENTY111=null;
        Token DASH112=null;
        Token NINE113=null;
        Token THIRTY114=null;
        Token THIRTY115=null;
        Token DASH116=null;
        Token ONE117=null;

        Object ONE67_tree=null;
        Object TWO68_tree=null;
        Object THREE69_tree=null;
        Object FOUR70_tree=null;
        Object FIVE71_tree=null;
        Object SIX72_tree=null;
        Object SEVEN73_tree=null;
        Object EIGHT74_tree=null;
        Object NINE75_tree=null;
        Object TEN76_tree=null;
        Object ELEVEN77_tree=null;
        Object TWELVE78_tree=null;
        Object THIRTEEN79_tree=null;
        Object FOURTEEN80_tree=null;
        Object FIFTEEN81_tree=null;
        Object SIXTEEN82_tree=null;
        Object SEVENTEEN83_tree=null;
        Object EIGHTEEN84_tree=null;
        Object NINETEEN85_tree=null;
        Object TWENTY86_tree=null;
        Object TWENTY87_tree=null;
        Object DASH88_tree=null;
        Object ONE89_tree=null;
        Object TWENTY90_tree=null;
        Object DASH91_tree=null;
        Object TWO92_tree=null;
        Object TWENTY93_tree=null;
        Object DASH94_tree=null;
        Object THREE95_tree=null;
        Object TWENTY96_tree=null;
        Object DASH97_tree=null;
        Object FOUR98_tree=null;
        Object TWENTY99_tree=null;
        Object DASH100_tree=null;
        Object FIVE101_tree=null;
        Object TWENTY102_tree=null;
        Object DASH103_tree=null;
        Object SIX104_tree=null;
        Object TWENTY105_tree=null;
        Object DASH106_tree=null;
        Object SEVEN107_tree=null;
        Object TWENTY108_tree=null;
        Object DASH109_tree=null;
        Object EIGHT110_tree=null;
        Object TWENTY111_tree=null;
        Object DASH112_tree=null;
        Object NINE113_tree=null;
        Object THIRTY114_tree=null;
        Object THIRTY115_tree=null;
        Object DASH116_tree=null;
        Object ONE117_tree=null;
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:124:3: ( ONE -> INT[\"1\"] | TWO -> INT[\"2\"] | THREE -> INT[\"3\"] | FOUR -> INT[\"4\"] | FIVE -> INT[\"5\"] | SIX -> INT[\"6\"] | SEVEN -> INT[\"7\"] | EIGHT -> INT[\"8\"] | NINE -> INT[\"9\"] | TEN -> INT[\"10\"] | ELEVEN -> INT[\"11\"] | TWELVE -> INT[\"12\"] | THIRTEEN -> INT[\"13\"] | FOURTEEN -> INT[\"14\"] | FIFTEEN -> INT[\"15\"] | SIXTEEN -> INT[\"16\"] | SEVENTEEN -> INT[\"17\"] | EIGHTEEN -> INT[\"18\"] | NINETEEN -> INT[\"19\"] | TWENTY -> INT[\"20\"] | TWENTY ( DASH )? ONE -> INT[\"21\"] | TWENTY ( DASH )? TWO -> INT[\"22\"] | TWENTY ( DASH )? THREE -> INT[\"23\"] | TWENTY ( DASH )? FOUR -> INT[\"24\"] | TWENTY ( DASH )? FIVE -> INT[\"25\"] | TWENTY ( DASH )? SIX -> INT[\"26\"] | TWENTY ( DASH )? SEVEN -> INT[\"27\"] | TWENTY ( DASH )? EIGHT -> INT[\"28\"] | TWENTY ( DASH )? NINE -> INT[\"29\"] | THIRTY -> INT[\"30\"] | THIRTY ( DASH )? ONE -> INT[\"31\"] )
            int alt35=31;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:124:5: ONE
                    {
                    ONE67=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_1_to_31999); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE.add(ONE67);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 124:16: -> INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:125:5: TWO
                    {
                    TWO68=(Token)match(input,TWO,FOLLOW_TWO_in_spelled_1_to_311017); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO.add(TWO68);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 125:16: -> INT[\"2\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "2"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:126:5: THREE
                    {
                    THREE69=(Token)match(input,THREE,FOLLOW_THREE_in_spelled_1_to_311035); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THREE.add(THREE69);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 126:16: -> INT[\"3\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "3"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:127:5: FOUR
                    {
                    FOUR70=(Token)match(input,FOUR,FOLLOW_FOUR_in_spelled_1_to_311051); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOUR.add(FOUR70);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 127:16: -> INT[\"4\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "4"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:128:5: FIVE
                    {
                    FIVE71=(Token)match(input,FIVE,FOLLOW_FIVE_in_spelled_1_to_311068); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIVE.add(FIVE71);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 128:16: -> INT[\"5\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "5"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:129:5: SIX
                    {
                    SIX72=(Token)match(input,SIX,FOLLOW_SIX_in_spelled_1_to_311085); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIX.add(SIX72);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 129:16: -> INT[\"6\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "6"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:130:5: SEVEN
                    {
                    SEVEN73=(Token)match(input,SEVEN,FOLLOW_SEVEN_in_spelled_1_to_311103); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVEN.add(SEVEN73);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 130:16: -> INT[\"7\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "7"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:131:5: EIGHT
                    {
                    EIGHT74=(Token)match(input,EIGHT,FOLLOW_EIGHT_in_spelled_1_to_311119); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHT.add(EIGHT74);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 131:16: -> INT[\"8\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "8"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:132:5: NINE
                    {
                    NINE75=(Token)match(input,NINE,FOLLOW_NINE_in_spelled_1_to_311135); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINE.add(NINE75);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 132:16: -> INT[\"9\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "9"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:133:5: TEN
                    {
                    TEN76=(Token)match(input,TEN,FOLLOW_TEN_in_spelled_1_to_311152); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TEN.add(TEN76);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 133:16: -> INT[\"10\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "10"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:134:5: ELEVEN
                    {
                    ELEVEN77=(Token)match(input,ELEVEN,FOLLOW_ELEVEN_in_spelled_1_to_311170); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELEVEN.add(ELEVEN77);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 134:16: -> INT[\"11\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "11"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:135:5: TWELVE
                    {
                    TWELVE78=(Token)match(input,TWELVE,FOLLOW_TWELVE_in_spelled_1_to_311185); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWELVE.add(TWELVE78);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 135:16: -> INT[\"12\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "12"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:136:5: THIRTEEN
                    {
                    THIRTEEN79=(Token)match(input,THIRTEEN,FOLLOW_THIRTEEN_in_spelled_1_to_311200); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEEN.add(THIRTEEN79);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 136:16: -> INT[\"13\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "13"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 14 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:137:5: FOURTEEN
                    {
                    FOURTEEN80=(Token)match(input,FOURTEEN,FOLLOW_FOURTEEN_in_spelled_1_to_311213); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOURTEEN.add(FOURTEEN80);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 137:16: -> INT[\"14\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "14"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 15 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:138:5: FIFTEEN
                    {
                    FIFTEEN81=(Token)match(input,FIFTEEN,FOLLOW_FIFTEEN_in_spelled_1_to_311226); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIFTEEN.add(FIFTEEN81);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 138:16: -> INT[\"15\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "15"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 16 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:139:5: SIXTEEN
                    {
                    SIXTEEN82=(Token)match(input,SIXTEEN,FOLLOW_SIXTEEN_in_spelled_1_to_311240); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTEEN.add(SIXTEEN82);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 139:16: -> INT[\"16\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "16"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 17 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:140:5: SEVENTEEN
                    {
                    SEVENTEEN83=(Token)match(input,SEVENTEEN,FOLLOW_SEVENTEEN_in_spelled_1_to_311254); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVENTEEN.add(SEVENTEEN83);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 140:16: -> INT[\"17\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "17"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 18 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:141:5: EIGHTEEN
                    {
                    EIGHTEEN84=(Token)match(input,EIGHTEEN,FOLLOW_EIGHTEEN_in_spelled_1_to_311266); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHTEEN.add(EIGHTEEN84);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 141:16: -> INT[\"18\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "18"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 19 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:142:5: NINETEEN
                    {
                    NINETEEN85=(Token)match(input,NINETEEN,FOLLOW_NINETEEN_in_spelled_1_to_311279); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINETEEN.add(NINETEEN85);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 142:16: -> INT[\"19\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "19"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 20 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:143:5: TWENTY
                    {
                    TWENTY86=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_1_to_311292); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY86);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 143:16: -> INT[\"20\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "20"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 21 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:144:5: TWENTY ( DASH )? ONE
                    {
                    TWENTY87=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_1_to_311307); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY87);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:144:12: ( DASH )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==DASH) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:144:12: DASH
                            {
                            DASH88=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_1_to_311309); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH88);


                            }
                            break;

                    }

                    ONE89=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_1_to_311312); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE.add(ONE89);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 144:24: -> INT[\"21\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "21"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 22 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:145:5: TWENTY ( DASH )? TWO
                    {
                    TWENTY90=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_1_to_311325); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY90);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:145:12: ( DASH )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==DASH) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:145:12: DASH
                            {
                            DASH91=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_1_to_311327); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH91);


                            }
                            break;

                    }

                    TWO92=(Token)match(input,TWO,FOLLOW_TWO_in_spelled_1_to_311330); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO.add(TWO92);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 145:24: -> INT[\"22\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "22"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 23 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:146:5: TWENTY ( DASH )? THREE
                    {
                    TWENTY93=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_1_to_311343); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY93);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:146:12: ( DASH )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==DASH) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:146:12: DASH
                            {
                            DASH94=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_1_to_311345); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH94);


                            }
                            break;

                    }

                    THREE95=(Token)match(input,THREE,FOLLOW_THREE_in_spelled_1_to_311348); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THREE.add(THREE95);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 146:24: -> INT[\"23\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "23"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 24 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:147:5: TWENTY ( DASH )? FOUR
                    {
                    TWENTY96=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_1_to_311359); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY96);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:147:12: ( DASH )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==DASH) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:147:12: DASH
                            {
                            DASH97=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_1_to_311361); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH97);


                            }
                            break;

                    }

                    FOUR98=(Token)match(input,FOUR,FOLLOW_FOUR_in_spelled_1_to_311364); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOUR.add(FOUR98);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 147:24: -> INT[\"24\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "24"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 25 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:148:5: TWENTY ( DASH )? FIVE
                    {
                    TWENTY99=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_1_to_311376); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY99);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:148:12: ( DASH )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==DASH) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:148:12: DASH
                            {
                            DASH100=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_1_to_311378); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH100);


                            }
                            break;

                    }

                    FIVE101=(Token)match(input,FIVE,FOLLOW_FIVE_in_spelled_1_to_311381); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIVE.add(FIVE101);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 148:24: -> INT[\"25\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "25"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 26 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:149:5: TWENTY ( DASH )? SIX
                    {
                    TWENTY102=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_1_to_311393); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY102);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:149:12: ( DASH )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==DASH) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:149:12: DASH
                            {
                            DASH103=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_1_to_311395); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH103);


                            }
                            break;

                    }

                    SIX104=(Token)match(input,SIX,FOLLOW_SIX_in_spelled_1_to_311398); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIX.add(SIX104);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 149:24: -> INT[\"26\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "26"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 27 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:150:5: TWENTY ( DASH )? SEVEN
                    {
                    TWENTY105=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_1_to_311411); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY105);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:150:12: ( DASH )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==DASH) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:150:12: DASH
                            {
                            DASH106=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_1_to_311413); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH106);


                            }
                            break;

                    }

                    SEVEN107=(Token)match(input,SEVEN,FOLLOW_SEVEN_in_spelled_1_to_311416); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVEN.add(SEVEN107);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 150:24: -> INT[\"27\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "27"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 28 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:151:5: TWENTY ( DASH )? EIGHT
                    {
                    TWENTY108=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_1_to_311427); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY108);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:151:12: ( DASH )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==DASH) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:151:12: DASH
                            {
                            DASH109=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_1_to_311429); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH109);


                            }
                            break;

                    }

                    EIGHT110=(Token)match(input,EIGHT,FOLLOW_EIGHT_in_spelled_1_to_311432); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHT.add(EIGHT110);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 151:24: -> INT[\"28\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "28"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 29 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:152:5: TWENTY ( DASH )? NINE
                    {
                    TWENTY111=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_1_to_311443); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY111);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:152:12: ( DASH )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==DASH) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:152:12: DASH
                            {
                            DASH112=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_1_to_311445); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH112);


                            }
                            break;

                    }

                    NINE113=(Token)match(input,NINE,FOLLOW_NINE_in_spelled_1_to_311448); if (state.failed) return retval; 
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
                    // 152:24: -> INT[\"29\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "29"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 30 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:153:5: THIRTY
                    {
                    THIRTY114=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_1_to_311460); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY114);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 153:24: -> INT[\"30\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "30"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 31 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:154:5: THIRTY ( DASH )? ONE
                    {
                    THIRTY115=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_1_to_311483); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY115);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:154:12: ( DASH )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==DASH) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:154:12: DASH
                            {
                            DASH116=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_1_to_311485); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH116);


                            }
                            break;

                    }

                    ONE117=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_1_to_311488); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE.add(ONE117);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 154:24: -> INT[\"31\"]
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

    public static class spelled_sequence_1_to_31_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "spelled_sequence_1_to_31"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:159:1: spelled_sequence_1_to_31 : ( FIRST -> INT[\"1\"] | SECOND -> INT[\"2\"] | THIRD -> INT[\"3\"] | FOURTH -> INT[\"4\"] | FIFTH -> INT[\"5\"] | SIXTH -> INT[\"6\"] | SEVENTH -> INT[\"7\"] | EIGHTH -> INT[\"8\"] | NINTH -> INT[\"9\"] | TENTH -> INT[\"10\"] | ELEVENTH -> INT[\"11\"] | TWELFTH -> INT[\"12\"] | THIRTEENTH -> INT[\"13\"] | FOURTEENTH -> INT[\"14\"] | FIFTEENTH -> INT[\"15\"] | SIXTEENTH -> INT[\"16\"] | SEVENTEENTH -> INT[\"17\"] | EIGHTEENTH -> INT[\"18\"] | NINETEENTH -> INT[\"19\"] | TWENTIETH -> INT[\"20\"] | ( TWENTY_FIRST | ( TWENTY ( DASH )? FIRST ) ) -> INT[\"21\"] | ( TWENTY_SECOND | ( TWENTY ( DASH )? SECOND ) ) -> INT[\"22\"] | ( TWENTY_THIRD | ( TWENTY ( DASH )? THIRD ) ) -> INT[\"23\"] | ( TWENTY_FOURTH | ( TWENTY ( DASH )? FOURTH ) ) -> INT[\"24\"] | ( TWENTY_FIFTH | ( TWENTY ( DASH )? FIFTH ) ) -> INT[\"25\"] | ( TWENTY_SIXTH | ( TWENTY ( DASH )? SIXTH ) ) -> INT[\"26\"] | ( TWENTY_SEVENTH | ( TWENTY ( DASH )? SEVENTH ) ) -> INT[\"27\"] | ( TWENTY_EIGHTH | ( TWENTY ( DASH )? EIGHTH ) ) -> INT[\"28\"] | ( TWENTY_NINTH | ( TWENTY ( DASH )? NINTH ) ) -> INT[\"29\"] | THIRTIETH -> INT[\"30\"] | ( THIRTY_FIRST | ( THIRTY ( DASH )? FIRST ) ) -> INT[\"31\"] );
    public final DateParser.spelled_sequence_1_to_31_return spelled_sequence_1_to_31() throws RecognitionException {
        DateParser.spelled_sequence_1_to_31_return retval = new DateParser.spelled_sequence_1_to_31_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FIRST118=null;
        Token SECOND119=null;
        Token THIRD120=null;
        Token FOURTH121=null;
        Token FIFTH122=null;
        Token SIXTH123=null;
        Token SEVENTH124=null;
        Token EIGHTH125=null;
        Token NINTH126=null;
        Token TENTH127=null;
        Token ELEVENTH128=null;
        Token TWELFTH129=null;
        Token THIRTEENTH130=null;
        Token FOURTEENTH131=null;
        Token FIFTEENTH132=null;
        Token SIXTEENTH133=null;
        Token SEVENTEENTH134=null;
        Token EIGHTEENTH135=null;
        Token NINETEENTH136=null;
        Token TWENTIETH137=null;
        Token TWENTY_FIRST138=null;
        Token TWENTY139=null;
        Token DASH140=null;
        Token FIRST141=null;
        Token TWENTY_SECOND142=null;
        Token TWENTY143=null;
        Token DASH144=null;
        Token SECOND145=null;
        Token TWENTY_THIRD146=null;
        Token TWENTY147=null;
        Token DASH148=null;
        Token THIRD149=null;
        Token TWENTY_FOURTH150=null;
        Token TWENTY151=null;
        Token DASH152=null;
        Token FOURTH153=null;
        Token TWENTY_FIFTH154=null;
        Token TWENTY155=null;
        Token DASH156=null;
        Token FIFTH157=null;
        Token TWENTY_SIXTH158=null;
        Token TWENTY159=null;
        Token DASH160=null;
        Token SIXTH161=null;
        Token TWENTY_SEVENTH162=null;
        Token TWENTY163=null;
        Token DASH164=null;
        Token SEVENTH165=null;
        Token TWENTY_EIGHTH166=null;
        Token TWENTY167=null;
        Token DASH168=null;
        Token EIGHTH169=null;
        Token TWENTY_NINTH170=null;
        Token TWENTY171=null;
        Token DASH172=null;
        Token NINTH173=null;
        Token THIRTIETH174=null;
        Token THIRTY_FIRST175=null;
        Token THIRTY176=null;
        Token DASH177=null;
        Token FIRST178=null;

        Object FIRST118_tree=null;
        Object SECOND119_tree=null;
        Object THIRD120_tree=null;
        Object FOURTH121_tree=null;
        Object FIFTH122_tree=null;
        Object SIXTH123_tree=null;
        Object SEVENTH124_tree=null;
        Object EIGHTH125_tree=null;
        Object NINTH126_tree=null;
        Object TENTH127_tree=null;
        Object ELEVENTH128_tree=null;
        Object TWELFTH129_tree=null;
        Object THIRTEENTH130_tree=null;
        Object FOURTEENTH131_tree=null;
        Object FIFTEENTH132_tree=null;
        Object SIXTEENTH133_tree=null;
        Object SEVENTEENTH134_tree=null;
        Object EIGHTEENTH135_tree=null;
        Object NINETEENTH136_tree=null;
        Object TWENTIETH137_tree=null;
        Object TWENTY_FIRST138_tree=null;
        Object TWENTY139_tree=null;
        Object DASH140_tree=null;
        Object FIRST141_tree=null;
        Object TWENTY_SECOND142_tree=null;
        Object TWENTY143_tree=null;
        Object DASH144_tree=null;
        Object SECOND145_tree=null;
        Object TWENTY_THIRD146_tree=null;
        Object TWENTY147_tree=null;
        Object DASH148_tree=null;
        Object THIRD149_tree=null;
        Object TWENTY_FOURTH150_tree=null;
        Object TWENTY151_tree=null;
        Object DASH152_tree=null;
        Object FOURTH153_tree=null;
        Object TWENTY_FIFTH154_tree=null;
        Object TWENTY155_tree=null;
        Object DASH156_tree=null;
        Object FIFTH157_tree=null;
        Object TWENTY_SIXTH158_tree=null;
        Object TWENTY159_tree=null;
        Object DASH160_tree=null;
        Object SIXTH161_tree=null;
        Object TWENTY_SEVENTH162_tree=null;
        Object TWENTY163_tree=null;
        Object DASH164_tree=null;
        Object SEVENTH165_tree=null;
        Object TWENTY_EIGHTH166_tree=null;
        Object TWENTY167_tree=null;
        Object DASH168_tree=null;
        Object EIGHTH169_tree=null;
        Object TWENTY_NINTH170_tree=null;
        Object TWENTY171_tree=null;
        Object DASH172_tree=null;
        Object NINTH173_tree=null;
        Object THIRTIETH174_tree=null;
        Object THIRTY_FIRST175_tree=null;
        Object THIRTY176_tree=null;
        Object DASH177_tree=null;
        Object FIRST178_tree=null;
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:160:3: ( FIRST -> INT[\"1\"] | SECOND -> INT[\"2\"] | THIRD -> INT[\"3\"] | FOURTH -> INT[\"4\"] | FIFTH -> INT[\"5\"] | SIXTH -> INT[\"6\"] | SEVENTH -> INT[\"7\"] | EIGHTH -> INT[\"8\"] | NINTH -> INT[\"9\"] | TENTH -> INT[\"10\"] | ELEVENTH -> INT[\"11\"] | TWELFTH -> INT[\"12\"] | THIRTEENTH -> INT[\"13\"] | FOURTEENTH -> INT[\"14\"] | FIFTEENTH -> INT[\"15\"] | SIXTEENTH -> INT[\"16\"] | SEVENTEENTH -> INT[\"17\"] | EIGHTEENTH -> INT[\"18\"] | NINETEENTH -> INT[\"19\"] | TWENTIETH -> INT[\"20\"] | ( TWENTY_FIRST | ( TWENTY ( DASH )? FIRST ) ) -> INT[\"21\"] | ( TWENTY_SECOND | ( TWENTY ( DASH )? SECOND ) ) -> INT[\"22\"] | ( TWENTY_THIRD | ( TWENTY ( DASH )? THIRD ) ) -> INT[\"23\"] | ( TWENTY_FOURTH | ( TWENTY ( DASH )? FOURTH ) ) -> INT[\"24\"] | ( TWENTY_FIFTH | ( TWENTY ( DASH )? FIFTH ) ) -> INT[\"25\"] | ( TWENTY_SIXTH | ( TWENTY ( DASH )? SIXTH ) ) -> INT[\"26\"] | ( TWENTY_SEVENTH | ( TWENTY ( DASH )? SEVENTH ) ) -> INT[\"27\"] | ( TWENTY_EIGHTH | ( TWENTY ( DASH )? EIGHTH ) ) -> INT[\"28\"] | ( TWENTY_NINTH | ( TWENTY ( DASH )? NINTH ) ) -> INT[\"29\"] | THIRTIETH -> INT[\"30\"] | ( THIRTY_FIRST | ( THIRTY ( DASH )? FIRST ) ) -> INT[\"31\"] )
            int alt56=31;
            alt56 = dfa56.predict(input);
            switch (alt56) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:160:5: FIRST
                    {
                    FIRST118=(Token)match(input,FIRST,FOLLOW_FIRST_in_spelled_sequence_1_to_311512); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIRST.add(FIRST118);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 160:17: -> INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:161:5: SECOND
                    {
                    SECOND119=(Token)match(input,SECOND,FOLLOW_SECOND_in_spelled_sequence_1_to_311529); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SECOND.add(SECOND119);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 161:17: -> INT[\"2\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "2"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:162:5: THIRD
                    {
                    THIRD120=(Token)match(input,THIRD,FOLLOW_THIRD_in_spelled_sequence_1_to_311545); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRD.add(THIRD120);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 162:17: -> INT[\"3\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "3"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:163:5: FOURTH
                    {
                    FOURTH121=(Token)match(input,FOURTH,FOLLOW_FOURTH_in_spelled_sequence_1_to_311562); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOURTH.add(FOURTH121);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 163:17: -> INT[\"4\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "4"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:164:5: FIFTH
                    {
                    FIFTH122=(Token)match(input,FIFTH,FOLLOW_FIFTH_in_spelled_sequence_1_to_311578); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIFTH.add(FIFTH122);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 164:17: -> INT[\"5\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "5"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:165:5: SIXTH
                    {
                    SIXTH123=(Token)match(input,SIXTH,FOLLOW_SIXTH_in_spelled_sequence_1_to_311595); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTH.add(SIXTH123);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 165:17: -> INT[\"6\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "6"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:166:5: SEVENTH
                    {
                    SEVENTH124=(Token)match(input,SEVENTH,FOLLOW_SEVENTH_in_spelled_sequence_1_to_311612); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVENTH.add(SEVENTH124);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 166:17: -> INT[\"7\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "7"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:167:5: EIGHTH
                    {
                    EIGHTH125=(Token)match(input,EIGHTH,FOLLOW_EIGHTH_in_spelled_sequence_1_to_311627); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHTH.add(EIGHTH125);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 167:17: -> INT[\"8\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "8"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:168:5: NINTH
                    {
                    NINTH126=(Token)match(input,NINTH,FOLLOW_NINTH_in_spelled_sequence_1_to_311643); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINTH.add(NINTH126);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 168:17: -> INT[\"9\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "9"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:169:5: TENTH
                    {
                    TENTH127=(Token)match(input,TENTH,FOLLOW_TENTH_in_spelled_sequence_1_to_311660); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TENTH.add(TENTH127);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 169:17: -> INT[\"10\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "10"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:170:5: ELEVENTH
                    {
                    ELEVENTH128=(Token)match(input,ELEVENTH,FOLLOW_ELEVENTH_in_spelled_sequence_1_to_311677); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELEVENTH.add(ELEVENTH128);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 170:17: -> INT[\"11\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "11"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:171:5: TWELFTH
                    {
                    TWELFTH129=(Token)match(input,TWELFTH,FOLLOW_TWELFTH_in_spelled_sequence_1_to_311691); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWELFTH.add(TWELFTH129);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 171:17: -> INT[\"12\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "12"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:172:5: THIRTEENTH
                    {
                    THIRTEENTH130=(Token)match(input,THIRTEENTH,FOLLOW_THIRTEENTH_in_spelled_sequence_1_to_311706); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEENTH.add(THIRTEENTH130);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 172:17: -> INT[\"13\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "13"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 14 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:173:5: FOURTEENTH
                    {
                    FOURTEENTH131=(Token)match(input,FOURTEENTH,FOLLOW_FOURTEENTH_in_spelled_sequence_1_to_311718); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOURTEENTH.add(FOURTEENTH131);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 173:17: -> INT[\"14\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "14"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 15 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:174:5: FIFTEENTH
                    {
                    FIFTEENTH132=(Token)match(input,FIFTEENTH,FOLLOW_FIFTEENTH_in_spelled_sequence_1_to_311730); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIFTEENTH.add(FIFTEENTH132);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 174:17: -> INT[\"15\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "15"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 16 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:175:5: SIXTEENTH
                    {
                    SIXTEENTH133=(Token)match(input,SIXTEENTH,FOLLOW_SIXTEENTH_in_spelled_sequence_1_to_311743); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTEENTH.add(SIXTEENTH133);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 175:17: -> INT[\"16\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "16"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 17 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:176:5: SEVENTEENTH
                    {
                    SEVENTEENTH134=(Token)match(input,SEVENTEENTH,FOLLOW_SEVENTEENTH_in_spelled_sequence_1_to_311756); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVENTEENTH.add(SEVENTEENTH134);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 176:17: -> INT[\"17\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "17"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 18 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:177:5: EIGHTEENTH
                    {
                    EIGHTEENTH135=(Token)match(input,EIGHTEENTH,FOLLOW_EIGHTEENTH_in_spelled_sequence_1_to_311767); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHTEENTH.add(EIGHTEENTH135);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 177:17: -> INT[\"18\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "18"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 19 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:178:5: NINETEENTH
                    {
                    NINETEENTH136=(Token)match(input,NINETEENTH,FOLLOW_NINETEENTH_in_spelled_sequence_1_to_311779); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINETEENTH.add(NINETEENTH136);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 178:17: -> INT[\"19\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "19"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 20 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:179:5: TWENTIETH
                    {
                    TWENTIETH137=(Token)match(input,TWENTIETH,FOLLOW_TWENTIETH_in_spelled_sequence_1_to_311791); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTIETH.add(TWENTIETH137);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 179:17: -> INT[\"20\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "20"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 21 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:180:5: ( TWENTY_FIRST | ( TWENTY ( DASH )? FIRST ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:180:5: ( TWENTY_FIRST | ( TWENTY ( DASH )? FIRST ) )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==TWENTY_FIRST) ) {
                        alt37=1;
                    }
                    else if ( (LA37_0==TWENTY) ) {
                        alt37=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }
                    switch (alt37) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:180:6: TWENTY_FIRST
                            {
                            TWENTY_FIRST138=(Token)match(input,TWENTY_FIRST,FOLLOW_TWENTY_FIRST_in_spelled_sequence_1_to_311805); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_FIRST.add(TWENTY_FIRST138);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:180:23: ( TWENTY ( DASH )? FIRST )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:180:23: ( TWENTY ( DASH )? FIRST )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:180:24: TWENTY ( DASH )? FIRST
                            {
                            TWENTY139=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_311812); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY139);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:180:31: ( DASH )?
                            int alt36=2;
                            int LA36_0 = input.LA(1);

                            if ( (LA36_0==DASH) ) {
                                alt36=1;
                            }
                            switch (alt36) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:180:31: DASH
                                    {
                                    DASH140=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_311814); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH140);


                                    }
                                    break;

                            }

                            FIRST141=(Token)match(input,FIRST,FOLLOW_FIRST_in_spelled_sequence_1_to_311817); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FIRST.add(FIRST141);


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
                    // 180:47: -> INT[\"21\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "21"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 22 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:181:5: ( TWENTY_SECOND | ( TWENTY ( DASH )? SECOND ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:181:5: ( TWENTY_SECOND | ( TWENTY ( DASH )? SECOND ) )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==TWENTY_SECOND) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==TWENTY) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:181:6: TWENTY_SECOND
                            {
                            TWENTY_SECOND142=(Token)match(input,TWENTY_SECOND,FOLLOW_TWENTY_SECOND_in_spelled_sequence_1_to_311833); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_SECOND.add(TWENTY_SECOND142);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:181:23: ( TWENTY ( DASH )? SECOND )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:181:23: ( TWENTY ( DASH )? SECOND )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:181:24: TWENTY ( DASH )? SECOND
                            {
                            TWENTY143=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_311839); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY143);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:181:31: ( DASH )?
                            int alt38=2;
                            int LA38_0 = input.LA(1);

                            if ( (LA38_0==DASH) ) {
                                alt38=1;
                            }
                            switch (alt38) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:181:31: DASH
                                    {
                                    DASH144=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_311841); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH144);


                                    }
                                    break;

                            }

                            SECOND145=(Token)match(input,SECOND,FOLLOW_SECOND_in_spelled_sequence_1_to_311844); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SECOND.add(SECOND145);


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
                    // 181:47: -> INT[\"22\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "22"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 23 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:182:5: ( TWENTY_THIRD | ( TWENTY ( DASH )? THIRD ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:182:5: ( TWENTY_THIRD | ( TWENTY ( DASH )? THIRD ) )
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==TWENTY_THIRD) ) {
                        alt41=1;
                    }
                    else if ( (LA41_0==TWENTY) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:182:6: TWENTY_THIRD
                            {
                            TWENTY_THIRD146=(Token)match(input,TWENTY_THIRD,FOLLOW_TWENTY_THIRD_in_spelled_sequence_1_to_311859); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_THIRD.add(TWENTY_THIRD146);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:182:23: ( TWENTY ( DASH )? THIRD )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:182:23: ( TWENTY ( DASH )? THIRD )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:182:24: TWENTY ( DASH )? THIRD
                            {
                            TWENTY147=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_311866); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY147);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:182:31: ( DASH )?
                            int alt40=2;
                            int LA40_0 = input.LA(1);

                            if ( (LA40_0==DASH) ) {
                                alt40=1;
                            }
                            switch (alt40) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:182:31: DASH
                                    {
                                    DASH148=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_311868); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH148);


                                    }
                                    break;

                            }

                            THIRD149=(Token)match(input,THIRD,FOLLOW_THIRD_in_spelled_sequence_1_to_311871); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIRD.add(THIRD149);


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
                    // 182:47: -> INT[\"23\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "23"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 24 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:183:5: ( TWENTY_FOURTH | ( TWENTY ( DASH )? FOURTH ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:183:5: ( TWENTY_FOURTH | ( TWENTY ( DASH )? FOURTH ) )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==TWENTY_FOURTH) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==TWENTY) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:183:6: TWENTY_FOURTH
                            {
                            TWENTY_FOURTH150=(Token)match(input,TWENTY_FOURTH,FOLLOW_TWENTY_FOURTH_in_spelled_sequence_1_to_311887); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_FOURTH.add(TWENTY_FOURTH150);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:183:23: ( TWENTY ( DASH )? FOURTH )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:183:23: ( TWENTY ( DASH )? FOURTH )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:183:24: TWENTY ( DASH )? FOURTH
                            {
                            TWENTY151=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_311893); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY151);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:183:31: ( DASH )?
                            int alt42=2;
                            int LA42_0 = input.LA(1);

                            if ( (LA42_0==DASH) ) {
                                alt42=1;
                            }
                            switch (alt42) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:183:31: DASH
                                    {
                                    DASH152=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_311895); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH152);


                                    }
                                    break;

                            }

                            FOURTH153=(Token)match(input,FOURTH,FOLLOW_FOURTH_in_spelled_sequence_1_to_311898); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FOURTH.add(FOURTH153);


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
                    // 183:47: -> INT[\"24\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "24"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 25 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:184:5: ( TWENTY_FIFTH | ( TWENTY ( DASH )? FIFTH ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:184:5: ( TWENTY_FIFTH | ( TWENTY ( DASH )? FIFTH ) )
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==TWENTY_FIFTH) ) {
                        alt45=1;
                    }
                    else if ( (LA45_0==TWENTY) ) {
                        alt45=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 0, input);

                        throw nvae;
                    }
                    switch (alt45) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:184:6: TWENTY_FIFTH
                            {
                            TWENTY_FIFTH154=(Token)match(input,TWENTY_FIFTH,FOLLOW_TWENTY_FIFTH_in_spelled_sequence_1_to_311913); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_FIFTH.add(TWENTY_FIFTH154);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:184:23: ( TWENTY ( DASH )? FIFTH )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:184:23: ( TWENTY ( DASH )? FIFTH )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:184:24: TWENTY ( DASH )? FIFTH
                            {
                            TWENTY155=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_311920); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY155);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:184:31: ( DASH )?
                            int alt44=2;
                            int LA44_0 = input.LA(1);

                            if ( (LA44_0==DASH) ) {
                                alt44=1;
                            }
                            switch (alt44) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:184:31: DASH
                                    {
                                    DASH156=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_311922); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH156);


                                    }
                                    break;

                            }

                            FIFTH157=(Token)match(input,FIFTH,FOLLOW_FIFTH_in_spelled_sequence_1_to_311925); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FIFTH.add(FIFTH157);


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
                    // 184:47: -> INT[\"25\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "25"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 26 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:185:5: ( TWENTY_SIXTH | ( TWENTY ( DASH )? SIXTH ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:185:5: ( TWENTY_SIXTH | ( TWENTY ( DASH )? SIXTH ) )
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==TWENTY_SIXTH) ) {
                        alt47=1;
                    }
                    else if ( (LA47_0==TWENTY) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:185:6: TWENTY_SIXTH
                            {
                            TWENTY_SIXTH158=(Token)match(input,TWENTY_SIXTH,FOLLOW_TWENTY_SIXTH_in_spelled_sequence_1_to_311941); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_SIXTH.add(TWENTY_SIXTH158);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:185:23: ( TWENTY ( DASH )? SIXTH )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:185:23: ( TWENTY ( DASH )? SIXTH )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:185:24: TWENTY ( DASH )? SIXTH
                            {
                            TWENTY159=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_311948); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY159);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:185:31: ( DASH )?
                            int alt46=2;
                            int LA46_0 = input.LA(1);

                            if ( (LA46_0==DASH) ) {
                                alt46=1;
                            }
                            switch (alt46) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:185:31: DASH
                                    {
                                    DASH160=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_311950); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH160);


                                    }
                                    break;

                            }

                            SIXTH161=(Token)match(input,SIXTH,FOLLOW_SIXTH_in_spelled_sequence_1_to_311953); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SIXTH.add(SIXTH161);


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
                    // 185:47: -> INT[\"26\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "26"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 27 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:186:5: ( TWENTY_SEVENTH | ( TWENTY ( DASH )? SEVENTH ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:186:5: ( TWENTY_SEVENTH | ( TWENTY ( DASH )? SEVENTH ) )
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==TWENTY_SEVENTH) ) {
                        alt49=1;
                    }
                    else if ( (LA49_0==TWENTY) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:186:6: TWENTY_SEVENTH
                            {
                            TWENTY_SEVENTH162=(Token)match(input,TWENTY_SEVENTH,FOLLOW_TWENTY_SEVENTH_in_spelled_sequence_1_to_311969); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_SEVENTH.add(TWENTY_SEVENTH162);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:186:23: ( TWENTY ( DASH )? SEVENTH )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:186:23: ( TWENTY ( DASH )? SEVENTH )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:186:24: TWENTY ( DASH )? SEVENTH
                            {
                            TWENTY163=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_311974); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY163);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:186:31: ( DASH )?
                            int alt48=2;
                            int LA48_0 = input.LA(1);

                            if ( (LA48_0==DASH) ) {
                                alt48=1;
                            }
                            switch (alt48) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:186:31: DASH
                                    {
                                    DASH164=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_311976); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH164);


                                    }
                                    break;

                            }

                            SEVENTH165=(Token)match(input,SEVENTH,FOLLOW_SEVENTH_in_spelled_sequence_1_to_311979); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SEVENTH.add(SEVENTH165);


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
                    // 186:47: -> INT[\"27\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "27"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 28 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:187:5: ( TWENTY_EIGHTH | ( TWENTY ( DASH )? EIGHTH ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:187:5: ( TWENTY_EIGHTH | ( TWENTY ( DASH )? EIGHTH ) )
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==TWENTY_EIGHTH) ) {
                        alt51=1;
                    }
                    else if ( (LA51_0==TWENTY) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:187:6: TWENTY_EIGHTH
                            {
                            TWENTY_EIGHTH166=(Token)match(input,TWENTY_EIGHTH,FOLLOW_TWENTY_EIGHTH_in_spelled_sequence_1_to_311993); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_EIGHTH.add(TWENTY_EIGHTH166);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:187:23: ( TWENTY ( DASH )? EIGHTH )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:187:23: ( TWENTY ( DASH )? EIGHTH )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:187:24: TWENTY ( DASH )? EIGHTH
                            {
                            TWENTY167=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_311999); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY167);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:187:31: ( DASH )?
                            int alt50=2;
                            int LA50_0 = input.LA(1);

                            if ( (LA50_0==DASH) ) {
                                alt50=1;
                            }
                            switch (alt50) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:187:31: DASH
                                    {
                                    DASH168=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312001); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH168);


                                    }
                                    break;

                            }

                            EIGHTH169=(Token)match(input,EIGHTH,FOLLOW_EIGHTH_in_spelled_sequence_1_to_312004); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EIGHTH.add(EIGHTH169);


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
                    // 187:47: -> INT[\"28\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "28"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 29 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:188:5: ( TWENTY_NINTH | ( TWENTY ( DASH )? NINTH ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:188:5: ( TWENTY_NINTH | ( TWENTY ( DASH )? NINTH ) )
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==TWENTY_NINTH) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:188:6: TWENTY_NINTH
                            {
                            TWENTY_NINTH170=(Token)match(input,TWENTY_NINTH,FOLLOW_TWENTY_NINTH_in_spelled_sequence_1_to_312019); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_NINTH.add(TWENTY_NINTH170);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:188:23: ( TWENTY ( DASH )? NINTH )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:188:23: ( TWENTY ( DASH )? NINTH )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:188:24: TWENTY ( DASH )? NINTH
                            {
                            TWENTY171=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_312026); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY171);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:188:31: ( DASH )?
                            int alt52=2;
                            int LA52_0 = input.LA(1);

                            if ( (LA52_0==DASH) ) {
                                alt52=1;
                            }
                            switch (alt52) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:188:31: DASH
                                    {
                                    DASH172=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312028); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH172);


                                    }
                                    break;

                            }

                            NINTH173=(Token)match(input,NINTH,FOLLOW_NINTH_in_spelled_sequence_1_to_312031); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NINTH.add(NINTH173);


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
                    // 188:47: -> INT[\"29\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "29"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 30 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:189:5: THIRTIETH
                    {
                    THIRTIETH174=(Token)match(input,THIRTIETH,FOLLOW_THIRTIETH_in_spelled_sequence_1_to_312046); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTIETH.add(THIRTIETH174);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 189:47: -> INT[\"30\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "30"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 31 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:190:5: ( THIRTY_FIRST | ( THIRTY ( DASH )? FIRST ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:190:5: ( THIRTY_FIRST | ( THIRTY ( DASH )? FIRST ) )
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==THIRTY_FIRST) ) {
                        alt55=1;
                    }
                    else if ( (LA55_0==THIRTY) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:190:6: THIRTY_FIRST
                            {
                            THIRTY_FIRST175=(Token)match(input,THIRTY_FIRST,FOLLOW_THIRTY_FIRST_in_spelled_sequence_1_to_312090); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIRTY_FIRST.add(THIRTY_FIRST175);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:190:23: ( THIRTY ( DASH )? FIRST )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:190:23: ( THIRTY ( DASH )? FIRST )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:190:24: THIRTY ( DASH )? FIRST
                            {
                            THIRTY176=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_sequence_1_to_312097); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY176);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:190:31: ( DASH )?
                            int alt54=2;
                            int LA54_0 = input.LA(1);

                            if ( (LA54_0==DASH) ) {
                                alt54=1;
                            }
                            switch (alt54) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:190:31: DASH
                                    {
                                    DASH177=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312099); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH177);


                                    }
                                    break;

                            }

                            FIRST178=(Token)match(input,FIRST,FOLLOW_FIRST_in_spelled_sequence_1_to_312102); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FIRST.add(FIRST178);


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
                    // 190:47: -> INT[\"31\"]
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:194:1: int_up_to_4_digits : ( int_0_to_99_optional_prefix | int_3_or_4_digits );
    public final DateParser.int_up_to_4_digits_return int_up_to_4_digits() throws RecognitionException {
        DateParser.int_up_to_4_digits_return retval = new DateParser.int_up_to_4_digits_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_0_to_99_optional_prefix_return int_0_to_99_optional_prefix179 = null;

        DateParser.int_3_or_4_digits_return int_3_or_4_digits180 = null;



        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:195:3: ( int_0_to_99_optional_prefix | int_3_or_4_digits )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=PREFIXED_ONE_TO_NINE && LA57_0<=SIXTY_TO_NINETY_NINE)) ) {
                alt57=1;
            }
            else if ( ((LA57_0>=THREE_DIGIT && LA57_0<=FOUR_DIGIT)) ) {
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:195:5: int_0_to_99_optional_prefix
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_int_0_to_99_optional_prefix_in_int_up_to_4_digits2127);
                    int_0_to_99_optional_prefix179=int_0_to_99_optional_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, int_0_to_99_optional_prefix179.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:196:5: int_3_or_4_digits
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_int_3_or_4_digits_in_int_up_to_4_digits2133);
                    int_3_or_4_digits180=int_3_or_4_digits();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, int_3_or_4_digits180.getTree());

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:200:1: int_3_or_4_digits : ( THREE_DIGIT -> INT[$THREE_DIGIT.text] | int_4_digits );
    public final DateParser.int_3_or_4_digits_return int_3_or_4_digits() throws RecognitionException {
        DateParser.int_3_or_4_digits_return retval = new DateParser.int_3_or_4_digits_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THREE_DIGIT181=null;
        DateParser.int_4_digits_return int_4_digits182 = null;


        Object THREE_DIGIT181_tree=null;
        RewriteRuleTokenStream stream_THREE_DIGIT=new RewriteRuleTokenStream(adaptor,"token THREE_DIGIT");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:201:3: ( THREE_DIGIT -> INT[$THREE_DIGIT.text] | int_4_digits )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==THREE_DIGIT) ) {
                alt58=1;
            }
            else if ( (LA58_0==FOUR_DIGIT) ) {
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:201:5: THREE_DIGIT
                    {
                    THREE_DIGIT181=(Token)match(input,THREE_DIGIT,FOLLOW_THREE_DIGIT_in_int_3_or_4_digits2150); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THREE_DIGIT.add(THREE_DIGIT181);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 201:17: -> INT[$THREE_DIGIT.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (THREE_DIGIT181!=null?THREE_DIGIT181.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:202:5: int_4_digits
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_int_4_digits_in_int_3_or_4_digits2161);
                    int_4_digits182=int_4_digits();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, int_4_digits182.getTree());

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:206:1: int_4_digits : FOUR_DIGIT -> INT[$FOUR_DIGIT.text] ;
    public final DateParser.int_4_digits_return int_4_digits() throws RecognitionException {
        DateParser.int_4_digits_return retval = new DateParser.int_4_digits_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FOUR_DIGIT183=null;

        Object FOUR_DIGIT183_tree=null;
        RewriteRuleTokenStream stream_FOUR_DIGIT=new RewriteRuleTokenStream(adaptor,"token FOUR_DIGIT");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:207:3: ( FOUR_DIGIT -> INT[$FOUR_DIGIT.text] )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:207:5: FOUR_DIGIT
            {
            FOUR_DIGIT183=(Token)match(input,FOUR_DIGIT,FOLLOW_FOUR_DIGIT_in_int_4_digits2177); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FOUR_DIGIT.add(FOUR_DIGIT183);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 207:16: -> INT[$FOUR_DIGIT.text]
            {
                adaptor.addChild(root_0, (Object)adaptor.create(INT, (FOUR_DIGIT183!=null?FOUR_DIGIT183.getText():null)));

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:210:1: int_1_to_12 : ( PREFIXED_ONE_TO_NINE -> INT[$PREFIXED_ONE_TO_NINE.text] | ONE_TO_NINE -> INT[$ONE_TO_NINE.text] | TEN_TO_TWELVE -> INT[$TEN_TO_TWELVE.text] );
    public final DateParser.int_1_to_12_return int_1_to_12() throws RecognitionException {
        DateParser.int_1_to_12_return retval = new DateParser.int_1_to_12_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PREFIXED_ONE_TO_NINE184=null;
        Token ONE_TO_NINE185=null;
        Token TEN_TO_TWELVE186=null;

        Object PREFIXED_ONE_TO_NINE184_tree=null;
        Object ONE_TO_NINE185_tree=null;
        Object TEN_TO_TWELVE186_tree=null;
        RewriteRuleTokenStream stream_ONE_TO_NINE=new RewriteRuleTokenStream(adaptor,"token ONE_TO_NINE");
        RewriteRuleTokenStream stream_TEN_TO_TWELVE=new RewriteRuleTokenStream(adaptor,"token TEN_TO_TWELVE");
        RewriteRuleTokenStream stream_PREFIXED_ONE_TO_NINE=new RewriteRuleTokenStream(adaptor,"token PREFIXED_ONE_TO_NINE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:211:3: ( PREFIXED_ONE_TO_NINE -> INT[$PREFIXED_ONE_TO_NINE.text] | ONE_TO_NINE -> INT[$ONE_TO_NINE.text] | TEN_TO_TWELVE -> INT[$TEN_TO_TWELVE.text] )
            int alt59=3;
            switch ( input.LA(1) ) {
            case PREFIXED_ONE_TO_NINE:
                {
                alt59=1;
                }
                break;
            case ONE_TO_NINE:
                {
                alt59=2;
                }
                break;
            case TEN_TO_TWELVE:
                {
                alt59=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:211:5: PREFIXED_ONE_TO_NINE
                    {
                    PREFIXED_ONE_TO_NINE184=(Token)match(input,PREFIXED_ONE_TO_NINE,FOLLOW_PREFIXED_ONE_TO_NINE_in_int_1_to_122197); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PREFIXED_ONE_TO_NINE.add(PREFIXED_ONE_TO_NINE184);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 211:26: -> INT[$PREFIXED_ONE_TO_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (PREFIXED_ONE_TO_NINE184!=null?PREFIXED_ONE_TO_NINE184.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:212:5: ONE_TO_NINE
                    {
                    ONE_TO_NINE185=(Token)match(input,ONE_TO_NINE,FOLLOW_ONE_TO_NINE_in_int_1_to_122208); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE_TO_NINE.add(ONE_TO_NINE185);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 212:26: -> INT[$ONE_TO_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (ONE_TO_NINE185!=null?ONE_TO_NINE185.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:213:5: TEN_TO_TWELVE
                    {
                    TEN_TO_TWELVE186=(Token)match(input,TEN_TO_TWELVE,FOLLOW_TEN_TO_TWELVE_in_int_1_to_122228); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TEN_TO_TWELVE.add(TEN_TO_TWELVE186);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 213:26: -> INT[$TEN_TO_TWELVE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TEN_TO_TWELVE186!=null?TEN_TO_TWELVE186.getText():null)));

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:217:1: int_0_to_23 : ( TWO_ZEROS -> INT[$TWO_ZEROS.text] | ZERO -> INT[$ZERO.text] | int_1_to_12 | THIRTEEN_TO_TWENTY_THREE -> INT[$THIRTEEN_TO_TWENTY_THREE.text] );
    public final DateParser.int_0_to_23_return int_0_to_23() throws RecognitionException {
        DateParser.int_0_to_23_return retval = new DateParser.int_0_to_23_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TWO_ZEROS187=null;
        Token ZERO188=null;
        Token THIRTEEN_TO_TWENTY_THREE190=null;
        DateParser.int_1_to_12_return int_1_to_12189 = null;


        Object TWO_ZEROS187_tree=null;
        Object ZERO188_tree=null;
        Object THIRTEEN_TO_TWENTY_THREE190_tree=null;
        RewriteRuleTokenStream stream_TWO_ZEROS=new RewriteRuleTokenStream(adaptor,"token TWO_ZEROS");
        RewriteRuleTokenStream stream_THIRTEEN_TO_TWENTY_THREE=new RewriteRuleTokenStream(adaptor,"token THIRTEEN_TO_TWENTY_THREE");
        RewriteRuleTokenStream stream_ZERO=new RewriteRuleTokenStream(adaptor,"token ZERO");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:218:3: ( TWO_ZEROS -> INT[$TWO_ZEROS.text] | ZERO -> INT[$ZERO.text] | int_1_to_12 | THIRTEEN_TO_TWENTY_THREE -> INT[$THIRTEEN_TO_TWENTY_THREE.text] )
            int alt60=4;
            switch ( input.LA(1) ) {
            case TWO_ZEROS:
                {
                alt60=1;
                }
                break;
            case ZERO:
                {
                alt60=2;
                }
                break;
            case PREFIXED_ONE_TO_NINE:
            case ONE_TO_NINE:
            case TEN_TO_TWELVE:
                {
                alt60=3;
                }
                break;
            case THIRTEEN_TO_TWENTY_THREE:
                {
                alt60=4;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:218:5: TWO_ZEROS
                    {
                    TWO_ZEROS187=(Token)match(input,TWO_ZEROS,FOLLOW_TWO_ZEROS_in_int_0_to_232256); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO_ZEROS.add(TWO_ZEROS187);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 218:30: -> INT[$TWO_ZEROS.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TWO_ZEROS187!=null?TWO_ZEROS187.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:219:5: ZERO
                    {
                    ZERO188=(Token)match(input,ZERO,FOLLOW_ZERO_in_int_0_to_232282); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ZERO.add(ZERO188);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 219:30: -> INT[$ZERO.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (ZERO188!=null?ZERO188.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:220:5: int_1_to_12
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_int_1_to_12_in_int_0_to_232313);
                    int_1_to_12189=int_1_to_12();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, int_1_to_12189.getTree());

                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:221:5: THIRTEEN_TO_TWENTY_THREE
                    {
                    THIRTEEN_TO_TWENTY_THREE190=(Token)match(input,THIRTEEN_TO_TWENTY_THREE,FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_int_0_to_232319); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEEN_TO_TWENTY_THREE.add(THIRTEEN_TO_TWENTY_THREE190);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 221:30: -> INT[$THIRTEEN_TO_TWENTY_THREE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (THIRTEEN_TO_TWENTY_THREE190!=null?THIRTEEN_TO_TWENTY_THREE190.getText():null)));

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:225:1: int_0_to_59 : ( int_0_to_23 | TWENTY_FOUR_TO_THIRTY_ONE -> INT[$TWENTY_FOUR_TO_THIRTY_ONE.text] | THIRTY_TWO_TO_FIFTY_NINE -> INT[$THIRTY_TWO_TO_FIFTY_NINE.text] );
    public final DateParser.int_0_to_59_return int_0_to_59() throws RecognitionException {
        DateParser.int_0_to_59_return retval = new DateParser.int_0_to_59_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TWENTY_FOUR_TO_THIRTY_ONE192=null;
        Token THIRTY_TWO_TO_FIFTY_NINE193=null;
        DateParser.int_0_to_23_return int_0_to_23191 = null;


        Object TWENTY_FOUR_TO_THIRTY_ONE192_tree=null;
        Object THIRTY_TWO_TO_FIFTY_NINE193_tree=null;
        RewriteRuleTokenStream stream_THIRTY_TWO_TO_FIFTY_NINE=new RewriteRuleTokenStream(adaptor,"token THIRTY_TWO_TO_FIFTY_NINE");
        RewriteRuleTokenStream stream_TWENTY_FOUR_TO_THIRTY_ONE=new RewriteRuleTokenStream(adaptor,"token TWENTY_FOUR_TO_THIRTY_ONE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:226:3: ( int_0_to_23 | TWENTY_FOUR_TO_THIRTY_ONE -> INT[$TWENTY_FOUR_TO_THIRTY_ONE.text] | THIRTY_TWO_TO_FIFTY_NINE -> INT[$THIRTY_TWO_TO_FIFTY_NINE.text] )
            int alt61=3;
            switch ( input.LA(1) ) {
            case PREFIXED_ONE_TO_NINE:
            case ONE_TO_NINE:
            case TEN_TO_TWELVE:
            case TWO_ZEROS:
            case ZERO:
            case THIRTEEN_TO_TWENTY_THREE:
                {
                alt61=1;
                }
                break;
            case TWENTY_FOUR_TO_THIRTY_ONE:
                {
                alt61=2;
                }
                break;
            case THIRTY_TWO_TO_FIFTY_NINE:
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:226:5: int_0_to_23
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_int_0_to_23_in_int_0_to_592340);
                    int_0_to_23191=int_0_to_23();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, int_0_to_23191.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:227:5: TWENTY_FOUR_TO_THIRTY_ONE
                    {
                    TWENTY_FOUR_TO_THIRTY_ONE192=(Token)match(input,TWENTY_FOUR_TO_THIRTY_ONE,FOLLOW_TWENTY_FOUR_TO_THIRTY_ONE_in_int_0_to_592346); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY_FOUR_TO_THIRTY_ONE.add(TWENTY_FOUR_TO_THIRTY_ONE192);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 227:31: -> INT[$TWENTY_FOUR_TO_THIRTY_ONE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TWENTY_FOUR_TO_THIRTY_ONE192!=null?TWENTY_FOUR_TO_THIRTY_ONE192.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:228:5: THIRTY_TWO_TO_FIFTY_NINE
                    {
                    THIRTY_TWO_TO_FIFTY_NINE193=(Token)match(input,THIRTY_TWO_TO_FIFTY_NINE,FOLLOW_THIRTY_TWO_TO_FIFTY_NINE_in_int_0_to_592357); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY_TWO_TO_FIFTY_NINE.add(THIRTY_TWO_TO_FIFTY_NINE193);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 228:31: -> INT[$THIRTY_TWO_TO_FIFTY_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (THIRTY_TWO_TO_FIFTY_NINE193!=null?THIRTY_TWO_TO_FIFTY_NINE193.getText():null)));

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:232:1: int_0_to_99_no_prefix : ( int_0_to_59 | SIXTY_TO_NINETY_NINE -> INT[$SIXTY_TO_NINETY_NINE.text] );
    public final DateParser.int_0_to_99_no_prefix_return int_0_to_99_no_prefix() throws RecognitionException {
        DateParser.int_0_to_99_no_prefix_return retval = new DateParser.int_0_to_99_no_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SIXTY_TO_NINETY_NINE195=null;
        DateParser.int_0_to_59_return int_0_to_59194 = null;


        Object SIXTY_TO_NINETY_NINE195_tree=null;
        RewriteRuleTokenStream stream_SIXTY_TO_NINETY_NINE=new RewriteRuleTokenStream(adaptor,"token SIXTY_TO_NINETY_NINE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:233:3: ( int_0_to_59 | SIXTY_TO_NINETY_NINE -> INT[$SIXTY_TO_NINETY_NINE.text] )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=PREFIXED_ONE_TO_NINE && LA62_0<=THIRTY_TWO_TO_FIFTY_NINE)) ) {
                alt62=1;
            }
            else if ( (LA62_0==SIXTY_TO_NINETY_NINE) ) {
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:233:5: int_0_to_59
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_int_0_to_59_in_int_0_to_99_no_prefix2379);
                    int_0_to_59194=int_0_to_59();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, int_0_to_59194.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:234:5: SIXTY_TO_NINETY_NINE
                    {
                    SIXTY_TO_NINETY_NINE195=(Token)match(input,SIXTY_TO_NINETY_NINE,FOLLOW_SIXTY_TO_NINETY_NINE_in_int_0_to_99_no_prefix2385); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTY_TO_NINETY_NINE.add(SIXTY_TO_NINETY_NINE195);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 234:31: -> INT[$SIXTY_TO_NINETY_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (SIXTY_TO_NINETY_NINE195!=null?SIXTY_TO_NINETY_NINE195.getText():null)));

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:237:1: int_0_to_99_with_prefix : ( TWO_ZEROS -> INT[$TWO_ZEROS.text] | PREFIXED_ONE_TO_NINE -> INT[$PREFIXED_ONE_TO_NINE.text] | TEN_TO_TWELVE -> INT[$TEN_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INT[$THIRTEEN_TO_TWENTY_THREE.text] | TWENTY_FOUR_TO_THIRTY_ONE -> INT[$TWENTY_FOUR_TO_THIRTY_ONE.text] | THIRTY_TWO_TO_FIFTY_NINE -> INT[$THIRTY_TWO_TO_FIFTY_NINE.text] | SIXTY_TO_NINETY_NINE -> INT[$SIXTY_TO_NINETY_NINE.text] );
    public final DateParser.int_0_to_99_with_prefix_return int_0_to_99_with_prefix() throws RecognitionException {
        DateParser.int_0_to_99_with_prefix_return retval = new DateParser.int_0_to_99_with_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TWO_ZEROS196=null;
        Token PREFIXED_ONE_TO_NINE197=null;
        Token TEN_TO_TWELVE198=null;
        Token THIRTEEN_TO_TWENTY_THREE199=null;
        Token TWENTY_FOUR_TO_THIRTY_ONE200=null;
        Token THIRTY_TWO_TO_FIFTY_NINE201=null;
        Token SIXTY_TO_NINETY_NINE202=null;

        Object TWO_ZEROS196_tree=null;
        Object PREFIXED_ONE_TO_NINE197_tree=null;
        Object TEN_TO_TWELVE198_tree=null;
        Object THIRTEEN_TO_TWENTY_THREE199_tree=null;
        Object TWENTY_FOUR_TO_THIRTY_ONE200_tree=null;
        Object THIRTY_TWO_TO_FIFTY_NINE201_tree=null;
        Object SIXTY_TO_NINETY_NINE202_tree=null;
        RewriteRuleTokenStream stream_SIXTY_TO_NINETY_NINE=new RewriteRuleTokenStream(adaptor,"token SIXTY_TO_NINETY_NINE");
        RewriteRuleTokenStream stream_TWO_ZEROS=new RewriteRuleTokenStream(adaptor,"token TWO_ZEROS");
        RewriteRuleTokenStream stream_THIRTEEN_TO_TWENTY_THREE=new RewriteRuleTokenStream(adaptor,"token THIRTEEN_TO_TWENTY_THREE");
        RewriteRuleTokenStream stream_THIRTY_TWO_TO_FIFTY_NINE=new RewriteRuleTokenStream(adaptor,"token THIRTY_TWO_TO_FIFTY_NINE");
        RewriteRuleTokenStream stream_TEN_TO_TWELVE=new RewriteRuleTokenStream(adaptor,"token TEN_TO_TWELVE");
        RewriteRuleTokenStream stream_PREFIXED_ONE_TO_NINE=new RewriteRuleTokenStream(adaptor,"token PREFIXED_ONE_TO_NINE");
        RewriteRuleTokenStream stream_TWENTY_FOUR_TO_THIRTY_ONE=new RewriteRuleTokenStream(adaptor,"token TWENTY_FOUR_TO_THIRTY_ONE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:238:3: ( TWO_ZEROS -> INT[$TWO_ZEROS.text] | PREFIXED_ONE_TO_NINE -> INT[$PREFIXED_ONE_TO_NINE.text] | TEN_TO_TWELVE -> INT[$TEN_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INT[$THIRTEEN_TO_TWENTY_THREE.text] | TWENTY_FOUR_TO_THIRTY_ONE -> INT[$TWENTY_FOUR_TO_THIRTY_ONE.text] | THIRTY_TWO_TO_FIFTY_NINE -> INT[$THIRTY_TWO_TO_FIFTY_NINE.text] | SIXTY_TO_NINETY_NINE -> INT[$SIXTY_TO_NINETY_NINE.text] )
            int alt63=7;
            switch ( input.LA(1) ) {
            case TWO_ZEROS:
                {
                alt63=1;
                }
                break;
            case PREFIXED_ONE_TO_NINE:
                {
                alt63=2;
                }
                break;
            case TEN_TO_TWELVE:
                {
                alt63=3;
                }
                break;
            case THIRTEEN_TO_TWENTY_THREE:
                {
                alt63=4;
                }
                break;
            case TWENTY_FOUR_TO_THIRTY_ONE:
                {
                alt63=5;
                }
                break;
            case THIRTY_TWO_TO_FIFTY_NINE:
                {
                alt63=6;
                }
                break;
            case SIXTY_TO_NINETY_NINE:
                {
                alt63=7;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:238:5: TWO_ZEROS
                    {
                    TWO_ZEROS196=(Token)match(input,TWO_ZEROS,FOLLOW_TWO_ZEROS_in_int_0_to_99_with_prefix2410); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO_ZEROS.add(TWO_ZEROS196);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 238:31: -> INT[$TWO_ZEROS.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TWO_ZEROS196!=null?TWO_ZEROS196.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:239:5: PREFIXED_ONE_TO_NINE
                    {
                    PREFIXED_ONE_TO_NINE197=(Token)match(input,PREFIXED_ONE_TO_NINE,FOLLOW_PREFIXED_ONE_TO_NINE_in_int_0_to_99_with_prefix2437); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PREFIXED_ONE_TO_NINE.add(PREFIXED_ONE_TO_NINE197);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 239:31: -> INT[$PREFIXED_ONE_TO_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (PREFIXED_ONE_TO_NINE197!=null?PREFIXED_ONE_TO_NINE197.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:240:5: TEN_TO_TWELVE
                    {
                    TEN_TO_TWELVE198=(Token)match(input,TEN_TO_TWELVE,FOLLOW_TEN_TO_TWELVE_in_int_0_to_99_with_prefix2453); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TEN_TO_TWELVE.add(TEN_TO_TWELVE198);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 240:31: -> INT[$TEN_TO_TWELVE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TEN_TO_TWELVE198!=null?TEN_TO_TWELVE198.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:241:5: THIRTEEN_TO_TWENTY_THREE
                    {
                    THIRTEEN_TO_TWENTY_THREE199=(Token)match(input,THIRTEEN_TO_TWENTY_THREE,FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_int_0_to_99_with_prefix2476); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEEN_TO_TWENTY_THREE.add(THIRTEEN_TO_TWENTY_THREE199);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 241:31: -> INT[$THIRTEEN_TO_TWENTY_THREE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (THIRTEEN_TO_TWENTY_THREE199!=null?THIRTEEN_TO_TWENTY_THREE199.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:242:5: TWENTY_FOUR_TO_THIRTY_ONE
                    {
                    TWENTY_FOUR_TO_THIRTY_ONE200=(Token)match(input,TWENTY_FOUR_TO_THIRTY_ONE,FOLLOW_TWENTY_FOUR_TO_THIRTY_ONE_in_int_0_to_99_with_prefix2488); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY_FOUR_TO_THIRTY_ONE.add(TWENTY_FOUR_TO_THIRTY_ONE200);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 242:31: -> INT[$TWENTY_FOUR_TO_THIRTY_ONE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TWENTY_FOUR_TO_THIRTY_ONE200!=null?TWENTY_FOUR_TO_THIRTY_ONE200.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:243:5: THIRTY_TWO_TO_FIFTY_NINE
                    {
                    THIRTY_TWO_TO_FIFTY_NINE201=(Token)match(input,THIRTY_TWO_TO_FIFTY_NINE,FOLLOW_THIRTY_TWO_TO_FIFTY_NINE_in_int_0_to_99_with_prefix2499); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY_TWO_TO_FIFTY_NINE.add(THIRTY_TWO_TO_FIFTY_NINE201);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 243:31: -> INT[$THIRTY_TWO_TO_FIFTY_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (THIRTY_TWO_TO_FIFTY_NINE201!=null?THIRTY_TWO_TO_FIFTY_NINE201.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:244:5: SIXTY_TO_NINETY_NINE
                    {
                    SIXTY_TO_NINETY_NINE202=(Token)match(input,SIXTY_TO_NINETY_NINE,FOLLOW_SIXTY_TO_NINETY_NINE_in_int_0_to_99_with_prefix2511); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTY_TO_NINETY_NINE.add(SIXTY_TO_NINETY_NINE202);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 244:31: -> INT[$SIXTY_TO_NINETY_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (SIXTY_TO_NINETY_NINE202!=null?SIXTY_TO_NINETY_NINE202.getText():null)));

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:247:1: int_0_to_99_optional_prefix : ( int_0_to_99_with_prefix | ONE_TO_NINE -> INT[$ONE_TO_NINE.text] | ZERO -> INT[$ZERO.text] );
    public final DateParser.int_0_to_99_optional_prefix_return int_0_to_99_optional_prefix() throws RecognitionException {
        DateParser.int_0_to_99_optional_prefix_return retval = new DateParser.int_0_to_99_optional_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ONE_TO_NINE204=null;
        Token ZERO205=null;
        DateParser.int_0_to_99_with_prefix_return int_0_to_99_with_prefix203 = null;


        Object ONE_TO_NINE204_tree=null;
        Object ZERO205_tree=null;
        RewriteRuleTokenStream stream_ONE_TO_NINE=new RewriteRuleTokenStream(adaptor,"token ONE_TO_NINE");
        RewriteRuleTokenStream stream_ZERO=new RewriteRuleTokenStream(adaptor,"token ZERO");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:248:3: ( int_0_to_99_with_prefix | ONE_TO_NINE -> INT[$ONE_TO_NINE.text] | ZERO -> INT[$ZERO.text] )
            int alt64=3;
            switch ( input.LA(1) ) {
            case PREFIXED_ONE_TO_NINE:
            case TEN_TO_TWELVE:
            case TWO_ZEROS:
            case THIRTEEN_TO_TWENTY_THREE:
            case TWENTY_FOUR_TO_THIRTY_ONE:
            case THIRTY_TWO_TO_FIFTY_NINE:
            case SIXTY_TO_NINETY_NINE:
                {
                alt64=1;
                }
                break;
            case ONE_TO_NINE:
                {
                alt64=2;
                }
                break;
            case ZERO:
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:248:5: int_0_to_99_with_prefix
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_int_0_to_99_with_prefix_in_int_0_to_99_optional_prefix2536);
                    int_0_to_99_with_prefix203=int_0_to_99_with_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, int_0_to_99_with_prefix203.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:249:5: ONE_TO_NINE
                    {
                    ONE_TO_NINE204=(Token)match(input,ONE_TO_NINE,FOLLOW_ONE_TO_NINE_in_int_0_to_99_optional_prefix2542); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE_TO_NINE.add(ONE_TO_NINE204);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 249:17: -> INT[$ONE_TO_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (ONE_TO_NINE204!=null?ONE_TO_NINE204.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:250:5: ZERO
                    {
                    ZERO205=(Token)match(input,ZERO,FOLLOW_ZERO_in_int_0_to_99_optional_prefix2553); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ZERO.add(ZERO205);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 250:17: -> INT[$ZERO.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (ZERO205!=null?ZERO205.getText():null)));

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:254:1: int_1_to_31 : ( PREFIXED_ONE_TO_NINE -> INT[$PREFIXED_ONE_TO_NINE.text] | ONE_TO_NINE -> INT[$ONE_TO_NINE.text] | int_10_to_31 );
    public final DateParser.int_1_to_31_return int_1_to_31() throws RecognitionException {
        DateParser.int_1_to_31_return retval = new DateParser.int_1_to_31_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PREFIXED_ONE_TO_NINE206=null;
        Token ONE_TO_NINE207=null;
        DateParser.int_10_to_31_return int_10_to_31208 = null;


        Object PREFIXED_ONE_TO_NINE206_tree=null;
        Object ONE_TO_NINE207_tree=null;
        RewriteRuleTokenStream stream_ONE_TO_NINE=new RewriteRuleTokenStream(adaptor,"token ONE_TO_NINE");
        RewriteRuleTokenStream stream_PREFIXED_ONE_TO_NINE=new RewriteRuleTokenStream(adaptor,"token PREFIXED_ONE_TO_NINE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:255:3: ( PREFIXED_ONE_TO_NINE -> INT[$PREFIXED_ONE_TO_NINE.text] | ONE_TO_NINE -> INT[$ONE_TO_NINE.text] | int_10_to_31 )
            int alt65=3;
            switch ( input.LA(1) ) {
            case PREFIXED_ONE_TO_NINE:
                {
                alt65=1;
                }
                break;
            case ONE_TO_NINE:
                {
                alt65=2;
                }
                break;
            case TEN_TO_TWELVE:
            case THIRTEEN_TO_TWENTY_THREE:
            case TWENTY_FOUR_TO_THIRTY_ONE:
                {
                alt65=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:255:5: PREFIXED_ONE_TO_NINE
                    {
                    PREFIXED_ONE_TO_NINE206=(Token)match(input,PREFIXED_ONE_TO_NINE,FOLLOW_PREFIXED_ONE_TO_NINE_in_int_1_to_312579); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PREFIXED_ONE_TO_NINE.add(PREFIXED_ONE_TO_NINE206);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 255:31: -> INT[$PREFIXED_ONE_TO_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (PREFIXED_ONE_TO_NINE206!=null?PREFIXED_ONE_TO_NINE206.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:256:5: ONE_TO_NINE
                    {
                    ONE_TO_NINE207=(Token)match(input,ONE_TO_NINE,FOLLOW_ONE_TO_NINE_in_int_1_to_312595); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE_TO_NINE.add(ONE_TO_NINE207);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 256:31: -> INT[$ONE_TO_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (ONE_TO_NINE207!=null?ONE_TO_NINE207.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:257:5: int_10_to_31
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_int_10_to_31_in_int_1_to_312620);
                    int_10_to_31208=int_10_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, int_10_to_31208.getTree());

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:260:1: int_1_to_31_no_prefix : ( ONE_TO_NINE -> INT[$ONE_TO_NINE.text] | int_10_to_31 );
    public final DateParser.int_1_to_31_no_prefix_return int_1_to_31_no_prefix() throws RecognitionException {
        DateParser.int_1_to_31_no_prefix_return retval = new DateParser.int_1_to_31_no_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ONE_TO_NINE209=null;
        DateParser.int_10_to_31_return int_10_to_31210 = null;


        Object ONE_TO_NINE209_tree=null;
        RewriteRuleTokenStream stream_ONE_TO_NINE=new RewriteRuleTokenStream(adaptor,"token ONE_TO_NINE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:3: ( ONE_TO_NINE -> INT[$ONE_TO_NINE.text] | int_10_to_31 )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==ONE_TO_NINE) ) {
                alt66=1;
            }
            else if ( (LA66_0==TEN_TO_TWELVE||(LA66_0>=THIRTEEN_TO_TWENTY_THREE && LA66_0<=TWENTY_FOUR_TO_THIRTY_ONE)) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:5: ONE_TO_NINE
                    {
                    ONE_TO_NINE209=(Token)match(input,ONE_TO_NINE,FOLLOW_ONE_TO_NINE_in_int_1_to_31_no_prefix2635); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE_TO_NINE.add(ONE_TO_NINE209);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 261:17: -> INT[$ONE_TO_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (ONE_TO_NINE209!=null?ONE_TO_NINE209.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:5: int_10_to_31
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_int_10_to_31_in_int_1_to_31_no_prefix2646);
                    int_10_to_31210=int_10_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, int_10_to_31210.getTree());

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:265:1: int_10_to_31 : ( TEN_TO_TWELVE -> INT[$TEN_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INT[$THIRTEEN_TO_TWENTY_THREE.text] | TWENTY_FOUR_TO_THIRTY_ONE -> INT[$TWENTY_FOUR_TO_THIRTY_ONE.text] );
    public final DateParser.int_10_to_31_return int_10_to_31() throws RecognitionException {
        DateParser.int_10_to_31_return retval = new DateParser.int_10_to_31_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TEN_TO_TWELVE211=null;
        Token THIRTEEN_TO_TWENTY_THREE212=null;
        Token TWENTY_FOUR_TO_THIRTY_ONE213=null;

        Object TEN_TO_TWELVE211_tree=null;
        Object THIRTEEN_TO_TWENTY_THREE212_tree=null;
        Object TWENTY_FOUR_TO_THIRTY_ONE213_tree=null;
        RewriteRuleTokenStream stream_THIRTEEN_TO_TWENTY_THREE=new RewriteRuleTokenStream(adaptor,"token THIRTEEN_TO_TWENTY_THREE");
        RewriteRuleTokenStream stream_TEN_TO_TWELVE=new RewriteRuleTokenStream(adaptor,"token TEN_TO_TWELVE");
        RewriteRuleTokenStream stream_TWENTY_FOUR_TO_THIRTY_ONE=new RewriteRuleTokenStream(adaptor,"token TWENTY_FOUR_TO_THIRTY_ONE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:266:3: ( TEN_TO_TWELVE -> INT[$TEN_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INT[$THIRTEEN_TO_TWENTY_THREE.text] | TWENTY_FOUR_TO_THIRTY_ONE -> INT[$TWENTY_FOUR_TO_THIRTY_ONE.text] )
            int alt67=3;
            switch ( input.LA(1) ) {
            case TEN_TO_TWELVE:
                {
                alt67=1;
                }
                break;
            case THIRTEEN_TO_TWENTY_THREE:
                {
                alt67=2;
                }
                break;
            case TWENTY_FOUR_TO_THIRTY_ONE:
                {
                alt67=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:266:5: TEN_TO_TWELVE
                    {
                    TEN_TO_TWELVE211=(Token)match(input,TEN_TO_TWELVE,FOLLOW_TEN_TO_TWELVE_in_int_10_to_312661); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TEN_TO_TWELVE.add(TEN_TO_TWELVE211);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 266:31: -> INT[$TEN_TO_TWELVE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TEN_TO_TWELVE211!=null?TEN_TO_TWELVE211.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:267:5: THIRTEEN_TO_TWENTY_THREE
                    {
                    THIRTEEN_TO_TWENTY_THREE212=(Token)match(input,THIRTEEN_TO_TWENTY_THREE,FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_int_10_to_312684); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEEN_TO_TWENTY_THREE.add(THIRTEEN_TO_TWENTY_THREE212);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 267:31: -> INT[$THIRTEEN_TO_TWENTY_THREE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (THIRTEEN_TO_TWENTY_THREE212!=null?THIRTEEN_TO_TWENTY_THREE212.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:268:5: TWENTY_FOUR_TO_THIRTY_ONE
                    {
                    TWENTY_FOUR_TO_THIRTY_ONE213=(Token)match(input,TWENTY_FOUR_TO_THIRTY_ONE,FOLLOW_TWENTY_FOUR_TO_THIRTY_ONE_in_int_10_to_312696); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY_FOUR_TO_THIRTY_ONE.add(TWENTY_FOUR_TO_THIRTY_ONE213);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 268:31: -> INT[$TWENTY_FOUR_TO_THIRTY_ONE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TWENTY_FOUR_TO_THIRTY_ONE213!=null?TWENTY_FOUR_TO_THIRTY_ONE213.getText():null)));

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
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:7: ( date ( COMMA | AT )? time )
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:8: date ( COMMA | AT )? time
        {
        pushFollow(FOLLOW_date_in_synpred1_Date137);
        date();

        state._fsp--;
        if (state.failed) return ;
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:13: ( COMMA | AT )?
        int alt68=2;
        int LA68_0 = input.LA(1);

        if ( (LA68_0==COMMA||LA68_0==AT) ) {
            alt68=1;
        }
        switch (alt68) {
            case 1 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:
                {
                if ( input.LA(1)==COMMA||input.LA(1)==AT ) {
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

        pushFollow(FOLLOW_time_in_synpred1_Date148);
        time();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_Date

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


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA2 dfa2 = new DFA2(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA56 dfa56 = new DFA56(this);
    static final String DFA3_eotS =
        "\u0114\uffff";
    static final String DFA3_eofS =
        "\2\uffff\4\146\101\uffff\4\146\3\uffff\12\146\1\uffff\14\u00d4\2"+
        "\uffff\14\u00d4\26\uffff\71\u00d4\3\uffff\5\u00d4\5\146\3\uffff"+
        "\2\u00d4\4\uffff\2\u00d4\1\uffff\22\u00d4\1\uffff\2\u00d4\3\uffff"+
        "\7\u00d4\1\uffff\27\u00d4\2\uffff";
    static final String DFA3_minS =
        "\1\26\1\46\4\23\65\25\14\55\4\23\3\143\12\23\1\uffff\14\23\1\26"+
        "\1\uffff\14\23\1\55\22\25\1\55\2\25\71\23\10\46\5\23\1\42\1\43\1"+
        "\143\2\51\1\uffff\1\42\1\43\1\143\2\51\1\55\22\23\1\55\2\23\1\143"+
        "\1\141\1\44\7\51\1\44\27\51\2\45";
    static final String DFA3_maxS =
        "\1\151\1\47\4\152\24\41\1\112\1\102\37\41\14\151\2\152\2\151\1\145"+
        "\1\151\1\152\12\151\1\uffff\14\151\1\41\1\uffff\14\150\1\112\22"+
        "\41\1\102\2\41\71\150\3\47\5\150\5\151\1\142\1\43\1\153\2\150\1"+
        "\uffff\1\142\1\43\1\153\2\150\1\112\22\150\1\102\2\150\1\151\1\153"+
        "\1\44\7\150\1\44\27\150\2\142";
    static final String DFA3_acceptS =
        "\130\uffff\1\1\15\uffff\1\3\155\uffff\1\2\77\uffff";
    static final String DFA3_specialS =
        "\u0114\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105"+
            "\1\106\7\uffff\1\111\1\112\2\uffff\1\7\1\10\1\11\1\12\1\13\1"+
            "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1"+
            "\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1"+
            "\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1"+
            "\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\uffff"+
            "\1\1\1\2\1\3\1\4\1\107\1\110\1\5\1\6",
            "\2\113",
            "\2\130\1\145\1\131\1\132\1\133\1\134\1\135\1\136\1\137\1\140"+
            "\1\141\1\142\1\143\1\144\4\uffff\2\114\1\115\2\uffff\1\126\1"+
            "\127\64\130\1\uffff\1\130\1\120\1\121\1\122\1\116\1\117\1\123"+
            "\1\124\1\125",
            "\2\130\1\145\1\131\1\132\1\133\1\134\1\135\1\136\1\137\1\140"+
            "\1\141\1\142\1\143\1\144\4\uffff\2\114\1\115\2\uffff\1\126\1"+
            "\127\64\130\1\uffff\1\130\1\120\1\121\1\122\1\116\1\117\1\123"+
            "\1\124\1\125",
            "\2\130\1\145\1\131\1\132\1\133\1\134\1\135\1\136\1\137\1\140"+
            "\1\141\1\142\1\143\1\144\4\uffff\2\114\1\115\2\uffff\1\126\1"+
            "\127\64\130\1\uffff\1\130\1\120\1\121\1\122\1\116\1\117\1\123"+
            "\1\124\1\125",
            "\2\130\1\145\1\131\1\132\1\133\1\134\1\135\1\136\1\137\1\140"+
            "\1\141\1\142\1\143\1\144\6\uffff\1\115\2\uffff\1\126\1\127\64"+
            "\130\1\uffff\1\130\1\120\1\121\1\122\1\116\1\117\1\123\1\124"+
            "\1\125",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162\4\uffff\1\163\6\uffff\1\u0082\1\173\1\176"+
            "\1\u0083\1\u0085\1\164\1\174\1\177\1\166\14\uffff\1\171\1\167"+
            "\1\u0080\1\172\1\u0084\1\170\1\u0081\1\165\1\175",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162\4\uffff\1\u0086\6\uffff\1\u0088\24\uffff"+
            "\1\u0087",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1"+
            "\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1\u009c"+
            "\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u00a4"+
            "\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac"+
            "\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4"+
            "\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb\1\u00bc"+
            "\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\2\uffff\1\u0089\1\u008a"+
            "\1\u008b\2\uffff\1\u008c\1\u008d",
            "\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1"+
            "\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1\u009c"+
            "\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u00a4"+
            "\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac"+
            "\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4"+
            "\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb\1\u00bc"+
            "\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\2\uffff\1\u0089\1\u008a"+
            "\1\u008b\2\uffff\1\u008c\1\u008d",
            "\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1"+
            "\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1\u009c"+
            "\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u00a4"+
            "\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac"+
            "\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4"+
            "\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb\1\u00bc"+
            "\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\2\uffff\1\u0089\1\u008a"+
            "\1\u008b\2\uffff\1\u008c\1\u008d",
            "\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1"+
            "\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1\u009c"+
            "\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u00a4"+
            "\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac"+
            "\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4"+
            "\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb\1\u00bc"+
            "\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\2\uffff\1\u0089\1\u008a"+
            "\1\u008b\2\uffff\1\u008c\1\u008d",
            "\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1"+
            "\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1\u009c"+
            "\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u00a4"+
            "\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac"+
            "\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4"+
            "\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb\1\u00bc"+
            "\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\2\uffff\1\u0089\1\u008a"+
            "\1\u008b\2\uffff\1\u008c\1\u008d",
            "\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1"+
            "\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1\u009c"+
            "\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u00a4"+
            "\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac"+
            "\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4"+
            "\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb\1\u00bc"+
            "\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\2\uffff\1\u0089\1\u008a"+
            "\1\u008b\2\uffff\1\u008c\1\u008d",
            "\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1"+
            "\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1\u009c"+
            "\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u00a4"+
            "\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac"+
            "\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4"+
            "\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb\1\u00bc"+
            "\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\2\uffff\1\u0089\1\u008a"+
            "\1\u008b\2\uffff\1\u008c\1\u008d",
            "\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1"+
            "\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1\u009c"+
            "\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u00a4"+
            "\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac"+
            "\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4"+
            "\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb\1\u00bc"+
            "\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\2\uffff\1\u0089\1\u008a"+
            "\1\u008b\2\uffff\1\u008c\1\u008d",
            "\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1"+
            "\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1\u009c"+
            "\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u00a4"+
            "\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac"+
            "\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4"+
            "\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb\1\u00bc"+
            "\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\2\uffff\1\u0089\1\u008a"+
            "\1\u008b\2\uffff\1\u008c\1\u008d",
            "\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1"+
            "\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1\u009c"+
            "\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u00a4"+
            "\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac"+
            "\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4"+
            "\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb\1\u00bc"+
            "\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\2\uffff\1\u0089\1\u008a"+
            "\1\u008b\2\uffff\1\u008c\1\u008d",
            "\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1"+
            "\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1\u009c"+
            "\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u00a4"+
            "\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac"+
            "\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4"+
            "\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb\1\u00bc"+
            "\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\2\uffff\1\u0089\1\u008a"+
            "\1\u008b\2\uffff\1\u008c\1\u008d",
            "\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1"+
            "\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1\u009c"+
            "\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u00a4"+
            "\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac"+
            "\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4"+
            "\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb\1\u00bc"+
            "\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\2\uffff\1\u0089\1\u008a"+
            "\1\u008b\2\uffff\1\u008c\1\u008d",
            "\2\130\1\uffff\14\130\6\uffff\1\115\2\uffff\1\126\1\127\64"+
            "\130\1\uffff\1\130\1\120\1\121\1\122\1\116\1\117\1\123\1\124"+
            "\1\125",
            "\2\130\1\uffff\14\130\6\uffff\1\115\2\uffff\1\126\1\127\64"+
            "\130\1\uffff\1\130\1\120\1\121\1\122\1\116\1\117\1\123\1\124"+
            "\1\125",
            "\2\130\1\uffff\14\130\13\uffff\64\130\1\uffff\4\130\2\uffff"+
            "\2\130",
            "\2\130\1\uffff\14\130\13\uffff\64\130\1\uffff\4\130\2\uffff"+
            "\2\130",
            "\1\u00c2\1\u00c3\1\u00c4",
            "\1\u00c5\1\u00c6\1\u00c7\2\uffff\1\u00c8\1\u00c9",
            "\1\u00ca\1\u00cb\1\u00cc\1\116\1\117\1\u00cd\1\u00ce\1\125",
            "\2\130\1\uffff\14\130\11\uffff\1\126\1\127\64\130\1\uffff\4"+
            "\130\2\uffff\2\130",
            "\2\130\1\uffff\14\130\11\uffff\1\126\1\127\64\130\1\uffff\4"+
            "\130\2\uffff\2\130",
            "\17\130\4\uffff\2\130\3\uffff\1\126\1\127\64\130\1\uffff\4"+
            "\130\2\uffff\2\130",
            "\17\130\4\uffff\2\130\3\uffff\1\126\1\127\64\130\1\uffff\4"+
            "\130\2\uffff\2\130",
            "\17\130\4\uffff\2\130\3\uffff\1\126\1\127\64\130\1\uffff\4"+
            "\130\2\uffff\2\130",
            "\17\130\11\uffff\1\126\1\127\64\130\1\uffff\4\130\2\uffff\2"+
            "\130",
            "\17\130\11\uffff\1\126\1\127\64\130\1\uffff\4\130\2\uffff\2"+
            "\130",
            "\2\130\1\uffff\14\130\11\uffff\1\126\1\127\64\130\1\uffff\4"+
            "\130\2\uffff\2\130",
            "\2\130\1\uffff\14\130\13\uffff\64\130\1\uffff\4\130\2\uffff"+
            "\2\130",
            "\2\130\1\uffff\14\130\13\uffff\64\130\1\uffff\4\130\2\uffff"+
            "\2\130",
            "",
            "\1\u00cf\16\uffff\1\u00d0\2\uffff\1\u00d1\3\uffff\2\130\2\uffff"+
            "\64\130\1\u00d2\1\u00d3\7\130",
            "\1\u00cf\16\uffff\1\u00d0\2\uffff\1\u00d1\3\uffff\2\130\2\uffff"+
            "\64\130\1\u00d2\1\u00d3\7\130",
            "\1\u00cf\16\uffff\1\u00d0\2\uffff\1\u00d1\3\uffff\2\130\2\uffff"+
            "\64\130\1\u00d2\1\u00d3\7\130",
            "\1\u00cf\16\uffff\1\u00d0\2\uffff\1\u00d1\3\uffff\2\130\2\uffff"+
            "\64\130\1\u00d2\1\u00d3\7\130",
            "\1\u00cf\16\uffff\1\u00d0\2\uffff\1\u00d1\3\uffff\2\130\2\uffff"+
            "\64\130\1\u00d2\1\u00d3\7\130",
            "\1\u00cf\16\uffff\1\u00d0\2\uffff\1\u00d1\3\uffff\2\130\2\uffff"+
            "\64\130\1\u00d2\1\u00d3\7\130",
            "\1\u00cf\16\uffff\1\u00d0\2\uffff\1\u00d1\3\uffff\2\130\2\uffff"+
            "\64\130\1\u00d2\1\u00d3\7\130",
            "\1\u00cf\16\uffff\1\u00d0\2\uffff\1\u00d1\3\uffff\2\130\2\uffff"+
            "\64\130\1\u00d2\1\u00d3\7\130",
            "\1\u00cf\16\uffff\1\u00d0\2\uffff\1\u00d1\3\uffff\2\130\2\uffff"+
            "\64\130\1\u00d2\1\u00d3\7\130",
            "\1\u00cf\16\uffff\1\u00d0\2\uffff\1\u00d1\3\uffff\2\130\2\uffff"+
            "\64\130\1\u00d2\1\u00d3\7\130",
            "\1\u00cf\16\uffff\1\u00d0\2\uffff\1\u00d1\3\uffff\2\130\2\uffff"+
            "\64\130\1\u00d2\1\u00d3\7\130",
            "\1\u00cf\16\uffff\1\u00d0\2\uffff\1\u00d1\3\uffff\2\130\2\uffff"+
            "\64\130\1\u00d2\1\u00d3\7\130",
            "\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157\1\160"+
            "\1\161\1\162",
            "",
            "\1\u00cf\16\uffff\1\u00d0\2\uffff\1\u00d1\3\uffff\2\130\66"+
            "\uffff\1\u00d2\1\u00d3\6\130",
            "\1\u00cf\16\uffff\1\u00d0\2\uffff\1\u00d1\3\uffff\2\130\66"+
            "\uffff\1\u00d2\1\u00d3\6\130",
            "\1\u00cf\16\uffff\1\u00d0\2\uffff\1\u00d1\3\uffff\2\130\66"+
            "\uffff\1\u00d2\1\u00d3\6\130",
            "\1\u00cf\16\uffff\1\u00d0\2\uffff\1\u00d1\3\uffff\2\130\66"+
            "\uffff\1\u00d2\1\u00d3\6\130",
            "\1\u00cf\16\uffff\1\u00d0\2\uffff\1\u00d1\3\uffff\2\130\66"+
            "\uffff\1\u00d2\1\u00d3\6\130",
            "\1\u00cf\16\uffff\1\u00d0\2\uffff\1\u00d1\3\uffff\2\130\66"+
            "\uffff\1\u00d2\1\u00d3\6\130",
            "\1\u00cf\16\uffff\1\u00d0\2\uffff\1\u00d1\3\uffff\2\130\66"+
            "\uffff\1\u00d2\1\u00d3\6\130",
            "\1\u00cf\16\uffff\1\u00d0\2\uffff\1\u00d1\3\uffff\2\130\66"+
            "\uffff\1\u00d2\1\u00d3\6\130",
            "\1\u00cf\16\uffff\1\u00d0\2\uffff\1\u00d1\3\uffff\2\130\66"+
            "\uffff\1\u00d2\1\u00d3\6\130",
            "\1\u00cf\16\uffff\1\u00d0\2\uffff\1\u00d1\3\uffff\2\130\66"+
            "\uffff\1\u00d2\1\u00d3\6\130",
            "\1\u00cf\16\uffff\1\u00d0\2\uffff\1\u00d1\3\uffff\2\130\66"+
            "\uffff\1\u00d2\1\u00d3\6\130",
            "\1\u00cf\16\uffff\1\u00d0\2\uffff\1\u00d1\3\uffff\2\130\66"+
            "\uffff\1\u00d2\1\u00d3\6\130",
            "\1\u0082\1\173\1\176\1\u0083\1\u0085\1\164\1\174\1\177\1\166"+
            "\14\uffff\1\171\1\167\1\u0080\1\172\1\u0084\1\170\1\u0081\1"+
            "\165\1\175",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\u0088\24\uffff\1\u0087",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\145\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157"+
            "\1\160\1\161\1\162",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\1\u00da\2\uffff\2"+
            "\130\2\uffff\1\u00e5\1\u00ea\1\u00ec\1\u00e0\1\u00e4\1\u00e6"+
            "\1\u00dc\1\u00e2\1\u00e7\14\uffff\1\u00de\1\u00e8\1\u00e1\1"+
            "\u00eb\1\u00df\1\u00e9\1\u00db\1\u00e3\1\u00dd\26\uffff\1\u00d8"+
            "\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\1\u00ed\2\uffff\2"+
            "\130\2\uffff\1\u00ef\24\uffff\1\u00ee\36\uffff\1\u00d8\1\u00d9"+
            "\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\2\u00f0",
            "\2\u00f0",
            "\2\u00f0",
            "\2\u00f1\1\uffff\2\130\70\uffff\6\130",
            "\2\u00f1\1\uffff\2\130\70\uffff\6\130",
            "\2\u00f1\1\uffff\2\130\70\uffff\6\130",
            "\2\u00f1\1\uffff\2\130\70\uffff\6\130",
            "\2\u00f1\1\uffff\2\130\70\uffff\6\130",
            "\2\130\1\uffff\14\130\11\uffff\1\126\1\127\64\130\1\uffff\4"+
            "\130\2\uffff\2\130",
            "\2\130\1\uffff\14\130\11\uffff\1\126\1\127\64\130\1\uffff\4"+
            "\130\2\uffff\2\130",
            "\2\130\1\uffff\14\130\11\uffff\1\126\1\127\64\130\1\uffff\4"+
            "\130\2\uffff\2\130",
            "\2\130\1\uffff\14\130\11\uffff\1\126\1\127\64\130\1\uffff\4"+
            "\130\2\uffff\2\130",
            "\2\130\1\uffff\14\130\11\uffff\1\126\1\127\64\130\1\uffff\4"+
            "\130\2\uffff\2\130",
            "\1\u00d0\2\uffff\1\u00d1\73\uffff\1\u00d2\1\u00d3",
            "\1\u00f2",
            "\1\u00f4\1\uffff\1\u00f5\1\u00f3\1\uffff\1\u00f6\1\u00f7\1"+
            "\u00f8\1\u00f9",
            "\2\130\70\uffff\6\130",
            "\2\130\70\uffff\6\130",
            "",
            "\1\u00d6\2\uffff\1\u00d7\73\uffff\1\u00d8\1\u00d9",
            "\1\u00fa",
            "\1\u00fc\1\uffff\1\u00fd\1\u00fb\1\uffff\1\u00fe\1\u00ff\1"+
            "\u0100\1\u0101",
            "\2\130\70\uffff\6\130",
            "\2\130\70\uffff\6\130",
            "\1\u00e5\1\u00ea\1\u00ec\1\u00e0\1\u00e4\1\u00e6\1\u00dc\1"+
            "\u00e2\1\u00e7\14\uffff\1\u00de\1\u00e8\1\u00e1\1\u00eb\1\u00df"+
            "\1\u00e9\1\u00db\1\u00e3\1\u00dd",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00ef\24\uffff\1\u00ee",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u00d5\16\uffff\1\u00d6\2\uffff\1\u00d7\3\uffff\2\130\66"+
            "\uffff\1\u00d8\1\u00d9\6\130",
            "\1\u0102\1\u0103\1\u0104\2\uffff\1\u0105\1\u0106",
            "\1\u0110\1\u0111\1\u0108\1\u010e\1\u0109\1\u0107\1\u010f\1"+
            "\u010a\1\u010b\1\u010c\1\u010d",
            "\1\u0112",
            "\2\130\70\uffff\6\130",
            "\2\130\70\uffff\6\130",
            "\2\130\70\uffff\6\130",
            "\2\130\70\uffff\6\130",
            "\2\130\70\uffff\6\130",
            "\2\130\70\uffff\6\130",
            "\2\130\70\uffff\6\130",
            "\1\u0113",
            "\2\130\70\uffff\6\130",
            "\2\130\70\uffff\6\130",
            "\2\130\70\uffff\6\130",
            "\2\130\70\uffff\6\130",
            "\2\130\70\uffff\6\130",
            "\2\130\70\uffff\6\130",
            "\2\130\70\uffff\6\130",
            "\2\130\70\uffff\6\130",
            "\2\130\70\uffff\6\130",
            "\2\130\70\uffff\6\130",
            "\2\130\70\uffff\6\130",
            "\2\130\70\uffff\6\130",
            "\2\130\70\uffff\6\130",
            "\2\130\70\uffff\6\130",
            "\2\130\70\uffff\6\130",
            "\2\130\70\uffff\6\130",
            "\2\130\70\uffff\6\130",
            "\2\130\70\uffff\6\130",
            "\2\130\70\uffff\6\130",
            "\2\130\70\uffff\6\130",
            "\2\130\70\uffff\6\130",
            "\2\130\70\uffff\6\130",
            "\2\130\70\uffff\6\130",
            "\1\u00d1\73\uffff\1\u00d2\1\u00d3",
            "\1\u00d7\73\uffff\1\u00d8\1\u00d9"
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
            return "28:1: date_time options {backtrack=true; } : ( ( ( ( date ( COMMA | AT )? time )=> date time ) | time ( COMMA | ON )? date ) -> ^( DATE_TIME date time ) | date -> ^( DATE_TIME date ) | time -> ^( DATE_TIME time ) );";
        }
    }
    static final String DFA2_eotS =
        "\143\uffff";
    static final String DFA2_eofS =
        "\143\uffff";
    static final String DFA2_minS =
        "\1\26\1\uffff\4\23\102\uffff\14\23\2\uffff\4\0\11\uffff";
    static final String DFA2_maxS =
        "\1\151\1\uffff\4\152\102\uffff\14\151\2\uffff\4\0\11\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\4\uffff\101\1\1\2\14\uffff\2\1\4\uffff\11\1";
    static final String DFA2_specialS =
        "\1\23\1\uffff\1\21\1\22\1\0\1\24\102\uffff\1\11\1\12\1\13\1\3\1"+
        "\4\1\5\1\7\1\17\1\16\1\15\1\14\1\20\2\uffff\1\2\1\1\1\6\1\10\11"+
        "\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105"+
            "\1\106\7\uffff\2\107\2\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1"+
            "\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1"+
            "\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1"+
            "\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1"+
            "\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\uffff\1\1"+
            "\1\2\1\3\1\4\2\107\1\5\1\6",
            "",
            "\2\107\1\124\1\110\1\111\1\112\1\113\1\114\1\115\1\116\1\117"+
            "\1\120\1\121\1\122\1\123\4\uffff\2\125\1\107\2\uffff\66\107"+
            "\1\uffff\11\107",
            "\2\107\1\124\1\110\1\111\1\112\1\113\1\114\1\115\1\116\1\117"+
            "\1\120\1\121\1\122\1\123\4\uffff\2\125\1\107\2\uffff\66\107"+
            "\1\uffff\11\107",
            "\2\107\1\124\1\110\1\111\1\112\1\113\1\114\1\115\1\116\1\117"+
            "\1\120\1\121\1\122\1\123\4\uffff\2\125\1\107\2\uffff\66\107"+
            "\1\uffff\11\107",
            "\2\107\1\124\1\110\1\111\1\112\1\113\1\114\1\115\1\116\1\117"+
            "\1\120\1\121\1\122\1\123\6\uffff\1\107\2\uffff\66\107\1\uffff"+
            "\11\107",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\132\16\uffff\1\133\2\uffff\1\134\3\uffff\1\141\1\142\2\uffff"+
            "\64\107\1\135\1\136\1\126\1\127\1\130\1\137\1\140\1\131\1\107",
            "\1\132\16\uffff\1\133\2\uffff\1\134\3\uffff\1\141\1\142\2\uffff"+
            "\64\107\1\135\1\136\1\126\1\127\1\130\1\137\1\140\1\131\1\107",
            "\1\132\16\uffff\1\133\2\uffff\1\134\3\uffff\1\141\1\142\2\uffff"+
            "\64\107\1\135\1\136\1\126\1\127\1\130\1\137\1\140\1\131\1\107",
            "\1\132\16\uffff\1\133\2\uffff\1\134\3\uffff\1\141\1\142\2\uffff"+
            "\64\107\1\135\1\136\1\126\1\127\1\130\1\137\1\140\1\131\1\107",
            "\1\132\16\uffff\1\133\2\uffff\1\134\3\uffff\1\141\1\142\2\uffff"+
            "\64\107\1\135\1\136\1\126\1\127\1\130\1\137\1\140\1\131\1\107",
            "\1\132\16\uffff\1\133\2\uffff\1\134\3\uffff\1\141\1\142\2\uffff"+
            "\64\107\1\135\1\136\1\126\1\127\1\130\1\137\1\140\1\131\1\107",
            "\1\132\16\uffff\1\133\2\uffff\1\134\3\uffff\1\141\1\142\2\uffff"+
            "\64\107\1\135\1\136\1\126\1\127\1\130\1\137\1\140\1\131\1\107",
            "\1\132\16\uffff\1\133\2\uffff\1\134\3\uffff\1\141\1\142\2\uffff"+
            "\64\107\1\135\1\136\1\126\1\127\1\130\1\137\1\140\1\131\1\107",
            "\1\132\16\uffff\1\133\2\uffff\1\134\3\uffff\1\141\1\142\2\uffff"+
            "\64\107\1\135\1\136\1\126\1\127\1\130\1\137\1\140\1\131\1\107",
            "\1\132\16\uffff\1\133\2\uffff\1\134\3\uffff\1\141\1\142\2\uffff"+
            "\64\107\1\135\1\136\1\126\1\127\1\130\1\137\1\140\1\131\1\107",
            "\1\132\16\uffff\1\133\2\uffff\1\134\3\uffff\1\141\1\142\2\uffff"+
            "\64\107\1\135\1\136\1\126\1\127\1\130\1\137\1\140\1\131\1\107",
            "\1\132\16\uffff\1\133\2\uffff\1\134\3\uffff\1\141\1\142\2\uffff"+
            "\64\107\1\135\1\136\1\126\1\127\1\130\1\137\1\140\1\131\1\107",
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
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "30:5: ( ( ( date ( COMMA | AT )? time )=> date time ) | time ( COMMA | ON )? date )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_4 = input.LA(1);

                         
                        int index2_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA2_4==OF) && (synpred1_Date())) {s = 84;}

                        else if ( (LA2_4==JANUARY) ) {s = 72;}

                        else if ( (LA2_4==FEBRUARY) ) {s = 73;}

                        else if ( (LA2_4==MARCH) ) {s = 74;}

                        else if ( (LA2_4==APRIL) ) {s = 75;}

                        else if ( (LA2_4==MAY) ) {s = 76;}

                        else if ( (LA2_4==JUNE) ) {s = 77;}

                        else if ( (LA2_4==JULY) ) {s = 78;}

                        else if ( (LA2_4==AUGUST) ) {s = 79;}

                        else if ( (LA2_4==SEPTEMBER) ) {s = 80;}

                        else if ( (LA2_4==OCTOBER) ) {s = 81;}

                        else if ( (LA2_4==NOVEMBER) ) {s = 82;}

                        else if ( (LA2_4==DECEMBER) ) {s = 83;}

                        else if ( ((LA2_4>=COMMA && LA2_4<=ON)||LA2_4==COLON||(LA2_4>=AM && LA2_4<=THIRTY_FIRST)||(LA2_4>=FOUR_DIGIT && LA2_4<=THIRTY_TWO_TO_FIFTY_NINE)) ) {s = 71;}

                        else if ( ((LA2_4>=DASH && LA2_4<=SLASH)) && (synpred1_Date())) {s = 85;}

                         
                        input.seek(index2_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_87 = input.LA(1);

                         
                        int index2_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index2_87);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_86 = input.LA(1);

                         
                        int index2_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index2_86);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA2_75 = input.LA(1);

                         
                        int index2_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA2_75==PREFIXED_ONE_TO_NINE) ) {s = 86;}

                        else if ( (LA2_75==ONE_TO_NINE) ) {s = 87;}

                        else if ( (LA2_75==TEN_TO_TWELVE) ) {s = 88;}

                        else if ( (LA2_75==THIRTEEN_TO_TWENTY_THREE) ) {s = 89;}

                        else if ( ((LA2_75>=ONE && LA2_75<=THIRTY_FIRST)||LA2_75==TWENTY_FOUR_TO_THIRTY_ONE) ) {s = 71;}

                        else if ( (LA2_75==COMMA) && (synpred1_Date())) {s = 90;}

                        else if ( (LA2_75==IN) && (synpred1_Date())) {s = 91;}

                        else if ( (LA2_75==SINGLE_QUOTE) && (synpred1_Date())) {s = 92;}

                        else if ( (LA2_75==THREE_DIGIT) && (synpred1_Date())) {s = 93;}

                        else if ( (LA2_75==FOUR_DIGIT) && (synpred1_Date())) {s = 94;}

                        else if ( (LA2_75==TWO_ZEROS) && (synpred1_Date())) {s = 95;}

                        else if ( (LA2_75==ZERO) && (synpred1_Date())) {s = 96;}

                        else if ( (LA2_75==MIDNIGHT) && (synpred1_Date())) {s = 97;}

                        else if ( (LA2_75==NOON) && (synpred1_Date())) {s = 98;}

                         
                        input.seek(index2_75);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA2_76 = input.LA(1);

                         
                        int index2_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA2_76==PREFIXED_ONE_TO_NINE) ) {s = 86;}

                        else if ( (LA2_76==ONE_TO_NINE) ) {s = 87;}

                        else if ( (LA2_76==TEN_TO_TWELVE) ) {s = 88;}

                        else if ( (LA2_76==THIRTEEN_TO_TWENTY_THREE) ) {s = 89;}

                        else if ( ((LA2_76>=ONE && LA2_76<=THIRTY_FIRST)||LA2_76==TWENTY_FOUR_TO_THIRTY_ONE) ) {s = 71;}

                        else if ( (LA2_76==COMMA) && (synpred1_Date())) {s = 90;}

                        else if ( (LA2_76==IN) && (synpred1_Date())) {s = 91;}

                        else if ( (LA2_76==SINGLE_QUOTE) && (synpred1_Date())) {s = 92;}

                        else if ( (LA2_76==THREE_DIGIT) && (synpred1_Date())) {s = 93;}

                        else if ( (LA2_76==FOUR_DIGIT) && (synpred1_Date())) {s = 94;}

                        else if ( (LA2_76==TWO_ZEROS) && (synpred1_Date())) {s = 95;}

                        else if ( (LA2_76==ZERO) && (synpred1_Date())) {s = 96;}

                        else if ( (LA2_76==MIDNIGHT) && (synpred1_Date())) {s = 97;}

                        else if ( (LA2_76==NOON) && (synpred1_Date())) {s = 98;}

                         
                        input.seek(index2_76);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA2_77 = input.LA(1);

                         
                        int index2_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA2_77==PREFIXED_ONE_TO_NINE) ) {s = 86;}

                        else if ( (LA2_77==ONE_TO_NINE) ) {s = 87;}

                        else if ( (LA2_77==TEN_TO_TWELVE) ) {s = 88;}

                        else if ( (LA2_77==THIRTEEN_TO_TWENTY_THREE) ) {s = 89;}

                        else if ( ((LA2_77>=ONE && LA2_77<=THIRTY_FIRST)||LA2_77==TWENTY_FOUR_TO_THIRTY_ONE) ) {s = 71;}

                        else if ( (LA2_77==COMMA) && (synpred1_Date())) {s = 90;}

                        else if ( (LA2_77==IN) && (synpred1_Date())) {s = 91;}

                        else if ( (LA2_77==SINGLE_QUOTE) && (synpred1_Date())) {s = 92;}

                        else if ( (LA2_77==THREE_DIGIT) && (synpred1_Date())) {s = 93;}

                        else if ( (LA2_77==FOUR_DIGIT) && (synpred1_Date())) {s = 94;}

                        else if ( (LA2_77==TWO_ZEROS) && (synpred1_Date())) {s = 95;}

                        else if ( (LA2_77==ZERO) && (synpred1_Date())) {s = 96;}

                        else if ( (LA2_77==MIDNIGHT) && (synpred1_Date())) {s = 97;}

                        else if ( (LA2_77==NOON) && (synpred1_Date())) {s = 98;}

                         
                        input.seek(index2_77);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA2_88 = input.LA(1);

                         
                        int index2_88 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index2_88);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA2_78 = input.LA(1);

                         
                        int index2_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA2_78==COMMA) && (synpred1_Date())) {s = 90;}

                        else if ( (LA2_78==IN) && (synpred1_Date())) {s = 91;}

                        else if ( (LA2_78==SINGLE_QUOTE) && (synpred1_Date())) {s = 92;}

                        else if ( (LA2_78==THREE_DIGIT) && (synpred1_Date())) {s = 93;}

                        else if ( (LA2_78==FOUR_DIGIT) && (synpred1_Date())) {s = 94;}

                        else if ( (LA2_78==TWO_ZEROS) && (synpred1_Date())) {s = 95;}

                        else if ( (LA2_78==ZERO) && (synpred1_Date())) {s = 96;}

                        else if ( (LA2_78==PREFIXED_ONE_TO_NINE) ) {s = 86;}

                        else if ( (LA2_78==ONE_TO_NINE) ) {s = 87;}

                        else if ( (LA2_78==TEN_TO_TWELVE) ) {s = 88;}

                        else if ( (LA2_78==THIRTEEN_TO_TWENTY_THREE) ) {s = 89;}

                        else if ( (LA2_78==MIDNIGHT) && (synpred1_Date())) {s = 97;}

                        else if ( (LA2_78==NOON) && (synpred1_Date())) {s = 98;}

                        else if ( ((LA2_78>=ONE && LA2_78<=THIRTY_FIRST)||LA2_78==TWENTY_FOUR_TO_THIRTY_ONE) ) {s = 71;}

                         
                        input.seek(index2_78);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA2_89 = input.LA(1);

                         
                        int index2_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index2_89);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA2_72 = input.LA(1);

                         
                        int index2_72 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA2_72==PREFIXED_ONE_TO_NINE) ) {s = 86;}

                        else if ( (LA2_72==ONE_TO_NINE) ) {s = 87;}

                        else if ( (LA2_72==TEN_TO_TWELVE) ) {s = 88;}

                        else if ( (LA2_72==THIRTEEN_TO_TWENTY_THREE) ) {s = 89;}

                        else if ( ((LA2_72>=ONE && LA2_72<=THIRTY_FIRST)||LA2_72==TWENTY_FOUR_TO_THIRTY_ONE) ) {s = 71;}

                        else if ( (LA2_72==COMMA) && (synpred1_Date())) {s = 90;}

                        else if ( (LA2_72==IN) && (synpred1_Date())) {s = 91;}

                        else if ( (LA2_72==SINGLE_QUOTE) && (synpred1_Date())) {s = 92;}

                        else if ( (LA2_72==THREE_DIGIT) && (synpred1_Date())) {s = 93;}

                        else if ( (LA2_72==FOUR_DIGIT) && (synpred1_Date())) {s = 94;}

                        else if ( (LA2_72==TWO_ZEROS) && (synpred1_Date())) {s = 95;}

                        else if ( (LA2_72==ZERO) && (synpred1_Date())) {s = 96;}

                        else if ( (LA2_72==MIDNIGHT) && (synpred1_Date())) {s = 97;}

                        else if ( (LA2_72==NOON) && (synpred1_Date())) {s = 98;}

                         
                        input.seek(index2_72);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA2_73 = input.LA(1);

                         
                        int index2_73 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA2_73==PREFIXED_ONE_TO_NINE) ) {s = 86;}

                        else if ( (LA2_73==ONE_TO_NINE) ) {s = 87;}

                        else if ( (LA2_73==TEN_TO_TWELVE) ) {s = 88;}

                        else if ( (LA2_73==THIRTEEN_TO_TWENTY_THREE) ) {s = 89;}

                        else if ( ((LA2_73>=ONE && LA2_73<=THIRTY_FIRST)||LA2_73==TWENTY_FOUR_TO_THIRTY_ONE) ) {s = 71;}

                        else if ( (LA2_73==COMMA) && (synpred1_Date())) {s = 90;}

                        else if ( (LA2_73==IN) && (synpred1_Date())) {s = 91;}

                        else if ( (LA2_73==SINGLE_QUOTE) && (synpred1_Date())) {s = 92;}

                        else if ( (LA2_73==THREE_DIGIT) && (synpred1_Date())) {s = 93;}

                        else if ( (LA2_73==FOUR_DIGIT) && (synpred1_Date())) {s = 94;}

                        else if ( (LA2_73==TWO_ZEROS) && (synpred1_Date())) {s = 95;}

                        else if ( (LA2_73==ZERO) && (synpred1_Date())) {s = 96;}

                        else if ( (LA2_73==MIDNIGHT) && (synpred1_Date())) {s = 97;}

                        else if ( (LA2_73==NOON) && (synpred1_Date())) {s = 98;}

                         
                        input.seek(index2_73);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA2_74 = input.LA(1);

                         
                        int index2_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA2_74==PREFIXED_ONE_TO_NINE) ) {s = 86;}

                        else if ( (LA2_74==ONE_TO_NINE) ) {s = 87;}

                        else if ( (LA2_74==TEN_TO_TWELVE) ) {s = 88;}

                        else if ( (LA2_74==THIRTEEN_TO_TWENTY_THREE) ) {s = 89;}

                        else if ( ((LA2_74>=ONE && LA2_74<=THIRTY_FIRST)||LA2_74==TWENTY_FOUR_TO_THIRTY_ONE) ) {s = 71;}

                        else if ( (LA2_74==COMMA) && (synpred1_Date())) {s = 90;}

                        else if ( (LA2_74==IN) && (synpred1_Date())) {s = 91;}

                        else if ( (LA2_74==SINGLE_QUOTE) && (synpred1_Date())) {s = 92;}

                        else if ( (LA2_74==THREE_DIGIT) && (synpred1_Date())) {s = 93;}

                        else if ( (LA2_74==FOUR_DIGIT) && (synpred1_Date())) {s = 94;}

                        else if ( (LA2_74==TWO_ZEROS) && (synpred1_Date())) {s = 95;}

                        else if ( (LA2_74==ZERO) && (synpred1_Date())) {s = 96;}

                        else if ( (LA2_74==MIDNIGHT) && (synpred1_Date())) {s = 97;}

                        else if ( (LA2_74==NOON) && (synpred1_Date())) {s = 98;}

                         
                        input.seek(index2_74);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA2_82 = input.LA(1);

                         
                        int index2_82 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA2_82==COMMA) && (synpred1_Date())) {s = 90;}

                        else if ( (LA2_82==IN) && (synpred1_Date())) {s = 91;}

                        else if ( (LA2_82==SINGLE_QUOTE) && (synpred1_Date())) {s = 92;}

                        else if ( (LA2_82==THREE_DIGIT) && (synpred1_Date())) {s = 93;}

                        else if ( (LA2_82==FOUR_DIGIT) && (synpred1_Date())) {s = 94;}

                        else if ( (LA2_82==TWO_ZEROS) && (synpred1_Date())) {s = 95;}

                        else if ( (LA2_82==ZERO) && (synpred1_Date())) {s = 96;}

                        else if ( (LA2_82==PREFIXED_ONE_TO_NINE) ) {s = 86;}

                        else if ( (LA2_82==ONE_TO_NINE) ) {s = 87;}

                        else if ( (LA2_82==TEN_TO_TWELVE) ) {s = 88;}

                        else if ( (LA2_82==THIRTEEN_TO_TWENTY_THREE) ) {s = 89;}

                        else if ( (LA2_82==MIDNIGHT) && (synpred1_Date())) {s = 97;}

                        else if ( (LA2_82==NOON) && (synpred1_Date())) {s = 98;}

                        else if ( ((LA2_82>=ONE && LA2_82<=THIRTY_FIRST)||LA2_82==TWENTY_FOUR_TO_THIRTY_ONE) ) {s = 71;}

                         
                        input.seek(index2_82);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA2_81 = input.LA(1);

                         
                        int index2_81 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA2_81==PREFIXED_ONE_TO_NINE) ) {s = 86;}

                        else if ( (LA2_81==ONE_TO_NINE) ) {s = 87;}

                        else if ( (LA2_81==TEN_TO_TWELVE) ) {s = 88;}

                        else if ( (LA2_81==THIRTEEN_TO_TWENTY_THREE) ) {s = 89;}

                        else if ( ((LA2_81>=ONE && LA2_81<=THIRTY_FIRST)||LA2_81==TWENTY_FOUR_TO_THIRTY_ONE) ) {s = 71;}

                        else if ( (LA2_81==COMMA) && (synpred1_Date())) {s = 90;}

                        else if ( (LA2_81==IN) && (synpred1_Date())) {s = 91;}

                        else if ( (LA2_81==SINGLE_QUOTE) && (synpred1_Date())) {s = 92;}

                        else if ( (LA2_81==THREE_DIGIT) && (synpred1_Date())) {s = 93;}

                        else if ( (LA2_81==FOUR_DIGIT) && (synpred1_Date())) {s = 94;}

                        else if ( (LA2_81==TWO_ZEROS) && (synpred1_Date())) {s = 95;}

                        else if ( (LA2_81==ZERO) && (synpred1_Date())) {s = 96;}

                        else if ( (LA2_81==MIDNIGHT) && (synpred1_Date())) {s = 97;}

                        else if ( (LA2_81==NOON) && (synpred1_Date())) {s = 98;}

                         
                        input.seek(index2_81);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA2_80 = input.LA(1);

                         
                        int index2_80 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA2_80==PREFIXED_ONE_TO_NINE) ) {s = 86;}

                        else if ( (LA2_80==ONE_TO_NINE) ) {s = 87;}

                        else if ( (LA2_80==TEN_TO_TWELVE) ) {s = 88;}

                        else if ( (LA2_80==THIRTEEN_TO_TWENTY_THREE) ) {s = 89;}

                        else if ( ((LA2_80>=ONE && LA2_80<=THIRTY_FIRST)||LA2_80==TWENTY_FOUR_TO_THIRTY_ONE) ) {s = 71;}

                        else if ( (LA2_80==COMMA) && (synpred1_Date())) {s = 90;}

                        else if ( (LA2_80==IN) && (synpred1_Date())) {s = 91;}

                        else if ( (LA2_80==SINGLE_QUOTE) && (synpred1_Date())) {s = 92;}

                        else if ( (LA2_80==THREE_DIGIT) && (synpred1_Date())) {s = 93;}

                        else if ( (LA2_80==FOUR_DIGIT) && (synpred1_Date())) {s = 94;}

                        else if ( (LA2_80==TWO_ZEROS) && (synpred1_Date())) {s = 95;}

                        else if ( (LA2_80==ZERO) && (synpred1_Date())) {s = 96;}

                        else if ( (LA2_80==MIDNIGHT) && (synpred1_Date())) {s = 97;}

                        else if ( (LA2_80==NOON) && (synpred1_Date())) {s = 98;}

                         
                        input.seek(index2_80);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA2_79 = input.LA(1);

                         
                        int index2_79 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA2_79==PREFIXED_ONE_TO_NINE) ) {s = 86;}

                        else if ( (LA2_79==ONE_TO_NINE) ) {s = 87;}

                        else if ( (LA2_79==TEN_TO_TWELVE) ) {s = 88;}

                        else if ( (LA2_79==THIRTEEN_TO_TWENTY_THREE) ) {s = 89;}

                        else if ( ((LA2_79>=ONE && LA2_79<=THIRTY_FIRST)||LA2_79==TWENTY_FOUR_TO_THIRTY_ONE) ) {s = 71;}

                        else if ( (LA2_79==COMMA) && (synpred1_Date())) {s = 90;}

                        else if ( (LA2_79==IN) && (synpred1_Date())) {s = 91;}

                        else if ( (LA2_79==SINGLE_QUOTE) && (synpred1_Date())) {s = 92;}

                        else if ( (LA2_79==THREE_DIGIT) && (synpred1_Date())) {s = 93;}

                        else if ( (LA2_79==FOUR_DIGIT) && (synpred1_Date())) {s = 94;}

                        else if ( (LA2_79==TWO_ZEROS) && (synpred1_Date())) {s = 95;}

                        else if ( (LA2_79==ZERO) && (synpred1_Date())) {s = 96;}

                        else if ( (LA2_79==MIDNIGHT) && (synpred1_Date())) {s = 97;}

                        else if ( (LA2_79==NOON) && (synpred1_Date())) {s = 98;}

                         
                        input.seek(index2_79);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA2_83 = input.LA(1);

                         
                        int index2_83 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA2_83==PREFIXED_ONE_TO_NINE) ) {s = 86;}

                        else if ( (LA2_83==ONE_TO_NINE) ) {s = 87;}

                        else if ( (LA2_83==TEN_TO_TWELVE) ) {s = 88;}

                        else if ( (LA2_83==THIRTEEN_TO_TWENTY_THREE) ) {s = 89;}

                        else if ( ((LA2_83>=ONE && LA2_83<=THIRTY_FIRST)||LA2_83==TWENTY_FOUR_TO_THIRTY_ONE) ) {s = 71;}

                        else if ( (LA2_83==COMMA) && (synpred1_Date())) {s = 90;}

                        else if ( (LA2_83==IN) && (synpred1_Date())) {s = 91;}

                        else if ( (LA2_83==SINGLE_QUOTE) && (synpred1_Date())) {s = 92;}

                        else if ( (LA2_83==THREE_DIGIT) && (synpred1_Date())) {s = 93;}

                        else if ( (LA2_83==FOUR_DIGIT) && (synpred1_Date())) {s = 94;}

                        else if ( (LA2_83==TWO_ZEROS) && (synpred1_Date())) {s = 95;}

                        else if ( (LA2_83==ZERO) && (synpred1_Date())) {s = 96;}

                        else if ( (LA2_83==MIDNIGHT) && (synpred1_Date())) {s = 97;}

                        else if ( (LA2_83==NOON) && (synpred1_Date())) {s = 98;}

                         
                        input.seek(index2_83);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA2_2 = input.LA(1);

                         
                        int index2_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA2_2>=COMMA && LA2_2<=ON)||LA2_2==COLON||(LA2_2>=AM && LA2_2<=THIRTY_FIRST)||(LA2_2>=FOUR_DIGIT && LA2_2<=THIRTY_TWO_TO_FIFTY_NINE)) ) {s = 71;}

                        else if ( (LA2_2==JANUARY) ) {s = 72;}

                        else if ( (LA2_2==FEBRUARY) ) {s = 73;}

                        else if ( (LA2_2==MARCH) ) {s = 74;}

                        else if ( (LA2_2==APRIL) ) {s = 75;}

                        else if ( (LA2_2==MAY) ) {s = 76;}

                        else if ( (LA2_2==JUNE) ) {s = 77;}

                        else if ( (LA2_2==JULY) ) {s = 78;}

                        else if ( (LA2_2==AUGUST) ) {s = 79;}

                        else if ( (LA2_2==SEPTEMBER) ) {s = 80;}

                        else if ( (LA2_2==OCTOBER) ) {s = 81;}

                        else if ( (LA2_2==NOVEMBER) ) {s = 82;}

                        else if ( (LA2_2==DECEMBER) ) {s = 83;}

                        else if ( (LA2_2==OF) && (synpred1_Date())) {s = 84;}

                        else if ( ((LA2_2>=DASH && LA2_2<=SLASH)) && (synpred1_Date())) {s = 85;}

                         
                        input.seek(index2_2);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA2_3 = input.LA(1);

                         
                        int index2_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA2_3==OF) && (synpred1_Date())) {s = 84;}

                        else if ( (LA2_3==JANUARY) ) {s = 72;}

                        else if ( (LA2_3==FEBRUARY) ) {s = 73;}

                        else if ( (LA2_3==MARCH) ) {s = 74;}

                        else if ( (LA2_3==APRIL) ) {s = 75;}

                        else if ( (LA2_3==MAY) ) {s = 76;}

                        else if ( (LA2_3==JUNE) ) {s = 77;}

                        else if ( (LA2_3==JULY) ) {s = 78;}

                        else if ( (LA2_3==AUGUST) ) {s = 79;}

                        else if ( (LA2_3==SEPTEMBER) ) {s = 80;}

                        else if ( (LA2_3==OCTOBER) ) {s = 81;}

                        else if ( (LA2_3==NOVEMBER) ) {s = 82;}

                        else if ( (LA2_3==DECEMBER) ) {s = 83;}

                        else if ( ((LA2_3>=COMMA && LA2_3<=ON)||LA2_3==COLON||(LA2_3>=AM && LA2_3<=THIRTY_FIRST)||(LA2_3>=FOUR_DIGIT && LA2_3<=THIRTY_TWO_TO_FIFTY_NINE)) ) {s = 71;}

                        else if ( ((LA2_3>=DASH && LA2_3<=SLASH)) && (synpred1_Date())) {s = 85;}

                         
                        input.seek(index2_3);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA2_0 = input.LA(1);

                         
                        int index2_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA2_0==FOUR_DIGIT) && (synpred1_Date())) {s = 1;}

                        else if ( (LA2_0==PREFIXED_ONE_TO_NINE) ) {s = 2;}

                        else if ( (LA2_0==ONE_TO_NINE) ) {s = 3;}

                        else if ( (LA2_0==TEN_TO_TWELVE) ) {s = 4;}

                        else if ( (LA2_0==THIRTEEN_TO_TWENTY_THREE) ) {s = 5;}

                        else if ( (LA2_0==TWENTY_FOUR_TO_THIRTY_ONE) && (synpred1_Date())) {s = 6;}

                        else if ( (LA2_0==ONE) && (synpred1_Date())) {s = 7;}

                        else if ( (LA2_0==TWO) && (synpred1_Date())) {s = 8;}

                        else if ( (LA2_0==THREE) && (synpred1_Date())) {s = 9;}

                        else if ( (LA2_0==FOUR) && (synpred1_Date())) {s = 10;}

                        else if ( (LA2_0==FIVE) && (synpred1_Date())) {s = 11;}

                        else if ( (LA2_0==SIX) && (synpred1_Date())) {s = 12;}

                        else if ( (LA2_0==SEVEN) && (synpred1_Date())) {s = 13;}

                        else if ( (LA2_0==EIGHT) && (synpred1_Date())) {s = 14;}

                        else if ( (LA2_0==NINE) && (synpred1_Date())) {s = 15;}

                        else if ( (LA2_0==TEN) && (synpred1_Date())) {s = 16;}

                        else if ( (LA2_0==ELEVEN) && (synpred1_Date())) {s = 17;}

                        else if ( (LA2_0==TWELVE) && (synpred1_Date())) {s = 18;}

                        else if ( (LA2_0==THIRTEEN) && (synpred1_Date())) {s = 19;}

                        else if ( (LA2_0==FOURTEEN) && (synpred1_Date())) {s = 20;}

                        else if ( (LA2_0==FIFTEEN) && (synpred1_Date())) {s = 21;}

                        else if ( (LA2_0==SIXTEEN) && (synpred1_Date())) {s = 22;}

                        else if ( (LA2_0==SEVENTEEN) && (synpred1_Date())) {s = 23;}

                        else if ( (LA2_0==EIGHTEEN) && (synpred1_Date())) {s = 24;}

                        else if ( (LA2_0==NINETEEN) && (synpred1_Date())) {s = 25;}

                        else if ( (LA2_0==TWENTY) && (synpred1_Date())) {s = 26;}

                        else if ( (LA2_0==THIRTY) && (synpred1_Date())) {s = 27;}

                        else if ( (LA2_0==FIRST) && (synpred1_Date())) {s = 28;}

                        else if ( (LA2_0==SECOND) && (synpred1_Date())) {s = 29;}

                        else if ( (LA2_0==THIRD) && (synpred1_Date())) {s = 30;}

                        else if ( (LA2_0==FOURTH) && (synpred1_Date())) {s = 31;}

                        else if ( (LA2_0==FIFTH) && (synpred1_Date())) {s = 32;}

                        else if ( (LA2_0==SIXTH) && (synpred1_Date())) {s = 33;}

                        else if ( (LA2_0==SEVENTH) && (synpred1_Date())) {s = 34;}

                        else if ( (LA2_0==EIGHTH) && (synpred1_Date())) {s = 35;}

                        else if ( (LA2_0==NINTH) && (synpred1_Date())) {s = 36;}

                        else if ( (LA2_0==TENTH) && (synpred1_Date())) {s = 37;}

                        else if ( (LA2_0==ELEVENTH) && (synpred1_Date())) {s = 38;}

                        else if ( (LA2_0==TWELFTH) && (synpred1_Date())) {s = 39;}

                        else if ( (LA2_0==THIRTEENTH) && (synpred1_Date())) {s = 40;}

                        else if ( (LA2_0==FOURTEENTH) && (synpred1_Date())) {s = 41;}

                        else if ( (LA2_0==FIFTEENTH) && (synpred1_Date())) {s = 42;}

                        else if ( (LA2_0==SIXTEENTH) && (synpred1_Date())) {s = 43;}

                        else if ( (LA2_0==SEVENTEENTH) && (synpred1_Date())) {s = 44;}

                        else if ( (LA2_0==EIGHTEENTH) && (synpred1_Date())) {s = 45;}

                        else if ( (LA2_0==NINETEENTH) && (synpred1_Date())) {s = 46;}

                        else if ( (LA2_0==TWENTIETH) && (synpred1_Date())) {s = 47;}

                        else if ( (LA2_0==TWENTY_FIRST) && (synpred1_Date())) {s = 48;}

                        else if ( (LA2_0==TWENTY_SECOND) && (synpred1_Date())) {s = 49;}

                        else if ( (LA2_0==TWENTY_THIRD) && (synpred1_Date())) {s = 50;}

                        else if ( (LA2_0==TWENTY_FOURTH) && (synpred1_Date())) {s = 51;}

                        else if ( (LA2_0==TWENTY_FIFTH) && (synpred1_Date())) {s = 52;}

                        else if ( (LA2_0==TWENTY_SIXTH) && (synpred1_Date())) {s = 53;}

                        else if ( (LA2_0==TWENTY_SEVENTH) && (synpred1_Date())) {s = 54;}

                        else if ( (LA2_0==TWENTY_EIGHTH) && (synpred1_Date())) {s = 55;}

                        else if ( (LA2_0==TWENTY_NINTH) && (synpred1_Date())) {s = 56;}

                        else if ( (LA2_0==THIRTIETH) && (synpred1_Date())) {s = 57;}

                        else if ( (LA2_0==THIRTY_FIRST) && (synpred1_Date())) {s = 58;}

                        else if ( (LA2_0==JANUARY) && (synpred1_Date())) {s = 59;}

                        else if ( (LA2_0==FEBRUARY) && (synpred1_Date())) {s = 60;}

                        else if ( (LA2_0==MARCH) && (synpred1_Date())) {s = 61;}

                        else if ( (LA2_0==APRIL) && (synpred1_Date())) {s = 62;}

                        else if ( (LA2_0==MAY) && (synpred1_Date())) {s = 63;}

                        else if ( (LA2_0==JUNE) && (synpred1_Date())) {s = 64;}

                        else if ( (LA2_0==JULY) && (synpred1_Date())) {s = 65;}

                        else if ( (LA2_0==AUGUST) && (synpred1_Date())) {s = 66;}

                        else if ( (LA2_0==SEPTEMBER) && (synpred1_Date())) {s = 67;}

                        else if ( (LA2_0==OCTOBER) && (synpred1_Date())) {s = 68;}

                        else if ( (LA2_0==NOVEMBER) && (synpred1_Date())) {s = 69;}

                        else if ( (LA2_0==DECEMBER) && (synpred1_Date())) {s = 70;}

                        else if ( ((LA2_0>=MIDNIGHT && LA2_0<=NOON)||(LA2_0>=TWO_ZEROS && LA2_0<=ZERO)) ) {s = 71;}

                         
                        input.seek(index2_0);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA2_5 = input.LA(1);

                         
                        int index2_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA2_5==OF) && (synpred1_Date())) {s = 84;}

                        else if ( (LA2_5==JANUARY) ) {s = 72;}

                        else if ( (LA2_5==FEBRUARY) ) {s = 73;}

                        else if ( (LA2_5==MARCH) ) {s = 74;}

                        else if ( (LA2_5==APRIL) ) {s = 75;}

                        else if ( (LA2_5==MAY) ) {s = 76;}

                        else if ( (LA2_5==JUNE) ) {s = 77;}

                        else if ( (LA2_5==JULY) ) {s = 78;}

                        else if ( (LA2_5==AUGUST) ) {s = 79;}

                        else if ( (LA2_5==SEPTEMBER) ) {s = 80;}

                        else if ( (LA2_5==OCTOBER) ) {s = 81;}

                        else if ( (LA2_5==NOVEMBER) ) {s = 82;}

                        else if ( (LA2_5==DECEMBER) ) {s = 83;}

                        else if ( ((LA2_5>=COMMA && LA2_5<=ON)||LA2_5==COLON||(LA2_5>=AM && LA2_5<=THIRTY_FIRST)||(LA2_5>=FOUR_DIGIT && LA2_5<=THIRTY_TWO_TO_FIFTY_NINE)) ) {s = 71;}

                         
                        input.seek(index2_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA19_eotS =
        "\24\uffff";
    static final String DFA19_eofS =
        "\1\7\1\uffff\5\1\1\uffff\14\7";
    static final String DFA19_minS =
        "\1\23\1\uffff\5\23\1\uffff\14\23";
    static final String DFA19_maxS =
        "\1\152\1\uffff\5\151\1\uffff\14\151";
    static final String DFA19_acceptS =
        "\1\uffff\1\1\5\uffff\1\2\14\uffff";
    static final String DFA19_specialS =
        "\24\uffff}>";
    static final String[] DFA19_transitionS = {
            "\2\7\1\uffff\14\7\6\uffff\1\1\2\uffff\66\7\1\uffff\1\7\1\2\1"+
            "\3\1\4\2\1\1\5\1\6\1\1",
            "",
            "\2\1\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
            "\1\22\1\23\4\uffff\2\7\3\uffff\66\1\1\uffff\4\1\2\uffff\2\1",
            "\2\1\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
            "\1\22\1\23\4\uffff\2\7\3\uffff\66\1\1\uffff\4\1\2\uffff\2\1",
            "\2\1\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
            "\1\22\1\23\4\uffff\2\7\3\uffff\66\1\1\uffff\4\1\2\uffff\2\1",
            "\2\1\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
            "\1\22\1\23\11\uffff\66\1\1\uffff\4\1\2\uffff\2\1",
            "\2\1\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
            "\1\22\1\23\11\uffff\66\1\1\uffff\4\1\2\uffff\2\1",
            "",
            "\1\7\16\uffff\1\7\2\uffff\1\7\7\uffff\64\1\2\7\3\1\2\uffff"+
            "\2\1",
            "\1\7\16\uffff\1\7\2\uffff\1\7\7\uffff\64\1\2\7\3\1\2\uffff"+
            "\2\1",
            "\1\7\16\uffff\1\7\2\uffff\1\7\7\uffff\64\1\2\7\3\1\2\uffff"+
            "\2\1",
            "\1\7\16\uffff\1\7\2\uffff\1\7\7\uffff\64\1\2\7\3\1\2\uffff"+
            "\2\1",
            "\1\7\16\uffff\1\7\2\uffff\1\7\7\uffff\64\1\2\7\3\1\2\uffff"+
            "\2\1",
            "\1\7\16\uffff\1\7\2\uffff\1\7\7\uffff\64\1\2\7\3\1\2\uffff"+
            "\2\1",
            "\1\7\16\uffff\1\7\2\uffff\1\7\7\uffff\64\1\2\7\3\1\2\uffff"+
            "\2\1",
            "\1\7\16\uffff\1\7\2\uffff\1\7\7\uffff\64\1\2\7\3\1\2\uffff"+
            "\2\1",
            "\1\7\16\uffff\1\7\2\uffff\1\7\7\uffff\64\1\2\7\3\1\2\uffff"+
            "\2\1",
            "\1\7\16\uffff\1\7\2\uffff\1\7\7\uffff\64\1\2\7\3\1\2\uffff"+
            "\2\1",
            "\1\7\16\uffff\1\7\2\uffff\1\7\7\uffff\64\1\2\7\3\1\2\uffff"+
            "\2\1",
            "\1\7\16\uffff\1\7\2\uffff\1\7\7\uffff\64\1\2\7\3\1\2\uffff"+
            "\2\1"
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "92:11: ( ( COLON )? minutes )?";
        }
    }
    static final String DFA35_eotS =
        "\43\uffff";
    static final String DFA35_eofS =
        "\24\uffff\1\37\1\42\15\uffff";
    static final String DFA35_minS =
        "\1\55\23\uffff\2\23\1\55\14\uffff";
    static final String DFA35_maxS =
        "\1\101\23\uffff\2\154\1\65\14\uffff";
    static final String DFA35_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\3\uffff\1\33\1\30\1\26\1\35\1"+
        "\32\1\25\1\34\1\27\1\24\1\31\1\37\1\36";
    static final String DFA35_specialS =
        "\43\uffff}>";
    static final String[] DFA35_transitionS = {
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
            "\1\37\1\uffff\16\37\2\uffff\1\37\1\26\2\uffff\2\37\2\uffff"+
            "\1\34\1\31\1\36\1\30\1\40\1\33\1\27\1\35\1\32\53\uffff\10\37"+
            "\3\uffff\1\37",
            "\1\42\1\uffff\16\42\2\uffff\1\42\1\41\2\uffff\2\42\2\uffff"+
            "\1\41\63\uffff\10\42\3\uffff\1\42",
            "\1\34\1\31\1\36\1\30\1\40\1\33\1\27\1\35\1\32",
            "",
            "",
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

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "123:1: spelled_1_to_31 : ( ONE -> INT[\"1\"] | TWO -> INT[\"2\"] | THREE -> INT[\"3\"] | FOUR -> INT[\"4\"] | FIVE -> INT[\"5\"] | SIX -> INT[\"6\"] | SEVEN -> INT[\"7\"] | EIGHT -> INT[\"8\"] | NINE -> INT[\"9\"] | TEN -> INT[\"10\"] | ELEVEN -> INT[\"11\"] | TWELVE -> INT[\"12\"] | THIRTEEN -> INT[\"13\"] | FOURTEEN -> INT[\"14\"] | FIFTEEN -> INT[\"15\"] | SIXTEEN -> INT[\"16\"] | SEVENTEEN -> INT[\"17\"] | EIGHTEEN -> INT[\"18\"] | NINETEEN -> INT[\"19\"] | TWENTY -> INT[\"20\"] | TWENTY ( DASH )? ONE -> INT[\"21\"] | TWENTY ( DASH )? TWO -> INT[\"22\"] | TWENTY ( DASH )? THREE -> INT[\"23\"] | TWENTY ( DASH )? FOUR -> INT[\"24\"] | TWENTY ( DASH )? FIVE -> INT[\"25\"] | TWENTY ( DASH )? SIX -> INT[\"26\"] | TWENTY ( DASH )? SEVEN -> INT[\"27\"] | TWENTY ( DASH )? EIGHT -> INT[\"28\"] | TWENTY ( DASH )? NINE -> INT[\"29\"] | THIRTY -> INT[\"30\"] | THIRTY ( DASH )? ONE -> INT[\"31\"] );";
        }
    }
    static final String DFA56_eotS =
        "\42\uffff";
    static final String DFA56_eofS =
        "\42\uffff";
    static final String DFA56_minS =
        "\1\100\25\uffff\1\46\12\uffff\1\102";
    static final String DFA56_maxS =
        "\1\140\25\uffff\1\112\12\uffff\1\112";
    static final String DFA56_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\uffff\1\26\1\27\1"+
        "\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\uffff";
    static final String DFA56_specialS =
        "\42\uffff}>";
    static final String[] DFA56_transitionS = {
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
            "\1\41\33\uffff\1\25\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36",
            "",
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

    static final short[] DFA56_eot = DFA.unpackEncodedString(DFA56_eotS);
    static final short[] DFA56_eof = DFA.unpackEncodedString(DFA56_eofS);
    static final char[] DFA56_min = DFA.unpackEncodedStringToUnsignedChars(DFA56_minS);
    static final char[] DFA56_max = DFA.unpackEncodedStringToUnsignedChars(DFA56_maxS);
    static final short[] DFA56_accept = DFA.unpackEncodedString(DFA56_acceptS);
    static final short[] DFA56_special = DFA.unpackEncodedString(DFA56_specialS);
    static final short[][] DFA56_transition;

    static {
        int numStates = DFA56_transitionS.length;
        DFA56_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA56_transition[i] = DFA.unpackEncodedString(DFA56_transitionS[i]);
        }
    }

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = DFA56_eot;
            this.eof = DFA56_eof;
            this.min = DFA56_min;
            this.max = DFA56_max;
            this.accept = DFA56_accept;
            this.special = DFA56_special;
            this.transition = DFA56_transition;
        }
        public String getDescription() {
            return "159:1: spelled_sequence_1_to_31 : ( FIRST -> INT[\"1\"] | SECOND -> INT[\"2\"] | THIRD -> INT[\"3\"] | FOURTH -> INT[\"4\"] | FIFTH -> INT[\"5\"] | SIXTH -> INT[\"6\"] | SEVENTH -> INT[\"7\"] | EIGHTH -> INT[\"8\"] | NINTH -> INT[\"9\"] | TENTH -> INT[\"10\"] | ELEVENTH -> INT[\"11\"] | TWELFTH -> INT[\"12\"] | THIRTEENTH -> INT[\"13\"] | FOURTEENTH -> INT[\"14\"] | FIFTEENTH -> INT[\"15\"] | SIXTEENTH -> INT[\"16\"] | SEVENTEENTH -> INT[\"17\"] | EIGHTEENTH -> INT[\"18\"] | NINETEENTH -> INT[\"19\"] | TWENTIETH -> INT[\"20\"] | ( TWENTY_FIRST | ( TWENTY ( DASH )? FIRST ) ) -> INT[\"21\"] | ( TWENTY_SECOND | ( TWENTY ( DASH )? SECOND ) ) -> INT[\"22\"] | ( TWENTY_THIRD | ( TWENTY ( DASH )? THIRD ) ) -> INT[\"23\"] | ( TWENTY_FOURTH | ( TWENTY ( DASH )? FOURTH ) ) -> INT[\"24\"] | ( TWENTY_FIFTH | ( TWENTY ( DASH )? FIFTH ) ) -> INT[\"25\"] | ( TWENTY_SIXTH | ( TWENTY ( DASH )? SIXTH ) ) -> INT[\"26\"] | ( TWENTY_SEVENTH | ( TWENTY ( DASH )? SEVENTH ) ) -> INT[\"27\"] | ( TWENTY_EIGHTH | ( TWENTY ( DASH )? EIGHTH ) ) -> INT[\"28\"] | ( TWENTY_NINTH | ( TWENTY ( DASH )? NINTH ) ) -> INT[\"29\"] | THIRTIETH -> INT[\"30\"] | ( THIRTY_FIRST | ( THIRTY ( DASH )? FIRST ) ) -> INT[\"31\"] );";
        }
    }
 

    public static final BitSet FOLLOW_date_in_date_time152 = new BitSet(new long[]{0x0000060000000000L,0x000001F800000000L});
    public static final BitSet FOLLOW_time_in_date_time154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_in_date_time159 = new BitSet(new long[]{0xFFFFE003FFD80000L,0x0000033DFFFFFFFFL});
    public static final BitSet FOLLOW_COMMA_in_date_time162 = new BitSet(new long[]{0xFFFFE003FFD80000L,0x0000033DFFFFFFFFL});
    public static final BitSet FOLLOW_ON_in_date_time166 = new BitSet(new long[]{0xFFFFE003FFD80000L,0x0000033DFFFFFFFFL});
    public static final BitSet FOLLOW_date_in_date_time170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_in_date_time196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_in_date_time217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formal_date_in_date244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_month_and_day_date_in_date250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_4_digits_in_formal_date268 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_date_separator_in_formal_date270 = new BitSet(new long[]{0x0000000000000000L,0x0000003800000000L});
    public static final BitSet FOLLOW_int_1_to_12_in_formal_date272 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_date_separator_in_formal_date274 = new BitSet(new long[]{0x0000000000000000L,0x0000033800000000L});
    public static final BitSet FOLLOW_int_1_to_31_in_formal_date276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_1_to_12_in_formal_date315 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_date_separator_in_formal_date317 = new BitSet(new long[]{0x0000000000000000L,0x0000033800000000L});
    public static final BitSet FOLLOW_int_1_to_31_in_formal_date319 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_date_separator_in_formal_date322 = new BitSet(new long[]{0x0000000000000000L,0x00000FFE00000000L});
    public static final BitSet FOLLOW_int_up_to_4_digits_in_formal_date324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_day_of_month_in_month_and_day_date370 = new BitSet(new long[]{0xFFFFE003FFF80000L,0x0000033DFFFFFFFFL});
    public static final BitSet FOLLOW_OF_in_month_and_day_date372 = new BitSet(new long[]{0xFFFFE003FFD80000L,0x0000033DFFFFFFFFL});
    public static final BitSet FOLLOW_month_in_month_and_day_date375 = new BitSet(new long[]{0x0000002400080002L,0x00000FFE00000000L});
    public static final BitSet FOLLOW_year_in_month_and_day_date377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_month_in_month_and_day_date382 = new BitSet(new long[]{0xFFFFE00000000000L,0x00000339FFFFFFFFL});
    public static final BitSet FOLLOW_day_of_month_in_month_and_day_date384 = new BitSet(new long[]{0x0000002400080002L,0x00000FFE00000000L});
    public static final BitSet FOLLOW_year_in_month_and_day_date386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JANUARY_in_month420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FEBRUARY_in_month437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MARCH_in_month453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APRIL_in_month472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAY_in_month491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JUNE_in_month512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JULY_in_month532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AUGUST_in_month552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEPTEMBER_in_month570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OCTOBER_in_month585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOVEMBER_in_month602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECEMBER_in_month618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_or_int_1_to_31_in_day_of_month643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_sequence_1_to_31_in_day_of_month659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_year683 = new BitSet(new long[]{0x0000002400000000L});
    public static final BitSet FOLLOW_IN_in_year687 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_THE_in_year689 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_YEAR_in_year691 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_in_year695 = new BitSet(new long[]{0x0000000000000000L,0x00000F6800000000L});
    public static final BitSet FOLLOW_int_0_to_99_with_prefix_in_year697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_year712 = new BitSet(new long[]{0x0000000400000000L,0x00000FFE00000000L});
    public static final BitSet FOLLOW_IN_in_year716 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_THE_in_year718 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_YEAR_in_year720 = new BitSet(new long[]{0x0000000000000000L,0x00000FFE00000000L});
    public static final BitSet FOLLOW_int_3_or_4_digits_in_year724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_date_separator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hours_in_time789 = new BitSet(new long[]{0x0000190000000002L,0x000007F800000000L});
    public static final BitSet FOLLOW_COLON_in_time792 = new BitSet(new long[]{0x0000010000000000L,0x000007F800000000L});
    public static final BitSet FOLLOW_minutes_in_time795 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_meridian_indicator_in_time799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_identifier_in_time827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MIDNIGHT_in_time_identifier843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOON_in_time_identifier865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_0_to_23_in_hours900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_0_to_59_in_minutes923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AM_in_meridian_indicator946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PM_in_meridian_indicator957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_1_to_31_in_spelled_or_int_1_to_31978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_1_to_31_in_spelled_or_int_1_to_31984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_in_spelled_1_to_31999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWO_in_spelled_1_to_311017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THREE_in_spelled_1_to_311035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOUR_in_spelled_1_to_311051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIVE_in_spelled_1_to_311068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIX_in_spelled_1_to_311085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVEN_in_spelled_1_to_311103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHT_in_spelled_1_to_311119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINE_in_spelled_1_to_311135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEN_in_spelled_1_to_311152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEVEN_in_spelled_1_to_311170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWELVE_in_spelled_1_to_311185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_in_spelled_1_to_311200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOURTEEN_in_spelled_1_to_311213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIFTEEN_in_spelled_1_to_311226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTEEN_in_spelled_1_to_311240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVENTEEN_in_spelled_1_to_311254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHTEEN_in_spelled_1_to_311266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINETEEN_in_spelled_1_to_311279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_1_to_311292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_1_to_311307 = new BitSet(new long[]{0x0000204000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_1_to_311309 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ONE_in_spelled_1_to_311312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_1_to_311325 = new BitSet(new long[]{0x0000404000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_1_to_311327 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_TWO_in_spelled_1_to_311330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_1_to_311343 = new BitSet(new long[]{0x0000804000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_1_to_311345 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_THREE_in_spelled_1_to_311348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_1_to_311359 = new BitSet(new long[]{0x0001004000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_1_to_311361 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_FOUR_in_spelled_1_to_311364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_1_to_311376 = new BitSet(new long[]{0x0002004000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_1_to_311378 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_FIVE_in_spelled_1_to_311381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_1_to_311393 = new BitSet(new long[]{0x0004004000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_1_to_311395 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SIX_in_spelled_1_to_311398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_1_to_311411 = new BitSet(new long[]{0x0008004000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_1_to_311413 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SEVEN_in_spelled_1_to_311416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_1_to_311427 = new BitSet(new long[]{0x0010004000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_1_to_311429 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_EIGHT_in_spelled_1_to_311432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_1_to_311443 = new BitSet(new long[]{0x0020004000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_1_to_311445 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_NINE_in_spelled_1_to_311448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_in_spelled_1_to_311460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_in_spelled_1_to_311483 = new BitSet(new long[]{0x0000204000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_1_to_311485 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ONE_in_spelled_1_to_311488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIRST_in_spelled_sequence_1_to_311512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SECOND_in_spelled_sequence_1_to_311529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRD_in_spelled_sequence_1_to_311545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOURTH_in_spelled_sequence_1_to_311562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIFTH_in_spelled_sequence_1_to_311578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTH_in_spelled_sequence_1_to_311595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVENTH_in_spelled_sequence_1_to_311612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHTH_in_spelled_sequence_1_to_311627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINTH_in_spelled_sequence_1_to_311643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TENTH_in_spelled_sequence_1_to_311660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEVENTH_in_spelled_sequence_1_to_311677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWELFTH_in_spelled_sequence_1_to_311691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEENTH_in_spelled_sequence_1_to_311706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOURTEENTH_in_spelled_sequence_1_to_311718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIFTEENTH_in_spelled_sequence_1_to_311730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTEENTH_in_spelled_sequence_1_to_311743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVENTEENTH_in_spelled_sequence_1_to_311756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHTEENTH_in_spelled_sequence_1_to_311767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINETEENTH_in_spelled_sequence_1_to_311779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTIETH_in_spelled_sequence_1_to_311791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FIRST_in_spelled_sequence_1_to_311805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_311812 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_311814 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_FIRST_in_spelled_sequence_1_to_311817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_SECOND_in_spelled_sequence_1_to_311833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_311839 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_311841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SECOND_in_spelled_sequence_1_to_311844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_THIRD_in_spelled_sequence_1_to_311859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_311866 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_311868 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_THIRD_in_spelled_sequence_1_to_311871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FOURTH_in_spelled_sequence_1_to_311887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_311893 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_311895 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_FOURTH_in_spelled_sequence_1_to_311898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FIFTH_in_spelled_sequence_1_to_311913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_311920 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_311922 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_FIFTH_in_spelled_sequence_1_to_311925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_SIXTH_in_spelled_sequence_1_to_311941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_311948 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_311950 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_SIXTH_in_spelled_sequence_1_to_311953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_SEVENTH_in_spelled_sequence_1_to_311969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_311974 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_311976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_SEVENTH_in_spelled_sequence_1_to_311979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_EIGHTH_in_spelled_sequence_1_to_311993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_311999 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312001 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_EIGHTH_in_spelled_sequence_1_to_312004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_NINTH_in_spelled_sequence_1_to_312019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_312026 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_NINTH_in_spelled_sequence_1_to_312031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTIETH_in_spelled_sequence_1_to_312046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_FIRST_in_spelled_sequence_1_to_312090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_in_spelled_sequence_1_to_312097 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312099 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_FIRST_in_spelled_sequence_1_to_312102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_0_to_99_optional_prefix_in_int_up_to_4_digits2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_3_or_4_digits_in_int_up_to_4_digits2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THREE_DIGIT_in_int_3_or_4_digits2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_4_digits_in_int_3_or_4_digits2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOUR_DIGIT_in_int_4_digits2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREFIXED_ONE_TO_NINE_in_int_1_to_122197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_TO_NINE_in_int_1_to_122208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEN_TO_TWELVE_in_int_1_to_122228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWO_ZEROS_in_int_0_to_232256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ZERO_in_int_0_to_232282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_1_to_12_in_int_0_to_232313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_int_0_to_232319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_0_to_23_in_int_0_to_592340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FOUR_TO_THIRTY_ONE_in_int_0_to_592346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_TWO_TO_FIFTY_NINE_in_int_0_to_592357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_0_to_59_in_int_0_to_99_no_prefix2379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTY_TO_NINETY_NINE_in_int_0_to_99_no_prefix2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWO_ZEROS_in_int_0_to_99_with_prefix2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREFIXED_ONE_TO_NINE_in_int_0_to_99_with_prefix2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEN_TO_TWELVE_in_int_0_to_99_with_prefix2453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_int_0_to_99_with_prefix2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FOUR_TO_THIRTY_ONE_in_int_0_to_99_with_prefix2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_TWO_TO_FIFTY_NINE_in_int_0_to_99_with_prefix2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTY_TO_NINETY_NINE_in_int_0_to_99_with_prefix2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_0_to_99_with_prefix_in_int_0_to_99_optional_prefix2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_TO_NINE_in_int_0_to_99_optional_prefix2542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ZERO_in_int_0_to_99_optional_prefix2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREFIXED_ONE_TO_NINE_in_int_1_to_312579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_TO_NINE_in_int_1_to_312595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_10_to_31_in_int_1_to_312620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_TO_NINE_in_int_1_to_31_no_prefix2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_10_to_31_in_int_1_to_31_no_prefix2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEN_TO_TWELVE_in_int_10_to_312661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_int_10_to_312684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FOUR_TO_THIRTY_ONE_in_int_10_to_312696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_in_synpred1_Date137 = new BitSet(new long[]{0x0000060000080000L,0x000011F800000000L});
    public static final BitSet FOLLOW_set_in_synpred1_Date139 = new BitSet(new long[]{0x0000060000000000L,0x000001F800000000L});
    public static final BitSet FOLLOW_time_in_synpred1_Date148 = new BitSet(new long[]{0x0000000000000002L});

}