// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g 2010-02-03 07:32:14
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INT", "HOURS", "MINUTES", "AM_PM", "SPAN", "MONTH_OF", "DAY_OF_WEEK", "DAY_OF_MONTH", "YEAR_OF", "SEEK_DIR", "SEEK_TYPE", "EXPLICIT_TIME", "EXPLICIT_DATE", "RELATIVE_DATE", "DATE_TIME", "AT", "COMMA", "ON", "TODAY", "TOMORROW", "YESTERDAY", "THE", "DAY", "AFTER", "BEFORE", "COLON", "MIDNIGHT", "NOON", "THIS", "LAST", "PAST", "NEXT", "COMING", "UPCOMING", "IN", "FROM_NOW", "AGO", "WEEK", "MONTH", "YEAR", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "DASH", "SLASH", "AM", "PM", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN", "TWENTY", "THIRTY", "FIRST", "SECOND", "THIRD", "FOURTH", "FIFTH", "SIXTH", "SEVENTH", "EIGHTH", "NINTH", "TENTH", "ELEVENTH", "TWELFTH", "THIRTEENTH", "FOURTEENTH", "FIFTEENTH", "SIXTEENTH", "SEVENTEENTH", "EIGHTEENTH", "NINETEENTH", "TWENTIETH", "TWENTY_FIRST", "TWENTY_SECOND", "TWENTY_THIRD", "TWENTY_FOURTH", "TWENTY_FIFTH", "TWENTY_SIXTH", "TWENTY_SEVENTH", "TWENTY_EIGHTH", "TWENTY_NINTH", "THIRTIETH", "THIRTY_FIRST", "THREE_DIGIT", "FOUR_DIGIT", "TWO_ZEROS", "PREFIXED_ONE_TO_NINE", "TEN_TO_TWELVE", "ONE_TO_NINE", "THIRTEEN_TO_TWENTY_THREE", "TWENTY_FOUR_TO_THIRTY_ONE", "THIRTY_TWO_TO_FIFTY_NINE", "ONE_ZERO", "SIXTY_TO_NINETY_NINE", "DIGIT", "WHITE_SPACE", "'of'", "'\\''"
    };
    public static final int NINETEEN=85;
    public static final int WEEK=41;
    public static final int SEPTEMBER=52;
    public static final int THIRTEEN_TO_TWENTY_THREE=125;
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
    public static final int TWENTY_FOUR_TO_THIRTY_ONE=126;
    public static final int TOMORROW=23;
    public static final int RELATIVE_DATE=17;
    public static final int ONE_TO_NINE=124;
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
    public static final int THIRTY_TWO_TO_FIFTY_NINE=127;
    public static final int T__133=133;
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
    public static final int ONE_ZERO=128;
    public static final int TEN_TO_TWELVE=123;
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:28:1: datetime options {backtrack=true; } : ( ( relative_date ( date_time_sep )? time )=> relative_date ( date_time_sep )? time -> ^( DATE_TIME relative_date time ) | ( explicit_day_and_month year ( date_time_sep )? time )=> explicit_day_and_month year ( date_time_sep )? time -> ^( DATE_TIME ^( EXPLICIT_DATE explicit_day_and_month year ) time ) | date_prefix explicit_day_and_month ( year )? ( date_time_sep )? time -> ^( DATE_TIME ^( RELATIVE_DATE date_prefix ^( EXPLICIT_DATE explicit_day_and_month ( year )? ) ) time ) | date_prefix explicit_day_and_month ( year )? ( date_time_sep )? -> ^( DATE_TIME ^( RELATIVE_DATE date_prefix ^( EXPLICIT_DATE explicit_day_and_month ( year )? ) ) ) | ( date_prefix )? explicit_day_and_month ( date_time_sep )? ( time )? -> ^( DATE_TIME ^( EXPLICIT_DATE explicit_day_and_month ) ( time )? ) | time ( time_date_sep )? ( date_prefix )? explicit_day_and_month ( year )? -> ^( DATE_TIME ^( EXPLICIT_DATE explicit_day_and_month year ) ( time )? ) | ( date_prefix )? relative_date ( date_time_sep )? ( time )? -> ^( DATE_TIME relative_date time ) | time ( time_date_sep )? ( date_prefix )? relative_date -> ^( DATE_TIME relative_date time ) | time -> ^( DATE_TIME time ) );
    public final DateParser.datetime_return datetime() throws RecognitionException {
        DateParser.datetime_return retval = new DateParser.datetime_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.relative_date_return relative_date1 = null;

        DateParser.date_time_sep_return date_time_sep2 = null;

        DateParser.time_return time3 = null;

        DateParser.explicit_day_and_month_return explicit_day_and_month4 = null;

        DateParser.year_return year5 = null;

        DateParser.date_time_sep_return date_time_sep6 = null;

        DateParser.time_return time7 = null;

        DateParser.date_prefix_return date_prefix8 = null;

        DateParser.explicit_day_and_month_return explicit_day_and_month9 = null;

        DateParser.year_return year10 = null;

        DateParser.date_time_sep_return date_time_sep11 = null;

        DateParser.time_return time12 = null;

        DateParser.date_prefix_return date_prefix13 = null;

        DateParser.explicit_day_and_month_return explicit_day_and_month14 = null;

        DateParser.year_return year15 = null;

        DateParser.date_time_sep_return date_time_sep16 = null;

        DateParser.date_prefix_return date_prefix17 = null;

        DateParser.explicit_day_and_month_return explicit_day_and_month18 = null;

        DateParser.date_time_sep_return date_time_sep19 = null;

        DateParser.time_return time20 = null;

        DateParser.time_return time21 = null;

        DateParser.time_date_sep_return time_date_sep22 = null;

        DateParser.date_prefix_return date_prefix23 = null;

        DateParser.explicit_day_and_month_return explicit_day_and_month24 = null;

        DateParser.year_return year25 = null;

        DateParser.date_prefix_return date_prefix26 = null;

        DateParser.relative_date_return relative_date27 = null;

        DateParser.date_time_sep_return date_time_sep28 = null;

        DateParser.time_return time29 = null;

        DateParser.time_return time30 = null;

        DateParser.time_date_sep_return time_date_sep31 = null;

        DateParser.date_prefix_return date_prefix32 = null;

        DateParser.relative_date_return relative_date33 = null;

        DateParser.time_return time34 = null;


        RewriteRuleSubtreeStream stream_time=new RewriteRuleSubtreeStream(adaptor,"rule time");
        RewriteRuleSubtreeStream stream_date_prefix=new RewriteRuleSubtreeStream(adaptor,"rule date_prefix");
        RewriteRuleSubtreeStream stream_date_time_sep=new RewriteRuleSubtreeStream(adaptor,"rule date_time_sep");
        RewriteRuleSubtreeStream stream_time_date_sep=new RewriteRuleSubtreeStream(adaptor,"rule time_date_sep");
        RewriteRuleSubtreeStream stream_year=new RewriteRuleSubtreeStream(adaptor,"rule year");
        RewriteRuleSubtreeStream stream_relative_date=new RewriteRuleSubtreeStream(adaptor,"rule relative_date");
        RewriteRuleSubtreeStream stream_explicit_day_and_month=new RewriteRuleSubtreeStream(adaptor,"rule explicit_day_and_month");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:3: ( ( relative_date ( date_time_sep )? time )=> relative_date ( date_time_sep )? time -> ^( DATE_TIME relative_date time ) | ( explicit_day_and_month year ( date_time_sep )? time )=> explicit_day_and_month year ( date_time_sep )? time -> ^( DATE_TIME ^( EXPLICIT_DATE explicit_day_and_month year ) time ) | date_prefix explicit_day_and_month ( year )? ( date_time_sep )? time -> ^( DATE_TIME ^( RELATIVE_DATE date_prefix ^( EXPLICIT_DATE explicit_day_and_month ( year )? ) ) time ) | date_prefix explicit_day_and_month ( year )? ( date_time_sep )? -> ^( DATE_TIME ^( RELATIVE_DATE date_prefix ^( EXPLICIT_DATE explicit_day_and_month ( year )? ) ) ) | ( date_prefix )? explicit_day_and_month ( date_time_sep )? ( time )? -> ^( DATE_TIME ^( EXPLICIT_DATE explicit_day_and_month ) ( time )? ) | time ( time_date_sep )? ( date_prefix )? explicit_day_and_month ( year )? -> ^( DATE_TIME ^( EXPLICIT_DATE explicit_day_and_month year ) ( time )? ) | ( date_prefix )? relative_date ( date_time_sep )? ( time )? -> ^( DATE_TIME relative_date time ) | time ( time_date_sep )? ( date_prefix )? relative_date -> ^( DATE_TIME relative_date time ) | time -> ^( DATE_TIME time ) )
            int alt18=9;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:5: ( relative_date ( date_time_sep )? time )=> relative_date ( date_time_sep )? time
                    {
                    pushFollow(FOLLOW_relative_date_in_datetime145);
                    relative_date1=relative_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_date.add(relative_date1.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:57: ( date_time_sep )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( ((LA1_0>=AT && LA1_0<=COMMA)) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:57: date_time_sep
                            {
                            pushFollow(FOLLOW_date_time_sep_in_datetime147);
                            date_time_sep2=date_time_sep();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_date_time_sep.add(date_time_sep2.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_time_in_datetime150);
                    time3=time();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_time.add(time3.getTree());


                    // AST REWRITE
                    // elements: time, relative_date
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 31:5: -> ^( DATE_TIME relative_date time )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:31:8: ^( DATE_TIME relative_date time )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DATE_TIME, "DATE_TIME"), root_1);

                        adaptor.addChild(root_1, stream_relative_date.nextTree());
                        adaptor.addChild(root_1, stream_time.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:33:5: ( explicit_day_and_month year ( date_time_sep )? time )=> explicit_day_and_month year ( date_time_sep )? time
                    {
                    pushFollow(FOLLOW_explicit_day_and_month_in_datetime194);
                    explicit_day_and_month4=explicit_day_and_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_explicit_day_and_month.add(explicit_day_and_month4.getTree());
                    pushFollow(FOLLOW_year_in_datetime196);
                    year5=year();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_year.add(year5.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:34:35: ( date_time_sep )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( ((LA2_0>=AT && LA2_0<=COMMA)) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:34:35: date_time_sep
                            {
                            pushFollow(FOLLOW_date_time_sep_in_datetime198);
                            date_time_sep6=date_time_sep();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_date_time_sep.add(date_time_sep6.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_time_in_datetime201);
                    time7=time();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_time.add(time7.getTree());


                    // AST REWRITE
                    // elements: year, time, explicit_day_and_month
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 35:5: -> ^( DATE_TIME ^( EXPLICIT_DATE explicit_day_and_month year ) time )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:35:8: ^( DATE_TIME ^( EXPLICIT_DATE explicit_day_and_month year ) time )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DATE_TIME, "DATE_TIME"), root_1);

                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:35:20: ^( EXPLICIT_DATE explicit_day_and_month year )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_2);

                        adaptor.addChild(root_2, stream_explicit_day_and_month.nextTree());
                        adaptor.addChild(root_2, stream_year.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_time.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:37:5: date_prefix explicit_day_and_month ( year )? ( date_time_sep )? time
                    {
                    pushFollow(FOLLOW_date_prefix_in_datetime232);
                    date_prefix8=date_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_date_prefix.add(date_prefix8.getTree());
                    pushFollow(FOLLOW_explicit_day_and_month_in_datetime234);
                    explicit_day_and_month9=explicit_day_and_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_explicit_day_and_month.add(explicit_day_and_month9.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:37:40: ( year )?
                    int alt3=2;
                    switch ( input.LA(1) ) {
                        case COMMA:
                            {
                            switch ( input.LA(2) ) {
                                case IN:
                                case THREE_DIGIT:
                                case FOUR_DIGIT:
                                case TWENTY_FOUR_TO_THIRTY_ONE:
                                case THIRTY_TWO_TO_FIFTY_NINE:
                                case SIXTY_TO_NINETY_NINE:
                                case 133:
                                    {
                                    alt3=1;
                                    }
                                    break;
                                case TWO_ZEROS:
                                    {
                                    int LA3_3 = input.LA(3);

                                    if ( ((LA3_3>=AT && LA3_3<=COMMA)||(LA3_3>=MIDNIGHT && LA3_3<=NOON)||(LA3_3>=TWO_ZEROS && LA3_3<=THIRTEEN_TO_TWENTY_THREE)) ) {
                                        alt3=1;
                                    }
                                    }
                                    break;
                                case PREFIXED_ONE_TO_NINE:
                                    {
                                    int LA3_4 = input.LA(3);

                                    if ( ((LA3_4>=AT && LA3_4<=COMMA)||(LA3_4>=MIDNIGHT && LA3_4<=NOON)||(LA3_4>=TWO_ZEROS && LA3_4<=THIRTEEN_TO_TWENTY_THREE)) ) {
                                        alt3=1;
                                    }
                                    }
                                    break;
                                case TEN_TO_TWELVE:
                                    {
                                    int LA3_5 = input.LA(3);

                                    if ( ((LA3_5>=AT && LA3_5<=COMMA)||(LA3_5>=MIDNIGHT && LA3_5<=NOON)||(LA3_5>=TWO_ZEROS && LA3_5<=THIRTEEN_TO_TWENTY_THREE)) ) {
                                        alt3=1;
                                    }
                                    }
                                    break;
                                case THIRTEEN_TO_TWENTY_THREE:
                                    {
                                    int LA3_6 = input.LA(3);

                                    if ( ((LA3_6>=AT && LA3_6<=COMMA)||(LA3_6>=MIDNIGHT && LA3_6<=NOON)||(LA3_6>=TWO_ZEROS && LA3_6<=THIRTEEN_TO_TWENTY_THREE)) ) {
                                        alt3=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case IN:
                        case THREE_DIGIT:
                        case FOUR_DIGIT:
                        case TWENTY_FOUR_TO_THIRTY_ONE:
                        case THIRTY_TWO_TO_FIFTY_NINE:
                        case SIXTY_TO_NINETY_NINE:
                        case 133:
                            {
                            alt3=1;
                            }
                            break;
                        case TWO_ZEROS:
                            {
                            int LA3_3 = input.LA(2);

                            if ( ((LA3_3>=AT && LA3_3<=COMMA)||(LA3_3>=MIDNIGHT && LA3_3<=NOON)||(LA3_3>=TWO_ZEROS && LA3_3<=THIRTEEN_TO_TWENTY_THREE)) ) {
                                alt3=1;
                            }
                            }
                            break;
                        case PREFIXED_ONE_TO_NINE:
                            {
                            int LA3_4 = input.LA(2);

                            if ( ((LA3_4>=AT && LA3_4<=COMMA)||(LA3_4>=MIDNIGHT && LA3_4<=NOON)||(LA3_4>=TWO_ZEROS && LA3_4<=THIRTEEN_TO_TWENTY_THREE)) ) {
                                alt3=1;
                            }
                            }
                            break;
                        case TEN_TO_TWELVE:
                            {
                            int LA3_5 = input.LA(2);

                            if ( ((LA3_5>=AT && LA3_5<=COMMA)||(LA3_5>=MIDNIGHT && LA3_5<=NOON)||(LA3_5>=TWO_ZEROS && LA3_5<=THIRTEEN_TO_TWENTY_THREE)) ) {
                                alt3=1;
                            }
                            }
                            break;
                        case THIRTEEN_TO_TWENTY_THREE:
                            {
                            int LA3_6 = input.LA(2);

                            if ( ((LA3_6>=AT && LA3_6<=COMMA)||(LA3_6>=MIDNIGHT && LA3_6<=NOON)||(LA3_6>=TWO_ZEROS && LA3_6<=THIRTEEN_TO_TWENTY_THREE)) ) {
                                alt3=1;
                            }
                            }
                            break;
                    }

                    switch (alt3) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:37:40: year
                            {
                            pushFollow(FOLLOW_year_in_datetime236);
                            year10=year();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_year.add(year10.getTree());

                            }
                            break;

                    }

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:37:46: ( date_time_sep )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( ((LA4_0>=AT && LA4_0<=COMMA)) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:37:46: date_time_sep
                            {
                            pushFollow(FOLLOW_date_time_sep_in_datetime239);
                            date_time_sep11=date_time_sep();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_date_time_sep.add(date_time_sep11.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_time_in_datetime242);
                    time12=time();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_time.add(time12.getTree());


                    // AST REWRITE
                    // elements: explicit_day_and_month, date_prefix, time, year
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 38:5: -> ^( DATE_TIME ^( RELATIVE_DATE date_prefix ^( EXPLICIT_DATE explicit_day_and_month ( year )? ) ) time )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:38:8: ^( DATE_TIME ^( RELATIVE_DATE date_prefix ^( EXPLICIT_DATE explicit_day_and_month ( year )? ) ) time )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DATE_TIME, "DATE_TIME"), root_1);

                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:38:20: ^( RELATIVE_DATE date_prefix ^( EXPLICIT_DATE explicit_day_and_month ( year )? ) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_2);

                        adaptor.addChild(root_2, stream_date_prefix.nextTree());
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:38:48: ^( EXPLICIT_DATE explicit_day_and_month ( year )? )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_3);

                        adaptor.addChild(root_3, stream_explicit_day_and_month.nextTree());
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:38:87: ( year )?
                        if ( stream_year.hasNext() ) {
                            adaptor.addChild(root_3, stream_year.nextTree());

                        }
                        stream_year.reset();

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_time.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:40:5: date_prefix explicit_day_and_month ( year )? ( date_time_sep )?
                    {
                    pushFollow(FOLLOW_date_prefix_in_datetime280);
                    date_prefix13=date_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_date_prefix.add(date_prefix13.getTree());
                    pushFollow(FOLLOW_explicit_day_and_month_in_datetime282);
                    explicit_day_and_month14=explicit_day_and_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_explicit_day_and_month.add(explicit_day_and_month14.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:40:40: ( year )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==COMMA) ) {
                        int LA5_1 = input.LA(2);

                        if ( (LA5_1==IN||(LA5_1>=THREE_DIGIT && LA5_1<=TEN_TO_TWELVE)||(LA5_1>=THIRTEEN_TO_TWENTY_THREE && LA5_1<=THIRTY_TWO_TO_FIFTY_NINE)||LA5_1==SIXTY_TO_NINETY_NINE||LA5_1==133) ) {
                            alt5=1;
                        }
                    }
                    else if ( (LA5_0==IN||(LA5_0>=THREE_DIGIT && LA5_0<=TEN_TO_TWELVE)||(LA5_0>=THIRTEEN_TO_TWENTY_THREE && LA5_0<=THIRTY_TWO_TO_FIFTY_NINE)||LA5_0==SIXTY_TO_NINETY_NINE||LA5_0==133) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:40:40: year
                            {
                            pushFollow(FOLLOW_year_in_datetime284);
                            year15=year();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_year.add(year15.getTree());

                            }
                            break;

                    }

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:40:46: ( date_time_sep )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>=AT && LA6_0<=COMMA)) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:40:46: date_time_sep
                            {
                            pushFollow(FOLLOW_date_time_sep_in_datetime287);
                            date_time_sep16=date_time_sep();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_date_time_sep.add(date_time_sep16.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: date_prefix, explicit_day_and_month, year
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 41:5: -> ^( DATE_TIME ^( RELATIVE_DATE date_prefix ^( EXPLICIT_DATE explicit_day_and_month ( year )? ) ) )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:41:8: ^( DATE_TIME ^( RELATIVE_DATE date_prefix ^( EXPLICIT_DATE explicit_day_and_month ( year )? ) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DATE_TIME, "DATE_TIME"), root_1);

                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:41:20: ^( RELATIVE_DATE date_prefix ^( EXPLICIT_DATE explicit_day_and_month ( year )? ) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_2);

                        adaptor.addChild(root_2, stream_date_prefix.nextTree());
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:41:48: ^( EXPLICIT_DATE explicit_day_and_month ( year )? )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_3);

                        adaptor.addChild(root_3, stream_explicit_day_and_month.nextTree());
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:41:87: ( year )?
                        if ( stream_year.hasNext() ) {
                            adaptor.addChild(root_3, stream_year.nextTree());

                        }
                        stream_year.reset();

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:43:5: ( date_prefix )? explicit_day_and_month ( date_time_sep )? ( time )?
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:43:5: ( date_prefix )?
                    int alt7=2;
                    alt7 = dfa7.predict(input);
                    switch (alt7) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:43:5: date_prefix
                            {
                            pushFollow(FOLLOW_date_prefix_in_datetime326);
                            date_prefix17=date_prefix();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_date_prefix.add(date_prefix17.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_explicit_day_and_month_in_datetime329);
                    explicit_day_and_month18=explicit_day_and_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_explicit_day_and_month.add(explicit_day_and_month18.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:43:41: ( date_time_sep )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( ((LA8_0>=AT && LA8_0<=COMMA)) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:43:41: date_time_sep
                            {
                            pushFollow(FOLLOW_date_time_sep_in_datetime331);
                            date_time_sep19=date_time_sep();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_date_time_sep.add(date_time_sep19.getTree());

                            }
                            break;

                    }

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:43:56: ( time )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( ((LA9_0>=MIDNIGHT && LA9_0<=NOON)||(LA9_0>=TWO_ZEROS && LA9_0<=THIRTEEN_TO_TWENTY_THREE)) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:43:56: time
                            {
                            pushFollow(FOLLOW_time_in_datetime334);
                            time20=time();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_time.add(time20.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: time, explicit_day_and_month
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 44:5: -> ^( DATE_TIME ^( EXPLICIT_DATE explicit_day_and_month ) ( time )? )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:44:8: ^( DATE_TIME ^( EXPLICIT_DATE explicit_day_and_month ) ( time )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DATE_TIME, "DATE_TIME"), root_1);

                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:44:20: ^( EXPLICIT_DATE explicit_day_and_month )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_2);

                        adaptor.addChild(root_2, stream_explicit_day_and_month.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:44:60: ( time )?
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
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:46:5: time ( time_date_sep )? ( date_prefix )? explicit_day_and_month ( year )?
                    {
                    pushFollow(FOLLOW_time_in_datetime363);
                    time21=time();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_time.add(time21.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:46:10: ( time_date_sep )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==ON) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:46:10: time_date_sep
                            {
                            pushFollow(FOLLOW_time_date_sep_in_datetime365);
                            time_date_sep22=time_date_sep();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_time_date_sep.add(time_date_sep22.getTree());

                            }
                            break;

                    }

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:46:25: ( date_prefix )?
                    int alt11=2;
                    alt11 = dfa11.predict(input);
                    switch (alt11) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:46:25: date_prefix
                            {
                            pushFollow(FOLLOW_date_prefix_in_datetime368);
                            date_prefix23=date_prefix();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_date_prefix.add(date_prefix23.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_explicit_day_and_month_in_datetime371);
                    explicit_day_and_month24=explicit_day_and_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_explicit_day_and_month.add(explicit_day_and_month24.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:46:61: ( year )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==COMMA||LA12_0==IN||(LA12_0>=THREE_DIGIT && LA12_0<=TEN_TO_TWELVE)||(LA12_0>=THIRTEEN_TO_TWENTY_THREE && LA12_0<=THIRTY_TWO_TO_FIFTY_NINE)||LA12_0==SIXTY_TO_NINETY_NINE||LA12_0==133) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:46:61: year
                            {
                            pushFollow(FOLLOW_year_in_datetime373);
                            year25=year();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_year.add(year25.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: year, explicit_day_and_month, time
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 47:5: -> ^( DATE_TIME ^( EXPLICIT_DATE explicit_day_and_month year ) ( time )? )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:47:8: ^( DATE_TIME ^( EXPLICIT_DATE explicit_day_and_month year ) ( time )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DATE_TIME, "DATE_TIME"), root_1);

                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:47:20: ^( EXPLICIT_DATE explicit_day_and_month year )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_2);

                        adaptor.addChild(root_2, stream_explicit_day_and_month.nextTree());
                        adaptor.addChild(root_2, stream_year.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:47:65: ( time )?
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
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:49:5: ( date_prefix )? relative_date ( date_time_sep )? ( time )?
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:49:5: ( date_prefix )?
                    int alt13=2;
                    alt13 = dfa13.predict(input);
                    switch (alt13) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:49:5: date_prefix
                            {
                            pushFollow(FOLLOW_date_prefix_in_datetime406);
                            date_prefix26=date_prefix();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_date_prefix.add(date_prefix26.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_relative_date_in_datetime409);
                    relative_date27=relative_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_date.add(relative_date27.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:49:32: ( date_time_sep )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( ((LA14_0>=AT && LA14_0<=COMMA)) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:49:32: date_time_sep
                            {
                            pushFollow(FOLLOW_date_time_sep_in_datetime411);
                            date_time_sep28=date_time_sep();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_date_time_sep.add(date_time_sep28.getTree());

                            }
                            break;

                    }

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:49:47: ( time )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( ((LA15_0>=MIDNIGHT && LA15_0<=NOON)||(LA15_0>=TWO_ZEROS && LA15_0<=THIRTEEN_TO_TWENTY_THREE)) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:49:47: time
                            {
                            pushFollow(FOLLOW_time_in_datetime414);
                            time29=time();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_time.add(time29.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: time, relative_date
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 50:5: -> ^( DATE_TIME relative_date time )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:50:8: ^( DATE_TIME relative_date time )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DATE_TIME, "DATE_TIME"), root_1);

                        adaptor.addChild(root_1, stream_relative_date.nextTree());
                        adaptor.addChild(root_1, stream_time.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:52:5: time ( time_date_sep )? ( date_prefix )? relative_date
                    {
                    pushFollow(FOLLOW_time_in_datetime439);
                    time30=time();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_time.add(time30.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:52:10: ( time_date_sep )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==ON) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:52:10: time_date_sep
                            {
                            pushFollow(FOLLOW_time_date_sep_in_datetime441);
                            time_date_sep31=time_date_sep();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_time_date_sep.add(time_date_sep31.getTree());

                            }
                            break;

                    }

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:52:25: ( date_prefix )?
                    int alt17=2;
                    alt17 = dfa17.predict(input);
                    switch (alt17) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:52:25: date_prefix
                            {
                            pushFollow(FOLLOW_date_prefix_in_datetime444);
                            date_prefix32=date_prefix();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_date_prefix.add(date_prefix32.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_relative_date_in_datetime447);
                    relative_date33=relative_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_date.add(relative_date33.getTree());


                    // AST REWRITE
                    // elements: time, relative_date
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 53:5: -> ^( DATE_TIME relative_date time )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:53:8: ^( DATE_TIME relative_date time )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DATE_TIME, "DATE_TIME"), root_1);

                        adaptor.addChild(root_1, stream_relative_date.nextTree());
                        adaptor.addChild(root_1, stream_time.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:55:5: time
                    {
                    pushFollow(FOLLOW_time_in_datetime482);
                    time34=time();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_time.add(time34.getTree());


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
                    // 56:5: -> ^( DATE_TIME time )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:56:8: ^( DATE_TIME time )
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
    // $ANTLR end "datetime"

    public static class date_time_sep_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "date_time_sep"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:59:1: date_time_sep : ( AT | COMMA );
    public final DateParser.date_time_sep_return date_time_sep() throws RecognitionException {
        DateParser.date_time_sep_return retval = new DateParser.date_time_sep_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set35=null;

        Object set35_tree=null;

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:60:3: ( AT | COMMA )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:
            {
            root_0 = (Object)adaptor.nil();

            set35=(Token)input.LT(1);
            if ( (input.LA(1)>=AT && input.LA(1)<=COMMA) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set35));
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:64:1: time_date_sep : ON ;
    public final DateParser.time_date_sep_return time_date_sep() throws RecognitionException {
        DateParser.time_date_sep_return retval = new DateParser.time_date_sep_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ON36=null;

        Object ON36_tree=null;

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:65:3: ( ON )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:65:5: ON
            {
            root_0 = (Object)adaptor.nil();

            ON36=(Token)match(input,ON,FOLLOW_ON_in_time_date_sep530); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ON36_tree = (Object)adaptor.create(ON36);
            adaptor.addChild(root_0, ON36_tree);
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:68:1: relative_date : ( named_relative_date | modifiable_target -> ^( RELATIVE_DATE SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"] modifiable_target ) | target_prefix modifiable_target -> ^( RELATIVE_DATE target_prefix modifiable_target ) | spelled_or_int_1_to_31 modifiable_target target_suffix -> ^( RELATIVE_DATE target_suffix spelled_or_int_1_to_31 modifiable_target ) );
    public final DateParser.relative_date_return relative_date() throws RecognitionException {
        DateParser.relative_date_return retval = new DateParser.relative_date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.named_relative_date_return named_relative_date37 = null;

        DateParser.modifiable_target_return modifiable_target38 = null;

        DateParser.target_prefix_return target_prefix39 = null;

        DateParser.modifiable_target_return modifiable_target40 = null;

        DateParser.spelled_or_int_1_to_31_return spelled_or_int_1_to_3141 = null;

        DateParser.modifiable_target_return modifiable_target42 = null;

        DateParser.target_suffix_return target_suffix43 = null;


        RewriteRuleSubtreeStream stream_spelled_or_int_1_to_31=new RewriteRuleSubtreeStream(adaptor,"rule spelled_or_int_1_to_31");
        RewriteRuleSubtreeStream stream_target_suffix=new RewriteRuleSubtreeStream(adaptor,"rule target_suffix");
        RewriteRuleSubtreeStream stream_modifiable_target=new RewriteRuleSubtreeStream(adaptor,"rule modifiable_target");
        RewriteRuleSubtreeStream stream_target_prefix=new RewriteRuleSubtreeStream(adaptor,"rule target_prefix");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:70:3: ( named_relative_date | modifiable_target -> ^( RELATIVE_DATE SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"] modifiable_target ) | target_prefix modifiable_target -> ^( RELATIVE_DATE target_prefix modifiable_target ) | spelled_or_int_1_to_31 modifiable_target target_suffix -> ^( RELATIVE_DATE target_suffix spelled_or_int_1_to_31 modifiable_target ) )
            int alt19=4;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:70:5: named_relative_date
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_named_relative_date_in_relative_date548);
                    named_relative_date37=named_relative_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, named_relative_date37.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:73:5: modifiable_target
                    {
                    pushFollow(FOLLOW_modifiable_target_in_relative_date560);
                    modifiable_target38=modifiable_target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifiable_target.add(modifiable_target38.getTree());


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
                    // 74:5: -> ^( RELATIVE_DATE SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"] modifiable_target )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:74:8: ^( RELATIVE_DATE SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"] modifiable_target )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:77:5: target_prefix modifiable_target
                    {
                    pushFollow(FOLLOW_target_prefix_in_relative_date594);
                    target_prefix39=target_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_target_prefix.add(target_prefix39.getTree());
                    pushFollow(FOLLOW_modifiable_target_in_relative_date596);
                    modifiable_target40=modifiable_target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifiable_target.add(modifiable_target40.getTree());


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
                    // 78:5: -> ^( RELATIVE_DATE target_prefix modifiable_target )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:78:8: ^( RELATIVE_DATE target_prefix modifiable_target )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:81:5: spelled_or_int_1_to_31 modifiable_target target_suffix
                    {
                    pushFollow(FOLLOW_spelled_or_int_1_to_31_in_relative_date625);
                    spelled_or_int_1_to_3141=spelled_or_int_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_or_int_1_to_31.add(spelled_or_int_1_to_3141.getTree());
                    pushFollow(FOLLOW_modifiable_target_in_relative_date627);
                    modifiable_target42=modifiable_target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifiable_target.add(modifiable_target42.getTree());
                    pushFollow(FOLLOW_target_suffix_in_relative_date629);
                    target_suffix43=target_suffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_target_suffix.add(target_suffix43.getTree());


                    // AST REWRITE
                    // elements: target_suffix, modifiable_target, spelled_or_int_1_to_31
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 82:5: -> ^( RELATIVE_DATE target_suffix spelled_or_int_1_to_31 modifiable_target )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:82:8: ^( RELATIVE_DATE target_suffix spelled_or_int_1_to_31 modifiable_target )
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:85:1: named_relative_date : ( TODAY -> ^( RELATIVE_DATE SEEK_DIR[\">\"] INT[\"0\"] ) | TOMORROW -> ^( RELATIVE_DATE SEEK_DIR[\">\"] INT[\"1\"] ) | YESTERDAY -> ^( RELATIVE_DATE SEEK_DIR[\"<\"] INT[\"1\"] ) );
    public final DateParser.named_relative_date_return named_relative_date() throws RecognitionException {
        DateParser.named_relative_date_return retval = new DateParser.named_relative_date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TODAY44=null;
        Token TOMORROW45=null;
        Token YESTERDAY46=null;

        Object TODAY44_tree=null;
        Object TOMORROW45_tree=null;
        Object YESTERDAY46_tree=null;
        RewriteRuleTokenStream stream_TODAY=new RewriteRuleTokenStream(adaptor,"token TODAY");
        RewriteRuleTokenStream stream_YESTERDAY=new RewriteRuleTokenStream(adaptor,"token YESTERDAY");
        RewriteRuleTokenStream stream_TOMORROW=new RewriteRuleTokenStream(adaptor,"token TOMORROW");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:86:3: ( TODAY -> ^( RELATIVE_DATE SEEK_DIR[\">\"] INT[\"0\"] ) | TOMORROW -> ^( RELATIVE_DATE SEEK_DIR[\">\"] INT[\"1\"] ) | YESTERDAY -> ^( RELATIVE_DATE SEEK_DIR[\"<\"] INT[\"1\"] ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case TODAY:
                {
                alt20=1;
                }
                break;
            case TOMORROW:
                {
                alt20=2;
                }
                break;
            case YESTERDAY:
                {
                alt20=3;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:86:5: TODAY
                    {
                    TODAY44=(Token)match(input,TODAY,FOLLOW_TODAY_in_named_relative_date661); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TODAY.add(TODAY44);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 86:15: -> ^( RELATIVE_DATE SEEK_DIR[\">\"] INT[\"0\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:86:18: ^( RELATIVE_DATE SEEK_DIR[\">\"] INT[\"0\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:87:5: TOMORROW
                    {
                    TOMORROW45=(Token)match(input,TOMORROW,FOLLOW_TOMORROW_in_named_relative_date683); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TOMORROW.add(TOMORROW45);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 87:15: -> ^( RELATIVE_DATE SEEK_DIR[\">\"] INT[\"1\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:87:18: ^( RELATIVE_DATE SEEK_DIR[\">\"] INT[\"1\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:88:5: YESTERDAY
                    {
                    YESTERDAY46=(Token)match(input,YESTERDAY,FOLLOW_YESTERDAY_in_named_relative_date702); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_YESTERDAY.add(YESTERDAY46);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 88:15: -> ^( RELATIVE_DATE SEEK_DIR[\"<\"] INT[\"1\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:88:18: ^( RELATIVE_DATE SEEK_DIR[\"<\"] INT[\"1\"] )
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

    public static class explicit_day_and_month_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "explicit_day_and_month"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:91:1: explicit_day_and_month : ( month day_of_month -> month day_of_month | day_of_month ( 'of' )? month -> month day_of_month );
    public final DateParser.explicit_day_and_month_return explicit_day_and_month() throws RecognitionException {
        DateParser.explicit_day_and_month_return retval = new DateParser.explicit_day_and_month_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal50=null;
        DateParser.month_return month47 = null;

        DateParser.day_of_month_return day_of_month48 = null;

        DateParser.day_of_month_return day_of_month49 = null;

        DateParser.month_return month51 = null;


        Object string_literal50_tree=null;
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
        RewriteRuleSubtreeStream stream_month=new RewriteRuleSubtreeStream(adaptor,"rule month");
        RewriteRuleSubtreeStream stream_day_of_month=new RewriteRuleSubtreeStream(adaptor,"rule day_of_month");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:93:3: ( month day_of_month -> month day_of_month | day_of_month ( 'of' )? month -> month day_of_month )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=JANUARY && LA22_0<=DECEMBER)) ) {
                alt22=1;
            }
            else if ( ((LA22_0>=ONE && LA22_0<=THIRTY_FIRST)||(LA22_0>=PREFIXED_ONE_TO_NINE && LA22_0<=TWENTY_FOUR_TO_THIRTY_ONE)) ) {
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:93:5: month day_of_month
                    {
                    pushFollow(FOLLOW_month_in_explicit_day_and_month734);
                    month47=month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_month.add(month47.getTree());
                    pushFollow(FOLLOW_day_of_month_in_explicit_day_and_month736);
                    day_of_month48=day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_day_of_month.add(day_of_month48.getTree());


                    // AST REWRITE
                    // elements: month, day_of_month
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 94:5: -> month day_of_month
                    {
                        adaptor.addChild(root_0, stream_month.nextTree());
                        adaptor.addChild(root_0, stream_day_of_month.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:97:5: day_of_month ( 'of' )? month
                    {
                    pushFollow(FOLLOW_day_of_month_in_explicit_day_and_month759);
                    day_of_month49=day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_day_of_month.add(day_of_month49.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:97:18: ( 'of' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==132) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:97:18: 'of'
                            {
                            string_literal50=(Token)match(input,132,FOLLOW_132_in_explicit_day_and_month761); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_132.add(string_literal50);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_month_in_explicit_day_and_month764);
                    month51=month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_month.add(month51.getTree());


                    // AST REWRITE
                    // elements: day_of_month, month
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 98:5: -> month day_of_month
                    {
                        adaptor.addChild(root_0, stream_month.nextTree());
                        adaptor.addChild(root_0, stream_day_of_month.nextTree());

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
    // $ANTLR end "explicit_day_and_month"

    public static class formal_explicit_date_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formal_explicit_date"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:102:1: formal_explicit_date : ( int_4_digits date_separator int_1_to_12 date_separator int_1_to_31 -> ^( EXPLICIT_DATE ^( MONTH_OF int_1_to_12 ) ^( DAY_OF_MONTH int_1_to_31 ) ^( YEAR_OF int_4_digits ) ) | int_1_to_12 date_separator int_1_to_31 ( date_separator int_up_to_4_digits )? -> ^( EXPLICIT_DATE ^( MONTH_OF int_1_to_31 ) ^( DAY_OF_MONTH int_1_to_31 ) ^( YEAR_OF ( int_up_to_4_digits )? ) ) );
    public final DateParser.formal_explicit_date_return formal_explicit_date() throws RecognitionException {
        DateParser.formal_explicit_date_return retval = new DateParser.formal_explicit_date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_4_digits_return int_4_digits52 = null;

        DateParser.date_separator_return date_separator53 = null;

        DateParser.int_1_to_12_return int_1_to_1254 = null;

        DateParser.date_separator_return date_separator55 = null;

        DateParser.int_1_to_31_return int_1_to_3156 = null;

        DateParser.int_1_to_12_return int_1_to_1257 = null;

        DateParser.date_separator_return date_separator58 = null;

        DateParser.int_1_to_31_return int_1_to_3159 = null;

        DateParser.date_separator_return date_separator60 = null;

        DateParser.int_up_to_4_digits_return int_up_to_4_digits61 = null;


        RewriteRuleSubtreeStream stream_int_1_to_31=new RewriteRuleSubtreeStream(adaptor,"rule int_1_to_31");
        RewriteRuleSubtreeStream stream_int_up_to_4_digits=new RewriteRuleSubtreeStream(adaptor,"rule int_up_to_4_digits");
        RewriteRuleSubtreeStream stream_int_4_digits=new RewriteRuleSubtreeStream(adaptor,"rule int_4_digits");
        RewriteRuleSubtreeStream stream_date_separator=new RewriteRuleSubtreeStream(adaptor,"rule date_separator");
        RewriteRuleSubtreeStream stream_int_1_to_12=new RewriteRuleSubtreeStream(adaptor,"rule int_1_to_12");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:104:3: ( int_4_digits date_separator int_1_to_12 date_separator int_1_to_31 -> ^( EXPLICIT_DATE ^( MONTH_OF int_1_to_12 ) ^( DAY_OF_MONTH int_1_to_31 ) ^( YEAR_OF int_4_digits ) ) | int_1_to_12 date_separator int_1_to_31 ( date_separator int_up_to_4_digits )? -> ^( EXPLICIT_DATE ^( MONTH_OF int_1_to_31 ) ^( DAY_OF_MONTH int_1_to_31 ) ^( YEAR_OF ( int_up_to_4_digits )? ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==FOUR_DIGIT) ) {
                alt24=1;
            }
            else if ( ((LA24_0>=TWO_ZEROS && LA24_0<=TEN_TO_TWELVE)) ) {
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:104:5: int_4_digits date_separator int_1_to_12 date_separator int_1_to_31
                    {
                    pushFollow(FOLLOW_int_4_digits_in_formal_explicit_date792);
                    int_4_digits52=int_4_digits();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_4_digits.add(int_4_digits52.getTree());
                    pushFollow(FOLLOW_date_separator_in_formal_explicit_date794);
                    date_separator53=date_separator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_date_separator.add(date_separator53.getTree());
                    pushFollow(FOLLOW_int_1_to_12_in_formal_explicit_date796);
                    int_1_to_1254=int_1_to_12();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_1_to_12.add(int_1_to_1254.getTree());
                    pushFollow(FOLLOW_date_separator_in_formal_explicit_date798);
                    date_separator55=date_separator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_date_separator.add(date_separator55.getTree());
                    pushFollow(FOLLOW_int_1_to_31_in_formal_explicit_date800);
                    int_1_to_3156=int_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_1_to_31.add(int_1_to_3156.getTree());


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
                    // 105:5: -> ^( EXPLICIT_DATE ^( MONTH_OF int_1_to_12 ) ^( DAY_OF_MONTH int_1_to_31 ) ^( YEAR_OF int_4_digits ) )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:105:8: ^( EXPLICIT_DATE ^( MONTH_OF int_1_to_12 ) ^( DAY_OF_MONTH int_1_to_31 ) ^( YEAR_OF int_4_digits ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_1);

                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:105:24: ^( MONTH_OF int_1_to_12 )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF, "MONTH_OF"), root_2);

                        adaptor.addChild(root_2, stream_int_1_to_12.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:105:48: ^( DAY_OF_MONTH int_1_to_31 )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_MONTH, "DAY_OF_MONTH"), root_2);

                        adaptor.addChild(root_2, stream_int_1_to_31.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:105:76: ^( YEAR_OF int_4_digits )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:108:5: int_1_to_12 date_separator int_1_to_31 ( date_separator int_up_to_4_digits )?
                    {
                    pushFollow(FOLLOW_int_1_to_12_in_formal_explicit_date838);
                    int_1_to_1257=int_1_to_12();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_1_to_12.add(int_1_to_1257.getTree());
                    pushFollow(FOLLOW_date_separator_in_formal_explicit_date840);
                    date_separator58=date_separator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_date_separator.add(date_separator58.getTree());
                    pushFollow(FOLLOW_int_1_to_31_in_formal_explicit_date842);
                    int_1_to_3159=int_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_1_to_31.add(int_1_to_3159.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:108:44: ( date_separator int_up_to_4_digits )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( ((LA23_0>=DASH && LA23_0<=SLASH)) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:108:45: date_separator int_up_to_4_digits
                            {
                            pushFollow(FOLLOW_date_separator_in_formal_explicit_date845);
                            date_separator60=date_separator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_date_separator.add(date_separator60.getTree());
                            pushFollow(FOLLOW_int_up_to_4_digits_in_formal_explicit_date847);
                            int_up_to_4_digits61=int_up_to_4_digits();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_int_up_to_4_digits.add(int_up_to_4_digits61.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: int_1_to_31, int_1_to_31, int_up_to_4_digits
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 109:5: -> ^( EXPLICIT_DATE ^( MONTH_OF int_1_to_31 ) ^( DAY_OF_MONTH int_1_to_31 ) ^( YEAR_OF ( int_up_to_4_digits )? ) )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:109:8: ^( EXPLICIT_DATE ^( MONTH_OF int_1_to_31 ) ^( DAY_OF_MONTH int_1_to_31 ) ^( YEAR_OF ( int_up_to_4_digits )? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_1);

                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:109:24: ^( MONTH_OF int_1_to_31 )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF, "MONTH_OF"), root_2);

                        adaptor.addChild(root_2, stream_int_1_to_31.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:109:48: ^( DAY_OF_MONTH int_1_to_31 )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_MONTH, "DAY_OF_MONTH"), root_2);

                        adaptor.addChild(root_2, stream_int_1_to_31.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:109:76: ^( YEAR_OF ( int_up_to_4_digits )? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(YEAR_OF, "YEAR_OF"), root_2);

                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:109:86: ( int_up_to_4_digits )?
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:113:1: date_prefix : ( ( THE )? DAY AFTER -> SEEK_DIR[\">\"] INT[\"1\"] | spelled_or_int_1_to_31 DAY AFTER -> SEEK_DIR[\">\"] spelled_or_int_1_to_31 | ( THE )? DAY BEFORE -> SEEK_DIR[\"<\"] INT[\"1\"] | spelled_or_int_1_to_31 DAY BEFORE -> SEEK_DIR[\"<\"] spelled_or_int_1_to_31 );
    public final DateParser.date_prefix_return date_prefix() throws RecognitionException {
        DateParser.date_prefix_return retval = new DateParser.date_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THE62=null;
        Token DAY63=null;
        Token AFTER64=null;
        Token DAY66=null;
        Token AFTER67=null;
        Token THE68=null;
        Token DAY69=null;
        Token BEFORE70=null;
        Token DAY72=null;
        Token BEFORE73=null;
        DateParser.spelled_or_int_1_to_31_return spelled_or_int_1_to_3165 = null;

        DateParser.spelled_or_int_1_to_31_return spelled_or_int_1_to_3171 = null;


        Object THE62_tree=null;
        Object DAY63_tree=null;
        Object AFTER64_tree=null;
        Object DAY66_tree=null;
        Object AFTER67_tree=null;
        Object THE68_tree=null;
        Object DAY69_tree=null;
        Object BEFORE70_tree=null;
        Object DAY72_tree=null;
        Object BEFORE73_tree=null;
        RewriteRuleTokenStream stream_BEFORE=new RewriteRuleTokenStream(adaptor,"token BEFORE");
        RewriteRuleTokenStream stream_DAY=new RewriteRuleTokenStream(adaptor,"token DAY");
        RewriteRuleTokenStream stream_AFTER=new RewriteRuleTokenStream(adaptor,"token AFTER");
        RewriteRuleTokenStream stream_THE=new RewriteRuleTokenStream(adaptor,"token THE");
        RewriteRuleSubtreeStream stream_spelled_or_int_1_to_31=new RewriteRuleSubtreeStream(adaptor,"rule spelled_or_int_1_to_31");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:114:3: ( ( THE )? DAY AFTER -> SEEK_DIR[\">\"] INT[\"1\"] | spelled_or_int_1_to_31 DAY AFTER -> SEEK_DIR[\">\"] spelled_or_int_1_to_31 | ( THE )? DAY BEFORE -> SEEK_DIR[\"<\"] INT[\"1\"] | spelled_or_int_1_to_31 DAY BEFORE -> SEEK_DIR[\"<\"] spelled_or_int_1_to_31 )
            int alt27=4;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:114:5: ( THE )? DAY AFTER
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:114:5: ( THE )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==THE) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:114:5: THE
                            {
                            THE62=(Token)match(input,THE,FOLLOW_THE_in_date_prefix894); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THE.add(THE62);


                            }
                            break;

                    }

                    DAY63=(Token)match(input,DAY,FOLLOW_DAY_in_date_prefix897); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DAY.add(DAY63);

                    AFTER64=(Token)match(input,AFTER,FOLLOW_AFTER_in_date_prefix899); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AFTER.add(AFTER64);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 114:39: -> SEEK_DIR[\">\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIR, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:115:5: spelled_or_int_1_to_31 DAY AFTER
                    {
                    pushFollow(FOLLOW_spelled_or_int_1_to_31_in_date_prefix932);
                    spelled_or_int_1_to_3165=spelled_or_int_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_or_int_1_to_31.add(spelled_or_int_1_to_3165.getTree());
                    DAY66=(Token)match(input,DAY,FOLLOW_DAY_in_date_prefix934); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DAY.add(DAY66);

                    AFTER67=(Token)match(input,AFTER,FOLLOW_AFTER_in_date_prefix936); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AFTER.add(AFTER67);



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
                    // 115:39: -> SEEK_DIR[\">\"] spelled_or_int_1_to_31
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIR, ">"));
                        adaptor.addChild(root_0, stream_spelled_or_int_1_to_31.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:116:5: ( THE )? DAY BEFORE
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:116:5: ( THE )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==THE) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:116:5: THE
                            {
                            THE68=(Token)match(input,THE,FOLLOW_THE_in_date_prefix950); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THE.add(THE68);


                            }
                            break;

                    }

                    DAY69=(Token)match(input,DAY,FOLLOW_DAY_in_date_prefix953); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DAY.add(DAY69);

                    BEFORE70=(Token)match(input,BEFORE,FOLLOW_BEFORE_in_date_prefix955); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BEFORE.add(BEFORE70);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 116:39: -> SEEK_DIR[\"<\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIR, "<"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:117:5: spelled_or_int_1_to_31 DAY BEFORE
                    {
                    pushFollow(FOLLOW_spelled_or_int_1_to_31_in_date_prefix987);
                    spelled_or_int_1_to_3171=spelled_or_int_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_or_int_1_to_31.add(spelled_or_int_1_to_3171.getTree());
                    DAY72=(Token)match(input,DAY,FOLLOW_DAY_in_date_prefix989); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DAY.add(DAY72);

                    BEFORE73=(Token)match(input,BEFORE,FOLLOW_BEFORE_in_date_prefix991); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BEFORE.add(BEFORE73);



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
                    // 117:39: -> SEEK_DIR[\"<\"] spelled_or_int_1_to_31
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:120:1: time : ( hours ( COLON minutes )? ( meridian_indicator )? -> ^( EXPLICIT_TIME hours ( minutes )? ( meridian_indicator )? ) | time_identifier );
    public final DateParser.time_return time() throws RecognitionException {
        DateParser.time_return retval = new DateParser.time_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON75=null;
        DateParser.hours_return hours74 = null;

        DateParser.minutes_return minutes76 = null;

        DateParser.meridian_indicator_return meridian_indicator77 = null;

        DateParser.time_identifier_return time_identifier78 = null;


        Object COLON75_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_meridian_indicator=new RewriteRuleSubtreeStream(adaptor,"rule meridian_indicator");
        RewriteRuleSubtreeStream stream_minutes=new RewriteRuleSubtreeStream(adaptor,"rule minutes");
        RewriteRuleSubtreeStream stream_hours=new RewriteRuleSubtreeStream(adaptor,"rule hours");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:121:3: ( hours ( COLON minutes )? ( meridian_indicator )? -> ^( EXPLICIT_TIME hours ( minutes )? ( meridian_indicator )? ) | time_identifier )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=TWO_ZEROS && LA30_0<=THIRTEEN_TO_TWENTY_THREE)) ) {
                alt30=1;
            }
            else if ( ((LA30_0>=MIDNIGHT && LA30_0<=NOON)) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:121:5: hours ( COLON minutes )? ( meridian_indicator )?
                    {
                    pushFollow(FOLLOW_hours_in_time1014);
                    hours74=hours();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_hours.add(hours74.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:121:11: ( COLON minutes )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==COLON) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:121:12: COLON minutes
                            {
                            COLON75=(Token)match(input,COLON,FOLLOW_COLON_in_time1017); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COLON.add(COLON75);

                            pushFollow(FOLLOW_minutes_in_time1019);
                            minutes76=minutes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_minutes.add(minutes76.getTree());

                            }
                            break;

                    }

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:121:28: ( meridian_indicator )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( ((LA29_0>=AM && LA29_0<=PM)) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:121:28: meridian_indicator
                            {
                            pushFollow(FOLLOW_meridian_indicator_in_time1023);
                            meridian_indicator77=meridian_indicator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_meridian_indicator.add(meridian_indicator77.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: hours, minutes, meridian_indicator
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 122:5: -> ^( EXPLICIT_TIME hours ( minutes )? ( meridian_indicator )? )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:122:8: ^( EXPLICIT_TIME hours ( minutes )? ( meridian_indicator )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        adaptor.addChild(root_1, stream_hours.nextTree());
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:122:30: ( minutes )?
                        if ( stream_minutes.hasNext() ) {
                            adaptor.addChild(root_1, stream_minutes.nextTree());

                        }
                        stream_minutes.reset();
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:122:39: ( meridian_indicator )?
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:124:5: time_identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_time_identifier_in_time1051);
                    time_identifier78=time_identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, time_identifier78.getTree());

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:128:1: time_identifier : ( MIDNIGHT -> ^( EXPLICIT_TIME ^( HOURS INT[\"12\"] ) AM_PM[\"am\"] ) | NOON -> ^( EXPLICIT_TIME ^( HOURS INT[\"12\"] ) AM_PM[\"pm\"] ) );
    public final DateParser.time_identifier_return time_identifier() throws RecognitionException {
        DateParser.time_identifier_return retval = new DateParser.time_identifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MIDNIGHT79=null;
        Token NOON80=null;

        Object MIDNIGHT79_tree=null;
        Object NOON80_tree=null;
        RewriteRuleTokenStream stream_NOON=new RewriteRuleTokenStream(adaptor,"token NOON");
        RewriteRuleTokenStream stream_MIDNIGHT=new RewriteRuleTokenStream(adaptor,"token MIDNIGHT");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:129:3: ( MIDNIGHT -> ^( EXPLICIT_TIME ^( HOURS INT[\"12\"] ) AM_PM[\"am\"] ) | NOON -> ^( EXPLICIT_TIME ^( HOURS INT[\"12\"] ) AM_PM[\"pm\"] ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==MIDNIGHT) ) {
                alt31=1;
            }
            else if ( (LA31_0==NOON) ) {
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:129:5: MIDNIGHT
                    {
                    MIDNIGHT79=(Token)match(input,MIDNIGHT,FOLLOW_MIDNIGHT_in_time_identifier1067); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MIDNIGHT.add(MIDNIGHT79);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 129:14: -> ^( EXPLICIT_TIME ^( HOURS INT[\"12\"] ) AM_PM[\"am\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:129:17: ^( EXPLICIT_TIME ^( HOURS INT[\"12\"] ) AM_PM[\"am\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:129:33: ^( HOURS INT[\"12\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:130:5: NOON
                    {
                    NOON80=(Token)match(input,NOON,FOLLOW_NOON_in_time_identifier1089); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOON.add(NOON80);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 130:14: -> ^( EXPLICIT_TIME ^( HOURS INT[\"12\"] ) AM_PM[\"pm\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:130:17: ^( EXPLICIT_TIME ^( HOURS INT[\"12\"] ) AM_PM[\"pm\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:130:33: ^( HOURS INT[\"12\"] )
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:134:1: target_prefix : ( THIS -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"] | ( THIS )? LAST -> SEEK_DIR[\"<\"] SEEK_TYPE[\"by_week\"] INT[\"1\"] | ( THIS )? PAST -> SEEK_DIR[\"<\"] SEEK_TYPE[\"by_day\"] INT[\"1\"] | ( THIS )? NEXT -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_week\"] INT[\"1\"] | ( THIS )? COMING -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"] | ( THIS )? UPCOMING -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"] | ( IN )? spelled_or_int_1_to_31 -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] spelled_or_int_1_to_31 );
    public final DateParser.target_prefix_return target_prefix() throws RecognitionException {
        DateParser.target_prefix_return retval = new DateParser.target_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THIS81=null;
        Token THIS82=null;
        Token LAST83=null;
        Token THIS84=null;
        Token PAST85=null;
        Token THIS86=null;
        Token NEXT87=null;
        Token THIS88=null;
        Token COMING89=null;
        Token THIS90=null;
        Token UPCOMING91=null;
        Token IN92=null;
        DateParser.spelled_or_int_1_to_31_return spelled_or_int_1_to_3193 = null;


        Object THIS81_tree=null;
        Object THIS82_tree=null;
        Object LAST83_tree=null;
        Object THIS84_tree=null;
        Object PAST85_tree=null;
        Object THIS86_tree=null;
        Object NEXT87_tree=null;
        Object THIS88_tree=null;
        Object COMING89_tree=null;
        Object THIS90_tree=null;
        Object UPCOMING91_tree=null;
        Object IN92_tree=null;
        RewriteRuleTokenStream stream_NEXT=new RewriteRuleTokenStream(adaptor,"token NEXT");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_LAST=new RewriteRuleTokenStream(adaptor,"token LAST");
        RewriteRuleTokenStream stream_UPCOMING=new RewriteRuleTokenStream(adaptor,"token UPCOMING");
        RewriteRuleTokenStream stream_COMING=new RewriteRuleTokenStream(adaptor,"token COMING");
        RewriteRuleTokenStream stream_PAST=new RewriteRuleTokenStream(adaptor,"token PAST");
        RewriteRuleTokenStream stream_THIS=new RewriteRuleTokenStream(adaptor,"token THIS");
        RewriteRuleSubtreeStream stream_spelled_or_int_1_to_31=new RewriteRuleSubtreeStream(adaptor,"rule spelled_or_int_1_to_31");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:135:3: ( THIS -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"] | ( THIS )? LAST -> SEEK_DIR[\"<\"] SEEK_TYPE[\"by_week\"] INT[\"1\"] | ( THIS )? PAST -> SEEK_DIR[\"<\"] SEEK_TYPE[\"by_day\"] INT[\"1\"] | ( THIS )? NEXT -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_week\"] INT[\"1\"] | ( THIS )? COMING -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"] | ( THIS )? UPCOMING -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"] | ( IN )? spelled_or_int_1_to_31 -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] spelled_or_int_1_to_31 )
            int alt38=7;
            switch ( input.LA(1) ) {
            case THIS:
                {
                switch ( input.LA(2) ) {
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
                    alt38=1;
                    }
                    break;
                case LAST:
                    {
                    alt38=2;
                    }
                    break;
                case UPCOMING:
                    {
                    alt38=6;
                    }
                    break;
                case NEXT:
                    {
                    alt38=4;
                    }
                    break;
                case COMING:
                    {
                    alt38=5;
                    }
                    break;
                case PAST:
                    {
                    alt38=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;
                }

                }
                break;
            case LAST:
                {
                alt38=2;
                }
                break;
            case PAST:
                {
                alt38=3;
                }
                break;
            case NEXT:
                {
                alt38=4;
                }
                break;
            case COMING:
                {
                alt38=5;
                }
                break;
            case UPCOMING:
                {
                alt38=6;
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
                alt38=7;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:135:5: THIS
                    {
                    THIS81=(Token)match(input,THIS,FOLLOW_THIS_in_target_prefix1125); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIS.add(THIS81);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 135:20: -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIR, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_day"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:136:5: ( THIS )? LAST
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:136:5: ( THIS )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==THIS) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:136:5: THIS
                            {
                            THIS82=(Token)match(input,THIS,FOLLOW_THIS_in_target_prefix1152); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS82);


                            }
                            break;

                    }

                    LAST83=(Token)match(input,LAST,FOLLOW_LAST_in_target_prefix1155); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LAST.add(LAST83);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 136:20: -> SEEK_DIR[\"<\"] SEEK_TYPE[\"by_week\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIR, "<"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_week"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:137:5: ( THIS )? PAST
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:137:5: ( THIS )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==THIS) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:137:5: THIS
                            {
                            THIS84=(Token)match(input,THIS,FOLLOW_THIS_in_target_prefix1176); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS84);


                            }
                            break;

                    }

                    PAST85=(Token)match(input,PAST,FOLLOW_PAST_in_target_prefix1179); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAST.add(PAST85);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 137:20: -> SEEK_DIR[\"<\"] SEEK_TYPE[\"by_day\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIR, "<"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_day"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:138:5: ( THIS )? NEXT
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:138:5: ( THIS )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==THIS) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:138:5: THIS
                            {
                            THIS86=(Token)match(input,THIS,FOLLOW_THIS_in_target_prefix1200); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS86);


                            }
                            break;

                    }

                    NEXT87=(Token)match(input,NEXT,FOLLOW_NEXT_in_target_prefix1203); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEXT.add(NEXT87);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 138:20: -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_week\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIR, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_week"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:139:5: ( THIS )? COMING
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:139:5: ( THIS )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==THIS) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:139:5: THIS
                            {
                            THIS88=(Token)match(input,THIS,FOLLOW_THIS_in_target_prefix1224); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS88);


                            }
                            break;

                    }

                    COMING89=(Token)match(input,COMING,FOLLOW_COMING_in_target_prefix1227); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMING.add(COMING89);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 139:20: -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIR, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_day"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:140:5: ( THIS )? UPCOMING
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:140:5: ( THIS )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==THIS) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:140:5: THIS
                            {
                            THIS90=(Token)match(input,THIS,FOLLOW_THIS_in_target_prefix1246); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS90);


                            }
                            break;

                    }

                    UPCOMING91=(Token)match(input,UPCOMING,FOLLOW_UPCOMING_in_target_prefix1249); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UPCOMING.add(UPCOMING91);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 140:20: -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIR, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_day"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:141:5: ( IN )? spelled_or_int_1_to_31
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:141:5: ( IN )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==IN) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:141:5: IN
                            {
                            IN92=(Token)match(input,IN,FOLLOW_IN_in_target_prefix1266); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IN.add(IN92);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_spelled_or_int_1_to_31_in_target_prefix1269);
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
                    // 142:20: -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] spelled_or_int_1_to_31
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:146:1: target_suffix : ( FROM_NOW -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] | AGO -> SEEK_DIR[\"<\"] SEEK_TYPE[\"by_day\"] );
    public final DateParser.target_suffix_return target_suffix() throws RecognitionException {
        DateParser.target_suffix_return retval = new DateParser.target_suffix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FROM_NOW94=null;
        Token AGO95=null;

        Object FROM_NOW94_tree=null;
        Object AGO95_tree=null;
        RewriteRuleTokenStream stream_AGO=new RewriteRuleTokenStream(adaptor,"token AGO");
        RewriteRuleTokenStream stream_FROM_NOW=new RewriteRuleTokenStream(adaptor,"token FROM_NOW");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:147:3: ( FROM_NOW -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] | AGO -> SEEK_DIR[\"<\"] SEEK_TYPE[\"by_day\"] )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==FROM_NOW) ) {
                alt39=1;
            }
            else if ( (LA39_0==AGO) ) {
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:147:5: FROM_NOW
                    {
                    FROM_NOW94=(Token)match(input,FROM_NOW,FOLLOW_FROM_NOW_in_target_suffix1315); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FROM_NOW.add(FROM_NOW94);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 147:14: -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIR, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_day"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:148:5: AGO
                    {
                    AGO95=(Token)match(input,AGO,FOLLOW_AGO_in_target_suffix1329); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AGO.add(AGO95);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 148:14: -> SEEK_DIR[\"<\"] SEEK_TYPE[\"by_day\"]
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:152:1: modifiable_target : ( day_of_week | date_span | month );
    public final DateParser.modifiable_target_return modifiable_target() throws RecognitionException {
        DateParser.modifiable_target_return retval = new DateParser.modifiable_target_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.day_of_week_return day_of_week96 = null;

        DateParser.date_span_return date_span97 = null;

        DateParser.month_return month98 = null;



        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:153:3: ( day_of_week | date_span | month )
            int alt40=3;
            switch ( input.LA(1) ) {
            case SUNDAY:
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
            case SATURDAY:
                {
                alt40=1;
                }
                break;
            case DAY:
            case WEEK:
            case MONTH:
            case YEAR:
                {
                alt40=2;
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
                alt40=3;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:153:5: day_of_week
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_day_of_week_in_modifiable_target1358);
                    day_of_week96=day_of_week();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, day_of_week96.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:154:5: date_span
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_date_span_in_modifiable_target1365);
                    date_span97=date_span();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, date_span97.getTree());

                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:155:5: month
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_month_in_modifiable_target1371);
                    month98=month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, month98.getTree());

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:158:1: date_span : ( DAY -> SPAN[\"day\"] | WEEK -> SPAN[\"week\"] | MONTH -> SPAN[\"month\"] | YEAR -> SPAN[\"year\"] );
    public final DateParser.date_span_return date_span() throws RecognitionException {
        DateParser.date_span_return retval = new DateParser.date_span_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DAY99=null;
        Token WEEK100=null;
        Token MONTH101=null;
        Token YEAR102=null;

        Object DAY99_tree=null;
        Object WEEK100_tree=null;
        Object MONTH101_tree=null;
        Object YEAR102_tree=null;
        RewriteRuleTokenStream stream_WEEK=new RewriteRuleTokenStream(adaptor,"token WEEK");
        RewriteRuleTokenStream stream_DAY=new RewriteRuleTokenStream(adaptor,"token DAY");
        RewriteRuleTokenStream stream_YEAR=new RewriteRuleTokenStream(adaptor,"token YEAR");
        RewriteRuleTokenStream stream_MONTH=new RewriteRuleTokenStream(adaptor,"token MONTH");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:159:3: ( DAY -> SPAN[\"day\"] | WEEK -> SPAN[\"week\"] | MONTH -> SPAN[\"month\"] | YEAR -> SPAN[\"year\"] )
            int alt41=4;
            switch ( input.LA(1) ) {
            case DAY:
                {
                alt41=1;
                }
                break;
            case WEEK:
                {
                alt41=2;
                }
                break;
            case MONTH:
                {
                alt41=3;
                }
                break;
            case YEAR:
                {
                alt41=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:159:5: DAY
                    {
                    DAY99=(Token)match(input,DAY,FOLLOW_DAY_in_date_span1386); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DAY.add(DAY99);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 159:11: -> SPAN[\"day\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SPAN, "day"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:160:5: WEEK
                    {
                    WEEK100=(Token)match(input,WEEK,FOLLOW_WEEK_in_date_span1399); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WEEK.add(WEEK100);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 160:11: -> SPAN[\"week\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SPAN, "week"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:161:5: MONTH
                    {
                    MONTH101=(Token)match(input,MONTH,FOLLOW_MONTH_in_date_span1411); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MONTH.add(MONTH101);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 161:11: -> SPAN[\"month\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SPAN, "month"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:162:5: YEAR
                    {
                    YEAR102=(Token)match(input,YEAR,FOLLOW_YEAR_in_date_span1422); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_YEAR.add(YEAR102);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 162:11: -> SPAN[\"year\"]
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:165:1: month : ( JANUARY -> ^( MONTH_OF INT[\"1\"] ) | FEBRUARY -> ^( MONTH_OF INT[\"2\"] ) | MARCH -> ^( MONTH_OF INT[\"3\"] ) | APRIL -> ^( MONTH_OF INT[\"4\"] ) | MAY -> ^( MONTH_OF INT[\"5\"] ) | JUNE -> ^( MONTH_OF INT[\"6\"] ) | JULY -> ^( MONTH_OF INT[\"7\"] ) | AUGUST -> ^( MONTH_OF INT[\"8\"] ) | SEPTEMBER -> ^( MONTH_OF INT[\"9\"] ) | OCTOBER -> ^( MONTH_OF INT[\"10\"] ) | NOVEMBER -> ^( MONTH_OF INT[\"11\"] ) | DECEMBER -> ^( MONTH_OF INT[\"12\"] ) );
    public final DateParser.month_return month() throws RecognitionException {
        DateParser.month_return retval = new DateParser.month_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token JANUARY103=null;
        Token FEBRUARY104=null;
        Token MARCH105=null;
        Token APRIL106=null;
        Token MAY107=null;
        Token JUNE108=null;
        Token JULY109=null;
        Token AUGUST110=null;
        Token SEPTEMBER111=null;
        Token OCTOBER112=null;
        Token NOVEMBER113=null;
        Token DECEMBER114=null;

        Object JANUARY103_tree=null;
        Object FEBRUARY104_tree=null;
        Object MARCH105_tree=null;
        Object APRIL106_tree=null;
        Object MAY107_tree=null;
        Object JUNE108_tree=null;
        Object JULY109_tree=null;
        Object AUGUST110_tree=null;
        Object SEPTEMBER111_tree=null;
        Object OCTOBER112_tree=null;
        Object NOVEMBER113_tree=null;
        Object DECEMBER114_tree=null;
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:166:3: ( JANUARY -> ^( MONTH_OF INT[\"1\"] ) | FEBRUARY -> ^( MONTH_OF INT[\"2\"] ) | MARCH -> ^( MONTH_OF INT[\"3\"] ) | APRIL -> ^( MONTH_OF INT[\"4\"] ) | MAY -> ^( MONTH_OF INT[\"5\"] ) | JUNE -> ^( MONTH_OF INT[\"6\"] ) | JULY -> ^( MONTH_OF INT[\"7\"] ) | AUGUST -> ^( MONTH_OF INT[\"8\"] ) | SEPTEMBER -> ^( MONTH_OF INT[\"9\"] ) | OCTOBER -> ^( MONTH_OF INT[\"10\"] ) | NOVEMBER -> ^( MONTH_OF INT[\"11\"] ) | DECEMBER -> ^( MONTH_OF INT[\"12\"] ) )
            int alt42=12;
            switch ( input.LA(1) ) {
            case JANUARY:
                {
                alt42=1;
                }
                break;
            case FEBRUARY:
                {
                alt42=2;
                }
                break;
            case MARCH:
                {
                alt42=3;
                }
                break;
            case APRIL:
                {
                alt42=4;
                }
                break;
            case MAY:
                {
                alt42=5;
                }
                break;
            case JUNE:
                {
                alt42=6;
                }
                break;
            case JULY:
                {
                alt42=7;
                }
                break;
            case AUGUST:
                {
                alt42=8;
                }
                break;
            case SEPTEMBER:
                {
                alt42=9;
                }
                break;
            case OCTOBER:
                {
                alt42=10;
                }
                break;
            case NOVEMBER:
                {
                alt42=11;
                }
                break;
            case DECEMBER:
                {
                alt42=12;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:166:5: JANUARY
                    {
                    JANUARY103=(Token)match(input,JANUARY,FOLLOW_JANUARY_in_month1443); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_JANUARY.add(JANUARY103);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 166:15: -> ^( MONTH_OF INT[\"1\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:166:18: ^( MONTH_OF INT[\"1\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:167:5: FEBRUARY
                    {
                    FEBRUARY104=(Token)match(input,FEBRUARY,FOLLOW_FEBRUARY_in_month1460); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FEBRUARY.add(FEBRUARY104);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 167:15: -> ^( MONTH_OF INT[\"2\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:167:18: ^( MONTH_OF INT[\"2\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:168:5: MARCH
                    {
                    MARCH105=(Token)match(input,MARCH,FOLLOW_MARCH_in_month1476); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MARCH.add(MARCH105);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 168:15: -> ^( MONTH_OF INT[\"3\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:168:18: ^( MONTH_OF INT[\"3\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:169:5: APRIL
                    {
                    APRIL106=(Token)match(input,APRIL,FOLLOW_APRIL_in_month1495); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_APRIL.add(APRIL106);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 169:15: -> ^( MONTH_OF INT[\"4\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:169:18: ^( MONTH_OF INT[\"4\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:170:5: MAY
                    {
                    MAY107=(Token)match(input,MAY,FOLLOW_MAY_in_month1514); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MAY.add(MAY107);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 170:15: -> ^( MONTH_OF INT[\"5\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:170:18: ^( MONTH_OF INT[\"5\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:171:5: JUNE
                    {
                    JUNE108=(Token)match(input,JUNE,FOLLOW_JUNE_in_month1535); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_JUNE.add(JUNE108);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 171:15: -> ^( MONTH_OF INT[\"6\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:171:18: ^( MONTH_OF INT[\"6\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:172:5: JULY
                    {
                    JULY109=(Token)match(input,JULY,FOLLOW_JULY_in_month1555); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_JULY.add(JULY109);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 172:15: -> ^( MONTH_OF INT[\"7\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:172:18: ^( MONTH_OF INT[\"7\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:173:5: AUGUST
                    {
                    AUGUST110=(Token)match(input,AUGUST,FOLLOW_AUGUST_in_month1575); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AUGUST.add(AUGUST110);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 173:15: -> ^( MONTH_OF INT[\"8\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:173:18: ^( MONTH_OF INT[\"8\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:174:5: SEPTEMBER
                    {
                    SEPTEMBER111=(Token)match(input,SEPTEMBER,FOLLOW_SEPTEMBER_in_month1593); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEPTEMBER.add(SEPTEMBER111);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 174:15: -> ^( MONTH_OF INT[\"9\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:174:18: ^( MONTH_OF INT[\"9\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:175:5: OCTOBER
                    {
                    OCTOBER112=(Token)match(input,OCTOBER,FOLLOW_OCTOBER_in_month1608); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OCTOBER.add(OCTOBER112);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 175:15: -> ^( MONTH_OF INT[\"10\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:175:18: ^( MONTH_OF INT[\"10\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:176:5: NOVEMBER
                    {
                    NOVEMBER113=(Token)match(input,NOVEMBER,FOLLOW_NOVEMBER_in_month1625); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOVEMBER.add(NOVEMBER113);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 176:15: -> ^( MONTH_OF INT[\"11\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:176:18: ^( MONTH_OF INT[\"11\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:177:5: DECEMBER
                    {
                    DECEMBER114=(Token)match(input,DECEMBER,FOLLOW_DECEMBER_in_month1641); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DECEMBER.add(DECEMBER114);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 177:15: -> ^( MONTH_OF INT[\"12\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:177:18: ^( MONTH_OF INT[\"12\"] )
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:180:1: day_of_month : ( spelled_or_int_1_to_31 -> ^( DAY_OF_MONTH spelled_or_int_1_to_31 ) | spelled_sequence_1_to_31 -> ^( DAY_OF_MONTH spelled_sequence_1_to_31 ) );
    public final DateParser.day_of_month_return day_of_month() throws RecognitionException {
        DateParser.day_of_month_return retval = new DateParser.day_of_month_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.spelled_or_int_1_to_31_return spelled_or_int_1_to_31115 = null;

        DateParser.spelled_sequence_1_to_31_return spelled_sequence_1_to_31116 = null;


        RewriteRuleSubtreeStream stream_spelled_or_int_1_to_31=new RewriteRuleSubtreeStream(adaptor,"rule spelled_or_int_1_to_31");
        RewriteRuleSubtreeStream stream_spelled_sequence_1_to_31=new RewriteRuleSubtreeStream(adaptor,"rule spelled_sequence_1_to_31");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:181:3: ( spelled_or_int_1_to_31 -> ^( DAY_OF_MONTH spelled_or_int_1_to_31 ) | spelled_sequence_1_to_31 -> ^( DAY_OF_MONTH spelled_sequence_1_to_31 ) )
            int alt43=2;
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
                alt43=1;
                }
                break;
            case TWENTY:
                {
                switch ( input.LA(2) ) {
                case DASH:
                    {
                    int LA43_5 = input.LA(3);

                    if ( ((LA43_5>=ONE && LA43_5<=NINE)) ) {
                        alt43=1;
                    }
                    else if ( ((LA43_5>=FIRST && LA43_5<=NINTH)) ) {
                        alt43=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 5, input);

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
                    alt43=2;
                    }
                    break;
                case EOF:
                case AT:
                case COMMA:
                case MIDNIGHT:
                case NOON:
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
                    alt43=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 2, input);

                    throw nvae;
                }

                }
                break;
            case THIRTY:
                {
                switch ( input.LA(2) ) {
                case EOF:
                case AT:
                case COMMA:
                case MIDNIGHT:
                case NOON:
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
                    alt43=1;
                    }
                    break;
                case DASH:
                    {
                    int LA43_6 = input.LA(3);

                    if ( (LA43_6==FIRST) ) {
                        alt43=2;
                    }
                    else if ( (LA43_6==ONE) ) {
                        alt43=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case FIRST:
                    {
                    alt43=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 3, input);

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
                alt43=2;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:181:5: spelled_or_int_1_to_31
                    {
                    pushFollow(FOLLOW_spelled_or_int_1_to_31_in_day_of_month1666);
                    spelled_or_int_1_to_31115=spelled_or_int_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_or_int_1_to_31.add(spelled_or_int_1_to_31115.getTree());


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
                    // 181:30: -> ^( DAY_OF_MONTH spelled_or_int_1_to_31 )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:181:33: ^( DAY_OF_MONTH spelled_or_int_1_to_31 )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:182:5: spelled_sequence_1_to_31
                    {
                    pushFollow(FOLLOW_spelled_sequence_1_to_31_in_day_of_month1682);
                    spelled_sequence_1_to_31116=spelled_sequence_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_sequence_1_to_31.add(spelled_sequence_1_to_31116.getTree());


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
                    // 182:30: -> ^( DAY_OF_MONTH spelled_sequence_1_to_31 )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:182:33: ^( DAY_OF_MONTH spelled_sequence_1_to_31 )
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:185:1: day_of_week : ( SUNDAY -> ^( DAY_OF_WEEK INT[\"1\"] ) | MONDAY -> ^( DAY_OF_WEEK INT[\"2\"] ) | TUESDAY -> ^( DAY_OF_WEEK INT[\"3\"] ) | WEDNESDAY -> ^( DAY_OF_WEEK INT[\"4\"] ) | THURSDAY -> ^( DAY_OF_WEEK INT[\"5\"] ) | FRIDAY -> ^( DAY_OF_WEEK INT[\"6\"] ) | SATURDAY -> ^( DAY_OF_WEEK INT[\"7\"] ) );
    public final DateParser.day_of_week_return day_of_week() throws RecognitionException {
        DateParser.day_of_week_return retval = new DateParser.day_of_week_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SUNDAY117=null;
        Token MONDAY118=null;
        Token TUESDAY119=null;
        Token WEDNESDAY120=null;
        Token THURSDAY121=null;
        Token FRIDAY122=null;
        Token SATURDAY123=null;

        Object SUNDAY117_tree=null;
        Object MONDAY118_tree=null;
        Object TUESDAY119_tree=null;
        Object WEDNESDAY120_tree=null;
        Object THURSDAY121_tree=null;
        Object FRIDAY122_tree=null;
        Object SATURDAY123_tree=null;
        RewriteRuleTokenStream stream_MONDAY=new RewriteRuleTokenStream(adaptor,"token MONDAY");
        RewriteRuleTokenStream stream_SUNDAY=new RewriteRuleTokenStream(adaptor,"token SUNDAY");
        RewriteRuleTokenStream stream_WEDNESDAY=new RewriteRuleTokenStream(adaptor,"token WEDNESDAY");
        RewriteRuleTokenStream stream_THURSDAY=new RewriteRuleTokenStream(adaptor,"token THURSDAY");
        RewriteRuleTokenStream stream_SATURDAY=new RewriteRuleTokenStream(adaptor,"token SATURDAY");
        RewriteRuleTokenStream stream_TUESDAY=new RewriteRuleTokenStream(adaptor,"token TUESDAY");
        RewriteRuleTokenStream stream_FRIDAY=new RewriteRuleTokenStream(adaptor,"token FRIDAY");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:186:3: ( SUNDAY -> ^( DAY_OF_WEEK INT[\"1\"] ) | MONDAY -> ^( DAY_OF_WEEK INT[\"2\"] ) | TUESDAY -> ^( DAY_OF_WEEK INT[\"3\"] ) | WEDNESDAY -> ^( DAY_OF_WEEK INT[\"4\"] ) | THURSDAY -> ^( DAY_OF_WEEK INT[\"5\"] ) | FRIDAY -> ^( DAY_OF_WEEK INT[\"6\"] ) | SATURDAY -> ^( DAY_OF_WEEK INT[\"7\"] ) )
            int alt44=7;
            switch ( input.LA(1) ) {
            case SUNDAY:
                {
                alt44=1;
                }
                break;
            case MONDAY:
                {
                alt44=2;
                }
                break;
            case TUESDAY:
                {
                alt44=3;
                }
                break;
            case WEDNESDAY:
                {
                alt44=4;
                }
                break;
            case THURSDAY:
                {
                alt44=5;
                }
                break;
            case FRIDAY:
                {
                alt44=6;
                }
                break;
            case SATURDAY:
                {
                alt44=7;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:186:5: SUNDAY
                    {
                    SUNDAY117=(Token)match(input,SUNDAY,FOLLOW_SUNDAY_in_day_of_week1706); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUNDAY.add(SUNDAY117);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 186:15: -> ^( DAY_OF_WEEK INT[\"1\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:186:18: ^( DAY_OF_WEEK INT[\"1\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:187:5: MONDAY
                    {
                    MONDAY118=(Token)match(input,MONDAY,FOLLOW_MONDAY_in_day_of_week1724); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MONDAY.add(MONDAY118);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 187:15: -> ^( DAY_OF_WEEK INT[\"2\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:187:18: ^( DAY_OF_WEEK INT[\"2\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:188:5: TUESDAY
                    {
                    TUESDAY119=(Token)match(input,TUESDAY,FOLLOW_TUESDAY_in_day_of_week1742); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TUESDAY.add(TUESDAY119);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 188:15: -> ^( DAY_OF_WEEK INT[\"3\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:188:18: ^( DAY_OF_WEEK INT[\"3\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:189:5: WEDNESDAY
                    {
                    WEDNESDAY120=(Token)match(input,WEDNESDAY,FOLLOW_WEDNESDAY_in_day_of_week1759); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WEDNESDAY.add(WEDNESDAY120);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 189:15: -> ^( DAY_OF_WEEK INT[\"4\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:189:18: ^( DAY_OF_WEEK INT[\"4\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:190:5: THURSDAY
                    {
                    THURSDAY121=(Token)match(input,THURSDAY,FOLLOW_THURSDAY_in_day_of_week1774); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THURSDAY.add(THURSDAY121);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 190:15: -> ^( DAY_OF_WEEK INT[\"5\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:190:18: ^( DAY_OF_WEEK INT[\"5\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:191:5: FRIDAY
                    {
                    FRIDAY122=(Token)match(input,FRIDAY,FOLLOW_FRIDAY_in_day_of_week1790); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FRIDAY.add(FRIDAY122);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 191:15: -> ^( DAY_OF_WEEK INT[\"6\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:191:18: ^( DAY_OF_WEEK INT[\"6\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:192:5: SATURDAY
                    {
                    SATURDAY123=(Token)match(input,SATURDAY,FOLLOW_SATURDAY_in_day_of_week1808); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SATURDAY.add(SATURDAY123);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 192:15: -> ^( DAY_OF_WEEK INT[\"7\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:192:18: ^( DAY_OF_WEEK INT[\"7\"] )
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:195:1: year : ( ( COMMA )? ( IN THE YEAR )? ( '\\'' )? int_0_to_99_with_prefix -> ^( YEAR_OF int_0_to_99_with_prefix ) | ( COMMA )? ( IN THE YEAR )? int_3_or_4_digits -> ^( YEAR_OF int_3_or_4_digits ) );
    public final DateParser.year_return year() throws RecognitionException {
        DateParser.year_return retval = new DateParser.year_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA124=null;
        Token IN125=null;
        Token THE126=null;
        Token YEAR127=null;
        Token char_literal128=null;
        Token COMMA130=null;
        Token IN131=null;
        Token THE132=null;
        Token YEAR133=null;
        DateParser.int_0_to_99_with_prefix_return int_0_to_99_with_prefix129 = null;

        DateParser.int_3_or_4_digits_return int_3_or_4_digits134 = null;


        Object COMMA124_tree=null;
        Object IN125_tree=null;
        Object THE126_tree=null;
        Object YEAR127_tree=null;
        Object char_literal128_tree=null;
        Object COMMA130_tree=null;
        Object IN131_tree=null;
        Object THE132_tree=null;
        Object YEAR133_tree=null;
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_YEAR=new RewriteRuleTokenStream(adaptor,"token YEAR");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_THE=new RewriteRuleTokenStream(adaptor,"token THE");
        RewriteRuleSubtreeStream stream_int_0_to_99_with_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_0_to_99_with_prefix");
        RewriteRuleSubtreeStream stream_int_3_or_4_digits=new RewriteRuleSubtreeStream(adaptor,"rule int_3_or_4_digits");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:196:3: ( ( COMMA )? ( IN THE YEAR )? ( '\\'' )? int_0_to_99_with_prefix -> ^( YEAR_OF int_0_to_99_with_prefix ) | ( COMMA )? ( IN THE YEAR )? int_3_or_4_digits -> ^( YEAR_OF int_3_or_4_digits ) )
            int alt50=2;
            switch ( input.LA(1) ) {
            case COMMA:
                {
                switch ( input.LA(2) ) {
                case IN:
                    {
                    int LA50_2 = input.LA(3);

                    if ( (LA50_2==THE) ) {
                        int LA50_5 = input.LA(4);

                        if ( (LA50_5==YEAR) ) {
                            int LA50_6 = input.LA(5);

                            if ( ((LA50_6>=THREE_DIGIT && LA50_6<=FOUR_DIGIT)) ) {
                                alt50=2;
                            }
                            else if ( ((LA50_6>=TWO_ZEROS && LA50_6<=TEN_TO_TWELVE)||(LA50_6>=THIRTEEN_TO_TWENTY_THREE && LA50_6<=THIRTY_TWO_TO_FIFTY_NINE)||LA50_6==SIXTY_TO_NINETY_NINE||LA50_6==133) ) {
                                alt50=1;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 50, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 50, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 50, 2, input);

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
                    alt50=1;
                    }
                    break;
                case THREE_DIGIT:
                case FOUR_DIGIT:
                    {
                    alt50=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 1, input);

                    throw nvae;
                }

                }
                break;
            case IN:
                {
                int LA50_2 = input.LA(2);

                if ( (LA50_2==THE) ) {
                    int LA50_5 = input.LA(3);

                    if ( (LA50_5==YEAR) ) {
                        int LA50_6 = input.LA(4);

                        if ( ((LA50_6>=THREE_DIGIT && LA50_6<=FOUR_DIGIT)) ) {
                            alt50=2;
                        }
                        else if ( ((LA50_6>=TWO_ZEROS && LA50_6<=TEN_TO_TWELVE)||(LA50_6>=THIRTEEN_TO_TWENTY_THREE && LA50_6<=THIRTY_TWO_TO_FIFTY_NINE)||LA50_6==SIXTY_TO_NINETY_NINE||LA50_6==133) ) {
                            alt50=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 50, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 50, 5, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 2, input);

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
                alt50=1;
                }
                break;
            case THREE_DIGIT:
            case FOUR_DIGIT:
                {
                alt50=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:196:5: ( COMMA )? ( IN THE YEAR )? ( '\\'' )? int_0_to_99_with_prefix
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:196:5: ( COMMA )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==COMMA) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:196:5: COMMA
                            {
                            COMMA124=(Token)match(input,COMMA,FOLLOW_COMMA_in_year1833); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA124);


                            }
                            break;

                    }

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:196:12: ( IN THE YEAR )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==IN) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:196:13: IN THE YEAR
                            {
                            IN125=(Token)match(input,IN,FOLLOW_IN_in_year1837); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IN.add(IN125);

                            THE126=(Token)match(input,THE,FOLLOW_THE_in_year1839); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THE.add(THE126);

                            YEAR127=(Token)match(input,YEAR,FOLLOW_YEAR_in_year1841); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_YEAR.add(YEAR127);


                            }
                            break;

                    }

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:196:27: ( '\\'' )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==133) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:196:27: '\\''
                            {
                            char_literal128=(Token)match(input,133,FOLLOW_133_in_year1845); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_133.add(char_literal128);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_int_0_to_99_with_prefix_in_year1848);
                    int_0_to_99_with_prefix129=int_0_to_99_with_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_0_to_99_with_prefix.add(int_0_to_99_with_prefix129.getTree());


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
                    // 196:57: -> ^( YEAR_OF int_0_to_99_with_prefix )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:196:60: ^( YEAR_OF int_0_to_99_with_prefix )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:197:5: ( COMMA )? ( IN THE YEAR )? int_3_or_4_digits
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:197:5: ( COMMA )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==COMMA) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:197:5: COMMA
                            {
                            COMMA130=(Token)match(input,COMMA,FOLLOW_COMMA_in_year1862); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA130);


                            }
                            break;

                    }

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:197:12: ( IN THE YEAR )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==IN) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:197:13: IN THE YEAR
                            {
                            IN131=(Token)match(input,IN,FOLLOW_IN_in_year1866); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IN.add(IN131);

                            THE132=(Token)match(input,THE,FOLLOW_THE_in_year1868); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THE.add(THE132);

                            YEAR133=(Token)match(input,YEAR,FOLLOW_YEAR_in_year1870); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_YEAR.add(YEAR133);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_int_3_or_4_digits_in_year1874);
                    int_3_or_4_digits134=int_3_or_4_digits();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_3_or_4_digits.add(int_3_or_4_digits134.getTree());


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
                    // 197:57: -> ^( YEAR_OF int_3_or_4_digits )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:197:60: ^( YEAR_OF int_3_or_4_digits )
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:200:1: date_separator : ( DASH | SLASH );
    public final DateParser.date_separator_return date_separator() throws RecognitionException {
        DateParser.date_separator_return retval = new DateParser.date_separator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set135=null;

        Object set135_tree=null;

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:201:3: ( DASH | SLASH )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:
            {
            root_0 = (Object)adaptor.nil();

            set135=(Token)input.LT(1);
            if ( (input.LA(1)>=DASH && input.LA(1)<=SLASH) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set135));
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:205:1: hours : int_0_to_23 -> ^( HOURS int_0_to_23 ) ;
    public final DateParser.hours_return hours() throws RecognitionException {
        DateParser.hours_return retval = new DateParser.hours_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_0_to_23_return int_0_to_23136 = null;


        RewriteRuleSubtreeStream stream_int_0_to_23=new RewriteRuleSubtreeStream(adaptor,"rule int_0_to_23");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:206:3: ( int_0_to_23 -> ^( HOURS int_0_to_23 ) )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:206:5: int_0_to_23
            {
            pushFollow(FOLLOW_int_0_to_23_in_hours1928);
            int_0_to_23136=int_0_to_23();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_0_to_23.add(int_0_to_23136.getTree());


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
            // 206:17: -> ^( HOURS int_0_to_23 )
            {
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:206:20: ^( HOURS int_0_to_23 )
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:209:1: minutes : int_0_to_59 -> ^( MINUTES int_0_to_59 ) ;
    public final DateParser.minutes_return minutes() throws RecognitionException {
        DateParser.minutes_return retval = new DateParser.minutes_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_0_to_59_return int_0_to_59137 = null;


        RewriteRuleSubtreeStream stream_int_0_to_59=new RewriteRuleSubtreeStream(adaptor,"rule int_0_to_59");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:210:3: ( int_0_to_59 -> ^( MINUTES int_0_to_59 ) )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:210:5: int_0_to_59
            {
            pushFollow(FOLLOW_int_0_to_59_in_minutes1951);
            int_0_to_59137=int_0_to_59();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_0_to_59.add(int_0_to_59137.getTree());


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
            // 210:17: -> ^( MINUTES int_0_to_59 )
            {
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:210:20: ^( MINUTES int_0_to_59 )
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:213:1: meridian_indicator : ( AM -> AM_PM[\"am\"] | PM -> AM_PM[\"pm\"] );
    public final DateParser.meridian_indicator_return meridian_indicator() throws RecognitionException {
        DateParser.meridian_indicator_return retval = new DateParser.meridian_indicator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AM138=null;
        Token PM139=null;

        Object AM138_tree=null;
        Object PM139_tree=null;
        RewriteRuleTokenStream stream_PM=new RewriteRuleTokenStream(adaptor,"token PM");
        RewriteRuleTokenStream stream_AM=new RewriteRuleTokenStream(adaptor,"token AM");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:214:3: ( AM -> AM_PM[\"am\"] | PM -> AM_PM[\"pm\"] )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==AM) ) {
                alt51=1;
            }
            else if ( (LA51_0==PM) ) {
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:214:5: AM
                    {
                    AM138=(Token)match(input,AM,FOLLOW_AM_in_meridian_indicator1974); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AM.add(AM138);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 214:8: -> AM_PM[\"am\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(AM_PM, "am"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:215:5: PM
                    {
                    PM139=(Token)match(input,PM,FOLLOW_PM_in_meridian_indicator1985); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PM.add(PM139);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 215:8: -> AM_PM[\"pm\"]
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

    public static class spelled_1_to_31_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "spelled_1_to_31"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:219:1: spelled_1_to_31 : ( ONE -> INT[\"1\"] | TWO -> INT[\"2\"] | THREE -> INT[\"3\"] | FOUR -> INT[\"4\"] | FIVE -> INT[\"5\"] | SIX -> INT[\"6\"] | SEVEN -> INT[\"7\"] | EIGHT -> INT[\"8\"] | NINE -> INT[\"9\"] | TEN -> INT[\"10\"] | ELEVEN -> INT[\"11\"] | TWELVE -> INT[\"12\"] | THIRTEEN -> INT[\"13\"] | FOURTEEN -> INT[\"14\"] | FIFTEEN -> INT[\"15\"] | SIXTEEN -> INT[\"16\"] | SEVENTEEN -> INT[\"17\"] | EIGHTEEN -> INT[\"18\"] | NINETEEN -> INT[\"19\"] | TWENTY -> INT[\"20\"] | TWENTY ( DASH )? ONE -> INT[\"21\"] | TWENTY ( DASH )? TWO -> INT[\"22\"] | TWENTY ( DASH )? THREE -> INT[\"23\"] | TWENTY ( DASH )? FOUR -> INT[\"24\"] | TWENTY ( DASH )? FIVE -> INT[\"25\"] | TWENTY ( DASH )? SIX -> INT[\"26\"] | TWENTY ( DASH )? SEVEN -> INT[\"27\"] | TWENTY ( DASH )? EIGHT -> INT[\"28\"] | TWENTY ( DASH )? NINE -> INT[\"29\"] | THIRTY -> INT[\"30\"] | THIRTY ( DASH )? ONE -> INT[\"31\"] );
    public final DateParser.spelled_1_to_31_return spelled_1_to_31() throws RecognitionException {
        DateParser.spelled_1_to_31_return retval = new DateParser.spelled_1_to_31_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ONE140=null;
        Token TWO141=null;
        Token THREE142=null;
        Token FOUR143=null;
        Token FIVE144=null;
        Token SIX145=null;
        Token SEVEN146=null;
        Token EIGHT147=null;
        Token NINE148=null;
        Token TEN149=null;
        Token ELEVEN150=null;
        Token TWELVE151=null;
        Token THIRTEEN152=null;
        Token FOURTEEN153=null;
        Token FIFTEEN154=null;
        Token SIXTEEN155=null;
        Token SEVENTEEN156=null;
        Token EIGHTEEN157=null;
        Token NINETEEN158=null;
        Token TWENTY159=null;
        Token TWENTY160=null;
        Token DASH161=null;
        Token ONE162=null;
        Token TWENTY163=null;
        Token DASH164=null;
        Token TWO165=null;
        Token TWENTY166=null;
        Token DASH167=null;
        Token THREE168=null;
        Token TWENTY169=null;
        Token DASH170=null;
        Token FOUR171=null;
        Token TWENTY172=null;
        Token DASH173=null;
        Token FIVE174=null;
        Token TWENTY175=null;
        Token DASH176=null;
        Token SIX177=null;
        Token TWENTY178=null;
        Token DASH179=null;
        Token SEVEN180=null;
        Token TWENTY181=null;
        Token DASH182=null;
        Token EIGHT183=null;
        Token TWENTY184=null;
        Token DASH185=null;
        Token NINE186=null;
        Token THIRTY187=null;
        Token THIRTY188=null;
        Token DASH189=null;
        Token ONE190=null;

        Object ONE140_tree=null;
        Object TWO141_tree=null;
        Object THREE142_tree=null;
        Object FOUR143_tree=null;
        Object FIVE144_tree=null;
        Object SIX145_tree=null;
        Object SEVEN146_tree=null;
        Object EIGHT147_tree=null;
        Object NINE148_tree=null;
        Object TEN149_tree=null;
        Object ELEVEN150_tree=null;
        Object TWELVE151_tree=null;
        Object THIRTEEN152_tree=null;
        Object FOURTEEN153_tree=null;
        Object FIFTEEN154_tree=null;
        Object SIXTEEN155_tree=null;
        Object SEVENTEEN156_tree=null;
        Object EIGHTEEN157_tree=null;
        Object NINETEEN158_tree=null;
        Object TWENTY159_tree=null;
        Object TWENTY160_tree=null;
        Object DASH161_tree=null;
        Object ONE162_tree=null;
        Object TWENTY163_tree=null;
        Object DASH164_tree=null;
        Object TWO165_tree=null;
        Object TWENTY166_tree=null;
        Object DASH167_tree=null;
        Object THREE168_tree=null;
        Object TWENTY169_tree=null;
        Object DASH170_tree=null;
        Object FOUR171_tree=null;
        Object TWENTY172_tree=null;
        Object DASH173_tree=null;
        Object FIVE174_tree=null;
        Object TWENTY175_tree=null;
        Object DASH176_tree=null;
        Object SIX177_tree=null;
        Object TWENTY178_tree=null;
        Object DASH179_tree=null;
        Object SEVEN180_tree=null;
        Object TWENTY181_tree=null;
        Object DASH182_tree=null;
        Object EIGHT183_tree=null;
        Object TWENTY184_tree=null;
        Object DASH185_tree=null;
        Object NINE186_tree=null;
        Object THIRTY187_tree=null;
        Object THIRTY188_tree=null;
        Object DASH189_tree=null;
        Object ONE190_tree=null;
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:220:3: ( ONE -> INT[\"1\"] | TWO -> INT[\"2\"] | THREE -> INT[\"3\"] | FOUR -> INT[\"4\"] | FIVE -> INT[\"5\"] | SIX -> INT[\"6\"] | SEVEN -> INT[\"7\"] | EIGHT -> INT[\"8\"] | NINE -> INT[\"9\"] | TEN -> INT[\"10\"] | ELEVEN -> INT[\"11\"] | TWELVE -> INT[\"12\"] | THIRTEEN -> INT[\"13\"] | FOURTEEN -> INT[\"14\"] | FIFTEEN -> INT[\"15\"] | SIXTEEN -> INT[\"16\"] | SEVENTEEN -> INT[\"17\"] | EIGHTEEN -> INT[\"18\"] | NINETEEN -> INT[\"19\"] | TWENTY -> INT[\"20\"] | TWENTY ( DASH )? ONE -> INT[\"21\"] | TWENTY ( DASH )? TWO -> INT[\"22\"] | TWENTY ( DASH )? THREE -> INT[\"23\"] | TWENTY ( DASH )? FOUR -> INT[\"24\"] | TWENTY ( DASH )? FIVE -> INT[\"25\"] | TWENTY ( DASH )? SIX -> INT[\"26\"] | TWENTY ( DASH )? SEVEN -> INT[\"27\"] | TWENTY ( DASH )? EIGHT -> INT[\"28\"] | TWENTY ( DASH )? NINE -> INT[\"29\"] | THIRTY -> INT[\"30\"] | THIRTY ( DASH )? ONE -> INT[\"31\"] )
            int alt62=31;
            alt62 = dfa62.predict(input);
            switch (alt62) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:220:5: ONE
                    {
                    ONE140=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_1_to_312006); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE.add(ONE140);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 220:16: -> INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:221:5: TWO
                    {
                    TWO141=(Token)match(input,TWO,FOLLOW_TWO_in_spelled_1_to_312024); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO.add(TWO141);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 221:16: -> INT[\"2\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "2"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:222:5: THREE
                    {
                    THREE142=(Token)match(input,THREE,FOLLOW_THREE_in_spelled_1_to_312042); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THREE.add(THREE142);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 222:16: -> INT[\"3\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "3"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:223:5: FOUR
                    {
                    FOUR143=(Token)match(input,FOUR,FOLLOW_FOUR_in_spelled_1_to_312058); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOUR.add(FOUR143);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 223:16: -> INT[\"4\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "4"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:224:5: FIVE
                    {
                    FIVE144=(Token)match(input,FIVE,FOLLOW_FIVE_in_spelled_1_to_312075); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIVE.add(FIVE144);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 224:16: -> INT[\"5\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "5"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:225:5: SIX
                    {
                    SIX145=(Token)match(input,SIX,FOLLOW_SIX_in_spelled_1_to_312092); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIX.add(SIX145);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 225:16: -> INT[\"6\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "6"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:226:5: SEVEN
                    {
                    SEVEN146=(Token)match(input,SEVEN,FOLLOW_SEVEN_in_spelled_1_to_312110); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVEN.add(SEVEN146);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 226:16: -> INT[\"7\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "7"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:227:5: EIGHT
                    {
                    EIGHT147=(Token)match(input,EIGHT,FOLLOW_EIGHT_in_spelled_1_to_312126); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHT.add(EIGHT147);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 227:16: -> INT[\"8\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "8"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:228:5: NINE
                    {
                    NINE148=(Token)match(input,NINE,FOLLOW_NINE_in_spelled_1_to_312142); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINE.add(NINE148);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 228:16: -> INT[\"9\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "9"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:229:5: TEN
                    {
                    TEN149=(Token)match(input,TEN,FOLLOW_TEN_in_spelled_1_to_312159); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TEN.add(TEN149);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 229:16: -> INT[\"10\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "10"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:230:5: ELEVEN
                    {
                    ELEVEN150=(Token)match(input,ELEVEN,FOLLOW_ELEVEN_in_spelled_1_to_312177); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELEVEN.add(ELEVEN150);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 230:16: -> INT[\"11\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "11"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:231:5: TWELVE
                    {
                    TWELVE151=(Token)match(input,TWELVE,FOLLOW_TWELVE_in_spelled_1_to_312192); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWELVE.add(TWELVE151);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 231:16: -> INT[\"12\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "12"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:232:5: THIRTEEN
                    {
                    THIRTEEN152=(Token)match(input,THIRTEEN,FOLLOW_THIRTEEN_in_spelled_1_to_312207); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEEN.add(THIRTEEN152);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 232:16: -> INT[\"13\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "13"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 14 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:233:5: FOURTEEN
                    {
                    FOURTEEN153=(Token)match(input,FOURTEEN,FOLLOW_FOURTEEN_in_spelled_1_to_312220); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOURTEEN.add(FOURTEEN153);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 233:16: -> INT[\"14\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "14"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 15 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:234:5: FIFTEEN
                    {
                    FIFTEEN154=(Token)match(input,FIFTEEN,FOLLOW_FIFTEEN_in_spelled_1_to_312233); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIFTEEN.add(FIFTEEN154);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 234:16: -> INT[\"15\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "15"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 16 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:235:5: SIXTEEN
                    {
                    SIXTEEN155=(Token)match(input,SIXTEEN,FOLLOW_SIXTEEN_in_spelled_1_to_312247); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTEEN.add(SIXTEEN155);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 235:16: -> INT[\"16\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "16"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 17 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:236:5: SEVENTEEN
                    {
                    SEVENTEEN156=(Token)match(input,SEVENTEEN,FOLLOW_SEVENTEEN_in_spelled_1_to_312261); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVENTEEN.add(SEVENTEEN156);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 236:16: -> INT[\"17\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "17"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 18 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:237:5: EIGHTEEN
                    {
                    EIGHTEEN157=(Token)match(input,EIGHTEEN,FOLLOW_EIGHTEEN_in_spelled_1_to_312273); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHTEEN.add(EIGHTEEN157);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 237:16: -> INT[\"18\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "18"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 19 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:238:5: NINETEEN
                    {
                    NINETEEN158=(Token)match(input,NINETEEN,FOLLOW_NINETEEN_in_spelled_1_to_312286); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINETEEN.add(NINETEEN158);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 238:16: -> INT[\"19\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "19"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 20 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:239:5: TWENTY
                    {
                    TWENTY159=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_1_to_312299); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY159);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 239:16: -> INT[\"20\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "20"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 21 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:240:5: TWENTY ( DASH )? ONE
                    {
                    TWENTY160=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_1_to_312314); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY160);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:240:12: ( DASH )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==DASH) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:240:12: DASH
                            {
                            DASH161=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_1_to_312316); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH161);


                            }
                            break;

                    }

                    ONE162=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_1_to_312319); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE.add(ONE162);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 240:24: -> INT[\"21\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "21"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 22 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:241:5: TWENTY ( DASH )? TWO
                    {
                    TWENTY163=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_1_to_312332); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY163);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:241:12: ( DASH )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==DASH) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:241:12: DASH
                            {
                            DASH164=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_1_to_312334); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH164);


                            }
                            break;

                    }

                    TWO165=(Token)match(input,TWO,FOLLOW_TWO_in_spelled_1_to_312337); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO.add(TWO165);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 241:24: -> INT[\"22\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "22"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 23 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:242:5: TWENTY ( DASH )? THREE
                    {
                    TWENTY166=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_1_to_312350); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY166);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:242:12: ( DASH )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==DASH) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:242:12: DASH
                            {
                            DASH167=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_1_to_312352); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH167);


                            }
                            break;

                    }

                    THREE168=(Token)match(input,THREE,FOLLOW_THREE_in_spelled_1_to_312355); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THREE.add(THREE168);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 242:24: -> INT[\"23\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "23"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 24 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:243:5: TWENTY ( DASH )? FOUR
                    {
                    TWENTY169=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_1_to_312366); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY169);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:243:12: ( DASH )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==DASH) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:243:12: DASH
                            {
                            DASH170=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_1_to_312368); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH170);


                            }
                            break;

                    }

                    FOUR171=(Token)match(input,FOUR,FOLLOW_FOUR_in_spelled_1_to_312371); if (state.failed) return retval; 
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
                    // 243:24: -> INT[\"24\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "24"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 25 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:244:5: TWENTY ( DASH )? FIVE
                    {
                    TWENTY172=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_1_to_312383); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY172);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:244:12: ( DASH )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==DASH) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:244:12: DASH
                            {
                            DASH173=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_1_to_312385); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH173);


                            }
                            break;

                    }

                    FIVE174=(Token)match(input,FIVE,FOLLOW_FIVE_in_spelled_1_to_312388); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIVE.add(FIVE174);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 244:24: -> INT[\"25\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "25"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 26 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:245:5: TWENTY ( DASH )? SIX
                    {
                    TWENTY175=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_1_to_312400); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY175);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:245:12: ( DASH )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==DASH) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:245:12: DASH
                            {
                            DASH176=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_1_to_312402); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH176);


                            }
                            break;

                    }

                    SIX177=(Token)match(input,SIX,FOLLOW_SIX_in_spelled_1_to_312405); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIX.add(SIX177);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 245:24: -> INT[\"26\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "26"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 27 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:5: TWENTY ( DASH )? SEVEN
                    {
                    TWENTY178=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_1_to_312418); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY178);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:12: ( DASH )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==DASH) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:12: DASH
                            {
                            DASH179=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_1_to_312420); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH179);


                            }
                            break;

                    }

                    SEVEN180=(Token)match(input,SEVEN,FOLLOW_SEVEN_in_spelled_1_to_312423); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVEN.add(SEVEN180);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 246:24: -> INT[\"27\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "27"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 28 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:247:5: TWENTY ( DASH )? EIGHT
                    {
                    TWENTY181=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_1_to_312434); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY181);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:247:12: ( DASH )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==DASH) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:247:12: DASH
                            {
                            DASH182=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_1_to_312436); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH182);


                            }
                            break;

                    }

                    EIGHT183=(Token)match(input,EIGHT,FOLLOW_EIGHT_in_spelled_1_to_312439); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHT.add(EIGHT183);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 247:24: -> INT[\"28\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "28"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 29 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:248:5: TWENTY ( DASH )? NINE
                    {
                    TWENTY184=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_1_to_312450); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY184);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:248:12: ( DASH )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==DASH) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:248:12: DASH
                            {
                            DASH185=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_1_to_312452); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH185);


                            }
                            break;

                    }

                    NINE186=(Token)match(input,NINE,FOLLOW_NINE_in_spelled_1_to_312455); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINE.add(NINE186);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 248:24: -> INT[\"29\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "29"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 30 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:249:5: THIRTY
                    {
                    THIRTY187=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_1_to_312467); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY187);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 249:24: -> INT[\"30\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "30"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 31 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:250:5: THIRTY ( DASH )? ONE
                    {
                    THIRTY188=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_1_to_312490); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY188);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:250:12: ( DASH )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==DASH) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:250:12: DASH
                            {
                            DASH189=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_1_to_312492); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH189);


                            }
                            break;

                    }

                    ONE190=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_1_to_312495); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE.add(ONE190);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 250:24: -> INT[\"31\"]
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:253:1: spelled_or_int_1_to_31 : ( spelled_1_to_31 | int_1_to_31 );
    public final DateParser.spelled_or_int_1_to_31_return spelled_or_int_1_to_31() throws RecognitionException {
        DateParser.spelled_or_int_1_to_31_return retval = new DateParser.spelled_or_int_1_to_31_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.spelled_1_to_31_return spelled_1_to_31191 = null;

        DateParser.int_1_to_31_return int_1_to_31192 = null;



        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:254:3: ( spelled_1_to_31 | int_1_to_31 )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=ONE && LA63_0<=THIRTY)) ) {
                alt63=1;
            }
            else if ( ((LA63_0>=PREFIXED_ONE_TO_NINE && LA63_0<=TWENTY_FOUR_TO_THIRTY_ONE)) ) {
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:254:5: spelled_1_to_31
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_spelled_1_to_31_in_spelled_or_int_1_to_312517);
                    spelled_1_to_31191=spelled_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, spelled_1_to_31191.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:255:5: int_1_to_31
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_int_1_to_31_in_spelled_or_int_1_to_312523);
                    int_1_to_31192=int_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, int_1_to_31192.getTree());

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:260:1: spelled_sequence_1_to_31 : ( FIRST -> INT[\"1\"] | SECOND -> INT[\"2\"] | THIRD -> INT[\"3\"] | FOURTH -> INT[\"4\"] | FIFTH -> INT[\"5\"] | SIXTH -> INT[\"6\"] | SEVENTH -> INT[\"7\"] | EIGHTH -> INT[\"8\"] | NINTH -> INT[\"9\"] | TENTH -> INT[\"10\"] | ELEVENTH -> INT[\"11\"] | TWELFTH -> INT[\"12\"] | THIRTEENTH -> INT[\"13\"] | FOURTEENTH -> INT[\"14\"] | FIFTEENTH -> INT[\"15\"] | SIXTEENTH -> INT[\"16\"] | SEVENTEENTH -> INT[\"17\"] | EIGHTEENTH -> INT[\"18\"] | NINETEENTH -> INT[\"19\"] | TWENTIETH -> INT[\"20\"] | ( TWENTY_FIRST | ( TWENTY ( DASH )? FIRST ) ) -> INT[\"21\"] | ( TWENTY_SECOND | ( TWENTY ( DASH )? SECOND ) ) -> INT[\"22\"] | ( TWENTY_THIRD | ( TWENTY ( DASH )? THIRD ) ) -> INT[\"23\"] | ( TWENTY_FOURTH | ( TWENTY ( DASH )? FOURTH ) ) -> INT[\"24\"] | ( TWENTY_FIFTH | ( TWENTY ( DASH )? FIFTH ) ) -> INT[\"25\"] | ( TWENTY_SIXTH | ( TWENTY ( DASH )? SIXTH ) ) -> INT[\"26\"] | ( TWENTY_SEVENTH | ( TWENTY ( DASH )? SEVENTH ) ) -> INT[\"27\"] | ( TWENTY_EIGHTH | ( TWENTY ( DASH )? EIGHTH ) ) -> INT[\"28\"] | ( TWENTY_NINTH | ( TWENTY ( DASH )? NINTH ) ) -> INT[\"29\"] | THIRTIETH -> INT[\"30\"] | ( THIRTY_FIRST | ( THIRTY ( DASH )? FIRST ) ) -> INT[\"31\"] );
    public final DateParser.spelled_sequence_1_to_31_return spelled_sequence_1_to_31() throws RecognitionException {
        DateParser.spelled_sequence_1_to_31_return retval = new DateParser.spelled_sequence_1_to_31_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FIRST193=null;
        Token SECOND194=null;
        Token THIRD195=null;
        Token FOURTH196=null;
        Token FIFTH197=null;
        Token SIXTH198=null;
        Token SEVENTH199=null;
        Token EIGHTH200=null;
        Token NINTH201=null;
        Token TENTH202=null;
        Token ELEVENTH203=null;
        Token TWELFTH204=null;
        Token THIRTEENTH205=null;
        Token FOURTEENTH206=null;
        Token FIFTEENTH207=null;
        Token SIXTEENTH208=null;
        Token SEVENTEENTH209=null;
        Token EIGHTEENTH210=null;
        Token NINETEENTH211=null;
        Token TWENTIETH212=null;
        Token TWENTY_FIRST213=null;
        Token TWENTY214=null;
        Token DASH215=null;
        Token FIRST216=null;
        Token TWENTY_SECOND217=null;
        Token TWENTY218=null;
        Token DASH219=null;
        Token SECOND220=null;
        Token TWENTY_THIRD221=null;
        Token TWENTY222=null;
        Token DASH223=null;
        Token THIRD224=null;
        Token TWENTY_FOURTH225=null;
        Token TWENTY226=null;
        Token DASH227=null;
        Token FOURTH228=null;
        Token TWENTY_FIFTH229=null;
        Token TWENTY230=null;
        Token DASH231=null;
        Token FIFTH232=null;
        Token TWENTY_SIXTH233=null;
        Token TWENTY234=null;
        Token DASH235=null;
        Token SIXTH236=null;
        Token TWENTY_SEVENTH237=null;
        Token TWENTY238=null;
        Token DASH239=null;
        Token SEVENTH240=null;
        Token TWENTY_EIGHTH241=null;
        Token TWENTY242=null;
        Token DASH243=null;
        Token EIGHTH244=null;
        Token TWENTY_NINTH245=null;
        Token TWENTY246=null;
        Token DASH247=null;
        Token NINTH248=null;
        Token THIRTIETH249=null;
        Token THIRTY_FIRST250=null;
        Token THIRTY251=null;
        Token DASH252=null;
        Token FIRST253=null;

        Object FIRST193_tree=null;
        Object SECOND194_tree=null;
        Object THIRD195_tree=null;
        Object FOURTH196_tree=null;
        Object FIFTH197_tree=null;
        Object SIXTH198_tree=null;
        Object SEVENTH199_tree=null;
        Object EIGHTH200_tree=null;
        Object NINTH201_tree=null;
        Object TENTH202_tree=null;
        Object ELEVENTH203_tree=null;
        Object TWELFTH204_tree=null;
        Object THIRTEENTH205_tree=null;
        Object FOURTEENTH206_tree=null;
        Object FIFTEENTH207_tree=null;
        Object SIXTEENTH208_tree=null;
        Object SEVENTEENTH209_tree=null;
        Object EIGHTEENTH210_tree=null;
        Object NINETEENTH211_tree=null;
        Object TWENTIETH212_tree=null;
        Object TWENTY_FIRST213_tree=null;
        Object TWENTY214_tree=null;
        Object DASH215_tree=null;
        Object FIRST216_tree=null;
        Object TWENTY_SECOND217_tree=null;
        Object TWENTY218_tree=null;
        Object DASH219_tree=null;
        Object SECOND220_tree=null;
        Object TWENTY_THIRD221_tree=null;
        Object TWENTY222_tree=null;
        Object DASH223_tree=null;
        Object THIRD224_tree=null;
        Object TWENTY_FOURTH225_tree=null;
        Object TWENTY226_tree=null;
        Object DASH227_tree=null;
        Object FOURTH228_tree=null;
        Object TWENTY_FIFTH229_tree=null;
        Object TWENTY230_tree=null;
        Object DASH231_tree=null;
        Object FIFTH232_tree=null;
        Object TWENTY_SIXTH233_tree=null;
        Object TWENTY234_tree=null;
        Object DASH235_tree=null;
        Object SIXTH236_tree=null;
        Object TWENTY_SEVENTH237_tree=null;
        Object TWENTY238_tree=null;
        Object DASH239_tree=null;
        Object SEVENTH240_tree=null;
        Object TWENTY_EIGHTH241_tree=null;
        Object TWENTY242_tree=null;
        Object DASH243_tree=null;
        Object EIGHTH244_tree=null;
        Object TWENTY_NINTH245_tree=null;
        Object TWENTY246_tree=null;
        Object DASH247_tree=null;
        Object NINTH248_tree=null;
        Object THIRTIETH249_tree=null;
        Object THIRTY_FIRST250_tree=null;
        Object THIRTY251_tree=null;
        Object DASH252_tree=null;
        Object FIRST253_tree=null;
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:3: ( FIRST -> INT[\"1\"] | SECOND -> INT[\"2\"] | THIRD -> INT[\"3\"] | FOURTH -> INT[\"4\"] | FIFTH -> INT[\"5\"] | SIXTH -> INT[\"6\"] | SEVENTH -> INT[\"7\"] | EIGHTH -> INT[\"8\"] | NINTH -> INT[\"9\"] | TENTH -> INT[\"10\"] | ELEVENTH -> INT[\"11\"] | TWELFTH -> INT[\"12\"] | THIRTEENTH -> INT[\"13\"] | FOURTEENTH -> INT[\"14\"] | FIFTEENTH -> INT[\"15\"] | SIXTEENTH -> INT[\"16\"] | SEVENTEENTH -> INT[\"17\"] | EIGHTEENTH -> INT[\"18\"] | NINETEENTH -> INT[\"19\"] | TWENTIETH -> INT[\"20\"] | ( TWENTY_FIRST | ( TWENTY ( DASH )? FIRST ) ) -> INT[\"21\"] | ( TWENTY_SECOND | ( TWENTY ( DASH )? SECOND ) ) -> INT[\"22\"] | ( TWENTY_THIRD | ( TWENTY ( DASH )? THIRD ) ) -> INT[\"23\"] | ( TWENTY_FOURTH | ( TWENTY ( DASH )? FOURTH ) ) -> INT[\"24\"] | ( TWENTY_FIFTH | ( TWENTY ( DASH )? FIFTH ) ) -> INT[\"25\"] | ( TWENTY_SIXTH | ( TWENTY ( DASH )? SIXTH ) ) -> INT[\"26\"] | ( TWENTY_SEVENTH | ( TWENTY ( DASH )? SEVENTH ) ) -> INT[\"27\"] | ( TWENTY_EIGHTH | ( TWENTY ( DASH )? EIGHTH ) ) -> INT[\"28\"] | ( TWENTY_NINTH | ( TWENTY ( DASH )? NINTH ) ) -> INT[\"29\"] | THIRTIETH -> INT[\"30\"] | ( THIRTY_FIRST | ( THIRTY ( DASH )? FIRST ) ) -> INT[\"31\"] )
            int alt84=31;
            alt84 = dfa84.predict(input);
            switch (alt84) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:5: FIRST
                    {
                    FIRST193=(Token)match(input,FIRST,FOLLOW_FIRST_in_spelled_sequence_1_to_312540); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIRST.add(FIRST193);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 261:17: -> INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:5: SECOND
                    {
                    SECOND194=(Token)match(input,SECOND,FOLLOW_SECOND_in_spelled_sequence_1_to_312557); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SECOND.add(SECOND194);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 262:17: -> INT[\"2\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "2"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:263:5: THIRD
                    {
                    THIRD195=(Token)match(input,THIRD,FOLLOW_THIRD_in_spelled_sequence_1_to_312573); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRD.add(THIRD195);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 263:17: -> INT[\"3\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "3"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:264:5: FOURTH
                    {
                    FOURTH196=(Token)match(input,FOURTH,FOLLOW_FOURTH_in_spelled_sequence_1_to_312590); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOURTH.add(FOURTH196);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 264:17: -> INT[\"4\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "4"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:265:5: FIFTH
                    {
                    FIFTH197=(Token)match(input,FIFTH,FOLLOW_FIFTH_in_spelled_sequence_1_to_312606); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIFTH.add(FIFTH197);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 265:17: -> INT[\"5\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "5"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:266:5: SIXTH
                    {
                    SIXTH198=(Token)match(input,SIXTH,FOLLOW_SIXTH_in_spelled_sequence_1_to_312623); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTH.add(SIXTH198);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 266:17: -> INT[\"6\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "6"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:267:5: SEVENTH
                    {
                    SEVENTH199=(Token)match(input,SEVENTH,FOLLOW_SEVENTH_in_spelled_sequence_1_to_312640); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVENTH.add(SEVENTH199);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 267:17: -> INT[\"7\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "7"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:268:5: EIGHTH
                    {
                    EIGHTH200=(Token)match(input,EIGHTH,FOLLOW_EIGHTH_in_spelled_sequence_1_to_312655); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHTH.add(EIGHTH200);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 268:17: -> INT[\"8\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "8"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:269:5: NINTH
                    {
                    NINTH201=(Token)match(input,NINTH,FOLLOW_NINTH_in_spelled_sequence_1_to_312671); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINTH.add(NINTH201);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 269:17: -> INT[\"9\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "9"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:270:5: TENTH
                    {
                    TENTH202=(Token)match(input,TENTH,FOLLOW_TENTH_in_spelled_sequence_1_to_312688); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TENTH.add(TENTH202);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 270:17: -> INT[\"10\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "10"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:271:5: ELEVENTH
                    {
                    ELEVENTH203=(Token)match(input,ELEVENTH,FOLLOW_ELEVENTH_in_spelled_sequence_1_to_312705); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELEVENTH.add(ELEVENTH203);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 271:17: -> INT[\"11\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "11"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:272:5: TWELFTH
                    {
                    TWELFTH204=(Token)match(input,TWELFTH,FOLLOW_TWELFTH_in_spelled_sequence_1_to_312719); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWELFTH.add(TWELFTH204);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 272:17: -> INT[\"12\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "12"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:273:5: THIRTEENTH
                    {
                    THIRTEENTH205=(Token)match(input,THIRTEENTH,FOLLOW_THIRTEENTH_in_spelled_sequence_1_to_312734); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEENTH.add(THIRTEENTH205);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 273:17: -> INT[\"13\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "13"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 14 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:274:5: FOURTEENTH
                    {
                    FOURTEENTH206=(Token)match(input,FOURTEENTH,FOLLOW_FOURTEENTH_in_spelled_sequence_1_to_312746); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOURTEENTH.add(FOURTEENTH206);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 274:17: -> INT[\"14\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "14"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 15 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:275:5: FIFTEENTH
                    {
                    FIFTEENTH207=(Token)match(input,FIFTEENTH,FOLLOW_FIFTEENTH_in_spelled_sequence_1_to_312758); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIFTEENTH.add(FIFTEENTH207);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 275:17: -> INT[\"15\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "15"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 16 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:276:5: SIXTEENTH
                    {
                    SIXTEENTH208=(Token)match(input,SIXTEENTH,FOLLOW_SIXTEENTH_in_spelled_sequence_1_to_312771); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTEENTH.add(SIXTEENTH208);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 276:17: -> INT[\"16\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "16"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 17 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:277:5: SEVENTEENTH
                    {
                    SEVENTEENTH209=(Token)match(input,SEVENTEENTH,FOLLOW_SEVENTEENTH_in_spelled_sequence_1_to_312784); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVENTEENTH.add(SEVENTEENTH209);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 277:17: -> INT[\"17\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "17"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 18 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:278:5: EIGHTEENTH
                    {
                    EIGHTEENTH210=(Token)match(input,EIGHTEENTH,FOLLOW_EIGHTEENTH_in_spelled_sequence_1_to_312795); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHTEENTH.add(EIGHTEENTH210);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 278:17: -> INT[\"18\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "18"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 19 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:279:5: NINETEENTH
                    {
                    NINETEENTH211=(Token)match(input,NINETEENTH,FOLLOW_NINETEENTH_in_spelled_sequence_1_to_312807); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINETEENTH.add(NINETEENTH211);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 279:17: -> INT[\"19\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "19"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 20 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:280:5: TWENTIETH
                    {
                    TWENTIETH212=(Token)match(input,TWENTIETH,FOLLOW_TWENTIETH_in_spelled_sequence_1_to_312819); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTIETH.add(TWENTIETH212);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 280:17: -> INT[\"20\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "20"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 21 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:281:5: ( TWENTY_FIRST | ( TWENTY ( DASH )? FIRST ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:281:5: ( TWENTY_FIRST | ( TWENTY ( DASH )? FIRST ) )
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==TWENTY_FIRST) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:281:6: TWENTY_FIRST
                            {
                            TWENTY_FIRST213=(Token)match(input,TWENTY_FIRST,FOLLOW_TWENTY_FIRST_in_spelled_sequence_1_to_312833); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_FIRST.add(TWENTY_FIRST213);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:281:23: ( TWENTY ( DASH )? FIRST )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:281:23: ( TWENTY ( DASH )? FIRST )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:281:24: TWENTY ( DASH )? FIRST
                            {
                            TWENTY214=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_312840); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY214);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:281:31: ( DASH )?
                            int alt64=2;
                            int LA64_0 = input.LA(1);

                            if ( (LA64_0==DASH) ) {
                                alt64=1;
                            }
                            switch (alt64) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:281:31: DASH
                                    {
                                    DASH215=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312842); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH215);


                                    }
                                    break;

                            }

                            FIRST216=(Token)match(input,FIRST,FOLLOW_FIRST_in_spelled_sequence_1_to_312845); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FIRST.add(FIRST216);


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
                    // 281:47: -> INT[\"21\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "21"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 22 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:282:5: ( TWENTY_SECOND | ( TWENTY ( DASH )? SECOND ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:282:5: ( TWENTY_SECOND | ( TWENTY ( DASH )? SECOND ) )
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==TWENTY_SECOND) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:282:6: TWENTY_SECOND
                            {
                            TWENTY_SECOND217=(Token)match(input,TWENTY_SECOND,FOLLOW_TWENTY_SECOND_in_spelled_sequence_1_to_312861); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_SECOND.add(TWENTY_SECOND217);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:282:23: ( TWENTY ( DASH )? SECOND )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:282:23: ( TWENTY ( DASH )? SECOND )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:282:24: TWENTY ( DASH )? SECOND
                            {
                            TWENTY218=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_312867); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY218);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:282:31: ( DASH )?
                            int alt66=2;
                            int LA66_0 = input.LA(1);

                            if ( (LA66_0==DASH) ) {
                                alt66=1;
                            }
                            switch (alt66) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:282:31: DASH
                                    {
                                    DASH219=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312869); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH219);


                                    }
                                    break;

                            }

                            SECOND220=(Token)match(input,SECOND,FOLLOW_SECOND_in_spelled_sequence_1_to_312872); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SECOND.add(SECOND220);


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
                    // 282:47: -> INT[\"22\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "22"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 23 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:283:5: ( TWENTY_THIRD | ( TWENTY ( DASH )? THIRD ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:283:5: ( TWENTY_THIRD | ( TWENTY ( DASH )? THIRD ) )
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==TWENTY_THIRD) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:283:6: TWENTY_THIRD
                            {
                            TWENTY_THIRD221=(Token)match(input,TWENTY_THIRD,FOLLOW_TWENTY_THIRD_in_spelled_sequence_1_to_312887); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_THIRD.add(TWENTY_THIRD221);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:283:23: ( TWENTY ( DASH )? THIRD )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:283:23: ( TWENTY ( DASH )? THIRD )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:283:24: TWENTY ( DASH )? THIRD
                            {
                            TWENTY222=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_312894); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY222);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:283:31: ( DASH )?
                            int alt68=2;
                            int LA68_0 = input.LA(1);

                            if ( (LA68_0==DASH) ) {
                                alt68=1;
                            }
                            switch (alt68) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:283:31: DASH
                                    {
                                    DASH223=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312896); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH223);


                                    }
                                    break;

                            }

                            THIRD224=(Token)match(input,THIRD,FOLLOW_THIRD_in_spelled_sequence_1_to_312899); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIRD.add(THIRD224);


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
                    // 283:47: -> INT[\"23\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "23"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 24 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:284:5: ( TWENTY_FOURTH | ( TWENTY ( DASH )? FOURTH ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:284:5: ( TWENTY_FOURTH | ( TWENTY ( DASH )? FOURTH ) )
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==TWENTY_FOURTH) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:284:6: TWENTY_FOURTH
                            {
                            TWENTY_FOURTH225=(Token)match(input,TWENTY_FOURTH,FOLLOW_TWENTY_FOURTH_in_spelled_sequence_1_to_312915); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_FOURTH.add(TWENTY_FOURTH225);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:284:23: ( TWENTY ( DASH )? FOURTH )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:284:23: ( TWENTY ( DASH )? FOURTH )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:284:24: TWENTY ( DASH )? FOURTH
                            {
                            TWENTY226=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_312921); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY226);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:284:31: ( DASH )?
                            int alt70=2;
                            int LA70_0 = input.LA(1);

                            if ( (LA70_0==DASH) ) {
                                alt70=1;
                            }
                            switch (alt70) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:284:31: DASH
                                    {
                                    DASH227=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312923); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH227);


                                    }
                                    break;

                            }

                            FOURTH228=(Token)match(input,FOURTH,FOLLOW_FOURTH_in_spelled_sequence_1_to_312926); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FOURTH.add(FOURTH228);


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
                    // 284:47: -> INT[\"24\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "24"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 25 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:285:5: ( TWENTY_FIFTH | ( TWENTY ( DASH )? FIFTH ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:285:5: ( TWENTY_FIFTH | ( TWENTY ( DASH )? FIFTH ) )
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==TWENTY_FIFTH) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:285:6: TWENTY_FIFTH
                            {
                            TWENTY_FIFTH229=(Token)match(input,TWENTY_FIFTH,FOLLOW_TWENTY_FIFTH_in_spelled_sequence_1_to_312941); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_FIFTH.add(TWENTY_FIFTH229);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:285:23: ( TWENTY ( DASH )? FIFTH )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:285:23: ( TWENTY ( DASH )? FIFTH )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:285:24: TWENTY ( DASH )? FIFTH
                            {
                            TWENTY230=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_312948); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY230);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:285:31: ( DASH )?
                            int alt72=2;
                            int LA72_0 = input.LA(1);

                            if ( (LA72_0==DASH) ) {
                                alt72=1;
                            }
                            switch (alt72) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:285:31: DASH
                                    {
                                    DASH231=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312950); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH231);


                                    }
                                    break;

                            }

                            FIFTH232=(Token)match(input,FIFTH,FOLLOW_FIFTH_in_spelled_sequence_1_to_312953); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FIFTH.add(FIFTH232);


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
                    // 285:47: -> INT[\"25\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "25"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 26 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:286:5: ( TWENTY_SIXTH | ( TWENTY ( DASH )? SIXTH ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:286:5: ( TWENTY_SIXTH | ( TWENTY ( DASH )? SIXTH ) )
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==TWENTY_SIXTH) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:286:6: TWENTY_SIXTH
                            {
                            TWENTY_SIXTH233=(Token)match(input,TWENTY_SIXTH,FOLLOW_TWENTY_SIXTH_in_spelled_sequence_1_to_312969); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_SIXTH.add(TWENTY_SIXTH233);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:286:23: ( TWENTY ( DASH )? SIXTH )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:286:23: ( TWENTY ( DASH )? SIXTH )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:286:24: TWENTY ( DASH )? SIXTH
                            {
                            TWENTY234=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_312976); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY234);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:286:31: ( DASH )?
                            int alt74=2;
                            int LA74_0 = input.LA(1);

                            if ( (LA74_0==DASH) ) {
                                alt74=1;
                            }
                            switch (alt74) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:286:31: DASH
                                    {
                                    DASH235=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312978); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH235);


                                    }
                                    break;

                            }

                            SIXTH236=(Token)match(input,SIXTH,FOLLOW_SIXTH_in_spelled_sequence_1_to_312981); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SIXTH.add(SIXTH236);


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
                    // 286:47: -> INT[\"26\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "26"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 27 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:287:5: ( TWENTY_SEVENTH | ( TWENTY ( DASH )? SEVENTH ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:287:5: ( TWENTY_SEVENTH | ( TWENTY ( DASH )? SEVENTH ) )
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==TWENTY_SEVENTH) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:287:6: TWENTY_SEVENTH
                            {
                            TWENTY_SEVENTH237=(Token)match(input,TWENTY_SEVENTH,FOLLOW_TWENTY_SEVENTH_in_spelled_sequence_1_to_312997); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_SEVENTH.add(TWENTY_SEVENTH237);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:287:23: ( TWENTY ( DASH )? SEVENTH )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:287:23: ( TWENTY ( DASH )? SEVENTH )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:287:24: TWENTY ( DASH )? SEVENTH
                            {
                            TWENTY238=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_313002); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY238);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:287:31: ( DASH )?
                            int alt76=2;
                            int LA76_0 = input.LA(1);

                            if ( (LA76_0==DASH) ) {
                                alt76=1;
                            }
                            switch (alt76) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:287:31: DASH
                                    {
                                    DASH239=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_313004); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH239);


                                    }
                                    break;

                            }

                            SEVENTH240=(Token)match(input,SEVENTH,FOLLOW_SEVENTH_in_spelled_sequence_1_to_313007); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SEVENTH.add(SEVENTH240);


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
                    // 287:47: -> INT[\"27\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "27"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 28 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:288:5: ( TWENTY_EIGHTH | ( TWENTY ( DASH )? EIGHTH ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:288:5: ( TWENTY_EIGHTH | ( TWENTY ( DASH )? EIGHTH ) )
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==TWENTY_EIGHTH) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:288:6: TWENTY_EIGHTH
                            {
                            TWENTY_EIGHTH241=(Token)match(input,TWENTY_EIGHTH,FOLLOW_TWENTY_EIGHTH_in_spelled_sequence_1_to_313021); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_EIGHTH.add(TWENTY_EIGHTH241);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:288:23: ( TWENTY ( DASH )? EIGHTH )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:288:23: ( TWENTY ( DASH )? EIGHTH )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:288:24: TWENTY ( DASH )? EIGHTH
                            {
                            TWENTY242=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_313027); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY242);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:288:31: ( DASH )?
                            int alt78=2;
                            int LA78_0 = input.LA(1);

                            if ( (LA78_0==DASH) ) {
                                alt78=1;
                            }
                            switch (alt78) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:288:31: DASH
                                    {
                                    DASH243=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_313029); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH243);


                                    }
                                    break;

                            }

                            EIGHTH244=(Token)match(input,EIGHTH,FOLLOW_EIGHTH_in_spelled_sequence_1_to_313032); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EIGHTH.add(EIGHTH244);


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
                    // 288:47: -> INT[\"28\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "28"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 29 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:289:5: ( TWENTY_NINTH | ( TWENTY ( DASH )? NINTH ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:289:5: ( TWENTY_NINTH | ( TWENTY ( DASH )? NINTH ) )
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==TWENTY_NINTH) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:289:6: TWENTY_NINTH
                            {
                            TWENTY_NINTH245=(Token)match(input,TWENTY_NINTH,FOLLOW_TWENTY_NINTH_in_spelled_sequence_1_to_313047); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_NINTH.add(TWENTY_NINTH245);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:289:23: ( TWENTY ( DASH )? NINTH )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:289:23: ( TWENTY ( DASH )? NINTH )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:289:24: TWENTY ( DASH )? NINTH
                            {
                            TWENTY246=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_313054); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY246);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:289:31: ( DASH )?
                            int alt80=2;
                            int LA80_0 = input.LA(1);

                            if ( (LA80_0==DASH) ) {
                                alt80=1;
                            }
                            switch (alt80) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:289:31: DASH
                                    {
                                    DASH247=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_313056); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH247);


                                    }
                                    break;

                            }

                            NINTH248=(Token)match(input,NINTH,FOLLOW_NINTH_in_spelled_sequence_1_to_313059); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NINTH.add(NINTH248);


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
                    // 289:47: -> INT[\"29\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "29"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 30 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:290:5: THIRTIETH
                    {
                    THIRTIETH249=(Token)match(input,THIRTIETH,FOLLOW_THIRTIETH_in_spelled_sequence_1_to_313074); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTIETH.add(THIRTIETH249);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 290:47: -> INT[\"30\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "30"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 31 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:291:5: ( THIRTY_FIRST | ( THIRTY ( DASH )? FIRST ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:291:5: ( THIRTY_FIRST | ( THIRTY ( DASH )? FIRST ) )
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==THIRTY_FIRST) ) {
                        alt83=1;
                    }
                    else if ( (LA83_0==THIRTY) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:291:6: THIRTY_FIRST
                            {
                            THIRTY_FIRST250=(Token)match(input,THIRTY_FIRST,FOLLOW_THIRTY_FIRST_in_spelled_sequence_1_to_313118); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIRTY_FIRST.add(THIRTY_FIRST250);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:291:23: ( THIRTY ( DASH )? FIRST )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:291:23: ( THIRTY ( DASH )? FIRST )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:291:24: THIRTY ( DASH )? FIRST
                            {
                            THIRTY251=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_sequence_1_to_313125); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY251);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:291:31: ( DASH )?
                            int alt82=2;
                            int LA82_0 = input.LA(1);

                            if ( (LA82_0==DASH) ) {
                                alt82=1;
                            }
                            switch (alt82) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:291:31: DASH
                                    {
                                    DASH252=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_313127); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH252);


                                    }
                                    break;

                            }

                            FIRST253=(Token)match(input,FIRST,FOLLOW_FIRST_in_spelled_sequence_1_to_313130); if (state.failed) return retval; 
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
                    // 291:47: -> INT[\"31\"]
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:295:1: int_up_to_4_digits : ( int_0_to_99_with_prefix | THREE_DIGIT -> INT[$THREE_DIGIT.text] | FOUR_DIGIT -> INT[$FOUR_DIGIT.text] );
    public final DateParser.int_up_to_4_digits_return int_up_to_4_digits() throws RecognitionException {
        DateParser.int_up_to_4_digits_return retval = new DateParser.int_up_to_4_digits_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THREE_DIGIT255=null;
        Token FOUR_DIGIT256=null;
        DateParser.int_0_to_99_with_prefix_return int_0_to_99_with_prefix254 = null;


        Object THREE_DIGIT255_tree=null;
        Object FOUR_DIGIT256_tree=null;
        RewriteRuleTokenStream stream_FOUR_DIGIT=new RewriteRuleTokenStream(adaptor,"token FOUR_DIGIT");
        RewriteRuleTokenStream stream_THREE_DIGIT=new RewriteRuleTokenStream(adaptor,"token THREE_DIGIT");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:296:3: ( int_0_to_99_with_prefix | THREE_DIGIT -> INT[$THREE_DIGIT.text] | FOUR_DIGIT -> INT[$FOUR_DIGIT.text] )
            int alt85=3;
            switch ( input.LA(1) ) {
            case TWO_ZEROS:
            case PREFIXED_ONE_TO_NINE:
            case TEN_TO_TWELVE:
            case THIRTEEN_TO_TWENTY_THREE:
            case TWENTY_FOUR_TO_THIRTY_ONE:
            case THIRTY_TWO_TO_FIFTY_NINE:
            case SIXTY_TO_NINETY_NINE:
                {
                alt85=1;
                }
                break;
            case THREE_DIGIT:
                {
                alt85=2;
                }
                break;
            case FOUR_DIGIT:
                {
                alt85=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }

            switch (alt85) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:296:5: int_0_to_99_with_prefix
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_int_0_to_99_with_prefix_in_int_up_to_4_digits3155);
                    int_0_to_99_with_prefix254=int_0_to_99_with_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, int_0_to_99_with_prefix254.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:297:5: THREE_DIGIT
                    {
                    THREE_DIGIT255=(Token)match(input,THREE_DIGIT,FOLLOW_THREE_DIGIT_in_int_up_to_4_digits3161); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THREE_DIGIT.add(THREE_DIGIT255);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 297:17: -> INT[$THREE_DIGIT.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (THREE_DIGIT255!=null?THREE_DIGIT255.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:298:5: FOUR_DIGIT
                    {
                    FOUR_DIGIT256=(Token)match(input,FOUR_DIGIT,FOLLOW_FOUR_DIGIT_in_int_up_to_4_digits3172); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOUR_DIGIT.add(FOUR_DIGIT256);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 298:17: -> INT[$FOUR_DIGIT.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (FOUR_DIGIT256!=null?FOUR_DIGIT256.getText():null)));

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:302:1: int_3_or_4_digits : ( THREE_DIGIT -> INT[$THREE_DIGIT.text] | FOUR_DIGIT -> INT[$FOUR_DIGIT.text] );
    public final DateParser.int_3_or_4_digits_return int_3_or_4_digits() throws RecognitionException {
        DateParser.int_3_or_4_digits_return retval = new DateParser.int_3_or_4_digits_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THREE_DIGIT257=null;
        Token FOUR_DIGIT258=null;

        Object THREE_DIGIT257_tree=null;
        Object FOUR_DIGIT258_tree=null;
        RewriteRuleTokenStream stream_FOUR_DIGIT=new RewriteRuleTokenStream(adaptor,"token FOUR_DIGIT");
        RewriteRuleTokenStream stream_THREE_DIGIT=new RewriteRuleTokenStream(adaptor,"token THREE_DIGIT");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:303:3: ( THREE_DIGIT -> INT[$THREE_DIGIT.text] | FOUR_DIGIT -> INT[$FOUR_DIGIT.text] )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==THREE_DIGIT) ) {
                alt86=1;
            }
            else if ( (LA86_0==FOUR_DIGIT) ) {
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:303:5: THREE_DIGIT
                    {
                    THREE_DIGIT257=(Token)match(input,THREE_DIGIT,FOLLOW_THREE_DIGIT_in_int_3_or_4_digits3194); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THREE_DIGIT.add(THREE_DIGIT257);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 303:17: -> INT[$THREE_DIGIT.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (THREE_DIGIT257!=null?THREE_DIGIT257.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:304:5: FOUR_DIGIT
                    {
                    FOUR_DIGIT258=(Token)match(input,FOUR_DIGIT,FOLLOW_FOUR_DIGIT_in_int_3_or_4_digits3205); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOUR_DIGIT.add(FOUR_DIGIT258);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 304:17: -> INT[$FOUR_DIGIT.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (FOUR_DIGIT258!=null?FOUR_DIGIT258.getText():null)));

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:308:1: int_4_digits : FOUR_DIGIT -> INT[$FOUR_DIGIT.text] ;
    public final DateParser.int_4_digits_return int_4_digits() throws RecognitionException {
        DateParser.int_4_digits_return retval = new DateParser.int_4_digits_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FOUR_DIGIT259=null;

        Object FOUR_DIGIT259_tree=null;
        RewriteRuleTokenStream stream_FOUR_DIGIT=new RewriteRuleTokenStream(adaptor,"token FOUR_DIGIT");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:309:3: ( FOUR_DIGIT -> INT[$FOUR_DIGIT.text] )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:309:5: FOUR_DIGIT
            {
            FOUR_DIGIT259=(Token)match(input,FOUR_DIGIT,FOLLOW_FOUR_DIGIT_in_int_4_digits3227); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FOUR_DIGIT.add(FOUR_DIGIT259);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 309:16: -> INT[$FOUR_DIGIT.text]
            {
                adaptor.addChild(root_0, (Object)adaptor.create(INT, (FOUR_DIGIT259!=null?FOUR_DIGIT259.getText():null)));

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:312:1: int_1_to_12 : ( TWO_ZEROS -> INT[$TWO_ZEROS.text] | PREFIXED_ONE_TO_NINE -> INT[$PREFIXED_ONE_TO_NINE.text] | TEN_TO_TWELVE -> INT[$TEN_TO_TWELVE.text] );
    public final DateParser.int_1_to_12_return int_1_to_12() throws RecognitionException {
        DateParser.int_1_to_12_return retval = new DateParser.int_1_to_12_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TWO_ZEROS260=null;
        Token PREFIXED_ONE_TO_NINE261=null;
        Token TEN_TO_TWELVE262=null;

        Object TWO_ZEROS260_tree=null;
        Object PREFIXED_ONE_TO_NINE261_tree=null;
        Object TEN_TO_TWELVE262_tree=null;
        RewriteRuleTokenStream stream_TWO_ZEROS=new RewriteRuleTokenStream(adaptor,"token TWO_ZEROS");
        RewriteRuleTokenStream stream_TEN_TO_TWELVE=new RewriteRuleTokenStream(adaptor,"token TEN_TO_TWELVE");
        RewriteRuleTokenStream stream_PREFIXED_ONE_TO_NINE=new RewriteRuleTokenStream(adaptor,"token PREFIXED_ONE_TO_NINE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:313:3: ( TWO_ZEROS -> INT[$TWO_ZEROS.text] | PREFIXED_ONE_TO_NINE -> INT[$PREFIXED_ONE_TO_NINE.text] | TEN_TO_TWELVE -> INT[$TEN_TO_TWELVE.text] )
            int alt87=3;
            switch ( input.LA(1) ) {
            case TWO_ZEROS:
                {
                alt87=1;
                }
                break;
            case PREFIXED_ONE_TO_NINE:
                {
                alt87=2;
                }
                break;
            case TEN_TO_TWELVE:
                {
                alt87=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:313:5: TWO_ZEROS
                    {
                    TWO_ZEROS260=(Token)match(input,TWO_ZEROS,FOLLOW_TWO_ZEROS_in_int_1_to_123247); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO_ZEROS.add(TWO_ZEROS260);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 313:26: -> INT[$TWO_ZEROS.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TWO_ZEROS260!=null?TWO_ZEROS260.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:314:5: PREFIXED_ONE_TO_NINE
                    {
                    PREFIXED_ONE_TO_NINE261=(Token)match(input,PREFIXED_ONE_TO_NINE,FOLLOW_PREFIXED_ONE_TO_NINE_in_int_1_to_123269); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PREFIXED_ONE_TO_NINE.add(PREFIXED_ONE_TO_NINE261);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 314:26: -> INT[$PREFIXED_ONE_TO_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (PREFIXED_ONE_TO_NINE261!=null?PREFIXED_ONE_TO_NINE261.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:315:5: TEN_TO_TWELVE
                    {
                    TEN_TO_TWELVE262=(Token)match(input,TEN_TO_TWELVE,FOLLOW_TEN_TO_TWELVE_in_int_1_to_123280); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TEN_TO_TWELVE.add(TEN_TO_TWELVE262);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 315:26: -> INT[$TEN_TO_TWELVE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TEN_TO_TWELVE262!=null?TEN_TO_TWELVE262.getText():null)));

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:319:1: int_0_to_23 : ( TWO_ZEROS -> INT[$TWO_ZEROS.text] | PREFIXED_ONE_TO_NINE -> INT[$PREFIXED_ONE_TO_NINE.text] | ONE_TO_NINE -> INT[$ONE_TO_NINE.text] | TEN_TO_TWELVE -> INT[$TEN_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INT[$THIRTEEN_TO_TWENTY_THREE.text] );
    public final DateParser.int_0_to_23_return int_0_to_23() throws RecognitionException {
        DateParser.int_0_to_23_return retval = new DateParser.int_0_to_23_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TWO_ZEROS263=null;
        Token PREFIXED_ONE_TO_NINE264=null;
        Token ONE_TO_NINE265=null;
        Token TEN_TO_TWELVE266=null;
        Token THIRTEEN_TO_TWENTY_THREE267=null;

        Object TWO_ZEROS263_tree=null;
        Object PREFIXED_ONE_TO_NINE264_tree=null;
        Object ONE_TO_NINE265_tree=null;
        Object TEN_TO_TWELVE266_tree=null;
        Object THIRTEEN_TO_TWENTY_THREE267_tree=null;
        RewriteRuleTokenStream stream_ONE_TO_NINE=new RewriteRuleTokenStream(adaptor,"token ONE_TO_NINE");
        RewriteRuleTokenStream stream_TWO_ZEROS=new RewriteRuleTokenStream(adaptor,"token TWO_ZEROS");
        RewriteRuleTokenStream stream_THIRTEEN_TO_TWENTY_THREE=new RewriteRuleTokenStream(adaptor,"token THIRTEEN_TO_TWENTY_THREE");
        RewriteRuleTokenStream stream_TEN_TO_TWELVE=new RewriteRuleTokenStream(adaptor,"token TEN_TO_TWELVE");
        RewriteRuleTokenStream stream_PREFIXED_ONE_TO_NINE=new RewriteRuleTokenStream(adaptor,"token PREFIXED_ONE_TO_NINE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:320:3: ( TWO_ZEROS -> INT[$TWO_ZEROS.text] | PREFIXED_ONE_TO_NINE -> INT[$PREFIXED_ONE_TO_NINE.text] | ONE_TO_NINE -> INT[$ONE_TO_NINE.text] | TEN_TO_TWELVE -> INT[$TEN_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INT[$THIRTEEN_TO_TWENTY_THREE.text] )
            int alt88=5;
            switch ( input.LA(1) ) {
            case TWO_ZEROS:
                {
                alt88=1;
                }
                break;
            case PREFIXED_ONE_TO_NINE:
                {
                alt88=2;
                }
                break;
            case ONE_TO_NINE:
                {
                alt88=3;
                }
                break;
            case TEN_TO_TWELVE:
                {
                alt88=4;
                }
                break;
            case THIRTEEN_TO_TWENTY_THREE:
                {
                alt88=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:320:5: TWO_ZEROS
                    {
                    TWO_ZEROS263=(Token)match(input,TWO_ZEROS,FOLLOW_TWO_ZEROS_in_int_0_to_233308); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO_ZEROS.add(TWO_ZEROS263);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 320:30: -> INT[$TWO_ZEROS.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TWO_ZEROS263!=null?TWO_ZEROS263.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:321:5: PREFIXED_ONE_TO_NINE
                    {
                    PREFIXED_ONE_TO_NINE264=(Token)match(input,PREFIXED_ONE_TO_NINE,FOLLOW_PREFIXED_ONE_TO_NINE_in_int_0_to_233334); if (state.failed) return retval; 
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
                    // 321:30: -> INT[$PREFIXED_ONE_TO_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (PREFIXED_ONE_TO_NINE264!=null?PREFIXED_ONE_TO_NINE264.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:322:5: ONE_TO_NINE
                    {
                    ONE_TO_NINE265=(Token)match(input,ONE_TO_NINE,FOLLOW_ONE_TO_NINE_in_int_0_to_233349); if (state.failed) return retval; 
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
                    // 322:30: -> INT[$ONE_TO_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (ONE_TO_NINE265!=null?ONE_TO_NINE265.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:323:5: TEN_TO_TWELVE
                    {
                    TEN_TO_TWELVE266=(Token)match(input,TEN_TO_TWELVE,FOLLOW_TEN_TO_TWELVE_in_int_0_to_233373); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TEN_TO_TWELVE.add(TEN_TO_TWELVE266);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 323:30: -> INT[$TEN_TO_TWELVE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TEN_TO_TWELVE266!=null?TEN_TO_TWELVE266.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:324:5: THIRTEEN_TO_TWENTY_THREE
                    {
                    THIRTEEN_TO_TWENTY_THREE267=(Token)match(input,THIRTEEN_TO_TWENTY_THREE,FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_int_0_to_233395); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEEN_TO_TWENTY_THREE.add(THIRTEEN_TO_TWENTY_THREE267);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 324:30: -> INT[$THIRTEEN_TO_TWENTY_THREE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (THIRTEEN_TO_TWENTY_THREE267!=null?THIRTEEN_TO_TWENTY_THREE267.getText():null)));

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:328:1: int_0_to_59 : ( TWO_ZEROS -> INT[$TWO_ZEROS.text] | PREFIXED_ONE_TO_NINE -> INT[$PREFIXED_ONE_TO_NINE.text] | ONE_TO_NINE -> INT[$ONE_TO_NINE.text] | TEN_TO_TWELVE -> INT[$TEN_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INT[$THIRTEEN_TO_TWENTY_THREE.text] | TWENTY_FOUR_TO_THIRTY_ONE -> INT[$TWENTY_FOUR_TO_THIRTY_ONE.text] | THIRTY_TWO_TO_FIFTY_NINE -> INT[$THIRTY_TWO_TO_FIFTY_NINE.text] );
    public final DateParser.int_0_to_59_return int_0_to_59() throws RecognitionException {
        DateParser.int_0_to_59_return retval = new DateParser.int_0_to_59_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TWO_ZEROS268=null;
        Token PREFIXED_ONE_TO_NINE269=null;
        Token ONE_TO_NINE270=null;
        Token TEN_TO_TWELVE271=null;
        Token THIRTEEN_TO_TWENTY_THREE272=null;
        Token TWENTY_FOUR_TO_THIRTY_ONE273=null;
        Token THIRTY_TWO_TO_FIFTY_NINE274=null;

        Object TWO_ZEROS268_tree=null;
        Object PREFIXED_ONE_TO_NINE269_tree=null;
        Object ONE_TO_NINE270_tree=null;
        Object TEN_TO_TWELVE271_tree=null;
        Object THIRTEEN_TO_TWENTY_THREE272_tree=null;
        Object TWENTY_FOUR_TO_THIRTY_ONE273_tree=null;
        Object THIRTY_TWO_TO_FIFTY_NINE274_tree=null;
        RewriteRuleTokenStream stream_ONE_TO_NINE=new RewriteRuleTokenStream(adaptor,"token ONE_TO_NINE");
        RewriteRuleTokenStream stream_TWO_ZEROS=new RewriteRuleTokenStream(adaptor,"token TWO_ZEROS");
        RewriteRuleTokenStream stream_THIRTEEN_TO_TWENTY_THREE=new RewriteRuleTokenStream(adaptor,"token THIRTEEN_TO_TWENTY_THREE");
        RewriteRuleTokenStream stream_THIRTY_TWO_TO_FIFTY_NINE=new RewriteRuleTokenStream(adaptor,"token THIRTY_TWO_TO_FIFTY_NINE");
        RewriteRuleTokenStream stream_TEN_TO_TWELVE=new RewriteRuleTokenStream(adaptor,"token TEN_TO_TWELVE");
        RewriteRuleTokenStream stream_PREFIXED_ONE_TO_NINE=new RewriteRuleTokenStream(adaptor,"token PREFIXED_ONE_TO_NINE");
        RewriteRuleTokenStream stream_TWENTY_FOUR_TO_THIRTY_ONE=new RewriteRuleTokenStream(adaptor,"token TWENTY_FOUR_TO_THIRTY_ONE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:329:3: ( TWO_ZEROS -> INT[$TWO_ZEROS.text] | PREFIXED_ONE_TO_NINE -> INT[$PREFIXED_ONE_TO_NINE.text] | ONE_TO_NINE -> INT[$ONE_TO_NINE.text] | TEN_TO_TWELVE -> INT[$TEN_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INT[$THIRTEEN_TO_TWENTY_THREE.text] | TWENTY_FOUR_TO_THIRTY_ONE -> INT[$TWENTY_FOUR_TO_THIRTY_ONE.text] | THIRTY_TWO_TO_FIFTY_NINE -> INT[$THIRTY_TWO_TO_FIFTY_NINE.text] )
            int alt89=7;
            switch ( input.LA(1) ) {
            case TWO_ZEROS:
                {
                alt89=1;
                }
                break;
            case PREFIXED_ONE_TO_NINE:
                {
                alt89=2;
                }
                break;
            case ONE_TO_NINE:
                {
                alt89=3;
                }
                break;
            case TEN_TO_TWELVE:
                {
                alt89=4;
                }
                break;
            case THIRTEEN_TO_TWENTY_THREE:
                {
                alt89=5;
                }
                break;
            case TWENTY_FOUR_TO_THIRTY_ONE:
                {
                alt89=6;
                }
                break;
            case THIRTY_TWO_TO_FIFTY_NINE:
                {
                alt89=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:329:5: TWO_ZEROS
                    {
                    TWO_ZEROS268=(Token)match(input,TWO_ZEROS,FOLLOW_TWO_ZEROS_in_int_0_to_593416); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO_ZEROS.add(TWO_ZEROS268);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 329:31: -> INT[$TWO_ZEROS.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TWO_ZEROS268!=null?TWO_ZEROS268.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:330:5: PREFIXED_ONE_TO_NINE
                    {
                    PREFIXED_ONE_TO_NINE269=(Token)match(input,PREFIXED_ONE_TO_NINE,FOLLOW_PREFIXED_ONE_TO_NINE_in_int_0_to_593443); if (state.failed) return retval; 
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
                    // 330:31: -> INT[$PREFIXED_ONE_TO_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (PREFIXED_ONE_TO_NINE269!=null?PREFIXED_ONE_TO_NINE269.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:331:5: ONE_TO_NINE
                    {
                    ONE_TO_NINE270=(Token)match(input,ONE_TO_NINE,FOLLOW_ONE_TO_NINE_in_int_0_to_593459); if (state.failed) return retval; 
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
                    // 331:31: -> INT[$ONE_TO_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (ONE_TO_NINE270!=null?ONE_TO_NINE270.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:332:5: TEN_TO_TWELVE
                    {
                    TEN_TO_TWELVE271=(Token)match(input,TEN_TO_TWELVE,FOLLOW_TEN_TO_TWELVE_in_int_0_to_593484); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TEN_TO_TWELVE.add(TEN_TO_TWELVE271);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 332:31: -> INT[$TEN_TO_TWELVE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TEN_TO_TWELVE271!=null?TEN_TO_TWELVE271.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:333:5: THIRTEEN_TO_TWENTY_THREE
                    {
                    THIRTEEN_TO_TWENTY_THREE272=(Token)match(input,THIRTEEN_TO_TWENTY_THREE,FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_int_0_to_593507); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEEN_TO_TWENTY_THREE.add(THIRTEEN_TO_TWENTY_THREE272);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 333:31: -> INT[$THIRTEEN_TO_TWENTY_THREE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (THIRTEEN_TO_TWENTY_THREE272!=null?THIRTEEN_TO_TWENTY_THREE272.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:334:5: TWENTY_FOUR_TO_THIRTY_ONE
                    {
                    TWENTY_FOUR_TO_THIRTY_ONE273=(Token)match(input,TWENTY_FOUR_TO_THIRTY_ONE,FOLLOW_TWENTY_FOUR_TO_THIRTY_ONE_in_int_0_to_593519); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY_FOUR_TO_THIRTY_ONE.add(TWENTY_FOUR_TO_THIRTY_ONE273);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 334:31: -> INT[$TWENTY_FOUR_TO_THIRTY_ONE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TWENTY_FOUR_TO_THIRTY_ONE273!=null?TWENTY_FOUR_TO_THIRTY_ONE273.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:335:5: THIRTY_TWO_TO_FIFTY_NINE
                    {
                    THIRTY_TWO_TO_FIFTY_NINE274=(Token)match(input,THIRTY_TWO_TO_FIFTY_NINE,FOLLOW_THIRTY_TWO_TO_FIFTY_NINE_in_int_0_to_593530); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY_TWO_TO_FIFTY_NINE.add(THIRTY_TWO_TO_FIFTY_NINE274);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 335:31: -> INT[$THIRTY_TWO_TO_FIFTY_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (THIRTY_TWO_TO_FIFTY_NINE274!=null?THIRTY_TWO_TO_FIFTY_NINE274.getText():null)));

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:339:1: int_0_to_99_no_prefix : ( ONE_ZERO -> INT[$ONE_ZERO.text] | ONE_TO_NINE -> INT[$ONE_TO_NINE.text] | TEN_TO_TWELVE -> INT[$TEN_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INT[$THIRTEEN_TO_TWENTY_THREE.text] | TWENTY_FOUR_TO_THIRTY_ONE -> INT[$TWENTY_FOUR_TO_THIRTY_ONE.text] | THIRTY_TWO_TO_FIFTY_NINE -> INT[$THIRTY_TWO_TO_FIFTY_NINE.text] | SIXTY_TO_NINETY_NINE -> INT[$SIXTY_TO_NINETY_NINE.text] );
    public final DateParser.int_0_to_99_no_prefix_return int_0_to_99_no_prefix() throws RecognitionException {
        DateParser.int_0_to_99_no_prefix_return retval = new DateParser.int_0_to_99_no_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ONE_ZERO275=null;
        Token ONE_TO_NINE276=null;
        Token TEN_TO_TWELVE277=null;
        Token THIRTEEN_TO_TWENTY_THREE278=null;
        Token TWENTY_FOUR_TO_THIRTY_ONE279=null;
        Token THIRTY_TWO_TO_FIFTY_NINE280=null;
        Token SIXTY_TO_NINETY_NINE281=null;

        Object ONE_ZERO275_tree=null;
        Object ONE_TO_NINE276_tree=null;
        Object TEN_TO_TWELVE277_tree=null;
        Object THIRTEEN_TO_TWENTY_THREE278_tree=null;
        Object TWENTY_FOUR_TO_THIRTY_ONE279_tree=null;
        Object THIRTY_TWO_TO_FIFTY_NINE280_tree=null;
        Object SIXTY_TO_NINETY_NINE281_tree=null;
        RewriteRuleTokenStream stream_ONE_TO_NINE=new RewriteRuleTokenStream(adaptor,"token ONE_TO_NINE");
        RewriteRuleTokenStream stream_SIXTY_TO_NINETY_NINE=new RewriteRuleTokenStream(adaptor,"token SIXTY_TO_NINETY_NINE");
        RewriteRuleTokenStream stream_THIRTEEN_TO_TWENTY_THREE=new RewriteRuleTokenStream(adaptor,"token THIRTEEN_TO_TWENTY_THREE");
        RewriteRuleTokenStream stream_THIRTY_TWO_TO_FIFTY_NINE=new RewriteRuleTokenStream(adaptor,"token THIRTY_TWO_TO_FIFTY_NINE");
        RewriteRuleTokenStream stream_TEN_TO_TWELVE=new RewriteRuleTokenStream(adaptor,"token TEN_TO_TWELVE");
        RewriteRuleTokenStream stream_ONE_ZERO=new RewriteRuleTokenStream(adaptor,"token ONE_ZERO");
        RewriteRuleTokenStream stream_TWENTY_FOUR_TO_THIRTY_ONE=new RewriteRuleTokenStream(adaptor,"token TWENTY_FOUR_TO_THIRTY_ONE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:340:3: ( ONE_ZERO -> INT[$ONE_ZERO.text] | ONE_TO_NINE -> INT[$ONE_TO_NINE.text] | TEN_TO_TWELVE -> INT[$TEN_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INT[$THIRTEEN_TO_TWENTY_THREE.text] | TWENTY_FOUR_TO_THIRTY_ONE -> INT[$TWENTY_FOUR_TO_THIRTY_ONE.text] | THIRTY_TWO_TO_FIFTY_NINE -> INT[$THIRTY_TWO_TO_FIFTY_NINE.text] | SIXTY_TO_NINETY_NINE -> INT[$SIXTY_TO_NINETY_NINE.text] )
            int alt90=7;
            switch ( input.LA(1) ) {
            case ONE_ZERO:
                {
                alt90=1;
                }
                break;
            case ONE_TO_NINE:
                {
                alt90=2;
                }
                break;
            case TEN_TO_TWELVE:
                {
                alt90=3;
                }
                break;
            case THIRTEEN_TO_TWENTY_THREE:
                {
                alt90=4;
                }
                break;
            case TWENTY_FOUR_TO_THIRTY_ONE:
                {
                alt90=5;
                }
                break;
            case THIRTY_TWO_TO_FIFTY_NINE:
                {
                alt90=6;
                }
                break;
            case SIXTY_TO_NINETY_NINE:
                {
                alt90=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:340:5: ONE_ZERO
                    {
                    ONE_ZERO275=(Token)match(input,ONE_ZERO,FOLLOW_ONE_ZERO_in_int_0_to_99_no_prefix3552); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE_ZERO.add(ONE_ZERO275);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 340:31: -> INT[$ONE_ZERO.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (ONE_ZERO275!=null?ONE_ZERO275.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:341:5: ONE_TO_NINE
                    {
                    ONE_TO_NINE276=(Token)match(input,ONE_TO_NINE,FOLLOW_ONE_TO_NINE_in_int_0_to_99_no_prefix3580); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE_TO_NINE.add(ONE_TO_NINE276);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 341:31: -> INT[$ONE_TO_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (ONE_TO_NINE276!=null?ONE_TO_NINE276.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:342:5: TEN_TO_TWELVE
                    {
                    TEN_TO_TWELVE277=(Token)match(input,TEN_TO_TWELVE,FOLLOW_TEN_TO_TWELVE_in_int_0_to_99_no_prefix3605); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TEN_TO_TWELVE.add(TEN_TO_TWELVE277);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 342:31: -> INT[$TEN_TO_TWELVE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TEN_TO_TWELVE277!=null?TEN_TO_TWELVE277.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:343:5: THIRTEEN_TO_TWENTY_THREE
                    {
                    THIRTEEN_TO_TWENTY_THREE278=(Token)match(input,THIRTEEN_TO_TWENTY_THREE,FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_int_0_to_99_no_prefix3628); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEEN_TO_TWENTY_THREE.add(THIRTEEN_TO_TWENTY_THREE278);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 343:31: -> INT[$THIRTEEN_TO_TWENTY_THREE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (THIRTEEN_TO_TWENTY_THREE278!=null?THIRTEEN_TO_TWENTY_THREE278.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:344:5: TWENTY_FOUR_TO_THIRTY_ONE
                    {
                    TWENTY_FOUR_TO_THIRTY_ONE279=(Token)match(input,TWENTY_FOUR_TO_THIRTY_ONE,FOLLOW_TWENTY_FOUR_TO_THIRTY_ONE_in_int_0_to_99_no_prefix3640); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY_FOUR_TO_THIRTY_ONE.add(TWENTY_FOUR_TO_THIRTY_ONE279);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 344:31: -> INT[$TWENTY_FOUR_TO_THIRTY_ONE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TWENTY_FOUR_TO_THIRTY_ONE279!=null?TWENTY_FOUR_TO_THIRTY_ONE279.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:345:5: THIRTY_TWO_TO_FIFTY_NINE
                    {
                    THIRTY_TWO_TO_FIFTY_NINE280=(Token)match(input,THIRTY_TWO_TO_FIFTY_NINE,FOLLOW_THIRTY_TWO_TO_FIFTY_NINE_in_int_0_to_99_no_prefix3651); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY_TWO_TO_FIFTY_NINE.add(THIRTY_TWO_TO_FIFTY_NINE280);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 345:31: -> INT[$THIRTY_TWO_TO_FIFTY_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (THIRTY_TWO_TO_FIFTY_NINE280!=null?THIRTY_TWO_TO_FIFTY_NINE280.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:346:5: SIXTY_TO_NINETY_NINE
                    {
                    SIXTY_TO_NINETY_NINE281=(Token)match(input,SIXTY_TO_NINETY_NINE,FOLLOW_SIXTY_TO_NINETY_NINE_in_int_0_to_99_no_prefix3663); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTY_TO_NINETY_NINE.add(SIXTY_TO_NINETY_NINE281);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 346:31: -> INT[$SIXTY_TO_NINETY_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (SIXTY_TO_NINETY_NINE281!=null?SIXTY_TO_NINETY_NINE281.getText():null)));

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:349:1: int_0_to_99_with_prefix : ( TWO_ZEROS -> INT[$TWO_ZEROS.text] | PREFIXED_ONE_TO_NINE -> INT[$PREFIXED_ONE_TO_NINE.text] | TEN_TO_TWELVE -> INT[$TEN_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INT[$THIRTEEN_TO_TWENTY_THREE.text] | TWENTY_FOUR_TO_THIRTY_ONE -> INT[$TWENTY_FOUR_TO_THIRTY_ONE.text] | THIRTY_TWO_TO_FIFTY_NINE -> INT[$THIRTY_TWO_TO_FIFTY_NINE.text] | SIXTY_TO_NINETY_NINE -> INT[$SIXTY_TO_NINETY_NINE.text] );
    public final DateParser.int_0_to_99_with_prefix_return int_0_to_99_with_prefix() throws RecognitionException {
        DateParser.int_0_to_99_with_prefix_return retval = new DateParser.int_0_to_99_with_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TWO_ZEROS282=null;
        Token PREFIXED_ONE_TO_NINE283=null;
        Token TEN_TO_TWELVE284=null;
        Token THIRTEEN_TO_TWENTY_THREE285=null;
        Token TWENTY_FOUR_TO_THIRTY_ONE286=null;
        Token THIRTY_TWO_TO_FIFTY_NINE287=null;
        Token SIXTY_TO_NINETY_NINE288=null;

        Object TWO_ZEROS282_tree=null;
        Object PREFIXED_ONE_TO_NINE283_tree=null;
        Object TEN_TO_TWELVE284_tree=null;
        Object THIRTEEN_TO_TWENTY_THREE285_tree=null;
        Object TWENTY_FOUR_TO_THIRTY_ONE286_tree=null;
        Object THIRTY_TWO_TO_FIFTY_NINE287_tree=null;
        Object SIXTY_TO_NINETY_NINE288_tree=null;
        RewriteRuleTokenStream stream_SIXTY_TO_NINETY_NINE=new RewriteRuleTokenStream(adaptor,"token SIXTY_TO_NINETY_NINE");
        RewriteRuleTokenStream stream_TWO_ZEROS=new RewriteRuleTokenStream(adaptor,"token TWO_ZEROS");
        RewriteRuleTokenStream stream_THIRTEEN_TO_TWENTY_THREE=new RewriteRuleTokenStream(adaptor,"token THIRTEEN_TO_TWENTY_THREE");
        RewriteRuleTokenStream stream_THIRTY_TWO_TO_FIFTY_NINE=new RewriteRuleTokenStream(adaptor,"token THIRTY_TWO_TO_FIFTY_NINE");
        RewriteRuleTokenStream stream_TEN_TO_TWELVE=new RewriteRuleTokenStream(adaptor,"token TEN_TO_TWELVE");
        RewriteRuleTokenStream stream_PREFIXED_ONE_TO_NINE=new RewriteRuleTokenStream(adaptor,"token PREFIXED_ONE_TO_NINE");
        RewriteRuleTokenStream stream_TWENTY_FOUR_TO_THIRTY_ONE=new RewriteRuleTokenStream(adaptor,"token TWENTY_FOUR_TO_THIRTY_ONE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:350:3: ( TWO_ZEROS -> INT[$TWO_ZEROS.text] | PREFIXED_ONE_TO_NINE -> INT[$PREFIXED_ONE_TO_NINE.text] | TEN_TO_TWELVE -> INT[$TEN_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INT[$THIRTEEN_TO_TWENTY_THREE.text] | TWENTY_FOUR_TO_THIRTY_ONE -> INT[$TWENTY_FOUR_TO_THIRTY_ONE.text] | THIRTY_TWO_TO_FIFTY_NINE -> INT[$THIRTY_TWO_TO_FIFTY_NINE.text] | SIXTY_TO_NINETY_NINE -> INT[$SIXTY_TO_NINETY_NINE.text] )
            int alt91=7;
            switch ( input.LA(1) ) {
            case TWO_ZEROS:
                {
                alt91=1;
                }
                break;
            case PREFIXED_ONE_TO_NINE:
                {
                alt91=2;
                }
                break;
            case TEN_TO_TWELVE:
                {
                alt91=3;
                }
                break;
            case THIRTEEN_TO_TWENTY_THREE:
                {
                alt91=4;
                }
                break;
            case TWENTY_FOUR_TO_THIRTY_ONE:
                {
                alt91=5;
                }
                break;
            case THIRTY_TWO_TO_FIFTY_NINE:
                {
                alt91=6;
                }
                break;
            case SIXTY_TO_NINETY_NINE:
                {
                alt91=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:350:5: TWO_ZEROS
                    {
                    TWO_ZEROS282=(Token)match(input,TWO_ZEROS,FOLLOW_TWO_ZEROS_in_int_0_to_99_with_prefix3688); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO_ZEROS.add(TWO_ZEROS282);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 350:31: -> INT[$TWO_ZEROS.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TWO_ZEROS282!=null?TWO_ZEROS282.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:351:5: PREFIXED_ONE_TO_NINE
                    {
                    PREFIXED_ONE_TO_NINE283=(Token)match(input,PREFIXED_ONE_TO_NINE,FOLLOW_PREFIXED_ONE_TO_NINE_in_int_0_to_99_with_prefix3715); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PREFIXED_ONE_TO_NINE.add(PREFIXED_ONE_TO_NINE283);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 351:31: -> INT[$PREFIXED_ONE_TO_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (PREFIXED_ONE_TO_NINE283!=null?PREFIXED_ONE_TO_NINE283.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:352:5: TEN_TO_TWELVE
                    {
                    TEN_TO_TWELVE284=(Token)match(input,TEN_TO_TWELVE,FOLLOW_TEN_TO_TWELVE_in_int_0_to_99_with_prefix3731); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TEN_TO_TWELVE.add(TEN_TO_TWELVE284);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 352:31: -> INT[$TEN_TO_TWELVE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TEN_TO_TWELVE284!=null?TEN_TO_TWELVE284.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:353:5: THIRTEEN_TO_TWENTY_THREE
                    {
                    THIRTEEN_TO_TWENTY_THREE285=(Token)match(input,THIRTEEN_TO_TWENTY_THREE,FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_int_0_to_99_with_prefix3754); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEEN_TO_TWENTY_THREE.add(THIRTEEN_TO_TWENTY_THREE285);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 353:31: -> INT[$THIRTEEN_TO_TWENTY_THREE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (THIRTEEN_TO_TWENTY_THREE285!=null?THIRTEEN_TO_TWENTY_THREE285.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:354:5: TWENTY_FOUR_TO_THIRTY_ONE
                    {
                    TWENTY_FOUR_TO_THIRTY_ONE286=(Token)match(input,TWENTY_FOUR_TO_THIRTY_ONE,FOLLOW_TWENTY_FOUR_TO_THIRTY_ONE_in_int_0_to_99_with_prefix3766); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY_FOUR_TO_THIRTY_ONE.add(TWENTY_FOUR_TO_THIRTY_ONE286);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 354:31: -> INT[$TWENTY_FOUR_TO_THIRTY_ONE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TWENTY_FOUR_TO_THIRTY_ONE286!=null?TWENTY_FOUR_TO_THIRTY_ONE286.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:355:5: THIRTY_TWO_TO_FIFTY_NINE
                    {
                    THIRTY_TWO_TO_FIFTY_NINE287=(Token)match(input,THIRTY_TWO_TO_FIFTY_NINE,FOLLOW_THIRTY_TWO_TO_FIFTY_NINE_in_int_0_to_99_with_prefix3777); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY_TWO_TO_FIFTY_NINE.add(THIRTY_TWO_TO_FIFTY_NINE287);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 355:31: -> INT[$THIRTY_TWO_TO_FIFTY_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (THIRTY_TWO_TO_FIFTY_NINE287!=null?THIRTY_TWO_TO_FIFTY_NINE287.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:356:5: SIXTY_TO_NINETY_NINE
                    {
                    SIXTY_TO_NINETY_NINE288=(Token)match(input,SIXTY_TO_NINETY_NINE,FOLLOW_SIXTY_TO_NINETY_NINE_in_int_0_to_99_with_prefix3789); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTY_TO_NINETY_NINE.add(SIXTY_TO_NINETY_NINE288);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 356:31: -> INT[$SIXTY_TO_NINETY_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (SIXTY_TO_NINETY_NINE288!=null?SIXTY_TO_NINETY_NINE288.getText():null)));

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:360:1: int_1_to_31 : ( PREFIXED_ONE_TO_NINE -> INT[$PREFIXED_ONE_TO_NINE.text] | ONE_TO_NINE -> INT[$ONE_TO_NINE.text] | int_10_to_31 );
    public final DateParser.int_1_to_31_return int_1_to_31() throws RecognitionException {
        DateParser.int_1_to_31_return retval = new DateParser.int_1_to_31_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PREFIXED_ONE_TO_NINE289=null;
        Token ONE_TO_NINE290=null;
        DateParser.int_10_to_31_return int_10_to_31291 = null;


        Object PREFIXED_ONE_TO_NINE289_tree=null;
        Object ONE_TO_NINE290_tree=null;
        RewriteRuleTokenStream stream_ONE_TO_NINE=new RewriteRuleTokenStream(adaptor,"token ONE_TO_NINE");
        RewriteRuleTokenStream stream_PREFIXED_ONE_TO_NINE=new RewriteRuleTokenStream(adaptor,"token PREFIXED_ONE_TO_NINE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:361:3: ( PREFIXED_ONE_TO_NINE -> INT[$PREFIXED_ONE_TO_NINE.text] | ONE_TO_NINE -> INT[$ONE_TO_NINE.text] | int_10_to_31 )
            int alt92=3;
            switch ( input.LA(1) ) {
            case PREFIXED_ONE_TO_NINE:
                {
                alt92=1;
                }
                break;
            case ONE_TO_NINE:
                {
                alt92=2;
                }
                break;
            case TEN_TO_TWELVE:
            case THIRTEEN_TO_TWENTY_THREE:
            case TWENTY_FOUR_TO_THIRTY_ONE:
                {
                alt92=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:361:5: PREFIXED_ONE_TO_NINE
                    {
                    PREFIXED_ONE_TO_NINE289=(Token)match(input,PREFIXED_ONE_TO_NINE,FOLLOW_PREFIXED_ONE_TO_NINE_in_int_1_to_313813); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PREFIXED_ONE_TO_NINE.add(PREFIXED_ONE_TO_NINE289);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 361:31: -> INT[$PREFIXED_ONE_TO_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (PREFIXED_ONE_TO_NINE289!=null?PREFIXED_ONE_TO_NINE289.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:362:5: ONE_TO_NINE
                    {
                    ONE_TO_NINE290=(Token)match(input,ONE_TO_NINE,FOLLOW_ONE_TO_NINE_in_int_1_to_313829); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE_TO_NINE.add(ONE_TO_NINE290);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 362:31: -> INT[$ONE_TO_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (ONE_TO_NINE290!=null?ONE_TO_NINE290.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:363:5: int_10_to_31
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_int_10_to_31_in_int_1_to_313854);
                    int_10_to_31291=int_10_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, int_10_to_31291.getTree());

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:366:1: int_1_to_31_no_prefix : ( ONE_TO_NINE -> INT[$ONE_TO_NINE.text] | int_10_to_31 );
    public final DateParser.int_1_to_31_no_prefix_return int_1_to_31_no_prefix() throws RecognitionException {
        DateParser.int_1_to_31_no_prefix_return retval = new DateParser.int_1_to_31_no_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ONE_TO_NINE292=null;
        DateParser.int_10_to_31_return int_10_to_31293 = null;


        Object ONE_TO_NINE292_tree=null;
        RewriteRuleTokenStream stream_ONE_TO_NINE=new RewriteRuleTokenStream(adaptor,"token ONE_TO_NINE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:367:3: ( ONE_TO_NINE -> INT[$ONE_TO_NINE.text] | int_10_to_31 )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==ONE_TO_NINE) ) {
                alt93=1;
            }
            else if ( (LA93_0==TEN_TO_TWELVE||(LA93_0>=THIRTEEN_TO_TWENTY_THREE && LA93_0<=TWENTY_FOUR_TO_THIRTY_ONE)) ) {
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:367:5: ONE_TO_NINE
                    {
                    ONE_TO_NINE292=(Token)match(input,ONE_TO_NINE,FOLLOW_ONE_TO_NINE_in_int_1_to_31_no_prefix3869); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE_TO_NINE.add(ONE_TO_NINE292);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 367:17: -> INT[$ONE_TO_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (ONE_TO_NINE292!=null?ONE_TO_NINE292.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:368:5: int_10_to_31
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_int_10_to_31_in_int_1_to_31_no_prefix3880);
                    int_10_to_31293=int_10_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, int_10_to_31293.getTree());

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:371:1: int_10_to_31 : ( TEN_TO_TWELVE -> INT[$TEN_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INT[$THIRTEEN_TO_TWENTY_THREE.text] | TWENTY_FOUR_TO_THIRTY_ONE -> INT[$TWENTY_FOUR_TO_THIRTY_ONE.text] );
    public final DateParser.int_10_to_31_return int_10_to_31() throws RecognitionException {
        DateParser.int_10_to_31_return retval = new DateParser.int_10_to_31_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TEN_TO_TWELVE294=null;
        Token THIRTEEN_TO_TWENTY_THREE295=null;
        Token TWENTY_FOUR_TO_THIRTY_ONE296=null;

        Object TEN_TO_TWELVE294_tree=null;
        Object THIRTEEN_TO_TWENTY_THREE295_tree=null;
        Object TWENTY_FOUR_TO_THIRTY_ONE296_tree=null;
        RewriteRuleTokenStream stream_THIRTEEN_TO_TWENTY_THREE=new RewriteRuleTokenStream(adaptor,"token THIRTEEN_TO_TWENTY_THREE");
        RewriteRuleTokenStream stream_TEN_TO_TWELVE=new RewriteRuleTokenStream(adaptor,"token TEN_TO_TWELVE");
        RewriteRuleTokenStream stream_TWENTY_FOUR_TO_THIRTY_ONE=new RewriteRuleTokenStream(adaptor,"token TWENTY_FOUR_TO_THIRTY_ONE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:372:3: ( TEN_TO_TWELVE -> INT[$TEN_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INT[$THIRTEEN_TO_TWENTY_THREE.text] | TWENTY_FOUR_TO_THIRTY_ONE -> INT[$TWENTY_FOUR_TO_THIRTY_ONE.text] )
            int alt94=3;
            switch ( input.LA(1) ) {
            case TEN_TO_TWELVE:
                {
                alt94=1;
                }
                break;
            case THIRTEEN_TO_TWENTY_THREE:
                {
                alt94=2;
                }
                break;
            case TWENTY_FOUR_TO_THIRTY_ONE:
                {
                alt94=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }

            switch (alt94) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:372:5: TEN_TO_TWELVE
                    {
                    TEN_TO_TWELVE294=(Token)match(input,TEN_TO_TWELVE,FOLLOW_TEN_TO_TWELVE_in_int_10_to_313895); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TEN_TO_TWELVE.add(TEN_TO_TWELVE294);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 372:31: -> INT[$TEN_TO_TWELVE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TEN_TO_TWELVE294!=null?TEN_TO_TWELVE294.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:373:5: THIRTEEN_TO_TWENTY_THREE
                    {
                    THIRTEEN_TO_TWENTY_THREE295=(Token)match(input,THIRTEEN_TO_TWENTY_THREE,FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_int_10_to_313918); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEEN_TO_TWENTY_THREE.add(THIRTEEN_TO_TWENTY_THREE295);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 373:31: -> INT[$THIRTEEN_TO_TWENTY_THREE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (THIRTEEN_TO_TWENTY_THREE295!=null?THIRTEEN_TO_TWENTY_THREE295.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:374:5: TWENTY_FOUR_TO_THIRTY_ONE
                    {
                    TWENTY_FOUR_TO_THIRTY_ONE296=(Token)match(input,TWENTY_FOUR_TO_THIRTY_ONE,FOLLOW_TWENTY_FOUR_TO_THIRTY_ONE_in_int_10_to_313930); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY_FOUR_TO_THIRTY_ONE.add(TWENTY_FOUR_TO_THIRTY_ONE296);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 374:31: -> INT[$TWENTY_FOUR_TO_THIRTY_ONE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TWENTY_FOUR_TO_THIRTY_ONE296!=null?TWENTY_FOUR_TO_THIRTY_ONE296.getText():null)));

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
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:5: ( relative_date ( date_time_sep )? time )
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:6: relative_date ( date_time_sep )? time
        {
        pushFollow(FOLLOW_relative_date_in_synpred1_Date136);
        relative_date();

        state._fsp--;
        if (state.failed) return ;
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:20: ( date_time_sep )?
        int alt95=2;
        int LA95_0 = input.LA(1);

        if ( ((LA95_0>=AT && LA95_0<=COMMA)) ) {
            alt95=1;
        }
        switch (alt95) {
            case 1 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:20: date_time_sep
                {
                pushFollow(FOLLOW_date_time_sep_in_synpred1_Date138);
                date_time_sep();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_time_in_synpred1_Date141);
        time();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_Date

    // $ANTLR start synpred2_Date
    public final void synpred2_Date_fragment() throws RecognitionException {   
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:33:5: ( explicit_day_and_month year ( date_time_sep )? time )
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:33:6: explicit_day_and_month year ( date_time_sep )? time
        {
        pushFollow(FOLLOW_explicit_day_and_month_in_synpred2_Date176);
        explicit_day_and_month();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_year_in_synpred2_Date178);
        year();

        state._fsp--;
        if (state.failed) return ;
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:33:34: ( date_time_sep )?
        int alt96=2;
        int LA96_0 = input.LA(1);

        if ( ((LA96_0>=AT && LA96_0<=COMMA)) ) {
            alt96=1;
        }
        switch (alt96) {
            case 1 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:33:34: date_time_sep
                {
                pushFollow(FOLLOW_date_time_sep_in_synpred2_Date180);
                date_time_sep();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_time_in_synpred2_Date183);
        time();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Date

    // $ANTLR start synpred3_Date
    public final void synpred3_Date_fragment() throws RecognitionException {   
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:37:5: ( date_prefix explicit_day_and_month ( year )? ( date_time_sep )? time )
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:37:5: date_prefix explicit_day_and_month ( year )? ( date_time_sep )? time
        {
        pushFollow(FOLLOW_date_prefix_in_synpred3_Date232);
        date_prefix();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_explicit_day_and_month_in_synpred3_Date234);
        explicit_day_and_month();

        state._fsp--;
        if (state.failed) return ;
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:37:40: ( year )?
        int alt97=2;
        switch ( input.LA(1) ) {
            case COMMA:
                {
                switch ( input.LA(2) ) {
                    case TWO_ZEROS:
                        {
                        int LA97_3 = input.LA(3);

                        if ( ((LA97_3>=AT && LA97_3<=COMMA)||(LA97_3>=MIDNIGHT && LA97_3<=NOON)||(LA97_3>=TWO_ZEROS && LA97_3<=THIRTEEN_TO_TWENTY_THREE)) ) {
                            alt97=1;
                        }
                        }
                        break;
                    case PREFIXED_ONE_TO_NINE:
                        {
                        int LA97_4 = input.LA(3);

                        if ( ((LA97_4>=AT && LA97_4<=COMMA)||(LA97_4>=MIDNIGHT && LA97_4<=NOON)||(LA97_4>=TWO_ZEROS && LA97_4<=THIRTEEN_TO_TWENTY_THREE)) ) {
                            alt97=1;
                        }
                        }
                        break;
                    case TEN_TO_TWELVE:
                        {
                        int LA97_5 = input.LA(3);

                        if ( ((LA97_5>=AT && LA97_5<=COMMA)||(LA97_5>=MIDNIGHT && LA97_5<=NOON)||(LA97_5>=TWO_ZEROS && LA97_5<=THIRTEEN_TO_TWENTY_THREE)) ) {
                            alt97=1;
                        }
                        }
                        break;
                    case THIRTEEN_TO_TWENTY_THREE:
                        {
                        int LA97_6 = input.LA(3);

                        if ( ((LA97_6>=AT && LA97_6<=COMMA)||(LA97_6>=MIDNIGHT && LA97_6<=NOON)||(LA97_6>=TWO_ZEROS && LA97_6<=THIRTEEN_TO_TWENTY_THREE)) ) {
                            alt97=1;
                        }
                        }
                        break;
                    case IN:
                    case THREE_DIGIT:
                    case FOUR_DIGIT:
                    case TWENTY_FOUR_TO_THIRTY_ONE:
                    case THIRTY_TWO_TO_FIFTY_NINE:
                    case SIXTY_TO_NINETY_NINE:
                    case 133:
                        {
                        alt97=1;
                        }
                        break;
                }

                }
                break;
            case IN:
            case THREE_DIGIT:
            case FOUR_DIGIT:
            case TWENTY_FOUR_TO_THIRTY_ONE:
            case THIRTY_TWO_TO_FIFTY_NINE:
            case SIXTY_TO_NINETY_NINE:
            case 133:
                {
                alt97=1;
                }
                break;
            case TWO_ZEROS:
                {
                int LA97_3 = input.LA(2);

                if ( ((LA97_3>=AT && LA97_3<=COMMA)||(LA97_3>=MIDNIGHT && LA97_3<=NOON)||(LA97_3>=TWO_ZEROS && LA97_3<=THIRTEEN_TO_TWENTY_THREE)) ) {
                    alt97=1;
                }
                }
                break;
            case PREFIXED_ONE_TO_NINE:
                {
                int LA97_4 = input.LA(2);

                if ( ((LA97_4>=AT && LA97_4<=COMMA)||(LA97_4>=MIDNIGHT && LA97_4<=NOON)||(LA97_4>=TWO_ZEROS && LA97_4<=THIRTEEN_TO_TWENTY_THREE)) ) {
                    alt97=1;
                }
                }
                break;
            case TEN_TO_TWELVE:
                {
                int LA97_5 = input.LA(2);

                if ( ((LA97_5>=AT && LA97_5<=COMMA)||(LA97_5>=MIDNIGHT && LA97_5<=NOON)||(LA97_5>=TWO_ZEROS && LA97_5<=THIRTEEN_TO_TWENTY_THREE)) ) {
                    alt97=1;
                }
                }
                break;
            case THIRTEEN_TO_TWENTY_THREE:
                {
                int LA97_6 = input.LA(2);

                if ( ((LA97_6>=AT && LA97_6<=COMMA)||(LA97_6>=MIDNIGHT && LA97_6<=NOON)||(LA97_6>=TWO_ZEROS && LA97_6<=THIRTEEN_TO_TWENTY_THREE)) ) {
                    alt97=1;
                }
                }
                break;
        }

        switch (alt97) {
            case 1 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:37:40: year
                {
                pushFollow(FOLLOW_year_in_synpred3_Date236);
                year();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:37:46: ( date_time_sep )?
        int alt98=2;
        int LA98_0 = input.LA(1);

        if ( ((LA98_0>=AT && LA98_0<=COMMA)) ) {
            alt98=1;
        }
        switch (alt98) {
            case 1 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:37:46: date_time_sep
                {
                pushFollow(FOLLOW_date_time_sep_in_synpred3_Date239);
                date_time_sep();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_time_in_synpred3_Date242);
        time();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_Date

    // $ANTLR start synpred4_Date
    public final void synpred4_Date_fragment() throws RecognitionException {   
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:40:5: ( date_prefix explicit_day_and_month ( year )? ( date_time_sep )? )
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:40:5: date_prefix explicit_day_and_month ( year )? ( date_time_sep )?
        {
        pushFollow(FOLLOW_date_prefix_in_synpred4_Date280);
        date_prefix();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_explicit_day_and_month_in_synpred4_Date282);
        explicit_day_and_month();

        state._fsp--;
        if (state.failed) return ;
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:40:40: ( year )?
        int alt99=2;
        int LA99_0 = input.LA(1);

        if ( (LA99_0==COMMA) ) {
            int LA99_1 = input.LA(2);

            if ( (LA99_1==IN||(LA99_1>=THREE_DIGIT && LA99_1<=TEN_TO_TWELVE)||(LA99_1>=THIRTEEN_TO_TWENTY_THREE && LA99_1<=THIRTY_TWO_TO_FIFTY_NINE)||LA99_1==SIXTY_TO_NINETY_NINE||LA99_1==133) ) {
                alt99=1;
            }
        }
        else if ( (LA99_0==IN||(LA99_0>=THREE_DIGIT && LA99_0<=TEN_TO_TWELVE)||(LA99_0>=THIRTEEN_TO_TWENTY_THREE && LA99_0<=THIRTY_TWO_TO_FIFTY_NINE)||LA99_0==SIXTY_TO_NINETY_NINE||LA99_0==133) ) {
            alt99=1;
        }
        switch (alt99) {
            case 1 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:40:40: year
                {
                pushFollow(FOLLOW_year_in_synpred4_Date284);
                year();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:40:46: ( date_time_sep )?
        int alt100=2;
        int LA100_0 = input.LA(1);

        if ( ((LA100_0>=AT && LA100_0<=COMMA)) ) {
            alt100=1;
        }
        switch (alt100) {
            case 1 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:40:46: date_time_sep
                {
                pushFollow(FOLLOW_date_time_sep_in_synpred4_Date287);
                date_time_sep();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred4_Date

    // $ANTLR start synpred5_Date
    public final void synpred5_Date_fragment() throws RecognitionException {   
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:43:5: ( ( date_prefix )? explicit_day_and_month ( date_time_sep )? ( time )? )
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:43:5: ( date_prefix )? explicit_day_and_month ( date_time_sep )? ( time )?
        {
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:43:5: ( date_prefix )?
        int alt101=2;
        alt101 = dfa101.predict(input);
        switch (alt101) {
            case 1 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:43:5: date_prefix
                {
                pushFollow(FOLLOW_date_prefix_in_synpred5_Date326);
                date_prefix();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_explicit_day_and_month_in_synpred5_Date329);
        explicit_day_and_month();

        state._fsp--;
        if (state.failed) return ;
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:43:41: ( date_time_sep )?
        int alt102=2;
        int LA102_0 = input.LA(1);

        if ( ((LA102_0>=AT && LA102_0<=COMMA)) ) {
            alt102=1;
        }
        switch (alt102) {
            case 1 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:43:41: date_time_sep
                {
                pushFollow(FOLLOW_date_time_sep_in_synpred5_Date331);
                date_time_sep();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:43:56: ( time )?
        int alt103=2;
        int LA103_0 = input.LA(1);

        if ( ((LA103_0>=MIDNIGHT && LA103_0<=NOON)||(LA103_0>=TWO_ZEROS && LA103_0<=THIRTEEN_TO_TWENTY_THREE)) ) {
            alt103=1;
        }
        switch (alt103) {
            case 1 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:43:56: time
                {
                pushFollow(FOLLOW_time_in_synpred5_Date334);
                time();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred5_Date

    // $ANTLR start synpred6_Date
    public final void synpred6_Date_fragment() throws RecognitionException {   
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:46:5: ( time ( time_date_sep )? ( date_prefix )? explicit_day_and_month ( year )? )
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:46:5: time ( time_date_sep )? ( date_prefix )? explicit_day_and_month ( year )?
        {
        pushFollow(FOLLOW_time_in_synpred6_Date363);
        time();

        state._fsp--;
        if (state.failed) return ;
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:46:10: ( time_date_sep )?
        int alt104=2;
        int LA104_0 = input.LA(1);

        if ( (LA104_0==ON) ) {
            alt104=1;
        }
        switch (alt104) {
            case 1 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:46:10: time_date_sep
                {
                pushFollow(FOLLOW_time_date_sep_in_synpred6_Date365);
                time_date_sep();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:46:25: ( date_prefix )?
        int alt105=2;
        alt105 = dfa105.predict(input);
        switch (alt105) {
            case 1 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:46:25: date_prefix
                {
                pushFollow(FOLLOW_date_prefix_in_synpred6_Date368);
                date_prefix();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_explicit_day_and_month_in_synpred6_Date371);
        explicit_day_and_month();

        state._fsp--;
        if (state.failed) return ;
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:46:61: ( year )?
        int alt106=2;
        int LA106_0 = input.LA(1);

        if ( (LA106_0==COMMA||LA106_0==IN||(LA106_0>=THREE_DIGIT && LA106_0<=TEN_TO_TWELVE)||(LA106_0>=THIRTEEN_TO_TWENTY_THREE && LA106_0<=THIRTY_TWO_TO_FIFTY_NINE)||LA106_0==SIXTY_TO_NINETY_NINE||LA106_0==133) ) {
            alt106=1;
        }
        switch (alt106) {
            case 1 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:46:61: year
                {
                pushFollow(FOLLOW_year_in_synpred6_Date373);
                year();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred6_Date

    // $ANTLR start synpred7_Date
    public final void synpred7_Date_fragment() throws RecognitionException {   
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:49:5: ( ( date_prefix )? relative_date ( date_time_sep )? ( time )? )
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:49:5: ( date_prefix )? relative_date ( date_time_sep )? ( time )?
        {
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:49:5: ( date_prefix )?
        int alt107=2;
        alt107 = dfa107.predict(input);
        switch (alt107) {
            case 1 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:49:5: date_prefix
                {
                pushFollow(FOLLOW_date_prefix_in_synpred7_Date406);
                date_prefix();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_relative_date_in_synpred7_Date409);
        relative_date();

        state._fsp--;
        if (state.failed) return ;
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:49:32: ( date_time_sep )?
        int alt108=2;
        int LA108_0 = input.LA(1);

        if ( ((LA108_0>=AT && LA108_0<=COMMA)) ) {
            alt108=1;
        }
        switch (alt108) {
            case 1 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:49:32: date_time_sep
                {
                pushFollow(FOLLOW_date_time_sep_in_synpred7_Date411);
                date_time_sep();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:49:47: ( time )?
        int alt109=2;
        int LA109_0 = input.LA(1);

        if ( ((LA109_0>=MIDNIGHT && LA109_0<=NOON)||(LA109_0>=TWO_ZEROS && LA109_0<=THIRTEEN_TO_TWENTY_THREE)) ) {
            alt109=1;
        }
        switch (alt109) {
            case 1 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:49:47: time
                {
                pushFollow(FOLLOW_time_in_synpred7_Date414);
                time();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred7_Date

    // $ANTLR start synpred8_Date
    public final void synpred8_Date_fragment() throws RecognitionException {   
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:52:5: ( time ( time_date_sep )? ( date_prefix )? relative_date )
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:52:5: time ( time_date_sep )? ( date_prefix )? relative_date
        {
        pushFollow(FOLLOW_time_in_synpred8_Date439);
        time();

        state._fsp--;
        if (state.failed) return ;
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:52:10: ( time_date_sep )?
        int alt110=2;
        int LA110_0 = input.LA(1);

        if ( (LA110_0==ON) ) {
            alt110=1;
        }
        switch (alt110) {
            case 1 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:52:10: time_date_sep
                {
                pushFollow(FOLLOW_time_date_sep_in_synpred8_Date441);
                time_date_sep();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:52:25: ( date_prefix )?
        int alt111=2;
        alt111 = dfa111.predict(input);
        switch (alt111) {
            case 1 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:52:25: date_prefix
                {
                pushFollow(FOLLOW_date_prefix_in_synpred8_Date444);
                date_prefix();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_relative_date_in_synpred8_Date447);
        relative_date();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_Date

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
    public final boolean synpred7_Date() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_Date_fragment(); // can never throw exception
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
    public final boolean synpred8_Date() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_Date_fragment(); // can never throw exception
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


    protected DFA18 dfa18 = new DFA18(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA84 dfa84 = new DFA84(this);
    protected DFA101 dfa101 = new DFA101(this);
    protected DFA105 dfa105 = new DFA105(this);
    protected DFA107 dfa107 = new DFA107(this);
    protected DFA111 dfa111 = new DFA111(this);
    static final String DFA18_eotS =
        "\150\uffff";
    static final String DFA18_eofS =
        "\150\uffff";
    static final String DFA18_minS =
        "\1\26\136\0\11\uffff";
    static final String DFA18_maxS =
        "\1\176\136\0\11\uffff";
    static final String DFA18_acceptS =
        "\137\uffff\1\1\1\7\1\3\1\4\1\5\1\2\1\6\1\10\1\11";
    static final String DFA18_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
        "\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63"+
        "\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100"+
        "\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113"+
        "\1\114\1\115\1\116\1\117\1\120\1\121\1\122\1\123\1\124\1\125\1\126"+
        "\1\127\1\130\1\131\1\132\1\133\1\134\1\135\11\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\1\1\2\1\3\1\133\1\13\3\uffff\1\135\1\136\1\33\1\34\1\35\1"+
            "\36\1\37\1\40\1\41\2\uffff\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
            "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\4\1\5\1\6\1\7\1\10"+
            "\1\11\1\12\4\uffff\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1"+
            "\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1"+
            "\66\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105"+
            "\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\115\1\116\1\117"+
            "\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131"+
            "\1\132\2\uffff\1\134\1\67\1\71\1\70\1\72\1\73",
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
            "",
            "",
            "",
            "",
            "",
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
            return "28:1: datetime options {backtrack=true; } : ( ( relative_date ( date_time_sep )? time )=> relative_date ( date_time_sep )? time -> ^( DATE_TIME relative_date time ) | ( explicit_day_and_month year ( date_time_sep )? time )=> explicit_day_and_month year ( date_time_sep )? time -> ^( DATE_TIME ^( EXPLICIT_DATE explicit_day_and_month year ) time ) | date_prefix explicit_day_and_month ( year )? ( date_time_sep )? time -> ^( DATE_TIME ^( RELATIVE_DATE date_prefix ^( EXPLICIT_DATE explicit_day_and_month ( year )? ) ) time ) | date_prefix explicit_day_and_month ( year )? ( date_time_sep )? -> ^( DATE_TIME ^( RELATIVE_DATE date_prefix ^( EXPLICIT_DATE explicit_day_and_month ( year )? ) ) ) | ( date_prefix )? explicit_day_and_month ( date_time_sep )? ( time )? -> ^( DATE_TIME ^( EXPLICIT_DATE explicit_day_and_month ) ( time )? ) | time ( time_date_sep )? ( date_prefix )? explicit_day_and_month ( year )? -> ^( DATE_TIME ^( EXPLICIT_DATE explicit_day_and_month year ) ( time )? ) | ( date_prefix )? relative_date ( date_time_sep )? ( time )? -> ^( DATE_TIME relative_date time ) | time ( time_date_sep )? ( date_prefix )? relative_date -> ^( DATE_TIME relative_date time ) | time -> ^( DATE_TIME time ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_1 = input.LA(1);

                         
                        int index18_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_2 = input.LA(1);

                         
                        int index18_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_3 = input.LA(1);

                         
                        int index18_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA18_4 = input.LA(1);

                         
                        int index18_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA18_5 = input.LA(1);

                         
                        int index18_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA18_6 = input.LA(1);

                         
                        int index18_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA18_7 = input.LA(1);

                         
                        int index18_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA18_8 = input.LA(1);

                         
                        int index18_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA18_9 = input.LA(1);

                         
                        int index18_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA18_10 = input.LA(1);

                         
                        int index18_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA18_11 = input.LA(1);

                         
                        int index18_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred3_Date()) ) {s = 97;}

                        else if ( (synpred4_Date()) ) {s = 98;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA18_12 = input.LA(1);

                         
                        int index18_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA18_13 = input.LA(1);

                         
                        int index18_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA18_14 = input.LA(1);

                         
                        int index18_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA18_15 = input.LA(1);

                         
                        int index18_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA18_16 = input.LA(1);

                         
                        int index18_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA18_17 = input.LA(1);

                         
                        int index18_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA18_18 = input.LA(1);

                         
                        int index18_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA18_19 = input.LA(1);

                         
                        int index18_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA18_20 = input.LA(1);

                         
                        int index18_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA18_21 = input.LA(1);

                         
                        int index18_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA18_22 = input.LA(1);

                         
                        int index18_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA18_23 = input.LA(1);

                         
                        int index18_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA18_24 = input.LA(1);

                         
                        int index18_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA18_25 = input.LA(1);

                         
                        int index18_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA18_26 = input.LA(1);

                         
                        int index18_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA18_27 = input.LA(1);

                         
                        int index18_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA18_28 = input.LA(1);

                         
                        int index18_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA18_29 = input.LA(1);

                         
                        int index18_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA18_30 = input.LA(1);

                         
                        int index18_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_30);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA18_31 = input.LA(1);

                         
                        int index18_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_31);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA18_32 = input.LA(1);

                         
                        int index18_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_32);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA18_33 = input.LA(1);

                         
                        int index18_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_33);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA18_34 = input.LA(1);

                         
                        int index18_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred3_Date()) ) {s = 97;}

                        else if ( (synpred4_Date()) ) {s = 98;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_34);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA18_35 = input.LA(1);

                         
                        int index18_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred3_Date()) ) {s = 97;}

                        else if ( (synpred4_Date()) ) {s = 98;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_35);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA18_36 = input.LA(1);

                         
                        int index18_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred3_Date()) ) {s = 97;}

                        else if ( (synpred4_Date()) ) {s = 98;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_36);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA18_37 = input.LA(1);

                         
                        int index18_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred3_Date()) ) {s = 97;}

                        else if ( (synpred4_Date()) ) {s = 98;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_37);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA18_38 = input.LA(1);

                         
                        int index18_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred3_Date()) ) {s = 97;}

                        else if ( (synpred4_Date()) ) {s = 98;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_38);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA18_39 = input.LA(1);

                         
                        int index18_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred3_Date()) ) {s = 97;}

                        else if ( (synpred4_Date()) ) {s = 98;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_39);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA18_40 = input.LA(1);

                         
                        int index18_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred3_Date()) ) {s = 97;}

                        else if ( (synpred4_Date()) ) {s = 98;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_40);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA18_41 = input.LA(1);

                         
                        int index18_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred3_Date()) ) {s = 97;}

                        else if ( (synpred4_Date()) ) {s = 98;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_41);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA18_42 = input.LA(1);

                         
                        int index18_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred3_Date()) ) {s = 97;}

                        else if ( (synpred4_Date()) ) {s = 98;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_42);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA18_43 = input.LA(1);

                         
                        int index18_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred3_Date()) ) {s = 97;}

                        else if ( (synpred4_Date()) ) {s = 98;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_43);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA18_44 = input.LA(1);

                         
                        int index18_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred3_Date()) ) {s = 97;}

                        else if ( (synpred4_Date()) ) {s = 98;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_44);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA18_45 = input.LA(1);

                         
                        int index18_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred3_Date()) ) {s = 97;}

                        else if ( (synpred4_Date()) ) {s = 98;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_45);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA18_46 = input.LA(1);

                         
                        int index18_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred3_Date()) ) {s = 97;}

                        else if ( (synpred4_Date()) ) {s = 98;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_46);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA18_47 = input.LA(1);

                         
                        int index18_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred3_Date()) ) {s = 97;}

                        else if ( (synpred4_Date()) ) {s = 98;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_47);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA18_48 = input.LA(1);

                         
                        int index18_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred3_Date()) ) {s = 97;}

                        else if ( (synpred4_Date()) ) {s = 98;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_48);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA18_49 = input.LA(1);

                         
                        int index18_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred3_Date()) ) {s = 97;}

                        else if ( (synpred4_Date()) ) {s = 98;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_49);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA18_50 = input.LA(1);

                         
                        int index18_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred3_Date()) ) {s = 97;}

                        else if ( (synpred4_Date()) ) {s = 98;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_50);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA18_51 = input.LA(1);

                         
                        int index18_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred3_Date()) ) {s = 97;}

                        else if ( (synpred4_Date()) ) {s = 98;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_51);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA18_52 = input.LA(1);

                         
                        int index18_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred3_Date()) ) {s = 97;}

                        else if ( (synpred4_Date()) ) {s = 98;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_52);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA18_53 = input.LA(1);

                         
                        int index18_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred3_Date()) ) {s = 97;}

                        else if ( (synpred4_Date()) ) {s = 98;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_53);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA18_54 = input.LA(1);

                         
                        int index18_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred3_Date()) ) {s = 97;}

                        else if ( (synpred4_Date()) ) {s = 98;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_54);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA18_55 = input.LA(1);

                         
                        int index18_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred3_Date()) ) {s = 97;}

                        else if ( (synpred4_Date()) ) {s = 98;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                        else if ( (synpred6_Date()) ) {s = 101;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                        else if ( (synpred8_Date()) ) {s = 102;}

                        else if ( (true) ) {s = 103;}

                         
                        input.seek(index18_55);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA18_56 = input.LA(1);

                         
                        int index18_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred3_Date()) ) {s = 97;}

                        else if ( (synpred4_Date()) ) {s = 98;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                        else if ( (synpred6_Date()) ) {s = 101;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                        else if ( (synpred8_Date()) ) {s = 102;}

                        else if ( (true) ) {s = 103;}

                         
                        input.seek(index18_56);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA18_57 = input.LA(1);

                         
                        int index18_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred3_Date()) ) {s = 97;}

                        else if ( (synpred4_Date()) ) {s = 98;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                        else if ( (synpred6_Date()) ) {s = 101;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                        else if ( (synpred8_Date()) ) {s = 102;}

                        else if ( (true) ) {s = 103;}

                         
                        input.seek(index18_57);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA18_58 = input.LA(1);

                         
                        int index18_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred3_Date()) ) {s = 97;}

                        else if ( (synpred4_Date()) ) {s = 98;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                        else if ( (synpred6_Date()) ) {s = 101;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                        else if ( (synpred8_Date()) ) {s = 102;}

                        else if ( (true) ) {s = 103;}

                         
                        input.seek(index18_58);
                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA18_59 = input.LA(1);

                         
                        int index18_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 95;}

                        else if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred3_Date()) ) {s = 97;}

                        else if ( (synpred4_Date()) ) {s = 98;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_59);
                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA18_60 = input.LA(1);

                         
                        int index18_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                         
                        input.seek(index18_60);
                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA18_61 = input.LA(1);

                         
                        int index18_61 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                         
                        input.seek(index18_61);
                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA18_62 = input.LA(1);

                         
                        int index18_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                         
                        input.seek(index18_62);
                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA18_63 = input.LA(1);

                         
                        int index18_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                         
                        input.seek(index18_63);
                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA18_64 = input.LA(1);

                         
                        int index18_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                         
                        input.seek(index18_64);
                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA18_65 = input.LA(1);

                         
                        int index18_65 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                         
                        input.seek(index18_65);
                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA18_66 = input.LA(1);

                         
                        int index18_66 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                         
                        input.seek(index18_66);
                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA18_67 = input.LA(1);

                         
                        int index18_67 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                         
                        input.seek(index18_67);
                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA18_68 = input.LA(1);

                         
                        int index18_68 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                         
                        input.seek(index18_68);
                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA18_69 = input.LA(1);

                         
                        int index18_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                         
                        input.seek(index18_69);
                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA18_70 = input.LA(1);

                         
                        int index18_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                         
                        input.seek(index18_70);
                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA18_71 = input.LA(1);

                         
                        int index18_71 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                         
                        input.seek(index18_71);
                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA18_72 = input.LA(1);

                         
                        int index18_72 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                         
                        input.seek(index18_72);
                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA18_73 = input.LA(1);

                         
                        int index18_73 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                         
                        input.seek(index18_73);
                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA18_74 = input.LA(1);

                         
                        int index18_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                         
                        input.seek(index18_74);
                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA18_75 = input.LA(1);

                         
                        int index18_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                         
                        input.seek(index18_75);
                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA18_76 = input.LA(1);

                         
                        int index18_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                         
                        input.seek(index18_76);
                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA18_77 = input.LA(1);

                         
                        int index18_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                         
                        input.seek(index18_77);
                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA18_78 = input.LA(1);

                         
                        int index18_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                         
                        input.seek(index18_78);
                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA18_79 = input.LA(1);

                         
                        int index18_79 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                         
                        input.seek(index18_79);
                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        int LA18_80 = input.LA(1);

                         
                        int index18_80 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                         
                        input.seek(index18_80);
                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        int LA18_81 = input.LA(1);

                         
                        int index18_81 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                         
                        input.seek(index18_81);
                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        int LA18_82 = input.LA(1);

                         
                        int index18_82 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                         
                        input.seek(index18_82);
                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        int LA18_83 = input.LA(1);

                         
                        int index18_83 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                         
                        input.seek(index18_83);
                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        int LA18_84 = input.LA(1);

                         
                        int index18_84 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                         
                        input.seek(index18_84);
                        if ( s>=0 ) return s;
                        break;
                    case 84 : 
                        int LA18_85 = input.LA(1);

                         
                        int index18_85 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                         
                        input.seek(index18_85);
                        if ( s>=0 ) return s;
                        break;
                    case 85 : 
                        int LA18_86 = input.LA(1);

                         
                        int index18_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                         
                        input.seek(index18_86);
                        if ( s>=0 ) return s;
                        break;
                    case 86 : 
                        int LA18_87 = input.LA(1);

                         
                        int index18_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                         
                        input.seek(index18_87);
                        if ( s>=0 ) return s;
                        break;
                    case 87 : 
                        int LA18_88 = input.LA(1);

                         
                        int index18_88 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                         
                        input.seek(index18_88);
                        if ( s>=0 ) return s;
                        break;
                    case 88 : 
                        int LA18_89 = input.LA(1);

                         
                        int index18_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                         
                        input.seek(index18_89);
                        if ( s>=0 ) return s;
                        break;
                    case 89 : 
                        int LA18_90 = input.LA(1);

                         
                        int index18_90 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 100;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                         
                        input.seek(index18_90);
                        if ( s>=0 ) return s;
                        break;
                    case 90 : 
                        int LA18_91 = input.LA(1);

                         
                        int index18_91 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 97;}

                        else if ( (synpred4_Date()) ) {s = 98;}

                        else if ( (synpred5_Date()) ) {s = 99;}

                        else if ( (synpred7_Date()) ) {s = 96;}

                         
                        input.seek(index18_91);
                        if ( s>=0 ) return s;
                        break;
                    case 91 : 
                        int LA18_92 = input.LA(1);

                         
                        int index18_92 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_Date()) ) {s = 101;}

                        else if ( (synpred8_Date()) ) {s = 102;}

                        else if ( (true) ) {s = 103;}

                         
                        input.seek(index18_92);
                        if ( s>=0 ) return s;
                        break;
                    case 92 : 
                        int LA18_93 = input.LA(1);

                         
                        int index18_93 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_Date()) ) {s = 101;}

                        else if ( (synpred8_Date()) ) {s = 102;}

                        else if ( (true) ) {s = 103;}

                         
                        input.seek(index18_93);
                        if ( s>=0 ) return s;
                        break;
                    case 93 : 
                        int LA18_94 = input.LA(1);

                         
                        int index18_94 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_Date()) ) {s = 101;}

                        else if ( (synpred8_Date()) ) {s = 102;}

                        else if ( (true) ) {s = 103;}

                         
                        input.seek(index18_94);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA7_eotS =
        "\51\uffff";
    static final String DFA7_eofS =
        "\51\uffff";
    static final String DFA7_minS =
        "\1\31\1\uffff\32\32\1\uffff\1\103\11\32\1\103\1\32";
    static final String DFA7_maxS =
        "\1\176\1\uffff\32\u0084\1\uffff\1\140\11\u0084\1\130\1\u0084";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\32\uffff\1\2\14\uffff";
    static final String DFA7_specialS =
        "\51\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\1\21\uffff\14\34\13\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1"+
            "\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1"+
            "\25\1\26\37\34\3\uffff\1\27\1\31\1\30\1\32\1\33",
            "",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\7\uffff\1\35\3\uffff\1\41\1\36\1\37\1\42"+
            "\1\45\1\46\1\44\1\43\1\40\14\uffff\11\34\43\uffff\1\34",
            "\1\1\21\uffff\14\34\7\uffff\1\47\3\uffff\1\50\24\uffff\1\34"+
            "\53\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "",
            "\1\41\1\36\1\37\1\42\1\45\1\46\1\44\1\43\1\40\14\uffff\11\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\50\24\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34"
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
            return "43:5: ( date_prefix )?";
        }
    }
    static final String DFA11_eotS =
        "\51\uffff";
    static final String DFA11_eofS =
        "\51\uffff";
    static final String DFA11_minS =
        "\1\31\1\uffff\32\32\1\uffff\1\103\11\32\1\103\1\32";
    static final String DFA11_maxS =
        "\1\176\1\uffff\32\u0084\1\uffff\1\140\11\u0084\1\130\1\u0084";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\32\uffff\1\2\14\uffff";
    static final String DFA11_specialS =
        "\51\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\1\21\uffff\14\34\13\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1"+
            "\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1"+
            "\25\1\26\37\34\3\uffff\1\27\1\31\1\30\1\32\1\33",
            "",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\7\uffff\1\35\3\uffff\1\42\1\46\1\44\1\45"+
            "\1\37\1\36\1\40\1\43\1\41\14\uffff\11\34\43\uffff\1\34",
            "\1\1\21\uffff\14\34\7\uffff\1\47\3\uffff\1\50\24\uffff\1\34"+
            "\53\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "",
            "\1\42\1\46\1\44\1\45\1\37\1\36\1\40\1\43\1\41\14\uffff\11\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\50\24\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34"
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "46:25: ( date_prefix )?";
        }
    }
    static final String DFA13_eotS =
        "\53\uffff";
    static final String DFA13_eofS =
        "\2\uffff\1\35\33\uffff\1\35\14\uffff";
    static final String DFA13_minS =
        "\1\26\1\uffff\1\23\32\32\1\uffff\1\23\1\103\11\32\1\103\1\32";
    static final String DFA13_maxS =
        "\1\176\1\uffff\1\175\23\76\1\113\1\103\5\76\1\uffff\1\175\1\113"+
        "\11\76\1\103\1\76";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\33\uffff\1\2\15\uffff";
    static final String DFA13_specialS =
        "\53\uffff}>";
    static final String[] DFA13_transitionS = {
            "\3\35\1\1\1\2\5\uffff\7\35\2\uffff\26\35\4\uffff\1\3\1\4\1\5"+
            "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1"+
            "\22\1\23\1\24\1\25\1\26\1\27\42\uffff\1\30\1\32\1\31\1\33\1"+
            "\34",
            "",
            "\2\35\6\uffff\2\1\1\uffff\2\35\131\uffff\5\35",
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
            "\1\36\16\uffff\26\35\1\37\3\uffff\1\44\1\50\1\41\1\47\1\42"+
            "\1\45\1\43\1\46\1\40",
            "\1\36\16\uffff\26\35\1\51\3\uffff\1\52",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "",
            "\2\35\6\uffff\2\1\1\uffff\2\35\7\uffff\2\35\120\uffff\5\35",
            "\1\44\1\50\1\41\1\47\1\42\1\45\1\43\1\46\1\40",
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
            return "49:5: ( date_prefix )?";
        }
    }
    static final String DFA17_eotS =
        "\53\uffff";
    static final String DFA17_eofS =
        "\2\uffff\1\35\33\uffff\1\35\14\uffff";
    static final String DFA17_minS =
        "\1\26\1\uffff\1\33\32\32\1\uffff\1\33\1\103\11\32\1\103\1\32";
    static final String DFA17_maxS =
        "\1\176\1\uffff\1\34\23\76\1\113\1\103\5\76\1\uffff\1\50\1\113\11"+
        "\76\1\103\1\76";
    static final String DFA17_acceptS =
        "\1\uffff\1\1\33\uffff\1\2\15\uffff";
    static final String DFA17_specialS =
        "\53\uffff}>";
    static final String[] DFA17_transitionS = {
            "\3\35\1\1\1\2\5\uffff\7\35\2\uffff\26\35\4\uffff\1\3\1\4\1\5"+
            "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1"+
            "\22\1\23\1\24\1\25\1\26\1\27\42\uffff\1\30\1\32\1\31\1\33\1"+
            "\34",
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
            "\1\36\16\uffff\26\35\1\37\3\uffff\1\45\1\43\1\40\1\44\1\41"+
            "\1\42\1\46\1\50\1\47",
            "\1\36\16\uffff\26\35\1\51\3\uffff\1\52",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "",
            "\2\1\12\uffff\2\35",
            "\1\45\1\43\1\40\1\44\1\41\1\42\1\46\1\50\1\47",
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

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "52:25: ( date_prefix )?";
        }
    }
    static final String DFA19_eotS =
        "\102\uffff";
    static final String DFA19_eofS =
        "\36\uffff\27\3\15\uffff";
    static final String DFA19_minS =
        "\1\26\3\uffff\32\32\27\23\1\103\11\32\1\103\1\32\1\uffff";
    static final String DFA19_maxS =
        "\1\176\3\uffff\23\76\1\113\1\103\5\76\27\175\1\113\11\76\1\103\1"+
        "\76\1\uffff";
    static final String DFA19_acceptS =
        "\1\uffff\1\1\1\2\1\3\75\uffff\1\4";
    static final String DFA19_specialS =
        "\102\uffff}>";
    static final String[] DFA19_transitionS = {
            "\3\1\1\uffff\1\2\5\uffff\7\3\2\uffff\26\2\4\uffff\1\4\1\5\1"+
            "\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
            "\1\23\1\24\1\25\1\26\1\27\1\30\42\uffff\1\31\1\33\1\32\1\34"+
            "\1\35",
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
            "\1\44\1\65\3\uffff\1\71\1\75\1\70\1\74\1\73\1\66\1\72\1\76\1"+
            "\67",
            "\1\45\16\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44\1\77\3\uffff\1\100",
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
            "\2\3\11\uffff\2\3\7\uffff\2\101\120\uffff\5\3",
            "\2\3\11\uffff\2\3\7\uffff\2\101\120\uffff\5\3",
            "\2\3\11\uffff\2\3\7\uffff\2\101\120\uffff\5\3",
            "\2\3\11\uffff\2\3\7\uffff\2\101\120\uffff\5\3",
            "\2\3\11\uffff\2\3\7\uffff\2\101\120\uffff\5\3",
            "\2\3\11\uffff\2\3\7\uffff\2\101\120\uffff\5\3",
            "\2\3\11\uffff\2\3\7\uffff\2\101\120\uffff\5\3",
            "\2\3\11\uffff\2\3\7\uffff\2\101\120\uffff\5\3",
            "\2\3\11\uffff\2\3\7\uffff\2\101\120\uffff\5\3",
            "\2\3\11\uffff\2\3\7\uffff\2\101\120\uffff\5\3",
            "\2\3\11\uffff\2\3\7\uffff\2\101\120\uffff\5\3",
            "\2\3\11\uffff\2\3\7\uffff\2\101\120\uffff\5\3",
            "\2\3\11\uffff\2\3\7\uffff\2\101\120\uffff\5\3",
            "\2\3\11\uffff\2\3\7\uffff\2\101\120\uffff\5\3",
            "\2\3\11\uffff\2\3\7\uffff\2\101\120\uffff\5\3",
            "\2\3\11\uffff\2\3\7\uffff\2\101\120\uffff\5\3",
            "\2\3\11\uffff\2\3\7\uffff\2\101\120\uffff\5\3",
            "\2\3\11\uffff\2\3\7\uffff\2\101\120\uffff\5\3",
            "\2\3\11\uffff\2\3\7\uffff\2\101\120\uffff\5\3",
            "\2\3\11\uffff\2\3\7\uffff\2\101\120\uffff\5\3",
            "\2\3\11\uffff\2\3\7\uffff\2\101\120\uffff\5\3",
            "\2\3\11\uffff\2\3\7\uffff\2\101\120\uffff\5\3",
            "\2\3\11\uffff\2\3\7\uffff\2\101\120\uffff\5\3",
            "\1\71\1\75\1\70\1\74\1\73\1\66\1\72\1\76\1\67",
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
            return "68:1: relative_date : ( named_relative_date | modifiable_target -> ^( RELATIVE_DATE SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"] modifiable_target ) | target_prefix modifiable_target -> ^( RELATIVE_DATE target_prefix modifiable_target ) | spelled_or_int_1_to_31 modifiable_target target_suffix -> ^( RELATIVE_DATE target_suffix spelled_or_int_1_to_31 modifiable_target ) );";
        }
    }
    static final String DFA27_eotS =
        "\56\uffff";
    static final String DFA27_eofS =
        "\56\uffff";
    static final String DFA27_minS =
        "\1\31\1\32\1\33\32\32\2\uffff\1\33\1\103\11\32\1\103\1\32\2\uffff";
    static final String DFA27_maxS =
        "\1\176\1\32\1\34\23\32\1\113\1\103\5\32\2\uffff\1\34\1\113\11\32"+
        "\1\103\1\32\2\uffff";
    static final String DFA27_acceptS =
        "\35\uffff\1\1\1\3\15\uffff\1\2\1\4";
    static final String DFA27_specialS =
        "\56\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\1\1\2\50\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
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
            "\1\37\44\uffff\1\40\3\uffff\1\50\1\42\1\47\1\41\1\43\1\51\1"+
            "\44\1\46\1\45",
            "\1\37\44\uffff\1\52\3\uffff\1\53",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "",
            "",
            "\1\54\1\55",
            "\1\50\1\42\1\47\1\41\1\43\1\51\1\44\1\46\1\45",
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

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "113:1: date_prefix : ( ( THE )? DAY AFTER -> SEEK_DIR[\">\"] INT[\"1\"] | spelled_or_int_1_to_31 DAY AFTER -> SEEK_DIR[\">\"] spelled_or_int_1_to_31 | ( THE )? DAY BEFORE -> SEEK_DIR[\"<\"] INT[\"1\"] | spelled_or_int_1_to_31 DAY BEFORE -> SEEK_DIR[\"<\"] spelled_or_int_1_to_31 );";
        }
    }
    static final String DFA62_eotS =
        "\43\uffff";
    static final String DFA62_eofS =
        "\24\uffff\1\36\1\42\15\uffff";
    static final String DFA62_minS =
        "\1\103\23\uffff\2\23\1\103\14\uffff";
    static final String DFA62_maxS =
        "\1\127\23\uffff\2\u0085\1\113\14\uffff";
    static final String DFA62_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\3\uffff\1\32\1\27\1\34\1\31\1"+
        "\33\1\25\1\35\1\24\1\30\1\26\1\37\1\36";
    static final String DFA62_specialS =
        "\43\uffff}>";
    static final String[] DFA62_transitionS = {
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
            "\2\36\5\uffff\1\36\3\uffff\2\36\6\uffff\1\36\2\uffff\26\36"+
            "\1\26\3\uffff\1\34\1\40\1\30\1\37\1\32\1\27\1\33\1\31\1\35\53"+
            "\uffff\11\36\1\uffff\1\36\2\uffff\2\36",
            "\2\42\5\uffff\1\42\3\uffff\2\42\6\uffff\1\42\2\uffff\26\42"+
            "\1\41\3\uffff\1\41\63\uffff\11\42\1\uffff\1\42\2\uffff\2\42",
            "\1\34\1\40\1\30\1\37\1\32\1\27\1\33\1\31\1\35",
            "",
            "",
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

    static final short[] DFA62_eot = DFA.unpackEncodedString(DFA62_eotS);
    static final short[] DFA62_eof = DFA.unpackEncodedString(DFA62_eofS);
    static final char[] DFA62_min = DFA.unpackEncodedStringToUnsignedChars(DFA62_minS);
    static final char[] DFA62_max = DFA.unpackEncodedStringToUnsignedChars(DFA62_maxS);
    static final short[] DFA62_accept = DFA.unpackEncodedString(DFA62_acceptS);
    static final short[] DFA62_special = DFA.unpackEncodedString(DFA62_specialS);
    static final short[][] DFA62_transition;

    static {
        int numStates = DFA62_transitionS.length;
        DFA62_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA62_transition[i] = DFA.unpackEncodedString(DFA62_transitionS[i]);
        }
    }

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = DFA62_eot;
            this.eof = DFA62_eof;
            this.min = DFA62_min;
            this.max = DFA62_max;
            this.accept = DFA62_accept;
            this.special = DFA62_special;
            this.transition = DFA62_transition;
        }
        public String getDescription() {
            return "219:1: spelled_1_to_31 : ( ONE -> INT[\"1\"] | TWO -> INT[\"2\"] | THREE -> INT[\"3\"] | FOUR -> INT[\"4\"] | FIVE -> INT[\"5\"] | SIX -> INT[\"6\"] | SEVEN -> INT[\"7\"] | EIGHT -> INT[\"8\"] | NINE -> INT[\"9\"] | TEN -> INT[\"10\"] | ELEVEN -> INT[\"11\"] | TWELVE -> INT[\"12\"] | THIRTEEN -> INT[\"13\"] | FOURTEEN -> INT[\"14\"] | FIFTEEN -> INT[\"15\"] | SIXTEEN -> INT[\"16\"] | SEVENTEEN -> INT[\"17\"] | EIGHTEEN -> INT[\"18\"] | NINETEEN -> INT[\"19\"] | TWENTY -> INT[\"20\"] | TWENTY ( DASH )? ONE -> INT[\"21\"] | TWENTY ( DASH )? TWO -> INT[\"22\"] | TWENTY ( DASH )? THREE -> INT[\"23\"] | TWENTY ( DASH )? FOUR -> INT[\"24\"] | TWENTY ( DASH )? FIVE -> INT[\"25\"] | TWENTY ( DASH )? SIX -> INT[\"26\"] | TWENTY ( DASH )? SEVEN -> INT[\"27\"] | TWENTY ( DASH )? EIGHT -> INT[\"28\"] | TWENTY ( DASH )? NINE -> INT[\"29\"] | THIRTY -> INT[\"30\"] | THIRTY ( DASH )? ONE -> INT[\"31\"] );";
        }
    }
    static final String DFA84_eotS =
        "\42\uffff";
    static final String DFA84_eofS =
        "\42\uffff";
    static final String DFA84_minS =
        "\1\126\25\uffff\1\77\12\uffff\1\130";
    static final String DFA84_maxS =
        "\1\166\25\uffff\1\140\12\uffff\1\140";
    static final String DFA84_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\uffff\1\26\1\27\1"+
        "\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\uffff";
    static final String DFA84_specialS =
        "\42\uffff}>";
    static final String[] DFA84_transitionS = {
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

    static final short[] DFA84_eot = DFA.unpackEncodedString(DFA84_eotS);
    static final short[] DFA84_eof = DFA.unpackEncodedString(DFA84_eofS);
    static final char[] DFA84_min = DFA.unpackEncodedStringToUnsignedChars(DFA84_minS);
    static final char[] DFA84_max = DFA.unpackEncodedStringToUnsignedChars(DFA84_maxS);
    static final short[] DFA84_accept = DFA.unpackEncodedString(DFA84_acceptS);
    static final short[] DFA84_special = DFA.unpackEncodedString(DFA84_specialS);
    static final short[][] DFA84_transition;

    static {
        int numStates = DFA84_transitionS.length;
        DFA84_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA84_transition[i] = DFA.unpackEncodedString(DFA84_transitionS[i]);
        }
    }

    class DFA84 extends DFA {

        public DFA84(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 84;
            this.eot = DFA84_eot;
            this.eof = DFA84_eof;
            this.min = DFA84_min;
            this.max = DFA84_max;
            this.accept = DFA84_accept;
            this.special = DFA84_special;
            this.transition = DFA84_transition;
        }
        public String getDescription() {
            return "260:1: spelled_sequence_1_to_31 : ( FIRST -> INT[\"1\"] | SECOND -> INT[\"2\"] | THIRD -> INT[\"3\"] | FOURTH -> INT[\"4\"] | FIFTH -> INT[\"5\"] | SIXTH -> INT[\"6\"] | SEVENTH -> INT[\"7\"] | EIGHTH -> INT[\"8\"] | NINTH -> INT[\"9\"] | TENTH -> INT[\"10\"] | ELEVENTH -> INT[\"11\"] | TWELFTH -> INT[\"12\"] | THIRTEENTH -> INT[\"13\"] | FOURTEENTH -> INT[\"14\"] | FIFTEENTH -> INT[\"15\"] | SIXTEENTH -> INT[\"16\"] | SEVENTEENTH -> INT[\"17\"] | EIGHTEENTH -> INT[\"18\"] | NINETEENTH -> INT[\"19\"] | TWENTIETH -> INT[\"20\"] | ( TWENTY_FIRST | ( TWENTY ( DASH )? FIRST ) ) -> INT[\"21\"] | ( TWENTY_SECOND | ( TWENTY ( DASH )? SECOND ) ) -> INT[\"22\"] | ( TWENTY_THIRD | ( TWENTY ( DASH )? THIRD ) ) -> INT[\"23\"] | ( TWENTY_FOURTH | ( TWENTY ( DASH )? FOURTH ) ) -> INT[\"24\"] | ( TWENTY_FIFTH | ( TWENTY ( DASH )? FIFTH ) ) -> INT[\"25\"] | ( TWENTY_SIXTH | ( TWENTY ( DASH )? SIXTH ) ) -> INT[\"26\"] | ( TWENTY_SEVENTH | ( TWENTY ( DASH )? SEVENTH ) ) -> INT[\"27\"] | ( TWENTY_EIGHTH | ( TWENTY ( DASH )? EIGHTH ) ) -> INT[\"28\"] | ( TWENTY_NINTH | ( TWENTY ( DASH )? NINTH ) ) -> INT[\"29\"] | THIRTIETH -> INT[\"30\"] | ( THIRTY_FIRST | ( THIRTY ( DASH )? FIRST ) ) -> INT[\"31\"] );";
        }
    }
    static final String DFA101_eotS =
        "\51\uffff";
    static final String DFA101_eofS =
        "\51\uffff";
    static final String DFA101_minS =
        "\1\31\1\uffff\32\32\1\uffff\1\103\11\32\1\103\1\32";
    static final String DFA101_maxS =
        "\1\176\1\uffff\32\u0084\1\uffff\1\140\11\u0084\1\130\1\u0084";
    static final String DFA101_acceptS =
        "\1\uffff\1\1\32\uffff\1\2\14\uffff";
    static final String DFA101_specialS =
        "\51\uffff}>";
    static final String[] DFA101_transitionS = {
            "\2\1\21\uffff\14\34\13\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1"+
            "\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1"+
            "\25\1\26\37\34\3\uffff\1\27\1\31\1\30\1\32\1\33",
            "",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\7\uffff\1\35\3\uffff\1\46\1\41\1\37\1\36"+
            "\1\40\1\44\1\45\1\43\1\42\14\uffff\11\34\43\uffff\1\34",
            "\1\1\21\uffff\14\34\7\uffff\1\47\3\uffff\1\50\24\uffff\1\34"+
            "\53\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "",
            "\1\46\1\41\1\37\1\36\1\40\1\44\1\45\1\43\1\42\14\uffff\11\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\50\24\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34"
    };

    static final short[] DFA101_eot = DFA.unpackEncodedString(DFA101_eotS);
    static final short[] DFA101_eof = DFA.unpackEncodedString(DFA101_eofS);
    static final char[] DFA101_min = DFA.unpackEncodedStringToUnsignedChars(DFA101_minS);
    static final char[] DFA101_max = DFA.unpackEncodedStringToUnsignedChars(DFA101_maxS);
    static final short[] DFA101_accept = DFA.unpackEncodedString(DFA101_acceptS);
    static final short[] DFA101_special = DFA.unpackEncodedString(DFA101_specialS);
    static final short[][] DFA101_transition;

    static {
        int numStates = DFA101_transitionS.length;
        DFA101_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA101_transition[i] = DFA.unpackEncodedString(DFA101_transitionS[i]);
        }
    }

    class DFA101 extends DFA {

        public DFA101(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 101;
            this.eot = DFA101_eot;
            this.eof = DFA101_eof;
            this.min = DFA101_min;
            this.max = DFA101_max;
            this.accept = DFA101_accept;
            this.special = DFA101_special;
            this.transition = DFA101_transition;
        }
        public String getDescription() {
            return "43:5: ( date_prefix )?";
        }
    }
    static final String DFA105_eotS =
        "\51\uffff";
    static final String DFA105_eofS =
        "\51\uffff";
    static final String DFA105_minS =
        "\1\31\1\uffff\32\32\1\uffff\1\103\11\32\1\103\1\32";
    static final String DFA105_maxS =
        "\1\176\1\uffff\32\u0084\1\uffff\1\140\11\u0084\1\130\1\u0084";
    static final String DFA105_acceptS =
        "\1\uffff\1\1\32\uffff\1\2\14\uffff";
    static final String DFA105_specialS =
        "\51\uffff}>";
    static final String[] DFA105_transitionS = {
            "\2\1\21\uffff\14\34\13\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1"+
            "\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1"+
            "\25\1\26\37\34\3\uffff\1\27\1\31\1\30\1\32\1\33",
            "",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\7\uffff\1\35\3\uffff\1\42\1\44\1\43\1\40"+
            "\1\36\1\41\1\37\1\46\1\45\14\uffff\11\34\43\uffff\1\34",
            "\1\1\21\uffff\14\34\7\uffff\1\47\3\uffff\1\50\24\uffff\1\34"+
            "\53\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "",
            "\1\42\1\44\1\43\1\40\1\36\1\41\1\37\1\46\1\45\14\uffff\11\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34",
            "\1\50\24\uffff\1\34",
            "\1\1\21\uffff\14\34\114\uffff\1\34"
    };

    static final short[] DFA105_eot = DFA.unpackEncodedString(DFA105_eotS);
    static final short[] DFA105_eof = DFA.unpackEncodedString(DFA105_eofS);
    static final char[] DFA105_min = DFA.unpackEncodedStringToUnsignedChars(DFA105_minS);
    static final char[] DFA105_max = DFA.unpackEncodedStringToUnsignedChars(DFA105_maxS);
    static final short[] DFA105_accept = DFA.unpackEncodedString(DFA105_acceptS);
    static final short[] DFA105_special = DFA.unpackEncodedString(DFA105_specialS);
    static final short[][] DFA105_transition;

    static {
        int numStates = DFA105_transitionS.length;
        DFA105_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA105_transition[i] = DFA.unpackEncodedString(DFA105_transitionS[i]);
        }
    }

    class DFA105 extends DFA {

        public DFA105(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 105;
            this.eot = DFA105_eot;
            this.eof = DFA105_eof;
            this.min = DFA105_min;
            this.max = DFA105_max;
            this.accept = DFA105_accept;
            this.special = DFA105_special;
            this.transition = DFA105_transition;
        }
        public String getDescription() {
            return "46:25: ( date_prefix )?";
        }
    }
    static final String DFA107_eotS =
        "\53\uffff";
    static final String DFA107_eofS =
        "\2\uffff\1\35\33\uffff\1\35\14\uffff";
    static final String DFA107_minS =
        "\1\26\1\uffff\1\23\32\32\1\uffff\1\23\1\103\11\32\1\103\1\32";
    static final String DFA107_maxS =
        "\1\176\1\uffff\1\175\23\76\1\113\1\103\5\76\1\uffff\1\175\1\113"+
        "\11\76\1\103\1\76";
    static final String DFA107_acceptS =
        "\1\uffff\1\1\33\uffff\1\2\15\uffff";
    static final String DFA107_specialS =
        "\53\uffff}>";
    static final String[] DFA107_transitionS = {
            "\3\35\1\1\1\2\5\uffff\7\35\2\uffff\26\35\4\uffff\1\3\1\4\1\5"+
            "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1"+
            "\22\1\23\1\24\1\25\1\26\1\27\42\uffff\1\30\1\32\1\31\1\33\1"+
            "\34",
            "",
            "\2\35\6\uffff\2\1\1\uffff\2\35\131\uffff\5\35",
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
            "\1\36\16\uffff\26\35\1\37\3\uffff\1\40\1\45\1\41\1\44\1\42"+
            "\1\50\1\46\1\43\1\47",
            "\1\36\16\uffff\26\35\1\51\3\uffff\1\52",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "",
            "\2\35\6\uffff\2\1\1\uffff\2\35\7\uffff\2\35\120\uffff\5\35",
            "\1\40\1\45\1\41\1\44\1\42\1\50\1\46\1\43\1\47",
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

    static final short[] DFA107_eot = DFA.unpackEncodedString(DFA107_eotS);
    static final short[] DFA107_eof = DFA.unpackEncodedString(DFA107_eofS);
    static final char[] DFA107_min = DFA.unpackEncodedStringToUnsignedChars(DFA107_minS);
    static final char[] DFA107_max = DFA.unpackEncodedStringToUnsignedChars(DFA107_maxS);
    static final short[] DFA107_accept = DFA.unpackEncodedString(DFA107_acceptS);
    static final short[] DFA107_special = DFA.unpackEncodedString(DFA107_specialS);
    static final short[][] DFA107_transition;

    static {
        int numStates = DFA107_transitionS.length;
        DFA107_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA107_transition[i] = DFA.unpackEncodedString(DFA107_transitionS[i]);
        }
    }

    class DFA107 extends DFA {

        public DFA107(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 107;
            this.eot = DFA107_eot;
            this.eof = DFA107_eof;
            this.min = DFA107_min;
            this.max = DFA107_max;
            this.accept = DFA107_accept;
            this.special = DFA107_special;
            this.transition = DFA107_transition;
        }
        public String getDescription() {
            return "49:5: ( date_prefix )?";
        }
    }
    static final String DFA111_eotS =
        "\53\uffff";
    static final String DFA111_eofS =
        "\2\uffff\1\35\33\uffff\1\35\14\uffff";
    static final String DFA111_minS =
        "\1\26\1\uffff\1\33\32\32\1\uffff\1\33\1\103\11\32\1\103\1\32";
    static final String DFA111_maxS =
        "\1\176\1\uffff\1\34\23\76\1\113\1\103\5\76\1\uffff\1\50\1\113\11"+
        "\76\1\103\1\76";
    static final String DFA111_acceptS =
        "\1\uffff\1\1\33\uffff\1\2\15\uffff";
    static final String DFA111_specialS =
        "\53\uffff}>";
    static final String[] DFA111_transitionS = {
            "\3\35\1\1\1\2\5\uffff\7\35\2\uffff\26\35\4\uffff\1\3\1\4\1\5"+
            "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1"+
            "\22\1\23\1\24\1\25\1\26\1\27\42\uffff\1\30\1\32\1\31\1\33\1"+
            "\34",
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
            "\1\36\16\uffff\26\35\1\37\3\uffff\1\44\1\42\1\50\1\45\1\47"+
            "\1\46\1\40\1\43\1\41",
            "\1\36\16\uffff\26\35\1\51\3\uffff\1\52",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "",
            "\2\1\12\uffff\2\35",
            "\1\44\1\42\1\50\1\45\1\47\1\46\1\40\1\43\1\41",
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

    static final short[] DFA111_eot = DFA.unpackEncodedString(DFA111_eotS);
    static final short[] DFA111_eof = DFA.unpackEncodedString(DFA111_eofS);
    static final char[] DFA111_min = DFA.unpackEncodedStringToUnsignedChars(DFA111_minS);
    static final char[] DFA111_max = DFA.unpackEncodedStringToUnsignedChars(DFA111_maxS);
    static final short[] DFA111_accept = DFA.unpackEncodedString(DFA111_acceptS);
    static final short[] DFA111_special = DFA.unpackEncodedString(DFA111_specialS);
    static final short[][] DFA111_transition;

    static {
        int numStates = DFA111_transitionS.length;
        DFA111_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA111_transition[i] = DFA.unpackEncodedString(DFA111_transitionS[i]);
        }
    }

    class DFA111 extends DFA {

        public DFA111(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 111;
            this.eot = DFA111_eot;
            this.eof = DFA111_eof;
            this.min = DFA111_min;
            this.max = DFA111_max;
            this.accept = DFA111_accept;
            this.special = DFA111_special;
            this.transition = DFA111_transition;
        }
        public String getDescription() {
            return "52:25: ( date_prefix )?";
        }
    }
 

    public static final BitSet FOLLOW_relative_date_in_datetime145 = new BitSet(new long[]{0x00000000C0180000L,0x3E00000000000000L});
    public static final BitSet FOLLOW_date_time_sep_in_datetime147 = new BitSet(new long[]{0x00000000C0180000L,0x3E00000000000000L});
    public static final BitSet FOLLOW_time_in_datetime150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_explicit_day_and_month_in_datetime194 = new BitSet(new long[]{0x0000004000100000L,0xEF80000000000000L,0x0000000000000022L});
    public static final BitSet FOLLOW_year_in_datetime196 = new BitSet(new long[]{0x00000000C0180000L,0x3E00000000000000L});
    public static final BitSet FOLLOW_date_time_sep_in_datetime198 = new BitSet(new long[]{0x00000000C0180000L,0x3E00000000000000L});
    public static final BitSet FOLLOW_time_in_datetime201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_prefix_in_datetime232 = new BitSet(new long[]{0x00FFF00000000000L,0x7C7FFFFFFFFFFFF8L});
    public static final BitSet FOLLOW_explicit_day_and_month_in_datetime234 = new BitSet(new long[]{0x00000040C0180000L,0xFF80000000000000L,0x0000000000000022L});
    public static final BitSet FOLLOW_year_in_datetime236 = new BitSet(new long[]{0x00000000C0180000L,0x3E00000000000000L});
    public static final BitSet FOLLOW_date_time_sep_in_datetime239 = new BitSet(new long[]{0x00000000C0180000L,0x3E00000000000000L});
    public static final BitSet FOLLOW_time_in_datetime242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_prefix_in_datetime280 = new BitSet(new long[]{0x00FFF00000000000L,0x7C7FFFFFFFFFFFF8L});
    public static final BitSet FOLLOW_explicit_day_and_month_in_datetime282 = new BitSet(new long[]{0x0000004000180002L,0xEF80000000000000L,0x0000000000000022L});
    public static final BitSet FOLLOW_year_in_datetime284 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_date_time_sep_in_datetime287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_prefix_in_datetime326 = new BitSet(new long[]{0x00FFF00000000000L,0x7C7FFFFFFFFFFFF8L});
    public static final BitSet FOLLOW_explicit_day_and_month_in_datetime329 = new BitSet(new long[]{0x00000000C0180002L,0x3E00000000000000L});
    public static final BitSet FOLLOW_date_time_sep_in_datetime331 = new BitSet(new long[]{0x00000000C0180002L,0x3E00000000000000L});
    public static final BitSet FOLLOW_time_in_datetime334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_in_datetime363 = new BitSet(new long[]{0x00FFF00006200000L,0x7C7FFFFFFFFFFFF8L});
    public static final BitSet FOLLOW_time_date_sep_in_datetime365 = new BitSet(new long[]{0x00FFF00006000000L,0x7C7FFFFFFFFFFFF8L});
    public static final BitSet FOLLOW_date_prefix_in_datetime368 = new BitSet(new long[]{0x00FFF00000000000L,0x7C7FFFFFFFFFFFF8L});
    public static final BitSet FOLLOW_explicit_day_and_month_in_datetime371 = new BitSet(new long[]{0x0000004000100002L,0xEF80000000000000L,0x0000000000000022L});
    public static final BitSet FOLLOW_year_in_datetime373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_prefix_in_datetime406 = new BitSet(new long[]{0x7FFFFE7F05C00000L,0x7C00000000FFFFF8L});
    public static final BitSet FOLLOW_relative_date_in_datetime409 = new BitSet(new long[]{0x00000000C0180002L,0x3E00000000000000L});
    public static final BitSet FOLLOW_date_time_sep_in_datetime411 = new BitSet(new long[]{0x00000000C0180002L,0x3E00000000000000L});
    public static final BitSet FOLLOW_time_in_datetime414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_in_datetime439 = new BitSet(new long[]{0x7FFFFE7F07E00000L,0x7C00000000FFFFF8L});
    public static final BitSet FOLLOW_time_date_sep_in_datetime441 = new BitSet(new long[]{0x7FFFFE7F07C00000L,0x7C00000000FFFFF8L});
    public static final BitSet FOLLOW_date_prefix_in_datetime444 = new BitSet(new long[]{0x7FFFFE7F05C00000L,0x7C00000000FFFFF8L});
    public static final BitSet FOLLOW_relative_date_in_datetime447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_in_datetime482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_date_time_sep0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_time_date_sep530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_named_relative_date_in_relative_date548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiable_target_in_relative_date560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_target_prefix_in_relative_date594 = new BitSet(new long[]{0x7FFFFE0004000000L});
    public static final BitSet FOLLOW_modifiable_target_in_relative_date596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_or_int_1_to_31_in_relative_date625 = new BitSet(new long[]{0x7FFFFE0004000000L});
    public static final BitSet FOLLOW_modifiable_target_in_relative_date627 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_target_suffix_in_relative_date629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TODAY_in_named_relative_date661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOMORROW_in_named_relative_date683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YESTERDAY_in_named_relative_date702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_month_in_explicit_day_and_month734 = new BitSet(new long[]{0x00FFF00000000000L,0x7C7FFFFFFFFFFFF8L});
    public static final BitSet FOLLOW_day_of_month_in_explicit_day_and_month736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_day_of_month_in_explicit_day_and_month759 = new BitSet(new long[]{0x00FFF00000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_132_in_explicit_day_and_month761 = new BitSet(new long[]{0x00FFF00000000000L});
    public static final BitSet FOLLOW_month_in_explicit_day_and_month764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_4_digits_in_formal_explicit_date792 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_date_separator_in_formal_explicit_date794 = new BitSet(new long[]{0x0000000000000000L,0x0E00000000000000L});
    public static final BitSet FOLLOW_int_1_to_12_in_formal_explicit_date796 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_date_separator_in_formal_explicit_date798 = new BitSet(new long[]{0x0000000000000000L,0x7C00000000FFFFF8L});
    public static final BitSet FOLLOW_int_1_to_31_in_formal_explicit_date800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_1_to_12_in_formal_explicit_date838 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_date_separator_in_formal_explicit_date840 = new BitSet(new long[]{0x0000000000000000L,0x7C00000000FFFFF8L});
    public static final BitSet FOLLOW_int_1_to_31_in_formal_explicit_date842 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_date_separator_in_formal_explicit_date845 = new BitSet(new long[]{0x0000004000100000L,0xEF80000000000000L,0x0000000000000022L});
    public static final BitSet FOLLOW_int_up_to_4_digits_in_formal_explicit_date847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_date_prefix894 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_DAY_in_date_prefix897 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_AFTER_in_date_prefix899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_or_int_1_to_31_in_date_prefix932 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_DAY_in_date_prefix934 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_AFTER_in_date_prefix936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_date_prefix950 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_DAY_in_date_prefix953 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_BEFORE_in_date_prefix955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_or_int_1_to_31_in_date_prefix987 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_DAY_in_date_prefix989 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_BEFORE_in_date_prefix991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hours_in_time1014 = new BitSet(new long[]{0x0000000020000002L,0x0000000000000006L});
    public static final BitSet FOLLOW_COLON_in_time1017 = new BitSet(new long[]{0x0000000000000000L,0xFE00000000000000L});
    public static final BitSet FOLLOW_minutes_in_time1019 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000006L});
    public static final BitSet FOLLOW_meridian_indicator_in_time1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_identifier_in_time1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MIDNIGHT_in_time_identifier1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOON_in_time_identifier1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_target_prefix1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_target_prefix1152 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LAST_in_target_prefix1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_target_prefix1176 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_PAST_in_target_prefix1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_target_prefix1200 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_NEXT_in_target_prefix1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_target_prefix1224 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_COMING_in_target_prefix1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_target_prefix1246 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_UPCOMING_in_target_prefix1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_target_prefix1266 = new BitSet(new long[]{0x0000000000000000L,0x7C00000000FFFFF8L});
    public static final BitSet FOLLOW_spelled_or_int_1_to_31_in_target_prefix1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FROM_NOW_in_target_suffix1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AGO_in_target_suffix1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_day_of_week_in_modifiable_target1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_span_in_modifiable_target1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_month_in_modifiable_target1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DAY_in_date_span1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEEK_in_date_span1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MONTH_in_date_span1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YEAR_in_date_span1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JANUARY_in_month1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FEBRUARY_in_month1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MARCH_in_month1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APRIL_in_month1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAY_in_month1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JUNE_in_month1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JULY_in_month1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AUGUST_in_month1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEPTEMBER_in_month1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OCTOBER_in_month1608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOVEMBER_in_month1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECEMBER_in_month1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_or_int_1_to_31_in_day_of_month1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_sequence_1_to_31_in_day_of_month1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUNDAY_in_day_of_week1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MONDAY_in_day_of_week1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TUESDAY_in_day_of_week1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEDNESDAY_in_day_of_week1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THURSDAY_in_day_of_week1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FRIDAY_in_day_of_week1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SATURDAY_in_day_of_week1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_year1833 = new BitSet(new long[]{0x0000004000100000L,0xEE00000000000000L,0x0000000000000022L});
    public static final BitSet FOLLOW_IN_in_year1837 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THE_in_year1839 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_YEAR_in_year1841 = new BitSet(new long[]{0x0000004000100000L,0xEE00000000000000L,0x0000000000000022L});
    public static final BitSet FOLLOW_133_in_year1845 = new BitSet(new long[]{0x0000004000100000L,0xEE00000000000000L,0x0000000000000022L});
    public static final BitSet FOLLOW_int_0_to_99_with_prefix_in_year1848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_year1862 = new BitSet(new long[]{0x0000004000100000L,0xEF80000000000000L,0x0000000000000022L});
    public static final BitSet FOLLOW_IN_in_year1866 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THE_in_year1868 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_YEAR_in_year1870 = new BitSet(new long[]{0x0000004000100000L,0xEF80000000000000L,0x0000000000000022L});
    public static final BitSet FOLLOW_int_3_or_4_digits_in_year1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_date_separator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_0_to_23_in_hours1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_0_to_59_in_minutes1951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AM_in_meridian_indicator1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PM_in_meridian_indicator1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_in_spelled_1_to_312006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWO_in_spelled_1_to_312024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THREE_in_spelled_1_to_312042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOUR_in_spelled_1_to_312058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIVE_in_spelled_1_to_312075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIX_in_spelled_1_to_312092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVEN_in_spelled_1_to_312110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHT_in_spelled_1_to_312126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINE_in_spelled_1_to_312142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEN_in_spelled_1_to_312159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEVEN_in_spelled_1_to_312177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWELVE_in_spelled_1_to_312192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_in_spelled_1_to_312207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOURTEEN_in_spelled_1_to_312220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIFTEEN_in_spelled_1_to_312233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTEEN_in_spelled_1_to_312247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVENTEEN_in_spelled_1_to_312261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHTEEN_in_spelled_1_to_312273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINETEEN_in_spelled_1_to_312286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_1_to_312299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_1_to_312314 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DASH_in_spelled_1_to_312316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ONE_in_spelled_1_to_312319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_1_to_312332 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_DASH_in_spelled_1_to_312334 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_TWO_in_spelled_1_to_312337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_1_to_312350 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_DASH_in_spelled_1_to_312352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_THREE_in_spelled_1_to_312355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_1_to_312366 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_DASH_in_spelled_1_to_312368 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_FOUR_in_spelled_1_to_312371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_1_to_312383 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_DASH_in_spelled_1_to_312385 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_FIVE_in_spelled_1_to_312388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_1_to_312400 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_DASH_in_spelled_1_to_312402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_SIX_in_spelled_1_to_312405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_1_to_312418 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_DASH_in_spelled_1_to_312420 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_SEVEN_in_spelled_1_to_312423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_1_to_312434 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_DASH_in_spelled_1_to_312436 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_EIGHT_in_spelled_1_to_312439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_1_to_312450 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_DASH_in_spelled_1_to_312452 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_NINE_in_spelled_1_to_312455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_in_spelled_1_to_312467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_in_spelled_1_to_312490 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DASH_in_spelled_1_to_312492 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ONE_in_spelled_1_to_312495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_1_to_31_in_spelled_or_int_1_to_312517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_1_to_31_in_spelled_or_int_1_to_312523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIRST_in_spelled_sequence_1_to_312540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SECOND_in_spelled_sequence_1_to_312557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRD_in_spelled_sequence_1_to_312573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOURTH_in_spelled_sequence_1_to_312590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIFTH_in_spelled_sequence_1_to_312606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTH_in_spelled_sequence_1_to_312623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVENTH_in_spelled_sequence_1_to_312640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHTH_in_spelled_sequence_1_to_312655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINTH_in_spelled_sequence_1_to_312671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TENTH_in_spelled_sequence_1_to_312688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEVENTH_in_spelled_sequence_1_to_312705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWELFTH_in_spelled_sequence_1_to_312719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEENTH_in_spelled_sequence_1_to_312734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOURTEENTH_in_spelled_sequence_1_to_312746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIFTEENTH_in_spelled_sequence_1_to_312758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTEENTH_in_spelled_sequence_1_to_312771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVENTEENTH_in_spelled_sequence_1_to_312784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHTEENTH_in_spelled_sequence_1_to_312795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINETEENTH_in_spelled_sequence_1_to_312807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTIETH_in_spelled_sequence_1_to_312819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FIRST_in_spelled_sequence_1_to_312833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_312840 = new BitSet(new long[]{0x8000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312842 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_FIRST_in_spelled_sequence_1_to_312845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_SECOND_in_spelled_sequence_1_to_312861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_312867 = new BitSet(new long[]{0x8000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312869 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_SECOND_in_spelled_sequence_1_to_312872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_THIRD_in_spelled_sequence_1_to_312887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_312894 = new BitSet(new long[]{0x8000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312896 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_THIRD_in_spelled_sequence_1_to_312899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FOURTH_in_spelled_sequence_1_to_312915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_312921 = new BitSet(new long[]{0x8000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312923 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_FOURTH_in_spelled_sequence_1_to_312926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FIFTH_in_spelled_sequence_1_to_312941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_312948 = new BitSet(new long[]{0x8000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312950 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_FIFTH_in_spelled_sequence_1_to_312953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_SIXTH_in_spelled_sequence_1_to_312969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_312976 = new BitSet(new long[]{0x8000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312978 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_SIXTH_in_spelled_sequence_1_to_312981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_SEVENTH_in_spelled_sequence_1_to_312997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_313002 = new BitSet(new long[]{0x8000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_313004 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_SEVENTH_in_spelled_sequence_1_to_313007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_EIGHTH_in_spelled_sequence_1_to_313021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_313027 = new BitSet(new long[]{0x8000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_313029 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_EIGHTH_in_spelled_sequence_1_to_313032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_NINTH_in_spelled_sequence_1_to_313047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_313054 = new BitSet(new long[]{0x8000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_313056 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_NINTH_in_spelled_sequence_1_to_313059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTIETH_in_spelled_sequence_1_to_313074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_FIRST_in_spelled_sequence_1_to_313118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_in_spelled_sequence_1_to_313125 = new BitSet(new long[]{0x8000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_313127 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_FIRST_in_spelled_sequence_1_to_313130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_0_to_99_with_prefix_in_int_up_to_4_digits3155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THREE_DIGIT_in_int_up_to_4_digits3161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOUR_DIGIT_in_int_up_to_4_digits3172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THREE_DIGIT_in_int_3_or_4_digits3194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOUR_DIGIT_in_int_3_or_4_digits3205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOUR_DIGIT_in_int_4_digits3227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWO_ZEROS_in_int_1_to_123247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREFIXED_ONE_TO_NINE_in_int_1_to_123269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEN_TO_TWELVE_in_int_1_to_123280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWO_ZEROS_in_int_0_to_233308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREFIXED_ONE_TO_NINE_in_int_0_to_233334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_TO_NINE_in_int_0_to_233349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEN_TO_TWELVE_in_int_0_to_233373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_int_0_to_233395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWO_ZEROS_in_int_0_to_593416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREFIXED_ONE_TO_NINE_in_int_0_to_593443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_TO_NINE_in_int_0_to_593459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEN_TO_TWELVE_in_int_0_to_593484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_int_0_to_593507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FOUR_TO_THIRTY_ONE_in_int_0_to_593519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_TWO_TO_FIFTY_NINE_in_int_0_to_593530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_ZERO_in_int_0_to_99_no_prefix3552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_TO_NINE_in_int_0_to_99_no_prefix3580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEN_TO_TWELVE_in_int_0_to_99_no_prefix3605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_int_0_to_99_no_prefix3628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FOUR_TO_THIRTY_ONE_in_int_0_to_99_no_prefix3640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_TWO_TO_FIFTY_NINE_in_int_0_to_99_no_prefix3651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTY_TO_NINETY_NINE_in_int_0_to_99_no_prefix3663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWO_ZEROS_in_int_0_to_99_with_prefix3688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREFIXED_ONE_TO_NINE_in_int_0_to_99_with_prefix3715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEN_TO_TWELVE_in_int_0_to_99_with_prefix3731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_int_0_to_99_with_prefix3754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FOUR_TO_THIRTY_ONE_in_int_0_to_99_with_prefix3766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_TWO_TO_FIFTY_NINE_in_int_0_to_99_with_prefix3777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTY_TO_NINETY_NINE_in_int_0_to_99_with_prefix3789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREFIXED_ONE_TO_NINE_in_int_1_to_313813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_TO_NINE_in_int_1_to_313829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_10_to_31_in_int_1_to_313854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_TO_NINE_in_int_1_to_31_no_prefix3869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_10_to_31_in_int_1_to_31_no_prefix3880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEN_TO_TWELVE_in_int_10_to_313895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_int_10_to_313918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FOUR_TO_THIRTY_ONE_in_int_10_to_313930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relative_date_in_synpred1_Date136 = new BitSet(new long[]{0x00000000C0180000L,0x3E00000000000000L});
    public static final BitSet FOLLOW_date_time_sep_in_synpred1_Date138 = new BitSet(new long[]{0x00000000C0180000L,0x3E00000000000000L});
    public static final BitSet FOLLOW_time_in_synpred1_Date141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_explicit_day_and_month_in_synpred2_Date176 = new BitSet(new long[]{0x0000004000100000L,0xEF80000000000000L,0x0000000000000022L});
    public static final BitSet FOLLOW_year_in_synpred2_Date178 = new BitSet(new long[]{0x00000000C0180000L,0x3E00000000000000L});
    public static final BitSet FOLLOW_date_time_sep_in_synpred2_Date180 = new BitSet(new long[]{0x00000000C0180000L,0x3E00000000000000L});
    public static final BitSet FOLLOW_time_in_synpred2_Date183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_prefix_in_synpred3_Date232 = new BitSet(new long[]{0x00FFF00000000000L,0x7C7FFFFFFFFFFFF8L});
    public static final BitSet FOLLOW_explicit_day_and_month_in_synpred3_Date234 = new BitSet(new long[]{0x00000040C0180000L,0xFF80000000000000L,0x0000000000000022L});
    public static final BitSet FOLLOW_year_in_synpred3_Date236 = new BitSet(new long[]{0x00000000C0180000L,0x3E00000000000000L});
    public static final BitSet FOLLOW_date_time_sep_in_synpred3_Date239 = new BitSet(new long[]{0x00000000C0180000L,0x3E00000000000000L});
    public static final BitSet FOLLOW_time_in_synpred3_Date242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_prefix_in_synpred4_Date280 = new BitSet(new long[]{0x00FFF00000000000L,0x7C7FFFFFFFFFFFF8L});
    public static final BitSet FOLLOW_explicit_day_and_month_in_synpred4_Date282 = new BitSet(new long[]{0x0000004000180002L,0xEF80000000000000L,0x0000000000000022L});
    public static final BitSet FOLLOW_year_in_synpred4_Date284 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_date_time_sep_in_synpred4_Date287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_prefix_in_synpred5_Date326 = new BitSet(new long[]{0x00FFF00000000000L,0x7C7FFFFFFFFFFFF8L});
    public static final BitSet FOLLOW_explicit_day_and_month_in_synpred5_Date329 = new BitSet(new long[]{0x00000000C0180002L,0x3E00000000000000L});
    public static final BitSet FOLLOW_date_time_sep_in_synpred5_Date331 = new BitSet(new long[]{0x00000000C0180002L,0x3E00000000000000L});
    public static final BitSet FOLLOW_time_in_synpred5_Date334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_in_synpred6_Date363 = new BitSet(new long[]{0x00FFF00006200000L,0x7C7FFFFFFFFFFFF8L});
    public static final BitSet FOLLOW_time_date_sep_in_synpred6_Date365 = new BitSet(new long[]{0x00FFF00006000000L,0x7C7FFFFFFFFFFFF8L});
    public static final BitSet FOLLOW_date_prefix_in_synpred6_Date368 = new BitSet(new long[]{0x00FFF00000000000L,0x7C7FFFFFFFFFFFF8L});
    public static final BitSet FOLLOW_explicit_day_and_month_in_synpred6_Date371 = new BitSet(new long[]{0x0000004000100002L,0xEF80000000000000L,0x0000000000000022L});
    public static final BitSet FOLLOW_year_in_synpred6_Date373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_prefix_in_synpred7_Date406 = new BitSet(new long[]{0x7FFFFE7F05C00000L,0x7C00000000FFFFF8L});
    public static final BitSet FOLLOW_relative_date_in_synpred7_Date409 = new BitSet(new long[]{0x00000000C0180002L,0x3E00000000000000L});
    public static final BitSet FOLLOW_date_time_sep_in_synpred7_Date411 = new BitSet(new long[]{0x00000000C0180002L,0x3E00000000000000L});
    public static final BitSet FOLLOW_time_in_synpred7_Date414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_in_synpred8_Date439 = new BitSet(new long[]{0x7FFFFE7F07E00000L,0x7C00000000FFFFF8L});
    public static final BitSet FOLLOW_time_date_sep_in_synpred8_Date441 = new BitSet(new long[]{0x7FFFFE7F07C00000L,0x7C00000000FFFFF8L});
    public static final BitSet FOLLOW_date_prefix_in_synpred8_Date444 = new BitSet(new long[]{0x7FFFFE7F05C00000L,0x7C00000000FFFFF8L});
    public static final BitSet FOLLOW_relative_date_in_synpred8_Date447 = new BitSet(new long[]{0x0000000000000002L});

}