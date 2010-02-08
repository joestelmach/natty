// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g 2010-02-07 20:29:46
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INT", "MONTH_OF_YEAR", "DAY_OF_MONTH", "DAY_OF_WEEK", "YEAR_OF", "DATE_TIME", "EXPLICIT_DATE", "RELATIVE_DATE", "SEEK", "DIRECTION", "SEEK_BY", "SPAN", "EXPLICIT_TIME", "HOURS_OF_DAY", "MINUTES_OF_HOUR", "AM_PM", "WHITE_SPACE", "AT", "COMMA", "ON", "THE", "DAY", "AFTER", "BEFORE", "OF", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER", "SINGLE_QUOTE", "IN", "YEAR", "DASH", "SLASH", "THIS", "LAST", "NEXT", "PAST", "COMING", "UPCOMING", "FROM", "NOW", "AGO", "WEEK", "MONTH", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "TODAY", "TOMORROW", "YESTERDAY", "COLON", "MILITARY_HOUR_SUFFIX", "HOUR", "AM", "PM", "NOON", "MIDNIGHT", "INT_0", "INT_00", "INT_1_TO_9", "INT_01_TO_12", "INT_13_TO_23", "INT_24_TO_31", "INT_32_TO_59", "INT_60_TO_99", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN", "TWENTY", "THIRTY", "FIRST", "SECOND", "THIRD", "FOURTH", "FIFTH", "SIXTH", "SEVENTH", "EIGHTH", "NINTH", "TENTH", "ELEVENTH", "TWELFTH", "THIRTEENTH", "FOURTEENTH", "FIFTEENTH", "SIXTEENTH", "SEVENTEENTH", "EIGHTEENTH", "NINETEENTH", "TWENTIETH", "TWENTY_FIRST", "TWENTY_SECOND", "TWENTY_THIRD", "TWENTY_FOURTH", "TWENTY_FIFTH", "TWENTY_SIXTH", "TWENTY_SEVENTH", "TWENTY_EIGHTH", "TWENTY_NINTH", "THIRTIETH", "THIRTY_FIRST", "DOT"
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
    public static final int THIS=46;
    public static final int THIRTIETH=132;
    public static final int NOON=72;
    public static final int INT_60_TO_99=81;
    public static final int LAST=47;
    public static final int EIGHTEEN=99;
    public static final int INT_01_TO_12=77;
    public static final int RELATIVE_DATE=11;
    public static final int TOMORROW=65;
    public static final int FIFTEENTH=117;
    public static final int FOURTH=106;
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
    public String getGrammarFileName() { return "/Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g"; }


    public static class date_time_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "date_time"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:29:1: date_time : ( ( date ( date_time_separator time )? )=> date ( date_time_separator time )? | time ( time_date_separator date )? ) -> ^( DATE_TIME ( date )? ( time )? ) ;
    public final DateParser.date_time_return date_time() throws RecognitionException {
        DateParser.date_time_return retval = new DateParser.date_time_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.date_return date1 = null;

        DateParser.date_time_separator_return date_time_separator2 = null;

        DateParser.time_return time3 = null;

        DateParser.time_return time4 = null;

        DateParser.time_date_separator_return time_date_separator5 = null;

        DateParser.date_return date6 = null;


        RewriteRuleSubtreeStream stream_date_time_separator=new RewriteRuleSubtreeStream(adaptor,"rule date_time_separator");
        RewriteRuleSubtreeStream stream_time=new RewriteRuleSubtreeStream(adaptor,"rule time");
        RewriteRuleSubtreeStream stream_time_date_separator=new RewriteRuleSubtreeStream(adaptor,"rule time_date_separator");
        RewriteRuleSubtreeStream stream_date=new RewriteRuleSubtreeStream(adaptor,"rule date");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:3: ( ( ( date ( date_time_separator time )? )=> date ( date_time_separator time )? | time ( time_date_separator date )? ) -> ^( DATE_TIME ( date )? ( time )? ) )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:5: ( ( date ( date_time_separator time )? )=> date ( date_time_separator time )? | time ( time_date_separator date )? )
            {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:5: ( ( date ( date_time_separator time )? )=> date ( date_time_separator time )? | time ( time_date_separator date )? )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:31:7: ( date ( date_time_separator time )? )=> date ( date_time_separator time )?
                    {
                    pushFollow(FOLLOW_date_in_date_time158);
                    date1=date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_date.add(date1.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:32:14: ( date_time_separator time )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==WHITE_SPACE||LA1_0==COMMA) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:32:15: date_time_separator time
                            {
                            pushFollow(FOLLOW_date_time_separator_in_date_time161);
                            date_time_separator2=date_time_separator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_date_time_separator.add(date_time_separator2.getTree());
                            pushFollow(FOLLOW_time_in_date_time163);
                            time3=time();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_time.add(time3.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:34:9: time ( time_date_separator date )?
                    {
                    pushFollow(FOLLOW_time_in_date_time182);
                    time4=time();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_time.add(time4.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:34:14: ( time_date_separator date )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==WHITE_SPACE||LA2_0==COMMA) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:34:15: time_date_separator date
                            {
                            pushFollow(FOLLOW_time_date_separator_in_date_time185);
                            time_date_separator5=time_date_separator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_time_date_separator.add(time_date_separator5.getTree());
                            pushFollow(FOLLOW_date_in_date_time187);
                            date6=date();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_date.add(date6.getTree());

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
            // 35:7: -> ^( DATE_TIME ( date )? ( time )? )
            {
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:35:10: ^( DATE_TIME ( date )? ( time )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DATE_TIME, "DATE_TIME"), root_1);

                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:35:22: ( date )?
                if ( stream_date.hasNext() ) {
                    adaptor.addChild(root_1, stream_date.nextTree());

                }
                stream_date.reset();
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:35:28: ( time )?
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

    public static class date_time_separator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "date_time_separator"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:38:1: date_time_separator : ( WHITE_SPACE ( AT WHITE_SPACE )? | COMMA ( WHITE_SPACE )? ( AT WHITE_SPACE )? );
    public final DateParser.date_time_separator_return date_time_separator() throws RecognitionException {
        DateParser.date_time_separator_return retval = new DateParser.date_time_separator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHITE_SPACE7=null;
        Token AT8=null;
        Token WHITE_SPACE9=null;
        Token COMMA10=null;
        Token WHITE_SPACE11=null;
        Token AT12=null;
        Token WHITE_SPACE13=null;

        Object WHITE_SPACE7_tree=null;
        Object AT8_tree=null;
        Object WHITE_SPACE9_tree=null;
        Object COMMA10_tree=null;
        Object WHITE_SPACE11_tree=null;
        Object AT12_tree=null;
        Object WHITE_SPACE13_tree=null;

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:39:3: ( WHITE_SPACE ( AT WHITE_SPACE )? | COMMA ( WHITE_SPACE )? ( AT WHITE_SPACE )? )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:39:5: WHITE_SPACE ( AT WHITE_SPACE )?
                    {
                    root_0 = (Object)adaptor.nil();

                    WHITE_SPACE7=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_date_time_separator222); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHITE_SPACE7_tree = (Object)adaptor.create(WHITE_SPACE7);
                    adaptor.addChild(root_0, WHITE_SPACE7_tree);
                    }
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:39:17: ( AT WHITE_SPACE )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==AT) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:39:18: AT WHITE_SPACE
                            {
                            AT8=(Token)match(input,AT,FOLLOW_AT_in_date_time_separator225); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            AT8_tree = (Object)adaptor.create(AT8);
                            adaptor.addChild(root_0, AT8_tree);
                            }
                            WHITE_SPACE9=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_date_time_separator227); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            WHITE_SPACE9_tree = (Object)adaptor.create(WHITE_SPACE9);
                            adaptor.addChild(root_0, WHITE_SPACE9_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:40:5: COMMA ( WHITE_SPACE )? ( AT WHITE_SPACE )?
                    {
                    root_0 = (Object)adaptor.nil();

                    COMMA10=(Token)match(input,COMMA,FOLLOW_COMMA_in_date_time_separator235); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COMMA10_tree = (Object)adaptor.create(COMMA10);
                    adaptor.addChild(root_0, COMMA10_tree);
                    }
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:40:11: ( WHITE_SPACE )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==WHITE_SPACE) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:40:11: WHITE_SPACE
                            {
                            WHITE_SPACE11=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_date_time_separator237); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            WHITE_SPACE11_tree = (Object)adaptor.create(WHITE_SPACE11);
                            adaptor.addChild(root_0, WHITE_SPACE11_tree);
                            }

                            }
                            break;

                    }

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:40:24: ( AT WHITE_SPACE )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==AT) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:40:25: AT WHITE_SPACE
                            {
                            AT12=(Token)match(input,AT,FOLLOW_AT_in_date_time_separator241); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            AT12_tree = (Object)adaptor.create(AT12);
                            adaptor.addChild(root_0, AT12_tree);
                            }
                            WHITE_SPACE13=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_date_time_separator243); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            WHITE_SPACE13_tree = (Object)adaptor.create(WHITE_SPACE13);
                            adaptor.addChild(root_0, WHITE_SPACE13_tree);
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:43:1: time_date_separator : ( WHITE_SPACE ( ON WHITE_SPACE )? | COMMA ( WHITE_SPACE )? ( ON WHITE_SPACE )? );
    public final DateParser.time_date_separator_return time_date_separator() throws RecognitionException {
        DateParser.time_date_separator_return retval = new DateParser.time_date_separator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHITE_SPACE14=null;
        Token ON15=null;
        Token WHITE_SPACE16=null;
        Token COMMA17=null;
        Token WHITE_SPACE18=null;
        Token ON19=null;
        Token WHITE_SPACE20=null;

        Object WHITE_SPACE14_tree=null;
        Object ON15_tree=null;
        Object WHITE_SPACE16_tree=null;
        Object COMMA17_tree=null;
        Object WHITE_SPACE18_tree=null;
        Object ON19_tree=null;
        Object WHITE_SPACE20_tree=null;

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:44:3: ( WHITE_SPACE ( ON WHITE_SPACE )? | COMMA ( WHITE_SPACE )? ( ON WHITE_SPACE )? )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:44:5: WHITE_SPACE ( ON WHITE_SPACE )?
                    {
                    root_0 = (Object)adaptor.nil();

                    WHITE_SPACE14=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_time_date_separator260); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHITE_SPACE14_tree = (Object)adaptor.create(WHITE_SPACE14);
                    adaptor.addChild(root_0, WHITE_SPACE14_tree);
                    }
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:44:17: ( ON WHITE_SPACE )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==ON) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:44:18: ON WHITE_SPACE
                            {
                            ON15=(Token)match(input,ON,FOLLOW_ON_in_time_date_separator263); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            ON15_tree = (Object)adaptor.create(ON15);
                            adaptor.addChild(root_0, ON15_tree);
                            }
                            WHITE_SPACE16=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_time_date_separator265); if (state.failed) return retval;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:45:5: COMMA ( WHITE_SPACE )? ( ON WHITE_SPACE )?
                    {
                    root_0 = (Object)adaptor.nil();

                    COMMA17=(Token)match(input,COMMA,FOLLOW_COMMA_in_time_date_separator273); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COMMA17_tree = (Object)adaptor.create(COMMA17);
                    adaptor.addChild(root_0, COMMA17_tree);
                    }
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:45:11: ( WHITE_SPACE )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==WHITE_SPACE) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:45:11: WHITE_SPACE
                            {
                            WHITE_SPACE18=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_time_date_separator275); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            WHITE_SPACE18_tree = (Object)adaptor.create(WHITE_SPACE18);
                            adaptor.addChild(root_0, WHITE_SPACE18_tree);
                            }

                            }
                            break;

                    }

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:45:24: ( ON WHITE_SPACE )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==ON) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:45:25: ON WHITE_SPACE
                            {
                            ON19=(Token)match(input,ON,FOLLOW_ON_in_time_date_separator279); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            ON19_tree = (Object)adaptor.create(ON19);
                            adaptor.addChild(root_0, ON19_tree);
                            }
                            WHITE_SPACE20=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_time_date_separator281); if (state.failed) return retval;
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
    // $ANTLR end "time_date_separator"

    public static class date_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "date"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:48:1: date : ( global_date_prefix formal_date -> ^( RELATIVE_DATE ^( SEEK global_date_prefix formal_date ) ) | global_date_prefix relaxed_date -> ^( RELATIVE_DATE ^( SEEK global_date_prefix relaxed_date ) ) | global_date_prefix relative_date -> ^( RELATIVE_DATE ^( SEEK global_date_prefix relative_date ) ) | ( formal_date | relaxed_date | relative_date ) );
    public final DateParser.date_return date() throws RecognitionException {
        DateParser.date_return retval = new DateParser.date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.global_date_prefix_return global_date_prefix21 = null;

        DateParser.formal_date_return formal_date22 = null;

        DateParser.global_date_prefix_return global_date_prefix23 = null;

        DateParser.relaxed_date_return relaxed_date24 = null;

        DateParser.global_date_prefix_return global_date_prefix25 = null;

        DateParser.relative_date_return relative_date26 = null;

        DateParser.formal_date_return formal_date27 = null;

        DateParser.relaxed_date_return relaxed_date28 = null;

        DateParser.relative_date_return relative_date29 = null;


        RewriteRuleSubtreeStream stream_formal_date=new RewriteRuleSubtreeStream(adaptor,"rule formal_date");
        RewriteRuleSubtreeStream stream_global_date_prefix=new RewriteRuleSubtreeStream(adaptor,"rule global_date_prefix");
        RewriteRuleSubtreeStream stream_relaxed_date=new RewriteRuleSubtreeStream(adaptor,"rule relaxed_date");
        RewriteRuleSubtreeStream stream_relative_date=new RewriteRuleSubtreeStream(adaptor,"rule relative_date");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:49:3: ( global_date_prefix formal_date -> ^( RELATIVE_DATE ^( SEEK global_date_prefix formal_date ) ) | global_date_prefix relaxed_date -> ^( RELATIVE_DATE ^( SEEK global_date_prefix relaxed_date ) ) | global_date_prefix relative_date -> ^( RELATIVE_DATE ^( SEEK global_date_prefix relative_date ) ) | ( formal_date | relaxed_date | relative_date ) )
            int alt13=4;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:49:5: global_date_prefix formal_date
                    {
                    pushFollow(FOLLOW_global_date_prefix_in_date296);
                    global_date_prefix21=global_date_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_global_date_prefix.add(global_date_prefix21.getTree());
                    pushFollow(FOLLOW_formal_date_in_date298);
                    formal_date22=formal_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_date.add(formal_date22.getTree());


                    // AST REWRITE
                    // elements: global_date_prefix, formal_date
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 50:7: -> ^( RELATIVE_DATE ^( SEEK global_date_prefix formal_date ) )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:50:10: ^( RELATIVE_DATE ^( SEEK global_date_prefix formal_date ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:50:26: ^( SEEK global_date_prefix formal_date )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEEK, "SEEK"), root_2);

                        adaptor.addChild(root_2, stream_global_date_prefix.nextTree());
                        adaptor.addChild(root_2, stream_formal_date.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:52:5: global_date_prefix relaxed_date
                    {
                    pushFollow(FOLLOW_global_date_prefix_in_date331);
                    global_date_prefix23=global_date_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_global_date_prefix.add(global_date_prefix23.getTree());
                    pushFollow(FOLLOW_relaxed_date_in_date333);
                    relaxed_date24=relaxed_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_date.add(relaxed_date24.getTree());


                    // AST REWRITE
                    // elements: relaxed_date, global_date_prefix
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 53:7: -> ^( RELATIVE_DATE ^( SEEK global_date_prefix relaxed_date ) )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:53:10: ^( RELATIVE_DATE ^( SEEK global_date_prefix relaxed_date ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:53:26: ^( SEEK global_date_prefix relaxed_date )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEEK, "SEEK"), root_2);

                        adaptor.addChild(root_2, stream_global_date_prefix.nextTree());
                        adaptor.addChild(root_2, stream_relaxed_date.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:55:5: global_date_prefix relative_date
                    {
                    pushFollow(FOLLOW_global_date_prefix_in_date366);
                    global_date_prefix25=global_date_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_global_date_prefix.add(global_date_prefix25.getTree());
                    pushFollow(FOLLOW_relative_date_in_date368);
                    relative_date26=relative_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_date.add(relative_date26.getTree());


                    // AST REWRITE
                    // elements: global_date_prefix, relative_date
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 56:7: -> ^( RELATIVE_DATE ^( SEEK global_date_prefix relative_date ) )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:56:10: ^( RELATIVE_DATE ^( SEEK global_date_prefix relative_date ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:56:26: ^( SEEK global_date_prefix relative_date )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEEK, "SEEK"), root_2);

                        adaptor.addChild(root_2, stream_global_date_prefix.nextTree());
                        adaptor.addChild(root_2, stream_relative_date.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:58:5: ( formal_date | relaxed_date | relative_date )
                    {
                    root_0 = (Object)adaptor.nil();

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:58:5: ( formal_date | relaxed_date | relative_date )
                    int alt12=3;
                    alt12 = dfa12.predict(input);
                    switch (alt12) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:58:6: formal_date
                            {
                            pushFollow(FOLLOW_formal_date_in_date402);
                            formal_date27=formal_date();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, formal_date27.getTree());

                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:58:20: relaxed_date
                            {
                            pushFollow(FOLLOW_relaxed_date_in_date406);
                            relaxed_date28=relaxed_date();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, relaxed_date28.getTree());

                            }
                            break;
                        case 3 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:58:35: relative_date
                            {
                            pushFollow(FOLLOW_relative_date_in_date410);
                            relative_date29=relative_date();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, relative_date29.getTree());

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
    // $ANTLR end "date"

    public static class global_date_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "global_date_prefix"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:61:1: global_date_prefix : ( ( THE WHITE_SPACE )? DAY WHITE_SPACE AFTER WHITE_SPACE -> DIRECTION[\">\"] INT[\"1\"] | ( THE WHITE_SPACE )? DAY WHITE_SPACE BEFORE WHITE_SPACE -> DIRECTION[\"<\"] INT[\"1\"] );
    public final DateParser.global_date_prefix_return global_date_prefix() throws RecognitionException {
        DateParser.global_date_prefix_return retval = new DateParser.global_date_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THE30=null;
        Token WHITE_SPACE31=null;
        Token DAY32=null;
        Token WHITE_SPACE33=null;
        Token AFTER34=null;
        Token WHITE_SPACE35=null;
        Token THE36=null;
        Token WHITE_SPACE37=null;
        Token DAY38=null;
        Token WHITE_SPACE39=null;
        Token BEFORE40=null;
        Token WHITE_SPACE41=null;

        Object THE30_tree=null;
        Object WHITE_SPACE31_tree=null;
        Object DAY32_tree=null;
        Object WHITE_SPACE33_tree=null;
        Object AFTER34_tree=null;
        Object WHITE_SPACE35_tree=null;
        Object THE36_tree=null;
        Object WHITE_SPACE37_tree=null;
        Object DAY38_tree=null;
        Object WHITE_SPACE39_tree=null;
        Object BEFORE40_tree=null;
        Object WHITE_SPACE41_tree=null;
        RewriteRuleTokenStream stream_BEFORE=new RewriteRuleTokenStream(adaptor,"token BEFORE");
        RewriteRuleTokenStream stream_DAY=new RewriteRuleTokenStream(adaptor,"token DAY");
        RewriteRuleTokenStream stream_AFTER=new RewriteRuleTokenStream(adaptor,"token AFTER");
        RewriteRuleTokenStream stream_THE=new RewriteRuleTokenStream(adaptor,"token THE");
        RewriteRuleTokenStream stream_WHITE_SPACE=new RewriteRuleTokenStream(adaptor,"token WHITE_SPACE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:62:3: ( ( THE WHITE_SPACE )? DAY WHITE_SPACE AFTER WHITE_SPACE -> DIRECTION[\">\"] INT[\"1\"] | ( THE WHITE_SPACE )? DAY WHITE_SPACE BEFORE WHITE_SPACE -> DIRECTION[\"<\"] INT[\"1\"] )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==THE) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==WHITE_SPACE) ) {
                    int LA16_3 = input.LA(3);

                    if ( (LA16_3==DAY) ) {
                        int LA16_2 = input.LA(4);

                        if ( (LA16_2==WHITE_SPACE) ) {
                            int LA16_4 = input.LA(5);

                            if ( (LA16_4==AFTER) ) {
                                alt16=1;
                            }
                            else if ( (LA16_4==BEFORE) ) {
                                alt16=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 16, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 16, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA16_0==DAY) ) {
                int LA16_2 = input.LA(2);

                if ( (LA16_2==WHITE_SPACE) ) {
                    int LA16_4 = input.LA(3);

                    if ( (LA16_4==AFTER) ) {
                        alt16=1;
                    }
                    else if ( (LA16_4==BEFORE) ) {
                        alt16=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:62:5: ( THE WHITE_SPACE )? DAY WHITE_SPACE AFTER WHITE_SPACE
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:62:5: ( THE WHITE_SPACE )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==THE) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:62:6: THE WHITE_SPACE
                            {
                            THE30=(Token)match(input,THE,FOLLOW_THE_in_global_date_prefix427); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THE.add(THE30);

                            WHITE_SPACE31=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_global_date_prefix429); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE31);


                            }
                            break;

                    }

                    DAY32=(Token)match(input,DAY,FOLLOW_DAY_in_global_date_prefix433); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DAY.add(DAY32);

                    WHITE_SPACE33=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_global_date_prefix435); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE33);

                    AFTER34=(Token)match(input,AFTER,FOLLOW_AFTER_in_global_date_prefix437); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AFTER.add(AFTER34);

                    WHITE_SPACE35=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_global_date_prefix439); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE35);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 63:7: -> DIRECTION[\">\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:65:5: ( THE WHITE_SPACE )? DAY WHITE_SPACE BEFORE WHITE_SPACE
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:65:5: ( THE WHITE_SPACE )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==THE) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:65:6: THE WHITE_SPACE
                            {
                            THE36=(Token)match(input,THE,FOLLOW_THE_in_global_date_prefix468); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THE.add(THE36);

                            WHITE_SPACE37=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_global_date_prefix470); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE37);


                            }
                            break;

                    }

                    DAY38=(Token)match(input,DAY,FOLLOW_DAY_in_global_date_prefix474); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DAY.add(DAY38);

                    WHITE_SPACE39=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_global_date_prefix476); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE39);

                    BEFORE40=(Token)match(input,BEFORE,FOLLOW_BEFORE_in_global_date_prefix478); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BEFORE.add(BEFORE40);

                    WHITE_SPACE41=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_global_date_prefix480); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE41);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 66:7: -> DIRECTION[\"<\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, "<"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

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

    public static class relaxed_date_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relaxed_date"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:72:1: relaxed_date : ( ( ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year )=> ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year | ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year )=> relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year | ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month | ( THE WHITE_SPACE )? relaxed_month WHITE_SPACE relaxed_day_of_month ) -> ^( EXPLICIT_DATE relaxed_month relaxed_day_of_month ( relaxed_year )? ) ;
    public final DateParser.relaxed_date_return relaxed_date() throws RecognitionException {
        DateParser.relaxed_date_return retval = new DateParser.relaxed_date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THE42=null;
        Token WHITE_SPACE43=null;
        Token WHITE_SPACE45=null;
        Token OF46=null;
        Token WHITE_SPACE47=null;
        Token WHITE_SPACE51=null;
        Token THE54=null;
        Token WHITE_SPACE55=null;
        Token WHITE_SPACE57=null;
        Token OF58=null;
        Token WHITE_SPACE59=null;
        Token THE61=null;
        Token WHITE_SPACE62=null;
        Token WHITE_SPACE64=null;
        DateParser.relaxed_day_of_month_return relaxed_day_of_month44 = null;

        DateParser.relaxed_month_return relaxed_month48 = null;

        DateParser.relaxed_year_return relaxed_year49 = null;

        DateParser.relaxed_month_return relaxed_month50 = null;

        DateParser.relaxed_day_of_month_return relaxed_day_of_month52 = null;

        DateParser.relaxed_year_return relaxed_year53 = null;

        DateParser.relaxed_day_of_month_return relaxed_day_of_month56 = null;

        DateParser.relaxed_month_return relaxed_month60 = null;

        DateParser.relaxed_month_return relaxed_month63 = null;

        DateParser.relaxed_day_of_month_return relaxed_day_of_month65 = null;


        Object THE42_tree=null;
        Object WHITE_SPACE43_tree=null;
        Object WHITE_SPACE45_tree=null;
        Object OF46_tree=null;
        Object WHITE_SPACE47_tree=null;
        Object WHITE_SPACE51_tree=null;
        Object THE54_tree=null;
        Object WHITE_SPACE55_tree=null;
        Object WHITE_SPACE57_tree=null;
        Object OF58_tree=null;
        Object WHITE_SPACE59_tree=null;
        Object THE61_tree=null;
        Object WHITE_SPACE62_tree=null;
        Object WHITE_SPACE64_tree=null;
        RewriteRuleTokenStream stream_THE=new RewriteRuleTokenStream(adaptor,"token THE");
        RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
        RewriteRuleTokenStream stream_WHITE_SPACE=new RewriteRuleTokenStream(adaptor,"token WHITE_SPACE");
        RewriteRuleSubtreeStream stream_relaxed_day_of_month=new RewriteRuleSubtreeStream(adaptor,"rule relaxed_day_of_month");
        RewriteRuleSubtreeStream stream_relaxed_month=new RewriteRuleSubtreeStream(adaptor,"rule relaxed_month");
        RewriteRuleSubtreeStream stream_relaxed_year=new RewriteRuleSubtreeStream(adaptor,"rule relaxed_year");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:73:3: ( ( ( ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year )=> ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year | ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year )=> relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year | ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month | ( THE WHITE_SPACE )? relaxed_month WHITE_SPACE relaxed_day_of_month ) -> ^( EXPLICIT_DATE relaxed_month relaxed_day_of_month ( relaxed_year )? ) )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:73:5: ( ( ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year )=> ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year | ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year )=> relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year | ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month | ( THE WHITE_SPACE )? relaxed_month WHITE_SPACE relaxed_day_of_month )
            {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:73:5: ( ( ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year )=> ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year | ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year )=> relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year | ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month | ( THE WHITE_SPACE )? relaxed_month WHITE_SPACE relaxed_day_of_month )
            int alt22=4;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:77:7: ( ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year )=> ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:78:9: ( THE WHITE_SPACE )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==THE) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:78:10: THE WHITE_SPACE
                            {
                            THE42=(Token)match(input,THE,FOLLOW_THE_in_relaxed_date575); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THE.add(THE42);

                            WHITE_SPACE43=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date577); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE43);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_relaxed_day_of_month_in_relaxed_date581);
                    relaxed_day_of_month44=relaxed_day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_day_of_month.add(relaxed_day_of_month44.getTree());
                    WHITE_SPACE45=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date583); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE45);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:78:61: ( OF WHITE_SPACE )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==OF) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:78:62: OF WHITE_SPACE
                            {
                            OF46=(Token)match(input,OF,FOLLOW_OF_in_relaxed_date586); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OF.add(OF46);

                            WHITE_SPACE47=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date588); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE47);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_relaxed_month_in_relaxed_date592);
                    relaxed_month48=relaxed_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_month.add(relaxed_month48.getTree());
                    pushFollow(FOLLOW_relaxed_year_in_relaxed_date594);
                    relaxed_year49=relaxed_year();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_year.add(relaxed_year49.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:80:9: ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year )=> relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year
                    {
                    pushFollow(FOLLOW_relaxed_month_in_relaxed_date628);
                    relaxed_month50=relaxed_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_month.add(relaxed_month50.getTree());
                    WHITE_SPACE51=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date630); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE51);

                    pushFollow(FOLLOW_relaxed_day_of_month_in_relaxed_date632);
                    relaxed_day_of_month52=relaxed_day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_day_of_month.add(relaxed_day_of_month52.getTree());
                    pushFollow(FOLLOW_relaxed_year_in_relaxed_date634);
                    relaxed_year53=relaxed_year();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_year.add(relaxed_year53.getTree());

                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:83:9: ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:83:9: ( THE WHITE_SPACE )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==THE) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:83:10: THE WHITE_SPACE
                            {
                            THE54=(Token)match(input,THE,FOLLOW_THE_in_relaxed_date650); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THE.add(THE54);

                            WHITE_SPACE55=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date652); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE55);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_relaxed_day_of_month_in_relaxed_date656);
                    relaxed_day_of_month56=relaxed_day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_day_of_month.add(relaxed_day_of_month56.getTree());
                    WHITE_SPACE57=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date658); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE57);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:83:61: ( OF WHITE_SPACE )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==OF) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:83:62: OF WHITE_SPACE
                            {
                            OF58=(Token)match(input,OF,FOLLOW_OF_in_relaxed_date661); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OF.add(OF58);

                            WHITE_SPACE59=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date663); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE59);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_relaxed_month_in_relaxed_date667);
                    relaxed_month60=relaxed_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_month.add(relaxed_month60.getTree());

                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:84:9: ( THE WHITE_SPACE )? relaxed_month WHITE_SPACE relaxed_day_of_month
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:84:9: ( THE WHITE_SPACE )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==THE) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:84:10: THE WHITE_SPACE
                            {
                            THE61=(Token)match(input,THE,FOLLOW_THE_in_relaxed_date678); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THE.add(THE61);

                            WHITE_SPACE62=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date680); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE62);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_relaxed_month_in_relaxed_date684);
                    relaxed_month63=relaxed_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_month.add(relaxed_month63.getTree());
                    WHITE_SPACE64=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date686); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE64);

                    pushFollow(FOLLOW_relaxed_day_of_month_in_relaxed_date688);
                    relaxed_day_of_month65=relaxed_day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_day_of_month.add(relaxed_day_of_month65.getTree());

                    }
                    break;

            }



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
            // 85:7: -> ^( EXPLICIT_DATE relaxed_month relaxed_day_of_month ( relaxed_year )? )
            {
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:85:10: ^( EXPLICIT_DATE relaxed_month relaxed_day_of_month ( relaxed_year )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_1);

                adaptor.addChild(root_1, stream_relaxed_month.nextTree());
                adaptor.addChild(root_1, stream_relaxed_day_of_month.nextTree());
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:85:61: ( relaxed_year )?
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:88:1: relaxed_month : ( JANUARY -> ^( MONTH_OF_YEAR INT[\"1\"] ) | FEBRUARY -> ^( MONTH_OF_YEAR INT[\"2\"] ) | MARCH -> ^( MONTH_OF_YEAR INT[\"3\"] ) | APRIL -> ^( MONTH_OF_YEAR INT[\"4\"] ) | MAY -> ^( MONTH_OF_YEAR INT[\"5\"] ) | JUNE -> ^( MONTH_OF_YEAR INT[\"6\"] ) | JULY -> ^( MONTH_OF_YEAR INT[\"7\"] ) | AUGUST -> ^( MONTH_OF_YEAR INT[\"8\"] ) | SEPTEMBER -> ^( MONTH_OF_YEAR INT[\"9\"] ) | OCTOBER -> ^( MONTH_OF_YEAR INT[\"10\"] ) | NOVEMBER -> ^( MONTH_OF_YEAR INT[\"11\"] ) | DECEMBER -> ^( MONTH_OF_YEAR INT[\"12\"] ) );
    public final DateParser.relaxed_month_return relaxed_month() throws RecognitionException {
        DateParser.relaxed_month_return retval = new DateParser.relaxed_month_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token JANUARY66=null;
        Token FEBRUARY67=null;
        Token MARCH68=null;
        Token APRIL69=null;
        Token MAY70=null;
        Token JUNE71=null;
        Token JULY72=null;
        Token AUGUST73=null;
        Token SEPTEMBER74=null;
        Token OCTOBER75=null;
        Token NOVEMBER76=null;
        Token DECEMBER77=null;

        Object JANUARY66_tree=null;
        Object FEBRUARY67_tree=null;
        Object MARCH68_tree=null;
        Object APRIL69_tree=null;
        Object MAY70_tree=null;
        Object JUNE71_tree=null;
        Object JULY72_tree=null;
        Object AUGUST73_tree=null;
        Object SEPTEMBER74_tree=null;
        Object OCTOBER75_tree=null;
        Object NOVEMBER76_tree=null;
        Object DECEMBER77_tree=null;
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:89:3: ( JANUARY -> ^( MONTH_OF_YEAR INT[\"1\"] ) | FEBRUARY -> ^( MONTH_OF_YEAR INT[\"2\"] ) | MARCH -> ^( MONTH_OF_YEAR INT[\"3\"] ) | APRIL -> ^( MONTH_OF_YEAR INT[\"4\"] ) | MAY -> ^( MONTH_OF_YEAR INT[\"5\"] ) | JUNE -> ^( MONTH_OF_YEAR INT[\"6\"] ) | JULY -> ^( MONTH_OF_YEAR INT[\"7\"] ) | AUGUST -> ^( MONTH_OF_YEAR INT[\"8\"] ) | SEPTEMBER -> ^( MONTH_OF_YEAR INT[\"9\"] ) | OCTOBER -> ^( MONTH_OF_YEAR INT[\"10\"] ) | NOVEMBER -> ^( MONTH_OF_YEAR INT[\"11\"] ) | DECEMBER -> ^( MONTH_OF_YEAR INT[\"12\"] ) )
            int alt23=12;
            switch ( input.LA(1) ) {
            case JANUARY:
                {
                alt23=1;
                }
                break;
            case FEBRUARY:
                {
                alt23=2;
                }
                break;
            case MARCH:
                {
                alt23=3;
                }
                break;
            case APRIL:
                {
                alt23=4;
                }
                break;
            case MAY:
                {
                alt23=5;
                }
                break;
            case JUNE:
                {
                alt23=6;
                }
                break;
            case JULY:
                {
                alt23=7;
                }
                break;
            case AUGUST:
                {
                alt23=8;
                }
                break;
            case SEPTEMBER:
                {
                alt23=9;
                }
                break;
            case OCTOBER:
                {
                alt23=10;
                }
                break;
            case NOVEMBER:
                {
                alt23=11;
                }
                break;
            case DECEMBER:
                {
                alt23=12;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:89:5: JANUARY
                    {
                    JANUARY66=(Token)match(input,JANUARY,FOLLOW_JANUARY_in_relaxed_month720); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_JANUARY.add(JANUARY66);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 89:15: -> ^( MONTH_OF_YEAR INT[\"1\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:89:18: ^( MONTH_OF_YEAR INT[\"1\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:90:5: FEBRUARY
                    {
                    FEBRUARY67=(Token)match(input,FEBRUARY,FOLLOW_FEBRUARY_in_relaxed_month737); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FEBRUARY.add(FEBRUARY67);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 90:15: -> ^( MONTH_OF_YEAR INT[\"2\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:90:18: ^( MONTH_OF_YEAR INT[\"2\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:91:5: MARCH
                    {
                    MARCH68=(Token)match(input,MARCH,FOLLOW_MARCH_in_relaxed_month753); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MARCH.add(MARCH68);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 91:15: -> ^( MONTH_OF_YEAR INT[\"3\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:91:18: ^( MONTH_OF_YEAR INT[\"3\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:92:5: APRIL
                    {
                    APRIL69=(Token)match(input,APRIL,FOLLOW_APRIL_in_relaxed_month772); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_APRIL.add(APRIL69);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 92:15: -> ^( MONTH_OF_YEAR INT[\"4\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:92:18: ^( MONTH_OF_YEAR INT[\"4\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:93:5: MAY
                    {
                    MAY70=(Token)match(input,MAY,FOLLOW_MAY_in_relaxed_month791); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MAY.add(MAY70);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 93:15: -> ^( MONTH_OF_YEAR INT[\"5\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:93:18: ^( MONTH_OF_YEAR INT[\"5\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:94:5: JUNE
                    {
                    JUNE71=(Token)match(input,JUNE,FOLLOW_JUNE_in_relaxed_month812); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_JUNE.add(JUNE71);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 94:15: -> ^( MONTH_OF_YEAR INT[\"6\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:94:18: ^( MONTH_OF_YEAR INT[\"6\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:95:5: JULY
                    {
                    JULY72=(Token)match(input,JULY,FOLLOW_JULY_in_relaxed_month832); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_JULY.add(JULY72);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 95:15: -> ^( MONTH_OF_YEAR INT[\"7\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:95:18: ^( MONTH_OF_YEAR INT[\"7\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:96:5: AUGUST
                    {
                    AUGUST73=(Token)match(input,AUGUST,FOLLOW_AUGUST_in_relaxed_month852); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AUGUST.add(AUGUST73);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 96:15: -> ^( MONTH_OF_YEAR INT[\"8\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:96:18: ^( MONTH_OF_YEAR INT[\"8\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:97:5: SEPTEMBER
                    {
                    SEPTEMBER74=(Token)match(input,SEPTEMBER,FOLLOW_SEPTEMBER_in_relaxed_month870); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEPTEMBER.add(SEPTEMBER74);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 97:15: -> ^( MONTH_OF_YEAR INT[\"9\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:97:18: ^( MONTH_OF_YEAR INT[\"9\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:98:5: OCTOBER
                    {
                    OCTOBER75=(Token)match(input,OCTOBER,FOLLOW_OCTOBER_in_relaxed_month885); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OCTOBER.add(OCTOBER75);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 98:15: -> ^( MONTH_OF_YEAR INT[\"10\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:98:18: ^( MONTH_OF_YEAR INT[\"10\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:99:5: NOVEMBER
                    {
                    NOVEMBER76=(Token)match(input,NOVEMBER,FOLLOW_NOVEMBER_in_relaxed_month902); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOVEMBER.add(NOVEMBER76);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 99:15: -> ^( MONTH_OF_YEAR INT[\"11\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:99:18: ^( MONTH_OF_YEAR INT[\"11\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:100:5: DECEMBER
                    {
                    DECEMBER77=(Token)match(input,DECEMBER,FOLLOW_DECEMBER_in_relaxed_month918); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DECEMBER.add(DECEMBER77);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 100:15: -> ^( MONTH_OF_YEAR INT[\"12\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:100:18: ^( MONTH_OF_YEAR INT[\"12\"] )
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:103:1: relaxed_day_of_month : ( spelled_or_int_01_to_31_optional_prefix -> ^( DAY_OF_MONTH spelled_or_int_01_to_31_optional_prefix ) | spelled_first_to_thirty_first -> ^( DAY_OF_MONTH spelled_first_to_thirty_first ) );
    public final DateParser.relaxed_day_of_month_return relaxed_day_of_month() throws RecognitionException {
        DateParser.relaxed_day_of_month_return retval = new DateParser.relaxed_day_of_month_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.spelled_or_int_01_to_31_optional_prefix_return spelled_or_int_01_to_31_optional_prefix78 = null;

        DateParser.spelled_first_to_thirty_first_return spelled_first_to_thirty_first79 = null;


        RewriteRuleSubtreeStream stream_spelled_first_to_thirty_first=new RewriteRuleSubtreeStream(adaptor,"rule spelled_first_to_thirty_first");
        RewriteRuleSubtreeStream stream_spelled_or_int_01_to_31_optional_prefix=new RewriteRuleSubtreeStream(adaptor,"rule spelled_or_int_01_to_31_optional_prefix");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:104:3: ( spelled_or_int_01_to_31_optional_prefix -> ^( DAY_OF_MONTH spelled_or_int_01_to_31_optional_prefix ) | spelled_first_to_thirty_first -> ^( DAY_OF_MONTH spelled_first_to_thirty_first ) )
            int alt24=2;
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
                alt24=1;
                }
                break;
            case TWENTY:
                {
                switch ( input.LA(2) ) {
                case DASH:
                    {
                    int LA24_5 = input.LA(3);

                    if ( ((LA24_5>=ONE && LA24_5<=NINE)) ) {
                        alt24=1;
                    }
                    else if ( ((LA24_5>=FIRST && LA24_5<=NINTH)) ) {
                        alt24=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case WHITE_SPACE:
                    {
                    int LA24_6 = input.LA(3);

                    if ( (LA24_6==AT||(LA24_6>=OF && LA24_6<=IN)||(LA24_6>=NOON && LA24_6<=NINE)) ) {
                        alt24=1;
                    }
                    else if ( ((LA24_6>=FIRST && LA24_6<=NINTH)) ) {
                        alt24=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 6, input);

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
                    alt24=2;
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
                    alt24=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 2, input);

                    throw nvae;
                }

                }
                break;
            case THIRTY:
                {
                switch ( input.LA(2) ) {
                case WHITE_SPACE:
                    {
                    int LA24_7 = input.LA(3);

                    if ( (LA24_7==AT||(LA24_7>=OF && LA24_7<=IN)||(LA24_7>=NOON && LA24_7<=ONE)) ) {
                        alt24=1;
                    }
                    else if ( (LA24_7==FIRST) ) {
                        alt24=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 7, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case COMMA:
                case ONE:
                    {
                    alt24=1;
                    }
                    break;
                case DASH:
                    {
                    int LA24_8 = input.LA(3);

                    if ( (LA24_8==ONE) ) {
                        alt24=1;
                    }
                    else if ( (LA24_8==FIRST) ) {
                        alt24=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 8, input);

                        throw nvae;
                    }
                    }
                    break;
                case FIRST:
                    {
                    alt24=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 3, input);

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
                alt24=2;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:104:5: spelled_or_int_01_to_31_optional_prefix
                    {
                    pushFollow(FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_relaxed_day_of_month943);
                    spelled_or_int_01_to_31_optional_prefix78=spelled_or_int_01_to_31_optional_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_or_int_01_to_31_optional_prefix.add(spelled_or_int_01_to_31_optional_prefix78.getTree());


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
                    // 105:7: -> ^( DAY_OF_MONTH spelled_or_int_01_to_31_optional_prefix )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:105:10: ^( DAY_OF_MONTH spelled_or_int_01_to_31_optional_prefix )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:107:5: spelled_first_to_thirty_first
                    {
                    pushFollow(FOLLOW_spelled_first_to_thirty_first_in_relaxed_day_of_month970);
                    spelled_first_to_thirty_first79=spelled_first_to_thirty_first();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_first_to_thirty_first.add(spelled_first_to_thirty_first79.getTree());


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
                    // 108:7: -> ^( DAY_OF_MONTH spelled_first_to_thirty_first )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:108:10: ^( DAY_OF_MONTH spelled_first_to_thirty_first )
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:111:1: relaxed_year : ( relaxed_year_prefix ( SINGLE_QUOTE )? int_00_to_99_mandatory_prefix -> ^( YEAR_OF int_00_to_99_mandatory_prefix ) | relaxed_year_prefix int_four_digits -> ^( YEAR_OF int_four_digits ) );
    public final DateParser.relaxed_year_return relaxed_year() throws RecognitionException {
        DateParser.relaxed_year_return retval = new DateParser.relaxed_year_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SINGLE_QUOTE81=null;
        DateParser.relaxed_year_prefix_return relaxed_year_prefix80 = null;

        DateParser.int_00_to_99_mandatory_prefix_return int_00_to_99_mandatory_prefix82 = null;

        DateParser.relaxed_year_prefix_return relaxed_year_prefix83 = null;

        DateParser.int_four_digits_return int_four_digits84 = null;


        Object SINGLE_QUOTE81_tree=null;
        RewriteRuleTokenStream stream_SINGLE_QUOTE=new RewriteRuleTokenStream(adaptor,"token SINGLE_QUOTE");
        RewriteRuleSubtreeStream stream_relaxed_year_prefix=new RewriteRuleSubtreeStream(adaptor,"rule relaxed_year_prefix");
        RewriteRuleSubtreeStream stream_int_four_digits=new RewriteRuleSubtreeStream(adaptor,"rule int_four_digits");
        RewriteRuleSubtreeStream stream_int_00_to_99_mandatory_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_00_to_99_mandatory_prefix");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:112:3: ( relaxed_year_prefix ( SINGLE_QUOTE )? int_00_to_99_mandatory_prefix -> ^( YEAR_OF int_00_to_99_mandatory_prefix ) | relaxed_year_prefix int_four_digits -> ^( YEAR_OF int_four_digits ) )
            int alt26=2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:112:5: relaxed_year_prefix ( SINGLE_QUOTE )? int_00_to_99_mandatory_prefix
                    {
                    pushFollow(FOLLOW_relaxed_year_prefix_in_relaxed_year1000);
                    relaxed_year_prefix80=relaxed_year_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_year_prefix.add(relaxed_year_prefix80.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:112:25: ( SINGLE_QUOTE )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==SINGLE_QUOTE) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:112:25: SINGLE_QUOTE
                            {
                            SINGLE_QUOTE81=(Token)match(input,SINGLE_QUOTE,FOLLOW_SINGLE_QUOTE_in_relaxed_year1002); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SINGLE_QUOTE.add(SINGLE_QUOTE81);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_int_00_to_99_mandatory_prefix_in_relaxed_year1005);
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
                    // 113:7: -> ^( YEAR_OF int_00_to_99_mandatory_prefix )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:113:10: ^( YEAR_OF int_00_to_99_mandatory_prefix )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:115:5: relaxed_year_prefix int_four_digits
                    {
                    pushFollow(FOLLOW_relaxed_year_prefix_in_relaxed_year1032);
                    relaxed_year_prefix83=relaxed_year_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_year_prefix.add(relaxed_year_prefix83.getTree());
                    pushFollow(FOLLOW_int_four_digits_in_relaxed_year1034);
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
                    // 116:7: -> ^( YEAR_OF int_four_digits )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:116:10: ^( YEAR_OF int_four_digits )
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:119:1: relaxed_year_prefix : ( COMMA ( WHITE_SPACE )? | WHITE_SPACE ) ( IN WHITE_SPACE THE WHITE_SPACE YEAR WHITE_SPACE )? ;
    public final DateParser.relaxed_year_prefix_return relaxed_year_prefix() throws RecognitionException {
        DateParser.relaxed_year_prefix_return retval = new DateParser.relaxed_year_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA85=null;
        Token WHITE_SPACE86=null;
        Token WHITE_SPACE87=null;
        Token IN88=null;
        Token WHITE_SPACE89=null;
        Token THE90=null;
        Token WHITE_SPACE91=null;
        Token YEAR92=null;
        Token WHITE_SPACE93=null;

        Object COMMA85_tree=null;
        Object WHITE_SPACE86_tree=null;
        Object WHITE_SPACE87_tree=null;
        Object IN88_tree=null;
        Object WHITE_SPACE89_tree=null;
        Object THE90_tree=null;
        Object WHITE_SPACE91_tree=null;
        Object YEAR92_tree=null;
        Object WHITE_SPACE93_tree=null;

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:120:3: ( ( COMMA ( WHITE_SPACE )? | WHITE_SPACE ) ( IN WHITE_SPACE THE WHITE_SPACE YEAR WHITE_SPACE )? )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:120:5: ( COMMA ( WHITE_SPACE )? | WHITE_SPACE ) ( IN WHITE_SPACE THE WHITE_SPACE YEAR WHITE_SPACE )?
            {
            root_0 = (Object)adaptor.nil();

            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:120:5: ( COMMA ( WHITE_SPACE )? | WHITE_SPACE )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==COMMA) ) {
                alt28=1;
            }
            else if ( (LA28_0==WHITE_SPACE) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:120:6: COMMA ( WHITE_SPACE )?
                    {
                    COMMA85=(Token)match(input,COMMA,FOLLOW_COMMA_in_relaxed_year_prefix1064); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COMMA85_tree = (Object)adaptor.create(COMMA85);
                    adaptor.addChild(root_0, COMMA85_tree);
                    }
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:120:12: ( WHITE_SPACE )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==WHITE_SPACE) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:120:12: WHITE_SPACE
                            {
                            WHITE_SPACE86=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1066); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            WHITE_SPACE86_tree = (Object)adaptor.create(WHITE_SPACE86);
                            adaptor.addChild(root_0, WHITE_SPACE86_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:120:27: WHITE_SPACE
                    {
                    WHITE_SPACE87=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1071); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHITE_SPACE87_tree = (Object)adaptor.create(WHITE_SPACE87);
                    adaptor.addChild(root_0, WHITE_SPACE87_tree);
                    }

                    }
                    break;

            }

            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:120:40: ( IN WHITE_SPACE THE WHITE_SPACE YEAR WHITE_SPACE )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==IN) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:120:41: IN WHITE_SPACE THE WHITE_SPACE YEAR WHITE_SPACE
                    {
                    IN88=(Token)match(input,IN,FOLLOW_IN_in_relaxed_year_prefix1075); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IN88_tree = (Object)adaptor.create(IN88);
                    adaptor.addChild(root_0, IN88_tree);
                    }
                    WHITE_SPACE89=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1077); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHITE_SPACE89_tree = (Object)adaptor.create(WHITE_SPACE89);
                    adaptor.addChild(root_0, WHITE_SPACE89_tree);
                    }
                    THE90=(Token)match(input,THE,FOLLOW_THE_in_relaxed_year_prefix1079); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THE90_tree = (Object)adaptor.create(THE90);
                    adaptor.addChild(root_0, THE90_tree);
                    }
                    WHITE_SPACE91=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1081); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHITE_SPACE91_tree = (Object)adaptor.create(WHITE_SPACE91);
                    adaptor.addChild(root_0, WHITE_SPACE91_tree);
                    }
                    YEAR92=(Token)match(input,YEAR,FOLLOW_YEAR_in_relaxed_year_prefix1083); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    YEAR92_tree = (Object)adaptor.create(YEAR92);
                    adaptor.addChild(root_0, YEAR92_tree);
                    }
                    WHITE_SPACE93=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1085); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHITE_SPACE93_tree = (Object)adaptor.create(WHITE_SPACE93);
                    adaptor.addChild(root_0, WHITE_SPACE93_tree);
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:125:1: formal_date : ( formal_year_four_digits formal_date_separator formal_month_of_year formal_date_separator formal_day_of_month -> ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month formal_year_four_digits ) | formal_month_of_year formal_date_separator formal_day_of_month ( formal_date_separator formal_year )? -> ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month ( formal_year )? ) );
    public final DateParser.formal_date_return formal_date() throws RecognitionException {
        DateParser.formal_date_return retval = new DateParser.formal_date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.formal_year_four_digits_return formal_year_four_digits94 = null;

        DateParser.formal_date_separator_return formal_date_separator95 = null;

        DateParser.formal_month_of_year_return formal_month_of_year96 = null;

        DateParser.formal_date_separator_return formal_date_separator97 = null;

        DateParser.formal_day_of_month_return formal_day_of_month98 = null;

        DateParser.formal_month_of_year_return formal_month_of_year99 = null;

        DateParser.formal_date_separator_return formal_date_separator100 = null;

        DateParser.formal_day_of_month_return formal_day_of_month101 = null;

        DateParser.formal_date_separator_return formal_date_separator102 = null;

        DateParser.formal_year_return formal_year103 = null;


        RewriteRuleSubtreeStream stream_formal_year=new RewriteRuleSubtreeStream(adaptor,"rule formal_year");
        RewriteRuleSubtreeStream stream_formal_day_of_month=new RewriteRuleSubtreeStream(adaptor,"rule formal_day_of_month");
        RewriteRuleSubtreeStream stream_formal_year_four_digits=new RewriteRuleSubtreeStream(adaptor,"rule formal_year_four_digits");
        RewriteRuleSubtreeStream stream_formal_date_separator=new RewriteRuleSubtreeStream(adaptor,"rule formal_date_separator");
        RewriteRuleSubtreeStream stream_formal_month_of_year=new RewriteRuleSubtreeStream(adaptor,"rule formal_month_of_year");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:127:3: ( formal_year_four_digits formal_date_separator formal_month_of_year formal_date_separator formal_day_of_month -> ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month formal_year_four_digits ) | formal_month_of_year formal_date_separator formal_day_of_month ( formal_date_separator formal_year )? -> ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month ( formal_year )? ) )
            int alt31=2;
            switch ( input.LA(1) ) {
            case INT_00:
            case INT_13_TO_23:
            case INT_24_TO_31:
            case INT_32_TO_59:
            case INT_60_TO_99:
                {
                alt31=1;
                }
                break;
            case INT_01_TO_12:
                {
                int LA31_2 = input.LA(2);

                if ( (LA31_2==INT_00||(LA31_2>=INT_01_TO_12 && LA31_2<=INT_60_TO_99)) ) {
                    alt31=1;
                }
                else if ( ((LA31_2>=DASH && LA31_2<=SLASH)) ) {
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
            case INT_1_TO_9:
                {
                alt31=2;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:127:5: formal_year_four_digits formal_date_separator formal_month_of_year formal_date_separator formal_day_of_month
                    {
                    pushFollow(FOLLOW_formal_year_four_digits_in_formal_date1109);
                    formal_year_four_digits94=formal_year_four_digits();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_year_four_digits.add(formal_year_four_digits94.getTree());
                    pushFollow(FOLLOW_formal_date_separator_in_formal_date1111);
                    formal_date_separator95=formal_date_separator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_date_separator.add(formal_date_separator95.getTree());
                    pushFollow(FOLLOW_formal_month_of_year_in_formal_date1113);
                    formal_month_of_year96=formal_month_of_year();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_month_of_year.add(formal_month_of_year96.getTree());
                    pushFollow(FOLLOW_formal_date_separator_in_formal_date1115);
                    formal_date_separator97=formal_date_separator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_date_separator.add(formal_date_separator97.getTree());
                    pushFollow(FOLLOW_formal_day_of_month_in_formal_date1117);
                    formal_day_of_month98=formal_day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_day_of_month.add(formal_day_of_month98.getTree());


                    // AST REWRITE
                    // elements: formal_year_four_digits, formal_day_of_month, formal_month_of_year
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 128:7: -> ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month formal_year_four_digits )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:128:10: ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month formal_year_four_digits )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:131:5: formal_month_of_year formal_date_separator formal_day_of_month ( formal_date_separator formal_year )?
                    {
                    pushFollow(FOLLOW_formal_month_of_year_in_formal_date1146);
                    formal_month_of_year99=formal_month_of_year();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_month_of_year.add(formal_month_of_year99.getTree());
                    pushFollow(FOLLOW_formal_date_separator_in_formal_date1148);
                    formal_date_separator100=formal_date_separator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_date_separator.add(formal_date_separator100.getTree());
                    pushFollow(FOLLOW_formal_day_of_month_in_formal_date1150);
                    formal_day_of_month101=formal_day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_day_of_month.add(formal_day_of_month101.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:131:68: ( formal_date_separator formal_year )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( ((LA30_0>=DASH && LA30_0<=SLASH)) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:131:69: formal_date_separator formal_year
                            {
                            pushFollow(FOLLOW_formal_date_separator_in_formal_date1153);
                            formal_date_separator102=formal_date_separator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_formal_date_separator.add(formal_date_separator102.getTree());
                            pushFollow(FOLLOW_formal_year_in_formal_date1155);
                            formal_year103=formal_year();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_formal_year.add(formal_year103.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: formal_day_of_month, formal_month_of_year, formal_year
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 132:7: -> ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month ( formal_year )? )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:132:10: ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month ( formal_year )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_1);

                        adaptor.addChild(root_1, stream_formal_month_of_year.nextTree());
                        adaptor.addChild(root_1, stream_formal_day_of_month.nextTree());
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:132:67: ( formal_year )?
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:135:1: formal_month_of_year : int_01_to_12_optional_prefix -> ^( MONTH_OF_YEAR int_01_to_12_optional_prefix ) ;
    public final DateParser.formal_month_of_year_return formal_month_of_year() throws RecognitionException {
        DateParser.formal_month_of_year_return retval = new DateParser.formal_month_of_year_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_01_to_12_optional_prefix_return int_01_to_12_optional_prefix104 = null;


        RewriteRuleSubtreeStream stream_int_01_to_12_optional_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_01_to_12_optional_prefix");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:136:3: ( int_01_to_12_optional_prefix -> ^( MONTH_OF_YEAR int_01_to_12_optional_prefix ) )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:136:5: int_01_to_12_optional_prefix
            {
            pushFollow(FOLLOW_int_01_to_12_optional_prefix_in_formal_month_of_year1189);
            int_01_to_12_optional_prefix104=int_01_to_12_optional_prefix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_01_to_12_optional_prefix.add(int_01_to_12_optional_prefix104.getTree());


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
            // 136:34: -> ^( MONTH_OF_YEAR int_01_to_12_optional_prefix )
            {
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:136:37: ^( MONTH_OF_YEAR int_01_to_12_optional_prefix )
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:139:1: formal_day_of_month : int_01_to_31_optional_prefix -> ^( DAY_OF_MONTH int_01_to_31_optional_prefix ) ;
    public final DateParser.formal_day_of_month_return formal_day_of_month() throws RecognitionException {
        DateParser.formal_day_of_month_return retval = new DateParser.formal_day_of_month_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_01_to_31_optional_prefix_return int_01_to_31_optional_prefix105 = null;


        RewriteRuleSubtreeStream stream_int_01_to_31_optional_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_01_to_31_optional_prefix");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:140:3: ( int_01_to_31_optional_prefix -> ^( DAY_OF_MONTH int_01_to_31_optional_prefix ) )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:140:5: int_01_to_31_optional_prefix
            {
            pushFollow(FOLLOW_int_01_to_31_optional_prefix_in_formal_day_of_month1212);
            int_01_to_31_optional_prefix105=int_01_to_31_optional_prefix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_01_to_31_optional_prefix.add(int_01_to_31_optional_prefix105.getTree());


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
            // 140:34: -> ^( DAY_OF_MONTH int_01_to_31_optional_prefix )
            {
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:140:37: ^( DAY_OF_MONTH int_01_to_31_optional_prefix )
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:143:1: formal_year : ( formal_year_four_digits | int_00_to_99_mandatory_prefix -> ^( YEAR_OF int_00_to_99_mandatory_prefix ) );
    public final DateParser.formal_year_return formal_year() throws RecognitionException {
        DateParser.formal_year_return retval = new DateParser.formal_year_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.formal_year_four_digits_return formal_year_four_digits106 = null;

        DateParser.int_00_to_99_mandatory_prefix_return int_00_to_99_mandatory_prefix107 = null;


        RewriteRuleSubtreeStream stream_int_00_to_99_mandatory_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_00_to_99_mandatory_prefix");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:144:3: ( formal_year_four_digits | int_00_to_99_mandatory_prefix -> ^( YEAR_OF int_00_to_99_mandatory_prefix ) )
            int alt32=2;
            switch ( input.LA(1) ) {
            case INT_00:
                {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==INT_00||(LA32_1>=INT_01_TO_12 && LA32_1<=INT_60_TO_99)) ) {
                    alt32=1;
                }
                else if ( (LA32_1==EOF||LA32_1==WHITE_SPACE||LA32_1==COMMA) ) {
                    alt32=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;
                }
                }
                break;
            case INT_01_TO_12:
                {
                int LA32_2 = input.LA(2);

                if ( (LA32_2==INT_00||(LA32_2>=INT_01_TO_12 && LA32_2<=INT_60_TO_99)) ) {
                    alt32=1;
                }
                else if ( (LA32_2==EOF||LA32_2==WHITE_SPACE||LA32_2==COMMA) ) {
                    alt32=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 2, input);

                    throw nvae;
                }
                }
                break;
            case INT_13_TO_23:
                {
                int LA32_3 = input.LA(2);

                if ( (LA32_3==EOF||LA32_3==WHITE_SPACE||LA32_3==COMMA) ) {
                    alt32=2;
                }
                else if ( (LA32_3==INT_00||(LA32_3>=INT_01_TO_12 && LA32_3<=INT_60_TO_99)) ) {
                    alt32=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 3, input);

                    throw nvae;
                }
                }
                break;
            case INT_24_TO_31:
                {
                int LA32_4 = input.LA(2);

                if ( (LA32_4==EOF||LA32_4==WHITE_SPACE||LA32_4==COMMA) ) {
                    alt32=2;
                }
                else if ( (LA32_4==INT_00||(LA32_4>=INT_01_TO_12 && LA32_4<=INT_60_TO_99)) ) {
                    alt32=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 4, input);

                    throw nvae;
                }
                }
                break;
            case INT_32_TO_59:
                {
                int LA32_5 = input.LA(2);

                if ( (LA32_5==EOF||LA32_5==WHITE_SPACE||LA32_5==COMMA) ) {
                    alt32=2;
                }
                else if ( (LA32_5==INT_00||(LA32_5>=INT_01_TO_12 && LA32_5<=INT_60_TO_99)) ) {
                    alt32=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 5, input);

                    throw nvae;
                }
                }
                break;
            case INT_60_TO_99:
                {
                int LA32_6 = input.LA(2);

                if ( (LA32_6==EOF||LA32_6==WHITE_SPACE||LA32_6==COMMA) ) {
                    alt32=2;
                }
                else if ( (LA32_6==INT_00||(LA32_6>=INT_01_TO_12 && LA32_6<=INT_60_TO_99)) ) {
                    alt32=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 6, input);

                    throw nvae;
                }
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:144:5: formal_year_four_digits
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_formal_year_four_digits_in_formal_year1235);
                    formal_year_four_digits106=formal_year_four_digits();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formal_year_four_digits106.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:145:5: int_00_to_99_mandatory_prefix
                    {
                    pushFollow(FOLLOW_int_00_to_99_mandatory_prefix_in_formal_year1241);
                    int_00_to_99_mandatory_prefix107=int_00_to_99_mandatory_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_00_to_99_mandatory_prefix.add(int_00_to_99_mandatory_prefix107.getTree());


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
                    // 145:35: -> ^( YEAR_OF int_00_to_99_mandatory_prefix )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:145:38: ^( YEAR_OF int_00_to_99_mandatory_prefix )
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:148:1: formal_year_four_digits : int_four_digits -> ^( YEAR_OF int_four_digits ) ;
    public final DateParser.formal_year_four_digits_return formal_year_four_digits() throws RecognitionException {
        DateParser.formal_year_four_digits_return retval = new DateParser.formal_year_four_digits_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_four_digits_return int_four_digits108 = null;


        RewriteRuleSubtreeStream stream_int_four_digits=new RewriteRuleSubtreeStream(adaptor,"rule int_four_digits");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:149:3: ( int_four_digits -> ^( YEAR_OF int_four_digits ) )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:149:5: int_four_digits
            {
            pushFollow(FOLLOW_int_four_digits_in_formal_year_four_digits1264);
            int_four_digits108=int_four_digits();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_four_digits.add(int_four_digits108.getTree());


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
            // 149:21: -> ^( YEAR_OF int_four_digits )
            {
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:149:24: ^( YEAR_OF int_four_digits )
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:152:1: formal_date_separator : ( DASH | SLASH );
    public final DateParser.formal_date_separator_return formal_date_separator() throws RecognitionException {
        DateParser.formal_date_separator_return retval = new DateParser.formal_date_separator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set109=null;

        Object set109_tree=null;

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:153:3: ( DASH | SLASH )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:
            {
            root_0 = (Object)adaptor.nil();

            set109=(Token)input.LT(1);
            if ( (input.LA(1)>=DASH && input.LA(1)<=SLASH) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set109));
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:159:1: relative_date : ( relative_prefix WHITE_SPACE relative_target -> ^( RELATIVE_DATE ^( SEEK relative_prefix ) relative_target ) | spelled_or_int_01_to_31_optional_prefix WHITE_SPACE relative_target WHITE_SPACE relative_suffix -> ^( RELATIVE_DATE ^( SEEK relative_suffix spelled_or_int_01_to_31_optional_prefix ) relative_target ) | named_relative_date );
    public final DateParser.relative_date_return relative_date() throws RecognitionException {
        DateParser.relative_date_return retval = new DateParser.relative_date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHITE_SPACE111=null;
        Token WHITE_SPACE114=null;
        Token WHITE_SPACE116=null;
        DateParser.relative_prefix_return relative_prefix110 = null;

        DateParser.relative_target_return relative_target112 = null;

        DateParser.spelled_or_int_01_to_31_optional_prefix_return spelled_or_int_01_to_31_optional_prefix113 = null;

        DateParser.relative_target_return relative_target115 = null;

        DateParser.relative_suffix_return relative_suffix117 = null;

        DateParser.named_relative_date_return named_relative_date118 = null;


        Object WHITE_SPACE111_tree=null;
        Object WHITE_SPACE114_tree=null;
        Object WHITE_SPACE116_tree=null;
        RewriteRuleTokenStream stream_WHITE_SPACE=new RewriteRuleTokenStream(adaptor,"token WHITE_SPACE");
        RewriteRuleSubtreeStream stream_relative_suffix=new RewriteRuleSubtreeStream(adaptor,"rule relative_suffix");
        RewriteRuleSubtreeStream stream_relative_prefix=new RewriteRuleSubtreeStream(adaptor,"rule relative_prefix");
        RewriteRuleSubtreeStream stream_spelled_or_int_01_to_31_optional_prefix=new RewriteRuleSubtreeStream(adaptor,"rule spelled_or_int_01_to_31_optional_prefix");
        RewriteRuleSubtreeStream stream_relative_target=new RewriteRuleSubtreeStream(adaptor,"rule relative_target");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:160:3: ( relative_prefix WHITE_SPACE relative_target -> ^( RELATIVE_DATE ^( SEEK relative_prefix ) relative_target ) | spelled_or_int_01_to_31_optional_prefix WHITE_SPACE relative_target WHITE_SPACE relative_suffix -> ^( RELATIVE_DATE ^( SEEK relative_suffix spelled_or_int_01_to_31_optional_prefix ) relative_target ) | named_relative_date )
            int alt33=3;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:160:5: relative_prefix WHITE_SPACE relative_target
                    {
                    pushFollow(FOLLOW_relative_prefix_in_relative_date1313);
                    relative_prefix110=relative_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_prefix.add(relative_prefix110.getTree());
                    WHITE_SPACE111=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_date1315); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE111);

                    pushFollow(FOLLOW_relative_target_in_relative_date1317);
                    relative_target112=relative_target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_target.add(relative_target112.getTree());


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
                    // 161:7: -> ^( RELATIVE_DATE ^( SEEK relative_prefix ) relative_target )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:161:10: ^( RELATIVE_DATE ^( SEEK relative_prefix ) relative_target )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:161:26: ^( SEEK relative_prefix )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEEK, "SEEK"), root_2);

                        adaptor.addChild(root_2, stream_relative_prefix.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_relative_target.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:163:5: spelled_or_int_01_to_31_optional_prefix WHITE_SPACE relative_target WHITE_SPACE relative_suffix
                    {
                    pushFollow(FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_relative_date1351);
                    spelled_or_int_01_to_31_optional_prefix113=spelled_or_int_01_to_31_optional_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_or_int_01_to_31_optional_prefix.add(spelled_or_int_01_to_31_optional_prefix113.getTree());
                    WHITE_SPACE114=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_date1353); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE114);

                    pushFollow(FOLLOW_relative_target_in_relative_date1355);
                    relative_target115=relative_target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_target.add(relative_target115.getTree());
                    WHITE_SPACE116=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_date1357); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE116);

                    pushFollow(FOLLOW_relative_suffix_in_relative_date1359);
                    relative_suffix117=relative_suffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_suffix.add(relative_suffix117.getTree());


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
                    // 164:7: -> ^( RELATIVE_DATE ^( SEEK relative_suffix spelled_or_int_01_to_31_optional_prefix ) relative_target )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:164:10: ^( RELATIVE_DATE ^( SEEK relative_suffix spelled_or_int_01_to_31_optional_prefix ) relative_target )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:164:26: ^( SEEK relative_suffix spelled_or_int_01_to_31_optional_prefix )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEEK, "SEEK"), root_2);

                        adaptor.addChild(root_2, stream_relative_suffix.nextTree());
                        adaptor.addChild(root_2, stream_spelled_or_int_01_to_31_optional_prefix.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_relative_target.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:166:5: named_relative_date
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_named_relative_date_in_relative_date1395);
                    named_relative_date118=named_relative_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, named_relative_date118.getTree());

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:169:1: relative_target : ( day_of_week | relative_date_span );
    public final DateParser.relative_target_return relative_target() throws RecognitionException {
        DateParser.relative_target_return retval = new DateParser.relative_target_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.day_of_week_return day_of_week119 = null;

        DateParser.relative_date_span_return relative_date_span120 = null;



        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:170:3: ( day_of_week | relative_date_span )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=SUNDAY && LA34_0<=SATURDAY)) ) {
                alt34=1;
            }
            else if ( (LA34_0==DAY||LA34_0==YEAR||(LA34_0>=WEEK && LA34_0<=MONTH)) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:170:5: day_of_week
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_day_of_week_in_relative_target1411);
                    day_of_week119=day_of_week();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, day_of_week119.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:171:5: relative_date_span
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_relative_date_span_in_relative_target1418);
                    relative_date_span120=relative_date_span();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, relative_date_span120.getTree());

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:174:1: relative_prefix : ( ( THIS WHITE_SPACE )? LAST -> DIRECTION[\"<\"] SEEK_BY[\"by_week\"] INT[\"1\"] | ( THIS WHITE_SPACE )? NEXT -> DIRECTION[\">\"] SEEK_BY[\"by_week\"] INT[\"1\"] | ( THIS WHITE_SPACE )? PAST -> DIRECTION[\"<\"] SEEK_BY[\"by_day\"] INT[\"1\"] | ( THIS WHITE_SPACE )? COMING -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"] | ( THIS WHITE_SPACE )? UPCOMING -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"] | ( IN WHITE_SPACE )? spelled_or_int_01_to_31_optional_prefix -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] spelled_or_int_01_to_31_optional_prefix );
    public final DateParser.relative_prefix_return relative_prefix() throws RecognitionException {
        DateParser.relative_prefix_return retval = new DateParser.relative_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THIS121=null;
        Token WHITE_SPACE122=null;
        Token LAST123=null;
        Token THIS124=null;
        Token WHITE_SPACE125=null;
        Token NEXT126=null;
        Token THIS127=null;
        Token WHITE_SPACE128=null;
        Token PAST129=null;
        Token THIS130=null;
        Token WHITE_SPACE131=null;
        Token COMING132=null;
        Token THIS133=null;
        Token WHITE_SPACE134=null;
        Token UPCOMING135=null;
        Token IN136=null;
        Token WHITE_SPACE137=null;
        DateParser.spelled_or_int_01_to_31_optional_prefix_return spelled_or_int_01_to_31_optional_prefix138 = null;


        Object THIS121_tree=null;
        Object WHITE_SPACE122_tree=null;
        Object LAST123_tree=null;
        Object THIS124_tree=null;
        Object WHITE_SPACE125_tree=null;
        Object NEXT126_tree=null;
        Object THIS127_tree=null;
        Object WHITE_SPACE128_tree=null;
        Object PAST129_tree=null;
        Object THIS130_tree=null;
        Object WHITE_SPACE131_tree=null;
        Object COMING132_tree=null;
        Object THIS133_tree=null;
        Object WHITE_SPACE134_tree=null;
        Object UPCOMING135_tree=null;
        Object IN136_tree=null;
        Object WHITE_SPACE137_tree=null;
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:175:3: ( ( THIS WHITE_SPACE )? LAST -> DIRECTION[\"<\"] SEEK_BY[\"by_week\"] INT[\"1\"] | ( THIS WHITE_SPACE )? NEXT -> DIRECTION[\">\"] SEEK_BY[\"by_week\"] INT[\"1\"] | ( THIS WHITE_SPACE )? PAST -> DIRECTION[\"<\"] SEEK_BY[\"by_day\"] INT[\"1\"] | ( THIS WHITE_SPACE )? COMING -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"] | ( THIS WHITE_SPACE )? UPCOMING -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"] | ( IN WHITE_SPACE )? spelled_or_int_01_to_31_optional_prefix -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] spelled_or_int_01_to_31_optional_prefix )
            int alt41=6;
            switch ( input.LA(1) ) {
            case THIS:
                {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==WHITE_SPACE) ) {
                    switch ( input.LA(3) ) {
                    case COMING:
                        {
                        alt41=4;
                        }
                        break;
                    case NEXT:
                        {
                        alt41=2;
                        }
                        break;
                    case PAST:
                        {
                        alt41=3;
                        }
                        break;
                    case UPCOMING:
                        {
                        alt41=5;
                        }
                        break;
                    case LAST:
                        {
                        alt41=1;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 8, input);

                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;
                }
                }
                break;
            case LAST:
                {
                alt41=1;
                }
                break;
            case NEXT:
                {
                alt41=2;
                }
                break;
            case PAST:
                {
                alt41=3;
                }
                break;
            case COMING:
                {
                alt41=4;
                }
                break;
            case UPCOMING:
                {
                alt41=5;
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
                alt41=6;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:175:5: ( THIS WHITE_SPACE )? LAST
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:175:5: ( THIS WHITE_SPACE )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==THIS) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:175:6: THIS WHITE_SPACE
                            {
                            THIS121=(Token)match(input,THIS,FOLLOW_THIS_in_relative_prefix1434); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS121);

                            WHITE_SPACE122=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_prefix1436); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE122);


                            }
                            break;

                    }

                    LAST123=(Token)match(input,LAST,FOLLOW_LAST_in_relative_prefix1440); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LAST.add(LAST123);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 175:34: -> DIRECTION[\"<\"] SEEK_BY[\"by_week\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, "<"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_BY, "by_week"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:176:5: ( THIS WHITE_SPACE )? NEXT
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:176:5: ( THIS WHITE_SPACE )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==THIS) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:176:6: THIS WHITE_SPACE
                            {
                            THIS124=(Token)match(input,THIS,FOLLOW_THIS_in_relative_prefix1462); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS124);

                            WHITE_SPACE125=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_prefix1464); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE125);


                            }
                            break;

                    }

                    NEXT126=(Token)match(input,NEXT,FOLLOW_NEXT_in_relative_prefix1468); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEXT.add(NEXT126);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 176:34: -> DIRECTION[\">\"] SEEK_BY[\"by_week\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_BY, "by_week"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:177:5: ( THIS WHITE_SPACE )? PAST
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:177:5: ( THIS WHITE_SPACE )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==THIS) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:177:6: THIS WHITE_SPACE
                            {
                            THIS127=(Token)match(input,THIS,FOLLOW_THIS_in_relative_prefix1490); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS127);

                            WHITE_SPACE128=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_prefix1492); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE128);


                            }
                            break;

                    }

                    PAST129=(Token)match(input,PAST,FOLLOW_PAST_in_relative_prefix1496); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAST.add(PAST129);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 177:34: -> DIRECTION[\"<\"] SEEK_BY[\"by_day\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, "<"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_BY, "by_day"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:178:5: ( THIS WHITE_SPACE )? COMING
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:178:5: ( THIS WHITE_SPACE )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==THIS) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:178:6: THIS WHITE_SPACE
                            {
                            THIS130=(Token)match(input,THIS,FOLLOW_THIS_in_relative_prefix1518); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS130);

                            WHITE_SPACE131=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_prefix1520); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE131);


                            }
                            break;

                    }

                    COMING132=(Token)match(input,COMING,FOLLOW_COMING_in_relative_prefix1524); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMING.add(COMING132);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 178:34: -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_BY, "by_day"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:179:5: ( THIS WHITE_SPACE )? UPCOMING
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:179:5: ( THIS WHITE_SPACE )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==THIS) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:179:6: THIS WHITE_SPACE
                            {
                            THIS133=(Token)match(input,THIS,FOLLOW_THIS_in_relative_prefix1544); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS133);

                            WHITE_SPACE134=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_prefix1546); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE134);


                            }
                            break;

                    }

                    UPCOMING135=(Token)match(input,UPCOMING,FOLLOW_UPCOMING_in_relative_prefix1550); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UPCOMING.add(UPCOMING135);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 179:34: -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_BY, "by_day"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:180:5: ( IN WHITE_SPACE )? spelled_or_int_01_to_31_optional_prefix
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:180:5: ( IN WHITE_SPACE )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==IN) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:180:6: IN WHITE_SPACE
                            {
                            IN136=(Token)match(input,IN,FOLLOW_IN_in_relative_prefix1568); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IN.add(IN136);

                            WHITE_SPACE137=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_prefix1570); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE137);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_relative_prefix1574);
                    spelled_or_int_01_to_31_optional_prefix138=spelled_or_int_01_to_31_optional_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_or_int_01_to_31_optional_prefix.add(spelled_or_int_01_to_31_optional_prefix138.getTree());


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
                    // 181:7: -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] spelled_or_int_01_to_31_optional_prefix
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:184:1: relative_suffix : ( FROM WHITE_SPACE NOW -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] | AGO -> DIRECTION[\"<\"] SEEK_BY[\"by_day\"] );
    public final DateParser.relative_suffix_return relative_suffix() throws RecognitionException {
        DateParser.relative_suffix_return retval = new DateParser.relative_suffix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FROM139=null;
        Token WHITE_SPACE140=null;
        Token NOW141=null;
        Token AGO142=null;

        Object FROM139_tree=null;
        Object WHITE_SPACE140_tree=null;
        Object NOW141_tree=null;
        Object AGO142_tree=null;
        RewriteRuleTokenStream stream_AGO=new RewriteRuleTokenStream(adaptor,"token AGO");
        RewriteRuleTokenStream stream_NOW=new RewriteRuleTokenStream(adaptor,"token NOW");
        RewriteRuleTokenStream stream_FROM=new RewriteRuleTokenStream(adaptor,"token FROM");
        RewriteRuleTokenStream stream_WHITE_SPACE=new RewriteRuleTokenStream(adaptor,"token WHITE_SPACE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:185:3: ( FROM WHITE_SPACE NOW -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] | AGO -> DIRECTION[\"<\"] SEEK_BY[\"by_day\"] )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==FROM) ) {
                alt42=1;
            }
            else if ( (LA42_0==AGO) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:185:5: FROM WHITE_SPACE NOW
                    {
                    FROM139=(Token)match(input,FROM,FOLLOW_FROM_in_relative_suffix1606); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FROM.add(FROM139);

                    WHITE_SPACE140=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_suffix1608); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE140);

                    NOW141=(Token)match(input,NOW,FOLLOW_NOW_in_relative_suffix1610); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOW.add(NOW141);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 185:26: -> DIRECTION[\">\"] SEEK_BY[\"by_day\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_BY, "by_day"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:186:5: AGO
                    {
                    AGO142=(Token)match(input,AGO,FOLLOW_AGO_in_relative_suffix1624); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AGO.add(AGO142);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 186:26: -> DIRECTION[\"<\"] SEEK_BY[\"by_day\"]
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:189:1: relative_date_span : ( DAY -> SPAN[\"day\"] | WEEK -> SPAN[\"week\"] | MONTH -> SPAN[\"month\"] | YEAR -> SPAN[\"year\"] );
    public final DateParser.relative_date_span_return relative_date_span() throws RecognitionException {
        DateParser.relative_date_span_return retval = new DateParser.relative_date_span_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DAY143=null;
        Token WEEK144=null;
        Token MONTH145=null;
        Token YEAR146=null;

        Object DAY143_tree=null;
        Object WEEK144_tree=null;
        Object MONTH145_tree=null;
        Object YEAR146_tree=null;
        RewriteRuleTokenStream stream_WEEK=new RewriteRuleTokenStream(adaptor,"token WEEK");
        RewriteRuleTokenStream stream_DAY=new RewriteRuleTokenStream(adaptor,"token DAY");
        RewriteRuleTokenStream stream_YEAR=new RewriteRuleTokenStream(adaptor,"token YEAR");
        RewriteRuleTokenStream stream_MONTH=new RewriteRuleTokenStream(adaptor,"token MONTH");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:190:3: ( DAY -> SPAN[\"day\"] | WEEK -> SPAN[\"week\"] | MONTH -> SPAN[\"month\"] | YEAR -> SPAN[\"year\"] )
            int alt43=4;
            switch ( input.LA(1) ) {
            case DAY:
                {
                alt43=1;
                }
                break;
            case WEEK:
                {
                alt43=2;
                }
                break;
            case MONTH:
                {
                alt43=3;
                }
                break;
            case YEAR:
                {
                alt43=4;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:190:5: DAY
                    {
                    DAY143=(Token)match(input,DAY,FOLLOW_DAY_in_relative_date_span1664); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DAY.add(DAY143);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 190:11: -> SPAN[\"day\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SPAN, "day"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:191:5: WEEK
                    {
                    WEEK144=(Token)match(input,WEEK,FOLLOW_WEEK_in_relative_date_span1677); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WEEK.add(WEEK144);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 191:11: -> SPAN[\"week\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SPAN, "week"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:192:5: MONTH
                    {
                    MONTH145=(Token)match(input,MONTH,FOLLOW_MONTH_in_relative_date_span1689); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MONTH.add(MONTH145);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 192:11: -> SPAN[\"month\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SPAN, "month"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:193:5: YEAR
                    {
                    YEAR146=(Token)match(input,YEAR,FOLLOW_YEAR_in_relative_date_span1700); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_YEAR.add(YEAR146);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 193:11: -> SPAN[\"year\"]
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:196:1: day_of_week : ( SUNDAY -> ^( DAY_OF_WEEK INT[\"1\"] ) | MONDAY -> ^( DAY_OF_WEEK INT[\"2\"] ) | TUESDAY -> ^( DAY_OF_WEEK INT[\"3\"] ) | WEDNESDAY -> ^( DAY_OF_WEEK INT[\"4\"] ) | THURSDAY -> ^( DAY_OF_WEEK INT[\"5\"] ) | FRIDAY -> ^( DAY_OF_WEEK INT[\"6\"] ) | SATURDAY -> ^( DAY_OF_WEEK INT[\"7\"] ) );
    public final DateParser.day_of_week_return day_of_week() throws RecognitionException {
        DateParser.day_of_week_return retval = new DateParser.day_of_week_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SUNDAY147=null;
        Token MONDAY148=null;
        Token TUESDAY149=null;
        Token WEDNESDAY150=null;
        Token THURSDAY151=null;
        Token FRIDAY152=null;
        Token SATURDAY153=null;

        Object SUNDAY147_tree=null;
        Object MONDAY148_tree=null;
        Object TUESDAY149_tree=null;
        Object WEDNESDAY150_tree=null;
        Object THURSDAY151_tree=null;
        Object FRIDAY152_tree=null;
        Object SATURDAY153_tree=null;
        RewriteRuleTokenStream stream_MONDAY=new RewriteRuleTokenStream(adaptor,"token MONDAY");
        RewriteRuleTokenStream stream_SUNDAY=new RewriteRuleTokenStream(adaptor,"token SUNDAY");
        RewriteRuleTokenStream stream_WEDNESDAY=new RewriteRuleTokenStream(adaptor,"token WEDNESDAY");
        RewriteRuleTokenStream stream_THURSDAY=new RewriteRuleTokenStream(adaptor,"token THURSDAY");
        RewriteRuleTokenStream stream_SATURDAY=new RewriteRuleTokenStream(adaptor,"token SATURDAY");
        RewriteRuleTokenStream stream_TUESDAY=new RewriteRuleTokenStream(adaptor,"token TUESDAY");
        RewriteRuleTokenStream stream_FRIDAY=new RewriteRuleTokenStream(adaptor,"token FRIDAY");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:197:3: ( SUNDAY -> ^( DAY_OF_WEEK INT[\"1\"] ) | MONDAY -> ^( DAY_OF_WEEK INT[\"2\"] ) | TUESDAY -> ^( DAY_OF_WEEK INT[\"3\"] ) | WEDNESDAY -> ^( DAY_OF_WEEK INT[\"4\"] ) | THURSDAY -> ^( DAY_OF_WEEK INT[\"5\"] ) | FRIDAY -> ^( DAY_OF_WEEK INT[\"6\"] ) | SATURDAY -> ^( DAY_OF_WEEK INT[\"7\"] ) )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:197:5: SUNDAY
                    {
                    SUNDAY147=(Token)match(input,SUNDAY,FOLLOW_SUNDAY_in_day_of_week1720); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUNDAY.add(SUNDAY147);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 197:15: -> ^( DAY_OF_WEEK INT[\"1\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:197:18: ^( DAY_OF_WEEK INT[\"1\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:198:5: MONDAY
                    {
                    MONDAY148=(Token)match(input,MONDAY,FOLLOW_MONDAY_in_day_of_week1738); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MONDAY.add(MONDAY148);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 198:15: -> ^( DAY_OF_WEEK INT[\"2\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:198:18: ^( DAY_OF_WEEK INT[\"2\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:199:5: TUESDAY
                    {
                    TUESDAY149=(Token)match(input,TUESDAY,FOLLOW_TUESDAY_in_day_of_week1756); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TUESDAY.add(TUESDAY149);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 199:15: -> ^( DAY_OF_WEEK INT[\"3\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:199:18: ^( DAY_OF_WEEK INT[\"3\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:200:5: WEDNESDAY
                    {
                    WEDNESDAY150=(Token)match(input,WEDNESDAY,FOLLOW_WEDNESDAY_in_day_of_week1773); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WEDNESDAY.add(WEDNESDAY150);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 200:15: -> ^( DAY_OF_WEEK INT[\"4\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:200:18: ^( DAY_OF_WEEK INT[\"4\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:201:5: THURSDAY
                    {
                    THURSDAY151=(Token)match(input,THURSDAY,FOLLOW_THURSDAY_in_day_of_week1788); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THURSDAY.add(THURSDAY151);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 201:15: -> ^( DAY_OF_WEEK INT[\"5\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:201:18: ^( DAY_OF_WEEK INT[\"5\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:202:5: FRIDAY
                    {
                    FRIDAY152=(Token)match(input,FRIDAY,FOLLOW_FRIDAY_in_day_of_week1804); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FRIDAY.add(FRIDAY152);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 202:15: -> ^( DAY_OF_WEEK INT[\"6\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:202:18: ^( DAY_OF_WEEK INT[\"6\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:203:5: SATURDAY
                    {
                    SATURDAY153=(Token)match(input,SATURDAY,FOLLOW_SATURDAY_in_day_of_week1822); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SATURDAY.add(SATURDAY153);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 203:15: -> ^( DAY_OF_WEEK INT[\"7\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:203:18: ^( DAY_OF_WEEK INT[\"7\"] )
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:206:1: named_relative_date : ( TODAY -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] INT[\"0\"] ) ) | TOMORROW -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] INT[\"1\"] ) ) | YESTERDAY -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\"<\"] INT[\"1\"] ) ) );
    public final DateParser.named_relative_date_return named_relative_date() throws RecognitionException {
        DateParser.named_relative_date_return retval = new DateParser.named_relative_date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TODAY154=null;
        Token TOMORROW155=null;
        Token YESTERDAY156=null;

        Object TODAY154_tree=null;
        Object TOMORROW155_tree=null;
        Object YESTERDAY156_tree=null;
        RewriteRuleTokenStream stream_TODAY=new RewriteRuleTokenStream(adaptor,"token TODAY");
        RewriteRuleTokenStream stream_YESTERDAY=new RewriteRuleTokenStream(adaptor,"token YESTERDAY");
        RewriteRuleTokenStream stream_TOMORROW=new RewriteRuleTokenStream(adaptor,"token TOMORROW");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:207:3: ( TODAY -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] INT[\"0\"] ) ) | TOMORROW -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] INT[\"1\"] ) ) | YESTERDAY -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\"<\"] INT[\"1\"] ) ) )
            int alt45=3;
            switch ( input.LA(1) ) {
            case TODAY:
                {
                alt45=1;
                }
                break;
            case TOMORROW:
                {
                alt45=2;
                }
                break;
            case YESTERDAY:
                {
                alt45=3;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:207:5: TODAY
                    {
                    TODAY154=(Token)match(input,TODAY,FOLLOW_TODAY_in_named_relative_date1847); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TODAY.add(TODAY154);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 207:15: -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] INT[\"0\"] ) )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:207:18: ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] INT[\"0\"] ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:207:34: ^( SEEK DIRECTION[\">\"] INT[\"0\"] )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEEK, "SEEK"), root_2);

                        adaptor.addChild(root_2, (Object)adaptor.create(DIRECTION, ">"));
                        adaptor.addChild(root_2, (Object)adaptor.create(INT, "0"));

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:208:5: TOMORROW
                    {
                    TOMORROW155=(Token)match(input,TOMORROW,FOLLOW_TOMORROW_in_named_relative_date1873); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TOMORROW.add(TOMORROW155);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 208:15: -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] INT[\"1\"] ) )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:208:18: ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] INT[\"1\"] ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:208:34: ^( SEEK DIRECTION[\">\"] INT[\"1\"] )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEEK, "SEEK"), root_2);

                        adaptor.addChild(root_2, (Object)adaptor.create(DIRECTION, ">"));
                        adaptor.addChild(root_2, (Object)adaptor.create(INT, "1"));

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:209:5: YESTERDAY
                    {
                    YESTERDAY156=(Token)match(input,YESTERDAY,FOLLOW_YESTERDAY_in_named_relative_date1896); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_YESTERDAY.add(YESTERDAY156);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 209:15: -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\"<\"] INT[\"1\"] ) )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:209:18: ^( RELATIVE_DATE ^( SEEK DIRECTION[\"<\"] INT[\"1\"] ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:209:34: ^( SEEK DIRECTION[\"<\"] INT[\"1\"] )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEEK, "SEEK"), root_2);

                        adaptor.addChild(root_2, (Object)adaptor.create(DIRECTION, "<"));
                        adaptor.addChild(root_2, (Object)adaptor.create(INT, "1"));

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:215:1: time : ( hours ( COLON )? minutes ( ( WHITE_SPACE )? ( meridian_indicator | ( MILITARY_HOUR_SUFFIX | HOUR ) ) )? -> ^( EXPLICIT_TIME hours minutes ( meridian_indicator )? ) | hours ( WHITE_SPACE )? ( meridian_indicator )? -> ^( EXPLICIT_TIME hours ^( MINUTES_OF_HOUR INT[\"0\"] ) ( meridian_indicator )? ) | named_time );
    public final DateParser.time_return time() throws RecognitionException {
        DateParser.time_return retval = new DateParser.time_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON158=null;
        Token WHITE_SPACE160=null;
        Token MILITARY_HOUR_SUFFIX162=null;
        Token HOUR163=null;
        Token WHITE_SPACE165=null;
        DateParser.hours_return hours157 = null;

        DateParser.minutes_return minutes159 = null;

        DateParser.meridian_indicator_return meridian_indicator161 = null;

        DateParser.hours_return hours164 = null;

        DateParser.meridian_indicator_return meridian_indicator166 = null;

        DateParser.named_time_return named_time167 = null;


        Object COLON158_tree=null;
        Object WHITE_SPACE160_tree=null;
        Object MILITARY_HOUR_SUFFIX162_tree=null;
        Object HOUR163_tree=null;
        Object WHITE_SPACE165_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_HOUR=new RewriteRuleTokenStream(adaptor,"token HOUR");
        RewriteRuleTokenStream stream_MILITARY_HOUR_SUFFIX=new RewriteRuleTokenStream(adaptor,"token MILITARY_HOUR_SUFFIX");
        RewriteRuleTokenStream stream_WHITE_SPACE=new RewriteRuleTokenStream(adaptor,"token WHITE_SPACE");
        RewriteRuleSubtreeStream stream_meridian_indicator=new RewriteRuleSubtreeStream(adaptor,"rule meridian_indicator");
        RewriteRuleSubtreeStream stream_minutes=new RewriteRuleSubtreeStream(adaptor,"rule minutes");
        RewriteRuleSubtreeStream stream_hours=new RewriteRuleSubtreeStream(adaptor,"rule hours");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:216:3: ( hours ( COLON )? minutes ( ( WHITE_SPACE )? ( meridian_indicator | ( MILITARY_HOUR_SUFFIX | HOUR ) ) )? -> ^( EXPLICIT_TIME hours minutes ( meridian_indicator )? ) | hours ( WHITE_SPACE )? ( meridian_indicator )? -> ^( EXPLICIT_TIME hours ^( MINUTES_OF_HOUR INT[\"0\"] ) ( meridian_indicator )? ) | named_time )
            int alt53=3;
            switch ( input.LA(1) ) {
            case INT_0:
                {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==COLON||LA53_1==INT_00||(LA53_1>=INT_01_TO_12 && LA53_1<=INT_32_TO_59)) ) {
                    alt53=1;
                }
                else if ( (LA53_1==EOF||LA53_1==WHITE_SPACE||LA53_1==COMMA||(LA53_1>=AM && LA53_1<=PM)) ) {
                    alt53=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 1, input);

                    throw nvae;
                }
                }
                break;
            case INT_00:
                {
                int LA53_2 = input.LA(2);

                if ( (LA53_2==EOF||LA53_2==WHITE_SPACE||LA53_2==COMMA||(LA53_2>=AM && LA53_2<=PM)) ) {
                    alt53=2;
                }
                else if ( (LA53_2==COLON||LA53_2==INT_00||(LA53_2>=INT_01_TO_12 && LA53_2<=INT_32_TO_59)) ) {
                    alt53=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 2, input);

                    throw nvae;
                }
                }
                break;
            case INT_1_TO_9:
                {
                int LA53_3 = input.LA(2);

                if ( (LA53_3==EOF||LA53_3==WHITE_SPACE||LA53_3==COMMA||(LA53_3>=AM && LA53_3<=PM)) ) {
                    alt53=2;
                }
                else if ( (LA53_3==COLON||LA53_3==INT_00||(LA53_3>=INT_01_TO_12 && LA53_3<=INT_32_TO_59)) ) {
                    alt53=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 3, input);

                    throw nvae;
                }
                }
                break;
            case INT_01_TO_12:
                {
                int LA53_4 = input.LA(2);

                if ( (LA53_4==EOF||LA53_4==WHITE_SPACE||LA53_4==COMMA||(LA53_4>=AM && LA53_4<=PM)) ) {
                    alt53=2;
                }
                else if ( (LA53_4==COLON||LA53_4==INT_00||(LA53_4>=INT_01_TO_12 && LA53_4<=INT_32_TO_59)) ) {
                    alt53=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 4, input);

                    throw nvae;
                }
                }
                break;
            case INT_13_TO_23:
                {
                int LA53_5 = input.LA(2);

                if ( (LA53_5==EOF||LA53_5==WHITE_SPACE||LA53_5==COMMA||(LA53_5>=AM && LA53_5<=PM)) ) {
                    alt53=2;
                }
                else if ( (LA53_5==COLON||LA53_5==INT_00||(LA53_5>=INT_01_TO_12 && LA53_5<=INT_32_TO_59)) ) {
                    alt53=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 5, input);

                    throw nvae;
                }
                }
                break;
            case NOON:
            case MIDNIGHT:
                {
                alt53=3;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:216:5: hours ( COLON )? minutes ( ( WHITE_SPACE )? ( meridian_indicator | ( MILITARY_HOUR_SUFFIX | HOUR ) ) )?
                    {
                    pushFollow(FOLLOW_hours_in_time1930);
                    hours157=hours();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_hours.add(hours157.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:216:11: ( COLON )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==COLON) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:216:11: COLON
                            {
                            COLON158=(Token)match(input,COLON,FOLLOW_COLON_in_time1932); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COLON.add(COLON158);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_minutes_in_time1935);
                    minutes159=minutes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_minutes.add(minutes159.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:216:26: ( ( WHITE_SPACE )? ( meridian_indicator | ( MILITARY_HOUR_SUFFIX | HOUR ) ) )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==WHITE_SPACE) ) {
                        int LA50_1 = input.LA(2);

                        if ( ((LA50_1>=MILITARY_HOUR_SUFFIX && LA50_1<=PM)) ) {
                            alt50=1;
                        }
                    }
                    else if ( ((LA50_0>=MILITARY_HOUR_SUFFIX && LA50_0<=PM)) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:216:27: ( WHITE_SPACE )? ( meridian_indicator | ( MILITARY_HOUR_SUFFIX | HOUR ) )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:216:27: ( WHITE_SPACE )?
                            int alt47=2;
                            int LA47_0 = input.LA(1);

                            if ( (LA47_0==WHITE_SPACE) ) {
                                alt47=1;
                            }
                            switch (alt47) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:216:27: WHITE_SPACE
                                    {
                                    WHITE_SPACE160=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_time1938); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE160);


                                    }
                                    break;

                            }

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:216:40: ( meridian_indicator | ( MILITARY_HOUR_SUFFIX | HOUR ) )
                            int alt49=2;
                            int LA49_0 = input.LA(1);

                            if ( ((LA49_0>=AM && LA49_0<=PM)) ) {
                                alt49=1;
                            }
                            else if ( ((LA49_0>=MILITARY_HOUR_SUFFIX && LA49_0<=HOUR)) ) {
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
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:216:41: meridian_indicator
                                    {
                                    pushFollow(FOLLOW_meridian_indicator_in_time1942);
                                    meridian_indicator161=meridian_indicator();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_meridian_indicator.add(meridian_indicator161.getTree());

                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:216:62: ( MILITARY_HOUR_SUFFIX | HOUR )
                                    {
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:216:62: ( MILITARY_HOUR_SUFFIX | HOUR )
                                    int alt48=2;
                                    int LA48_0 = input.LA(1);

                                    if ( (LA48_0==MILITARY_HOUR_SUFFIX) ) {
                                        alt48=1;
                                    }
                                    else if ( (LA48_0==HOUR) ) {
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
                                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:216:63: MILITARY_HOUR_SUFFIX
                                            {
                                            MILITARY_HOUR_SUFFIX162=(Token)match(input,MILITARY_HOUR_SUFFIX,FOLLOW_MILITARY_HOUR_SUFFIX_in_time1947); if (state.failed) return retval; 
                                            if ( state.backtracking==0 ) stream_MILITARY_HOUR_SUFFIX.add(MILITARY_HOUR_SUFFIX162);


                                            }
                                            break;
                                        case 2 :
                                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:216:86: HOUR
                                            {
                                            HOUR163=(Token)match(input,HOUR,FOLLOW_HOUR_in_time1951); if (state.failed) return retval; 
                                            if ( state.backtracking==0 ) stream_HOUR.add(HOUR163);


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
                    // 217:7: -> ^( EXPLICIT_TIME hours minutes ( meridian_indicator )? )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:217:10: ^( EXPLICIT_TIME hours minutes ( meridian_indicator )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        adaptor.addChild(root_1, stream_hours.nextTree());
                        adaptor.addChild(root_1, stream_minutes.nextTree());
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:217:40: ( meridian_indicator )?
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:219:5: hours ( WHITE_SPACE )? ( meridian_indicator )?
                    {
                    pushFollow(FOLLOW_hours_in_time1987);
                    hours164=hours();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_hours.add(hours164.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:219:11: ( WHITE_SPACE )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==WHITE_SPACE) ) {
                        int LA51_1 = input.LA(2);

                        if ( (LA51_1==EOF||LA51_1==WHITE_SPACE||LA51_1==COMMA||(LA51_1>=AM && LA51_1<=PM)) ) {
                            alt51=1;
                        }
                    }
                    switch (alt51) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:219:11: WHITE_SPACE
                            {
                            WHITE_SPACE165=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_time1989); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE165);


                            }
                            break;

                    }

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:219:24: ( meridian_indicator )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( ((LA52_0>=AM && LA52_0<=PM)) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:219:24: meridian_indicator
                            {
                            pushFollow(FOLLOW_meridian_indicator_in_time1992);
                            meridian_indicator166=meridian_indicator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_meridian_indicator.add(meridian_indicator166.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: hours, meridian_indicator
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 220:7: -> ^( EXPLICIT_TIME hours ^( MINUTES_OF_HOUR INT[\"0\"] ) ( meridian_indicator )? )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:220:10: ^( EXPLICIT_TIME hours ^( MINUTES_OF_HOUR INT[\"0\"] ) ( meridian_indicator )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        adaptor.addChild(root_1, stream_hours.nextTree());
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:220:32: ^( MINUTES_OF_HOUR INT[\"0\"] )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(MINUTES_OF_HOUR, "MINUTES_OF_HOUR"), root_2);

                        adaptor.addChild(root_2, (Object)adaptor.create(INT, "0"));

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:220:60: ( meridian_indicator )?
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:222:5: named_time
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_named_time_in_time2030);
                    named_time167=named_time();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, named_time167.getTree());

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:226:1: hours : int_00_to_23_optional_prefix -> ^( HOURS_OF_DAY int_00_to_23_optional_prefix ) ;
    public final DateParser.hours_return hours() throws RecognitionException {
        DateParser.hours_return retval = new DateParser.hours_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_00_to_23_optional_prefix_return int_00_to_23_optional_prefix168 = null;


        RewriteRuleSubtreeStream stream_int_00_to_23_optional_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_00_to_23_optional_prefix");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:227:3: ( int_00_to_23_optional_prefix -> ^( HOURS_OF_DAY int_00_to_23_optional_prefix ) )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:227:5: int_00_to_23_optional_prefix
            {
            pushFollow(FOLLOW_int_00_to_23_optional_prefix_in_hours2045);
            int_00_to_23_optional_prefix168=int_00_to_23_optional_prefix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_00_to_23_optional_prefix.add(int_00_to_23_optional_prefix168.getTree());


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
            // 227:34: -> ^( HOURS_OF_DAY int_00_to_23_optional_prefix )
            {
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:227:37: ^( HOURS_OF_DAY int_00_to_23_optional_prefix )
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:231:1: minutes : int_00_to_59_mandatory_prefix -> ^( MINUTES_OF_HOUR int_00_to_59_mandatory_prefix ) ;
    public final DateParser.minutes_return minutes() throws RecognitionException {
        DateParser.minutes_return retval = new DateParser.minutes_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_00_to_59_mandatory_prefix_return int_00_to_59_mandatory_prefix169 = null;


        RewriteRuleSubtreeStream stream_int_00_to_59_mandatory_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_00_to_59_mandatory_prefix");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:232:3: ( int_00_to_59_mandatory_prefix -> ^( MINUTES_OF_HOUR int_00_to_59_mandatory_prefix ) )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:232:5: int_00_to_59_mandatory_prefix
            {
            pushFollow(FOLLOW_int_00_to_59_mandatory_prefix_in_minutes2069);
            int_00_to_59_mandatory_prefix169=int_00_to_59_mandatory_prefix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_00_to_59_mandatory_prefix.add(int_00_to_59_mandatory_prefix169.getTree());


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
            // 232:35: -> ^( MINUTES_OF_HOUR int_00_to_59_mandatory_prefix )
            {
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:232:38: ^( MINUTES_OF_HOUR int_00_to_59_mandatory_prefix )
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:237:1: meridian_indicator : ( AM -> AM_PM[\"am\"] | PM -> AM_PM[\"pm\"] );
    public final DateParser.meridian_indicator_return meridian_indicator() throws RecognitionException {
        DateParser.meridian_indicator_return retval = new DateParser.meridian_indicator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AM170=null;
        Token PM171=null;

        Object AM170_tree=null;
        Object PM171_tree=null;
        RewriteRuleTokenStream stream_PM=new RewriteRuleTokenStream(adaptor,"token PM");
        RewriteRuleTokenStream stream_AM=new RewriteRuleTokenStream(adaptor,"token AM");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:238:3: ( AM -> AM_PM[\"am\"] | PM -> AM_PM[\"pm\"] )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==AM) ) {
                alt54=1;
            }
            else if ( (LA54_0==PM) ) {
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:238:5: AM
                    {
                    AM170=(Token)match(input,AM,FOLLOW_AM_in_meridian_indicator2096); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AM.add(AM170);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 238:8: -> AM_PM[\"am\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(AM_PM, "am"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:239:5: PM
                    {
                    PM171=(Token)match(input,PM,FOLLOW_PM_in_meridian_indicator2107); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PM.add(PM171);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 239:8: -> AM_PM[\"pm\"]
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:242:1: named_time : ( NOON -> ^( EXPLICIT_TIME ^( HOURS_OF_DAY INT[\"12\"] ) ^( MINUTES_OF_HOUR INT[\"0\"] ) AM_PM[\"pm\"] ) | MIDNIGHT -> ^( EXPLICIT_TIME ^( HOURS_OF_DAY INT[\"12\"] ) ^( MINUTES_OF_HOUR INT[\"0\"] ) AM_PM[\"am\"] ) );
    public final DateParser.named_time_return named_time() throws RecognitionException {
        DateParser.named_time_return retval = new DateParser.named_time_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOON172=null;
        Token MIDNIGHT173=null;

        Object NOON172_tree=null;
        Object MIDNIGHT173_tree=null;
        RewriteRuleTokenStream stream_NOON=new RewriteRuleTokenStream(adaptor,"token NOON");
        RewriteRuleTokenStream stream_MIDNIGHT=new RewriteRuleTokenStream(adaptor,"token MIDNIGHT");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:243:3: ( NOON -> ^( EXPLICIT_TIME ^( HOURS_OF_DAY INT[\"12\"] ) ^( MINUTES_OF_HOUR INT[\"0\"] ) AM_PM[\"pm\"] ) | MIDNIGHT -> ^( EXPLICIT_TIME ^( HOURS_OF_DAY INT[\"12\"] ) ^( MINUTES_OF_HOUR INT[\"0\"] ) AM_PM[\"am\"] ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==NOON) ) {
                alt55=1;
            }
            else if ( (LA55_0==MIDNIGHT) ) {
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:243:5: NOON
                    {
                    NOON172=(Token)match(input,NOON,FOLLOW_NOON_in_named_time2127); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOON.add(NOON172);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 243:14: -> ^( EXPLICIT_TIME ^( HOURS_OF_DAY INT[\"12\"] ) ^( MINUTES_OF_HOUR INT[\"0\"] ) AM_PM[\"pm\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:243:17: ^( EXPLICIT_TIME ^( HOURS_OF_DAY INT[\"12\"] ) ^( MINUTES_OF_HOUR INT[\"0\"] ) AM_PM[\"pm\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:243:33: ^( HOURS_OF_DAY INT[\"12\"] )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(HOURS_OF_DAY, "HOURS_OF_DAY"), root_2);

                        adaptor.addChild(root_2, (Object)adaptor.create(INT, "12"));

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:243:59: ^( MINUTES_OF_HOUR INT[\"0\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:244:5: MIDNIGHT
                    {
                    MIDNIGHT173=(Token)match(input,MIDNIGHT,FOLLOW_MIDNIGHT_in_named_time2160); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MIDNIGHT.add(MIDNIGHT173);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 244:14: -> ^( EXPLICIT_TIME ^( HOURS_OF_DAY INT[\"12\"] ) ^( MINUTES_OF_HOUR INT[\"0\"] ) AM_PM[\"am\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:244:17: ^( EXPLICIT_TIME ^( HOURS_OF_DAY INT[\"12\"] ) ^( MINUTES_OF_HOUR INT[\"0\"] ) AM_PM[\"am\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:244:33: ^( HOURS_OF_DAY INT[\"12\"] )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(HOURS_OF_DAY, "HOURS_OF_DAY"), root_2);

                        adaptor.addChild(root_2, (Object)adaptor.create(INT, "12"));

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:244:59: ^( MINUTES_OF_HOUR INT[\"0\"] )
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:250:1: int_00_to_23_optional_prefix : ( INT_0 | INT_00 | INT_1_TO_9 | INT_01_TO_12 | INT_13_TO_23 ) -> INT[$int_00_to_23_optional_prefix.text] ;
    public final DateParser.int_00_to_23_optional_prefix_return int_00_to_23_optional_prefix() throws RecognitionException {
        DateParser.int_00_to_23_optional_prefix_return retval = new DateParser.int_00_to_23_optional_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT_0174=null;
        Token INT_00175=null;
        Token INT_1_TO_9176=null;
        Token INT_01_TO_12177=null;
        Token INT_13_TO_23178=null;

        Object INT_0174_tree=null;
        Object INT_00175_tree=null;
        Object INT_1_TO_9176_tree=null;
        Object INT_01_TO_12177_tree=null;
        Object INT_13_TO_23178_tree=null;
        RewriteRuleTokenStream stream_INT_13_TO_23=new RewriteRuleTokenStream(adaptor,"token INT_13_TO_23");
        RewriteRuleTokenStream stream_INT_00=new RewriteRuleTokenStream(adaptor,"token INT_00");
        RewriteRuleTokenStream stream_INT_1_TO_9=new RewriteRuleTokenStream(adaptor,"token INT_1_TO_9");
        RewriteRuleTokenStream stream_INT_01_TO_12=new RewriteRuleTokenStream(adaptor,"token INT_01_TO_12");
        RewriteRuleTokenStream stream_INT_0=new RewriteRuleTokenStream(adaptor,"token INT_0");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:251:3: ( ( INT_0 | INT_00 | INT_1_TO_9 | INT_01_TO_12 | INT_13_TO_23 ) -> INT[$int_00_to_23_optional_prefix.text] )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:251:5: ( INT_0 | INT_00 | INT_1_TO_9 | INT_01_TO_12 | INT_13_TO_23 )
            {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:251:5: ( INT_0 | INT_00 | INT_1_TO_9 | INT_01_TO_12 | INT_13_TO_23 )
            int alt56=5;
            switch ( input.LA(1) ) {
            case INT_0:
                {
                alt56=1;
                }
                break;
            case INT_00:
                {
                alt56=2;
                }
                break;
            case INT_1_TO_9:
                {
                alt56=3;
                }
                break;
            case INT_01_TO_12:
                {
                alt56=4;
                }
                break;
            case INT_13_TO_23:
                {
                alt56=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:251:6: INT_0
                    {
                    INT_0174=(Token)match(input,INT_0,FOLLOW_INT_0_in_int_00_to_23_optional_prefix2202); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_0.add(INT_0174);


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:252:5: INT_00
                    {
                    INT_00175=(Token)match(input,INT_00,FOLLOW_INT_00_in_int_00_to_23_optional_prefix2208); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_00.add(INT_00175);


                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:253:5: INT_1_TO_9
                    {
                    INT_1_TO_9176=(Token)match(input,INT_1_TO_9,FOLLOW_INT_1_TO_9_in_int_00_to_23_optional_prefix2214); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_1_TO_9.add(INT_1_TO_9176);


                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:254:5: INT_01_TO_12
                    {
                    INT_01_TO_12177=(Token)match(input,INT_01_TO_12,FOLLOW_INT_01_TO_12_in_int_00_to_23_optional_prefix2220); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_01_TO_12.add(INT_01_TO_12177);


                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:255:5: INT_13_TO_23
                    {
                    INT_13_TO_23178=(Token)match(input,INT_13_TO_23,FOLLOW_INT_13_TO_23_in_int_00_to_23_optional_prefix2226); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_13_TO_23.add(INT_13_TO_23178);


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
            // 255:19: -> INT[$int_00_to_23_optional_prefix.text]
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:259:1: int_00_to_59_mandatory_prefix : ( INT_00 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 | INT_32_TO_59 ) -> INT[$int_00_to_59_mandatory_prefix.text] ;
    public final DateParser.int_00_to_59_mandatory_prefix_return int_00_to_59_mandatory_prefix() throws RecognitionException {
        DateParser.int_00_to_59_mandatory_prefix_return retval = new DateParser.int_00_to_59_mandatory_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT_00179=null;
        Token INT_01_TO_12180=null;
        Token INT_13_TO_23181=null;
        Token INT_24_TO_31182=null;
        Token INT_32_TO_59183=null;

        Object INT_00179_tree=null;
        Object INT_01_TO_12180_tree=null;
        Object INT_13_TO_23181_tree=null;
        Object INT_24_TO_31182_tree=null;
        Object INT_32_TO_59183_tree=null;
        RewriteRuleTokenStream stream_INT_24_TO_31=new RewriteRuleTokenStream(adaptor,"token INT_24_TO_31");
        RewriteRuleTokenStream stream_INT_13_TO_23=new RewriteRuleTokenStream(adaptor,"token INT_13_TO_23");
        RewriteRuleTokenStream stream_INT_00=new RewriteRuleTokenStream(adaptor,"token INT_00");
        RewriteRuleTokenStream stream_INT_32_TO_59=new RewriteRuleTokenStream(adaptor,"token INT_32_TO_59");
        RewriteRuleTokenStream stream_INT_01_TO_12=new RewriteRuleTokenStream(adaptor,"token INT_01_TO_12");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:260:3: ( ( INT_00 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 | INT_32_TO_59 ) -> INT[$int_00_to_59_mandatory_prefix.text] )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:260:5: ( INT_00 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 | INT_32_TO_59 )
            {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:260:5: ( INT_00 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 | INT_32_TO_59 )
            int alt57=5;
            switch ( input.LA(1) ) {
            case INT_00:
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
            case INT_32_TO_59:
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:260:6: INT_00
                    {
                    INT_00179=(Token)match(input,INT_00,FOLLOW_INT_00_in_int_00_to_59_mandatory_prefix2248); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_00.add(INT_00179);


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:5: INT_01_TO_12
                    {
                    INT_01_TO_12180=(Token)match(input,INT_01_TO_12,FOLLOW_INT_01_TO_12_in_int_00_to_59_mandatory_prefix2254); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_01_TO_12.add(INT_01_TO_12180);


                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:5: INT_13_TO_23
                    {
                    INT_13_TO_23181=(Token)match(input,INT_13_TO_23,FOLLOW_INT_13_TO_23_in_int_00_to_59_mandatory_prefix2260); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_13_TO_23.add(INT_13_TO_23181);


                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:263:5: INT_24_TO_31
                    {
                    INT_24_TO_31182=(Token)match(input,INT_24_TO_31,FOLLOW_INT_24_TO_31_in_int_00_to_59_mandatory_prefix2266); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_24_TO_31.add(INT_24_TO_31182);


                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:264:5: INT_32_TO_59
                    {
                    INT_32_TO_59183=(Token)match(input,INT_32_TO_59,FOLLOW_INT_32_TO_59_in_int_00_to_59_mandatory_prefix2272); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_32_TO_59.add(INT_32_TO_59183);


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
            // 264:19: -> INT[$int_00_to_59_mandatory_prefix.text]
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:268:1: int_00_to_99_mandatory_prefix : ( int_00_to_59_mandatory_prefix | INT_60_TO_99 -> INT[$INT_60_TO_99.text] );
    public final DateParser.int_00_to_99_mandatory_prefix_return int_00_to_99_mandatory_prefix() throws RecognitionException {
        DateParser.int_00_to_99_mandatory_prefix_return retval = new DateParser.int_00_to_99_mandatory_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT_60_TO_99185=null;
        DateParser.int_00_to_59_mandatory_prefix_return int_00_to_59_mandatory_prefix184 = null;


        Object INT_60_TO_99185_tree=null;
        RewriteRuleTokenStream stream_INT_60_TO_99=new RewriteRuleTokenStream(adaptor,"token INT_60_TO_99");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:269:3: ( int_00_to_59_mandatory_prefix | INT_60_TO_99 -> INT[$INT_60_TO_99.text] )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==INT_00||(LA58_0>=INT_01_TO_12 && LA58_0<=INT_32_TO_59)) ) {
                alt58=1;
            }
            else if ( (LA58_0==INT_60_TO_99) ) {
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:269:5: int_00_to_59_mandatory_prefix
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_int_00_to_59_mandatory_prefix_in_int_00_to_99_mandatory_prefix2294);
                    int_00_to_59_mandatory_prefix184=int_00_to_59_mandatory_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, int_00_to_59_mandatory_prefix184.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:270:5: INT_60_TO_99
                    {
                    INT_60_TO_99185=(Token)match(input,INT_60_TO_99,FOLLOW_INT_60_TO_99_in_int_00_to_99_mandatory_prefix2300); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_60_TO_99.add(INT_60_TO_99185);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 270:18: -> INT[$INT_60_TO_99.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (INT_60_TO_99185!=null?INT_60_TO_99185.getText():null)));

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:274:1: int_01_to_12_optional_prefix : ( INT_1_TO_9 | INT_01_TO_12 ) -> INT[$int_01_to_12_optional_prefix.text] ;
    public final DateParser.int_01_to_12_optional_prefix_return int_01_to_12_optional_prefix() throws RecognitionException {
        DateParser.int_01_to_12_optional_prefix_return retval = new DateParser.int_01_to_12_optional_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT_1_TO_9186=null;
        Token INT_01_TO_12187=null;

        Object INT_1_TO_9186_tree=null;
        Object INT_01_TO_12187_tree=null;
        RewriteRuleTokenStream stream_INT_1_TO_9=new RewriteRuleTokenStream(adaptor,"token INT_1_TO_9");
        RewriteRuleTokenStream stream_INT_01_TO_12=new RewriteRuleTokenStream(adaptor,"token INT_01_TO_12");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:275:3: ( ( INT_1_TO_9 | INT_01_TO_12 ) -> INT[$int_01_to_12_optional_prefix.text] )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:275:5: ( INT_1_TO_9 | INT_01_TO_12 )
            {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:275:5: ( INT_1_TO_9 | INT_01_TO_12 )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==INT_1_TO_9) ) {
                alt59=1;
            }
            else if ( (LA59_0==INT_01_TO_12) ) {
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:275:6: INT_1_TO_9
                    {
                    INT_1_TO_9186=(Token)match(input,INT_1_TO_9,FOLLOW_INT_1_TO_9_in_int_01_to_12_optional_prefix2322); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_1_TO_9.add(INT_1_TO_9186);


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:276:5: INT_01_TO_12
                    {
                    INT_01_TO_12187=(Token)match(input,INT_01_TO_12,FOLLOW_INT_01_TO_12_in_int_01_to_12_optional_prefix2328); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_01_TO_12.add(INT_01_TO_12187);


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
            // 276:19: -> INT[$int_01_to_12_optional_prefix.text]
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:280:1: int_01_to_31_optional_prefix : ( INT_1_TO_9 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 ) -> INT[$int_01_to_31_optional_prefix.text] ;
    public final DateParser.int_01_to_31_optional_prefix_return int_01_to_31_optional_prefix() throws RecognitionException {
        DateParser.int_01_to_31_optional_prefix_return retval = new DateParser.int_01_to_31_optional_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT_1_TO_9188=null;
        Token INT_01_TO_12189=null;
        Token INT_13_TO_23190=null;
        Token INT_24_TO_31191=null;

        Object INT_1_TO_9188_tree=null;
        Object INT_01_TO_12189_tree=null;
        Object INT_13_TO_23190_tree=null;
        Object INT_24_TO_31191_tree=null;
        RewriteRuleTokenStream stream_INT_24_TO_31=new RewriteRuleTokenStream(adaptor,"token INT_24_TO_31");
        RewriteRuleTokenStream stream_INT_13_TO_23=new RewriteRuleTokenStream(adaptor,"token INT_13_TO_23");
        RewriteRuleTokenStream stream_INT_1_TO_9=new RewriteRuleTokenStream(adaptor,"token INT_1_TO_9");
        RewriteRuleTokenStream stream_INT_01_TO_12=new RewriteRuleTokenStream(adaptor,"token INT_01_TO_12");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:281:3: ( ( INT_1_TO_9 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 ) -> INT[$int_01_to_31_optional_prefix.text] )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:281:5: ( INT_1_TO_9 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 )
            {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:281:5: ( INT_1_TO_9 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 )
            int alt60=4;
            switch ( input.LA(1) ) {
            case INT_1_TO_9:
                {
                alt60=1;
                }
                break;
            case INT_01_TO_12:
                {
                alt60=2;
                }
                break;
            case INT_13_TO_23:
                {
                alt60=3;
                }
                break;
            case INT_24_TO_31:
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:281:6: INT_1_TO_9
                    {
                    INT_1_TO_9188=(Token)match(input,INT_1_TO_9,FOLLOW_INT_1_TO_9_in_int_01_to_31_optional_prefix2351); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_1_TO_9.add(INT_1_TO_9188);


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:282:5: INT_01_TO_12
                    {
                    INT_01_TO_12189=(Token)match(input,INT_01_TO_12,FOLLOW_INT_01_TO_12_in_int_01_to_31_optional_prefix2357); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_01_TO_12.add(INT_01_TO_12189);


                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:283:5: INT_13_TO_23
                    {
                    INT_13_TO_23190=(Token)match(input,INT_13_TO_23,FOLLOW_INT_13_TO_23_in_int_01_to_31_optional_prefix2363); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_13_TO_23.add(INT_13_TO_23190);


                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:284:5: INT_24_TO_31
                    {
                    INT_24_TO_31191=(Token)match(input,INT_24_TO_31,FOLLOW_INT_24_TO_31_in_int_01_to_31_optional_prefix2369); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_24_TO_31.add(INT_24_TO_31191);


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
            // 284:19: -> INT[$int_01_to_31_optional_prefix.text]
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:288:1: int_four_digits : int_00_to_99_mandatory_prefix int_00_to_99_mandatory_prefix -> INT[$int_four_digits.text] ;
    public final DateParser.int_four_digits_return int_four_digits() throws RecognitionException {
        DateParser.int_four_digits_return retval = new DateParser.int_four_digits_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_00_to_99_mandatory_prefix_return int_00_to_99_mandatory_prefix192 = null;

        DateParser.int_00_to_99_mandatory_prefix_return int_00_to_99_mandatory_prefix193 = null;


        RewriteRuleSubtreeStream stream_int_00_to_99_mandatory_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_00_to_99_mandatory_prefix");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:289:3: ( int_00_to_99_mandatory_prefix int_00_to_99_mandatory_prefix -> INT[$int_four_digits.text] )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:289:5: int_00_to_99_mandatory_prefix int_00_to_99_mandatory_prefix
            {
            pushFollow(FOLLOW_int_00_to_99_mandatory_prefix_in_int_four_digits2391);
            int_00_to_99_mandatory_prefix192=int_00_to_99_mandatory_prefix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_00_to_99_mandatory_prefix.add(int_00_to_99_mandatory_prefix192.getTree());
            pushFollow(FOLLOW_int_00_to_99_mandatory_prefix_in_int_four_digits2393);
            int_00_to_99_mandatory_prefix193=int_00_to_99_mandatory_prefix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_00_to_99_mandatory_prefix.add(int_00_to_99_mandatory_prefix193.getTree());


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 290:7: -> INT[$int_four_digits.text]
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:295:1: spelled_or_int_01_to_31_optional_prefix : ( int_01_to_31_optional_prefix | spelled_one_to_thirty_one );
    public final DateParser.spelled_or_int_01_to_31_optional_prefix_return spelled_or_int_01_to_31_optional_prefix() throws RecognitionException {
        DateParser.spelled_or_int_01_to_31_optional_prefix_return retval = new DateParser.spelled_or_int_01_to_31_optional_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_01_to_31_optional_prefix_return int_01_to_31_optional_prefix194 = null;

        DateParser.spelled_one_to_thirty_one_return spelled_one_to_thirty_one195 = null;



        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:296:3: ( int_01_to_31_optional_prefix | spelled_one_to_thirty_one )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=INT_1_TO_9 && LA61_0<=INT_24_TO_31)) ) {
                alt61=1;
            }
            else if ( ((LA61_0>=ONE && LA61_0<=THIRTY)) ) {
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:296:5: int_01_to_31_optional_prefix
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_int_01_to_31_optional_prefix_in_spelled_or_int_01_to_31_optional_prefix2421);
                    int_01_to_31_optional_prefix194=int_01_to_31_optional_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, int_01_to_31_optional_prefix194.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:297:5: spelled_one_to_thirty_one
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_spelled_one_to_thirty_one_in_spelled_or_int_01_to_31_optional_prefix2427);
                    spelled_one_to_thirty_one195=spelled_one_to_thirty_one();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, spelled_one_to_thirty_one195.getTree());

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:301:1: spelled_one_to_thirty_one : ( ONE -> INT[\"1\"] | TWO -> INT[\"2\"] | THREE -> INT[\"3\"] | FOUR -> INT[\"4\"] | FIVE -> INT[\"5\"] | SIX -> INT[\"6\"] | SEVEN -> INT[\"7\"] | EIGHT -> INT[\"8\"] | NINE -> INT[\"9\"] | TEN -> INT[\"10\"] | ELEVEN -> INT[\"11\"] | TWELVE -> INT[\"12\"] | THIRTEEN -> INT[\"13\"] | FOURTEEN -> INT[\"14\"] | FIFTEEN -> INT[\"15\"] | SIXTEEN -> INT[\"16\"] | SEVENTEEN -> INT[\"17\"] | EIGHTEEN -> INT[\"18\"] | NINETEEN -> INT[\"19\"] | TWENTY -> INT[\"20\"] | TWENTY ( DASH | WHITE_SPACE )? ONE -> INT[\"21\"] | TWENTY ( DASH | WHITE_SPACE )? TWO -> INT[\"22\"] | TWENTY ( DASH | WHITE_SPACE )? THREE -> INT[\"23\"] | TWENTY ( DASH | WHITE_SPACE )? FOUR -> INT[\"24\"] | TWENTY ( DASH | WHITE_SPACE )? FIVE -> INT[\"25\"] | TWENTY ( DASH | WHITE_SPACE )? SIX -> INT[\"26\"] | TWENTY ( DASH | WHITE_SPACE )? SEVEN -> INT[\"27\"] | TWENTY ( DASH | WHITE_SPACE )? EIGHT -> INT[\"28\"] | TWENTY ( DASH | WHITE_SPACE )? NINE -> INT[\"29\"] | THIRTY -> INT[\"30\"] | THIRTY ( DASH | WHITE_SPACE )? ONE -> INT[\"31\"] );
    public final DateParser.spelled_one_to_thirty_one_return spelled_one_to_thirty_one() throws RecognitionException {
        DateParser.spelled_one_to_thirty_one_return retval = new DateParser.spelled_one_to_thirty_one_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ONE196=null;
        Token TWO197=null;
        Token THREE198=null;
        Token FOUR199=null;
        Token FIVE200=null;
        Token SIX201=null;
        Token SEVEN202=null;
        Token EIGHT203=null;
        Token NINE204=null;
        Token TEN205=null;
        Token ELEVEN206=null;
        Token TWELVE207=null;
        Token THIRTEEN208=null;
        Token FOURTEEN209=null;
        Token FIFTEEN210=null;
        Token SIXTEEN211=null;
        Token SEVENTEEN212=null;
        Token EIGHTEEN213=null;
        Token NINETEEN214=null;
        Token TWENTY215=null;
        Token TWENTY216=null;
        Token DASH217=null;
        Token WHITE_SPACE218=null;
        Token ONE219=null;
        Token TWENTY220=null;
        Token DASH221=null;
        Token WHITE_SPACE222=null;
        Token TWO223=null;
        Token TWENTY224=null;
        Token DASH225=null;
        Token WHITE_SPACE226=null;
        Token THREE227=null;
        Token TWENTY228=null;
        Token DASH229=null;
        Token WHITE_SPACE230=null;
        Token FOUR231=null;
        Token TWENTY232=null;
        Token DASH233=null;
        Token WHITE_SPACE234=null;
        Token FIVE235=null;
        Token TWENTY236=null;
        Token DASH237=null;
        Token WHITE_SPACE238=null;
        Token SIX239=null;
        Token TWENTY240=null;
        Token DASH241=null;
        Token WHITE_SPACE242=null;
        Token SEVEN243=null;
        Token TWENTY244=null;
        Token DASH245=null;
        Token WHITE_SPACE246=null;
        Token EIGHT247=null;
        Token TWENTY248=null;
        Token DASH249=null;
        Token WHITE_SPACE250=null;
        Token NINE251=null;
        Token THIRTY252=null;
        Token THIRTY253=null;
        Token DASH254=null;
        Token WHITE_SPACE255=null;
        Token ONE256=null;

        Object ONE196_tree=null;
        Object TWO197_tree=null;
        Object THREE198_tree=null;
        Object FOUR199_tree=null;
        Object FIVE200_tree=null;
        Object SIX201_tree=null;
        Object SEVEN202_tree=null;
        Object EIGHT203_tree=null;
        Object NINE204_tree=null;
        Object TEN205_tree=null;
        Object ELEVEN206_tree=null;
        Object TWELVE207_tree=null;
        Object THIRTEEN208_tree=null;
        Object FOURTEEN209_tree=null;
        Object FIFTEEN210_tree=null;
        Object SIXTEEN211_tree=null;
        Object SEVENTEEN212_tree=null;
        Object EIGHTEEN213_tree=null;
        Object NINETEEN214_tree=null;
        Object TWENTY215_tree=null;
        Object TWENTY216_tree=null;
        Object DASH217_tree=null;
        Object WHITE_SPACE218_tree=null;
        Object ONE219_tree=null;
        Object TWENTY220_tree=null;
        Object DASH221_tree=null;
        Object WHITE_SPACE222_tree=null;
        Object TWO223_tree=null;
        Object TWENTY224_tree=null;
        Object DASH225_tree=null;
        Object WHITE_SPACE226_tree=null;
        Object THREE227_tree=null;
        Object TWENTY228_tree=null;
        Object DASH229_tree=null;
        Object WHITE_SPACE230_tree=null;
        Object FOUR231_tree=null;
        Object TWENTY232_tree=null;
        Object DASH233_tree=null;
        Object WHITE_SPACE234_tree=null;
        Object FIVE235_tree=null;
        Object TWENTY236_tree=null;
        Object DASH237_tree=null;
        Object WHITE_SPACE238_tree=null;
        Object SIX239_tree=null;
        Object TWENTY240_tree=null;
        Object DASH241_tree=null;
        Object WHITE_SPACE242_tree=null;
        Object SEVEN243_tree=null;
        Object TWENTY244_tree=null;
        Object DASH245_tree=null;
        Object WHITE_SPACE246_tree=null;
        Object EIGHT247_tree=null;
        Object TWENTY248_tree=null;
        Object DASH249_tree=null;
        Object WHITE_SPACE250_tree=null;
        Object NINE251_tree=null;
        Object THIRTY252_tree=null;
        Object THIRTY253_tree=null;
        Object DASH254_tree=null;
        Object WHITE_SPACE255_tree=null;
        Object ONE256_tree=null;
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:302:3: ( ONE -> INT[\"1\"] | TWO -> INT[\"2\"] | THREE -> INT[\"3\"] | FOUR -> INT[\"4\"] | FIVE -> INT[\"5\"] | SIX -> INT[\"6\"] | SEVEN -> INT[\"7\"] | EIGHT -> INT[\"8\"] | NINE -> INT[\"9\"] | TEN -> INT[\"10\"] | ELEVEN -> INT[\"11\"] | TWELVE -> INT[\"12\"] | THIRTEEN -> INT[\"13\"] | FOURTEEN -> INT[\"14\"] | FIFTEEN -> INT[\"15\"] | SIXTEEN -> INT[\"16\"] | SEVENTEEN -> INT[\"17\"] | EIGHTEEN -> INT[\"18\"] | NINETEEN -> INT[\"19\"] | TWENTY -> INT[\"20\"] | TWENTY ( DASH | WHITE_SPACE )? ONE -> INT[\"21\"] | TWENTY ( DASH | WHITE_SPACE )? TWO -> INT[\"22\"] | TWENTY ( DASH | WHITE_SPACE )? THREE -> INT[\"23\"] | TWENTY ( DASH | WHITE_SPACE )? FOUR -> INT[\"24\"] | TWENTY ( DASH | WHITE_SPACE )? FIVE -> INT[\"25\"] | TWENTY ( DASH | WHITE_SPACE )? SIX -> INT[\"26\"] | TWENTY ( DASH | WHITE_SPACE )? SEVEN -> INT[\"27\"] | TWENTY ( DASH | WHITE_SPACE )? EIGHT -> INT[\"28\"] | TWENTY ( DASH | WHITE_SPACE )? NINE -> INT[\"29\"] | THIRTY -> INT[\"30\"] | THIRTY ( DASH | WHITE_SPACE )? ONE -> INT[\"31\"] )
            int alt72=31;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:302:5: ONE
                    {
                    ONE196=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_one_to_thirty_one2443); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE.add(ONE196);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 302:16: -> INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:303:5: TWO
                    {
                    TWO197=(Token)match(input,TWO,FOLLOW_TWO_in_spelled_one_to_thirty_one2461); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO.add(TWO197);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 303:16: -> INT[\"2\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "2"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:304:5: THREE
                    {
                    THREE198=(Token)match(input,THREE,FOLLOW_THREE_in_spelled_one_to_thirty_one2479); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THREE.add(THREE198);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 304:16: -> INT[\"3\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "3"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:305:5: FOUR
                    {
                    FOUR199=(Token)match(input,FOUR,FOLLOW_FOUR_in_spelled_one_to_thirty_one2495); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOUR.add(FOUR199);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 305:16: -> INT[\"4\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "4"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:306:5: FIVE
                    {
                    FIVE200=(Token)match(input,FIVE,FOLLOW_FIVE_in_spelled_one_to_thirty_one2512); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIVE.add(FIVE200);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 306:16: -> INT[\"5\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "5"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:307:5: SIX
                    {
                    SIX201=(Token)match(input,SIX,FOLLOW_SIX_in_spelled_one_to_thirty_one2529); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIX.add(SIX201);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 307:16: -> INT[\"6\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "6"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:308:5: SEVEN
                    {
                    SEVEN202=(Token)match(input,SEVEN,FOLLOW_SEVEN_in_spelled_one_to_thirty_one2547); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVEN.add(SEVEN202);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 308:16: -> INT[\"7\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "7"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:309:5: EIGHT
                    {
                    EIGHT203=(Token)match(input,EIGHT,FOLLOW_EIGHT_in_spelled_one_to_thirty_one2563); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHT.add(EIGHT203);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 309:16: -> INT[\"8\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "8"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:310:5: NINE
                    {
                    NINE204=(Token)match(input,NINE,FOLLOW_NINE_in_spelled_one_to_thirty_one2579); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINE.add(NINE204);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 310:16: -> INT[\"9\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "9"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:311:5: TEN
                    {
                    TEN205=(Token)match(input,TEN,FOLLOW_TEN_in_spelled_one_to_thirty_one2596); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TEN.add(TEN205);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 311:16: -> INT[\"10\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "10"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:312:5: ELEVEN
                    {
                    ELEVEN206=(Token)match(input,ELEVEN,FOLLOW_ELEVEN_in_spelled_one_to_thirty_one2614); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELEVEN.add(ELEVEN206);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 312:16: -> INT[\"11\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "11"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:313:5: TWELVE
                    {
                    TWELVE207=(Token)match(input,TWELVE,FOLLOW_TWELVE_in_spelled_one_to_thirty_one2629); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWELVE.add(TWELVE207);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 313:16: -> INT[\"12\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "12"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:314:5: THIRTEEN
                    {
                    THIRTEEN208=(Token)match(input,THIRTEEN,FOLLOW_THIRTEEN_in_spelled_one_to_thirty_one2644); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEEN.add(THIRTEEN208);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 314:16: -> INT[\"13\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "13"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 14 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:315:5: FOURTEEN
                    {
                    FOURTEEN209=(Token)match(input,FOURTEEN,FOLLOW_FOURTEEN_in_spelled_one_to_thirty_one2657); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOURTEEN.add(FOURTEEN209);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 315:16: -> INT[\"14\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "14"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 15 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:316:5: FIFTEEN
                    {
                    FIFTEEN210=(Token)match(input,FIFTEEN,FOLLOW_FIFTEEN_in_spelled_one_to_thirty_one2670); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIFTEEN.add(FIFTEEN210);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 316:16: -> INT[\"15\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "15"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 16 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:317:5: SIXTEEN
                    {
                    SIXTEEN211=(Token)match(input,SIXTEEN,FOLLOW_SIXTEEN_in_spelled_one_to_thirty_one2684); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTEEN.add(SIXTEEN211);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 317:16: -> INT[\"16\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "16"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 17 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:318:5: SEVENTEEN
                    {
                    SEVENTEEN212=(Token)match(input,SEVENTEEN,FOLLOW_SEVENTEEN_in_spelled_one_to_thirty_one2698); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVENTEEN.add(SEVENTEEN212);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 318:16: -> INT[\"17\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "17"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 18 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:319:5: EIGHTEEN
                    {
                    EIGHTEEN213=(Token)match(input,EIGHTEEN,FOLLOW_EIGHTEEN_in_spelled_one_to_thirty_one2710); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHTEEN.add(EIGHTEEN213);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 319:16: -> INT[\"18\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "18"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 19 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:320:5: NINETEEN
                    {
                    NINETEEN214=(Token)match(input,NINETEEN,FOLLOW_NINETEEN_in_spelled_one_to_thirty_one2723); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINETEEN.add(NINETEEN214);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 320:16: -> INT[\"19\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "19"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 20 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:321:5: TWENTY
                    {
                    TWENTY215=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one2736); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY215);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 321:16: -> INT[\"20\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "20"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 21 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:322:5: TWENTY ( DASH | WHITE_SPACE )? ONE
                    {
                    TWENTY216=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one2751); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY216);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:322:12: ( DASH | WHITE_SPACE )?
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:322:13: DASH
                            {
                            DASH217=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one2754); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH217);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:322:20: WHITE_SPACE
                            {
                            WHITE_SPACE218=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2758); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE218);


                            }
                            break;

                    }

                    ONE219=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_one_to_thirty_one2762); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE.add(ONE219);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 322:40: -> INT[\"21\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "21"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 22 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:323:5: TWENTY ( DASH | WHITE_SPACE )? TWO
                    {
                    TWENTY220=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one2775); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY220);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:323:12: ( DASH | WHITE_SPACE )?
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:323:13: DASH
                            {
                            DASH221=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one2778); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH221);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:323:20: WHITE_SPACE
                            {
                            WHITE_SPACE222=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2782); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE222);


                            }
                            break;

                    }

                    TWO223=(Token)match(input,TWO,FOLLOW_TWO_in_spelled_one_to_thirty_one2786); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO.add(TWO223);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 323:40: -> INT[\"22\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "22"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 23 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:324:5: TWENTY ( DASH | WHITE_SPACE )? THREE
                    {
                    TWENTY224=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one2799); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY224);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:324:12: ( DASH | WHITE_SPACE )?
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:324:13: DASH
                            {
                            DASH225=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one2802); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH225);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:324:20: WHITE_SPACE
                            {
                            WHITE_SPACE226=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2806); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE226);


                            }
                            break;

                    }

                    THREE227=(Token)match(input,THREE,FOLLOW_THREE_in_spelled_one_to_thirty_one2810); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THREE.add(THREE227);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 324:40: -> INT[\"23\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "23"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 24 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:325:5: TWENTY ( DASH | WHITE_SPACE )? FOUR
                    {
                    TWENTY228=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one2821); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY228);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:325:12: ( DASH | WHITE_SPACE )?
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:325:13: DASH
                            {
                            DASH229=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one2824); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH229);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:325:20: WHITE_SPACE
                            {
                            WHITE_SPACE230=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2828); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE230);


                            }
                            break;

                    }

                    FOUR231=(Token)match(input,FOUR,FOLLOW_FOUR_in_spelled_one_to_thirty_one2832); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOUR.add(FOUR231);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 325:40: -> INT[\"24\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "24"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 25 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:326:5: TWENTY ( DASH | WHITE_SPACE )? FIVE
                    {
                    TWENTY232=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one2844); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY232);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:326:12: ( DASH | WHITE_SPACE )?
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:326:13: DASH
                            {
                            DASH233=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one2847); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH233);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:326:20: WHITE_SPACE
                            {
                            WHITE_SPACE234=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2851); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE234);


                            }
                            break;

                    }

                    FIVE235=(Token)match(input,FIVE,FOLLOW_FIVE_in_spelled_one_to_thirty_one2855); if (state.failed) return retval; 
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
                    // 326:40: -> INT[\"25\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "25"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 26 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:327:5: TWENTY ( DASH | WHITE_SPACE )? SIX
                    {
                    TWENTY236=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one2867); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY236);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:327:12: ( DASH | WHITE_SPACE )?
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:327:13: DASH
                            {
                            DASH237=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one2870); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH237);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:327:20: WHITE_SPACE
                            {
                            WHITE_SPACE238=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2874); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE238);


                            }
                            break;

                    }

                    SIX239=(Token)match(input,SIX,FOLLOW_SIX_in_spelled_one_to_thirty_one2878); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIX.add(SIX239);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 327:40: -> INT[\"26\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "26"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 27 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:328:5: TWENTY ( DASH | WHITE_SPACE )? SEVEN
                    {
                    TWENTY240=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one2891); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY240);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:328:12: ( DASH | WHITE_SPACE )?
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:328:13: DASH
                            {
                            DASH241=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one2894); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH241);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:328:20: WHITE_SPACE
                            {
                            WHITE_SPACE242=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2898); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE242);


                            }
                            break;

                    }

                    SEVEN243=(Token)match(input,SEVEN,FOLLOW_SEVEN_in_spelled_one_to_thirty_one2902); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVEN.add(SEVEN243);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 328:40: -> INT[\"27\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "27"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 28 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:329:5: TWENTY ( DASH | WHITE_SPACE )? EIGHT
                    {
                    TWENTY244=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one2913); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY244);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:329:12: ( DASH | WHITE_SPACE )?
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:329:13: DASH
                            {
                            DASH245=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one2916); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH245);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:329:20: WHITE_SPACE
                            {
                            WHITE_SPACE246=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2920); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE246);


                            }
                            break;

                    }

                    EIGHT247=(Token)match(input,EIGHT,FOLLOW_EIGHT_in_spelled_one_to_thirty_one2924); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHT.add(EIGHT247);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 329:40: -> INT[\"28\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "28"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 29 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:330:5: TWENTY ( DASH | WHITE_SPACE )? NINE
                    {
                    TWENTY248=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one2935); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY248);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:330:12: ( DASH | WHITE_SPACE )?
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:330:13: DASH
                            {
                            DASH249=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one2938); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH249);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:330:20: WHITE_SPACE
                            {
                            WHITE_SPACE250=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2942); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE250);


                            }
                            break;

                    }

                    NINE251=(Token)match(input,NINE,FOLLOW_NINE_in_spelled_one_to_thirty_one2946); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINE.add(NINE251);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 330:40: -> INT[\"29\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "29"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 30 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:331:5: THIRTY
                    {
                    THIRTY252=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_one_to_thirty_one2958); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY252);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 331:40: -> INT[\"30\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "30"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 31 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:332:5: THIRTY ( DASH | WHITE_SPACE )? ONE
                    {
                    THIRTY253=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_one_to_thirty_one2997); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY253);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:332:12: ( DASH | WHITE_SPACE )?
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:332:13: DASH
                            {
                            DASH254=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one3000); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH254);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:332:20: WHITE_SPACE
                            {
                            WHITE_SPACE255=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3004); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE255);


                            }
                            break;

                    }

                    ONE256=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_one_to_thirty_one3008); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE.add(ONE256);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 332:40: -> INT[\"31\"]
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:336:1: spelled_first_to_thirty_first : ( FIRST -> INT[\"1\"] | SECOND -> INT[\"2\"] | THIRD -> INT[\"3\"] | FOURTH -> INT[\"4\"] | FIFTH -> INT[\"5\"] | SIXTH -> INT[\"6\"] | SEVENTH -> INT[\"7\"] | EIGHTH -> INT[\"8\"] | NINTH -> INT[\"9\"] | TENTH -> INT[\"10\"] | ELEVENTH -> INT[\"11\"] | TWELFTH -> INT[\"12\"] | THIRTEENTH -> INT[\"13\"] | FOURTEENTH -> INT[\"14\"] | FIFTEENTH -> INT[\"15\"] | SIXTEENTH -> INT[\"16\"] | SEVENTEENTH -> INT[\"17\"] | EIGHTEENTH -> INT[\"18\"] | NINETEENTH -> INT[\"19\"] | TWENTIETH -> INT[\"20\"] | ( TWENTY_FIRST | ( TWENTY ( DASH | WHITE_SPACE )? FIRST ) ) -> INT[\"21\"] | ( TWENTY_SECOND | ( TWENTY ( DASH | WHITE_SPACE )? SECOND ) ) -> INT[\"22\"] | ( TWENTY_THIRD | ( TWENTY ( DASH | WHITE_SPACE )? THIRD ) ) -> INT[\"23\"] | ( TWENTY_FOURTH | ( TWENTY ( DASH | WHITE_SPACE )? FOURTH ) ) -> INT[\"24\"] | ( TWENTY_FIFTH | ( TWENTY ( DASH | WHITE_SPACE )? FIFTH ) ) -> INT[\"25\"] | ( TWENTY_SIXTH | ( TWENTY ( DASH | WHITE_SPACE )? SIXTH ) ) -> INT[\"26\"] | ( TWENTY_SEVENTH | ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH ) ) -> INT[\"27\"] | ( TWENTY_EIGHTH | ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH ) ) -> INT[\"28\"] | ( TWENTY_NINTH | ( TWENTY ( DASH | WHITE_SPACE )? NINTH ) ) -> INT[\"29\"] | THIRTIETH -> INT[\"30\"] | ( THIRTY_FIRST | ( THIRTY ( DASH | WHITE_SPACE )? FIRST ) ) -> INT[\"31\"] );
    public final DateParser.spelled_first_to_thirty_first_return spelled_first_to_thirty_first() throws RecognitionException {
        DateParser.spelled_first_to_thirty_first_return retval = new DateParser.spelled_first_to_thirty_first_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FIRST257=null;
        Token SECOND258=null;
        Token THIRD259=null;
        Token FOURTH260=null;
        Token FIFTH261=null;
        Token SIXTH262=null;
        Token SEVENTH263=null;
        Token EIGHTH264=null;
        Token NINTH265=null;
        Token TENTH266=null;
        Token ELEVENTH267=null;
        Token TWELFTH268=null;
        Token THIRTEENTH269=null;
        Token FOURTEENTH270=null;
        Token FIFTEENTH271=null;
        Token SIXTEENTH272=null;
        Token SEVENTEENTH273=null;
        Token EIGHTEENTH274=null;
        Token NINETEENTH275=null;
        Token TWENTIETH276=null;
        Token TWENTY_FIRST277=null;
        Token TWENTY278=null;
        Token DASH279=null;
        Token WHITE_SPACE280=null;
        Token FIRST281=null;
        Token TWENTY_SECOND282=null;
        Token TWENTY283=null;
        Token DASH284=null;
        Token WHITE_SPACE285=null;
        Token SECOND286=null;
        Token TWENTY_THIRD287=null;
        Token TWENTY288=null;
        Token DASH289=null;
        Token WHITE_SPACE290=null;
        Token THIRD291=null;
        Token TWENTY_FOURTH292=null;
        Token TWENTY293=null;
        Token DASH294=null;
        Token WHITE_SPACE295=null;
        Token FOURTH296=null;
        Token TWENTY_FIFTH297=null;
        Token TWENTY298=null;
        Token DASH299=null;
        Token WHITE_SPACE300=null;
        Token FIFTH301=null;
        Token TWENTY_SIXTH302=null;
        Token TWENTY303=null;
        Token DASH304=null;
        Token WHITE_SPACE305=null;
        Token SIXTH306=null;
        Token TWENTY_SEVENTH307=null;
        Token TWENTY308=null;
        Token DASH309=null;
        Token WHITE_SPACE310=null;
        Token SEVENTH311=null;
        Token TWENTY_EIGHTH312=null;
        Token TWENTY313=null;
        Token DASH314=null;
        Token WHITE_SPACE315=null;
        Token EIGHTH316=null;
        Token TWENTY_NINTH317=null;
        Token TWENTY318=null;
        Token DASH319=null;
        Token WHITE_SPACE320=null;
        Token NINTH321=null;
        Token THIRTIETH322=null;
        Token THIRTY_FIRST323=null;
        Token THIRTY324=null;
        Token DASH325=null;
        Token WHITE_SPACE326=null;
        Token FIRST327=null;

        Object FIRST257_tree=null;
        Object SECOND258_tree=null;
        Object THIRD259_tree=null;
        Object FOURTH260_tree=null;
        Object FIFTH261_tree=null;
        Object SIXTH262_tree=null;
        Object SEVENTH263_tree=null;
        Object EIGHTH264_tree=null;
        Object NINTH265_tree=null;
        Object TENTH266_tree=null;
        Object ELEVENTH267_tree=null;
        Object TWELFTH268_tree=null;
        Object THIRTEENTH269_tree=null;
        Object FOURTEENTH270_tree=null;
        Object FIFTEENTH271_tree=null;
        Object SIXTEENTH272_tree=null;
        Object SEVENTEENTH273_tree=null;
        Object EIGHTEENTH274_tree=null;
        Object NINETEENTH275_tree=null;
        Object TWENTIETH276_tree=null;
        Object TWENTY_FIRST277_tree=null;
        Object TWENTY278_tree=null;
        Object DASH279_tree=null;
        Object WHITE_SPACE280_tree=null;
        Object FIRST281_tree=null;
        Object TWENTY_SECOND282_tree=null;
        Object TWENTY283_tree=null;
        Object DASH284_tree=null;
        Object WHITE_SPACE285_tree=null;
        Object SECOND286_tree=null;
        Object TWENTY_THIRD287_tree=null;
        Object TWENTY288_tree=null;
        Object DASH289_tree=null;
        Object WHITE_SPACE290_tree=null;
        Object THIRD291_tree=null;
        Object TWENTY_FOURTH292_tree=null;
        Object TWENTY293_tree=null;
        Object DASH294_tree=null;
        Object WHITE_SPACE295_tree=null;
        Object FOURTH296_tree=null;
        Object TWENTY_FIFTH297_tree=null;
        Object TWENTY298_tree=null;
        Object DASH299_tree=null;
        Object WHITE_SPACE300_tree=null;
        Object FIFTH301_tree=null;
        Object TWENTY_SIXTH302_tree=null;
        Object TWENTY303_tree=null;
        Object DASH304_tree=null;
        Object WHITE_SPACE305_tree=null;
        Object SIXTH306_tree=null;
        Object TWENTY_SEVENTH307_tree=null;
        Object TWENTY308_tree=null;
        Object DASH309_tree=null;
        Object WHITE_SPACE310_tree=null;
        Object SEVENTH311_tree=null;
        Object TWENTY_EIGHTH312_tree=null;
        Object TWENTY313_tree=null;
        Object DASH314_tree=null;
        Object WHITE_SPACE315_tree=null;
        Object EIGHTH316_tree=null;
        Object TWENTY_NINTH317_tree=null;
        Object TWENTY318_tree=null;
        Object DASH319_tree=null;
        Object WHITE_SPACE320_tree=null;
        Object NINTH321_tree=null;
        Object THIRTIETH322_tree=null;
        Object THIRTY_FIRST323_tree=null;
        Object THIRTY324_tree=null;
        Object DASH325_tree=null;
        Object WHITE_SPACE326_tree=null;
        Object FIRST327_tree=null;
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:337:3: ( FIRST -> INT[\"1\"] | SECOND -> INT[\"2\"] | THIRD -> INT[\"3\"] | FOURTH -> INT[\"4\"] | FIFTH -> INT[\"5\"] | SIXTH -> INT[\"6\"] | SEVENTH -> INT[\"7\"] | EIGHTH -> INT[\"8\"] | NINTH -> INT[\"9\"] | TENTH -> INT[\"10\"] | ELEVENTH -> INT[\"11\"] | TWELFTH -> INT[\"12\"] | THIRTEENTH -> INT[\"13\"] | FOURTEENTH -> INT[\"14\"] | FIFTEENTH -> INT[\"15\"] | SIXTEENTH -> INT[\"16\"] | SEVENTEENTH -> INT[\"17\"] | EIGHTEENTH -> INT[\"18\"] | NINETEENTH -> INT[\"19\"] | TWENTIETH -> INT[\"20\"] | ( TWENTY_FIRST | ( TWENTY ( DASH | WHITE_SPACE )? FIRST ) ) -> INT[\"21\"] | ( TWENTY_SECOND | ( TWENTY ( DASH | WHITE_SPACE )? SECOND ) ) -> INT[\"22\"] | ( TWENTY_THIRD | ( TWENTY ( DASH | WHITE_SPACE )? THIRD ) ) -> INT[\"23\"] | ( TWENTY_FOURTH | ( TWENTY ( DASH | WHITE_SPACE )? FOURTH ) ) -> INT[\"24\"] | ( TWENTY_FIFTH | ( TWENTY ( DASH | WHITE_SPACE )? FIFTH ) ) -> INT[\"25\"] | ( TWENTY_SIXTH | ( TWENTY ( DASH | WHITE_SPACE )? SIXTH ) ) -> INT[\"26\"] | ( TWENTY_SEVENTH | ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH ) ) -> INT[\"27\"] | ( TWENTY_EIGHTH | ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH ) ) -> INT[\"28\"] | ( TWENTY_NINTH | ( TWENTY ( DASH | WHITE_SPACE )? NINTH ) ) -> INT[\"29\"] | THIRTIETH -> INT[\"30\"] | ( THIRTY_FIRST | ( THIRTY ( DASH | WHITE_SPACE )? FIRST ) ) -> INT[\"31\"] )
            int alt93=31;
            alt93 = dfa93.predict(input);
            switch (alt93) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:337:5: FIRST
                    {
                    FIRST257=(Token)match(input,FIRST,FOLLOW_FIRST_in_spelled_first_to_thirty_first3031); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIRST.add(FIRST257);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 337:17: -> INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:338:5: SECOND
                    {
                    SECOND258=(Token)match(input,SECOND,FOLLOW_SECOND_in_spelled_first_to_thirty_first3048); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SECOND.add(SECOND258);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 338:17: -> INT[\"2\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "2"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:339:5: THIRD
                    {
                    THIRD259=(Token)match(input,THIRD,FOLLOW_THIRD_in_spelled_first_to_thirty_first3064); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRD.add(THIRD259);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 339:17: -> INT[\"3\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "3"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:340:5: FOURTH
                    {
                    FOURTH260=(Token)match(input,FOURTH,FOLLOW_FOURTH_in_spelled_first_to_thirty_first3081); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOURTH.add(FOURTH260);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 340:17: -> INT[\"4\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "4"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:341:5: FIFTH
                    {
                    FIFTH261=(Token)match(input,FIFTH,FOLLOW_FIFTH_in_spelled_first_to_thirty_first3097); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIFTH.add(FIFTH261);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 341:17: -> INT[\"5\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "5"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:342:5: SIXTH
                    {
                    SIXTH262=(Token)match(input,SIXTH,FOLLOW_SIXTH_in_spelled_first_to_thirty_first3114); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTH.add(SIXTH262);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 342:17: -> INT[\"6\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "6"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:343:5: SEVENTH
                    {
                    SEVENTH263=(Token)match(input,SEVENTH,FOLLOW_SEVENTH_in_spelled_first_to_thirty_first3131); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVENTH.add(SEVENTH263);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 343:17: -> INT[\"7\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "7"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:344:5: EIGHTH
                    {
                    EIGHTH264=(Token)match(input,EIGHTH,FOLLOW_EIGHTH_in_spelled_first_to_thirty_first3146); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHTH.add(EIGHTH264);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 344:17: -> INT[\"8\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "8"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:345:5: NINTH
                    {
                    NINTH265=(Token)match(input,NINTH,FOLLOW_NINTH_in_spelled_first_to_thirty_first3162); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINTH.add(NINTH265);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 345:17: -> INT[\"9\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "9"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:346:5: TENTH
                    {
                    TENTH266=(Token)match(input,TENTH,FOLLOW_TENTH_in_spelled_first_to_thirty_first3179); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TENTH.add(TENTH266);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 346:17: -> INT[\"10\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "10"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:347:5: ELEVENTH
                    {
                    ELEVENTH267=(Token)match(input,ELEVENTH,FOLLOW_ELEVENTH_in_spelled_first_to_thirty_first3196); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELEVENTH.add(ELEVENTH267);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 347:17: -> INT[\"11\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "11"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:348:5: TWELFTH
                    {
                    TWELFTH268=(Token)match(input,TWELFTH,FOLLOW_TWELFTH_in_spelled_first_to_thirty_first3210); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWELFTH.add(TWELFTH268);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 348:17: -> INT[\"12\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "12"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:349:5: THIRTEENTH
                    {
                    THIRTEENTH269=(Token)match(input,THIRTEENTH,FOLLOW_THIRTEENTH_in_spelled_first_to_thirty_first3225); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEENTH.add(THIRTEENTH269);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 349:17: -> INT[\"13\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "13"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 14 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:350:5: FOURTEENTH
                    {
                    FOURTEENTH270=(Token)match(input,FOURTEENTH,FOLLOW_FOURTEENTH_in_spelled_first_to_thirty_first3237); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOURTEENTH.add(FOURTEENTH270);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 350:17: -> INT[\"14\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "14"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 15 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:351:5: FIFTEENTH
                    {
                    FIFTEENTH271=(Token)match(input,FIFTEENTH,FOLLOW_FIFTEENTH_in_spelled_first_to_thirty_first3249); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIFTEENTH.add(FIFTEENTH271);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 351:17: -> INT[\"15\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "15"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 16 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:352:5: SIXTEENTH
                    {
                    SIXTEENTH272=(Token)match(input,SIXTEENTH,FOLLOW_SIXTEENTH_in_spelled_first_to_thirty_first3262); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTEENTH.add(SIXTEENTH272);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 352:17: -> INT[\"16\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "16"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 17 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:353:5: SEVENTEENTH
                    {
                    SEVENTEENTH273=(Token)match(input,SEVENTEENTH,FOLLOW_SEVENTEENTH_in_spelled_first_to_thirty_first3275); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVENTEENTH.add(SEVENTEENTH273);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 353:17: -> INT[\"17\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "17"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 18 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:354:5: EIGHTEENTH
                    {
                    EIGHTEENTH274=(Token)match(input,EIGHTEENTH,FOLLOW_EIGHTEENTH_in_spelled_first_to_thirty_first3286); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHTEENTH.add(EIGHTEENTH274);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 354:17: -> INT[\"18\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "18"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 19 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:355:5: NINETEENTH
                    {
                    NINETEENTH275=(Token)match(input,NINETEENTH,FOLLOW_NINETEENTH_in_spelled_first_to_thirty_first3298); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINETEENTH.add(NINETEENTH275);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 355:17: -> INT[\"19\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "19"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 20 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:356:5: TWENTIETH
                    {
                    TWENTIETH276=(Token)match(input,TWENTIETH,FOLLOW_TWENTIETH_in_spelled_first_to_thirty_first3310); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTIETH.add(TWENTIETH276);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 356:17: -> INT[\"20\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "20"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 21 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:357:5: ( TWENTY_FIRST | ( TWENTY ( DASH | WHITE_SPACE )? FIRST ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:357:5: ( TWENTY_FIRST | ( TWENTY ( DASH | WHITE_SPACE )? FIRST ) )
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==TWENTY_FIRST) ) {
                        alt74=1;
                    }
                    else if ( (LA74_0==TWENTY) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:357:6: TWENTY_FIRST
                            {
                            TWENTY_FIRST277=(Token)match(input,TWENTY_FIRST,FOLLOW_TWENTY_FIRST_in_spelled_first_to_thirty_first3324); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_FIRST.add(TWENTY_FIRST277);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:357:23: ( TWENTY ( DASH | WHITE_SPACE )? FIRST )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:357:23: ( TWENTY ( DASH | WHITE_SPACE )? FIRST )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:357:24: TWENTY ( DASH | WHITE_SPACE )? FIRST
                            {
                            TWENTY278=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3331); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY278);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:357:31: ( DASH | WHITE_SPACE )?
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
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:357:32: DASH
                                    {
                                    DASH279=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3334); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH279);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:357:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE280=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3338); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE280);


                                    }
                                    break;

                            }

                            FIRST281=(Token)match(input,FIRST,FOLLOW_FIRST_in_spelled_first_to_thirty_first3342); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FIRST.add(FIRST281);


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
                    // 357:63: -> INT[\"21\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "21"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 22 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:358:5: ( TWENTY_SECOND | ( TWENTY ( DASH | WHITE_SPACE )? SECOND ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:358:5: ( TWENTY_SECOND | ( TWENTY ( DASH | WHITE_SPACE )? SECOND ) )
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==TWENTY_SECOND) ) {
                        alt76=1;
                    }
                    else if ( (LA76_0==TWENTY) ) {
                        alt76=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 76, 0, input);

                        throw nvae;
                    }
                    switch (alt76) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:358:6: TWENTY_SECOND
                            {
                            TWENTY_SECOND282=(Token)match(input,TWENTY_SECOND,FOLLOW_TWENTY_SECOND_in_spelled_first_to_thirty_first3358); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_SECOND.add(TWENTY_SECOND282);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:358:23: ( TWENTY ( DASH | WHITE_SPACE )? SECOND )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:358:23: ( TWENTY ( DASH | WHITE_SPACE )? SECOND )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:358:24: TWENTY ( DASH | WHITE_SPACE )? SECOND
                            {
                            TWENTY283=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3364); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY283);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:358:31: ( DASH | WHITE_SPACE )?
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
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:358:32: DASH
                                    {
                                    DASH284=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3367); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH284);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:358:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE285=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3371); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE285);


                                    }
                                    break;

                            }

                            SECOND286=(Token)match(input,SECOND,FOLLOW_SECOND_in_spelled_first_to_thirty_first3375); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SECOND.add(SECOND286);


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
                    // 358:63: -> INT[\"22\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "22"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 23 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:359:5: ( TWENTY_THIRD | ( TWENTY ( DASH | WHITE_SPACE )? THIRD ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:359:5: ( TWENTY_THIRD | ( TWENTY ( DASH | WHITE_SPACE )? THIRD ) )
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==TWENTY_THIRD) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:359:6: TWENTY_THIRD
                            {
                            TWENTY_THIRD287=(Token)match(input,TWENTY_THIRD,FOLLOW_TWENTY_THIRD_in_spelled_first_to_thirty_first3390); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_THIRD.add(TWENTY_THIRD287);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:359:23: ( TWENTY ( DASH | WHITE_SPACE )? THIRD )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:359:23: ( TWENTY ( DASH | WHITE_SPACE )? THIRD )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:359:24: TWENTY ( DASH | WHITE_SPACE )? THIRD
                            {
                            TWENTY288=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3397); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY288);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:359:31: ( DASH | WHITE_SPACE )?
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
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:359:32: DASH
                                    {
                                    DASH289=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3400); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH289);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:359:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE290=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3404); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE290);


                                    }
                                    break;

                            }

                            THIRD291=(Token)match(input,THIRD,FOLLOW_THIRD_in_spelled_first_to_thirty_first3408); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIRD.add(THIRD291);


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
                    // 359:63: -> INT[\"23\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "23"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 24 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:360:5: ( TWENTY_FOURTH | ( TWENTY ( DASH | WHITE_SPACE )? FOURTH ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:360:5: ( TWENTY_FOURTH | ( TWENTY ( DASH | WHITE_SPACE )? FOURTH ) )
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==TWENTY_FOURTH) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:360:6: TWENTY_FOURTH
                            {
                            TWENTY_FOURTH292=(Token)match(input,TWENTY_FOURTH,FOLLOW_TWENTY_FOURTH_in_spelled_first_to_thirty_first3424); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_FOURTH.add(TWENTY_FOURTH292);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:360:23: ( TWENTY ( DASH | WHITE_SPACE )? FOURTH )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:360:23: ( TWENTY ( DASH | WHITE_SPACE )? FOURTH )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:360:24: TWENTY ( DASH | WHITE_SPACE )? FOURTH
                            {
                            TWENTY293=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3430); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY293);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:360:31: ( DASH | WHITE_SPACE )?
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
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:360:32: DASH
                                    {
                                    DASH294=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3433); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH294);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:360:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE295=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3437); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE295);


                                    }
                                    break;

                            }

                            FOURTH296=(Token)match(input,FOURTH,FOLLOW_FOURTH_in_spelled_first_to_thirty_first3441); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FOURTH.add(FOURTH296);


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
                    // 360:63: -> INT[\"24\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "24"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 25 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:361:5: ( TWENTY_FIFTH | ( TWENTY ( DASH | WHITE_SPACE )? FIFTH ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:361:5: ( TWENTY_FIFTH | ( TWENTY ( DASH | WHITE_SPACE )? FIFTH ) )
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==TWENTY_FIFTH) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:361:6: TWENTY_FIFTH
                            {
                            TWENTY_FIFTH297=(Token)match(input,TWENTY_FIFTH,FOLLOW_TWENTY_FIFTH_in_spelled_first_to_thirty_first3456); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_FIFTH.add(TWENTY_FIFTH297);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:361:23: ( TWENTY ( DASH | WHITE_SPACE )? FIFTH )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:361:23: ( TWENTY ( DASH | WHITE_SPACE )? FIFTH )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:361:24: TWENTY ( DASH | WHITE_SPACE )? FIFTH
                            {
                            TWENTY298=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3463); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY298);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:361:31: ( DASH | WHITE_SPACE )?
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
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:361:32: DASH
                                    {
                                    DASH299=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3466); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH299);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:361:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE300=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3470); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE300);


                                    }
                                    break;

                            }

                            FIFTH301=(Token)match(input,FIFTH,FOLLOW_FIFTH_in_spelled_first_to_thirty_first3474); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FIFTH.add(FIFTH301);


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
                    // 361:63: -> INT[\"25\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "25"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 26 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:362:5: ( TWENTY_SIXTH | ( TWENTY ( DASH | WHITE_SPACE )? SIXTH ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:362:5: ( TWENTY_SIXTH | ( TWENTY ( DASH | WHITE_SPACE )? SIXTH ) )
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==TWENTY_SIXTH) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:362:6: TWENTY_SIXTH
                            {
                            TWENTY_SIXTH302=(Token)match(input,TWENTY_SIXTH,FOLLOW_TWENTY_SIXTH_in_spelled_first_to_thirty_first3490); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_SIXTH.add(TWENTY_SIXTH302);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:362:23: ( TWENTY ( DASH | WHITE_SPACE )? SIXTH )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:362:23: ( TWENTY ( DASH | WHITE_SPACE )? SIXTH )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:362:24: TWENTY ( DASH | WHITE_SPACE )? SIXTH
                            {
                            TWENTY303=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3497); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY303);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:362:31: ( DASH | WHITE_SPACE )?
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
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:362:32: DASH
                                    {
                                    DASH304=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3500); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH304);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:362:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE305=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3504); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE305);


                                    }
                                    break;

                            }

                            SIXTH306=(Token)match(input,SIXTH,FOLLOW_SIXTH_in_spelled_first_to_thirty_first3508); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SIXTH.add(SIXTH306);


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
                    // 362:63: -> INT[\"26\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "26"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 27 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:363:5: ( TWENTY_SEVENTH | ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:363:5: ( TWENTY_SEVENTH | ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH ) )
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==TWENTY_SEVENTH) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:363:6: TWENTY_SEVENTH
                            {
                            TWENTY_SEVENTH307=(Token)match(input,TWENTY_SEVENTH,FOLLOW_TWENTY_SEVENTH_in_spelled_first_to_thirty_first3524); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_SEVENTH.add(TWENTY_SEVENTH307);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:363:23: ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:363:23: ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:363:24: TWENTY ( DASH | WHITE_SPACE )? SEVENTH
                            {
                            TWENTY308=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3529); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY308);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:363:31: ( DASH | WHITE_SPACE )?
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
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:363:32: DASH
                                    {
                                    DASH309=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3532); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH309);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:363:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE310=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3536); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE310);


                                    }
                                    break;

                            }

                            SEVENTH311=(Token)match(input,SEVENTH,FOLLOW_SEVENTH_in_spelled_first_to_thirty_first3540); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SEVENTH.add(SEVENTH311);


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
                    // 363:63: -> INT[\"27\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "27"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 28 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:364:5: ( TWENTY_EIGHTH | ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:364:5: ( TWENTY_EIGHTH | ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH ) )
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==TWENTY_EIGHTH) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:364:6: TWENTY_EIGHTH
                            {
                            TWENTY_EIGHTH312=(Token)match(input,TWENTY_EIGHTH,FOLLOW_TWENTY_EIGHTH_in_spelled_first_to_thirty_first3554); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_EIGHTH.add(TWENTY_EIGHTH312);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:364:23: ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:364:23: ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:364:24: TWENTY ( DASH | WHITE_SPACE )? EIGHTH
                            {
                            TWENTY313=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3560); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY313);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:364:31: ( DASH | WHITE_SPACE )?
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
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:364:32: DASH
                                    {
                                    DASH314=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3563); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH314);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:364:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE315=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3567); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE315);


                                    }
                                    break;

                            }

                            EIGHTH316=(Token)match(input,EIGHTH,FOLLOW_EIGHTH_in_spelled_first_to_thirty_first3571); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EIGHTH.add(EIGHTH316);


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
                    // 364:63: -> INT[\"28\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "28"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 29 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:365:5: ( TWENTY_NINTH | ( TWENTY ( DASH | WHITE_SPACE )? NINTH ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:365:5: ( TWENTY_NINTH | ( TWENTY ( DASH | WHITE_SPACE )? NINTH ) )
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==TWENTY_NINTH) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:365:6: TWENTY_NINTH
                            {
                            TWENTY_NINTH317=(Token)match(input,TWENTY_NINTH,FOLLOW_TWENTY_NINTH_in_spelled_first_to_thirty_first3586); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_NINTH.add(TWENTY_NINTH317);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:365:23: ( TWENTY ( DASH | WHITE_SPACE )? NINTH )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:365:23: ( TWENTY ( DASH | WHITE_SPACE )? NINTH )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:365:24: TWENTY ( DASH | WHITE_SPACE )? NINTH
                            {
                            TWENTY318=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3593); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY318);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:365:31: ( DASH | WHITE_SPACE )?
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
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:365:32: DASH
                                    {
                                    DASH319=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3596); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH319);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:365:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE320=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3600); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE320);


                                    }
                                    break;

                            }

                            NINTH321=(Token)match(input,NINTH,FOLLOW_NINTH_in_spelled_first_to_thirty_first3604); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NINTH.add(NINTH321);


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
                    // 365:63: -> INT[\"29\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "29"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 30 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:366:5: THIRTIETH
                    {
                    THIRTIETH322=(Token)match(input,THIRTIETH,FOLLOW_THIRTIETH_in_spelled_first_to_thirty_first3619); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTIETH.add(THIRTIETH322);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 366:63: -> INT[\"30\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "30"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 31 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:367:5: ( THIRTY_FIRST | ( THIRTY ( DASH | WHITE_SPACE )? FIRST ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:367:5: ( THIRTY_FIRST | ( THIRTY ( DASH | WHITE_SPACE )? FIRST ) )
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==THIRTY_FIRST) ) {
                        alt92=1;
                    }
                    else if ( (LA92_0==THIRTY) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:367:6: THIRTY_FIRST
                            {
                            THIRTY_FIRST323=(Token)match(input,THIRTY_FIRST,FOLLOW_THIRTY_FIRST_in_spelled_first_to_thirty_first3679); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIRTY_FIRST.add(THIRTY_FIRST323);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:367:23: ( THIRTY ( DASH | WHITE_SPACE )? FIRST )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:367:23: ( THIRTY ( DASH | WHITE_SPACE )? FIRST )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:367:24: THIRTY ( DASH | WHITE_SPACE )? FIRST
                            {
                            THIRTY324=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_first_to_thirty_first3686); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY324);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:367:31: ( DASH | WHITE_SPACE )?
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
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:367:32: DASH
                                    {
                                    DASH325=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3689); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH325);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:367:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE326=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3693); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE326);


                                    }
                                    break;

                            }

                            FIRST327=(Token)match(input,FIRST,FOLLOW_FIRST_in_spelled_first_to_thirty_first3697); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FIRST.add(FIRST327);


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
                    // 367:63: -> INT[\"31\"]
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
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:31:7: ( date ( date_time_separator time )? )
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:31:8: date ( date_time_separator time )?
        {
        pushFollow(FOLLOW_date_in_synpred1_Date139);
        date();

        state._fsp--;
        if (state.failed) return ;
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:31:13: ( date_time_separator time )?
        int alt94=2;
        int LA94_0 = input.LA(1);

        if ( (LA94_0==WHITE_SPACE||LA94_0==COMMA) ) {
            alt94=1;
        }
        switch (alt94) {
            case 1 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:31:14: date_time_separator time
                {
                pushFollow(FOLLOW_date_time_separator_in_synpred1_Date142);
                date_time_separator();

                state._fsp--;
                if (state.failed) return ;
                pushFollow(FOLLOW_time_in_synpred1_Date144);
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
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:77:7: ( ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year )
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:77:8: ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year
        {
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:77:8: ( THE WHITE_SPACE )?
        int alt95=2;
        int LA95_0 = input.LA(1);

        if ( (LA95_0==THE) ) {
            alt95=1;
        }
        switch (alt95) {
            case 1 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:77:9: THE WHITE_SPACE
                {
                match(input,THE,FOLLOW_THE_in_synpred2_Date543); if (state.failed) return ;
                match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred2_Date545); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_relaxed_day_of_month_in_synpred2_Date549);
        relaxed_day_of_month();

        state._fsp--;
        if (state.failed) return ;
        match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred2_Date551); if (state.failed) return ;
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:77:60: ( OF WHITE_SPACE )?
        int alt96=2;
        int LA96_0 = input.LA(1);

        if ( (LA96_0==OF) ) {
            alt96=1;
        }
        switch (alt96) {
            case 1 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:77:61: OF WHITE_SPACE
                {
                match(input,OF,FOLLOW_OF_in_synpred2_Date554); if (state.failed) return ;
                match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred2_Date556); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_relaxed_month_in_synpred2_Date560);
        relaxed_month();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_relaxed_year_in_synpred2_Date562);
        relaxed_year();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Date

    // $ANTLR start synpred3_Date
    public final void synpred3_Date_fragment() throws RecognitionException {   
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:80:9: ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year )
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:80:10: relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year
        {
        pushFollow(FOLLOW_relaxed_month_in_synpred3_Date610);
        relaxed_month();

        state._fsp--;
        if (state.failed) return ;
        match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred3_Date612); if (state.failed) return ;
        pushFollow(FOLLOW_relaxed_day_of_month_in_synpred3_Date614);
        relaxed_day_of_month();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_relaxed_year_in_synpred3_Date616);
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


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA93 dfa93 = new DFA93(this);
    static final String DFA3_eotS =
        "\u008e\uffff";
    static final String DFA3_eofS =
        "\3\uffff\3\124\3\uffff\1\124\113\uffff\5\124\1\uffff\1\124\3\uffff"+
        "\14\170\7\uffff\1\170\33\uffff";
    static final String DFA3_minS =
        "\1\30\2\uffff\3\24\3\uffff\1\24\113\uffff\5\24\1\uffff\1\24\3\uffff"+
        "\14\24\7\uffff\1\24\3\uffff\1\25\2\uffff\1\25\4\uffff\3\0\2\uffff"+
        "\1\0\12\uffff";
    static final String DFA3_maxS =
        "\1\u0085\2\uffff\3\121\3\uffff\1\120\113\uffff\5\107\1\uffff\1\u0085"+
        "\3\uffff\14\26\7\uffff\1\26\3\uffff\1\u0085\2\uffff\1\116\4\uffff"+
        "\3\0\2\uffff\1\0\12\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\2\1\3\uffff\3\1\1\uffff\112\1\1\2\5\uffff\1\1\1\uffff\3"+
        "\1\14\uffff\7\1\1\uffff\3\1\1\uffff\2\1\1\uffff\4\1\3\uffff\2\1"+
        "\1\uffff\12\1";
    static final String DFA3_specialS =
        "\1\2\2\uffff\1\17\1\5\1\33\3\uffff\1\13\113\uffff\1\3\1\0\1\1\1"+
        "\7\1\10\1\uffff\1\24\3\uffff\1\32\1\34\1\30\1\31\1\26\1\27\1\22"+
        "\1\23\1\20\1\21\1\16\1\15\7\uffff\1\14\3\uffff\1\12\2\uffff\1\11"+
        "\4\uffff\1\4\1\6\1\35\2\uffff\1\25\12\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\1\2\3\uffff\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105"+
            "\1\106\1\107\1\110\1\111\1\uffff\1\120\3\uffff\1\112\1\113\1"+
            "\114\1\115\1\116\1\117\14\uffff\1\121\1\122\1\123\5\uffff\3"+
            "\124\1\3\1\11\1\4\1\5\1\6\1\7\1\10\1\12\1\13\1\14\1\15\1\16"+
            "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
            "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
            "\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62"+
            "\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75",
            "",
            "",
            "\1\124\1\uffff\1\124\54\uffff\1\124\2\uffff\2\124\3\uffff\1"+
            "\125\1\uffff\1\126\1\127\1\130\1\131\1\132",
            "\1\133\1\uffff\1\124\25\uffff\2\134\25\uffff\1\124\2\uffff"+
            "\2\124\3\uffff\1\125\1\uffff\1\126\1\127\1\130\1\131\1\132",
            "\1\133\1\uffff\1\124\54\uffff\1\124\2\uffff\2\124\3\uffff\1"+
            "\125\1\uffff\1\126\1\127\1\130\1\131\1\132",
            "",
            "",
            "",
            "\1\133\1\uffff\1\124\25\uffff\2\134\25\uffff\1\124\2\uffff"+
            "\2\124\3\uffff\1\124\1\uffff\4\124",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\124\1\uffff\1\124\25\uffff\2\135\26\uffff\4\124",
            "\1\124\1\uffff\1\124\25\uffff\2\135\26\uffff\4\124",
            "\1\124\1\uffff\1\124\25\uffff\2\135\26\uffff\4\124",
            "\1\124\1\uffff\1\124\25\uffff\2\135\26\uffff\4\124",
            "\1\124\1\uffff\1\124\25\uffff\2\135\26\uffff\4\124",
            "",
            "\1\124\1\uffff\3\124\1\162\2\uffff\1\136\1\137\1\140\1\141"+
            "\1\142\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\uffff"+
            "\1\124\1\165\2\uffff\6\124\3\uffff\1\163\1\164\1\153\1\154\1"+
            "\155\1\156\1\157\1\160\1\161\3\124\3\uffff\2\124\3\uffff\73"+
            "\124",
            "",
            "",
            "",
            "\1\166\1\uffff\1\167",
            "\1\166\1\uffff\1\167",
            "\1\166\1\uffff\1\167",
            "\1\166\1\uffff\1\167",
            "\1\166\1\uffff\1\167",
            "\1\166\1\uffff\1\167",
            "\1\166\1\uffff\1\167",
            "\1\166\1\uffff\1\167",
            "\1\166\1\uffff\1\167",
            "\1\166\1\uffff\1\167",
            "\1\166\1\uffff\1\167",
            "\1\166\1\uffff\1\167",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\171\1\uffff\1\172",
            "",
            "",
            "",
            "\1\u0084\23\uffff\1\174\1\173\35\uffff\1\u0086\1\u0087\1\u0085"+
            "\1\175\1\u0083\1\176\1\177\1\u0080\1\u0081\1\u0082\64\124",
            "",
            "",
            "\1\u0084\4\uffff\2\124\30\uffff\1\u0088\1\uffff\1\u0089\21"+
            "\uffff\1\u0086\1\u0087\1\u0085\1\u008a\1\u008b\1\u008c\1\u008d",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
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
            return "30:5: ( ( date ( date_time_separator time )? )=> date ( date_time_separator time )? | time ( time_date_separator date )? )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_86 = input.LA(1);

                         
                        int index3_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_86==EOF||LA3_86==WHITE_SPACE||LA3_86==COMMA||(LA3_86>=MILITARY_HOUR_SUFFIX && LA3_86<=PM)) ) {s = 84;}

                        else if ( ((LA3_86>=DASH && LA3_86<=SLASH)) && (synpred1_Date())) {s = 93;}

                         
                        input.seek(index3_86);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_87 = input.LA(1);

                         
                        int index3_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA3_87>=DASH && LA3_87<=SLASH)) && (synpred1_Date())) {s = 93;}

                        else if ( (LA3_87==EOF||LA3_87==WHITE_SPACE||LA3_87==COMMA||(LA3_87>=MILITARY_HOUR_SUFFIX && LA3_87<=PM)) ) {s = 84;}

                         
                        input.seek(index3_87);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA3_0 = input.LA(1);

                         
                        int index3_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_0==THE) && (synpred1_Date())) {s = 1;}

                        else if ( (LA3_0==DAY) && (synpred1_Date())) {s = 2;}

                        else if ( (LA3_0==INT_00) ) {s = 3;}

                        else if ( (LA3_0==INT_01_TO_12) ) {s = 4;}

                        else if ( (LA3_0==INT_13_TO_23) ) {s = 5;}

                        else if ( (LA3_0==INT_24_TO_31) && (synpred1_Date())) {s = 6;}

                        else if ( (LA3_0==INT_32_TO_59) && (synpred1_Date())) {s = 7;}

                        else if ( (LA3_0==INT_60_TO_99) && (synpred1_Date())) {s = 8;}

                        else if ( (LA3_0==INT_1_TO_9) ) {s = 9;}

                        else if ( (LA3_0==ONE) && (synpred1_Date())) {s = 10;}

                        else if ( (LA3_0==TWO) && (synpred1_Date())) {s = 11;}

                        else if ( (LA3_0==THREE) && (synpred1_Date())) {s = 12;}

                        else if ( (LA3_0==FOUR) && (synpred1_Date())) {s = 13;}

                        else if ( (LA3_0==FIVE) && (synpred1_Date())) {s = 14;}

                        else if ( (LA3_0==SIX) && (synpred1_Date())) {s = 15;}

                        else if ( (LA3_0==SEVEN) && (synpred1_Date())) {s = 16;}

                        else if ( (LA3_0==EIGHT) && (synpred1_Date())) {s = 17;}

                        else if ( (LA3_0==NINE) && (synpred1_Date())) {s = 18;}

                        else if ( (LA3_0==TEN) && (synpred1_Date())) {s = 19;}

                        else if ( (LA3_0==ELEVEN) && (synpred1_Date())) {s = 20;}

                        else if ( (LA3_0==TWELVE) && (synpred1_Date())) {s = 21;}

                        else if ( (LA3_0==THIRTEEN) && (synpred1_Date())) {s = 22;}

                        else if ( (LA3_0==FOURTEEN) && (synpred1_Date())) {s = 23;}

                        else if ( (LA3_0==FIFTEEN) && (synpred1_Date())) {s = 24;}

                        else if ( (LA3_0==SIXTEEN) && (synpred1_Date())) {s = 25;}

                        else if ( (LA3_0==SEVENTEEN) && (synpred1_Date())) {s = 26;}

                        else if ( (LA3_0==EIGHTEEN) && (synpred1_Date())) {s = 27;}

                        else if ( (LA3_0==NINETEEN) && (synpred1_Date())) {s = 28;}

                        else if ( (LA3_0==TWENTY) && (synpred1_Date())) {s = 29;}

                        else if ( (LA3_0==THIRTY) && (synpred1_Date())) {s = 30;}

                        else if ( (LA3_0==FIRST) && (synpred1_Date())) {s = 31;}

                        else if ( (LA3_0==SECOND) && (synpred1_Date())) {s = 32;}

                        else if ( (LA3_0==THIRD) && (synpred1_Date())) {s = 33;}

                        else if ( (LA3_0==FOURTH) && (synpred1_Date())) {s = 34;}

                        else if ( (LA3_0==FIFTH) && (synpred1_Date())) {s = 35;}

                        else if ( (LA3_0==SIXTH) && (synpred1_Date())) {s = 36;}

                        else if ( (LA3_0==SEVENTH) && (synpred1_Date())) {s = 37;}

                        else if ( (LA3_0==EIGHTH) && (synpred1_Date())) {s = 38;}

                        else if ( (LA3_0==NINTH) && (synpred1_Date())) {s = 39;}

                        else if ( (LA3_0==TENTH) && (synpred1_Date())) {s = 40;}

                        else if ( (LA3_0==ELEVENTH) && (synpred1_Date())) {s = 41;}

                        else if ( (LA3_0==TWELFTH) && (synpred1_Date())) {s = 42;}

                        else if ( (LA3_0==THIRTEENTH) && (synpred1_Date())) {s = 43;}

                        else if ( (LA3_0==FOURTEENTH) && (synpred1_Date())) {s = 44;}

                        else if ( (LA3_0==FIFTEENTH) && (synpred1_Date())) {s = 45;}

                        else if ( (LA3_0==SIXTEENTH) && (synpred1_Date())) {s = 46;}

                        else if ( (LA3_0==SEVENTEENTH) && (synpred1_Date())) {s = 47;}

                        else if ( (LA3_0==EIGHTEENTH) && (synpred1_Date())) {s = 48;}

                        else if ( (LA3_0==NINETEENTH) && (synpred1_Date())) {s = 49;}

                        else if ( (LA3_0==TWENTIETH) && (synpred1_Date())) {s = 50;}

                        else if ( (LA3_0==TWENTY_FIRST) && (synpred1_Date())) {s = 51;}

                        else if ( (LA3_0==TWENTY_SECOND) && (synpred1_Date())) {s = 52;}

                        else if ( (LA3_0==TWENTY_THIRD) && (synpred1_Date())) {s = 53;}

                        else if ( (LA3_0==TWENTY_FOURTH) && (synpred1_Date())) {s = 54;}

                        else if ( (LA3_0==TWENTY_FIFTH) && (synpred1_Date())) {s = 55;}

                        else if ( (LA3_0==TWENTY_SIXTH) && (synpred1_Date())) {s = 56;}

                        else if ( (LA3_0==TWENTY_SEVENTH) && (synpred1_Date())) {s = 57;}

                        else if ( (LA3_0==TWENTY_EIGHTH) && (synpred1_Date())) {s = 58;}

                        else if ( (LA3_0==TWENTY_NINTH) && (synpred1_Date())) {s = 59;}

                        else if ( (LA3_0==THIRTIETH) && (synpred1_Date())) {s = 60;}

                        else if ( (LA3_0==THIRTY_FIRST) && (synpred1_Date())) {s = 61;}

                        else if ( (LA3_0==JANUARY) && (synpred1_Date())) {s = 62;}

                        else if ( (LA3_0==FEBRUARY) && (synpred1_Date())) {s = 63;}

                        else if ( (LA3_0==MARCH) && (synpred1_Date())) {s = 64;}

                        else if ( (LA3_0==APRIL) && (synpred1_Date())) {s = 65;}

                        else if ( (LA3_0==MAY) && (synpred1_Date())) {s = 66;}

                        else if ( (LA3_0==JUNE) && (synpred1_Date())) {s = 67;}

                        else if ( (LA3_0==JULY) && (synpred1_Date())) {s = 68;}

                        else if ( (LA3_0==AUGUST) && (synpred1_Date())) {s = 69;}

                        else if ( (LA3_0==SEPTEMBER) && (synpred1_Date())) {s = 70;}

                        else if ( (LA3_0==OCTOBER) && (synpred1_Date())) {s = 71;}

                        else if ( (LA3_0==NOVEMBER) && (synpred1_Date())) {s = 72;}

                        else if ( (LA3_0==DECEMBER) && (synpred1_Date())) {s = 73;}

                        else if ( (LA3_0==THIS) && (synpred1_Date())) {s = 74;}

                        else if ( (LA3_0==LAST) && (synpred1_Date())) {s = 75;}

                        else if ( (LA3_0==NEXT) && (synpred1_Date())) {s = 76;}

                        else if ( (LA3_0==PAST) && (synpred1_Date())) {s = 77;}

                        else if ( (LA3_0==COMING) && (synpred1_Date())) {s = 78;}

                        else if ( (LA3_0==UPCOMING) && (synpred1_Date())) {s = 79;}

                        else if ( (LA3_0==IN) && (synpred1_Date())) {s = 80;}

                        else if ( (LA3_0==TODAY) && (synpred1_Date())) {s = 81;}

                        else if ( (LA3_0==TOMORROW) && (synpred1_Date())) {s = 82;}

                        else if ( (LA3_0==YESTERDAY) && (synpred1_Date())) {s = 83;}

                        else if ( ((LA3_0>=NOON && LA3_0<=INT_0)) ) {s = 84;}

                         
                        input.seek(index3_0);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA3_85 = input.LA(1);

                         
                        int index3_85 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_85==EOF||LA3_85==WHITE_SPACE||LA3_85==COMMA||(LA3_85>=MILITARY_HOUR_SUFFIX && LA3_85<=PM)) ) {s = 84;}

                        else if ( ((LA3_85>=DASH && LA3_85<=SLASH)) && (synpred1_Date())) {s = 93;}

                         
                        input.seek(index3_85);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA3_126 = input.LA(1);

                         
                        int index3_126 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 141;}

                        else if ( (true) ) {s = 84;}

                         
                        input.seek(index3_126);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA3_4 = input.LA(1);

                         
                        int index3_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_4==EOF||LA3_4==COMMA||LA3_4==COLON||(LA3_4>=AM && LA3_4<=PM)) ) {s = 84;}

                        else if ( (LA3_4==INT_00) ) {s = 85;}

                        else if ( (LA3_4==INT_01_TO_12) ) {s = 86;}

                        else if ( (LA3_4==INT_13_TO_23) ) {s = 87;}

                        else if ( (LA3_4==INT_24_TO_31) ) {s = 88;}

                        else if ( (LA3_4==INT_32_TO_59) ) {s = 89;}

                        else if ( (LA3_4==WHITE_SPACE) ) {s = 91;}

                        else if ( (LA3_4==INT_60_TO_99) && (synpred1_Date())) {s = 90;}

                        else if ( ((LA3_4>=DASH && LA3_4<=SLASH)) && (synpred1_Date())) {s = 92;}

                         
                        input.seek(index3_4);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA3_127 = input.LA(1);

                         
                        int index3_127 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 141;}

                        else if ( (true) ) {s = 84;}

                         
                        input.seek(index3_127);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA3_88 = input.LA(1);

                         
                        int index3_88 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA3_88>=DASH && LA3_88<=SLASH)) && (synpred1_Date())) {s = 93;}

                        else if ( (LA3_88==EOF||LA3_88==WHITE_SPACE||LA3_88==COMMA||(LA3_88>=MILITARY_HOUR_SUFFIX && LA3_88<=PM)) ) {s = 84;}

                         
                        input.seek(index3_88);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA3_89 = input.LA(1);

                         
                        int index3_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA3_89>=DASH && LA3_89<=SLASH)) && (synpred1_Date())) {s = 93;}

                        else if ( (LA3_89==EOF||LA3_89==WHITE_SPACE||LA3_89==COMMA||(LA3_89>=MILITARY_HOUR_SUFFIX && LA3_89<=PM)) ) {s = 84;}

                         
                        input.seek(index3_89);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA3_121 = input.LA(1);

                         
                        int index3_121 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA3_121>=AFTER && LA3_121<=BEFORE)) ) {s = 84;}

                        else if ( (LA3_121==FROM) && (synpred1_Date())) {s = 136;}

                        else if ( (LA3_121==AGO) && (synpred1_Date())) {s = 137;}

                        else if ( (LA3_121==AT) && (synpred1_Date())) {s = 132;}

                        else if ( (LA3_121==INT_0) && (synpred1_Date())) {s = 133;}

                        else if ( (LA3_121==INT_00) && (synpred1_Date())) {s = 138;}

                        else if ( (LA3_121==INT_1_TO_9) && (synpred1_Date())) {s = 139;}

                        else if ( (LA3_121==INT_01_TO_12) && (synpred1_Date())) {s = 140;}

                        else if ( (LA3_121==INT_13_TO_23) && (synpred1_Date())) {s = 141;}

                        else if ( (LA3_121==NOON) && (synpred1_Date())) {s = 134;}

                        else if ( (LA3_121==MIDNIGHT) && (synpred1_Date())) {s = 135;}

                         
                        input.seek(index3_121);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA3_118 = input.LA(1);

                         
                        int index3_118 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_118==IN) && (synpred1_Date())) {s = 123;}

                        else if ( (LA3_118==SINGLE_QUOTE) && (synpred1_Date())) {s = 124;}

                        else if ( (LA3_118==INT_00) && (synpred1_Date())) {s = 125;}

                        else if ( (LA3_118==INT_01_TO_12) ) {s = 126;}

                        else if ( (LA3_118==INT_13_TO_23) ) {s = 127;}

                        else if ( (LA3_118==INT_24_TO_31) ) {s = 128;}

                        else if ( (LA3_118==INT_32_TO_59) && (synpred1_Date())) {s = 129;}

                        else if ( (LA3_118==INT_60_TO_99) && (synpred1_Date())) {s = 130;}

                        else if ( (LA3_118==INT_1_TO_9) ) {s = 131;}

                        else if ( ((LA3_118>=ONE && LA3_118<=THIRTY_FIRST)) ) {s = 84;}

                        else if ( (LA3_118==AT) && (synpred1_Date())) {s = 132;}

                        else if ( (LA3_118==INT_0) && (synpred1_Date())) {s = 133;}

                        else if ( (LA3_118==NOON) && (synpred1_Date())) {s = 134;}

                        else if ( (LA3_118==MIDNIGHT) && (synpred1_Date())) {s = 135;}

                         
                        input.seek(index3_118);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA3_9 = input.LA(1);

                         
                        int index3_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_9==WHITE_SPACE) ) {s = 91;}

                        else if ( ((LA3_9>=DASH && LA3_9<=SLASH)) && (synpred1_Date())) {s = 92;}

                        else if ( (LA3_9==EOF||LA3_9==COMMA||LA3_9==COLON||(LA3_9>=AM && LA3_9<=PM)||LA3_9==INT_00||(LA3_9>=INT_01_TO_12 && LA3_9<=INT_32_TO_59)) ) {s = 84;}

                         
                        input.seek(index3_9);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA3_114 = input.LA(1);

                         
                        int index3_114 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_114==WHITE_SPACE) ) {s = 121;}

                        else if ( (LA3_114==COMMA) && (synpred1_Date())) {s = 122;}

                        else if ( (LA3_114==EOF) && (synpred1_Date())) {s = 120;}

                         
                        input.seek(index3_114);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA3_106 = input.LA(1);

                         
                        int index3_106 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_106==WHITE_SPACE) ) {s = 118;}

                        else if ( (LA3_106==COMMA) && (synpred1_Date())) {s = 119;}

                        else if ( (LA3_106==EOF) && (synpred1_Date())) {s = 120;}

                         
                        input.seek(index3_106);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA3_105 = input.LA(1);

                         
                        int index3_105 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_105==COMMA) && (synpred1_Date())) {s = 119;}

                        else if ( (LA3_105==WHITE_SPACE) ) {s = 118;}

                        else if ( (LA3_105==EOF) && (synpred1_Date())) {s = 120;}

                         
                        input.seek(index3_105);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA3_3 = input.LA(1);

                         
                        int index3_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_3==EOF||LA3_3==WHITE_SPACE||LA3_3==COMMA||LA3_3==COLON||(LA3_3>=AM && LA3_3<=PM)) ) {s = 84;}

                        else if ( (LA3_3==INT_00) ) {s = 85;}

                        else if ( (LA3_3==INT_01_TO_12) ) {s = 86;}

                        else if ( (LA3_3==INT_13_TO_23) ) {s = 87;}

                        else if ( (LA3_3==INT_24_TO_31) ) {s = 88;}

                        else if ( (LA3_3==INT_32_TO_59) ) {s = 89;}

                        else if ( (LA3_3==INT_60_TO_99) && (synpred1_Date())) {s = 90;}

                         
                        input.seek(index3_3);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA3_103 = input.LA(1);

                         
                        int index3_103 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_103==WHITE_SPACE) ) {s = 118;}

                        else if ( (LA3_103==COMMA) && (synpred1_Date())) {s = 119;}

                        else if ( (LA3_103==EOF) && (synpred1_Date())) {s = 120;}

                         
                        input.seek(index3_103);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA3_104 = input.LA(1);

                         
                        int index3_104 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_104==COMMA) && (synpred1_Date())) {s = 119;}

                        else if ( (LA3_104==WHITE_SPACE) ) {s = 118;}

                        else if ( (LA3_104==EOF) && (synpred1_Date())) {s = 120;}

                         
                        input.seek(index3_104);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA3_101 = input.LA(1);

                         
                        int index3_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_101==WHITE_SPACE) ) {s = 118;}

                        else if ( (LA3_101==COMMA) && (synpred1_Date())) {s = 119;}

                        else if ( (LA3_101==EOF) && (synpred1_Date())) {s = 120;}

                         
                        input.seek(index3_101);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA3_102 = input.LA(1);

                         
                        int index3_102 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_102==WHITE_SPACE) ) {s = 118;}

                        else if ( (LA3_102==COMMA) && (synpred1_Date())) {s = 119;}

                        else if ( (LA3_102==EOF) && (synpred1_Date())) {s = 120;}

                         
                        input.seek(index3_102);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA3_91 = input.LA(1);

                         
                        int index3_91 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_91==OF) && (synpred1_Date())) {s = 94;}

                        else if ( (LA3_91==JANUARY) ) {s = 95;}

                        else if ( (LA3_91==FEBRUARY) ) {s = 96;}

                        else if ( (LA3_91==MARCH) ) {s = 97;}

                        else if ( (LA3_91==APRIL) ) {s = 98;}

                        else if ( (LA3_91==MAY) ) {s = 99;}

                        else if ( (LA3_91==JUNE) ) {s = 100;}

                        else if ( (LA3_91==JULY) ) {s = 101;}

                        else if ( (LA3_91==AUGUST) ) {s = 102;}

                        else if ( (LA3_91==SEPTEMBER) ) {s = 103;}

                        else if ( (LA3_91==OCTOBER) ) {s = 104;}

                        else if ( (LA3_91==NOVEMBER) ) {s = 105;}

                        else if ( (LA3_91==DECEMBER) ) {s = 106;}

                        else if ( (LA3_91==SUNDAY) && (synpred1_Date())) {s = 107;}

                        else if ( (LA3_91==MONDAY) && (synpred1_Date())) {s = 108;}

                        else if ( (LA3_91==TUESDAY) && (synpred1_Date())) {s = 109;}

                        else if ( (LA3_91==WEDNESDAY) && (synpred1_Date())) {s = 110;}

                        else if ( (LA3_91==THURSDAY) && (synpred1_Date())) {s = 111;}

                        else if ( (LA3_91==FRIDAY) && (synpred1_Date())) {s = 112;}

                        else if ( (LA3_91==SATURDAY) && (synpred1_Date())) {s = 113;}

                        else if ( (LA3_91==DAY) ) {s = 114;}

                        else if ( (LA3_91==WEEK) && (synpred1_Date())) {s = 115;}

                        else if ( (LA3_91==MONTH) && (synpred1_Date())) {s = 116;}

                        else if ( (LA3_91==YEAR) && (synpred1_Date())) {s = 117;}

                        else if ( (LA3_91==EOF||LA3_91==WHITE_SPACE||(LA3_91>=COMMA && LA3_91<=THE)||LA3_91==IN||(LA3_91>=THIS && LA3_91<=UPCOMING)||(LA3_91>=TODAY && LA3_91<=YESTERDAY)||(LA3_91>=AM && LA3_91<=PM)||(LA3_91>=INT_00 && LA3_91<=THIRTY_FIRST)) ) {s = 84;}

                         
                        input.seek(index3_91);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA3_131 = input.LA(1);

                         
                        int index3_131 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 141;}

                        else if ( (true) ) {s = 84;}

                         
                        input.seek(index3_131);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA3_99 = input.LA(1);

                         
                        int index3_99 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_99==WHITE_SPACE) ) {s = 118;}

                        else if ( (LA3_99==COMMA) && (synpred1_Date())) {s = 119;}

                        else if ( (LA3_99==EOF) && (synpred1_Date())) {s = 120;}

                         
                        input.seek(index3_99);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA3_100 = input.LA(1);

                         
                        int index3_100 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_100==WHITE_SPACE) ) {s = 118;}

                        else if ( (LA3_100==COMMA) && (synpred1_Date())) {s = 119;}

                        else if ( (LA3_100==EOF) && (synpred1_Date())) {s = 120;}

                         
                        input.seek(index3_100);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA3_97 = input.LA(1);

                         
                        int index3_97 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_97==COMMA) && (synpred1_Date())) {s = 119;}

                        else if ( (LA3_97==WHITE_SPACE) ) {s = 118;}

                        else if ( (LA3_97==EOF) && (synpred1_Date())) {s = 120;}

                         
                        input.seek(index3_97);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA3_98 = input.LA(1);

                         
                        int index3_98 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_98==WHITE_SPACE) ) {s = 118;}

                        else if ( (LA3_98==COMMA) && (synpred1_Date())) {s = 119;}

                        else if ( (LA3_98==EOF) && (synpred1_Date())) {s = 120;}

                         
                        input.seek(index3_98);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA3_95 = input.LA(1);

                         
                        int index3_95 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_95==WHITE_SPACE) ) {s = 118;}

                        else if ( (LA3_95==COMMA) && (synpred1_Date())) {s = 119;}

                        else if ( (LA3_95==EOF) && (synpred1_Date())) {s = 120;}

                         
                        input.seek(index3_95);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA3_5 = input.LA(1);

                         
                        int index3_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_5==EOF||LA3_5==COMMA||LA3_5==COLON||(LA3_5>=AM && LA3_5<=PM)) ) {s = 84;}

                        else if ( (LA3_5==INT_00) ) {s = 85;}

                        else if ( (LA3_5==INT_01_TO_12) ) {s = 86;}

                        else if ( (LA3_5==INT_13_TO_23) ) {s = 87;}

                        else if ( (LA3_5==INT_24_TO_31) ) {s = 88;}

                        else if ( (LA3_5==INT_32_TO_59) ) {s = 89;}

                        else if ( (LA3_5==WHITE_SPACE) ) {s = 91;}

                        else if ( (LA3_5==INT_60_TO_99) && (synpred1_Date())) {s = 90;}

                         
                        input.seek(index3_5);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA3_96 = input.LA(1);

                         
                        int index3_96 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_96==COMMA) && (synpred1_Date())) {s = 119;}

                        else if ( (LA3_96==WHITE_SPACE) ) {s = 118;}

                        else if ( (LA3_96==EOF) && (synpred1_Date())) {s = 120;}

                         
                        input.seek(index3_96);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA3_128 = input.LA(1);

                         
                        int index3_128 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 141;}

                        else if ( (true) ) {s = 84;}

                         
                        input.seek(index3_128);
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
    static final String DFA13_eotS =
        "\65\uffff";
    static final String DFA13_eofS =
        "\65\uffff";
    static final String DFA13_minS =
        "\1\30\2\24\1\uffff\1\31\1\32\2\24\2\30\1\uffff\31\24\2\uffff\1\31"+
        "\1\122\1\31\11\24\1\122\1\31\1\24";
    static final String DFA13_maxS =
        "\1\u0085\2\24\1\uffff\1\u0085\1\33\2\24\2\u0085\1\uffff\1\55\3\121"+
        "\23\24\1\157\1\147\2\uffff\1\77\2\157\11\24\2\147\1\24";
    static final String DFA13_acceptS =
        "\3\uffff\1\4\6\uffff\1\3\31\uffff\1\2\1\1\17\uffff";
    static final String DFA13_specialS =
        "\65\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\1\1\2\3\uffff\14\3\1\uffff\1\3\3\uffff\6\3\14\uffff\3\3\10"+
            "\uffff\73\3",
            "\1\4",
            "\1\5",
            "",
            "\1\2\3\uffff\14\3\43\uffff\4\3\2\uffff\64\3",
            "\1\6\1\7",
            "\1\10",
            "\1\11",
            "\1\44\4\uffff\14\44\1\uffff\1\12\3\uffff\6\12\14\uffff\3\12"+
            "\10\uffff\1\45\1\13\1\14\1\15\1\16\2\45\1\17\1\20\1\21\1\22"+
            "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
            "\1\37\1\40\1\41\1\42\1\43\37\44",
            "\1\44\4\uffff\14\44\1\uffff\1\12\3\uffff\6\12\14\uffff\3\12"+
            "\10\uffff\1\45\1\13\1\14\1\15\1\16\2\45\1\17\1\20\1\21\1\22"+
            "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
            "\1\37\1\40\1\41\1\42\1\43\37\44",
            "",
            "\1\46\27\uffff\2\45",
            "\1\46\27\uffff\2\45\35\uffff\1\45\1\uffff\5\45",
            "\1\46\66\uffff\1\45\1\uffff\5\45",
            "\1\46\66\uffff\1\45\1\uffff\5\45",
            "\1\46",
            "\1\46",
            "\1\46",
            "\1\46",
            "\1\46",
            "\1\46",
            "\1\46",
            "\1\46",
            "\1\46",
            "\1\46",
            "\1\46",
            "\1\46",
            "\1\46",
            "\1\46",
            "\1\46",
            "\1\46",
            "\1\46",
            "\1\46",
            "\1\46",
            "\1\50\27\uffff\1\47\45\uffff\1\61\1\60\1\54\1\56\1\52\1\51"+
            "\1\55\1\53\1\57\14\uffff\11\44",
            "\1\63\27\uffff\1\62\45\uffff\1\64\24\uffff\1\44",
            "",
            "",
            "\1\12\2\uffff\15\44\2\uffff\1\12\13\uffff\11\12",
            "\1\61\1\60\1\54\1\56\1\52\1\51\1\55\1\53\1\57\14\uffff\11\44",
            "\1\12\2\uffff\15\44\2\uffff\1\12\13\uffff\11\12\22\uffff\1"+
            "\61\1\60\1\54\1\56\1\52\1\51\1\55\1\53\1\57\14\uffff\11\44",
            "\1\46",
            "\1\46",
            "\1\46",
            "\1\46",
            "\1\46",
            "\1\46",
            "\1\46",
            "\1\46",
            "\1\46",
            "\1\64\24\uffff\1\44",
            "\1\12\2\uffff\15\44\2\uffff\1\12\13\uffff\11\12\22\uffff\1"+
            "\64\24\uffff\1\44",
            "\1\46"
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
            return "48:1: date : ( global_date_prefix formal_date -> ^( RELATIVE_DATE ^( SEEK global_date_prefix formal_date ) ) | global_date_prefix relaxed_date -> ^( RELATIVE_DATE ^( SEEK global_date_prefix relaxed_date ) ) | global_date_prefix relative_date -> ^( RELATIVE_DATE ^( SEEK global_date_prefix relative_date ) ) | ( formal_date | relaxed_date | relative_date ) );";
        }
    }
    static final String DFA12_eotS =
        "\54\uffff";
    static final String DFA12_eofS =
        "\54\uffff";
    static final String DFA12_minS =
        "\1\30\1\uffff\4\24\1\uffff\25\24\1\uffff\1\31\1\122\1\31\11\24\1"+
        "\31\1\122\1\24";
    static final String DFA12_maxS =
        "\1\u0085\1\uffff\3\121\1\55\1\uffff\23\24\1\157\1\147\1\uffff\1"+
        "\77\2\157\11\24\2\147\1\24";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\4\uffff\1\2\25\uffff\1\3\17\uffff";
    static final String DFA12_specialS =
        "\54\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\6\4\uffff\14\6\1\uffff\1\34\3\uffff\6\34\14\uffff\3\34\10"+
            "\uffff\1\1\1\5\1\2\1\3\1\4\2\1\1\7\1\10\1\11\1\12\1\13\1\14"+
            "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
            "\1\31\1\32\1\33\37\6",
            "",
            "\1\35\27\uffff\2\1\35\uffff\1\1\1\uffff\5\1",
            "\1\35\66\uffff\1\1\1\uffff\5\1",
            "\1\35\66\uffff\1\1\1\uffff\5\1",
            "\1\35\27\uffff\2\1",
            "",
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
            "\1\37\27\uffff\1\36\45\uffff\1\50\1\43\1\45\1\41\1\40\1\44"+
            "\1\42\1\46\1\47\14\uffff\11\6",
            "\1\51\27\uffff\1\52\45\uffff\1\53\24\uffff\1\6",
            "",
            "\1\34\2\uffff\15\6\2\uffff\1\34\13\uffff\11\34",
            "\1\50\1\43\1\45\1\41\1\40\1\44\1\42\1\46\1\47\14\uffff\11\6",
            "\1\34\2\uffff\15\6\2\uffff\1\34\13\uffff\11\34\22\uffff\1\50"+
            "\1\43\1\45\1\41\1\40\1\44\1\42\1\46\1\47\14\uffff\11\6",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\34\2\uffff\15\6\2\uffff\1\34\13\uffff\11\34\22\uffff\1\53"+
            "\24\uffff\1\6",
            "\1\53\24\uffff\1\6",
            "\1\35"
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
            return "58:5: ( formal_date | relaxed_date | relative_date )";
        }
    }
    static final String DFA22_eotS =
        "\u00d7\uffff";
    static final String DFA22_eofS =
        "\143\uffff\14\u00aa\70\141\10\uffff\22\141\2\uffff\2\141\22\uffff";
    static final String DFA22_minS =
        "\1\30\105\24\1\35\1\34\1\122\1\34\22\24\1\34\1\122\2\24\1\114\1"+
        "\uffff\105\24\1\35\1\24\1\25\1\uffff\1\25\1\24\1\122\1\25\22\24"+
        "\1\122\1\25\2\24\1\25\2\uffff\3\0\4\uffff\3\0\4\uffff\1\25";
    static final String DFA22_maxS =
        "\1\u0085\30\24\1\157\1\147\53\24\1\u0085\1\50\2\157\22\24\2\147"+
        "\2\24\1\u0085\1\uffff\1\24\43\26\1\157\1\147\37\26\1\50\2\121\1"+
        "\uffff\2\121\2\157\22\26\2\147\2\26\1\121\2\uffff\3\0\4\uffff\3"+
        "\0\4\uffff\1\121";
    static final String DFA22_acceptS =
        "\141\uffff\1\4\110\uffff\1\3\33\uffff\2\1\3\uffff\3\1\1\2\3\uffff"+
        "\4\2\1\uffff";
    static final String DFA22_specialS =
        "\u00a8\uffff\1\0\1\15\1\uffff\1\12\1\4\1\uffff\1\13\23\uffff\1\14"+
        "\2\uffff\1\11\2\uffff\1\7\1\5\1\10\4\uffff\1\1\1\3\1\2\4\uffff\1"+
        "\6}>";
    static final String[] DFA22_transitionS = {
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
            "\1\111\27\uffff\1\110\45\uffff\1\114\1\121\1\124\1\116\1\122"+
            "\1\126\1\112\1\132\1\130\14\uffff\1\131\1\123\1\133\1\117\1"+
            "\127\1\113\1\115\1\125\1\120",
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
            "\1\114\1\121\1\124\1\116\1\122\1\126\1\112\1\132\1\130\14\uffff"+
            "\1\131\1\123\1\133\1\117\1\127\1\113\1\115\1\125\1\120",
            "\1\142\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\153"+
            "\1\154\1\155\1\156\51\uffff\1\114\1\121\1\124\1\116\1\122\1"+
            "\126\1\112\1\132\1\130\14\uffff\1\131\1\123\1\133\1\117\1\127"+
            "\1\113\1\115\1\125\1\120",
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
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ae\1\uffff\1\u00ac\25\uffff\1\u00ad\45\uffff\1\u00ba"+
            "\1\u00bc\1\u00b6\1\u00b3\1\u00b1\1\u00bf\1\u00b9\1\u00b7\1\u00b8"+
            "\14\uffff\1\u00b2\1\u00b5\1\u00be\1\u00c0\1\u00bd\1\u00b4\1"+
            "\u00bb\1\u00b0\1\u00af",
            "\1\u00c2\1\uffff\1\u00ac\25\uffff\1\u00c1\45\uffff\1\u00c4"+
            "\24\uffff\1\u00c3",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\153\1\154"+
            "\1\155\1\156",
            "\1\u00c5\1\u00aa\23\uffff\1\u00c7\1\u00c6\35\uffff\3\u00aa"+
            "\1\u00c8\1\u00aa\1\u00c9\1\u00ca\1\u00cb\1\u00cc\1\u00cd",
            "\1\u00aa\23\uffff\1\u00c7\1\u00c6\35\uffff\3\u00aa\1\u00c8"+
            "\1\u00aa\1\u00c9\1\u00ca\1\u00cb\1\u00cc\1\u00cd",
            "",
            "\1\141\23\uffff\1\u00d5\1\u00ce\35\uffff\3\141\1\u00cf\1\141"+
            "\1\u00d0\1\u00d1\1\u00d2\1\u00d3\1\u00d4",
            "\1\u00d6\1\141\23\uffff\1\u00d5\1\u00ce\35\uffff\3\141\1\u00cf"+
            "\1\141\1\u00d0\1\u00d1\1\u00d2\1\u00d3\1\u00d4",
            "\1\u00ba\1\u00bc\1\u00b6\1\u00b3\1\u00b1\1\u00bf\1\u00b9\1"+
            "\u00b7\1\u00b8\14\uffff\1\u00b2\1\u00b5\1\u00be\1\u00c0\1\u00bd"+
            "\1\u00b4\1\u00bb\1\u00b0\1\u00af",
            "\1\141\23\uffff\1\u00d5\1\u00ce\35\uffff\3\141\1\u00cf\1\141"+
            "\1\u00d0\1\u00d1\1\u00d2\1\u00d3\1\u00d4\1\u00ba\1\u00bc\1\u00b6"+
            "\1\u00b3\1\u00b1\1\u00bf\1\u00b9\1\u00b7\1\u00b8\14\uffff\1"+
            "\u00b2\1\u00b5\1\u00be\1\u00c0\1\u00bd\1\u00b4\1\u00bb\1\u00b0"+
            "\1\u00af",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00c4\24\uffff\1\u00c3",
            "\1\141\23\uffff\1\u00d5\1\u00ce\35\uffff\3\141\1\u00cf\1\141"+
            "\1\u00d0\1\u00d1\1\u00d2\1\u00d3\1\u00d4\1\u00c4\24\uffff\1"+
            "\u00c3",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00ab\1\uffff\1\u00ac",
            "\1\u00aa\23\uffff\1\u00c7\1\u00c6\35\uffff\3\u00aa\1\u00c8"+
            "\1\u00aa\1\u00c9\1\u00ca\1\u00cb\1\u00cc\1\u00cd",
            "",
            "",
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
            "",
            "",
            "",
            "",
            "\1\141\23\uffff\1\u00d5\1\u00ce\35\uffff\3\141\1\u00cf\1\141"+
            "\1\u00d0\1\u00d1\1\u00d2\1\u00d3\1\u00d4"
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "73:5: ( ( ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year )=> ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year | ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year )=> relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year | ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month | ( THE WHITE_SPACE )? relaxed_month WHITE_SPACE relaxed_day_of_month )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_168 = input.LA(1);

                         
                        int index22_168 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA22_168==WHITE_SPACE) ) {s = 197;}

                        else if ( (LA22_168==IN) && (synpred2_Date())) {s = 198;}

                        else if ( (LA22_168==SINGLE_QUOTE) && (synpred2_Date())) {s = 199;}

                        else if ( (LA22_168==INT_00) ) {s = 200;}

                        else if ( (LA22_168==INT_01_TO_12) ) {s = 201;}

                        else if ( (LA22_168==INT_13_TO_23) ) {s = 202;}

                        else if ( (LA22_168==INT_24_TO_31) && (synpred2_Date())) {s = 203;}

                        else if ( (LA22_168==INT_32_TO_59) && (synpred2_Date())) {s = 204;}

                        else if ( (LA22_168==INT_60_TO_99) && (synpred2_Date())) {s = 205;}

                        else if ( (LA22_168==AT||(LA22_168>=NOON && LA22_168<=INT_0)||LA22_168==INT_1_TO_9) ) {s = 170;}

                         
                        input.seek(index22_168);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_207 = input.LA(1);

                         
                        int index22_207 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 213;}

                        else if ( (true) ) {s = 97;}

                         
                        input.seek(index22_207);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_209 = input.LA(1);

                         
                        int index22_209 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 213;}

                        else if ( (true) ) {s = 97;}

                         
                        input.seek(index22_209);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA22_208 = input.LA(1);

                         
                        int index22_208 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 213;}

                        else if ( (true) ) {s = 97;}

                         
                        input.seek(index22_208);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA22_172 = input.LA(1);

                         
                        int index22_172 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA22_172==WHITE_SPACE) ) {s = 214;}

                        else if ( (LA22_172==AT||(LA22_172>=NOON && LA22_172<=INT_0)||LA22_172==INT_1_TO_9) ) {s = 97;}

                        else if ( (LA22_172==INT_00) ) {s = 207;}

                        else if ( (LA22_172==INT_01_TO_12) ) {s = 208;}

                        else if ( (LA22_172==INT_13_TO_23) ) {s = 209;}

                        else if ( (LA22_172==IN) && (synpred3_Date())) {s = 206;}

                        else if ( (LA22_172==SINGLE_QUOTE) && (synpred3_Date())) {s = 213;}

                        else if ( (LA22_172==INT_24_TO_31) && (synpred3_Date())) {s = 210;}

                        else if ( (LA22_172==INT_32_TO_59) && (synpred3_Date())) {s = 211;}

                        else if ( (LA22_172==INT_60_TO_99) && (synpred3_Date())) {s = 212;}

                         
                        input.seek(index22_172);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA22_201 = input.LA(1);

                         
                        int index22_201 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 205;}

                        else if ( (true) ) {s = 170;}

                         
                        input.seek(index22_201);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA22_214 = input.LA(1);

                         
                        int index22_214 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA22_214==IN) && (synpred3_Date())) {s = 206;}

                        else if ( (LA22_214==SINGLE_QUOTE) && (synpred3_Date())) {s = 213;}

                        else if ( (LA22_214==INT_00) ) {s = 207;}

                        else if ( (LA22_214==INT_01_TO_12) ) {s = 208;}

                        else if ( (LA22_214==INT_13_TO_23) ) {s = 209;}

                        else if ( (LA22_214==INT_24_TO_31) && (synpred3_Date())) {s = 210;}

                        else if ( (LA22_214==INT_32_TO_59) && (synpred3_Date())) {s = 211;}

                        else if ( (LA22_214==INT_60_TO_99) && (synpred3_Date())) {s = 212;}

                        else if ( (LA22_214==AT||(LA22_214>=NOON && LA22_214<=INT_0)||LA22_214==INT_1_TO_9) ) {s = 97;}

                         
                        input.seek(index22_214);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA22_200 = input.LA(1);

                         
                        int index22_200 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 205;}

                        else if ( (true) ) {s = 170;}

                         
                        input.seek(index22_200);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA22_202 = input.LA(1);

                         
                        int index22_202 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 205;}

                        else if ( (true) ) {s = 170;}

                         
                        input.seek(index22_202);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA22_197 = input.LA(1);

                         
                        int index22_197 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA22_197==AT||(LA22_197>=NOON && LA22_197<=INT_0)||LA22_197==INT_1_TO_9) ) {s = 170;}

                        else if ( (LA22_197==INT_00) ) {s = 200;}

                        else if ( (LA22_197==INT_01_TO_12) ) {s = 201;}

                        else if ( (LA22_197==INT_13_TO_23) ) {s = 202;}

                        else if ( (LA22_197==IN) && (synpred2_Date())) {s = 198;}

                        else if ( (LA22_197==INT_24_TO_31) && (synpred2_Date())) {s = 203;}

                        else if ( (LA22_197==INT_32_TO_59) && (synpred2_Date())) {s = 204;}

                        else if ( (LA22_197==INT_60_TO_99) && (synpred2_Date())) {s = 205;}

                        else if ( (LA22_197==SINGLE_QUOTE) && (synpred2_Date())) {s = 199;}

                         
                        input.seek(index22_197);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA22_171 = input.LA(1);

                         
                        int index22_171 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA22_171==IN) && (synpred3_Date())) {s = 206;}

                        else if ( (LA22_171==INT_00) ) {s = 207;}

                        else if ( (LA22_171==INT_01_TO_12) ) {s = 208;}

                        else if ( (LA22_171==INT_13_TO_23) ) {s = 209;}

                        else if ( (LA22_171==INT_24_TO_31) && (synpred3_Date())) {s = 210;}

                        else if ( (LA22_171==INT_32_TO_59) && (synpred3_Date())) {s = 211;}

                        else if ( (LA22_171==INT_60_TO_99) && (synpred3_Date())) {s = 212;}

                        else if ( (LA22_171==AT||(LA22_171>=NOON && LA22_171<=INT_0)||LA22_171==INT_1_TO_9) ) {s = 97;}

                        else if ( (LA22_171==SINGLE_QUOTE) && (synpred3_Date())) {s = 213;}

                         
                        input.seek(index22_171);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA22_174 = input.LA(1);

                         
                        int index22_174 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA22_174==SECOND) ) {s = 181;}

                        else if ( (LA22_174==FIRST) ) {s = 178;}

                        else if ( (LA22_174==AT||(LA22_174>=NOON && LA22_174<=INT_0)||LA22_174==INT_1_TO_9) ) {s = 97;}

                        else if ( (LA22_174==INT_00) ) {s = 207;}

                        else if ( (LA22_174==INT_01_TO_12) ) {s = 208;}

                        else if ( (LA22_174==INT_13_TO_23) ) {s = 209;}

                        else if ( (LA22_174==EIGHT) ) {s = 183;}

                        else if ( (LA22_174==NINTH) ) {s = 175;}

                        else if ( (LA22_174==TWO) ) {s = 188;}

                        else if ( (LA22_174==FOURTH) ) {s = 192;}

                        else if ( (LA22_174==THREE) ) {s = 182;}

                        else if ( (LA22_174==NINE) ) {s = 184;}

                        else if ( (LA22_174==FOUR) ) {s = 179;}

                        else if ( (LA22_174==EIGHTH) ) {s = 176;}

                        else if ( (LA22_174==THIRD) ) {s = 190;}

                        else if ( (LA22_174==ONE) ) {s = 186;}

                        else if ( (LA22_174==SEVEN) ) {s = 185;}

                        else if ( (LA22_174==SIXTH) ) {s = 180;}

                        else if ( (LA22_174==SIX) ) {s = 191;}

                        else if ( (LA22_174==FIFTH) ) {s = 189;}

                        else if ( (LA22_174==FIVE) ) {s = 177;}

                        else if ( (LA22_174==IN) && (synpred3_Date())) {s = 206;}

                        else if ( (LA22_174==INT_24_TO_31) && (synpred3_Date())) {s = 210;}

                        else if ( (LA22_174==INT_32_TO_59) && (synpred3_Date())) {s = 211;}

                        else if ( (LA22_174==INT_60_TO_99) && (synpred3_Date())) {s = 212;}

                        else if ( (LA22_174==SEVENTH) ) {s = 187;}

                        else if ( (LA22_174==SINGLE_QUOTE) && (synpred3_Date())) {s = 213;}

                         
                        input.seek(index22_174);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA22_194 = input.LA(1);

                         
                        int index22_194 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA22_194==FIRST) ) {s = 195;}

                        else if ( (LA22_194==ONE) ) {s = 196;}

                        else if ( (LA22_194==AT||(LA22_194>=NOON && LA22_194<=INT_0)||LA22_194==INT_1_TO_9) ) {s = 97;}

                        else if ( (LA22_194==INT_00) ) {s = 207;}

                        else if ( (LA22_194==INT_01_TO_12) ) {s = 208;}

                        else if ( (LA22_194==INT_13_TO_23) ) {s = 209;}

                        else if ( (LA22_194==IN) && (synpred3_Date())) {s = 206;}

                        else if ( (LA22_194==INT_24_TO_31) && (synpred3_Date())) {s = 210;}

                        else if ( (LA22_194==INT_32_TO_59) && (synpred3_Date())) {s = 211;}

                        else if ( (LA22_194==INT_60_TO_99) && (synpred3_Date())) {s = 212;}

                        else if ( (LA22_194==SINGLE_QUOTE) && (synpred3_Date())) {s = 213;}

                         
                        input.seek(index22_194);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA22_169 = input.LA(1);

                         
                        int index22_169 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA22_169==IN) && (synpred2_Date())) {s = 198;}

                        else if ( (LA22_169==INT_00) ) {s = 200;}

                        else if ( (LA22_169==INT_01_TO_12) ) {s = 201;}

                        else if ( (LA22_169==INT_13_TO_23) ) {s = 202;}

                        else if ( (LA22_169==INT_24_TO_31) && (synpred2_Date())) {s = 203;}

                        else if ( (LA22_169==INT_32_TO_59) && (synpred2_Date())) {s = 204;}

                        else if ( (LA22_169==INT_60_TO_99) && (synpred2_Date())) {s = 205;}

                        else if ( (LA22_169==AT||(LA22_169>=NOON && LA22_169<=INT_0)||LA22_169==INT_1_TO_9) ) {s = 170;}

                        else if ( (LA22_169==SINGLE_QUOTE) && (synpred2_Date())) {s = 199;}

                         
                        input.seek(index22_169);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA26_eotS =
        "\22\uffff";
    static final String DFA26_eofS =
        "\6\uffff\6\5\6\uffff";
    static final String DFA26_minS =
        "\2\24\2\51\1\24\1\uffff\6\24\1\30\1\uffff\1\24\1\53\1\24\1\51";
    static final String DFA26_maxS =
        "\1\26\3\121\1\24\1\uffff\6\121\1\30\1\uffff\1\24\1\53\1\24\1\121";
    static final String DFA26_acceptS =
        "\5\uffff\1\1\7\uffff\1\2\4\uffff";
    static final String DFA26_specialS =
        "\22\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\2\1\uffff\1\1",
            "\1\3\24\uffff\1\5\1\4\40\uffff\1\6\1\uffff\1\7\1\10\1\11\1"+
            "\12\1\13",
            "\1\5\1\4\40\uffff\1\6\1\uffff\1\7\1\10\1\11\1\12\1\13",
            "\1\5\1\4\40\uffff\1\6\1\uffff\1\7\1\10\1\11\1\12\1\13",
            "\1\14",
            "",
            "\1\5\1\uffff\1\5\64\uffff\1\15\1\uffff\5\15",
            "\1\5\1\uffff\1\5\64\uffff\1\15\1\uffff\5\15",
            "\1\5\1\uffff\1\5\64\uffff\1\15\1\uffff\5\15",
            "\1\5\1\uffff\1\5\64\uffff\1\15\1\uffff\5\15",
            "\1\5\1\uffff\1\5\64\uffff\1\15\1\uffff\5\15",
            "\1\5\1\uffff\1\5\64\uffff\1\15\1\uffff\5\15",
            "\1\16",
            "",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\5\41\uffff\1\6\1\uffff\1\7\1\10\1\11\1\12\1\13"
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "111:1: relaxed_year : ( relaxed_year_prefix ( SINGLE_QUOTE )? int_00_to_99_mandatory_prefix -> ^( YEAR_OF int_00_to_99_mandatory_prefix ) | relaxed_year_prefix int_four_digits -> ^( YEAR_OF int_four_digits ) );";
        }
    }
    static final String DFA33_eotS =
        "\70\uffff";
    static final String DFA33_eofS =
        "\53\uffff\13\1\2\uffff";
    static final String DFA33_minS =
        "\1\52\1\uffff\31\24\1\uffff\1\31\1\122\1\31\11\24\1\122\1\31\14"+
        "\24\1\25\1\uffff";
    static final String DFA33_maxS =
        "\1\146\1\uffff\27\24\1\132\1\122\1\uffff\1\77\2\132\11\24\2\122"+
        "\1\24\13\26\1\116\1\uffff";
    static final String DFA33_acceptS =
        "\1\uffff\1\1\31\uffff\1\3\33\uffff\1\2";
    static final String DFA33_specialS =
        "\70\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\1\3\uffff\6\1\14\uffff\3\33\11\uffff\1\2\1\3\1\4\1\5\2\uffff"+
            "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1"+
            "\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32",
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
            "\1\36\27\uffff\1\35\45\uffff\1\41\1\44\1\47\1\45\1\37\1\40"+
            "\1\46\1\43\1\42",
            "\1\51\27\uffff\1\50\45\uffff\1\52",
            "",
            "\1\62\21\uffff\1\65\13\uffff\1\63\1\64\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61",
            "\1\41\1\44\1\47\1\45\1\37\1\40\1\46\1\43\1\42",
            "\1\62\21\uffff\1\65\13\uffff\1\63\1\64\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\22\uffff\1\41\1\44\1\47\1\45\1\37\1\40\1\46"+
            "\1\43\1\42",
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
            "\1\62\21\uffff\1\65\13\uffff\1\63\1\64\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\22\uffff\1\52",
            "\1\34",
            "\1\66\1\uffff\1\1",
            "\1\66\1\uffff\1\1",
            "\1\66\1\uffff\1\1",
            "\1\66\1\uffff\1\1",
            "\1\66\1\uffff\1\1",
            "\1\66\1\uffff\1\1",
            "\1\66\1\uffff\1\1",
            "\1\66\1\uffff\1\1",
            "\1\66\1\uffff\1\1",
            "\1\66\1\uffff\1\1",
            "\1\66\1\uffff\1\1",
            "\1\1\36\uffff\1\67\1\uffff\1\67\21\uffff\7\1",
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "159:1: relative_date : ( relative_prefix WHITE_SPACE relative_target -> ^( RELATIVE_DATE ^( SEEK relative_prefix ) relative_target ) | spelled_or_int_01_to_31_optional_prefix WHITE_SPACE relative_target WHITE_SPACE relative_suffix -> ^( RELATIVE_DATE ^( SEEK relative_suffix spelled_or_int_01_to_31_optional_prefix ) relative_target ) | named_relative_date );";
        }
    }
    static final String DFA72_eotS =
        "\45\uffff";
    static final String DFA72_eofS =
        "\24\uffff\1\35\1\44\17\uffff";
    static final String DFA72_minS =
        "\1\122\23\uffff\2\24\1\122\1\25\13\uffff\1\25\1\uffff";
    static final String DFA72_maxS =
        "\1\146\23\uffff\1\132\1\122\2\132\13\uffff\1\122\1\uffff";
    static final String DFA72_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\4\uffff\1\25\1\35\1\33\1\26\1"+
        "\32\1\24\1\30\1\31\1\27\1\34\1\37\1\uffff\1\36";
    static final String DFA72_specialS =
        "\45\uffff}>";
    static final String[] DFA72_transitionS = {
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
            "\1\27\1\uffff\1\35\25\uffff\1\26\45\uffff\1\30\1\33\1\40\1"+
            "\36\1\37\1\34\1\32\1\41\1\31",
            "\1\43\1\uffff\1\44\25\uffff\1\42\45\uffff\1\42",
            "\1\30\1\33\1\40\1\36\1\37\1\34\1\32\1\41\1\31",
            "\1\35\3\uffff\1\35\2\uffff\20\35\13\uffff\11\35\10\uffff\12"+
            "\35\1\30\1\33\1\40\1\36\1\37\1\34\1\32\1\41\1\31",
            "",
            "",
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
            return "301:1: spelled_one_to_thirty_one : ( ONE -> INT[\"1\"] | TWO -> INT[\"2\"] | THREE -> INT[\"3\"] | FOUR -> INT[\"4\"] | FIVE -> INT[\"5\"] | SIX -> INT[\"6\"] | SEVEN -> INT[\"7\"] | EIGHT -> INT[\"8\"] | NINE -> INT[\"9\"] | TEN -> INT[\"10\"] | ELEVEN -> INT[\"11\"] | TWELVE -> INT[\"12\"] | THIRTEEN -> INT[\"13\"] | FOURTEEN -> INT[\"14\"] | FIFTEEN -> INT[\"15\"] | SIXTEEN -> INT[\"16\"] | SEVENTEEN -> INT[\"17\"] | EIGHTEEN -> INT[\"18\"] | NINETEEN -> INT[\"19\"] | TWENTY -> INT[\"20\"] | TWENTY ( DASH | WHITE_SPACE )? ONE -> INT[\"21\"] | TWENTY ( DASH | WHITE_SPACE )? TWO -> INT[\"22\"] | TWENTY ( DASH | WHITE_SPACE )? THREE -> INT[\"23\"] | TWENTY ( DASH | WHITE_SPACE )? FOUR -> INT[\"24\"] | TWENTY ( DASH | WHITE_SPACE )? FIVE -> INT[\"25\"] | TWENTY ( DASH | WHITE_SPACE )? SIX -> INT[\"26\"] | TWENTY ( DASH | WHITE_SPACE )? SEVEN -> INT[\"27\"] | TWENTY ( DASH | WHITE_SPACE )? EIGHT -> INT[\"28\"] | TWENTY ( DASH | WHITE_SPACE )? NINE -> INT[\"29\"] | THIRTY -> INT[\"30\"] | THIRTY ( DASH | WHITE_SPACE )? ONE -> INT[\"31\"] );";
        }
    }
    static final String DFA93_eotS =
        "\43\uffff";
    static final String DFA93_eofS =
        "\43\uffff";
    static final String DFA93_minS =
        "\1\145\25\uffff\1\24\12\uffff\2\147";
    static final String DFA93_maxS =
        "\1\u0085\25\uffff\1\157\12\uffff\2\157";
    static final String DFA93_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\uffff\1\26\1\27\1"+
        "\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\2\uffff";
    static final String DFA93_specialS =
        "\43\uffff}>";
    static final String[] DFA93_transitionS = {
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

    static final short[] DFA93_eot = DFA.unpackEncodedString(DFA93_eotS);
    static final short[] DFA93_eof = DFA.unpackEncodedString(DFA93_eofS);
    static final char[] DFA93_min = DFA.unpackEncodedStringToUnsignedChars(DFA93_minS);
    static final char[] DFA93_max = DFA.unpackEncodedStringToUnsignedChars(DFA93_maxS);
    static final short[] DFA93_accept = DFA.unpackEncodedString(DFA93_acceptS);
    static final short[] DFA93_special = DFA.unpackEncodedString(DFA93_specialS);
    static final short[][] DFA93_transition;

    static {
        int numStates = DFA93_transitionS.length;
        DFA93_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA93_transition[i] = DFA.unpackEncodedString(DFA93_transitionS[i]);
        }
    }

    class DFA93 extends DFA {

        public DFA93(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 93;
            this.eot = DFA93_eot;
            this.eof = DFA93_eof;
            this.min = DFA93_min;
            this.max = DFA93_max;
            this.accept = DFA93_accept;
            this.special = DFA93_special;
            this.transition = DFA93_transition;
        }
        public String getDescription() {
            return "336:1: spelled_first_to_thirty_first : ( FIRST -> INT[\"1\"] | SECOND -> INT[\"2\"] | THIRD -> INT[\"3\"] | FOURTH -> INT[\"4\"] | FIFTH -> INT[\"5\"] | SIXTH -> INT[\"6\"] | SEVENTH -> INT[\"7\"] | EIGHTH -> INT[\"8\"] | NINTH -> INT[\"9\"] | TENTH -> INT[\"10\"] | ELEVENTH -> INT[\"11\"] | TWELFTH -> INT[\"12\"] | THIRTEENTH -> INT[\"13\"] | FOURTEENTH -> INT[\"14\"] | FIFTEENTH -> INT[\"15\"] | SIXTEENTH -> INT[\"16\"] | SEVENTEENTH -> INT[\"17\"] | EIGHTEENTH -> INT[\"18\"] | NINETEENTH -> INT[\"19\"] | TWENTIETH -> INT[\"20\"] | ( TWENTY_FIRST | ( TWENTY ( DASH | WHITE_SPACE )? FIRST ) ) -> INT[\"21\"] | ( TWENTY_SECOND | ( TWENTY ( DASH | WHITE_SPACE )? SECOND ) ) -> INT[\"22\"] | ( TWENTY_THIRD | ( TWENTY ( DASH | WHITE_SPACE )? THIRD ) ) -> INT[\"23\"] | ( TWENTY_FOURTH | ( TWENTY ( DASH | WHITE_SPACE )? FOURTH ) ) -> INT[\"24\"] | ( TWENTY_FIFTH | ( TWENTY ( DASH | WHITE_SPACE )? FIFTH ) ) -> INT[\"25\"] | ( TWENTY_SIXTH | ( TWENTY ( DASH | WHITE_SPACE )? SIXTH ) ) -> INT[\"26\"] | ( TWENTY_SEVENTH | ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH ) ) -> INT[\"27\"] | ( TWENTY_EIGHTH | ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH ) ) -> INT[\"28\"] | ( TWENTY_NINTH | ( TWENTY ( DASH | WHITE_SPACE )? NINTH ) ) -> INT[\"29\"] | THIRTIETH -> INT[\"30\"] | ( THIRTY_FIRST | ( THIRTY ( DASH | WHITE_SPACE )? FIRST ) ) -> INT[\"31\"] );";
        }
    }
 

    public static final BitSet FOLLOW_date_in_date_time158 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_date_time_separator_in_date_time161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000007F00L});
    public static final BitSet FOLLOW_time_in_date_time163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_in_date_time182 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_time_date_separator_in_date_time185 = new BitSet(new long[]{0x000FC5FFE3000000L,0xFFFFFFFFFFFFF807L,0x000000000000003FL});
    public static final BitSet FOLLOW_date_in_date_time187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_date_time_separator222 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_AT_in_date_time_separator225 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_date_time_separator227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_date_time_separator235 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_date_time_separator237 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_AT_in_date_time_separator241 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_date_time_separator243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_time_date_separator260 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ON_in_time_date_separator263 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_time_date_separator265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_time_date_separator273 = new BitSet(new long[]{0x0000000000900002L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_time_date_separator275 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ON_in_time_date_separator279 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_time_date_separator281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_global_date_prefix_in_date296 = new BitSet(new long[]{0x0000000000000000L,0x000000000003F800L});
    public static final BitSet FOLLOW_formal_date_in_date298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_global_date_prefix_in_date331 = new BitSet(new long[]{0x000001FFE1000000L,0xFFFFFFFFFFFCF000L,0x000000000000003FL});
    public static final BitSet FOLLOW_relaxed_date_in_date333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_global_date_prefix_in_date366 = new BitSet(new long[]{0x000FC5FFE3000000L,0xFFFFFFFFFFFFF807L,0x000000000000003FL});
    public static final BitSet FOLLOW_relative_date_in_date368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formal_date_in_date402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relaxed_date_in_date406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relative_date_in_date410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_global_date_prefix427 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_global_date_prefix429 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_DAY_in_global_date_prefix433 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_global_date_prefix435 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_AFTER_in_global_date_prefix437 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_global_date_prefix439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_global_date_prefix468 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_global_date_prefix470 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_DAY_in_global_date_prefix474 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_global_date_prefix476 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_BEFORE_in_global_date_prefix478 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_global_date_prefix480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_relaxed_date575 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date577 = new BitSet(new long[]{0x0000000001000000L,0xFFFFFFFFFFFCF000L,0x000000000000003FL});
    public static final BitSet FOLLOW_relaxed_day_of_month_in_relaxed_date581 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date583 = new BitSet(new long[]{0x000001FFF0000000L});
    public static final BitSet FOLLOW_OF_in_relaxed_date586 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date588 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_relaxed_month_in_relaxed_date592 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_relaxed_year_in_relaxed_date594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relaxed_month_in_relaxed_date628 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date630 = new BitSet(new long[]{0x0000000001000000L,0xFFFFFFFFFFFCF000L,0x000000000000003FL});
    public static final BitSet FOLLOW_relaxed_day_of_month_in_relaxed_date632 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_relaxed_year_in_relaxed_date634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_relaxed_date650 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date652 = new BitSet(new long[]{0x0000000001000000L,0xFFFFFFFFFFFCF000L,0x000000000000003FL});
    public static final BitSet FOLLOW_relaxed_day_of_month_in_relaxed_date656 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date658 = new BitSet(new long[]{0x000001FFF0000000L});
    public static final BitSet FOLLOW_OF_in_relaxed_date661 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date663 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_relaxed_month_in_relaxed_date667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_relaxed_date678 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date680 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_relaxed_month_in_relaxed_date684 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date686 = new BitSet(new long[]{0x0000000001000000L,0xFFFFFFFFFFFCF000L,0x000000000000003FL});
    public static final BitSet FOLLOW_relaxed_day_of_month_in_relaxed_date688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JANUARY_in_relaxed_month720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FEBRUARY_in_relaxed_month737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MARCH_in_relaxed_month753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APRIL_in_relaxed_month772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAY_in_relaxed_month791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JUNE_in_relaxed_month812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JULY_in_relaxed_month832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AUGUST_in_relaxed_month852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEPTEMBER_in_relaxed_month870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OCTOBER_in_relaxed_month885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOVEMBER_in_relaxed_month902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECEMBER_in_relaxed_month918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_relaxed_day_of_month943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_first_to_thirty_first_in_relaxed_day_of_month970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relaxed_year_prefix_in_relaxed_year1000 = new BitSet(new long[]{0x0000020000000000L,0x000000000003E800L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_in_relaxed_year1002 = new BitSet(new long[]{0x0000000000000000L,0x000000000003E800L});
    public static final BitSet FOLLOW_int_00_to_99_mandatory_prefix_in_relaxed_year1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relaxed_year_prefix_in_relaxed_year1032 = new BitSet(new long[]{0x0000000000000000L,0x000000000003E800L});
    public static final BitSet FOLLOW_int_four_digits_in_relaxed_year1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_relaxed_year_prefix1064 = new BitSet(new long[]{0x0000040000100002L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1066 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1071 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_IN_in_relaxed_year_prefix1075 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1077 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_THE_in_relaxed_year_prefix1079 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1081 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_YEAR_in_relaxed_year_prefix1083 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formal_year_four_digits_in_formal_date1109 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_formal_date_separator_in_formal_date1111 = new BitSet(new long[]{0x0000000000000000L,0x000000000003F800L});
    public static final BitSet FOLLOW_formal_month_of_year_in_formal_date1113 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_formal_date_separator_in_formal_date1115 = new BitSet(new long[]{0x0000000000000000L,0x000000000000F000L});
    public static final BitSet FOLLOW_formal_day_of_month_in_formal_date1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formal_month_of_year_in_formal_date1146 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_formal_date_separator_in_formal_date1148 = new BitSet(new long[]{0x0000000000000000L,0x000000000000F000L});
    public static final BitSet FOLLOW_formal_day_of_month_in_formal_date1150 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_formal_date_separator_in_formal_date1153 = new BitSet(new long[]{0x0000000000000000L,0x000000000003E800L});
    public static final BitSet FOLLOW_formal_year_in_formal_date1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_01_to_12_optional_prefix_in_formal_month_of_year1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_01_to_31_optional_prefix_in_formal_day_of_month1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formal_year_four_digits_in_formal_year1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_00_to_99_mandatory_prefix_in_formal_year1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_four_digits_in_formal_year_four_digits1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_formal_date_separator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relative_prefix_in_relative_date1313 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_date1315 = new BitSet(new long[]{0xFF80080002000000L});
    public static final BitSet FOLLOW_relative_target_in_relative_date1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_relative_date1351 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_date1353 = new BitSet(new long[]{0xFF80080002000000L});
    public static final BitSet FOLLOW_relative_target_in_relative_date1355 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_date1357 = new BitSet(new long[]{0x0050000000000000L});
    public static final BitSet FOLLOW_relative_suffix_in_relative_date1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_named_relative_date_in_relative_date1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_day_of_week_in_relative_target1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relative_date_span_in_relative_target1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_relative_prefix1434 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_prefix1436 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LAST_in_relative_prefix1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_relative_prefix1462 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_prefix1464 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_NEXT_in_relative_prefix1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_relative_prefix1490 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_prefix1492 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_PAST_in_relative_prefix1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_relative_prefix1518 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_prefix1520 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_COMING_in_relative_prefix1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_relative_prefix1544 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_prefix1546 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_UPCOMING_in_relative_prefix1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_relative_prefix1568 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_prefix1570 = new BitSet(new long[]{0x0000000000000000L,0x0000007FFFFCF000L});
    public static final BitSet FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_relative_prefix1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FROM_in_relative_suffix1606 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_suffix1608 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_NOW_in_relative_suffix1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AGO_in_relative_suffix1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DAY_in_relative_date_span1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEEK_in_relative_date_span1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MONTH_in_relative_date_span1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YEAR_in_relative_date_span1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUNDAY_in_day_of_week1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MONDAY_in_day_of_week1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TUESDAY_in_day_of_week1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEDNESDAY_in_day_of_week1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THURSDAY_in_day_of_week1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FRIDAY_in_day_of_week1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SATURDAY_in_day_of_week1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TODAY_in_named_relative_date1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOMORROW_in_named_relative_date1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YESTERDAY_in_named_relative_date1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hours_in_time1930 = new BitSet(new long[]{0x0000000000000000L,0x000000000001E808L});
    public static final BitSet FOLLOW_COLON_in_time1932 = new BitSet(new long[]{0x0000000000000000L,0x000000000001E808L});
    public static final BitSet FOLLOW_minutes_in_time1935 = new BitSet(new long[]{0x0000000000100002L,0x00000000000000F0L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_time1938 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_meridian_indicator_in_time1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MILITARY_HOUR_SUFFIX_in_time1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOUR_in_time1951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hours_in_time1987 = new BitSet(new long[]{0x0000000000100002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_time1989 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_meridian_indicator_in_time1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_named_time_in_time2030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_00_to_23_optional_prefix_in_hours2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_00_to_59_mandatory_prefix_in_minutes2069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AM_in_meridian_indicator2096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PM_in_meridian_indicator2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOON_in_named_time2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MIDNIGHT_in_named_time2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_0_in_int_00_to_23_optional_prefix2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_00_in_int_00_to_23_optional_prefix2208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_1_TO_9_in_int_00_to_23_optional_prefix2214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_01_TO_12_in_int_00_to_23_optional_prefix2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_13_TO_23_in_int_00_to_23_optional_prefix2226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_00_in_int_00_to_59_mandatory_prefix2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_01_TO_12_in_int_00_to_59_mandatory_prefix2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_13_TO_23_in_int_00_to_59_mandatory_prefix2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_24_TO_31_in_int_00_to_59_mandatory_prefix2266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_32_TO_59_in_int_00_to_59_mandatory_prefix2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_00_to_59_mandatory_prefix_in_int_00_to_99_mandatory_prefix2294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_60_TO_99_in_int_00_to_99_mandatory_prefix2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_1_TO_9_in_int_01_to_12_optional_prefix2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_01_TO_12_in_int_01_to_12_optional_prefix2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_1_TO_9_in_int_01_to_31_optional_prefix2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_01_TO_12_in_int_01_to_31_optional_prefix2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_13_TO_23_in_int_01_to_31_optional_prefix2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_24_TO_31_in_int_01_to_31_optional_prefix2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_00_to_99_mandatory_prefix_in_int_four_digits2391 = new BitSet(new long[]{0x0000000000000000L,0x000000000003E800L});
    public static final BitSet FOLLOW_int_00_to_99_mandatory_prefix_in_int_four_digits2393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_01_to_31_optional_prefix_in_spelled_or_int_01_to_31_optional_prefix2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_one_to_thirty_one_in_spelled_or_int_01_to_31_optional_prefix2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_in_spelled_one_to_thirty_one2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWO_in_spelled_one_to_thirty_one2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THREE_in_spelled_one_to_thirty_one2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOUR_in_spelled_one_to_thirty_one2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIVE_in_spelled_one_to_thirty_one2512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIX_in_spelled_one_to_thirty_one2529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVEN_in_spelled_one_to_thirty_one2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHT_in_spelled_one_to_thirty_one2563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINE_in_spelled_one_to_thirty_one2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEN_in_spelled_one_to_thirty_one2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEVEN_in_spelled_one_to_thirty_one2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWELVE_in_spelled_one_to_thirty_one2629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_in_spelled_one_to_thirty_one2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOURTEEN_in_spelled_one_to_thirty_one2657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIFTEEN_in_spelled_one_to_thirty_one2670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTEEN_in_spelled_one_to_thirty_one2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVENTEEN_in_spelled_one_to_thirty_one2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHTEEN_in_spelled_one_to_thirty_one2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINETEEN_in_spelled_one_to_thirty_one2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one2736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one2751 = new BitSet(new long[]{0x0000100000100000L,0x0000000000040000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one2754 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2758 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ONE_in_spelled_one_to_thirty_one2762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one2775 = new BitSet(new long[]{0x0000100000100000L,0x0000000000080000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one2778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_TWO_in_spelled_one_to_thirty_one2786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one2799 = new BitSet(new long[]{0x0000100000100000L,0x0000000000100000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one2802 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2806 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_THREE_in_spelled_one_to_thirty_one2810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one2821 = new BitSet(new long[]{0x0000100000100000L,0x0000000000200000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one2824 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2828 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_FOUR_in_spelled_one_to_thirty_one2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one2844 = new BitSet(new long[]{0x0000100000100000L,0x0000000000400000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one2847 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2851 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_FIVE_in_spelled_one_to_thirty_one2855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one2867 = new BitSet(new long[]{0x0000100000100000L,0x0000000000800000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one2870 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2874 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_SIX_in_spelled_one_to_thirty_one2878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one2891 = new BitSet(new long[]{0x0000100000100000L,0x0000000001000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one2894 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2898 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_SEVEN_in_spelled_one_to_thirty_one2902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one2913 = new BitSet(new long[]{0x0000100000100000L,0x0000000002000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one2916 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2920 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_EIGHT_in_spelled_one_to_thirty_one2924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one2935 = new BitSet(new long[]{0x0000100000100000L,0x0000000004000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one2938 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2942 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_NINE_in_spelled_one_to_thirty_one2946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_in_spelled_one_to_thirty_one2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_in_spelled_one_to_thirty_one2997 = new BitSet(new long[]{0x0000100000100000L,0x0000000000040000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one3000 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3004 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ONE_in_spelled_one_to_thirty_one3008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIRST_in_spelled_first_to_thirty_first3031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SECOND_in_spelled_first_to_thirty_first3048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRD_in_spelled_first_to_thirty_first3064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOURTH_in_spelled_first_to_thirty_first3081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIFTH_in_spelled_first_to_thirty_first3097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTH_in_spelled_first_to_thirty_first3114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVENTH_in_spelled_first_to_thirty_first3131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHTH_in_spelled_first_to_thirty_first3146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINTH_in_spelled_first_to_thirty_first3162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TENTH_in_spelled_first_to_thirty_first3179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEVENTH_in_spelled_first_to_thirty_first3196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWELFTH_in_spelled_first_to_thirty_first3210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEENTH_in_spelled_first_to_thirty_first3225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOURTEENTH_in_spelled_first_to_thirty_first3237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIFTEENTH_in_spelled_first_to_thirty_first3249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTEENTH_in_spelled_first_to_thirty_first3262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVENTEENTH_in_spelled_first_to_thirty_first3275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHTEENTH_in_spelled_first_to_thirty_first3286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINETEENTH_in_spelled_first_to_thirty_first3298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTIETH_in_spelled_first_to_thirty_first3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FIRST_in_spelled_first_to_thirty_first3324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3331 = new BitSet(new long[]{0x0000100000100000L,0x0000008000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3334 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3338 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_FIRST_in_spelled_first_to_thirty_first3342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_SECOND_in_spelled_first_to_thirty_first3358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3364 = new BitSet(new long[]{0x0000100000100000L,0x0000010000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3367 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3371 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_SECOND_in_spelled_first_to_thirty_first3375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_THIRD_in_spelled_first_to_thirty_first3390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3397 = new BitSet(new long[]{0x0000100000100000L,0x0000020000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3400 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3404 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_THIRD_in_spelled_first_to_thirty_first3408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FOURTH_in_spelled_first_to_thirty_first3424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3430 = new BitSet(new long[]{0x0000100000100000L,0x0000040000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3433 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3437 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_FOURTH_in_spelled_first_to_thirty_first3441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FIFTH_in_spelled_first_to_thirty_first3456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3463 = new BitSet(new long[]{0x0000100000100000L,0x0000080000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3466 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3470 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_FIFTH_in_spelled_first_to_thirty_first3474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_SIXTH_in_spelled_first_to_thirty_first3490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3497 = new BitSet(new long[]{0x0000100000100000L,0x0000100000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3500 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3504 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_SIXTH_in_spelled_first_to_thirty_first3508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_SEVENTH_in_spelled_first_to_thirty_first3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3529 = new BitSet(new long[]{0x0000100000100000L,0x0000200000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3532 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3536 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_SEVENTH_in_spelled_first_to_thirty_first3540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_EIGHTH_in_spelled_first_to_thirty_first3554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3560 = new BitSet(new long[]{0x0000100000100000L,0x0000400000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3563 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3567 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_EIGHTH_in_spelled_first_to_thirty_first3571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_NINTH_in_spelled_first_to_thirty_first3586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3593 = new BitSet(new long[]{0x0000100000100000L,0x0000800000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3596 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3600 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_NINTH_in_spelled_first_to_thirty_first3604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTIETH_in_spelled_first_to_thirty_first3619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_FIRST_in_spelled_first_to_thirty_first3679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_in_spelled_first_to_thirty_first3686 = new BitSet(new long[]{0x0000100000100000L,0x0000008000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3689 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3693 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_FIRST_in_spelled_first_to_thirty_first3697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_in_synpred1_Date139 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_date_time_separator_in_synpred1_Date142 = new BitSet(new long[]{0x0000000000000000L,0x0000000000007F00L});
    public static final BitSet FOLLOW_time_in_synpred1_Date144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_synpred2_Date543 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_synpred2_Date545 = new BitSet(new long[]{0x0000000001000000L,0xFFFFFFFFFFFCF000L,0x000000000000003FL});
    public static final BitSet FOLLOW_relaxed_day_of_month_in_synpred2_Date549 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_synpred2_Date551 = new BitSet(new long[]{0x000001FFF0000000L});
    public static final BitSet FOLLOW_OF_in_synpred2_Date554 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_synpred2_Date556 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_relaxed_month_in_synpred2_Date560 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_relaxed_year_in_synpred2_Date562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relaxed_month_in_synpred3_Date610 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_synpred3_Date612 = new BitSet(new long[]{0x0000000001000000L,0xFFFFFFFFFFFCF000L,0x000000000000003FL});
    public static final BitSet FOLLOW_relaxed_day_of_month_in_synpred3_Date614 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_relaxed_year_in_synpred3_Date616 = new BitSet(new long[]{0x0000000000000002L});

}