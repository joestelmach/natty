// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g 2010-01-26 16:42:31
 package com.natty.parse; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class DateParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DATE_TIME", "RELATIVE_DATE", "EXPLICIT_DATE", "EXPLICIT_TIME", "AM_PM", "MONTH", "DAY_OF_WEEK", "DAY_OF_MONTH", "SPAN", "YEAR", "ERA", "INTEGER", "SEEK_DIRECTION", "SEEK_TYPE", "YEAR_DATE_SPAN", "ONE_TO_TWELVE", "THIRTEEN_TO_TWENTY_FOUR", "TWENTY_FIVE_TO_THIRTY_ONE", "TWO_ZEROS", "THIRTY_TWO_TO_FIFTY_NINE", "SIXTY_TO_NINETY_NINE", "THREE_DIGITS", "FOUR_DIGITS", "DIGIT", "WHITE_SPACE", "'on'", "'at'", "','", "'of'", "':'", "'am'", "'a.m.'", "'a'", "'pm'", "'p.m.'", "'p'", "'-'", "'/'", "'this'", "'last'", "'next'", "'past'", "'coming'", "'upcoming'", "'in'", "'from now'", "'ago'", "'day'", "'s'", "'week'", "'month'", "'monday'", "'mon'", "'tuesday'", "'tue'", "'tues'", "'wednesday'", "'wed'", "'thursday'", "'thur'", "'thurs'", "'friday'", "'fri'", "'saturday'", "'sat'", "'weekend'", "'sunday'", "'sun'", "'first'", "'1st'", "'second'", "'2nd'", "'third'", "'3rd'", "'fourth'", "'4th'", "'fifth'", "'5th'", "'sixth'", "'6th'", "'seventh'", "'7th'", "'eighth'", "'8th'", "'ninth'", "'9th'", "'tenth'", "'10th'", "'eleventh'", "'11th'", "'twelfth'", "'12th'", "'thirteenth'", "'13th'", "'fourteenth'", "'14th'", "'fifteenth'", "'15th'", "'sixteenth'", "'16th'", "'seventeenth'", "'17th'", "'eighteenth'", "'18th'", "'nineteenth'", "'19th'", "'twentieth'", "'20th'", "'twenty'", "'21st'", "'22nd'", "'23rd'", "'24th'", "'25th'", "'26th'", "'27th'", "'28th'", "'29th'", "'thirtieth'", "'30th'", "'thirty'", "'31st'", "'january'", "'jan'", "'february'", "'feb'", "'march'", "'mar'", "'april'", "'apr'", "'may'", "'june'", "'jun'", "'july'", "'jul'", "'august'", "'aug'", "'september'", "'sep'", "'october'", "'oct'", "'november'", "'nov'", "'december'", "'dec'", "'today'", "'yesterday'", "'the'", "'day after '", "'day before yesterday'", "'tomorow'", "'tomorrow'", "'tommorow'", "'tommorrow'", "'midnight'", "'noon'", "'\\''", "'ad'", "'a.d.'", "'bc'", "'b.c.'", "'one'", "'two'", "'three'", "'four'", "'five'", "'six'", "'seven'", "'eight'", "'nine'", "'ten'", "'eleven'", "'twelve'", "'thirteen'", "'fourteen'", "'fifteen'", "'sixteen'", "'seventeen'", "'eighteen'", "'nineteen'"
    };
    public static final int T__29=29;
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
    public static final int SIXTY_TO_NINETY_NINE=24;
    public static final int T__148=148;
    public static final int T__147=147;
    public static final int T__90=90;
    public static final int YEAR_DATE_SPAN=18;
    public static final int T__149=149;
    public static final int SPAN=12;
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
    public static final int RELATIVE_DATE=5;
    public static final int T__153=153;
    public static final int T__95=95;
    public static final int T__139=139;
    public static final int T__138=138;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int DAY_OF_WEEK=10;
    public static final int EXPLICIT_DATE=6;
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
    public static final int THIRTY_TWO_TO_FIFTY_NINE=23;
    public static final int TWENTY_FIVE_TO_THIRTY_ONE=21;
    public static final int T__133=133;
    public static final int T__79=79;
    public static final int T__134=134;
    public static final int T__78=78;
    public static final int T__135=135;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int FOUR_DIGITS=26;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int YEAR=13;
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
    public static final int THREE_DIGITS=25;
    public static final int T__120=120;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int WHITE_SPACE=28;
    public static final int SEEK_TYPE=17;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
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
    public static final int TWO_ZEROS=22;
    public static final int DIGIT=27;
    public static final int T__50=50;
    public static final int INTEGER=15;
    public static final int T__42=42;
    public static final int T__183=183;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__180=180;
    public static final int T__182=182;
    public static final int SEEK_DIRECTION=16;
    public static final int T__181=181;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int T__175=175;
    public static final int T__174=174;
    public static final int T__30=30;
    public static final int T__173=173;
    public static final int T__31=31;
    public static final int T__172=172;
    public static final int T__32=32;
    public static final int T__179=179;
    public static final int T__33=33;
    public static final int T__178=178;
    public static final int T__34=34;
    public static final int T__177=177;
    public static final int T__35=35;
    public static final int THIRTEEN_TO_TWENTY_FOUR=20;
    public static final int T__176=176;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int ERA=14;
    public static final int T__171=171;
    public static final int DAY_OF_MONTH=11;
    public static final int T__170=170;
    public static final int ONE_TO_TWELVE=19;
    public static final int T__169=169;

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:48:1: datetime : ( ( time )? ( 'on' )? date -> ^( DATE_TIME date ( time )? ) | date ( 'at' )? time -> ^( DATE_TIME date time ) | time -> ^( DATE_TIME ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"0\"] ) time ) );
    public final DateParser.datetime_return datetime() throws RecognitionException {
        DateParser.datetime_return retval = new DateParser.datetime_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal2=null;
        Token string_literal5=null;
        DateParser.time_return time1 = null;

        DateParser.date_return date3 = null;

        DateParser.date_return date4 = null;

        DateParser.time_return time6 = null;

        DateParser.time_return time7 = null;


        Object string_literal2_tree=null;
        Object string_literal5_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleSubtreeStream stream_time=new RewriteRuleSubtreeStream(adaptor,"rule time");
        RewriteRuleSubtreeStream stream_date=new RewriteRuleSubtreeStream(adaptor,"rule date");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:50:3: ( ( time )? ( 'on' )? date -> ^( DATE_TIME date ( time )? ) | date ( 'at' )? time -> ^( DATE_TIME date time ) | time -> ^( DATE_TIME ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"0\"] ) time ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:50:5: ( time )? ( 'on' )? date
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:50:5: ( time )?
                    int alt1=2;
                    switch ( input.LA(1) ) {
                        case TWO_ZEROS:
                            {
                            int LA1_1 = input.LA(2);

                            if ( ((LA1_1>=ONE_TO_TWELVE && LA1_1<=DIGIT)||LA1_1==29||(LA1_1>=33 && LA1_1<=39)||(LA1_1>=42 && LA1_1<=48)||(LA1_1>=72 && LA1_1<=157)||LA1_1==160||(LA1_1>=165 && LA1_1<=183)) ) {
                                alt1=1;
                            }
                            }
                            break;
                        case ONE_TO_TWELVE:
                            {
                            int LA1_2 = input.LA(2);

                            if ( ((LA1_2>=ONE_TO_TWELVE && LA1_2<=DIGIT)||LA1_2==29||(LA1_2>=33 && LA1_2<=39)||(LA1_2>=42 && LA1_2<=48)||(LA1_2>=72 && LA1_2<=157)||LA1_2==160||(LA1_2>=165 && LA1_2<=183)) ) {
                                alt1=1;
                            }
                            }
                            break;
                        case THIRTEEN_TO_TWENTY_FOUR:
                            {
                            int LA1_3 = input.LA(2);

                            if ( ((LA1_3>=ONE_TO_TWELVE && LA1_3<=DIGIT)||LA1_3==29||(LA1_3>=33 && LA1_3<=39)||(LA1_3>=42 && LA1_3<=48)||(LA1_3>=72 && LA1_3<=157)||LA1_3==160||(LA1_3>=165 && LA1_3<=183)) ) {
                                alt1=1;
                            }
                            }
                            break;
                        case 158:
                        case 159:
                            {
                            alt1=1;
                            }
                            break;
                    }

                    switch (alt1) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:50:5: time
                            {
                            pushFollow(FOLLOW_time_in_datetime178);
                            time1=time();

                            state._fsp--;

                            stream_time.add(time1.getTree());

                            }
                            break;

                    }

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:50:11: ( 'on' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==29) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:50:11: 'on'
                            {
                            string_literal2=(Token)match(input,29,FOLLOW_29_in_datetime181);  
                            stream_29.add(string_literal2);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_date_in_datetime184);
                    date3=date();

                    state._fsp--;

                    stream_date.add(date3.getTree());


                    // AST REWRITE
                    // elements: time, date
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 50:22: -> ^( DATE_TIME date ( time )? )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:50:25: ^( DATE_TIME date ( time )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DATE_TIME, "DATE_TIME"), root_1);

                        adaptor.addChild(root_1, stream_date.nextTree());
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:50:42: ( time )?
                        if ( stream_time.hasNext() ) {
                            adaptor.addChild(root_1, stream_time.nextTree());

                        }
                        stream_time.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:53:5: date ( 'at' )? time
                    {
                    pushFollow(FOLLOW_date_in_datetime207);
                    date4=date();

                    state._fsp--;

                    stream_date.add(date4.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:53:10: ( 'at' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==30) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:53:10: 'at'
                            {
                            string_literal5=(Token)match(input,30,FOLLOW_30_in_datetime209);  
                            stream_30.add(string_literal5);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_time_in_datetime212);
                    time6=time();

                    state._fsp--;

                    stream_time.add(time6.getTree());


                    // AST REWRITE
                    // elements: time, date
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 53:21: -> ^( DATE_TIME date time )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:53:24: ^( DATE_TIME date time )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DATE_TIME, "DATE_TIME"), root_1);

                        adaptor.addChild(root_1, stream_date.nextTree());
                        adaptor.addChild(root_1, stream_time.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:56:5: time
                    {
                    pushFollow(FOLLOW_time_in_datetime234);
                    time7=time();

                    state._fsp--;

                    stream_time.add(time7.getTree());


                    // AST REWRITE
                    // elements: time
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 56:10: -> ^( DATE_TIME ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"0\"] ) time )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:56:13: ^( DATE_TIME ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"0\"] ) time )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DATE_TIME, "DATE_TIME"), root_1);

                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:56:25: ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"0\"] )
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

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:59:1: date : ( relative_date | explicit_date );
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

                    pushFollow(FOLLOW_relative_date_in_date265);
                    relative_date8=relative_date();

                    state._fsp--;

                    adaptor.addChild(root_0, relative_date8.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:61:5: explicit_date
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_explicit_date_in_date272);
                    explicit_date9=explicit_date();

                    state._fsp--;

                    adaptor.addChild(root_0, explicit_date9.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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

            pushFollow(FOLLOW_explicit_time_in_time287);
            explicit_time10=explicit_time();

            state._fsp--;

            adaptor.addChild(root_0, explicit_time10.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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

    public static class explicit_date_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "explicit_date"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:69:1: explicit_date : ( month day ( ',' )? ( numeric_year )? -> ^( EXPLICIT_DATE month day ( numeric_year )? ) | day 'of' month ( ',' )? ( numeric_year )? -> ^( EXPLICIT_DATE month day ( numeric_year )? ) | numeric_month date_separator numeric_day date_separator numeric_year -> ^( EXPLICIT_DATE numeric_month numeric_day numeric_year ) | ( numeric_year date_separator )? numeric_month date_separator numeric_day -> ^( EXPLICIT_DATE numeric_month numeric_day ( numeric_year )? ) );
    public final DateParser.explicit_date_return explicit_date() throws RecognitionException {
        DateParser.explicit_date_return retval = new DateParser.explicit_date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal13=null;
        Token string_literal16=null;
        Token char_literal18=null;
        DateParser.month_return month11 = null;

        DateParser.day_return day12 = null;

        DateParser.numeric_year_return numeric_year14 = null;

        DateParser.day_return day15 = null;

        DateParser.month_return month17 = null;

        DateParser.numeric_year_return numeric_year19 = null;

        DateParser.numeric_month_return numeric_month20 = null;

        DateParser.date_separator_return date_separator21 = null;

        DateParser.numeric_day_return numeric_day22 = null;

        DateParser.date_separator_return date_separator23 = null;

        DateParser.numeric_year_return numeric_year24 = null;

        DateParser.numeric_year_return numeric_year25 = null;

        DateParser.date_separator_return date_separator26 = null;

        DateParser.numeric_month_return numeric_month27 = null;

        DateParser.date_separator_return date_separator28 = null;

        DateParser.numeric_day_return numeric_day29 = null;


        Object char_literal13_tree=null;
        Object string_literal16_tree=null;
        Object char_literal18_tree=null;
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleSubtreeStream stream_numeric_month=new RewriteRuleSubtreeStream(adaptor,"rule numeric_month");
        RewriteRuleSubtreeStream stream_numeric_year=new RewriteRuleSubtreeStream(adaptor,"rule numeric_year");
        RewriteRuleSubtreeStream stream_numeric_day=new RewriteRuleSubtreeStream(adaptor,"rule numeric_day");
        RewriteRuleSubtreeStream stream_month=new RewriteRuleSubtreeStream(adaptor,"rule month");
        RewriteRuleSubtreeStream stream_day=new RewriteRuleSubtreeStream(adaptor,"rule day");
        RewriteRuleSubtreeStream stream_date_separator=new RewriteRuleSubtreeStream(adaptor,"rule date_separator");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:71:3: ( month day ( ',' )? ( numeric_year )? -> ^( EXPLICIT_DATE month day ( numeric_year )? ) | day 'of' month ( ',' )? ( numeric_year )? -> ^( EXPLICIT_DATE month day ( numeric_year )? ) | numeric_month date_separator numeric_day date_separator numeric_year -> ^( EXPLICIT_DATE numeric_month numeric_day numeric_year ) | ( numeric_year date_separator )? numeric_month date_separator numeric_day -> ^( EXPLICIT_DATE numeric_month numeric_day ( numeric_year )? ) )
            int alt11=4;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:71:5: month day ( ',' )? ( numeric_year )?
                    {
                    pushFollow(FOLLOW_month_in_explicit_date304);
                    month11=month();

                    state._fsp--;

                    stream_month.add(month11.getTree());
                    pushFollow(FOLLOW_day_in_explicit_date306);
                    day12=day();

                    state._fsp--;

                    stream_day.add(day12.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:71:15: ( ',' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==31) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:71:15: ','
                            {
                            char_literal13=(Token)match(input,31,FOLLOW_31_in_explicit_date308);  
                            stream_31.add(char_literal13);


                            }
                            break;

                    }

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:71:20: ( numeric_year )?
                    int alt7=2;
                    switch ( input.LA(1) ) {
                        case 160:
                            {
                            alt7=1;
                            }
                            break;
                        case TWO_ZEROS:
                            {
                            alt7=1;
                            }
                            break;
                        case ONE_TO_TWELVE:
                            {
                            alt7=1;
                            }
                            break;
                        case THIRTEEN_TO_TWENTY_FOUR:
                        case TWENTY_FIVE_TO_THIRTY_ONE:
                        case THIRTY_TWO_TO_FIFTY_NINE:
                        case SIXTY_TO_NINETY_NINE:
                        case THREE_DIGITS:
                        case FOUR_DIGITS:
                        case 48:
                            {
                            alt7=1;
                            }
                            break;
                    }

                    switch (alt7) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:71:20: numeric_year
                            {
                            pushFollow(FOLLOW_numeric_year_in_explicit_date311);
                            numeric_year14=numeric_year();

                            state._fsp--;

                            stream_numeric_year.add(numeric_year14.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: month, numeric_year, day
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 71:34: -> ^( EXPLICIT_DATE month day ( numeric_year )? )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:71:37: ^( EXPLICIT_DATE month day ( numeric_year )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_1);

                        adaptor.addChild(root_1, stream_month.nextTree());
                        adaptor.addChild(root_1, stream_day.nextTree());
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:71:63: ( numeric_year )?
                        if ( stream_numeric_year.hasNext() ) {
                            adaptor.addChild(root_1, stream_numeric_year.nextTree());

                        }
                        stream_numeric_year.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:74:5: day 'of' month ( ',' )? ( numeric_year )?
                    {
                    pushFollow(FOLLOW_day_in_explicit_date337);
                    day15=day();

                    state._fsp--;

                    stream_day.add(day15.getTree());
                    string_literal16=(Token)match(input,32,FOLLOW_32_in_explicit_date339);  
                    stream_32.add(string_literal16);

                    pushFollow(FOLLOW_month_in_explicit_date341);
                    month17=month();

                    state._fsp--;

                    stream_month.add(month17.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:74:20: ( ',' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==31) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:74:20: ','
                            {
                            char_literal18=(Token)match(input,31,FOLLOW_31_in_explicit_date343);  
                            stream_31.add(char_literal18);


                            }
                            break;

                    }

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:74:25: ( numeric_year )?
                    int alt9=2;
                    switch ( input.LA(1) ) {
                        case 160:
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
                        case THIRTEEN_TO_TWENTY_FOUR:
                        case TWENTY_FIVE_TO_THIRTY_ONE:
                        case THIRTY_TWO_TO_FIFTY_NINE:
                        case SIXTY_TO_NINETY_NINE:
                        case THREE_DIGITS:
                        case FOUR_DIGITS:
                        case 48:
                            {
                            alt9=1;
                            }
                            break;
                    }

                    switch (alt9) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:74:25: numeric_year
                            {
                            pushFollow(FOLLOW_numeric_year_in_explicit_date346);
                            numeric_year19=numeric_year();

                            state._fsp--;

                            stream_numeric_year.add(numeric_year19.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: numeric_year, month, day
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 74:39: -> ^( EXPLICIT_DATE month day ( numeric_year )? )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:74:42: ^( EXPLICIT_DATE month day ( numeric_year )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_1);

                        adaptor.addChild(root_1, stream_month.nextTree());
                        adaptor.addChild(root_1, stream_day.nextTree());
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:74:68: ( numeric_year )?
                        if ( stream_numeric_year.hasNext() ) {
                            adaptor.addChild(root_1, stream_numeric_year.nextTree());

                        }
                        stream_numeric_year.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:78:5: numeric_month date_separator numeric_day date_separator numeric_year
                    {
                    pushFollow(FOLLOW_numeric_month_in_explicit_date375);
                    numeric_month20=numeric_month();

                    state._fsp--;

                    stream_numeric_month.add(numeric_month20.getTree());
                    pushFollow(FOLLOW_date_separator_in_explicit_date377);
                    date_separator21=date_separator();

                    state._fsp--;

                    stream_date_separator.add(date_separator21.getTree());
                    pushFollow(FOLLOW_numeric_day_in_explicit_date379);
                    numeric_day22=numeric_day();

                    state._fsp--;

                    stream_numeric_day.add(numeric_day22.getTree());
                    pushFollow(FOLLOW_date_separator_in_explicit_date381);
                    date_separator23=date_separator();

                    state._fsp--;

                    stream_date_separator.add(date_separator23.getTree());
                    pushFollow(FOLLOW_numeric_year_in_explicit_date383);
                    numeric_year24=numeric_year();

                    state._fsp--;

                    stream_numeric_year.add(numeric_year24.getTree());


                    // AST REWRITE
                    // elements: numeric_year, numeric_month, numeric_day
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 78:74: -> ^( EXPLICIT_DATE numeric_month numeric_day numeric_year )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:79:5: ^( EXPLICIT_DATE numeric_month numeric_day numeric_year )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_1);

                        adaptor.addChild(root_1, stream_numeric_month.nextTree());
                        adaptor.addChild(root_1, stream_numeric_day.nextTree());
                        adaptor.addChild(root_1, stream_numeric_year.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:83:5: ( numeric_year date_separator )? numeric_month date_separator numeric_day
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:83:5: ( numeric_year date_separator )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( ((LA10_0>=THIRTEEN_TO_TWENTY_FOUR && LA10_0<=FOUR_DIGITS)||LA10_0==48||LA10_0==160) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==ONE_TO_TWELVE) ) {
                        int LA10_2 = input.LA(2);

                        if ( ((LA10_2>=40 && LA10_2<=41)) ) {
                            int LA10_3 = input.LA(3);

                            if ( (LA10_3==ONE_TO_TWELVE) ) {
                                int LA10_4 = input.LA(4);

                                if ( ((LA10_4>=40 && LA10_4<=41)) ) {
                                    alt10=1;
                                }
                            }
                        }
                        else if ( ((LA10_2>=161 && LA10_2<=164)) ) {
                            alt10=1;
                        }
                    }
                    switch (alt10) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:83:6: numeric_year date_separator
                            {
                            pushFollow(FOLLOW_numeric_year_in_explicit_date416);
                            numeric_year25=numeric_year();

                            state._fsp--;

                            stream_numeric_year.add(numeric_year25.getTree());
                            pushFollow(FOLLOW_date_separator_in_explicit_date418);
                            date_separator26=date_separator();

                            state._fsp--;

                            stream_date_separator.add(date_separator26.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_numeric_month_in_explicit_date422);
                    numeric_month27=numeric_month();

                    state._fsp--;

                    stream_numeric_month.add(numeric_month27.getTree());
                    pushFollow(FOLLOW_date_separator_in_explicit_date424);
                    date_separator28=date_separator();

                    state._fsp--;

                    stream_date_separator.add(date_separator28.getTree());
                    pushFollow(FOLLOW_numeric_day_in_explicit_date426);
                    numeric_day29=numeric_day();

                    state._fsp--;

                    stream_numeric_day.add(numeric_day29.getTree());


                    // AST REWRITE
                    // elements: numeric_year, numeric_month, numeric_day
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 83:77: -> ^( EXPLICIT_DATE numeric_month numeric_day ( numeric_year )? )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:84:5: ^( EXPLICIT_DATE numeric_month numeric_day ( numeric_year )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_1);

                        adaptor.addChild(root_1, stream_numeric_month.nextTree());
                        adaptor.addChild(root_1, stream_numeric_day.nextTree());
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:84:47: ( numeric_year )?
                        if ( stream_numeric_year.hasNext() ) {
                            adaptor.addChild(root_1, stream_numeric_year.nextTree());

                        }
                        stream_numeric_year.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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

    public static class relative_date_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relative_date"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:88:1: relative_date : ( today_or_tomorrow | relative_prefix prefixable_target -> ^( RELATIVE_DATE relative_prefix prefixable_target ) | number prefixable_target relative_suffix -> ^( RELATIVE_DATE relative_suffix number prefixable_target ) );
    public final DateParser.relative_date_return relative_date() throws RecognitionException {
        DateParser.relative_date_return retval = new DateParser.relative_date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.today_or_tomorrow_return today_or_tomorrow30 = null;

        DateParser.relative_prefix_return relative_prefix31 = null;

        DateParser.prefixable_target_return prefixable_target32 = null;

        DateParser.number_return number33 = null;

        DateParser.prefixable_target_return prefixable_target34 = null;

        DateParser.relative_suffix_return relative_suffix35 = null;


        RewriteRuleSubtreeStream stream_relative_suffix=new RewriteRuleSubtreeStream(adaptor,"rule relative_suffix");
        RewriteRuleSubtreeStream stream_relative_prefix=new RewriteRuleSubtreeStream(adaptor,"rule relative_prefix");
        RewriteRuleSubtreeStream stream_prefixable_target=new RewriteRuleSubtreeStream(adaptor,"rule prefixable_target");
        RewriteRuleSubtreeStream stream_number=new RewriteRuleSubtreeStream(adaptor,"rule number");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:90:3: ( today_or_tomorrow | relative_prefix prefixable_target -> ^( RELATIVE_DATE relative_prefix prefixable_target ) | number prefixable_target relative_suffix -> ^( RELATIVE_DATE relative_suffix number prefixable_target ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 149:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
                {
                alt12=1;
                }
                break;
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
                {
                alt12=2;
                }
                break;
            case ONE_TO_TWELVE:
            case THIRTEEN_TO_TWENTY_FOUR:
            case TWENTY_FIVE_TO_THIRTY_ONE:
            case TWO_ZEROS:
            case THIRTY_TWO_TO_FIFTY_NINE:
            case SIXTY_TO_NINETY_NINE:
            case THREE_DIGITS:
            case FOUR_DIGITS:
            case DIGIT:
            case 112:
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
            case 182:
            case 183:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:90:5: today_or_tomorrow
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_today_or_tomorrow_in_relative_date461);
                    today_or_tomorrow30=today_or_tomorrow();

                    state._fsp--;

                    adaptor.addChild(root_0, today_or_tomorrow30.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:93:5: relative_prefix prefixable_target
                    {
                    pushFollow(FOLLOW_relative_prefix_in_relative_date473);
                    relative_prefix31=relative_prefix();

                    state._fsp--;

                    stream_relative_prefix.add(relative_prefix31.getTree());
                    pushFollow(FOLLOW_prefixable_target_in_relative_date475);
                    prefixable_target32=prefixable_target();

                    state._fsp--;

                    stream_prefixable_target.add(prefixable_target32.getTree());


                    // AST REWRITE
                    // elements: relative_prefix, prefixable_target
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 93:39: -> ^( RELATIVE_DATE relative_prefix prefixable_target )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:93:42: ^( RELATIVE_DATE relative_prefix prefixable_target )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        adaptor.addChild(root_1, stream_relative_prefix.nextTree());
                        adaptor.addChild(root_1, stream_prefixable_target.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:96:5: number prefixable_target relative_suffix
                    {
                    pushFollow(FOLLOW_number_in_relative_date497);
                    number33=number();

                    state._fsp--;

                    stream_number.add(number33.getTree());
                    pushFollow(FOLLOW_prefixable_target_in_relative_date499);
                    prefixable_target34=prefixable_target();

                    state._fsp--;

                    stream_prefixable_target.add(prefixable_target34.getTree());
                    pushFollow(FOLLOW_relative_suffix_in_relative_date501);
                    relative_suffix35=relative_suffix();

                    state._fsp--;

                    stream_relative_suffix.add(relative_suffix35.getTree());


                    // AST REWRITE
                    // elements: prefixable_target, relative_suffix, number
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 96:46: -> ^( RELATIVE_DATE relative_suffix number prefixable_target )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:96:49: ^( RELATIVE_DATE relative_suffix number prefixable_target )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        adaptor.addChild(root_1, stream_relative_suffix.nextTree());
                        adaptor.addChild(root_1, stream_number.nextTree());
                        adaptor.addChild(root_1, stream_prefixable_target.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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

    public static class explicit_time_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "explicit_time"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:100:1: explicit_time : ( hours ( meridian_indicator )? -> ^( EXPLICIT_TIME hours INTEGER[\"0\"] ( meridian_indicator )? ) | hours ':' minutes ( meridian_indicator )? -> ^( EXPLICIT_TIME hours minutes ( meridian_indicator )? ) | time_identifier -> time_identifier );
    public final DateParser.explicit_time_return explicit_time() throws RecognitionException {
        DateParser.explicit_time_return retval = new DateParser.explicit_time_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal39=null;
        DateParser.hours_return hours36 = null;

        DateParser.meridian_indicator_return meridian_indicator37 = null;

        DateParser.hours_return hours38 = null;

        DateParser.minutes_return minutes40 = null;

        DateParser.meridian_indicator_return meridian_indicator41 = null;

        DateParser.time_identifier_return time_identifier42 = null;


        Object char_literal39_tree=null;
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleSubtreeStream stream_meridian_indicator=new RewriteRuleSubtreeStream(adaptor,"rule meridian_indicator");
        RewriteRuleSubtreeStream stream_minutes=new RewriteRuleSubtreeStream(adaptor,"rule minutes");
        RewriteRuleSubtreeStream stream_time_identifier=new RewriteRuleSubtreeStream(adaptor,"rule time_identifier");
        RewriteRuleSubtreeStream stream_hours=new RewriteRuleSubtreeStream(adaptor,"rule hours");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:102:3: ( hours ( meridian_indicator )? -> ^( EXPLICIT_TIME hours INTEGER[\"0\"] ( meridian_indicator )? ) | hours ':' minutes ( meridian_indicator )? -> ^( EXPLICIT_TIME hours minutes ( meridian_indicator )? ) | time_identifier -> time_identifier )
            int alt15=3;
            switch ( input.LA(1) ) {
            case TWO_ZEROS:
                {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==EOF||(LA15_1>=ONE_TO_TWELVE && LA15_1<=DIGIT)||LA15_1==29||(LA15_1>=34 && LA15_1<=39)||(LA15_1>=42 && LA15_1<=48)||(LA15_1>=72 && LA15_1<=157)||LA15_1==160||(LA15_1>=165 && LA15_1<=183)) ) {
                    alt15=1;
                }
                else if ( (LA15_1==33) ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
                }
                break;
            case ONE_TO_TWELVE:
                {
                int LA15_2 = input.LA(2);

                if ( (LA15_2==EOF||(LA15_2>=ONE_TO_TWELVE && LA15_2<=DIGIT)||LA15_2==29||(LA15_2>=34 && LA15_2<=39)||(LA15_2>=42 && LA15_2<=48)||(LA15_2>=72 && LA15_2<=157)||LA15_2==160||(LA15_2>=165 && LA15_2<=183)) ) {
                    alt15=1;
                }
                else if ( (LA15_2==33) ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 2, input);

                    throw nvae;
                }
                }
                break;
            case THIRTEEN_TO_TWENTY_FOUR:
                {
                int LA15_3 = input.LA(2);

                if ( (LA15_3==EOF||(LA15_3>=ONE_TO_TWELVE && LA15_3<=DIGIT)||LA15_3==29||(LA15_3>=34 && LA15_3<=39)||(LA15_3>=42 && LA15_3<=48)||(LA15_3>=72 && LA15_3<=157)||LA15_3==160||(LA15_3>=165 && LA15_3<=183)) ) {
                    alt15=1;
                }
                else if ( (LA15_3==33) ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 3, input);

                    throw nvae;
                }
                }
                break;
            case 158:
            case 159:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:102:5: hours ( meridian_indicator )?
                    {
                    pushFollow(FOLLOW_hours_in_explicit_time533);
                    hours36=hours();

                    state._fsp--;

                    stream_hours.add(hours36.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:102:11: ( meridian_indicator )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>=34 && LA13_0<=39)) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:102:11: meridian_indicator
                            {
                            pushFollow(FOLLOW_meridian_indicator_in_explicit_time535);
                            meridian_indicator37=meridian_indicator();

                            state._fsp--;

                            stream_meridian_indicator.add(meridian_indicator37.getTree());

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
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 102:31: -> ^( EXPLICIT_TIME hours INTEGER[\"0\"] ( meridian_indicator )? )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:102:34: ^( EXPLICIT_TIME hours INTEGER[\"0\"] ( meridian_indicator )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        adaptor.addChild(root_1, stream_hours.nextTree());
                        adaptor.addChild(root_1, (Object)adaptor.create(INTEGER, "0"));
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:102:69: ( meridian_indicator )?
                        if ( stream_meridian_indicator.hasNext() ) {
                            adaptor.addChild(root_1, stream_meridian_indicator.nextTree());

                        }
                        stream_meridian_indicator.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:105:5: hours ':' minutes ( meridian_indicator )?
                    {
                    pushFollow(FOLLOW_hours_in_explicit_time562);
                    hours38=hours();

                    state._fsp--;

                    stream_hours.add(hours38.getTree());
                    char_literal39=(Token)match(input,33,FOLLOW_33_in_explicit_time564);  
                    stream_33.add(char_literal39);

                    pushFollow(FOLLOW_minutes_in_explicit_time566);
                    minutes40=minutes();

                    state._fsp--;

                    stream_minutes.add(minutes40.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:105:23: ( meridian_indicator )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( ((LA14_0>=34 && LA14_0<=39)) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:105:23: meridian_indicator
                            {
                            pushFollow(FOLLOW_meridian_indicator_in_explicit_time568);
                            meridian_indicator41=meridian_indicator();

                            state._fsp--;

                            stream_meridian_indicator.add(meridian_indicator41.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: hours, meridian_indicator, minutes
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 105:43: -> ^( EXPLICIT_TIME hours minutes ( meridian_indicator )? )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:105:46: ^( EXPLICIT_TIME hours minutes ( meridian_indicator )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        adaptor.addChild(root_1, stream_hours.nextTree());
                        adaptor.addChild(root_1, stream_minutes.nextTree());
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:105:76: ( meridian_indicator )?
                        if ( stream_meridian_indicator.hasNext() ) {
                            adaptor.addChild(root_1, stream_meridian_indicator.nextTree());

                        }
                        stream_meridian_indicator.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:107:5: time_identifier
                    {
                    pushFollow(FOLLOW_time_identifier_in_explicit_time591);
                    time_identifier42=time_identifier();

                    state._fsp--;

                    stream_time_identifier.add(time_identifier42.getTree());


                    // AST REWRITE
                    // elements: time_identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 107:21: -> time_identifier
                    {
                        adaptor.addChild(root_0, stream_time_identifier.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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

    public static class meridian_indicator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "meridian_indicator"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:111:1: meridian_indicator : ( 'am' -> AM_PM[\"am\"] | 'a.m.' -> AM_PM[\"am\"] | 'a' -> AM_PM[\"am\"] | 'pm' -> AM_PM[\"pm\"] | 'p.m.' -> AM_PM[\"pm\"] | 'p' -> AM_PM[\"pm\"] );
    public final DateParser.meridian_indicator_return meridian_indicator() throws RecognitionException {
        DateParser.meridian_indicator_return retval = new DateParser.meridian_indicator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal43=null;
        Token string_literal44=null;
        Token char_literal45=null;
        Token string_literal46=null;
        Token string_literal47=null;
        Token char_literal48=null;

        Object string_literal43_tree=null;
        Object string_literal44_tree=null;
        Object char_literal45_tree=null;
        Object string_literal46_tree=null;
        Object string_literal47_tree=null;
        Object char_literal48_tree=null;
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:112:3: ( 'am' -> AM_PM[\"am\"] | 'a.m.' -> AM_PM[\"am\"] | 'a' -> AM_PM[\"am\"] | 'pm' -> AM_PM[\"pm\"] | 'p.m.' -> AM_PM[\"pm\"] | 'p' -> AM_PM[\"pm\"] )
            int alt16=6;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt16=1;
                }
                break;
            case 35:
                {
                alt16=2;
                }
                break;
            case 36:
                {
                alt16=3;
                }
                break;
            case 37:
                {
                alt16=4;
                }
                break;
            case 38:
                {
                alt16=5;
                }
                break;
            case 39:
                {
                alt16=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:112:5: 'am'
                    {
                    string_literal43=(Token)match(input,34,FOLLOW_34_in_meridian_indicator609);  
                    stream_34.add(string_literal43);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 112:12: -> AM_PM[\"am\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(AM_PM, "am"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:113:5: 'a.m.'
                    {
                    string_literal44=(Token)match(input,35,FOLLOW_35_in_meridian_indicator622);  
                    stream_35.add(string_literal44);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 113:12: -> AM_PM[\"am\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(AM_PM, "am"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:114:5: 'a'
                    {
                    char_literal45=(Token)match(input,36,FOLLOW_36_in_meridian_indicator633);  
                    stream_36.add(char_literal45);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 114:12: -> AM_PM[\"am\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(AM_PM, "am"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:115:5: 'pm'
                    {
                    string_literal46=(Token)match(input,37,FOLLOW_37_in_meridian_indicator647);  
                    stream_37.add(string_literal46);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 115:12: -> AM_PM[\"pm\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(AM_PM, "pm"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:116:5: 'p.m.'
                    {
                    string_literal47=(Token)match(input,38,FOLLOW_38_in_meridian_indicator660);  
                    stream_38.add(string_literal47);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 116:12: -> AM_PM[\"pm\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(AM_PM, "pm"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:117:5: 'p'
                    {
                    char_literal48=(Token)match(input,39,FOLLOW_39_in_meridian_indicator671);  
                    stream_39.add(char_literal48);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 117:12: -> AM_PM[\"pm\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(AM_PM, "pm"));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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

    public static class date_separator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "date_separator"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:120:1: date_separator : ( '-' | '/' );
    public final DateParser.date_separator_return date_separator() throws RecognitionException {
        DateParser.date_separator_return retval = new DateParser.date_separator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set49=null;

        Object set49_tree=null;

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:121:3: ( '-' | '/' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:
            {
            root_0 = (Object)adaptor.nil();

            set49=(Token)input.LT(1);
            if ( (input.LA(1)>=40 && input.LA(1)<=41) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set49));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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

    public static class relative_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relative_prefix"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:125:1: relative_prefix : ( ( 'this' )? 'last' -> SEEK_DIRECTION[\"<\"] SEEK_TYPE[\"by_week\"] INTEGER[\"1\"] | ( 'this' )? 'next' -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_week\"] INTEGER[\"1\"] | ( 'this' )? 'past' -> SEEK_DIRECTION[\"<\"] SEEK_TYPE[\"by_day\"] INTEGER[\"1\"] | ( 'this' )? 'coming' -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] INTEGER[\"1\"] | ( 'this' )? 'upcoming' -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] INTEGER[\"1\"] | 'in' number -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] number );
    public final DateParser.relative_prefix_return relative_prefix() throws RecognitionException {
        DateParser.relative_prefix_return retval = new DateParser.relative_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

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
        Token string_literal60=null;
        DateParser.number_return number61 = null;


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
        Object string_literal60_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleSubtreeStream stream_number=new RewriteRuleSubtreeStream(adaptor,"rule number");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:126:3: ( ( 'this' )? 'last' -> SEEK_DIRECTION[\"<\"] SEEK_TYPE[\"by_week\"] INTEGER[\"1\"] | ( 'this' )? 'next' -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_week\"] INTEGER[\"1\"] | ( 'this' )? 'past' -> SEEK_DIRECTION[\"<\"] SEEK_TYPE[\"by_day\"] INTEGER[\"1\"] | ( 'this' )? 'coming' -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] INTEGER[\"1\"] | ( 'this' )? 'upcoming' -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] INTEGER[\"1\"] | 'in' number -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] number )
            int alt22=6;
            switch ( input.LA(1) ) {
            case 42:
                {
                switch ( input.LA(2) ) {
                case 44:
                    {
                    alt22=2;
                    }
                    break;
                case 46:
                    {
                    alt22=4;
                    }
                    break;
                case 47:
                    {
                    alt22=5;
                    }
                    break;
                case 43:
                    {
                    alt22=1;
                    }
                    break;
                case 45:
                    {
                    alt22=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }

                }
                break;
            case 43:
                {
                alt22=1;
                }
                break;
            case 44:
                {
                alt22=2;
                }
                break;
            case 45:
                {
                alt22=3;
                }
                break;
            case 46:
                {
                alt22=4;
                }
                break;
            case 47:
                {
                alt22=5;
                }
                break;
            case 48:
                {
                alt22=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:126:5: ( 'this' )? 'last'
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:126:5: ( 'this' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==42) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:126:5: 'this'
                            {
                            string_literal50=(Token)match(input,42,FOLLOW_42_in_relative_prefix713);  
                            stream_42.add(string_literal50);


                            }
                            break;

                    }

                    string_literal51=(Token)match(input,43,FOLLOW_43_in_relative_prefix716);  
                    stream_43.add(string_literal51);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 126:24: -> SEEK_DIRECTION[\"<\"] SEEK_TYPE[\"by_week\"] INTEGER[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIRECTION, "<"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_week"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "1"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:127:5: ( 'this' )? 'next'
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:127:5: ( 'this' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==42) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:127:5: 'this'
                            {
                            string_literal52=(Token)match(input,42,FOLLOW_42_in_relative_prefix737);  
                            stream_42.add(string_literal52);


                            }
                            break;

                    }

                    string_literal53=(Token)match(input,44,FOLLOW_44_in_relative_prefix740);  
                    stream_44.add(string_literal53);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 127:24: -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_week\"] INTEGER[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIRECTION, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_week"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "1"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:128:5: ( 'this' )? 'past'
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:128:5: ( 'this' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==42) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:128:5: 'this'
                            {
                            string_literal54=(Token)match(input,42,FOLLOW_42_in_relative_prefix761);  
                            stream_42.add(string_literal54);


                            }
                            break;

                    }

                    string_literal55=(Token)match(input,45,FOLLOW_45_in_relative_prefix764);  
                    stream_45.add(string_literal55);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 128:24: -> SEEK_DIRECTION[\"<\"] SEEK_TYPE[\"by_day\"] INTEGER[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIRECTION, "<"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_day"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "1"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:129:5: ( 'this' )? 'coming'
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:129:5: ( 'this' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==42) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:129:5: 'this'
                            {
                            string_literal56=(Token)match(input,42,FOLLOW_42_in_relative_prefix785);  
                            stream_42.add(string_literal56);


                            }
                            break;

                    }

                    string_literal57=(Token)match(input,46,FOLLOW_46_in_relative_prefix788);  
                    stream_46.add(string_literal57);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 129:24: -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] INTEGER[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIRECTION, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_day"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "1"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:130:5: ( 'this' )? 'upcoming'
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:130:5: ( 'this' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==42) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:130:5: 'this'
                            {
                            string_literal58=(Token)match(input,42,FOLLOW_42_in_relative_prefix807);  
                            stream_42.add(string_literal58);


                            }
                            break;

                    }

                    string_literal59=(Token)match(input,47,FOLLOW_47_in_relative_prefix810);  
                    stream_47.add(string_literal59);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 130:24: -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] INTEGER[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIRECTION, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_day"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "1"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:131:5: 'in' number
                    {
                    string_literal60=(Token)match(input,48,FOLLOW_48_in_relative_prefix827);  
                    stream_48.add(string_literal60);

                    pushFollow(FOLLOW_number_in_relative_prefix829);
                    number61=number();

                    state._fsp--;

                    stream_number.add(number61.getTree());


                    // AST REWRITE
                    // elements: number
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 131:24: -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] number
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIRECTION, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_day"));
                        adaptor.addChild(root_0, stream_number.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:134:1: relative_suffix : ( 'from now' -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] | 'ago' -> SEEK_DIRECTION[\"<\"] SEEK_TYPE[\"by_day\"] );
    public final DateParser.relative_suffix_return relative_suffix() throws RecognitionException {
        DateParser.relative_suffix_return retval = new DateParser.relative_suffix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal62=null;
        Token string_literal63=null;

        Object string_literal62_tree=null;
        Object string_literal63_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:135:3: ( 'from now' -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] | 'ago' -> SEEK_DIRECTION[\"<\"] SEEK_TYPE[\"by_day\"] )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==49) ) {
                alt23=1;
            }
            else if ( (LA23_0==50) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:135:5: 'from now'
                    {
                    string_literal62=(Token)match(input,49,FOLLOW_49_in_relative_suffix861);  
                    stream_49.add(string_literal62);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 135:16: -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIRECTION, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_day"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:136:5: 'ago'
                    {
                    string_literal63=(Token)match(input,50,FOLLOW_50_in_relative_suffix875);  
                    stream_50.add(string_literal63);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 136:16: -> SEEK_DIRECTION[\"<\"] SEEK_TYPE[\"by_day\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIRECTION, "<"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_day"));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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

    public static class prefixable_target_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prefixable_target"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:139:1: prefixable_target : ( day_of_week | date_span );
    public final DateParser.prefixable_target_return prefixable_target() throws RecognitionException {
        DateParser.prefixable_target_return retval = new DateParser.prefixable_target_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.day_of_week_return day_of_week64 = null;

        DateParser.date_span_return date_span65 = null;



        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:140:3: ( day_of_week | date_span )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=55 && LA24_0<=71)) ) {
                alt24=1;
            }
            else if ( (LA24_0==YEAR_DATE_SPAN||LA24_0==51||(LA24_0>=53 && LA24_0<=54)) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:140:5: day_of_week
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_day_of_week_in_prefixable_target903);
                    day_of_week64=day_of_week();

                    state._fsp--;

                    adaptor.addChild(root_0, day_of_week64.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:141:5: date_span
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_date_span_in_prefixable_target910);
                    date_span65=date_span();

                    state._fsp--;

                    adaptor.addChild(root_0, date_span65.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "prefixable_target"

    public static class date_span_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "date_span"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:144:1: date_span : ( 'day' ( 's' )? -> SPAN[\"day\"] | 'week' ( 's' )? -> SPAN[\"week\"] | 'month' ( 's' )? -> SPAN[\"month\"] | YEAR_DATE_SPAN ( 's' )? -> SPAN[\"year\"] );
    public final DateParser.date_span_return date_span() throws RecognitionException {
        DateParser.date_span_return retval = new DateParser.date_span_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal66=null;
        Token char_literal67=null;
        Token string_literal68=null;
        Token char_literal69=null;
        Token string_literal70=null;
        Token char_literal71=null;
        Token YEAR_DATE_SPAN72=null;
        Token char_literal73=null;

        Object string_literal66_tree=null;
        Object char_literal67_tree=null;
        Object string_literal68_tree=null;
        Object char_literal69_tree=null;
        Object string_literal70_tree=null;
        Object char_literal71_tree=null;
        Object YEAR_DATE_SPAN72_tree=null;
        Object char_literal73_tree=null;
        RewriteRuleTokenStream stream_YEAR_DATE_SPAN=new RewriteRuleTokenStream(adaptor,"token YEAR_DATE_SPAN");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:145:3: ( 'day' ( 's' )? -> SPAN[\"day\"] | 'week' ( 's' )? -> SPAN[\"week\"] | 'month' ( 's' )? -> SPAN[\"month\"] | YEAR_DATE_SPAN ( 's' )? -> SPAN[\"year\"] )
            int alt29=4;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt29=1;
                }
                break;
            case 53:
                {
                alt29=2;
                }
                break;
            case 54:
                {
                alt29=3;
                }
                break;
            case YEAR_DATE_SPAN:
                {
                alt29=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:145:5: 'day' ( 's' )?
                    {
                    string_literal66=(Token)match(input,51,FOLLOW_51_in_date_span925);  
                    stream_51.add(string_literal66);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:145:11: ( 's' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==52) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:145:11: 's'
                            {
                            char_literal67=(Token)match(input,52,FOLLOW_52_in_date_span927);  
                            stream_52.add(char_literal67);


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
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 145:26: -> SPAN[\"day\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SPAN, "day"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:146:5: 'week' ( 's' )?
                    {
                    string_literal68=(Token)match(input,53,FOLLOW_53_in_date_span949);  
                    stream_53.add(string_literal68);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:146:12: ( 's' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==52) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:146:12: 's'
                            {
                            char_literal69=(Token)match(input,52,FOLLOW_52_in_date_span951);  
                            stream_52.add(char_literal69);


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
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 146:26: -> SPAN[\"week\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SPAN, "week"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:147:5: 'month' ( 's' )?
                    {
                    string_literal70=(Token)match(input,54,FOLLOW_54_in_date_span972);  
                    stream_54.add(string_literal70);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:147:13: ( 's' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==52) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:147:13: 's'
                            {
                            char_literal71=(Token)match(input,52,FOLLOW_52_in_date_span974);  
                            stream_52.add(char_literal71);


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
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 147:26: -> SPAN[\"month\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SPAN, "month"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:148:5: YEAR_DATE_SPAN ( 's' )?
                    {
                    YEAR_DATE_SPAN72=(Token)match(input,YEAR_DATE_SPAN,FOLLOW_YEAR_DATE_SPAN_in_date_span994);  
                    stream_YEAR_DATE_SPAN.add(YEAR_DATE_SPAN72);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:148:20: ( 's' )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==52) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:148:20: 's'
                            {
                            char_literal73=(Token)match(input,52,FOLLOW_52_in_date_span996);  
                            stream_52.add(char_literal73);


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
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 148:26: -> SPAN[\"year\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SPAN, "year"));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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

    public static class day_of_week_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "day_of_week"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:152:1: day_of_week : ( 'monday' ( 's' )? -> DAY_OF_WEEK[\"2\"] | 'mon' -> DAY_OF_WEEK[\"2\"] | 'tuesday' ( 's' )? -> DAY_OF_WEEK[\"3\"] | 'tue' ( 's' )? -> DAY_OF_WEEK[\"3\"] | 'tues' -> DAY_OF_WEEK[\"3\"] | 'wednesday' ( 's' )? -> DAY_OF_WEEK[\"4\"] | 'wed' -> DAY_OF_WEEK[\"4\"] | 'thursday' ( 's' )? -> DAY_OF_WEEK[\"5\"] | 'thur' -> DAY_OF_WEEK[\"5\"] | 'thurs' -> DAY_OF_WEEK[\"5\"] | 'friday' ( 's' )? -> DAY_OF_WEEK[\"6\"] | 'fri' -> DAY_OF_WEEK[\"6\"] | 'saturday' ( 's' )? -> DAY_OF_WEEK[\"7\"] | 'sat' -> DAY_OF_WEEK[\"7\"] | 'weekend' ( 's' )? -> DAY_OF_WEEK[\"7\"] | 'sunday' ( 's' )? -> DAY_OF_WEEK[\"1\"] | 'sun' -> DAY_OF_WEEK[\"1\"] );
    public final DateParser.day_of_week_return day_of_week() throws RecognitionException {
        DateParser.day_of_week_return retval = new DateParser.day_of_week_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal74=null;
        Token char_literal75=null;
        Token string_literal76=null;
        Token string_literal77=null;
        Token char_literal78=null;
        Token string_literal79=null;
        Token char_literal80=null;
        Token string_literal81=null;
        Token string_literal82=null;
        Token char_literal83=null;
        Token string_literal84=null;
        Token string_literal85=null;
        Token char_literal86=null;
        Token string_literal87=null;
        Token string_literal88=null;
        Token string_literal89=null;
        Token char_literal90=null;
        Token string_literal91=null;
        Token string_literal92=null;
        Token char_literal93=null;
        Token string_literal94=null;
        Token string_literal95=null;
        Token char_literal96=null;
        Token string_literal97=null;
        Token char_literal98=null;
        Token string_literal99=null;

        Object string_literal74_tree=null;
        Object char_literal75_tree=null;
        Object string_literal76_tree=null;
        Object string_literal77_tree=null;
        Object char_literal78_tree=null;
        Object string_literal79_tree=null;
        Object char_literal80_tree=null;
        Object string_literal81_tree=null;
        Object string_literal82_tree=null;
        Object char_literal83_tree=null;
        Object string_literal84_tree=null;
        Object string_literal85_tree=null;
        Object char_literal86_tree=null;
        Object string_literal87_tree=null;
        Object string_literal88_tree=null;
        Object string_literal89_tree=null;
        Object char_literal90_tree=null;
        Object string_literal91_tree=null;
        Object string_literal92_tree=null;
        Object char_literal93_tree=null;
        Object string_literal94_tree=null;
        Object string_literal95_tree=null;
        Object char_literal96_tree=null;
        Object string_literal97_tree=null;
        Object char_literal98_tree=null;
        Object string_literal99_tree=null;
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
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:153:3: ( 'monday' ( 's' )? -> DAY_OF_WEEK[\"2\"] | 'mon' -> DAY_OF_WEEK[\"2\"] | 'tuesday' ( 's' )? -> DAY_OF_WEEK[\"3\"] | 'tue' ( 's' )? -> DAY_OF_WEEK[\"3\"] | 'tues' -> DAY_OF_WEEK[\"3\"] | 'wednesday' ( 's' )? -> DAY_OF_WEEK[\"4\"] | 'wed' -> DAY_OF_WEEK[\"4\"] | 'thursday' ( 's' )? -> DAY_OF_WEEK[\"5\"] | 'thur' -> DAY_OF_WEEK[\"5\"] | 'thurs' -> DAY_OF_WEEK[\"5\"] | 'friday' ( 's' )? -> DAY_OF_WEEK[\"6\"] | 'fri' -> DAY_OF_WEEK[\"6\"] | 'saturday' ( 's' )? -> DAY_OF_WEEK[\"7\"] | 'sat' -> DAY_OF_WEEK[\"7\"] | 'weekend' ( 's' )? -> DAY_OF_WEEK[\"7\"] | 'sunday' ( 's' )? -> DAY_OF_WEEK[\"1\"] | 'sun' -> DAY_OF_WEEK[\"1\"] )
            int alt39=17;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt39=1;
                }
                break;
            case 56:
                {
                alt39=2;
                }
                break;
            case 57:
                {
                alt39=3;
                }
                break;
            case 58:
                {
                alt39=4;
                }
                break;
            case 59:
                {
                alt39=5;
                }
                break;
            case 60:
                {
                alt39=6;
                }
                break;
            case 61:
                {
                alt39=7;
                }
                break;
            case 62:
                {
                alt39=8;
                }
                break;
            case 63:
                {
                alt39=9;
                }
                break;
            case 64:
                {
                alt39=10;
                }
                break;
            case 65:
                {
                alt39=11;
                }
                break;
            case 66:
                {
                alt39=12;
                }
                break;
            case 67:
                {
                alt39=13;
                }
                break;
            case 68:
                {
                alt39=14;
                }
                break;
            case 69:
                {
                alt39=15;
                }
                break;
            case 70:
                {
                alt39=16;
                }
                break;
            case 71:
                {
                alt39=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:153:5: 'monday' ( 's' )?
                    {
                    string_literal74=(Token)match(input,55,FOLLOW_55_in_day_of_week1019);  
                    stream_55.add(string_literal74);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:153:14: ( 's' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==52) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:153:14: 's'
                            {
                            char_literal75=(Token)match(input,52,FOLLOW_52_in_day_of_week1021);  
                            stream_52.add(char_literal75);


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
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 153:22: -> DAY_OF_WEEK[\"2\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "2"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:154:5: 'mon'
                    {
                    string_literal76=(Token)match(input,56,FOLLOW_56_in_day_of_week1036);  
                    stream_56.add(string_literal76);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 154:22: -> DAY_OF_WEEK[\"2\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "2"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:155:5: 'tuesday' ( 's' )?
                    {
                    string_literal77=(Token)match(input,57,FOLLOW_57_in_day_of_week1058);  
                    stream_57.add(string_literal77);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:155:15: ( 's' )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==52) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:155:15: 's'
                            {
                            char_literal78=(Token)match(input,52,FOLLOW_52_in_day_of_week1060);  
                            stream_52.add(char_literal78);


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
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 155:22: -> DAY_OF_WEEK[\"3\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "3"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:156:5: 'tue' ( 's' )?
                    {
                    string_literal79=(Token)match(input,58,FOLLOW_58_in_day_of_week1074);  
                    stream_58.add(string_literal79);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:156:11: ( 's' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==52) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:156:11: 's'
                            {
                            char_literal80=(Token)match(input,52,FOLLOW_52_in_day_of_week1076);  
                            stream_52.add(char_literal80);


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
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 156:22: -> DAY_OF_WEEK[\"3\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "3"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:157:5: 'tues'
                    {
                    string_literal81=(Token)match(input,59,FOLLOW_59_in_day_of_week1094);  
                    stream_59.add(string_literal81);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 157:22: -> DAY_OF_WEEK[\"3\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "3"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:158:5: 'wednesday' ( 's' )?
                    {
                    string_literal82=(Token)match(input,60,FOLLOW_60_in_day_of_week1115);  
                    stream_60.add(string_literal82);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:158:17: ( 's' )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==52) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:158:17: 's'
                            {
                            char_literal83=(Token)match(input,52,FOLLOW_52_in_day_of_week1117);  
                            stream_52.add(char_literal83);


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
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 158:22: -> DAY_OF_WEEK[\"4\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "4"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:159:5: 'wed'
                    {
                    string_literal84=(Token)match(input,61,FOLLOW_61_in_day_of_week1129);  
                    stream_61.add(string_literal84);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 159:22: -> DAY_OF_WEEK[\"4\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "4"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:160:5: 'thursday' ( 's' )?
                    {
                    string_literal85=(Token)match(input,62,FOLLOW_62_in_day_of_week1151);  
                    stream_62.add(string_literal85);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:160:16: ( 's' )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==52) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:160:16: 's'
                            {
                            char_literal86=(Token)match(input,52,FOLLOW_52_in_day_of_week1153);  
                            stream_52.add(char_literal86);


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
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 160:22: -> DAY_OF_WEEK[\"5\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "5"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 9 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:161:5: 'thur'
                    {
                    string_literal87=(Token)match(input,63,FOLLOW_63_in_day_of_week1166);  
                    stream_63.add(string_literal87);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 161:22: -> DAY_OF_WEEK[\"5\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "5"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 10 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:162:5: 'thurs'
                    {
                    string_literal88=(Token)match(input,64,FOLLOW_64_in_day_of_week1187);  
                    stream_64.add(string_literal88);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 162:22: -> DAY_OF_WEEK[\"5\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "5"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 11 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:163:5: 'friday' ( 's' )?
                    {
                    string_literal89=(Token)match(input,65,FOLLOW_65_in_day_of_week1207);  
                    stream_65.add(string_literal89);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:163:14: ( 's' )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==52) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:163:14: 's'
                            {
                            char_literal90=(Token)match(input,52,FOLLOW_52_in_day_of_week1209);  
                            stream_52.add(char_literal90);


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
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 163:22: -> DAY_OF_WEEK[\"6\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "6"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 12 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:164:5: 'fri'
                    {
                    string_literal91=(Token)match(input,66,FOLLOW_66_in_day_of_week1224);  
                    stream_66.add(string_literal91);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 164:22: -> DAY_OF_WEEK[\"6\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "6"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 13 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:165:5: 'saturday' ( 's' )?
                    {
                    string_literal92=(Token)match(input,67,FOLLOW_67_in_day_of_week1246);  
                    stream_67.add(string_literal92);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:165:16: ( 's' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==52) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:165:16: 's'
                            {
                            char_literal93=(Token)match(input,52,FOLLOW_52_in_day_of_week1248);  
                            stream_52.add(char_literal93);


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
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 165:22: -> DAY_OF_WEEK[\"7\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "7"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 14 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:166:5: 'sat'
                    {
                    string_literal94=(Token)match(input,68,FOLLOW_68_in_day_of_week1261);  
                    stream_68.add(string_literal94);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 166:22: -> DAY_OF_WEEK[\"7\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "7"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 15 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:167:5: 'weekend' ( 's' )?
                    {
                    string_literal95=(Token)match(input,69,FOLLOW_69_in_day_of_week1283);  
                    stream_69.add(string_literal95);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:167:15: ( 's' )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==52) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:167:15: 's'
                            {
                            char_literal96=(Token)match(input,52,FOLLOW_52_in_day_of_week1285);  
                            stream_52.add(char_literal96);


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
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 167:22: -> DAY_OF_WEEK[\"7\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "7"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 16 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:168:5: 'sunday' ( 's' )?
                    {
                    string_literal97=(Token)match(input,70,FOLLOW_70_in_day_of_week1299);  
                    stream_70.add(string_literal97);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:168:14: ( 's' )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==52) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:168:14: 's'
                            {
                            char_literal98=(Token)match(input,52,FOLLOW_52_in_day_of_week1301);  
                            stream_52.add(char_literal98);


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
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 168:22: -> DAY_OF_WEEK[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "1"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 17 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:169:5: 'sun'
                    {
                    string_literal99=(Token)match(input,71,FOLLOW_71_in_day_of_week1316);  
                    stream_71.add(string_literal99);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 169:22: -> DAY_OF_WEEK[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "1"));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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

    public static class day_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "day"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:173:1: day : ( 'first' -> DAY_OF_MONTH[\"1\"] | '1st' -> DAY_OF_MONTH[\"1\"] | 'second' -> DAY_OF_MONTH[\"2\"] | '2nd' -> DAY_OF_MONTH[\"2\"] | 'third' -> DAY_OF_MONTH[\"3\"] | '3rd' -> DAY_OF_MONTH[\"3\"] | 'fourth' -> DAY_OF_MONTH[\"4\"] | '4th' -> DAY_OF_MONTH[\"4\"] | 'fifth' -> DAY_OF_MONTH[\"5\"] | '5th' -> DAY_OF_MONTH[\"5\"] | 'sixth' -> DAY_OF_MONTH[\"6\"] | '6th' -> DAY_OF_MONTH[\"6\"] | 'seventh' -> DAY_OF_MONTH[\"7\"] | '7th' -> DAY_OF_MONTH[\"7\"] | 'eighth' -> DAY_OF_MONTH[\"8\"] | '8th' -> DAY_OF_MONTH[\"8\"] | 'ninth' -> DAY_OF_MONTH[\"9\"] | '9th' -> DAY_OF_MONTH[\"9\"] | 'tenth' -> DAY_OF_MONTH[\"10\"] | '10th' -> DAY_OF_MONTH[\"10\"] | 'eleventh' -> DAY_OF_MONTH[\"11\"] | '11th' -> DAY_OF_MONTH[\"11\"] | 'twelfth' -> DAY_OF_MONTH[\"12\"] | '12th' -> DAY_OF_MONTH[\"12\"] | 'thirteenth' -> DAY_OF_MONTH[\"13\"] | '13th' -> DAY_OF_MONTH[\"13\"] | 'fourteenth' -> DAY_OF_MONTH[\"14\"] | '14th' -> DAY_OF_MONTH[\"14\"] | 'fifteenth' -> DAY_OF_MONTH[\"15\"] | '15th' -> DAY_OF_MONTH[\"15\"] | 'sixteenth' -> DAY_OF_MONTH[\"16\"] | '16th' -> DAY_OF_MONTH[\"16\"] | 'seventeenth' -> DAY_OF_MONTH[\"17\"] | '17th' -> DAY_OF_MONTH[\"17\"] | 'eighteenth' -> DAY_OF_MONTH[\"18\"] | '18th' -> DAY_OF_MONTH[\"18\"] | 'nineteenth' -> DAY_OF_MONTH[\"19\"] | '19th' -> DAY_OF_MONTH[\"19\"] | 'twentieth' -> DAY_OF_MONTH[\"20\"] | '20th' -> DAY_OF_MONTH[\"20\"] | 'twenty' ( '-' )? 'first' -> DAY_OF_MONTH[\"21\"] | '21st' -> DAY_OF_MONTH[\"21\"] | 'twenty' ( '-' )? 'second' -> DAY_OF_MONTH[\"22\"] | '22nd' -> DAY_OF_MONTH[\"22\"] | 'twenty' ( '-' )? 'third' -> DAY_OF_MONTH[\"23\"] | '23rd' -> DAY_OF_MONTH[\"23\"] | 'twenty' ( '-' )? 'fourth' -> DAY_OF_MONTH[\"24\"] | '24th' -> DAY_OF_MONTH[\"24\"] | 'twenty' ( '-' )? 'fifth' -> DAY_OF_MONTH[\"25\"] | '25th' -> DAY_OF_MONTH[\"25\"] | 'twenty' ( '-' )? 'sixth' -> DAY_OF_MONTH[\"26\"] | '26th' -> DAY_OF_MONTH[\"26\"] | 'twenty' ( '-' )? 'seventh' -> DAY_OF_MONTH[\"27\"] | '27th' -> DAY_OF_MONTH[\"27\"] | 'twenty' ( '-' )? 'eighth' -> DAY_OF_MONTH[\"28\"] | '28th' -> DAY_OF_MONTH[\"28\"] | 'twenty' ( '-' )? 'ninth' -> DAY_OF_MONTH[\"29\"] | '29th' -> DAY_OF_MONTH[\"29\"] | 'thirtieth' -> DAY_OF_MONTH[\"30\"] | '30th' -> DAY_OF_MONTH[\"30\"] | 'thirty' ( '-' )? 'first' -> DAY_OF_MONTH[\"31\"] | '31st' -> DAY_OF_MONTH[\"31\"] );
    public final DateParser.day_return day() throws RecognitionException {
        DateParser.day_return retval = new DateParser.day_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal100=null;
        Token string_literal101=null;
        Token string_literal102=null;
        Token string_literal103=null;
        Token string_literal104=null;
        Token string_literal105=null;
        Token string_literal106=null;
        Token string_literal107=null;
        Token string_literal108=null;
        Token string_literal109=null;
        Token string_literal110=null;
        Token string_literal111=null;
        Token string_literal112=null;
        Token string_literal113=null;
        Token string_literal114=null;
        Token string_literal115=null;
        Token string_literal116=null;
        Token string_literal117=null;
        Token string_literal118=null;
        Token string_literal119=null;
        Token string_literal120=null;
        Token string_literal121=null;
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
        Token char_literal141=null;
        Token string_literal142=null;
        Token string_literal143=null;
        Token string_literal144=null;
        Token char_literal145=null;
        Token string_literal146=null;
        Token string_literal147=null;
        Token string_literal148=null;
        Token char_literal149=null;
        Token string_literal150=null;
        Token string_literal151=null;
        Token string_literal152=null;
        Token char_literal153=null;
        Token string_literal154=null;
        Token string_literal155=null;
        Token string_literal156=null;
        Token char_literal157=null;
        Token string_literal158=null;
        Token string_literal159=null;
        Token string_literal160=null;
        Token char_literal161=null;
        Token string_literal162=null;
        Token string_literal163=null;
        Token string_literal164=null;
        Token char_literal165=null;
        Token string_literal166=null;
        Token string_literal167=null;
        Token string_literal168=null;
        Token char_literal169=null;
        Token string_literal170=null;
        Token string_literal171=null;
        Token string_literal172=null;
        Token char_literal173=null;
        Token string_literal174=null;
        Token string_literal175=null;
        Token string_literal176=null;
        Token string_literal177=null;
        Token string_literal178=null;
        Token char_literal179=null;
        Token string_literal180=null;
        Token string_literal181=null;

        Object string_literal100_tree=null;
        Object string_literal101_tree=null;
        Object string_literal102_tree=null;
        Object string_literal103_tree=null;
        Object string_literal104_tree=null;
        Object string_literal105_tree=null;
        Object string_literal106_tree=null;
        Object string_literal107_tree=null;
        Object string_literal108_tree=null;
        Object string_literal109_tree=null;
        Object string_literal110_tree=null;
        Object string_literal111_tree=null;
        Object string_literal112_tree=null;
        Object string_literal113_tree=null;
        Object string_literal114_tree=null;
        Object string_literal115_tree=null;
        Object string_literal116_tree=null;
        Object string_literal117_tree=null;
        Object string_literal118_tree=null;
        Object string_literal119_tree=null;
        Object string_literal120_tree=null;
        Object string_literal121_tree=null;
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
        Object char_literal141_tree=null;
        Object string_literal142_tree=null;
        Object string_literal143_tree=null;
        Object string_literal144_tree=null;
        Object char_literal145_tree=null;
        Object string_literal146_tree=null;
        Object string_literal147_tree=null;
        Object string_literal148_tree=null;
        Object char_literal149_tree=null;
        Object string_literal150_tree=null;
        Object string_literal151_tree=null;
        Object string_literal152_tree=null;
        Object char_literal153_tree=null;
        Object string_literal154_tree=null;
        Object string_literal155_tree=null;
        Object string_literal156_tree=null;
        Object char_literal157_tree=null;
        Object string_literal158_tree=null;
        Object string_literal159_tree=null;
        Object string_literal160_tree=null;
        Object char_literal161_tree=null;
        Object string_literal162_tree=null;
        Object string_literal163_tree=null;
        Object string_literal164_tree=null;
        Object char_literal165_tree=null;
        Object string_literal166_tree=null;
        Object string_literal167_tree=null;
        Object string_literal168_tree=null;
        Object char_literal169_tree=null;
        Object string_literal170_tree=null;
        Object string_literal171_tree=null;
        Object string_literal172_tree=null;
        Object char_literal173_tree=null;
        Object string_literal174_tree=null;
        Object string_literal175_tree=null;
        Object string_literal176_tree=null;
        Object string_literal177_tree=null;
        Object string_literal178_tree=null;
        Object char_literal179_tree=null;
        Object string_literal180_tree=null;
        Object string_literal181_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:174:3: ( 'first' -> DAY_OF_MONTH[\"1\"] | '1st' -> DAY_OF_MONTH[\"1\"] | 'second' -> DAY_OF_MONTH[\"2\"] | '2nd' -> DAY_OF_MONTH[\"2\"] | 'third' -> DAY_OF_MONTH[\"3\"] | '3rd' -> DAY_OF_MONTH[\"3\"] | 'fourth' -> DAY_OF_MONTH[\"4\"] | '4th' -> DAY_OF_MONTH[\"4\"] | 'fifth' -> DAY_OF_MONTH[\"5\"] | '5th' -> DAY_OF_MONTH[\"5\"] | 'sixth' -> DAY_OF_MONTH[\"6\"] | '6th' -> DAY_OF_MONTH[\"6\"] | 'seventh' -> DAY_OF_MONTH[\"7\"] | '7th' -> DAY_OF_MONTH[\"7\"] | 'eighth' -> DAY_OF_MONTH[\"8\"] | '8th' -> DAY_OF_MONTH[\"8\"] | 'ninth' -> DAY_OF_MONTH[\"9\"] | '9th' -> DAY_OF_MONTH[\"9\"] | 'tenth' -> DAY_OF_MONTH[\"10\"] | '10th' -> DAY_OF_MONTH[\"10\"] | 'eleventh' -> DAY_OF_MONTH[\"11\"] | '11th' -> DAY_OF_MONTH[\"11\"] | 'twelfth' -> DAY_OF_MONTH[\"12\"] | '12th' -> DAY_OF_MONTH[\"12\"] | 'thirteenth' -> DAY_OF_MONTH[\"13\"] | '13th' -> DAY_OF_MONTH[\"13\"] | 'fourteenth' -> DAY_OF_MONTH[\"14\"] | '14th' -> DAY_OF_MONTH[\"14\"] | 'fifteenth' -> DAY_OF_MONTH[\"15\"] | '15th' -> DAY_OF_MONTH[\"15\"] | 'sixteenth' -> DAY_OF_MONTH[\"16\"] | '16th' -> DAY_OF_MONTH[\"16\"] | 'seventeenth' -> DAY_OF_MONTH[\"17\"] | '17th' -> DAY_OF_MONTH[\"17\"] | 'eighteenth' -> DAY_OF_MONTH[\"18\"] | '18th' -> DAY_OF_MONTH[\"18\"] | 'nineteenth' -> DAY_OF_MONTH[\"19\"] | '19th' -> DAY_OF_MONTH[\"19\"] | 'twentieth' -> DAY_OF_MONTH[\"20\"] | '20th' -> DAY_OF_MONTH[\"20\"] | 'twenty' ( '-' )? 'first' -> DAY_OF_MONTH[\"21\"] | '21st' -> DAY_OF_MONTH[\"21\"] | 'twenty' ( '-' )? 'second' -> DAY_OF_MONTH[\"22\"] | '22nd' -> DAY_OF_MONTH[\"22\"] | 'twenty' ( '-' )? 'third' -> DAY_OF_MONTH[\"23\"] | '23rd' -> DAY_OF_MONTH[\"23\"] | 'twenty' ( '-' )? 'fourth' -> DAY_OF_MONTH[\"24\"] | '24th' -> DAY_OF_MONTH[\"24\"] | 'twenty' ( '-' )? 'fifth' -> DAY_OF_MONTH[\"25\"] | '25th' -> DAY_OF_MONTH[\"25\"] | 'twenty' ( '-' )? 'sixth' -> DAY_OF_MONTH[\"26\"] | '26th' -> DAY_OF_MONTH[\"26\"] | 'twenty' ( '-' )? 'seventh' -> DAY_OF_MONTH[\"27\"] | '27th' -> DAY_OF_MONTH[\"27\"] | 'twenty' ( '-' )? 'eighth' -> DAY_OF_MONTH[\"28\"] | '28th' -> DAY_OF_MONTH[\"28\"] | 'twenty' ( '-' )? 'ninth' -> DAY_OF_MONTH[\"29\"] | '29th' -> DAY_OF_MONTH[\"29\"] | 'thirtieth' -> DAY_OF_MONTH[\"30\"] | '30th' -> DAY_OF_MONTH[\"30\"] | 'thirty' ( '-' )? 'first' -> DAY_OF_MONTH[\"31\"] | '31st' -> DAY_OF_MONTH[\"31\"] )
            int alt50=62;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:174:5: 'first'
                    {
                    string_literal100=(Token)match(input,72,FOLLOW_72_in_day1348);  
                    stream_72.add(string_literal100);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 174:29: -> DAY_OF_MONTH[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "1"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:175:5: '1st'
                    {
                    string_literal101=(Token)match(input,73,FOLLOW_73_in_day1375);  
                    stream_73.add(string_literal101);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 175:29: -> DAY_OF_MONTH[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "1"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:176:5: 'second'
                    {
                    string_literal102=(Token)match(input,74,FOLLOW_74_in_day1404);  
                    stream_74.add(string_literal102);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 176:29: -> DAY_OF_MONTH[\"2\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "2"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:177:5: '2nd'
                    {
                    string_literal103=(Token)match(input,75,FOLLOW_75_in_day1430);  
                    stream_75.add(string_literal103);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 177:29: -> DAY_OF_MONTH[\"2\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "2"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:178:5: 'third'
                    {
                    string_literal104=(Token)match(input,76,FOLLOW_76_in_day1459);  
                    stream_76.add(string_literal104);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 178:29: -> DAY_OF_MONTH[\"3\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "3"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:179:5: '3rd'
                    {
                    string_literal105=(Token)match(input,77,FOLLOW_77_in_day1486);  
                    stream_77.add(string_literal105);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 179:29: -> DAY_OF_MONTH[\"3\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "3"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:180:5: 'fourth'
                    {
                    string_literal106=(Token)match(input,78,FOLLOW_78_in_day1515);  
                    stream_78.add(string_literal106);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 180:29: -> DAY_OF_MONTH[\"4\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "4"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:181:5: '4th'
                    {
                    string_literal107=(Token)match(input,79,FOLLOW_79_in_day1541);  
                    stream_79.add(string_literal107);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 181:29: -> DAY_OF_MONTH[\"4\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "4"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 9 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:182:5: 'fifth'
                    {
                    string_literal108=(Token)match(input,80,FOLLOW_80_in_day1570);  
                    stream_80.add(string_literal108);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 182:29: -> DAY_OF_MONTH[\"5\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "5"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 10 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:183:5: '5th'
                    {
                    string_literal109=(Token)match(input,81,FOLLOW_81_in_day1597);  
                    stream_81.add(string_literal109);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 183:29: -> DAY_OF_MONTH[\"5\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "5"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 11 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:184:5: 'sixth'
                    {
                    string_literal110=(Token)match(input,82,FOLLOW_82_in_day1626);  
                    stream_82.add(string_literal110);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 184:29: -> DAY_OF_MONTH[\"6\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "6"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 12 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:185:5: '6th'
                    {
                    string_literal111=(Token)match(input,83,FOLLOW_83_in_day1653);  
                    stream_83.add(string_literal111);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 185:29: -> DAY_OF_MONTH[\"6\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "6"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 13 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:186:5: 'seventh'
                    {
                    string_literal112=(Token)match(input,84,FOLLOW_84_in_day1682);  
                    stream_84.add(string_literal112);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 186:29: -> DAY_OF_MONTH[\"7\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "7"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 14 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:187:5: '7th'
                    {
                    string_literal113=(Token)match(input,85,FOLLOW_85_in_day1707);  
                    stream_85.add(string_literal113);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 187:29: -> DAY_OF_MONTH[\"7\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "7"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 15 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:188:5: 'eighth'
                    {
                    string_literal114=(Token)match(input,86,FOLLOW_86_in_day1736);  
                    stream_86.add(string_literal114);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 188:29: -> DAY_OF_MONTH[\"8\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "8"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 16 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:189:5: '8th'
                    {
                    string_literal115=(Token)match(input,87,FOLLOW_87_in_day1762);  
                    stream_87.add(string_literal115);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 189:29: -> DAY_OF_MONTH[\"8\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "8"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 17 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:190:5: 'ninth'
                    {
                    string_literal116=(Token)match(input,88,FOLLOW_88_in_day1791);  
                    stream_88.add(string_literal116);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 190:29: -> DAY_OF_MONTH[\"9\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "9"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 18 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:191:5: '9th'
                    {
                    string_literal117=(Token)match(input,89,FOLLOW_89_in_day1818);  
                    stream_89.add(string_literal117);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 191:29: -> DAY_OF_MONTH[\"9\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "9"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 19 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:192:5: 'tenth'
                    {
                    string_literal118=(Token)match(input,90,FOLLOW_90_in_day1847);  
                    stream_90.add(string_literal118);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 192:29: -> DAY_OF_MONTH[\"10\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "10"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 20 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:193:5: '10th'
                    {
                    string_literal119=(Token)match(input,91,FOLLOW_91_in_day1874);  
                    stream_91.add(string_literal119);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 193:29: -> DAY_OF_MONTH[\"10\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "10"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 21 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:194:5: 'eleventh'
                    {
                    string_literal120=(Token)match(input,92,FOLLOW_92_in_day1902);  
                    stream_92.add(string_literal120);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 194:29: -> DAY_OF_MONTH[\"11\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "11"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 22 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:195:5: '11th'
                    {
                    string_literal121=(Token)match(input,93,FOLLOW_93_in_day1926);  
                    stream_93.add(string_literal121);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 195:29: -> DAY_OF_MONTH[\"11\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "11"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 23 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:196:5: 'twelfth'
                    {
                    string_literal122=(Token)match(input,94,FOLLOW_94_in_day1954);  
                    stream_94.add(string_literal122);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 196:29: -> DAY_OF_MONTH[\"12\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "12"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 24 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:197:5: '12th'
                    {
                    string_literal123=(Token)match(input,95,FOLLOW_95_in_day1979);  
                    stream_95.add(string_literal123);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 197:29: -> DAY_OF_MONTH[\"12\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "12"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 25 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:198:5: 'thirteenth'
                    {
                    string_literal124=(Token)match(input,96,FOLLOW_96_in_day2007);  
                    stream_96.add(string_literal124);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 198:29: -> DAY_OF_MONTH[\"13\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "13"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 26 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:199:5: '13th'
                    {
                    string_literal125=(Token)match(input,97,FOLLOW_97_in_day2029);  
                    stream_97.add(string_literal125);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 199:29: -> DAY_OF_MONTH[\"13\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "13"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 27 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:200:5: 'fourteenth'
                    {
                    string_literal126=(Token)match(input,98,FOLLOW_98_in_day2057);  
                    stream_98.add(string_literal126);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 200:29: -> DAY_OF_MONTH[\"14\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "14"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 28 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:201:5: '14th'
                    {
                    string_literal127=(Token)match(input,99,FOLLOW_99_in_day2079);  
                    stream_99.add(string_literal127);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 201:29: -> DAY_OF_MONTH[\"14\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "14"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 29 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:202:5: 'fifteenth'
                    {
                    string_literal128=(Token)match(input,100,FOLLOW_100_in_day2107);  
                    stream_100.add(string_literal128);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 202:29: -> DAY_OF_MONTH[\"15\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "15"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 30 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:203:5: '15th'
                    {
                    string_literal129=(Token)match(input,101,FOLLOW_101_in_day2130);  
                    stream_101.add(string_literal129);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 203:29: -> DAY_OF_MONTH[\"15\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "15"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 31 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:204:5: 'sixteenth'
                    {
                    string_literal130=(Token)match(input,102,FOLLOW_102_in_day2158);  
                    stream_102.add(string_literal130);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 204:29: -> DAY_OF_MONTH[\"16\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "16"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 32 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:205:5: '16th'
                    {
                    string_literal131=(Token)match(input,103,FOLLOW_103_in_day2181);  
                    stream_103.add(string_literal131);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 205:29: -> DAY_OF_MONTH[\"16\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "16"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 33 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:206:5: 'seventeenth'
                    {
                    string_literal132=(Token)match(input,104,FOLLOW_104_in_day2209);  
                    stream_104.add(string_literal132);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 206:29: -> DAY_OF_MONTH[\"17\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "17"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 34 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:207:5: '17th'
                    {
                    string_literal133=(Token)match(input,105,FOLLOW_105_in_day2230);  
                    stream_105.add(string_literal133);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 207:29: -> DAY_OF_MONTH[\"17\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "17"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 35 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:208:5: 'eighteenth'
                    {
                    string_literal134=(Token)match(input,106,FOLLOW_106_in_day2258);  
                    stream_106.add(string_literal134);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 208:29: -> DAY_OF_MONTH[\"18\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "18"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 36 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:209:5: '18th'
                    {
                    string_literal135=(Token)match(input,107,FOLLOW_107_in_day2280);  
                    stream_107.add(string_literal135);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 209:29: -> DAY_OF_MONTH[\"18\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "18"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 37 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:210:5: 'nineteenth'
                    {
                    string_literal136=(Token)match(input,108,FOLLOW_108_in_day2308);  
                    stream_108.add(string_literal136);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 210:29: -> DAY_OF_MONTH[\"19\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "19"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 38 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:211:5: '19th'
                    {
                    string_literal137=(Token)match(input,109,FOLLOW_109_in_day2330);  
                    stream_109.add(string_literal137);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 211:29: -> DAY_OF_MONTH[\"19\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "19"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 39 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:212:5: 'twentieth'
                    {
                    string_literal138=(Token)match(input,110,FOLLOW_110_in_day2358);  
                    stream_110.add(string_literal138);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 212:29: -> DAY_OF_MONTH[\"20\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "20"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 40 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:213:5: '20th'
                    {
                    string_literal139=(Token)match(input,111,FOLLOW_111_in_day2381);  
                    stream_111.add(string_literal139);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 213:29: -> DAY_OF_MONTH[\"20\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "20"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 41 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:214:5: 'twenty' ( '-' )? 'first'
                    {
                    string_literal140=(Token)match(input,112,FOLLOW_112_in_day2409);  
                    stream_112.add(string_literal140);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:214:14: ( '-' )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==40) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:214:14: '-'
                            {
                            char_literal141=(Token)match(input,40,FOLLOW_40_in_day2411);  
                            stream_40.add(char_literal141);


                            }
                            break;

                    }

                    string_literal142=(Token)match(input,72,FOLLOW_72_in_day2414);  
                    stream_72.add(string_literal142);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 214:29: -> DAY_OF_MONTH[\"21\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "21"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 42 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:215:5: '21st'
                    {
                    string_literal143=(Token)match(input,113,FOLLOW_113_in_day2427);  
                    stream_113.add(string_literal143);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 215:29: -> DAY_OF_MONTH[\"21\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "21"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 43 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:216:5: 'twenty' ( '-' )? 'second'
                    {
                    string_literal144=(Token)match(input,112,FOLLOW_112_in_day2455);  
                    stream_112.add(string_literal144);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:216:14: ( '-' )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==40) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:216:14: '-'
                            {
                            char_literal145=(Token)match(input,40,FOLLOW_40_in_day2457);  
                            stream_40.add(char_literal145);


                            }
                            break;

                    }

                    string_literal146=(Token)match(input,74,FOLLOW_74_in_day2460);  
                    stream_74.add(string_literal146);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 216:29: -> DAY_OF_MONTH[\"22\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "22"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 44 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:217:5: '22nd'
                    {
                    string_literal147=(Token)match(input,114,FOLLOW_114_in_day2472);  
                    stream_114.add(string_literal147);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 217:29: -> DAY_OF_MONTH[\"22\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "22"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 45 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:218:5: 'twenty' ( '-' )? 'third'
                    {
                    string_literal148=(Token)match(input,112,FOLLOW_112_in_day2500);  
                    stream_112.add(string_literal148);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:218:14: ( '-' )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==40) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:218:14: '-'
                            {
                            char_literal149=(Token)match(input,40,FOLLOW_40_in_day2502);  
                            stream_40.add(char_literal149);


                            }
                            break;

                    }

                    string_literal150=(Token)match(input,76,FOLLOW_76_in_day2505);  
                    stream_76.add(string_literal150);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 218:29: -> DAY_OF_MONTH[\"23\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "23"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 46 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:219:5: '23rd'
                    {
                    string_literal151=(Token)match(input,115,FOLLOW_115_in_day2518);  
                    stream_115.add(string_literal151);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 219:29: -> DAY_OF_MONTH[\"23\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "23"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 47 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:220:5: 'twenty' ( '-' )? 'fourth'
                    {
                    string_literal152=(Token)match(input,112,FOLLOW_112_in_day2546);  
                    stream_112.add(string_literal152);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:220:14: ( '-' )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==40) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:220:14: '-'
                            {
                            char_literal153=(Token)match(input,40,FOLLOW_40_in_day2548);  
                            stream_40.add(char_literal153);


                            }
                            break;

                    }

                    string_literal154=(Token)match(input,78,FOLLOW_78_in_day2551);  
                    stream_78.add(string_literal154);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 220:29: -> DAY_OF_MONTH[\"24\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "24"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 48 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:221:5: '24th'
                    {
                    string_literal155=(Token)match(input,116,FOLLOW_116_in_day2563);  
                    stream_116.add(string_literal155);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 221:29: -> DAY_OF_MONTH[\"24\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "24"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 49 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:222:5: 'twenty' ( '-' )? 'fifth'
                    {
                    string_literal156=(Token)match(input,112,FOLLOW_112_in_day2591);  
                    stream_112.add(string_literal156);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:222:14: ( '-' )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==40) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:222:14: '-'
                            {
                            char_literal157=(Token)match(input,40,FOLLOW_40_in_day2593);  
                            stream_40.add(char_literal157);


                            }
                            break;

                    }

                    string_literal158=(Token)match(input,80,FOLLOW_80_in_day2596);  
                    stream_80.add(string_literal158);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 222:29: -> DAY_OF_MONTH[\"25\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "25"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 50 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:223:5: '25th'
                    {
                    string_literal159=(Token)match(input,117,FOLLOW_117_in_day2609);  
                    stream_117.add(string_literal159);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 223:29: -> DAY_OF_MONTH[\"25\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "25"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 51 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:224:5: 'twenty' ( '-' )? 'sixth'
                    {
                    string_literal160=(Token)match(input,112,FOLLOW_112_in_day2637);  
                    stream_112.add(string_literal160);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:224:14: ( '-' )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==40) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:224:14: '-'
                            {
                            char_literal161=(Token)match(input,40,FOLLOW_40_in_day2639);  
                            stream_40.add(char_literal161);


                            }
                            break;

                    }

                    string_literal162=(Token)match(input,82,FOLLOW_82_in_day2642);  
                    stream_82.add(string_literal162);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 224:29: -> DAY_OF_MONTH[\"26\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "26"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 52 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:225:5: '26th'
                    {
                    string_literal163=(Token)match(input,118,FOLLOW_118_in_day2655);  
                    stream_118.add(string_literal163);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 225:29: -> DAY_OF_MONTH[\"26\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "26"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 53 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:226:5: 'twenty' ( '-' )? 'seventh'
                    {
                    string_literal164=(Token)match(input,112,FOLLOW_112_in_day2683);  
                    stream_112.add(string_literal164);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:226:14: ( '-' )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==40) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:226:14: '-'
                            {
                            char_literal165=(Token)match(input,40,FOLLOW_40_in_day2685);  
                            stream_40.add(char_literal165);


                            }
                            break;

                    }

                    string_literal166=(Token)match(input,84,FOLLOW_84_in_day2688);  
                    stream_84.add(string_literal166);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 226:29: -> DAY_OF_MONTH[\"27\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "27"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 54 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:227:5: '27th'
                    {
                    string_literal167=(Token)match(input,119,FOLLOW_119_in_day2699);  
                    stream_119.add(string_literal167);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 227:29: -> DAY_OF_MONTH[\"27\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "27"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 55 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:228:5: 'twenty' ( '-' )? 'eighth'
                    {
                    string_literal168=(Token)match(input,112,FOLLOW_112_in_day2727);  
                    stream_112.add(string_literal168);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:228:14: ( '-' )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==40) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:228:14: '-'
                            {
                            char_literal169=(Token)match(input,40,FOLLOW_40_in_day2729);  
                            stream_40.add(char_literal169);


                            }
                            break;

                    }

                    string_literal170=(Token)match(input,86,FOLLOW_86_in_day2732);  
                    stream_86.add(string_literal170);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 228:29: -> DAY_OF_MONTH[\"28\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "28"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 56 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:229:5: '28th'
                    {
                    string_literal171=(Token)match(input,120,FOLLOW_120_in_day2744);  
                    stream_120.add(string_literal171);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 229:29: -> DAY_OF_MONTH[\"28\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "28"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 57 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:230:5: 'twenty' ( '-' )? 'ninth'
                    {
                    string_literal172=(Token)match(input,112,FOLLOW_112_in_day2772);  
                    stream_112.add(string_literal172);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:230:14: ( '-' )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==40) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:230:14: '-'
                            {
                            char_literal173=(Token)match(input,40,FOLLOW_40_in_day2774);  
                            stream_40.add(char_literal173);


                            }
                            break;

                    }

                    string_literal174=(Token)match(input,88,FOLLOW_88_in_day2777);  
                    stream_88.add(string_literal174);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 230:29: -> DAY_OF_MONTH[\"29\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "29"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 58 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:231:5: '29th'
                    {
                    string_literal175=(Token)match(input,121,FOLLOW_121_in_day2790);  
                    stream_121.add(string_literal175);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 231:29: -> DAY_OF_MONTH[\"29\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "29"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 59 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:232:5: 'thirtieth'
                    {
                    string_literal176=(Token)match(input,122,FOLLOW_122_in_day2818);  
                    stream_122.add(string_literal176);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 232:29: -> DAY_OF_MONTH[\"30\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "30"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 60 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:233:5: '30th'
                    {
                    string_literal177=(Token)match(input,123,FOLLOW_123_in_day2841);  
                    stream_123.add(string_literal177);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 233:29: -> DAY_OF_MONTH[\"30\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "30"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 61 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:234:5: 'thirty' ( '-' )? 'first'
                    {
                    string_literal178=(Token)match(input,124,FOLLOW_124_in_day2869);  
                    stream_124.add(string_literal178);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:234:14: ( '-' )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==40) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:234:14: '-'
                            {
                            char_literal179=(Token)match(input,40,FOLLOW_40_in_day2871);  
                            stream_40.add(char_literal179);


                            }
                            break;

                    }

                    string_literal180=(Token)match(input,72,FOLLOW_72_in_day2874);  
                    stream_72.add(string_literal180);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 234:29: -> DAY_OF_MONTH[\"31\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "31"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 62 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:235:5: '31st'
                    {
                    string_literal181=(Token)match(input,125,FOLLOW_125_in_day2887);  
                    stream_125.add(string_literal181);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 235:29: -> DAY_OF_MONTH[\"31\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, "31"));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "day"

    public static class month_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "month"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:239:1: month : ( 'january' -> MONTH[\"1\"] | 'jan' -> MONTH[\"1\"] | 'february' -> MONTH[\"2\"] | 'feb' -> MONTH[\"2\"] | 'march' -> MONTH[\"3\"] | 'mar' -> MONTH[\"3\"] | 'april' -> MONTH[\"4\"] | 'apr' -> MONTH[\"4\"] | 'may' -> MONTH[\"5\"] | 'june' -> MONTH[\"6\"] | 'jun' -> MONTH[\"6\"] | 'july' -> MONTH[\"7\"] | 'jul' -> MONTH[\"7\"] | 'august' -> MONTH[\"8\"] | 'aug' -> MONTH[\"8\"] | 'september' -> MONTH[\"9\"] | 'sep' -> MONTH[\"9\"] | 'october' -> MONTH[\"10\"] | 'oct' -> MONTH[\"10\"] | 'november' -> MONTH[\"11\"] | 'nov' -> MONTH[\"11\"] | 'december' -> MONTH[\"12\"] | 'dec' -> MONTH[\"12\"] );
    public final DateParser.month_return month() throws RecognitionException {
        DateParser.month_return retval = new DateParser.month_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal182=null;
        Token string_literal183=null;
        Token string_literal184=null;
        Token string_literal185=null;
        Token string_literal186=null;
        Token string_literal187=null;
        Token string_literal188=null;
        Token string_literal189=null;
        Token string_literal190=null;
        Token string_literal191=null;
        Token string_literal192=null;
        Token string_literal193=null;
        Token string_literal194=null;
        Token string_literal195=null;
        Token string_literal196=null;
        Token string_literal197=null;
        Token string_literal198=null;
        Token string_literal199=null;
        Token string_literal200=null;
        Token string_literal201=null;
        Token string_literal202=null;
        Token string_literal203=null;
        Token string_literal204=null;

        Object string_literal182_tree=null;
        Object string_literal183_tree=null;
        Object string_literal184_tree=null;
        Object string_literal185_tree=null;
        Object string_literal186_tree=null;
        Object string_literal187_tree=null;
        Object string_literal188_tree=null;
        Object string_literal189_tree=null;
        Object string_literal190_tree=null;
        Object string_literal191_tree=null;
        Object string_literal192_tree=null;
        Object string_literal193_tree=null;
        Object string_literal194_tree=null;
        Object string_literal195_tree=null;
        Object string_literal196_tree=null;
        Object string_literal197_tree=null;
        Object string_literal198_tree=null;
        Object string_literal199_tree=null;
        Object string_literal200_tree=null;
        Object string_literal201_tree=null;
        Object string_literal202_tree=null;
        Object string_literal203_tree=null;
        Object string_literal204_tree=null;
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
        RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
        RewriteRuleTokenStream stream_144=new RewriteRuleTokenStream(adaptor,"token 144");
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_145=new RewriteRuleTokenStream(adaptor,"token 145");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
        RewriteRuleTokenStream stream_146=new RewriteRuleTokenStream(adaptor,"token 146");
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleTokenStream stream_147=new RewriteRuleTokenStream(adaptor,"token 147");
        RewriteRuleTokenStream stream_138=new RewriteRuleTokenStream(adaptor,"token 138");
        RewriteRuleTokenStream stream_148=new RewriteRuleTokenStream(adaptor,"token 148");
        RewriteRuleTokenStream stream_139=new RewriteRuleTokenStream(adaptor,"token 139");
        RewriteRuleTokenStream stream_136=new RewriteRuleTokenStream(adaptor,"token 136");
        RewriteRuleTokenStream stream_137=new RewriteRuleTokenStream(adaptor,"token 137");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleTokenStream stream_142=new RewriteRuleTokenStream(adaptor,"token 142");
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:240:3: ( 'january' -> MONTH[\"1\"] | 'jan' -> MONTH[\"1\"] | 'february' -> MONTH[\"2\"] | 'feb' -> MONTH[\"2\"] | 'march' -> MONTH[\"3\"] | 'mar' -> MONTH[\"3\"] | 'april' -> MONTH[\"4\"] | 'apr' -> MONTH[\"4\"] | 'may' -> MONTH[\"5\"] | 'june' -> MONTH[\"6\"] | 'jun' -> MONTH[\"6\"] | 'july' -> MONTH[\"7\"] | 'jul' -> MONTH[\"7\"] | 'august' -> MONTH[\"8\"] | 'aug' -> MONTH[\"8\"] | 'september' -> MONTH[\"9\"] | 'sep' -> MONTH[\"9\"] | 'october' -> MONTH[\"10\"] | 'oct' -> MONTH[\"10\"] | 'november' -> MONTH[\"11\"] | 'nov' -> MONTH[\"11\"] | 'december' -> MONTH[\"12\"] | 'dec' -> MONTH[\"12\"] )
            int alt51=23;
            switch ( input.LA(1) ) {
            case 126:
                {
                alt51=1;
                }
                break;
            case 127:
                {
                alt51=2;
                }
                break;
            case 128:
                {
                alt51=3;
                }
                break;
            case 129:
                {
                alt51=4;
                }
                break;
            case 130:
                {
                alt51=5;
                }
                break;
            case 131:
                {
                alt51=6;
                }
                break;
            case 132:
                {
                alt51=7;
                }
                break;
            case 133:
                {
                alt51=8;
                }
                break;
            case 134:
                {
                alt51=9;
                }
                break;
            case 135:
                {
                alt51=10;
                }
                break;
            case 136:
                {
                alt51=11;
                }
                break;
            case 137:
                {
                alt51=12;
                }
                break;
            case 138:
                {
                alt51=13;
                }
                break;
            case 139:
                {
                alt51=14;
                }
                break;
            case 140:
                {
                alt51=15;
                }
                break;
            case 141:
                {
                alt51=16;
                }
                break;
            case 142:
                {
                alt51=17;
                }
                break;
            case 143:
                {
                alt51=18;
                }
                break;
            case 144:
                {
                alt51=19;
                }
                break;
            case 145:
                {
                alt51=20;
                }
                break;
            case 146:
                {
                alt51=21;
                }
                break;
            case 147:
                {
                alt51=22;
                }
                break;
            case 148:
                {
                alt51=23;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:240:5: 'january'
                    {
                    string_literal182=(Token)match(input,126,FOLLOW_126_in_month2923);  
                    stream_126.add(string_literal182);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 240:16: -> MONTH[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "1"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:241:5: 'jan'
                    {
                    string_literal183=(Token)match(input,127,FOLLOW_127_in_month2935);  
                    stream_127.add(string_literal183);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 241:16: -> MONTH[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "1"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:242:5: 'february'
                    {
                    string_literal184=(Token)match(input,128,FOLLOW_128_in_month2951);  
                    stream_128.add(string_literal184);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 242:16: -> MONTH[\"2\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "2"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:243:5: 'feb'
                    {
                    string_literal185=(Token)match(input,129,FOLLOW_129_in_month2962);  
                    stream_129.add(string_literal185);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 243:16: -> MONTH[\"2\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "2"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:244:5: 'march'
                    {
                    string_literal186=(Token)match(input,130,FOLLOW_130_in_month2978);  
                    stream_130.add(string_literal186);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 244:16: -> MONTH[\"3\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "3"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:245:5: 'mar'
                    {
                    string_literal187=(Token)match(input,131,FOLLOW_131_in_month2992);  
                    stream_131.add(string_literal187);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 245:16: -> MONTH[\"3\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "3"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:5: 'april'
                    {
                    string_literal188=(Token)match(input,132,FOLLOW_132_in_month3008);  
                    stream_132.add(string_literal188);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 246:16: -> MONTH[\"4\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "4"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:247:5: 'apr'
                    {
                    string_literal189=(Token)match(input,133,FOLLOW_133_in_month3022);  
                    stream_133.add(string_literal189);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 247:16: -> MONTH[\"4\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "4"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 9 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:248:5: 'may'
                    {
                    string_literal190=(Token)match(input,134,FOLLOW_134_in_month3038);  
                    stream_134.add(string_literal190);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 248:16: -> MONTH[\"5\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "5"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 10 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:249:5: 'june'
                    {
                    string_literal191=(Token)match(input,135,FOLLOW_135_in_month3054);  
                    stream_135.add(string_literal191);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 249:16: -> MONTH[\"6\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "6"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 11 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:250:5: 'jun'
                    {
                    string_literal192=(Token)match(input,136,FOLLOW_136_in_month3069);  
                    stream_136.add(string_literal192);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 250:16: -> MONTH[\"6\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "6"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 12 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:251:5: 'july'
                    {
                    string_literal193=(Token)match(input,137,FOLLOW_137_in_month3085);  
                    stream_137.add(string_literal193);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 251:16: -> MONTH[\"7\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "7"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 13 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:252:5: 'jul'
                    {
                    string_literal194=(Token)match(input,138,FOLLOW_138_in_month3100);  
                    stream_138.add(string_literal194);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 252:16: -> MONTH[\"7\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "7"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 14 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:253:5: 'august'
                    {
                    string_literal195=(Token)match(input,139,FOLLOW_139_in_month3116);  
                    stream_139.add(string_literal195);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 253:16: -> MONTH[\"8\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "8"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 15 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:254:5: 'aug'
                    {
                    string_literal196=(Token)match(input,140,FOLLOW_140_in_month3129);  
                    stream_140.add(string_literal196);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 254:16: -> MONTH[\"8\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "8"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 16 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:255:5: 'september'
                    {
                    string_literal197=(Token)match(input,141,FOLLOW_141_in_month3145);  
                    stream_141.add(string_literal197);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 255:16: -> MONTH[\"9\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "9"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 17 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:256:5: 'sep'
                    {
                    string_literal198=(Token)match(input,142,FOLLOW_142_in_month3155);  
                    stream_142.add(string_literal198);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 256:16: -> MONTH[\"9\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "9"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 18 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:257:5: 'october'
                    {
                    string_literal199=(Token)match(input,143,FOLLOW_143_in_month3171);  
                    stream_143.add(string_literal199);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 257:16: -> MONTH[\"10\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "10"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 19 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:258:5: 'oct'
                    {
                    string_literal200=(Token)match(input,144,FOLLOW_144_in_month3183);  
                    stream_144.add(string_literal200);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 258:16: -> MONTH[\"10\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "10"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 20 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:259:5: 'november'
                    {
                    string_literal201=(Token)match(input,145,FOLLOW_145_in_month3199);  
                    stream_145.add(string_literal201);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 259:16: -> MONTH[\"11\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "11"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 21 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:260:5: 'nov'
                    {
                    string_literal202=(Token)match(input,146,FOLLOW_146_in_month3210);  
                    stream_146.add(string_literal202);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 260:16: -> MONTH[\"11\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "11"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 22 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:5: 'december'
                    {
                    string_literal203=(Token)match(input,147,FOLLOW_147_in_month3226);  
                    stream_147.add(string_literal203);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 261:16: -> MONTH[\"12\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "12"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 23 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:5: 'dec'
                    {
                    string_literal204=(Token)match(input,148,FOLLOW_148_in_month3237);  
                    stream_148.add(string_literal204);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 262:16: -> MONTH[\"12\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "12"));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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

    public static class today_or_tomorrow_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "today_or_tomorrow"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:266:1: today_or_tomorrow : ( 'today' -> ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"0\"] ) | tomorrow | 'yesterday' -> ^( RELATIVE_DATE SEEK_DIRECTION[\"<\"] INTEGER[\"1\"] ) | ( 'the' )? 'day after ' tomorrow -> ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"2\"] ) | ( 'the' )? 'day before yesterday' -> ^( RELATIVE_DATE SEEK_DIRECTION[\"<\"] INTEGER[\"2\"] ) );
    public final DateParser.today_or_tomorrow_return today_or_tomorrow() throws RecognitionException {
        DateParser.today_or_tomorrow_return retval = new DateParser.today_or_tomorrow_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal205=null;
        Token string_literal207=null;
        Token string_literal208=null;
        Token string_literal209=null;
        Token string_literal211=null;
        Token string_literal212=null;
        DateParser.tomorrow_return tomorrow206 = null;

        DateParser.tomorrow_return tomorrow210 = null;


        Object string_literal205_tree=null;
        Object string_literal207_tree=null;
        Object string_literal208_tree=null;
        Object string_literal209_tree=null;
        Object string_literal211_tree=null;
        Object string_literal212_tree=null;
        RewriteRuleTokenStream stream_152=new RewriteRuleTokenStream(adaptor,"token 152");
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleTokenStream stream_149=new RewriteRuleTokenStream(adaptor,"token 149");
        RewriteRuleSubtreeStream stream_tomorrow=new RewriteRuleSubtreeStream(adaptor,"rule tomorrow");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:267:3: ( 'today' -> ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"0\"] ) | tomorrow | 'yesterday' -> ^( RELATIVE_DATE SEEK_DIRECTION[\"<\"] INTEGER[\"1\"] ) | ( 'the' )? 'day after ' tomorrow -> ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"2\"] ) | ( 'the' )? 'day before yesterday' -> ^( RELATIVE_DATE SEEK_DIRECTION[\"<\"] INTEGER[\"2\"] ) )
            int alt54=5;
            switch ( input.LA(1) ) {
            case 149:
                {
                alt54=1;
                }
                break;
            case 154:
            case 155:
            case 156:
            case 157:
                {
                alt54=2;
                }
                break;
            case 150:
                {
                alt54=3;
                }
                break;
            case 151:
                {
                int LA54_4 = input.LA(2);

                if ( (LA54_4==153) ) {
                    alt54=5;
                }
                else if ( (LA54_4==152) ) {
                    alt54=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 4, input);

                    throw nvae;
                }
                }
                break;
            case 152:
                {
                alt54=4;
                }
                break;
            case 153:
                {
                alt54=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:267:5: 'today'
                    {
                    string_literal205=(Token)match(input,149,FOLLOW_149_in_today_or_tomorrow3263);  
                    stream_149.add(string_literal205);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 267:13: -> ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"0\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:267:16: ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"0\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(SEEK_DIRECTION, ">"));
                        adaptor.addChild(root_1, (Object)adaptor.create(INTEGER, "0"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:268:5: tomorrow
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tomorrow_in_today_or_tomorrow3281);
                    tomorrow206=tomorrow();

                    state._fsp--;

                    adaptor.addChild(root_0, tomorrow206.getTree());

                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:271:5: 'yesterday'
                    {
                    string_literal207=(Token)match(input,150,FOLLOW_150_in_today_or_tomorrow3293);  
                    stream_150.add(string_literal207);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 271:17: -> ^( RELATIVE_DATE SEEK_DIRECTION[\"<\"] INTEGER[\"1\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:271:20: ^( RELATIVE_DATE SEEK_DIRECTION[\"<\"] INTEGER[\"1\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(SEEK_DIRECTION, "<"));
                        adaptor.addChild(root_1, (Object)adaptor.create(INTEGER, "1"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:274:5: ( 'the' )? 'day after ' tomorrow
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:274:5: ( 'the' )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==151) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:274:5: 'the'
                            {
                            string_literal208=(Token)match(input,151,FOLLOW_151_in_today_or_tomorrow3317);  
                            stream_151.add(string_literal208);


                            }
                            break;

                    }

                    string_literal209=(Token)match(input,152,FOLLOW_152_in_today_or_tomorrow3320);  
                    stream_152.add(string_literal209);

                    pushFollow(FOLLOW_tomorrow_in_today_or_tomorrow3322);
                    tomorrow210=tomorrow();

                    state._fsp--;

                    stream_tomorrow.add(tomorrow210.getTree());


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 274:34: -> ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"2\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:274:37: ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"2\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(SEEK_DIRECTION, ">"));
                        adaptor.addChild(root_1, (Object)adaptor.create(INTEGER, "2"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:275:5: ( 'the' )? 'day before yesterday'
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:275:5: ( 'the' )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==151) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:275:5: 'the'
                            {
                            string_literal211=(Token)match(input,151,FOLLOW_151_in_today_or_tomorrow3340);  
                            stream_151.add(string_literal211);


                            }
                            break;

                    }

                    string_literal212=(Token)match(input,153,FOLLOW_153_in_today_or_tomorrow3343);  
                    stream_153.add(string_literal212);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 275:35: -> ^( RELATIVE_DATE SEEK_DIRECTION[\"<\"] INTEGER[\"2\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:275:38: ^( RELATIVE_DATE SEEK_DIRECTION[\"<\"] INTEGER[\"2\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(SEEK_DIRECTION, "<"));
                        adaptor.addChild(root_1, (Object)adaptor.create(INTEGER, "2"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:278:1: tomorrow : ( 'tomorow' | 'tomorrow' | 'tommorow' | 'tommorrow' ) -> ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"1\"] ) ;
    public final DateParser.tomorrow_return tomorrow() throws RecognitionException {
        DateParser.tomorrow_return retval = new DateParser.tomorrow_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal213=null;
        Token string_literal214=null;
        Token string_literal215=null;
        Token string_literal216=null;

        Object string_literal213_tree=null;
        Object string_literal214_tree=null;
        Object string_literal215_tree=null;
        Object string_literal216_tree=null;
        RewriteRuleTokenStream stream_157=new RewriteRuleTokenStream(adaptor,"token 157");
        RewriteRuleTokenStream stream_156=new RewriteRuleTokenStream(adaptor,"token 156");
        RewriteRuleTokenStream stream_155=new RewriteRuleTokenStream(adaptor,"token 155");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:279:3: ( ( 'tomorow' | 'tomorrow' | 'tommorow' | 'tommorrow' ) -> ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"1\"] ) )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:279:5: ( 'tomorow' | 'tomorrow' | 'tommorow' | 'tommorrow' )
            {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:279:5: ( 'tomorow' | 'tomorrow' | 'tommorow' | 'tommorrow' )
            int alt55=4;
            switch ( input.LA(1) ) {
            case 154:
                {
                alt55=1;
                }
                break;
            case 155:
                {
                alt55=2;
                }
                break;
            case 156:
                {
                alt55=3;
                }
                break;
            case 157:
                {
                alt55=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:279:6: 'tomorow'
                    {
                    string_literal213=(Token)match(input,154,FOLLOW_154_in_tomorrow3371);  
                    stream_154.add(string_literal213);


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:279:18: 'tomorrow'
                    {
                    string_literal214=(Token)match(input,155,FOLLOW_155_in_tomorrow3375);  
                    stream_155.add(string_literal214);


                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:279:31: 'tommorow'
                    {
                    string_literal215=(Token)match(input,156,FOLLOW_156_in_tomorrow3379);  
                    stream_156.add(string_literal215);


                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:279:44: 'tommorrow'
                    {
                    string_literal216=(Token)match(input,157,FOLLOW_157_in_tomorrow3383);  
                    stream_157.add(string_literal216);


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
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 280:5: -> ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"1\"] )
            {
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:280:8: ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"1\"] )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                adaptor.addChild(root_1, (Object)adaptor.create(SEEK_DIRECTION, ">"));
                adaptor.addChild(root_1, (Object)adaptor.create(INTEGER, "1"));

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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

    public static class time_identifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "time_identifier"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:284:1: time_identifier : ( 'midnight' -> ^( EXPLICIT_TIME INTEGER[\"12\"] INTEGER[\"0\"] AM_PM[\"am\"] ) | 'noon' -> ^( EXPLICIT_TIME INTEGER[\"12\"] INTEGER[\"0\"] AM_PM[\"pm\"] ) );
    public final DateParser.time_identifier_return time_identifier() throws RecognitionException {
        DateParser.time_identifier_return retval = new DateParser.time_identifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal217=null;
        Token string_literal218=null;

        Object string_literal217_tree=null;
        Object string_literal218_tree=null;
        RewriteRuleTokenStream stream_159=new RewriteRuleTokenStream(adaptor,"token 159");
        RewriteRuleTokenStream stream_158=new RewriteRuleTokenStream(adaptor,"token 158");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:285:3: ( 'midnight' -> ^( EXPLICIT_TIME INTEGER[\"12\"] INTEGER[\"0\"] AM_PM[\"am\"] ) | 'noon' -> ^( EXPLICIT_TIME INTEGER[\"12\"] INTEGER[\"0\"] AM_PM[\"pm\"] ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==158) ) {
                alt56=1;
            }
            else if ( (LA56_0==159) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:285:5: 'midnight'
                    {
                    string_literal217=(Token)match(input,158,FOLLOW_158_in_time_identifier3415);  
                    stream_158.add(string_literal217);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 285:16: -> ^( EXPLICIT_TIME INTEGER[\"12\"] INTEGER[\"0\"] AM_PM[\"am\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:285:19: ^( EXPLICIT_TIME INTEGER[\"12\"] INTEGER[\"0\"] AM_PM[\"am\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INTEGER, "12"));
                        adaptor.addChild(root_1, (Object)adaptor.create(INTEGER, "0"));
                        adaptor.addChild(root_1, (Object)adaptor.create(AM_PM, "am"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:286:5: 'noon'
                    {
                    string_literal218=(Token)match(input,159,FOLLOW_159_in_time_identifier3436);  
                    stream_159.add(string_literal218);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 286:12: -> ^( EXPLICIT_TIME INTEGER[\"12\"] INTEGER[\"0\"] AM_PM[\"pm\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:286:15: ^( EXPLICIT_TIME INTEGER[\"12\"] INTEGER[\"0\"] AM_PM[\"pm\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INTEGER, "12"));
                        adaptor.addChild(root_1, (Object)adaptor.create(INTEGER, "0"));
                        adaptor.addChild(root_1, (Object)adaptor.create(AM_PM, "pm"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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

    public static class numeric_day_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numeric_day"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:290:1: numeric_day : ( ONE_TO_TWELVE -> DAY_OF_MONTH[$ONE_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_FOUR -> DAY_OF_MONTH[$THIRTEEN_TO_TWENTY_FOUR.text] | TWENTY_FIVE_TO_THIRTY_ONE -> DAY_OF_MONTH[$TWENTY_FIVE_TO_THIRTY_ONE.text] );
    public final DateParser.numeric_day_return numeric_day() throws RecognitionException {
        DateParser.numeric_day_return retval = new DateParser.numeric_day_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ONE_TO_TWELVE219=null;
        Token THIRTEEN_TO_TWENTY_FOUR220=null;
        Token TWENTY_FIVE_TO_THIRTY_ONE221=null;

        Object ONE_TO_TWELVE219_tree=null;
        Object THIRTEEN_TO_TWENTY_FOUR220_tree=null;
        Object TWENTY_FIVE_TO_THIRTY_ONE221_tree=null;
        RewriteRuleTokenStream stream_THIRTEEN_TO_TWENTY_FOUR=new RewriteRuleTokenStream(adaptor,"token THIRTEEN_TO_TWENTY_FOUR");
        RewriteRuleTokenStream stream_ONE_TO_TWELVE=new RewriteRuleTokenStream(adaptor,"token ONE_TO_TWELVE");
        RewriteRuleTokenStream stream_TWENTY_FIVE_TO_THIRTY_ONE=new RewriteRuleTokenStream(adaptor,"token TWENTY_FIVE_TO_THIRTY_ONE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:291:3: ( ONE_TO_TWELVE -> DAY_OF_MONTH[$ONE_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_FOUR -> DAY_OF_MONTH[$THIRTEEN_TO_TWENTY_FOUR.text] | TWENTY_FIVE_TO_THIRTY_ONE -> DAY_OF_MONTH[$TWENTY_FIVE_TO_THIRTY_ONE.text] )
            int alt57=3;
            switch ( input.LA(1) ) {
            case ONE_TO_TWELVE:
                {
                alt57=1;
                }
                break;
            case THIRTEEN_TO_TWENTY_FOUR:
                {
                alt57=2;
                }
                break;
            case TWENTY_FIVE_TO_THIRTY_ONE:
                {
                alt57=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:291:5: ONE_TO_TWELVE
                    {
                    ONE_TO_TWELVE219=(Token)match(input,ONE_TO_TWELVE,FOLLOW_ONE_TO_TWELVE_in_numeric_day3465);  
                    stream_ONE_TO_TWELVE.add(ONE_TO_TWELVE219);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 291:31: -> DAY_OF_MONTH[$ONE_TO_TWELVE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, (ONE_TO_TWELVE219!=null?ONE_TO_TWELVE219.getText():null)));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:292:5: THIRTEEN_TO_TWENTY_FOUR
                    {
                    THIRTEEN_TO_TWENTY_FOUR220=(Token)match(input,THIRTEEN_TO_TWENTY_FOUR,FOLLOW_THIRTEEN_TO_TWENTY_FOUR_in_numeric_day3488);  
                    stream_THIRTEEN_TO_TWENTY_FOUR.add(THIRTEEN_TO_TWENTY_FOUR220);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 292:31: -> DAY_OF_MONTH[$THIRTEEN_TO_TWENTY_FOUR.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, (THIRTEEN_TO_TWENTY_FOUR220!=null?THIRTEEN_TO_TWENTY_FOUR220.getText():null)));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:293:5: TWENTY_FIVE_TO_THIRTY_ONE
                    {
                    TWENTY_FIVE_TO_THIRTY_ONE221=(Token)match(input,TWENTY_FIVE_TO_THIRTY_ONE,FOLLOW_TWENTY_FIVE_TO_THIRTY_ONE_in_numeric_day3501);  
                    stream_TWENTY_FIVE_TO_THIRTY_ONE.add(TWENTY_FIVE_TO_THIRTY_ONE221);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 293:31: -> DAY_OF_MONTH[$TWENTY_FIVE_TO_THIRTY_ONE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_MONTH, (TWENTY_FIVE_TO_THIRTY_ONE221!=null?TWENTY_FIVE_TO_THIRTY_ONE221.getText():null)));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "numeric_day"

    public static class numeric_month_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numeric_month"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:297:1: numeric_month : ONE_TO_TWELVE -> MONTH[$ONE_TO_TWELVE.text] ;
    public final DateParser.numeric_month_return numeric_month() throws RecognitionException {
        DateParser.numeric_month_return retval = new DateParser.numeric_month_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ONE_TO_TWELVE222=null;

        Object ONE_TO_TWELVE222_tree=null;
        RewriteRuleTokenStream stream_ONE_TO_TWELVE=new RewriteRuleTokenStream(adaptor,"token ONE_TO_TWELVE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:298:3: ( ONE_TO_TWELVE -> MONTH[$ONE_TO_TWELVE.text] )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:298:5: ONE_TO_TWELVE
            {
            ONE_TO_TWELVE222=(Token)match(input,ONE_TO_TWELVE,FOLLOW_ONE_TO_TWELVE_in_numeric_month3520);  
            stream_ONE_TO_TWELVE.add(ONE_TO_TWELVE222);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 298:19: -> MONTH[$ONE_TO_TWELVE.text]
            {
                adaptor.addChild(root_0, (Object)adaptor.create(MONTH, (ONE_TO_TWELVE222!=null?ONE_TO_TWELVE222.getText():null)));

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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

    public static class numeric_year_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numeric_year"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:304:1: numeric_year : ( ( '\\'' )? up_to_two_digits -> YEAR[$up_to_two_digits.text] | ( 'in' 'the' YEAR_DATE_SPAN )? up_to_four_digits ( era )? -> YEAR[$up_to_four_digits.text] ( era )? );
    public final DateParser.numeric_year_return numeric_year() throws RecognitionException {
        DateParser.numeric_year_return retval = new DateParser.numeric_year_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal223=null;
        Token string_literal225=null;
        Token string_literal226=null;
        Token YEAR_DATE_SPAN227=null;
        DateParser.up_to_two_digits_return up_to_two_digits224 = null;

        DateParser.up_to_four_digits_return up_to_four_digits228 = null;

        DateParser.era_return era229 = null;


        Object char_literal223_tree=null;
        Object string_literal225_tree=null;
        Object string_literal226_tree=null;
        Object YEAR_DATE_SPAN227_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleTokenStream stream_YEAR_DATE_SPAN=new RewriteRuleTokenStream(adaptor,"token YEAR_DATE_SPAN");
        RewriteRuleTokenStream stream_160=new RewriteRuleTokenStream(adaptor,"token 160");
        RewriteRuleSubtreeStream stream_up_to_four_digits=new RewriteRuleSubtreeStream(adaptor,"rule up_to_four_digits");
        RewriteRuleSubtreeStream stream_era=new RewriteRuleSubtreeStream(adaptor,"rule era");
        RewriteRuleSubtreeStream stream_up_to_two_digits=new RewriteRuleSubtreeStream(adaptor,"rule up_to_two_digits");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:305:3: ( ( '\\'' )? up_to_two_digits -> YEAR[$up_to_two_digits.text] | ( 'in' 'the' YEAR_DATE_SPAN )? up_to_four_digits ( era )? -> YEAR[$up_to_four_digits.text] ( era )? )
            int alt61=2;
            switch ( input.LA(1) ) {
            case 160:
                {
                alt61=1;
                }
                break;
            case TWO_ZEROS:
                {
                alt61=1;
                }
                break;
            case ONE_TO_TWELVE:
                {
                alt61=1;
                }
                break;
            case THIRTEEN_TO_TWENTY_FOUR:
                {
                alt61=1;
                }
                break;
            case TWENTY_FIVE_TO_THIRTY_ONE:
                {
                alt61=1;
                }
                break;
            case THIRTY_TWO_TO_FIFTY_NINE:
                {
                alt61=1;
                }
                break;
            case SIXTY_TO_NINETY_NINE:
                {
                alt61=1;
                }
                break;
            case THREE_DIGITS:
            case FOUR_DIGITS:
            case 48:
                {
                alt61=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:305:5: ( '\\'' )? up_to_two_digits
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:305:5: ( '\\'' )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==160) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:305:5: '\\''
                            {
                            char_literal223=(Token)match(input,160,FOLLOW_160_in_numeric_year3543);  
                            stream_160.add(char_literal223);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_up_to_two_digits_in_numeric_year3546);
                    up_to_two_digits224=up_to_two_digits();

                    state._fsp--;

                    stream_up_to_two_digits.add(up_to_two_digits224.getTree());


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 305:57: -> YEAR[$up_to_two_digits.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(YEAR, (up_to_two_digits224!=null?input.toString(up_to_two_digits224.start,up_to_two_digits224.stop):null)));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:306:5: ( 'in' 'the' YEAR_DATE_SPAN )? up_to_four_digits ( era )?
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:306:5: ( 'in' 'the' YEAR_DATE_SPAN )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==48) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:306:6: 'in' 'the' YEAR_DATE_SPAN
                            {
                            string_literal225=(Token)match(input,48,FOLLOW_48_in_numeric_year3587);  
                            stream_48.add(string_literal225);

                            string_literal226=(Token)match(input,151,FOLLOW_151_in_numeric_year3589);  
                            stream_151.add(string_literal226);

                            YEAR_DATE_SPAN227=(Token)match(input,YEAR_DATE_SPAN,FOLLOW_YEAR_DATE_SPAN_in_numeric_year3591);  
                            stream_YEAR_DATE_SPAN.add(YEAR_DATE_SPAN227);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_up_to_four_digits_in_numeric_year3595);
                    up_to_four_digits228=up_to_four_digits();

                    state._fsp--;

                    stream_up_to_four_digits.add(up_to_four_digits228.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:306:52: ( era )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( ((LA60_0>=161 && LA60_0<=164)) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:306:52: era
                            {
                            pushFollow(FOLLOW_era_in_numeric_year3597);
                            era229=era();

                            state._fsp--;

                            stream_era.add(era229.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: era
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 306:57: -> YEAR[$up_to_four_digits.text] ( era )?
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(YEAR, (up_to_four_digits228!=null?input.toString(up_to_four_digits228.start,up_to_four_digits228.stop):null)));
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:306:90: ( era )?
                        if ( stream_era.hasNext() ) {
                            adaptor.addChild(root_0, stream_era.nextTree());

                        }
                        stream_era.reset();

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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

    public static class era_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "era"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:309:1: era : ( 'ad' -> ERA[\"ad\"] | 'a.d.' -> ERA[\"ad\"] | 'bc' -> ERA[\"bc\"] | 'b.c.' -> ERA[\"bc\"] );
    public final DateParser.era_return era() throws RecognitionException {
        DateParser.era_return retval = new DateParser.era_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal230=null;
        Token string_literal231=null;
        Token string_literal232=null;
        Token string_literal233=null;

        Object string_literal230_tree=null;
        Object string_literal231_tree=null;
        Object string_literal232_tree=null;
        Object string_literal233_tree=null;
        RewriteRuleTokenStream stream_161=new RewriteRuleTokenStream(adaptor,"token 161");
        RewriteRuleTokenStream stream_162=new RewriteRuleTokenStream(adaptor,"token 162");
        RewriteRuleTokenStream stream_163=new RewriteRuleTokenStream(adaptor,"token 163");
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:310:3: ( 'ad' -> ERA[\"ad\"] | 'a.d.' -> ERA[\"ad\"] | 'bc' -> ERA[\"bc\"] | 'b.c.' -> ERA[\"bc\"] )
            int alt62=4;
            switch ( input.LA(1) ) {
            case 161:
                {
                alt62=1;
                }
                break;
            case 162:
                {
                alt62=2;
                }
                break;
            case 163:
                {
                alt62=3;
                }
                break;
            case 164:
                {
                alt62=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:310:5: 'ad'
                    {
                    string_literal230=(Token)match(input,161,FOLLOW_161_in_era3619);  
                    stream_161.add(string_literal230);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 310:10: -> ERA[\"ad\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(ERA, "ad"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:311:5: 'a.d.'
                    {
                    string_literal231=(Token)match(input,162,FOLLOW_162_in_era3630);  
                    stream_162.add(string_literal231);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 311:12: -> ERA[\"ad\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(ERA, "ad"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:312:5: 'bc'
                    {
                    string_literal232=(Token)match(input,163,FOLLOW_163_in_era3641);  
                    stream_163.add(string_literal232);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 312:10: -> ERA[\"bc\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(ERA, "bc"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:313:5: 'b.c.'
                    {
                    string_literal233=(Token)match(input,164,FOLLOW_164_in_era3652);  
                    stream_164.add(string_literal233);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 313:12: -> ERA[\"bc\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(ERA, "bc"));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "era"

    public static class hours_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "hours"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:316:1: hours : ( TWO_ZEROS -> INTEGER[$TWO_ZEROS.text] | ONE_TO_TWELVE -> INTEGER[$ONE_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_FOUR -> INTEGER[$THIRTEEN_TO_TWENTY_FOUR.text] );
    public final DateParser.hours_return hours() throws RecognitionException {
        DateParser.hours_return retval = new DateParser.hours_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TWO_ZEROS234=null;
        Token ONE_TO_TWELVE235=null;
        Token THIRTEEN_TO_TWENTY_FOUR236=null;

        Object TWO_ZEROS234_tree=null;
        Object ONE_TO_TWELVE235_tree=null;
        Object THIRTEEN_TO_TWENTY_FOUR236_tree=null;
        RewriteRuleTokenStream stream_TWO_ZEROS=new RewriteRuleTokenStream(adaptor,"token TWO_ZEROS");
        RewriteRuleTokenStream stream_THIRTEEN_TO_TWENTY_FOUR=new RewriteRuleTokenStream(adaptor,"token THIRTEEN_TO_TWENTY_FOUR");
        RewriteRuleTokenStream stream_ONE_TO_TWELVE=new RewriteRuleTokenStream(adaptor,"token ONE_TO_TWELVE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:317:3: ( TWO_ZEROS -> INTEGER[$TWO_ZEROS.text] | ONE_TO_TWELVE -> INTEGER[$ONE_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_FOUR -> INTEGER[$THIRTEEN_TO_TWENTY_FOUR.text] )
            int alt63=3;
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
            case THIRTEEN_TO_TWENTY_FOUR:
                {
                alt63=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:317:5: TWO_ZEROS
                    {
                    TWO_ZEROS234=(Token)match(input,TWO_ZEROS,FOLLOW_TWO_ZEROS_in_hours3672);  
                    stream_TWO_ZEROS.add(TWO_ZEROS234);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 317:15: -> INTEGER[$TWO_ZEROS.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (TWO_ZEROS234!=null?TWO_ZEROS234.getText():null)));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:318:5: ONE_TO_TWELVE
                    {
                    ONE_TO_TWELVE235=(Token)match(input,ONE_TO_TWELVE,FOLLOW_ONE_TO_TWELVE_in_hours3683);  
                    stream_ONE_TO_TWELVE.add(ONE_TO_TWELVE235);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 318:19: -> INTEGER[$ONE_TO_TWELVE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (ONE_TO_TWELVE235!=null?ONE_TO_TWELVE235.getText():null)));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:319:5: THIRTEEN_TO_TWENTY_FOUR
                    {
                    THIRTEEN_TO_TWENTY_FOUR236=(Token)match(input,THIRTEEN_TO_TWENTY_FOUR,FOLLOW_THIRTEEN_TO_TWENTY_FOUR_in_hours3694);  
                    stream_THIRTEEN_TO_TWENTY_FOUR.add(THIRTEEN_TO_TWENTY_FOUR236);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 319:29: -> INTEGER[$THIRTEEN_TO_TWENTY_FOUR.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (THIRTEEN_TO_TWENTY_FOUR236!=null?THIRTEEN_TO_TWENTY_FOUR236.getText():null)));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:322:1: minutes : ( TWO_ZEROS -> INTEGER[\"0\"] | ONE_TO_TWELVE -> INTEGER[$ONE_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_FOUR -> INTEGER[$THIRTEEN_TO_TWENTY_FOUR.text] | TWENTY_FIVE_TO_THIRTY_ONE -> INTEGER[$TWENTY_FIVE_TO_THIRTY_ONE.text] | THIRTY_TWO_TO_FIFTY_NINE -> INTEGER[$THIRTY_TWO_TO_FIFTY_NINE.text] );
    public final DateParser.minutes_return minutes() throws RecognitionException {
        DateParser.minutes_return retval = new DateParser.minutes_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TWO_ZEROS237=null;
        Token ONE_TO_TWELVE238=null;
        Token THIRTEEN_TO_TWENTY_FOUR239=null;
        Token TWENTY_FIVE_TO_THIRTY_ONE240=null;
        Token THIRTY_TWO_TO_FIFTY_NINE241=null;

        Object TWO_ZEROS237_tree=null;
        Object ONE_TO_TWELVE238_tree=null;
        Object THIRTEEN_TO_TWENTY_FOUR239_tree=null;
        Object TWENTY_FIVE_TO_THIRTY_ONE240_tree=null;
        Object THIRTY_TWO_TO_FIFTY_NINE241_tree=null;
        RewriteRuleTokenStream stream_TWO_ZEROS=new RewriteRuleTokenStream(adaptor,"token TWO_ZEROS");
        RewriteRuleTokenStream stream_THIRTEEN_TO_TWENTY_FOUR=new RewriteRuleTokenStream(adaptor,"token THIRTEEN_TO_TWENTY_FOUR");
        RewriteRuleTokenStream stream_ONE_TO_TWELVE=new RewriteRuleTokenStream(adaptor,"token ONE_TO_TWELVE");
        RewriteRuleTokenStream stream_THIRTY_TWO_TO_FIFTY_NINE=new RewriteRuleTokenStream(adaptor,"token THIRTY_TWO_TO_FIFTY_NINE");
        RewriteRuleTokenStream stream_TWENTY_FIVE_TO_THIRTY_ONE=new RewriteRuleTokenStream(adaptor,"token TWENTY_FIVE_TO_THIRTY_ONE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:323:3: ( TWO_ZEROS -> INTEGER[\"0\"] | ONE_TO_TWELVE -> INTEGER[$ONE_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_FOUR -> INTEGER[$THIRTEEN_TO_TWENTY_FOUR.text] | TWENTY_FIVE_TO_THIRTY_ONE -> INTEGER[$TWENTY_FIVE_TO_THIRTY_ONE.text] | THIRTY_TWO_TO_FIFTY_NINE -> INTEGER[$THIRTY_TWO_TO_FIFTY_NINE.text] )
            int alt64=5;
            switch ( input.LA(1) ) {
            case TWO_ZEROS:
                {
                alt64=1;
                }
                break;
            case ONE_TO_TWELVE:
                {
                alt64=2;
                }
                break;
            case THIRTEEN_TO_TWENTY_FOUR:
                {
                alt64=3;
                }
                break;
            case TWENTY_FIVE_TO_THIRTY_ONE:
                {
                alt64=4;
                }
                break;
            case THIRTY_TWO_TO_FIFTY_NINE:
                {
                alt64=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:323:5: TWO_ZEROS
                    {
                    TWO_ZEROS237=(Token)match(input,TWO_ZEROS,FOLLOW_TWO_ZEROS_in_minutes3714);  
                    stream_TWO_ZEROS.add(TWO_ZEROS237);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 323:31: -> INTEGER[\"0\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "0"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:324:5: ONE_TO_TWELVE
                    {
                    ONE_TO_TWELVE238=(Token)match(input,ONE_TO_TWELVE,FOLLOW_ONE_TO_TWELVE_in_minutes3741);  
                    stream_ONE_TO_TWELVE.add(ONE_TO_TWELVE238);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 324:31: -> INTEGER[$ONE_TO_TWELVE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (ONE_TO_TWELVE238!=null?ONE_TO_TWELVE238.getText():null)));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:325:5: THIRTEEN_TO_TWENTY_FOUR
                    {
                    THIRTEEN_TO_TWENTY_FOUR239=(Token)match(input,THIRTEEN_TO_TWENTY_FOUR,FOLLOW_THIRTEEN_TO_TWENTY_FOUR_in_minutes3764);  
                    stream_THIRTEEN_TO_TWENTY_FOUR.add(THIRTEEN_TO_TWENTY_FOUR239);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 325:31: -> INTEGER[$THIRTEEN_TO_TWENTY_FOUR.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (THIRTEEN_TO_TWENTY_FOUR239!=null?THIRTEEN_TO_TWENTY_FOUR239.getText():null)));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:326:5: TWENTY_FIVE_TO_THIRTY_ONE
                    {
                    TWENTY_FIVE_TO_THIRTY_ONE240=(Token)match(input,TWENTY_FIVE_TO_THIRTY_ONE,FOLLOW_TWENTY_FIVE_TO_THIRTY_ONE_in_minutes3777);  
                    stream_TWENTY_FIVE_TO_THIRTY_ONE.add(TWENTY_FIVE_TO_THIRTY_ONE240);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 326:31: -> INTEGER[$TWENTY_FIVE_TO_THIRTY_ONE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (TWENTY_FIVE_TO_THIRTY_ONE240!=null?TWENTY_FIVE_TO_THIRTY_ONE240.getText():null)));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:327:5: THIRTY_TWO_TO_FIFTY_NINE
                    {
                    THIRTY_TWO_TO_FIFTY_NINE241=(Token)match(input,THIRTY_TWO_TO_FIFTY_NINE,FOLLOW_THIRTY_TWO_TO_FIFTY_NINE_in_minutes3788);  
                    stream_THIRTY_TWO_TO_FIFTY_NINE.add(THIRTY_TWO_TO_FIFTY_NINE241);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 327:31: -> INTEGER[$THIRTY_TWO_TO_FIFTY_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (THIRTY_TWO_TO_FIFTY_NINE241!=null?THIRTY_TWO_TO_FIFTY_NINE241.getText():null)));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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

    public static class up_to_two_digits_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "up_to_two_digits"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:331:1: up_to_two_digits : ( TWO_ZEROS -> INTEGER[$TWO_ZEROS.text] | ONE_TO_TWELVE -> INTEGER[$ONE_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_FOUR -> INTEGER[$THIRTEEN_TO_TWENTY_FOUR.text] | TWENTY_FIVE_TO_THIRTY_ONE -> INTEGER[$TWENTY_FIVE_TO_THIRTY_ONE.text] | THIRTY_TWO_TO_FIFTY_NINE -> INTEGER[$THIRTY_TWO_TO_FIFTY_NINE.text] | SIXTY_TO_NINETY_NINE -> INTEGER[$SIXTY_TO_NINETY_NINE.text] );
    public final DateParser.up_to_two_digits_return up_to_two_digits() throws RecognitionException {
        DateParser.up_to_two_digits_return retval = new DateParser.up_to_two_digits_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TWO_ZEROS242=null;
        Token ONE_TO_TWELVE243=null;
        Token THIRTEEN_TO_TWENTY_FOUR244=null;
        Token TWENTY_FIVE_TO_THIRTY_ONE245=null;
        Token THIRTY_TWO_TO_FIFTY_NINE246=null;
        Token SIXTY_TO_NINETY_NINE247=null;

        Object TWO_ZEROS242_tree=null;
        Object ONE_TO_TWELVE243_tree=null;
        Object THIRTEEN_TO_TWENTY_FOUR244_tree=null;
        Object TWENTY_FIVE_TO_THIRTY_ONE245_tree=null;
        Object THIRTY_TWO_TO_FIFTY_NINE246_tree=null;
        Object SIXTY_TO_NINETY_NINE247_tree=null;
        RewriteRuleTokenStream stream_SIXTY_TO_NINETY_NINE=new RewriteRuleTokenStream(adaptor,"token SIXTY_TO_NINETY_NINE");
        RewriteRuleTokenStream stream_TWO_ZEROS=new RewriteRuleTokenStream(adaptor,"token TWO_ZEROS");
        RewriteRuleTokenStream stream_THIRTEEN_TO_TWENTY_FOUR=new RewriteRuleTokenStream(adaptor,"token THIRTEEN_TO_TWENTY_FOUR");
        RewriteRuleTokenStream stream_ONE_TO_TWELVE=new RewriteRuleTokenStream(adaptor,"token ONE_TO_TWELVE");
        RewriteRuleTokenStream stream_THIRTY_TWO_TO_FIFTY_NINE=new RewriteRuleTokenStream(adaptor,"token THIRTY_TWO_TO_FIFTY_NINE");
        RewriteRuleTokenStream stream_TWENTY_FIVE_TO_THIRTY_ONE=new RewriteRuleTokenStream(adaptor,"token TWENTY_FIVE_TO_THIRTY_ONE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:332:3: ( TWO_ZEROS -> INTEGER[$TWO_ZEROS.text] | ONE_TO_TWELVE -> INTEGER[$ONE_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_FOUR -> INTEGER[$THIRTEEN_TO_TWENTY_FOUR.text] | TWENTY_FIVE_TO_THIRTY_ONE -> INTEGER[$TWENTY_FIVE_TO_THIRTY_ONE.text] | THIRTY_TWO_TO_FIFTY_NINE -> INTEGER[$THIRTY_TWO_TO_FIFTY_NINE.text] | SIXTY_TO_NINETY_NINE -> INTEGER[$SIXTY_TO_NINETY_NINE.text] )
            int alt65=6;
            switch ( input.LA(1) ) {
            case TWO_ZEROS:
                {
                alt65=1;
                }
                break;
            case ONE_TO_TWELVE:
                {
                alt65=2;
                }
                break;
            case THIRTEEN_TO_TWENTY_FOUR:
                {
                alt65=3;
                }
                break;
            case TWENTY_FIVE_TO_THIRTY_ONE:
                {
                alt65=4;
                }
                break;
            case THIRTY_TWO_TO_FIFTY_NINE:
                {
                alt65=5;
                }
                break;
            case SIXTY_TO_NINETY_NINE:
                {
                alt65=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:332:5: TWO_ZEROS
                    {
                    TWO_ZEROS242=(Token)match(input,TWO_ZEROS,FOLLOW_TWO_ZEROS_in_up_to_two_digits3810);  
                    stream_TWO_ZEROS.add(TWO_ZEROS242);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 332:31: -> INTEGER[$TWO_ZEROS.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (TWO_ZEROS242!=null?TWO_ZEROS242.getText():null)));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:333:5: ONE_TO_TWELVE
                    {
                    ONE_TO_TWELVE243=(Token)match(input,ONE_TO_TWELVE,FOLLOW_ONE_TO_TWELVE_in_up_to_two_digits3837);  
                    stream_ONE_TO_TWELVE.add(ONE_TO_TWELVE243);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 333:31: -> INTEGER[$ONE_TO_TWELVE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (ONE_TO_TWELVE243!=null?ONE_TO_TWELVE243.getText():null)));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:334:5: THIRTEEN_TO_TWENTY_FOUR
                    {
                    THIRTEEN_TO_TWENTY_FOUR244=(Token)match(input,THIRTEEN_TO_TWENTY_FOUR,FOLLOW_THIRTEEN_TO_TWENTY_FOUR_in_up_to_two_digits3860);  
                    stream_THIRTEEN_TO_TWENTY_FOUR.add(THIRTEEN_TO_TWENTY_FOUR244);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 334:31: -> INTEGER[$THIRTEEN_TO_TWENTY_FOUR.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (THIRTEEN_TO_TWENTY_FOUR244!=null?THIRTEEN_TO_TWENTY_FOUR244.getText():null)));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:335:5: TWENTY_FIVE_TO_THIRTY_ONE
                    {
                    TWENTY_FIVE_TO_THIRTY_ONE245=(Token)match(input,TWENTY_FIVE_TO_THIRTY_ONE,FOLLOW_TWENTY_FIVE_TO_THIRTY_ONE_in_up_to_two_digits3873);  
                    stream_TWENTY_FIVE_TO_THIRTY_ONE.add(TWENTY_FIVE_TO_THIRTY_ONE245);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 335:31: -> INTEGER[$TWENTY_FIVE_TO_THIRTY_ONE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (TWENTY_FIVE_TO_THIRTY_ONE245!=null?TWENTY_FIVE_TO_THIRTY_ONE245.getText():null)));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:336:5: THIRTY_TWO_TO_FIFTY_NINE
                    {
                    THIRTY_TWO_TO_FIFTY_NINE246=(Token)match(input,THIRTY_TWO_TO_FIFTY_NINE,FOLLOW_THIRTY_TWO_TO_FIFTY_NINE_in_up_to_two_digits3884);  
                    stream_THIRTY_TWO_TO_FIFTY_NINE.add(THIRTY_TWO_TO_FIFTY_NINE246);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 336:31: -> INTEGER[$THIRTY_TWO_TO_FIFTY_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (THIRTY_TWO_TO_FIFTY_NINE246!=null?THIRTY_TWO_TO_FIFTY_NINE246.getText():null)));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:337:5: SIXTY_TO_NINETY_NINE
                    {
                    SIXTY_TO_NINETY_NINE247=(Token)match(input,SIXTY_TO_NINETY_NINE,FOLLOW_SIXTY_TO_NINETY_NINE_in_up_to_two_digits3896);  
                    stream_SIXTY_TO_NINETY_NINE.add(SIXTY_TO_NINETY_NINE247);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 337:31: -> INTEGER[$SIXTY_TO_NINETY_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (SIXTY_TO_NINETY_NINE247!=null?SIXTY_TO_NINETY_NINE247.getText():null)));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "up_to_two_digits"

    public static class up_to_four_digits_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "up_to_four_digits"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:340:1: up_to_four_digits : ( up_to_two_digits | THREE_DIGITS -> INTEGER[$THREE_DIGITS.text] | FOUR_DIGITS -> INTEGER[$FOUR_DIGITS.text] );
    public final DateParser.up_to_four_digits_return up_to_four_digits() throws RecognitionException {
        DateParser.up_to_four_digits_return retval = new DateParser.up_to_four_digits_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THREE_DIGITS249=null;
        Token FOUR_DIGITS250=null;
        DateParser.up_to_two_digits_return up_to_two_digits248 = null;


        Object THREE_DIGITS249_tree=null;
        Object FOUR_DIGITS250_tree=null;
        RewriteRuleTokenStream stream_FOUR_DIGITS=new RewriteRuleTokenStream(adaptor,"token FOUR_DIGITS");
        RewriteRuleTokenStream stream_THREE_DIGITS=new RewriteRuleTokenStream(adaptor,"token THREE_DIGITS");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:341:3: ( up_to_two_digits | THREE_DIGITS -> INTEGER[$THREE_DIGITS.text] | FOUR_DIGITS -> INTEGER[$FOUR_DIGITS.text] )
            int alt66=3;
            switch ( input.LA(1) ) {
            case ONE_TO_TWELVE:
            case THIRTEEN_TO_TWENTY_FOUR:
            case TWENTY_FIVE_TO_THIRTY_ONE:
            case TWO_ZEROS:
            case THIRTY_TWO_TO_FIFTY_NINE:
            case SIXTY_TO_NINETY_NINE:
                {
                alt66=1;
                }
                break;
            case THREE_DIGITS:
                {
                alt66=2;
                }
                break;
            case FOUR_DIGITS:
                {
                alt66=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:341:5: up_to_two_digits
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_up_to_two_digits_in_up_to_four_digits3921);
                    up_to_two_digits248=up_to_two_digits();

                    state._fsp--;

                    adaptor.addChild(root_0, up_to_two_digits248.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:342:5: THREE_DIGITS
                    {
                    THREE_DIGITS249=(Token)match(input,THREE_DIGITS,FOLLOW_THREE_DIGITS_in_up_to_four_digits3927);  
                    stream_THREE_DIGITS.add(THREE_DIGITS249);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 342:18: -> INTEGER[$THREE_DIGITS.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (THREE_DIGITS249!=null?THREE_DIGITS249.getText():null)));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:343:5: FOUR_DIGITS
                    {
                    FOUR_DIGITS250=(Token)match(input,FOUR_DIGITS,FOLLOW_FOUR_DIGITS_in_up_to_four_digits3938);  
                    stream_FOUR_DIGITS.add(FOUR_DIGITS250);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 343:18: -> INTEGER[$FOUR_DIGITS.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (FOUR_DIGITS250!=null?FOUR_DIGITS250.getText():null)));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "up_to_four_digits"

    public static class number_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "number"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:346:1: number : ( up_to_four_digits -> INTEGER[$up_to_four_digits.text] | digits= ( DIGIT DIGIT DIGIT ( DIGIT )+ ) -> INTEGER[$digits.text] | number_string );
    public final DateParser.number_return number() throws RecognitionException {
        DateParser.number_return retval = new DateParser.number_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token digits=null;
        Token DIGIT252=null;
        Token DIGIT253=null;
        Token DIGIT254=null;
        Token DIGIT255=null;
        DateParser.up_to_four_digits_return up_to_four_digits251 = null;

        DateParser.number_string_return number_string256 = null;


        Object digits_tree=null;
        Object DIGIT252_tree=null;
        Object DIGIT253_tree=null;
        Object DIGIT254_tree=null;
        Object DIGIT255_tree=null;
        RewriteRuleTokenStream stream_DIGIT=new RewriteRuleTokenStream(adaptor,"token DIGIT");
        RewriteRuleSubtreeStream stream_up_to_four_digits=new RewriteRuleSubtreeStream(adaptor,"rule up_to_four_digits");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:347:3: ( up_to_four_digits -> INTEGER[$up_to_four_digits.text] | digits= ( DIGIT DIGIT DIGIT ( DIGIT )+ ) -> INTEGER[$digits.text] | number_string )
            int alt68=3;
            switch ( input.LA(1) ) {
            case ONE_TO_TWELVE:
            case THIRTEEN_TO_TWENTY_FOUR:
            case TWENTY_FIVE_TO_THIRTY_ONE:
            case TWO_ZEROS:
            case THIRTY_TWO_TO_FIFTY_NINE:
            case SIXTY_TO_NINETY_NINE:
            case THREE_DIGITS:
            case FOUR_DIGITS:
                {
                alt68=1;
                }
                break;
            case DIGIT:
                {
                alt68=2;
                }
                break;
            case 112:
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
            case 182:
            case 183:
                {
                alt68=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:347:5: up_to_four_digits
                    {
                    pushFollow(FOLLOW_up_to_four_digits_in_number3959);
                    up_to_four_digits251=up_to_four_digits();

                    state._fsp--;

                    stream_up_to_four_digits.add(up_to_four_digits251.getTree());


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 347:39: -> INTEGER[$up_to_four_digits.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (up_to_four_digits251!=null?input.toString(up_to_four_digits251.start,up_to_four_digits251.stop):null)));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:348:5: digits= ( DIGIT DIGIT DIGIT ( DIGIT )+ )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:348:12: ( DIGIT DIGIT DIGIT ( DIGIT )+ )
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:348:13: DIGIT DIGIT DIGIT ( DIGIT )+
                    {
                    DIGIT252=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_number3989);  
                    stream_DIGIT.add(DIGIT252);

                    DIGIT253=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_number3991);  
                    stream_DIGIT.add(DIGIT253);

                    DIGIT254=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_number3993);  
                    stream_DIGIT.add(DIGIT254);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:348:31: ( DIGIT )+
                    int cnt67=0;
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==DIGIT) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:348:31: DIGIT
                    	    {
                    	    DIGIT255=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_number3995);  
                    	    stream_DIGIT.add(DIGIT255);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt67 >= 1 ) break loop67;
                                EarlyExitException eee =
                                    new EarlyExitException(67, input);
                                throw eee;
                        }
                        cnt67++;
                    } while (true);


                    }



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 348:39: -> INTEGER[$digits.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (digits!=null?digits.getText():null)));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:349:5: number_string
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_number_string_in_number4008);
                    number_string256=number_string();

                    state._fsp--;

                    adaptor.addChild(root_0, number_string256.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "number"

    public static class number_string_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "number_string"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:352:1: number_string : ( 'one' -> INTEGER[\"1\"] | 'two' -> INTEGER[\"2\"] | 'three' -> INTEGER[\"3\"] | 'four' -> INTEGER[\"4\"] | 'five' -> INTEGER[\"5\"] | 'six' -> INTEGER[\"6\"] | 'seven' -> INTEGER[\"7\"] | 'eight' -> INTEGER[\"8\"] | 'nine' -> INTEGER[\"9\"] | 'ten' -> INTEGER[\"10\"] | 'eleven' -> INTEGER[\"11\"] | 'twelve' -> INTEGER[\"12\"] | 'thirteen' -> INTEGER[\"13\"] | 'fourteen' -> INTEGER[\"14\"] | 'fifteen' -> INTEGER[\"15\"] | 'sixteen' -> INTEGER[\"16\"] | 'seventeen' -> INTEGER[\"17\"] | 'eighteen' -> INTEGER[\"18\"] | 'nineteen' -> INTEGER[\"19\"] | 'twenty' -> INTEGER[\"20\"] );
    public final DateParser.number_string_return number_string() throws RecognitionException {
        DateParser.number_string_return retval = new DateParser.number_string_return();
        retval.start = input.LT(1);

        Object root_0 = null;

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
        Token string_literal271=null;
        Token string_literal272=null;
        Token string_literal273=null;
        Token string_literal274=null;
        Token string_literal275=null;
        Token string_literal276=null;

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
        Object string_literal271_tree=null;
        Object string_literal272_tree=null;
        Object string_literal273_tree=null;
        Object string_literal274_tree=null;
        Object string_literal275_tree=null;
        Object string_literal276_tree=null;
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
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
        RewriteRuleTokenStream stream_182=new RewriteRuleTokenStream(adaptor,"token 182");
        RewriteRuleTokenStream stream_183=new RewriteRuleTokenStream(adaptor,"token 183");
        RewriteRuleTokenStream stream_174=new RewriteRuleTokenStream(adaptor,"token 174");
        RewriteRuleTokenStream stream_175=new RewriteRuleTokenStream(adaptor,"token 175");
        RewriteRuleTokenStream stream_172=new RewriteRuleTokenStream(adaptor,"token 172");
        RewriteRuleTokenStream stream_173=new RewriteRuleTokenStream(adaptor,"token 173");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:353:3: ( 'one' -> INTEGER[\"1\"] | 'two' -> INTEGER[\"2\"] | 'three' -> INTEGER[\"3\"] | 'four' -> INTEGER[\"4\"] | 'five' -> INTEGER[\"5\"] | 'six' -> INTEGER[\"6\"] | 'seven' -> INTEGER[\"7\"] | 'eight' -> INTEGER[\"8\"] | 'nine' -> INTEGER[\"9\"] | 'ten' -> INTEGER[\"10\"] | 'eleven' -> INTEGER[\"11\"] | 'twelve' -> INTEGER[\"12\"] | 'thirteen' -> INTEGER[\"13\"] | 'fourteen' -> INTEGER[\"14\"] | 'fifteen' -> INTEGER[\"15\"] | 'sixteen' -> INTEGER[\"16\"] | 'seventeen' -> INTEGER[\"17\"] | 'eighteen' -> INTEGER[\"18\"] | 'nineteen' -> INTEGER[\"19\"] | 'twenty' -> INTEGER[\"20\"] )
            int alt69=20;
            switch ( input.LA(1) ) {
            case 165:
                {
                alt69=1;
                }
                break;
            case 166:
                {
                alt69=2;
                }
                break;
            case 167:
                {
                alt69=3;
                }
                break;
            case 168:
                {
                alt69=4;
                }
                break;
            case 169:
                {
                alt69=5;
                }
                break;
            case 170:
                {
                alt69=6;
                }
                break;
            case 171:
                {
                alt69=7;
                }
                break;
            case 172:
                {
                alt69=8;
                }
                break;
            case 173:
                {
                alt69=9;
                }
                break;
            case 174:
                {
                alt69=10;
                }
                break;
            case 175:
                {
                alt69=11;
                }
                break;
            case 176:
                {
                alt69=12;
                }
                break;
            case 177:
                {
                alt69=13;
                }
                break;
            case 178:
                {
                alt69=14;
                }
                break;
            case 179:
                {
                alt69=15;
                }
                break;
            case 180:
                {
                alt69=16;
                }
                break;
            case 181:
                {
                alt69=17;
                }
                break;
            case 182:
                {
                alt69=18;
                }
                break;
            case 183:
                {
                alt69=19;
                }
                break;
            case 112:
                {
                alt69=20;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:353:5: 'one'
                    {
                    string_literal257=(Token)match(input,165,FOLLOW_165_in_number_string4024);  
                    stream_165.add(string_literal257);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 353:17: -> INTEGER[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "1"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:354:5: 'two'
                    {
                    string_literal258=(Token)match(input,166,FOLLOW_166_in_number_string4041);  
                    stream_166.add(string_literal258);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 354:17: -> INTEGER[\"2\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "2"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:355:5: 'three'
                    {
                    string_literal259=(Token)match(input,167,FOLLOW_167_in_number_string4058);  
                    stream_167.add(string_literal259);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 355:17: -> INTEGER[\"3\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "3"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:356:5: 'four'
                    {
                    string_literal260=(Token)match(input,168,FOLLOW_168_in_number_string4073);  
                    stream_168.add(string_literal260);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 356:17: -> INTEGER[\"4\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "4"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:357:5: 'five'
                    {
                    string_literal261=(Token)match(input,169,FOLLOW_169_in_number_string4089);  
                    stream_169.add(string_literal261);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 357:17: -> INTEGER[\"5\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "5"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:358:5: 'six'
                    {
                    string_literal262=(Token)match(input,170,FOLLOW_170_in_number_string4105);  
                    stream_170.add(string_literal262);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 358:17: -> INTEGER[\"6\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "6"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:359:5: 'seven'
                    {
                    string_literal263=(Token)match(input,171,FOLLOW_171_in_number_string4122);  
                    stream_171.add(string_literal263);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 359:17: -> INTEGER[\"7\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "7"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:360:5: 'eight'
                    {
                    string_literal264=(Token)match(input,172,FOLLOW_172_in_number_string4137);  
                    stream_172.add(string_literal264);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 360:17: -> INTEGER[\"8\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "8"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 9 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:361:5: 'nine'
                    {
                    string_literal265=(Token)match(input,173,FOLLOW_173_in_number_string4152);  
                    stream_173.add(string_literal265);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 361:17: -> INTEGER[\"9\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "9"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 10 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:362:5: 'ten'
                    {
                    string_literal266=(Token)match(input,174,FOLLOW_174_in_number_string4168);  
                    stream_174.add(string_literal266);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 362:17: -> INTEGER[\"10\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "10"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 11 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:363:5: 'eleven'
                    {
                    string_literal267=(Token)match(input,175,FOLLOW_175_in_number_string4185);  
                    stream_175.add(string_literal267);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 363:17: -> INTEGER[\"11\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "11"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 12 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:364:5: 'twelve'
                    {
                    string_literal268=(Token)match(input,176,FOLLOW_176_in_number_string4199);  
                    stream_176.add(string_literal268);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 364:17: -> INTEGER[\"12\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "12"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 13 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:365:5: 'thirteen'
                    {
                    string_literal269=(Token)match(input,177,FOLLOW_177_in_number_string4213);  
                    stream_177.add(string_literal269);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 365:17: -> INTEGER[\"13\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "13"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 14 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:366:5: 'fourteen'
                    {
                    string_literal270=(Token)match(input,178,FOLLOW_178_in_number_string4225);  
                    stream_178.add(string_literal270);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 366:17: -> INTEGER[\"14\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "14"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 15 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:367:5: 'fifteen'
                    {
                    string_literal271=(Token)match(input,179,FOLLOW_179_in_number_string4237);  
                    stream_179.add(string_literal271);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 367:17: -> INTEGER[\"15\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "15"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 16 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:368:5: 'sixteen'
                    {
                    string_literal272=(Token)match(input,180,FOLLOW_180_in_number_string4250);  
                    stream_180.add(string_literal272);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 368:17: -> INTEGER[\"16\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "16"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 17 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:369:5: 'seventeen'
                    {
                    string_literal273=(Token)match(input,181,FOLLOW_181_in_number_string4263);  
                    stream_181.add(string_literal273);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 369:17: -> INTEGER[\"17\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "17"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 18 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:370:5: 'eighteen'
                    {
                    string_literal274=(Token)match(input,182,FOLLOW_182_in_number_string4274);  
                    stream_182.add(string_literal274);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 370:17: -> INTEGER[\"18\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "18"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 19 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:371:5: 'nineteen'
                    {
                    string_literal275=(Token)match(input,183,FOLLOW_183_in_number_string4286);  
                    stream_183.add(string_literal275);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 371:17: -> INTEGER[\"19\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "19"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 20 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:372:5: 'twenty'
                    {
                    string_literal276=(Token)match(input,112,FOLLOW_112_in_number_string4298);  
                    stream_112.add(string_literal276);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 372:17: -> INTEGER[\"20\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "20"));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "number_string"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA50 dfa50 = new DFA50(this);
    static final String DFA4_eotS =
        "\u01de\uffff";
    static final String DFA4_eofS =
        "\1\uffff\5\u0085\1\uffff\6\6\2\uffff\1\6\157\uffff\6\u0085\35\uffff"+
        "\31\6\51\uffff\50\u014f\1\uffff\13\u014f\1\uffff\1\u014f\13\uffff"+
        "\2\u014f\14\uffff\5\u0085\20\u014f\3\uffff\1\u014f\4\uffff\3\u014f"+
        "\1\uffff\2\u014f\1\uffff\11\u014f\1\uffff\1\u014f\27\u019b\1\uffff"+
        "\6\u0085\14\uffff\12\u019b\1\uffff\1\u019b\4\uffff\3\u019b\1\uffff"+
        "\10\u019b\1\uffff\3\u019b\1\uffff\5\u019b\2\uffff\12\u019b\1\uffff"+
        "\12\u019b\1\uffff\6\u019b\2\uffff\14\u019b";
    static final String DFA4_minS =
        "\1\23\3\22\2\23\1\uffff\6\23\1\u0098\1\u009a\1\23\1\53\5\22\1\23"+
        "\5\22\1\33\24\22\27\110\63\40\1\50\1\40\10\23\1\uffff\25\61\1\23"+
        "\4\50\1\23\1\uffff\31\23\11\22\1\33\24\22\1\33\1\110\11\40\50\23"+
        "\1\50\13\23\1\50\1\23\1\176\1\110\1\40\7\50\1\61\2\23\14\61\26\23"+
        "\2\33\2\23\3\uffff\3\23\1\u0097\2\23\1\110\11\23\1\110\41\23\10"+
        "\50\1\33\1\22\12\23\1\22\2\23\3\uffff\3\23\1\u0097\14\23\1\u0097"+
        "\5\23\1\22\13\23\1\22\12\23\1\22\24\23";
    static final String DFA4_maxS =
        "\6\u00b7\1\uffff\6\u009f\1\u0099\1\u009d\1\u009f\1\57\5\107\1\u00b7"+
        "\5\u00a4\1\33\23\107\1\130\27\175\63\40\1\110\1\40\1\30\1\23\6\u00b7"+
        "\1\uffff\1\64\1\62\2\64\1\62\1\64\1\62\1\64\2\62\1\64\1\62\1\64"+
        "\1\62\2\64\1\62\4\64\1\27\4\51\1\25\1\uffff\31\u009f\1\22\10\107"+
        "\1\33\24\107\1\33\1\130\11\40\50\u00a0\1\130\13\u00a0\1\110\1\u00a0"+
        "\1\u0094\1\110\1\40\7\51\1\62\2\u009f\14\62\5\u00b7\20\u009f\1\32"+
        "\2\33\1\u00a0\1\30\3\uffff\3\u00a4\1\u0097\2\u00a4\1\130\11\u00a0"+
        "\1\110\30\u00a0\1\25\6\u00b7\2\u00a0\10\u00a4\1\33\1\107\12\u009f"+
        "\1\22\1\u00a0\1\30\3\uffff\3\u00a4\1\u0097\2\u00a4\3\u009f\3\u00a4"+
        "\1\30\3\u00a4\1\u0097\5\u00a4\1\107\1\32\12\u009f\1\22\12\u009f"+
        "\1\22\6\u00a4\2\32\14\u00a4";
    static final String DFA4_acceptS =
        "\6\uffff\1\1\176\uffff\1\3\33\uffff\1\2\u00ab\uffff\3\1\111\uffff"+
        "\3\1\102\uffff";
    static final String DFA4_specialS =
        "\u01de\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\2\1\3\1\27\1\1\1\30\1\31\1\32\1\33\1\34\1\uffff\1\6\14\uffff"+
            "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\27\uffff\1\110\1\111\1\112"+
            "\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1\122\1\123\1\124"+
            "\1\125\1\126\1\127\1\130\1\131\1\132\1\133\1\134\1\135\1\136"+
            "\1\137\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\1\150"+
            "\1\151\1\152\1\153\1\154\1\155\1\156\1\157\1\60\1\160\1\161"+
            "\1\162\1\163\1\164\1\165\1\166\1\167\1\170\1\171\1\172\1\173"+
            "\1\174\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73"+
            "\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106"+
            "\1\107\1\7\1\14\1\15\1\16\1\17\1\10\1\11\1\12\1\13\1\4\1\5\1"+
            "\175\4\uffff\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1"+
            "\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57",
            "\1\u009a\11\6\1\uffff\1\6\3\uffff\1\u009b\1\177\1\u0080\1\u0081"+
            "\1\u0082\1\u0083\1\u0084\2\176\7\6\2\uffff\1\u0097\1\uffff\1"+
            "\u0098\1\u0099\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a\1\u008b"+
            "\1\u008c\1\u008d\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093"+
            "\1\u0094\1\u0095\1\u0096\126\6\2\uffff\1\6\1\u009c\1\u009d\1"+
            "\u009e\1\u009f\23\6",
            "\1\u009a\11\6\1\uffff\1\6\3\uffff\1\u009b\1\177\1\u0080\1\u0081"+
            "\1\u0082\1\u0083\1\u0084\2\u00a0\7\6\2\uffff\1\u0097\1\uffff"+
            "\1\u0098\1\u0099\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a\1\u008b"+
            "\1\u008c\1\u008d\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093"+
            "\1\u0094\1\u0095\1\u0096\126\6\2\uffff\1\6\1\u009c\1\u009d\1"+
            "\u009e\1\u009f\23\6",
            "\1\u009a\11\6\1\uffff\1\6\3\uffff\1\u009b\1\177\1\u0080\1\u0081"+
            "\1\u0082\1\u0083\1\u0084\2\176\7\6\2\uffff\1\u0097\1\uffff\1"+
            "\u0098\1\u0099\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a\1\u008b"+
            "\1\u008c\1\u008d\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093"+
            "\1\u0094\1\u0095\1\u0096\126\6\2\uffff\1\6\1\u009c\1\u009d\1"+
            "\u009e\1\u009f\23\6",
            "\11\6\1\uffff\1\6\14\uffff\7\6\27\uffff\126\6\2\uffff\1\6\4"+
            "\uffff\23\6",
            "\11\6\1\uffff\1\6\14\uffff\7\6\27\uffff\126\6\2\uffff\1\6\4"+
            "\uffff\23\6",
            "",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\1\16\1\17",
            "\1\u00a2\1\u00a3\1\u00a4\1\u00a5",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\1\21\1\22\1\23\1\24\1\25",
            "\1\u00ba\40\uffff\1\u00b7\1\uffff\1\u00b8\1\u00b9\1\u00a6\1"+
            "\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae"+
            "\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6",
            "\1\u00ba\40\uffff\1\u00b7\1\uffff\1\u00b8\1\u00b9\1\u00a6\1"+
            "\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae"+
            "\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6",
            "\1\u00ba\40\uffff\1\u00b7\1\uffff\1\u00b8\1\u00b9\1\u00a6\1"+
            "\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae"+
            "\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6",
            "\1\u00ba\40\uffff\1\u00b7\1\uffff\1\u00b8\1\u00b9\1\u00a6\1"+
            "\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae"+
            "\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6",
            "\1\u00ba\40\uffff\1\u00b7\1\uffff\1\u00b8\1\u00b9\1\u00a6\1"+
            "\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae"+
            "\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6",
            "\1\u00bd\1\u00be\1\u00bf\1\u00bc\1\u00c0\1\u00c1\1\u00c2\1"+
            "\u00c3\1\u00c4\124\uffff\1\u00d8\46\uffff\1\u00bb\15\uffff\1"+
            "\u00c5\1\u00c6\1\u00c7\1\u00c8\1\u00c9\1\u00ca\1\u00cb\1\u00cc"+
            "\1\u00cd\1\u00ce\1\u00cf\1\u00d0\1\u00d1\1\u00d2\1\u00d3\1\u00d4"+
            "\1\u00d5\1\u00d6\1\u00d7",
            "\1\u009a\25\uffff\2\176\11\uffff\1\u0097\1\uffff\1\u0098\1"+
            "\u0099\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c"+
            "\1\u008d\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094"+
            "\1\u0095\1\u0096\131\uffff\1\u009c\1\u009d\1\u009e\1\u009f",
            "\1\u009a\25\uffff\2\176\11\uffff\1\u0097\1\uffff\1\u0098\1"+
            "\u0099\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c"+
            "\1\u008d\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094"+
            "\1\u0095\1\u0096\131\uffff\1\u009c\1\u009d\1\u009e\1\u009f",
            "\1\u009a\25\uffff\2\176\11\uffff\1\u0097\1\uffff\1\u0098\1"+
            "\u0099\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c"+
            "\1\u008d\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094"+
            "\1\u0095\1\u0096\131\uffff\1\u009c\1\u009d\1\u009e\1\u009f",
            "\1\u009a\25\uffff\2\176\11\uffff\1\u0097\1\uffff\1\u0098\1"+
            "\u0099\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c"+
            "\1\u008d\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094"+
            "\1\u0095\1\u0096\131\uffff\1\u009c\1\u009d\1\u009e\1\u009f",
            "\1\u009a\25\uffff\2\176\11\uffff\1\u0097\1\uffff\1\u0098\1"+
            "\u0099\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c"+
            "\1\u008d\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094"+
            "\1\u0095\1\u0096\131\uffff\1\u009c\1\u009d\1\u009e\1\u009f",
            "\1\u00d9",
            "\1\u009a\40\uffff\1\u0097\1\uffff\1\u0098\1\u0099\1\u0086\1"+
            "\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e"+
            "\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096",
            "\1\u009a\40\uffff\1\u0097\1\uffff\1\u0098\1\u0099\1\u0086\1"+
            "\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e"+
            "\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096",
            "\1\u009a\40\uffff\1\u0097\1\uffff\1\u0098\1\u0099\1\u0086\1"+
            "\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e"+
            "\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096",
            "\1\u009a\40\uffff\1\u0097\1\uffff\1\u0098\1\u0099\1\u0086\1"+
            "\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e"+
            "\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096",
            "\1\u009a\40\uffff\1\u0097\1\uffff\1\u0098\1\u0099\1\u0086\1"+
            "\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e"+
            "\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096",
            "\1\u009a\40\uffff\1\u0097\1\uffff\1\u0098\1\u0099\1\u0086\1"+
            "\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e"+
            "\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096",
            "\1\u009a\40\uffff\1\u0097\1\uffff\1\u0098\1\u0099\1\u0086\1"+
            "\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e"+
            "\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096",
            "\1\u009a\40\uffff\1\u0097\1\uffff\1\u0098\1\u0099\1\u0086\1"+
            "\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e"+
            "\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096",
            "\1\u009a\40\uffff\1\u0097\1\uffff\1\u0098\1\u0099\1\u0086\1"+
            "\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e"+
            "\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096",
            "\1\u009a\40\uffff\1\u0097\1\uffff\1\u0098\1\u0099\1\u0086\1"+
            "\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e"+
            "\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096",
            "\1\u009a\40\uffff\1\u0097\1\uffff\1\u0098\1\u0099\1\u0086\1"+
            "\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e"+
            "\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096",
            "\1\u009a\40\uffff\1\u0097\1\uffff\1\u0098\1\u0099\1\u0086\1"+
            "\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e"+
            "\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096",
            "\1\u009a\40\uffff\1\u0097\1\uffff\1\u0098\1\u0099\1\u0086\1"+
            "\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e"+
            "\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096",
            "\1\u009a\40\uffff\1\u0097\1\uffff\1\u0098\1\u0099\1\u0086\1"+
            "\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e"+
            "\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096",
            "\1\u009a\40\uffff\1\u0097\1\uffff\1\u0098\1\u0099\1\u0086\1"+
            "\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e"+
            "\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096",
            "\1\u009a\40\uffff\1\u0097\1\uffff\1\u0098\1\u0099\1\u0086\1"+
            "\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e"+
            "\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096",
            "\1\u009a\40\uffff\1\u0097\1\uffff\1\u0098\1\u0099\1\u0086\1"+
            "\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e"+
            "\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096",
            "\1\u009a\40\uffff\1\u0097\1\uffff\1\u0098\1\u0099\1\u0086\1"+
            "\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e"+
            "\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096",
            "\1\u009a\40\uffff\1\u0097\1\uffff\1\u0098\1\u0099\1\u0086\1"+
            "\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e"+
            "\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096",
            "\1\u009a\25\uffff\1\u00da\12\uffff\1\u0097\1\uffff\1\u0098"+
            "\1\u0099\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c"+
            "\1\u008d\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094"+
            "\1\u0095\1\u0096\1\u00e0\1\uffff\1\u00e3\1\uffff\1\u00db\1\uffff"+
            "\1\u00de\1\uffff\1\u00e2\1\uffff\1\u00dc\1\uffff\1\u00df\1\uffff"+
            "\1\u00e1\1\uffff\1\u00dd",
            "\1\u00e4\1\u00e5\1\u00e6\1\u00e7\1\u00e8\1\u00e9\1\u00ea\1"+
            "\u00eb\1\u00ec\1\u00ed\1\u00ee\1\u00ef\1\u00f0\1\u00f1\1\u00f2"+
            "\1\u00f3\1\u00f4\1\u00f5\1\u00f6\1\u00f7\1\u00f8\1\u00f9\1\u00fa"+
            "\1\u00fb\1\u00fc\1\u00fd\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u0102"+
            "\1\u0103\1\u0104\1\u0105\1\u0106\1\u0107\1\u0108\1\u0109\1\u010a"+
            "\1\u010b\1\u010c\1\u010d\1\u010e\1\u010f\1\u0110\1\u0111\1\u0112"+
            "\1\u0113\1\u0114\1\u0115\1\u0116\1\u0117\1\u0118\1\u0119",
            "\1\u00e4\1\u00e5\1\u00e6\1\u00e7\1\u00e8\1\u00e9\1\u00ea\1"+
            "\u00eb\1\u00ec\1\u00ed\1\u00ee\1\u00ef\1\u00f0\1\u00f1\1\u00f2"+
            "\1\u00f3\1\u00f4\1\u00f5\1\u00f6\1\u00f7\1\u00f8\1\u00f9\1\u00fa"+
            "\1\u00fb\1\u00fc\1\u00fd\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u0102"+
            "\1\u0103\1\u0104\1\u0105\1\u0106\1\u0107\1\u0108\1\u0109\1\u010a"+
            "\1\u010b\1\u010c\1\u010d\1\u010e\1\u010f\1\u0110\1\u0111\1\u0112"+
            "\1\u0113\1\u0114\1\u0115\1\u0116\1\u0117\1\u0118\1\u0119",
            "\1\u00e4\1\u00e5\1\u00e6\1\u00e7\1\u00e8\1\u00e9\1\u00ea\1"+
            "\u00eb\1\u00ec\1\u00ed\1\u00ee\1\u00ef\1\u00f0\1\u00f1\1\u00f2"+
            "\1\u00f3\1\u00f4\1\u00f5\1\u00f6\1\u00f7\1\u00f8\1\u00f9\1\u00fa"+
            "\1\u00fb\1\u00fc\1\u00fd\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u0102"+
            "\1\u0103\1\u0104\1\u0105\1\u0106\1\u0107\1\u0108\1\u0109\1\u010a"+
            "\1\u010b\1\u010c\1\u010d\1\u010e\1\u010f\1\u0110\1\u0111\1\u0112"+
            "\1\u0113\1\u0114\1\u0115\1\u0116\1\u0117\1\u0118\1\u0119",
            "\1\u00e4\1\u00e5\1\u00e6\1\u00e7\1\u00e8\1\u00e9\1\u00ea\1"+
            "\u00eb\1\u00ec\1\u00ed\1\u00ee\1\u00ef\1\u00f0\1\u00f1\1\u00f2"+
            "\1\u00f3\1\u00f4\1\u00f5\1\u00f6\1\u00f7\1\u00f8\1\u00f9\1\u00fa"+
            "\1\u00fb\1\u00fc\1\u00fd\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u0102"+
            "\1\u0103\1\u0104\1\u0105\1\u0106\1\u0107\1\u0108\1\u0109\1\u010a"+
            "\1\u010b\1\u010c\1\u010d\1\u010e\1\u010f\1\u0110\1\u0111\1\u0112"+
            "\1\u0113\1\u0114\1\u0115\1\u0116\1\u0117\1\u0118\1\u0119",
            "\1\u00e4\1\u00e5\1\u00e6\1\u00e7\1\u00e8\1\u00e9\1\u00ea\1"+
            "\u00eb\1\u00ec\1\u00ed\1\u00ee\1\u00ef\1\u00f0\1\u00f1\1\u00f2"+
            "\1\u00f3\1\u00f4\1\u00f5\1\u00f6\1\u00f7\1\u00f8\1\u00f9\1\u00fa"+
            "\1\u00fb\1\u00fc\1\u00fd\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u0102"+
            "\1\u0103\1\u0104\1\u0105\1\u0106\1\u0107\1\u0108\1\u0109\1\u010a"+
            "\1\u010b\1\u010c\1\u010d\1\u010e\1\u010f\1\u0110\1\u0111\1\u0112"+
            "\1\u0113\1\u0114\1\u0115\1\u0116\1\u0117\1\u0118\1\u0119",
            "\1\u00e4\1\u00e5\1\u00e6\1\u00e7\1\u00e8\1\u00e9\1\u00ea\1"+
            "\u00eb\1\u00ec\1\u00ed\1\u00ee\1\u00ef\1\u00f0\1\u00f1\1\u00f2"+
            "\1\u00f3\1\u00f4\1\u00f5\1\u00f6\1\u00f7\1\u00f8\1\u00f9\1\u00fa"+
            "\1\u00fb\1\u00fc\1\u00fd\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u0102"+
            "\1\u0103\1\u0104\1\u0105\1\u0106\1\u0107\1\u0108\1\u0109\1\u010a"+
            "\1\u010b\1\u010c\1\u010d\1\u010e\1\u010f\1\u0110\1\u0111\1\u0112"+
            "\1\u0113\1\u0114\1\u0115\1\u0116\1\u0117\1\u0118\1\u0119",
            "\1\u00e4\1\u00e5\1\u00e6\1\u00e7\1\u00e8\1\u00e9\1\u00ea\1"+
            "\u00eb\1\u00ec\1\u00ed\1\u00ee\1\u00ef\1\u00f0\1\u00f1\1\u00f2"+
            "\1\u00f3\1\u00f4\1\u00f5\1\u00f6\1\u00f7\1\u00f8\1\u00f9\1\u00fa"+
            "\1\u00fb\1\u00fc\1\u00fd\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u0102"+
            "\1\u0103\1\u0104\1\u0105\1\u0106\1\u0107\1\u0108\1\u0109\1\u010a"+
            "\1\u010b\1\u010c\1\u010d\1\u010e\1\u010f\1\u0110\1\u0111\1\u0112"+
            "\1\u0113\1\u0114\1\u0115\1\u0116\1\u0117\1\u0118\1\u0119",
            "\1\u00e4\1\u00e5\1\u00e6\1\u00e7\1\u00e8\1\u00e9\1\u00ea\1"+
            "\u00eb\1\u00ec\1\u00ed\1\u00ee\1\u00ef\1\u00f0\1\u00f1\1\u00f2"+
            "\1\u00f3\1\u00f4\1\u00f5\1\u00f6\1\u00f7\1\u00f8\1\u00f9\1\u00fa"+
            "\1\u00fb\1\u00fc\1\u00fd\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u0102"+
            "\1\u0103\1\u0104\1\u0105\1\u0106\1\u0107\1\u0108\1\u0109\1\u010a"+
            "\1\u010b\1\u010c\1\u010d\1\u010e\1\u010f\1\u0110\1\u0111\1\u0112"+
            "\1\u0113\1\u0114\1\u0115\1\u0116\1\u0117\1\u0118\1\u0119",
            "\1\u00e4\1\u00e5\1\u00e6\1\u00e7\1\u00e8\1\u00e9\1\u00ea\1"+
            "\u00eb\1\u00ec\1\u00ed\1\u00ee\1\u00ef\1\u00f0\1\u00f1\1\u00f2"+
            "\1\u00f3\1\u00f4\1\u00f5\1\u00f6\1\u00f7\1\u00f8\1\u00f9\1\u00fa"+
            "\1\u00fb\1\u00fc\1\u00fd\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u0102"+
            "\1\u0103\1\u0104\1\u0105\1\u0106\1\u0107\1\u0108\1\u0109\1\u010a"+
            "\1\u010b\1\u010c\1\u010d\1\u010e\1\u010f\1\u0110\1\u0111\1\u0112"+
            "\1\u0113\1\u0114\1\u0115\1\u0116\1\u0117\1\u0118\1\u0119",
            "\1\u00e4\1\u00e5\1\u00e6\1\u00e7\1\u00e8\1\u00e9\1\u00ea\1"+
            "\u00eb\1\u00ec\1\u00ed\1\u00ee\1\u00ef\1\u00f0\1\u00f1\1\u00f2"+
            "\1\u00f3\1\u00f4\1\u00f5\1\u00f6\1\u00f7\1\u00f8\1\u00f9\1\u00fa"+
            "\1\u00fb\1\u00fc\1\u00fd\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u0102"+
            "\1\u0103\1\u0104\1\u0105\1\u0106\1\u0107\1\u0108\1\u0109\1\u010a"+
            "\1\u010b\1\u010c\1\u010d\1\u010e\1\u010f\1\u0110\1\u0111\1\u0112"+
            "\1\u0113\1\u0114\1\u0115\1\u0116\1\u0117\1\u0118\1\u0119",
            "\1\u00e4\1\u00e5\1\u00e6\1\u00e7\1\u00e8\1\u00e9\1\u00ea\1"+
            "\u00eb\1\u00ec\1\u00ed\1\u00ee\1\u00ef\1\u00f0\1\u00f1\1\u00f2"+
            "\1\u00f3\1\u00f4\1\u00f5\1\u00f6\1\u00f7\1\u00f8\1\u00f9\1\u00fa"+
            "\1\u00fb\1\u00fc\1\u00fd\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u0102"+
            "\1\u0103\1\u0104\1\u0105\1\u0106\1\u0107\1\u0108\1\u0109\1\u010a"+
            "\1\u010b\1\u010c\1\u010d\1\u010e\1\u010f\1\u0110\1\u0111\1\u0112"+
            "\1\u0113\1\u0114\1\u0115\1\u0116\1\u0117\1\u0118\1\u0119",
            "\1\u00e4\1\u00e5\1\u00e6\1\u00e7\1\u00e8\1\u00e9\1\u00ea\1"+
            "\u00eb\1\u00ec\1\u00ed\1\u00ee\1\u00ef\1\u00f0\1\u00f1\1\u00f2"+
            "\1\u00f3\1\u00f4\1\u00f5\1\u00f6\1\u00f7\1\u00f8\1\u00f9\1\u00fa"+
            "\1\u00fb\1\u00fc\1\u00fd\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u0102"+
            "\1\u0103\1\u0104\1\u0105\1\u0106\1\u0107\1\u0108\1\u0109\1\u010a"+
            "\1\u010b\1\u010c\1\u010d\1\u010e\1\u010f\1\u0110\1\u0111\1\u0112"+
            "\1\u0113\1\u0114\1\u0115\1\u0116\1\u0117\1\u0118\1\u0119",
            "\1\u00e4\1\u00e5\1\u00e6\1\u00e7\1\u00e8\1\u00e9\1\u00ea\1"+
            "\u00eb\1\u00ec\1\u00ed\1\u00ee\1\u00ef\1\u00f0\1\u00f1\1\u00f2"+
            "\1\u00f3\1\u00f4\1\u00f5\1\u00f6\1\u00f7\1\u00f8\1\u00f9\1\u00fa"+
            "\1\u00fb\1\u00fc\1\u00fd\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u0102"+
            "\1\u0103\1\u0104\1\u0105\1\u0106\1\u0107\1\u0108\1\u0109\1\u010a"+
            "\1\u010b\1\u010c\1\u010d\1\u010e\1\u010f\1\u0110\1\u0111\1\u0112"+
            "\1\u0113\1\u0114\1\u0115\1\u0116\1\u0117\1\u0118\1\u0119",
            "\1\u00e4\1\u00e5\1\u00e6\1\u00e7\1\u00e8\1\u00e9\1\u00ea\1"+
            "\u00eb\1\u00ec\1\u00ed\1\u00ee\1\u00ef\1\u00f0\1\u00f1\1\u00f2"+
            "\1\u00f3\1\u00f4\1\u00f5\1\u00f6\1\u00f7\1\u00f8\1\u00f9\1\u00fa"+
            "\1\u00fb\1\u00fc\1\u00fd\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u0102"+
            "\1\u0103\1\u0104\1\u0105\1\u0106\1\u0107\1\u0108\1\u0109\1\u010a"+
            "\1\u010b\1\u010c\1\u010d\1\u010e\1\u010f\1\u0110\1\u0111\1\u0112"+
            "\1\u0113\1\u0114\1\u0115\1\u0116\1\u0117\1\u0118\1\u0119",
            "\1\u00e4\1\u00e5\1\u00e6\1\u00e7\1\u00e8\1\u00e9\1\u00ea\1"+
            "\u00eb\1\u00ec\1\u00ed\1\u00ee\1\u00ef\1\u00f0\1\u00f1\1\u00f2"+
            "\1\u00f3\1\u00f4\1\u00f5\1\u00f6\1\u00f7\1\u00f8\1\u00f9\1\u00fa"+
            "\1\u00fb\1\u00fc\1\u00fd\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u0102"+
            "\1\u0103\1\u0104\1\u0105\1\u0106\1\u0107\1\u0108\1\u0109\1\u010a"+
            "\1\u010b\1\u010c\1\u010d\1\u010e\1\u010f\1\u0110\1\u0111\1\u0112"+
            "\1\u0113\1\u0114\1\u0115\1\u0116\1\u0117\1\u0118\1\u0119",
            "\1\u00e4\1\u00e5\1\u00e6\1\u00e7\1\u00e8\1\u00e9\1\u00ea\1"+
            "\u00eb\1\u00ec\1\u00ed\1\u00ee\1\u00ef\1\u00f0\1\u00f1\1\u00f2"+
            "\1\u00f3\1\u00f4\1\u00f5\1\u00f6\1\u00f7\1\u00f8\1\u00f9\1\u00fa"+
            "\1\u00fb\1\u00fc\1\u00fd\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u0102"+
            "\1\u0103\1\u0104\1\u0105\1\u0106\1\u0107\1\u0108\1\u0109\1\u010a"+
            "\1\u010b\1\u010c\1\u010d\1\u010e\1\u010f\1\u0110\1\u0111\1\u0112"+
            "\1\u0113\1\u0114\1\u0115\1\u0116\1\u0117\1\u0118\1\u0119",
            "\1\u00e4\1\u00e5\1\u00e6\1\u00e7\1\u00e8\1\u00e9\1\u00ea\1"+
            "\u00eb\1\u00ec\1\u00ed\1\u00ee\1\u00ef\1\u00f0\1\u00f1\1\u00f2"+
            "\1\u00f3\1\u00f4\1\u00f5\1\u00f6\1\u00f7\1\u00f8\1\u00f9\1\u00fa"+
            "\1\u00fb\1\u00fc\1\u00fd\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u0102"+
            "\1\u0103\1\u0104\1\u0105\1\u0106\1\u0107\1\u0108\1\u0109\1\u010a"+
            "\1\u010b\1\u010c\1\u010d\1\u010e\1\u010f\1\u0110\1\u0111\1\u0112"+
            "\1\u0113\1\u0114\1\u0115\1\u0116\1\u0117\1\u0118\1\u0119",
            "\1\u00e4\1\u00e5\1\u00e6\1\u00e7\1\u00e8\1\u00e9\1\u00ea\1"+
            "\u00eb\1\u00ec\1\u00ed\1\u00ee\1\u00ef\1\u00f0\1\u00f1\1\u00f2"+
            "\1\u00f3\1\u00f4\1\u00f5\1\u00f6\1\u00f7\1\u00f8\1\u00f9\1\u00fa"+
            "\1\u00fb\1\u00fc\1\u00fd\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u0102"+
            "\1\u0103\1\u0104\1\u0105\1\u0106\1\u0107\1\u0108\1\u0109\1\u010a"+
            "\1\u010b\1\u010c\1\u010d\1\u010e\1\u010f\1\u0110\1\u0111\1\u0112"+
            "\1\u0113\1\u0114\1\u0115\1\u0116\1\u0117\1\u0118\1\u0119",
            "\1\u00e4\1\u00e5\1\u00e6\1\u00e7\1\u00e8\1\u00e9\1\u00ea\1"+
            "\u00eb\1\u00ec\1\u00ed\1\u00ee\1\u00ef\1\u00f0\1\u00f1\1\u00f2"+
            "\1\u00f3\1\u00f4\1\u00f5\1\u00f6\1\u00f7\1\u00f8\1\u00f9\1\u00fa"+
            "\1\u00fb\1\u00fc\1\u00fd\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u0102"+
            "\1\u0103\1\u0104\1\u0105\1\u0106\1\u0107\1\u0108\1\u0109\1\u010a"+
            "\1\u010b\1\u010c\1\u010d\1\u010e\1\u010f\1\u0110\1\u0111\1\u0112"+
            "\1\u0113\1\u0114\1\u0115\1\u0116\1\u0117\1\u0118\1\u0119",
            "\1\u00e4\1\u00e5\1\u00e6\1\u00e7\1\u00e8\1\u00e9\1\u00ea\1"+
            "\u00eb\1\u00ec\1\u00ed\1\u00ee\1\u00ef\1\u00f0\1\u00f1\1\u00f2"+
            "\1\u00f3\1\u00f4\1\u00f5\1\u00f6\1\u00f7\1\u00f8\1\u00f9\1\u00fa"+
            "\1\u00fb\1\u00fc\1\u00fd\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u0102"+
            "\1\u0103\1\u0104\1\u0105\1\u0106\1\u0107\1\u0108\1\u0109\1\u010a"+
            "\1\u010b\1\u010c\1\u010d\1\u010e\1\u010f\1\u0110\1\u0111\1\u0112"+
            "\1\u0113\1\u0114\1\u0115\1\u0116\1\u0117\1\u0118\1\u0119",
            "\1\u00e4\1\u00e5\1\u00e6\1\u00e7\1\u00e8\1\u00e9\1\u00ea\1"+
            "\u00eb\1\u00ec\1\u00ed\1\u00ee\1\u00ef\1\u00f0\1\u00f1\1\u00f2"+
            "\1\u00f3\1\u00f4\1\u00f5\1\u00f6\1\u00f7\1\u00f8\1\u00f9\1\u00fa"+
            "\1\u00fb\1\u00fc\1\u00fd\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u0102"+
            "\1\u0103\1\u0104\1\u0105\1\u0106\1\u0107\1\u0108\1\u0109\1\u010a"+
            "\1\u010b\1\u010c\1\u010d\1\u010e\1\u010f\1\u0110\1\u0111\1\u0112"+
            "\1\u0113\1\u0114\1\u0115\1\u0116\1\u0117\1\u0118\1\u0119",
            "\1\u00e4\1\u00e5\1\u00e6\1\u00e7\1\u00e8\1\u00e9\1\u00ea\1"+
            "\u00eb\1\u00ec\1\u00ed\1\u00ee\1\u00ef\1\u00f0\1\u00f1\1\u00f2"+
            "\1\u00f3\1\u00f4\1\u00f5\1\u00f6\1\u00f7\1\u00f8\1\u00f9\1\u00fa"+
            "\1\u00fb\1\u00fc\1\u00fd\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u0102"+
            "\1\u0103\1\u0104\1\u0105\1\u0106\1\u0107\1\u0108\1\u0109\1\u010a"+
            "\1\u010b\1\u010c\1\u010d\1\u010e\1\u010f\1\u0110\1\u0111\1\u0112"+
            "\1\u0113\1\u0114\1\u0115\1\u0116\1\u0117\1\u0118\1\u0119",
            "\1\u00e4\1\u00e5\1\u00e6\1\u00e7\1\u00e8\1\u00e9\1\u00ea\1"+
            "\u00eb\1\u00ec\1\u00ed\1\u00ee\1\u00ef\1\u00f0\1\u00f1\1\u00f2"+
            "\1\u00f3\1\u00f4\1\u00f5\1\u00f6\1\u00f7\1\u00f8\1\u00f9\1\u00fa"+
            "\1\u00fb\1\u00fc\1\u00fd\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u0102"+
            "\1\u0103\1\u0104\1\u0105\1\u0106\1\u0107\1\u0108\1\u0109\1\u010a"+
            "\1\u010b\1\u010c\1\u010d\1\u010e\1\u010f\1\u0110\1\u0111\1\u0112"+
            "\1\u0113\1\u0114\1\u0115\1\u0116\1\u0117\1\u0118\1\u0119",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011b\37\uffff\1\u011c",
            "\1\u011a",
            "\1\u011e\1\u011f\1\u0120\1\u011d\1\u0121\1\u0122",
            "\1\u0123",
            "\11\6\1\uffff\1\6\14\uffff\7\6\27\uffff\126\6\2\uffff\1\6\4"+
            "\uffff\23\6",
            "\11\6\1\uffff\1\6\14\uffff\7\6\27\uffff\126\6\2\uffff\1\6\4"+
            "\uffff\23\6",
            "\11\6\1\uffff\1\6\14\uffff\7\6\27\uffff\126\6\2\uffff\1\6\4"+
            "\uffff\23\6",
            "\11\6\1\uffff\1\6\14\uffff\7\6\27\uffff\126\6\2\uffff\1\6\4"+
            "\uffff\23\6",
            "\11\6\1\uffff\1\6\14\uffff\7\6\27\uffff\126\6\2\uffff\1\6\4"+
            "\uffff\23\6",
            "\11\6\1\uffff\1\6\14\uffff\7\6\27\uffff\126\6\2\uffff\1\6\4"+
            "\uffff\23\6",
            "",
            "\1\u0125\1\u0126\1\uffff\1\u0124",
            "\1\u0125\1\u0126",
            "\1\u0125\1\u0126\1\uffff\1\u0127",
            "\1\u0125\1\u0126\1\uffff\1\u0128",
            "\1\u0125\1\u0126",
            "\1\u0125\1\u0126\1\uffff\1\u0129",
            "\1\u0125\1\u0126",
            "\1\u0125\1\u0126\1\uffff\1\u012a",
            "\1\u0125\1\u0126",
            "\1\u0125\1\u0126",
            "\1\u0125\1\u0126\1\uffff\1\u012b",
            "\1\u0125\1\u0126",
            "\1\u0125\1\u0126\1\uffff\1\u012c",
            "\1\u0125\1\u0126",
            "\1\u0125\1\u0126\1\uffff\1\u012d",
            "\1\u0125\1\u0126\1\uffff\1\u012e",
            "\1\u0125\1\u0126",
            "\1\u0125\1\u0126\1\uffff\1\u012f",
            "\1\u0125\1\u0126\1\uffff\1\u0130",
            "\1\u0125\1\u0126\1\uffff\1\u0131",
            "\1\u0125\1\u0126\1\uffff\1\u0132",
            "\1\u0134\1\u0135\1\u0136\1\u0133\1\u0137",
            "\2\176",
            "\2\176",
            "\2\176",
            "\2\176",
            "\1\u0138\1\u0139\1\u013a",
            "",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\25\uffff\1\u013b\151"+
            "\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\25\uffff\1\u013c\151"+
            "\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\25\uffff\1\u013d\151"+
            "\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\25\uffff\1\u013e\151"+
            "\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\25\uffff\1\u013f\151"+
            "\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\25\uffff\1\u0140\151"+
            "\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\25\uffff\1\u0141\151"+
            "\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\25\uffff\1\u0142\151"+
            "\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\25\uffff\1\u0143\151"+
            "\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\25\uffff\1\u0144\151"+
            "\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\25\uffff\1\u0145\151"+
            "\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\25\uffff\1\u0146\151"+
            "\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\25\uffff\1\u0147\151"+
            "\uffff\2\u00a1",
            "\1\u0148",
            "\1\u00ba\40\uffff\1\u00b7\1\uffff\1\u00b8\1\u00b9\1\u00a6\1"+
            "\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae"+
            "\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6",
            "\1\u00ba\40\uffff\1\u00b7\1\uffff\1\u00b8\1\u00b9\1\u00a6\1"+
            "\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae"+
            "\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6",
            "\1\u00ba\40\uffff\1\u00b7\1\uffff\1\u00b8\1\u00b9\1\u00a6\1"+
            "\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae"+
            "\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6",
            "\1\u00ba\40\uffff\1\u00b7\1\uffff\1\u00b8\1\u00b9\1\u00a6\1"+
            "\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae"+
            "\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6",
            "\1\u00ba\40\uffff\1\u00b7\1\uffff\1\u00b8\1\u00b9\1\u00a6\1"+
            "\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae"+
            "\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6",
            "\1\u00ba\40\uffff\1\u00b7\1\uffff\1\u00b8\1\u00b9\1\u00a6\1"+
            "\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae"+
            "\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6",
            "\1\u00ba\40\uffff\1\u00b7\1\uffff\1\u00b8\1\u00b9\1\u00a6\1"+
            "\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae"+
            "\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6",
            "\1\u00ba\40\uffff\1\u00b7\1\uffff\1\u00b8\1\u00b9\1\u00a6\1"+
            "\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae"+
            "\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6",
            "\1\u0149",
            "\1\u00ba\40\uffff\1\u00b7\1\uffff\1\u00b8\1\u00b9\1\u00a6\1"+
            "\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae"+
            "\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6",
            "\1\u00ba\40\uffff\1\u00b7\1\uffff\1\u00b8\1\u00b9\1\u00a6\1"+
            "\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae"+
            "\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6",
            "\1\u00ba\40\uffff\1\u00b7\1\uffff\1\u00b8\1\u00b9\1\u00a6\1"+
            "\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae"+
            "\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6",
            "\1\u00ba\40\uffff\1\u00b7\1\uffff\1\u00b8\1\u00b9\1\u00a6\1"+
            "\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae"+
            "\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6",
            "\1\u00ba\40\uffff\1\u00b7\1\uffff\1\u00b8\1\u00b9\1\u00a6\1"+
            "\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae"+
            "\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6",
            "\1\u00ba\40\uffff\1\u00b7\1\uffff\1\u00b8\1\u00b9\1\u00a6\1"+
            "\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae"+
            "\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6",
            "\1\u00ba\40\uffff\1\u00b7\1\uffff\1\u00b8\1\u00b9\1\u00a6\1"+
            "\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae"+
            "\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6",
            "\1\u00ba\40\uffff\1\u00b7\1\uffff\1\u00b8\1\u00b9\1\u00a6\1"+
            "\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae"+
            "\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6",
            "\1\u00ba\40\uffff\1\u00b7\1\uffff\1\u00b8\1\u00b9\1\u00a6\1"+
            "\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae"+
            "\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6",
            "\1\u00ba\40\uffff\1\u00b7\1\uffff\1\u00b8\1\u00b9\1\u00a6\1"+
            "\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae"+
            "\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6",
            "\1\u00ba\40\uffff\1\u00b7\1\uffff\1\u00b8\1\u00b9\1\u00a6\1"+
            "\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae"+
            "\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6",
            "\1\u00ba\40\uffff\1\u00b7\1\uffff\1\u00b8\1\u00b9\1\u00a6\1"+
            "\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae"+
            "\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6",
            "\1\u00ba\40\uffff\1\u00b7\1\uffff\1\u00b8\1\u00b9\1\u00a6\1"+
            "\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae"+
            "\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6",
            "\1\u00ba\40\uffff\1\u00b7\1\uffff\1\u00b8\1\u00b9\1\u00a6\1"+
            "\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae"+
            "\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6",
            "\1\u00ba\40\uffff\1\u00b7\1\uffff\1\u00b8\1\u00b9\1\u00a6\1"+
            "\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae"+
            "\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6",
            "\1\u00ba\40\uffff\1\u00b7\1\uffff\1\u00b8\1\u00b9\1\u00a6\1"+
            "\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae"+
            "\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6",
            "\1\u00ba\40\uffff\1\u00b7\1\uffff\1\u00b8\1\u00b9\1\u00a6\1"+
            "\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae"+
            "\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6",
            "\1\u00ba\40\uffff\1\u00b7\1\uffff\1\u00b8\1\u00b9\1\u00a6\1"+
            "\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae"+
            "\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6",
            "\1\u00ba\40\uffff\1\u00b7\1\uffff\1\u00b8\1\u00b9\1\u00a6\1"+
            "\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae"+
            "\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6",
            "\1\u00ba\40\uffff\1\u00b7\1\uffff\1\u00b8\1\u00b9\1\u00a6\1"+
            "\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae"+
            "\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6",
            "\1\u014a",
            "\1\u00e0\1\uffff\1\u00e3\1\uffff\1\u00db\1\uffff\1\u00de\1"+
            "\uffff\1\u00e2\1\uffff\1\u00dc\1\uffff\1\u00df\1\uffff\1\u00e1"+
            "\1\uffff\1\u00dd",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u011a",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u0156\37\uffff\1\u015f\1\uffff\1\u015c\1\uffff\1\u015b\1"+
            "\uffff\1\u0157\1\uffff\1\u015a\1\uffff\1\u015d\1\uffff\1\u0158"+
            "\1\uffff\1\u0159\1\uffff\1\u015e",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u0160\37\uffff\1\u0161",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u0162\1\u0163\1\u0164\1\u0165\1\u0166\1\u0167\1\u0168\1"+
            "\u0169\1\u016a\1\u016b\1\u016c\1\u016d\1\u016e\1\u016f\1\u0170"+
            "\1\u0171\1\u0172\1\u0173\1\u0174\1\u0175\1\u0176\1\u0177\1\u0178",
            "\1\u011c",
            "\1\u011a",
            "\2\176",
            "\2\176",
            "\2\176",
            "\2\176",
            "\2\176",
            "\2\176",
            "\2\u0179",
            "\1\u0125\1\u0126",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\1\u0125\1\u0126",
            "\1\u0125\1\u0126",
            "\1\u0125\1\u0126",
            "\1\u0125\1\u0126",
            "\1\u0125\1\u0126",
            "\1\u0125\1\u0126",
            "\1\u0125\1\u0126",
            "\1\u0125\1\u0126",
            "\1\u0125\1\u0126",
            "\1\u0125\1\u0126",
            "\1\u0125\1\u0126",
            "\1\u0125\1\u0126",
            "\11\u014f\1\uffff\1\6\4\uffff\1\u017a\1\u017b\1\u017c\1\u017d"+
            "\1\u017e\1\u017f\2\uffff\7\u014f\27\uffff\126\u014f\2\uffff"+
            "\1\u014f\4\uffff\23\u014f",
            "\11\u014f\1\uffff\1\6\4\uffff\1\u017a\1\u017b\1\u017c\1\u017d"+
            "\1\u017e\1\u017f\2\uffff\7\u014f\27\uffff\126\u014f\2\uffff"+
            "\1\u014f\4\uffff\23\u014f",
            "\11\u014f\1\uffff\1\6\4\uffff\1\u017a\1\u017b\1\u017c\1\u017d"+
            "\1\u017e\1\u017f\2\uffff\7\u014f\27\uffff\126\u014f\2\uffff"+
            "\1\u014f\4\uffff\23\u014f",
            "\11\u014f\1\uffff\1\6\4\uffff\1\u017a\1\u017b\1\u017c\1\u017d"+
            "\1\u017e\1\u017f\2\uffff\7\u014f\27\uffff\126\u014f\2\uffff"+
            "\1\u014f\4\uffff\23\u014f",
            "\11\u014f\1\uffff\1\6\4\uffff\1\u017a\1\u017b\1\u017c\1\u017d"+
            "\1\u017e\1\u017f\2\uffff\7\u014f\27\uffff\126\u014f\2\uffff"+
            "\1\u014f\4\uffff\23\u014f",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\11\uffff\2\u0180\164"+
            "\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\11\uffff\2\u0181\164"+
            "\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\11\uffff\2\u0181\164"+
            "\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\1\u0183\1\u0184\1\u0185\1\u0182\1\u0186\1\u0187\1\u0188\1"+
            "\u0189",
            "\1\u018a",
            "\1\u018b",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\21\uffff\1\u0153\155\uffff\2\u00a1\1"+
            "\u014c",
            "\1\u018d\1\u018e\1\u018f\1\u018c\1\u0190\1\u0191",
            "",
            "",
            "",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1"+
            "\1\uffff\1\u0192\1\u0193\1\u0194\1\u0195",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1"+
            "\1\uffff\1\u0192\1\u0193\1\u0194\1\u0195",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1"+
            "\1\uffff\1\u0192\1\u0193\1\u0194\1\u0195",
            "\1\u0196",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1"+
            "\1\uffff\1\u0192\1\u0193\1\u0194\1\u0195",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1"+
            "\1\uffff\1\u0192\1\u0193\1\u0194\1\u0195",
            "\1\u015f\1\uffff\1\u015c\1\uffff\1\u015b\1\uffff\1\u0157\1"+
            "\uffff\1\u015a\1\uffff\1\u015d\1\uffff\1\u0158\1\uffff\1\u0159"+
            "\1\uffff\1\u015e",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u0161",
            "\1\u014e\1\u014f\1\u0150\1\u014d\1\u0151\1\u0152\1\u0154\1"+
            "\u0155\3\uffff\1\u00a1\1\u014b\20\uffff\1\u0153\155\uffff\2"+
            "\u00a1\1\u014c",
            "\1\u019a\1\u019b\1\u019c\1\u0199\1\u019d\1\u019e\1\u01a0\1"+
            "\u01a1\3\uffff\1\u00a1\1\u0197\20\uffff\1\u019f\155\uffff\2"+
            "\u00a1\1\u0198",
            "\1\u019a\1\u019b\1\u019c\1\u0199\1\u019d\1\u019e\1\u01a0\1"+
            "\u01a1\3\uffff\1\u00a1\1\u0197\20\uffff\1\u019f\155\uffff\2"+
            "\u00a1\1\u0198",
            "\1\u019a\1\u019b\1\u019c\1\u0199\1\u019d\1\u019e\1\u01a0\1"+
            "\u01a1\3\uffff\1\u00a1\1\u0197\20\uffff\1\u019f\155\uffff\2"+
            "\u00a1\1\u0198",
            "\1\u019a\1\u019b\1\u019c\1\u0199\1\u019d\1\u019e\1\u01a0\1"+
            "\u01a1\3\uffff\1\u00a1\1\u0197\20\uffff\1\u019f\155\uffff\2"+
            "\u00a1\1\u0198",
            "\1\u019a\1\u019b\1\u019c\1\u0199\1\u019d\1\u019e\1\u01a0\1"+
            "\u01a1\3\uffff\1\u00a1\1\u0197\20\uffff\1\u019f\155\uffff\2"+
            "\u00a1\1\u0198",
            "\1\u019a\1\u019b\1\u019c\1\u0199\1\u019d\1\u019e\1\u01a0\1"+
            "\u01a1\3\uffff\1\u00a1\1\u0197\20\uffff\1\u019f\155\uffff\2"+
            "\u00a1\1\u0198",
            "\1\u019a\1\u019b\1\u019c\1\u0199\1\u019d\1\u019e\1\u01a0\1"+
            "\u01a1\3\uffff\1\u00a1\1\u0197\20\uffff\1\u019f\155\uffff\2"+
            "\u00a1\1\u0198",
            "\1\u019a\1\u019b\1\u019c\1\u0199\1\u019d\1\u019e\1\u01a0\1"+
            "\u01a1\3\uffff\1\u00a1\1\u0197\20\uffff\1\u019f\155\uffff\2"+
            "\u00a1\1\u0198",
            "\1\u019a\1\u019b\1\u019c\1\u0199\1\u019d\1\u019e\1\u01a0\1"+
            "\u01a1\3\uffff\1\u00a1\1\u0197\20\uffff\1\u019f\155\uffff\2"+
            "\u00a1\1\u0198",
            "\1\u019a\1\u019b\1\u019c\1\u0199\1\u019d\1\u019e\1\u01a0\1"+
            "\u01a1\3\uffff\1\u00a1\1\u0197\20\uffff\1\u019f\155\uffff\2"+
            "\u00a1\1\u0198",
            "\1\u019a\1\u019b\1\u019c\1\u0199\1\u019d\1\u019e\1\u01a0\1"+
            "\u01a1\3\uffff\1\u00a1\1\u0197\20\uffff\1\u019f\155\uffff\2"+
            "\u00a1\1\u0198",
            "\1\u019a\1\u019b\1\u019c\1\u0199\1\u019d\1\u019e\1\u01a0\1"+
            "\u01a1\3\uffff\1\u00a1\1\u0197\20\uffff\1\u019f\155\uffff\2"+
            "\u00a1\1\u0198",
            "\1\u019a\1\u019b\1\u019c\1\u0199\1\u019d\1\u019e\1\u01a0\1"+
            "\u01a1\3\uffff\1\u00a1\1\u0197\20\uffff\1\u019f\155\uffff\2"+
            "\u00a1\1\u0198",
            "\1\u019a\1\u019b\1\u019c\1\u0199\1\u019d\1\u019e\1\u01a0\1"+
            "\u01a1\3\uffff\1\u00a1\1\u0197\20\uffff\1\u019f\155\uffff\2"+
            "\u00a1\1\u0198",
            "\1\u019a\1\u019b\1\u019c\1\u0199\1\u019d\1\u019e\1\u01a0\1"+
            "\u01a1\3\uffff\1\u00a1\1\u0197\20\uffff\1\u019f\155\uffff\2"+
            "\u00a1\1\u0198",
            "\1\u019a\1\u019b\1\u019c\1\u0199\1\u019d\1\u019e\1\u01a0\1"+
            "\u01a1\3\uffff\1\u00a1\1\u0197\20\uffff\1\u019f\155\uffff\2"+
            "\u00a1\1\u0198",
            "\1\u019a\1\u019b\1\u019c\1\u0199\1\u019d\1\u019e\1\u01a0\1"+
            "\u01a1\3\uffff\1\u00a1\1\u0197\20\uffff\1\u019f\155\uffff\2"+
            "\u00a1\1\u0198",
            "\1\u019a\1\u019b\1\u019c\1\u0199\1\u019d\1\u019e\1\u01a0\1"+
            "\u01a1\3\uffff\1\u00a1\1\u0197\20\uffff\1\u019f\155\uffff\2"+
            "\u00a1\1\u0198",
            "\1\u019a\1\u019b\1\u019c\1\u0199\1\u019d\1\u019e\1\u01a0\1"+
            "\u01a1\3\uffff\1\u00a1\1\u0197\20\uffff\1\u019f\155\uffff\2"+
            "\u00a1\1\u0198",
            "\1\u019a\1\u019b\1\u019c\1\u0199\1\u019d\1\u019e\1\u01a0\1"+
            "\u01a1\3\uffff\1\u00a1\1\u0197\20\uffff\1\u019f\155\uffff\2"+
            "\u00a1\1\u0198",
            "\1\u019a\1\u019b\1\u019c\1\u0199\1\u019d\1\u019e\1\u01a0\1"+
            "\u01a1\3\uffff\1\u00a1\1\u0197\20\uffff\1\u019f\155\uffff\2"+
            "\u00a1\1\u0198",
            "\1\u019a\1\u019b\1\u019c\1\u0199\1\u019d\1\u019e\1\u01a0\1"+
            "\u01a1\3\uffff\1\u00a1\1\u0197\20\uffff\1\u019f\155\uffff\2"+
            "\u00a1\1\u0198",
            "\1\u019a\1\u019b\1\u019c\1\u0199\1\u019d\1\u019e\1\u01a0\1"+
            "\u01a1\3\uffff\1\u00a1\1\u0197\20\uffff\1\u019f\155\uffff\2"+
            "\u00a1\1\u0198",
            "\1\u01a2\1\u01a3\1\u01a4",
            "\11\u019b\1\uffff\1\6\14\uffff\7\u019b\27\uffff\126\u019b\2"+
            "\uffff\1\u019b\4\uffff\23\u019b",
            "\11\u019b\1\uffff\1\6\14\uffff\7\u019b\27\uffff\126\u019b\2"+
            "\uffff\1\u019b\4\uffff\23\u019b",
            "\11\u019b\1\uffff\1\6\14\uffff\7\u019b\27\uffff\126\u019b\2"+
            "\uffff\1\u019b\4\uffff\23\u019b",
            "\11\u019b\1\uffff\1\6\14\uffff\7\u019b\27\uffff\126\u019b\2"+
            "\uffff\1\u019b\4\uffff\23\u019b",
            "\11\u019b\1\uffff\1\6\14\uffff\7\u019b\27\uffff\126\u019b\2"+
            "\uffff\1\u019b\4\uffff\23\u019b",
            "\11\u019b\1\uffff\1\6\14\uffff\7\u019b\27\uffff\126\u019b\2"+
            "\uffff\1\u019b\4\uffff\23\u019b",
            "\1\u01a5\1\u01a6\1\u01a7\1\u01a9\1\u01aa\1\u01ab\1\u01ad\1"+
            "\u01ae\25\uffff\1\u01ac\157\uffff\1\u01a8",
            "\1\u01af\1\u01b0\1\u01b1\1\u01a9\1\u01aa\1\u01ab\1\u01ad\1"+
            "\u01ae\25\uffff\1\u01ac\157\uffff\1\u01a8",
            "\2\176\167\uffff\1\u009c\1\u009d\1\u009e\1\u009f",
            "\2\176\167\uffff\1\u009c\1\u009d\1\u009e\1\u009f",
            "\2\176\167\uffff\1\u009c\1\u009d\1\u009e\1\u009f",
            "\2\176\167\uffff\1\u009c\1\u009d\1\u009e\1\u009f",
            "\2\176\167\uffff\1\u009c\1\u009d\1\u009e\1\u009f",
            "\2\176\167\uffff\1\u009c\1\u009d\1\u009e\1\u009f",
            "\2\176\167\uffff\1\u009c\1\u009d\1\u009e\1\u009f",
            "\2\176\167\uffff\1\u009c\1\u009d\1\u009e\1\u009f",
            "\1\u01b2",
            "\1\u009a\10\uffff\1\u018b\27\uffff\1\u0097\1\uffff\1\u0098"+
            "\1\u0099\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c"+
            "\1\u008d\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094"+
            "\1\u0095\1\u0096",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\1\u01b3",
            "\1\u019a\1\u019b\1\u019c\1\u0199\1\u019d\1\u019e\1\u01a0\1"+
            "\u01a1\3\uffff\1\u00a1\21\uffff\1\u019f\155\uffff\2\u00a1\1"+
            "\u0198",
            "\1\u01b5\1\u01b6\1\u01b7\1\u01b4\1\u01b8\1\u01b9",
            "",
            "",
            "",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1"+
            "\1\uffff\1\u01ba\1\u01bb\1\u01bc\1\u01bd",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1"+
            "\1\uffff\1\u01ba\1\u01bb\1\u01bc\1\u01bd",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1"+
            "\1\uffff\1\u01ba\1\u01bb\1\u01bc\1\u01bd",
            "\1\u01be",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1"+
            "\1\uffff\1\u01ba\1\u01bb\1\u01bc\1\u01bd",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1"+
            "\1\uffff\1\u01ba\1\u01bb\1\u01bc\1\u01bd",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1"+
            "\1\uffff\1\u01bf\1\u01c0\1\u01c1\1\u01c2",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1"+
            "\1\uffff\1\u01bf\1\u01c0\1\u01c1\1\u01c2",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1"+
            "\1\uffff\1\u01bf\1\u01c0\1\u01c1\1\u01c2",
            "\1\u01c4\1\u01c5\1\u01c6\1\u01c3\1\u01c7\1\u01c8",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1"+
            "\1\uffff\1\u01bf\1\u01c0\1\u01c1\1\u01c2",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1"+
            "\1\uffff\1\u01bf\1\u01c0\1\u01c1\1\u01c2",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1"+
            "\1\uffff\1\u01bf\1\u01c0\1\u01c1\1\u01c2",
            "\1\u01c9",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1"+
            "\1\uffff\1\u01bf\1\u01c0\1\u01c1\1\u01c2",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1"+
            "\1\uffff\1\u01bf\1\u01c0\1\u01c1\1\u01c2",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1"+
            "\1\uffff\1\u01bf\1\u01c0\1\u01c1\1\u01c2",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1"+
            "\1\uffff\1\u01bf\1\u01c0\1\u01c1\1\u01c2",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1"+
            "\1\uffff\1\u01bf\1\u01c0\1\u01c1\1\u01c2",
            "\1\u00ba\10\uffff\1\u01b2\27\uffff\1\u00b7\1\uffff\1\u00b8"+
            "\1\u00b9\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac"+
            "\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4"+
            "\1\u00b5\1\u00b6",
            "\1\u01cb\1\u01cc\1\u01cd\1\u01ca\1\u01ce\1\u01cf\1\u0154\1"+
            "\u0155",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\1\u01d0",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1",
            "\1\u01d1",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1"+
            "\1\uffff\1\u0192\1\u0193\1\u0194\1\u0195",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1"+
            "\1\uffff\1\u0192\1\u0193\1\u0194\1\u0195",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1"+
            "\1\uffff\1\u0192\1\u0193\1\u0194\1\u0195",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1"+
            "\1\uffff\1\u0192\1\u0193\1\u0194\1\u0195",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1"+
            "\1\uffff\1\u0192\1\u0193\1\u0194\1\u0195",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1"+
            "\1\uffff\1\u0192\1\u0193\1\u0194\1\u0195",
            "\1\u01d3\1\u01d4\1\u01d5\1\u01d2\1\u01d6\1\u01d7\1\u01a0\1"+
            "\u01a1",
            "\1\u01d9\1\u01da\1\u01db\1\u01d8\1\u01dc\1\u01dd\1\u01ad\1"+
            "\u01ae",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1"+
            "\1\uffff\1\u01ba\1\u01bb\1\u01bc\1\u01bd",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1"+
            "\1\uffff\1\u01ba\1\u01bb\1\u01bc\1\u01bd",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1"+
            "\1\uffff\1\u01ba\1\u01bb\1\u01bc\1\u01bd",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1"+
            "\1\uffff\1\u01ba\1\u01bb\1\u01bc\1\u01bd",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1"+
            "\1\uffff\1\u01ba\1\u01bb\1\u01bc\1\u01bd",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1"+
            "\1\uffff\1\u01ba\1\u01bb\1\u01bc\1\u01bd",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1"+
            "\1\uffff\1\u01bf\1\u01c0\1\u01c1\1\u01c2",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1"+
            "\1\uffff\1\u01bf\1\u01c0\1\u01c1\1\u01c2",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1"+
            "\1\uffff\1\u01bf\1\u01c0\1\u01c1\1\u01c2",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1"+
            "\1\uffff\1\u01bf\1\u01c0\1\u01c1\1\u01c2",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1"+
            "\1\uffff\1\u01bf\1\u01c0\1\u01c1\1\u01c2",
            "\2\u00a1\1\uffff\1\u00a1\7\uffff\1\u00a1\177\uffff\2\u00a1"+
            "\1\uffff\1\u01bf\1\u01c0\1\u01c1\1\u01c2"
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
            return "48:1: datetime : ( ( time )? ( 'on' )? date -> ^( DATE_TIME date ( time )? ) | date ( 'at' )? time -> ^( DATE_TIME date time ) | time -> ^( DATE_TIME ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"0\"] ) time ) );";
        }
    }
    static final String DFA5_eotS =
        "\15\uffff";
    static final String DFA5_eofS =
        "\15\uffff";
    static final String DFA5_minS =
        "\1\23\1\uffff\1\23\11\22\1\uffff";
    static final String DFA5_maxS =
        "\1\u00b7\1\uffff\1\u00b7\10\u00a4\1\130\1\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\12\uffff\1\2";
    static final String DFA5_specialS =
        "\15\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\4\1\5\1\6\1\3\1\7\1\10\1\11\1\12\1\1\16\uffff\6\1\1\2\27"+
            "\uffff\50\14\1\13\44\14\11\1\2\uffff\1\14\4\uffff\23\1",
            "",
            "\11\1\124\uffff\1\1\46\uffff\1\14\15\uffff\23\1",
            "\1\1\25\uffff\2\14\11\uffff\1\1\1\uffff\23\1\131\uffff\4\14",
            "\1\1\25\uffff\2\14\11\uffff\1\1\1\uffff\23\1\131\uffff\4\14",
            "\1\1\25\uffff\2\14\11\uffff\1\1\1\uffff\23\1\131\uffff\4\14",
            "\1\1\25\uffff\2\14\11\uffff\1\1\1\uffff\23\1\131\uffff\4\14",
            "\1\1\25\uffff\2\14\11\uffff\1\1\1\uffff\23\1\131\uffff\4\14",
            "\1\1\25\uffff\2\14\11\uffff\1\1\1\uffff\23\1\131\uffff\4\14",
            "\1\1\25\uffff\2\14\11\uffff\1\1\1\uffff\23\1\131\uffff\4\14",
            "\1\1\25\uffff\2\14\11\uffff\1\1\1\uffff\23\1\131\uffff\4\14",
            "\1\1\25\uffff\1\14\12\uffff\1\1\1\uffff\23\1\1\14\1\uffff\1"+
            "\14\1\uffff\1\14\1\uffff\1\14\1\uffff\1\14\1\uffff\1\14\1\uffff"+
            "\1\14\1\uffff\1\14\1\uffff\1\14",
            ""
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
            return "59:1: date : ( relative_date | explicit_date );";
        }
    }
    static final String DFA11_eotS =
        "\16\uffff";
    static final String DFA11_eofS =
        "\6\uffff\3\4\5\uffff";
    static final String DFA11_minS =
        "\1\23\2\uffff\1\50\1\uffff\5\23\4\uffff";
    static final String DFA11_maxS =
        "\1\u00a0\2\uffff\1\u00a4\1\uffff\1\25\3\u009f\1\u00a0\4\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\5\uffff\4\3";
    static final String DFA11_specialS =
        "\16\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\3\7\4\25\uffff\1\4\27\uffff\66\2\27\1\13\uffff\1\4",
            "",
            "",
            "\2\5\167\uffff\4\4",
            "",
            "\1\6\1\7\1\10",
            "\2\4\1\uffff\1\4\7\uffff\1\4\11\uffff\2\11\164\uffff\2\4",
            "\2\4\1\uffff\1\4\7\uffff\1\4\11\uffff\2\12\164\uffff\2\4",
            "\2\4\1\uffff\1\4\7\uffff\1\4\11\uffff\2\12\164\uffff\2\4",
            "\1\13\1\14\1\15\1\12\4\15\25\uffff\1\15\157\uffff\1\12",
            "",
            "",
            "",
            ""
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
            return "69:1: explicit_date : ( month day ( ',' )? ( numeric_year )? -> ^( EXPLICIT_DATE month day ( numeric_year )? ) | day 'of' month ( ',' )? ( numeric_year )? -> ^( EXPLICIT_DATE month day ( numeric_year )? ) | numeric_month date_separator numeric_day date_separator numeric_year -> ^( EXPLICIT_DATE numeric_month numeric_day numeric_year ) | ( numeric_year date_separator )? numeric_month date_separator numeric_day -> ^( EXPLICIT_DATE numeric_month numeric_day ( numeric_year )? ) );";
        }
    }
    static final String DFA50_eotS =
        "\101\uffff";
    static final String DFA50_eofS =
        "\101\uffff";
    static final String DFA50_minS =
        "\1\110\50\uffff\1\50\15\uffff\1\110\11\uffff";
    static final String DFA50_maxS =
        "\1\175\50\uffff\1\130\15\uffff\1\130\11\uffff";
    static final String DFA50_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
        "\1\47\1\50\1\uffff\1\52\1\54\1\56\1\60\1\62\1\64\1\66\1\70\1\72"+
        "\1\73\1\74\1\75\1\76\1\uffff\1\61\1\57\1\67\1\71\1\51\1\53\1\65"+
        "\1\63\1\55";
    static final String DFA50_specialS =
        "\101\uffff}>";
    static final String[] DFA50_transitionS = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1"+
            "\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1"+
            "\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1"+
            "\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1"+
            "\62\1\63\1\64\1\65\1\66",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\67\37\uffff\1\74\1\uffff\1\75\1\uffff\1\100\1\uffff\1\71"+
            "\1\uffff\1\70\1\uffff\1\77\1\uffff\1\76\1\uffff\1\72\1\uffff"+
            "\1\73",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\74\1\uffff\1\75\1\uffff\1\100\1\uffff\1\71\1\uffff\1\70"+
            "\1\uffff\1\77\1\uffff\1\76\1\uffff\1\72\1\uffff\1\73",
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
            return "173:1: day : ( 'first' -> DAY_OF_MONTH[\"1\"] | '1st' -> DAY_OF_MONTH[\"1\"] | 'second' -> DAY_OF_MONTH[\"2\"] | '2nd' -> DAY_OF_MONTH[\"2\"] | 'third' -> DAY_OF_MONTH[\"3\"] | '3rd' -> DAY_OF_MONTH[\"3\"] | 'fourth' -> DAY_OF_MONTH[\"4\"] | '4th' -> DAY_OF_MONTH[\"4\"] | 'fifth' -> DAY_OF_MONTH[\"5\"] | '5th' -> DAY_OF_MONTH[\"5\"] | 'sixth' -> DAY_OF_MONTH[\"6\"] | '6th' -> DAY_OF_MONTH[\"6\"] | 'seventh' -> DAY_OF_MONTH[\"7\"] | '7th' -> DAY_OF_MONTH[\"7\"] | 'eighth' -> DAY_OF_MONTH[\"8\"] | '8th' -> DAY_OF_MONTH[\"8\"] | 'ninth' -> DAY_OF_MONTH[\"9\"] | '9th' -> DAY_OF_MONTH[\"9\"] | 'tenth' -> DAY_OF_MONTH[\"10\"] | '10th' -> DAY_OF_MONTH[\"10\"] | 'eleventh' -> DAY_OF_MONTH[\"11\"] | '11th' -> DAY_OF_MONTH[\"11\"] | 'twelfth' -> DAY_OF_MONTH[\"12\"] | '12th' -> DAY_OF_MONTH[\"12\"] | 'thirteenth' -> DAY_OF_MONTH[\"13\"] | '13th' -> DAY_OF_MONTH[\"13\"] | 'fourteenth' -> DAY_OF_MONTH[\"14\"] | '14th' -> DAY_OF_MONTH[\"14\"] | 'fifteenth' -> DAY_OF_MONTH[\"15\"] | '15th' -> DAY_OF_MONTH[\"15\"] | 'sixteenth' -> DAY_OF_MONTH[\"16\"] | '16th' -> DAY_OF_MONTH[\"16\"] | 'seventeenth' -> DAY_OF_MONTH[\"17\"] | '17th' -> DAY_OF_MONTH[\"17\"] | 'eighteenth' -> DAY_OF_MONTH[\"18\"] | '18th' -> DAY_OF_MONTH[\"18\"] | 'nineteenth' -> DAY_OF_MONTH[\"19\"] | '19th' -> DAY_OF_MONTH[\"19\"] | 'twentieth' -> DAY_OF_MONTH[\"20\"] | '20th' -> DAY_OF_MONTH[\"20\"] | 'twenty' ( '-' )? 'first' -> DAY_OF_MONTH[\"21\"] | '21st' -> DAY_OF_MONTH[\"21\"] | 'twenty' ( '-' )? 'second' -> DAY_OF_MONTH[\"22\"] | '22nd' -> DAY_OF_MONTH[\"22\"] | 'twenty' ( '-' )? 'third' -> DAY_OF_MONTH[\"23\"] | '23rd' -> DAY_OF_MONTH[\"23\"] | 'twenty' ( '-' )? 'fourth' -> DAY_OF_MONTH[\"24\"] | '24th' -> DAY_OF_MONTH[\"24\"] | 'twenty' ( '-' )? 'fifth' -> DAY_OF_MONTH[\"25\"] | '25th' -> DAY_OF_MONTH[\"25\"] | 'twenty' ( '-' )? 'sixth' -> DAY_OF_MONTH[\"26\"] | '26th' -> DAY_OF_MONTH[\"26\"] | 'twenty' ( '-' )? 'seventh' -> DAY_OF_MONTH[\"27\"] | '27th' -> DAY_OF_MONTH[\"27\"] | 'twenty' ( '-' )? 'eighth' -> DAY_OF_MONTH[\"28\"] | '28th' -> DAY_OF_MONTH[\"28\"] | 'twenty' ( '-' )? 'ninth' -> DAY_OF_MONTH[\"29\"] | '29th' -> DAY_OF_MONTH[\"29\"] | 'thirtieth' -> DAY_OF_MONTH[\"30\"] | '30th' -> DAY_OF_MONTH[\"30\"] | 'thirty' ( '-' )? 'first' -> DAY_OF_MONTH[\"31\"] | '31st' -> DAY_OF_MONTH[\"31\"] );";
        }
    }
 

    public static final BitSet FOLLOW_time_in_datetime178 = new BitSet(new long[]{0x0001FC002FF80000L,0xFFFFFFFFFFFFFF00L,0x00FFFFE13FFFFFFFL});
    public static final BitSet FOLLOW_29_in_datetime181 = new BitSet(new long[]{0x0001FC002FF80000L,0xFFFFFFFFFFFFFF00L,0x00FFFFE13FFFFFFFL});
    public static final BitSet FOLLOW_date_in_datetime184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_in_datetime207 = new BitSet(new long[]{0x0000000040580000L,0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_30_in_datetime209 = new BitSet(new long[]{0x0000000040580000L,0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_time_in_datetime212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_in_datetime234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relative_date_in_date265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_explicit_date_in_date272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_explicit_time_in_time287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_month_in_explicit_date304 = new BitSet(new long[]{0x0000000000000000L,0x3FFFFFFFFFFFFF00L});
    public static final BitSet FOLLOW_day_in_explicit_date306 = new BitSet(new long[]{0x0001000087F80002L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_31_in_explicit_date308 = new BitSet(new long[]{0x0001000007F80002L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_numeric_year_in_explicit_date311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_day_in_explicit_date337 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_explicit_date339 = new BitSet(new long[]{0x0000000000000000L,0xC000000000000000L,0x00000000001FFFFFL});
    public static final BitSet FOLLOW_month_in_explicit_date341 = new BitSet(new long[]{0x0001000087F80002L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_31_in_explicit_date343 = new BitSet(new long[]{0x0001000007F80002L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_numeric_year_in_explicit_date346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_month_in_explicit_date375 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_date_separator_in_explicit_date377 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_numeric_day_in_explicit_date379 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_date_separator_in_explicit_date381 = new BitSet(new long[]{0x0001000007F80000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_numeric_year_in_explicit_date383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_year_in_explicit_date416 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_date_separator_in_explicit_date418 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_numeric_month_in_explicit_date422 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_date_separator_in_explicit_date424 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_numeric_day_in_explicit_date426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_today_or_tomorrow_in_relative_date461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relative_prefix_in_relative_date473 = new BitSet(new long[]{0xFFE8000000040000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_prefixable_target_in_relative_date475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_relative_date497 = new BitSet(new long[]{0xFFE8000000040000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_prefixable_target_in_relative_date499 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_relative_suffix_in_relative_date501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hours_in_explicit_time533 = new BitSet(new long[]{0x000000FC00000002L});
    public static final BitSet FOLLOW_meridian_indicator_in_explicit_time535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hours_in_explicit_time562 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_explicit_time564 = new BitSet(new long[]{0x0000000000F80000L});
    public static final BitSet FOLLOW_minutes_in_explicit_time566 = new BitSet(new long[]{0x000000FC00000002L});
    public static final BitSet FOLLOW_meridian_indicator_in_explicit_time568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_identifier_in_explicit_time591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_meridian_indicator609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_meridian_indicator622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_meridian_indicator633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_meridian_indicator647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_meridian_indicator660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_meridian_indicator671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_date_separator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_relative_prefix713 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_relative_prefix716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_relative_prefix737 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_relative_prefix740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_relative_prefix761 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_relative_prefix764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_relative_prefix785 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_relative_prefix788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_relative_prefix807 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_relative_prefix810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_relative_prefix827 = new BitSet(new long[]{0x0001FC000FF80000L,0x0001000000000000L,0x00FFFFE03FE00000L});
    public static final BitSet FOLLOW_number_in_relative_prefix829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_relative_suffix861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_relative_suffix875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_day_of_week_in_prefixable_target903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_span_in_prefixable_target910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_date_span925 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_date_span927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_date_span949 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_date_span951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_date_span972 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_date_span974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YEAR_DATE_SPAN_in_date_span994 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_date_span996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_day_of_week1019 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_day_of_week1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_day_of_week1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_day_of_week1058 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_day_of_week1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_day_of_week1074 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_day_of_week1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_day_of_week1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_day_of_week1115 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_day_of_week1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_day_of_week1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_day_of_week1151 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_day_of_week1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_day_of_week1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_day_of_week1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_day_of_week1207 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_day_of_week1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_day_of_week1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_day_of_week1246 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_day_of_week1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_day_of_week1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_day_of_week1283 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_day_of_week1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_day_of_week1299 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_day_of_week1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_day_of_week1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_day1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_day1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_day1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_day1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_day1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_day1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_day1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_day1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_day1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_day1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_day1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_day1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_day1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_day1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_day1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_day1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_day1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_day1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_day1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_day1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_day1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_day1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_day1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_day1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_day2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_day2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_day2057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_day2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_day2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_day2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_day2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_day2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_day2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_day2230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_day2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_day2280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_day2308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_day2330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_day2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_day2381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_day2409 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_40_in_day2411 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_day2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_day2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_day2455 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_40_in_day2457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_day2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_day2472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_day2500 = new BitSet(new long[]{0x0000010000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_40_in_day2502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_day2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_day2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_day2546 = new BitSet(new long[]{0x0000010000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_40_in_day2548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_day2551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_day2563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_day2591 = new BitSet(new long[]{0x0000010000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_40_in_day2593 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_day2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_day2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_day2637 = new BitSet(new long[]{0x0000010000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_40_in_day2639 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_day2642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_day2655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_day2683 = new BitSet(new long[]{0x0000010000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_40_in_day2685 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_day2688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_day2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_day2727 = new BitSet(new long[]{0x0000010000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_40_in_day2729 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_day2732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_day2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_day2772 = new BitSet(new long[]{0x0000010000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_40_in_day2774 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_day2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_day2790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_day2818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_day2841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_day2869 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_40_in_day2871 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_day2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_day2887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_month2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_month2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_month2951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_month2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_month2978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_month2992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_month3008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_month3022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_month3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_month3054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_month3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_month3085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_month3100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_month3116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_month3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_month3145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_month3155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_month3171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_month3183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_month3199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_month3210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_month3226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_148_in_month3237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_149_in_today_or_tomorrow3263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tomorrow_in_today_or_tomorrow3281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_150_in_today_or_tomorrow3293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_151_in_today_or_tomorrow3317 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_152_in_today_or_tomorrow3320 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000003C000000L});
    public static final BitSet FOLLOW_tomorrow_in_today_or_tomorrow3322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_151_in_today_or_tomorrow3340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_153_in_today_or_tomorrow3343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_154_in_tomorrow3371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_tomorrow3375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_tomorrow3379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_tomorrow3383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_time_identifier3415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_time_identifier3436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_TO_TWELVE_in_numeric_day3465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_TO_TWENTY_FOUR_in_numeric_day3488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FIVE_TO_THIRTY_ONE_in_numeric_day3501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_TO_TWELVE_in_numeric_month3520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_numeric_year3543 = new BitSet(new long[]{0x0000000001F80000L});
    public static final BitSet FOLLOW_up_to_two_digits_in_numeric_year3546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_numeric_year3587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_numeric_year3589 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_YEAR_DATE_SPAN_in_numeric_year3591 = new BitSet(new long[]{0x0000000007F80000L});
    public static final BitSet FOLLOW_up_to_four_digits_in_numeric_year3595 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000001E00000000L});
    public static final BitSet FOLLOW_era_in_numeric_year3597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_era3619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_era3630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_163_in_era3641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_164_in_era3652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWO_ZEROS_in_hours3672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_TO_TWELVE_in_hours3683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_TO_TWENTY_FOUR_in_hours3694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWO_ZEROS_in_minutes3714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_TO_TWELVE_in_minutes3741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_TO_TWENTY_FOUR_in_minutes3764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FIVE_TO_THIRTY_ONE_in_minutes3777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_TWO_TO_FIFTY_NINE_in_minutes3788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWO_ZEROS_in_up_to_two_digits3810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_TO_TWELVE_in_up_to_two_digits3837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_TO_TWENTY_FOUR_in_up_to_two_digits3860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FIVE_TO_THIRTY_ONE_in_up_to_two_digits3873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_TWO_TO_FIFTY_NINE_in_up_to_two_digits3884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTY_TO_NINETY_NINE_in_up_to_two_digits3896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_up_to_two_digits_in_up_to_four_digits3921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THREE_DIGITS_in_up_to_four_digits3927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOUR_DIGITS_in_up_to_four_digits3938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_up_to_four_digits_in_number3959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIGIT_in_number3989 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_DIGIT_in_number3991 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_DIGIT_in_number3993 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_DIGIT_in_number3995 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_number_string_in_number4008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_number_string4024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_166_in_number_string4041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_167_in_number_string4058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_168_in_number_string4073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_169_in_number_string4089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_170_in_number_string4105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_171_in_number_string4122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_172_in_number_string4137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_173_in_number_string4152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_number_string4168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_175_in_number_string4185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_176_in_number_string4199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_177_in_number_string4213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_178_in_number_string4225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_179_in_number_string4237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_180_in_number_string4250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_181_in_number_string4263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_182_in_number_string4274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_183_in_number_string4286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_number_string4298 = new BitSet(new long[]{0x0000000000000002L});

}