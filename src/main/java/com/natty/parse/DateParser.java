// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g 2010-01-27 23:20:48
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DATE_TIME", "EXPLICIT_DATE", "RELATIVE_DATE", "EXPLICIT_TIME", "AM_PM", "MONTH", "DAY_OF_WEEK", "DAY_OF_MONTH", "YEAR", "SPAN", "ERA", "HOURS", "MINUTES", "INTEGER", "SEEK_DIRECTION", "SEEK_TYPE", "ONE_TO_TWELVE", "DASH", "THIRTEEN_TO_TWENTY_FOUR", "TWENTY_FIVE_TO_THIRTY_ONE", "TWO_ZEROS", "THIRTY_TWO_TO_FIFTY_NINE", "SIXTY_TO_NINETY_NINE", "THREE_DIGIT", "FOUR_DIGIT", "DIGIT", "SLASH", "WHITE_SPACE", "'at'", "'on'", "','", "'of'", "':'", "'midnight'", "'noon'", "'s'", "'this'", "'last'", "'next'", "'past'", "'coming'", "'upcoming'", "'in'", "'from now'", "'ago'", "'day'", "'week'", "'month'", "'year'", "'january'", "'jan'", "'february'", "'feb'", "'march'", "'mar'", "'april'", "'apr'", "'may'", "'june'", "'jun'", "'july'", "'jul'", "'august'", "'aug'", "'september'", "'sep'", "'october'", "'oct'", "'november'", "'nov'", "'december'", "'dec'", "'monday'", "'mon'", "'tuesday'", "'tue'", "'tues'", "'wednesday'", "'wed'", "'thursday'", "'thur'", "'thurs'", "'friday'", "'fri'", "'saturday'", "'sat'", "'weekend'", "'sunday'", "'sun'", "'first'", "'1st'", "'second'", "'2nd'", "'third'", "'3rd'", "'fourth'", "'4th'", "'fifth'", "'5th'", "'sixth'", "'6th'", "'seventh'", "'7th'", "'eighth'", "'8th'", "'ninth'", "'9th'", "'tenth'", "'10th'", "'eleventh'", "'11th'", "'twelfth'", "'12th'", "'thirteenth'", "'13th'", "'fourteenth'", "'14th'", "'fifteenth'", "'15th'", "'sixteenth'", "'16th'", "'seventeenth'", "'17th'", "'eighteenth'", "'18th'", "'nineteenth'", "'19th'", "'twentieth'", "'20th'", "'twenty'", "'21st'", "'22nd'", "'23rd'", "'24th'", "'25th'", "'26th'", "'27th'", "'28th'", "'29th'", "'thirtieth'", "'30th'", "'thirty'", "'31st'", "'\\''", "'the'", "'am'", "'a.m.'", "'a'", "'pm'", "'p.m.'", "'p'", "'today'", "'yesterday'", "'day after '", "'day before yesterday'", "'tomorow'", "'tomorrow'", "'tommorow'", "'tommorrow'", "'one'", "'two'", "'three'", "'four'", "'five'", "'six'", "'seven'", "'eight'", "'nine'", "'ten'", "'eleven'", "'twelve'", "'thirteen'", "'fourteen'", "'fifteen'", "'sixteen'", "'seventeen'", "'eighteen'", "'nineteen'"
    };
    public static final int T__159=159;
    public static final int T__158=158;
    public static final int T__160=160;
    public static final int T__167=167;
    public static final int T__168=168;
    public static final int EOF=-1;
    public static final int T__165=165;
    public static final int T__166=166;
    public static final int MONTH=9;
    public static final int T__163=163;
    public static final int T__164=164;
    public static final int T__161=161;
    public static final int T__162=162;
    public static final int DATE_TIME=4;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int AM_PM=8;
    public static final int T__92=92;
    public static final int SIXTY_TO_NINETY_NINE=26;
    public static final int T__148=148;
    public static final int T__147=147;
    public static final int T__90=90;
    public static final int T__149=149;
    public static final int SPAN=13;
    public static final int T__154=154;
    public static final int T__155=155;
    public static final int T__156=156;
    public static final int T__157=157;
    public static final int T__99=99;
    public static final int T__150=150;
    public static final int T__98=98;
    public static final int T__151=151;
    public static final int T__97=97;
    public static final int T__152=152;
    public static final int T__96=96;
    public static final int RELATIVE_DATE=6;
    public static final int T__153=153;
    public static final int T__95=95;
    public static final int FOUR_DIGIT=28;
    public static final int T__139=139;
    public static final int T__138=138;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int DAY_OF_WEEK=10;
    public static final int EXPLICIT_DATE=5;
    public static final int T__141=141;
    public static final int T__85=85;
    public static final int T__142=142;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__140=140;
    public static final int T__86=86;
    public static final int T__145=145;
    public static final int T__89=89;
    public static final int T__146=146;
    public static final int T__88=88;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int T__127=127;
    public static final int T__71=71;
    public static final int T__129=129;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int EXPLICIT_TIME=7;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__130=130;
    public static final int T__74=74;
    public static final int T__131=131;
    public static final int T__73=73;
    public static final int T__132=132;
    public static final int THIRTY_TWO_TO_FIFTY_NINE=25;
    public static final int TWENTY_FIVE_TO_THIRTY_ONE=23;
    public static final int T__133=133;
    public static final int T__79=79;
    public static final int T__134=134;
    public static final int T__78=78;
    public static final int T__135=135;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int YEAR=12;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int T__61=61;
    public static final int THREE_DIGIT=27;
    public static final int T__60=60;
    public static final int WHITE_SPACE=31;
    public static final int SEEK_TYPE=19;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int SLASH=30;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__59=59;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int TWO_ZEROS=24;
    public static final int DIGIT=29;
    public static final int T__50=50;
    public static final int INTEGER=17;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int DASH=21;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__180=180;
    public static final int SEEK_DIRECTION=18;
    public static final int T__181=181;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int MINUTES=16;
    public static final int T__175=175;
    public static final int T__174=174;
    public static final int T__173=173;
    public static final int T__172=172;
    public static final int T__32=32;
    public static final int T__179=179;
    public static final int T__33=33;
    public static final int T__178=178;
    public static final int T__34=34;
    public static final int T__177=177;
    public static final int T__35=35;
    public static final int THIRTEEN_TO_TWENTY_FOUR=22;
    public static final int T__176=176;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int ERA=14;
    public static final int T__171=171;
    public static final int DAY_OF_MONTH=11;
    public static final int T__170=170;
    public static final int ONE_TO_TWELVE=20;
    public static final int T__169=169;
    public static final int HOURS=15;

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:51:1: datetime options {backtrack=true; } : ( date ( 'at' )? ( time )? -> ^( DATE_TIME date ( time )? ) | time ( 'on' )? date -> ^( DATE_TIME date time ) | time -> ^( DATE_TIME ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"0\"] ) time ) );
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
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleSubtreeStream stream_time=new RewriteRuleSubtreeStream(adaptor,"rule time");
        RewriteRuleSubtreeStream stream_date=new RewriteRuleSubtreeStream(adaptor,"rule date");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:53:3: ( date ( 'at' )? ( time )? -> ^( DATE_TIME date ( time )? ) | time ( 'on' )? date -> ^( DATE_TIME date time ) | time -> ^( DATE_TIME ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"0\"] ) time ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:53:5: date ( 'at' )? ( time )?
                    {
                    pushFollow(FOLLOW_date_in_datetime195);
                    date1=date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_date.add(date1.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:53:10: ( 'at' )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==32) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:53:10: 'at'
                            {
                            string_literal2=(Token)match(input,32,FOLLOW_32_in_datetime197); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_32.add(string_literal2);


                            }
                            break;

                    }

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:53:16: ( time )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==ONE_TO_TWELVE||LA2_0==THIRTEEN_TO_TWENTY_FOUR||LA2_0==TWO_ZEROS||(LA2_0>=37 && LA2_0<=38)) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:53:16: time
                            {
                            pushFollow(FOLLOW_time_in_datetime200);
                            time3=time();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_time.add(time3.getTree());

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
                    // 53:22: -> ^( DATE_TIME date ( time )? )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:53:25: ^( DATE_TIME date ( time )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DATE_TIME, "DATE_TIME"), root_1);

                        adaptor.addChild(root_1, stream_date.nextTree());
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:53:42: ( time )?
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:54:5: time ( 'on' )? date
                    {
                    pushFollow(FOLLOW_time_in_datetime218);
                    time4=time();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_time.add(time4.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:54:10: ( 'on' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==33) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:54:10: 'on'
                            {
                            string_literal5=(Token)match(input,33,FOLLOW_33_in_datetime220); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_33.add(string_literal5);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_date_in_datetime223);
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
                    // 54:21: -> ^( DATE_TIME date time )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:54:24: ^( DATE_TIME date time )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:55:5: time
                    {
                    pushFollow(FOLLOW_time_in_datetime239);
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
                    // 55:10: -> ^( DATE_TIME ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"0\"] ) time )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:55:13: ^( DATE_TIME ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"0\"] ) time )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DATE_TIME, "DATE_TIME"), root_1);

                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:55:25: ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"0\"] )
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:58:1: date options {backtrack=true; } : ( relative_date | explicit_date );
    public final DateParser.date_return date() throws RecognitionException {
        DateParser.date_return retval = new DateParser.date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.relative_date_return relative_date8 = null;

        DateParser.explicit_date_return explicit_date9 = null;



        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:60:3: ( relative_date | explicit_date )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:60:5: relative_date
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_relative_date_in_date281);
                    relative_date8=relative_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, relative_date8.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:61:5: explicit_date
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_explicit_date_in_date288);
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:64:1: time : explicit_time ;
    public final DateParser.time_return time() throws RecognitionException {
        DateParser.time_return retval = new DateParser.time_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.explicit_time_return explicit_time10 = null;



        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:65:3: ( explicit_time )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:65:5: explicit_time
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_explicit_time_in_time304);
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:68:1: relative_date : ( today_or_tomorrow | relative_prefix modifiable_target -> ^( RELATIVE_DATE relative_prefix modifiable_target ) | numeric_or_natural_integer modifiable_target relative_suffix -> ^( RELATIVE_DATE relative_suffix numeric_or_natural_integer modifiable_target ) );
    public final DateParser.relative_date_return relative_date() throws RecognitionException {
        DateParser.relative_date_return retval = new DateParser.relative_date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.today_or_tomorrow_return today_or_tomorrow11 = null;

        DateParser.relative_prefix_return relative_prefix12 = null;

        DateParser.modifiable_target_return modifiable_target13 = null;

        DateParser.numeric_or_natural_integer_return numeric_or_natural_integer14 = null;

        DateParser.modifiable_target_return modifiable_target15 = null;

        DateParser.relative_suffix_return relative_suffix16 = null;


        RewriteRuleSubtreeStream stream_relative_suffix=new RewriteRuleSubtreeStream(adaptor,"rule relative_suffix");
        RewriteRuleSubtreeStream stream_relative_prefix=new RewriteRuleSubtreeStream(adaptor,"rule relative_prefix");
        RewriteRuleSubtreeStream stream_modifiable_target=new RewriteRuleSubtreeStream(adaptor,"rule modifiable_target");
        RewriteRuleSubtreeStream stream_numeric_or_natural_integer=new RewriteRuleSubtreeStream(adaptor,"rule numeric_or_natural_integer");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:69:3: ( today_or_tomorrow | relative_prefix modifiable_target -> ^( RELATIVE_DATE relative_prefix modifiable_target ) | numeric_or_natural_integer modifiable_target relative_suffix -> ^( RELATIVE_DATE relative_suffix numeric_or_natural_integer modifiable_target ) )
            int alt6=3;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:69:5: today_or_tomorrow
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_today_or_tomorrow_in_relative_date317);
                    today_or_tomorrow11=today_or_tomorrow();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, today_or_tomorrow11.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:71:5: relative_prefix modifiable_target
                    {
                    pushFollow(FOLLOW_relative_prefix_in_relative_date326);
                    relative_prefix12=relative_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_prefix.add(relative_prefix12.getTree());
                    pushFollow(FOLLOW_modifiable_target_in_relative_date328);
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
                    // 72:5: -> ^( RELATIVE_DATE relative_prefix modifiable_target )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:72:8: ^( RELATIVE_DATE relative_prefix modifiable_target )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:74:5: numeric_or_natural_integer modifiable_target relative_suffix
                    {
                    pushFollow(FOLLOW_numeric_or_natural_integer_in_relative_date354);
                    numeric_or_natural_integer14=numeric_or_natural_integer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_numeric_or_natural_integer.add(numeric_or_natural_integer14.getTree());
                    pushFollow(FOLLOW_modifiable_target_in_relative_date356);
                    modifiable_target15=modifiable_target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifiable_target.add(modifiable_target15.getTree());
                    pushFollow(FOLLOW_relative_suffix_in_relative_date358);
                    relative_suffix16=relative_suffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_suffix.add(relative_suffix16.getTree());


                    // AST REWRITE
                    // elements: modifiable_target, relative_suffix, numeric_or_natural_integer
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 75:5: -> ^( RELATIVE_DATE relative_suffix numeric_or_natural_integer modifiable_target )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:75:8: ^( RELATIVE_DATE relative_suffix numeric_or_natural_integer modifiable_target )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        adaptor.addChild(root_1, stream_relative_suffix.nextTree());
                        adaptor.addChild(root_1, stream_numeric_or_natural_integer.nextTree());
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:79:1: explicit_date : ( numeric_month separator numeric_day_of_month ( separator numeric_year )? -> ^( EXPLICIT_DATE numeric_month numeric_day_of_month ( numeric_year )? ) | numeric_four_digit_year separator numeric_month separator numeric_day_of_month -> ^( EXPLICIT_DATE numeric_month numeric_day_of_month numeric_four_digit_year ) | month day_of_month ( ( ',' )? year )? -> ^( EXPLICIT_DATE month day_of_month ( year )? ) | day_of_month ( 'of' )? month ( ( ',' )? year )? -> ^( EXPLICIT_DATE month day_of_month ( year )? ) );
    public final DateParser.explicit_date_return explicit_date() throws RecognitionException {
        DateParser.explicit_date_return retval = new DateParser.explicit_date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal29=null;
        Token string_literal32=null;
        Token char_literal34=null;
        DateParser.numeric_month_return numeric_month17 = null;

        DateParser.separator_return separator18 = null;

        DateParser.numeric_day_of_month_return numeric_day_of_month19 = null;

        DateParser.separator_return separator20 = null;

        DateParser.numeric_year_return numeric_year21 = null;

        DateParser.numeric_four_digit_year_return numeric_four_digit_year22 = null;

        DateParser.separator_return separator23 = null;

        DateParser.numeric_month_return numeric_month24 = null;

        DateParser.separator_return separator25 = null;

        DateParser.numeric_day_of_month_return numeric_day_of_month26 = null;

        DateParser.month_return month27 = null;

        DateParser.day_of_month_return day_of_month28 = null;

        DateParser.year_return year30 = null;

        DateParser.day_of_month_return day_of_month31 = null;

        DateParser.month_return month33 = null;

        DateParser.year_return year35 = null;


        Object char_literal29_tree=null;
        Object string_literal32_tree=null;
        Object char_literal34_tree=null;
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleSubtreeStream stream_numeric_month=new RewriteRuleSubtreeStream(adaptor,"rule numeric_month");
        RewriteRuleSubtreeStream stream_numeric_day_of_month=new RewriteRuleSubtreeStream(adaptor,"rule numeric_day_of_month");
        RewriteRuleSubtreeStream stream_numeric_year=new RewriteRuleSubtreeStream(adaptor,"rule numeric_year");
        RewriteRuleSubtreeStream stream_month=new RewriteRuleSubtreeStream(adaptor,"rule month");
        RewriteRuleSubtreeStream stream_year=new RewriteRuleSubtreeStream(adaptor,"rule year");
        RewriteRuleSubtreeStream stream_day_of_month=new RewriteRuleSubtreeStream(adaptor,"rule day_of_month");
        RewriteRuleSubtreeStream stream_numeric_four_digit_year=new RewriteRuleSubtreeStream(adaptor,"rule numeric_four_digit_year");
        RewriteRuleSubtreeStream stream_separator=new RewriteRuleSubtreeStream(adaptor,"rule separator");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:80:3: ( numeric_month separator numeric_day_of_month ( separator numeric_year )? -> ^( EXPLICIT_DATE numeric_month numeric_day_of_month ( numeric_year )? ) | numeric_four_digit_year separator numeric_month separator numeric_day_of_month -> ^( EXPLICIT_DATE numeric_month numeric_day_of_month numeric_four_digit_year ) | month day_of_month ( ( ',' )? year )? -> ^( EXPLICIT_DATE month day_of_month ( year )? ) | day_of_month ( 'of' )? month ( ( ',' )? year )? -> ^( EXPLICIT_DATE month day_of_month ( year )? ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case ONE_TO_TWELVE:
                {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==DASH||LA13_1==SLASH) ) {
                    alt13=1;
                }
                else if ( (LA13_1==35||(LA13_1>=53 && LA13_1<=75)) ) {
                    alt13=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
                }
                break;
            case THREE_DIGIT:
            case FOUR_DIGIT:
                {
                alt13=2;
                }
                break;
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
                {
                alt13=3;
                }
                break;
            case THIRTEEN_TO_TWENTY_FOUR:
            case TWENTY_FIVE_TO_THIRTY_ONE:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 145:
            case 146:
                {
                alt13=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:80:5: numeric_month separator numeric_day_of_month ( separator numeric_year )?
                    {
                    pushFollow(FOLLOW_numeric_month_in_explicit_date391);
                    numeric_month17=numeric_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_numeric_month.add(numeric_month17.getTree());
                    pushFollow(FOLLOW_separator_in_explicit_date393);
                    separator18=separator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_separator.add(separator18.getTree());
                    pushFollow(FOLLOW_numeric_day_of_month_in_explicit_date395);
                    numeric_day_of_month19=numeric_day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_numeric_day_of_month.add(numeric_day_of_month19.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:80:50: ( separator numeric_year )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==DASH||LA7_0==SLASH) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:80:51: separator numeric_year
                            {
                            pushFollow(FOLLOW_separator_in_explicit_date398);
                            separator20=separator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_separator.add(separator20.getTree());
                            pushFollow(FOLLOW_numeric_year_in_explicit_date400);
                            numeric_year21=numeric_year();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_numeric_year.add(numeric_year21.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: numeric_year, numeric_day_of_month, numeric_month
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 81:5: -> ^( EXPLICIT_DATE numeric_month numeric_day_of_month ( numeric_year )? )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:81:8: ^( EXPLICIT_DATE numeric_month numeric_day_of_month ( numeric_year )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_1);

                        adaptor.addChild(root_1, stream_numeric_month.nextTree());
                        adaptor.addChild(root_1, stream_numeric_day_of_month.nextTree());
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:81:59: ( numeric_year )?
                        if ( stream_numeric_year.hasNext() ) {
                            adaptor.addChild(root_1, stream_numeric_year.nextTree());

                        }
                        stream_numeric_year.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:83:5: numeric_four_digit_year separator numeric_month separator numeric_day_of_month
                    {
                    pushFollow(FOLLOW_numeric_four_digit_year_in_explicit_date430);
                    numeric_four_digit_year22=numeric_four_digit_year();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_numeric_four_digit_year.add(numeric_four_digit_year22.getTree());
                    pushFollow(FOLLOW_separator_in_explicit_date432);
                    separator23=separator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_separator.add(separator23.getTree());
                    pushFollow(FOLLOW_numeric_month_in_explicit_date434);
                    numeric_month24=numeric_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_numeric_month.add(numeric_month24.getTree());
                    pushFollow(FOLLOW_separator_in_explicit_date436);
                    separator25=separator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_separator.add(separator25.getTree());
                    pushFollow(FOLLOW_numeric_day_of_month_in_explicit_date438);
                    numeric_day_of_month26=numeric_day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_numeric_day_of_month.add(numeric_day_of_month26.getTree());


                    // AST REWRITE
                    // elements: numeric_day_of_month, numeric_month, numeric_four_digit_year
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 84:5: -> ^( EXPLICIT_DATE numeric_month numeric_day_of_month numeric_four_digit_year )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:84:8: ^( EXPLICIT_DATE numeric_month numeric_day_of_month numeric_four_digit_year )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_1);

                        adaptor.addChild(root_1, stream_numeric_month.nextTree());
                        adaptor.addChild(root_1, stream_numeric_day_of_month.nextTree());
                        adaptor.addChild(root_1, stream_numeric_four_digit_year.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:86:5: month day_of_month ( ( ',' )? year )?
                    {
                    pushFollow(FOLLOW_month_in_explicit_date465);
                    month27=month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_month.add(month27.getTree());
                    pushFollow(FOLLOW_day_of_month_in_explicit_date467);
                    day_of_month28=day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_day_of_month.add(day_of_month28.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:86:24: ( ( ',' )? year )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( ((LA9_0>=THREE_DIGIT && LA9_0<=FOUR_DIGIT)||LA9_0==34||LA9_0==46||LA9_0==147) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:86:25: ( ',' )? year
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:86:25: ( ',' )?
                            int alt8=2;
                            int LA8_0 = input.LA(1);

                            if ( (LA8_0==34) ) {
                                alt8=1;
                            }
                            switch (alt8) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:86:25: ','
                                    {
                                    char_literal29=(Token)match(input,34,FOLLOW_34_in_explicit_date470); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_34.add(char_literal29);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_year_in_explicit_date473);
                            year30=year();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_year.add(year30.getTree());

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
                    // 87:5: -> ^( EXPLICIT_DATE month day_of_month ( year )? )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:87:8: ^( EXPLICIT_DATE month day_of_month ( year )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_1);

                        adaptor.addChild(root_1, stream_month.nextTree());
                        adaptor.addChild(root_1, stream_day_of_month.nextTree());
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:87:43: ( year )?
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:89:5: day_of_month ( 'of' )? month ( ( ',' )? year )?
                    {
                    pushFollow(FOLLOW_day_of_month_in_explicit_date503);
                    day_of_month31=day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_day_of_month.add(day_of_month31.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:89:18: ( 'of' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==35) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:89:18: 'of'
                            {
                            string_literal32=(Token)match(input,35,FOLLOW_35_in_explicit_date505); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_35.add(string_literal32);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_month_in_explicit_date508);
                    month33=month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_month.add(month33.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:89:30: ( ( ',' )? year )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( ((LA12_0>=THREE_DIGIT && LA12_0<=FOUR_DIGIT)||LA12_0==34||LA12_0==46||LA12_0==147) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:89:31: ( ',' )? year
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:89:31: ( ',' )?
                            int alt11=2;
                            int LA11_0 = input.LA(1);

                            if ( (LA11_0==34) ) {
                                alt11=1;
                            }
                            switch (alt11) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:89:31: ','
                                    {
                                    char_literal34=(Token)match(input,34,FOLLOW_34_in_explicit_date511); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_34.add(char_literal34);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_year_in_explicit_date514);
                            year35=year();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_year.add(year35.getTree());

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

    public static class explicit_time_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "explicit_time"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:94:1: explicit_time : ( numeric_hours ( meridian_indicator )? -> ^( EXPLICIT_TIME numeric_hours MINUTES[\"0\"] ( meridian_indicator )? ) | numeric_hours ':' numeric_minutes ( meridian_indicator )? -> ^( EXPLICIT_TIME numeric_hours numeric_minutes ( meridian_indicator )? ) | time_identifier );
    public final DateParser.explicit_time_return explicit_time() throws RecognitionException {
        DateParser.explicit_time_return retval = new DateParser.explicit_time_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal39=null;
        DateParser.numeric_hours_return numeric_hours36 = null;

        DateParser.meridian_indicator_return meridian_indicator37 = null;

        DateParser.numeric_hours_return numeric_hours38 = null;

        DateParser.numeric_minutes_return numeric_minutes40 = null;

        DateParser.meridian_indicator_return meridian_indicator41 = null;

        DateParser.time_identifier_return time_identifier42 = null;


        Object char_literal39_tree=null;
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleSubtreeStream stream_numeric_hours=new RewriteRuleSubtreeStream(adaptor,"rule numeric_hours");
        RewriteRuleSubtreeStream stream_meridian_indicator=new RewriteRuleSubtreeStream(adaptor,"rule meridian_indicator");
        RewriteRuleSubtreeStream stream_numeric_minutes=new RewriteRuleSubtreeStream(adaptor,"rule numeric_minutes");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:96:3: ( numeric_hours ( meridian_indicator )? -> ^( EXPLICIT_TIME numeric_hours MINUTES[\"0\"] ( meridian_indicator )? ) | numeric_hours ':' numeric_minutes ( meridian_indicator )? -> ^( EXPLICIT_TIME numeric_hours numeric_minutes ( meridian_indicator )? ) | time_identifier )
            int alt16=3;
            switch ( input.LA(1) ) {
            case TWO_ZEROS:
                {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==36) ) {
                    alt16=2;
                }
                else if ( (LA16_1==EOF||LA16_1==ONE_TO_TWELVE||(LA16_1>=THIRTEEN_TO_TWENTY_FOUR && LA16_1<=FOUR_DIGIT)||LA16_1==33||(LA16_1>=40 && LA16_1<=46)||(LA16_1>=53 && LA16_1<=75)||(LA16_1>=93 && LA16_1<=146)||(LA16_1>=148 && LA16_1<=181)) ) {
                    alt16=1;
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

                if ( (LA16_2==36) ) {
                    alt16=2;
                }
                else if ( (LA16_2==EOF||LA16_2==ONE_TO_TWELVE||(LA16_2>=THIRTEEN_TO_TWENTY_FOUR && LA16_2<=FOUR_DIGIT)||LA16_2==33||(LA16_2>=40 && LA16_2<=46)||(LA16_2>=53 && LA16_2<=75)||(LA16_2>=93 && LA16_2<=146)||(LA16_2>=148 && LA16_2<=181)) ) {
                    alt16=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;
                }
                }
                break;
            case THIRTEEN_TO_TWENTY_FOUR:
                {
                int LA16_3 = input.LA(2);

                if ( (LA16_3==EOF||LA16_3==ONE_TO_TWELVE||(LA16_3>=THIRTEEN_TO_TWENTY_FOUR && LA16_3<=FOUR_DIGIT)||LA16_3==33||(LA16_3>=40 && LA16_3<=46)||(LA16_3>=53 && LA16_3<=75)||(LA16_3>=93 && LA16_3<=146)||(LA16_3>=148 && LA16_3<=181)) ) {
                    alt16=1;
                }
                else if ( (LA16_3==36) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 3, input);

                    throw nvae;
                }
                }
                break;
            case 37:
            case 38:
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:96:5: numeric_hours ( meridian_indicator )?
                    {
                    pushFollow(FOLLOW_numeric_hours_in_explicit_time555);
                    numeric_hours36=numeric_hours();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_numeric_hours.add(numeric_hours36.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:96:19: ( meridian_indicator )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( ((LA14_0>=149 && LA14_0<=154)) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:96:19: meridian_indicator
                            {
                            pushFollow(FOLLOW_meridian_indicator_in_explicit_time557);
                            meridian_indicator37=meridian_indicator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_meridian_indicator.add(meridian_indicator37.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: meridian_indicator, numeric_hours
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 97:5: -> ^( EXPLICIT_TIME numeric_hours MINUTES[\"0\"] ( meridian_indicator )? )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:97:8: ^( EXPLICIT_TIME numeric_hours MINUTES[\"0\"] ( meridian_indicator )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        adaptor.addChild(root_1, stream_numeric_hours.nextTree());
                        adaptor.addChild(root_1, (Object)adaptor.create(MINUTES, "0"));
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:97:51: ( meridian_indicator )?
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:100:5: numeric_hours ':' numeric_minutes ( meridian_indicator )?
                    {
                    pushFollow(FOLLOW_numeric_hours_in_explicit_time589);
                    numeric_hours38=numeric_hours();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_numeric_hours.add(numeric_hours38.getTree());
                    char_literal39=(Token)match(input,36,FOLLOW_36_in_explicit_time591); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_36.add(char_literal39);

                    pushFollow(FOLLOW_numeric_minutes_in_explicit_time593);
                    numeric_minutes40=numeric_minutes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_numeric_minutes.add(numeric_minutes40.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:100:39: ( meridian_indicator )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( ((LA15_0>=149 && LA15_0<=154)) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:100:39: meridian_indicator
                            {
                            pushFollow(FOLLOW_meridian_indicator_in_explicit_time595);
                            meridian_indicator41=meridian_indicator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_meridian_indicator.add(meridian_indicator41.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: numeric_hours, meridian_indicator, numeric_minutes
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 101:5: -> ^( EXPLICIT_TIME numeric_hours numeric_minutes ( meridian_indicator )? )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:101:8: ^( EXPLICIT_TIME numeric_hours numeric_minutes ( meridian_indicator )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        adaptor.addChild(root_1, stream_numeric_hours.nextTree());
                        adaptor.addChild(root_1, stream_numeric_minutes.nextTree());
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:101:54: ( meridian_indicator )?
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:103:5: time_identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_time_identifier_in_explicit_time623);
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

    public static class time_identifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "time_identifier"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:107:1: time_identifier : ( 'midnight' -> ^( EXPLICIT_TIME INTEGER[\"12\"] INTEGER[\"0\"] AM_PM[\"am\"] ) | 'noon' -> ^( EXPLICIT_TIME INTEGER[\"12\"] INTEGER[\"0\"] AM_PM[\"pm\"] ) );
    public final DateParser.time_identifier_return time_identifier() throws RecognitionException {
        DateParser.time_identifier_return retval = new DateParser.time_identifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal43=null;
        Token string_literal44=null;

        Object string_literal43_tree=null;
        Object string_literal44_tree=null;
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:108:3: ( 'midnight' -> ^( EXPLICIT_TIME INTEGER[\"12\"] INTEGER[\"0\"] AM_PM[\"am\"] ) | 'noon' -> ^( EXPLICIT_TIME INTEGER[\"12\"] INTEGER[\"0\"] AM_PM[\"pm\"] ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==37) ) {
                alt17=1;
            }
            else if ( (LA17_0==38) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:108:5: 'midnight'
                    {
                    string_literal43=(Token)match(input,37,FOLLOW_37_in_time_identifier639); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_37.add(string_literal43);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 108:16: -> ^( EXPLICIT_TIME INTEGER[\"12\"] INTEGER[\"0\"] AM_PM[\"am\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:108:19: ^( EXPLICIT_TIME INTEGER[\"12\"] INTEGER[\"0\"] AM_PM[\"am\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:109:5: 'noon'
                    {
                    string_literal44=(Token)match(input,38,FOLLOW_38_in_time_identifier660); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_38.add(string_literal44);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 109:16: -> ^( EXPLICIT_TIME INTEGER[\"12\"] INTEGER[\"0\"] AM_PM[\"pm\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:109:19: ^( EXPLICIT_TIME INTEGER[\"12\"] INTEGER[\"0\"] AM_PM[\"pm\"] )
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:113:1: modifiable_target : ( day_of_week | date_span | month ( 's' )? -> month );
    public final DateParser.modifiable_target_return modifiable_target() throws RecognitionException {
        DateParser.modifiable_target_return retval = new DateParser.modifiable_target_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal48=null;
        DateParser.day_of_week_return day_of_week45 = null;

        DateParser.date_span_return date_span46 = null;

        DateParser.month_return month47 = null;


        Object char_literal48_tree=null;
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleSubtreeStream stream_month=new RewriteRuleSubtreeStream(adaptor,"rule month");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:114:3: ( day_of_week | date_span | month ( 's' )? -> month )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
                {
                alt19=1;
                }
                break;
            case 49:
            case 50:
            case 51:
            case 52:
                {
                alt19=2;
                }
                break;
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
                {
                alt19=3;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:114:5: day_of_week
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_day_of_week_in_modifiable_target695);
                    day_of_week45=day_of_week();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, day_of_week45.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:115:5: date_span
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_date_span_in_modifiable_target702);
                    date_span46=date_span();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, date_span46.getTree());

                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:116:5: month ( 's' )?
                    {
                    pushFollow(FOLLOW_month_in_modifiable_target708);
                    month47=month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_month.add(month47.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:116:11: ( 's' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==39) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:116:11: 's'
                            {
                            char_literal48=(Token)match(input,39,FOLLOW_39_in_modifiable_target710); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_39.add(char_literal48);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: month
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 116:16: -> month
                    {
                        adaptor.addChild(root_0, stream_month.nextTree());

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
    // $ANTLR end "modifiable_target"

    public static class relative_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relative_prefix"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:119:1: relative_prefix : ( ( 'this' )? 'last' -> SEEK_DIRECTION[\"<\"] SEEK_TYPE[\"by_week\"] INTEGER[\"1\"] | ( 'this' )? 'next' -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_week\"] INTEGER[\"1\"] | ( 'this' )? 'past' -> SEEK_DIRECTION[\"<\"] SEEK_TYPE[\"by_day\"] INTEGER[\"1\"] | ( 'this' )? 'coming' -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] INTEGER[\"1\"] | ( 'this' )? 'upcoming' -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] INTEGER[\"1\"] | ( 'in' )? numeric_or_natural_integer -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] numeric_or_natural_integer );
    public final DateParser.relative_prefix_return relative_prefix() throws RecognitionException {
        DateParser.relative_prefix_return retval = new DateParser.relative_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal49=null;
        Token string_literal50=null;
        Token string_literal51=null;
        Token string_literal52=null;
        Token string_literal53=null;
        Token string_literal54=null;
        Token string_literal55=null;
        Token string_literal56=null;
        Token string_literal57=null;
        Token string_literal58=null;
        Token string_literal59=null;
        DateParser.numeric_or_natural_integer_return numeric_or_natural_integer60 = null;


        Object string_literal49_tree=null;
        Object string_literal50_tree=null;
        Object string_literal51_tree=null;
        Object string_literal52_tree=null;
        Object string_literal53_tree=null;
        Object string_literal54_tree=null;
        Object string_literal55_tree=null;
        Object string_literal56_tree=null;
        Object string_literal57_tree=null;
        Object string_literal58_tree=null;
        Object string_literal59_tree=null;
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleSubtreeStream stream_numeric_or_natural_integer=new RewriteRuleSubtreeStream(adaptor,"rule numeric_or_natural_integer");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:120:3: ( ( 'this' )? 'last' -> SEEK_DIRECTION[\"<\"] SEEK_TYPE[\"by_week\"] INTEGER[\"1\"] | ( 'this' )? 'next' -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_week\"] INTEGER[\"1\"] | ( 'this' )? 'past' -> SEEK_DIRECTION[\"<\"] SEEK_TYPE[\"by_day\"] INTEGER[\"1\"] | ( 'this' )? 'coming' -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] INTEGER[\"1\"] | ( 'this' )? 'upcoming' -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] INTEGER[\"1\"] | ( 'in' )? numeric_or_natural_integer -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] numeric_or_natural_integer )
            int alt26=6;
            switch ( input.LA(1) ) {
            case 40:
                {
                switch ( input.LA(2) ) {
                case 42:
                    {
                    alt26=2;
                    }
                    break;
                case 45:
                    {
                    alt26=5;
                    }
                    break;
                case 43:
                    {
                    alt26=3;
                    }
                    break;
                case 41:
                    {
                    alt26=1;
                    }
                    break;
                case 44:
                    {
                    alt26=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }

                }
                break;
            case 41:
                {
                alt26=1;
                }
                break;
            case 42:
                {
                alt26=2;
                }
                break;
            case 43:
                {
                alt26=3;
                }
                break;
            case 44:
                {
                alt26=4;
                }
                break;
            case 45:
                {
                alt26=5;
                }
                break;
            case ONE_TO_TWELVE:
            case THIRTEEN_TO_TWENTY_FOUR:
            case TWENTY_FIVE_TO_THIRTY_ONE:
            case TWO_ZEROS:
            case THIRTY_TWO_TO_FIFTY_NINE:
            case SIXTY_TO_NINETY_NINE:
            case THREE_DIGIT:
            case FOUR_DIGIT:
            case 46:
            case 133:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
            case 169:
            case 170:
            case 171:
            case 172:
            case 173:
            case 174:
            case 175:
            case 176:
            case 177:
            case 178:
            case 179:
            case 180:
            case 181:
                {
                alt26=6;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:120:5: ( 'this' )? 'last'
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:120:5: ( 'this' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==40) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:120:5: 'this'
                            {
                            string_literal49=(Token)match(input,40,FOLLOW_40_in_relative_prefix730); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_40.add(string_literal49);


                            }
                            break;

                    }

                    string_literal50=(Token)match(input,41,FOLLOW_41_in_relative_prefix733); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_41.add(string_literal50);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 120:24: -> SEEK_DIRECTION[\"<\"] SEEK_TYPE[\"by_week\"] INTEGER[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIRECTION, "<"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_week"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:121:5: ( 'this' )? 'next'
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:121:5: ( 'this' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==40) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:121:5: 'this'
                            {
                            string_literal51=(Token)match(input,40,FOLLOW_40_in_relative_prefix754); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_40.add(string_literal51);


                            }
                            break;

                    }

                    string_literal52=(Token)match(input,42,FOLLOW_42_in_relative_prefix757); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_42.add(string_literal52);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 121:24: -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_week\"] INTEGER[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIRECTION, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_week"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:122:5: ( 'this' )? 'past'
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:122:5: ( 'this' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==40) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:122:5: 'this'
                            {
                            string_literal53=(Token)match(input,40,FOLLOW_40_in_relative_prefix778); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_40.add(string_literal53);


                            }
                            break;

                    }

                    string_literal54=(Token)match(input,43,FOLLOW_43_in_relative_prefix781); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_43.add(string_literal54);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 122:24: -> SEEK_DIRECTION[\"<\"] SEEK_TYPE[\"by_day\"] INTEGER[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIRECTION, "<"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_day"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:123:5: ( 'this' )? 'coming'
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:123:5: ( 'this' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==40) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:123:5: 'this'
                            {
                            string_literal55=(Token)match(input,40,FOLLOW_40_in_relative_prefix802); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_40.add(string_literal55);


                            }
                            break;

                    }

                    string_literal56=(Token)match(input,44,FOLLOW_44_in_relative_prefix805); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_44.add(string_literal56);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 123:24: -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] INTEGER[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIRECTION, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_day"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:124:5: ( 'this' )? 'upcoming'
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:124:5: ( 'this' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==40) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:124:5: 'this'
                            {
                            string_literal57=(Token)match(input,40,FOLLOW_40_in_relative_prefix824); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_40.add(string_literal57);


                            }
                            break;

                    }

                    string_literal58=(Token)match(input,45,FOLLOW_45_in_relative_prefix827); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_45.add(string_literal58);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 124:24: -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] INTEGER[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIRECTION, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_day"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:125:5: ( 'in' )? numeric_or_natural_integer
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:125:5: ( 'in' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==46) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:125:5: 'in'
                            {
                            string_literal59=(Token)match(input,46,FOLLOW_46_in_relative_prefix844); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_46.add(string_literal59);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_numeric_or_natural_integer_in_relative_prefix847);
                    numeric_or_natural_integer60=numeric_or_natural_integer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_numeric_or_natural_integer.add(numeric_or_natural_integer60.getTree());


                    // AST REWRITE
                    // elements: numeric_or_natural_integer
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 125:38: -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] numeric_or_natural_integer
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIRECTION, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_day"));
                        adaptor.addChild(root_0, stream_numeric_or_natural_integer.nextTree());

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:128:1: relative_suffix : ( 'from now' -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] | 'ago' -> SEEK_DIRECTION[\"<\"] SEEK_TYPE[\"by_day\"] );
    public final DateParser.relative_suffix_return relative_suffix() throws RecognitionException {
        DateParser.relative_suffix_return retval = new DateParser.relative_suffix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal61=null;
        Token string_literal62=null;

        Object string_literal61_tree=null;
        Object string_literal62_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:129:3: ( 'from now' -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] | 'ago' -> SEEK_DIRECTION[\"<\"] SEEK_TYPE[\"by_day\"] )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==47) ) {
                alt27=1;
            }
            else if ( (LA27_0==48) ) {
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:129:5: 'from now'
                    {
                    string_literal61=(Token)match(input,47,FOLLOW_47_in_relative_suffix872); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_47.add(string_literal61);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 129:16: -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIRECTION, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_day"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:130:5: 'ago'
                    {
                    string_literal62=(Token)match(input,48,FOLLOW_48_in_relative_suffix886); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_48.add(string_literal62);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 130:16: -> SEEK_DIRECTION[\"<\"] SEEK_TYPE[\"by_day\"]
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

    public static class date_span_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "date_span"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:133:1: date_span : ( 'day' ( 's' )? -> SPAN[\"day\"] | 'week' ( 's' )? -> SPAN[\"week\"] | 'month' ( 's' )? -> SPAN[\"month\"] | year_date_span );
    public final DateParser.date_span_return date_span() throws RecognitionException {
        DateParser.date_span_return retval = new DateParser.date_span_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal63=null;
        Token char_literal64=null;
        Token string_literal65=null;
        Token char_literal66=null;
        Token string_literal67=null;
        Token char_literal68=null;
        DateParser.year_date_span_return year_date_span69 = null;


        Object string_literal63_tree=null;
        Object char_literal64_tree=null;
        Object string_literal65_tree=null;
        Object char_literal66_tree=null;
        Object string_literal67_tree=null;
        Object char_literal68_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:134:3: ( 'day' ( 's' )? -> SPAN[\"day\"] | 'week' ( 's' )? -> SPAN[\"week\"] | 'month' ( 's' )? -> SPAN[\"month\"] | year_date_span )
            int alt31=4;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt31=1;
                }
                break;
            case 50:
                {
                alt31=2;
                }
                break;
            case 51:
                {
                alt31=3;
                }
                break;
            case 52:
                {
                alt31=4;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:134:5: 'day' ( 's' )?
                    {
                    string_literal63=(Token)match(input,49,FOLLOW_49_in_date_span914); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_49.add(string_literal63);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:134:11: ( 's' )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==39) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:134:11: 's'
                            {
                            char_literal64=(Token)match(input,39,FOLLOW_39_in_date_span916); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_39.add(char_literal64);


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
                    // 134:18: -> SPAN[\"day\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SPAN, "day"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:135:5: 'week' ( 's' )?
                    {
                    string_literal65=(Token)match(input,50,FOLLOW_50_in_date_span930); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_50.add(string_literal65);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:135:12: ( 's' )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==39) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:135:12: 's'
                            {
                            char_literal66=(Token)match(input,39,FOLLOW_39_in_date_span932); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_39.add(char_literal66);


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
                    // 135:18: -> SPAN[\"week\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SPAN, "week"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:136:5: 'month' ( 's' )?
                    {
                    string_literal67=(Token)match(input,51,FOLLOW_51_in_date_span945); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_51.add(string_literal67);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:136:13: ( 's' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==39) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:136:13: 's'
                            {
                            char_literal68=(Token)match(input,39,FOLLOW_39_in_date_span947); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_39.add(char_literal68);


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
                    // 136:18: -> SPAN[\"month\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SPAN, "month"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:137:5: year_date_span
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_year_date_span_in_date_span959);
                    year_date_span69=year_date_span();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, year_date_span69.getTree());

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

    public static class year_date_span_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "year_date_span"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:140:1: year_date_span : 'year' ( 's' )? -> SPAN[\"year\"] ;
    public final DateParser.year_date_span_return year_date_span() throws RecognitionException {
        DateParser.year_date_span_return retval = new DateParser.year_date_span_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal70=null;
        Token char_literal71=null;

        Object string_literal70_tree=null;
        Object char_literal71_tree=null;
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:141:3: ( 'year' ( 's' )? -> SPAN[\"year\"] )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:141:5: 'year' ( 's' )?
            {
            string_literal70=(Token)match(input,52,FOLLOW_52_in_year_date_span974); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_52.add(string_literal70);

            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:141:12: ( 's' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==39) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:141:12: 's'
                    {
                    char_literal71=(Token)match(input,39,FOLLOW_39_in_year_date_span976); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_39.add(char_literal71);


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
            // 141:17: -> SPAN[\"year\"]
            {
                adaptor.addChild(root_0, (Object)adaptor.create(SPAN, "year"));

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
    // $ANTLR end "year_date_span"

    public static class month_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "month"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:144:1: month : ( 'january' -> MONTH[\"1\"] | 'jan' -> MONTH[\"1\"] | 'february' -> MONTH[\"2\"] | 'feb' -> MONTH[\"2\"] | 'march' -> MONTH[\"3\"] | 'mar' -> MONTH[\"3\"] | 'april' -> MONTH[\"4\"] | 'apr' -> MONTH[\"4\"] | 'may' -> MONTH[\"5\"] | 'june' -> MONTH[\"6\"] | 'jun' -> MONTH[\"6\"] | 'july' -> MONTH[\"7\"] | 'jul' -> MONTH[\"7\"] | 'august' -> MONTH[\"8\"] | 'aug' -> MONTH[\"8\"] | 'september' -> MONTH[\"9\"] | 'sep' -> MONTH[\"9\"] | 'october' -> MONTH[\"10\"] | 'oct' -> MONTH[\"10\"] | 'november' -> MONTH[\"11\"] | 'nov' -> MONTH[\"11\"] | 'december' -> MONTH[\"12\"] | 'dec' -> MONTH[\"12\"] );
    public final DateParser.month_return month() throws RecognitionException {
        DateParser.month_return retval = new DateParser.month_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal72=null;
        Token string_literal73=null;
        Token string_literal74=null;
        Token string_literal75=null;
        Token string_literal76=null;
        Token string_literal77=null;
        Token string_literal78=null;
        Token string_literal79=null;
        Token string_literal80=null;
        Token string_literal81=null;
        Token string_literal82=null;
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
        Token string_literal93=null;
        Token string_literal94=null;

        Object string_literal72_tree=null;
        Object string_literal73_tree=null;
        Object string_literal74_tree=null;
        Object string_literal75_tree=null;
        Object string_literal76_tree=null;
        Object string_literal77_tree=null;
        Object string_literal78_tree=null;
        Object string_literal79_tree=null;
        Object string_literal80_tree=null;
        Object string_literal81_tree=null;
        Object string_literal82_tree=null;
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
        Object string_literal93_tree=null;
        Object string_literal94_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:145:3: ( 'january' -> MONTH[\"1\"] | 'jan' -> MONTH[\"1\"] | 'february' -> MONTH[\"2\"] | 'feb' -> MONTH[\"2\"] | 'march' -> MONTH[\"3\"] | 'mar' -> MONTH[\"3\"] | 'april' -> MONTH[\"4\"] | 'apr' -> MONTH[\"4\"] | 'may' -> MONTH[\"5\"] | 'june' -> MONTH[\"6\"] | 'jun' -> MONTH[\"6\"] | 'july' -> MONTH[\"7\"] | 'jul' -> MONTH[\"7\"] | 'august' -> MONTH[\"8\"] | 'aug' -> MONTH[\"8\"] | 'september' -> MONTH[\"9\"] | 'sep' -> MONTH[\"9\"] | 'october' -> MONTH[\"10\"] | 'oct' -> MONTH[\"10\"] | 'november' -> MONTH[\"11\"] | 'nov' -> MONTH[\"11\"] | 'december' -> MONTH[\"12\"] | 'dec' -> MONTH[\"12\"] )
            int alt33=23;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt33=1;
                }
                break;
            case 54:
                {
                alt33=2;
                }
                break;
            case 55:
                {
                alt33=3;
                }
                break;
            case 56:
                {
                alt33=4;
                }
                break;
            case 57:
                {
                alt33=5;
                }
                break;
            case 58:
                {
                alt33=6;
                }
                break;
            case 59:
                {
                alt33=7;
                }
                break;
            case 60:
                {
                alt33=8;
                }
                break;
            case 61:
                {
                alt33=9;
                }
                break;
            case 62:
                {
                alt33=10;
                }
                break;
            case 63:
                {
                alt33=11;
                }
                break;
            case 64:
                {
                alt33=12;
                }
                break;
            case 65:
                {
                alt33=13;
                }
                break;
            case 66:
                {
                alt33=14;
                }
                break;
            case 67:
                {
                alt33=15;
                }
                break;
            case 68:
                {
                alt33=16;
                }
                break;
            case 69:
                {
                alt33=17;
                }
                break;
            case 70:
                {
                alt33=18;
                }
                break;
            case 71:
                {
                alt33=19;
                }
                break;
            case 72:
                {
                alt33=20;
                }
                break;
            case 73:
                {
                alt33=21;
                }
                break;
            case 74:
                {
                alt33=22;
                }
                break;
            case 75:
                {
                alt33=23;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:145:5: 'january'
                    {
                    string_literal72=(Token)match(input,53,FOLLOW_53_in_month997); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(string_literal72);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 145:16: -> MONTH[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:146:5: 'jan'
                    {
                    string_literal73=(Token)match(input,54,FOLLOW_54_in_month1009); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_54.add(string_literal73);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 146:16: -> MONTH[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:147:5: 'february'
                    {
                    string_literal74=(Token)match(input,55,FOLLOW_55_in_month1025); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(string_literal74);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 147:16: -> MONTH[\"2\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "2"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:148:5: 'feb'
                    {
                    string_literal75=(Token)match(input,56,FOLLOW_56_in_month1036); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_56.add(string_literal75);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 148:16: -> MONTH[\"2\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "2"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:149:5: 'march'
                    {
                    string_literal76=(Token)match(input,57,FOLLOW_57_in_month1052); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_57.add(string_literal76);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 149:16: -> MONTH[\"3\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "3"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:150:5: 'mar'
                    {
                    string_literal77=(Token)match(input,58,FOLLOW_58_in_month1066); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_58.add(string_literal77);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 150:16: -> MONTH[\"3\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "3"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:151:5: 'april'
                    {
                    string_literal78=(Token)match(input,59,FOLLOW_59_in_month1082); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_59.add(string_literal78);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 151:16: -> MONTH[\"4\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "4"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:152:5: 'apr'
                    {
                    string_literal79=(Token)match(input,60,FOLLOW_60_in_month1096); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_60.add(string_literal79);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 152:16: -> MONTH[\"4\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "4"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:153:5: 'may'
                    {
                    string_literal80=(Token)match(input,61,FOLLOW_61_in_month1112); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_61.add(string_literal80);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 153:16: -> MONTH[\"5\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "5"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:154:5: 'june'
                    {
                    string_literal81=(Token)match(input,62,FOLLOW_62_in_month1128); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_62.add(string_literal81);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 154:16: -> MONTH[\"6\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "6"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:155:5: 'jun'
                    {
                    string_literal82=(Token)match(input,63,FOLLOW_63_in_month1143); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_63.add(string_literal82);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 155:16: -> MONTH[\"6\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "6"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:156:5: 'july'
                    {
                    string_literal83=(Token)match(input,64,FOLLOW_64_in_month1159); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_64.add(string_literal83);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 156:16: -> MONTH[\"7\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "7"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:157:5: 'jul'
                    {
                    string_literal84=(Token)match(input,65,FOLLOW_65_in_month1174); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_65.add(string_literal84);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 157:16: -> MONTH[\"7\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "7"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 14 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:158:5: 'august'
                    {
                    string_literal85=(Token)match(input,66,FOLLOW_66_in_month1190); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_66.add(string_literal85);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 158:16: -> MONTH[\"8\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "8"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 15 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:159:5: 'aug'
                    {
                    string_literal86=(Token)match(input,67,FOLLOW_67_in_month1203); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_67.add(string_literal86);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 159:16: -> MONTH[\"8\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "8"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 16 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:160:5: 'september'
                    {
                    string_literal87=(Token)match(input,68,FOLLOW_68_in_month1219); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_68.add(string_literal87);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 160:16: -> MONTH[\"9\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "9"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 17 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:161:5: 'sep'
                    {
                    string_literal88=(Token)match(input,69,FOLLOW_69_in_month1229); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_69.add(string_literal88);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 161:16: -> MONTH[\"9\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "9"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 18 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:162:5: 'october'
                    {
                    string_literal89=(Token)match(input,70,FOLLOW_70_in_month1245); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_70.add(string_literal89);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 162:16: -> MONTH[\"10\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "10"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 19 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:163:5: 'oct'
                    {
                    string_literal90=(Token)match(input,71,FOLLOW_71_in_month1257); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_71.add(string_literal90);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 163:16: -> MONTH[\"10\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "10"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 20 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:164:5: 'november'
                    {
                    string_literal91=(Token)match(input,72,FOLLOW_72_in_month1273); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_72.add(string_literal91);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 164:16: -> MONTH[\"11\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "11"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 21 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:165:5: 'nov'
                    {
                    string_literal92=(Token)match(input,73,FOLLOW_73_in_month1284); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_73.add(string_literal92);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 165:16: -> MONTH[\"11\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "11"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 22 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:166:5: 'december'
                    {
                    string_literal93=(Token)match(input,74,FOLLOW_74_in_month1300); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_74.add(string_literal93);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 166:16: -> MONTH[\"12\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "12"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 23 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:167:5: 'dec'
                    {
                    string_literal94=(Token)match(input,75,FOLLOW_75_in_month1311); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_75.add(string_literal94);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 167:16: -> MONTH[\"12\"]
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

    public static class numeric_month_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numeric_month"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:170:1: numeric_month : ONE_TO_TWELVE -> MONTH[$ONE_TO_TWELVE.text] ;
    public final DateParser.numeric_month_return numeric_month() throws RecognitionException {
        DateParser.numeric_month_return retval = new DateParser.numeric_month_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ONE_TO_TWELVE95=null;

        Object ONE_TO_TWELVE95_tree=null;
        RewriteRuleTokenStream stream_ONE_TO_TWELVE=new RewriteRuleTokenStream(adaptor,"token ONE_TO_TWELVE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:171:3: ( ONE_TO_TWELVE -> MONTH[$ONE_TO_TWELVE.text] )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:171:5: ONE_TO_TWELVE
            {
            ONE_TO_TWELVE95=(Token)match(input,ONE_TO_TWELVE,FOLLOW_ONE_TO_TWELVE_in_numeric_month1336); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ONE_TO_TWELVE.add(ONE_TO_TWELVE95);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 171:19: -> MONTH[$ONE_TO_TWELVE.text]
            {
                adaptor.addChild(root_0, (Object)adaptor.create(MONTH, (ONE_TO_TWELVE95!=null?ONE_TO_TWELVE95.getText():null)));

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
    // $ANTLR end "numeric_month"

    public static class day_of_week_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "day_of_week"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:175:1: day_of_week : ( 'monday' ( 's' )? -> DAY_OF_WEEK[\"2\"] | 'mon' -> DAY_OF_WEEK[\"2\"] | 'tuesday' ( 's' )? -> DAY_OF_WEEK[\"3\"] | 'tue' ( 's' )? -> DAY_OF_WEEK[\"3\"] | 'tues' -> DAY_OF_WEEK[\"3\"] | 'wednesday' ( 's' )? -> DAY_OF_WEEK[\"4\"] | 'wed' -> DAY_OF_WEEK[\"4\"] | 'thursday' ( 's' )? -> DAY_OF_WEEK[\"5\"] | 'thur' -> DAY_OF_WEEK[\"5\"] | 'thurs' -> DAY_OF_WEEK[\"5\"] | 'friday' ( 's' )? -> DAY_OF_WEEK[\"6\"] | 'fri' -> DAY_OF_WEEK[\"6\"] | 'saturday' ( 's' )? -> DAY_OF_WEEK[\"7\"] | 'sat' -> DAY_OF_WEEK[\"7\"] | 'weekend' ( 's' )? -> DAY_OF_WEEK[\"7\"] | 'sunday' ( 's' )? -> DAY_OF_WEEK[\"1\"] | 'sun' -> DAY_OF_WEEK[\"1\"] );
    public final DateParser.day_of_week_return day_of_week() throws RecognitionException {
        DateParser.day_of_week_return retval = new DateParser.day_of_week_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal96=null;
        Token char_literal97=null;
        Token string_literal98=null;
        Token string_literal99=null;
        Token char_literal100=null;
        Token string_literal101=null;
        Token char_literal102=null;
        Token string_literal103=null;
        Token string_literal104=null;
        Token char_literal105=null;
        Token string_literal106=null;
        Token string_literal107=null;
        Token char_literal108=null;
        Token string_literal109=null;
        Token string_literal110=null;
        Token string_literal111=null;
        Token char_literal112=null;
        Token string_literal113=null;
        Token string_literal114=null;
        Token char_literal115=null;
        Token string_literal116=null;
        Token string_literal117=null;
        Token char_literal118=null;
        Token string_literal119=null;
        Token char_literal120=null;
        Token string_literal121=null;

        Object string_literal96_tree=null;
        Object char_literal97_tree=null;
        Object string_literal98_tree=null;
        Object string_literal99_tree=null;
        Object char_literal100_tree=null;
        Object string_literal101_tree=null;
        Object char_literal102_tree=null;
        Object string_literal103_tree=null;
        Object string_literal104_tree=null;
        Object char_literal105_tree=null;
        Object string_literal106_tree=null;
        Object string_literal107_tree=null;
        Object char_literal108_tree=null;
        Object string_literal109_tree=null;
        Object string_literal110_tree=null;
        Object string_literal111_tree=null;
        Object char_literal112_tree=null;
        Object string_literal113_tree=null;
        Object string_literal114_tree=null;
        Object char_literal115_tree=null;
        Object string_literal116_tree=null;
        Object string_literal117_tree=null;
        Object char_literal118_tree=null;
        Object string_literal119_tree=null;
        Object char_literal120_tree=null;
        Object string_literal121_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:176:3: ( 'monday' ( 's' )? -> DAY_OF_WEEK[\"2\"] | 'mon' -> DAY_OF_WEEK[\"2\"] | 'tuesday' ( 's' )? -> DAY_OF_WEEK[\"3\"] | 'tue' ( 's' )? -> DAY_OF_WEEK[\"3\"] | 'tues' -> DAY_OF_WEEK[\"3\"] | 'wednesday' ( 's' )? -> DAY_OF_WEEK[\"4\"] | 'wed' -> DAY_OF_WEEK[\"4\"] | 'thursday' ( 's' )? -> DAY_OF_WEEK[\"5\"] | 'thur' -> DAY_OF_WEEK[\"5\"] | 'thurs' -> DAY_OF_WEEK[\"5\"] | 'friday' ( 's' )? -> DAY_OF_WEEK[\"6\"] | 'fri' -> DAY_OF_WEEK[\"6\"] | 'saturday' ( 's' )? -> DAY_OF_WEEK[\"7\"] | 'sat' -> DAY_OF_WEEK[\"7\"] | 'weekend' ( 's' )? -> DAY_OF_WEEK[\"7\"] | 'sunday' ( 's' )? -> DAY_OF_WEEK[\"1\"] | 'sun' -> DAY_OF_WEEK[\"1\"] )
            int alt43=17;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt43=1;
                }
                break;
            case 77:
                {
                alt43=2;
                }
                break;
            case 78:
                {
                alt43=3;
                }
                break;
            case 79:
                {
                alt43=4;
                }
                break;
            case 80:
                {
                alt43=5;
                }
                break;
            case 81:
                {
                alt43=6;
                }
                break;
            case 82:
                {
                alt43=7;
                }
                break;
            case 83:
                {
                alt43=8;
                }
                break;
            case 84:
                {
                alt43=9;
                }
                break;
            case 85:
                {
                alt43=10;
                }
                break;
            case 86:
                {
                alt43=11;
                }
                break;
            case 87:
                {
                alt43=12;
                }
                break;
            case 88:
                {
                alt43=13;
                }
                break;
            case 89:
                {
                alt43=14;
                }
                break;
            case 90:
                {
                alt43=15;
                }
                break;
            case 91:
                {
                alt43=16;
                }
                break;
            case 92:
                {
                alt43=17;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:176:5: 'monday' ( 's' )?
                    {
                    string_literal96=(Token)match(input,76,FOLLOW_76_in_day_of_week1357); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_76.add(string_literal96);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:176:14: ( 's' )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==39) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:176:14: 's'
                            {
                            char_literal97=(Token)match(input,39,FOLLOW_39_in_day_of_week1359); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_39.add(char_literal97);


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
                    // 176:22: -> DAY_OF_WEEK[\"2\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "2"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:177:5: 'mon'
                    {
                    string_literal98=(Token)match(input,77,FOLLOW_77_in_day_of_week1374); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_77.add(string_literal98);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 177:22: -> DAY_OF_WEEK[\"2\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "2"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:178:5: 'tuesday' ( 's' )?
                    {
                    string_literal99=(Token)match(input,78,FOLLOW_78_in_day_of_week1396); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_78.add(string_literal99);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:178:15: ( 's' )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==39) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:178:15: 's'
                            {
                            char_literal100=(Token)match(input,39,FOLLOW_39_in_day_of_week1398); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_39.add(char_literal100);


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
                    // 178:22: -> DAY_OF_WEEK[\"3\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "3"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:179:5: 'tue' ( 's' )?
                    {
                    string_literal101=(Token)match(input,79,FOLLOW_79_in_day_of_week1412); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_79.add(string_literal101);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:179:11: ( 's' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==39) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:179:11: 's'
                            {
                            char_literal102=(Token)match(input,39,FOLLOW_39_in_day_of_week1414); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_39.add(char_literal102);


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
                    // 179:22: -> DAY_OF_WEEK[\"3\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "3"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:180:5: 'tues'
                    {
                    string_literal103=(Token)match(input,80,FOLLOW_80_in_day_of_week1432); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_80.add(string_literal103);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 180:22: -> DAY_OF_WEEK[\"3\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "3"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:181:5: 'wednesday' ( 's' )?
                    {
                    string_literal104=(Token)match(input,81,FOLLOW_81_in_day_of_week1453); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_81.add(string_literal104);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:181:17: ( 's' )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==39) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:181:17: 's'
                            {
                            char_literal105=(Token)match(input,39,FOLLOW_39_in_day_of_week1455); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_39.add(char_literal105);


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
                    // 181:22: -> DAY_OF_WEEK[\"4\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "4"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:182:5: 'wed'
                    {
                    string_literal106=(Token)match(input,82,FOLLOW_82_in_day_of_week1467); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_82.add(string_literal106);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 182:22: -> DAY_OF_WEEK[\"4\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "4"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:183:5: 'thursday' ( 's' )?
                    {
                    string_literal107=(Token)match(input,83,FOLLOW_83_in_day_of_week1489); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_83.add(string_literal107);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:183:16: ( 's' )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==39) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:183:16: 's'
                            {
                            char_literal108=(Token)match(input,39,FOLLOW_39_in_day_of_week1491); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_39.add(char_literal108);


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
                    // 183:22: -> DAY_OF_WEEK[\"5\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "5"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:184:5: 'thur'
                    {
                    string_literal109=(Token)match(input,84,FOLLOW_84_in_day_of_week1504); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_84.add(string_literal109);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 184:22: -> DAY_OF_WEEK[\"5\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "5"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:185:5: 'thurs'
                    {
                    string_literal110=(Token)match(input,85,FOLLOW_85_in_day_of_week1525); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_85.add(string_literal110);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 185:22: -> DAY_OF_WEEK[\"5\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "5"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:186:5: 'friday' ( 's' )?
                    {
                    string_literal111=(Token)match(input,86,FOLLOW_86_in_day_of_week1545); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_86.add(string_literal111);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:186:14: ( 's' )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==39) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:186:14: 's'
                            {
                            char_literal112=(Token)match(input,39,FOLLOW_39_in_day_of_week1547); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_39.add(char_literal112);


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
                    // 186:22: -> DAY_OF_WEEK[\"6\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "6"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:187:5: 'fri'
                    {
                    string_literal113=(Token)match(input,87,FOLLOW_87_in_day_of_week1562); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_87.add(string_literal113);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 187:22: -> DAY_OF_WEEK[\"6\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "6"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:188:5: 'saturday' ( 's' )?
                    {
                    string_literal114=(Token)match(input,88,FOLLOW_88_in_day_of_week1584); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_88.add(string_literal114);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:188:16: ( 's' )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==39) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:188:16: 's'
                            {
                            char_literal115=(Token)match(input,39,FOLLOW_39_in_day_of_week1586); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_39.add(char_literal115);


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
                    // 188:22: -> DAY_OF_WEEK[\"7\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "7"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 14 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:189:5: 'sat'
                    {
                    string_literal116=(Token)match(input,89,FOLLOW_89_in_day_of_week1599); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_89.add(string_literal116);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 189:22: -> DAY_OF_WEEK[\"7\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "7"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 15 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:190:5: 'weekend' ( 's' )?
                    {
                    string_literal117=(Token)match(input,90,FOLLOW_90_in_day_of_week1621); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_90.add(string_literal117);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:190:15: ( 's' )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==39) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:190:15: 's'
                            {
                            char_literal118=(Token)match(input,39,FOLLOW_39_in_day_of_week1623); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_39.add(char_literal118);


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
                    // 190:22: -> DAY_OF_WEEK[\"7\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "7"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 16 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:191:5: 'sunday' ( 's' )?
                    {
                    string_literal119=(Token)match(input,91,FOLLOW_91_in_day_of_week1637); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_91.add(string_literal119);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:191:14: ( 's' )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==39) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:191:14: 's'
                            {
                            char_literal120=(Token)match(input,39,FOLLOW_39_in_day_of_week1639); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_39.add(char_literal120);


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
                    // 191:22: -> DAY_OF_WEEK[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 17 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:192:5: 'sun'
                    {
                    string_literal121=(Token)match(input,92,FOLLOW_92_in_day_of_week1654); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_92.add(string_literal121);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 192:22: -> DAY_OF_WEEK[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "1"));

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

    public static class day_of_month_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "day_of_month"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:195:1: day_of_month : ( 'first' -> DAY_OF_MONTH[\"1\"] | '1st' -> DAY_OF_MONTH[\"1\"] | 'second' -> DAY_OF_MONTH[\"2\"] | '2nd' -> DAY_OF_MONTH[\"2\"] | 'third' -> DAY_OF_MONTH[\"3\"] | '3rd' -> DAY_OF_MONTH[\"3\"] | 'fourth' -> DAY_OF_MONTH[\"4\"] | '4th' -> DAY_OF_MONTH[\"4\"] | 'fifth' -> DAY_OF_MONTH[\"5\"] | '5th' -> DAY_OF_MONTH[\"5\"] | 'sixth' -> DAY_OF_MONTH[\"6\"] | '6th' -> DAY_OF_MONTH[\"6\"] | 'seventh' -> DAY_OF_MONTH[\"7\"] | '7th' -> DAY_OF_MONTH[\"7\"] | 'eighth' -> DAY_OF_MONTH[\"8\"] | '8th' -> DAY_OF_MONTH[\"8\"] | 'ninth' -> DAY_OF_MONTH[\"9\"] | '9th' -> DAY_OF_MONTH[\"9\"] | 'tenth' -> DAY_OF_MONTH[\"10\"] | '10th' -> DAY_OF_MONTH[\"10\"] | 'eleventh' -> DAY_OF_MONTH[\"11\"] | '11th' -> DAY_OF_MONTH[\"11\"] | 'twelfth' -> DAY_OF_MONTH[\"12\"] | '12th' -> DAY_OF_MONTH[\"12\"] | 'thirteenth' -> DAY_OF_MONTH[\"13\"] | '13th' -> DAY_OF_MONTH[\"13\"] | 'fourteenth' -> DAY_OF_MONTH[\"14\"] | '14th' -> DAY_OF_MONTH[\"14\"] | 'fifteenth' -> DAY_OF_MONTH[\"15\"] | '15th' -> DAY_OF_MONTH[\"15\"] | 'sixteenth' -> DAY_OF_MONTH[\"16\"] | '16th' -> DAY_OF_MONTH[\"16\"] | 'seventeenth' -> DAY_OF_MONTH[\"17\"] | '17th' -> DAY_OF_MONTH[\"17\"] | 'eighteenth' -> DAY_OF_MONTH[\"18\"] | '18th' -> DAY_OF_MONTH[\"18\"] | 'nineteenth' -> DAY_OF_MONTH[\"19\"] | '19th' -> DAY_OF_MONTH[\"19\"] | 'twentieth' -> DAY_OF_MONTH[\"20\"] | '20th' -> DAY_OF_MONTH[\"20\"] | 'twenty' ( DASH )? 'first' -> DAY_OF_MONTH[\"21\"] | '21st' -> DAY_OF_MONTH[\"21\"] | 'twenty' ( DASH )? 'second' -> DAY_OF_MONTH[\"22\"] | '22nd' -> DAY_OF_MONTH[\"22\"] | 'twenty' ( DASH )? 'third' -> DAY_OF_MONTH[\"23\"] | '23rd' -> DAY_OF_MONTH[\"23\"] | 'twenty' ( DASH )? 'fourth' -> DAY_OF_MONTH[\"24\"] | '24th' -> DAY_OF_MONTH[\"24\"] | 'twenty' ( DASH )? 'fifth' -> DAY_OF_MONTH[\"25\"] | '25th' -> DAY_OF_MONTH[\"25\"] | 'twenty' ( DASH )? 'sixth' -> DAY_OF_MONTH[\"26\"] | '26th' -> DAY_OF_MONTH[\"26\"] | 'twenty' ( DASH )? 'seventh' -> DAY_OF_MONTH[\"27\"] | '27th' -> DAY_OF_MONTH[\"27\"] | 'twenty' ( DASH )? 'eighth' -> DAY_OF_MONTH[\"28\"] | '28th' -> DAY_OF_MONTH[\"28\"] | 'twenty' ( DASH )? 'ninth' -> DAY_OF_MONTH[\"29\"] | '29th' -> DAY_OF_MONTH[\"29\"] | 'thirtieth' -> DAY_OF_MONTH[\"30\"] | '30th' -> DAY_OF_MONTH[\"30\"] | 'thirty' ( DASH )? 'first' -> DAY_OF_MONTH[\"31\"] | '31st' -> DAY_OF_MONTH[\"31\"] | numeric_day_of_month );
    public final DateParser.day_of_month_return day_of_month() throws RecognitionException {
        DateParser.day_of_month_return retval = new DateParser.day_of_month_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal122=null;
        Token string_literal123=null;
        Token string_literal124=null;
        Token string_literal125=null;
        Token string_literal126=null;
        Token string_literal127=null;
        Token string_literal128=null;
        Token string_literal129=null;
        Token string_literal130=null;
        Token string_literal131=null;
        Token string_literal132=null;
        Token string_literal133=null;
        Token string_literal134=null;
        Token string_literal135=null;
        Token string_literal136=null;
        Token string_literal137=null;
        Token string_literal138=null;
        Token string_literal139=null;
        Token string_literal140=null;
        Token string_literal141=null;
        Token string_literal142=null;
        Token string_literal143=null;
        Token string_literal144=null;
        Token string_literal145=null;
        Token string_literal146=null;
        Token string_literal147=null;
        Token string_literal148=null;
        Token string_literal149=null;
        Token string_literal150=null;
        Token string_literal151=null;
        Token string_literal152=null;
        Token string_literal153=null;
        Token string_literal154=null;
        Token string_literal155=null;
        Token string_literal156=null;
        Token string_literal157=null;
        Token string_literal158=null;
        Token string_literal159=null;
        Token string_literal160=null;
        Token string_literal161=null;
        Token string_literal162=null;
        Token DASH163=null;
        Token string_literal164=null;
        Token string_literal165=null;
        Token string_literal166=null;
        Token DASH167=null;
        Token string_literal168=null;
        Token string_literal169=null;
        Token string_literal170=null;
        Token DASH171=null;
        Token string_literal172=null;
        Token string_literal173=null;
        Token string_literal174=null;
        Token DASH175=null;
        Token string_literal176=null;
        Token string_literal177=null;
        Token string_literal178=null;
        Token DASH179=null;
        Token string_literal180=null;
        Token string_literal181=null;
        Token string_literal182=null;
        Token DASH183=null;
        Token string_literal184=null;
        Token string_literal185=null;
        Token string_literal186=null;
        Token DASH187=null;
        Token string_literal188=null;
        Token string_literal189=null;
        Token string_literal190=null;
        Token DASH191=null;
        Token string_literal192=null;
        Token string_literal193=null;
        Token string_literal194=null;
        Token DASH195=null;
        Token string_literal196=null;
        Token string_literal197=null;
        Token string_literal198=null;
        Token string_literal199=null;
        Token string_literal200=null;
        Token DASH201=null;
        Token string_literal202=null;
        Token string_literal203=null;
        DateParser.numeric_day_of_month_return numeric_day_of_month204 = null;


        Object string_literal122_tree=null;
        Object string_literal123_tree=null;
        Object string_literal124_tree=null;
        Object string_literal125_tree=null;
        Object string_literal126_tree=null;
        Object string_literal127_tree=null;
        Object string_literal128_tree=null;
        Object string_literal129_tree=null;
        Object string_literal130_tree=null;
        Object string_literal131_tree=null;
        Object string_literal132_tree=null;
        Object string_literal133_tree=null;
        Object string_literal134_tree=null;
        Object string_literal135_tree=null;
        Object string_literal136_tree=null;
        Object string_literal137_tree=null;
        Object string_literal138_tree=null;
        Object string_literal139_tree=null;
        Object string_literal140_tree=null;
        Object string_literal141_tree=null;
        Object string_literal142_tree=null;
        Object string_literal143_tree=null;
        Object string_literal144_tree=null;
        Object string_literal145_tree=null;
        Object string_literal146_tree=null;
        Object string_literal147_tree=null;
        Object string_literal148_tree=null;
        Object string_literal149_tree=null;
        Object string_literal150_tree=null;
        Object string_literal151_tree=null;
        Object string_literal152_tree=null;
        Object string_literal153_tree=null;
        Object string_literal154_tree=null;
        Object string_literal155_tree=null;
        Object string_literal156_tree=null;
        Object string_literal157_tree=null;
        Object string_literal158_tree=null;
        Object string_literal159_tree=null;
        Object string_literal160_tree=null;
        Object string_literal161_tree=null;
        Object string_literal162_tree=null;
        Object DASH163_tree=null;
        Object string_literal164_tree=null;
        Object string_literal165_tree=null;
        Object string_literal166_tree=null;
        Object DASH167_tree=null;
        Object string_literal168_tree=null;
        Object string_literal169_tree=null;
        Object string_literal170_tree=null;
        Object DASH171_tree=null;
        Object string_literal172_tree=null;
        Object string_literal173_tree=null;
        Object string_literal174_tree=null;
        Object DASH175_tree=null;
        Object string_literal176_tree=null;
        Object string_literal177_tree=null;
        Object string_literal178_tree=null;
        Object DASH179_tree=null;
        Object string_literal180_tree=null;
        Object string_literal181_tree=null;
        Object string_literal182_tree=null;
        Object DASH183_tree=null;
        Object string_literal184_tree=null;
        Object string_literal185_tree=null;
        Object string_literal186_tree=null;
        Object DASH187_tree=null;
        Object string_literal188_tree=null;
        Object string_literal189_tree=null;
        Object string_literal190_tree=null;
        Object DASH191_tree=null;
        Object string_literal192_tree=null;
        Object string_literal193_tree=null;
        Object string_literal194_tree=null;
        Object DASH195_tree=null;
        Object string_literal196_tree=null;
        Object string_literal197_tree=null;
        Object string_literal198_tree=null;
        Object string_literal199_tree=null;
        Object string_literal200_tree=null;
        Object DASH201_tree=null;
        Object string_literal202_tree=null;
        Object string_literal203_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
        RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleTokenStream stream_138=new RewriteRuleTokenStream(adaptor,"token 138");
        RewriteRuleTokenStream stream_139=new RewriteRuleTokenStream(adaptor,"token 139");
        RewriteRuleTokenStream stream_136=new RewriteRuleTokenStream(adaptor,"token 136");
        RewriteRuleTokenStream stream_DASH=new RewriteRuleTokenStream(adaptor,"token DASH");
        RewriteRuleTokenStream stream_137=new RewriteRuleTokenStream(adaptor,"token 137");
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleTokenStream stream_144=new RewriteRuleTokenStream(adaptor,"token 144");
        RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
        RewriteRuleTokenStream stream_145=new RewriteRuleTokenStream(adaptor,"token 145");
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_146=new RewriteRuleTokenStream(adaptor,"token 146");
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
        RewriteRuleTokenStream stream_142=new RewriteRuleTokenStream(adaptor,"token 142");
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:196:3: ( 'first' -> DAY_OF_MONTH[\"1\"] | '1st' -> DAY_OF_MONTH[\"1\"] | 'second' -> DAY_OF_MONTH[\"2\"] | '2nd' -> DAY_OF_MONTH[\"2\"] | 'third' -> DAY_OF_MONTH[\"3\"] | '3rd' -> DAY_OF_MONTH[\"3\"] | 'fourth' -> DAY_OF_MONTH[\"4\"] | '4th' -> DAY_OF_MONTH[\"4\"] | 'fifth' -> DAY_OF_MONTH[\"5\"] | '5th' -> DAY_OF_MONTH[\"5\"] | 'sixth' -> DAY_OF_MONTH[\"6\"] | '6th' -> DAY_OF_MONTH[\"6\"] | 'seventh' -> DAY_OF_MONTH[\"7\"] | '7th' -> DAY_OF_MONTH[\"7\"] | 'eighth' -> DAY_OF_MONTH[\"8\"] | '8th' -> DAY_OF_MONTH[\"8\"] | 'ninth' -> DAY_OF_MONTH[\"9\"] | '9th' -> DAY_OF_MONTH[\"9\"] | 'tenth' -> DAY_OF_MONTH[\"10\"] | '10th' -> DAY_OF_MONTH[\"10\"] | 'eleventh' -> DAY_OF_MONTH[\"11\"] | '11th' -> DAY_OF_MONTH[\"11\"] | 'twelfth' -> DAY_OF_MONTH[\"12\"] | '12th' -> DAY_OF_MONTH[\"12\"] | 'thirteenth' -> DAY_OF_MONTH[\"13\"] | '13th' -> DAY_OF_MONTH[\"13\"] | 'fourteenth' -> DAY_OF_MONTH[\"14\"] | '14th' -> DAY_OF_MONTH[\"14\"] | 'fifteenth' -> DAY_OF_MONTH[\"15\"] | '15th' -> DAY_OF_MONTH[\"15\"] | 'sixteenth' -> DAY_OF_MONTH[\"16\"] | '16th' -> DAY_OF_MONTH[\"16\"] | 'seventeenth' -> DAY_OF_MONTH[\"17\"] | '17th' -> DAY_OF_MONTH[\"17\"] | 'eighteenth' -> DAY_OF_MONTH[\"18\"] | '18th' -> DAY_OF_MONTH[\"18\"] | 'nineteenth' -> DAY_OF_MONTH[\"19\"] | '19th' -> DAY_OF_MONTH[\"19\"] | 'twentieth' -> DAY_OF_MONTH[\"20\"] | '20th' -> DAY_OF_MONTH[\"20\"] | 'twenty' ( DASH )? 'first' -> DAY_OF_MONTH[\"21\"] | '21st' -> DAY_OF_MONTH[\"21\"] | 'twenty' ( DASH )? 'second' -> DAY_OF_MONTH[\"22\"] | '22nd' -> DAY_OF_MONTH[\"22\"] | 'twenty' ( DASH )? 'third' -> DAY_OF_MONTH[\"23\"] | '23rd' -> DAY_OF_MONTH[\"23\"] | 'twenty' ( DASH )? 'fourth' -> DAY_OF_MONTH[\"24\"] | '24th' -> DAY_OF_MONTH[\"24\"] | 'twenty' ( DASH )? 'fifth' -> DAY_OF_MONTH[\"25\"] | '25th' -> DAY_OF_MONTH[\"25\"] | 'twenty' ( DASH )? 'sixth' -> DAY_OF_MONTH[\"26\"] | '26th' -> DAY_OF_MONTH[\"26\"] | 'twenty' ( DASH )? 'seventh' -> DAY_OF_MONTH[\"27\"] | '27th' -> DAY_OF_MONTH[\"27\"] | 'twenty' ( DASH )? 'eighth' -> DAY_OF_MONTH[\"28\"] | '28th' -> DAY_OF_MONTH[\"28\"] | 'twenty' ( DASH )? 'ninth' -> DAY_OF_MONTH[\"29\"] | '29th' -> DAY_OF_MONTH[\"29\"] | 'thirtieth' -> DAY_OF_MONTH[\"30\"] | '30th' -> DAY_OF_MONTH[\"30\"] | 'thirty' ( DASH )? 'first' -> DAY_OF_MONTH[\"31\"] | '31st' -> DAY_OF_MONTH[\"31\"] | numeric_day_of_month )
            int alt54=63;
            alt54 = dfa54.predict(input);
            switch (alt54) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:196:5: 'first'
                    {
                    string_literal122=(Token)match(input,93,FOLLOW_93_in_day_of_month1685); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_93.add(string_literal122);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 196:29: -> DAY_OF_MONTH[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:197:5: '1st'
                    {
                    string_literal123=(Token)match(input,94,FOLLOW_94_in_day_of_month1712); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_94.add(string_literal123);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 197:29: -> DAY_OF_MONTH[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:198:5: 'second'
                    {
                    string_literal124=(Token)match(input,95,FOLLOW_95_in_day_of_month1741); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_95.add(string_literal124);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 198:29: -> DAY_OF_MONTH[\"2\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "2"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:199:5: '2nd'
                    {
                    string_literal125=(Token)match(input,96,FOLLOW_96_in_day_of_month1767); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_96.add(string_literal125);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 199:29: -> DAY_OF_MONTH[\"2\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "2"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:200:5: 'third'
                    {
                    string_literal126=(Token)match(input,97,FOLLOW_97_in_day_of_month1796); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_97.add(string_literal126);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 200:29: -> DAY_OF_MONTH[\"3\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "3"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:201:5: '3rd'
                    {
                    string_literal127=(Token)match(input,98,FOLLOW_98_in_day_of_month1823); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_98.add(string_literal127);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 201:29: -> DAY_OF_MONTH[\"3\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "3"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:202:5: 'fourth'
                    {
                    string_literal128=(Token)match(input,99,FOLLOW_99_in_day_of_month1852); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_99.add(string_literal128);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 202:29: -> DAY_OF_MONTH[\"4\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "4"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:203:5: '4th'
                    {
                    string_literal129=(Token)match(input,100,FOLLOW_100_in_day_of_month1878); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_100.add(string_literal129);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 203:29: -> DAY_OF_MONTH[\"4\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "4"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:204:5: 'fifth'
                    {
                    string_literal130=(Token)match(input,101,FOLLOW_101_in_day_of_month1907); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_101.add(string_literal130);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 204:29: -> DAY_OF_MONTH[\"5\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "5"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:205:5: '5th'
                    {
                    string_literal131=(Token)match(input,102,FOLLOW_102_in_day_of_month1934); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_102.add(string_literal131);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 205:29: -> DAY_OF_MONTH[\"5\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "5"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:206:5: 'sixth'
                    {
                    string_literal132=(Token)match(input,103,FOLLOW_103_in_day_of_month1963); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_103.add(string_literal132);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 206:29: -> DAY_OF_MONTH[\"6\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "6"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:207:5: '6th'
                    {
                    string_literal133=(Token)match(input,104,FOLLOW_104_in_day_of_month1990); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_104.add(string_literal133);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 207:29: -> DAY_OF_MONTH[\"6\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "6"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:208:5: 'seventh'
                    {
                    string_literal134=(Token)match(input,105,FOLLOW_105_in_day_of_month2019); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_105.add(string_literal134);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 208:29: -> DAY_OF_MONTH[\"7\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "7"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 14 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:209:5: '7th'
                    {
                    string_literal135=(Token)match(input,106,FOLLOW_106_in_day_of_month2044); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_106.add(string_literal135);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 209:29: -> DAY_OF_MONTH[\"7\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "7"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 15 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:210:5: 'eighth'
                    {
                    string_literal136=(Token)match(input,107,FOLLOW_107_in_day_of_month2073); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_107.add(string_literal136);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 210:29: -> DAY_OF_MONTH[\"8\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "8"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 16 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:211:5: '8th'
                    {
                    string_literal137=(Token)match(input,108,FOLLOW_108_in_day_of_month2099); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_108.add(string_literal137);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 211:29: -> DAY_OF_MONTH[\"8\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "8"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 17 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:212:5: 'ninth'
                    {
                    string_literal138=(Token)match(input,109,FOLLOW_109_in_day_of_month2128); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_109.add(string_literal138);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 212:29: -> DAY_OF_MONTH[\"9\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "9"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 18 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:213:5: '9th'
                    {
                    string_literal139=(Token)match(input,110,FOLLOW_110_in_day_of_month2155); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_110.add(string_literal139);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 213:29: -> DAY_OF_MONTH[\"9\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "9"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 19 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:214:5: 'tenth'
                    {
                    string_literal140=(Token)match(input,111,FOLLOW_111_in_day_of_month2184); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_111.add(string_literal140);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 214:29: -> DAY_OF_MONTH[\"10\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "10"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 20 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:215:5: '10th'
                    {
                    string_literal141=(Token)match(input,112,FOLLOW_112_in_day_of_month2211); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_112.add(string_literal141);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 215:29: -> DAY_OF_MONTH[\"10\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "10"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 21 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:216:5: 'eleventh'
                    {
                    string_literal142=(Token)match(input,113,FOLLOW_113_in_day_of_month2239); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_113.add(string_literal142);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 216:29: -> DAY_OF_MONTH[\"11\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "11"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 22 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:217:5: '11th'
                    {
                    string_literal143=(Token)match(input,114,FOLLOW_114_in_day_of_month2263); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_114.add(string_literal143);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 217:29: -> DAY_OF_MONTH[\"11\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "11"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 23 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:218:5: 'twelfth'
                    {
                    string_literal144=(Token)match(input,115,FOLLOW_115_in_day_of_month2291); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_115.add(string_literal144);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 218:29: -> DAY_OF_MONTH[\"12\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "12"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 24 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:219:5: '12th'
                    {
                    string_literal145=(Token)match(input,116,FOLLOW_116_in_day_of_month2316); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_116.add(string_literal145);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 219:29: -> DAY_OF_MONTH[\"12\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "12"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 25 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:220:5: 'thirteenth'
                    {
                    string_literal146=(Token)match(input,117,FOLLOW_117_in_day_of_month2344); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_117.add(string_literal146);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 220:29: -> DAY_OF_MONTH[\"13\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "13"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 26 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:221:5: '13th'
                    {
                    string_literal147=(Token)match(input,118,FOLLOW_118_in_day_of_month2366); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_118.add(string_literal147);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 221:29: -> DAY_OF_MONTH[\"13\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "13"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 27 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:222:5: 'fourteenth'
                    {
                    string_literal148=(Token)match(input,119,FOLLOW_119_in_day_of_month2394); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_119.add(string_literal148);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 222:29: -> DAY_OF_MONTH[\"14\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "14"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 28 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:223:5: '14th'
                    {
                    string_literal149=(Token)match(input,120,FOLLOW_120_in_day_of_month2416); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_120.add(string_literal149);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 223:29: -> DAY_OF_MONTH[\"14\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "14"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 29 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:224:5: 'fifteenth'
                    {
                    string_literal150=(Token)match(input,121,FOLLOW_121_in_day_of_month2444); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_121.add(string_literal150);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 224:29: -> DAY_OF_MONTH[\"15\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "15"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 30 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:225:5: '15th'
                    {
                    string_literal151=(Token)match(input,122,FOLLOW_122_in_day_of_month2467); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_122.add(string_literal151);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 225:29: -> DAY_OF_MONTH[\"15\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "15"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 31 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:226:5: 'sixteenth'
                    {
                    string_literal152=(Token)match(input,123,FOLLOW_123_in_day_of_month2495); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_123.add(string_literal152);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 226:29: -> DAY_OF_MONTH[\"16\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "16"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 32 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:227:5: '16th'
                    {
                    string_literal153=(Token)match(input,124,FOLLOW_124_in_day_of_month2518); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_124.add(string_literal153);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 227:29: -> DAY_OF_MONTH[\"16\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "16"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 33 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:228:5: 'seventeenth'
                    {
                    string_literal154=(Token)match(input,125,FOLLOW_125_in_day_of_month2546); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_125.add(string_literal154);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 228:29: -> DAY_OF_MONTH[\"17\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "17"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 34 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:229:5: '17th'
                    {
                    string_literal155=(Token)match(input,126,FOLLOW_126_in_day_of_month2567); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_126.add(string_literal155);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 229:29: -> DAY_OF_MONTH[\"17\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "17"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 35 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:230:5: 'eighteenth'
                    {
                    string_literal156=(Token)match(input,127,FOLLOW_127_in_day_of_month2595); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_127.add(string_literal156);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 230:29: -> DAY_OF_MONTH[\"18\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "18"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 36 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:231:5: '18th'
                    {
                    string_literal157=(Token)match(input,128,FOLLOW_128_in_day_of_month2617); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_128.add(string_literal157);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 231:29: -> DAY_OF_MONTH[\"18\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "18"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 37 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:232:5: 'nineteenth'
                    {
                    string_literal158=(Token)match(input,129,FOLLOW_129_in_day_of_month2645); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_129.add(string_literal158);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 232:29: -> DAY_OF_MONTH[\"19\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "19"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 38 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:233:5: '19th'
                    {
                    string_literal159=(Token)match(input,130,FOLLOW_130_in_day_of_month2667); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_130.add(string_literal159);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 233:29: -> DAY_OF_MONTH[\"19\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "19"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 39 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:234:5: 'twentieth'
                    {
                    string_literal160=(Token)match(input,131,FOLLOW_131_in_day_of_month2695); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_131.add(string_literal160);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 234:29: -> DAY_OF_MONTH[\"20\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "20"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 40 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:235:5: '20th'
                    {
                    string_literal161=(Token)match(input,132,FOLLOW_132_in_day_of_month2718); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_132.add(string_literal161);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 235:29: -> DAY_OF_MONTH[\"20\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "20"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 41 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:236:5: 'twenty' ( DASH )? 'first'
                    {
                    string_literal162=(Token)match(input,133,FOLLOW_133_in_day_of_month2746); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_133.add(string_literal162);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:236:14: ( DASH )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==DASH) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:236:14: DASH
                            {
                            DASH163=(Token)match(input,DASH,FOLLOW_DASH_in_day_of_month2748); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH163);


                            }
                            break;

                    }

                    string_literal164=(Token)match(input,93,FOLLOW_93_in_day_of_month2751); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_93.add(string_literal164);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 236:29: -> DAY_OF_MONTH[\"21\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "21"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 42 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:237:5: '21st'
                    {
                    string_literal165=(Token)match(input,134,FOLLOW_134_in_day_of_month2763); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_134.add(string_literal165);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 237:29: -> DAY_OF_MONTH[\"21\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "21"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 43 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:238:5: 'twenty' ( DASH )? 'second'
                    {
                    string_literal166=(Token)match(input,133,FOLLOW_133_in_day_of_month2791); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_133.add(string_literal166);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:238:14: ( DASH )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==DASH) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:238:14: DASH
                            {
                            DASH167=(Token)match(input,DASH,FOLLOW_DASH_in_day_of_month2793); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH167);


                            }
                            break;

                    }

                    string_literal168=(Token)match(input,95,FOLLOW_95_in_day_of_month2796); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_95.add(string_literal168);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 238:29: -> DAY_OF_MONTH[\"22\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "22"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 44 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:239:5: '22nd'
                    {
                    string_literal169=(Token)match(input,135,FOLLOW_135_in_day_of_month2807); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_135.add(string_literal169);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 239:29: -> DAY_OF_MONTH[\"22\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "22"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 45 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:240:5: 'twenty' ( DASH )? 'third'
                    {
                    string_literal170=(Token)match(input,133,FOLLOW_133_in_day_of_month2835); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_133.add(string_literal170);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:240:14: ( DASH )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==DASH) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:240:14: DASH
                            {
                            DASH171=(Token)match(input,DASH,FOLLOW_DASH_in_day_of_month2837); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH171);


                            }
                            break;

                    }

                    string_literal172=(Token)match(input,97,FOLLOW_97_in_day_of_month2840); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_97.add(string_literal172);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 240:29: -> DAY_OF_MONTH[\"23\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "23"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 46 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:241:5: '23rd'
                    {
                    string_literal173=(Token)match(input,136,FOLLOW_136_in_day_of_month2852); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_136.add(string_literal173);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 241:29: -> DAY_OF_MONTH[\"23\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "23"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 47 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:242:5: 'twenty' ( DASH )? 'fourth'
                    {
                    string_literal174=(Token)match(input,133,FOLLOW_133_in_day_of_month2880); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_133.add(string_literal174);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:242:14: ( DASH )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==DASH) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:242:14: DASH
                            {
                            DASH175=(Token)match(input,DASH,FOLLOW_DASH_in_day_of_month2882); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH175);


                            }
                            break;

                    }

                    string_literal176=(Token)match(input,99,FOLLOW_99_in_day_of_month2885); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_99.add(string_literal176);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 242:29: -> DAY_OF_MONTH[\"24\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "24"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 48 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:243:5: '24th'
                    {
                    string_literal177=(Token)match(input,137,FOLLOW_137_in_day_of_month2896); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_137.add(string_literal177);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 243:29: -> DAY_OF_MONTH[\"24\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "24"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 49 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:244:5: 'twenty' ( DASH )? 'fifth'
                    {
                    string_literal178=(Token)match(input,133,FOLLOW_133_in_day_of_month2924); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_133.add(string_literal178);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:244:14: ( DASH )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==DASH) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:244:14: DASH
                            {
                            DASH179=(Token)match(input,DASH,FOLLOW_DASH_in_day_of_month2926); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH179);


                            }
                            break;

                    }

                    string_literal180=(Token)match(input,101,FOLLOW_101_in_day_of_month2929); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_101.add(string_literal180);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 244:29: -> DAY_OF_MONTH[\"25\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "25"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 50 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:245:5: '25th'
                    {
                    string_literal181=(Token)match(input,138,FOLLOW_138_in_day_of_month2941); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_138.add(string_literal181);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 245:29: -> DAY_OF_MONTH[\"25\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "25"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 51 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:5: 'twenty' ( DASH )? 'sixth'
                    {
                    string_literal182=(Token)match(input,133,FOLLOW_133_in_day_of_month2969); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_133.add(string_literal182);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:14: ( DASH )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==DASH) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:14: DASH
                            {
                            DASH183=(Token)match(input,DASH,FOLLOW_DASH_in_day_of_month2971); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH183);


                            }
                            break;

                    }

                    string_literal184=(Token)match(input,103,FOLLOW_103_in_day_of_month2974); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_103.add(string_literal184);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 246:29: -> DAY_OF_MONTH[\"26\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "26"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 52 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:247:5: '26th'
                    {
                    string_literal185=(Token)match(input,139,FOLLOW_139_in_day_of_month2986); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_139.add(string_literal185);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 247:29: -> DAY_OF_MONTH[\"26\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "26"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 53 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:248:5: 'twenty' ( DASH )? 'seventh'
                    {
                    string_literal186=(Token)match(input,133,FOLLOW_133_in_day_of_month3014); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_133.add(string_literal186);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:248:14: ( DASH )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==DASH) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:248:14: DASH
                            {
                            DASH187=(Token)match(input,DASH,FOLLOW_DASH_in_day_of_month3016); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH187);


                            }
                            break;

                    }

                    string_literal188=(Token)match(input,105,FOLLOW_105_in_day_of_month3019); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_105.add(string_literal188);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 248:29: -> DAY_OF_MONTH[\"27\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "27"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 54 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:249:5: '27th'
                    {
                    string_literal189=(Token)match(input,140,FOLLOW_140_in_day_of_month3029); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_140.add(string_literal189);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 249:29: -> DAY_OF_MONTH[\"27\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "27"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 55 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:250:5: 'twenty' ( DASH )? 'eighth'
                    {
                    string_literal190=(Token)match(input,133,FOLLOW_133_in_day_of_month3057); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_133.add(string_literal190);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:250:14: ( DASH )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==DASH) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:250:14: DASH
                            {
                            DASH191=(Token)match(input,DASH,FOLLOW_DASH_in_day_of_month3059); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH191);


                            }
                            break;

                    }

                    string_literal192=(Token)match(input,107,FOLLOW_107_in_day_of_month3062); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_107.add(string_literal192);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 250:29: -> DAY_OF_MONTH[\"28\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "28"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 56 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:251:5: '28th'
                    {
                    string_literal193=(Token)match(input,141,FOLLOW_141_in_day_of_month3073); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_141.add(string_literal193);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 251:29: -> DAY_OF_MONTH[\"28\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "28"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 57 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:252:5: 'twenty' ( DASH )? 'ninth'
                    {
                    string_literal194=(Token)match(input,133,FOLLOW_133_in_day_of_month3101); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_133.add(string_literal194);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:252:14: ( DASH )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==DASH) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:252:14: DASH
                            {
                            DASH195=(Token)match(input,DASH,FOLLOW_DASH_in_day_of_month3103); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH195);


                            }
                            break;

                    }

                    string_literal196=(Token)match(input,109,FOLLOW_109_in_day_of_month3106); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_109.add(string_literal196);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 252:29: -> DAY_OF_MONTH[\"29\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "29"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 58 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:253:5: '29th'
                    {
                    string_literal197=(Token)match(input,142,FOLLOW_142_in_day_of_month3118); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_142.add(string_literal197);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 253:29: -> DAY_OF_MONTH[\"29\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "29"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 59 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:254:5: 'thirtieth'
                    {
                    string_literal198=(Token)match(input,143,FOLLOW_143_in_day_of_month3146); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_143.add(string_literal198);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 254:29: -> DAY_OF_MONTH[\"30\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "30"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 60 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:255:5: '30th'
                    {
                    string_literal199=(Token)match(input,144,FOLLOW_144_in_day_of_month3169); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_144.add(string_literal199);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 255:29: -> DAY_OF_MONTH[\"30\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "30"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 61 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:256:5: 'thirty' ( DASH )? 'first'
                    {
                    string_literal200=(Token)match(input,145,FOLLOW_145_in_day_of_month3197); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_145.add(string_literal200);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:256:14: ( DASH )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==DASH) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:256:14: DASH
                            {
                            DASH201=(Token)match(input,DASH,FOLLOW_DASH_in_day_of_month3199); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH201);


                            }
                            break;

                    }

                    string_literal202=(Token)match(input,93,FOLLOW_93_in_day_of_month3202); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_93.add(string_literal202);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 256:29: -> DAY_OF_MONTH[\"31\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "31"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 62 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:257:5: '31st'
                    {
                    string_literal203=(Token)match(input,146,FOLLOW_146_in_day_of_month3214); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_146.add(string_literal203);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 257:29: -> DAY_OF_MONTH[\"31\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "31"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 63 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:258:5: numeric_day_of_month
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numeric_day_of_month_in_day_of_month3242);
                    numeric_day_of_month204=numeric_day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_day_of_month204.getTree());

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

    public static class numeric_day_of_month_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numeric_day_of_month"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:1: numeric_day_of_month : ( ONE_TO_TWELVE -> DAY_OF_MONTH[$ONE_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_FOUR -> DAY_OF_MONTH[$THIRTEEN_TO_TWENTY_FOUR.text] | TWENTY_FIVE_TO_THIRTY_ONE -> DAY_OF_MONTH[$TWENTY_FIVE_TO_THIRTY_ONE.text] );
    public final DateParser.numeric_day_of_month_return numeric_day_of_month() throws RecognitionException {
        DateParser.numeric_day_of_month_return retval = new DateParser.numeric_day_of_month_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ONE_TO_TWELVE205=null;
        Token THIRTEEN_TO_TWENTY_FOUR206=null;
        Token TWENTY_FIVE_TO_THIRTY_ONE207=null;

        Object ONE_TO_TWELVE205_tree=null;
        Object THIRTEEN_TO_TWENTY_FOUR206_tree=null;
        Object TWENTY_FIVE_TO_THIRTY_ONE207_tree=null;
        RewriteRuleTokenStream stream_THIRTEEN_TO_TWENTY_FOUR=new RewriteRuleTokenStream(adaptor,"token THIRTEEN_TO_TWENTY_FOUR");
        RewriteRuleTokenStream stream_ONE_TO_TWELVE=new RewriteRuleTokenStream(adaptor,"token ONE_TO_TWELVE");
        RewriteRuleTokenStream stream_TWENTY_FIVE_TO_THIRTY_ONE=new RewriteRuleTokenStream(adaptor,"token TWENTY_FIVE_TO_THIRTY_ONE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:3: ( ONE_TO_TWELVE -> DAY_OF_MONTH[$ONE_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_FOUR -> DAY_OF_MONTH[$THIRTEEN_TO_TWENTY_FOUR.text] | TWENTY_FIVE_TO_THIRTY_ONE -> DAY_OF_MONTH[$TWENTY_FIVE_TO_THIRTY_ONE.text] )
            int alt55=3;
            switch ( input.LA(1) ) {
            case ONE_TO_TWELVE:
                {
                alt55=1;
                }
                break;
            case THIRTEEN_TO_TWENTY_FOUR:
                {
                alt55=2;
                }
                break;
            case TWENTY_FIVE_TO_THIRTY_ONE:
                {
                alt55=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:5: ONE_TO_TWELVE
                    {
                    ONE_TO_TWELVE205=(Token)match(input,ONE_TO_TWELVE,FOLLOW_ONE_TO_TWELVE_in_numeric_day_of_month3255); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE_TO_TWELVE.add(ONE_TO_TWELVE205);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 262:31: -> DAY_OF_MONTH[$ONE_TO_TWELVE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, (ONE_TO_TWELVE205!=null?ONE_TO_TWELVE205.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:263:5: THIRTEEN_TO_TWENTY_FOUR
                    {
                    THIRTEEN_TO_TWENTY_FOUR206=(Token)match(input,THIRTEEN_TO_TWENTY_FOUR,FOLLOW_THIRTEEN_TO_TWENTY_FOUR_in_numeric_day_of_month3278); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEEN_TO_TWENTY_FOUR.add(THIRTEEN_TO_TWENTY_FOUR206);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 263:31: -> DAY_OF_MONTH[$THIRTEEN_TO_TWENTY_FOUR.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, (THIRTEEN_TO_TWENTY_FOUR206!=null?THIRTEEN_TO_TWENTY_FOUR206.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:264:5: TWENTY_FIVE_TO_THIRTY_ONE
                    {
                    TWENTY_FIVE_TO_THIRTY_ONE207=(Token)match(input,TWENTY_FIVE_TO_THIRTY_ONE,FOLLOW_TWENTY_FIVE_TO_THIRTY_ONE_in_numeric_day_of_month3291); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY_FIVE_TO_THIRTY_ONE.add(TWENTY_FIVE_TO_THIRTY_ONE207);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 264:31: -> DAY_OF_MONTH[$TWENTY_FIVE_TO_THIRTY_ONE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, (TWENTY_FIVE_TO_THIRTY_ONE207!=null?TWENTY_FIVE_TO_THIRTY_ONE207.getText():null)));

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
    // $ANTLR end "numeric_day_of_month"

    public static class year_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "year"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:267:1: year : ( '\\'' numeric_two_digit_year -> numeric_two_digit_year | ( 'in' 'the' year_date_span )? numeric_four_digit_year -> numeric_four_digit_year );
    public final DateParser.year_return year() throws RecognitionException {
        DateParser.year_return retval = new DateParser.year_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal208=null;
        Token string_literal210=null;
        Token string_literal211=null;
        DateParser.numeric_two_digit_year_return numeric_two_digit_year209 = null;

        DateParser.year_date_span_return year_date_span212 = null;

        DateParser.numeric_four_digit_year_return numeric_four_digit_year213 = null;


        Object char_literal208_tree=null;
        Object string_literal210_tree=null;
        Object string_literal211_tree=null;
        RewriteRuleTokenStream stream_147=new RewriteRuleTokenStream(adaptor,"token 147");
        RewriteRuleTokenStream stream_148=new RewriteRuleTokenStream(adaptor,"token 148");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleSubtreeStream stream_numeric_two_digit_year=new RewriteRuleSubtreeStream(adaptor,"rule numeric_two_digit_year");
        RewriteRuleSubtreeStream stream_year_date_span=new RewriteRuleSubtreeStream(adaptor,"rule year_date_span");
        RewriteRuleSubtreeStream stream_numeric_four_digit_year=new RewriteRuleSubtreeStream(adaptor,"rule numeric_four_digit_year");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:268:3: ( '\\'' numeric_two_digit_year -> numeric_two_digit_year | ( 'in' 'the' year_date_span )? numeric_four_digit_year -> numeric_four_digit_year )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==147) ) {
                alt57=1;
            }
            else if ( ((LA57_0>=THREE_DIGIT && LA57_0<=FOUR_DIGIT)||LA57_0==46) ) {
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:268:5: '\\'' numeric_two_digit_year
                    {
                    char_literal208=(Token)match(input,147,FOLLOW_147_in_year3312); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_147.add(char_literal208);

                    pushFollow(FOLLOW_numeric_two_digit_year_in_year3314);
                    numeric_two_digit_year209=numeric_two_digit_year();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_numeric_two_digit_year.add(numeric_two_digit_year209.getTree());


                    // AST REWRITE
                    // elements: numeric_two_digit_year
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 268:33: -> numeric_two_digit_year
                    {
                        adaptor.addChild(root_0, stream_numeric_two_digit_year.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:269:5: ( 'in' 'the' year_date_span )? numeric_four_digit_year
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:269:5: ( 'in' 'the' year_date_span )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==46) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:269:6: 'in' 'the' year_date_span
                            {
                            string_literal210=(Token)match(input,46,FOLLOW_46_in_year3325); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_46.add(string_literal210);

                            string_literal211=(Token)match(input,148,FOLLOW_148_in_year3327); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_148.add(string_literal211);

                            pushFollow(FOLLOW_year_date_span_in_year3329);
                            year_date_span212=year_date_span();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_year_date_span.add(year_date_span212.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_numeric_four_digit_year_in_year3333);
                    numeric_four_digit_year213=numeric_four_digit_year();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_numeric_four_digit_year.add(numeric_four_digit_year213.getTree());


                    // AST REWRITE
                    // elements: numeric_four_digit_year
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 269:58: -> numeric_four_digit_year
                    {
                        adaptor.addChild(root_0, stream_numeric_four_digit_year.nextTree());

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

    public static class numeric_year_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numeric_year"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:273:1: numeric_year : ( numeric_four_digit_year | numeric_two_digit_year );
    public final DateParser.numeric_year_return numeric_year() throws RecognitionException {
        DateParser.numeric_year_return retval = new DateParser.numeric_year_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.numeric_four_digit_year_return numeric_four_digit_year214 = null;

        DateParser.numeric_two_digit_year_return numeric_two_digit_year215 = null;



        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:274:3: ( numeric_four_digit_year | numeric_two_digit_year )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=THREE_DIGIT && LA58_0<=FOUR_DIGIT)) ) {
                alt58=1;
            }
            else if ( (LA58_0==ONE_TO_TWELVE||(LA58_0>=THIRTEEN_TO_TWENTY_FOUR && LA58_0<=SIXTY_TO_NINETY_NINE)) ) {
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:274:5: numeric_four_digit_year
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numeric_four_digit_year_in_numeric_year3353);
                    numeric_four_digit_year214=numeric_four_digit_year();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_four_digit_year214.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:275:5: numeric_two_digit_year
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numeric_two_digit_year_in_numeric_year3359);
                    numeric_two_digit_year215=numeric_two_digit_year();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_two_digit_year215.getTree());

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
    // $ANTLR end "numeric_year"

    public static class numeric_two_digit_year_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numeric_two_digit_year"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:278:1: numeric_two_digit_year : ( TWO_ZEROS -> YEAR[$TWO_ZEROS.text] | ONE_TO_TWELVE -> YEAR[$ONE_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_FOUR -> YEAR[$THIRTEEN_TO_TWENTY_FOUR.text] | TWENTY_FIVE_TO_THIRTY_ONE -> YEAR[$TWENTY_FIVE_TO_THIRTY_ONE.text] | THIRTY_TWO_TO_FIFTY_NINE -> YEAR[$THIRTY_TWO_TO_FIFTY_NINE.text] | SIXTY_TO_NINETY_NINE -> YEAR[$SIXTY_TO_NINETY_NINE.text] );
    public final DateParser.numeric_two_digit_year_return numeric_two_digit_year() throws RecognitionException {
        DateParser.numeric_two_digit_year_return retval = new DateParser.numeric_two_digit_year_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TWO_ZEROS216=null;
        Token ONE_TO_TWELVE217=null;
        Token THIRTEEN_TO_TWENTY_FOUR218=null;
        Token TWENTY_FIVE_TO_THIRTY_ONE219=null;
        Token THIRTY_TWO_TO_FIFTY_NINE220=null;
        Token SIXTY_TO_NINETY_NINE221=null;

        Object TWO_ZEROS216_tree=null;
        Object ONE_TO_TWELVE217_tree=null;
        Object THIRTEEN_TO_TWENTY_FOUR218_tree=null;
        Object TWENTY_FIVE_TO_THIRTY_ONE219_tree=null;
        Object THIRTY_TWO_TO_FIFTY_NINE220_tree=null;
        Object SIXTY_TO_NINETY_NINE221_tree=null;
        RewriteRuleTokenStream stream_SIXTY_TO_NINETY_NINE=new RewriteRuleTokenStream(adaptor,"token SIXTY_TO_NINETY_NINE");
        RewriteRuleTokenStream stream_TWO_ZEROS=new RewriteRuleTokenStream(adaptor,"token TWO_ZEROS");
        RewriteRuleTokenStream stream_THIRTEEN_TO_TWENTY_FOUR=new RewriteRuleTokenStream(adaptor,"token THIRTEEN_TO_TWENTY_FOUR");
        RewriteRuleTokenStream stream_ONE_TO_TWELVE=new RewriteRuleTokenStream(adaptor,"token ONE_TO_TWELVE");
        RewriteRuleTokenStream stream_THIRTY_TWO_TO_FIFTY_NINE=new RewriteRuleTokenStream(adaptor,"token THIRTY_TWO_TO_FIFTY_NINE");
        RewriteRuleTokenStream stream_TWENTY_FIVE_TO_THIRTY_ONE=new RewriteRuleTokenStream(adaptor,"token TWENTY_FIVE_TO_THIRTY_ONE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:279:3: ( TWO_ZEROS -> YEAR[$TWO_ZEROS.text] | ONE_TO_TWELVE -> YEAR[$ONE_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_FOUR -> YEAR[$THIRTEEN_TO_TWENTY_FOUR.text] | TWENTY_FIVE_TO_THIRTY_ONE -> YEAR[$TWENTY_FIVE_TO_THIRTY_ONE.text] | THIRTY_TWO_TO_FIFTY_NINE -> YEAR[$THIRTY_TWO_TO_FIFTY_NINE.text] | SIXTY_TO_NINETY_NINE -> YEAR[$SIXTY_TO_NINETY_NINE.text] )
            int alt59=6;
            switch ( input.LA(1) ) {
            case TWO_ZEROS:
                {
                alt59=1;
                }
                break;
            case ONE_TO_TWELVE:
                {
                alt59=2;
                }
                break;
            case THIRTEEN_TO_TWENTY_FOUR:
                {
                alt59=3;
                }
                break;
            case TWENTY_FIVE_TO_THIRTY_ONE:
                {
                alt59=4;
                }
                break;
            case THIRTY_TWO_TO_FIFTY_NINE:
                {
                alt59=5;
                }
                break;
            case SIXTY_TO_NINETY_NINE:
                {
                alt59=6;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:279:5: TWO_ZEROS
                    {
                    TWO_ZEROS216=(Token)match(input,TWO_ZEROS,FOLLOW_TWO_ZEROS_in_numeric_two_digit_year3374); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO_ZEROS.add(TWO_ZEROS216);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 279:31: -> YEAR[$TWO_ZEROS.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(YEAR, (TWO_ZEROS216!=null?TWO_ZEROS216.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:280:5: ONE_TO_TWELVE
                    {
                    ONE_TO_TWELVE217=(Token)match(input,ONE_TO_TWELVE,FOLLOW_ONE_TO_TWELVE_in_numeric_two_digit_year3401); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE_TO_TWELVE.add(ONE_TO_TWELVE217);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 280:31: -> YEAR[$ONE_TO_TWELVE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(YEAR, (ONE_TO_TWELVE217!=null?ONE_TO_TWELVE217.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:281:5: THIRTEEN_TO_TWENTY_FOUR
                    {
                    THIRTEEN_TO_TWENTY_FOUR218=(Token)match(input,THIRTEEN_TO_TWENTY_FOUR,FOLLOW_THIRTEEN_TO_TWENTY_FOUR_in_numeric_two_digit_year3424); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEEN_TO_TWENTY_FOUR.add(THIRTEEN_TO_TWENTY_FOUR218);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 281:31: -> YEAR[$THIRTEEN_TO_TWENTY_FOUR.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(YEAR, (THIRTEEN_TO_TWENTY_FOUR218!=null?THIRTEEN_TO_TWENTY_FOUR218.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:282:5: TWENTY_FIVE_TO_THIRTY_ONE
                    {
                    TWENTY_FIVE_TO_THIRTY_ONE219=(Token)match(input,TWENTY_FIVE_TO_THIRTY_ONE,FOLLOW_TWENTY_FIVE_TO_THIRTY_ONE_in_numeric_two_digit_year3437); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY_FIVE_TO_THIRTY_ONE.add(TWENTY_FIVE_TO_THIRTY_ONE219);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 282:31: -> YEAR[$TWENTY_FIVE_TO_THIRTY_ONE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(YEAR, (TWENTY_FIVE_TO_THIRTY_ONE219!=null?TWENTY_FIVE_TO_THIRTY_ONE219.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:283:5: THIRTY_TWO_TO_FIFTY_NINE
                    {
                    THIRTY_TWO_TO_FIFTY_NINE220=(Token)match(input,THIRTY_TWO_TO_FIFTY_NINE,FOLLOW_THIRTY_TWO_TO_FIFTY_NINE_in_numeric_two_digit_year3448); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY_TWO_TO_FIFTY_NINE.add(THIRTY_TWO_TO_FIFTY_NINE220);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 283:31: -> YEAR[$THIRTY_TWO_TO_FIFTY_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(YEAR, (THIRTY_TWO_TO_FIFTY_NINE220!=null?THIRTY_TWO_TO_FIFTY_NINE220.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:284:5: SIXTY_TO_NINETY_NINE
                    {
                    SIXTY_TO_NINETY_NINE221=(Token)match(input,SIXTY_TO_NINETY_NINE,FOLLOW_SIXTY_TO_NINETY_NINE_in_numeric_two_digit_year3460); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTY_TO_NINETY_NINE.add(SIXTY_TO_NINETY_NINE221);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 284:31: -> YEAR[$SIXTY_TO_NINETY_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(YEAR, (SIXTY_TO_NINETY_NINE221!=null?SIXTY_TO_NINETY_NINE221.getText():null)));

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
    // $ANTLR end "numeric_two_digit_year"

    public static class numeric_four_digit_year_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numeric_four_digit_year"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:287:1: numeric_four_digit_year : ( THREE_DIGIT -> YEAR[$THREE_DIGIT.text] | FOUR_DIGIT -> YEAR[$FOUR_DIGIT.text] );
    public final DateParser.numeric_four_digit_year_return numeric_four_digit_year() throws RecognitionException {
        DateParser.numeric_four_digit_year_return retval = new DateParser.numeric_four_digit_year_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THREE_DIGIT222=null;
        Token FOUR_DIGIT223=null;

        Object THREE_DIGIT222_tree=null;
        Object FOUR_DIGIT223_tree=null;
        RewriteRuleTokenStream stream_FOUR_DIGIT=new RewriteRuleTokenStream(adaptor,"token FOUR_DIGIT");
        RewriteRuleTokenStream stream_THREE_DIGIT=new RewriteRuleTokenStream(adaptor,"token THREE_DIGIT");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:288:3: ( THREE_DIGIT -> YEAR[$THREE_DIGIT.text] | FOUR_DIGIT -> YEAR[$FOUR_DIGIT.text] )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==THREE_DIGIT) ) {
                alt60=1;
            }
            else if ( (LA60_0==FOUR_DIGIT) ) {
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:288:5: THREE_DIGIT
                    {
                    THREE_DIGIT222=(Token)match(input,THREE_DIGIT,FOLLOW_THREE_DIGIT_in_numeric_four_digit_year3485); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THREE_DIGIT.add(THREE_DIGIT222);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 288:17: -> YEAR[$THREE_DIGIT.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(YEAR, (THREE_DIGIT222!=null?THREE_DIGIT222.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:289:5: FOUR_DIGIT
                    {
                    FOUR_DIGIT223=(Token)match(input,FOUR_DIGIT,FOLLOW_FOUR_DIGIT_in_numeric_four_digit_year3496); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOUR_DIGIT.add(FOUR_DIGIT223);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 289:17: -> YEAR[$FOUR_DIGIT.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(YEAR, (FOUR_DIGIT223!=null?FOUR_DIGIT223.getText():null)));

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
    // $ANTLR end "numeric_four_digit_year"

    public static class numeric_hours_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numeric_hours"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:292:1: numeric_hours : ( TWO_ZEROS -> HOURS[$TWO_ZEROS.text] | ONE_TO_TWELVE -> HOURS[$ONE_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_FOUR -> HOURS[$THIRTEEN_TO_TWENTY_FOUR.text] );
    public final DateParser.numeric_hours_return numeric_hours() throws RecognitionException {
        DateParser.numeric_hours_return retval = new DateParser.numeric_hours_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TWO_ZEROS224=null;
        Token ONE_TO_TWELVE225=null;
        Token THIRTEEN_TO_TWENTY_FOUR226=null;

        Object TWO_ZEROS224_tree=null;
        Object ONE_TO_TWELVE225_tree=null;
        Object THIRTEEN_TO_TWENTY_FOUR226_tree=null;
        RewriteRuleTokenStream stream_TWO_ZEROS=new RewriteRuleTokenStream(adaptor,"token TWO_ZEROS");
        RewriteRuleTokenStream stream_THIRTEEN_TO_TWENTY_FOUR=new RewriteRuleTokenStream(adaptor,"token THIRTEEN_TO_TWENTY_FOUR");
        RewriteRuleTokenStream stream_ONE_TO_TWELVE=new RewriteRuleTokenStream(adaptor,"token ONE_TO_TWELVE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:293:3: ( TWO_ZEROS -> HOURS[$TWO_ZEROS.text] | ONE_TO_TWELVE -> HOURS[$ONE_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_FOUR -> HOURS[$THIRTEEN_TO_TWENTY_FOUR.text] )
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
            case THIRTEEN_TO_TWENTY_FOUR:
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:293:5: TWO_ZEROS
                    {
                    TWO_ZEROS224=(Token)match(input,TWO_ZEROS,FOLLOW_TWO_ZEROS_in_numeric_hours3517); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO_ZEROS.add(TWO_ZEROS224);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 293:29: -> HOURS[$TWO_ZEROS.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(HOURS, (TWO_ZEROS224!=null?TWO_ZEROS224.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:294:5: ONE_TO_TWELVE
                    {
                    ONE_TO_TWELVE225=(Token)match(input,ONE_TO_TWELVE,FOLLOW_ONE_TO_TWELVE_in_numeric_hours3542); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE_TO_TWELVE.add(ONE_TO_TWELVE225);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 294:29: -> HOURS[$ONE_TO_TWELVE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(HOURS, (ONE_TO_TWELVE225!=null?ONE_TO_TWELVE225.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:295:5: THIRTEEN_TO_TWENTY_FOUR
                    {
                    THIRTEEN_TO_TWENTY_FOUR226=(Token)match(input,THIRTEEN_TO_TWENTY_FOUR,FOLLOW_THIRTEEN_TO_TWENTY_FOUR_in_numeric_hours3563); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEEN_TO_TWENTY_FOUR.add(THIRTEEN_TO_TWENTY_FOUR226);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 295:29: -> HOURS[$THIRTEEN_TO_TWENTY_FOUR.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(HOURS, (THIRTEEN_TO_TWENTY_FOUR226!=null?THIRTEEN_TO_TWENTY_FOUR226.getText():null)));

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
    // $ANTLR end "numeric_hours"

    public static class numeric_minutes_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numeric_minutes"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:298:1: numeric_minutes : ( TWO_ZEROS -> MINUTES[\"0\"] | ONE_TO_TWELVE -> MINUTES[$ONE_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_FOUR -> MINUTES[$THIRTEEN_TO_TWENTY_FOUR.text] | TWENTY_FIVE_TO_THIRTY_ONE -> MINUTES[$TWENTY_FIVE_TO_THIRTY_ONE.text] | THIRTY_TWO_TO_FIFTY_NINE -> MINUTES[$THIRTY_TWO_TO_FIFTY_NINE.text] );
    public final DateParser.numeric_minutes_return numeric_minutes() throws RecognitionException {
        DateParser.numeric_minutes_return retval = new DateParser.numeric_minutes_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TWO_ZEROS227=null;
        Token ONE_TO_TWELVE228=null;
        Token THIRTEEN_TO_TWENTY_FOUR229=null;
        Token TWENTY_FIVE_TO_THIRTY_ONE230=null;
        Token THIRTY_TWO_TO_FIFTY_NINE231=null;

        Object TWO_ZEROS227_tree=null;
        Object ONE_TO_TWELVE228_tree=null;
        Object THIRTEEN_TO_TWENTY_FOUR229_tree=null;
        Object TWENTY_FIVE_TO_THIRTY_ONE230_tree=null;
        Object THIRTY_TWO_TO_FIFTY_NINE231_tree=null;
        RewriteRuleTokenStream stream_TWO_ZEROS=new RewriteRuleTokenStream(adaptor,"token TWO_ZEROS");
        RewriteRuleTokenStream stream_THIRTEEN_TO_TWENTY_FOUR=new RewriteRuleTokenStream(adaptor,"token THIRTEEN_TO_TWENTY_FOUR");
        RewriteRuleTokenStream stream_ONE_TO_TWELVE=new RewriteRuleTokenStream(adaptor,"token ONE_TO_TWELVE");
        RewriteRuleTokenStream stream_THIRTY_TWO_TO_FIFTY_NINE=new RewriteRuleTokenStream(adaptor,"token THIRTY_TWO_TO_FIFTY_NINE");
        RewriteRuleTokenStream stream_TWENTY_FIVE_TO_THIRTY_ONE=new RewriteRuleTokenStream(adaptor,"token TWENTY_FIVE_TO_THIRTY_ONE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:299:3: ( TWO_ZEROS -> MINUTES[\"0\"] | ONE_TO_TWELVE -> MINUTES[$ONE_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_FOUR -> MINUTES[$THIRTEEN_TO_TWENTY_FOUR.text] | TWENTY_FIVE_TO_THIRTY_ONE -> MINUTES[$TWENTY_FIVE_TO_THIRTY_ONE.text] | THIRTY_TWO_TO_FIFTY_NINE -> MINUTES[$THIRTY_TWO_TO_FIFTY_NINE.text] )
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
            case THIRTEEN_TO_TWENTY_FOUR:
                {
                alt62=3;
                }
                break;
            case TWENTY_FIVE_TO_THIRTY_ONE:
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:299:5: TWO_ZEROS
                    {
                    TWO_ZEROS227=(Token)match(input,TWO_ZEROS,FOLLOW_TWO_ZEROS_in_numeric_minutes3583); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO_ZEROS.add(TWO_ZEROS227);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 299:31: -> MINUTES[\"0\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MINUTES, "0"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:300:5: ONE_TO_TWELVE
                    {
                    ONE_TO_TWELVE228=(Token)match(input,ONE_TO_TWELVE,FOLLOW_ONE_TO_TWELVE_in_numeric_minutes3610); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE_TO_TWELVE.add(ONE_TO_TWELVE228);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 300:31: -> MINUTES[$ONE_TO_TWELVE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MINUTES, (ONE_TO_TWELVE228!=null?ONE_TO_TWELVE228.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:301:5: THIRTEEN_TO_TWENTY_FOUR
                    {
                    THIRTEEN_TO_TWENTY_FOUR229=(Token)match(input,THIRTEEN_TO_TWENTY_FOUR,FOLLOW_THIRTEEN_TO_TWENTY_FOUR_in_numeric_minutes3633); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEEN_TO_TWENTY_FOUR.add(THIRTEEN_TO_TWENTY_FOUR229);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 301:31: -> MINUTES[$THIRTEEN_TO_TWENTY_FOUR.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MINUTES, (THIRTEEN_TO_TWENTY_FOUR229!=null?THIRTEEN_TO_TWENTY_FOUR229.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:302:5: TWENTY_FIVE_TO_THIRTY_ONE
                    {
                    TWENTY_FIVE_TO_THIRTY_ONE230=(Token)match(input,TWENTY_FIVE_TO_THIRTY_ONE,FOLLOW_TWENTY_FIVE_TO_THIRTY_ONE_in_numeric_minutes3646); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY_FIVE_TO_THIRTY_ONE.add(TWENTY_FIVE_TO_THIRTY_ONE230);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 302:31: -> MINUTES[$TWENTY_FIVE_TO_THIRTY_ONE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MINUTES, (TWENTY_FIVE_TO_THIRTY_ONE230!=null?TWENTY_FIVE_TO_THIRTY_ONE230.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:303:5: THIRTY_TWO_TO_FIFTY_NINE
                    {
                    THIRTY_TWO_TO_FIFTY_NINE231=(Token)match(input,THIRTY_TWO_TO_FIFTY_NINE,FOLLOW_THIRTY_TWO_TO_FIFTY_NINE_in_numeric_minutes3657); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY_TWO_TO_FIFTY_NINE.add(THIRTY_TWO_TO_FIFTY_NINE231);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 303:31: -> MINUTES[$THIRTY_TWO_TO_FIFTY_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MINUTES, (THIRTY_TWO_TO_FIFTY_NINE231!=null?THIRTY_TWO_TO_FIFTY_NINE231.getText():null)));

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
    // $ANTLR end "numeric_minutes"

    public static class meridian_indicator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "meridian_indicator"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:307:1: meridian_indicator : ( 'am' -> AM_PM[\"am\"] | 'a.m.' -> AM_PM[\"am\"] | 'a' -> AM_PM[\"am\"] | 'pm' -> AM_PM[\"pm\"] | 'p.m.' -> AM_PM[\"pm\"] | 'p' -> AM_PM[\"pm\"] );
    public final DateParser.meridian_indicator_return meridian_indicator() throws RecognitionException {
        DateParser.meridian_indicator_return retval = new DateParser.meridian_indicator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal232=null;
        Token string_literal233=null;
        Token char_literal234=null;
        Token string_literal235=null;
        Token string_literal236=null;
        Token char_literal237=null;

        Object string_literal232_tree=null;
        Object string_literal233_tree=null;
        Object char_literal234_tree=null;
        Object string_literal235_tree=null;
        Object string_literal236_tree=null;
        Object char_literal237_tree=null;
        RewriteRuleTokenStream stream_152=new RewriteRuleTokenStream(adaptor,"token 152");
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleTokenStream stream_149=new RewriteRuleTokenStream(adaptor,"token 149");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:308:3: ( 'am' -> AM_PM[\"am\"] | 'a.m.' -> AM_PM[\"am\"] | 'a' -> AM_PM[\"am\"] | 'pm' -> AM_PM[\"pm\"] | 'p.m.' -> AM_PM[\"pm\"] | 'p' -> AM_PM[\"pm\"] )
            int alt63=6;
            switch ( input.LA(1) ) {
            case 149:
                {
                alt63=1;
                }
                break;
            case 150:
                {
                alt63=2;
                }
                break;
            case 151:
                {
                alt63=3;
                }
                break;
            case 152:
                {
                alt63=4;
                }
                break;
            case 153:
                {
                alt63=5;
                }
                break;
            case 154:
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:308:5: 'am'
                    {
                    string_literal232=(Token)match(input,149,FOLLOW_149_in_meridian_indicator3679); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_149.add(string_literal232);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 308:12: -> AM_PM[\"am\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(AM_PM, "am"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:309:5: 'a.m.'
                    {
                    string_literal233=(Token)match(input,150,FOLLOW_150_in_meridian_indicator3692); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_150.add(string_literal233);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 309:12: -> AM_PM[\"am\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(AM_PM, "am"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:310:5: 'a'
                    {
                    char_literal234=(Token)match(input,151,FOLLOW_151_in_meridian_indicator3703); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_151.add(char_literal234);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 310:12: -> AM_PM[\"am\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(AM_PM, "am"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:311:5: 'pm'
                    {
                    string_literal235=(Token)match(input,152,FOLLOW_152_in_meridian_indicator3717); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_152.add(string_literal235);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 311:12: -> AM_PM[\"pm\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(AM_PM, "pm"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:312:5: 'p.m.'
                    {
                    string_literal236=(Token)match(input,153,FOLLOW_153_in_meridian_indicator3730); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_153.add(string_literal236);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 312:12: -> AM_PM[\"pm\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(AM_PM, "pm"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:313:5: 'p'
                    {
                    char_literal237=(Token)match(input,154,FOLLOW_154_in_meridian_indicator3741); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_154.add(char_literal237);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 313:12: -> AM_PM[\"pm\"]
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

    public static class today_or_tomorrow_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "today_or_tomorrow"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:316:1: today_or_tomorrow : ( 'today' -> ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"0\"] ) | tomorrow | 'yesterday' -> ^( RELATIVE_DATE SEEK_DIRECTION[\"<\"] INTEGER[\"1\"] ) | ( 'the' )? 'day after ' tomorrow -> ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"2\"] ) | ( 'the' )? 'day before yesterday' -> ^( RELATIVE_DATE SEEK_DIRECTION[\"<\"] INTEGER[\"2\"] ) );
    public final DateParser.today_or_tomorrow_return today_or_tomorrow() throws RecognitionException {
        DateParser.today_or_tomorrow_return retval = new DateParser.today_or_tomorrow_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal238=null;
        Token string_literal240=null;
        Token string_literal241=null;
        Token string_literal242=null;
        Token string_literal244=null;
        Token string_literal245=null;
        DateParser.tomorrow_return tomorrow239 = null;

        DateParser.tomorrow_return tomorrow243 = null;


        Object string_literal238_tree=null;
        Object string_literal240_tree=null;
        Object string_literal241_tree=null;
        Object string_literal242_tree=null;
        Object string_literal244_tree=null;
        Object string_literal245_tree=null;
        RewriteRuleTokenStream stream_148=new RewriteRuleTokenStream(adaptor,"token 148");
        RewriteRuleTokenStream stream_158=new RewriteRuleTokenStream(adaptor,"token 158");
        RewriteRuleTokenStream stream_157=new RewriteRuleTokenStream(adaptor,"token 157");
        RewriteRuleTokenStream stream_156=new RewriteRuleTokenStream(adaptor,"token 156");
        RewriteRuleTokenStream stream_155=new RewriteRuleTokenStream(adaptor,"token 155");
        RewriteRuleSubtreeStream stream_tomorrow=new RewriteRuleSubtreeStream(adaptor,"rule tomorrow");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:317:3: ( 'today' -> ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"0\"] ) | tomorrow | 'yesterday' -> ^( RELATIVE_DATE SEEK_DIRECTION[\"<\"] INTEGER[\"1\"] ) | ( 'the' )? 'day after ' tomorrow -> ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"2\"] ) | ( 'the' )? 'day before yesterday' -> ^( RELATIVE_DATE SEEK_DIRECTION[\"<\"] INTEGER[\"2\"] ) )
            int alt66=5;
            switch ( input.LA(1) ) {
            case 155:
                {
                alt66=1;
                }
                break;
            case 159:
            case 160:
            case 161:
            case 162:
                {
                alt66=2;
                }
                break;
            case 156:
                {
                alt66=3;
                }
                break;
            case 148:
                {
                int LA66_4 = input.LA(2);

                if ( (LA66_4==157) ) {
                    alt66=4;
                }
                else if ( (LA66_4==158) ) {
                    alt66=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 66, 4, input);

                    throw nvae;
                }
                }
                break;
            case 157:
                {
                alt66=4;
                }
                break;
            case 158:
                {
                alt66=5;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:317:5: 'today'
                    {
                    string_literal238=(Token)match(input,155,FOLLOW_155_in_today_or_tomorrow3764); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_155.add(string_literal238);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 317:13: -> ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"0\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:317:16: ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"0\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:318:5: tomorrow
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tomorrow_in_today_or_tomorrow3782);
                    tomorrow239=tomorrow();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tomorrow239.getTree());

                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:319:5: 'yesterday'
                    {
                    string_literal240=(Token)match(input,156,FOLLOW_156_in_today_or_tomorrow3788); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_156.add(string_literal240);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 319:17: -> ^( RELATIVE_DATE SEEK_DIRECTION[\"<\"] INTEGER[\"1\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:319:20: ^( RELATIVE_DATE SEEK_DIRECTION[\"<\"] INTEGER[\"1\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:322:5: ( 'the' )? 'day after ' tomorrow
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:322:5: ( 'the' )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==148) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:322:5: 'the'
                            {
                            string_literal241=(Token)match(input,148,FOLLOW_148_in_today_or_tomorrow3812); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_148.add(string_literal241);


                            }
                            break;

                    }

                    string_literal242=(Token)match(input,157,FOLLOW_157_in_today_or_tomorrow3815); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_157.add(string_literal242);

                    pushFollow(FOLLOW_tomorrow_in_today_or_tomorrow3817);
                    tomorrow243=tomorrow();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tomorrow.add(tomorrow243.getTree());


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 322:34: -> ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"2\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:322:37: ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"2\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:323:5: ( 'the' )? 'day before yesterday'
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:323:5: ( 'the' )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==148) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:323:5: 'the'
                            {
                            string_literal244=(Token)match(input,148,FOLLOW_148_in_today_or_tomorrow3835); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_148.add(string_literal244);


                            }
                            break;

                    }

                    string_literal245=(Token)match(input,158,FOLLOW_158_in_today_or_tomorrow3838); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_158.add(string_literal245);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 323:35: -> ^( RELATIVE_DATE SEEK_DIRECTION[\"<\"] INTEGER[\"2\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:323:38: ^( RELATIVE_DATE SEEK_DIRECTION[\"<\"] INTEGER[\"2\"] )
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

    public static class tomorrow_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tomorrow"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:326:1: tomorrow : ( 'tomorow' | 'tomorrow' | 'tommorow' | 'tommorrow' ) -> ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"1\"] ) ;
    public final DateParser.tomorrow_return tomorrow() throws RecognitionException {
        DateParser.tomorrow_return retval = new DateParser.tomorrow_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal246=null;
        Token string_literal247=null;
        Token string_literal248=null;
        Token string_literal249=null;

        Object string_literal246_tree=null;
        Object string_literal247_tree=null;
        Object string_literal248_tree=null;
        Object string_literal249_tree=null;
        RewriteRuleTokenStream stream_161=new RewriteRuleTokenStream(adaptor,"token 161");
        RewriteRuleTokenStream stream_162=new RewriteRuleTokenStream(adaptor,"token 162");
        RewriteRuleTokenStream stream_160=new RewriteRuleTokenStream(adaptor,"token 160");
        RewriteRuleTokenStream stream_159=new RewriteRuleTokenStream(adaptor,"token 159");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:327:3: ( ( 'tomorow' | 'tomorrow' | 'tommorow' | 'tommorrow' ) -> ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"1\"] ) )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:327:5: ( 'tomorow' | 'tomorrow' | 'tommorow' | 'tommorrow' )
            {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:327:5: ( 'tomorow' | 'tomorrow' | 'tommorow' | 'tommorrow' )
            int alt67=4;
            switch ( input.LA(1) ) {
            case 159:
                {
                alt67=1;
                }
                break;
            case 160:
                {
                alt67=2;
                }
                break;
            case 161:
                {
                alt67=3;
                }
                break;
            case 162:
                {
                alt67=4;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:327:6: 'tomorow'
                    {
                    string_literal246=(Token)match(input,159,FOLLOW_159_in_tomorrow3866); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_159.add(string_literal246);


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:327:18: 'tomorrow'
                    {
                    string_literal247=(Token)match(input,160,FOLLOW_160_in_tomorrow3870); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_160.add(string_literal247);


                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:327:31: 'tommorow'
                    {
                    string_literal248=(Token)match(input,161,FOLLOW_161_in_tomorrow3874); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_161.add(string_literal248);


                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:327:44: 'tommorrow'
                    {
                    string_literal249=(Token)match(input,162,FOLLOW_162_in_tomorrow3878); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_162.add(string_literal249);


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
            // 328:5: -> ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"1\"] )
            {
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:328:8: ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"1\"] )
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

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "tomorrow"

    public static class numeric_or_natural_integer_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numeric_or_natural_integer"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:331:1: numeric_or_natural_integer : ( numeric_year -> INTEGER[$numeric_year.text] | 'one' -> INTEGER[\"1\"] | 'two' -> INTEGER[\"2\"] | 'three' -> INTEGER[\"3\"] | 'four' -> INTEGER[\"4\"] | 'five' -> INTEGER[\"5\"] | 'six' -> INTEGER[\"6\"] | 'seven' -> INTEGER[\"7\"] | 'eight' -> INTEGER[\"8\"] | 'nine' -> INTEGER[\"9\"] | 'ten' -> INTEGER[\"10\"] | 'eleven' -> INTEGER[\"11\"] | 'twelve' -> INTEGER[\"12\"] | 'thirteen' -> INTEGER[\"13\"] | 'fourteen' -> INTEGER[\"14\"] | 'fifteen' -> INTEGER[\"15\"] | 'sixteen' -> INTEGER[\"16\"] | 'seventeen' -> INTEGER[\"17\"] | 'eighteen' -> INTEGER[\"18\"] | 'nineteen' -> INTEGER[\"19\"] | 'twenty' -> INTEGER[\"20\"] );
    public final DateParser.numeric_or_natural_integer_return numeric_or_natural_integer() throws RecognitionException {
        DateParser.numeric_or_natural_integer_return retval = new DateParser.numeric_or_natural_integer_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal251=null;
        Token string_literal252=null;
        Token string_literal253=null;
        Token string_literal254=null;
        Token string_literal255=null;
        Token string_literal256=null;
        Token string_literal257=null;
        Token string_literal258=null;
        Token string_literal259=null;
        Token string_literal260=null;
        Token string_literal261=null;
        Token string_literal262=null;
        Token string_literal263=null;
        Token string_literal264=null;
        Token string_literal265=null;
        Token string_literal266=null;
        Token string_literal267=null;
        Token string_literal268=null;
        Token string_literal269=null;
        Token string_literal270=null;
        DateParser.numeric_year_return numeric_year250 = null;


        Object string_literal251_tree=null;
        Object string_literal252_tree=null;
        Object string_literal253_tree=null;
        Object string_literal254_tree=null;
        Object string_literal255_tree=null;
        Object string_literal256_tree=null;
        Object string_literal257_tree=null;
        Object string_literal258_tree=null;
        Object string_literal259_tree=null;
        Object string_literal260_tree=null;
        Object string_literal261_tree=null;
        Object string_literal262_tree=null;
        Object string_literal263_tree=null;
        Object string_literal264_tree=null;
        Object string_literal265_tree=null;
        Object string_literal266_tree=null;
        Object string_literal267_tree=null;
        Object string_literal268_tree=null;
        Object string_literal269_tree=null;
        Object string_literal270_tree=null;
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleTokenStream stream_179=new RewriteRuleTokenStream(adaptor,"token 179");
        RewriteRuleTokenStream stream_178=new RewriteRuleTokenStream(adaptor,"token 178");
        RewriteRuleTokenStream stream_169=new RewriteRuleTokenStream(adaptor,"token 169");
        RewriteRuleTokenStream stream_177=new RewriteRuleTokenStream(adaptor,"token 177");
        RewriteRuleTokenStream stream_176=new RewriteRuleTokenStream(adaptor,"token 176");
        RewriteRuleTokenStream stream_166=new RewriteRuleTokenStream(adaptor,"token 166");
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleTokenStream stream_168=new RewriteRuleTokenStream(adaptor,"token 168");
        RewriteRuleTokenStream stream_167=new RewriteRuleTokenStream(adaptor,"token 167");
        RewriteRuleTokenStream stream_170=new RewriteRuleTokenStream(adaptor,"token 170");
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_171=new RewriteRuleTokenStream(adaptor,"token 171");
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleTokenStream stream_163=new RewriteRuleTokenStream(adaptor,"token 163");
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleTokenStream stream_174=new RewriteRuleTokenStream(adaptor,"token 174");
        RewriteRuleTokenStream stream_175=new RewriteRuleTokenStream(adaptor,"token 175");
        RewriteRuleTokenStream stream_172=new RewriteRuleTokenStream(adaptor,"token 172");
        RewriteRuleTokenStream stream_173=new RewriteRuleTokenStream(adaptor,"token 173");
        RewriteRuleSubtreeStream stream_numeric_year=new RewriteRuleSubtreeStream(adaptor,"rule numeric_year");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:332:3: ( numeric_year -> INTEGER[$numeric_year.text] | 'one' -> INTEGER[\"1\"] | 'two' -> INTEGER[\"2\"] | 'three' -> INTEGER[\"3\"] | 'four' -> INTEGER[\"4\"] | 'five' -> INTEGER[\"5\"] | 'six' -> INTEGER[\"6\"] | 'seven' -> INTEGER[\"7\"] | 'eight' -> INTEGER[\"8\"] | 'nine' -> INTEGER[\"9\"] | 'ten' -> INTEGER[\"10\"] | 'eleven' -> INTEGER[\"11\"] | 'twelve' -> INTEGER[\"12\"] | 'thirteen' -> INTEGER[\"13\"] | 'fourteen' -> INTEGER[\"14\"] | 'fifteen' -> INTEGER[\"15\"] | 'sixteen' -> INTEGER[\"16\"] | 'seventeen' -> INTEGER[\"17\"] | 'eighteen' -> INTEGER[\"18\"] | 'nineteen' -> INTEGER[\"19\"] | 'twenty' -> INTEGER[\"20\"] )
            int alt68=21;
            switch ( input.LA(1) ) {
            case ONE_TO_TWELVE:
            case THIRTEEN_TO_TWENTY_FOUR:
            case TWENTY_FIVE_TO_THIRTY_ONE:
            case TWO_ZEROS:
            case THIRTY_TWO_TO_FIFTY_NINE:
            case SIXTY_TO_NINETY_NINE:
            case THREE_DIGIT:
            case FOUR_DIGIT:
                {
                alt68=1;
                }
                break;
            case 163:
                {
                alt68=2;
                }
                break;
            case 164:
                {
                alt68=3;
                }
                break;
            case 165:
                {
                alt68=4;
                }
                break;
            case 166:
                {
                alt68=5;
                }
                break;
            case 167:
                {
                alt68=6;
                }
                break;
            case 168:
                {
                alt68=7;
                }
                break;
            case 169:
                {
                alt68=8;
                }
                break;
            case 170:
                {
                alt68=9;
                }
                break;
            case 171:
                {
                alt68=10;
                }
                break;
            case 172:
                {
                alt68=11;
                }
                break;
            case 173:
                {
                alt68=12;
                }
                break;
            case 174:
                {
                alt68=13;
                }
                break;
            case 175:
                {
                alt68=14;
                }
                break;
            case 176:
                {
                alt68=15;
                }
                break;
            case 177:
                {
                alt68=16;
                }
                break;
            case 178:
                {
                alt68=17;
                }
                break;
            case 179:
                {
                alt68=18;
                }
                break;
            case 180:
                {
                alt68=19;
                }
                break;
            case 181:
                {
                alt68=20;
                }
                break;
            case 133:
                {
                alt68=21;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:332:5: numeric_year
                    {
                    pushFollow(FOLLOW_numeric_year_in_numeric_or_natural_integer3911);
                    numeric_year250=numeric_year();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_numeric_year.add(numeric_year250.getTree());


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 332:18: -> INTEGER[$numeric_year.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (numeric_year250!=null?input.toString(numeric_year250.start,numeric_year250.stop):null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:333:5: 'one'
                    {
                    string_literal251=(Token)match(input,163,FOLLOW_163_in_numeric_or_natural_integer3922); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_163.add(string_literal251);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 333:18: -> INTEGER[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:334:5: 'two'
                    {
                    string_literal252=(Token)match(input,164,FOLLOW_164_in_numeric_or_natural_integer3940); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_164.add(string_literal252);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 334:18: -> INTEGER[\"2\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "2"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:335:5: 'three'
                    {
                    string_literal253=(Token)match(input,165,FOLLOW_165_in_numeric_or_natural_integer3958); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_165.add(string_literal253);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 335:18: -> INTEGER[\"3\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "3"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:336:5: 'four'
                    {
                    string_literal254=(Token)match(input,166,FOLLOW_166_in_numeric_or_natural_integer3974); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_166.add(string_literal254);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 336:18: -> INTEGER[\"4\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "4"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:337:5: 'five'
                    {
                    string_literal255=(Token)match(input,167,FOLLOW_167_in_numeric_or_natural_integer3991); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_167.add(string_literal255);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 337:18: -> INTEGER[\"5\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "5"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:338:5: 'six'
                    {
                    string_literal256=(Token)match(input,168,FOLLOW_168_in_numeric_or_natural_integer4008); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_168.add(string_literal256);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 338:18: -> INTEGER[\"6\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "6"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:339:5: 'seven'
                    {
                    string_literal257=(Token)match(input,169,FOLLOW_169_in_numeric_or_natural_integer4026); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_169.add(string_literal257);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 339:18: -> INTEGER[\"7\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "7"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:340:5: 'eight'
                    {
                    string_literal258=(Token)match(input,170,FOLLOW_170_in_numeric_or_natural_integer4042); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_170.add(string_literal258);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 340:18: -> INTEGER[\"8\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "8"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:341:5: 'nine'
                    {
                    string_literal259=(Token)match(input,171,FOLLOW_171_in_numeric_or_natural_integer4058); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_171.add(string_literal259);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 341:18: -> INTEGER[\"9\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "9"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:342:5: 'ten'
                    {
                    string_literal260=(Token)match(input,172,FOLLOW_172_in_numeric_or_natural_integer4075); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_172.add(string_literal260);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 342:18: -> INTEGER[\"10\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "10"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:343:5: 'eleven'
                    {
                    string_literal261=(Token)match(input,173,FOLLOW_173_in_numeric_or_natural_integer4093); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_173.add(string_literal261);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 343:18: -> INTEGER[\"11\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "11"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:344:5: 'twelve'
                    {
                    string_literal262=(Token)match(input,174,FOLLOW_174_in_numeric_or_natural_integer4108); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_174.add(string_literal262);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 344:18: -> INTEGER[\"12\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "12"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 14 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:345:5: 'thirteen'
                    {
                    string_literal263=(Token)match(input,175,FOLLOW_175_in_numeric_or_natural_integer4123); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_175.add(string_literal263);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 345:18: -> INTEGER[\"13\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "13"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 15 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:346:5: 'fourteen'
                    {
                    string_literal264=(Token)match(input,176,FOLLOW_176_in_numeric_or_natural_integer4136); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_176.add(string_literal264);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 346:18: -> INTEGER[\"14\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "14"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 16 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:347:5: 'fifteen'
                    {
                    string_literal265=(Token)match(input,177,FOLLOW_177_in_numeric_or_natural_integer4149); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_177.add(string_literal265);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 347:18: -> INTEGER[\"15\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "15"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 17 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:348:5: 'sixteen'
                    {
                    string_literal266=(Token)match(input,178,FOLLOW_178_in_numeric_or_natural_integer4163); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_178.add(string_literal266);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 348:18: -> INTEGER[\"16\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "16"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 18 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:349:5: 'seventeen'
                    {
                    string_literal267=(Token)match(input,179,FOLLOW_179_in_numeric_or_natural_integer4177); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_179.add(string_literal267);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 349:18: -> INTEGER[\"17\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "17"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 19 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:350:5: 'eighteen'
                    {
                    string_literal268=(Token)match(input,180,FOLLOW_180_in_numeric_or_natural_integer4189); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_180.add(string_literal268);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 350:18: -> INTEGER[\"18\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "18"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 20 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:351:5: 'nineteen'
                    {
                    string_literal269=(Token)match(input,181,FOLLOW_181_in_numeric_or_natural_integer4202); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_181.add(string_literal269);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 351:18: -> INTEGER[\"19\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "19"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 21 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:352:5: 'twenty'
                    {
                    string_literal270=(Token)match(input,133,FOLLOW_133_in_numeric_or_natural_integer4215); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_133.add(string_literal270);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 352:18: -> INTEGER[\"20\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "20"));

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
    // $ANTLR end "numeric_or_natural_integer"

    public static class separator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "separator"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:397:1: separator : ( DASH | SLASH );
    public final DateParser.separator_return separator() throws RecognitionException {
        DateParser.separator_return retval = new DateParser.separator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set271=null;

        Object set271_tree=null;

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:398:3: ( DASH | SLASH )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:
            {
            root_0 = (Object)adaptor.nil();

            set271=(Token)input.LT(1);
            if ( input.LA(1)==DASH||input.LA(1)==SLASH ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set271));
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
    // $ANTLR end "separator"

    // $ANTLR start synpred1_Date
    public final void synpred1_Date_fragment() throws RecognitionException {   
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:53:5: ( date ( 'at' )? ( time )? )
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:53:5: date ( 'at' )? ( time )?
        {
        pushFollow(FOLLOW_date_in_synpred1_Date195);
        date();

        state._fsp--;
        if (state.failed) return ;
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:53:10: ( 'at' )?
        int alt69=2;
        int LA69_0 = input.LA(1);

        if ( (LA69_0==32) ) {
            alt69=1;
        }
        switch (alt69) {
            case 1 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:53:10: 'at'
                {
                match(input,32,FOLLOW_32_in_synpred1_Date197); if (state.failed) return ;

                }
                break;

        }

        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:53:16: ( time )?
        int alt70=2;
        int LA70_0 = input.LA(1);

        if ( (LA70_0==ONE_TO_TWELVE||LA70_0==THIRTEEN_TO_TWENTY_FOUR||LA70_0==TWO_ZEROS||(LA70_0>=37 && LA70_0<=38)) ) {
            alt70=1;
        }
        switch (alt70) {
            case 1 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:53:16: time
                {
                pushFollow(FOLLOW_time_in_synpred1_Date200);
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
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:54:5: ( time ( 'on' )? date )
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:54:5: time ( 'on' )? date
        {
        pushFollow(FOLLOW_time_in_synpred2_Date218);
        time();

        state._fsp--;
        if (state.failed) return ;
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:54:10: ( 'on' )?
        int alt71=2;
        int LA71_0 = input.LA(1);

        if ( (LA71_0==33) ) {
            alt71=1;
        }
        switch (alt71) {
            case 1 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:54:10: 'on'
                {
                match(input,33,FOLLOW_33_in_synpred2_Date220); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_date_in_synpred2_Date223);
        date();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Date

    // $ANTLR start synpred3_Date
    public final void synpred3_Date_fragment() throws RecognitionException {   
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:60:5: ( relative_date )
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:60:5: relative_date
        {
        pushFollow(FOLLOW_relative_date_in_synpred3_Date281);
        relative_date();

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


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA54 dfa54 = new DFA54(this);
    static final String DFA4_eotS =
        "\113\uffff";
    static final String DFA4_eofS =
        "\2\uffff\5\46\27\1\1\uffff\6\46\2\uffff\27\1\2\uffff\13\46";
    static final String DFA4_minS =
        "\1\24\1\uffff\43\24\2\uffff\27\24\2\0\13\24";
    static final String DFA4_maxS =
        "\1\u00b5\1\uffff\5\u00b5\27\u0092\1\31\6\u00b5\2\uffff\27\u0093"+
        "\2\0\13\u00b5";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\43\uffff\1\2\1\3\44\uffff";
    static final String DFA4_specialS =
        "\76\uffff\1\1\1\0\13\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\3\1\uffff\1\4\1\1\1\2\4\1\10\uffff\1\5\1\6\1\uffff\7\1\6"+
            "\uffff\27\1\21\uffff\66\1\1\uffff\1\1\6\uffff\33\1",
            "",
            "\1\45\1\uffff\7\45\4\uffff\1\45\2\uffff\1\36\3\uffff\7\45\2"+
            "\uffff\4\1\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
            "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34"+
            "\1\35\21\1\66\45\1\uffff\1\45\1\37\1\40\1\41\1\42\1\43\1\44"+
            "\33\45",
            "\1\45\1\1\7\45\1\uffff\1\1\2\uffff\1\45\1\uffff\1\1\1\36\3"+
            "\uffff\7\45\2\uffff\4\1\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1"+
            "\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1"+
            "\72\1\73\1\74\1\75\21\1\66\45\1\uffff\1\45\1\37\1\40\1\41\1"+
            "\42\1\43\1\44\33\45",
            "\1\45\1\uffff\7\45\4\uffff\1\45\1\uffff\1\1\1\36\3\uffff\7"+
            "\45\2\uffff\4\1\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57"+
            "\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73"+
            "\1\74\1\75\21\1\66\45\1\uffff\1\45\1\37\1\40\1\41\1\42\1\43"+
            "\1\44\33\45",
            "\1\45\1\uffff\7\45\4\uffff\1\45\6\uffff\7\45\6\uffff\27\45"+
            "\21\uffff\66\45\1\uffff\1\45\6\uffff\33\45",
            "\1\45\1\uffff\7\45\4\uffff\1\45\6\uffff\7\45\6\uffff\27\45"+
            "\21\uffff\66\45\1\uffff\1\45\6\uffff\33\45",
            "\1\76\1\uffff\1\77\1\45\1\1\7\uffff\1\1\4\uffff\3\1\7\uffff"+
            "\2\1\54\uffff\66\45",
            "\1\76\1\uffff\1\77\1\45\1\1\7\uffff\1\1\4\uffff\3\1\7\uffff"+
            "\2\1\54\uffff\66\45",
            "\1\76\1\uffff\1\77\1\45\1\1\7\uffff\1\1\4\uffff\3\1\7\uffff"+
            "\2\1\54\uffff\66\45",
            "\1\76\1\uffff\1\77\1\45\1\1\7\uffff\1\1\4\uffff\3\1\7\uffff"+
            "\2\1\54\uffff\66\45",
            "\1\76\1\uffff\1\77\1\45\1\1\7\uffff\1\1\4\uffff\3\1\7\uffff"+
            "\2\1\54\uffff\66\45",
            "\1\76\1\uffff\1\77\1\45\1\1\7\uffff\1\1\4\uffff\3\1\7\uffff"+
            "\2\1\54\uffff\66\45",
            "\1\76\1\uffff\1\77\1\45\1\1\7\uffff\1\1\4\uffff\3\1\7\uffff"+
            "\2\1\54\uffff\66\45",
            "\1\76\1\uffff\1\77\1\45\1\1\7\uffff\1\1\4\uffff\3\1\7\uffff"+
            "\2\1\54\uffff\66\45",
            "\1\76\1\uffff\1\77\1\45\1\1\7\uffff\1\1\4\uffff\3\1\7\uffff"+
            "\2\1\54\uffff\66\45",
            "\1\76\1\uffff\1\77\1\45\1\1\7\uffff\1\1\4\uffff\3\1\7\uffff"+
            "\2\1\54\uffff\66\45",
            "\1\76\1\uffff\1\77\1\45\1\1\7\uffff\1\1\4\uffff\3\1\7\uffff"+
            "\2\1\54\uffff\66\45",
            "\1\76\1\uffff\1\77\1\45\1\1\7\uffff\1\1\4\uffff\3\1\7\uffff"+
            "\2\1\54\uffff\66\45",
            "\1\76\1\uffff\1\77\1\45\1\1\7\uffff\1\1\4\uffff\3\1\7\uffff"+
            "\2\1\54\uffff\66\45",
            "\1\76\1\uffff\1\77\1\45\1\1\7\uffff\1\1\4\uffff\3\1\7\uffff"+
            "\2\1\54\uffff\66\45",
            "\1\76\1\uffff\1\77\1\45\1\1\7\uffff\1\1\4\uffff\3\1\7\uffff"+
            "\2\1\54\uffff\66\45",
            "\1\76\1\uffff\1\77\1\45\1\1\7\uffff\1\1\4\uffff\3\1\7\uffff"+
            "\2\1\54\uffff\66\45",
            "\1\76\1\uffff\1\77\1\45\1\1\7\uffff\1\1\4\uffff\3\1\7\uffff"+
            "\2\1\54\uffff\66\45",
            "\1\76\1\uffff\1\77\1\45\1\1\7\uffff\1\1\4\uffff\3\1\7\uffff"+
            "\2\1\54\uffff\66\45",
            "\1\76\1\uffff\1\77\1\45\1\1\7\uffff\1\1\4\uffff\3\1\7\uffff"+
            "\2\1\54\uffff\66\45",
            "\1\76\1\uffff\1\77\1\45\1\1\7\uffff\1\1\4\uffff\3\1\7\uffff"+
            "\2\1\54\uffff\66\45",
            "\1\76\1\uffff\1\77\1\45\1\1\7\uffff\1\1\4\uffff\3\1\7\uffff"+
            "\2\1\54\uffff\66\45",
            "\1\76\1\uffff\1\77\1\45\1\1\7\uffff\1\1\4\uffff\3\1\7\uffff"+
            "\2\1\54\uffff\66\45",
            "\1\76\1\uffff\1\77\1\45\1\1\7\uffff\1\1\4\uffff\3\1\7\uffff"+
            "\2\1\54\uffff\66\45",
            "\1\101\1\uffff\1\102\1\103\1\100\1\104",
            "\1\45\1\uffff\7\45\4\uffff\1\45\6\uffff\7\45\6\uffff\27\45"+
            "\21\uffff\66\45\1\uffff\1\45\6\uffff\33\45",
            "\1\45\1\uffff\7\45\4\uffff\1\45\6\uffff\7\45\6\uffff\27\45"+
            "\21\uffff\66\45\1\uffff\1\45\6\uffff\33\45",
            "\1\45\1\uffff\7\45\4\uffff\1\45\6\uffff\7\45\6\uffff\27\45"+
            "\21\uffff\66\45\1\uffff\1\45\6\uffff\33\45",
            "\1\45\1\uffff\7\45\4\uffff\1\45\6\uffff\7\45\6\uffff\27\45"+
            "\21\uffff\66\45\1\uffff\1\45\6\uffff\33\45",
            "\1\45\1\uffff\7\45\4\uffff\1\45\6\uffff\7\45\6\uffff\27\45"+
            "\21\uffff\66\45\1\uffff\1\45\6\uffff\33\45",
            "\1\45\1\uffff\7\45\4\uffff\1\45\6\uffff\7\45\6\uffff\27\45"+
            "\21\uffff\66\45\1\uffff\1\45\6\uffff\33\45",
            "",
            "",
            "\1\76\1\uffff\1\77\1\45\1\1\2\uffff\2\1\3\uffff\1\1\1\uffff"+
            "\1\1\2\uffff\3\1\6\uffff\3\1\54\uffff\66\45\1\1",
            "\1\76\1\uffff\1\77\1\45\1\1\2\uffff\2\1\3\uffff\1\1\1\uffff"+
            "\1\1\2\uffff\3\1\6\uffff\3\1\54\uffff\66\45\1\1",
            "\1\76\1\uffff\1\77\1\45\1\1\2\uffff\2\1\3\uffff\1\1\1\uffff"+
            "\1\1\2\uffff\3\1\6\uffff\3\1\54\uffff\66\45\1\1",
            "\1\76\1\uffff\1\77\1\45\1\1\2\uffff\2\1\3\uffff\1\1\1\uffff"+
            "\1\1\2\uffff\3\1\6\uffff\3\1\54\uffff\66\45\1\1",
            "\1\76\1\uffff\1\77\1\45\1\1\2\uffff\2\1\3\uffff\1\1\1\uffff"+
            "\1\1\2\uffff\3\1\6\uffff\3\1\54\uffff\66\45\1\1",
            "\1\76\1\uffff\1\77\1\45\1\1\2\uffff\2\1\3\uffff\1\1\1\uffff"+
            "\1\1\2\uffff\3\1\6\uffff\3\1\54\uffff\66\45\1\1",
            "\1\76\1\uffff\1\77\1\45\1\1\2\uffff\2\1\3\uffff\1\1\1\uffff"+
            "\1\1\2\uffff\3\1\6\uffff\3\1\54\uffff\66\45\1\1",
            "\1\76\1\uffff\1\77\1\45\1\1\2\uffff\2\1\3\uffff\1\1\1\uffff"+
            "\1\1\2\uffff\3\1\6\uffff\3\1\54\uffff\66\45\1\1",
            "\1\76\1\uffff\1\77\1\45\1\1\2\uffff\2\1\3\uffff\1\1\1\uffff"+
            "\1\1\2\uffff\3\1\6\uffff\3\1\54\uffff\66\45\1\1",
            "\1\76\1\uffff\1\77\1\45\1\1\2\uffff\2\1\3\uffff\1\1\1\uffff"+
            "\1\1\2\uffff\3\1\6\uffff\3\1\54\uffff\66\45\1\1",
            "\1\76\1\uffff\1\77\1\45\1\1\2\uffff\2\1\3\uffff\1\1\1\uffff"+
            "\1\1\2\uffff\3\1\6\uffff\3\1\54\uffff\66\45\1\1",
            "\1\76\1\uffff\1\77\1\45\1\1\2\uffff\2\1\3\uffff\1\1\1\uffff"+
            "\1\1\2\uffff\3\1\6\uffff\3\1\54\uffff\66\45\1\1",
            "\1\76\1\uffff\1\77\1\45\1\1\2\uffff\2\1\3\uffff\1\1\1\uffff"+
            "\1\1\2\uffff\3\1\6\uffff\3\1\54\uffff\66\45\1\1",
            "\1\76\1\uffff\1\77\1\45\1\1\2\uffff\2\1\3\uffff\1\1\1\uffff"+
            "\1\1\2\uffff\3\1\6\uffff\3\1\54\uffff\66\45\1\1",
            "\1\76\1\uffff\1\77\1\45\1\1\2\uffff\2\1\3\uffff\1\1\1\uffff"+
            "\1\1\2\uffff\3\1\6\uffff\3\1\54\uffff\66\45\1\1",
            "\1\76\1\uffff\1\77\1\45\1\1\2\uffff\2\1\3\uffff\1\1\1\uffff"+
            "\1\1\2\uffff\3\1\6\uffff\3\1\54\uffff\66\45\1\1",
            "\1\76\1\uffff\1\77\1\45\1\1\2\uffff\2\1\3\uffff\1\1\1\uffff"+
            "\1\1\2\uffff\3\1\6\uffff\3\1\54\uffff\66\45\1\1",
            "\1\76\1\uffff\1\77\1\45\1\1\2\uffff\2\1\3\uffff\1\1\1\uffff"+
            "\1\1\2\uffff\3\1\6\uffff\3\1\54\uffff\66\45\1\1",
            "\1\76\1\uffff\1\77\1\45\1\1\2\uffff\2\1\3\uffff\1\1\1\uffff"+
            "\1\1\2\uffff\3\1\6\uffff\3\1\54\uffff\66\45\1\1",
            "\1\76\1\uffff\1\77\1\45\1\1\2\uffff\2\1\3\uffff\1\1\1\uffff"+
            "\1\1\2\uffff\3\1\6\uffff\3\1\54\uffff\66\45\1\1",
            "\1\76\1\uffff\1\77\1\45\1\1\2\uffff\2\1\3\uffff\1\1\1\uffff"+
            "\1\1\2\uffff\3\1\6\uffff\3\1\54\uffff\66\45\1\1",
            "\1\76\1\uffff\1\77\1\45\1\1\2\uffff\2\1\3\uffff\1\1\1\uffff"+
            "\1\1\2\uffff\3\1\6\uffff\3\1\54\uffff\66\45\1\1",
            "\1\76\1\uffff\1\77\1\45\1\1\2\uffff\2\1\3\uffff\1\1\1\uffff"+
            "\1\1\2\uffff\3\1\6\uffff\3\1\54\uffff\66\45\1\1",
            "\1\uffff",
            "\1\uffff",
            "\1\45\1\uffff\7\45\4\uffff\1\45\6\uffff\7\45\6\uffff\27\45"+
            "\21\uffff\66\45\1\uffff\1\45\1\105\1\106\1\107\1\110\1\111\1"+
            "\112\33\45",
            "\1\45\1\uffff\7\45\4\uffff\1\45\6\uffff\7\45\6\uffff\27\45"+
            "\21\uffff\66\45\1\uffff\1\45\1\105\1\106\1\107\1\110\1\111\1"+
            "\112\33\45",
            "\1\45\1\uffff\7\45\4\uffff\1\45\6\uffff\7\45\6\uffff\27\45"+
            "\21\uffff\66\45\1\uffff\1\45\1\105\1\106\1\107\1\110\1\111\1"+
            "\112\33\45",
            "\1\45\1\uffff\7\45\4\uffff\1\45\6\uffff\7\45\6\uffff\27\45"+
            "\21\uffff\66\45\1\uffff\1\45\1\105\1\106\1\107\1\110\1\111\1"+
            "\112\33\45",
            "\1\45\1\uffff\7\45\4\uffff\1\45\6\uffff\7\45\6\uffff\27\45"+
            "\21\uffff\66\45\1\uffff\1\45\1\105\1\106\1\107\1\110\1\111\1"+
            "\112\33\45",
            "\1\45\1\uffff\7\45\4\uffff\1\45\6\uffff\7\45\6\uffff\27\45"+
            "\21\uffff\66\45\1\uffff\1\45\6\uffff\33\45",
            "\1\45\1\uffff\7\45\4\uffff\1\45\6\uffff\7\45\6\uffff\27\45"+
            "\21\uffff\66\45\1\uffff\1\45\6\uffff\33\45",
            "\1\45\1\uffff\7\45\4\uffff\1\45\6\uffff\7\45\6\uffff\27\45"+
            "\21\uffff\66\45\1\uffff\1\45\6\uffff\33\45",
            "\1\45\1\uffff\7\45\4\uffff\1\45\6\uffff\7\45\6\uffff\27\45"+
            "\21\uffff\66\45\1\uffff\1\45\6\uffff\33\45",
            "\1\45\1\uffff\7\45\4\uffff\1\45\6\uffff\7\45\6\uffff\27\45"+
            "\21\uffff\66\45\1\uffff\1\45\6\uffff\33\45",
            "\1\45\1\uffff\7\45\4\uffff\1\45\6\uffff\7\45\6\uffff\27\45"+
            "\21\uffff\66\45\1\uffff\1\45\6\uffff\33\45"
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
            return "51:1: datetime options {backtrack=true; } : ( date ( 'at' )? ( time )? -> ^( DATE_TIME date ( time )? ) | time ( 'on' )? date -> ^( DATE_TIME date time ) | time -> ^( DATE_TIME ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"0\"] ) time ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_63 = input.LA(1);

                         
                        int index4_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 37;}

                         
                        input.seek(index4_63);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_62 = input.LA(1);

                         
                        int index4_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 37;}

                         
                        input.seek(index4_62);
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
        "\40\uffff";
    static final String DFA5_eofS =
        "\40\uffff";
    static final String DFA5_minS =
        "\1\24\1\uffff\3\25\2\43\1\25\1\uffff\27\0";
    static final String DFA5_maxS =
        "\1\u00b5\1\uffff\5\134\1\155\1\uffff\27\0";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\6\uffff\1\2\27\uffff";
    static final String DFA5_specialS =
        "\11\uffff\1\17\1\16\1\13\1\11\1\6\1\5\1\3\1\2\1\21\1\23\1\26\1\14"+
        "\1\15\1\20\1\7\1\10\1\0\1\1\1\4\1\22\1\25\1\24\1\12}>";
    static final String[] DFA5_transitionS = {
            "\1\4\1\uffff\1\5\1\6\3\1\1\2\1\3\13\uffff\7\1\6\uffff\27\10"+
            "\21\uffff\50\10\1\7\15\10\1\uffff\1\1\6\uffff\33\1",
            "",
            "\1\10\10\uffff\1\10\22\uffff\54\1",
            "\1\10\10\uffff\1\10\22\uffff\54\1",
            "\1\10\10\uffff\1\10\4\uffff\1\10\15\uffff\4\1\1\11\1\12\1\13"+
            "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
            "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\21\1",
            "\1\10\15\uffff\4\1\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
            "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34"+
            "\1\35\1\36\1\37\21\1",
            "\1\10\15\uffff\4\1\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
            "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34"+
            "\1\35\1\36\1\37\21\1",
            "\1\10\33\uffff\54\1\1\10\1\uffff\1\10\1\uffff\1\10\1\uffff"+
            "\1\10\1\uffff\1\10\1\uffff\1\10\1\uffff\1\10\1\uffff\1\10\1"+
            "\uffff\1\10",
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
            "\1\uffff"
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
            return "58:1: date options {backtrack=true; } : ( relative_date | explicit_date );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_25 = input.LA(1);

                         
                        int index5_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 1;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index5_25);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA5_26 = input.LA(1);

                         
                        int index5_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 1;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index5_26);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA5_16 = input.LA(1);

                         
                        int index5_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 1;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index5_16);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA5_15 = input.LA(1);

                         
                        int index5_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 1;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index5_15);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA5_27 = input.LA(1);

                         
                        int index5_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 1;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index5_27);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA5_14 = input.LA(1);

                         
                        int index5_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 1;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index5_14);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA5_13 = input.LA(1);

                         
                        int index5_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 1;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index5_13);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA5_23 = input.LA(1);

                         
                        int index5_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 1;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index5_23);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA5_24 = input.LA(1);

                         
                        int index5_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 1;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index5_24);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA5_12 = input.LA(1);

                         
                        int index5_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 1;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index5_12);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA5_31 = input.LA(1);

                         
                        int index5_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 1;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index5_31);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA5_11 = input.LA(1);

                         
                        int index5_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 1;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index5_11);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA5_20 = input.LA(1);

                         
                        int index5_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 1;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index5_20);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA5_21 = input.LA(1);

                         
                        int index5_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 1;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index5_21);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA5_10 = input.LA(1);

                         
                        int index5_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 1;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index5_10);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA5_9 = input.LA(1);

                         
                        int index5_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 1;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index5_9);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA5_22 = input.LA(1);

                         
                        int index5_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 1;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index5_22);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA5_17 = input.LA(1);

                         
                        int index5_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 1;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index5_17);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA5_28 = input.LA(1);

                         
                        int index5_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 1;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index5_28);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA5_18 = input.LA(1);

                         
                        int index5_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 1;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index5_18);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA5_30 = input.LA(1);

                         
                        int index5_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 1;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index5_30);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA5_29 = input.LA(1);

                         
                        int index5_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 1;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index5_29);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA5_19 = input.LA(1);

                         
                        int index5_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 1;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index5_19);
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
    static final String DFA6_eotS =
        "\132\uffff";
    static final String DFA6_eofS =
        "\37\uffff\55\2\1\uffff\15\2";
    static final String DFA6_minS =
        "\1\24\2\uffff\34\61\55\24\1\uffff\15\24";
    static final String DFA6_maxS =
        "\1\u00b5\2\uffff\34\134\55\60\1\uffff\15\60";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\1\2\111\uffff\1\3\15\uffff";
    static final String DFA6_specialS =
        "\132\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\6\1\uffff\1\7\1\10\1\5\1\11\1\12\1\3\1\4\13\uffff\7\2\126"+
            "\uffff\1\36\16\uffff\1\1\6\uffff\10\1\1\13\1\14\1\15\1\16\1"+
            "\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1"+
            "\33\1\34\1\35",
            "",
            "",
            "\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73"+
            "\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106"+
            "\1\107\1\110\1\111\1\112\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
            "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57",
            "\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73"+
            "\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106"+
            "\1\107\1\110\1\111\1\112\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
            "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57",
            "\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73"+
            "\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106"+
            "\1\107\1\110\1\111\1\112\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
            "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57",
            "\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73"+
            "\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106"+
            "\1\107\1\110\1\111\1\112\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
            "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57",
            "\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73"+
            "\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106"+
            "\1\107\1\110\1\111\1\112\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
            "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57",
            "\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73"+
            "\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106"+
            "\1\107\1\110\1\111\1\112\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
            "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57",
            "\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73"+
            "\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106"+
            "\1\107\1\110\1\111\1\112\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
            "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57",
            "\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73"+
            "\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106"+
            "\1\107\1\110\1\111\1\112\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
            "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57",
            "\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73"+
            "\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106"+
            "\1\107\1\110\1\111\1\112\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
            "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57",
            "\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73"+
            "\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106"+
            "\1\107\1\110\1\111\1\112\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
            "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57",
            "\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73"+
            "\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106"+
            "\1\107\1\110\1\111\1\112\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
            "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57",
            "\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73"+
            "\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106"+
            "\1\107\1\110\1\111\1\112\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
            "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57",
            "\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73"+
            "\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106"+
            "\1\107\1\110\1\111\1\112\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
            "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57",
            "\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73"+
            "\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106"+
            "\1\107\1\110\1\111\1\112\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
            "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57",
            "\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73"+
            "\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106"+
            "\1\107\1\110\1\111\1\112\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
            "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57",
            "\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73"+
            "\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106"+
            "\1\107\1\110\1\111\1\112\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
            "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57",
            "\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73"+
            "\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106"+
            "\1\107\1\110\1\111\1\112\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
            "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57",
            "\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73"+
            "\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106"+
            "\1\107\1\110\1\111\1\112\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
            "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57",
            "\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73"+
            "\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106"+
            "\1\107\1\110\1\111\1\112\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
            "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57",
            "\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73"+
            "\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106"+
            "\1\107\1\110\1\111\1\112\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
            "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57",
            "\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73"+
            "\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106"+
            "\1\107\1\110\1\111\1\112\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
            "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57",
            "\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73"+
            "\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106"+
            "\1\107\1\110\1\111\1\112\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
            "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57",
            "\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73"+
            "\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106"+
            "\1\107\1\110\1\111\1\112\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
            "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57",
            "\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73"+
            "\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106"+
            "\1\107\1\110\1\111\1\112\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
            "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57",
            "\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73"+
            "\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106"+
            "\1\107\1\110\1\111\1\112\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
            "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57",
            "\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73"+
            "\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106"+
            "\1\107\1\110\1\111\1\112\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
            "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57",
            "\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73"+
            "\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106"+
            "\1\107\1\110\1\111\1\112\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
            "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57",
            "\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73"+
            "\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106"+
            "\1\107\1\110\1\111\1\112\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
            "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\1\113"+
            "\7\uffff\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\10\uffff"+
            "\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\1\115"+
            "\7\uffff\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\1\116"+
            "\7\uffff\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\10\uffff"+
            "\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\1\117"+
            "\7\uffff\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\10\uffff"+
            "\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\1\120"+
            "\7\uffff\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\10\uffff"+
            "\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\10\uffff"+
            "\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\1\121"+
            "\7\uffff\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\10\uffff"+
            "\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\1\122"+
            "\7\uffff\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\10\uffff"+
            "\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\1\123"+
            "\7\uffff\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\1\124"+
            "\7\uffff\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\10\uffff"+
            "\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\1\125"+
            "\7\uffff\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\1\126"+
            "\7\uffff\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\1\127"+
            "\7\uffff\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\1\130"+
            "\7\uffff\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\1\131"+
            "\7\uffff\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\1\131"+
            "\7\uffff\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\1\131"+
            "\7\uffff\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\1\131"+
            "\7\uffff\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\1\131"+
            "\7\uffff\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\1\131"+
            "\7\uffff\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\1\131"+
            "\7\uffff\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\1\131"+
            "\7\uffff\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\1\131"+
            "\7\uffff\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\1\131"+
            "\7\uffff\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\1\131"+
            "\7\uffff\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\1\131"+
            "\7\uffff\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\1\131"+
            "\7\uffff\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\1\131"+
            "\7\uffff\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\1\131"+
            "\7\uffff\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\1\131"+
            "\7\uffff\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\1\131"+
            "\7\uffff\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\1\131"+
            "\7\uffff\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\1\131"+
            "\7\uffff\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\1\131"+
            "\7\uffff\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\1\131"+
            "\7\uffff\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\1\131"+
            "\7\uffff\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\1\131"+
            "\7\uffff\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\10\uffff"+
            "\2\114",
            "",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\10\uffff"+
            "\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\10\uffff"+
            "\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\10\uffff"+
            "\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\10\uffff"+
            "\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\10\uffff"+
            "\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\10\uffff"+
            "\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\10\uffff"+
            "\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\10\uffff"+
            "\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\10\uffff"+
            "\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\10\uffff"+
            "\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\10\uffff"+
            "\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\10\uffff"+
            "\2\114",
            "\1\2\1\uffff\1\2\1\uffff\1\2\7\uffff\1\2\4\uffff\2\2\10\uffff"+
            "\2\114"
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
            return "68:1: relative_date : ( today_or_tomorrow | relative_prefix modifiable_target -> ^( RELATIVE_DATE relative_prefix modifiable_target ) | numeric_or_natural_integer modifiable_target relative_suffix -> ^( RELATIVE_DATE relative_suffix numeric_or_natural_integer modifiable_target ) );";
        }
    }
    static final String DFA54_eotS =
        "\102\uffff";
    static final String DFA54_eofS =
        "\102\uffff";
    static final String DFA54_minS =
        "\1\24\50\uffff\1\25\16\uffff\1\135\11\uffff";
    static final String DFA54_maxS =
        "\1\u0092\50\uffff\1\155\16\uffff\1\155\11\uffff";
    static final String DFA54_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
        "\1\47\1\50\1\uffff\1\52\1\54\1\56\1\60\1\62\1\64\1\66\1\70\1\72"+
        "\1\73\1\74\1\75\1\76\1\77\1\uffff\1\55\1\71\1\67\1\61\1\57\1\51"+
        "\1\65\1\63\1\53";
    static final String DFA54_specialS =
        "\102\uffff}>";
    static final String[] DFA54_transitionS = {
            "\1\67\1\uffff\2\67\105\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10"+
            "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
            "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40"+
            "\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
            "\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\70\107\uffff\1\76\1\uffff\1\101\1\uffff\1\71\1\uffff\1\75"+
            "\1\uffff\1\74\1\uffff\1\100\1\uffff\1\77\1\uffff\1\73\1\uffff"+
            "\1\72",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\76\1\uffff\1\101\1\uffff\1\71\1\uffff\1\75\1\uffff\1\74"+
            "\1\uffff\1\100\1\uffff\1\77\1\uffff\1\73\1\uffff\1\72",
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

    static final short[] DFA54_eot = DFA.unpackEncodedString(DFA54_eotS);
    static final short[] DFA54_eof = DFA.unpackEncodedString(DFA54_eofS);
    static final char[] DFA54_min = DFA.unpackEncodedStringToUnsignedChars(DFA54_minS);
    static final char[] DFA54_max = DFA.unpackEncodedStringToUnsignedChars(DFA54_maxS);
    static final short[] DFA54_accept = DFA.unpackEncodedString(DFA54_acceptS);
    static final short[] DFA54_special = DFA.unpackEncodedString(DFA54_specialS);
    static final short[][] DFA54_transition;

    static {
        int numStates = DFA54_transitionS.length;
        DFA54_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA54_transition[i] = DFA.unpackEncodedString(DFA54_transitionS[i]);
        }
    }

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = DFA54_eot;
            this.eof = DFA54_eof;
            this.min = DFA54_min;
            this.max = DFA54_max;
            this.accept = DFA54_accept;
            this.special = DFA54_special;
            this.transition = DFA54_transition;
        }
        public String getDescription() {
            return "195:1: day_of_month : ( 'first' -> DAY_OF_MONTH[\"1\"] | '1st' -> DAY_OF_MONTH[\"1\"] | 'second' -> DAY_OF_MONTH[\"2\"] | '2nd' -> DAY_OF_MONTH[\"2\"] | 'third' -> DAY_OF_MONTH[\"3\"] | '3rd' -> DAY_OF_MONTH[\"3\"] | 'fourth' -> DAY_OF_MONTH[\"4\"] | '4th' -> DAY_OF_MONTH[\"4\"] | 'fifth' -> DAY_OF_MONTH[\"5\"] | '5th' -> DAY_OF_MONTH[\"5\"] | 'sixth' -> DAY_OF_MONTH[\"6\"] | '6th' -> DAY_OF_MONTH[\"6\"] | 'seventh' -> DAY_OF_MONTH[\"7\"] | '7th' -> DAY_OF_MONTH[\"7\"] | 'eighth' -> DAY_OF_MONTH[\"8\"] | '8th' -> DAY_OF_MONTH[\"8\"] | 'ninth' -> DAY_OF_MONTH[\"9\"] | '9th' -> DAY_OF_MONTH[\"9\"] | 'tenth' -> DAY_OF_MONTH[\"10\"] | '10th' -> DAY_OF_MONTH[\"10\"] | 'eleventh' -> DAY_OF_MONTH[\"11\"] | '11th' -> DAY_OF_MONTH[\"11\"] | 'twelfth' -> DAY_OF_MONTH[\"12\"] | '12th' -> DAY_OF_MONTH[\"12\"] | 'thirteenth' -> DAY_OF_MONTH[\"13\"] | '13th' -> DAY_OF_MONTH[\"13\"] | 'fourteenth' -> DAY_OF_MONTH[\"14\"] | '14th' -> DAY_OF_MONTH[\"14\"] | 'fifteenth' -> DAY_OF_MONTH[\"15\"] | '15th' -> DAY_OF_MONTH[\"15\"] | 'sixteenth' -> DAY_OF_MONTH[\"16\"] | '16th' -> DAY_OF_MONTH[\"16\"] | 'seventeenth' -> DAY_OF_MONTH[\"17\"] | '17th' -> DAY_OF_MONTH[\"17\"] | 'eighteenth' -> DAY_OF_MONTH[\"18\"] | '18th' -> DAY_OF_MONTH[\"18\"] | 'nineteenth' -> DAY_OF_MONTH[\"19\"] | '19th' -> DAY_OF_MONTH[\"19\"] | 'twentieth' -> DAY_OF_MONTH[\"20\"] | '20th' -> DAY_OF_MONTH[\"20\"] | 'twenty' ( DASH )? 'first' -> DAY_OF_MONTH[\"21\"] | '21st' -> DAY_OF_MONTH[\"21\"] | 'twenty' ( DASH )? 'second' -> DAY_OF_MONTH[\"22\"] | '22nd' -> DAY_OF_MONTH[\"22\"] | 'twenty' ( DASH )? 'third' -> DAY_OF_MONTH[\"23\"] | '23rd' -> DAY_OF_MONTH[\"23\"] | 'twenty' ( DASH )? 'fourth' -> DAY_OF_MONTH[\"24\"] | '24th' -> DAY_OF_MONTH[\"24\"] | 'twenty' ( DASH )? 'fifth' -> DAY_OF_MONTH[\"25\"] | '25th' -> DAY_OF_MONTH[\"25\"] | 'twenty' ( DASH )? 'sixth' -> DAY_OF_MONTH[\"26\"] | '26th' -> DAY_OF_MONTH[\"26\"] | 'twenty' ( DASH )? 'seventh' -> DAY_OF_MONTH[\"27\"] | '27th' -> DAY_OF_MONTH[\"27\"] | 'twenty' ( DASH )? 'eighth' -> DAY_OF_MONTH[\"28\"] | '28th' -> DAY_OF_MONTH[\"28\"] | 'twenty' ( DASH )? 'ninth' -> DAY_OF_MONTH[\"29\"] | '29th' -> DAY_OF_MONTH[\"29\"] | 'thirtieth' -> DAY_OF_MONTH[\"30\"] | '30th' -> DAY_OF_MONTH[\"30\"] | 'thirty' ( DASH )? 'first' -> DAY_OF_MONTH[\"31\"] | '31st' -> DAY_OF_MONTH[\"31\"] | numeric_day_of_month );";
        }
    }
 

    public static final BitSet FOLLOW_date_in_datetime195 = new BitSet(new long[]{0x0000006101500002L});
    public static final BitSet FOLLOW_32_in_datetime197 = new BitSet(new long[]{0x0000006001500002L});
    public static final BitSet FOLLOW_time_in_datetime200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_in_datetime218 = new BitSet(new long[]{0xFFE07F021FD00000L,0xFFFFFFFFE0000FFFL,0x003FFFFFF817FFFFL});
    public static final BitSet FOLLOW_33_in_datetime220 = new BitSet(new long[]{0xFFE07F021FD00000L,0xFFFFFFFFE0000FFFL,0x003FFFFFF817FFFFL});
    public static final BitSet FOLLOW_date_in_datetime223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_in_datetime239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relative_date_in_date281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_explicit_date_in_date288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_explicit_time_in_time304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_today_or_tomorrow_in_relative_date317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relative_prefix_in_relative_date326 = new BitSet(new long[]{0xFFFE000000000000L,0x000000001FFFFFFFL});
    public static final BitSet FOLLOW_modifiable_target_in_relative_date328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_or_natural_integer_in_relative_date354 = new BitSet(new long[]{0xFFFE000000000000L,0x000000001FFFFFFFL});
    public static final BitSet FOLLOW_modifiable_target_in_relative_date356 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_relative_suffix_in_relative_date358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_month_in_explicit_date391 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_separator_in_explicit_date393 = new BitSet(new long[]{0xFFE07F021FD00000L,0xFFFFFFFFE0000FFFL,0x003FFFFFF817FFFFL});
    public static final BitSet FOLLOW_numeric_day_of_month_in_explicit_date395 = new BitSet(new long[]{0x0000000040200002L});
    public static final BitSet FOLLOW_separator_in_explicit_date398 = new BitSet(new long[]{0x000000001FD00000L});
    public static final BitSet FOLLOW_numeric_year_in_explicit_date400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_four_digit_year_in_explicit_date430 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_separator_in_explicit_date432 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_numeric_month_in_explicit_date434 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_separator_in_explicit_date436 = new BitSet(new long[]{0xFFE07F021FD00000L,0xFFFFFFFFE0000FFFL,0x003FFFFFF817FFFFL});
    public static final BitSet FOLLOW_numeric_day_of_month_in_explicit_date438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_month_in_explicit_date465 = new BitSet(new long[]{0xFFE07F021FD00000L,0xFFFFFFFFE0000FFFL,0x003FFFFFF817FFFFL});
    public static final BitSet FOLLOW_day_of_month_in_explicit_date467 = new BitSet(new long[]{0x0000400418000002L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_34_in_explicit_date470 = new BitSet(new long[]{0x0000400418000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_year_in_explicit_date473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_day_of_month_in_explicit_date503 = new BitSet(new long[]{0xFFE0000800000000L,0x0000000000000FFFL});
    public static final BitSet FOLLOW_35_in_explicit_date505 = new BitSet(new long[]{0xFFE0000000000000L,0x0000000000000FFFL});
    public static final BitSet FOLLOW_month_in_explicit_date508 = new BitSet(new long[]{0x0000400418000002L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_34_in_explicit_date511 = new BitSet(new long[]{0x0000400418000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_year_in_explicit_date514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_hours_in_explicit_time555 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000007E00000L});
    public static final BitSet FOLLOW_meridian_indicator_in_explicit_time557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_hours_in_explicit_time589 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_explicit_time591 = new BitSet(new long[]{0x0000000003D00000L});
    public static final BitSet FOLLOW_numeric_minutes_in_explicit_time593 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000007E00000L});
    public static final BitSet FOLLOW_meridian_indicator_in_explicit_time595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_identifier_in_explicit_time623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_time_identifier639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_time_identifier660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_day_of_week_in_modifiable_target695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_span_in_modifiable_target702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_month_in_modifiable_target708 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_modifiable_target710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_relative_prefix730 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_relative_prefix733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_relative_prefix754 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_relative_prefix757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_relative_prefix778 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_relative_prefix781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_relative_prefix802 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_relative_prefix805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_relative_prefix824 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_relative_prefix827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_relative_prefix844 = new BitSet(new long[]{0x00007F001FD00000L,0x0000000000000000L,0x003FFFF800000020L});
    public static final BitSet FOLLOW_numeric_or_natural_integer_in_relative_prefix847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_relative_suffix872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_relative_suffix886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_date_span914 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_date_span916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_date_span930 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_date_span932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_date_span945 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_date_span947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_year_date_span_in_date_span959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_year_date_span974 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_year_date_span976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_month997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_month1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_month1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_month1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_month1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_month1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_month1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_month1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_month1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_month1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_month1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_month1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_month1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_month1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_month1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_month1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_month1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_month1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_month1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_month1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_month1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_month1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_month1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_TO_TWELVE_in_numeric_month1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_day_of_week1357 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_day_of_week1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_day_of_week1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_day_of_week1396 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_day_of_week1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_day_of_week1412 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_day_of_week1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_day_of_week1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_day_of_week1453 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_day_of_week1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_day_of_week1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_day_of_week1489 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_day_of_week1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_day_of_week1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_day_of_week1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_day_of_week1545 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_day_of_week1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_day_of_week1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_day_of_week1584 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_day_of_week1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_day_of_week1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_day_of_week1621 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_day_of_week1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_day_of_week1637 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_day_of_week1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_day_of_week1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_day_of_month1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_day_of_month1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_day_of_month1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_day_of_month1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_day_of_month1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_day_of_month1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_day_of_month1852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_day_of_month1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_day_of_month1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_day_of_month1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_day_of_month1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_day_of_month1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_day_of_month2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_day_of_month2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_day_of_month2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_day_of_month2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_day_of_month2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_day_of_month2155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_day_of_month2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_day_of_month2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_day_of_month2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_day_of_month2263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_day_of_month2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_day_of_month2316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_day_of_month2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_day_of_month2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_day_of_month2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_day_of_month2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_day_of_month2444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_day_of_month2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_day_of_month2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_day_of_month2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_day_of_month2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_day_of_month2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_day_of_month2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_day_of_month2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_day_of_month2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_day_of_month2667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_day_of_month2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_day_of_month2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_day_of_month2746 = new BitSet(new long[]{0x0000000000200000L,0x0000000020000000L});
    public static final BitSet FOLLOW_DASH_in_day_of_month2748 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_day_of_month2751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_day_of_month2763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_day_of_month2791 = new BitSet(new long[]{0x0000000000200000L,0x0000000080000000L});
    public static final BitSet FOLLOW_DASH_in_day_of_month2793 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_day_of_month2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_day_of_month2807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_day_of_month2835 = new BitSet(new long[]{0x0000000000200000L,0x0000000200000000L});
    public static final BitSet FOLLOW_DASH_in_day_of_month2837 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_day_of_month2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_day_of_month2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_day_of_month2880 = new BitSet(new long[]{0x0000000000200000L,0x0000000800000000L});
    public static final BitSet FOLLOW_DASH_in_day_of_month2882 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_day_of_month2885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_day_of_month2896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_day_of_month2924 = new BitSet(new long[]{0x0000000000200000L,0x0000002000000000L});
    public static final BitSet FOLLOW_DASH_in_day_of_month2926 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_day_of_month2929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_day_of_month2941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_day_of_month2969 = new BitSet(new long[]{0x0000000000200000L,0x0000008000000000L});
    public static final BitSet FOLLOW_DASH_in_day_of_month2971 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_day_of_month2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_day_of_month2986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_day_of_month3014 = new BitSet(new long[]{0x0000000000200000L,0x0000020000000000L});
    public static final BitSet FOLLOW_DASH_in_day_of_month3016 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_day_of_month3019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_day_of_month3029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_day_of_month3057 = new BitSet(new long[]{0x0000000000200000L,0x0000080000000000L});
    public static final BitSet FOLLOW_DASH_in_day_of_month3059 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_day_of_month3062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_day_of_month3073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_day_of_month3101 = new BitSet(new long[]{0x0000000000200000L,0x0000200000000000L});
    public static final BitSet FOLLOW_DASH_in_day_of_month3103 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_day_of_month3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_day_of_month3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_day_of_month3146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_day_of_month3169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_day_of_month3197 = new BitSet(new long[]{0x0000000000200000L,0x0000000020000000L});
    public static final BitSet FOLLOW_DASH_in_day_of_month3199 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_day_of_month3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_day_of_month3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_day_of_month_in_day_of_month3242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_TO_TWELVE_in_numeric_day_of_month3255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_TO_TWENTY_FOUR_in_numeric_day_of_month3278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FIVE_TO_THIRTY_ONE_in_numeric_day_of_month3291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_year3312 = new BitSet(new long[]{0x000000001FD00000L});
    public static final BitSet FOLLOW_numeric_two_digit_year_in_year3314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_year3325 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_148_in_year3327 = new BitSet(new long[]{0x001E000000000000L});
    public static final BitSet FOLLOW_year_date_span_in_year3329 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_numeric_four_digit_year_in_year3333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_four_digit_year_in_numeric_year3353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_two_digit_year_in_numeric_year3359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWO_ZEROS_in_numeric_two_digit_year3374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_TO_TWELVE_in_numeric_two_digit_year3401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_TO_TWENTY_FOUR_in_numeric_two_digit_year3424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FIVE_TO_THIRTY_ONE_in_numeric_two_digit_year3437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_TWO_TO_FIFTY_NINE_in_numeric_two_digit_year3448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTY_TO_NINETY_NINE_in_numeric_two_digit_year3460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THREE_DIGIT_in_numeric_four_digit_year3485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOUR_DIGIT_in_numeric_four_digit_year3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWO_ZEROS_in_numeric_hours3517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_TO_TWELVE_in_numeric_hours3542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_TO_TWENTY_FOUR_in_numeric_hours3563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWO_ZEROS_in_numeric_minutes3583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_TO_TWELVE_in_numeric_minutes3610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_TO_TWENTY_FOUR_in_numeric_minutes3633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FIVE_TO_THIRTY_ONE_in_numeric_minutes3646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_TWO_TO_FIFTY_NINE_in_numeric_minutes3657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_149_in_meridian_indicator3679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_150_in_meridian_indicator3692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_151_in_meridian_indicator3703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_meridian_indicator3717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_meridian_indicator3730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_154_in_meridian_indicator3741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_today_or_tomorrow3764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tomorrow_in_today_or_tomorrow3782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_today_or_tomorrow3788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_148_in_today_or_tomorrow3812 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_157_in_today_or_tomorrow3815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000780000000L});
    public static final BitSet FOLLOW_tomorrow_in_today_or_tomorrow3817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_148_in_today_or_tomorrow3835 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_158_in_today_or_tomorrow3838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_tomorrow3866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_tomorrow3870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_tomorrow3874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_tomorrow3878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_year_in_numeric_or_natural_integer3911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_163_in_numeric_or_natural_integer3922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_164_in_numeric_or_natural_integer3940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_numeric_or_natural_integer3958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_166_in_numeric_or_natural_integer3974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_167_in_numeric_or_natural_integer3991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_168_in_numeric_or_natural_integer4008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_169_in_numeric_or_natural_integer4026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_170_in_numeric_or_natural_integer4042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_171_in_numeric_or_natural_integer4058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_172_in_numeric_or_natural_integer4075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_173_in_numeric_or_natural_integer4093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_numeric_or_natural_integer4108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_175_in_numeric_or_natural_integer4123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_176_in_numeric_or_natural_integer4136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_177_in_numeric_or_natural_integer4149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_178_in_numeric_or_natural_integer4163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_179_in_numeric_or_natural_integer4177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_180_in_numeric_or_natural_integer4189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_181_in_numeric_or_natural_integer4202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_numeric_or_natural_integer4215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_separator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_in_synpred1_Date195 = new BitSet(new long[]{0x0000006101500002L});
    public static final BitSet FOLLOW_32_in_synpred1_Date197 = new BitSet(new long[]{0x0000006001500002L});
    public static final BitSet FOLLOW_time_in_synpred1_Date200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_in_synpred2_Date218 = new BitSet(new long[]{0xFFE07F021FD00000L,0xFFFFFFFFE0000FFFL,0x003FFFFFF817FFFFL});
    public static final BitSet FOLLOW_33_in_synpred2_Date220 = new BitSet(new long[]{0xFFE07F021FD00000L,0xFFFFFFFFE0000FFFL,0x003FFFFFF817FFFFL});
    public static final BitSet FOLLOW_date_in_synpred2_Date223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relative_date_in_synpred3_Date281 = new BitSet(new long[]{0x0000000000000002L});

}