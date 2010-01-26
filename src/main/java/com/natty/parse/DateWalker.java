// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g 2010-01-26 16:35:31
 package com.natty.parse; 

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class DateWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DATE_TIME", "RELATIVE_DATE", "EXPLICIT_DATE", "EXPLICIT_TIME", "AM_PM", "MONTH", "DAY_OF_WEEK", "DAY_OF_MONTH", "SPAN", "YEAR", "ERA", "INTEGER", "SEEK_DIRECTION", "SEEK_TYPE", "FOUR_DIGITS", "YEAR_DATE_SPAN", "ONE_TO_TWELVE", "THIRTEEN_TO_TWENTY_FOUR", "TWENTY_FIVE_TO_THIRTY_ONE", "TWO_ZEROS", "THIRTY_TWO_TO_FIFTY_NINE", "SIXTY_TO_NINETY_NINE", "THREE_DIGITS", "DIGIT", "WHITE_SPACE", "'on'", "'at'", "','", "'of'", "':'", "'am'", "'a.m.'", "'a'", "'pm'", "'p.m.'", "'p'", "'-'", "'/'", "'this'", "'last'", "'next'", "'past'", "'coming'", "'upcoming'", "'in'", "'from now'", "'ago'", "'day'", "'s'", "'week'", "'month'", "'monday'", "'mon'", "'tuesday'", "'tue'", "'tues'", "'wednesday'", "'wed'", "'thursday'", "'thur'", "'thurs'", "'friday'", "'fri'", "'saturday'", "'sat'", "'weekend'", "'sunday'", "'sun'", "'first'", "'1st'", "'second'", "'2nd'", "'third'", "'3rd'", "'fourth'", "'4th'", "'fifth'", "'5th'", "'sixth'", "'6th'", "'seventh'", "'7th'", "'eighth'", "'8th'", "'ninth'", "'9th'", "'tenth'", "'10th'", "'eleventh'", "'11th'", "'twelfth'", "'12th'", "'thirteenth'", "'13th'", "'fourteenth'", "'14th'", "'fifteenth'", "'15th'", "'sixteenth'", "'16th'", "'seventeenth'", "'17th'", "'eighteenth'", "'18th'", "'nineteenth'", "'19th'", "'twentieth'", "'20th'", "'twenty'", "'21st'", "'22nd'", "'23rd'", "'24th'", "'25th'", "'26th'", "'27th'", "'28th'", "'29th'", "'thirtieth'", "'30th'", "'thirty'", "'31st'", "'january'", "'jan'", "'february'", "'feb'", "'march'", "'mar'", "'april'", "'apr'", "'may'", "'june'", "'jun'", "'july'", "'jul'", "'august'", "'aug'", "'september'", "'sep'", "'october'", "'oct'", "'november'", "'nov'", "'december'", "'dec'", "'today'", "'yesterday'", "'the'", "'day after '", "'day before yesterday'", "'tomorow'", "'tomorrow'", "'tommorow'", "'tommorrow'", "'midnight'", "'noon'", "'''", "'ad'", "'a.d.'", "'bc'", "'b.c.'", "'one'", "'two'", "'three'", "'four'", "'five'", "'six'", "'seven'", "'eight'", "'nine'", "'ten'", "'eleven'", "'twelve'", "'thirteen'", "'fourteen'", "'fifteen'", "'sixteen'", "'seventeen'", "'eighteen'", "'nineteen'"
    };
    public static final int T__29=29;
    public static final int T__159=159;
    public static final int T__158=158;
    public static final int T__160=160;
    public static final int T__167=167;
    public static final int EOF=-1;
    public static final int T__168=168;
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
    public static final int T__92=92;
    public static final int AM_PM=8;
    public static final int T__148=148;
    public static final int SIXTY_TO_NINETY_NINE=25;
    public static final int T__90=90;
    public static final int T__147=147;
    public static final int T__149=149;
    public static final int YEAR_DATE_SPAN=19;
    public static final int SPAN=12;
    public static final int T__154=154;
    public static final int T__155=155;
    public static final int T__156=156;
    public static final int T__99=99;
    public static final int T__157=157;
    public static final int T__98=98;
    public static final int T__150=150;
    public static final int T__97=97;
    public static final int T__151=151;
    public static final int T__96=96;
    public static final int T__152=152;
    public static final int T__95=95;
    public static final int T__153=153;
    public static final int RELATIVE_DATE=5;
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
    public static final int THIRTY_TWO_TO_FIFTY_NINE=24;
    public static final int TWENTY_FIVE_TO_THIRTY_ONE=22;
    public static final int T__133=133;
    public static final int T__79=79;
    public static final int T__134=134;
    public static final int T__78=78;
    public static final int T__135=135;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int FOUR_DIGITS=18;
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
    public static final int T__120=120;
    public static final int THREE_DIGITS=26;
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
    public static final int T__103=103;
    public static final int T__59=59;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int TWO_ZEROS=23;
    public static final int DIGIT=27;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int INTEGER=15;
    public static final int T__43=43;
    public static final int T__183=183;
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
    public static final int T__181=181;
    public static final int SEEK_DIRECTION=16;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int T__175=175;
    public static final int T__30=30;
    public static final int T__174=174;
    public static final int T__31=31;
    public static final int T__173=173;
    public static final int T__32=32;
    public static final int T__172=172;
    public static final int T__33=33;
    public static final int T__179=179;
    public static final int T__34=34;
    public static final int T__178=178;
    public static final int T__35=35;
    public static final int T__177=177;
    public static final int T__36=36;
    public static final int T__176=176;
    public static final int THIRTEEN_TO_TWENTY_FOUR=21;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__171=171;
    public static final int ERA=14;
    public static final int T__170=170;
    public static final int DAY_OF_MONTH=11;
    public static final int T__169=169;
    public static final int ONE_TO_TWELVE=20;

    // delegates
    // delegators


        public DateWalker(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public DateWalker(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return DateWalker.tokenNames; }
    public String getGrammarFileName() { return "/Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g"; }


      SeekableDateTime dateTime = new SeekableDateTime();
      
      public java.util.Date getDate() {
        return dateTime.getDate(); 
      }



    // $ANTLR start "datetime"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:18:1: datetime : ^( DATE_TIME date ( time )? ) ;
    public final void datetime() throws RecognitionException {
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:19:3: ( ^( DATE_TIME date ( time )? ) )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:19:5: ^( DATE_TIME date ( time )? )
            {
            match(input,DATE_TIME,FOLLOW_DATE_TIME_in_datetime47); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_date_in_datetime49);
            date();

            state._fsp--;

            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:19:22: ( time )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==EXPLICIT_TIME) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:19:22: time
                    {
                    pushFollow(FOLLOW_time_in_datetime51);
                    time();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "datetime"


    // $ANTLR start "date"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:22:1: date : ( relative_date | explicit_date );
    public final void date() throws RecognitionException {
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:23:3: ( relative_date | explicit_date )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RELATIVE_DATE) ) {
                alt2=1;
            }
            else if ( (LA2_0==EXPLICIT_DATE) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:23:5: relative_date
                    {
                    pushFollow(FOLLOW_relative_date_in_date67);
                    relative_date();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:24:5: explicit_date
                    {
                    pushFollow(FOLLOW_explicit_date_in_date74);
                    explicit_date();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "date"


    // $ANTLR start "time"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:27:1: time : explicit_time ;
    public final void time() throws RecognitionException {
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:28:3: ( explicit_time )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:28:5: explicit_time
            {
            pushFollow(FOLLOW_explicit_time_in_time89);
            explicit_time();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "time"


    // $ANTLR start "explicit_date"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:31:1: explicit_date : ^( EXPLICIT_DATE MONTH DAY_OF_MONTH ( YEAR )? ( ERA )? ) ;
    public final void explicit_date() throws RecognitionException {
        CommonTree MONTH1=null;
        CommonTree DAY_OF_MONTH2=null;
        CommonTree YEAR3=null;
        CommonTree ERA4=null;

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:32:3: ( ^( EXPLICIT_DATE MONTH DAY_OF_MONTH ( YEAR )? ( ERA )? ) )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:32:5: ^( EXPLICIT_DATE MONTH DAY_OF_MONTH ( YEAR )? ( ERA )? )
            {
            match(input,EXPLICIT_DATE,FOLLOW_EXPLICIT_DATE_in_explicit_date103); 

            match(input, Token.DOWN, null); 
            MONTH1=(CommonTree)match(input,MONTH,FOLLOW_MONTH_in_explicit_date105); 
            DAY_OF_MONTH2=(CommonTree)match(input,DAY_OF_MONTH,FOLLOW_DAY_OF_MONTH_in_explicit_date107); 
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:32:40: ( YEAR )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==YEAR) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:32:40: YEAR
                    {
                    YEAR3=(CommonTree)match(input,YEAR,FOLLOW_YEAR_in_explicit_date109); 

                    }
                    break;

            }

            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:32:46: ( ERA )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ERA) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:32:46: ERA
                    {
                    ERA4=(CommonTree)match(input,ERA,FOLLOW_ERA_in_explicit_date112); 

                    }
                    break;

            }


            match(input, Token.UP, null); 
            dateTime.setExplicitDate((MONTH1!=null?MONTH1.getText():null), (DAY_OF_MONTH2!=null?DAY_OF_MONTH2.getText():null), (YEAR3!=null?YEAR3.getText():null), (ERA4!=null?ERA4.getText():null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "explicit_date"


    // $ANTLR start "relative_date"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:36:1: relative_date : ( ^( RELATIVE_DATE SEEK_DIRECTION INTEGER ) | ^( RELATIVE_DATE SEEK_DIRECTION SEEK_TYPE INTEGER DAY_OF_WEEK ) | ^( RELATIVE_DATE SEEK_DIRECTION SEEK_TYPE INTEGER SPAN ) );
    public final void relative_date() throws RecognitionException {
        CommonTree SEEK_DIRECTION5=null;
        CommonTree INTEGER6=null;
        CommonTree SEEK_DIRECTION7=null;
        CommonTree SEEK_TYPE8=null;
        CommonTree INTEGER9=null;
        CommonTree DAY_OF_WEEK10=null;
        CommonTree SEEK_DIRECTION11=null;
        CommonTree INTEGER12=null;
        CommonTree SPAN13=null;

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:38:3: ( ^( RELATIVE_DATE SEEK_DIRECTION INTEGER ) | ^( RELATIVE_DATE SEEK_DIRECTION SEEK_TYPE INTEGER DAY_OF_WEEK ) | ^( RELATIVE_DATE SEEK_DIRECTION SEEK_TYPE INTEGER SPAN ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RELATIVE_DATE) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==DOWN) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==SEEK_DIRECTION) ) {
                        int LA5_3 = input.LA(4);

                        if ( (LA5_3==INTEGER) ) {
                            alt5=1;
                        }
                        else if ( (LA5_3==SEEK_TYPE) ) {
                            int LA5_5 = input.LA(5);

                            if ( (LA5_5==INTEGER) ) {
                                int LA5_6 = input.LA(6);

                                if ( (LA5_6==DAY_OF_WEEK) ) {
                                    alt5=2;
                                }
                                else if ( (LA5_6==SPAN) ) {
                                    alt5=3;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 5, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:38:5: ^( RELATIVE_DATE SEEK_DIRECTION INTEGER )
                    {
                    match(input,RELATIVE_DATE,FOLLOW_RELATIVE_DATE_in_relative_date137); 

                    match(input, Token.DOWN, null); 
                    SEEK_DIRECTION5=(CommonTree)match(input,SEEK_DIRECTION,FOLLOW_SEEK_DIRECTION_in_relative_date139); 
                    INTEGER6=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_relative_date141); 

                    match(input, Token.UP, null); 
                    dateTime.seek((SEEK_DIRECTION5!=null?SEEK_DIRECTION5.getText():null), (INTEGER6!=null?INTEGER6.getText():null));

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:43:5: ^( RELATIVE_DATE SEEK_DIRECTION SEEK_TYPE INTEGER DAY_OF_WEEK )
                    {
                    match(input,RELATIVE_DATE,FOLLOW_RELATIVE_DATE_in_relative_date165); 

                    match(input, Token.DOWN, null); 
                    SEEK_DIRECTION7=(CommonTree)match(input,SEEK_DIRECTION,FOLLOW_SEEK_DIRECTION_in_relative_date167); 
                    SEEK_TYPE8=(CommonTree)match(input,SEEK_TYPE,FOLLOW_SEEK_TYPE_in_relative_date169); 
                    INTEGER9=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_relative_date171); 
                    DAY_OF_WEEK10=(CommonTree)match(input,DAY_OF_WEEK,FOLLOW_DAY_OF_WEEK_in_relative_date173); 

                    match(input, Token.UP, null); 
                    dateTime.seekToDayOfWeek((SEEK_DIRECTION7!=null?SEEK_DIRECTION7.getText():null), (SEEK_TYPE8!=null?SEEK_TYPE8.getText():null), (INTEGER9!=null?INTEGER9.getText():null), (DAY_OF_WEEK10!=null?DAY_OF_WEEK10.getText():null));

                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:48:5: ^( RELATIVE_DATE SEEK_DIRECTION SEEK_TYPE INTEGER SPAN )
                    {
                    match(input,RELATIVE_DATE,FOLLOW_RELATIVE_DATE_in_relative_date199); 

                    match(input, Token.DOWN, null); 
                    SEEK_DIRECTION11=(CommonTree)match(input,SEEK_DIRECTION,FOLLOW_SEEK_DIRECTION_in_relative_date201); 
                    match(input,SEEK_TYPE,FOLLOW_SEEK_TYPE_in_relative_date203); 
                    INTEGER12=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_relative_date205); 
                    SPAN13=(CommonTree)match(input,SPAN,FOLLOW_SPAN_in_relative_date207); 

                    match(input, Token.UP, null); 
                    dateTime.seekBySpan((SEEK_DIRECTION11!=null?SEEK_DIRECTION11.getText():null), (INTEGER12!=null?INTEGER12.getText():null), (SPAN13!=null?SPAN13.getText():null));

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "relative_date"


    // $ANTLR start "explicit_time"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:52:1: explicit_time : ^( EXPLICIT_TIME hours= INTEGER minutes= INTEGER ( AM_PM )? ) ;
    public final void explicit_time() throws RecognitionException {
        CommonTree hours=null;
        CommonTree minutes=null;
        CommonTree AM_PM14=null;

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:53:3: ( ^( EXPLICIT_TIME hours= INTEGER minutes= INTEGER ( AM_PM )? ) )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:53:5: ^( EXPLICIT_TIME hours= INTEGER minutes= INTEGER ( AM_PM )? )
            {
            match(input,EXPLICIT_TIME,FOLLOW_EXPLICIT_TIME_in_explicit_time232); 

            match(input, Token.DOWN, null); 
            hours=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_explicit_time236); 
            minutes=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_explicit_time240); 
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:53:51: ( AM_PM )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==AM_PM) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:53:51: AM_PM
                    {
                    AM_PM14=(CommonTree)match(input,AM_PM,FOLLOW_AM_PM_in_explicit_time242); 

                    }
                    break;

            }


            match(input, Token.UP, null); 
            dateTime.setExplicitTime((hours!=null?hours.getText():null), (minutes!=null?minutes.getText():null), (AM_PM14!=null?AM_PM14.getText():null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "explicit_time"

    // Delegated rules


 

    public static final BitSet FOLLOW_DATE_TIME_in_datetime47 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_date_in_datetime49 = new BitSet(new long[]{0x0000000000000088L});
    public static final BitSet FOLLOW_time_in_datetime51 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_relative_date_in_date67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_explicit_date_in_date74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_explicit_time_in_time89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPLICIT_DATE_in_explicit_date103 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MONTH_in_explicit_date105 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DAY_OF_MONTH_in_explicit_date107 = new BitSet(new long[]{0x0000000000006008L});
    public static final BitSet FOLLOW_YEAR_in_explicit_date109 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_ERA_in_explicit_date112 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RELATIVE_DATE_in_relative_date137 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SEEK_DIRECTION_in_relative_date139 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_INTEGER_in_relative_date141 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RELATIVE_DATE_in_relative_date165 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SEEK_DIRECTION_in_relative_date167 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_SEEK_TYPE_in_relative_date169 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_INTEGER_in_relative_date171 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_DAY_OF_WEEK_in_relative_date173 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RELATIVE_DATE_in_relative_date199 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SEEK_DIRECTION_in_relative_date201 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_SEEK_TYPE_in_relative_date203 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_INTEGER_in_relative_date205 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_SPAN_in_relative_date207 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPLICIT_TIME_in_explicit_time232 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTEGER_in_explicit_time236 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_INTEGER_in_explicit_time240 = new BitSet(new long[]{0x0000000000000108L});
    public static final BitSet FOLLOW_AM_PM_in_explicit_time242 = new BitSet(new long[]{0x0000000000000008L});

}