// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g 2010-01-21 12:15:14
 package com.natty.parse; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class DateParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DATE_TIME", "RELATIVE_DATE", "EXPLICIT_DATE", "AM_PM", "ERA", "EXPLICIT_TIME", "DIRECTION", "MONTH", "DAY", "YEAR", "DAY_OF_WEEK", "INTEGER", "FOUR_DIGITS", "DATE_FRAME", "YEAR_DATE_FRAME", "ONE_TO_TWELVE", "THIRTEEN_TO_TWENTY_FOUR", "TWENTY_FIVE_TO_THIRTY_ONE", "TWO_ZEROS", "THIRTY_TWO_TO_FIFTY_NINE", "SIXTY_TO_NINETY_NINE", "THREE_DIGITS", "DIGIT", "WHITE_SPACE", "'on'", "'at'", "','", "'of'", "'this'", "'in'", "'days'", "'from now'", "'ago'", "':'", "'am'", "'a'", "'pm'", "'p'", "'-'", "'/'", "'last'", "'next'", "'first'", "'1st'", "'second'", "'2nd'", "'third'", "'3rd'", "'fourth'", "'4th'", "'fifth'", "'5th'", "'sixth'", "'6th'", "'seventh'", "'7th'", "'eighth'", "'8th'", "'ninth'", "'9th'", "'tenth'", "'10th'", "'eleventh'", "'11th'", "'twelfth'", "'12th'", "'thirteenth'", "'13th'", "'fourteenth'", "'14th'", "'fifteenth'", "'15th'", "'sixteenth'", "'16th'", "'seventeenth'", "'17th'", "'eighteenth'", "'18th'", "'nineteenth'", "'19th'", "'twentieth'", "'20th'", "'twenty'", "'21st'", "'22nd'", "'23rd'", "'24th'", "'25th'", "'26th'", "'27th'", "'28th'", "'29th'", "'thirtieth'", "'30th'", "'thirty'", "'31st'", "'january'", "'jan'", "'february'", "'feb'", "'march'", "'mar'", "'april'", "'apr'", "'may'", "'june'", "'jun'", "'july'", "'jul'", "'august'", "'aug'", "'september'", "'sep'", "'october'", "'oct'", "'november'", "'nov'", "'december'", "'dec'", "'monday'", "'mon'", "'tuesday'", "'tue'", "'tues'", "'wednesday'", "'wed'", "'thursday'", "'thur'", "'thurs'", "'friday'", "'fri'", "'saturday'", "'sat'", "'sunday'", "'sun'", "'today'", "'yesterday'", "'the'", "'day after '", "'day before yesterday'", "'tomorow'", "'tomorrow'", "'tommorow'", "'tommorrow'", "'midnight'", "'noon'", "'\\''", "'ad'", "'bc'"
    };
    public static final int DIRECTION=10;
    public static final int YEAR_DATE_FRAME=18;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int DAY=12;
    public static final int EOF=-1;
    public static final int MONTH=11;
    public static final int DATE_TIME=4;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int AM_PM=7;
    public static final int T__92=92;
    public static final int SIXTY_TO_NINETY_NINE=24;
    public static final int T__148=148;
    public static final int T__147=147;
    public static final int T__90=90;
    public static final int T__149=149;
    public static final int T__99=99;
    public static final int T__150=150;
    public static final int T__98=98;
    public static final int T__151=151;
    public static final int T__97=97;
    public static final int T__152=152;
    public static final int T__96=96;
    public static final int RELATIVE_DATE=5;
    public static final int T__95=95;
    public static final int T__139=139;
    public static final int T__138=138;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int DAY_OF_WEEK=14;
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
    public static final int EXPLICIT_TIME=9;
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
    public static final int FOUR_DIGITS=16;
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
    public static final int WHITE_SPACE=27;
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
    public static final int DIGIT=26;
    public static final int T__50=50;
    public static final int DATE_FRAME=17;
    public static final int INTEGER=15;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int THIRTEEN_TO_TWENTY_FOUR=20;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int ERA=8;
    public static final int ONE_TO_TWELVE=19;

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:26:1: datetime : ( ( time )? ( 'on' )? date -> ^( DATE_TIME date ( time )? ) | date ( 'at' )? time -> ^( DATE_TIME date time ) | time -> ^( DATE_TIME ^( RELATIVE_DATE DIRECTION[\">\"] INTEGER[\"0\"] ) time ) );
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
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleSubtreeStream stream_time=new RewriteRuleSubtreeStream(adaptor,"rule time");
        RewriteRuleSubtreeStream stream_date=new RewriteRuleSubtreeStream(adaptor,"rule date");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:28:3: ( ( time )? ( 'on' )? date -> ^( DATE_TIME date ( time )? ) | date ( 'at' )? time -> ^( DATE_TIME date time ) | time -> ^( DATE_TIME ^( RELATIVE_DATE DIRECTION[\">\"] INTEGER[\"0\"] ) time ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:28:5: ( time )? ( 'on' )? date
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:28:5: ( time )?
                    int alt1=2;
                    switch ( input.LA(1) ) {
                        case ONE_TO_TWELVE:
                            {
                            int LA1_1 = input.LA(2);

                            if ( (LA1_1==FOUR_DIGITS||(LA1_1>=ONE_TO_TWELVE && LA1_1<=SIXTY_TO_NINETY_NINE)||LA1_1==DIGIT||LA1_1==28||(LA1_1>=32 && LA1_1<=33)||(LA1_1>=37 && LA1_1<=41)||(LA1_1>=44 && LA1_1<=147)) ) {
                                alt1=1;
                            }
                            }
                            break;
                        case 148:
                        case 149:
                            {
                            alt1=1;
                            }
                            break;
                        case THIRTEEN_TO_TWENTY_FOUR:
                        case TWO_ZEROS:
                            {
                            int LA1_4 = input.LA(2);

                            if ( (LA1_4==FOUR_DIGITS||(LA1_4>=ONE_TO_TWELVE && LA1_4<=SIXTY_TO_NINETY_NINE)||LA1_4==DIGIT||LA1_4==28||(LA1_4>=32 && LA1_4<=33)||(LA1_4>=37 && LA1_4<=41)||(LA1_4>=44 && LA1_4<=147)) ) {
                                alt1=1;
                            }
                            }
                            break;
                    }

                    switch (alt1) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:28:5: time
                            {
                            pushFollow(FOLLOW_time_in_datetime108);
                            time1=time();

                            state._fsp--;

                            stream_time.add(time1.getTree());

                            }
                            break;

                    }

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:28:11: ( 'on' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==28) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:28:11: 'on'
                            {
                            string_literal2=(Token)match(input,28,FOLLOW_28_in_datetime111);  
                            stream_28.add(string_literal2);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_date_in_datetime114);
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

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:31:5: date ( 'at' )? time
                    {
                    pushFollow(FOLLOW_date_in_datetime137);
                    date4=date();

                    state._fsp--;

                    stream_date.add(date4.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:31:10: ( 'at' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==29) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:31:10: 'at'
                            {
                            string_literal5=(Token)match(input,29,FOLLOW_29_in_datetime139);  
                            stream_29.add(string_literal5);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_time_in_datetime142);
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
                    // 31:21: -> ^( DATE_TIME date time )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:31:24: ^( DATE_TIME date time )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:34:5: time
                    {
                    pushFollow(FOLLOW_time_in_datetime164);
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
                    // 34:10: -> ^( DATE_TIME ^( RELATIVE_DATE DIRECTION[\">\"] INTEGER[\"0\"] ) time )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:34:13: ^( DATE_TIME ^( RELATIVE_DATE DIRECTION[\">\"] INTEGER[\"0\"] ) time )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DATE_TIME, "DATE_TIME"), root_1);

                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:34:25: ^( RELATIVE_DATE DIRECTION[\">\"] INTEGER[\"0\"] )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_2);

                        adaptor.addChild(root_2, (Object)adaptor.create(DIRECTION, ">"));
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:37:1: date : ( relative_date | explicit_date );
    public final DateParser.date_return date() throws RecognitionException {
        DateParser.date_return retval = new DateParser.date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.relative_date_return relative_date8 = null;

        DateParser.explicit_date_return explicit_date9 = null;



        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:38:3: ( relative_date | explicit_date )
            int alt5=2;
            switch ( input.LA(1) ) {
            case THIRTEEN_TO_TWENTY_FOUR:
            case TWENTY_FIVE_TO_THIRTY_ONE:
            case TWO_ZEROS:
            case THIRTY_TWO_TO_FIFTY_NINE:
            case SIXTY_TO_NINETY_NINE:
            case DIGIT:
            case 32:
            case 33:
            case 44:
            case 45:
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
            case 147:
                {
                alt5=1;
                }
                break;
            case ONE_TO_TWELVE:
                {
                int LA5_2 = input.LA(2);

                if ( ((LA5_2>=42 && LA5_2<=43)) ) {
                    alt5=2;
                }
                else if ( (LA5_2==34) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case FOUR_DIGITS:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
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
                {
                alt5=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:38:5: relative_date
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_relative_date_in_date195);
                    relative_date8=relative_date();

                    state._fsp--;

                    adaptor.addChild(root_0, relative_date8.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:39:5: explicit_date
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_explicit_date_in_date202);
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:42:1: time : explicit_time ;
    public final DateParser.time_return time() throws RecognitionException {
        DateParser.time_return retval = new DateParser.time_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.explicit_time_return explicit_time10 = null;



        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:43:3: ( explicit_time )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:43:5: explicit_time
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_explicit_time_in_time217);
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:47:1: explicit_date : ( month day ( ',' )? ( numeric_year )? -> ^( EXPLICIT_DATE month day ( numeric_year )? ) | day 'of' month ( ',' )? ( numeric_year )? -> ^( EXPLICIT_DATE month day ( numeric_year )? ) | ( FOUR_DIGITS date_separator )? numeric_month date_separator numeric_day -> ^( EXPLICIT_DATE numeric_month numeric_day ( FOUR_DIGITS )? ) | numeric_month date_separator numeric_day date_separator numeric_year -> ^( EXPLICIT_DATE numeric_month numeric_day numeric_year ) );
    public final DateParser.explicit_date_return explicit_date() throws RecognitionException {
        DateParser.explicit_date_return retval = new DateParser.explicit_date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal13=null;
        Token string_literal16=null;
        Token char_literal18=null;
        Token FOUR_DIGITS20=null;
        DateParser.month_return month11 = null;

        DateParser.day_return day12 = null;

        DateParser.numeric_year_return numeric_year14 = null;

        DateParser.day_return day15 = null;

        DateParser.month_return month17 = null;

        DateParser.numeric_year_return numeric_year19 = null;

        DateParser.date_separator_return date_separator21 = null;

        DateParser.numeric_month_return numeric_month22 = null;

        DateParser.date_separator_return date_separator23 = null;

        DateParser.numeric_day_return numeric_day24 = null;

        DateParser.numeric_month_return numeric_month25 = null;

        DateParser.date_separator_return date_separator26 = null;

        DateParser.numeric_day_return numeric_day27 = null;

        DateParser.date_separator_return date_separator28 = null;

        DateParser.numeric_year_return numeric_year29 = null;


        Object char_literal13_tree=null;
        Object string_literal16_tree=null;
        Object char_literal18_tree=null;
        Object FOUR_DIGITS20_tree=null;
        RewriteRuleTokenStream stream_FOUR_DIGITS=new RewriteRuleTokenStream(adaptor,"token FOUR_DIGITS");
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleSubtreeStream stream_numeric_month=new RewriteRuleSubtreeStream(adaptor,"rule numeric_month");
        RewriteRuleSubtreeStream stream_numeric_year=new RewriteRuleSubtreeStream(adaptor,"rule numeric_year");
        RewriteRuleSubtreeStream stream_numeric_day=new RewriteRuleSubtreeStream(adaptor,"rule numeric_day");
        RewriteRuleSubtreeStream stream_month=new RewriteRuleSubtreeStream(adaptor,"rule month");
        RewriteRuleSubtreeStream stream_day=new RewriteRuleSubtreeStream(adaptor,"rule day");
        RewriteRuleSubtreeStream stream_date_separator=new RewriteRuleSubtreeStream(adaptor,"rule date_separator");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:49:3: ( month day ( ',' )? ( numeric_year )? -> ^( EXPLICIT_DATE month day ( numeric_year )? ) | day 'of' month ( ',' )? ( numeric_year )? -> ^( EXPLICIT_DATE month day ( numeric_year )? ) | ( FOUR_DIGITS date_separator )? numeric_month date_separator numeric_day -> ^( EXPLICIT_DATE numeric_month numeric_day ( FOUR_DIGITS )? ) | numeric_month date_separator numeric_day date_separator numeric_year -> ^( EXPLICIT_DATE numeric_month numeric_day numeric_year ) )
            int alt11=4;
            switch ( input.LA(1) ) {
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
                {
                alt11=1;
                }
                break;
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
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
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
                {
                alt11=2;
                }
                break;
            case FOUR_DIGITS:
                {
                alt11=3;
                }
                break;
            case ONE_TO_TWELVE:
                {
                int LA11_4 = input.LA(2);

                if ( ((LA11_4>=42 && LA11_4<=43)) ) {
                    int LA11_5 = input.LA(3);

                    if ( ((LA11_5>=ONE_TO_TWELVE && LA11_5<=TWENTY_FIVE_TO_THIRTY_ONE)) ) {
                        int LA11_6 = input.LA(4);

                        if ( ((LA11_6>=42 && LA11_6<=43)) ) {
                            alt11=4;
                        }
                        else if ( (LA11_6==EOF||(LA11_6>=ONE_TO_TWELVE && LA11_6<=THIRTEEN_TO_TWENTY_FOUR)||LA11_6==TWO_ZEROS||LA11_6==29||(LA11_6>=148 && LA11_6<=149)) ) {
                            alt11=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:49:5: month day ( ',' )? ( numeric_year )?
                    {
                    pushFollow(FOLLOW_month_in_explicit_date234);
                    month11=month();

                    state._fsp--;

                    stream_month.add(month11.getTree());
                    pushFollow(FOLLOW_day_in_explicit_date236);
                    day12=day();

                    state._fsp--;

                    stream_day.add(day12.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:49:15: ( ',' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==30) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:49:15: ','
                            {
                            char_literal13=(Token)match(input,30,FOLLOW_30_in_explicit_date238);  
                            stream_30.add(char_literal13);


                            }
                            break;

                    }

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:49:20: ( numeric_year )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==150) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==FOUR_DIGITS||(LA7_0>=ONE_TO_TWELVE && LA7_0<=THREE_DIGITS)||LA7_0==33) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:49:20: numeric_year
                            {
                            pushFollow(FOLLOW_numeric_year_in_explicit_date241);
                            numeric_year14=numeric_year();

                            state._fsp--;

                            stream_numeric_year.add(numeric_year14.getTree());

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
                    // 49:34: -> ^( EXPLICIT_DATE month day ( numeric_year )? )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:49:37: ^( EXPLICIT_DATE month day ( numeric_year )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_1);

                        adaptor.addChild(root_1, stream_month.nextTree());
                        adaptor.addChild(root_1, stream_day.nextTree());
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:49:63: ( numeric_year )?
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:52:5: day 'of' month ( ',' )? ( numeric_year )?
                    {
                    pushFollow(FOLLOW_day_in_explicit_date267);
                    day15=day();

                    state._fsp--;

                    stream_day.add(day15.getTree());
                    string_literal16=(Token)match(input,31,FOLLOW_31_in_explicit_date269);  
                    stream_31.add(string_literal16);

                    pushFollow(FOLLOW_month_in_explicit_date271);
                    month17=month();

                    state._fsp--;

                    stream_month.add(month17.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:52:20: ( ',' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==30) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:52:20: ','
                            {
                            char_literal18=(Token)match(input,30,FOLLOW_30_in_explicit_date273);  
                            stream_30.add(char_literal18);


                            }
                            break;

                    }

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:52:25: ( numeric_year )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==150) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==FOUR_DIGITS||(LA9_0>=ONE_TO_TWELVE && LA9_0<=THREE_DIGITS)||LA9_0==33) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:52:25: numeric_year
                            {
                            pushFollow(FOLLOW_numeric_year_in_explicit_date276);
                            numeric_year19=numeric_year();

                            state._fsp--;

                            stream_numeric_year.add(numeric_year19.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: day, month, numeric_year
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 52:39: -> ^( EXPLICIT_DATE month day ( numeric_year )? )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:52:42: ^( EXPLICIT_DATE month day ( numeric_year )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_1);

                        adaptor.addChild(root_1, stream_month.nextTree());
                        adaptor.addChild(root_1, stream_day.nextTree());
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:52:68: ( numeric_year )?
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:56:5: ( FOUR_DIGITS date_separator )? numeric_month date_separator numeric_day
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:56:5: ( FOUR_DIGITS date_separator )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==FOUR_DIGITS) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:56:6: FOUR_DIGITS date_separator
                            {
                            FOUR_DIGITS20=(Token)match(input,FOUR_DIGITS,FOLLOW_FOUR_DIGITS_in_explicit_date306);  
                            stream_FOUR_DIGITS.add(FOUR_DIGITS20);

                            pushFollow(FOLLOW_date_separator_in_explicit_date308);
                            date_separator21=date_separator();

                            state._fsp--;

                            stream_date_separator.add(date_separator21.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_numeric_month_in_explicit_date312);
                    numeric_month22=numeric_month();

                    state._fsp--;

                    stream_numeric_month.add(numeric_month22.getTree());
                    pushFollow(FOLLOW_date_separator_in_explicit_date314);
                    date_separator23=date_separator();

                    state._fsp--;

                    stream_date_separator.add(date_separator23.getTree());
                    pushFollow(FOLLOW_numeric_day_in_explicit_date316);
                    numeric_day24=numeric_day();

                    state._fsp--;

                    stream_numeric_day.add(numeric_day24.getTree());


                    // AST REWRITE
                    // elements: numeric_month, numeric_day, FOUR_DIGITS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 56:76: -> ^( EXPLICIT_DATE numeric_month numeric_day ( FOUR_DIGITS )? )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:57:5: ^( EXPLICIT_DATE numeric_month numeric_day ( FOUR_DIGITS )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_1);

                        adaptor.addChild(root_1, stream_numeric_month.nextTree());
                        adaptor.addChild(root_1, stream_numeric_day.nextTree());
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:57:47: ( FOUR_DIGITS )?
                        if ( stream_FOUR_DIGITS.hasNext() ) {
                            adaptor.addChild(root_1, stream_FOUR_DIGITS.nextNode());

                        }
                        stream_FOUR_DIGITS.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:61:5: numeric_month date_separator numeric_day date_separator numeric_year
                    {
                    pushFollow(FOLLOW_numeric_month_in_explicit_date349);
                    numeric_month25=numeric_month();

                    state._fsp--;

                    stream_numeric_month.add(numeric_month25.getTree());
                    pushFollow(FOLLOW_date_separator_in_explicit_date351);
                    date_separator26=date_separator();

                    state._fsp--;

                    stream_date_separator.add(date_separator26.getTree());
                    pushFollow(FOLLOW_numeric_day_in_explicit_date353);
                    numeric_day27=numeric_day();

                    state._fsp--;

                    stream_numeric_day.add(numeric_day27.getTree());
                    pushFollow(FOLLOW_date_separator_in_explicit_date355);
                    date_separator28=date_separator();

                    state._fsp--;

                    stream_date_separator.add(date_separator28.getTree());
                    pushFollow(FOLLOW_numeric_year_in_explicit_date357);
                    numeric_year29=numeric_year();

                    state._fsp--;

                    stream_numeric_year.add(numeric_year29.getTree());


                    // AST REWRITE
                    // elements: numeric_day, numeric_month, numeric_year
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 61:74: -> ^( EXPLICIT_DATE numeric_month numeric_day numeric_year )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:62:5: ^( EXPLICIT_DATE numeric_month numeric_day numeric_year )
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:66:1: relative_date : ( day_identifier -> day_identifier | ( 'this' )? day_of_week -> ^( RELATIVE_DATE DIRECTION[\">\"] day_of_week ) | relative_prefix prefixable_target -> ^( RELATIVE_DATE relative_prefix prefixable_target ) | 'in' integer 'days' -> ^( RELATIVE_DATE DIRECTION[\">\"] integer ) | integer 'days' ( 'from now' )? -> ^( RELATIVE_DATE DIRECTION[\">\"] integer ) | integer 'days' 'ago' -> ^( RELATIVE_DATE DIRECTION[\"<\"] integer ) );
    public final DateParser.relative_date_return relative_date() throws RecognitionException {
        DateParser.relative_date_return retval = new DateParser.relative_date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal31=null;
        Token string_literal35=null;
        Token string_literal37=null;
        Token string_literal39=null;
        Token string_literal40=null;
        Token string_literal42=null;
        Token string_literal43=null;
        DateParser.day_identifier_return day_identifier30 = null;

        DateParser.day_of_week_return day_of_week32 = null;

        DateParser.relative_prefix_return relative_prefix33 = null;

        DateParser.prefixable_target_return prefixable_target34 = null;

        DateParser.integer_return integer36 = null;

        DateParser.integer_return integer38 = null;

        DateParser.integer_return integer41 = null;


        Object string_literal31_tree=null;
        Object string_literal35_tree=null;
        Object string_literal37_tree=null;
        Object string_literal39_tree=null;
        Object string_literal40_tree=null;
        Object string_literal42_tree=null;
        Object string_literal43_tree=null;
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleSubtreeStream stream_relative_prefix=new RewriteRuleSubtreeStream(adaptor,"rule relative_prefix");
        RewriteRuleSubtreeStream stream_day_of_week=new RewriteRuleSubtreeStream(adaptor,"rule day_of_week");
        RewriteRuleSubtreeStream stream_prefixable_target=new RewriteRuleSubtreeStream(adaptor,"rule prefixable_target");
        RewriteRuleSubtreeStream stream_day_identifier=new RewriteRuleSubtreeStream(adaptor,"rule day_identifier");
        RewriteRuleSubtreeStream stream_integer=new RewriteRuleSubtreeStream(adaptor,"rule integer");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:67:3: ( day_identifier -> day_identifier | ( 'this' )? day_of_week -> ^( RELATIVE_DATE DIRECTION[\">\"] day_of_week ) | relative_prefix prefixable_target -> ^( RELATIVE_DATE relative_prefix prefixable_target ) | 'in' integer 'days' -> ^( RELATIVE_DATE DIRECTION[\">\"] integer ) | integer 'days' ( 'from now' )? -> ^( RELATIVE_DATE DIRECTION[\">\"] integer ) | integer 'days' 'ago' -> ^( RELATIVE_DATE DIRECTION[\"<\"] integer ) )
            int alt14=6;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:67:5: day_identifier
                    {
                    pushFollow(FOLLOW_day_identifier_in_relative_date388);
                    day_identifier30=day_identifier();

                    state._fsp--;

                    stream_day_identifier.add(day_identifier30.getTree());


                    // AST REWRITE
                    // elements: day_identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 67:20: -> day_identifier
                    {
                        adaptor.addChild(root_0, stream_day_identifier.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:70:5: ( 'this' )? day_of_week
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:70:5: ( 'this' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==32) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:70:5: 'this'
                            {
                            string_literal31=(Token)match(input,32,FOLLOW_32_in_relative_date404);  
                            stream_32.add(string_literal31);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_day_of_week_in_relative_date407);
                    day_of_week32=day_of_week();

                    state._fsp--;

                    stream_day_of_week.add(day_of_week32.getTree());


                    // AST REWRITE
                    // elements: day_of_week
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 70:25: -> ^( RELATIVE_DATE DIRECTION[\">\"] day_of_week )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:70:28: ^( RELATIVE_DATE DIRECTION[\">\"] day_of_week )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(DIRECTION, ">"));
                        adaptor.addChild(root_1, stream_day_of_week.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:73:5: relative_prefix prefixable_target
                    {
                    pushFollow(FOLLOW_relative_prefix_in_relative_date430);
                    relative_prefix33=relative_prefix();

                    state._fsp--;

                    stream_relative_prefix.add(relative_prefix33.getTree());
                    pushFollow(FOLLOW_prefixable_target_in_relative_date432);
                    prefixable_target34=prefixable_target();

                    state._fsp--;

                    stream_prefixable_target.add(prefixable_target34.getTree());


                    // AST REWRITE
                    // elements: prefixable_target, relative_prefix
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 73:39: -> ^( RELATIVE_DATE relative_prefix prefixable_target )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:73:42: ^( RELATIVE_DATE relative_prefix prefixable_target )
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
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:76:5: 'in' integer 'days'
                    {
                    string_literal35=(Token)match(input,33,FOLLOW_33_in_relative_date454);  
                    stream_33.add(string_literal35);

                    pushFollow(FOLLOW_integer_in_relative_date456);
                    integer36=integer();

                    state._fsp--;

                    stream_integer.add(integer36.getTree());
                    string_literal37=(Token)match(input,34,FOLLOW_34_in_relative_date458);  
                    stream_34.add(string_literal37);



                    // AST REWRITE
                    // elements: integer
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 76:25: -> ^( RELATIVE_DATE DIRECTION[\">\"] integer )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:76:28: ^( RELATIVE_DATE DIRECTION[\">\"] integer )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(DIRECTION, ">"));
                        adaptor.addChild(root_1, stream_integer.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:77:5: integer 'days' ( 'from now' )?
                    {
                    pushFollow(FOLLOW_integer_in_relative_date476);
                    integer38=integer();

                    state._fsp--;

                    stream_integer.add(integer38.getTree());
                    string_literal39=(Token)match(input,34,FOLLOW_34_in_relative_date478);  
                    stream_34.add(string_literal39);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:77:20: ( 'from now' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==35) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:77:20: 'from now'
                            {
                            string_literal40=(Token)match(input,35,FOLLOW_35_in_relative_date480);  
                            stream_35.add(string_literal40);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: integer
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 77:32: -> ^( RELATIVE_DATE DIRECTION[\">\"] integer )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:77:35: ^( RELATIVE_DATE DIRECTION[\">\"] integer )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(DIRECTION, ">"));
                        adaptor.addChild(root_1, stream_integer.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:80:5: integer 'days' 'ago'
                    {
                    pushFollow(FOLLOW_integer_in_relative_date505);
                    integer41=integer();

                    state._fsp--;

                    stream_integer.add(integer41.getTree());
                    string_literal42=(Token)match(input,34,FOLLOW_34_in_relative_date507);  
                    stream_34.add(string_literal42);

                    string_literal43=(Token)match(input,36,FOLLOW_36_in_relative_date509);  
                    stream_36.add(string_literal43);



                    // AST REWRITE
                    // elements: integer
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 80:26: -> ^( RELATIVE_DATE DIRECTION[\"<\"] integer )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:80:29: ^( RELATIVE_DATE DIRECTION[\"<\"] integer )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(DIRECTION, "<"));
                        adaptor.addChild(root_1, stream_integer.nextTree());

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:84:1: explicit_time : ( hours ( meridian_indicator )? -> ^( EXPLICIT_TIME hours INTEGER[\"0\"] ( meridian_indicator )? ) | hours ':' minutes ( meridian_indicator )? -> ^( EXPLICIT_TIME hours minutes ( meridian_indicator )? ) | time_identifier -> time_identifier );
    public final DateParser.explicit_time_return explicit_time() throws RecognitionException {
        DateParser.explicit_time_return retval = new DateParser.explicit_time_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal47=null;
        DateParser.hours_return hours44 = null;

        DateParser.meridian_indicator_return meridian_indicator45 = null;

        DateParser.hours_return hours46 = null;

        DateParser.minutes_return minutes48 = null;

        DateParser.meridian_indicator_return meridian_indicator49 = null;

        DateParser.time_identifier_return time_identifier50 = null;


        Object char_literal47_tree=null;
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleSubtreeStream stream_meridian_indicator=new RewriteRuleSubtreeStream(adaptor,"rule meridian_indicator");
        RewriteRuleSubtreeStream stream_minutes=new RewriteRuleSubtreeStream(adaptor,"rule minutes");
        RewriteRuleSubtreeStream stream_time_identifier=new RewriteRuleSubtreeStream(adaptor,"rule time_identifier");
        RewriteRuleSubtreeStream stream_hours=new RewriteRuleSubtreeStream(adaptor,"rule hours");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:86:3: ( hours ( meridian_indicator )? -> ^( EXPLICIT_TIME hours INTEGER[\"0\"] ( meridian_indicator )? ) | hours ':' minutes ( meridian_indicator )? -> ^( EXPLICIT_TIME hours minutes ( meridian_indicator )? ) | time_identifier -> time_identifier )
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=ONE_TO_TWELVE && LA17_0<=THIRTEEN_TO_TWENTY_FOUR)||LA17_0==TWO_ZEROS) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==EOF||LA17_1==FOUR_DIGITS||(LA17_1>=ONE_TO_TWELVE && LA17_1<=SIXTY_TO_NINETY_NINE)||LA17_1==DIGIT||LA17_1==28||(LA17_1>=32 && LA17_1<=33)||(LA17_1>=38 && LA17_1<=41)||(LA17_1>=44 && LA17_1<=147)) ) {
                    alt17=1;
                }
                else if ( (LA17_1==37) ) {
                    alt17=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA17_0>=148 && LA17_0<=149)) ) {
                alt17=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:86:5: hours ( meridian_indicator )?
                    {
                    pushFollow(FOLLOW_hours_in_explicit_time540);
                    hours44=hours();

                    state._fsp--;

                    stream_hours.add(hours44.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:86:11: ( meridian_indicator )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( ((LA15_0>=38 && LA15_0<=41)) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:86:11: meridian_indicator
                            {
                            pushFollow(FOLLOW_meridian_indicator_in_explicit_time542);
                            meridian_indicator45=meridian_indicator();

                            state._fsp--;

                            stream_meridian_indicator.add(meridian_indicator45.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: meridian_indicator, hours
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 86:31: -> ^( EXPLICIT_TIME hours INTEGER[\"0\"] ( meridian_indicator )? )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:86:34: ^( EXPLICIT_TIME hours INTEGER[\"0\"] ( meridian_indicator )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        adaptor.addChild(root_1, stream_hours.nextTree());
                        adaptor.addChild(root_1, (Object)adaptor.create(INTEGER, "0"));
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:86:69: ( meridian_indicator )?
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:89:5: hours ':' minutes ( meridian_indicator )?
                    {
                    pushFollow(FOLLOW_hours_in_explicit_time569);
                    hours46=hours();

                    state._fsp--;

                    stream_hours.add(hours46.getTree());
                    char_literal47=(Token)match(input,37,FOLLOW_37_in_explicit_time571);  
                    stream_37.add(char_literal47);

                    pushFollow(FOLLOW_minutes_in_explicit_time573);
                    minutes48=minutes();

                    state._fsp--;

                    stream_minutes.add(minutes48.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:89:23: ( meridian_indicator )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>=38 && LA16_0<=41)) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:89:23: meridian_indicator
                            {
                            pushFollow(FOLLOW_meridian_indicator_in_explicit_time575);
                            meridian_indicator49=meridian_indicator();

                            state._fsp--;

                            stream_meridian_indicator.add(meridian_indicator49.getTree());

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
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 89:43: -> ^( EXPLICIT_TIME hours minutes ( meridian_indicator )? )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:89:46: ^( EXPLICIT_TIME hours minutes ( meridian_indicator )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        adaptor.addChild(root_1, stream_hours.nextTree());
                        adaptor.addChild(root_1, stream_minutes.nextTree());
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:89:76: ( meridian_indicator )?
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:91:5: time_identifier
                    {
                    pushFollow(FOLLOW_time_identifier_in_explicit_time598);
                    time_identifier50=time_identifier();

                    state._fsp--;

                    stream_time_identifier.add(time_identifier50.getTree());


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
                    // 91:21: -> time_identifier
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:95:1: meridian_indicator : ( 'am' -> AM_PM[\"am\"] | 'a' -> AM_PM[\"am\"] | 'pm' -> AM_PM[\"pm\"] | 'p' -> AM_PM[\"pm\"] );
    public final DateParser.meridian_indicator_return meridian_indicator() throws RecognitionException {
        DateParser.meridian_indicator_return retval = new DateParser.meridian_indicator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal51=null;
        Token char_literal52=null;
        Token string_literal53=null;
        Token char_literal54=null;

        Object string_literal51_tree=null;
        Object char_literal52_tree=null;
        Object string_literal53_tree=null;
        Object char_literal54_tree=null;
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:96:3: ( 'am' -> AM_PM[\"am\"] | 'a' -> AM_PM[\"am\"] | 'pm' -> AM_PM[\"pm\"] | 'p' -> AM_PM[\"pm\"] )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt18=1;
                }
                break;
            case 39:
                {
                alt18=2;
                }
                break;
            case 40:
                {
                alt18=3;
                }
                break;
            case 41:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:96:5: 'am'
                    {
                    string_literal51=(Token)match(input,38,FOLLOW_38_in_meridian_indicator616);  
                    stream_38.add(string_literal51);



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
                    // 96:10: -> AM_PM[\"am\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(AM_PM, "am"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:97:5: 'a'
                    {
                    char_literal52=(Token)match(input,39,FOLLOW_39_in_meridian_indicator627);  
                    stream_39.add(char_literal52);



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
                    // 97:10: -> AM_PM[\"am\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(AM_PM, "am"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:98:5: 'pm'
                    {
                    string_literal53=(Token)match(input,40,FOLLOW_40_in_meridian_indicator639);  
                    stream_40.add(string_literal53);



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
                    // 98:10: -> AM_PM[\"pm\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(AM_PM, "pm"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:99:5: 'p'
                    {
                    char_literal54=(Token)match(input,41,FOLLOW_41_in_meridian_indicator650);  
                    stream_41.add(char_literal54);



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
                    // 99:10: -> AM_PM[\"pm\"]
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:102:1: date_separator : ( '-' | '/' );
    public final DateParser.date_separator_return date_separator() throws RecognitionException {
        DateParser.date_separator_return retval = new DateParser.date_separator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set55=null;

        Object set55_tree=null;

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:103:3: ( '-' | '/' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:
            {
            root_0 = (Object)adaptor.nil();

            set55=(Token)input.LT(1);
            if ( (input.LA(1)>=42 && input.LA(1)<=43) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set55));
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:107:1: relative_prefix : ( 'last' -> DIRECTION[\"<\"] | 'next' -> DIRECTION[\">\"] );
    public final DateParser.relative_prefix_return relative_prefix() throws RecognitionException {
        DateParser.relative_prefix_return retval = new DateParser.relative_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal56=null;
        Token string_literal57=null;

        Object string_literal56_tree=null;
        Object string_literal57_tree=null;
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:108:3: ( 'last' -> DIRECTION[\"<\"] | 'next' -> DIRECTION[\">\"] )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==44) ) {
                alt19=1;
            }
            else if ( (LA19_0==45) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:108:5: 'last'
                    {
                    string_literal56=(Token)match(input,44,FOLLOW_44_in_relative_prefix690);  
                    stream_44.add(string_literal56);



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
                    // 108:12: -> DIRECTION[\"<\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, "<"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:109:5: 'next'
                    {
                    string_literal57=(Token)match(input,45,FOLLOW_45_in_relative_prefix702);  
                    stream_45.add(string_literal57);



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
                    // 109:12: -> DIRECTION[\">\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, ">"));

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

    public static class prefixable_target_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prefixable_target"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:112:1: prefixable_target : ( day_of_week | DATE_FRAME | YEAR_DATE_FRAME );
    public final DateParser.prefixable_target_return prefixable_target() throws RecognitionException {
        DateParser.prefixable_target_return retval = new DateParser.prefixable_target_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DATE_FRAME59=null;
        Token YEAR_DATE_FRAME60=null;
        DateParser.day_of_week_return day_of_week58 = null;


        Object DATE_FRAME59_tree=null;
        Object YEAR_DATE_FRAME60_tree=null;

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:113:3: ( day_of_week | DATE_FRAME | YEAR_DATE_FRAME )
            int alt20=3;
            switch ( input.LA(1) ) {
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
                {
                alt20=1;
                }
                break;
            case DATE_FRAME:
                {
                alt20=2;
                }
                break;
            case YEAR_DATE_FRAME:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:113:5: day_of_week
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_day_of_week_in_prefixable_target723);
                    day_of_week58=day_of_week();

                    state._fsp--;

                    adaptor.addChild(root_0, day_of_week58.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:114:5: DATE_FRAME
                    {
                    root_0 = (Object)adaptor.nil();

                    DATE_FRAME59=(Token)match(input,DATE_FRAME,FOLLOW_DATE_FRAME_in_prefixable_target730); 
                    DATE_FRAME59_tree = (Object)adaptor.create(DATE_FRAME59);
                    adaptor.addChild(root_0, DATE_FRAME59_tree);


                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:115:5: YEAR_DATE_FRAME
                    {
                    root_0 = (Object)adaptor.nil();

                    YEAR_DATE_FRAME60=(Token)match(input,YEAR_DATE_FRAME,FOLLOW_YEAR_DATE_FRAME_in_prefixable_target736); 
                    YEAR_DATE_FRAME60_tree = (Object)adaptor.create(YEAR_DATE_FRAME60);
                    adaptor.addChild(root_0, YEAR_DATE_FRAME60_tree);


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

    public static class day_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "day"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:119:1: day : ( 'first' -> DAY[\"1\"] | '1st' -> DAY[\"1\"] | 'second' -> DAY[\"2\"] | '2nd' -> DAY[\"2\"] | 'third' -> DAY[\"3\"] | '3rd' -> DAY[\"3\"] | 'fourth' -> DAY[\"4\"] | '4th' -> DAY[\"4\"] | 'fifth' -> DAY[\"5\"] | '5th' -> DAY[\"5\"] | 'sixth' -> DAY[\"6\"] | '6th' -> DAY[\"6\"] | 'seventh' -> DAY[\"7\"] | '7th' -> DAY[\"7\"] | 'eighth' -> DAY[\"8\"] | '8th' -> DAY[\"8\"] | 'ninth' -> DAY[\"9\"] | '9th' -> DAY[\"9\"] | 'tenth' -> DAY[\"10\"] | '10th' -> DAY[\"10\"] | 'eleventh' -> DAY[\"11\"] | '11th' -> DAY[\"11\"] | 'twelfth' -> DAY[\"12\"] | '12th' -> DAY[\"12\"] | 'thirteenth' -> DAY[\"13\"] | '13th' -> DAY[\"13\"] | 'fourteenth' -> DAY[\"14\"] | '14th' -> DAY[\"14\"] | 'fifteenth' -> DAY[\"15\"] | '15th' -> DAY[\"15\"] | 'sixteenth' -> DAY[\"16\"] | '16th' -> DAY[\"16\"] | 'seventeenth' -> DAY[\"17\"] | '17th' -> DAY[\"17\"] | 'eighteenth' -> DAY[\"18\"] | '18th' -> DAY[\"18\"] | 'nineteenth' -> DAY[\"19\"] | '19th' -> DAY[\"19\"] | 'twentieth' -> DAY[\"20\"] | '20th' -> DAY[\"20\"] | 'twenty' ( '-' )? 'first' -> DAY[\"21\"] | '21st' -> DAY[\"21\"] | 'twenty' ( '-' )? 'second' -> DAY[\"22\"] | '22nd' -> DAY[\"22\"] | 'twenty' ( '-' )? 'third' -> DAY[\"23\"] | '23rd' -> DAY[\"23\"] | 'twenty' ( '-' )? 'fourth' -> DAY[\"24\"] | '24th' -> DAY[\"24\"] | 'twenty' ( '-' )? 'fifth' -> DAY[\"25\"] | '25th' -> DAY[\"25\"] | 'twenty' ( '-' )? 'sixth' -> DAY[\"26\"] | '26th' -> DAY[\"26\"] | 'twenty' ( '-' )? 'seventh' -> DAY[\"27\"] | '27th' -> DAY[\"27\"] | 'twenty' ( '-' )? 'eighth' -> DAY[\"28\"] | '28th' -> DAY[\"28\"] | 'twenty' ( '-' )? 'ninth' -> DAY[\"29\"] | '29th' -> DAY[\"29\"] | 'thirtieth' -> DAY[\"30\"] | '30th' -> DAY[\"30\"] | 'thirty' ( '-' )? 'first' -> DAY[\"31\"] | '31st' -> DAY[\"31\"] );
    public final DateParser.day_return day() throws RecognitionException {
        DateParser.day_return retval = new DateParser.day_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal61=null;
        Token string_literal62=null;
        Token string_literal63=null;
        Token string_literal64=null;
        Token string_literal65=null;
        Token string_literal66=null;
        Token string_literal67=null;
        Token string_literal68=null;
        Token string_literal69=null;
        Token string_literal70=null;
        Token string_literal71=null;
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
        Token string_literal95=null;
        Token string_literal96=null;
        Token string_literal97=null;
        Token string_literal98=null;
        Token string_literal99=null;
        Token string_literal100=null;
        Token string_literal101=null;
        Token char_literal102=null;
        Token string_literal103=null;
        Token string_literal104=null;
        Token string_literal105=null;
        Token char_literal106=null;
        Token string_literal107=null;
        Token string_literal108=null;
        Token string_literal109=null;
        Token char_literal110=null;
        Token string_literal111=null;
        Token string_literal112=null;
        Token string_literal113=null;
        Token char_literal114=null;
        Token string_literal115=null;
        Token string_literal116=null;
        Token string_literal117=null;
        Token char_literal118=null;
        Token string_literal119=null;
        Token string_literal120=null;
        Token string_literal121=null;
        Token char_literal122=null;
        Token string_literal123=null;
        Token string_literal124=null;
        Token string_literal125=null;
        Token char_literal126=null;
        Token string_literal127=null;
        Token string_literal128=null;
        Token string_literal129=null;
        Token char_literal130=null;
        Token string_literal131=null;
        Token string_literal132=null;
        Token string_literal133=null;
        Token char_literal134=null;
        Token string_literal135=null;
        Token string_literal136=null;
        Token string_literal137=null;
        Token string_literal138=null;
        Token string_literal139=null;
        Token char_literal140=null;
        Token string_literal141=null;
        Token string_literal142=null;

        Object string_literal61_tree=null;
        Object string_literal62_tree=null;
        Object string_literal63_tree=null;
        Object string_literal64_tree=null;
        Object string_literal65_tree=null;
        Object string_literal66_tree=null;
        Object string_literal67_tree=null;
        Object string_literal68_tree=null;
        Object string_literal69_tree=null;
        Object string_literal70_tree=null;
        Object string_literal71_tree=null;
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
        Object string_literal95_tree=null;
        Object string_literal96_tree=null;
        Object string_literal97_tree=null;
        Object string_literal98_tree=null;
        Object string_literal99_tree=null;
        Object string_literal100_tree=null;
        Object string_literal101_tree=null;
        Object char_literal102_tree=null;
        Object string_literal103_tree=null;
        Object string_literal104_tree=null;
        Object string_literal105_tree=null;
        Object char_literal106_tree=null;
        Object string_literal107_tree=null;
        Object string_literal108_tree=null;
        Object string_literal109_tree=null;
        Object char_literal110_tree=null;
        Object string_literal111_tree=null;
        Object string_literal112_tree=null;
        Object string_literal113_tree=null;
        Object char_literal114_tree=null;
        Object string_literal115_tree=null;
        Object string_literal116_tree=null;
        Object string_literal117_tree=null;
        Object char_literal118_tree=null;
        Object string_literal119_tree=null;
        Object string_literal120_tree=null;
        Object string_literal121_tree=null;
        Object char_literal122_tree=null;
        Object string_literal123_tree=null;
        Object string_literal124_tree=null;
        Object string_literal125_tree=null;
        Object char_literal126_tree=null;
        Object string_literal127_tree=null;
        Object string_literal128_tree=null;
        Object string_literal129_tree=null;
        Object char_literal130_tree=null;
        Object string_literal131_tree=null;
        Object string_literal132_tree=null;
        Object string_literal133_tree=null;
        Object char_literal134_tree=null;
        Object string_literal135_tree=null;
        Object string_literal136_tree=null;
        Object string_literal137_tree=null;
        Object string_literal138_tree=null;
        Object string_literal139_tree=null;
        Object char_literal140_tree=null;
        Object string_literal141_tree=null;
        Object string_literal142_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:120:3: ( 'first' -> DAY[\"1\"] | '1st' -> DAY[\"1\"] | 'second' -> DAY[\"2\"] | '2nd' -> DAY[\"2\"] | 'third' -> DAY[\"3\"] | '3rd' -> DAY[\"3\"] | 'fourth' -> DAY[\"4\"] | '4th' -> DAY[\"4\"] | 'fifth' -> DAY[\"5\"] | '5th' -> DAY[\"5\"] | 'sixth' -> DAY[\"6\"] | '6th' -> DAY[\"6\"] | 'seventh' -> DAY[\"7\"] | '7th' -> DAY[\"7\"] | 'eighth' -> DAY[\"8\"] | '8th' -> DAY[\"8\"] | 'ninth' -> DAY[\"9\"] | '9th' -> DAY[\"9\"] | 'tenth' -> DAY[\"10\"] | '10th' -> DAY[\"10\"] | 'eleventh' -> DAY[\"11\"] | '11th' -> DAY[\"11\"] | 'twelfth' -> DAY[\"12\"] | '12th' -> DAY[\"12\"] | 'thirteenth' -> DAY[\"13\"] | '13th' -> DAY[\"13\"] | 'fourteenth' -> DAY[\"14\"] | '14th' -> DAY[\"14\"] | 'fifteenth' -> DAY[\"15\"] | '15th' -> DAY[\"15\"] | 'sixteenth' -> DAY[\"16\"] | '16th' -> DAY[\"16\"] | 'seventeenth' -> DAY[\"17\"] | '17th' -> DAY[\"17\"] | 'eighteenth' -> DAY[\"18\"] | '18th' -> DAY[\"18\"] | 'nineteenth' -> DAY[\"19\"] | '19th' -> DAY[\"19\"] | 'twentieth' -> DAY[\"20\"] | '20th' -> DAY[\"20\"] | 'twenty' ( '-' )? 'first' -> DAY[\"21\"] | '21st' -> DAY[\"21\"] | 'twenty' ( '-' )? 'second' -> DAY[\"22\"] | '22nd' -> DAY[\"22\"] | 'twenty' ( '-' )? 'third' -> DAY[\"23\"] | '23rd' -> DAY[\"23\"] | 'twenty' ( '-' )? 'fourth' -> DAY[\"24\"] | '24th' -> DAY[\"24\"] | 'twenty' ( '-' )? 'fifth' -> DAY[\"25\"] | '25th' -> DAY[\"25\"] | 'twenty' ( '-' )? 'sixth' -> DAY[\"26\"] | '26th' -> DAY[\"26\"] | 'twenty' ( '-' )? 'seventh' -> DAY[\"27\"] | '27th' -> DAY[\"27\"] | 'twenty' ( '-' )? 'eighth' -> DAY[\"28\"] | '28th' -> DAY[\"28\"] | 'twenty' ( '-' )? 'ninth' -> DAY[\"29\"] | '29th' -> DAY[\"29\"] | 'thirtieth' -> DAY[\"30\"] | '30th' -> DAY[\"30\"] | 'thirty' ( '-' )? 'first' -> DAY[\"31\"] | '31st' -> DAY[\"31\"] )
            int alt31=62;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:120:5: 'first'
                    {
                    string_literal61=(Token)match(input,46,FOLLOW_46_in_day752);  
                    stream_46.add(string_literal61);



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
                    // 120:29: -> DAY[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "1"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:121:5: '1st'
                    {
                    string_literal62=(Token)match(input,47,FOLLOW_47_in_day779);  
                    stream_47.add(string_literal62);



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
                    // 121:29: -> DAY[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "1"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:122:5: 'second'
                    {
                    string_literal63=(Token)match(input,48,FOLLOW_48_in_day808);  
                    stream_48.add(string_literal63);



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
                    // 122:29: -> DAY[\"2\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "2"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:123:5: '2nd'
                    {
                    string_literal64=(Token)match(input,49,FOLLOW_49_in_day834);  
                    stream_49.add(string_literal64);



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
                    // 123:29: -> DAY[\"2\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "2"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:124:5: 'third'
                    {
                    string_literal65=(Token)match(input,50,FOLLOW_50_in_day863);  
                    stream_50.add(string_literal65);



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
                    // 124:29: -> DAY[\"3\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "3"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:125:5: '3rd'
                    {
                    string_literal66=(Token)match(input,51,FOLLOW_51_in_day890);  
                    stream_51.add(string_literal66);



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
                    // 125:29: -> DAY[\"3\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "3"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:126:5: 'fourth'
                    {
                    string_literal67=(Token)match(input,52,FOLLOW_52_in_day919);  
                    stream_52.add(string_literal67);



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
                    // 126:29: -> DAY[\"4\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "4"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:127:5: '4th'
                    {
                    string_literal68=(Token)match(input,53,FOLLOW_53_in_day945);  
                    stream_53.add(string_literal68);



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
                    // 127:29: -> DAY[\"4\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "4"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 9 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:128:5: 'fifth'
                    {
                    string_literal69=(Token)match(input,54,FOLLOW_54_in_day974);  
                    stream_54.add(string_literal69);



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
                    // 128:29: -> DAY[\"5\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "5"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 10 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:129:5: '5th'
                    {
                    string_literal70=(Token)match(input,55,FOLLOW_55_in_day1001);  
                    stream_55.add(string_literal70);



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
                    // 129:29: -> DAY[\"5\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "5"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 11 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:130:5: 'sixth'
                    {
                    string_literal71=(Token)match(input,56,FOLLOW_56_in_day1030);  
                    stream_56.add(string_literal71);



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
                    // 130:29: -> DAY[\"6\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "6"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 12 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:131:5: '6th'
                    {
                    string_literal72=(Token)match(input,57,FOLLOW_57_in_day1057);  
                    stream_57.add(string_literal72);



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
                    // 131:29: -> DAY[\"6\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "6"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 13 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:132:5: 'seventh'
                    {
                    string_literal73=(Token)match(input,58,FOLLOW_58_in_day1086);  
                    stream_58.add(string_literal73);



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
                    // 132:29: -> DAY[\"7\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "7"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 14 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:133:5: '7th'
                    {
                    string_literal74=(Token)match(input,59,FOLLOW_59_in_day1111);  
                    stream_59.add(string_literal74);



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
                    // 133:29: -> DAY[\"7\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "7"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 15 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:134:5: 'eighth'
                    {
                    string_literal75=(Token)match(input,60,FOLLOW_60_in_day1140);  
                    stream_60.add(string_literal75);



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
                    // 134:29: -> DAY[\"8\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "8"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 16 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:135:5: '8th'
                    {
                    string_literal76=(Token)match(input,61,FOLLOW_61_in_day1166);  
                    stream_61.add(string_literal76);



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
                    // 135:29: -> DAY[\"8\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "8"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 17 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:136:5: 'ninth'
                    {
                    string_literal77=(Token)match(input,62,FOLLOW_62_in_day1195);  
                    stream_62.add(string_literal77);



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
                    // 136:29: -> DAY[\"9\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "9"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 18 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:137:5: '9th'
                    {
                    string_literal78=(Token)match(input,63,FOLLOW_63_in_day1222);  
                    stream_63.add(string_literal78);



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
                    // 137:29: -> DAY[\"9\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "9"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 19 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:138:5: 'tenth'
                    {
                    string_literal79=(Token)match(input,64,FOLLOW_64_in_day1251);  
                    stream_64.add(string_literal79);



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
                    // 138:29: -> DAY[\"10\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "10"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 20 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:139:5: '10th'
                    {
                    string_literal80=(Token)match(input,65,FOLLOW_65_in_day1278);  
                    stream_65.add(string_literal80);



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
                    // 139:29: -> DAY[\"10\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "10"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 21 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:140:5: 'eleventh'
                    {
                    string_literal81=(Token)match(input,66,FOLLOW_66_in_day1306);  
                    stream_66.add(string_literal81);



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
                    // 140:29: -> DAY[\"11\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "11"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 22 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:141:5: '11th'
                    {
                    string_literal82=(Token)match(input,67,FOLLOW_67_in_day1330);  
                    stream_67.add(string_literal82);



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
                    // 141:29: -> DAY[\"11\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "11"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 23 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:142:5: 'twelfth'
                    {
                    string_literal83=(Token)match(input,68,FOLLOW_68_in_day1358);  
                    stream_68.add(string_literal83);



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
                    // 142:29: -> DAY[\"12\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "12"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 24 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:143:5: '12th'
                    {
                    string_literal84=(Token)match(input,69,FOLLOW_69_in_day1383);  
                    stream_69.add(string_literal84);



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
                    // 143:29: -> DAY[\"12\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "12"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 25 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:144:5: 'thirteenth'
                    {
                    string_literal85=(Token)match(input,70,FOLLOW_70_in_day1411);  
                    stream_70.add(string_literal85);



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
                    // 144:29: -> DAY[\"13\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "13"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 26 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:145:5: '13th'
                    {
                    string_literal86=(Token)match(input,71,FOLLOW_71_in_day1433);  
                    stream_71.add(string_literal86);



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
                    // 145:29: -> DAY[\"13\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "13"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 27 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:146:5: 'fourteenth'
                    {
                    string_literal87=(Token)match(input,72,FOLLOW_72_in_day1461);  
                    stream_72.add(string_literal87);



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
                    // 146:29: -> DAY[\"14\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "14"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 28 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:147:5: '14th'
                    {
                    string_literal88=(Token)match(input,73,FOLLOW_73_in_day1483);  
                    stream_73.add(string_literal88);



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
                    // 147:29: -> DAY[\"14\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "14"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 29 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:148:5: 'fifteenth'
                    {
                    string_literal89=(Token)match(input,74,FOLLOW_74_in_day1511);  
                    stream_74.add(string_literal89);



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
                    // 148:29: -> DAY[\"15\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "15"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 30 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:149:5: '15th'
                    {
                    string_literal90=(Token)match(input,75,FOLLOW_75_in_day1534);  
                    stream_75.add(string_literal90);



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
                    // 149:29: -> DAY[\"15\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "15"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 31 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:150:5: 'sixteenth'
                    {
                    string_literal91=(Token)match(input,76,FOLLOW_76_in_day1562);  
                    stream_76.add(string_literal91);



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
                    // 150:29: -> DAY[\"16\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "16"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 32 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:151:5: '16th'
                    {
                    string_literal92=(Token)match(input,77,FOLLOW_77_in_day1585);  
                    stream_77.add(string_literal92);



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
                    // 151:29: -> DAY[\"16\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "16"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 33 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:152:5: 'seventeenth'
                    {
                    string_literal93=(Token)match(input,78,FOLLOW_78_in_day1613);  
                    stream_78.add(string_literal93);



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
                    // 152:29: -> DAY[\"17\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "17"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 34 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:153:5: '17th'
                    {
                    string_literal94=(Token)match(input,79,FOLLOW_79_in_day1634);  
                    stream_79.add(string_literal94);



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
                    // 153:29: -> DAY[\"17\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "17"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 35 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:154:5: 'eighteenth'
                    {
                    string_literal95=(Token)match(input,80,FOLLOW_80_in_day1662);  
                    stream_80.add(string_literal95);



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
                    // 154:29: -> DAY[\"18\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "18"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 36 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:155:5: '18th'
                    {
                    string_literal96=(Token)match(input,81,FOLLOW_81_in_day1684);  
                    stream_81.add(string_literal96);



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
                    // 155:29: -> DAY[\"18\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "18"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 37 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:156:5: 'nineteenth'
                    {
                    string_literal97=(Token)match(input,82,FOLLOW_82_in_day1712);  
                    stream_82.add(string_literal97);



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
                    // 156:29: -> DAY[\"19\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "19"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 38 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:157:5: '19th'
                    {
                    string_literal98=(Token)match(input,83,FOLLOW_83_in_day1734);  
                    stream_83.add(string_literal98);



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
                    // 157:29: -> DAY[\"19\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "19"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 39 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:158:5: 'twentieth'
                    {
                    string_literal99=(Token)match(input,84,FOLLOW_84_in_day1762);  
                    stream_84.add(string_literal99);



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
                    // 158:29: -> DAY[\"20\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "20"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 40 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:159:5: '20th'
                    {
                    string_literal100=(Token)match(input,85,FOLLOW_85_in_day1785);  
                    stream_85.add(string_literal100);



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
                    // 159:29: -> DAY[\"20\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "20"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 41 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:160:5: 'twenty' ( '-' )? 'first'
                    {
                    string_literal101=(Token)match(input,86,FOLLOW_86_in_day1813);  
                    stream_86.add(string_literal101);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:160:14: ( '-' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==42) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:160:14: '-'
                            {
                            char_literal102=(Token)match(input,42,FOLLOW_42_in_day1815);  
                            stream_42.add(char_literal102);


                            }
                            break;

                    }

                    string_literal103=(Token)match(input,46,FOLLOW_46_in_day1818);  
                    stream_46.add(string_literal103);



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
                    // 160:29: -> DAY[\"21\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "21"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 42 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:161:5: '21st'
                    {
                    string_literal104=(Token)match(input,87,FOLLOW_87_in_day1831);  
                    stream_87.add(string_literal104);



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
                    // 161:29: -> DAY[\"21\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "21"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 43 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:162:5: 'twenty' ( '-' )? 'second'
                    {
                    string_literal105=(Token)match(input,86,FOLLOW_86_in_day1859);  
                    stream_86.add(string_literal105);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:162:14: ( '-' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==42) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:162:14: '-'
                            {
                            char_literal106=(Token)match(input,42,FOLLOW_42_in_day1861);  
                            stream_42.add(char_literal106);


                            }
                            break;

                    }

                    string_literal107=(Token)match(input,48,FOLLOW_48_in_day1864);  
                    stream_48.add(string_literal107);



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
                    // 162:29: -> DAY[\"22\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "22"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 44 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:163:5: '22nd'
                    {
                    string_literal108=(Token)match(input,88,FOLLOW_88_in_day1876);  
                    stream_88.add(string_literal108);



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
                    // 163:29: -> DAY[\"22\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "22"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 45 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:164:5: 'twenty' ( '-' )? 'third'
                    {
                    string_literal109=(Token)match(input,86,FOLLOW_86_in_day1904);  
                    stream_86.add(string_literal109);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:164:14: ( '-' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==42) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:164:14: '-'
                            {
                            char_literal110=(Token)match(input,42,FOLLOW_42_in_day1906);  
                            stream_42.add(char_literal110);


                            }
                            break;

                    }

                    string_literal111=(Token)match(input,50,FOLLOW_50_in_day1909);  
                    stream_50.add(string_literal111);



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
                    // 164:29: -> DAY[\"23\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "23"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 46 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:165:5: '23rd'
                    {
                    string_literal112=(Token)match(input,89,FOLLOW_89_in_day1922);  
                    stream_89.add(string_literal112);



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
                    // 165:29: -> DAY[\"23\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "23"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 47 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:166:5: 'twenty' ( '-' )? 'fourth'
                    {
                    string_literal113=(Token)match(input,86,FOLLOW_86_in_day1950);  
                    stream_86.add(string_literal113);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:166:14: ( '-' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==42) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:166:14: '-'
                            {
                            char_literal114=(Token)match(input,42,FOLLOW_42_in_day1952);  
                            stream_42.add(char_literal114);


                            }
                            break;

                    }

                    string_literal115=(Token)match(input,52,FOLLOW_52_in_day1955);  
                    stream_52.add(string_literal115);



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
                    // 166:29: -> DAY[\"24\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "24"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 48 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:167:5: '24th'
                    {
                    string_literal116=(Token)match(input,90,FOLLOW_90_in_day1967);  
                    stream_90.add(string_literal116);



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
                    // 167:29: -> DAY[\"24\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "24"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 49 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:168:5: 'twenty' ( '-' )? 'fifth'
                    {
                    string_literal117=(Token)match(input,86,FOLLOW_86_in_day1995);  
                    stream_86.add(string_literal117);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:168:14: ( '-' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==42) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:168:14: '-'
                            {
                            char_literal118=(Token)match(input,42,FOLLOW_42_in_day1997);  
                            stream_42.add(char_literal118);


                            }
                            break;

                    }

                    string_literal119=(Token)match(input,54,FOLLOW_54_in_day2000);  
                    stream_54.add(string_literal119);



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
                    // 168:29: -> DAY[\"25\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "25"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 50 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:169:5: '25th'
                    {
                    string_literal120=(Token)match(input,91,FOLLOW_91_in_day2013);  
                    stream_91.add(string_literal120);



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
                    // 169:29: -> DAY[\"25\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "25"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 51 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:170:5: 'twenty' ( '-' )? 'sixth'
                    {
                    string_literal121=(Token)match(input,86,FOLLOW_86_in_day2041);  
                    stream_86.add(string_literal121);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:170:14: ( '-' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==42) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:170:14: '-'
                            {
                            char_literal122=(Token)match(input,42,FOLLOW_42_in_day2043);  
                            stream_42.add(char_literal122);


                            }
                            break;

                    }

                    string_literal123=(Token)match(input,56,FOLLOW_56_in_day2046);  
                    stream_56.add(string_literal123);



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
                    // 170:29: -> DAY[\"26\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "26"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 52 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:171:5: '26th'
                    {
                    string_literal124=(Token)match(input,92,FOLLOW_92_in_day2059);  
                    stream_92.add(string_literal124);



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
                    // 171:29: -> DAY[\"26\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "26"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 53 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:172:5: 'twenty' ( '-' )? 'seventh'
                    {
                    string_literal125=(Token)match(input,86,FOLLOW_86_in_day2087);  
                    stream_86.add(string_literal125);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:172:14: ( '-' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==42) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:172:14: '-'
                            {
                            char_literal126=(Token)match(input,42,FOLLOW_42_in_day2089);  
                            stream_42.add(char_literal126);


                            }
                            break;

                    }

                    string_literal127=(Token)match(input,58,FOLLOW_58_in_day2092);  
                    stream_58.add(string_literal127);



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
                    // 172:29: -> DAY[\"27\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "27"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 54 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:173:5: '27th'
                    {
                    string_literal128=(Token)match(input,93,FOLLOW_93_in_day2103);  
                    stream_93.add(string_literal128);



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
                    // 173:29: -> DAY[\"27\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "27"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 55 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:174:5: 'twenty' ( '-' )? 'eighth'
                    {
                    string_literal129=(Token)match(input,86,FOLLOW_86_in_day2131);  
                    stream_86.add(string_literal129);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:174:14: ( '-' )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==42) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:174:14: '-'
                            {
                            char_literal130=(Token)match(input,42,FOLLOW_42_in_day2133);  
                            stream_42.add(char_literal130);


                            }
                            break;

                    }

                    string_literal131=(Token)match(input,60,FOLLOW_60_in_day2136);  
                    stream_60.add(string_literal131);



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
                    // 174:29: -> DAY[\"28\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "28"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 56 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:175:5: '28th'
                    {
                    string_literal132=(Token)match(input,94,FOLLOW_94_in_day2148);  
                    stream_94.add(string_literal132);



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
                    // 175:29: -> DAY[\"28\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "28"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 57 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:176:5: 'twenty' ( '-' )? 'ninth'
                    {
                    string_literal133=(Token)match(input,86,FOLLOW_86_in_day2176);  
                    stream_86.add(string_literal133);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:176:14: ( '-' )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==42) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:176:14: '-'
                            {
                            char_literal134=(Token)match(input,42,FOLLOW_42_in_day2178);  
                            stream_42.add(char_literal134);


                            }
                            break;

                    }

                    string_literal135=(Token)match(input,62,FOLLOW_62_in_day2181);  
                    stream_62.add(string_literal135);



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
                    // 176:29: -> DAY[\"29\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "29"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 58 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:177:5: '29th'
                    {
                    string_literal136=(Token)match(input,95,FOLLOW_95_in_day2194);  
                    stream_95.add(string_literal136);



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
                    // 177:29: -> DAY[\"29\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "29"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 59 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:178:5: 'thirtieth'
                    {
                    string_literal137=(Token)match(input,96,FOLLOW_96_in_day2222);  
                    stream_96.add(string_literal137);



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
                    // 178:29: -> DAY[\"30\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "30"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 60 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:179:5: '30th'
                    {
                    string_literal138=(Token)match(input,97,FOLLOW_97_in_day2245);  
                    stream_97.add(string_literal138);



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
                    // 179:29: -> DAY[\"30\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "30"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 61 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:180:5: 'thirty' ( '-' )? 'first'
                    {
                    string_literal139=(Token)match(input,98,FOLLOW_98_in_day2273);  
                    stream_98.add(string_literal139);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:180:14: ( '-' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==42) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:180:14: '-'
                            {
                            char_literal140=(Token)match(input,42,FOLLOW_42_in_day2275);  
                            stream_42.add(char_literal140);


                            }
                            break;

                    }

                    string_literal141=(Token)match(input,46,FOLLOW_46_in_day2278);  
                    stream_46.add(string_literal141);



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
                    // 180:29: -> DAY[\"31\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "31"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 62 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:181:5: '31st'
                    {
                    string_literal142=(Token)match(input,99,FOLLOW_99_in_day2291);  
                    stream_99.add(string_literal142);



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
                    // 181:29: -> DAY[\"31\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY, "31"));

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:185:1: month : ( 'january' -> MONTH[\"1\"] | 'jan' -> MONTH[\"1\"] | 'february' -> MONTH[\"2\"] | 'feb' -> MONTH[\"2\"] | 'march' -> MONTH[\"3\"] | 'mar' -> MONTH[\"3\"] | 'april' -> MONTH[\"4\"] | 'apr' -> MONTH[\"4\"] | 'may' -> MONTH[\"5\"] | 'june' -> MONTH[\"6\"] | 'jun' -> MONTH[\"6\"] | 'july' -> MONTH[\"7\"] | 'jul' -> MONTH[\"7\"] | 'august' -> MONTH[\"8\"] | 'aug' -> MONTH[\"8\"] | 'september' -> MONTH[\"9\"] | 'sep' -> MONTH[\"9\"] | 'october' -> MONTH[\"10\"] | 'oct' -> MONTH[\"10\"] | 'november' -> MONTH[\"11\"] | 'nov' -> MONTH[\"11\"] | 'december' -> MONTH[\"12\"] | 'dec' -> MONTH[\"12\"] );
    public final DateParser.month_return month() throws RecognitionException {
        DateParser.month_return retval = new DateParser.month_return();
        retval.start = input.LT(1);

        Object root_0 = null;

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
        Token string_literal163=null;
        Token string_literal164=null;
        Token string_literal165=null;

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
        Object string_literal163_tree=null;
        Object string_literal164_tree=null;
        Object string_literal165_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:186:3: ( 'january' -> MONTH[\"1\"] | 'jan' -> MONTH[\"1\"] | 'february' -> MONTH[\"2\"] | 'feb' -> MONTH[\"2\"] | 'march' -> MONTH[\"3\"] | 'mar' -> MONTH[\"3\"] | 'april' -> MONTH[\"4\"] | 'apr' -> MONTH[\"4\"] | 'may' -> MONTH[\"5\"] | 'june' -> MONTH[\"6\"] | 'jun' -> MONTH[\"6\"] | 'july' -> MONTH[\"7\"] | 'jul' -> MONTH[\"7\"] | 'august' -> MONTH[\"8\"] | 'aug' -> MONTH[\"8\"] | 'september' -> MONTH[\"9\"] | 'sep' -> MONTH[\"9\"] | 'october' -> MONTH[\"10\"] | 'oct' -> MONTH[\"10\"] | 'november' -> MONTH[\"11\"] | 'nov' -> MONTH[\"11\"] | 'december' -> MONTH[\"12\"] | 'dec' -> MONTH[\"12\"] )
            int alt32=23;
            switch ( input.LA(1) ) {
            case 100:
                {
                alt32=1;
                }
                break;
            case 101:
                {
                alt32=2;
                }
                break;
            case 102:
                {
                alt32=3;
                }
                break;
            case 103:
                {
                alt32=4;
                }
                break;
            case 104:
                {
                alt32=5;
                }
                break;
            case 105:
                {
                alt32=6;
                }
                break;
            case 106:
                {
                alt32=7;
                }
                break;
            case 107:
                {
                alt32=8;
                }
                break;
            case 108:
                {
                alt32=9;
                }
                break;
            case 109:
                {
                alt32=10;
                }
                break;
            case 110:
                {
                alt32=11;
                }
                break;
            case 111:
                {
                alt32=12;
                }
                break;
            case 112:
                {
                alt32=13;
                }
                break;
            case 113:
                {
                alt32=14;
                }
                break;
            case 114:
                {
                alt32=15;
                }
                break;
            case 115:
                {
                alt32=16;
                }
                break;
            case 116:
                {
                alt32=17;
                }
                break;
            case 117:
                {
                alt32=18;
                }
                break;
            case 118:
                {
                alt32=19;
                }
                break;
            case 119:
                {
                alt32=20;
                }
                break;
            case 120:
                {
                alt32=21;
                }
                break;
            case 121:
                {
                alt32=22;
                }
                break;
            case 122:
                {
                alt32=23;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:186:5: 'january'
                    {
                    string_literal143=(Token)match(input,100,FOLLOW_100_in_month2327);  
                    stream_100.add(string_literal143);



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
                    // 186:16: -> MONTH[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "1"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:187:5: 'jan'
                    {
                    string_literal144=(Token)match(input,101,FOLLOW_101_in_month2339);  
                    stream_101.add(string_literal144);



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
                    // 187:16: -> MONTH[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "1"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:188:5: 'february'
                    {
                    string_literal145=(Token)match(input,102,FOLLOW_102_in_month2355);  
                    stream_102.add(string_literal145);



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
                    // 188:16: -> MONTH[\"2\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "2"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:189:5: 'feb'
                    {
                    string_literal146=(Token)match(input,103,FOLLOW_103_in_month2366);  
                    stream_103.add(string_literal146);



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
                    // 189:16: -> MONTH[\"2\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "2"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:190:5: 'march'
                    {
                    string_literal147=(Token)match(input,104,FOLLOW_104_in_month2382);  
                    stream_104.add(string_literal147);



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
                    // 190:16: -> MONTH[\"3\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "3"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:191:5: 'mar'
                    {
                    string_literal148=(Token)match(input,105,FOLLOW_105_in_month2396);  
                    stream_105.add(string_literal148);



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
                    // 191:16: -> MONTH[\"3\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "3"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:192:5: 'april'
                    {
                    string_literal149=(Token)match(input,106,FOLLOW_106_in_month2412);  
                    stream_106.add(string_literal149);



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
                    // 192:16: -> MONTH[\"4\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "4"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:193:5: 'apr'
                    {
                    string_literal150=(Token)match(input,107,FOLLOW_107_in_month2426);  
                    stream_107.add(string_literal150);



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
                    // 193:16: -> MONTH[\"4\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "4"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 9 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:194:5: 'may'
                    {
                    string_literal151=(Token)match(input,108,FOLLOW_108_in_month2442);  
                    stream_108.add(string_literal151);



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
                    // 194:16: -> MONTH[\"5\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "5"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 10 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:195:5: 'june'
                    {
                    string_literal152=(Token)match(input,109,FOLLOW_109_in_month2458);  
                    stream_109.add(string_literal152);



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
                    // 195:16: -> MONTH[\"6\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "6"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 11 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:196:5: 'jun'
                    {
                    string_literal153=(Token)match(input,110,FOLLOW_110_in_month2473);  
                    stream_110.add(string_literal153);



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
                    // 196:16: -> MONTH[\"6\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "6"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 12 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:197:5: 'july'
                    {
                    string_literal154=(Token)match(input,111,FOLLOW_111_in_month2489);  
                    stream_111.add(string_literal154);



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
                    // 197:16: -> MONTH[\"7\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "7"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 13 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:198:5: 'jul'
                    {
                    string_literal155=(Token)match(input,112,FOLLOW_112_in_month2504);  
                    stream_112.add(string_literal155);



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
                    // 198:16: -> MONTH[\"7\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "7"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 14 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:199:5: 'august'
                    {
                    string_literal156=(Token)match(input,113,FOLLOW_113_in_month2520);  
                    stream_113.add(string_literal156);



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
                    // 199:16: -> MONTH[\"8\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "8"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 15 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:200:5: 'aug'
                    {
                    string_literal157=(Token)match(input,114,FOLLOW_114_in_month2533);  
                    stream_114.add(string_literal157);



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
                    // 200:16: -> MONTH[\"8\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "8"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 16 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:201:5: 'september'
                    {
                    string_literal158=(Token)match(input,115,FOLLOW_115_in_month2549);  
                    stream_115.add(string_literal158);



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
                    // 201:16: -> MONTH[\"9\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "9"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 17 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:202:5: 'sep'
                    {
                    string_literal159=(Token)match(input,116,FOLLOW_116_in_month2559);  
                    stream_116.add(string_literal159);



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
                    // 202:16: -> MONTH[\"9\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "9"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 18 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:203:5: 'october'
                    {
                    string_literal160=(Token)match(input,117,FOLLOW_117_in_month2575);  
                    stream_117.add(string_literal160);



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
                    // 203:16: -> MONTH[\"10\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "10"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 19 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:204:5: 'oct'
                    {
                    string_literal161=(Token)match(input,118,FOLLOW_118_in_month2587);  
                    stream_118.add(string_literal161);



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
                    // 204:16: -> MONTH[\"10\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "10"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 20 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:205:5: 'november'
                    {
                    string_literal162=(Token)match(input,119,FOLLOW_119_in_month2603);  
                    stream_119.add(string_literal162);



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
                    // 205:16: -> MONTH[\"11\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "11"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 21 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:206:5: 'nov'
                    {
                    string_literal163=(Token)match(input,120,FOLLOW_120_in_month2614);  
                    stream_120.add(string_literal163);



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
                    // 206:16: -> MONTH[\"11\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "11"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 22 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:207:5: 'december'
                    {
                    string_literal164=(Token)match(input,121,FOLLOW_121_in_month2630);  
                    stream_121.add(string_literal164);



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
                    // 207:16: -> MONTH[\"12\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(MONTH, "12"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 23 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:208:5: 'dec'
                    {
                    string_literal165=(Token)match(input,122,FOLLOW_122_in_month2641);  
                    stream_122.add(string_literal165);



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
                    // 208:16: -> MONTH[\"12\"]
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

    public static class day_of_week_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "day_of_week"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:212:1: day_of_week : ( 'monday' -> DAY_OF_WEEK[\"2\"] | 'mon' -> DAY_OF_WEEK[\"2\"] | 'tuesday' -> DAY_OF_WEEK[\"3\"] | 'tue' -> DAY_OF_WEEK[\"3\"] | 'tues' -> DAY_OF_WEEK[\"3\"] | 'wednesday' -> DAY_OF_WEEK[\"4\"] | 'wed' -> DAY_OF_WEEK[\"4\"] | 'thursday' -> DAY_OF_WEEK[\"5\"] | 'thur' -> DAY_OF_WEEK[\"5\"] | 'thurs' -> DAY_OF_WEEK[\"5\"] | 'friday' -> DAY_OF_WEEK[\"6\"] | 'fri' -> DAY_OF_WEEK[\"6\"] | 'saturday' -> DAY_OF_WEEK[\"7\"] | 'sat' -> DAY_OF_WEEK[\"7\"] | 'sunday' -> DAY_OF_WEEK[\"1\"] | 'sun' -> DAY_OF_WEEK[\"1\"] );
    public final DateParser.day_of_week_return day_of_week() throws RecognitionException {
        DateParser.day_of_week_return retval = new DateParser.day_of_week_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal166=null;
        Token string_literal167=null;
        Token string_literal168=null;
        Token string_literal169=null;
        Token string_literal170=null;
        Token string_literal171=null;
        Token string_literal172=null;
        Token string_literal173=null;
        Token string_literal174=null;
        Token string_literal175=null;
        Token string_literal176=null;
        Token string_literal177=null;
        Token string_literal178=null;
        Token string_literal179=null;
        Token string_literal180=null;
        Token string_literal181=null;

        Object string_literal166_tree=null;
        Object string_literal167_tree=null;
        Object string_literal168_tree=null;
        Object string_literal169_tree=null;
        Object string_literal170_tree=null;
        Object string_literal171_tree=null;
        Object string_literal172_tree=null;
        Object string_literal173_tree=null;
        Object string_literal174_tree=null;
        Object string_literal175_tree=null;
        Object string_literal176_tree=null;
        Object string_literal177_tree=null;
        Object string_literal178_tree=null;
        Object string_literal179_tree=null;
        Object string_literal180_tree=null;
        Object string_literal181_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleTokenStream stream_138=new RewriteRuleTokenStream(adaptor,"token 138");
        RewriteRuleTokenStream stream_136=new RewriteRuleTokenStream(adaptor,"token 136");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_137=new RewriteRuleTokenStream(adaptor,"token 137");
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:213:3: ( 'monday' -> DAY_OF_WEEK[\"2\"] | 'mon' -> DAY_OF_WEEK[\"2\"] | 'tuesday' -> DAY_OF_WEEK[\"3\"] | 'tue' -> DAY_OF_WEEK[\"3\"] | 'tues' -> DAY_OF_WEEK[\"3\"] | 'wednesday' -> DAY_OF_WEEK[\"4\"] | 'wed' -> DAY_OF_WEEK[\"4\"] | 'thursday' -> DAY_OF_WEEK[\"5\"] | 'thur' -> DAY_OF_WEEK[\"5\"] | 'thurs' -> DAY_OF_WEEK[\"5\"] | 'friday' -> DAY_OF_WEEK[\"6\"] | 'fri' -> DAY_OF_WEEK[\"6\"] | 'saturday' -> DAY_OF_WEEK[\"7\"] | 'sat' -> DAY_OF_WEEK[\"7\"] | 'sunday' -> DAY_OF_WEEK[\"1\"] | 'sun' -> DAY_OF_WEEK[\"1\"] )
            int alt33=16;
            switch ( input.LA(1) ) {
            case 123:
                {
                alt33=1;
                }
                break;
            case 124:
                {
                alt33=2;
                }
                break;
            case 125:
                {
                alt33=3;
                }
                break;
            case 126:
                {
                alt33=4;
                }
                break;
            case 127:
                {
                alt33=5;
                }
                break;
            case 128:
                {
                alt33=6;
                }
                break;
            case 129:
                {
                alt33=7;
                }
                break;
            case 130:
                {
                alt33=8;
                }
                break;
            case 131:
                {
                alt33=9;
                }
                break;
            case 132:
                {
                alt33=10;
                }
                break;
            case 133:
                {
                alt33=11;
                }
                break;
            case 134:
                {
                alt33=12;
                }
                break;
            case 135:
                {
                alt33=13;
                }
                break;
            case 136:
                {
                alt33=14;
                }
                break;
            case 137:
                {
                alt33=15;
                }
                break;
            case 138:
                {
                alt33=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:213:5: 'monday'
                    {
                    string_literal166=(Token)match(input,123,FOLLOW_123_in_day_of_week2667);  
                    stream_123.add(string_literal166);



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
                    // 213:17: -> DAY_OF_WEEK[\"2\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "2"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:214:5: 'mon'
                    {
                    string_literal167=(Token)match(input,124,FOLLOW_124_in_day_of_week2681);  
                    stream_124.add(string_literal167);



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
                    // 214:17: -> DAY_OF_WEEK[\"2\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "2"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:215:5: 'tuesday'
                    {
                    string_literal168=(Token)match(input,125,FOLLOW_125_in_day_of_week2698);  
                    stream_125.add(string_literal168);



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
                    // 215:17: -> DAY_OF_WEEK[\"3\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "3"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:216:5: 'tue'
                    {
                    string_literal169=(Token)match(input,126,FOLLOW_126_in_day_of_week2711);  
                    stream_126.add(string_literal169);



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
                    // 216:17: -> DAY_OF_WEEK[\"3\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "3"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:217:5: 'tues'
                    {
                    string_literal170=(Token)match(input,127,FOLLOW_127_in_day_of_week2728);  
                    stream_127.add(string_literal170);



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
                    // 217:17: -> DAY_OF_WEEK[\"3\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "3"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:218:5: 'wednesday'
                    {
                    string_literal171=(Token)match(input,128,FOLLOW_128_in_day_of_week2744);  
                    stream_128.add(string_literal171);



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
                    // 218:17: -> DAY_OF_WEEK[\"4\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "4"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:219:5: 'wed'
                    {
                    string_literal172=(Token)match(input,129,FOLLOW_129_in_day_of_week2755);  
                    stream_129.add(string_literal172);



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
                    // 219:17: -> DAY_OF_WEEK[\"4\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "4"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:220:5: 'thursday'
                    {
                    string_literal173=(Token)match(input,130,FOLLOW_130_in_day_of_week2772);  
                    stream_130.add(string_literal173);



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
                    // 220:17: -> DAY_OF_WEEK[\"5\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "5"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 9 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:221:5: 'thur'
                    {
                    string_literal174=(Token)match(input,131,FOLLOW_131_in_day_of_week2784);  
                    stream_131.add(string_literal174);



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
                    // 221:17: -> DAY_OF_WEEK[\"5\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "5"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 10 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:222:5: 'thurs'
                    {
                    string_literal175=(Token)match(input,132,FOLLOW_132_in_day_of_week2800);  
                    stream_132.add(string_literal175);



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
                    // 222:17: -> DAY_OF_WEEK[\"5\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "5"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 11 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:223:5: 'friday'
                    {
                    string_literal176=(Token)match(input,133,FOLLOW_133_in_day_of_week2815);  
                    stream_133.add(string_literal176);



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
                    // 223:17: -> DAY_OF_WEEK[\"6\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "6"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 12 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:224:5: 'fri'
                    {
                    string_literal177=(Token)match(input,134,FOLLOW_134_in_day_of_week2829);  
                    stream_134.add(string_literal177);



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
                    // 224:17: -> DAY_OF_WEEK[\"6\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "6"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 13 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:225:5: 'saturday'
                    {
                    string_literal178=(Token)match(input,135,FOLLOW_135_in_day_of_week2846);  
                    stream_135.add(string_literal178);



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
                    // 225:17: -> DAY_OF_WEEK[\"7\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "7"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 14 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:226:5: 'sat'
                    {
                    string_literal179=(Token)match(input,136,FOLLOW_136_in_day_of_week2858);  
                    stream_136.add(string_literal179);



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
                    // 226:17: -> DAY_OF_WEEK[\"7\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "7"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 15 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:227:5: 'sunday'
                    {
                    string_literal180=(Token)match(input,137,FOLLOW_137_in_day_of_week2875);  
                    stream_137.add(string_literal180);



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
                    // 227:17: -> DAY_OF_WEEK[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "1"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 16 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:228:5: 'sun'
                    {
                    string_literal181=(Token)match(input,138,FOLLOW_138_in_day_of_week2889);  
                    stream_138.add(string_literal181);



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
                    // 228:17: -> DAY_OF_WEEK[\"1\"]
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

    public static class day_identifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "day_identifier"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:232:1: day_identifier : ( 'today' -> ^( RELATIVE_DATE DIRECTION[\">\"] INTEGER[\"0\"] ) | tomorrow | 'yesterday' -> ^( RELATIVE_DATE DIRECTION[\"<\"] INTEGER[\"1\"] ) | ( 'the' )? 'day after ' tomorrow -> ^( RELATIVE_DATE DIRECTION[\">\"] INTEGER[\"2\"] ) | ( 'the' )? 'day before yesterday' -> ^( RELATIVE_DATE DIRECTION[\"<\"] INTEGER[\"2\"] ) );
    public final DateParser.day_identifier_return day_identifier() throws RecognitionException {
        DateParser.day_identifier_return retval = new DateParser.day_identifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal182=null;
        Token string_literal184=null;
        Token string_literal185=null;
        Token string_literal186=null;
        Token string_literal188=null;
        Token string_literal189=null;
        DateParser.tomorrow_return tomorrow183 = null;

        DateParser.tomorrow_return tomorrow187 = null;


        Object string_literal182_tree=null;
        Object string_literal184_tree=null;
        Object string_literal185_tree=null;
        Object string_literal186_tree=null;
        Object string_literal188_tree=null;
        Object string_literal189_tree=null;
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
        RewriteRuleTokenStream stream_139=new RewriteRuleTokenStream(adaptor,"token 139");
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
        RewriteRuleTokenStream stream_142=new RewriteRuleTokenStream(adaptor,"token 142");
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");
        RewriteRuleSubtreeStream stream_tomorrow=new RewriteRuleSubtreeStream(adaptor,"rule tomorrow");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:233:3: ( 'today' -> ^( RELATIVE_DATE DIRECTION[\">\"] INTEGER[\"0\"] ) | tomorrow | 'yesterday' -> ^( RELATIVE_DATE DIRECTION[\"<\"] INTEGER[\"1\"] ) | ( 'the' )? 'day after ' tomorrow -> ^( RELATIVE_DATE DIRECTION[\">\"] INTEGER[\"2\"] ) | ( 'the' )? 'day before yesterday' -> ^( RELATIVE_DATE DIRECTION[\"<\"] INTEGER[\"2\"] ) )
            int alt36=5;
            switch ( input.LA(1) ) {
            case 139:
                {
                alt36=1;
                }
                break;
            case 144:
            case 145:
            case 146:
            case 147:
                {
                alt36=2;
                }
                break;
            case 140:
                {
                alt36=3;
                }
                break;
            case 141:
                {
                int LA36_4 = input.LA(2);

                if ( (LA36_4==142) ) {
                    alt36=4;
                }
                else if ( (LA36_4==143) ) {
                    alt36=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 4, input);

                    throw nvae;
                }
                }
                break;
            case 142:
                {
                alt36=4;
                }
                break;
            case 143:
                {
                alt36=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:233:5: 'today'
                    {
                    string_literal182=(Token)match(input,139,FOLLOW_139_in_day_identifier2916);  
                    stream_139.add(string_literal182);



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
                    // 233:13: -> ^( RELATIVE_DATE DIRECTION[\">\"] INTEGER[\"0\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:233:16: ^( RELATIVE_DATE DIRECTION[\">\"] INTEGER[\"0\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(DIRECTION, ">"));
                        adaptor.addChild(root_1, (Object)adaptor.create(INTEGER, "0"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:234:5: tomorrow
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tomorrow_in_day_identifier2934);
                    tomorrow183=tomorrow();

                    state._fsp--;

                    adaptor.addChild(root_0, tomorrow183.getTree());

                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:237:5: 'yesterday'
                    {
                    string_literal184=(Token)match(input,140,FOLLOW_140_in_day_identifier2946);  
                    stream_140.add(string_literal184);



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
                    // 237:17: -> ^( RELATIVE_DATE DIRECTION[\"<\"] INTEGER[\"1\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:237:20: ^( RELATIVE_DATE DIRECTION[\"<\"] INTEGER[\"1\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(DIRECTION, "<"));
                        adaptor.addChild(root_1, (Object)adaptor.create(INTEGER, "1"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:240:5: ( 'the' )? 'day after ' tomorrow
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:240:5: ( 'the' )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==141) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:240:5: 'the'
                            {
                            string_literal185=(Token)match(input,141,FOLLOW_141_in_day_identifier2970);  
                            stream_141.add(string_literal185);


                            }
                            break;

                    }

                    string_literal186=(Token)match(input,142,FOLLOW_142_in_day_identifier2973);  
                    stream_142.add(string_literal186);

                    pushFollow(FOLLOW_tomorrow_in_day_identifier2975);
                    tomorrow187=tomorrow();

                    state._fsp--;

                    stream_tomorrow.add(tomorrow187.getTree());


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
                    // 240:34: -> ^( RELATIVE_DATE DIRECTION[\">\"] INTEGER[\"2\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:240:37: ^( RELATIVE_DATE DIRECTION[\">\"] INTEGER[\"2\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(DIRECTION, ">"));
                        adaptor.addChild(root_1, (Object)adaptor.create(INTEGER, "2"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:241:5: ( 'the' )? 'day before yesterday'
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:241:5: ( 'the' )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==141) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:241:5: 'the'
                            {
                            string_literal188=(Token)match(input,141,FOLLOW_141_in_day_identifier2993);  
                            stream_141.add(string_literal188);


                            }
                            break;

                    }

                    string_literal189=(Token)match(input,143,FOLLOW_143_in_day_identifier2996);  
                    stream_143.add(string_literal189);



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
                    // 241:35: -> ^( RELATIVE_DATE DIRECTION[\"<\"] INTEGER[\"2\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:241:38: ^( RELATIVE_DATE DIRECTION[\"<\"] INTEGER[\"2\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(DIRECTION, "<"));
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
    // $ANTLR end "day_identifier"

    public static class tomorrow_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tomorrow"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:244:1: tomorrow : ( 'tomorow' | 'tomorrow' | 'tommorow' | 'tommorrow' ) -> ^( RELATIVE_DATE DIRECTION[\">\"] INTEGER[\"1\"] ) ;
    public final DateParser.tomorrow_return tomorrow() throws RecognitionException {
        DateParser.tomorrow_return retval = new DateParser.tomorrow_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal190=null;
        Token string_literal191=null;
        Token string_literal192=null;
        Token string_literal193=null;

        Object string_literal190_tree=null;
        Object string_literal191_tree=null;
        Object string_literal192_tree=null;
        Object string_literal193_tree=null;
        RewriteRuleTokenStream stream_144=new RewriteRuleTokenStream(adaptor,"token 144");
        RewriteRuleTokenStream stream_145=new RewriteRuleTokenStream(adaptor,"token 145");
        RewriteRuleTokenStream stream_146=new RewriteRuleTokenStream(adaptor,"token 146");
        RewriteRuleTokenStream stream_147=new RewriteRuleTokenStream(adaptor,"token 147");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:245:3: ( ( 'tomorow' | 'tomorrow' | 'tommorow' | 'tommorrow' ) -> ^( RELATIVE_DATE DIRECTION[\">\"] INTEGER[\"1\"] ) )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:245:5: ( 'tomorow' | 'tomorrow' | 'tommorow' | 'tommorrow' )
            {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:245:5: ( 'tomorow' | 'tomorrow' | 'tommorow' | 'tommorrow' )
            int alt37=4;
            switch ( input.LA(1) ) {
            case 144:
                {
                alt37=1;
                }
                break;
            case 145:
                {
                alt37=2;
                }
                break;
            case 146:
                {
                alt37=3;
                }
                break;
            case 147:
                {
                alt37=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:245:6: 'tomorow'
                    {
                    string_literal190=(Token)match(input,144,FOLLOW_144_in_tomorrow3024);  
                    stream_144.add(string_literal190);


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:245:18: 'tomorrow'
                    {
                    string_literal191=(Token)match(input,145,FOLLOW_145_in_tomorrow3028);  
                    stream_145.add(string_literal191);


                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:245:31: 'tommorow'
                    {
                    string_literal192=(Token)match(input,146,FOLLOW_146_in_tomorrow3032);  
                    stream_146.add(string_literal192);


                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:245:44: 'tommorrow'
                    {
                    string_literal193=(Token)match(input,147,FOLLOW_147_in_tomorrow3036);  
                    stream_147.add(string_literal193);


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
            // 246:5: -> ^( RELATIVE_DATE DIRECTION[\">\"] INTEGER[\"1\"] )
            {
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:8: ^( RELATIVE_DATE DIRECTION[\">\"] INTEGER[\"1\"] )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                adaptor.addChild(root_1, (Object)adaptor.create(DIRECTION, ">"));
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:250:1: time_identifier : ( 'midnight' -> ^( EXPLICIT_TIME INTEGER[\"12\"] INTEGER[\"0\"] AM_PM[\"am\"] ) | 'noon' -> ^( EXPLICIT_TIME INTEGER[\"12\"] INTEGER[\"0\"] AM_PM[\"pm\"] ) );
    public final DateParser.time_identifier_return time_identifier() throws RecognitionException {
        DateParser.time_identifier_return retval = new DateParser.time_identifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal194=null;
        Token string_literal195=null;

        Object string_literal194_tree=null;
        Object string_literal195_tree=null;
        RewriteRuleTokenStream stream_148=new RewriteRuleTokenStream(adaptor,"token 148");
        RewriteRuleTokenStream stream_149=new RewriteRuleTokenStream(adaptor,"token 149");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:251:3: ( 'midnight' -> ^( EXPLICIT_TIME INTEGER[\"12\"] INTEGER[\"0\"] AM_PM[\"am\"] ) | 'noon' -> ^( EXPLICIT_TIME INTEGER[\"12\"] INTEGER[\"0\"] AM_PM[\"pm\"] ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==148) ) {
                alt38=1;
            }
            else if ( (LA38_0==149) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:251:5: 'midnight'
                    {
                    string_literal194=(Token)match(input,148,FOLLOW_148_in_time_identifier3068);  
                    stream_148.add(string_literal194);



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
                    // 251:16: -> ^( EXPLICIT_TIME INTEGER[\"12\"] INTEGER[\"0\"] AM_PM[\"am\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:251:19: ^( EXPLICIT_TIME INTEGER[\"12\"] INTEGER[\"0\"] AM_PM[\"am\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:252:5: 'noon'
                    {
                    string_literal195=(Token)match(input,149,FOLLOW_149_in_time_identifier3089);  
                    stream_149.add(string_literal195);



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
                    // 252:12: -> ^( EXPLICIT_TIME INTEGER[\"12\"] INTEGER[\"0\"] AM_PM[\"pm\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:252:15: ^( EXPLICIT_TIME INTEGER[\"12\"] INTEGER[\"0\"] AM_PM[\"pm\"] )
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:256:1: numeric_day : ( ONE_TO_TWELVE | THIRTEEN_TO_TWENTY_FOUR | TWENTY_FIVE_TO_THIRTY_ONE );
    public final DateParser.numeric_day_return numeric_day() throws RecognitionException {
        DateParser.numeric_day_return retval = new DateParser.numeric_day_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set196=null;

        Object set196_tree=null;

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:257:3: ( ONE_TO_TWELVE | THIRTEEN_TO_TWENTY_FOUR | TWENTY_FIVE_TO_THIRTY_ONE )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:
            {
            root_0 = (Object)adaptor.nil();

            set196=(Token)input.LT(1);
            if ( (input.LA(1)>=ONE_TO_TWELVE && input.LA(1)<=TWENTY_FIVE_TO_THIRTY_ONE) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set196));
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
    // $ANTLR end "numeric_day"

    public static class numeric_month_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numeric_month"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:263:1: numeric_month : ONE_TO_TWELVE ;
    public final DateParser.numeric_month_return numeric_month() throws RecognitionException {
        DateParser.numeric_month_return retval = new DateParser.numeric_month_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ONE_TO_TWELVE197=null;

        Object ONE_TO_TWELVE197_tree=null;

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:264:3: ( ONE_TO_TWELVE )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:264:5: ONE_TO_TWELVE
            {
            root_0 = (Object)adaptor.nil();

            ONE_TO_TWELVE197=(Token)match(input,ONE_TO_TWELVE,FOLLOW_ONE_TO_TWELVE_in_numeric_month3144); 
            ONE_TO_TWELVE197_tree = (Object)adaptor.create(ONE_TO_TWELVE197);
            adaptor.addChild(root_0, ONE_TO_TWELVE197_tree);


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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:270:1: numeric_year : ( ( '\\'' )? up_to_two_digits -> YEAR[$up_to_two_digits.text] | ( 'in' 'the' YEAR_DATE_FRAME )? up_to_four_digits ( era )? -> YEAR[$up_to_four_digits.text] ( era )? );
    public final DateParser.numeric_year_return numeric_year() throws RecognitionException {
        DateParser.numeric_year_return retval = new DateParser.numeric_year_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal198=null;
        Token string_literal200=null;
        Token string_literal201=null;
        Token YEAR_DATE_FRAME202=null;
        DateParser.up_to_two_digits_return up_to_two_digits199 = null;

        DateParser.up_to_four_digits_return up_to_four_digits203 = null;

        DateParser.era_return era204 = null;


        Object char_literal198_tree=null;
        Object string_literal200_tree=null;
        Object string_literal201_tree=null;
        Object YEAR_DATE_FRAME202_tree=null;
        RewriteRuleTokenStream stream_YEAR_DATE_FRAME=new RewriteRuleTokenStream(adaptor,"token YEAR_DATE_FRAME");
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");
        RewriteRuleSubtreeStream stream_up_to_four_digits=new RewriteRuleSubtreeStream(adaptor,"rule up_to_four_digits");
        RewriteRuleSubtreeStream stream_era=new RewriteRuleSubtreeStream(adaptor,"rule era");
        RewriteRuleSubtreeStream stream_up_to_two_digits=new RewriteRuleSubtreeStream(adaptor,"rule up_to_two_digits");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:271:3: ( ( '\\'' )? up_to_two_digits -> YEAR[$up_to_two_digits.text] | ( 'in' 'the' YEAR_DATE_FRAME )? up_to_four_digits ( era )? -> YEAR[$up_to_four_digits.text] ( era )? )
            int alt42=2;
            switch ( input.LA(1) ) {
            case 150:
                {
                alt42=1;
                }
                break;
            case ONE_TO_TWELVE:
            case THIRTEEN_TO_TWENTY_FOUR:
            case TWENTY_FIVE_TO_THIRTY_ONE:
            case TWO_ZEROS:
            case THIRTY_TWO_TO_FIFTY_NINE:
            case SIXTY_TO_NINETY_NINE:
                {
                alt42=1;
                }
                break;
            case FOUR_DIGITS:
            case THREE_DIGITS:
            case 33:
                {
                alt42=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:271:5: ( '\\'' )? up_to_two_digits
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:271:5: ( '\\'' )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==150) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:271:5: '\\''
                            {
                            char_literal198=(Token)match(input,150,FOLLOW_150_in_numeric_year3162);  
                            stream_150.add(char_literal198);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_up_to_two_digits_in_numeric_year3165);
                    up_to_two_digits199=up_to_two_digits();

                    state._fsp--;

                    stream_up_to_two_digits.add(up_to_two_digits199.getTree());


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
                    // 271:28: -> YEAR[$up_to_two_digits.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(YEAR, (up_to_two_digits199!=null?input.toString(up_to_two_digits199.start,up_to_two_digits199.stop):null)));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:272:5: ( 'in' 'the' YEAR_DATE_FRAME )? up_to_four_digits ( era )?
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:272:5: ( 'in' 'the' YEAR_DATE_FRAME )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==33) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:272:6: 'in' 'the' YEAR_DATE_FRAME
                            {
                            string_literal200=(Token)match(input,33,FOLLOW_33_in_numeric_year3177);  
                            stream_33.add(string_literal200);

                            string_literal201=(Token)match(input,141,FOLLOW_141_in_numeric_year3179);  
                            stream_141.add(string_literal201);

                            YEAR_DATE_FRAME202=(Token)match(input,YEAR_DATE_FRAME,FOLLOW_YEAR_DATE_FRAME_in_numeric_year3181);  
                            stream_YEAR_DATE_FRAME.add(YEAR_DATE_FRAME202);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_up_to_four_digits_in_numeric_year3185);
                    up_to_four_digits203=up_to_four_digits();

                    state._fsp--;

                    stream_up_to_four_digits.add(up_to_four_digits203.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:272:53: ( era )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( ((LA41_0>=151 && LA41_0<=152)) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:272:53: era
                            {
                            pushFollow(FOLLOW_era_in_numeric_year3187);
                            era204=era();

                            state._fsp--;

                            stream_era.add(era204.getTree());

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
                    // 272:58: -> YEAR[$up_to_four_digits.text] ( era )?
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(YEAR, (up_to_four_digits203!=null?input.toString(up_to_four_digits203.start,up_to_four_digits203.stop):null)));
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:272:91: ( era )?
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:275:1: era : ( 'ad' -> ERA[\"ad\"] | 'bc' -> ERA[\"bc\"] );
    public final DateParser.era_return era() throws RecognitionException {
        DateParser.era_return retval = new DateParser.era_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal205=null;
        Token string_literal206=null;

        Object string_literal205_tree=null;
        Object string_literal206_tree=null;
        RewriteRuleTokenStream stream_152=new RewriteRuleTokenStream(adaptor,"token 152");
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:276:3: ( 'ad' -> ERA[\"ad\"] | 'bc' -> ERA[\"bc\"] )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==151) ) {
                alt43=1;
            }
            else if ( (LA43_0==152) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:276:5: 'ad'
                    {
                    string_literal205=(Token)match(input,151,FOLLOW_151_in_era3209);  
                    stream_151.add(string_literal205);



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
                    // 276:10: -> ERA[\"ad\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(ERA, "ad"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:277:5: 'bc'
                    {
                    string_literal206=(Token)match(input,152,FOLLOW_152_in_era3220);  
                    stream_152.add(string_literal206);



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
                    // 277:10: -> ERA[\"bc\"]
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:280:1: hours : ( TWO_ZEROS | ONE_TO_TWELVE | THIRTEEN_TO_TWENTY_FOUR );
    public final DateParser.hours_return hours() throws RecognitionException {
        DateParser.hours_return retval = new DateParser.hours_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set207=null;

        Object set207_tree=null;

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:281:3: ( TWO_ZEROS | ONE_TO_TWELVE | THIRTEEN_TO_TWENTY_FOUR )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:
            {
            root_0 = (Object)adaptor.nil();

            set207=(Token)input.LT(1);
            if ( (input.LA(1)>=ONE_TO_TWELVE && input.LA(1)<=THIRTEEN_TO_TWENTY_FOUR)||input.LA(1)==TWO_ZEROS ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set207));
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
    // $ANTLR end "hours"

    public static class minutes_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "minutes"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:286:1: minutes : ( TWO_ZEROS | ONE_TO_TWELVE | THIRTEEN_TO_TWENTY_FOUR | TWENTY_FIVE_TO_THIRTY_ONE | THIRTY_TWO_TO_FIFTY_NINE );
    public final DateParser.minutes_return minutes() throws RecognitionException {
        DateParser.minutes_return retval = new DateParser.minutes_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set208=null;

        Object set208_tree=null;

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:287:3: ( TWO_ZEROS | ONE_TO_TWELVE | THIRTEEN_TO_TWENTY_FOUR | TWENTY_FIVE_TO_THIRTY_ONE | THIRTY_TWO_TO_FIFTY_NINE )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:
            {
            root_0 = (Object)adaptor.nil();

            set208=(Token)input.LT(1);
            if ( (input.LA(1)>=ONE_TO_TWELVE && input.LA(1)<=THIRTY_TWO_TO_FIFTY_NINE) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set208));
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
    // $ANTLR end "minutes"

    public static class up_to_two_digits_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "up_to_two_digits"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:295:1: up_to_two_digits : ( TWO_ZEROS | ONE_TO_TWELVE | THIRTEEN_TO_TWENTY_FOUR | TWENTY_FIVE_TO_THIRTY_ONE | THIRTY_TWO_TO_FIFTY_NINE | SIXTY_TO_NINETY_NINE );
    public final DateParser.up_to_two_digits_return up_to_two_digits() throws RecognitionException {
        DateParser.up_to_two_digits_return retval = new DateParser.up_to_two_digits_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set209=null;

        Object set209_tree=null;

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:296:3: ( TWO_ZEROS | ONE_TO_TWELVE | THIRTEEN_TO_TWENTY_FOUR | TWENTY_FIVE_TO_THIRTY_ONE | THIRTY_TWO_TO_FIFTY_NINE | SIXTY_TO_NINETY_NINE )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:
            {
            root_0 = (Object)adaptor.nil();

            set209=(Token)input.LT(1);
            if ( (input.LA(1)>=ONE_TO_TWELVE && input.LA(1)<=SIXTY_TO_NINETY_NINE) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set209));
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
    // $ANTLR end "up_to_two_digits"

    public static class up_to_four_digits_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "up_to_four_digits"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:304:1: up_to_four_digits : ( up_to_two_digits | THREE_DIGITS | FOUR_DIGITS );
    public final DateParser.up_to_four_digits_return up_to_four_digits() throws RecognitionException {
        DateParser.up_to_four_digits_return retval = new DateParser.up_to_four_digits_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THREE_DIGITS211=null;
        Token FOUR_DIGITS212=null;
        DateParser.up_to_two_digits_return up_to_two_digits210 = null;


        Object THREE_DIGITS211_tree=null;
        Object FOUR_DIGITS212_tree=null;

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:305:3: ( up_to_two_digits | THREE_DIGITS | FOUR_DIGITS )
            int alt44=3;
            switch ( input.LA(1) ) {
            case ONE_TO_TWELVE:
            case THIRTEEN_TO_TWENTY_FOUR:
            case TWENTY_FIVE_TO_THIRTY_ONE:
            case TWO_ZEROS:
            case THIRTY_TWO_TO_FIFTY_NINE:
            case SIXTY_TO_NINETY_NINE:
                {
                alt44=1;
                }
                break;
            case THREE_DIGITS:
                {
                alt44=2;
                }
                break;
            case FOUR_DIGITS:
                {
                alt44=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:305:5: up_to_two_digits
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_up_to_two_digits_in_up_to_four_digits3352);
                    up_to_two_digits210=up_to_two_digits();

                    state._fsp--;

                    adaptor.addChild(root_0, up_to_two_digits210.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:306:5: THREE_DIGITS
                    {
                    root_0 = (Object)adaptor.nil();

                    THREE_DIGITS211=(Token)match(input,THREE_DIGITS,FOLLOW_THREE_DIGITS_in_up_to_four_digits3358); 
                    THREE_DIGITS211_tree = (Object)adaptor.create(THREE_DIGITS211);
                    adaptor.addChild(root_0, THREE_DIGITS211_tree);


                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:307:5: FOUR_DIGITS
                    {
                    root_0 = (Object)adaptor.nil();

                    FOUR_DIGITS212=(Token)match(input,FOUR_DIGITS,FOLLOW_FOUR_DIGITS_in_up_to_four_digits3364); 
                    FOUR_DIGITS212_tree = (Object)adaptor.create(FOUR_DIGITS212);
                    adaptor.addChild(root_0, FOUR_DIGITS212_tree);


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

    public static class integer_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "integer"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:310:1: integer : ( up_to_two_digits -> INTEGER[$up_to_two_digits.text] | digits= ( DIGIT DIGIT ( DIGIT )+ ) -> INTEGER[$digits.text] );
    public final DateParser.integer_return integer() throws RecognitionException {
        DateParser.integer_return retval = new DateParser.integer_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token digits=null;
        Token DIGIT214=null;
        Token DIGIT215=null;
        Token DIGIT216=null;
        DateParser.up_to_two_digits_return up_to_two_digits213 = null;


        Object digits_tree=null;
        Object DIGIT214_tree=null;
        Object DIGIT215_tree=null;
        Object DIGIT216_tree=null;
        RewriteRuleTokenStream stream_DIGIT=new RewriteRuleTokenStream(adaptor,"token DIGIT");
        RewriteRuleSubtreeStream stream_up_to_two_digits=new RewriteRuleSubtreeStream(adaptor,"rule up_to_two_digits");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:311:3: ( up_to_two_digits -> INTEGER[$up_to_two_digits.text] | digits= ( DIGIT DIGIT ( DIGIT )+ ) -> INTEGER[$digits.text] )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=ONE_TO_TWELVE && LA46_0<=SIXTY_TO_NINETY_NINE)) ) {
                alt46=1;
            }
            else if ( (LA46_0==DIGIT) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:311:5: up_to_two_digits
                    {
                    pushFollow(FOLLOW_up_to_two_digits_in_integer3379);
                    up_to_two_digits213=up_to_two_digits();

                    state._fsp--;

                    stream_up_to_two_digits.add(up_to_two_digits213.getTree());


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
                    // 311:22: -> INTEGER[$up_to_two_digits.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (up_to_two_digits213!=null?input.toString(up_to_two_digits213.start,up_to_two_digits213.stop):null)));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:312:5: digits= ( DIGIT DIGIT ( DIGIT )+ )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:312:12: ( DIGIT DIGIT ( DIGIT )+ )
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:312:13: DIGIT DIGIT ( DIGIT )+
                    {
                    DIGIT214=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_integer3393);  
                    stream_DIGIT.add(DIGIT214);

                    DIGIT215=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_integer3395);  
                    stream_DIGIT.add(DIGIT215);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:312:25: ( DIGIT )+
                    int cnt45=0;
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==DIGIT) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:312:25: DIGIT
                    	    {
                    	    DIGIT216=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_integer3397);  
                    	    stream_DIGIT.add(DIGIT216);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt45 >= 1 ) break loop45;
                                EarlyExitException eee =
                                    new EarlyExitException(45, input);
                                throw eee;
                        }
                        cnt45++;
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
                    // 312:33: -> INTEGER[$digits.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (digits!=null?digits.getText():null)));

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
    // $ANTLR end "integer"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA31 dfa31 = new DFA31(this);
    static final String DFA4_eotS =
        "\u0131\uffff";
    static final String DFA4_eofS =
        "\1\uffff\3\172\1\uffff\6\4\2\uffff\1\4\1\uffff\20\4\123\uffff\1"+
        "\172\1\4\1\uffff\4\172\3\uffff\26\4\3\uffff\50\u00e2\1\uffff\13"+
        "\u00e2\1\uffff\1\u00e2\16\uffff\3\u00e2\1\172\1\u00e2\2\uffff\1"+
        "\u00e2\3\uffff\3\u00e2\1\uffff\11\u00e2\1\uffff\1\u00e2\27\u0117"+
        "\2\uffff\4\172\1\uffff\1\u0117\1\uffff\3\u0117\3\uffff\3\u0117\2"+
        "\uffff\1\u0117\1\uffff\2\u0117\1\uffff\1\u0117\1\uffff\6\u0117\1"+
        "\uffff\1\u0117\2\uffff\2\u0117";
    static final String DFA4_minS =
        "\4\20\1\uffff\6\23\1\u008e\1\u0090\1\23\1\173\20\23\2\21\1\23\1"+
        "\42\1\32\27\56\50\37\1\52\13\37\1\52\1\37\1\52\1\20\2\23\4\20\1"+
        "\23\2\uffff\26\23\1\42\2\32\50\20\1\52\13\20\1\52\1\20\1\144\1\56"+
        "\11\37\1\56\1\37\4\23\1\20\1\23\2\32\1\20\1\23\1\uffff\1\u008d\3"+
        "\23\1\56\11\20\1\56\30\20\1\52\5\20\1\32\1\23\1\22\2\23\1\20\1\23"+
        "\1\uffff\1\u008d\6\23\1\u008d\2\23\1\20\1\23\1\22\6\23\1\22\1\23"+
        "\2\20\2\23";
    static final String DFA4_maxS =
        "\1\u0095\3\u0093\1\uffff\6\u0095\1\u008f\1\u0093\1\u0095\1\u008a"+
        "\20\u0095\2\u008a\1\32\1\42\1\32\27\143\50\37\1\76\13\37\1\56\1"+
        "\37\1\53\1\u0093\1\u0095\1\25\4\u0093\1\27\2\uffff\26\u0095\1\42"+
        "\2\32\50\u0096\1\76\13\u0096\1\56\1\u0096\1\172\1\76\11\37\1\56"+
        "\1\37\1\23\3\u0095\1\u0093\1\u0095\1\32\1\42\1\u0096\1\30\1\uffff"+
        "\1\u008d\3\u0098\1\76\11\u0096\1\56\30\u0096\1\53\1\u0096\4\u0093"+
        "\1\42\1\u0095\1\22\2\u0095\1\u0096\1\30\1\uffff\1\u008d\3\u0098"+
        "\1\25\1\30\1\u0098\1\u008d\2\u0098\1\31\1\u0095\1\22\6\u0095\1\22"+
        "\1\u0098\2\31\2\u0098";
    static final String DFA4_acceptS =
        "\4\uffff\1\1\165\uffff\1\3\1\2\146\uffff\1\1\64\uffff\1\1\31\uffff";
    static final String DFA4_specialS =
        "\u0131\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\161\2\uffff\1\1\1\162\1\42\1\162\2\42\1\uffff\1\43\1\uffff"+
            "\1\4\3\uffff\1\16\1\41\12\uffff\1\37\1\40\1\73\1\74\1\75\1\76"+
            "\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110"+
            "\1\111\1\112\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1\122"+
            "\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\132\1\133\1\134"+
            "\1\135\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145\1\146"+
            "\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157\1\160"+
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57"+
            "\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\17"+
            "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
            "\1\34\1\35\1\36\1\5\1\12\1\13\1\14\1\15\1\6\1\7\1\10\1\11\1"+
            "\2\1\3",
            "\1\4\2\uffff\6\4\1\uffff\1\4\1\uffff\1\4\3\uffff\2\4\1\163"+
            "\2\uffff\1\171\1\165\1\166\1\167\1\170\2\164\150\4",
            "\1\4\2\uffff\6\4\1\uffff\1\4\1\uffff\1\4\3\uffff\2\4\12\uffff"+
            "\150\4",
            "\1\4\2\uffff\6\4\1\uffff\1\4\1\uffff\1\4\3\uffff\2\4\12\uffff"+
            "\150\4",
            "",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\1\14\1\15",
            "\1\174\1\175\1\176\1\177",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
            "\1\33\1\34\1\35\1\36",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\1\u0090\1\u0091\150\uffff\1\u0080\1\u0081\1\u0082\1\u0083"+
            "\1\u0084\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a\1\u008b"+
            "\1\u008c\1\u008d\1\u008e\1\u008f",
            "\1\u0090\1\u0091\150\uffff\1\u0080\1\u0081\1\u0082\1\u0083"+
            "\1\u0084\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a\1\u008b"+
            "\1\u008c\1\u008d\1\u008e\1\u008f",
            "\6\u0092\1\uffff\1\u0093",
            "\1\163",
            "\1\u0094",
            "\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1"+
            "\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3"+
            "\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab"+
            "\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3"+
            "\1\u00b4\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb"+
            "\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\1\u00c2\1\u00c3"+
            "\1\u00c4\1\u00c5\1\u00c6\1\u00c7\1\u00c8\1\u00c9\1\u00ca",
            "\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1"+
            "\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3"+
            "\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab"+
            "\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3"+
            "\1\u00b4\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb"+
            "\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\1\u00c2\1\u00c3"+
            "\1\u00c4\1\u00c5\1\u00c6\1\u00c7\1\u00c8\1\u00c9\1\u00ca",
            "\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1"+
            "\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3"+
            "\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab"+
            "\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3"+
            "\1\u00b4\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb"+
            "\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\1\u00c2\1\u00c3"+
            "\1\u00c4\1\u00c5\1\u00c6\1\u00c7\1\u00c8\1\u00c9\1\u00ca",
            "\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1"+
            "\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3"+
            "\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab"+
            "\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3"+
            "\1\u00b4\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb"+
            "\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\1\u00c2\1\u00c3"+
            "\1\u00c4\1\u00c5\1\u00c6\1\u00c7\1\u00c8\1\u00c9\1\u00ca",
            "\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1"+
            "\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3"+
            "\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab"+
            "\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3"+
            "\1\u00b4\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb"+
            "\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\1\u00c2\1\u00c3"+
            "\1\u00c4\1\u00c5\1\u00c6\1\u00c7\1\u00c8\1\u00c9\1\u00ca",
            "\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1"+
            "\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3"+
            "\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab"+
            "\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3"+
            "\1\u00b4\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb"+
            "\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\1\u00c2\1\u00c3"+
            "\1\u00c4\1\u00c5\1\u00c6\1\u00c7\1\u00c8\1\u00c9\1\u00ca",
            "\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1"+
            "\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3"+
            "\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab"+
            "\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3"+
            "\1\u00b4\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb"+
            "\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\1\u00c2\1\u00c3"+
            "\1\u00c4\1\u00c5\1\u00c6\1\u00c7\1\u00c8\1\u00c9\1\u00ca",
            "\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1"+
            "\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3"+
            "\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab"+
            "\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3"+
            "\1\u00b4\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb"+
            "\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\1\u00c2\1\u00c3"+
            "\1\u00c4\1\u00c5\1\u00c6\1\u00c7\1\u00c8\1\u00c9\1\u00ca",
            "\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1"+
            "\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3"+
            "\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab"+
            "\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3"+
            "\1\u00b4\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb"+
            "\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\1\u00c2\1\u00c3"+
            "\1\u00c4\1\u00c5\1\u00c6\1\u00c7\1\u00c8\1\u00c9\1\u00ca",
            "\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1"+
            "\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3"+
            "\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab"+
            "\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3"+
            "\1\u00b4\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb"+
            "\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\1\u00c2\1\u00c3"+
            "\1\u00c4\1\u00c5\1\u00c6\1\u00c7\1\u00c8\1\u00c9\1\u00ca",
            "\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1"+
            "\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3"+
            "\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab"+
            "\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3"+
            "\1\u00b4\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb"+
            "\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\1\u00c2\1\u00c3"+
            "\1\u00c4\1\u00c5\1\u00c6\1\u00c7\1\u00c8\1\u00c9\1\u00ca",
            "\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1"+
            "\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3"+
            "\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab"+
            "\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3"+
            "\1\u00b4\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb"+
            "\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\1\u00c2\1\u00c3"+
            "\1\u00c4\1\u00c5\1\u00c6\1\u00c7\1\u00c8\1\u00c9\1\u00ca",
            "\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1"+
            "\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3"+
            "\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab"+
            "\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3"+
            "\1\u00b4\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb"+
            "\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\1\u00c2\1\u00c3"+
            "\1\u00c4\1\u00c5\1\u00c6\1\u00c7\1\u00c8\1\u00c9\1\u00ca",
            "\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1"+
            "\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3"+
            "\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab"+
            "\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3"+
            "\1\u00b4\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb"+
            "\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\1\u00c2\1\u00c3"+
            "\1\u00c4\1\u00c5\1\u00c6\1\u00c7\1\u00c8\1\u00c9\1\u00ca",
            "\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1"+
            "\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3"+
            "\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab"+
            "\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3"+
            "\1\u00b4\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb"+
            "\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\1\u00c2\1\u00c3"+
            "\1\u00c4\1\u00c5\1\u00c6\1\u00c7\1\u00c8\1\u00c9\1\u00ca",
            "\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1"+
            "\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3"+
            "\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab"+
            "\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3"+
            "\1\u00b4\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb"+
            "\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\1\u00c2\1\u00c3"+
            "\1\u00c4\1\u00c5\1\u00c6\1\u00c7\1\u00c8\1\u00c9\1\u00ca",
            "\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1"+
            "\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3"+
            "\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab"+
            "\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3"+
            "\1\u00b4\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb"+
            "\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\1\u00c2\1\u00c3"+
            "\1\u00c4\1\u00c5\1\u00c6\1\u00c7\1\u00c8\1\u00c9\1\u00ca",
            "\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1"+
            "\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3"+
            "\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab"+
            "\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3"+
            "\1\u00b4\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb"+
            "\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\1\u00c2\1\u00c3"+
            "\1\u00c4\1\u00c5\1\u00c6\1\u00c7\1\u00c8\1\u00c9\1\u00ca",
            "\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1"+
            "\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3"+
            "\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab"+
            "\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3"+
            "\1\u00b4\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb"+
            "\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\1\u00c2\1\u00c3"+
            "\1\u00c4\1\u00c5\1\u00c6\1\u00c7\1\u00c8\1\u00c9\1\u00ca",
            "\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1"+
            "\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3"+
            "\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab"+
            "\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3"+
            "\1\u00b4\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb"+
            "\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\1\u00c2\1\u00c3"+
            "\1\u00c4\1\u00c5\1\u00c6\1\u00c7\1\u00c8\1\u00c9\1\u00ca",
            "\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1"+
            "\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3"+
            "\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab"+
            "\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3"+
            "\1\u00b4\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb"+
            "\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\1\u00c2\1\u00c3"+
            "\1\u00c4\1\u00c5\1\u00c6\1\u00c7\1\u00c8\1\u00c9\1\u00ca",
            "\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1"+
            "\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3"+
            "\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab"+
            "\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3"+
            "\1\u00b4\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb"+
            "\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\1\u00c2\1\u00c3"+
            "\1\u00c4\1\u00c5\1\u00c6\1\u00c7\1\u00c8\1\u00c9\1\u00ca",
            "\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1"+
            "\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3"+
            "\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab"+
            "\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3"+
            "\1\u00b4\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb"+
            "\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\1\u00c2\1\u00c3"+
            "\1\u00c4\1\u00c5\1\u00c6\1\u00c7\1\u00c8\1\u00c9\1\u00ca",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cc\3\uffff\1\u00d1\1\uffff\1\u00d5\1\uffff\1\u00ce\1"+
            "\uffff\1\u00d2\1\uffff\1\u00d4\1\uffff\1\u00d0\1\uffff\1\u00cd"+
            "\1\uffff\1\u00d3\1\uffff\1\u00cf",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00d6\3\uffff\1\u00d7",
            "\1\u00cb",
            "\2\u00d8",
            "\1\4\2\uffff\6\4\1\uffff\1\4\1\uffff\1\4\3\uffff\2\4\1\163"+
            "\2\uffff\1\171\1\165\1\166\1\167\1\170\2\uffff\150\4",
            "\2\173\1\uffff\1\173\6\uffff\1\173\5\uffff\1\u00da\1\u00d9"+
            "\157\uffff\2\173",
            "\3\u00db",
            "\1\4\2\uffff\6\4\1\uffff\1\4\1\uffff\1\4\3\uffff\2\4\12\uffff"+
            "\150\4",
            "\1\4\2\uffff\6\4\1\uffff\1\4\1\uffff\1\4\3\uffff\2\4\12\uffff"+
            "\150\4",
            "\1\4\2\uffff\6\4\1\uffff\1\4\1\uffff\1\4\3\uffff\2\4\12\uffff"+
            "\150\4",
            "\1\4\2\uffff\6\4\1\uffff\1\4\1\uffff\1\4\3\uffff\2\4\12\uffff"+
            "\150\4",
            "\5\u00dc",
            "",
            "",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e7\3\uffff\1\u00ea\1\uffff\1\u00ed\1\uffff\1\u00ee\1"+
            "\uffff\1\u00e8\1\uffff\1\u00eb\1\uffff\1\u00f0\1\uffff\1\u00ec"+
            "\1\uffff\1\u00e9\1\uffff\1\u00ef",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00f1\3\uffff\1\u00f2",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00f3\1\u00f4\1\u00f5\1\u00f6\1\u00f7\1\u00f8\1\u00f9\1"+
            "\u00fa\1\u00fb\1\u00fc\1\u00fd\1\u00fe\1\u00ff\1\u0100\1\u0101"+
            "\1\u0102\1\u0103\1\u0104\1\u0105\1\u0106\1\u0107\1\u0108\1\u0109",
            "\1\u00d1\1\uffff\1\u00d5\1\uffff\1\u00ce\1\uffff\1\u00d2\1"+
            "\uffff\1\u00d4\1\uffff\1\u00d0\1\uffff\1\u00cd\1\uffff\1\u00d3"+
            "\1\uffff\1\u00cf",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00cb",
            "\1\u00d7",
            "\1\u00cb",
            "\1\u010a",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\14\uffff\2\u010b\150\uffff"+
            "\2\173",
            "\1\u00e2\2\uffff\6\u00e2\1\uffff\1\u00e2\1\uffff\1\4\3\uffff"+
            "\2\u00e2\4\uffff\1\u010c\1\u010d\1\u010e\1\u010f\2\uffff\150"+
            "\u00e2",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\1\u0110",
            "\1\u00df\7\uffff\1\163",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\3\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\6\u0111",
            "",
            "\1\u0112",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173\1\uffff"+
            "\1\u0113\1\u0114",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173\1\uffff"+
            "\1\u0113\1\u0114",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173\1\uffff"+
            "\1\u0113\1\u0114",
            "\1\u00ea\1\uffff\1\u00ed\1\uffff\1\u00ee\1\uffff\1\u00e8\1"+
            "\uffff\1\u00eb\1\uffff\1\u00f0\1\uffff\1\u00ec\1\uffff\1\u00e9"+
            "\1\uffff\1\u00ef",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u00f2",
            "\1\u00e5\2\uffff\2\u00e2\1\u00e6\1\u00e2\2\u00e6\1\u00e4\3"+
            "\uffff\1\173\1\u00e0\2\uffff\1\u00e3\162\uffff\2\173\1\u00e1",
            "\1\u011a\2\uffff\2\u0117\1\u011b\1\u0117\2\u011b\1\u0119\3"+
            "\uffff\1\173\1\u0115\2\uffff\1\u0118\162\uffff\2\173\1\u0116",
            "\1\u011a\2\uffff\2\u0117\1\u011b\1\u0117\2\u011b\1\u0119\3"+
            "\uffff\1\173\1\u0115\2\uffff\1\u0118\162\uffff\2\173\1\u0116",
            "\1\u011a\2\uffff\2\u0117\1\u011b\1\u0117\2\u011b\1\u0119\3"+
            "\uffff\1\173\1\u0115\2\uffff\1\u0118\162\uffff\2\173\1\u0116",
            "\1\u011a\2\uffff\2\u0117\1\u011b\1\u0117\2\u011b\1\u0119\3"+
            "\uffff\1\173\1\u0115\2\uffff\1\u0118\162\uffff\2\173\1\u0116",
            "\1\u011a\2\uffff\2\u0117\1\u011b\1\u0117\2\u011b\1\u0119\3"+
            "\uffff\1\173\1\u0115\2\uffff\1\u0118\162\uffff\2\173\1\u0116",
            "\1\u011a\2\uffff\2\u0117\1\u011b\1\u0117\2\u011b\1\u0119\3"+
            "\uffff\1\173\1\u0115\2\uffff\1\u0118\162\uffff\2\173\1\u0116",
            "\1\u011a\2\uffff\2\u0117\1\u011b\1\u0117\2\u011b\1\u0119\3"+
            "\uffff\1\173\1\u0115\2\uffff\1\u0118\162\uffff\2\173\1\u0116",
            "\1\u011a\2\uffff\2\u0117\1\u011b\1\u0117\2\u011b\1\u0119\3"+
            "\uffff\1\173\1\u0115\2\uffff\1\u0118\162\uffff\2\173\1\u0116",
            "\1\u011a\2\uffff\2\u0117\1\u011b\1\u0117\2\u011b\1\u0119\3"+
            "\uffff\1\173\1\u0115\2\uffff\1\u0118\162\uffff\2\173\1\u0116",
            "\1\u011a\2\uffff\2\u0117\1\u011b\1\u0117\2\u011b\1\u0119\3"+
            "\uffff\1\173\1\u0115\2\uffff\1\u0118\162\uffff\2\173\1\u0116",
            "\1\u011a\2\uffff\2\u0117\1\u011b\1\u0117\2\u011b\1\u0119\3"+
            "\uffff\1\173\1\u0115\2\uffff\1\u0118\162\uffff\2\173\1\u0116",
            "\1\u011a\2\uffff\2\u0117\1\u011b\1\u0117\2\u011b\1\u0119\3"+
            "\uffff\1\173\1\u0115\2\uffff\1\u0118\162\uffff\2\173\1\u0116",
            "\1\u011a\2\uffff\2\u0117\1\u011b\1\u0117\2\u011b\1\u0119\3"+
            "\uffff\1\173\1\u0115\2\uffff\1\u0118\162\uffff\2\173\1\u0116",
            "\1\u011a\2\uffff\2\u0117\1\u011b\1\u0117\2\u011b\1\u0119\3"+
            "\uffff\1\173\1\u0115\2\uffff\1\u0118\162\uffff\2\173\1\u0116",
            "\1\u011a\2\uffff\2\u0117\1\u011b\1\u0117\2\u011b\1\u0119\3"+
            "\uffff\1\173\1\u0115\2\uffff\1\u0118\162\uffff\2\173\1\u0116",
            "\1\u011a\2\uffff\2\u0117\1\u011b\1\u0117\2\u011b\1\u0119\3"+
            "\uffff\1\173\1\u0115\2\uffff\1\u0118\162\uffff\2\173\1\u0116",
            "\1\u011a\2\uffff\2\u0117\1\u011b\1\u0117\2\u011b\1\u0119\3"+
            "\uffff\1\173\1\u0115\2\uffff\1\u0118\162\uffff\2\173\1\u0116",
            "\1\u011a\2\uffff\2\u0117\1\u011b\1\u0117\2\u011b\1\u0119\3"+
            "\uffff\1\173\1\u0115\2\uffff\1\u0118\162\uffff\2\173\1\u0116",
            "\1\u011a\2\uffff\2\u0117\1\u011b\1\u0117\2\u011b\1\u0119\3"+
            "\uffff\1\173\1\u0115\2\uffff\1\u0118\162\uffff\2\173\1\u0116",
            "\1\u011a\2\uffff\2\u0117\1\u011b\1\u0117\2\u011b\1\u0119\3"+
            "\uffff\1\173\1\u0115\2\uffff\1\u0118\162\uffff\2\173\1\u0116",
            "\1\u011a\2\uffff\2\u0117\1\u011b\1\u0117\2\u011b\1\u0119\3"+
            "\uffff\1\173\1\u0115\2\uffff\1\u0118\162\uffff\2\173\1\u0116",
            "\1\u011a\2\uffff\2\u0117\1\u011b\1\u0117\2\u011b\1\u0119\3"+
            "\uffff\1\173\1\u0115\2\uffff\1\u0118\162\uffff\2\173\1\u0116",
            "\1\u011a\2\uffff\2\u0117\1\u011b\1\u0117\2\u011b\1\u0119\3"+
            "\uffff\1\173\1\u0115\2\uffff\1\u0118\162\uffff\2\173\1\u0116",
            "\2\u011c",
            "\1\u0121\2\uffff\6\u011e\1\u0120\7\uffff\1\u011f\164\uffff"+
            "\1\u011d",
            "\1\u0117\2\uffff\6\u0117\1\uffff\1\u0117\1\uffff\1\4\3\uffff"+
            "\2\u0117\12\uffff\150\u0117",
            "\1\u0117\2\uffff\6\u0117\1\uffff\1\u0117\1\uffff\1\4\3\uffff"+
            "\2\u0117\12\uffff\150\u0117",
            "\1\u0117\2\uffff\6\u0117\1\uffff\1\u0117\1\uffff\1\4\3\uffff"+
            "\2\u0117\12\uffff\150\u0117",
            "\1\u0117\2\uffff\6\u0117\1\uffff\1\u0117\1\uffff\1\4\3\uffff"+
            "\2\u0117\12\uffff\150\u0117",
            "\1\u0110\7\uffff\1\u00dd",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\1\u0122",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\1\u011a\2\uffff\2\u0117\1\u011b\1\u0117\2\u011b\1\u0119\3"+
            "\uffff\1\173\3\uffff\1\u0118\162\uffff\2\173\1\u0116",
            "\6\u0123",
            "",
            "\1\u0124",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173\1\uffff"+
            "\1\u0125\1\u0126",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173\1\uffff"+
            "\1\u0125\1\u0126",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173\1\uffff"+
            "\1\u0125\1\u0126",
            "\3\u0127",
            "\6\u0128",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173\1\uffff"+
            "\1\u0129\1\u012a",
            "\1\u012b",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173\1\uffff"+
            "\1\u0129\1\u012a",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173\1\uffff"+
            "\1\u0129\1\u012a",
            "\1\u00e5\2\uffff\6\u012c\1\u00e4",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\1\u012d",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173",
            "\1\u012e",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173\1\uffff"+
            "\1\u0113\1\u0114",
            "\1\u011a\2\uffff\6\u012f\1\u0119",
            "\1\u0121\2\uffff\6\u0130\1\u0120",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173\1\uffff"+
            "\1\u0125\1\u0126",
            "\2\173\1\uffff\1\173\6\uffff\1\173\166\uffff\2\173\1\uffff"+
            "\1\u0129\1\u012a"
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
            return "26:1: datetime : ( ( time )? ( 'on' )? date -> ^( DATE_TIME date ( time )? ) | date ( 'at' )? time -> ^( DATE_TIME date time ) | time -> ^( DATE_TIME ^( RELATIVE_DATE DIRECTION[\">\"] INTEGER[\"0\"] ) time ) );";
        }
    }
    static final String DFA14_eotS =
        "\14\uffff";
    static final String DFA14_eofS =
        "\7\uffff\1\12\4\uffff";
    static final String DFA14_minS =
        "\1\23\4\uffff\1\42\1\32\1\23\1\32\2\uffff\1\32";
    static final String DFA14_maxS =
        "\1\u0093\4\uffff\1\42\1\32\1\u0095\1\32\2\uffff\1\42";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\4\uffff\1\6\1\5\1\uffff";
    static final String DFA14_specialS =
        "\14\uffff}>";
    static final String[] DFA14_transitionS = {
            "\6\5\1\uffff\1\6\5\uffff\1\2\1\4\12\uffff\2\3\115\uffff\20\2"+
            "\11\1",
            "",
            "",
            "",
            "",
            "\1\7",
            "\1\10",
            "\2\12\1\uffff\1\12\6\uffff\1\12\5\uffff\1\12\1\11\157\uffff"+
            "\2\12",
            "\1\13",
            "",
            "",
            "\1\13\7\uffff\1\7"
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
            return "66:1: relative_date : ( day_identifier -> day_identifier | ( 'this' )? day_of_week -> ^( RELATIVE_DATE DIRECTION[\">\"] day_of_week ) | relative_prefix prefixable_target -> ^( RELATIVE_DATE relative_prefix prefixable_target ) | 'in' integer 'days' -> ^( RELATIVE_DATE DIRECTION[\">\"] integer ) | integer 'days' ( 'from now' )? -> ^( RELATIVE_DATE DIRECTION[\">\"] integer ) | integer 'days' 'ago' -> ^( RELATIVE_DATE DIRECTION[\"<\"] integer ) );";
        }
    }
    static final String DFA31_eotS =
        "\101\uffff";
    static final String DFA31_eofS =
        "\101\uffff";
    static final String DFA31_minS =
        "\1\56\50\uffff\1\52\15\uffff\1\56\11\uffff";
    static final String DFA31_maxS =
        "\1\143\50\uffff\1\76\15\uffff\1\76\11\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
        "\1\47\1\50\1\uffff\1\52\1\54\1\56\1\60\1\62\1\64\1\66\1\70\1\72"+
        "\1\73\1\74\1\75\1\76\1\uffff\1\53\1\55\1\65\1\67\1\63\1\61\1\71"+
        "\1\51\1\57";
    static final String DFA31_specialS =
        "\101\uffff}>";
    static final String[] DFA31_transitionS = {
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
            "\1\67\3\uffff\1\77\1\uffff\1\70\1\uffff\1\71\1\uffff\1\100"+
            "\1\uffff\1\75\1\uffff\1\74\1\uffff\1\72\1\uffff\1\73\1\uffff"+
            "\1\76",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\77\1\uffff\1\70\1\uffff\1\71\1\uffff\1\100\1\uffff\1\75"+
            "\1\uffff\1\74\1\uffff\1\72\1\uffff\1\73\1\uffff\1\76",
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

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "119:1: day : ( 'first' -> DAY[\"1\"] | '1st' -> DAY[\"1\"] | 'second' -> DAY[\"2\"] | '2nd' -> DAY[\"2\"] | 'third' -> DAY[\"3\"] | '3rd' -> DAY[\"3\"] | 'fourth' -> DAY[\"4\"] | '4th' -> DAY[\"4\"] | 'fifth' -> DAY[\"5\"] | '5th' -> DAY[\"5\"] | 'sixth' -> DAY[\"6\"] | '6th' -> DAY[\"6\"] | 'seventh' -> DAY[\"7\"] | '7th' -> DAY[\"7\"] | 'eighth' -> DAY[\"8\"] | '8th' -> DAY[\"8\"] | 'ninth' -> DAY[\"9\"] | '9th' -> DAY[\"9\"] | 'tenth' -> DAY[\"10\"] | '10th' -> DAY[\"10\"] | 'eleventh' -> DAY[\"11\"] | '11th' -> DAY[\"11\"] | 'twelfth' -> DAY[\"12\"] | '12th' -> DAY[\"12\"] | 'thirteenth' -> DAY[\"13\"] | '13th' -> DAY[\"13\"] | 'fourteenth' -> DAY[\"14\"] | '14th' -> DAY[\"14\"] | 'fifteenth' -> DAY[\"15\"] | '15th' -> DAY[\"15\"] | 'sixteenth' -> DAY[\"16\"] | '16th' -> DAY[\"16\"] | 'seventeenth' -> DAY[\"17\"] | '17th' -> DAY[\"17\"] | 'eighteenth' -> DAY[\"18\"] | '18th' -> DAY[\"18\"] | 'nineteenth' -> DAY[\"19\"] | '19th' -> DAY[\"19\"] | 'twentieth' -> DAY[\"20\"] | '20th' -> DAY[\"20\"] | 'twenty' ( '-' )? 'first' -> DAY[\"21\"] | '21st' -> DAY[\"21\"] | 'twenty' ( '-' )? 'second' -> DAY[\"22\"] | '22nd' -> DAY[\"22\"] | 'twenty' ( '-' )? 'third' -> DAY[\"23\"] | '23rd' -> DAY[\"23\"] | 'twenty' ( '-' )? 'fourth' -> DAY[\"24\"] | '24th' -> DAY[\"24\"] | 'twenty' ( '-' )? 'fifth' -> DAY[\"25\"] | '25th' -> DAY[\"25\"] | 'twenty' ( '-' )? 'sixth' -> DAY[\"26\"] | '26th' -> DAY[\"26\"] | 'twenty' ( '-' )? 'seventh' -> DAY[\"27\"] | '27th' -> DAY[\"27\"] | 'twenty' ( '-' )? 'eighth' -> DAY[\"28\"] | '28th' -> DAY[\"28\"] | 'twenty' ( '-' )? 'ninth' -> DAY[\"29\"] | '29th' -> DAY[\"29\"] | 'thirtieth' -> DAY[\"30\"] | '30th' -> DAY[\"30\"] | 'thirty' ( '-' )? 'first' -> DAY[\"31\"] | '31st' -> DAY[\"31\"] );";
        }
    }
 

    public static final BitSet FOLLOW_time_in_datetime108 = new BitSet(new long[]{0xFFFFF00315F90000L,0xFFFFFFFFFFFFFFFFL,0x00000000000FFFFFL});
    public static final BitSet FOLLOW_28_in_datetime111 = new BitSet(new long[]{0xFFFFF00315F90000L,0xFFFFFFFFFFFFFFFFL,0x00000000000FFFFFL});
    public static final BitSet FOLLOW_date_in_datetime114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_in_datetime137 = new BitSet(new long[]{0x0000000020580000L,0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_29_in_datetime139 = new BitSet(new long[]{0x0000000020580000L,0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_time_in_datetime142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_in_datetime164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relative_date_in_date195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_explicit_date_in_date202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_explicit_time_in_time217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_month_in_explicit_date234 = new BitSet(new long[]{0xFFFFC00000000000L,0x0000000FFFFFFFFFL});
    public static final BitSet FOLLOW_day_in_explicit_date236 = new BitSet(new long[]{0x0000000243F90002L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_30_in_explicit_date238 = new BitSet(new long[]{0x0000000203F90002L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_numeric_year_in_explicit_date241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_day_in_explicit_date267 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_explicit_date269 = new BitSet(new long[]{0x0000000000000000L,0x07FFFFF000000000L});
    public static final BitSet FOLLOW_month_in_explicit_date271 = new BitSet(new long[]{0x0000000243F90002L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_30_in_explicit_date273 = new BitSet(new long[]{0x0000000203F90002L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_numeric_year_in_explicit_date276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOUR_DIGITS_in_explicit_date306 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_date_separator_in_explicit_date308 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_numeric_month_in_explicit_date312 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_date_separator_in_explicit_date314 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_numeric_day_in_explicit_date316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_month_in_explicit_date349 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_date_separator_in_explicit_date351 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_numeric_day_in_explicit_date353 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_date_separator_in_explicit_date355 = new BitSet(new long[]{0x0000000203F90000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_numeric_year_in_explicit_date357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_day_identifier_in_relative_date388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_relative_date404 = new BitSet(new long[]{0x0000000100000000L,0xF800000000000000L,0x00000000000007FFL});
    public static final BitSet FOLLOW_day_of_week_in_relative_date407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relative_prefix_in_relative_date430 = new BitSet(new long[]{0x0000000100060000L,0xF800000000000000L,0x00000000000007FFL});
    public static final BitSet FOLLOW_prefixable_target_in_relative_date432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_relative_date454 = new BitSet(new long[]{0x0000000005F80000L});
    public static final BitSet FOLLOW_integer_in_relative_date456 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_relative_date458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_in_relative_date476 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_relative_date478 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_relative_date480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_in_relative_date505 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_relative_date507 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_relative_date509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hours_in_explicit_time540 = new BitSet(new long[]{0x000003C000000002L});
    public static final BitSet FOLLOW_meridian_indicator_in_explicit_time542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hours_in_explicit_time569 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_explicit_time571 = new BitSet(new long[]{0x0000000000F80000L});
    public static final BitSet FOLLOW_minutes_in_explicit_time573 = new BitSet(new long[]{0x000003C000000002L});
    public static final BitSet FOLLOW_meridian_indicator_in_explicit_time575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_identifier_in_explicit_time598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_meridian_indicator616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_meridian_indicator627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_meridian_indicator639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_meridian_indicator650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_date_separator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_relative_prefix690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_relative_prefix702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_day_of_week_in_prefixable_target723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_FRAME_in_prefixable_target730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YEAR_DATE_FRAME_in_prefixable_target736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_day752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_day779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_day808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_day834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_day863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_day890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_day919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_day945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_day974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_day1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_day1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_day1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_day1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_day1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_day1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_day1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_day1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_day1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_day1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_day1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_day1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_day1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_day1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_day1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_day1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_day1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_day1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_day1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_day1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_day1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_day1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_day1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_day1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_day1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_day1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_day1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_day1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_day1734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_day1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_day1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_day1813 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_42_in_day1815 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_day1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_day1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_day1859 = new BitSet(new long[]{0x0001040000000000L});
    public static final BitSet FOLLOW_42_in_day1861 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_day1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_day1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_day1904 = new BitSet(new long[]{0x0004040000000000L});
    public static final BitSet FOLLOW_42_in_day1906 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_day1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_day1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_day1950 = new BitSet(new long[]{0x0010040000000000L});
    public static final BitSet FOLLOW_42_in_day1952 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_day1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_day1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_day1995 = new BitSet(new long[]{0x0040040000000000L});
    public static final BitSet FOLLOW_42_in_day1997 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_day2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_day2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_day2041 = new BitSet(new long[]{0x0100040000000000L});
    public static final BitSet FOLLOW_42_in_day2043 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_day2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_day2059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_day2087 = new BitSet(new long[]{0x0400040000000000L});
    public static final BitSet FOLLOW_42_in_day2089 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_day2092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_day2103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_day2131 = new BitSet(new long[]{0x1000040000000000L});
    public static final BitSet FOLLOW_42_in_day2133 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_day2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_day2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_day2176 = new BitSet(new long[]{0x4000040000000000L});
    public static final BitSet FOLLOW_42_in_day2178 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_day2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_day2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_day2222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_day2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_day2273 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_42_in_day2275 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_day2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_day2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_month2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_month2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_month2355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_month2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_month2382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_month2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_month2412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_month2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_month2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_month2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_month2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_month2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_month2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_month2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_month2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_month2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_month2559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_month2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_month2587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_month2603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_month2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_month2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_month2641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_day_of_week2667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_day_of_week2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_day_of_week2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_day_of_week2711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_day_of_week2728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_day_of_week2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_day_of_week2755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_day_of_week2772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_day_of_week2784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_day_of_week2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_day_of_week2815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_day_of_week2829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_day_of_week2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_day_of_week2858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_day_of_week2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_day_of_week2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_day_identifier2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tomorrow_in_day_identifier2934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_day_identifier2946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_day_identifier2970 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_142_in_day_identifier2973 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000F0000L});
    public static final BitSet FOLLOW_tomorrow_in_day_identifier2975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_day_identifier2993 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_143_in_day_identifier2996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_tomorrow3024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_tomorrow3028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_tomorrow3032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_tomorrow3036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_148_in_time_identifier3068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_149_in_time_identifier3089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numeric_day0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_TO_TWELVE_in_numeric_month3144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_150_in_numeric_year3162 = new BitSet(new long[]{0x0000000001F80000L});
    public static final BitSet FOLLOW_up_to_two_digits_in_numeric_year3165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_numeric_year3177 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_numeric_year3179 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_YEAR_DATE_FRAME_in_numeric_year3181 = new BitSet(new long[]{0x0000000203F90000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_up_to_four_digits_in_numeric_year3185 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_era_in_numeric_year3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_151_in_era3209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_era3220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_hours0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_minutes0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_up_to_two_digits0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_up_to_two_digits_in_up_to_four_digits3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THREE_DIGITS_in_up_to_four_digits3358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOUR_DIGITS_in_up_to_four_digits3364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_up_to_two_digits_in_integer3379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIGIT_in_integer3393 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_DIGIT_in_integer3395 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_DIGIT_in_integer3397 = new BitSet(new long[]{0x0000000004000002L});

}