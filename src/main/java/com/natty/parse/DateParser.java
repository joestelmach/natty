// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g 2010-02-08 10:37:56
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INT", "MONTH_OF_YEAR", "DAY_OF_MONTH", "DAY_OF_WEEK", "YEAR_OF", "DATE_TIME", "EXPLICIT_DATE", "RELATIVE_DATE", "SEEK", "DIRECTION", "SEEK_BY", "SPAN", "EXPLICIT_TIME", "HOURS_OF_DAY", "MINUTES_OF_HOUR", "AM_PM", "WHITE_SPACE", "AT", "COMMA", "ON", "THE", "DAY", "AFTER", "BEFORE", "OF", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER", "SINGLE_QUOTE", "IN", "YEAR", "DASH", "SLASH", "THIS", "LAST", "NEXT", "PAST", "COMING", "UPCOMING", "FROM", "NOW", "AGO", "WEEK", "MONTH", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "TODAY", "TOMORROW", "YESTERDAY", "COLON", "MILITARY_HOUR_SUFFIX", "HOUR", "AM", "PM", "NOON", "MIDNIGHT", "INT_0", "INT_00", "INT_1_TO_9", "INT_01_TO_12", "INT_13_TO_23", "INT_24_TO_31", "INT_32_TO_59", "INT_60_TO_99", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN", "TWENTY", "THIRTY", "FIRST", "SECOND", "THIRD", "FOURTH", "FIFTH", "SIXTH", "SEVENTH", "EIGHTH", "NINTH", "TENTH", "ELEVENTH", "TWELFTH", "THIRTEENTH", "FOURTEENTH", "FIFTEENTH", "SIXTEENTH", "SEVENTEENTH", "EIGHTEENTH", "NINETEENTH", "TWENTIETH", "TWENTY_FIRST", "TWENTY_SECOND", "TWENTY_THIRD", "TWENTY_FOURTH", "TWENTY_FIFTH", "TWENTY_SIXTH", "TWENTY_SEVENTH", "TWENTY_EIGHTH", "TWENTY_NINTH", "THIRTIETH", "THIRTY_FIRST", "DOT", "'s'"
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
    public static final int T__135=135;
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
    public String getGrammarFileName() { return "/Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g"; }


    public static class date_time_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "date_time"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:29:1: date_time : ( ( date ( date_time_separator time )? )=> date ( date_time_separator time )? | time ( time_date_separator date )? ) -> ^( DATE_TIME ( date )? ( time )? ) ;
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
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:3: ( ( ( date ( date_time_separator time )? )=> date ( date_time_separator time )? | time ( time_date_separator date )? ) -> ^( DATE_TIME ( date )? ( time )? ) )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:5: ( ( date ( date_time_separator time )? )=> date ( date_time_separator time )? | time ( time_date_separator date )? )
            {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:5: ( ( date ( date_time_separator time )? )=> date ( date_time_separator time )? | time ( time_date_separator date )? )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:31:7: ( date ( date_time_separator time )? )=> date ( date_time_separator time )?
                    {
                    pushFollow(FOLLOW_date_in_date_time158);
                    date1=date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_date.add(date1.getTree());
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:32:14: ( date_time_separator time )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==WHITE_SPACE||LA1_0==COMMA) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:32:15: date_time_separator time
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:34:9: time ( time_date_separator date )?
                    {
                    pushFollow(FOLLOW_time_in_date_time182);
                    time4=time();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_time.add(time4.getTree());
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:34:14: ( time_date_separator date )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==WHITE_SPACE||LA2_0==COMMA) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:34:15: time_date_separator date
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
            // 35:7: -> ^( DATE_TIME ( date )? ( time )? )
            {
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:35:10: ^( DATE_TIME ( date )? ( time )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DATE_TIME, "DATE_TIME"), root_1);

                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:35:22: ( date )?
                if ( stream_date.hasNext() ) {
                    adaptor.addChild(root_1, stream_date.nextTree());

                }
                stream_date.reset();
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:35:28: ( time )?
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:38:1: date_time_separator : ( WHITE_SPACE ( AT WHITE_SPACE )? | COMMA ( WHITE_SPACE )? ( AT WHITE_SPACE )? );
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
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:39:3: ( WHITE_SPACE ( AT WHITE_SPACE )? | COMMA ( WHITE_SPACE )? ( AT WHITE_SPACE )? )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:39:5: WHITE_SPACE ( AT WHITE_SPACE )?
                    {
                    root_0 = (Object)adaptor.nil();

                    WHITE_SPACE7=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_date_time_separator222); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHITE_SPACE7_tree = (Object)adaptor.create(WHITE_SPACE7);
                    adaptor.addChild(root_0, WHITE_SPACE7_tree);
                    }
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:39:17: ( AT WHITE_SPACE )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==AT) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:39:18: AT WHITE_SPACE
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:40:5: COMMA ( WHITE_SPACE )? ( AT WHITE_SPACE )?
                    {
                    root_0 = (Object)adaptor.nil();

                    COMMA10=(Token)match(input,COMMA,FOLLOW_COMMA_in_date_time_separator235); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COMMA10_tree = (Object)adaptor.create(COMMA10);
                    adaptor.addChild(root_0, COMMA10_tree);
                    }
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:40:11: ( WHITE_SPACE )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==WHITE_SPACE) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:40:11: WHITE_SPACE
                            {
                            WHITE_SPACE11=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_date_time_separator237); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            WHITE_SPACE11_tree = (Object)adaptor.create(WHITE_SPACE11);
                            adaptor.addChild(root_0, WHITE_SPACE11_tree);
                            }

                            }
                            break;

                    }

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:40:24: ( AT WHITE_SPACE )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==AT) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:40:25: AT WHITE_SPACE
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:43:1: time_date_separator : ( WHITE_SPACE ( ON WHITE_SPACE )? | COMMA ( WHITE_SPACE )? ( ON WHITE_SPACE )? );
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
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:44:3: ( WHITE_SPACE ( ON WHITE_SPACE )? | COMMA ( WHITE_SPACE )? ( ON WHITE_SPACE )? )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:44:5: WHITE_SPACE ( ON WHITE_SPACE )?
                    {
                    root_0 = (Object)adaptor.nil();

                    WHITE_SPACE14=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_time_date_separator260); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHITE_SPACE14_tree = (Object)adaptor.create(WHITE_SPACE14);
                    adaptor.addChild(root_0, WHITE_SPACE14_tree);
                    }
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:44:17: ( ON WHITE_SPACE )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==ON) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:44:18: ON WHITE_SPACE
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:45:5: COMMA ( WHITE_SPACE )? ( ON WHITE_SPACE )?
                    {
                    root_0 = (Object)adaptor.nil();

                    COMMA17=(Token)match(input,COMMA,FOLLOW_COMMA_in_time_date_separator273); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COMMA17_tree = (Object)adaptor.create(COMMA17);
                    adaptor.addChild(root_0, COMMA17_tree);
                    }
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:45:11: ( WHITE_SPACE )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==WHITE_SPACE) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:45:11: WHITE_SPACE
                            {
                            WHITE_SPACE18=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_time_date_separator275); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            WHITE_SPACE18_tree = (Object)adaptor.create(WHITE_SPACE18);
                            adaptor.addChild(root_0, WHITE_SPACE18_tree);
                            }

                            }
                            break;

                    }

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:45:24: ( ON WHITE_SPACE )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==ON) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:45:25: ON WHITE_SPACE
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:48:1: date : ( ( relaxed_date )=> relaxed_date | formal_date | relative_date | global_date_prefix date -> ^( RELATIVE_DATE ^( SEEK global_date_prefix date ) ) );
    public final DateParser.date_return date() throws RecognitionException {
        DateParser.date_return retval = new DateParser.date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.relaxed_date_return relaxed_date21 = null;

        DateParser.formal_date_return formal_date22 = null;

        DateParser.relative_date_return relative_date23 = null;

        DateParser.global_date_prefix_return global_date_prefix24 = null;

        DateParser.date_return date25 = null;


        RewriteRuleSubtreeStream stream_global_date_prefix=new RewriteRuleSubtreeStream(adaptor,"rule global_date_prefix");
        RewriteRuleSubtreeStream stream_date=new RewriteRuleSubtreeStream(adaptor,"rule date");
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:49:3: ( ( relaxed_date )=> relaxed_date | formal_date | relative_date | global_date_prefix date -> ^( RELATIVE_DATE ^( SEEK global_date_prefix date ) ) )
            int alt12=4;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:49:5: ( relaxed_date )=> relaxed_date
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_relaxed_date_in_date301);
                    relaxed_date21=relaxed_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, relaxed_date21.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:50:5: formal_date
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_formal_date_in_date307);
                    formal_date22=formal_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formal_date22.getTree());

                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:51:5: relative_date
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_relative_date_in_date313);
                    relative_date23=relative_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, relative_date23.getTree());

                    }
                    break;
                case 4 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:52:5: global_date_prefix date
                    {
                    pushFollow(FOLLOW_global_date_prefix_in_date319);
                    global_date_prefix24=global_date_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_global_date_prefix.add(global_date_prefix24.getTree());
                    pushFollow(FOLLOW_date_in_date321);
                    date25=date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_date.add(date25.getTree());


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
                    // 53:7: -> ^( RELATIVE_DATE ^( SEEK global_date_prefix date ) )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:53:10: ^( RELATIVE_DATE ^( SEEK global_date_prefix date ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:53:26: ^( SEEK global_date_prefix date )
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:56:1: global_date_prefix : ( ( THE WHITE_SPACE )? DAY WHITE_SPACE AFTER WHITE_SPACE -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"] | ( THE WHITE_SPACE )? DAY WHITE_SPACE BEFORE WHITE_SPACE -> DIRECTION[\"<\"] SEEK_BY[\"by_day\"] INT[\"1\"] );
    public final DateParser.global_date_prefix_return global_date_prefix() throws RecognitionException {
        DateParser.global_date_prefix_return retval = new DateParser.global_date_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THE26=null;
        Token WHITE_SPACE27=null;
        Token DAY28=null;
        Token WHITE_SPACE29=null;
        Token AFTER30=null;
        Token WHITE_SPACE31=null;
        Token THE32=null;
        Token WHITE_SPACE33=null;
        Token DAY34=null;
        Token WHITE_SPACE35=null;
        Token BEFORE36=null;
        Token WHITE_SPACE37=null;

        Object THE26_tree=null;
        Object WHITE_SPACE27_tree=null;
        Object DAY28_tree=null;
        Object WHITE_SPACE29_tree=null;
        Object AFTER30_tree=null;
        Object WHITE_SPACE31_tree=null;
        Object THE32_tree=null;
        Object WHITE_SPACE33_tree=null;
        Object DAY34_tree=null;
        Object WHITE_SPACE35_tree=null;
        Object BEFORE36_tree=null;
        Object WHITE_SPACE37_tree=null;
        RewriteRuleTokenStream stream_BEFORE=new RewriteRuleTokenStream(adaptor,"token BEFORE");
        RewriteRuleTokenStream stream_DAY=new RewriteRuleTokenStream(adaptor,"token DAY");
        RewriteRuleTokenStream stream_AFTER=new RewriteRuleTokenStream(adaptor,"token AFTER");
        RewriteRuleTokenStream stream_THE=new RewriteRuleTokenStream(adaptor,"token THE");
        RewriteRuleTokenStream stream_WHITE_SPACE=new RewriteRuleTokenStream(adaptor,"token WHITE_SPACE");

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:57:3: ( ( THE WHITE_SPACE )? DAY WHITE_SPACE AFTER WHITE_SPACE -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"] | ( THE WHITE_SPACE )? DAY WHITE_SPACE BEFORE WHITE_SPACE -> DIRECTION[\"<\"] SEEK_BY[\"by_day\"] INT[\"1\"] )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==THE) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==WHITE_SPACE) ) {
                    int LA15_3 = input.LA(3);

                    if ( (LA15_3==DAY) ) {
                        int LA15_2 = input.LA(4);

                        if ( (LA15_2==WHITE_SPACE) ) {
                            int LA15_4 = input.LA(5);

                            if ( (LA15_4==AFTER) ) {
                                alt15=1;
                            }
                            else if ( (LA15_4==BEFORE) ) {
                                alt15=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 15, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 15, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA15_0==DAY) ) {
                int LA15_2 = input.LA(2);

                if ( (LA15_2==WHITE_SPACE) ) {
                    int LA15_4 = input.LA(3);

                    if ( (LA15_4==AFTER) ) {
                        alt15=1;
                    }
                    else if ( (LA15_4==BEFORE) ) {
                        alt15=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:57:5: ( THE WHITE_SPACE )? DAY WHITE_SPACE AFTER WHITE_SPACE
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:57:5: ( THE WHITE_SPACE )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==THE) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:57:6: THE WHITE_SPACE
                            {
                            THE26=(Token)match(input,THE,FOLLOW_THE_in_global_date_prefix358); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THE.add(THE26);

                            WHITE_SPACE27=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_global_date_prefix360); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE27);


                            }
                            break;

                    }

                    DAY28=(Token)match(input,DAY,FOLLOW_DAY_in_global_date_prefix364); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DAY.add(DAY28);

                    WHITE_SPACE29=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_global_date_prefix366); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE29);

                    AFTER30=(Token)match(input,AFTER,FOLLOW_AFTER_in_global_date_prefix368); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AFTER.add(AFTER30);

                    WHITE_SPACE31=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_global_date_prefix370); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE31);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 58:7: -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_BY, "by_day"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:60:5: ( THE WHITE_SPACE )? DAY WHITE_SPACE BEFORE WHITE_SPACE
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:60:5: ( THE WHITE_SPACE )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==THE) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:60:6: THE WHITE_SPACE
                            {
                            THE32=(Token)match(input,THE,FOLLOW_THE_in_global_date_prefix402); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THE.add(THE32);

                            WHITE_SPACE33=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_global_date_prefix404); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE33);


                            }
                            break;

                    }

                    DAY34=(Token)match(input,DAY,FOLLOW_DAY_in_global_date_prefix408); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DAY.add(DAY34);

                    WHITE_SPACE35=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_global_date_prefix410); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE35);

                    BEFORE36=(Token)match(input,BEFORE,FOLLOW_BEFORE_in_global_date_prefix412); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BEFORE.add(BEFORE36);

                    WHITE_SPACE37=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_global_date_prefix414); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE37);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 61:7: -> DIRECTION[\"<\"] SEEK_BY[\"by_day\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, "<"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_BY, "by_day"));
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:67:1: relaxed_date : ( ( ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year )=> ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year | ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year )=> relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year | ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month | ( THE WHITE_SPACE )? relaxed_month WHITE_SPACE relaxed_day_of_month ) -> ^( EXPLICIT_DATE relaxed_month relaxed_day_of_month ( relaxed_year )? ) ;
    public final DateParser.relaxed_date_return relaxed_date() throws RecognitionException {
        DateParser.relaxed_date_return retval = new DateParser.relaxed_date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THE38=null;
        Token WHITE_SPACE39=null;
        Token WHITE_SPACE41=null;
        Token OF42=null;
        Token WHITE_SPACE43=null;
        Token WHITE_SPACE47=null;
        Token THE50=null;
        Token WHITE_SPACE51=null;
        Token WHITE_SPACE53=null;
        Token OF54=null;
        Token WHITE_SPACE55=null;
        Token THE57=null;
        Token WHITE_SPACE58=null;
        Token WHITE_SPACE60=null;
        DateParser.relaxed_day_of_month_return relaxed_day_of_month40 = null;

        DateParser.relaxed_month_return relaxed_month44 = null;

        DateParser.relaxed_year_return relaxed_year45 = null;

        DateParser.relaxed_month_return relaxed_month46 = null;

        DateParser.relaxed_day_of_month_return relaxed_day_of_month48 = null;

        DateParser.relaxed_year_return relaxed_year49 = null;

        DateParser.relaxed_day_of_month_return relaxed_day_of_month52 = null;

        DateParser.relaxed_month_return relaxed_month56 = null;

        DateParser.relaxed_month_return relaxed_month59 = null;

        DateParser.relaxed_day_of_month_return relaxed_day_of_month61 = null;


        Object THE38_tree=null;
        Object WHITE_SPACE39_tree=null;
        Object WHITE_SPACE41_tree=null;
        Object OF42_tree=null;
        Object WHITE_SPACE43_tree=null;
        Object WHITE_SPACE47_tree=null;
        Object THE50_tree=null;
        Object WHITE_SPACE51_tree=null;
        Object WHITE_SPACE53_tree=null;
        Object OF54_tree=null;
        Object WHITE_SPACE55_tree=null;
        Object THE57_tree=null;
        Object WHITE_SPACE58_tree=null;
        Object WHITE_SPACE60_tree=null;
        RewriteRuleTokenStream stream_THE=new RewriteRuleTokenStream(adaptor,"token THE");
        RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
        RewriteRuleTokenStream stream_WHITE_SPACE=new RewriteRuleTokenStream(adaptor,"token WHITE_SPACE");
        RewriteRuleSubtreeStream stream_relaxed_day_of_month=new RewriteRuleSubtreeStream(adaptor,"rule relaxed_day_of_month");
        RewriteRuleSubtreeStream stream_relaxed_month=new RewriteRuleSubtreeStream(adaptor,"rule relaxed_month");
        RewriteRuleSubtreeStream stream_relaxed_year=new RewriteRuleSubtreeStream(adaptor,"rule relaxed_year");
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:68:3: ( ( ( ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year )=> ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year | ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year )=> relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year | ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month | ( THE WHITE_SPACE )? relaxed_month WHITE_SPACE relaxed_day_of_month ) -> ^( EXPLICIT_DATE relaxed_month relaxed_day_of_month ( relaxed_year )? ) )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:68:5: ( ( ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year )=> ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year | ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year )=> relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year | ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month | ( THE WHITE_SPACE )? relaxed_month WHITE_SPACE relaxed_day_of_month )
            {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:68:5: ( ( ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year )=> ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year | ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year )=> relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year | ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month | ( THE WHITE_SPACE )? relaxed_month WHITE_SPACE relaxed_day_of_month )
            int alt21=4;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:72:7: ( ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year )=> ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:73:9: ( THE WHITE_SPACE )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==THE) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:73:10: THE WHITE_SPACE
                            {
                            THE38=(Token)match(input,THE,FOLLOW_THE_in_relaxed_date512); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THE.add(THE38);

                            WHITE_SPACE39=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date514); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE39);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_relaxed_day_of_month_in_relaxed_date518);
                    relaxed_day_of_month40=relaxed_day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_day_of_month.add(relaxed_day_of_month40.getTree());
                    WHITE_SPACE41=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date520); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE41);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:73:61: ( OF WHITE_SPACE )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==OF) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:73:62: OF WHITE_SPACE
                            {
                            OF42=(Token)match(input,OF,FOLLOW_OF_in_relaxed_date523); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OF.add(OF42);

                            WHITE_SPACE43=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date525); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE43);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_relaxed_month_in_relaxed_date529);
                    relaxed_month44=relaxed_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_month.add(relaxed_month44.getTree());
                    pushFollow(FOLLOW_relaxed_year_in_relaxed_date531);
                    relaxed_year45=relaxed_year();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_year.add(relaxed_year45.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:75:9: ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year )=> relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year
                    {
                    pushFollow(FOLLOW_relaxed_month_in_relaxed_date565);
                    relaxed_month46=relaxed_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_month.add(relaxed_month46.getTree());
                    WHITE_SPACE47=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date567); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE47);

                    pushFollow(FOLLOW_relaxed_day_of_month_in_relaxed_date569);
                    relaxed_day_of_month48=relaxed_day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_day_of_month.add(relaxed_day_of_month48.getTree());
                    pushFollow(FOLLOW_relaxed_year_in_relaxed_date571);
                    relaxed_year49=relaxed_year();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_year.add(relaxed_year49.getTree());

                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:78:9: ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:78:9: ( THE WHITE_SPACE )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==THE) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:78:10: THE WHITE_SPACE
                            {
                            THE50=(Token)match(input,THE,FOLLOW_THE_in_relaxed_date587); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THE.add(THE50);

                            WHITE_SPACE51=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date589); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE51);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_relaxed_day_of_month_in_relaxed_date593);
                    relaxed_day_of_month52=relaxed_day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_day_of_month.add(relaxed_day_of_month52.getTree());
                    WHITE_SPACE53=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date595); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE53);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:78:61: ( OF WHITE_SPACE )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==OF) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:78:62: OF WHITE_SPACE
                            {
                            OF54=(Token)match(input,OF,FOLLOW_OF_in_relaxed_date598); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OF.add(OF54);

                            WHITE_SPACE55=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date600); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE55);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_relaxed_month_in_relaxed_date604);
                    relaxed_month56=relaxed_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_month.add(relaxed_month56.getTree());

                    }
                    break;
                case 4 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:80:9: ( THE WHITE_SPACE )? relaxed_month WHITE_SPACE relaxed_day_of_month
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:80:9: ( THE WHITE_SPACE )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==THE) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:80:10: THE WHITE_SPACE
                            {
                            THE57=(Token)match(input,THE,FOLLOW_THE_in_relaxed_date622); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THE.add(THE57);

                            WHITE_SPACE58=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date624); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE58);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_relaxed_month_in_relaxed_date628);
                    relaxed_month59=relaxed_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_month.add(relaxed_month59.getTree());
                    WHITE_SPACE60=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date630); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE60);

                    pushFollow(FOLLOW_relaxed_day_of_month_in_relaxed_date632);
                    relaxed_day_of_month61=relaxed_day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_day_of_month.add(relaxed_day_of_month61.getTree());

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
            // 81:7: -> ^( EXPLICIT_DATE relaxed_month relaxed_day_of_month ( relaxed_year )? )
            {
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:81:10: ^( EXPLICIT_DATE relaxed_month relaxed_day_of_month ( relaxed_year )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_1);

                adaptor.addChild(root_1, stream_relaxed_month.nextTree());
                adaptor.addChild(root_1, stream_relaxed_day_of_month.nextTree());
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:81:61: ( relaxed_year )?
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:84:1: relaxed_month : ( JANUARY -> ^( MONTH_OF_YEAR INT[\"1\"] ) | FEBRUARY -> ^( MONTH_OF_YEAR INT[\"2\"] ) | MARCH -> ^( MONTH_OF_YEAR INT[\"3\"] ) | APRIL -> ^( MONTH_OF_YEAR INT[\"4\"] ) | MAY -> ^( MONTH_OF_YEAR INT[\"5\"] ) | JUNE -> ^( MONTH_OF_YEAR INT[\"6\"] ) | JULY -> ^( MONTH_OF_YEAR INT[\"7\"] ) | AUGUST -> ^( MONTH_OF_YEAR INT[\"8\"] ) | SEPTEMBER -> ^( MONTH_OF_YEAR INT[\"9\"] ) | OCTOBER -> ^( MONTH_OF_YEAR INT[\"10\"] ) | NOVEMBER -> ^( MONTH_OF_YEAR INT[\"11\"] ) | DECEMBER -> ^( MONTH_OF_YEAR INT[\"12\"] ) );
    public final DateParser.relaxed_month_return relaxed_month() throws RecognitionException {
        DateParser.relaxed_month_return retval = new DateParser.relaxed_month_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token JANUARY62=null;
        Token FEBRUARY63=null;
        Token MARCH64=null;
        Token APRIL65=null;
        Token MAY66=null;
        Token JUNE67=null;
        Token JULY68=null;
        Token AUGUST69=null;
        Token SEPTEMBER70=null;
        Token OCTOBER71=null;
        Token NOVEMBER72=null;
        Token DECEMBER73=null;

        Object JANUARY62_tree=null;
        Object FEBRUARY63_tree=null;
        Object MARCH64_tree=null;
        Object APRIL65_tree=null;
        Object MAY66_tree=null;
        Object JUNE67_tree=null;
        Object JULY68_tree=null;
        Object AUGUST69_tree=null;
        Object SEPTEMBER70_tree=null;
        Object OCTOBER71_tree=null;
        Object NOVEMBER72_tree=null;
        Object DECEMBER73_tree=null;
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
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:85:3: ( JANUARY -> ^( MONTH_OF_YEAR INT[\"1\"] ) | FEBRUARY -> ^( MONTH_OF_YEAR INT[\"2\"] ) | MARCH -> ^( MONTH_OF_YEAR INT[\"3\"] ) | APRIL -> ^( MONTH_OF_YEAR INT[\"4\"] ) | MAY -> ^( MONTH_OF_YEAR INT[\"5\"] ) | JUNE -> ^( MONTH_OF_YEAR INT[\"6\"] ) | JULY -> ^( MONTH_OF_YEAR INT[\"7\"] ) | AUGUST -> ^( MONTH_OF_YEAR INT[\"8\"] ) | SEPTEMBER -> ^( MONTH_OF_YEAR INT[\"9\"] ) | OCTOBER -> ^( MONTH_OF_YEAR INT[\"10\"] ) | NOVEMBER -> ^( MONTH_OF_YEAR INT[\"11\"] ) | DECEMBER -> ^( MONTH_OF_YEAR INT[\"12\"] ) )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:85:5: JANUARY
                    {
                    JANUARY62=(Token)match(input,JANUARY,FOLLOW_JANUARY_in_relaxed_month664); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_JANUARY.add(JANUARY62);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 85:15: -> ^( MONTH_OF_YEAR INT[\"1\"] )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:85:18: ^( MONTH_OF_YEAR INT[\"1\"] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:86:5: FEBRUARY
                    {
                    FEBRUARY63=(Token)match(input,FEBRUARY,FOLLOW_FEBRUARY_in_relaxed_month681); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FEBRUARY.add(FEBRUARY63);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 86:15: -> ^( MONTH_OF_YEAR INT[\"2\"] )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:86:18: ^( MONTH_OF_YEAR INT[\"2\"] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:87:5: MARCH
                    {
                    MARCH64=(Token)match(input,MARCH,FOLLOW_MARCH_in_relaxed_month697); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MARCH.add(MARCH64);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 87:15: -> ^( MONTH_OF_YEAR INT[\"3\"] )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:87:18: ^( MONTH_OF_YEAR INT[\"3\"] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:88:5: APRIL
                    {
                    APRIL65=(Token)match(input,APRIL,FOLLOW_APRIL_in_relaxed_month716); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_APRIL.add(APRIL65);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 88:15: -> ^( MONTH_OF_YEAR INT[\"4\"] )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:88:18: ^( MONTH_OF_YEAR INT[\"4\"] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:89:5: MAY
                    {
                    MAY66=(Token)match(input,MAY,FOLLOW_MAY_in_relaxed_month735); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MAY.add(MAY66);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 89:15: -> ^( MONTH_OF_YEAR INT[\"5\"] )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:89:18: ^( MONTH_OF_YEAR INT[\"5\"] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:90:5: JUNE
                    {
                    JUNE67=(Token)match(input,JUNE,FOLLOW_JUNE_in_relaxed_month756); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_JUNE.add(JUNE67);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 90:15: -> ^( MONTH_OF_YEAR INT[\"6\"] )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:90:18: ^( MONTH_OF_YEAR INT[\"6\"] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:91:5: JULY
                    {
                    JULY68=(Token)match(input,JULY,FOLLOW_JULY_in_relaxed_month776); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_JULY.add(JULY68);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 91:15: -> ^( MONTH_OF_YEAR INT[\"7\"] )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:91:18: ^( MONTH_OF_YEAR INT[\"7\"] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:92:5: AUGUST
                    {
                    AUGUST69=(Token)match(input,AUGUST,FOLLOW_AUGUST_in_relaxed_month796); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AUGUST.add(AUGUST69);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 92:15: -> ^( MONTH_OF_YEAR INT[\"8\"] )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:92:18: ^( MONTH_OF_YEAR INT[\"8\"] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:93:5: SEPTEMBER
                    {
                    SEPTEMBER70=(Token)match(input,SEPTEMBER,FOLLOW_SEPTEMBER_in_relaxed_month814); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEPTEMBER.add(SEPTEMBER70);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 93:15: -> ^( MONTH_OF_YEAR INT[\"9\"] )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:93:18: ^( MONTH_OF_YEAR INT[\"9\"] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:94:5: OCTOBER
                    {
                    OCTOBER71=(Token)match(input,OCTOBER,FOLLOW_OCTOBER_in_relaxed_month829); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OCTOBER.add(OCTOBER71);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 94:15: -> ^( MONTH_OF_YEAR INT[\"10\"] )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:94:18: ^( MONTH_OF_YEAR INT[\"10\"] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:95:5: NOVEMBER
                    {
                    NOVEMBER72=(Token)match(input,NOVEMBER,FOLLOW_NOVEMBER_in_relaxed_month846); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOVEMBER.add(NOVEMBER72);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 95:15: -> ^( MONTH_OF_YEAR INT[\"11\"] )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:95:18: ^( MONTH_OF_YEAR INT[\"11\"] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:96:5: DECEMBER
                    {
                    DECEMBER73=(Token)match(input,DECEMBER,FOLLOW_DECEMBER_in_relaxed_month862); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DECEMBER.add(DECEMBER73);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 96:15: -> ^( MONTH_OF_YEAR INT[\"12\"] )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:96:18: ^( MONTH_OF_YEAR INT[\"12\"] )
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:99:1: relaxed_day_of_month : ( spelled_or_int_01_to_31_optional_prefix -> ^( DAY_OF_MONTH spelled_or_int_01_to_31_optional_prefix ) | spelled_first_to_thirty_first -> ^( DAY_OF_MONTH spelled_first_to_thirty_first ) );
    public final DateParser.relaxed_day_of_month_return relaxed_day_of_month() throws RecognitionException {
        DateParser.relaxed_day_of_month_return retval = new DateParser.relaxed_day_of_month_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.spelled_or_int_01_to_31_optional_prefix_return spelled_or_int_01_to_31_optional_prefix74 = null;

        DateParser.spelled_first_to_thirty_first_return spelled_first_to_thirty_first75 = null;


        RewriteRuleSubtreeStream stream_spelled_first_to_thirty_first=new RewriteRuleSubtreeStream(adaptor,"rule spelled_first_to_thirty_first");
        RewriteRuleSubtreeStream stream_spelled_or_int_01_to_31_optional_prefix=new RewriteRuleSubtreeStream(adaptor,"rule spelled_or_int_01_to_31_optional_prefix");
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:100:3: ( spelled_or_int_01_to_31_optional_prefix -> ^( DAY_OF_MONTH spelled_or_int_01_to_31_optional_prefix ) | spelled_first_to_thirty_first -> ^( DAY_OF_MONTH spelled_first_to_thirty_first ) )
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

                    if ( (LA23_7==FIRST) ) {
                        alt23=2;
                    }
                    else if ( (LA23_7==AT||(LA23_7>=OF && LA23_7<=IN)||(LA23_7>=NOON && LA23_7<=ONE)) ) {
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:100:5: spelled_or_int_01_to_31_optional_prefix
                    {
                    pushFollow(FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_relaxed_day_of_month887);
                    spelled_or_int_01_to_31_optional_prefix74=spelled_or_int_01_to_31_optional_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_or_int_01_to_31_optional_prefix.add(spelled_or_int_01_to_31_optional_prefix74.getTree());


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
                    // 101:7: -> ^( DAY_OF_MONTH spelled_or_int_01_to_31_optional_prefix )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:101:10: ^( DAY_OF_MONTH spelled_or_int_01_to_31_optional_prefix )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:103:5: spelled_first_to_thirty_first
                    {
                    pushFollow(FOLLOW_spelled_first_to_thirty_first_in_relaxed_day_of_month914);
                    spelled_first_to_thirty_first75=spelled_first_to_thirty_first();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_first_to_thirty_first.add(spelled_first_to_thirty_first75.getTree());


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
                    // 104:7: -> ^( DAY_OF_MONTH spelled_first_to_thirty_first )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:104:10: ^( DAY_OF_MONTH spelled_first_to_thirty_first )
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:107:1: relaxed_year : ( relaxed_year_prefix ( SINGLE_QUOTE )? int_00_to_99_mandatory_prefix -> ^( YEAR_OF int_00_to_99_mandatory_prefix ) | relaxed_year_prefix int_four_digits -> ^( YEAR_OF int_four_digits ) );
    public final DateParser.relaxed_year_return relaxed_year() throws RecognitionException {
        DateParser.relaxed_year_return retval = new DateParser.relaxed_year_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SINGLE_QUOTE77=null;
        DateParser.relaxed_year_prefix_return relaxed_year_prefix76 = null;

        DateParser.int_00_to_99_mandatory_prefix_return int_00_to_99_mandatory_prefix78 = null;

        DateParser.relaxed_year_prefix_return relaxed_year_prefix79 = null;

        DateParser.int_four_digits_return int_four_digits80 = null;


        Object SINGLE_QUOTE77_tree=null;
        RewriteRuleTokenStream stream_SINGLE_QUOTE=new RewriteRuleTokenStream(adaptor,"token SINGLE_QUOTE");
        RewriteRuleSubtreeStream stream_relaxed_year_prefix=new RewriteRuleSubtreeStream(adaptor,"rule relaxed_year_prefix");
        RewriteRuleSubtreeStream stream_int_four_digits=new RewriteRuleSubtreeStream(adaptor,"rule int_four_digits");
        RewriteRuleSubtreeStream stream_int_00_to_99_mandatory_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_00_to_99_mandatory_prefix");
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:108:3: ( relaxed_year_prefix ( SINGLE_QUOTE )? int_00_to_99_mandatory_prefix -> ^( YEAR_OF int_00_to_99_mandatory_prefix ) | relaxed_year_prefix int_four_digits -> ^( YEAR_OF int_four_digits ) )
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:108:5: relaxed_year_prefix ( SINGLE_QUOTE )? int_00_to_99_mandatory_prefix
                    {
                    pushFollow(FOLLOW_relaxed_year_prefix_in_relaxed_year944);
                    relaxed_year_prefix76=relaxed_year_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_year_prefix.add(relaxed_year_prefix76.getTree());
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:108:25: ( SINGLE_QUOTE )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==SINGLE_QUOTE) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:108:25: SINGLE_QUOTE
                            {
                            SINGLE_QUOTE77=(Token)match(input,SINGLE_QUOTE,FOLLOW_SINGLE_QUOTE_in_relaxed_year946); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SINGLE_QUOTE.add(SINGLE_QUOTE77);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_int_00_to_99_mandatory_prefix_in_relaxed_year949);
                    int_00_to_99_mandatory_prefix78=int_00_to_99_mandatory_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_00_to_99_mandatory_prefix.add(int_00_to_99_mandatory_prefix78.getTree());


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
                    // 109:7: -> ^( YEAR_OF int_00_to_99_mandatory_prefix )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:109:10: ^( YEAR_OF int_00_to_99_mandatory_prefix )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:111:5: relaxed_year_prefix int_four_digits
                    {
                    pushFollow(FOLLOW_relaxed_year_prefix_in_relaxed_year976);
                    relaxed_year_prefix79=relaxed_year_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_year_prefix.add(relaxed_year_prefix79.getTree());
                    pushFollow(FOLLOW_int_four_digits_in_relaxed_year978);
                    int_four_digits80=int_four_digits();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_four_digits.add(int_four_digits80.getTree());


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
                    // 112:7: -> ^( YEAR_OF int_four_digits )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:112:10: ^( YEAR_OF int_four_digits )
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:115:1: relaxed_year_prefix : ( COMMA ( WHITE_SPACE )? | WHITE_SPACE ) ( IN WHITE_SPACE THE WHITE_SPACE YEAR WHITE_SPACE )? ;
    public final DateParser.relaxed_year_prefix_return relaxed_year_prefix() throws RecognitionException {
        DateParser.relaxed_year_prefix_return retval = new DateParser.relaxed_year_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA81=null;
        Token WHITE_SPACE82=null;
        Token WHITE_SPACE83=null;
        Token IN84=null;
        Token WHITE_SPACE85=null;
        Token THE86=null;
        Token WHITE_SPACE87=null;
        Token YEAR88=null;
        Token WHITE_SPACE89=null;

        Object COMMA81_tree=null;
        Object WHITE_SPACE82_tree=null;
        Object WHITE_SPACE83_tree=null;
        Object IN84_tree=null;
        Object WHITE_SPACE85_tree=null;
        Object THE86_tree=null;
        Object WHITE_SPACE87_tree=null;
        Object YEAR88_tree=null;
        Object WHITE_SPACE89_tree=null;

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:116:3: ( ( COMMA ( WHITE_SPACE )? | WHITE_SPACE ) ( IN WHITE_SPACE THE WHITE_SPACE YEAR WHITE_SPACE )? )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:116:5: ( COMMA ( WHITE_SPACE )? | WHITE_SPACE ) ( IN WHITE_SPACE THE WHITE_SPACE YEAR WHITE_SPACE )?
            {
            root_0 = (Object)adaptor.nil();

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:116:5: ( COMMA ( WHITE_SPACE )? | WHITE_SPACE )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:116:6: COMMA ( WHITE_SPACE )?
                    {
                    COMMA81=(Token)match(input,COMMA,FOLLOW_COMMA_in_relaxed_year_prefix1008); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COMMA81_tree = (Object)adaptor.create(COMMA81);
                    adaptor.addChild(root_0, COMMA81_tree);
                    }
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:116:12: ( WHITE_SPACE )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==WHITE_SPACE) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:116:12: WHITE_SPACE
                            {
                            WHITE_SPACE82=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1010); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            WHITE_SPACE82_tree = (Object)adaptor.create(WHITE_SPACE82);
                            adaptor.addChild(root_0, WHITE_SPACE82_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:116:27: WHITE_SPACE
                    {
                    WHITE_SPACE83=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1015); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHITE_SPACE83_tree = (Object)adaptor.create(WHITE_SPACE83);
                    adaptor.addChild(root_0, WHITE_SPACE83_tree);
                    }

                    }
                    break;

            }

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:116:40: ( IN WHITE_SPACE THE WHITE_SPACE YEAR WHITE_SPACE )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==IN) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:116:41: IN WHITE_SPACE THE WHITE_SPACE YEAR WHITE_SPACE
                    {
                    IN84=(Token)match(input,IN,FOLLOW_IN_in_relaxed_year_prefix1019); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IN84_tree = (Object)adaptor.create(IN84);
                    adaptor.addChild(root_0, IN84_tree);
                    }
                    WHITE_SPACE85=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1021); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHITE_SPACE85_tree = (Object)adaptor.create(WHITE_SPACE85);
                    adaptor.addChild(root_0, WHITE_SPACE85_tree);
                    }
                    THE86=(Token)match(input,THE,FOLLOW_THE_in_relaxed_year_prefix1023); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THE86_tree = (Object)adaptor.create(THE86);
                    adaptor.addChild(root_0, THE86_tree);
                    }
                    WHITE_SPACE87=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1025); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHITE_SPACE87_tree = (Object)adaptor.create(WHITE_SPACE87);
                    adaptor.addChild(root_0, WHITE_SPACE87_tree);
                    }
                    YEAR88=(Token)match(input,YEAR,FOLLOW_YEAR_in_relaxed_year_prefix1027); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    YEAR88_tree = (Object)adaptor.create(YEAR88);
                    adaptor.addChild(root_0, YEAR88_tree);
                    }
                    WHITE_SPACE89=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1029); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHITE_SPACE89_tree = (Object)adaptor.create(WHITE_SPACE89);
                    adaptor.addChild(root_0, WHITE_SPACE89_tree);
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:121:1: formal_date : ( formal_year_four_digits formal_date_separator formal_month_of_year formal_date_separator formal_day_of_month -> ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month formal_year_four_digits ) | formal_month_of_year formal_date_separator formal_day_of_month ( formal_date_separator formal_year )? -> ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month ( formal_year )? ) );
    public final DateParser.formal_date_return formal_date() throws RecognitionException {
        DateParser.formal_date_return retval = new DateParser.formal_date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.formal_year_four_digits_return formal_year_four_digits90 = null;

        DateParser.formal_date_separator_return formal_date_separator91 = null;

        DateParser.formal_month_of_year_return formal_month_of_year92 = null;

        DateParser.formal_date_separator_return formal_date_separator93 = null;

        DateParser.formal_day_of_month_return formal_day_of_month94 = null;

        DateParser.formal_month_of_year_return formal_month_of_year95 = null;

        DateParser.formal_date_separator_return formal_date_separator96 = null;

        DateParser.formal_day_of_month_return formal_day_of_month97 = null;

        DateParser.formal_date_separator_return formal_date_separator98 = null;

        DateParser.formal_year_return formal_year99 = null;


        RewriteRuleSubtreeStream stream_formal_year=new RewriteRuleSubtreeStream(adaptor,"rule formal_year");
        RewriteRuleSubtreeStream stream_formal_day_of_month=new RewriteRuleSubtreeStream(adaptor,"rule formal_day_of_month");
        RewriteRuleSubtreeStream stream_formal_year_four_digits=new RewriteRuleSubtreeStream(adaptor,"rule formal_year_four_digits");
        RewriteRuleSubtreeStream stream_formal_date_separator=new RewriteRuleSubtreeStream(adaptor,"rule formal_date_separator");
        RewriteRuleSubtreeStream stream_formal_month_of_year=new RewriteRuleSubtreeStream(adaptor,"rule formal_month_of_year");
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:123:3: ( formal_year_four_digits formal_date_separator formal_month_of_year formal_date_separator formal_day_of_month -> ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month formal_year_four_digits ) | formal_month_of_year formal_date_separator formal_day_of_month ( formal_date_separator formal_year )? -> ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month ( formal_year )? ) )
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

                if ( ((LA30_2>=DASH && LA30_2<=SLASH)) ) {
                    alt30=2;
                }
                else if ( (LA30_2==INT_00||(LA30_2>=INT_01_TO_12 && LA30_2<=INT_60_TO_99)) ) {
                    alt30=1;
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:123:5: formal_year_four_digits formal_date_separator formal_month_of_year formal_date_separator formal_day_of_month
                    {
                    pushFollow(FOLLOW_formal_year_four_digits_in_formal_date1053);
                    formal_year_four_digits90=formal_year_four_digits();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_year_four_digits.add(formal_year_four_digits90.getTree());
                    pushFollow(FOLLOW_formal_date_separator_in_formal_date1055);
                    formal_date_separator91=formal_date_separator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_date_separator.add(formal_date_separator91.getTree());
                    pushFollow(FOLLOW_formal_month_of_year_in_formal_date1057);
                    formal_month_of_year92=formal_month_of_year();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_month_of_year.add(formal_month_of_year92.getTree());
                    pushFollow(FOLLOW_formal_date_separator_in_formal_date1059);
                    formal_date_separator93=formal_date_separator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_date_separator.add(formal_date_separator93.getTree());
                    pushFollow(FOLLOW_formal_day_of_month_in_formal_date1061);
                    formal_day_of_month94=formal_day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_day_of_month.add(formal_day_of_month94.getTree());


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
                    // 124:7: -> ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month formal_year_four_digits )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:124:10: ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month formal_year_four_digits )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:127:5: formal_month_of_year formal_date_separator formal_day_of_month ( formal_date_separator formal_year )?
                    {
                    pushFollow(FOLLOW_formal_month_of_year_in_formal_date1090);
                    formal_month_of_year95=formal_month_of_year();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_month_of_year.add(formal_month_of_year95.getTree());
                    pushFollow(FOLLOW_formal_date_separator_in_formal_date1092);
                    formal_date_separator96=formal_date_separator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_date_separator.add(formal_date_separator96.getTree());
                    pushFollow(FOLLOW_formal_day_of_month_in_formal_date1094);
                    formal_day_of_month97=formal_day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_day_of_month.add(formal_day_of_month97.getTree());
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:127:68: ( formal_date_separator formal_year )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( ((LA29_0>=DASH && LA29_0<=SLASH)) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:127:69: formal_date_separator formal_year
                            {
                            pushFollow(FOLLOW_formal_date_separator_in_formal_date1097);
                            formal_date_separator98=formal_date_separator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_formal_date_separator.add(formal_date_separator98.getTree());
                            pushFollow(FOLLOW_formal_year_in_formal_date1099);
                            formal_year99=formal_year();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_formal_year.add(formal_year99.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: formal_month_of_year, formal_year, formal_day_of_month
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 128:7: -> ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month ( formal_year )? )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:128:10: ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month ( formal_year )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_1);

                        adaptor.addChild(root_1, stream_formal_month_of_year.nextTree());
                        adaptor.addChild(root_1, stream_formal_day_of_month.nextTree());
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:128:67: ( formal_year )?
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:131:1: formal_month_of_year : int_01_to_12_optional_prefix -> ^( MONTH_OF_YEAR int_01_to_12_optional_prefix ) ;
    public final DateParser.formal_month_of_year_return formal_month_of_year() throws RecognitionException {
        DateParser.formal_month_of_year_return retval = new DateParser.formal_month_of_year_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_01_to_12_optional_prefix_return int_01_to_12_optional_prefix100 = null;


        RewriteRuleSubtreeStream stream_int_01_to_12_optional_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_01_to_12_optional_prefix");
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:132:3: ( int_01_to_12_optional_prefix -> ^( MONTH_OF_YEAR int_01_to_12_optional_prefix ) )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:132:5: int_01_to_12_optional_prefix
            {
            pushFollow(FOLLOW_int_01_to_12_optional_prefix_in_formal_month_of_year1133);
            int_01_to_12_optional_prefix100=int_01_to_12_optional_prefix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_01_to_12_optional_prefix.add(int_01_to_12_optional_prefix100.getTree());


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
            // 132:34: -> ^( MONTH_OF_YEAR int_01_to_12_optional_prefix )
            {
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:132:37: ^( MONTH_OF_YEAR int_01_to_12_optional_prefix )
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:135:1: formal_day_of_month : int_01_to_31_optional_prefix -> ^( DAY_OF_MONTH int_01_to_31_optional_prefix ) ;
    public final DateParser.formal_day_of_month_return formal_day_of_month() throws RecognitionException {
        DateParser.formal_day_of_month_return retval = new DateParser.formal_day_of_month_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_01_to_31_optional_prefix_return int_01_to_31_optional_prefix101 = null;


        RewriteRuleSubtreeStream stream_int_01_to_31_optional_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_01_to_31_optional_prefix");
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:136:3: ( int_01_to_31_optional_prefix -> ^( DAY_OF_MONTH int_01_to_31_optional_prefix ) )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:136:5: int_01_to_31_optional_prefix
            {
            pushFollow(FOLLOW_int_01_to_31_optional_prefix_in_formal_day_of_month1156);
            int_01_to_31_optional_prefix101=int_01_to_31_optional_prefix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_01_to_31_optional_prefix.add(int_01_to_31_optional_prefix101.getTree());


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
            // 136:34: -> ^( DAY_OF_MONTH int_01_to_31_optional_prefix )
            {
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:136:37: ^( DAY_OF_MONTH int_01_to_31_optional_prefix )
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:139:1: formal_year : ( formal_year_four_digits | int_00_to_99_mandatory_prefix -> ^( YEAR_OF int_00_to_99_mandatory_prefix ) );
    public final DateParser.formal_year_return formal_year() throws RecognitionException {
        DateParser.formal_year_return retval = new DateParser.formal_year_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.formal_year_four_digits_return formal_year_four_digits102 = null;

        DateParser.int_00_to_99_mandatory_prefix_return int_00_to_99_mandatory_prefix103 = null;


        RewriteRuleSubtreeStream stream_int_00_to_99_mandatory_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_00_to_99_mandatory_prefix");
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:140:3: ( formal_year_four_digits | int_00_to_99_mandatory_prefix -> ^( YEAR_OF int_00_to_99_mandatory_prefix ) )
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

                if ( (LA31_2==EOF||LA31_2==WHITE_SPACE||LA31_2==COMMA) ) {
                    alt31=2;
                }
                else if ( (LA31_2==INT_00||(LA31_2>=INT_01_TO_12 && LA31_2<=INT_60_TO_99)) ) {
                    alt31=1;
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:140:5: formal_year_four_digits
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_formal_year_four_digits_in_formal_year1179);
                    formal_year_four_digits102=formal_year_four_digits();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formal_year_four_digits102.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:141:5: int_00_to_99_mandatory_prefix
                    {
                    pushFollow(FOLLOW_int_00_to_99_mandatory_prefix_in_formal_year1185);
                    int_00_to_99_mandatory_prefix103=int_00_to_99_mandatory_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_00_to_99_mandatory_prefix.add(int_00_to_99_mandatory_prefix103.getTree());


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
                    // 141:35: -> ^( YEAR_OF int_00_to_99_mandatory_prefix )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:141:38: ^( YEAR_OF int_00_to_99_mandatory_prefix )
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:144:1: formal_year_four_digits : int_four_digits -> ^( YEAR_OF int_four_digits ) ;
    public final DateParser.formal_year_four_digits_return formal_year_four_digits() throws RecognitionException {
        DateParser.formal_year_four_digits_return retval = new DateParser.formal_year_four_digits_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_four_digits_return int_four_digits104 = null;


        RewriteRuleSubtreeStream stream_int_four_digits=new RewriteRuleSubtreeStream(adaptor,"rule int_four_digits");
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:145:3: ( int_four_digits -> ^( YEAR_OF int_four_digits ) )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:145:5: int_four_digits
            {
            pushFollow(FOLLOW_int_four_digits_in_formal_year_four_digits1208);
            int_four_digits104=int_four_digits();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_four_digits.add(int_four_digits104.getTree());


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
            // 145:21: -> ^( YEAR_OF int_four_digits )
            {
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:145:24: ^( YEAR_OF int_four_digits )
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:148:1: formal_date_separator : ( DASH | SLASH );
    public final DateParser.formal_date_separator_return formal_date_separator() throws RecognitionException {
        DateParser.formal_date_separator_return retval = new DateParser.formal_date_separator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set105=null;

        Object set105_tree=null;

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:149:3: ( DASH | SLASH )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:
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
    // $ANTLR end "formal_date_separator"

    public static class relative_date_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relative_date"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:155:1: relative_date : ( relative_prefix WHITE_SPACE relative_target ( 's' )? -> ^( RELATIVE_DATE ^( SEEK relative_prefix relative_target ) ) | implicit_prefix WHITE_SPACE relative_target -> ^( RELATIVE_DATE ^( SEEK implicit_prefix relative_target ) ) | relative_target -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] relative_target ) ) | spelled_or_int_01_to_31_optional_prefix WHITE_SPACE relative_target WHITE_SPACE relative_suffix -> ^( RELATIVE_DATE ^( SEEK relative_suffix spelled_or_int_01_to_31_optional_prefix relative_target ) ) | named_relative_date );
    public final DateParser.relative_date_return relative_date() throws RecognitionException {
        DateParser.relative_date_return retval = new DateParser.relative_date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHITE_SPACE107=null;
        Token char_literal109=null;
        Token WHITE_SPACE111=null;
        Token WHITE_SPACE115=null;
        Token WHITE_SPACE117=null;
        DateParser.relative_prefix_return relative_prefix106 = null;

        DateParser.relative_target_return relative_target108 = null;

        DateParser.implicit_prefix_return implicit_prefix110 = null;

        DateParser.relative_target_return relative_target112 = null;

        DateParser.relative_target_return relative_target113 = null;

        DateParser.spelled_or_int_01_to_31_optional_prefix_return spelled_or_int_01_to_31_optional_prefix114 = null;

        DateParser.relative_target_return relative_target116 = null;

        DateParser.relative_suffix_return relative_suffix118 = null;

        DateParser.named_relative_date_return named_relative_date119 = null;


        Object WHITE_SPACE107_tree=null;
        Object char_literal109_tree=null;
        Object WHITE_SPACE111_tree=null;
        Object WHITE_SPACE115_tree=null;
        Object WHITE_SPACE117_tree=null;
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_WHITE_SPACE=new RewriteRuleTokenStream(adaptor,"token WHITE_SPACE");
        RewriteRuleSubtreeStream stream_relative_suffix=new RewriteRuleSubtreeStream(adaptor,"rule relative_suffix");
        RewriteRuleSubtreeStream stream_implicit_prefix=new RewriteRuleSubtreeStream(adaptor,"rule implicit_prefix");
        RewriteRuleSubtreeStream stream_relative_prefix=new RewriteRuleSubtreeStream(adaptor,"rule relative_prefix");
        RewriteRuleSubtreeStream stream_spelled_or_int_01_to_31_optional_prefix=new RewriteRuleSubtreeStream(adaptor,"rule spelled_or_int_01_to_31_optional_prefix");
        RewriteRuleSubtreeStream stream_relative_target=new RewriteRuleSubtreeStream(adaptor,"rule relative_target");
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:156:3: ( relative_prefix WHITE_SPACE relative_target ( 's' )? -> ^( RELATIVE_DATE ^( SEEK relative_prefix relative_target ) ) | implicit_prefix WHITE_SPACE relative_target -> ^( RELATIVE_DATE ^( SEEK implicit_prefix relative_target ) ) | relative_target -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] relative_target ) ) | spelled_or_int_01_to_31_optional_prefix WHITE_SPACE relative_target WHITE_SPACE relative_suffix -> ^( RELATIVE_DATE ^( SEEK relative_suffix spelled_or_int_01_to_31_optional_prefix relative_target ) ) | named_relative_date )
            int alt33=5;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:156:5: relative_prefix WHITE_SPACE relative_target ( 's' )?
                    {
                    pushFollow(FOLLOW_relative_prefix_in_relative_date1257);
                    relative_prefix106=relative_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_prefix.add(relative_prefix106.getTree());
                    WHITE_SPACE107=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_date1259); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE107);

                    pushFollow(FOLLOW_relative_target_in_relative_date1261);
                    relative_target108=relative_target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_target.add(relative_target108.getTree());
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:156:49: ( 's' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==135) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:156:49: 's'
                            {
                            char_literal109=(Token)match(input,135,FOLLOW_135_in_relative_date1263); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_135.add(char_literal109);


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
                    // 157:7: -> ^( RELATIVE_DATE ^( SEEK relative_prefix relative_target ) )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:157:10: ^( RELATIVE_DATE ^( SEEK relative_prefix relative_target ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:157:26: ^( SEEK relative_prefix relative_target )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:159:5: implicit_prefix WHITE_SPACE relative_target
                    {
                    pushFollow(FOLLOW_implicit_prefix_in_relative_date1297);
                    implicit_prefix110=implicit_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_implicit_prefix.add(implicit_prefix110.getTree());
                    WHITE_SPACE111=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_date1299); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE111);

                    pushFollow(FOLLOW_relative_target_in_relative_date1301);
                    relative_target112=relative_target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_target.add(relative_target112.getTree());


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
                    // 160:7: -> ^( RELATIVE_DATE ^( SEEK implicit_prefix relative_target ) )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:160:10: ^( RELATIVE_DATE ^( SEEK implicit_prefix relative_target ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:160:26: ^( SEEK implicit_prefix relative_target )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:163:5: relative_target
                    {
                    pushFollow(FOLLOW_relative_target_in_relative_date1338);
                    relative_target113=relative_target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_target.add(relative_target113.getTree());


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
                    // 164:7: -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] relative_target ) )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:164:10: ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] relative_target ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:164:26: ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] relative_target )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:166:5: spelled_or_int_01_to_31_optional_prefix WHITE_SPACE relative_target WHITE_SPACE relative_suffix
                    {
                    pushFollow(FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_relative_date1378);
                    spelled_or_int_01_to_31_optional_prefix114=spelled_or_int_01_to_31_optional_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_or_int_01_to_31_optional_prefix.add(spelled_or_int_01_to_31_optional_prefix114.getTree());
                    WHITE_SPACE115=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_date1380); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE115);

                    pushFollow(FOLLOW_relative_target_in_relative_date1382);
                    relative_target116=relative_target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_target.add(relative_target116.getTree());
                    WHITE_SPACE117=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_date1384); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE117);

                    pushFollow(FOLLOW_relative_suffix_in_relative_date1386);
                    relative_suffix118=relative_suffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_suffix.add(relative_suffix118.getTree());


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
                    // 167:7: -> ^( RELATIVE_DATE ^( SEEK relative_suffix spelled_or_int_01_to_31_optional_prefix relative_target ) )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:167:10: ^( RELATIVE_DATE ^( SEEK relative_suffix spelled_or_int_01_to_31_optional_prefix relative_target ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:167:26: ^( SEEK relative_suffix spelled_or_int_01_to_31_optional_prefix relative_target )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:169:5: named_relative_date
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_named_relative_date_in_relative_date1422);
                    named_relative_date119=named_relative_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, named_relative_date119.getTree());

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:172:1: relative_target : ( day_of_week | relaxed_month | relative_date_span );
    public final DateParser.relative_target_return relative_target() throws RecognitionException {
        DateParser.relative_target_return retval = new DateParser.relative_target_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.day_of_week_return day_of_week120 = null;

        DateParser.relaxed_month_return relaxed_month121 = null;

        DateParser.relative_date_span_return relative_date_span122 = null;



        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:173:3: ( day_of_week | relaxed_month | relative_date_span )
            int alt34=3;
            switch ( input.LA(1) ) {
            case SUNDAY:
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
            case SATURDAY:
                {
                alt34=1;
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
                alt34=2;
                }
                break;
            case DAY:
            case YEAR:
            case WEEK:
            case MONTH:
                {
                alt34=3;
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:173:5: day_of_week
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_day_of_week_in_relative_target1438);
                    day_of_week120=day_of_week();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, day_of_week120.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:174:5: relaxed_month
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_relaxed_month_in_relative_target1445);
                    relaxed_month121=relaxed_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, relaxed_month121.getTree());

                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:175:5: relative_date_span
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_relative_date_span_in_relative_target1451);
                    relative_date_span122=relative_date_span();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, relative_date_span122.getTree());

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:178:1: implicit_prefix : THIS -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] ;
    public final DateParser.implicit_prefix_return implicit_prefix() throws RecognitionException {
        DateParser.implicit_prefix_return retval = new DateParser.implicit_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THIS123=null;

        Object THIS123_tree=null;
        RewriteRuleTokenStream stream_THIS=new RewriteRuleTokenStream(adaptor,"token THIS");

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:179:3: ( THIS -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:179:5: THIS
            {
            THIS123=(Token)match(input,THIS,FOLLOW_THIS_in_implicit_prefix1466); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_THIS.add(THIS123);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 179:10: -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"]
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:182:1: relative_prefix : ( ( THIS WHITE_SPACE )? LAST -> DIRECTION[\"<\"] SEEK_BY[\"by_week\"] INT[\"1\"] | ( THIS WHITE_SPACE )? NEXT -> DIRECTION[\">\"] SEEK_BY[\"by_week\"] INT[\"1\"] | ( THIS WHITE_SPACE )? PAST -> DIRECTION[\"<\"] SEEK_BY[\"by_day\"] INT[\"1\"] | ( THIS WHITE_SPACE )? COMING -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"] | ( THIS WHITE_SPACE )? UPCOMING -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"] | ( IN WHITE_SPACE )? spelled_or_int_01_to_31_optional_prefix -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] spelled_or_int_01_to_31_optional_prefix );
    public final DateParser.relative_prefix_return relative_prefix() throws RecognitionException {
        DateParser.relative_prefix_return retval = new DateParser.relative_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THIS124=null;
        Token WHITE_SPACE125=null;
        Token LAST126=null;
        Token THIS127=null;
        Token WHITE_SPACE128=null;
        Token NEXT129=null;
        Token THIS130=null;
        Token WHITE_SPACE131=null;
        Token PAST132=null;
        Token THIS133=null;
        Token WHITE_SPACE134=null;
        Token COMING135=null;
        Token THIS136=null;
        Token WHITE_SPACE137=null;
        Token UPCOMING138=null;
        Token IN139=null;
        Token WHITE_SPACE140=null;
        DateParser.spelled_or_int_01_to_31_optional_prefix_return spelled_or_int_01_to_31_optional_prefix141 = null;


        Object THIS124_tree=null;
        Object WHITE_SPACE125_tree=null;
        Object LAST126_tree=null;
        Object THIS127_tree=null;
        Object WHITE_SPACE128_tree=null;
        Object NEXT129_tree=null;
        Object THIS130_tree=null;
        Object WHITE_SPACE131_tree=null;
        Object PAST132_tree=null;
        Object THIS133_tree=null;
        Object WHITE_SPACE134_tree=null;
        Object COMING135_tree=null;
        Object THIS136_tree=null;
        Object WHITE_SPACE137_tree=null;
        Object UPCOMING138_tree=null;
        Object IN139_tree=null;
        Object WHITE_SPACE140_tree=null;
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
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:183:3: ( ( THIS WHITE_SPACE )? LAST -> DIRECTION[\"<\"] SEEK_BY[\"by_week\"] INT[\"1\"] | ( THIS WHITE_SPACE )? NEXT -> DIRECTION[\">\"] SEEK_BY[\"by_week\"] INT[\"1\"] | ( THIS WHITE_SPACE )? PAST -> DIRECTION[\"<\"] SEEK_BY[\"by_day\"] INT[\"1\"] | ( THIS WHITE_SPACE )? COMING -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"] | ( THIS WHITE_SPACE )? UPCOMING -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"] | ( IN WHITE_SPACE )? spelled_or_int_01_to_31_optional_prefix -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] spelled_or_int_01_to_31_optional_prefix )
            int alt41=6;
            switch ( input.LA(1) ) {
            case THIS:
                {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==WHITE_SPACE) ) {
                    switch ( input.LA(3) ) {
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:183:5: ( THIS WHITE_SPACE )? LAST
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:183:5: ( THIS WHITE_SPACE )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==THIS) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:183:6: THIS WHITE_SPACE
                            {
                            THIS124=(Token)match(input,THIS,FOLLOW_THIS_in_relative_prefix1493); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS124);

                            WHITE_SPACE125=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_prefix1495); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE125);


                            }
                            break;

                    }

                    LAST126=(Token)match(input,LAST,FOLLOW_LAST_in_relative_prefix1499); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LAST.add(LAST126);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 183:34: -> DIRECTION[\"<\"] SEEK_BY[\"by_week\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, "<"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_BY, "by_week"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:184:5: ( THIS WHITE_SPACE )? NEXT
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:184:5: ( THIS WHITE_SPACE )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==THIS) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:184:6: THIS WHITE_SPACE
                            {
                            THIS127=(Token)match(input,THIS,FOLLOW_THIS_in_relative_prefix1521); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS127);

                            WHITE_SPACE128=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_prefix1523); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE128);


                            }
                            break;

                    }

                    NEXT129=(Token)match(input,NEXT,FOLLOW_NEXT_in_relative_prefix1527); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEXT.add(NEXT129);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 184:34: -> DIRECTION[\">\"] SEEK_BY[\"by_week\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_BY, "by_week"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:185:5: ( THIS WHITE_SPACE )? PAST
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:185:5: ( THIS WHITE_SPACE )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==THIS) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:185:6: THIS WHITE_SPACE
                            {
                            THIS130=(Token)match(input,THIS,FOLLOW_THIS_in_relative_prefix1549); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS130);

                            WHITE_SPACE131=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_prefix1551); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE131);


                            }
                            break;

                    }

                    PAST132=(Token)match(input,PAST,FOLLOW_PAST_in_relative_prefix1555); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAST.add(PAST132);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 185:34: -> DIRECTION[\"<\"] SEEK_BY[\"by_day\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, "<"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_BY, "by_day"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:186:5: ( THIS WHITE_SPACE )? COMING
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:186:5: ( THIS WHITE_SPACE )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==THIS) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:186:6: THIS WHITE_SPACE
                            {
                            THIS133=(Token)match(input,THIS,FOLLOW_THIS_in_relative_prefix1577); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS133);

                            WHITE_SPACE134=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_prefix1579); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE134);


                            }
                            break;

                    }

                    COMING135=(Token)match(input,COMING,FOLLOW_COMING_in_relative_prefix1583); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMING.add(COMING135);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 186:34: -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_BY, "by_day"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:187:5: ( THIS WHITE_SPACE )? UPCOMING
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:187:5: ( THIS WHITE_SPACE )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==THIS) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:187:6: THIS WHITE_SPACE
                            {
                            THIS136=(Token)match(input,THIS,FOLLOW_THIS_in_relative_prefix1603); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS136);

                            WHITE_SPACE137=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_prefix1605); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE137);


                            }
                            break;

                    }

                    UPCOMING138=(Token)match(input,UPCOMING,FOLLOW_UPCOMING_in_relative_prefix1609); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UPCOMING.add(UPCOMING138);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 187:34: -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_BY, "by_day"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:188:5: ( IN WHITE_SPACE )? spelled_or_int_01_to_31_optional_prefix
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:188:5: ( IN WHITE_SPACE )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==IN) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:188:6: IN WHITE_SPACE
                            {
                            IN139=(Token)match(input,IN,FOLLOW_IN_in_relative_prefix1627); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IN.add(IN139);

                            WHITE_SPACE140=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_prefix1629); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE140);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_relative_prefix1633);
                    spelled_or_int_01_to_31_optional_prefix141=spelled_or_int_01_to_31_optional_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_or_int_01_to_31_optional_prefix.add(spelled_or_int_01_to_31_optional_prefix141.getTree());


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
                    // 189:7: -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] spelled_or_int_01_to_31_optional_prefix
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:192:1: relative_suffix : ( FROM WHITE_SPACE NOW -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] | AGO -> DIRECTION[\"<\"] SEEK_BY[\"by_day\"] );
    public final DateParser.relative_suffix_return relative_suffix() throws RecognitionException {
        DateParser.relative_suffix_return retval = new DateParser.relative_suffix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FROM142=null;
        Token WHITE_SPACE143=null;
        Token NOW144=null;
        Token AGO145=null;

        Object FROM142_tree=null;
        Object WHITE_SPACE143_tree=null;
        Object NOW144_tree=null;
        Object AGO145_tree=null;
        RewriteRuleTokenStream stream_AGO=new RewriteRuleTokenStream(adaptor,"token AGO");
        RewriteRuleTokenStream stream_NOW=new RewriteRuleTokenStream(adaptor,"token NOW");
        RewriteRuleTokenStream stream_FROM=new RewriteRuleTokenStream(adaptor,"token FROM");
        RewriteRuleTokenStream stream_WHITE_SPACE=new RewriteRuleTokenStream(adaptor,"token WHITE_SPACE");

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:193:3: ( FROM WHITE_SPACE NOW -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] | AGO -> DIRECTION[\"<\"] SEEK_BY[\"by_day\"] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:193:5: FROM WHITE_SPACE NOW
                    {
                    FROM142=(Token)match(input,FROM,FOLLOW_FROM_in_relative_suffix1665); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FROM.add(FROM142);

                    WHITE_SPACE143=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_suffix1667); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE143);

                    NOW144=(Token)match(input,NOW,FOLLOW_NOW_in_relative_suffix1669); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOW.add(NOW144);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 193:26: -> DIRECTION[\">\"] SEEK_BY[\"by_day\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_BY, "by_day"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:194:5: AGO
                    {
                    AGO145=(Token)match(input,AGO,FOLLOW_AGO_in_relative_suffix1683); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AGO.add(AGO145);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 194:26: -> DIRECTION[\"<\"] SEEK_BY[\"by_day\"]
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:197:1: relative_date_span : ( DAY -> SPAN[\"day\"] | WEEK -> SPAN[\"week\"] | MONTH -> SPAN[\"month\"] | YEAR -> SPAN[\"year\"] );
    public final DateParser.relative_date_span_return relative_date_span() throws RecognitionException {
        DateParser.relative_date_span_return retval = new DateParser.relative_date_span_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DAY146=null;
        Token WEEK147=null;
        Token MONTH148=null;
        Token YEAR149=null;

        Object DAY146_tree=null;
        Object WEEK147_tree=null;
        Object MONTH148_tree=null;
        Object YEAR149_tree=null;
        RewriteRuleTokenStream stream_WEEK=new RewriteRuleTokenStream(adaptor,"token WEEK");
        RewriteRuleTokenStream stream_DAY=new RewriteRuleTokenStream(adaptor,"token DAY");
        RewriteRuleTokenStream stream_YEAR=new RewriteRuleTokenStream(adaptor,"token YEAR");
        RewriteRuleTokenStream stream_MONTH=new RewriteRuleTokenStream(adaptor,"token MONTH");

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:198:3: ( DAY -> SPAN[\"day\"] | WEEK -> SPAN[\"week\"] | MONTH -> SPAN[\"month\"] | YEAR -> SPAN[\"year\"] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:198:5: DAY
                    {
                    DAY146=(Token)match(input,DAY,FOLLOW_DAY_in_relative_date_span1723); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DAY.add(DAY146);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 198:11: -> SPAN[\"day\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SPAN, "day"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:199:5: WEEK
                    {
                    WEEK147=(Token)match(input,WEEK,FOLLOW_WEEK_in_relative_date_span1736); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WEEK.add(WEEK147);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 199:11: -> SPAN[\"week\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SPAN, "week"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:200:5: MONTH
                    {
                    MONTH148=(Token)match(input,MONTH,FOLLOW_MONTH_in_relative_date_span1748); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MONTH.add(MONTH148);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 200:11: -> SPAN[\"month\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SPAN, "month"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:201:5: YEAR
                    {
                    YEAR149=(Token)match(input,YEAR,FOLLOW_YEAR_in_relative_date_span1759); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_YEAR.add(YEAR149);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 201:11: -> SPAN[\"year\"]
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:204:1: day_of_week : ( SUNDAY -> ^( DAY_OF_WEEK INT[\"1\"] ) | MONDAY -> ^( DAY_OF_WEEK INT[\"2\"] ) | TUESDAY -> ^( DAY_OF_WEEK INT[\"3\"] ) | WEDNESDAY -> ^( DAY_OF_WEEK INT[\"4\"] ) | THURSDAY -> ^( DAY_OF_WEEK INT[\"5\"] ) | FRIDAY -> ^( DAY_OF_WEEK INT[\"6\"] ) | SATURDAY -> ^( DAY_OF_WEEK INT[\"7\"] ) );
    public final DateParser.day_of_week_return day_of_week() throws RecognitionException {
        DateParser.day_of_week_return retval = new DateParser.day_of_week_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SUNDAY150=null;
        Token MONDAY151=null;
        Token TUESDAY152=null;
        Token WEDNESDAY153=null;
        Token THURSDAY154=null;
        Token FRIDAY155=null;
        Token SATURDAY156=null;

        Object SUNDAY150_tree=null;
        Object MONDAY151_tree=null;
        Object TUESDAY152_tree=null;
        Object WEDNESDAY153_tree=null;
        Object THURSDAY154_tree=null;
        Object FRIDAY155_tree=null;
        Object SATURDAY156_tree=null;
        RewriteRuleTokenStream stream_MONDAY=new RewriteRuleTokenStream(adaptor,"token MONDAY");
        RewriteRuleTokenStream stream_SUNDAY=new RewriteRuleTokenStream(adaptor,"token SUNDAY");
        RewriteRuleTokenStream stream_WEDNESDAY=new RewriteRuleTokenStream(adaptor,"token WEDNESDAY");
        RewriteRuleTokenStream stream_THURSDAY=new RewriteRuleTokenStream(adaptor,"token THURSDAY");
        RewriteRuleTokenStream stream_SATURDAY=new RewriteRuleTokenStream(adaptor,"token SATURDAY");
        RewriteRuleTokenStream stream_TUESDAY=new RewriteRuleTokenStream(adaptor,"token TUESDAY");
        RewriteRuleTokenStream stream_FRIDAY=new RewriteRuleTokenStream(adaptor,"token FRIDAY");

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:205:3: ( SUNDAY -> ^( DAY_OF_WEEK INT[\"1\"] ) | MONDAY -> ^( DAY_OF_WEEK INT[\"2\"] ) | TUESDAY -> ^( DAY_OF_WEEK INT[\"3\"] ) | WEDNESDAY -> ^( DAY_OF_WEEK INT[\"4\"] ) | THURSDAY -> ^( DAY_OF_WEEK INT[\"5\"] ) | FRIDAY -> ^( DAY_OF_WEEK INT[\"6\"] ) | SATURDAY -> ^( DAY_OF_WEEK INT[\"7\"] ) )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:205:5: SUNDAY
                    {
                    SUNDAY150=(Token)match(input,SUNDAY,FOLLOW_SUNDAY_in_day_of_week1779); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUNDAY.add(SUNDAY150);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 205:15: -> ^( DAY_OF_WEEK INT[\"1\"] )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:205:18: ^( DAY_OF_WEEK INT[\"1\"] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:206:5: MONDAY
                    {
                    MONDAY151=(Token)match(input,MONDAY,FOLLOW_MONDAY_in_day_of_week1797); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MONDAY.add(MONDAY151);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 206:15: -> ^( DAY_OF_WEEK INT[\"2\"] )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:206:18: ^( DAY_OF_WEEK INT[\"2\"] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:207:5: TUESDAY
                    {
                    TUESDAY152=(Token)match(input,TUESDAY,FOLLOW_TUESDAY_in_day_of_week1815); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TUESDAY.add(TUESDAY152);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 207:15: -> ^( DAY_OF_WEEK INT[\"3\"] )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:207:18: ^( DAY_OF_WEEK INT[\"3\"] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:208:5: WEDNESDAY
                    {
                    WEDNESDAY153=(Token)match(input,WEDNESDAY,FOLLOW_WEDNESDAY_in_day_of_week1832); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WEDNESDAY.add(WEDNESDAY153);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 208:15: -> ^( DAY_OF_WEEK INT[\"4\"] )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:208:18: ^( DAY_OF_WEEK INT[\"4\"] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:209:5: THURSDAY
                    {
                    THURSDAY154=(Token)match(input,THURSDAY,FOLLOW_THURSDAY_in_day_of_week1847); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THURSDAY.add(THURSDAY154);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 209:15: -> ^( DAY_OF_WEEK INT[\"5\"] )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:209:18: ^( DAY_OF_WEEK INT[\"5\"] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:210:5: FRIDAY
                    {
                    FRIDAY155=(Token)match(input,FRIDAY,FOLLOW_FRIDAY_in_day_of_week1863); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FRIDAY.add(FRIDAY155);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 210:15: -> ^( DAY_OF_WEEK INT[\"6\"] )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:210:18: ^( DAY_OF_WEEK INT[\"6\"] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:211:5: SATURDAY
                    {
                    SATURDAY156=(Token)match(input,SATURDAY,FOLLOW_SATURDAY_in_day_of_week1881); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SATURDAY.add(SATURDAY156);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 211:15: -> ^( DAY_OF_WEEK INT[\"7\"] )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:211:18: ^( DAY_OF_WEEK INT[\"7\"] )
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:214:1: named_relative_date : ( TODAY -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] SPAN[\"day\"] ) ) | TOMORROW -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"] SPAN[\"day\"] ) ) | YESTERDAY -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\"<\"] SEEK_BY[\"by_day\"] INT[\"1\"] SPAN[\"day\"] ) ) );
    public final DateParser.named_relative_date_return named_relative_date() throws RecognitionException {
        DateParser.named_relative_date_return retval = new DateParser.named_relative_date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TODAY157=null;
        Token TOMORROW158=null;
        Token YESTERDAY159=null;

        Object TODAY157_tree=null;
        Object TOMORROW158_tree=null;
        Object YESTERDAY159_tree=null;
        RewriteRuleTokenStream stream_TODAY=new RewriteRuleTokenStream(adaptor,"token TODAY");
        RewriteRuleTokenStream stream_YESTERDAY=new RewriteRuleTokenStream(adaptor,"token YESTERDAY");
        RewriteRuleTokenStream stream_TOMORROW=new RewriteRuleTokenStream(adaptor,"token TOMORROW");

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:215:3: ( TODAY -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] SPAN[\"day\"] ) ) | TOMORROW -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"] SPAN[\"day\"] ) ) | YESTERDAY -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\"<\"] SEEK_BY[\"by_day\"] INT[\"1\"] SPAN[\"day\"] ) ) )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:215:5: TODAY
                    {
                    TODAY157=(Token)match(input,TODAY,FOLLOW_TODAY_in_named_relative_date1906); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TODAY.add(TODAY157);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 215:15: -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] SPAN[\"day\"] ) )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:215:18: ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] SPAN[\"day\"] ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:215:34: ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] SPAN[\"day\"] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:216:5: TOMORROW
                    {
                    TOMORROW158=(Token)match(input,TOMORROW,FOLLOW_TOMORROW_in_named_relative_date1938); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TOMORROW.add(TOMORROW158);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 216:15: -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"] SPAN[\"day\"] ) )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:216:18: ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"] SPAN[\"day\"] ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:216:34: ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"] SPAN[\"day\"] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:217:5: YESTERDAY
                    {
                    YESTERDAY159=(Token)match(input,YESTERDAY,FOLLOW_YESTERDAY_in_named_relative_date1967); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_YESTERDAY.add(YESTERDAY159);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 217:15: -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\"<\"] SEEK_BY[\"by_day\"] INT[\"1\"] SPAN[\"day\"] ) )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:217:18: ^( RELATIVE_DATE ^( SEEK DIRECTION[\"<\"] SEEK_BY[\"by_day\"] INT[\"1\"] SPAN[\"day\"] ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:217:34: ^( SEEK DIRECTION[\"<\"] SEEK_BY[\"by_day\"] INT[\"1\"] SPAN[\"day\"] )
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:223:1: time : ( hours ( COLON )? minutes ( ( WHITE_SPACE )? ( meridian_indicator | ( MILITARY_HOUR_SUFFIX | HOUR ) ) )? -> ^( EXPLICIT_TIME hours minutes ( meridian_indicator )? ) | hours ( WHITE_SPACE )? ( meridian_indicator )? -> ^( EXPLICIT_TIME hours ^( MINUTES_OF_HOUR INT[\"0\"] ) ( meridian_indicator )? ) | named_time );
    public final DateParser.time_return time() throws RecognitionException {
        DateParser.time_return retval = new DateParser.time_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON161=null;
        Token WHITE_SPACE163=null;
        Token MILITARY_HOUR_SUFFIX165=null;
        Token HOUR166=null;
        Token WHITE_SPACE168=null;
        DateParser.hours_return hours160 = null;

        DateParser.minutes_return minutes162 = null;

        DateParser.meridian_indicator_return meridian_indicator164 = null;

        DateParser.hours_return hours167 = null;

        DateParser.meridian_indicator_return meridian_indicator169 = null;

        DateParser.named_time_return named_time170 = null;


        Object COLON161_tree=null;
        Object WHITE_SPACE163_tree=null;
        Object MILITARY_HOUR_SUFFIX165_tree=null;
        Object HOUR166_tree=null;
        Object WHITE_SPACE168_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_HOUR=new RewriteRuleTokenStream(adaptor,"token HOUR");
        RewriteRuleTokenStream stream_MILITARY_HOUR_SUFFIX=new RewriteRuleTokenStream(adaptor,"token MILITARY_HOUR_SUFFIX");
        RewriteRuleTokenStream stream_WHITE_SPACE=new RewriteRuleTokenStream(adaptor,"token WHITE_SPACE");
        RewriteRuleSubtreeStream stream_meridian_indicator=new RewriteRuleSubtreeStream(adaptor,"rule meridian_indicator");
        RewriteRuleSubtreeStream stream_minutes=new RewriteRuleSubtreeStream(adaptor,"rule minutes");
        RewriteRuleSubtreeStream stream_hours=new RewriteRuleSubtreeStream(adaptor,"rule hours");
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:224:3: ( hours ( COLON )? minutes ( ( WHITE_SPACE )? ( meridian_indicator | ( MILITARY_HOUR_SUFFIX | HOUR ) ) )? -> ^( EXPLICIT_TIME hours minutes ( meridian_indicator )? ) | hours ( WHITE_SPACE )? ( meridian_indicator )? -> ^( EXPLICIT_TIME hours ^( MINUTES_OF_HOUR INT[\"0\"] ) ( meridian_indicator )? ) | named_time )
            int alt53=3;
            switch ( input.LA(1) ) {
            case INT_0:
                {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==EOF||LA53_1==WHITE_SPACE||LA53_1==COMMA||(LA53_1>=AM && LA53_1<=PM)) ) {
                    alt53=2;
                }
                else if ( (LA53_1==COLON||LA53_1==INT_00||(LA53_1>=INT_01_TO_12 && LA53_1<=INT_32_TO_59)) ) {
                    alt53=1;
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

                if ( (LA53_3==COLON||LA53_3==INT_00||(LA53_3>=INT_01_TO_12 && LA53_3<=INT_32_TO_59)) ) {
                    alt53=1;
                }
                else if ( (LA53_3==EOF||LA53_3==WHITE_SPACE||LA53_3==COMMA||(LA53_3>=AM && LA53_3<=PM)) ) {
                    alt53=2;
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

                if ( (LA53_5==COLON||LA53_5==INT_00||(LA53_5>=INT_01_TO_12 && LA53_5<=INT_32_TO_59)) ) {
                    alt53=1;
                }
                else if ( (LA53_5==EOF||LA53_5==WHITE_SPACE||LA53_5==COMMA||(LA53_5>=AM && LA53_5<=PM)) ) {
                    alt53=2;
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:224:5: hours ( COLON )? minutes ( ( WHITE_SPACE )? ( meridian_indicator | ( MILITARY_HOUR_SUFFIX | HOUR ) ) )?
                    {
                    pushFollow(FOLLOW_hours_in_time2007);
                    hours160=hours();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_hours.add(hours160.getTree());
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:224:11: ( COLON )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==COLON) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:224:11: COLON
                            {
                            COLON161=(Token)match(input,COLON,FOLLOW_COLON_in_time2009); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COLON.add(COLON161);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_minutes_in_time2012);
                    minutes162=minutes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_minutes.add(minutes162.getTree());
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:224:26: ( ( WHITE_SPACE )? ( meridian_indicator | ( MILITARY_HOUR_SUFFIX | HOUR ) ) )?
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:224:27: ( WHITE_SPACE )? ( meridian_indicator | ( MILITARY_HOUR_SUFFIX | HOUR ) )
                            {
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:224:27: ( WHITE_SPACE )?
                            int alt47=2;
                            int LA47_0 = input.LA(1);

                            if ( (LA47_0==WHITE_SPACE) ) {
                                alt47=1;
                            }
                            switch (alt47) {
                                case 1 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:224:27: WHITE_SPACE
                                    {
                                    WHITE_SPACE163=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_time2015); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE163);


                                    }
                                    break;

                            }

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:224:40: ( meridian_indicator | ( MILITARY_HOUR_SUFFIX | HOUR ) )
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
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:224:41: meridian_indicator
                                    {
                                    pushFollow(FOLLOW_meridian_indicator_in_time2019);
                                    meridian_indicator164=meridian_indicator();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_meridian_indicator.add(meridian_indicator164.getTree());

                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:224:62: ( MILITARY_HOUR_SUFFIX | HOUR )
                                    {
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:224:62: ( MILITARY_HOUR_SUFFIX | HOUR )
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
                                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:224:63: MILITARY_HOUR_SUFFIX
                                            {
                                            MILITARY_HOUR_SUFFIX165=(Token)match(input,MILITARY_HOUR_SUFFIX,FOLLOW_MILITARY_HOUR_SUFFIX_in_time2024); if (state.failed) return retval; 
                                            if ( state.backtracking==0 ) stream_MILITARY_HOUR_SUFFIX.add(MILITARY_HOUR_SUFFIX165);


                                            }
                                            break;
                                        case 2 :
                                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:224:86: HOUR
                                            {
                                            HOUR166=(Token)match(input,HOUR,FOLLOW_HOUR_in_time2028); if (state.failed) return retval; 
                                            if ( state.backtracking==0 ) stream_HOUR.add(HOUR166);


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
                    // elements: minutes, hours, meridian_indicator
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 225:7: -> ^( EXPLICIT_TIME hours minutes ( meridian_indicator )? )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:225:10: ^( EXPLICIT_TIME hours minutes ( meridian_indicator )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        adaptor.addChild(root_1, stream_hours.nextTree());
                        adaptor.addChild(root_1, stream_minutes.nextTree());
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:225:40: ( meridian_indicator )?
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:227:5: hours ( WHITE_SPACE )? ( meridian_indicator )?
                    {
                    pushFollow(FOLLOW_hours_in_time2064);
                    hours167=hours();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_hours.add(hours167.getTree());
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:227:11: ( WHITE_SPACE )?
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:227:11: WHITE_SPACE
                            {
                            WHITE_SPACE168=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_time2066); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE168);


                            }
                            break;

                    }

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:227:24: ( meridian_indicator )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( ((LA52_0>=AM && LA52_0<=PM)) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:227:24: meridian_indicator
                            {
                            pushFollow(FOLLOW_meridian_indicator_in_time2069);
                            meridian_indicator169=meridian_indicator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_meridian_indicator.add(meridian_indicator169.getTree());

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
                    // 228:7: -> ^( EXPLICIT_TIME hours ^( MINUTES_OF_HOUR INT[\"0\"] ) ( meridian_indicator )? )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:228:10: ^( EXPLICIT_TIME hours ^( MINUTES_OF_HOUR INT[\"0\"] ) ( meridian_indicator )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        adaptor.addChild(root_1, stream_hours.nextTree());
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:228:32: ^( MINUTES_OF_HOUR INT[\"0\"] )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(MINUTES_OF_HOUR, "MINUTES_OF_HOUR"), root_2);

                        adaptor.addChild(root_2, (Object)adaptor.create(INT, "0"));

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:228:60: ( meridian_indicator )?
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:230:5: named_time
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_named_time_in_time2107);
                    named_time170=named_time();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, named_time170.getTree());

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:234:1: hours : int_00_to_23_optional_prefix -> ^( HOURS_OF_DAY int_00_to_23_optional_prefix ) ;
    public final DateParser.hours_return hours() throws RecognitionException {
        DateParser.hours_return retval = new DateParser.hours_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_00_to_23_optional_prefix_return int_00_to_23_optional_prefix171 = null;


        RewriteRuleSubtreeStream stream_int_00_to_23_optional_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_00_to_23_optional_prefix");
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:235:3: ( int_00_to_23_optional_prefix -> ^( HOURS_OF_DAY int_00_to_23_optional_prefix ) )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:235:5: int_00_to_23_optional_prefix
            {
            pushFollow(FOLLOW_int_00_to_23_optional_prefix_in_hours2122);
            int_00_to_23_optional_prefix171=int_00_to_23_optional_prefix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_00_to_23_optional_prefix.add(int_00_to_23_optional_prefix171.getTree());


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
            // 235:34: -> ^( HOURS_OF_DAY int_00_to_23_optional_prefix )
            {
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:235:37: ^( HOURS_OF_DAY int_00_to_23_optional_prefix )
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:239:1: minutes : int_00_to_59_mandatory_prefix -> ^( MINUTES_OF_HOUR int_00_to_59_mandatory_prefix ) ;
    public final DateParser.minutes_return minutes() throws RecognitionException {
        DateParser.minutes_return retval = new DateParser.minutes_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_00_to_59_mandatory_prefix_return int_00_to_59_mandatory_prefix172 = null;


        RewriteRuleSubtreeStream stream_int_00_to_59_mandatory_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_00_to_59_mandatory_prefix");
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:240:3: ( int_00_to_59_mandatory_prefix -> ^( MINUTES_OF_HOUR int_00_to_59_mandatory_prefix ) )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:240:5: int_00_to_59_mandatory_prefix
            {
            pushFollow(FOLLOW_int_00_to_59_mandatory_prefix_in_minutes2146);
            int_00_to_59_mandatory_prefix172=int_00_to_59_mandatory_prefix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_00_to_59_mandatory_prefix.add(int_00_to_59_mandatory_prefix172.getTree());


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
            // 240:35: -> ^( MINUTES_OF_HOUR int_00_to_59_mandatory_prefix )
            {
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:240:38: ^( MINUTES_OF_HOUR int_00_to_59_mandatory_prefix )
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:245:1: meridian_indicator : ( AM -> AM_PM[\"am\"] | PM -> AM_PM[\"pm\"] );
    public final DateParser.meridian_indicator_return meridian_indicator() throws RecognitionException {
        DateParser.meridian_indicator_return retval = new DateParser.meridian_indicator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AM173=null;
        Token PM174=null;

        Object AM173_tree=null;
        Object PM174_tree=null;
        RewriteRuleTokenStream stream_PM=new RewriteRuleTokenStream(adaptor,"token PM");
        RewriteRuleTokenStream stream_AM=new RewriteRuleTokenStream(adaptor,"token AM");

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:3: ( AM -> AM_PM[\"am\"] | PM -> AM_PM[\"pm\"] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:5: AM
                    {
                    AM173=(Token)match(input,AM,FOLLOW_AM_in_meridian_indicator2173); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AM.add(AM173);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 246:8: -> AM_PM[\"am\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(AM_PM, "am"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:247:5: PM
                    {
                    PM174=(Token)match(input,PM,FOLLOW_PM_in_meridian_indicator2184); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PM.add(PM174);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 247:8: -> AM_PM[\"pm\"]
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:250:1: named_time : ( NOON -> ^( EXPLICIT_TIME ^( HOURS_OF_DAY INT[\"12\"] ) ^( MINUTES_OF_HOUR INT[\"0\"] ) AM_PM[\"pm\"] ) | MIDNIGHT -> ^( EXPLICIT_TIME ^( HOURS_OF_DAY INT[\"12\"] ) ^( MINUTES_OF_HOUR INT[\"0\"] ) AM_PM[\"am\"] ) );
    public final DateParser.named_time_return named_time() throws RecognitionException {
        DateParser.named_time_return retval = new DateParser.named_time_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOON175=null;
        Token MIDNIGHT176=null;

        Object NOON175_tree=null;
        Object MIDNIGHT176_tree=null;
        RewriteRuleTokenStream stream_NOON=new RewriteRuleTokenStream(adaptor,"token NOON");
        RewriteRuleTokenStream stream_MIDNIGHT=new RewriteRuleTokenStream(adaptor,"token MIDNIGHT");

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:251:3: ( NOON -> ^( EXPLICIT_TIME ^( HOURS_OF_DAY INT[\"12\"] ) ^( MINUTES_OF_HOUR INT[\"0\"] ) AM_PM[\"pm\"] ) | MIDNIGHT -> ^( EXPLICIT_TIME ^( HOURS_OF_DAY INT[\"12\"] ) ^( MINUTES_OF_HOUR INT[\"0\"] ) AM_PM[\"am\"] ) )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:251:5: NOON
                    {
                    NOON175=(Token)match(input,NOON,FOLLOW_NOON_in_named_time2204); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOON.add(NOON175);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 251:14: -> ^( EXPLICIT_TIME ^( HOURS_OF_DAY INT[\"12\"] ) ^( MINUTES_OF_HOUR INT[\"0\"] ) AM_PM[\"pm\"] )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:251:17: ^( EXPLICIT_TIME ^( HOURS_OF_DAY INT[\"12\"] ) ^( MINUTES_OF_HOUR INT[\"0\"] ) AM_PM[\"pm\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:251:33: ^( HOURS_OF_DAY INT[\"12\"] )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(HOURS_OF_DAY, "HOURS_OF_DAY"), root_2);

                        adaptor.addChild(root_2, (Object)adaptor.create(INT, "12"));

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:251:59: ^( MINUTES_OF_HOUR INT[\"0\"] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:252:5: MIDNIGHT
                    {
                    MIDNIGHT176=(Token)match(input,MIDNIGHT,FOLLOW_MIDNIGHT_in_named_time2237); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MIDNIGHT.add(MIDNIGHT176);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 252:14: -> ^( EXPLICIT_TIME ^( HOURS_OF_DAY INT[\"12\"] ) ^( MINUTES_OF_HOUR INT[\"0\"] ) AM_PM[\"am\"] )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:252:17: ^( EXPLICIT_TIME ^( HOURS_OF_DAY INT[\"12\"] ) ^( MINUTES_OF_HOUR INT[\"0\"] ) AM_PM[\"am\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:252:33: ^( HOURS_OF_DAY INT[\"12\"] )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(HOURS_OF_DAY, "HOURS_OF_DAY"), root_2);

                        adaptor.addChild(root_2, (Object)adaptor.create(INT, "12"));

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:252:59: ^( MINUTES_OF_HOUR INT[\"0\"] )
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:258:1: int_00_to_23_optional_prefix : ( INT_0 | INT_00 | INT_1_TO_9 | INT_01_TO_12 | INT_13_TO_23 ) -> INT[$int_00_to_23_optional_prefix.text] ;
    public final DateParser.int_00_to_23_optional_prefix_return int_00_to_23_optional_prefix() throws RecognitionException {
        DateParser.int_00_to_23_optional_prefix_return retval = new DateParser.int_00_to_23_optional_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT_0177=null;
        Token INT_00178=null;
        Token INT_1_TO_9179=null;
        Token INT_01_TO_12180=null;
        Token INT_13_TO_23181=null;

        Object INT_0177_tree=null;
        Object INT_00178_tree=null;
        Object INT_1_TO_9179_tree=null;
        Object INT_01_TO_12180_tree=null;
        Object INT_13_TO_23181_tree=null;
        RewriteRuleTokenStream stream_INT_13_TO_23=new RewriteRuleTokenStream(adaptor,"token INT_13_TO_23");
        RewriteRuleTokenStream stream_INT_00=new RewriteRuleTokenStream(adaptor,"token INT_00");
        RewriteRuleTokenStream stream_INT_1_TO_9=new RewriteRuleTokenStream(adaptor,"token INT_1_TO_9");
        RewriteRuleTokenStream stream_INT_01_TO_12=new RewriteRuleTokenStream(adaptor,"token INT_01_TO_12");
        RewriteRuleTokenStream stream_INT_0=new RewriteRuleTokenStream(adaptor,"token INT_0");

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:259:3: ( ( INT_0 | INT_00 | INT_1_TO_9 | INT_01_TO_12 | INT_13_TO_23 ) -> INT[$int_00_to_23_optional_prefix.text] )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:259:5: ( INT_0 | INT_00 | INT_1_TO_9 | INT_01_TO_12 | INT_13_TO_23 )
            {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:259:5: ( INT_0 | INT_00 | INT_1_TO_9 | INT_01_TO_12 | INT_13_TO_23 )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:259:6: INT_0
                    {
                    INT_0177=(Token)match(input,INT_0,FOLLOW_INT_0_in_int_00_to_23_optional_prefix2279); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_0.add(INT_0177);


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:260:5: INT_00
                    {
                    INT_00178=(Token)match(input,INT_00,FOLLOW_INT_00_in_int_00_to_23_optional_prefix2285); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_00.add(INT_00178);


                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:5: INT_1_TO_9
                    {
                    INT_1_TO_9179=(Token)match(input,INT_1_TO_9,FOLLOW_INT_1_TO_9_in_int_00_to_23_optional_prefix2291); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_1_TO_9.add(INT_1_TO_9179);


                    }
                    break;
                case 4 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:5: INT_01_TO_12
                    {
                    INT_01_TO_12180=(Token)match(input,INT_01_TO_12,FOLLOW_INT_01_TO_12_in_int_00_to_23_optional_prefix2297); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_01_TO_12.add(INT_01_TO_12180);


                    }
                    break;
                case 5 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:263:5: INT_13_TO_23
                    {
                    INT_13_TO_23181=(Token)match(input,INT_13_TO_23,FOLLOW_INT_13_TO_23_in_int_00_to_23_optional_prefix2303); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_13_TO_23.add(INT_13_TO_23181);


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
            // 263:19: -> INT[$int_00_to_23_optional_prefix.text]
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:267:1: int_00_to_59_mandatory_prefix : ( INT_00 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 | INT_32_TO_59 ) -> INT[$int_00_to_59_mandatory_prefix.text] ;
    public final DateParser.int_00_to_59_mandatory_prefix_return int_00_to_59_mandatory_prefix() throws RecognitionException {
        DateParser.int_00_to_59_mandatory_prefix_return retval = new DateParser.int_00_to_59_mandatory_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT_00182=null;
        Token INT_01_TO_12183=null;
        Token INT_13_TO_23184=null;
        Token INT_24_TO_31185=null;
        Token INT_32_TO_59186=null;

        Object INT_00182_tree=null;
        Object INT_01_TO_12183_tree=null;
        Object INT_13_TO_23184_tree=null;
        Object INT_24_TO_31185_tree=null;
        Object INT_32_TO_59186_tree=null;
        RewriteRuleTokenStream stream_INT_24_TO_31=new RewriteRuleTokenStream(adaptor,"token INT_24_TO_31");
        RewriteRuleTokenStream stream_INT_13_TO_23=new RewriteRuleTokenStream(adaptor,"token INT_13_TO_23");
        RewriteRuleTokenStream stream_INT_00=new RewriteRuleTokenStream(adaptor,"token INT_00");
        RewriteRuleTokenStream stream_INT_32_TO_59=new RewriteRuleTokenStream(adaptor,"token INT_32_TO_59");
        RewriteRuleTokenStream stream_INT_01_TO_12=new RewriteRuleTokenStream(adaptor,"token INT_01_TO_12");

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:268:3: ( ( INT_00 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 | INT_32_TO_59 ) -> INT[$int_00_to_59_mandatory_prefix.text] )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:268:5: ( INT_00 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 | INT_32_TO_59 )
            {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:268:5: ( INT_00 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 | INT_32_TO_59 )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:268:6: INT_00
                    {
                    INT_00182=(Token)match(input,INT_00,FOLLOW_INT_00_in_int_00_to_59_mandatory_prefix2325); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_00.add(INT_00182);


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:269:5: INT_01_TO_12
                    {
                    INT_01_TO_12183=(Token)match(input,INT_01_TO_12,FOLLOW_INT_01_TO_12_in_int_00_to_59_mandatory_prefix2331); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_01_TO_12.add(INT_01_TO_12183);


                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:270:5: INT_13_TO_23
                    {
                    INT_13_TO_23184=(Token)match(input,INT_13_TO_23,FOLLOW_INT_13_TO_23_in_int_00_to_59_mandatory_prefix2337); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_13_TO_23.add(INT_13_TO_23184);


                    }
                    break;
                case 4 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:271:5: INT_24_TO_31
                    {
                    INT_24_TO_31185=(Token)match(input,INT_24_TO_31,FOLLOW_INT_24_TO_31_in_int_00_to_59_mandatory_prefix2343); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_24_TO_31.add(INT_24_TO_31185);


                    }
                    break;
                case 5 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:272:5: INT_32_TO_59
                    {
                    INT_32_TO_59186=(Token)match(input,INT_32_TO_59,FOLLOW_INT_32_TO_59_in_int_00_to_59_mandatory_prefix2349); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_32_TO_59.add(INT_32_TO_59186);


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
            // 272:19: -> INT[$int_00_to_59_mandatory_prefix.text]
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:276:1: int_00_to_99_mandatory_prefix : ( int_00_to_59_mandatory_prefix | INT_60_TO_99 -> INT[$INT_60_TO_99.text] );
    public final DateParser.int_00_to_99_mandatory_prefix_return int_00_to_99_mandatory_prefix() throws RecognitionException {
        DateParser.int_00_to_99_mandatory_prefix_return retval = new DateParser.int_00_to_99_mandatory_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT_60_TO_99188=null;
        DateParser.int_00_to_59_mandatory_prefix_return int_00_to_59_mandatory_prefix187 = null;


        Object INT_60_TO_99188_tree=null;
        RewriteRuleTokenStream stream_INT_60_TO_99=new RewriteRuleTokenStream(adaptor,"token INT_60_TO_99");

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:277:3: ( int_00_to_59_mandatory_prefix | INT_60_TO_99 -> INT[$INT_60_TO_99.text] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:277:5: int_00_to_59_mandatory_prefix
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_int_00_to_59_mandatory_prefix_in_int_00_to_99_mandatory_prefix2371);
                    int_00_to_59_mandatory_prefix187=int_00_to_59_mandatory_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, int_00_to_59_mandatory_prefix187.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:278:5: INT_60_TO_99
                    {
                    INT_60_TO_99188=(Token)match(input,INT_60_TO_99,FOLLOW_INT_60_TO_99_in_int_00_to_99_mandatory_prefix2377); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_60_TO_99.add(INT_60_TO_99188);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 278:18: -> INT[$INT_60_TO_99.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (INT_60_TO_99188!=null?INT_60_TO_99188.getText():null)));

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:282:1: int_01_to_12_optional_prefix : ( INT_1_TO_9 | INT_01_TO_12 ) -> INT[$int_01_to_12_optional_prefix.text] ;
    public final DateParser.int_01_to_12_optional_prefix_return int_01_to_12_optional_prefix() throws RecognitionException {
        DateParser.int_01_to_12_optional_prefix_return retval = new DateParser.int_01_to_12_optional_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT_1_TO_9189=null;
        Token INT_01_TO_12190=null;

        Object INT_1_TO_9189_tree=null;
        Object INT_01_TO_12190_tree=null;
        RewriteRuleTokenStream stream_INT_1_TO_9=new RewriteRuleTokenStream(adaptor,"token INT_1_TO_9");
        RewriteRuleTokenStream stream_INT_01_TO_12=new RewriteRuleTokenStream(adaptor,"token INT_01_TO_12");

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:283:3: ( ( INT_1_TO_9 | INT_01_TO_12 ) -> INT[$int_01_to_12_optional_prefix.text] )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:283:5: ( INT_1_TO_9 | INT_01_TO_12 )
            {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:283:5: ( INT_1_TO_9 | INT_01_TO_12 )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:283:6: INT_1_TO_9
                    {
                    INT_1_TO_9189=(Token)match(input,INT_1_TO_9,FOLLOW_INT_1_TO_9_in_int_01_to_12_optional_prefix2399); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_1_TO_9.add(INT_1_TO_9189);


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:284:5: INT_01_TO_12
                    {
                    INT_01_TO_12190=(Token)match(input,INT_01_TO_12,FOLLOW_INT_01_TO_12_in_int_01_to_12_optional_prefix2405); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_01_TO_12.add(INT_01_TO_12190);


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
            // 284:19: -> INT[$int_01_to_12_optional_prefix.text]
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:288:1: int_01_to_31_optional_prefix : ( INT_1_TO_9 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 ) -> INT[$int_01_to_31_optional_prefix.text] ;
    public final DateParser.int_01_to_31_optional_prefix_return int_01_to_31_optional_prefix() throws RecognitionException {
        DateParser.int_01_to_31_optional_prefix_return retval = new DateParser.int_01_to_31_optional_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT_1_TO_9191=null;
        Token INT_01_TO_12192=null;
        Token INT_13_TO_23193=null;
        Token INT_24_TO_31194=null;

        Object INT_1_TO_9191_tree=null;
        Object INT_01_TO_12192_tree=null;
        Object INT_13_TO_23193_tree=null;
        Object INT_24_TO_31194_tree=null;
        RewriteRuleTokenStream stream_INT_24_TO_31=new RewriteRuleTokenStream(adaptor,"token INT_24_TO_31");
        RewriteRuleTokenStream stream_INT_13_TO_23=new RewriteRuleTokenStream(adaptor,"token INT_13_TO_23");
        RewriteRuleTokenStream stream_INT_1_TO_9=new RewriteRuleTokenStream(adaptor,"token INT_1_TO_9");
        RewriteRuleTokenStream stream_INT_01_TO_12=new RewriteRuleTokenStream(adaptor,"token INT_01_TO_12");

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:289:3: ( ( INT_1_TO_9 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 ) -> INT[$int_01_to_31_optional_prefix.text] )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:289:5: ( INT_1_TO_9 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 )
            {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:289:5: ( INT_1_TO_9 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:289:6: INT_1_TO_9
                    {
                    INT_1_TO_9191=(Token)match(input,INT_1_TO_9,FOLLOW_INT_1_TO_9_in_int_01_to_31_optional_prefix2428); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_1_TO_9.add(INT_1_TO_9191);


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:290:5: INT_01_TO_12
                    {
                    INT_01_TO_12192=(Token)match(input,INT_01_TO_12,FOLLOW_INT_01_TO_12_in_int_01_to_31_optional_prefix2434); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_01_TO_12.add(INT_01_TO_12192);


                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:291:5: INT_13_TO_23
                    {
                    INT_13_TO_23193=(Token)match(input,INT_13_TO_23,FOLLOW_INT_13_TO_23_in_int_01_to_31_optional_prefix2440); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_13_TO_23.add(INT_13_TO_23193);


                    }
                    break;
                case 4 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:292:5: INT_24_TO_31
                    {
                    INT_24_TO_31194=(Token)match(input,INT_24_TO_31,FOLLOW_INT_24_TO_31_in_int_01_to_31_optional_prefix2446); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_24_TO_31.add(INT_24_TO_31194);


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
            // 292:19: -> INT[$int_01_to_31_optional_prefix.text]
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:296:1: int_four_digits : int_00_to_99_mandatory_prefix int_00_to_99_mandatory_prefix -> INT[$int_four_digits.text] ;
    public final DateParser.int_four_digits_return int_four_digits() throws RecognitionException {
        DateParser.int_four_digits_return retval = new DateParser.int_four_digits_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_00_to_99_mandatory_prefix_return int_00_to_99_mandatory_prefix195 = null;

        DateParser.int_00_to_99_mandatory_prefix_return int_00_to_99_mandatory_prefix196 = null;


        RewriteRuleSubtreeStream stream_int_00_to_99_mandatory_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_00_to_99_mandatory_prefix");
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:297:3: ( int_00_to_99_mandatory_prefix int_00_to_99_mandatory_prefix -> INT[$int_four_digits.text] )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:297:5: int_00_to_99_mandatory_prefix int_00_to_99_mandatory_prefix
            {
            pushFollow(FOLLOW_int_00_to_99_mandatory_prefix_in_int_four_digits2468);
            int_00_to_99_mandatory_prefix195=int_00_to_99_mandatory_prefix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_00_to_99_mandatory_prefix.add(int_00_to_99_mandatory_prefix195.getTree());
            pushFollow(FOLLOW_int_00_to_99_mandatory_prefix_in_int_four_digits2470);
            int_00_to_99_mandatory_prefix196=int_00_to_99_mandatory_prefix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_00_to_99_mandatory_prefix.add(int_00_to_99_mandatory_prefix196.getTree());


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 298:7: -> INT[$int_four_digits.text]
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:303:1: spelled_or_int_01_to_31_optional_prefix : ( int_01_to_31_optional_prefix | spelled_one_to_thirty_one );
    public final DateParser.spelled_or_int_01_to_31_optional_prefix_return spelled_or_int_01_to_31_optional_prefix() throws RecognitionException {
        DateParser.spelled_or_int_01_to_31_optional_prefix_return retval = new DateParser.spelled_or_int_01_to_31_optional_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_01_to_31_optional_prefix_return int_01_to_31_optional_prefix197 = null;

        DateParser.spelled_one_to_thirty_one_return spelled_one_to_thirty_one198 = null;



        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:304:3: ( int_01_to_31_optional_prefix | spelled_one_to_thirty_one )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:304:5: int_01_to_31_optional_prefix
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_int_01_to_31_optional_prefix_in_spelled_or_int_01_to_31_optional_prefix2498);
                    int_01_to_31_optional_prefix197=int_01_to_31_optional_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, int_01_to_31_optional_prefix197.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:305:5: spelled_one_to_thirty_one
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_spelled_one_to_thirty_one_in_spelled_or_int_01_to_31_optional_prefix2504);
                    spelled_one_to_thirty_one198=spelled_one_to_thirty_one();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, spelled_one_to_thirty_one198.getTree());

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:309:1: spelled_one_to_thirty_one : ( ONE -> INT[\"1\"] | TWO -> INT[\"2\"] | THREE -> INT[\"3\"] | FOUR -> INT[\"4\"] | FIVE -> INT[\"5\"] | SIX -> INT[\"6\"] | SEVEN -> INT[\"7\"] | EIGHT -> INT[\"8\"] | NINE -> INT[\"9\"] | TEN -> INT[\"10\"] | ELEVEN -> INT[\"11\"] | TWELVE -> INT[\"12\"] | THIRTEEN -> INT[\"13\"] | FOURTEEN -> INT[\"14\"] | FIFTEEN -> INT[\"15\"] | SIXTEEN -> INT[\"16\"] | SEVENTEEN -> INT[\"17\"] | EIGHTEEN -> INT[\"18\"] | NINETEEN -> INT[\"19\"] | TWENTY -> INT[\"20\"] | TWENTY ( DASH | WHITE_SPACE )? ONE -> INT[\"21\"] | TWENTY ( DASH | WHITE_SPACE )? TWO -> INT[\"22\"] | TWENTY ( DASH | WHITE_SPACE )? THREE -> INT[\"23\"] | TWENTY ( DASH | WHITE_SPACE )? FOUR -> INT[\"24\"] | TWENTY ( DASH | WHITE_SPACE )? FIVE -> INT[\"25\"] | TWENTY ( DASH | WHITE_SPACE )? SIX -> INT[\"26\"] | TWENTY ( DASH | WHITE_SPACE )? SEVEN -> INT[\"27\"] | TWENTY ( DASH | WHITE_SPACE )? EIGHT -> INT[\"28\"] | TWENTY ( DASH | WHITE_SPACE )? NINE -> INT[\"29\"] | THIRTY -> INT[\"30\"] | THIRTY ( DASH | WHITE_SPACE )? ONE -> INT[\"31\"] );
    public final DateParser.spelled_one_to_thirty_one_return spelled_one_to_thirty_one() throws RecognitionException {
        DateParser.spelled_one_to_thirty_one_return retval = new DateParser.spelled_one_to_thirty_one_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ONE199=null;
        Token TWO200=null;
        Token THREE201=null;
        Token FOUR202=null;
        Token FIVE203=null;
        Token SIX204=null;
        Token SEVEN205=null;
        Token EIGHT206=null;
        Token NINE207=null;
        Token TEN208=null;
        Token ELEVEN209=null;
        Token TWELVE210=null;
        Token THIRTEEN211=null;
        Token FOURTEEN212=null;
        Token FIFTEEN213=null;
        Token SIXTEEN214=null;
        Token SEVENTEEN215=null;
        Token EIGHTEEN216=null;
        Token NINETEEN217=null;
        Token TWENTY218=null;
        Token TWENTY219=null;
        Token DASH220=null;
        Token WHITE_SPACE221=null;
        Token ONE222=null;
        Token TWENTY223=null;
        Token DASH224=null;
        Token WHITE_SPACE225=null;
        Token TWO226=null;
        Token TWENTY227=null;
        Token DASH228=null;
        Token WHITE_SPACE229=null;
        Token THREE230=null;
        Token TWENTY231=null;
        Token DASH232=null;
        Token WHITE_SPACE233=null;
        Token FOUR234=null;
        Token TWENTY235=null;
        Token DASH236=null;
        Token WHITE_SPACE237=null;
        Token FIVE238=null;
        Token TWENTY239=null;
        Token DASH240=null;
        Token WHITE_SPACE241=null;
        Token SIX242=null;
        Token TWENTY243=null;
        Token DASH244=null;
        Token WHITE_SPACE245=null;
        Token SEVEN246=null;
        Token TWENTY247=null;
        Token DASH248=null;
        Token WHITE_SPACE249=null;
        Token EIGHT250=null;
        Token TWENTY251=null;
        Token DASH252=null;
        Token WHITE_SPACE253=null;
        Token NINE254=null;
        Token THIRTY255=null;
        Token THIRTY256=null;
        Token DASH257=null;
        Token WHITE_SPACE258=null;
        Token ONE259=null;

        Object ONE199_tree=null;
        Object TWO200_tree=null;
        Object THREE201_tree=null;
        Object FOUR202_tree=null;
        Object FIVE203_tree=null;
        Object SIX204_tree=null;
        Object SEVEN205_tree=null;
        Object EIGHT206_tree=null;
        Object NINE207_tree=null;
        Object TEN208_tree=null;
        Object ELEVEN209_tree=null;
        Object TWELVE210_tree=null;
        Object THIRTEEN211_tree=null;
        Object FOURTEEN212_tree=null;
        Object FIFTEEN213_tree=null;
        Object SIXTEEN214_tree=null;
        Object SEVENTEEN215_tree=null;
        Object EIGHTEEN216_tree=null;
        Object NINETEEN217_tree=null;
        Object TWENTY218_tree=null;
        Object TWENTY219_tree=null;
        Object DASH220_tree=null;
        Object WHITE_SPACE221_tree=null;
        Object ONE222_tree=null;
        Object TWENTY223_tree=null;
        Object DASH224_tree=null;
        Object WHITE_SPACE225_tree=null;
        Object TWO226_tree=null;
        Object TWENTY227_tree=null;
        Object DASH228_tree=null;
        Object WHITE_SPACE229_tree=null;
        Object THREE230_tree=null;
        Object TWENTY231_tree=null;
        Object DASH232_tree=null;
        Object WHITE_SPACE233_tree=null;
        Object FOUR234_tree=null;
        Object TWENTY235_tree=null;
        Object DASH236_tree=null;
        Object WHITE_SPACE237_tree=null;
        Object FIVE238_tree=null;
        Object TWENTY239_tree=null;
        Object DASH240_tree=null;
        Object WHITE_SPACE241_tree=null;
        Object SIX242_tree=null;
        Object TWENTY243_tree=null;
        Object DASH244_tree=null;
        Object WHITE_SPACE245_tree=null;
        Object SEVEN246_tree=null;
        Object TWENTY247_tree=null;
        Object DASH248_tree=null;
        Object WHITE_SPACE249_tree=null;
        Object EIGHT250_tree=null;
        Object TWENTY251_tree=null;
        Object DASH252_tree=null;
        Object WHITE_SPACE253_tree=null;
        Object NINE254_tree=null;
        Object THIRTY255_tree=null;
        Object THIRTY256_tree=null;
        Object DASH257_tree=null;
        Object WHITE_SPACE258_tree=null;
        Object ONE259_tree=null;
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
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:310:3: ( ONE -> INT[\"1\"] | TWO -> INT[\"2\"] | THREE -> INT[\"3\"] | FOUR -> INT[\"4\"] | FIVE -> INT[\"5\"] | SIX -> INT[\"6\"] | SEVEN -> INT[\"7\"] | EIGHT -> INT[\"8\"] | NINE -> INT[\"9\"] | TEN -> INT[\"10\"] | ELEVEN -> INT[\"11\"] | TWELVE -> INT[\"12\"] | THIRTEEN -> INT[\"13\"] | FOURTEEN -> INT[\"14\"] | FIFTEEN -> INT[\"15\"] | SIXTEEN -> INT[\"16\"] | SEVENTEEN -> INT[\"17\"] | EIGHTEEN -> INT[\"18\"] | NINETEEN -> INT[\"19\"] | TWENTY -> INT[\"20\"] | TWENTY ( DASH | WHITE_SPACE )? ONE -> INT[\"21\"] | TWENTY ( DASH | WHITE_SPACE )? TWO -> INT[\"22\"] | TWENTY ( DASH | WHITE_SPACE )? THREE -> INT[\"23\"] | TWENTY ( DASH | WHITE_SPACE )? FOUR -> INT[\"24\"] | TWENTY ( DASH | WHITE_SPACE )? FIVE -> INT[\"25\"] | TWENTY ( DASH | WHITE_SPACE )? SIX -> INT[\"26\"] | TWENTY ( DASH | WHITE_SPACE )? SEVEN -> INT[\"27\"] | TWENTY ( DASH | WHITE_SPACE )? EIGHT -> INT[\"28\"] | TWENTY ( DASH | WHITE_SPACE )? NINE -> INT[\"29\"] | THIRTY -> INT[\"30\"] | THIRTY ( DASH | WHITE_SPACE )? ONE -> INT[\"31\"] )
            int alt72=31;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:310:5: ONE
                    {
                    ONE199=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_one_to_thirty_one2520); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE.add(ONE199);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 310:16: -> INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:311:5: TWO
                    {
                    TWO200=(Token)match(input,TWO,FOLLOW_TWO_in_spelled_one_to_thirty_one2538); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO.add(TWO200);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 311:16: -> INT[\"2\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "2"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:312:5: THREE
                    {
                    THREE201=(Token)match(input,THREE,FOLLOW_THREE_in_spelled_one_to_thirty_one2556); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THREE.add(THREE201);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 312:16: -> INT[\"3\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "3"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:313:5: FOUR
                    {
                    FOUR202=(Token)match(input,FOUR,FOLLOW_FOUR_in_spelled_one_to_thirty_one2572); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOUR.add(FOUR202);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 313:16: -> INT[\"4\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "4"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:314:5: FIVE
                    {
                    FIVE203=(Token)match(input,FIVE,FOLLOW_FIVE_in_spelled_one_to_thirty_one2589); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIVE.add(FIVE203);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 314:16: -> INT[\"5\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "5"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:315:5: SIX
                    {
                    SIX204=(Token)match(input,SIX,FOLLOW_SIX_in_spelled_one_to_thirty_one2606); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIX.add(SIX204);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 315:16: -> INT[\"6\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "6"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:316:5: SEVEN
                    {
                    SEVEN205=(Token)match(input,SEVEN,FOLLOW_SEVEN_in_spelled_one_to_thirty_one2624); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVEN.add(SEVEN205);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 316:16: -> INT[\"7\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "7"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:317:5: EIGHT
                    {
                    EIGHT206=(Token)match(input,EIGHT,FOLLOW_EIGHT_in_spelled_one_to_thirty_one2640); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHT.add(EIGHT206);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 317:16: -> INT[\"8\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "8"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:318:5: NINE
                    {
                    NINE207=(Token)match(input,NINE,FOLLOW_NINE_in_spelled_one_to_thirty_one2656); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINE.add(NINE207);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 318:16: -> INT[\"9\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "9"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:319:5: TEN
                    {
                    TEN208=(Token)match(input,TEN,FOLLOW_TEN_in_spelled_one_to_thirty_one2673); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TEN.add(TEN208);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 319:16: -> INT[\"10\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "10"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:320:5: ELEVEN
                    {
                    ELEVEN209=(Token)match(input,ELEVEN,FOLLOW_ELEVEN_in_spelled_one_to_thirty_one2691); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELEVEN.add(ELEVEN209);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 320:16: -> INT[\"11\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "11"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:321:5: TWELVE
                    {
                    TWELVE210=(Token)match(input,TWELVE,FOLLOW_TWELVE_in_spelled_one_to_thirty_one2706); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWELVE.add(TWELVE210);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 321:16: -> INT[\"12\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "12"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:322:5: THIRTEEN
                    {
                    THIRTEEN211=(Token)match(input,THIRTEEN,FOLLOW_THIRTEEN_in_spelled_one_to_thirty_one2721); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEEN.add(THIRTEEN211);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 322:16: -> INT[\"13\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "13"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 14 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:323:5: FOURTEEN
                    {
                    FOURTEEN212=(Token)match(input,FOURTEEN,FOLLOW_FOURTEEN_in_spelled_one_to_thirty_one2734); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOURTEEN.add(FOURTEEN212);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 323:16: -> INT[\"14\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "14"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 15 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:324:5: FIFTEEN
                    {
                    FIFTEEN213=(Token)match(input,FIFTEEN,FOLLOW_FIFTEEN_in_spelled_one_to_thirty_one2747); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIFTEEN.add(FIFTEEN213);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 324:16: -> INT[\"15\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "15"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 16 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:325:5: SIXTEEN
                    {
                    SIXTEEN214=(Token)match(input,SIXTEEN,FOLLOW_SIXTEEN_in_spelled_one_to_thirty_one2761); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTEEN.add(SIXTEEN214);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 325:16: -> INT[\"16\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "16"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 17 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:326:5: SEVENTEEN
                    {
                    SEVENTEEN215=(Token)match(input,SEVENTEEN,FOLLOW_SEVENTEEN_in_spelled_one_to_thirty_one2775); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVENTEEN.add(SEVENTEEN215);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 326:16: -> INT[\"17\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "17"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 18 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:327:5: EIGHTEEN
                    {
                    EIGHTEEN216=(Token)match(input,EIGHTEEN,FOLLOW_EIGHTEEN_in_spelled_one_to_thirty_one2787); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHTEEN.add(EIGHTEEN216);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 327:16: -> INT[\"18\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "18"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 19 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:328:5: NINETEEN
                    {
                    NINETEEN217=(Token)match(input,NINETEEN,FOLLOW_NINETEEN_in_spelled_one_to_thirty_one2800); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINETEEN.add(NINETEEN217);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 328:16: -> INT[\"19\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "19"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 20 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:329:5: TWENTY
                    {
                    TWENTY218=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one2813); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY218);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 329:16: -> INT[\"20\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "20"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 21 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:330:5: TWENTY ( DASH | WHITE_SPACE )? ONE
                    {
                    TWENTY219=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one2828); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY219);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:330:12: ( DASH | WHITE_SPACE )?
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:330:13: DASH
                            {
                            DASH220=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one2831); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH220);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:330:20: WHITE_SPACE
                            {
                            WHITE_SPACE221=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2835); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE221);


                            }
                            break;

                    }

                    ONE222=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_one_to_thirty_one2839); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE.add(ONE222);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 330:40: -> INT[\"21\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "21"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 22 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:331:5: TWENTY ( DASH | WHITE_SPACE )? TWO
                    {
                    TWENTY223=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one2852); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY223);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:331:12: ( DASH | WHITE_SPACE )?
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:331:13: DASH
                            {
                            DASH224=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one2855); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH224);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:331:20: WHITE_SPACE
                            {
                            WHITE_SPACE225=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2859); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE225);


                            }
                            break;

                    }

                    TWO226=(Token)match(input,TWO,FOLLOW_TWO_in_spelled_one_to_thirty_one2863); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO.add(TWO226);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 331:40: -> INT[\"22\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "22"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 23 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:332:5: TWENTY ( DASH | WHITE_SPACE )? THREE
                    {
                    TWENTY227=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one2876); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY227);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:332:12: ( DASH | WHITE_SPACE )?
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:332:13: DASH
                            {
                            DASH228=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one2879); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH228);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:332:20: WHITE_SPACE
                            {
                            WHITE_SPACE229=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2883); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE229);


                            }
                            break;

                    }

                    THREE230=(Token)match(input,THREE,FOLLOW_THREE_in_spelled_one_to_thirty_one2887); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THREE.add(THREE230);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 332:40: -> INT[\"23\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "23"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 24 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:333:5: TWENTY ( DASH | WHITE_SPACE )? FOUR
                    {
                    TWENTY231=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one2898); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY231);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:333:12: ( DASH | WHITE_SPACE )?
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:333:13: DASH
                            {
                            DASH232=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one2901); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH232);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:333:20: WHITE_SPACE
                            {
                            WHITE_SPACE233=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2905); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE233);


                            }
                            break;

                    }

                    FOUR234=(Token)match(input,FOUR,FOLLOW_FOUR_in_spelled_one_to_thirty_one2909); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOUR.add(FOUR234);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 333:40: -> INT[\"24\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "24"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 25 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:334:5: TWENTY ( DASH | WHITE_SPACE )? FIVE
                    {
                    TWENTY235=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one2921); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY235);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:334:12: ( DASH | WHITE_SPACE )?
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:334:13: DASH
                            {
                            DASH236=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one2924); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH236);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:334:20: WHITE_SPACE
                            {
                            WHITE_SPACE237=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2928); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE237);


                            }
                            break;

                    }

                    FIVE238=(Token)match(input,FIVE,FOLLOW_FIVE_in_spelled_one_to_thirty_one2932); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIVE.add(FIVE238);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 334:40: -> INT[\"25\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "25"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 26 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:335:5: TWENTY ( DASH | WHITE_SPACE )? SIX
                    {
                    TWENTY239=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one2944); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY239);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:335:12: ( DASH | WHITE_SPACE )?
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:335:13: DASH
                            {
                            DASH240=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one2947); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH240);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:335:20: WHITE_SPACE
                            {
                            WHITE_SPACE241=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2951); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE241);


                            }
                            break;

                    }

                    SIX242=(Token)match(input,SIX,FOLLOW_SIX_in_spelled_one_to_thirty_one2955); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIX.add(SIX242);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 335:40: -> INT[\"26\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "26"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 27 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:336:5: TWENTY ( DASH | WHITE_SPACE )? SEVEN
                    {
                    TWENTY243=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one2968); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY243);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:336:12: ( DASH | WHITE_SPACE )?
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:336:13: DASH
                            {
                            DASH244=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one2971); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH244);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:336:20: WHITE_SPACE
                            {
                            WHITE_SPACE245=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2975); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE245);


                            }
                            break;

                    }

                    SEVEN246=(Token)match(input,SEVEN,FOLLOW_SEVEN_in_spelled_one_to_thirty_one2979); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVEN.add(SEVEN246);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 336:40: -> INT[\"27\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "27"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 28 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:337:5: TWENTY ( DASH | WHITE_SPACE )? EIGHT
                    {
                    TWENTY247=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one2990); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY247);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:337:12: ( DASH | WHITE_SPACE )?
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:337:13: DASH
                            {
                            DASH248=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one2993); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH248);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:337:20: WHITE_SPACE
                            {
                            WHITE_SPACE249=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2997); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE249);


                            }
                            break;

                    }

                    EIGHT250=(Token)match(input,EIGHT,FOLLOW_EIGHT_in_spelled_one_to_thirty_one3001); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHT.add(EIGHT250);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 337:40: -> INT[\"28\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "28"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 29 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:338:5: TWENTY ( DASH | WHITE_SPACE )? NINE
                    {
                    TWENTY251=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one3012); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY251);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:338:12: ( DASH | WHITE_SPACE )?
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:338:13: DASH
                            {
                            DASH252=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one3015); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH252);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:338:20: WHITE_SPACE
                            {
                            WHITE_SPACE253=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3019); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE253);


                            }
                            break;

                    }

                    NINE254=(Token)match(input,NINE,FOLLOW_NINE_in_spelled_one_to_thirty_one3023); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINE.add(NINE254);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 338:40: -> INT[\"29\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "29"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 30 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:339:5: THIRTY
                    {
                    THIRTY255=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_one_to_thirty_one3035); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY255);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 339:40: -> INT[\"30\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "30"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 31 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:340:5: THIRTY ( DASH | WHITE_SPACE )? ONE
                    {
                    THIRTY256=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_one_to_thirty_one3074); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY256);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:340:12: ( DASH | WHITE_SPACE )?
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:340:13: DASH
                            {
                            DASH257=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one3077); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH257);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:340:20: WHITE_SPACE
                            {
                            WHITE_SPACE258=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3081); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE258);


                            }
                            break;

                    }

                    ONE259=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_one_to_thirty_one3085); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE.add(ONE259);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 340:40: -> INT[\"31\"]
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:344:1: spelled_first_to_thirty_first : ( FIRST -> INT[\"1\"] | SECOND -> INT[\"2\"] | THIRD -> INT[\"3\"] | FOURTH -> INT[\"4\"] | FIFTH -> INT[\"5\"] | SIXTH -> INT[\"6\"] | SEVENTH -> INT[\"7\"] | EIGHTH -> INT[\"8\"] | NINTH -> INT[\"9\"] | TENTH -> INT[\"10\"] | ELEVENTH -> INT[\"11\"] | TWELFTH -> INT[\"12\"] | THIRTEENTH -> INT[\"13\"] | FOURTEENTH -> INT[\"14\"] | FIFTEENTH -> INT[\"15\"] | SIXTEENTH -> INT[\"16\"] | SEVENTEENTH -> INT[\"17\"] | EIGHTEENTH -> INT[\"18\"] | NINETEENTH -> INT[\"19\"] | TWENTIETH -> INT[\"20\"] | ( TWENTY_FIRST | ( TWENTY ( DASH | WHITE_SPACE )? FIRST ) ) -> INT[\"21\"] | ( TWENTY_SECOND | ( TWENTY ( DASH | WHITE_SPACE )? SECOND ) ) -> INT[\"22\"] | ( TWENTY_THIRD | ( TWENTY ( DASH | WHITE_SPACE )? THIRD ) ) -> INT[\"23\"] | ( TWENTY_FOURTH | ( TWENTY ( DASH | WHITE_SPACE )? FOURTH ) ) -> INT[\"24\"] | ( TWENTY_FIFTH | ( TWENTY ( DASH | WHITE_SPACE )? FIFTH ) ) -> INT[\"25\"] | ( TWENTY_SIXTH | ( TWENTY ( DASH | WHITE_SPACE )? SIXTH ) ) -> INT[\"26\"] | ( TWENTY_SEVENTH | ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH ) ) -> INT[\"27\"] | ( TWENTY_EIGHTH | ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH ) ) -> INT[\"28\"] | ( TWENTY_NINTH | ( TWENTY ( DASH | WHITE_SPACE )? NINTH ) ) -> INT[\"29\"] | THIRTIETH -> INT[\"30\"] | ( THIRTY_FIRST | ( THIRTY ( DASH | WHITE_SPACE )? FIRST ) ) -> INT[\"31\"] );
    public final DateParser.spelled_first_to_thirty_first_return spelled_first_to_thirty_first() throws RecognitionException {
        DateParser.spelled_first_to_thirty_first_return retval = new DateParser.spelled_first_to_thirty_first_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FIRST260=null;
        Token SECOND261=null;
        Token THIRD262=null;
        Token FOURTH263=null;
        Token FIFTH264=null;
        Token SIXTH265=null;
        Token SEVENTH266=null;
        Token EIGHTH267=null;
        Token NINTH268=null;
        Token TENTH269=null;
        Token ELEVENTH270=null;
        Token TWELFTH271=null;
        Token THIRTEENTH272=null;
        Token FOURTEENTH273=null;
        Token FIFTEENTH274=null;
        Token SIXTEENTH275=null;
        Token SEVENTEENTH276=null;
        Token EIGHTEENTH277=null;
        Token NINETEENTH278=null;
        Token TWENTIETH279=null;
        Token TWENTY_FIRST280=null;
        Token TWENTY281=null;
        Token DASH282=null;
        Token WHITE_SPACE283=null;
        Token FIRST284=null;
        Token TWENTY_SECOND285=null;
        Token TWENTY286=null;
        Token DASH287=null;
        Token WHITE_SPACE288=null;
        Token SECOND289=null;
        Token TWENTY_THIRD290=null;
        Token TWENTY291=null;
        Token DASH292=null;
        Token WHITE_SPACE293=null;
        Token THIRD294=null;
        Token TWENTY_FOURTH295=null;
        Token TWENTY296=null;
        Token DASH297=null;
        Token WHITE_SPACE298=null;
        Token FOURTH299=null;
        Token TWENTY_FIFTH300=null;
        Token TWENTY301=null;
        Token DASH302=null;
        Token WHITE_SPACE303=null;
        Token FIFTH304=null;
        Token TWENTY_SIXTH305=null;
        Token TWENTY306=null;
        Token DASH307=null;
        Token WHITE_SPACE308=null;
        Token SIXTH309=null;
        Token TWENTY_SEVENTH310=null;
        Token TWENTY311=null;
        Token DASH312=null;
        Token WHITE_SPACE313=null;
        Token SEVENTH314=null;
        Token TWENTY_EIGHTH315=null;
        Token TWENTY316=null;
        Token DASH317=null;
        Token WHITE_SPACE318=null;
        Token EIGHTH319=null;
        Token TWENTY_NINTH320=null;
        Token TWENTY321=null;
        Token DASH322=null;
        Token WHITE_SPACE323=null;
        Token NINTH324=null;
        Token THIRTIETH325=null;
        Token THIRTY_FIRST326=null;
        Token THIRTY327=null;
        Token DASH328=null;
        Token WHITE_SPACE329=null;
        Token FIRST330=null;

        Object FIRST260_tree=null;
        Object SECOND261_tree=null;
        Object THIRD262_tree=null;
        Object FOURTH263_tree=null;
        Object FIFTH264_tree=null;
        Object SIXTH265_tree=null;
        Object SEVENTH266_tree=null;
        Object EIGHTH267_tree=null;
        Object NINTH268_tree=null;
        Object TENTH269_tree=null;
        Object ELEVENTH270_tree=null;
        Object TWELFTH271_tree=null;
        Object THIRTEENTH272_tree=null;
        Object FOURTEENTH273_tree=null;
        Object FIFTEENTH274_tree=null;
        Object SIXTEENTH275_tree=null;
        Object SEVENTEENTH276_tree=null;
        Object EIGHTEENTH277_tree=null;
        Object NINETEENTH278_tree=null;
        Object TWENTIETH279_tree=null;
        Object TWENTY_FIRST280_tree=null;
        Object TWENTY281_tree=null;
        Object DASH282_tree=null;
        Object WHITE_SPACE283_tree=null;
        Object FIRST284_tree=null;
        Object TWENTY_SECOND285_tree=null;
        Object TWENTY286_tree=null;
        Object DASH287_tree=null;
        Object WHITE_SPACE288_tree=null;
        Object SECOND289_tree=null;
        Object TWENTY_THIRD290_tree=null;
        Object TWENTY291_tree=null;
        Object DASH292_tree=null;
        Object WHITE_SPACE293_tree=null;
        Object THIRD294_tree=null;
        Object TWENTY_FOURTH295_tree=null;
        Object TWENTY296_tree=null;
        Object DASH297_tree=null;
        Object WHITE_SPACE298_tree=null;
        Object FOURTH299_tree=null;
        Object TWENTY_FIFTH300_tree=null;
        Object TWENTY301_tree=null;
        Object DASH302_tree=null;
        Object WHITE_SPACE303_tree=null;
        Object FIFTH304_tree=null;
        Object TWENTY_SIXTH305_tree=null;
        Object TWENTY306_tree=null;
        Object DASH307_tree=null;
        Object WHITE_SPACE308_tree=null;
        Object SIXTH309_tree=null;
        Object TWENTY_SEVENTH310_tree=null;
        Object TWENTY311_tree=null;
        Object DASH312_tree=null;
        Object WHITE_SPACE313_tree=null;
        Object SEVENTH314_tree=null;
        Object TWENTY_EIGHTH315_tree=null;
        Object TWENTY316_tree=null;
        Object DASH317_tree=null;
        Object WHITE_SPACE318_tree=null;
        Object EIGHTH319_tree=null;
        Object TWENTY_NINTH320_tree=null;
        Object TWENTY321_tree=null;
        Object DASH322_tree=null;
        Object WHITE_SPACE323_tree=null;
        Object NINTH324_tree=null;
        Object THIRTIETH325_tree=null;
        Object THIRTY_FIRST326_tree=null;
        Object THIRTY327_tree=null;
        Object DASH328_tree=null;
        Object WHITE_SPACE329_tree=null;
        Object FIRST330_tree=null;
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
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:345:3: ( FIRST -> INT[\"1\"] | SECOND -> INT[\"2\"] | THIRD -> INT[\"3\"] | FOURTH -> INT[\"4\"] | FIFTH -> INT[\"5\"] | SIXTH -> INT[\"6\"] | SEVENTH -> INT[\"7\"] | EIGHTH -> INT[\"8\"] | NINTH -> INT[\"9\"] | TENTH -> INT[\"10\"] | ELEVENTH -> INT[\"11\"] | TWELFTH -> INT[\"12\"] | THIRTEENTH -> INT[\"13\"] | FOURTEENTH -> INT[\"14\"] | FIFTEENTH -> INT[\"15\"] | SIXTEENTH -> INT[\"16\"] | SEVENTEENTH -> INT[\"17\"] | EIGHTEENTH -> INT[\"18\"] | NINETEENTH -> INT[\"19\"] | TWENTIETH -> INT[\"20\"] | ( TWENTY_FIRST | ( TWENTY ( DASH | WHITE_SPACE )? FIRST ) ) -> INT[\"21\"] | ( TWENTY_SECOND | ( TWENTY ( DASH | WHITE_SPACE )? SECOND ) ) -> INT[\"22\"] | ( TWENTY_THIRD | ( TWENTY ( DASH | WHITE_SPACE )? THIRD ) ) -> INT[\"23\"] | ( TWENTY_FOURTH | ( TWENTY ( DASH | WHITE_SPACE )? FOURTH ) ) -> INT[\"24\"] | ( TWENTY_FIFTH | ( TWENTY ( DASH | WHITE_SPACE )? FIFTH ) ) -> INT[\"25\"] | ( TWENTY_SIXTH | ( TWENTY ( DASH | WHITE_SPACE )? SIXTH ) ) -> INT[\"26\"] | ( TWENTY_SEVENTH | ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH ) ) -> INT[\"27\"] | ( TWENTY_EIGHTH | ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH ) ) -> INT[\"28\"] | ( TWENTY_NINTH | ( TWENTY ( DASH | WHITE_SPACE )? NINTH ) ) -> INT[\"29\"] | THIRTIETH -> INT[\"30\"] | ( THIRTY_FIRST | ( THIRTY ( DASH | WHITE_SPACE )? FIRST ) ) -> INT[\"31\"] )
            int alt93=31;
            alt93 = dfa93.predict(input);
            switch (alt93) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:345:5: FIRST
                    {
                    FIRST260=(Token)match(input,FIRST,FOLLOW_FIRST_in_spelled_first_to_thirty_first3108); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIRST.add(FIRST260);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 345:17: -> INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:346:5: SECOND
                    {
                    SECOND261=(Token)match(input,SECOND,FOLLOW_SECOND_in_spelled_first_to_thirty_first3125); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SECOND.add(SECOND261);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 346:17: -> INT[\"2\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "2"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:347:5: THIRD
                    {
                    THIRD262=(Token)match(input,THIRD,FOLLOW_THIRD_in_spelled_first_to_thirty_first3141); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRD.add(THIRD262);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 347:17: -> INT[\"3\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "3"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:348:5: FOURTH
                    {
                    FOURTH263=(Token)match(input,FOURTH,FOLLOW_FOURTH_in_spelled_first_to_thirty_first3158); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOURTH.add(FOURTH263);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 348:17: -> INT[\"4\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "4"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:349:5: FIFTH
                    {
                    FIFTH264=(Token)match(input,FIFTH,FOLLOW_FIFTH_in_spelled_first_to_thirty_first3174); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIFTH.add(FIFTH264);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 349:17: -> INT[\"5\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "5"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:350:5: SIXTH
                    {
                    SIXTH265=(Token)match(input,SIXTH,FOLLOW_SIXTH_in_spelled_first_to_thirty_first3191); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTH.add(SIXTH265);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 350:17: -> INT[\"6\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "6"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:351:5: SEVENTH
                    {
                    SEVENTH266=(Token)match(input,SEVENTH,FOLLOW_SEVENTH_in_spelled_first_to_thirty_first3208); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVENTH.add(SEVENTH266);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 351:17: -> INT[\"7\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "7"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:352:5: EIGHTH
                    {
                    EIGHTH267=(Token)match(input,EIGHTH,FOLLOW_EIGHTH_in_spelled_first_to_thirty_first3223); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHTH.add(EIGHTH267);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 352:17: -> INT[\"8\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "8"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:353:5: NINTH
                    {
                    NINTH268=(Token)match(input,NINTH,FOLLOW_NINTH_in_spelled_first_to_thirty_first3239); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINTH.add(NINTH268);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 353:17: -> INT[\"9\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "9"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:354:5: TENTH
                    {
                    TENTH269=(Token)match(input,TENTH,FOLLOW_TENTH_in_spelled_first_to_thirty_first3256); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TENTH.add(TENTH269);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 354:17: -> INT[\"10\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "10"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:355:5: ELEVENTH
                    {
                    ELEVENTH270=(Token)match(input,ELEVENTH,FOLLOW_ELEVENTH_in_spelled_first_to_thirty_first3273); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELEVENTH.add(ELEVENTH270);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 355:17: -> INT[\"11\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "11"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:356:5: TWELFTH
                    {
                    TWELFTH271=(Token)match(input,TWELFTH,FOLLOW_TWELFTH_in_spelled_first_to_thirty_first3287); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWELFTH.add(TWELFTH271);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 356:17: -> INT[\"12\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "12"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:357:5: THIRTEENTH
                    {
                    THIRTEENTH272=(Token)match(input,THIRTEENTH,FOLLOW_THIRTEENTH_in_spelled_first_to_thirty_first3302); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEENTH.add(THIRTEENTH272);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 357:17: -> INT[\"13\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "13"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 14 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:358:5: FOURTEENTH
                    {
                    FOURTEENTH273=(Token)match(input,FOURTEENTH,FOLLOW_FOURTEENTH_in_spelled_first_to_thirty_first3314); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOURTEENTH.add(FOURTEENTH273);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 358:17: -> INT[\"14\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "14"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 15 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:359:5: FIFTEENTH
                    {
                    FIFTEENTH274=(Token)match(input,FIFTEENTH,FOLLOW_FIFTEENTH_in_spelled_first_to_thirty_first3326); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIFTEENTH.add(FIFTEENTH274);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 359:17: -> INT[\"15\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "15"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 16 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:360:5: SIXTEENTH
                    {
                    SIXTEENTH275=(Token)match(input,SIXTEENTH,FOLLOW_SIXTEENTH_in_spelled_first_to_thirty_first3339); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTEENTH.add(SIXTEENTH275);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 360:17: -> INT[\"16\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "16"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 17 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:361:5: SEVENTEENTH
                    {
                    SEVENTEENTH276=(Token)match(input,SEVENTEENTH,FOLLOW_SEVENTEENTH_in_spelled_first_to_thirty_first3352); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVENTEENTH.add(SEVENTEENTH276);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 361:17: -> INT[\"17\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "17"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 18 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:362:5: EIGHTEENTH
                    {
                    EIGHTEENTH277=(Token)match(input,EIGHTEENTH,FOLLOW_EIGHTEENTH_in_spelled_first_to_thirty_first3363); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHTEENTH.add(EIGHTEENTH277);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 362:17: -> INT[\"18\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "18"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 19 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:363:5: NINETEENTH
                    {
                    NINETEENTH278=(Token)match(input,NINETEENTH,FOLLOW_NINETEENTH_in_spelled_first_to_thirty_first3375); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINETEENTH.add(NINETEENTH278);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 363:17: -> INT[\"19\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "19"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 20 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:364:5: TWENTIETH
                    {
                    TWENTIETH279=(Token)match(input,TWENTIETH,FOLLOW_TWENTIETH_in_spelled_first_to_thirty_first3387); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTIETH.add(TWENTIETH279);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 364:17: -> INT[\"20\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "20"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 21 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:365:5: ( TWENTY_FIRST | ( TWENTY ( DASH | WHITE_SPACE )? FIRST ) )
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:365:5: ( TWENTY_FIRST | ( TWENTY ( DASH | WHITE_SPACE )? FIRST ) )
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:365:6: TWENTY_FIRST
                            {
                            TWENTY_FIRST280=(Token)match(input,TWENTY_FIRST,FOLLOW_TWENTY_FIRST_in_spelled_first_to_thirty_first3401); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_FIRST.add(TWENTY_FIRST280);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:365:23: ( TWENTY ( DASH | WHITE_SPACE )? FIRST )
                            {
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:365:23: ( TWENTY ( DASH | WHITE_SPACE )? FIRST )
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:365:24: TWENTY ( DASH | WHITE_SPACE )? FIRST
                            {
                            TWENTY281=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3408); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY281);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:365:31: ( DASH | WHITE_SPACE )?
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
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:365:32: DASH
                                    {
                                    DASH282=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3411); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH282);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:365:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE283=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3415); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE283);


                                    }
                                    break;

                            }

                            FIRST284=(Token)match(input,FIRST,FOLLOW_FIRST_in_spelled_first_to_thirty_first3419); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FIRST.add(FIRST284);


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
                    // 365:63: -> INT[\"21\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "21"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 22 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:366:5: ( TWENTY_SECOND | ( TWENTY ( DASH | WHITE_SPACE )? SECOND ) )
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:366:5: ( TWENTY_SECOND | ( TWENTY ( DASH | WHITE_SPACE )? SECOND ) )
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:366:6: TWENTY_SECOND
                            {
                            TWENTY_SECOND285=(Token)match(input,TWENTY_SECOND,FOLLOW_TWENTY_SECOND_in_spelled_first_to_thirty_first3435); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_SECOND.add(TWENTY_SECOND285);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:366:23: ( TWENTY ( DASH | WHITE_SPACE )? SECOND )
                            {
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:366:23: ( TWENTY ( DASH | WHITE_SPACE )? SECOND )
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:366:24: TWENTY ( DASH | WHITE_SPACE )? SECOND
                            {
                            TWENTY286=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3441); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY286);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:366:31: ( DASH | WHITE_SPACE )?
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
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:366:32: DASH
                                    {
                                    DASH287=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3444); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH287);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:366:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE288=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3448); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE288);


                                    }
                                    break;

                            }

                            SECOND289=(Token)match(input,SECOND,FOLLOW_SECOND_in_spelled_first_to_thirty_first3452); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SECOND.add(SECOND289);


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
                    // 366:63: -> INT[\"22\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "22"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 23 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:367:5: ( TWENTY_THIRD | ( TWENTY ( DASH | WHITE_SPACE )? THIRD ) )
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:367:5: ( TWENTY_THIRD | ( TWENTY ( DASH | WHITE_SPACE )? THIRD ) )
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:367:6: TWENTY_THIRD
                            {
                            TWENTY_THIRD290=(Token)match(input,TWENTY_THIRD,FOLLOW_TWENTY_THIRD_in_spelled_first_to_thirty_first3467); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_THIRD.add(TWENTY_THIRD290);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:367:23: ( TWENTY ( DASH | WHITE_SPACE )? THIRD )
                            {
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:367:23: ( TWENTY ( DASH | WHITE_SPACE )? THIRD )
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:367:24: TWENTY ( DASH | WHITE_SPACE )? THIRD
                            {
                            TWENTY291=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3474); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY291);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:367:31: ( DASH | WHITE_SPACE )?
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
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:367:32: DASH
                                    {
                                    DASH292=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3477); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH292);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:367:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE293=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3481); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE293);


                                    }
                                    break;

                            }

                            THIRD294=(Token)match(input,THIRD,FOLLOW_THIRD_in_spelled_first_to_thirty_first3485); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIRD.add(THIRD294);


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
                    // 367:63: -> INT[\"23\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "23"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 24 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:368:5: ( TWENTY_FOURTH | ( TWENTY ( DASH | WHITE_SPACE )? FOURTH ) )
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:368:5: ( TWENTY_FOURTH | ( TWENTY ( DASH | WHITE_SPACE )? FOURTH ) )
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:368:6: TWENTY_FOURTH
                            {
                            TWENTY_FOURTH295=(Token)match(input,TWENTY_FOURTH,FOLLOW_TWENTY_FOURTH_in_spelled_first_to_thirty_first3501); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_FOURTH.add(TWENTY_FOURTH295);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:368:23: ( TWENTY ( DASH | WHITE_SPACE )? FOURTH )
                            {
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:368:23: ( TWENTY ( DASH | WHITE_SPACE )? FOURTH )
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:368:24: TWENTY ( DASH | WHITE_SPACE )? FOURTH
                            {
                            TWENTY296=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3507); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY296);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:368:31: ( DASH | WHITE_SPACE )?
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
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:368:32: DASH
                                    {
                                    DASH297=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3510); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH297);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:368:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE298=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3514); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE298);


                                    }
                                    break;

                            }

                            FOURTH299=(Token)match(input,FOURTH,FOLLOW_FOURTH_in_spelled_first_to_thirty_first3518); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FOURTH.add(FOURTH299);


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
                    // 368:63: -> INT[\"24\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "24"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 25 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:369:5: ( TWENTY_FIFTH | ( TWENTY ( DASH | WHITE_SPACE )? FIFTH ) )
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:369:5: ( TWENTY_FIFTH | ( TWENTY ( DASH | WHITE_SPACE )? FIFTH ) )
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:369:6: TWENTY_FIFTH
                            {
                            TWENTY_FIFTH300=(Token)match(input,TWENTY_FIFTH,FOLLOW_TWENTY_FIFTH_in_spelled_first_to_thirty_first3533); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_FIFTH.add(TWENTY_FIFTH300);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:369:23: ( TWENTY ( DASH | WHITE_SPACE )? FIFTH )
                            {
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:369:23: ( TWENTY ( DASH | WHITE_SPACE )? FIFTH )
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:369:24: TWENTY ( DASH | WHITE_SPACE )? FIFTH
                            {
                            TWENTY301=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3540); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY301);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:369:31: ( DASH | WHITE_SPACE )?
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
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:369:32: DASH
                                    {
                                    DASH302=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3543); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH302);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:369:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE303=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3547); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE303);


                                    }
                                    break;

                            }

                            FIFTH304=(Token)match(input,FIFTH,FOLLOW_FIFTH_in_spelled_first_to_thirty_first3551); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FIFTH.add(FIFTH304);


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
                    // 369:63: -> INT[\"25\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "25"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 26 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:370:5: ( TWENTY_SIXTH | ( TWENTY ( DASH | WHITE_SPACE )? SIXTH ) )
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:370:5: ( TWENTY_SIXTH | ( TWENTY ( DASH | WHITE_SPACE )? SIXTH ) )
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:370:6: TWENTY_SIXTH
                            {
                            TWENTY_SIXTH305=(Token)match(input,TWENTY_SIXTH,FOLLOW_TWENTY_SIXTH_in_spelled_first_to_thirty_first3567); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_SIXTH.add(TWENTY_SIXTH305);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:370:23: ( TWENTY ( DASH | WHITE_SPACE )? SIXTH )
                            {
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:370:23: ( TWENTY ( DASH | WHITE_SPACE )? SIXTH )
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:370:24: TWENTY ( DASH | WHITE_SPACE )? SIXTH
                            {
                            TWENTY306=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3574); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY306);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:370:31: ( DASH | WHITE_SPACE )?
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
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:370:32: DASH
                                    {
                                    DASH307=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3577); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH307);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:370:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE308=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3581); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE308);


                                    }
                                    break;

                            }

                            SIXTH309=(Token)match(input,SIXTH,FOLLOW_SIXTH_in_spelled_first_to_thirty_first3585); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SIXTH.add(SIXTH309);


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
                    // 370:63: -> INT[\"26\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "26"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 27 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:371:5: ( TWENTY_SEVENTH | ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH ) )
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:371:5: ( TWENTY_SEVENTH | ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH ) )
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:371:6: TWENTY_SEVENTH
                            {
                            TWENTY_SEVENTH310=(Token)match(input,TWENTY_SEVENTH,FOLLOW_TWENTY_SEVENTH_in_spelled_first_to_thirty_first3601); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_SEVENTH.add(TWENTY_SEVENTH310);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:371:23: ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH )
                            {
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:371:23: ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH )
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:371:24: TWENTY ( DASH | WHITE_SPACE )? SEVENTH
                            {
                            TWENTY311=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3606); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY311);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:371:31: ( DASH | WHITE_SPACE )?
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
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:371:32: DASH
                                    {
                                    DASH312=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3609); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH312);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:371:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE313=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3613); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE313);


                                    }
                                    break;

                            }

                            SEVENTH314=(Token)match(input,SEVENTH,FOLLOW_SEVENTH_in_spelled_first_to_thirty_first3617); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SEVENTH.add(SEVENTH314);


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
                    // 371:63: -> INT[\"27\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "27"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 28 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:372:5: ( TWENTY_EIGHTH | ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH ) )
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:372:5: ( TWENTY_EIGHTH | ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH ) )
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:372:6: TWENTY_EIGHTH
                            {
                            TWENTY_EIGHTH315=(Token)match(input,TWENTY_EIGHTH,FOLLOW_TWENTY_EIGHTH_in_spelled_first_to_thirty_first3631); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_EIGHTH.add(TWENTY_EIGHTH315);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:372:23: ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH )
                            {
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:372:23: ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH )
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:372:24: TWENTY ( DASH | WHITE_SPACE )? EIGHTH
                            {
                            TWENTY316=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3637); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY316);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:372:31: ( DASH | WHITE_SPACE )?
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
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:372:32: DASH
                                    {
                                    DASH317=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3640); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH317);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:372:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE318=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3644); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE318);


                                    }
                                    break;

                            }

                            EIGHTH319=(Token)match(input,EIGHTH,FOLLOW_EIGHTH_in_spelled_first_to_thirty_first3648); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EIGHTH.add(EIGHTH319);


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
                    // 372:63: -> INT[\"28\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "28"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 29 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:373:5: ( TWENTY_NINTH | ( TWENTY ( DASH | WHITE_SPACE )? NINTH ) )
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:373:5: ( TWENTY_NINTH | ( TWENTY ( DASH | WHITE_SPACE )? NINTH ) )
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:373:6: TWENTY_NINTH
                            {
                            TWENTY_NINTH320=(Token)match(input,TWENTY_NINTH,FOLLOW_TWENTY_NINTH_in_spelled_first_to_thirty_first3663); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_NINTH.add(TWENTY_NINTH320);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:373:23: ( TWENTY ( DASH | WHITE_SPACE )? NINTH )
                            {
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:373:23: ( TWENTY ( DASH | WHITE_SPACE )? NINTH )
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:373:24: TWENTY ( DASH | WHITE_SPACE )? NINTH
                            {
                            TWENTY321=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3670); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY321);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:373:31: ( DASH | WHITE_SPACE )?
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
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:373:32: DASH
                                    {
                                    DASH322=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3673); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH322);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:373:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE323=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3677); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE323);


                                    }
                                    break;

                            }

                            NINTH324=(Token)match(input,NINTH,FOLLOW_NINTH_in_spelled_first_to_thirty_first3681); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NINTH.add(NINTH324);


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
                    // 373:63: -> INT[\"29\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "29"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 30 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:374:5: THIRTIETH
                    {
                    THIRTIETH325=(Token)match(input,THIRTIETH,FOLLOW_THIRTIETH_in_spelled_first_to_thirty_first3696); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTIETH.add(THIRTIETH325);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 374:63: -> INT[\"30\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "30"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 31 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:375:5: ( THIRTY_FIRST | ( THIRTY ( DASH | WHITE_SPACE )? FIRST ) )
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:375:5: ( THIRTY_FIRST | ( THIRTY ( DASH | WHITE_SPACE )? FIRST ) )
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:375:6: THIRTY_FIRST
                            {
                            THIRTY_FIRST326=(Token)match(input,THIRTY_FIRST,FOLLOW_THIRTY_FIRST_in_spelled_first_to_thirty_first3756); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIRTY_FIRST.add(THIRTY_FIRST326);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:375:23: ( THIRTY ( DASH | WHITE_SPACE )? FIRST )
                            {
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:375:23: ( THIRTY ( DASH | WHITE_SPACE )? FIRST )
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:375:24: THIRTY ( DASH | WHITE_SPACE )? FIRST
                            {
                            THIRTY327=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_first_to_thirty_first3763); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY327);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:375:31: ( DASH | WHITE_SPACE )?
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
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:375:32: DASH
                                    {
                                    DASH328=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3766); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH328);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:375:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE329=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3770); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE329);


                                    }
                                    break;

                            }

                            FIRST330=(Token)match(input,FIRST,FOLLOW_FIRST_in_spelled_first_to_thirty_first3774); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FIRST.add(FIRST330);


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
                    // 375:63: -> INT[\"31\"]
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
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:31:7: ( date ( date_time_separator time )? )
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:31:8: date ( date_time_separator time )?
        {
        pushFollow(FOLLOW_date_in_synpred1_Date139);
        date();

        state._fsp--;
        if (state.failed) return ;
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:31:13: ( date_time_separator time )?
        int alt94=2;
        int LA94_0 = input.LA(1);

        if ( (LA94_0==WHITE_SPACE||LA94_0==COMMA) ) {
            alt94=1;
        }
        switch (alt94) {
            case 1 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:31:14: date_time_separator time
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
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:49:5: ( relaxed_date )
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:49:6: relaxed_date
        {
        pushFollow(FOLLOW_relaxed_date_in_synpred2_Date297);
        relaxed_date();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Date

    // $ANTLR start synpred3_Date
    public final void synpred3_Date_fragment() throws RecognitionException {   
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:72:7: ( ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year )
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:72:8: ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year
        {
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:72:8: ( THE WHITE_SPACE )?
        int alt95=2;
        int LA95_0 = input.LA(1);

        if ( (LA95_0==THE) ) {
            alt95=1;
        }
        switch (alt95) {
            case 1 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:72:9: THE WHITE_SPACE
                {
                match(input,THE,FOLLOW_THE_in_synpred3_Date480); if (state.failed) return ;
                match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred3_Date482); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_relaxed_day_of_month_in_synpred3_Date486);
        relaxed_day_of_month();

        state._fsp--;
        if (state.failed) return ;
        match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred3_Date488); if (state.failed) return ;
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:72:60: ( OF WHITE_SPACE )?
        int alt96=2;
        int LA96_0 = input.LA(1);

        if ( (LA96_0==OF) ) {
            alt96=1;
        }
        switch (alt96) {
            case 1 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:72:61: OF WHITE_SPACE
                {
                match(input,OF,FOLLOW_OF_in_synpred3_Date491); if (state.failed) return ;
                match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred3_Date493); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_relaxed_month_in_synpred3_Date497);
        relaxed_month();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_relaxed_year_in_synpred3_Date499);
        relaxed_year();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_Date

    // $ANTLR start synpred4_Date
    public final void synpred4_Date_fragment() throws RecognitionException {   
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:75:9: ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year )
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:75:10: relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year
        {
        pushFollow(FOLLOW_relaxed_month_in_synpred4_Date547);
        relaxed_month();

        state._fsp--;
        if (state.failed) return ;
        match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred4_Date549); if (state.failed) return ;
        pushFollow(FOLLOW_relaxed_day_of_month_in_synpred4_Date551);
        relaxed_day_of_month();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_relaxed_year_in_synpred4_Date553);
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
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA93 dfa93 = new DFA93(this);
    static final String DFA3_eotS =
        "\u0080\uffff";
    static final String DFA3_eofS =
        "\2\uffff\3\136\101\uffff\1\136\31\uffff\6\136\32\uffff";
    static final String DFA3_minS =
        "\1\30\1\uffff\3\24\101\uffff\1\24\31\uffff\6\24\1\uffff\27\0\2\uffff";
    static final String DFA3_maxS =
        "\1\u0085\1\uffff\1\120\2\121\101\uffff\1\121\31\uffff\1\u0085\5"+
        "\107\1\uffff\27\0\2\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\3\uffff\101\1\1\uffff\27\1\1\2\1\1\6\uffff\1\1\27\uffff"+
        "\2\1";
    static final String DFA3_specialS =
        "\1\23\1\uffff\1\1\1\24\1\11\101\uffff\1\22\31\uffff\1\13\1\36\1"+
        "\35\1\32\1\31\1\26\1\uffff\1\14\1\20\1\16\1\4\1\10\1\0\1\2\1\40"+
        "\1\41\1\25\1\34\1\37\1\3\1\5\1\6\1\7\1\12\1\33\1\27\1\30\1\15\1"+
        "\21\1\17\2\uffff}>";
    static final String[] DFA3_transitionS = {
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
            "\1\140\1\uffff\1\136\25\uffff\2\137\25\uffff\1\136\2\uffff"+
            "\2\136\3\uffff\1\136\1\uffff\4\136",
            "\1\140\1\uffff\1\136\25\uffff\2\137\25\uffff\1\136\2\uffff"+
            "\2\136\3\uffff\1\141\1\uffff\1\142\1\143\1\144\1\145\1\146",
            "\1\140\1\uffff\1\136\54\uffff\1\136\2\uffff\2\136\3\uffff\1"+
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\136\1\uffff\1\136\54\uffff\1\136\2\uffff\2\136\3\uffff\1"+
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
            "",
            "\1\136\1\uffff\3\136\1\172\2\uffff\1\176\1\147\1\150\1\151"+
            "\1\152\1\153\1\154\1\155\1\156\1\157\1\160\1\161\1\162\1\uffff"+
            "\1\136\1\175\2\uffff\6\136\3\uffff\1\173\1\174\1\163\1\164\1"+
            "\165\1\166\1\167\1\170\1\171\3\136\3\uffff\2\136\3\uffff\73"+
            "\136",
            "\1\136\1\uffff\1\136\25\uffff\2\177\26\uffff\4\136",
            "\1\136\1\uffff\1\136\25\uffff\2\177\26\uffff\4\136",
            "\1\136\1\uffff\1\136\25\uffff\2\177\26\uffff\4\136",
            "\1\136\1\uffff\1\136\25\uffff\2\177\26\uffff\4\136",
            "\1\136\1\uffff\1\136\25\uffff\2\177\26\uffff\4\136",
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
            return "30:5: ( ( date ( date_time_separator time )? )=> date ( date_time_separator time )? | time ( time_date_separator date )? )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_108 = input.LA(1);

                         
                        int index3_108 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index3_108);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_2 = input.LA(1);

                         
                        int index3_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA3_2>=DASH && LA3_2<=SLASH)) && (synpred1_Date())) {s = 95;}

                        else if ( (LA3_2==WHITE_SPACE) ) {s = 96;}

                        else if ( (LA3_2==EOF||LA3_2==COMMA||LA3_2==COLON||(LA3_2>=AM && LA3_2<=PM)||LA3_2==INT_00||(LA3_2>=INT_01_TO_12 && LA3_2<=INT_32_TO_59)) ) {s = 94;}

                         
                        input.seek(index3_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA3_109 = input.LA(1);

                         
                        int index3_109 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index3_109);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA3_115 = input.LA(1);

                         
                        int index3_115 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index3_115);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA3_106 = input.LA(1);

                         
                        int index3_106 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index3_106);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA3_116 = input.LA(1);

                         
                        int index3_116 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index3_116);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA3_117 = input.LA(1);

                         
                        int index3_117 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index3_117);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA3_118 = input.LA(1);

                         
                        int index3_118 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index3_118);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA3_107 = input.LA(1);

                         
                        int index3_107 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index3_107);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA3_4 = input.LA(1);

                         
                        int index3_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_4==EOF||LA3_4==COMMA||LA3_4==COLON||(LA3_4>=AM && LA3_4<=PM)) ) {s = 94;}

                        else if ( (LA3_4==INT_00) ) {s = 97;}

                        else if ( (LA3_4==INT_01_TO_12) ) {s = 98;}

                        else if ( (LA3_4==INT_13_TO_23) ) {s = 99;}

                        else if ( (LA3_4==INT_24_TO_31) ) {s = 100;}

                        else if ( (LA3_4==INT_32_TO_59) ) {s = 101;}

                        else if ( (LA3_4==WHITE_SPACE) ) {s = 96;}

                        else if ( (LA3_4==INT_60_TO_99) && (synpred1_Date())) {s = 102;}

                         
                        input.seek(index3_4);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA3_119 = input.LA(1);

                         
                        int index3_119 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index3_119);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA3_96 = input.LA(1);

                         
                        int index3_96 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_96==EOF||LA3_96==WHITE_SPACE||(LA3_96>=COMMA && LA3_96<=THE)||LA3_96==IN||(LA3_96>=THIS && LA3_96<=UPCOMING)||(LA3_96>=TODAY && LA3_96<=YESTERDAY)||(LA3_96>=AM && LA3_96<=PM)||(LA3_96>=INT_00 && LA3_96<=THIRTY_FIRST)) ) {s = 94;}

                        else if ( (LA3_96==JANUARY) ) {s = 103;}

                        else if ( (LA3_96==FEBRUARY) ) {s = 104;}

                        else if ( (LA3_96==MARCH) ) {s = 105;}

                        else if ( (LA3_96==APRIL) ) {s = 106;}

                        else if ( (LA3_96==MAY) ) {s = 107;}

                        else if ( (LA3_96==JUNE) ) {s = 108;}

                        else if ( (LA3_96==JULY) ) {s = 109;}

                        else if ( (LA3_96==AUGUST) ) {s = 110;}

                        else if ( (LA3_96==SEPTEMBER) ) {s = 111;}

                        else if ( (LA3_96==OCTOBER) ) {s = 112;}

                        else if ( (LA3_96==NOVEMBER) ) {s = 113;}

                        else if ( (LA3_96==DECEMBER) ) {s = 114;}

                        else if ( (LA3_96==SUNDAY) ) {s = 115;}

                        else if ( (LA3_96==MONDAY) ) {s = 116;}

                        else if ( (LA3_96==TUESDAY) ) {s = 117;}

                        else if ( (LA3_96==WEDNESDAY) ) {s = 118;}

                        else if ( (LA3_96==THURSDAY) ) {s = 119;}

                        else if ( (LA3_96==FRIDAY) ) {s = 120;}

                        else if ( (LA3_96==SATURDAY) ) {s = 121;}

                        else if ( (LA3_96==DAY) ) {s = 122;}

                        else if ( (LA3_96==WEEK) ) {s = 123;}

                        else if ( (LA3_96==MONTH) ) {s = 124;}

                        else if ( (LA3_96==YEAR) ) {s = 125;}

                        else if ( (LA3_96==OF) && (synpred1_Date())) {s = 126;}

                         
                        input.seek(index3_96);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA3_103 = input.LA(1);

                         
                        int index3_103 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index3_103);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA3_123 = input.LA(1);

                         
                        int index3_123 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index3_123);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA3_105 = input.LA(1);

                         
                        int index3_105 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index3_105);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA3_125 = input.LA(1);

                         
                        int index3_125 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index3_125);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA3_104 = input.LA(1);

                         
                        int index3_104 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index3_104);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA3_124 = input.LA(1);

                         
                        int index3_124 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index3_124);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA3_70 = input.LA(1);

                         
                        int index3_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_70==EOF||LA3_70==WHITE_SPACE||LA3_70==COMMA||LA3_70==COLON||(LA3_70>=AM && LA3_70<=PM)) ) {s = 94;}

                        else if ( (LA3_70==INT_00) ) {s = 97;}

                        else if ( (LA3_70==INT_01_TO_12) ) {s = 98;}

                        else if ( (LA3_70==INT_13_TO_23) ) {s = 99;}

                        else if ( (LA3_70==INT_24_TO_31) ) {s = 100;}

                        else if ( (LA3_70==INT_32_TO_59) ) {s = 101;}

                        else if ( (LA3_70==INT_60_TO_99) && (synpred1_Date())) {s = 102;}

                         
                        input.seek(index3_70);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
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

                        else if ( (LA3_0==TODAY) && (synpred1_Date())) {s = 91;}

                        else if ( (LA3_0==TOMORROW) && (synpred1_Date())) {s = 92;}

                        else if ( (LA3_0==YESTERDAY) && (synpred1_Date())) {s = 93;}

                        else if ( ((LA3_0>=NOON && LA3_0<=INT_0)) ) {s = 94;}

                         
                        input.seek(index3_0);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA3_3 = input.LA(1);

                         
                        int index3_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_3==WHITE_SPACE) ) {s = 96;}

                        else if ( ((LA3_3>=DASH && LA3_3<=SLASH)) && (synpred1_Date())) {s = 95;}

                        else if ( (LA3_3==EOF||LA3_3==COMMA||LA3_3==COLON||(LA3_3>=AM && LA3_3<=PM)) ) {s = 94;}

                        else if ( (LA3_3==INT_00) ) {s = 97;}

                        else if ( (LA3_3==INT_01_TO_12) ) {s = 98;}

                        else if ( (LA3_3==INT_13_TO_23) ) {s = 99;}

                        else if ( (LA3_3==INT_24_TO_31) ) {s = 100;}

                        else if ( (LA3_3==INT_32_TO_59) ) {s = 101;}

                        else if ( (LA3_3==INT_60_TO_99) && (synpred1_Date())) {s = 102;}

                         
                        input.seek(index3_3);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA3_112 = input.LA(1);

                         
                        int index3_112 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index3_112);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA3_101 = input.LA(1);

                         
                        int index3_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA3_101>=DASH && LA3_101<=SLASH)) && (synpred1_Date())) {s = 127;}

                        else if ( (LA3_101==EOF||LA3_101==WHITE_SPACE||LA3_101==COMMA||(LA3_101>=MILITARY_HOUR_SUFFIX && LA3_101<=PM)) ) {s = 94;}

                         
                        input.seek(index3_101);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA3_121 = input.LA(1);

                         
                        int index3_121 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index3_121);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA3_122 = input.LA(1);

                         
                        int index3_122 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index3_122);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA3_100 = input.LA(1);

                         
                        int index3_100 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA3_100>=DASH && LA3_100<=SLASH)) && (synpred1_Date())) {s = 127;}

                        else if ( (LA3_100==EOF||LA3_100==WHITE_SPACE||LA3_100==COMMA||(LA3_100>=MILITARY_HOUR_SUFFIX && LA3_100<=PM)) ) {s = 94;}

                         
                        input.seek(index3_100);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA3_99 = input.LA(1);

                         
                        int index3_99 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_99==EOF||LA3_99==WHITE_SPACE||LA3_99==COMMA||(LA3_99>=MILITARY_HOUR_SUFFIX && LA3_99<=PM)) ) {s = 94;}

                        else if ( ((LA3_99>=DASH && LA3_99<=SLASH)) && (synpred1_Date())) {s = 127;}

                         
                        input.seek(index3_99);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA3_120 = input.LA(1);

                         
                        int index3_120 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index3_120);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA3_113 = input.LA(1);

                         
                        int index3_113 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index3_113);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA3_98 = input.LA(1);

                         
                        int index3_98 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_98==EOF||LA3_98==WHITE_SPACE||LA3_98==COMMA||(LA3_98>=MILITARY_HOUR_SUFFIX && LA3_98<=PM)) ) {s = 94;}

                        else if ( ((LA3_98>=DASH && LA3_98<=SLASH)) && (synpred1_Date())) {s = 127;}

                         
                        input.seek(index3_98);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA3_97 = input.LA(1);

                         
                        int index3_97 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_97==EOF||LA3_97==WHITE_SPACE||LA3_97==COMMA||(LA3_97>=MILITARY_HOUR_SUFFIX && LA3_97<=PM)) ) {s = 94;}

                        else if ( ((LA3_97>=DASH && LA3_97<=SLASH)) && (synpred1_Date())) {s = 127;}

                         
                        input.seek(index3_97);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA3_114 = input.LA(1);

                         
                        int index3_114 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index3_114);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA3_110 = input.LA(1);

                         
                        int index3_110 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index3_110);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA3_111 = input.LA(1);

                         
                        int index3_111 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index3_111);
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
    static final String DFA12_eotS =
        "\u00d0\uffff";
    static final String DFA12_eofS =
        "\72\uffff\14\107\2\uffff\1\107\u0087\uffff";
    static final String DFA12_minS =
        "\1\30\32\24\37\uffff\14\24\2\uffff\1\24\2\31\1\122\1\31\1\uffff"+
        "\2\24\1\uffff\2\24\1\uffff\1\24\2\uffff\2\24\2\uffff\2\24\2\uffff"+
        "\1\122\1\31\1\24\1\uffff\2\25\47\uffff\17\0\65\uffff";
    static final String DFA12_maxS =
        "\1\u0085\1\24\1\55\3\121\23\24\1\157\1\147\37\uffff\14\26\2\uffff"+
        "\1\26\1\u0085\1\77\2\157\1\uffff\2\24\1\uffff\2\24\1\uffff\1\24"+
        "\2\uffff\2\24\2\uffff\2\24\2\uffff\2\147\1\24\1\uffff\1\u0085\1"+
        "\116\47\uffff\17\0\65\uffff";
    static final String DFA12_acceptS =
        "\33\uffff\37\1\14\uffff\1\2\1\3\5\uffff\1\1\2\uffff\1\1\2\uffff"+
        "\1\1\1\uffff\2\1\2\uffff\2\1\2\uffff\2\1\3\uffff\1\1\2\uffff\1\4"+
        "\46\1\17\uffff\65\1";
    static final String DFA12_specialS =
        "\1\30\30\uffff\1\10\1\14\56\uffff\1\13\1\2\1\23\1\24\22\uffff\1"+
        "\5\1\3\2\uffff\1\21\50\uffff\1\4\1\1\1\0\1\20\1\17\1\16\1\15\1\12"+
        "\1\11\1\7\1\6\1\22\1\27\1\26\1\25\65\uffff}>";
    static final String[] DFA12_transitionS = {
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
            "\1\114\27\uffff\1\113\45\uffff\1\134\1\116\1\121\1\124\1\117"+
            "\1\122\1\127\1\130\1\133\14\uffff\1\131\1\115\1\125\1\120\1"+
            "\123\1\136\1\135\1\132\1\126",
            "\1\140\27\uffff\1\137\45\uffff\1\141\24\uffff\1\142",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            "\1\145\3\uffff\1\177\1\u0080\1\u0081\1\u0082\1\u0083\1\u0084"+
            "\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a\43\uffff\1"+
            "\146\1\147\1\150\1\151\2\uffff\1\152\1\153\1\154\1\155\1\156"+
            "\1\157\1\160\1\161\1\162\1\163\1\164\1\165\1\166\1\167\1\170"+
            "\1\171\1\172\1\173\1\174\1\175\1\176\1\33\1\34\1\35\1\36\1\37"+
            "\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53"+
            "\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67"+
            "\1\70\1\71",
            "\1\107\2\uffff\1\u008b\1\u008c\1\u008d\1\u008e\1\u008f\1\u0090"+
            "\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096\1\u0097\2\uffff"+
            "\1\107\13\uffff\11\107",
            "\1\134\1\116\1\121\1\124\1\117\1\122\1\127\1\130\1\133\14\uffff"+
            "\1\131\1\115\1\125\1\120\1\123\1\136\1\135\1\132\1\126",
            "\1\107\2\uffff\1\u008b\1\u008c\1\u008d\1\u008e\1\u008f\1\u0090"+
            "\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096\1\u0097\2\uffff"+
            "\1\107\13\uffff\11\107\22\uffff\1\134\1\116\1\121\1\124\1\117"+
            "\1\122\1\127\1\130\1\133\14\uffff\1\131\1\115\1\125\1\120\1"+
            "\123\1\136\1\135\1\132\1\126",
            "",
            "\1\112",
            "\1\112",
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
            "\1\112",
            "\1\112",
            "",
            "",
            "\1\141\24\uffff\1\142",
            "\1\107\2\uffff\1\u008b\1\u008c\1\u008d\1\u008e\1\u008f\1\u0090"+
            "\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096\1\u0097\2\uffff"+
            "\1\107\13\uffff\11\107\22\uffff\1\141\24\uffff\1\142",
            "\1\112",
            "",
            "\1\107\62\uffff\4\107\1\u0098\1\u0099\1\u009a\1\u009b\2\uffff"+
            "\1\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3"+
            "\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab"+
            "\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3"+
            "\1\u00b4\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb"+
            "\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\1\u00c2\1\u00c3"+
            "\1\u00c4\1\u00c5\1\u00c6\1\u00c7\1\u00c8\1\u00c9\1\u00ca\1\u00cb"+
            "\1\u00cc\1\u00cd\1\u00ce\1\u00cf",
            "\1\107\4\uffff\2\145\54\uffff\7\107",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "48:1: date : ( ( relaxed_date )=> relaxed_date | formal_date | relative_date | global_date_prefix date -> ^( RELATIVE_DATE ^( SEEK global_date_prefix date ) ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_142 = input.LA(1);

                         
                        int index12_142 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 207;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index12_142);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_141 = input.LA(1);

                         
                        int index12_141 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 207;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index12_141);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_74 = input.LA(1);

                         
                        int index12_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_74==OF) && (synpred2_Date())) {s = 139;}

                        else if ( (LA12_74==JANUARY) ) {s = 140;}

                        else if ( (LA12_74==FEBRUARY) ) {s = 141;}

                        else if ( (LA12_74==MARCH) ) {s = 142;}

                        else if ( (LA12_74==APRIL) ) {s = 143;}

                        else if ( (LA12_74==MAY) ) {s = 144;}

                        else if ( (LA12_74==JUNE) ) {s = 145;}

                        else if ( (LA12_74==JULY) ) {s = 146;}

                        else if ( (LA12_74==AUGUST) ) {s = 147;}

                        else if ( (LA12_74==SEPTEMBER) ) {s = 148;}

                        else if ( (LA12_74==OCTOBER) ) {s = 149;}

                        else if ( (LA12_74==NOVEMBER) ) {s = 150;}

                        else if ( (LA12_74==DECEMBER) ) {s = 151;}

                        else if ( (LA12_74==DAY||LA12_74==YEAR||(LA12_74>=WEEK && LA12_74<=SATURDAY)) ) {s = 71;}

                         
                        input.seek(index12_74);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_96 = input.LA(1);

                         
                        int index12_96 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_96==FIRST) && (synpred2_Date())) {s = 98;}

                        else if ( (LA12_96==OF) && (synpred2_Date())) {s = 139;}

                        else if ( (LA12_96==JANUARY) ) {s = 140;}

                        else if ( (LA12_96==FEBRUARY) ) {s = 141;}

                        else if ( (LA12_96==MARCH) ) {s = 142;}

                        else if ( (LA12_96==APRIL) ) {s = 143;}

                        else if ( (LA12_96==MAY) ) {s = 144;}

                        else if ( (LA12_96==JUNE) ) {s = 145;}

                        else if ( (LA12_96==JULY) ) {s = 146;}

                        else if ( (LA12_96==AUGUST) ) {s = 147;}

                        else if ( (LA12_96==SEPTEMBER) ) {s = 148;}

                        else if ( (LA12_96==OCTOBER) ) {s = 149;}

                        else if ( (LA12_96==NOVEMBER) ) {s = 150;}

                        else if ( (LA12_96==DECEMBER) ) {s = 151;}

                        else if ( (LA12_96==ONE) ) {s = 97;}

                        else if ( (LA12_96==DAY||LA12_96==YEAR||(LA12_96>=WEEK && LA12_96<=SATURDAY)) ) {s = 71;}

                         
                        input.seek(index12_96);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_140 = input.LA(1);

                         
                        int index12_140 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 207;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index12_140);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_95 = input.LA(1);

                         
                        int index12_95 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_95==ONE) ) {s = 97;}

                        else if ( (LA12_95==FIRST) && (synpred2_Date())) {s = 98;}

                         
                        input.seek(index12_95);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_150 = input.LA(1);

                         
                        int index12_150 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 207;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index12_150);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA12_149 = input.LA(1);

                         
                        int index12_149 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 207;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index12_149);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA12_25 = input.LA(1);

                         
                        int index12_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_25==DASH) ) {s = 75;}

                        else if ( (LA12_25==WHITE_SPACE) ) {s = 76;}

                        else if ( (LA12_25==SECOND) && (synpred2_Date())) {s = 77;}

                        else if ( (LA12_25==TWO) ) {s = 78;}

                        else if ( (LA12_25==FIVE) ) {s = 79;}

                        else if ( (LA12_25==FOURTH) && (synpred2_Date())) {s = 80;}

                        else if ( (LA12_25==THREE) ) {s = 81;}

                        else if ( (LA12_25==SIX) ) {s = 82;}

                        else if ( (LA12_25==FIFTH) && (synpred2_Date())) {s = 83;}

                        else if ( (LA12_25==FOUR) ) {s = 84;}

                        else if ( (LA12_25==THIRD) && (synpred2_Date())) {s = 85;}

                        else if ( (LA12_25==NINTH) && (synpred2_Date())) {s = 86;}

                        else if ( (LA12_25==SEVEN) ) {s = 87;}

                        else if ( (LA12_25==EIGHT) ) {s = 88;}

                        else if ( (LA12_25==FIRST) && (synpred2_Date())) {s = 89;}

                        else if ( (LA12_25==EIGHTH) && (synpred2_Date())) {s = 90;}

                        else if ( (LA12_25==NINE) ) {s = 91;}

                        else if ( (LA12_25==ONE) ) {s = 92;}

                        else if ( (LA12_25==SEVENTH) && (synpred2_Date())) {s = 93;}

                        else if ( (LA12_25==SIXTH) && (synpred2_Date())) {s = 94;}

                         
                        input.seek(index12_25);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA12_148 = input.LA(1);

                         
                        int index12_148 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 207;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index12_148);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA12_147 = input.LA(1);

                         
                        int index12_147 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 207;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index12_147);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA12_73 = input.LA(1);

                         
                        int index12_73 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_73==DAY) ) {s = 101;}

                        else if ( (LA12_73==INT_1_TO_9) && (synpred2_Date())) {s = 102;}

                        else if ( (LA12_73==INT_01_TO_12) && (synpred2_Date())) {s = 103;}

                        else if ( (LA12_73==INT_13_TO_23) && (synpred2_Date())) {s = 104;}

                        else if ( (LA12_73==INT_24_TO_31) && (synpred2_Date())) {s = 105;}

                        else if ( (LA12_73==ONE) && (synpred2_Date())) {s = 106;}

                        else if ( (LA12_73==TWO) && (synpred2_Date())) {s = 107;}

                        else if ( (LA12_73==THREE) && (synpred2_Date())) {s = 108;}

                        else if ( (LA12_73==FOUR) && (synpred2_Date())) {s = 109;}

                        else if ( (LA12_73==FIVE) && (synpred2_Date())) {s = 110;}

                        else if ( (LA12_73==SIX) && (synpred2_Date())) {s = 111;}

                        else if ( (LA12_73==SEVEN) && (synpred2_Date())) {s = 112;}

                        else if ( (LA12_73==EIGHT) && (synpred2_Date())) {s = 113;}

                        else if ( (LA12_73==NINE) && (synpred2_Date())) {s = 114;}

                        else if ( (LA12_73==TEN) && (synpred2_Date())) {s = 115;}

                        else if ( (LA12_73==ELEVEN) && (synpred2_Date())) {s = 116;}

                        else if ( (LA12_73==TWELVE) && (synpred2_Date())) {s = 117;}

                        else if ( (LA12_73==THIRTEEN) && (synpred2_Date())) {s = 118;}

                        else if ( (LA12_73==FOURTEEN) && (synpred2_Date())) {s = 119;}

                        else if ( (LA12_73==FIFTEEN) && (synpred2_Date())) {s = 120;}

                        else if ( (LA12_73==SIXTEEN) && (synpred2_Date())) {s = 121;}

                        else if ( (LA12_73==SEVENTEEN) && (synpred2_Date())) {s = 122;}

                        else if ( (LA12_73==EIGHTEEN) && (synpred2_Date())) {s = 123;}

                        else if ( (LA12_73==NINETEEN) && (synpred2_Date())) {s = 124;}

                        else if ( (LA12_73==TWENTY) && (synpred2_Date())) {s = 125;}

                        else if ( (LA12_73==THIRTY) && (synpred2_Date())) {s = 126;}

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

                        else if ( (LA12_73==JANUARY) && (synpred2_Date())) {s = 127;}

                        else if ( (LA12_73==FEBRUARY) && (synpred2_Date())) {s = 128;}

                        else if ( (LA12_73==MARCH) && (synpred2_Date())) {s = 129;}

                        else if ( (LA12_73==APRIL) && (synpred2_Date())) {s = 130;}

                        else if ( (LA12_73==MAY) && (synpred2_Date())) {s = 131;}

                        else if ( (LA12_73==JUNE) && (synpred2_Date())) {s = 132;}

                        else if ( (LA12_73==JULY) && (synpred2_Date())) {s = 133;}

                        else if ( (LA12_73==AUGUST) && (synpred2_Date())) {s = 134;}

                        else if ( (LA12_73==SEPTEMBER) && (synpred2_Date())) {s = 135;}

                        else if ( (LA12_73==OCTOBER) && (synpred2_Date())) {s = 136;}

                        else if ( (LA12_73==NOVEMBER) && (synpred2_Date())) {s = 137;}

                        else if ( (LA12_73==DECEMBER) && (synpred2_Date())) {s = 138;}

                         
                        input.seek(index12_73);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA12_26 = input.LA(1);

                         
                        int index12_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_26==DASH) ) {s = 95;}

                        else if ( (LA12_26==WHITE_SPACE) ) {s = 96;}

                        else if ( (LA12_26==ONE) ) {s = 97;}

                        else if ( (LA12_26==FIRST) && (synpred2_Date())) {s = 98;}

                         
                        input.seek(index12_26);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA12_146 = input.LA(1);

                         
                        int index12_146 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 207;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index12_146);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA12_145 = input.LA(1);

                         
                        int index12_145 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 207;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index12_145);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA12_144 = input.LA(1);

                         
                        int index12_144 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 207;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index12_144);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA12_143 = input.LA(1);

                         
                        int index12_143 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 207;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index12_143);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA12_99 = input.LA(1);

                         
                        int index12_99 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_99==AT||(LA12_99>=NOON && LA12_99<=INT_00)) ) {s = 71;}

                        else if ( (LA12_99==INT_1_TO_9) ) {s = 152;}

                        else if ( (LA12_99==INT_01_TO_12) ) {s = 153;}

                        else if ( (LA12_99==INT_13_TO_23) ) {s = 154;}

                        else if ( (LA12_99==INT_24_TO_31) && (synpred2_Date())) {s = 155;}

                        else if ( (LA12_99==ONE) && (synpred2_Date())) {s = 156;}

                        else if ( (LA12_99==TWO) && (synpred2_Date())) {s = 157;}

                        else if ( (LA12_99==THREE) && (synpred2_Date())) {s = 158;}

                        else if ( (LA12_99==FOUR) && (synpred2_Date())) {s = 159;}

                        else if ( (LA12_99==FIVE) && (synpred2_Date())) {s = 160;}

                        else if ( (LA12_99==SIX) && (synpred2_Date())) {s = 161;}

                        else if ( (LA12_99==SEVEN) && (synpred2_Date())) {s = 162;}

                        else if ( (LA12_99==EIGHT) && (synpred2_Date())) {s = 163;}

                        else if ( (LA12_99==NINE) && (synpred2_Date())) {s = 164;}

                        else if ( (LA12_99==TEN) && (synpred2_Date())) {s = 165;}

                        else if ( (LA12_99==ELEVEN) && (synpred2_Date())) {s = 166;}

                        else if ( (LA12_99==TWELVE) && (synpred2_Date())) {s = 167;}

                        else if ( (LA12_99==THIRTEEN) && (synpred2_Date())) {s = 168;}

                        else if ( (LA12_99==FOURTEEN) && (synpred2_Date())) {s = 169;}

                        else if ( (LA12_99==FIFTEEN) && (synpred2_Date())) {s = 170;}

                        else if ( (LA12_99==SIXTEEN) && (synpred2_Date())) {s = 171;}

                        else if ( (LA12_99==SEVENTEEN) && (synpred2_Date())) {s = 172;}

                        else if ( (LA12_99==EIGHTEEN) && (synpred2_Date())) {s = 173;}

                        else if ( (LA12_99==NINETEEN) && (synpred2_Date())) {s = 174;}

                        else if ( (LA12_99==TWENTY) && (synpred2_Date())) {s = 175;}

                        else if ( (LA12_99==THIRTY) && (synpred2_Date())) {s = 176;}

                        else if ( (LA12_99==FIRST) && (synpred2_Date())) {s = 177;}

                        else if ( (LA12_99==SECOND) && (synpred2_Date())) {s = 178;}

                        else if ( (LA12_99==THIRD) && (synpred2_Date())) {s = 179;}

                        else if ( (LA12_99==FOURTH) && (synpred2_Date())) {s = 180;}

                        else if ( (LA12_99==FIFTH) && (synpred2_Date())) {s = 181;}

                        else if ( (LA12_99==SIXTH) && (synpred2_Date())) {s = 182;}

                        else if ( (LA12_99==SEVENTH) && (synpred2_Date())) {s = 183;}

                        else if ( (LA12_99==EIGHTH) && (synpred2_Date())) {s = 184;}

                        else if ( (LA12_99==NINTH) && (synpred2_Date())) {s = 185;}

                        else if ( (LA12_99==TENTH) && (synpred2_Date())) {s = 186;}

                        else if ( (LA12_99==ELEVENTH) && (synpred2_Date())) {s = 187;}

                        else if ( (LA12_99==TWELFTH) && (synpred2_Date())) {s = 188;}

                        else if ( (LA12_99==THIRTEENTH) && (synpred2_Date())) {s = 189;}

                        else if ( (LA12_99==FOURTEENTH) && (synpred2_Date())) {s = 190;}

                        else if ( (LA12_99==FIFTEENTH) && (synpred2_Date())) {s = 191;}

                        else if ( (LA12_99==SIXTEENTH) && (synpred2_Date())) {s = 192;}

                        else if ( (LA12_99==SEVENTEENTH) && (synpred2_Date())) {s = 193;}

                        else if ( (LA12_99==EIGHTEENTH) && (synpred2_Date())) {s = 194;}

                        else if ( (LA12_99==NINETEENTH) && (synpred2_Date())) {s = 195;}

                        else if ( (LA12_99==TWENTIETH) && (synpred2_Date())) {s = 196;}

                        else if ( (LA12_99==TWENTY_FIRST) && (synpred2_Date())) {s = 197;}

                        else if ( (LA12_99==TWENTY_SECOND) && (synpred2_Date())) {s = 198;}

                        else if ( (LA12_99==TWENTY_THIRD) && (synpred2_Date())) {s = 199;}

                        else if ( (LA12_99==TWENTY_FOURTH) && (synpred2_Date())) {s = 200;}

                        else if ( (LA12_99==TWENTY_FIFTH) && (synpred2_Date())) {s = 201;}

                        else if ( (LA12_99==TWENTY_SIXTH) && (synpred2_Date())) {s = 202;}

                        else if ( (LA12_99==TWENTY_SEVENTH) && (synpred2_Date())) {s = 203;}

                        else if ( (LA12_99==TWENTY_EIGHTH) && (synpred2_Date())) {s = 204;}

                        else if ( (LA12_99==TWENTY_NINTH) && (synpred2_Date())) {s = 205;}

                        else if ( (LA12_99==THIRTIETH) && (synpred2_Date())) {s = 206;}

                        else if ( (LA12_99==THIRTY_FIRST) && (synpred2_Date())) {s = 207;}

                         
                        input.seek(index12_99);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA12_151 = input.LA(1);

                         
                        int index12_151 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 207;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index12_151);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA12_75 = input.LA(1);

                         
                        int index12_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_75==THREE) ) {s = 81;}

                        else if ( (LA12_75==FOURTH) && (synpred2_Date())) {s = 80;}

                        else if ( (LA12_75==SECOND) && (synpred2_Date())) {s = 77;}

                        else if ( (LA12_75==FIVE) ) {s = 79;}

                        else if ( (LA12_75==TWO) ) {s = 78;}

                        else if ( (LA12_75==FOUR) ) {s = 84;}

                        else if ( (LA12_75==THIRD) && (synpred2_Date())) {s = 85;}

                        else if ( (LA12_75==SIX) ) {s = 82;}

                        else if ( (LA12_75==ONE) ) {s = 92;}

                        else if ( (LA12_75==FIFTH) && (synpred2_Date())) {s = 83;}

                        else if ( (LA12_75==NINTH) && (synpred2_Date())) {s = 86;}

                        else if ( (LA12_75==SEVEN) ) {s = 87;}

                        else if ( (LA12_75==EIGHTH) && (synpred2_Date())) {s = 90;}

                        else if ( (LA12_75==EIGHT) ) {s = 88;}

                        else if ( (LA12_75==FIRST) && (synpred2_Date())) {s = 89;}

                        else if ( (LA12_75==NINE) ) {s = 91;}

                        else if ( (LA12_75==SEVENTH) && (synpred2_Date())) {s = 93;}

                        else if ( (LA12_75==SIXTH) && (synpred2_Date())) {s = 94;}

                         
                        input.seek(index12_75);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA12_76 = input.LA(1);

                         
                        int index12_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_76==THREE) ) {s = 81;}

                        else if ( (LA12_76==SECOND) && (synpred2_Date())) {s = 77;}

                        else if ( (LA12_76==FIVE) ) {s = 79;}

                        else if ( (LA12_76==TWO) ) {s = 78;}

                        else if ( (LA12_76==FOURTH) && (synpred2_Date())) {s = 80;}

                        else if ( (LA12_76==FOUR) ) {s = 84;}

                        else if ( (LA12_76==SIX) ) {s = 82;}

                        else if ( (LA12_76==FIFTH) && (synpred2_Date())) {s = 83;}

                        else if ( (LA12_76==ONE) ) {s = 92;}

                        else if ( (LA12_76==THIRD) && (synpred2_Date())) {s = 85;}

                        else if ( (LA12_76==NINTH) && (synpred2_Date())) {s = 86;}

                        else if ( (LA12_76==OF) && (synpred2_Date())) {s = 139;}

                        else if ( (LA12_76==JANUARY) ) {s = 140;}

                        else if ( (LA12_76==FEBRUARY) ) {s = 141;}

                        else if ( (LA12_76==MARCH) ) {s = 142;}

                        else if ( (LA12_76==APRIL) ) {s = 143;}

                        else if ( (LA12_76==MAY) ) {s = 144;}

                        else if ( (LA12_76==JUNE) ) {s = 145;}

                        else if ( (LA12_76==JULY) ) {s = 146;}

                        else if ( (LA12_76==AUGUST) ) {s = 147;}

                        else if ( (LA12_76==SEPTEMBER) ) {s = 148;}

                        else if ( (LA12_76==OCTOBER) ) {s = 149;}

                        else if ( (LA12_76==NOVEMBER) ) {s = 150;}

                        else if ( (LA12_76==DECEMBER) ) {s = 151;}

                        else if ( (LA12_76==SEVEN) ) {s = 87;}

                        else if ( (LA12_76==EIGHTH) && (synpred2_Date())) {s = 90;}

                        else if ( (LA12_76==EIGHT) ) {s = 88;}

                        else if ( (LA12_76==FIRST) && (synpred2_Date())) {s = 89;}

                        else if ( (LA12_76==NINE) ) {s = 91;}

                        else if ( (LA12_76==SEVENTH) && (synpred2_Date())) {s = 93;}

                        else if ( (LA12_76==DAY||LA12_76==YEAR||(LA12_76>=WEEK && LA12_76<=SATURDAY)) ) {s = 71;}

                        else if ( (LA12_76==SIXTH) && (synpred2_Date())) {s = 94;}

                         
                        input.seek(index12_76);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA12_154 = input.LA(1);

                         
                        int index12_154 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 207;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index12_154);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA12_153 = input.LA(1);

                         
                        int index12_153 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 207;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index12_153);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA12_152 = input.LA(1);

                         
                        int index12_152 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 207;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index12_152);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
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

                        else if ( ((LA12_0>=IN && LA12_0<=YEAR)||(LA12_0>=THIS && LA12_0<=UPCOMING)||(LA12_0>=WEEK && LA12_0<=YESTERDAY)) ) {s = 71;}

                        else if ( (LA12_0==DAY) ) {s = 72;}

                         
                        input.seek(index12_0);
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
        "\1\30\105\24\1\35\1\34\1\122\1\34\22\24\1\122\1\34\2\24\1\114\1"+
        "\uffff\105\24\1\35\1\25\1\24\1\uffff\1\24\1\25\1\122\1\25\22\24"+
        "\1\122\1\25\2\24\3\0\5\uffff\2\25\2\uffff\3\0\3\uffff";
    static final String DFA21_maxS =
        "\1\u0085\30\24\1\157\1\147\53\24\1\u0085\1\50\2\157\22\24\2\147"+
        "\2\24\1\u0085\1\uffff\1\24\43\26\1\157\1\147\37\26\1\50\2\121\1"+
        "\uffff\2\121\2\157\22\26\2\147\2\26\3\0\5\uffff\2\121\2\uffff\3"+
        "\0\3\uffff";
    static final String DFA21_acceptS =
        "\141\uffff\1\4\110\uffff\1\3\35\uffff\5\1\2\uffff\2\2\3\uffff\3"+
        "\2";
    static final String DFA21_specialS =
        "\u00a8\uffff\1\0\1\12\1\uffff\1\15\1\4\1\uffff\1\5\23\uffff\1\3"+
        "\2\uffff\1\1\1\6\1\7\5\uffff\1\13\1\2\2\uffff\1\14\1\11\1\10\3\uffff}>";
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
            "\1\111\27\uffff\1\110\45\uffff\1\116\1\125\1\126\1\120\1\122"+
            "\1\117\1\133\1\123\1\115\14\uffff\1\130\1\132\1\112\1\114\1"+
            "\124\1\121\1\127\1\113\1\131",
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
            "\1\116\1\125\1\126\1\120\1\122\1\117\1\133\1\123\1\115\14\uffff"+
            "\1\130\1\132\1\112\1\114\1\124\1\121\1\127\1\113\1\131",
            "\1\142\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\153"+
            "\1\154\1\155\1\156\51\uffff\1\116\1\125\1\126\1\120\1\122\1"+
            "\117\1\133\1\123\1\115\14\uffff\1\130\1\132\1\112\1\114\1\124"+
            "\1\121\1\127\1\113\1\131",
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
            "\1\u00a8\1\uffff\1\u00a9",
            "\1\u00a8\1\uffff\1\u00a9",
            "\1\u00a8\1\uffff\1\u00a9",
            "\1\u00a8\1\uffff\1\u00a9",
            "\1\u00a8\1\uffff\1\u00a9",
            "\1\u00a8\1\uffff\1\u00a9",
            "\1\u00a8\1\uffff\1\u00a9",
            "\1\u00a8\1\uffff\1\u00a9",
            "\1\u00a8\1\uffff\1\u00a9",
            "\1\u00a8\1\uffff\1\u00a9",
            "\1\u00a8\1\uffff\1\u00a9",
            "\1\u00a8\1\uffff\1\u00a9",
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
            "\1\u00ae\1\uffff\1\u00ab\25\uffff\1\u00ad\45\uffff\1\u00be"+
            "\1\u00b2\1\u00b9\1\u00b1\1\u00c0\1\u00bd\1\u00b6\1\u00b3\1\u00b5"+
            "\14\uffff\1\u00b7\1\u00bb\1\u00ba\1\u00bf\1\u00af\1\u00b0\1"+
            "\u00bc\1\u00b4\1\u00b8",
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
            "\1\u00aa\23\uffff\1\u00cc\1\u00c8\35\uffff\3\u00aa\1\u00c5"+
            "\1\u00aa\1\u00c6\1\u00c7\1\u00c9\1\u00ca\1\u00cb",
            "\1\u00cd\1\u00aa\23\uffff\1\u00cc\1\u00c8\35\uffff\3\u00aa"+
            "\1\u00c5\1\u00aa\1\u00c6\1\u00c7\1\u00c9\1\u00ca\1\u00cb",
            "",
            "\1\u00ce\1\141\23\uffff\1\u00d0\1\u00cf\35\uffff\3\141\1\u00d1"+
            "\1\141\1\u00d2\1\u00d3\1\u00d4\1\u00d5\1\u00d6",
            "\1\141\23\uffff\1\u00d0\1\u00cf\35\uffff\3\141\1\u00d1\1\141"+
            "\1\u00d2\1\u00d3\1\u00d4\1\u00d5\1\u00d6",
            "\1\u00be\1\u00b2\1\u00b9\1\u00b1\1\u00c0\1\u00bd\1\u00b6\1"+
            "\u00b3\1\u00b5\14\uffff\1\u00b7\1\u00bb\1\u00ba\1\u00bf\1\u00af"+
            "\1\u00b0\1\u00bc\1\u00b4\1\u00b8",
            "\1\141\23\uffff\1\u00d0\1\u00cf\35\uffff\3\141\1\u00d1\1\141"+
            "\1\u00d2\1\u00d3\1\u00d4\1\u00d5\1\u00d6\1\u00be\1\u00b2\1\u00b9"+
            "\1\u00b1\1\u00c0\1\u00bd\1\u00b6\1\u00b3\1\u00b5\14\uffff\1"+
            "\u00b7\1\u00bb\1\u00ba\1\u00bf\1\u00af\1\u00b0\1\u00bc\1\u00b4"+
            "\1\u00b8",
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
            "\1\141\23\uffff\1\u00d0\1\u00cf\35\uffff\3\141\1\u00d1\1\141"+
            "\1\u00d2\1\u00d3\1\u00d4\1\u00d5\1\u00d6\1\u00c4\24\uffff\1"+
            "\u00c3",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "\1\u00aa\23\uffff\1\u00cc\1\u00c8\35\uffff\3\u00aa\1\u00c5"+
            "\1\u00aa\1\u00c6\1\u00c7\1\u00c9\1\u00ca\1\u00cb",
            "\1\141\23\uffff\1\u00d0\1\u00cf\35\uffff\3\141\1\u00d1\1\141"+
            "\1\u00d2\1\u00d3\1\u00d4\1\u00d5\1\u00d6",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            return "68:5: ( ( ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year )=> ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year | ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year )=> relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year | ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month | ( THE WHITE_SPACE )? relaxed_month WHITE_SPACE relaxed_day_of_month )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_168 = input.LA(1);

                         
                        int index21_168 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA21_168==AT||(LA21_168>=NOON && LA21_168<=INT_0)||LA21_168==INT_1_TO_9) ) {s = 170;}

                        else if ( (LA21_168==INT_00) ) {s = 197;}

                        else if ( (LA21_168==INT_01_TO_12) ) {s = 198;}

                        else if ( (LA21_168==INT_13_TO_23) ) {s = 199;}

                        else if ( (LA21_168==IN) && (synpred3_Date())) {s = 200;}

                        else if ( (LA21_168==INT_24_TO_31) && (synpred3_Date())) {s = 201;}

                        else if ( (LA21_168==INT_32_TO_59) && (synpred3_Date())) {s = 202;}

                        else if ( (LA21_168==INT_60_TO_99) && (synpred3_Date())) {s = 203;}

                        else if ( (LA21_168==SINGLE_QUOTE) && (synpred3_Date())) {s = 204;}

                         
                        input.seek(index21_168);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_197 = input.LA(1);

                         
                        int index21_197 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 204;}

                        else if ( (true) ) {s = 170;}

                         
                        input.seek(index21_197);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_206 = input.LA(1);

                         
                        int index21_206 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA21_206==IN) && (synpred4_Date())) {s = 207;}

                        else if ( (LA21_206==SINGLE_QUOTE) && (synpred4_Date())) {s = 208;}

                        else if ( (LA21_206==INT_00) ) {s = 209;}

                        else if ( (LA21_206==INT_01_TO_12) ) {s = 210;}

                        else if ( (LA21_206==INT_13_TO_23) ) {s = 211;}

                        else if ( (LA21_206==INT_24_TO_31) && (synpred4_Date())) {s = 212;}

                        else if ( (LA21_206==INT_32_TO_59) && (synpred4_Date())) {s = 213;}

                        else if ( (LA21_206==INT_60_TO_99) && (synpred4_Date())) {s = 214;}

                        else if ( (LA21_206==AT||(LA21_206>=NOON && LA21_206<=INT_0)||LA21_206==INT_1_TO_9) ) {s = 97;}

                         
                        input.seek(index21_206);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA21_194 = input.LA(1);

                         
                        int index21_194 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA21_194==AT||(LA21_194>=NOON && LA21_194<=INT_0)||LA21_194==INT_1_TO_9) ) {s = 97;}

                        else if ( (LA21_194==INT_00) ) {s = 209;}

                        else if ( (LA21_194==INT_01_TO_12) ) {s = 210;}

                        else if ( (LA21_194==INT_13_TO_23) ) {s = 211;}

                        else if ( (LA21_194==FIRST) ) {s = 195;}

                        else if ( (LA21_194==IN) && (synpred4_Date())) {s = 207;}

                        else if ( (LA21_194==INT_24_TO_31) && (synpred4_Date())) {s = 212;}

                        else if ( (LA21_194==INT_32_TO_59) && (synpred4_Date())) {s = 213;}

                        else if ( (LA21_194==INT_60_TO_99) && (synpred4_Date())) {s = 214;}

                        else if ( (LA21_194==ONE) ) {s = 196;}

                        else if ( (LA21_194==SINGLE_QUOTE) && (synpred4_Date())) {s = 208;}

                         
                        input.seek(index21_194);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA21_172 = input.LA(1);

                         
                        int index21_172 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA21_172==AT||(LA21_172>=NOON && LA21_172<=INT_0)||LA21_172==INT_1_TO_9) ) {s = 97;}

                        else if ( (LA21_172==INT_00) ) {s = 209;}

                        else if ( (LA21_172==INT_01_TO_12) ) {s = 210;}

                        else if ( (LA21_172==INT_13_TO_23) ) {s = 211;}

                        else if ( (LA21_172==IN) && (synpred4_Date())) {s = 207;}

                        else if ( (LA21_172==INT_24_TO_31) && (synpred4_Date())) {s = 212;}

                        else if ( (LA21_172==INT_32_TO_59) && (synpred4_Date())) {s = 213;}

                        else if ( (LA21_172==INT_60_TO_99) && (synpred4_Date())) {s = 214;}

                        else if ( (LA21_172==SINGLE_QUOTE) && (synpred4_Date())) {s = 208;}

                         
                        input.seek(index21_172);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA21_174 = input.LA(1);

                         
                        int index21_174 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA21_174==NINTH) ) {s = 184;}

                        else if ( (LA21_174==EIGHTH) ) {s = 180;}

                        else if ( (LA21_174==FIFTH) ) {s = 175;}

                        else if ( (LA21_174==NINE) ) {s = 181;}

                        else if ( (LA21_174==FOUR) ) {s = 177;}

                        else if ( (LA21_174==AT||(LA21_174>=NOON && LA21_174<=INT_0)||LA21_174==INT_1_TO_9) ) {s = 97;}

                        else if ( (LA21_174==INT_00) ) {s = 209;}

                        else if ( (LA21_174==INT_01_TO_12) ) {s = 210;}

                        else if ( (LA21_174==INT_13_TO_23) ) {s = 211;}

                        else if ( (LA21_174==IN) && (synpred4_Date())) {s = 207;}

                        else if ( (LA21_174==INT_24_TO_31) && (synpred4_Date())) {s = 212;}

                        else if ( (LA21_174==INT_32_TO_59) && (synpred4_Date())) {s = 213;}

                        else if ( (LA21_174==INT_60_TO_99) && (synpred4_Date())) {s = 214;}

                        else if ( (LA21_174==SECOND) ) {s = 187;}

                        else if ( (LA21_174==FIRST) ) {s = 183;}

                        else if ( (LA21_174==THREE) ) {s = 185;}

                        else if ( (LA21_174==SIXTH) ) {s = 176;}

                        else if ( (LA21_174==TWO) ) {s = 178;}

                        else if ( (LA21_174==SINGLE_QUOTE) && (synpred4_Date())) {s = 208;}

                        else if ( (LA21_174==SEVEN) ) {s = 182;}

                        else if ( (LA21_174==EIGHT) ) {s = 179;}

                        else if ( (LA21_174==SIX) ) {s = 189;}

                        else if ( (LA21_174==SEVENTH) ) {s = 188;}

                        else if ( (LA21_174==ONE) ) {s = 190;}

                        else if ( (LA21_174==THIRD) ) {s = 186;}

                        else if ( (LA21_174==FOURTH) ) {s = 191;}

                        else if ( (LA21_174==FIVE) ) {s = 192;}

                         
                        input.seek(index21_174);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA21_198 = input.LA(1);

                         
                        int index21_198 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 204;}

                        else if ( (true) ) {s = 170;}

                         
                        input.seek(index21_198);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA21_199 = input.LA(1);

                         
                        int index21_199 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 204;}

                        else if ( (true) ) {s = 170;}

                         
                        input.seek(index21_199);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA21_211 = input.LA(1);

                         
                        int index21_211 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Date()) ) {s = 214;}

                        else if ( (true) ) {s = 97;}

                         
                        input.seek(index21_211);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA21_210 = input.LA(1);

                         
                        int index21_210 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Date()) ) {s = 214;}

                        else if ( (true) ) {s = 97;}

                         
                        input.seek(index21_210);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA21_169 = input.LA(1);

                         
                        int index21_169 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA21_169==WHITE_SPACE) ) {s = 205;}

                        else if ( (LA21_169==IN) && (synpred3_Date())) {s = 200;}

                        else if ( (LA21_169==SINGLE_QUOTE) && (synpred3_Date())) {s = 204;}

                        else if ( (LA21_169==INT_00) ) {s = 197;}

                        else if ( (LA21_169==INT_01_TO_12) ) {s = 198;}

                        else if ( (LA21_169==INT_13_TO_23) ) {s = 199;}

                        else if ( (LA21_169==INT_24_TO_31) && (synpred3_Date())) {s = 201;}

                        else if ( (LA21_169==INT_32_TO_59) && (synpred3_Date())) {s = 202;}

                        else if ( (LA21_169==INT_60_TO_99) && (synpred3_Date())) {s = 203;}

                        else if ( (LA21_169==AT||(LA21_169>=NOON && LA21_169<=INT_0)||LA21_169==INT_1_TO_9) ) {s = 170;}

                         
                        input.seek(index21_169);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA21_205 = input.LA(1);

                         
                        int index21_205 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA21_205==IN) && (synpred3_Date())) {s = 200;}

                        else if ( (LA21_205==INT_00) ) {s = 197;}

                        else if ( (LA21_205==INT_01_TO_12) ) {s = 198;}

                        else if ( (LA21_205==INT_13_TO_23) ) {s = 199;}

                        else if ( (LA21_205==INT_24_TO_31) && (synpred3_Date())) {s = 201;}

                        else if ( (LA21_205==INT_32_TO_59) && (synpred3_Date())) {s = 202;}

                        else if ( (LA21_205==INT_60_TO_99) && (synpred3_Date())) {s = 203;}

                        else if ( (LA21_205==AT||(LA21_205>=NOON && LA21_205<=INT_0)||LA21_205==INT_1_TO_9) ) {s = 170;}

                        else if ( (LA21_205==SINGLE_QUOTE) && (synpred3_Date())) {s = 204;}

                         
                        input.seek(index21_205);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA21_209 = input.LA(1);

                         
                        int index21_209 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Date()) ) {s = 214;}

                        else if ( (true) ) {s = 97;}

                         
                        input.seek(index21_209);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA21_171 = input.LA(1);

                         
                        int index21_171 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA21_171==WHITE_SPACE) ) {s = 206;}

                        else if ( (LA21_171==IN) && (synpred4_Date())) {s = 207;}

                        else if ( (LA21_171==SINGLE_QUOTE) && (synpred4_Date())) {s = 208;}

                        else if ( (LA21_171==INT_00) ) {s = 209;}

                        else if ( (LA21_171==INT_01_TO_12) ) {s = 210;}

                        else if ( (LA21_171==INT_13_TO_23) ) {s = 211;}

                        else if ( (LA21_171==INT_24_TO_31) && (synpred4_Date())) {s = 212;}

                        else if ( (LA21_171==INT_32_TO_59) && (synpred4_Date())) {s = 213;}

                        else if ( (LA21_171==INT_60_TO_99) && (synpred4_Date())) {s = 214;}

                        else if ( (LA21_171==AT||(LA21_171>=NOON && LA21_171<=INT_0)||LA21_171==INT_1_TO_9) ) {s = 97;}

                         
                        input.seek(index21_171);
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
            return "107:1: relaxed_year : ( relaxed_year_prefix ( SINGLE_QUOTE )? int_00_to_99_mandatory_prefix -> ^( YEAR_OF int_00_to_99_mandatory_prefix ) | relaxed_year_prefix int_four_digits -> ^( YEAR_OF int_four_digits ) );";
        }
    }
    static final String DFA33_eotS =
        "\110\uffff";
    static final String DFA33_eofS =
        "\57\uffff\27\2\2\uffff";
    static final String DFA33_minS =
        "\1\31\1\24\1\uffff\31\24\2\uffff\2\31\1\122\1\31\11\24\1\31\1\122"+
        "\1\24\1\uffff\27\24\1\25\1\uffff";
    static final String DFA33_maxS =
        "\1\146\1\24\1\uffff\27\24\1\132\1\122\2\uffff\2\77\2\132\11\24\2"+
        "\122\1\24\1\uffff\27\u0087\1\116\1\uffff";
    static final String DFA33_acceptS =
        "\2\uffff\1\1\31\uffff\1\3\1\5\20\uffff\1\2\30\uffff\1\4";
    static final String DFA33_specialS =
        "\110\uffff}>";
    static final String[] DFA33_transitionS = {
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
            "\1\41\27\uffff\1\40\45\uffff\1\47\1\43\1\42\1\50\1\52\1\44"+
            "\1\51\1\45\1\46",
            "\1\53\27\uffff\1\54\45\uffff\1\55",
            "",
            "",
            "\1\56\3\uffff\14\56\2\uffff\1\56\3\uffff\5\2\3\uffff\11\56",
            "\1\102\3\uffff\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76"+
            "\1\77\1\100\1\101\2\uffff\1\105\13\uffff\1\103\1\104\1\57\1"+
            "\60\1\61\1\62\1\63\1\64\1\65",
            "\1\47\1\43\1\42\1\50\1\52\1\44\1\51\1\45\1\46",
            "\1\102\3\uffff\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76"+
            "\1\77\1\100\1\101\2\uffff\1\105\13\uffff\1\103\1\104\1\57\1"+
            "\60\1\61\1\62\1\63\1\64\1\65\22\uffff\1\47\1\43\1\42\1\50\1"+
            "\52\1\44\1\51\1\45\1\46",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\102\3\uffff\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76"+
            "\1\77\1\100\1\101\2\uffff\1\105\13\uffff\1\103\1\104\1\57\1"+
            "\60\1\61\1\62\1\63\1\64\1\65\22\uffff\1\55",
            "\1\55",
            "\1\37",
            "",
            "\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\2\36\uffff\1\107\1\uffff\1\107\21\uffff\7\2",
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
            return "155:1: relative_date : ( relative_prefix WHITE_SPACE relative_target ( 's' )? -> ^( RELATIVE_DATE ^( SEEK relative_prefix relative_target ) ) | implicit_prefix WHITE_SPACE relative_target -> ^( RELATIVE_DATE ^( SEEK implicit_prefix relative_target ) ) | relative_target -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] relative_target ) ) | spelled_or_int_01_to_31_optional_prefix WHITE_SPACE relative_target WHITE_SPACE relative_suffix -> ^( RELATIVE_DATE ^( SEEK relative_suffix spelled_or_int_01_to_31_optional_prefix relative_target ) ) | named_relative_date );";
        }
    }
    static final String DFA72_eotS =
        "\45\uffff";
    static final String DFA72_eofS =
        "\24\uffff\1\37\1\44\17\uffff";
    static final String DFA72_minS =
        "\1\122\23\uffff\2\24\1\122\1\25\13\uffff\1\25\1\uffff";
    static final String DFA72_maxS =
        "\1\146\23\uffff\1\132\1\122\2\132\13\uffff\1\122\1\uffff";
    static final String DFA72_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\4\uffff\1\34\1\32\1\35\1\31\1"+
        "\25\1\30\1\26\1\24\1\27\1\33\1\37\1\uffff\1\36";
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
            "\1\27\1\uffff\1\37\25\uffff\1\26\45\uffff\1\34\1\36\1\40\1"+
            "\35\1\33\1\31\1\41\1\30\1\32",
            "\1\43\1\uffff\1\44\25\uffff\1\42\45\uffff\1\42",
            "\1\34\1\36\1\40\1\35\1\33\1\31\1\41\1\30\1\32",
            "\1\37\3\uffff\1\37\2\uffff\20\37\13\uffff\11\37\10\uffff\12"+
            "\37\1\34\1\36\1\40\1\35\1\33\1\31\1\41\1\30\1\32",
            "",
            "",
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
            return "309:1: spelled_one_to_thirty_one : ( ONE -> INT[\"1\"] | TWO -> INT[\"2\"] | THREE -> INT[\"3\"] | FOUR -> INT[\"4\"] | FIVE -> INT[\"5\"] | SIX -> INT[\"6\"] | SEVEN -> INT[\"7\"] | EIGHT -> INT[\"8\"] | NINE -> INT[\"9\"] | TEN -> INT[\"10\"] | ELEVEN -> INT[\"11\"] | TWELVE -> INT[\"12\"] | THIRTEEN -> INT[\"13\"] | FOURTEEN -> INT[\"14\"] | FIFTEEN -> INT[\"15\"] | SIXTEEN -> INT[\"16\"] | SEVENTEEN -> INT[\"17\"] | EIGHTEEN -> INT[\"18\"] | NINETEEN -> INT[\"19\"] | TWENTY -> INT[\"20\"] | TWENTY ( DASH | WHITE_SPACE )? ONE -> INT[\"21\"] | TWENTY ( DASH | WHITE_SPACE )? TWO -> INT[\"22\"] | TWENTY ( DASH | WHITE_SPACE )? THREE -> INT[\"23\"] | TWENTY ( DASH | WHITE_SPACE )? FOUR -> INT[\"24\"] | TWENTY ( DASH | WHITE_SPACE )? FIVE -> INT[\"25\"] | TWENTY ( DASH | WHITE_SPACE )? SIX -> INT[\"26\"] | TWENTY ( DASH | WHITE_SPACE )? SEVEN -> INT[\"27\"] | TWENTY ( DASH | WHITE_SPACE )? EIGHT -> INT[\"28\"] | TWENTY ( DASH | WHITE_SPACE )? NINE -> INT[\"29\"] | THIRTY -> INT[\"30\"] | THIRTY ( DASH | WHITE_SPACE )? ONE -> INT[\"31\"] );";
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
            return "344:1: spelled_first_to_thirty_first : ( FIRST -> INT[\"1\"] | SECOND -> INT[\"2\"] | THIRD -> INT[\"3\"] | FOURTH -> INT[\"4\"] | FIFTH -> INT[\"5\"] | SIXTH -> INT[\"6\"] | SEVENTH -> INT[\"7\"] | EIGHTH -> INT[\"8\"] | NINTH -> INT[\"9\"] | TENTH -> INT[\"10\"] | ELEVENTH -> INT[\"11\"] | TWELFTH -> INT[\"12\"] | THIRTEENTH -> INT[\"13\"] | FOURTEENTH -> INT[\"14\"] | FIFTEENTH -> INT[\"15\"] | SIXTEENTH -> INT[\"16\"] | SEVENTEENTH -> INT[\"17\"] | EIGHTEENTH -> INT[\"18\"] | NINETEENTH -> INT[\"19\"] | TWENTIETH -> INT[\"20\"] | ( TWENTY_FIRST | ( TWENTY ( DASH | WHITE_SPACE )? FIRST ) ) -> INT[\"21\"] | ( TWENTY_SECOND | ( TWENTY ( DASH | WHITE_SPACE )? SECOND ) ) -> INT[\"22\"] | ( TWENTY_THIRD | ( TWENTY ( DASH | WHITE_SPACE )? THIRD ) ) -> INT[\"23\"] | ( TWENTY_FOURTH | ( TWENTY ( DASH | WHITE_SPACE )? FOURTH ) ) -> INT[\"24\"] | ( TWENTY_FIFTH | ( TWENTY ( DASH | WHITE_SPACE )? FIFTH ) ) -> INT[\"25\"] | ( TWENTY_SIXTH | ( TWENTY ( DASH | WHITE_SPACE )? SIXTH ) ) -> INT[\"26\"] | ( TWENTY_SEVENTH | ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH ) ) -> INT[\"27\"] | ( TWENTY_EIGHTH | ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH ) ) -> INT[\"28\"] | ( TWENTY_NINTH | ( TWENTY ( DASH | WHITE_SPACE )? NINTH ) ) -> INT[\"29\"] | THIRTIETH -> INT[\"30\"] | ( THIRTY_FIRST | ( THIRTY ( DASH | WHITE_SPACE )? FIRST ) ) -> INT[\"31\"] );";
        }
    }
 

    public static final BitSet FOLLOW_date_in_date_time158 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_date_time_separator_in_date_time161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000007F00L});
    public static final BitSet FOLLOW_time_in_date_time163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_in_date_time182 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_time_date_separator_in_date_time185 = new BitSet(new long[]{0xFF8FCDFFE3000000L,0xFFFFFFFFFFFFF807L,0x000000000000003FL});
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
    public static final BitSet FOLLOW_relaxed_date_in_date301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formal_date_in_date307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relative_date_in_date313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_global_date_prefix_in_date319 = new BitSet(new long[]{0xFF8FCDFFE3000000L,0xFFFFFFFFFFFFF807L,0x000000000000003FL});
    public static final BitSet FOLLOW_date_in_date321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_global_date_prefix358 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_global_date_prefix360 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_DAY_in_global_date_prefix364 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_global_date_prefix366 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_AFTER_in_global_date_prefix368 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_global_date_prefix370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_global_date_prefix402 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_global_date_prefix404 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_DAY_in_global_date_prefix408 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_global_date_prefix410 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_BEFORE_in_global_date_prefix412 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_global_date_prefix414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_relaxed_date512 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date514 = new BitSet(new long[]{0x0000000001000000L,0xFFFFFFFFFFFCF000L,0x000000000000003FL});
    public static final BitSet FOLLOW_relaxed_day_of_month_in_relaxed_date518 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date520 = new BitSet(new long[]{0x000001FFF0000000L});
    public static final BitSet FOLLOW_OF_in_relaxed_date523 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date525 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_relaxed_month_in_relaxed_date529 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_relaxed_year_in_relaxed_date531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relaxed_month_in_relaxed_date565 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date567 = new BitSet(new long[]{0x0000000001000000L,0xFFFFFFFFFFFCF000L,0x000000000000003FL});
    public static final BitSet FOLLOW_relaxed_day_of_month_in_relaxed_date569 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_relaxed_year_in_relaxed_date571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_relaxed_date587 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date589 = new BitSet(new long[]{0x0000000001000000L,0xFFFFFFFFFFFCF000L,0x000000000000003FL});
    public static final BitSet FOLLOW_relaxed_day_of_month_in_relaxed_date593 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date595 = new BitSet(new long[]{0x000001FFF0000000L});
    public static final BitSet FOLLOW_OF_in_relaxed_date598 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date600 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_relaxed_month_in_relaxed_date604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_relaxed_date622 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date624 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_relaxed_month_in_relaxed_date628 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date630 = new BitSet(new long[]{0x0000000001000000L,0xFFFFFFFFFFFCF000L,0x000000000000003FL});
    public static final BitSet FOLLOW_relaxed_day_of_month_in_relaxed_date632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JANUARY_in_relaxed_month664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FEBRUARY_in_relaxed_month681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MARCH_in_relaxed_month697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APRIL_in_relaxed_month716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAY_in_relaxed_month735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JUNE_in_relaxed_month756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JULY_in_relaxed_month776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AUGUST_in_relaxed_month796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEPTEMBER_in_relaxed_month814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OCTOBER_in_relaxed_month829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOVEMBER_in_relaxed_month846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECEMBER_in_relaxed_month862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_relaxed_day_of_month887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_first_to_thirty_first_in_relaxed_day_of_month914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relaxed_year_prefix_in_relaxed_year944 = new BitSet(new long[]{0x0000020000000000L,0x000000000003E800L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_in_relaxed_year946 = new BitSet(new long[]{0x0000000000000000L,0x000000000003E800L});
    public static final BitSet FOLLOW_int_00_to_99_mandatory_prefix_in_relaxed_year949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relaxed_year_prefix_in_relaxed_year976 = new BitSet(new long[]{0x0000000000000000L,0x000000000003E800L});
    public static final BitSet FOLLOW_int_four_digits_in_relaxed_year978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_relaxed_year_prefix1008 = new BitSet(new long[]{0x0000040000100002L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1010 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1015 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_IN_in_relaxed_year_prefix1019 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1021 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_THE_in_relaxed_year_prefix1023 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1025 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_YEAR_in_relaxed_year_prefix1027 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formal_year_four_digits_in_formal_date1053 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_formal_date_separator_in_formal_date1055 = new BitSet(new long[]{0x0000000000000000L,0x000000000003F800L});
    public static final BitSet FOLLOW_formal_month_of_year_in_formal_date1057 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_formal_date_separator_in_formal_date1059 = new BitSet(new long[]{0x0000000000000000L,0x000000000000F000L});
    public static final BitSet FOLLOW_formal_day_of_month_in_formal_date1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formal_month_of_year_in_formal_date1090 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_formal_date_separator_in_formal_date1092 = new BitSet(new long[]{0x0000000000000000L,0x000000000000F000L});
    public static final BitSet FOLLOW_formal_day_of_month_in_formal_date1094 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_formal_date_separator_in_formal_date1097 = new BitSet(new long[]{0x0000000000000000L,0x000000000003E800L});
    public static final BitSet FOLLOW_formal_year_in_formal_date1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_01_to_12_optional_prefix_in_formal_month_of_year1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_01_to_31_optional_prefix_in_formal_day_of_month1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formal_year_four_digits_in_formal_year1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_00_to_99_mandatory_prefix_in_formal_year1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_four_digits_in_formal_year_four_digits1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_formal_date_separator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relative_prefix_in_relative_date1257 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_date1259 = new BitSet(new long[]{0xFF8009FFE2000000L});
    public static final BitSet FOLLOW_relative_target_in_relative_date1261 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_relative_date1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implicit_prefix_in_relative_date1297 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_date1299 = new BitSet(new long[]{0xFF8009FFE2000000L});
    public static final BitSet FOLLOW_relative_target_in_relative_date1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relative_target_in_relative_date1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_relative_date1378 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_date1380 = new BitSet(new long[]{0xFF8009FFE2000000L});
    public static final BitSet FOLLOW_relative_target_in_relative_date1382 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_date1384 = new BitSet(new long[]{0x0050000000000000L});
    public static final BitSet FOLLOW_relative_suffix_in_relative_date1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_named_relative_date_in_relative_date1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_day_of_week_in_relative_target1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relaxed_month_in_relative_target1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relative_date_span_in_relative_target1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_implicit_prefix1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_relative_prefix1493 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_prefix1495 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LAST_in_relative_prefix1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_relative_prefix1521 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_prefix1523 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_NEXT_in_relative_prefix1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_relative_prefix1549 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_prefix1551 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_PAST_in_relative_prefix1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_relative_prefix1577 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_prefix1579 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_COMING_in_relative_prefix1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_relative_prefix1603 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_prefix1605 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_UPCOMING_in_relative_prefix1609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_relative_prefix1627 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_prefix1629 = new BitSet(new long[]{0x0000000000000000L,0x0000007FFFFCF000L});
    public static final BitSet FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_relative_prefix1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FROM_in_relative_suffix1665 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_suffix1667 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_NOW_in_relative_suffix1669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AGO_in_relative_suffix1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DAY_in_relative_date_span1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEEK_in_relative_date_span1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MONTH_in_relative_date_span1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YEAR_in_relative_date_span1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUNDAY_in_day_of_week1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MONDAY_in_day_of_week1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TUESDAY_in_day_of_week1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEDNESDAY_in_day_of_week1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THURSDAY_in_day_of_week1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FRIDAY_in_day_of_week1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SATURDAY_in_day_of_week1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TODAY_in_named_relative_date1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOMORROW_in_named_relative_date1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YESTERDAY_in_named_relative_date1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hours_in_time2007 = new BitSet(new long[]{0x0000000000000000L,0x000000000001E808L});
    public static final BitSet FOLLOW_COLON_in_time2009 = new BitSet(new long[]{0x0000000000000000L,0x000000000001E808L});
    public static final BitSet FOLLOW_minutes_in_time2012 = new BitSet(new long[]{0x0000000000100002L,0x00000000000000F0L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_time2015 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_meridian_indicator_in_time2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MILITARY_HOUR_SUFFIX_in_time2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOUR_in_time2028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hours_in_time2064 = new BitSet(new long[]{0x0000000000100002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_time2066 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_meridian_indicator_in_time2069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_named_time_in_time2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_00_to_23_optional_prefix_in_hours2122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_00_to_59_mandatory_prefix_in_minutes2146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AM_in_meridian_indicator2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PM_in_meridian_indicator2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOON_in_named_time2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MIDNIGHT_in_named_time2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_0_in_int_00_to_23_optional_prefix2279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_00_in_int_00_to_23_optional_prefix2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_1_TO_9_in_int_00_to_23_optional_prefix2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_01_TO_12_in_int_00_to_23_optional_prefix2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_13_TO_23_in_int_00_to_23_optional_prefix2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_00_in_int_00_to_59_mandatory_prefix2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_01_TO_12_in_int_00_to_59_mandatory_prefix2331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_13_TO_23_in_int_00_to_59_mandatory_prefix2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_24_TO_31_in_int_00_to_59_mandatory_prefix2343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_32_TO_59_in_int_00_to_59_mandatory_prefix2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_00_to_59_mandatory_prefix_in_int_00_to_99_mandatory_prefix2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_60_TO_99_in_int_00_to_99_mandatory_prefix2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_1_TO_9_in_int_01_to_12_optional_prefix2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_01_TO_12_in_int_01_to_12_optional_prefix2405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_1_TO_9_in_int_01_to_31_optional_prefix2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_01_TO_12_in_int_01_to_31_optional_prefix2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_13_TO_23_in_int_01_to_31_optional_prefix2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_24_TO_31_in_int_01_to_31_optional_prefix2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_00_to_99_mandatory_prefix_in_int_four_digits2468 = new BitSet(new long[]{0x0000000000000000L,0x000000000003E800L});
    public static final BitSet FOLLOW_int_00_to_99_mandatory_prefix_in_int_four_digits2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_01_to_31_optional_prefix_in_spelled_or_int_01_to_31_optional_prefix2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_one_to_thirty_one_in_spelled_or_int_01_to_31_optional_prefix2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_in_spelled_one_to_thirty_one2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWO_in_spelled_one_to_thirty_one2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THREE_in_spelled_one_to_thirty_one2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOUR_in_spelled_one_to_thirty_one2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIVE_in_spelled_one_to_thirty_one2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIX_in_spelled_one_to_thirty_one2606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVEN_in_spelled_one_to_thirty_one2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHT_in_spelled_one_to_thirty_one2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINE_in_spelled_one_to_thirty_one2656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEN_in_spelled_one_to_thirty_one2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEVEN_in_spelled_one_to_thirty_one2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWELVE_in_spelled_one_to_thirty_one2706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_in_spelled_one_to_thirty_one2721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOURTEEN_in_spelled_one_to_thirty_one2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIFTEEN_in_spelled_one_to_thirty_one2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTEEN_in_spelled_one_to_thirty_one2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVENTEEN_in_spelled_one_to_thirty_one2775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHTEEN_in_spelled_one_to_thirty_one2787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINETEEN_in_spelled_one_to_thirty_one2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one2828 = new BitSet(new long[]{0x0000100000100000L,0x0000000000040000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one2831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2835 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ONE_in_spelled_one_to_thirty_one2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one2852 = new BitSet(new long[]{0x0000100000100000L,0x0000000000080000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one2855 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_TWO_in_spelled_one_to_thirty_one2863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one2876 = new BitSet(new long[]{0x0000100000100000L,0x0000000000100000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one2879 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2883 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_THREE_in_spelled_one_to_thirty_one2887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one2898 = new BitSet(new long[]{0x0000100000100000L,0x0000000000200000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one2901 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2905 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_FOUR_in_spelled_one_to_thirty_one2909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one2921 = new BitSet(new long[]{0x0000100000100000L,0x0000000000400000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one2924 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2928 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_FIVE_in_spelled_one_to_thirty_one2932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one2944 = new BitSet(new long[]{0x0000100000100000L,0x0000000000800000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one2947 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2951 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_SIX_in_spelled_one_to_thirty_one2955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one2968 = new BitSet(new long[]{0x0000100000100000L,0x0000000001000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one2971 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2975 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_SEVEN_in_spelled_one_to_thirty_one2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one2990 = new BitSet(new long[]{0x0000100000100000L,0x0000000002000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one2993 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2997 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_EIGHT_in_spelled_one_to_thirty_one3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one3012 = new BitSet(new long[]{0x0000100000100000L,0x0000000004000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one3015 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3019 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_NINE_in_spelled_one_to_thirty_one3023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_in_spelled_one_to_thirty_one3035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_in_spelled_one_to_thirty_one3074 = new BitSet(new long[]{0x0000100000100000L,0x0000000000040000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one3077 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3081 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ONE_in_spelled_one_to_thirty_one3085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIRST_in_spelled_first_to_thirty_first3108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SECOND_in_spelled_first_to_thirty_first3125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRD_in_spelled_first_to_thirty_first3141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOURTH_in_spelled_first_to_thirty_first3158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIFTH_in_spelled_first_to_thirty_first3174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTH_in_spelled_first_to_thirty_first3191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVENTH_in_spelled_first_to_thirty_first3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHTH_in_spelled_first_to_thirty_first3223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINTH_in_spelled_first_to_thirty_first3239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TENTH_in_spelled_first_to_thirty_first3256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEVENTH_in_spelled_first_to_thirty_first3273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWELFTH_in_spelled_first_to_thirty_first3287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEENTH_in_spelled_first_to_thirty_first3302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOURTEENTH_in_spelled_first_to_thirty_first3314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIFTEENTH_in_spelled_first_to_thirty_first3326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTEENTH_in_spelled_first_to_thirty_first3339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVENTEENTH_in_spelled_first_to_thirty_first3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHTEENTH_in_spelled_first_to_thirty_first3363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINETEENTH_in_spelled_first_to_thirty_first3375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTIETH_in_spelled_first_to_thirty_first3387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FIRST_in_spelled_first_to_thirty_first3401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3408 = new BitSet(new long[]{0x0000100000100000L,0x0000008000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3411 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3415 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_FIRST_in_spelled_first_to_thirty_first3419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_SECOND_in_spelled_first_to_thirty_first3435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3441 = new BitSet(new long[]{0x0000100000100000L,0x0000010000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3444 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3448 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_SECOND_in_spelled_first_to_thirty_first3452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_THIRD_in_spelled_first_to_thirty_first3467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3474 = new BitSet(new long[]{0x0000100000100000L,0x0000020000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3477 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3481 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_THIRD_in_spelled_first_to_thirty_first3485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FOURTH_in_spelled_first_to_thirty_first3501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3507 = new BitSet(new long[]{0x0000100000100000L,0x0000040000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3510 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3514 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_FOURTH_in_spelled_first_to_thirty_first3518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FIFTH_in_spelled_first_to_thirty_first3533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3540 = new BitSet(new long[]{0x0000100000100000L,0x0000080000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3543 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3547 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_FIFTH_in_spelled_first_to_thirty_first3551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_SIXTH_in_spelled_first_to_thirty_first3567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3574 = new BitSet(new long[]{0x0000100000100000L,0x0000100000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3577 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3581 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_SIXTH_in_spelled_first_to_thirty_first3585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_SEVENTH_in_spelled_first_to_thirty_first3601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3606 = new BitSet(new long[]{0x0000100000100000L,0x0000200000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3609 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3613 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_SEVENTH_in_spelled_first_to_thirty_first3617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_EIGHTH_in_spelled_first_to_thirty_first3631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3637 = new BitSet(new long[]{0x0000100000100000L,0x0000400000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3640 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3644 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_EIGHTH_in_spelled_first_to_thirty_first3648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_NINTH_in_spelled_first_to_thirty_first3663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3670 = new BitSet(new long[]{0x0000100000100000L,0x0000800000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3673 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3677 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_NINTH_in_spelled_first_to_thirty_first3681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTIETH_in_spelled_first_to_thirty_first3696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_FIRST_in_spelled_first_to_thirty_first3756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_in_spelled_first_to_thirty_first3763 = new BitSet(new long[]{0x0000100000100000L,0x0000008000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3766 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3770 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_FIRST_in_spelled_first_to_thirty_first3774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_in_synpred1_Date139 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_date_time_separator_in_synpred1_Date142 = new BitSet(new long[]{0x0000000000000000L,0x0000000000007F00L});
    public static final BitSet FOLLOW_time_in_synpred1_Date144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relaxed_date_in_synpred2_Date297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_synpred3_Date480 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_synpred3_Date482 = new BitSet(new long[]{0x0000000001000000L,0xFFFFFFFFFFFCF000L,0x000000000000003FL});
    public static final BitSet FOLLOW_relaxed_day_of_month_in_synpred3_Date486 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_synpred3_Date488 = new BitSet(new long[]{0x000001FFF0000000L});
    public static final BitSet FOLLOW_OF_in_synpred3_Date491 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_synpred3_Date493 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_relaxed_month_in_synpred3_Date497 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_relaxed_year_in_synpred3_Date499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relaxed_month_in_synpred4_Date547 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_synpred4_Date549 = new BitSet(new long[]{0x0000000001000000L,0xFFFFFFFFFFFCF000L,0x000000000000003FL});
    public static final BitSet FOLLOW_relaxed_day_of_month_in_synpred4_Date551 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_relaxed_year_in_synpred4_Date553 = new BitSet(new long[]{0x0000000000000002L});

}