// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g 2010-02-22 09:58:08
 package com.natty.date.generated; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class DateLexer extends Lexer {
    public static final int NINETEEN=179;
    public static final int UNKNOWN_CHAR=228;
    public static final int INT_08=55;
    public static final int INT_09=56;
    public static final int TWENTY=180;
    public static final int INT_02=49;
    public static final int INT_03=50;
    public static final int INT_00=47;
    public static final int INT_01=48;
    public static final int APRIL=8;
    public static final int INT_06=53;
    public static final int COMING=218;
    public static final int INT_07=54;
    public static final int INT_04=51;
    public static final int INT_05=52;
    public static final int NOW=221;
    public static final int EOF=-1;
    public static final int MONTH=27;
    public static final int EIGHTEENTH=199;
    public static final int THIS=214;
    public static final int NOON=37;
    public static final int TOMORROW=30;
    public static final int FIFTEENTH=196;
    public static final int TODAY=29;
    public static final int NOVEMBER=15;
    public static final int SEVENTH=188;
    public static final int FEBRUARY=6;
    public static final int T=34;
    public static final int SUNDAY=17;
    public static final int SEVEN=167;
    public static final int ELEVEN=171;
    public static final int THIRTEEN=173;
    public static final int UPCOMING=219;
    public static final int SIX=166;
    public static final int FIFTH=186;
    public static final int MORNING=38;
    public static final int DECEMBER=16;
    public static final int AUGUST=12;
    public static final int TUESDAY=19;
    public static final int INT_47=104;
    public static final int THIRD=184;
    public static final int INT_46=103;
    public static final int INT_45=102;
    public static final int INT_44=101;
    public static final int RD=159;
    public static final int INT_49=106;
    public static final int INT_48=105;
    public static final int THE=210;
    public static final int WHITE_SPACE=226;
    public static final int INT_42=99;
    public static final int INT_43=100;
    public static final int FRIDAY=22;
    public static final int INT_40=97;
    public static final int INT_41=98;
    public static final int AT=211;
    public static final int INT_34=91;
    public static final int INT_33=90;
    public static final int SINGLE_QUOTE=208;
    public static final int INT_36=93;
    public static final int INT_35=92;
    public static final int SLASH=206;
    public static final int INT_38=95;
    public static final int INT_37=94;
    public static final int INT_39=96;
    public static final int NINTH=190;
    public static final int TWENTIETH=201;
    public static final int PLUS=207;
    public static final int INT_30=87;
    public static final int INT_31=88;
    public static final int AM=32;
    public static final int INT_32=89;
    public static final int INT_29=86;
    public static final int INT_28=85;
    public static final int INT_27=84;
    public static final int INT_26=83;
    public static final int INT_25=82;
    public static final int INT_24=81;
    public static final int INT_23=80;
    public static final int INT_22=79;
    public static final int TH=160;
    public static final int FOURTEENTH=195;
    public static final int SIXTEEN=176;
    public static final int AGO=222;
    public static final int ELEVENTH=192;
    public static final int ST=157;
    public static final int TWO=162;
    public static final int INT_20=77;
    public static final int HOUR=24;
    public static final int INT_21=78;
    public static final int JANUARY=5;
    public static final int THIRTEENTH=194;
    public static final int COLON=203;
    public static final int INT_16=73;
    public static final int INT_15=72;
    public static final int INT_18=75;
    public static final int INT_17=74;
    public static final int INT_12=69;
    public static final int INT_11=68;
    public static final int INT_14=71;
    public static final int INT_13=70;
    public static final int INT_19=76;
    public static final int FIFTEEN=175;
    public static final int NINE=169;
    public static final int THREE=163;
    public static final int FOURTEEN=174;
    public static final int INT_10=67;
    public static final int YESTERDAY=31;
    public static final int SEVENTEENTH=198;
    public static final int FIRST=182;
    public static final int INT_81=138;
    public static final int INT_80=137;
    public static final int SEPTEMBER=13;
    public static final int WEEK=26;
    public static final int INT_83=140;
    public static final int INT_82=139;
    public static final int INT_85=142;
    public static final int INT_84=141;
    public static final int WEDNESDAY=20;
    public static final int INT_87=144;
    public static final int INT_86=143;
    public static final int JULY=11;
    public static final int NINETEENTH=200;
    public static final int OCTOBER=14;
    public static final int DAY=25;
    public static final int ONE=161;
    public static final int MIDNIGHT=36;
    public static final int INT_88=145;
    public static final int MARCH=7;
    public static final int INT_89=146;
    public static final int PAST=217;
    public static final int SEVENTEEN=177;
    public static final int INT_72=129;
    public static final int INT_71=128;
    public static final int INT_70=127;
    public static final int INT_76=133;
    public static final int INT_75=132;
    public static final int INT_74=131;
    public static final int INT_73=130;
    public static final int THIRTIETH=202;
    public static final int LAST=215;
    public static final int INT_79=136;
    public static final int INT_77=134;
    public static final int EIGHTEEN=178;
    public static final int INT_78=135;
    public static final int ND=158;
    public static final int INT_63=120;
    public static final int INT_62=119;
    public static final int INT_65=122;
    public static final int INT_64=121;
    public static final int FOURTH=185;
    public static final int SECOND=183;
    public static final int INT_61=118;
    public static final int INT_60=117;
    public static final int SATURDAY=23;
    public static final int FOUR=164;
    public static final int TEN=170;
    public static final int ON=212;
    public static final int MONDAY=18;
    public static final int JUNE=10;
    public static final int OF=213;
    public static final int INT_66=123;
    public static final int INT_67=124;
    public static final int INT_68=125;
    public static final int INT_69=126;
    public static final int INT_54=111;
    public static final int INT_53=110;
    public static final int INT_52=109;
    public static final int INT_51=108;
    public static final int INT_50=107;
    public static final int THURSDAY=21;
    public static final int PM=33;
    public static final int FROM=220;
    public static final int INT_59=116;
    public static final int INT_57=114;
    public static final int INT_58=115;
    public static final int EIGHTH=189;
    public static final int INT_55=112;
    public static final int INT_56=113;
    public static final int YEAR=28;
    public static final int TENTH=191;
    public static final int MAY=9;
    public static final int INT_9=66;
    public static final int INT_8=65;
    public static final int INT_7=64;
    public static final int SPACE=225;
    public static final int INT_6=63;
    public static final int INT_5=62;
    public static final int UTC=40;
    public static final int INT_4=61;
    public static final int INT_3=60;
    public static final int AKST=45;
    public static final int INT_2=59;
    public static final int MST=44;
    public static final int INT_1=58;
    public static final int EIGHT=168;
    public static final int INT_0=57;
    public static final int CST=43;
    public static final int IN=209;
    public static final int PST=42;
    public static final int COMMA=204;
    public static final int FIVE=165;
    public static final int THIRTY=181;
    public static final int NEXT=216;
    public static final int DIGIT=229;
    public static final int DOT=4;
    public static final int MILITARY_HOUR_SUFFIX=35;
    public static final int EST=41;
    public static final int HAST=46;
    public static final int DASH=205;
    public static final int TWELVE=172;
    public static final int BEFORE=223;
    public static final int AFTER=224;
    public static final int SIXTEENTH=197;
    public static final int INT_90=147;
    public static final int NIGHT=39;
    public static final int INT_97=154;
    public static final int INT_98=155;
    public static final int INT_95=152;
    public static final int INT_96=153;
    public static final int INT_93=150;
    public static final int INT_94=151;
    public static final int INT_91=148;
    public static final int INT_92=149;
    public static final int TWELFTH=193;
    public static final int INT_99=156;
    public static final int SIXTH=187;
    public static final int UNKNOWN_WORD=227;

    // delegates
    // delegators

    public DateLexer() {;} 
    public DateLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public DateLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g"; }

    // $ANTLR start "JANUARY"
    public final void mJANUARY() throws RecognitionException {
        try {
            int _type = JANUARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:7:11: ( 'january' ( 's' )? | 'jan' ( DOT )? )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='j') ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='a') ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2=='n') ) {
                        int LA3_3 = input.LA(4);

                        if ( (LA3_3=='u') ) {
                            alt3=1;
                        }
                        else {
                            alt3=2;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:7:13: 'january' ( 's' )?
                    {
                    match("january"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:7:23: ( 's' )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0=='s') ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:7:23: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:7:32: 'jan' ( DOT )?
                    {
                    match("jan"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:7:38: ( DOT )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='.') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:7:38: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JANUARY"

    // $ANTLR start "FEBRUARY"
    public final void mFEBRUARY() throws RecognitionException {
        try {
            int _type = FEBRUARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:8:11: ( 'february' ( 's' )? | 'feb' ( DOT )? )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='f') ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1=='e') ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2=='b') ) {
                        int LA6_3 = input.LA(4);

                        if ( (LA6_3=='r') ) {
                            alt6=1;
                        }
                        else {
                            alt6=2;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:8:13: 'february' ( 's' )?
                    {
                    match("february"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:8:24: ( 's' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='s') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:8:24: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:8:32: 'feb' ( DOT )?
                    {
                    match("feb"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:8:38: ( DOT )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='.') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:8:38: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FEBRUARY"

    // $ANTLR start "MARCH"
    public final void mMARCH() throws RecognitionException {
        try {
            int _type = MARCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:9:11: ( 'march' ( 'es' )? | 'mar' ( DOT )? )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='m') ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1=='a') ) {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2=='r') ) {
                        int LA9_3 = input.LA(4);

                        if ( (LA9_3=='c') ) {
                            alt9=1;
                        }
                        else {
                            alt9=2;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:9:13: 'march' ( 'es' )?
                    {
                    match("march"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:9:21: ( 'es' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='e') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:9:21: 'es'
                            {
                            match("es"); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:9:33: 'mar' ( DOT )?
                    {
                    match("mar"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:9:39: ( DOT )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='.') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:9:39: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MARCH"

    // $ANTLR start "APRIL"
    public final void mAPRIL() throws RecognitionException {
        try {
            int _type = APRIL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:10:11: ( 'april' ( 's' )? | 'apr' ( DOT )? )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='a') ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1=='p') ) {
                    int LA12_2 = input.LA(3);

                    if ( (LA12_2=='r') ) {
                        int LA12_3 = input.LA(4);

                        if ( (LA12_3=='i') ) {
                            alt12=1;
                        }
                        else {
                            alt12=2;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:10:13: 'april' ( 's' )?
                    {
                    match("april"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:10:21: ( 's' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='s') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:10:21: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:10:32: 'apr' ( DOT )?
                    {
                    match("apr"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:10:38: ( DOT )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='.') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:10:38: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "APRIL"

    // $ANTLR start "MAY"
    public final void mMAY() throws RecognitionException {
        try {
            int _type = MAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:11:11: ( 'may' ( 's' )? )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:11:13: 'may' ( 's' )?
            {
            match("may"); 

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:11:19: ( 's' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='s') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:11:19: 's'
                    {
                    match('s'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MAY"

    // $ANTLR start "JUNE"
    public final void mJUNE() throws RecognitionException {
        try {
            int _type = JUNE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:12:11: ( 'june' ( 's' )? | 'jun' ( DOT )? )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='j') ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1=='u') ) {
                    int LA16_2 = input.LA(3);

                    if ( (LA16_2=='n') ) {
                        int LA16_3 = input.LA(4);

                        if ( (LA16_3=='e') ) {
                            alt16=1;
                        }
                        else {
                            alt16=2;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:12:13: 'june' ( 's' )?
                    {
                    match("june"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:12:20: ( 's' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='s') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:12:20: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:12:32: 'jun' ( DOT )?
                    {
                    match("jun"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:12:38: ( DOT )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='.') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:12:38: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JUNE"

    // $ANTLR start "JULY"
    public final void mJULY() throws RecognitionException {
        try {
            int _type = JULY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:13:11: ( 'july' ( 's' )? | 'jul' ( DOT )? )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='j') ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1=='u') ) {
                    int LA19_2 = input.LA(3);

                    if ( (LA19_2=='l') ) {
                        int LA19_3 = input.LA(4);

                        if ( (LA19_3=='y') ) {
                            alt19=1;
                        }
                        else {
                            alt19=2;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:13:13: 'july' ( 's' )?
                    {
                    match("july"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:13:20: ( 's' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='s') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:13:20: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:13:32: 'jul' ( DOT )?
                    {
                    match("jul"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:13:38: ( DOT )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='.') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:13:38: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JULY"

    // $ANTLR start "AUGUST"
    public final void mAUGUST() throws RecognitionException {
        try {
            int _type = AUGUST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:14:11: ( 'august' ( 's' )? | 'aug' ( DOT )? )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='a') ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1=='u') ) {
                    int LA22_2 = input.LA(3);

                    if ( (LA22_2=='g') ) {
                        int LA22_3 = input.LA(4);

                        if ( (LA22_3=='u') ) {
                            alt22=1;
                        }
                        else {
                            alt22=2;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:14:13: 'august' ( 's' )?
                    {
                    match("august"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:14:22: ( 's' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='s') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:14:22: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:14:32: 'aug' ( DOT )?
                    {
                    match("aug"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:14:38: ( DOT )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0=='.') ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:14:38: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AUGUST"

    // $ANTLR start "SEPTEMBER"
    public final void mSEPTEMBER() throws RecognitionException {
        try {
            int _type = SEPTEMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:15:11: ( 'september' ( 's' )? | 'sep' ( DOT )? | 'sept' ( DOT )? )
            int alt26=3;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='s') ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1=='e') ) {
                    int LA26_2 = input.LA(3);

                    if ( (LA26_2=='p') ) {
                        int LA26_3 = input.LA(4);

                        if ( (LA26_3=='t') ) {
                            int LA26_4 = input.LA(5);

                            if ( (LA26_4=='e') ) {
                                alt26=1;
                            }
                            else {
                                alt26=3;}
                        }
                        else {
                            alt26=2;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:15:13: 'september' ( 's' )?
                    {
                    match("september"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:15:25: ( 's' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0=='s') ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:15:25: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:15:32: 'sep' ( DOT )?
                    {
                    match("sep"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:15:38: ( DOT )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0=='.') ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:15:38: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:15:45: 'sept' ( DOT )?
                    {
                    match("sept"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:15:52: ( DOT )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0=='.') ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:15:52: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEPTEMBER"

    // $ANTLR start "OCTOBER"
    public final void mOCTOBER() throws RecognitionException {
        try {
            int _type = OCTOBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:16:11: ( 'october' ( 's' )? | 'oct' ( DOT )? )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0=='o') ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1=='c') ) {
                    int LA29_2 = input.LA(3);

                    if ( (LA29_2=='t') ) {
                        int LA29_3 = input.LA(4);

                        if ( (LA29_3=='o') ) {
                            alt29=1;
                        }
                        else {
                            alt29=2;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:16:13: 'october' ( 's' )?
                    {
                    match("october"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:16:23: ( 's' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0=='s') ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:16:23: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:16:32: 'oct' ( DOT )?
                    {
                    match("oct"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:16:38: ( DOT )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0=='.') ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:16:38: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OCTOBER"

    // $ANTLR start "NOVEMBER"
    public final void mNOVEMBER() throws RecognitionException {
        try {
            int _type = NOVEMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:17:11: ( 'november' ( 's' )? | 'nov' ( DOT )? )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0=='n') ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1=='o') ) {
                    int LA32_2 = input.LA(3);

                    if ( (LA32_2=='v') ) {
                        int LA32_3 = input.LA(4);

                        if ( (LA32_3=='e') ) {
                            alt32=1;
                        }
                        else {
                            alt32=2;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:17:13: 'november' ( 's' )?
                    {
                    match("november"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:17:24: ( 's' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0=='s') ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:17:24: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:17:32: 'nov' ( DOT )?
                    {
                    match("nov"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:17:38: ( DOT )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0=='.') ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:17:38: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOVEMBER"

    // $ANTLR start "DECEMBER"
    public final void mDECEMBER() throws RecognitionException {
        try {
            int _type = DECEMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:18:11: ( 'december' ( 's' )? | 'dec' ( DOT )? )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0=='d') ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1=='e') ) {
                    int LA35_2 = input.LA(3);

                    if ( (LA35_2=='c') ) {
                        int LA35_3 = input.LA(4);

                        if ( (LA35_3=='e') ) {
                            alt35=1;
                        }
                        else {
                            alt35=2;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:18:13: 'december' ( 's' )?
                    {
                    match("december"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:18:24: ( 's' )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0=='s') ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:18:24: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:18:32: 'dec' ( DOT )?
                    {
                    match("dec"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:18:38: ( DOT )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0=='.') ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:18:38: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DECEMBER"

    // $ANTLR start "SUNDAY"
    public final void mSUNDAY() throws RecognitionException {
        try {
            int _type = SUNDAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:20:11: ( 'sunday' ( 's' )? | 'sun' ( DOT )? | 'suns' ( DOT )? )
            int alt39=3;
            int LA39_0 = input.LA(1);

            if ( (LA39_0=='s') ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1=='u') ) {
                    int LA39_2 = input.LA(3);

                    if ( (LA39_2=='n') ) {
                        switch ( input.LA(4) ) {
                        case 'd':
                            {
                            alt39=1;
                            }
                            break;
                        case 's':
                            {
                            alt39=3;
                            }
                            break;
                        default:
                            alt39=2;}

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:20:13: 'sunday' ( 's' )?
                    {
                    match("sunday"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:20:22: ( 's' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0=='s') ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:20:22: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:20:32: 'sun' ( DOT )?
                    {
                    match("sun"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:20:38: ( DOT )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0=='.') ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:20:38: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:20:46: 'suns' ( DOT )?
                    {
                    match("suns"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:20:53: ( DOT )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0=='.') ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:20:53: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUNDAY"

    // $ANTLR start "MONDAY"
    public final void mMONDAY() throws RecognitionException {
        try {
            int _type = MONDAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:21:11: ( 'monday' ( 's' )? | 'mon' ( DOT )? | 'mons' ( DOT )? )
            int alt43=3;
            int LA43_0 = input.LA(1);

            if ( (LA43_0=='m') ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1=='o') ) {
                    int LA43_2 = input.LA(3);

                    if ( (LA43_2=='n') ) {
                        switch ( input.LA(4) ) {
                        case 'd':
                            {
                            alt43=1;
                            }
                            break;
                        case 's':
                            {
                            alt43=3;
                            }
                            break;
                        default:
                            alt43=2;}

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:21:13: 'monday' ( 's' )?
                    {
                    match("monday"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:21:22: ( 's' )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0=='s') ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:21:22: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:21:32: 'mon' ( DOT )?
                    {
                    match("mon"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:21:38: ( DOT )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0=='.') ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:21:38: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:21:46: 'mons' ( DOT )?
                    {
                    match("mons"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:21:53: ( DOT )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0=='.') ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:21:53: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MONDAY"

    // $ANTLR start "TUESDAY"
    public final void mTUESDAY() throws RecognitionException {
        try {
            int _type = TUESDAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:22:11: ( 'tuesday' ( 's' )? | 'tues' ( DOT )? | 'tue' ( DOT )? )
            int alt47=3;
            int LA47_0 = input.LA(1);

            if ( (LA47_0=='t') ) {
                int LA47_1 = input.LA(2);

                if ( (LA47_1=='u') ) {
                    int LA47_2 = input.LA(3);

                    if ( (LA47_2=='e') ) {
                        int LA47_3 = input.LA(4);

                        if ( (LA47_3=='s') ) {
                            int LA47_4 = input.LA(5);

                            if ( (LA47_4=='d') ) {
                                alt47=1;
                            }
                            else {
                                alt47=2;}
                        }
                        else {
                            alt47=3;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:22:13: 'tuesday' ( 's' )?
                    {
                    match("tuesday"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:22:23: ( 's' )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0=='s') ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:22:23: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:22:32: 'tues' ( DOT )?
                    {
                    match("tues"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:22:39: ( DOT )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0=='.') ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:22:39: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:22:46: 'tue' ( DOT )?
                    {
                    match("tue"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:22:52: ( DOT )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0=='.') ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:22:52: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TUESDAY"

    // $ANTLR start "WEDNESDAY"
    public final void mWEDNESDAY() throws RecognitionException {
        try {
            int _type = WEDNESDAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:23:11: ( 'wednesday' ( 's' )? | 'wed' ( DOT )? | 'weds' ( DOT )? )
            int alt51=3;
            int LA51_0 = input.LA(1);

            if ( (LA51_0=='w') ) {
                int LA51_1 = input.LA(2);

                if ( (LA51_1=='e') ) {
                    int LA51_2 = input.LA(3);

                    if ( (LA51_2=='d') ) {
                        switch ( input.LA(4) ) {
                        case 'n':
                            {
                            alt51=1;
                            }
                            break;
                        case 's':
                            {
                            alt51=3;
                            }
                            break;
                        default:
                            alt51=2;}

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:23:13: 'wednesday' ( 's' )?
                    {
                    match("wednesday"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:23:25: ( 's' )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0=='s') ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:23:25: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:23:32: 'wed' ( DOT )?
                    {
                    match("wed"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:23:38: ( DOT )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0=='.') ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:23:38: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:23:46: 'weds' ( DOT )?
                    {
                    match("weds"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:23:53: ( DOT )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0=='.') ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:23:53: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WEDNESDAY"

    // $ANTLR start "THURSDAY"
    public final void mTHURSDAY() throws RecognitionException {
        try {
            int _type = THURSDAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:24:11: ( 'thursday' ( 's' )? | 'thur' ( DOT )? | 'thu' ( DOT )? | 'thus' ( DOT )? | 'thurs' ( DOT )? )
            int alt57=5;
            alt57 = dfa57.predict(input);
            switch (alt57) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:24:13: 'thursday' ( 's' )?
                    {
                    match("thursday"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:24:24: ( 's' )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0=='s') ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:24:24: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:24:32: 'thur' ( DOT )?
                    {
                    match("thur"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:24:39: ( DOT )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0=='.') ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:24:39: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:24:46: 'thu' ( DOT )?
                    {
                    match("thu"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:24:52: ( DOT )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0=='.') ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:24:52: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:24:61: 'thus' ( DOT )?
                    {
                    match("thus"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:24:68: ( DOT )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0=='.') ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:24:68: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:24:75: 'thurs' ( DOT )?
                    {
                    match("thurs"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:24:83: ( DOT )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0=='.') ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:24:83: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THURSDAY"

    // $ANTLR start "FRIDAY"
    public final void mFRIDAY() throws RecognitionException {
        try {
            int _type = FRIDAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:25:11: ( 'friday' ( 's' )? | 'fri' ( DOT )? | 'fris' ( DOT )? )
            int alt61=3;
            int LA61_0 = input.LA(1);

            if ( (LA61_0=='f') ) {
                int LA61_1 = input.LA(2);

                if ( (LA61_1=='r') ) {
                    int LA61_2 = input.LA(3);

                    if ( (LA61_2=='i') ) {
                        switch ( input.LA(4) ) {
                        case 'd':
                            {
                            alt61=1;
                            }
                            break;
                        case 's':
                            {
                            alt61=3;
                            }
                            break;
                        default:
                            alt61=2;}

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 61, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:25:13: 'friday' ( 's' )?
                    {
                    match("friday"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:25:22: ( 's' )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0=='s') ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:25:22: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:25:32: 'fri' ( DOT )?
                    {
                    match("fri"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:25:38: ( DOT )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0=='.') ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:25:38: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:25:46: 'fris' ( DOT )?
                    {
                    match("fris"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:25:53: ( DOT )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0=='.') ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:25:53: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FRIDAY"

    // $ANTLR start "SATURDAY"
    public final void mSATURDAY() throws RecognitionException {
        try {
            int _type = SATURDAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:26:11: ( 'saturday' ( 's' )? | 'sat' ( DOT )? | 'sats' ( DOT )? | 'weekend' )
            int alt65=4;
            int LA65_0 = input.LA(1);

            if ( (LA65_0=='s') ) {
                int LA65_1 = input.LA(2);

                if ( (LA65_1=='a') ) {
                    int LA65_3 = input.LA(3);

                    if ( (LA65_3=='t') ) {
                        switch ( input.LA(4) ) {
                        case 'u':
                            {
                            alt65=1;
                            }
                            break;
                        case 's':
                            {
                            alt65=3;
                            }
                            break;
                        default:
                            alt65=2;}

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 65, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA65_0=='w') ) {
                alt65=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:26:13: 'saturday' ( 's' )?
                    {
                    match("saturday"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:26:24: ( 's' )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0=='s') ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:26:24: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:26:32: 'sat' ( DOT )?
                    {
                    match("sat"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:26:38: ( DOT )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0=='.') ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:26:38: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:26:46: 'sats' ( DOT )?
                    {
                    match("sats"); 

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:26:53: ( DOT )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0=='.') ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:26:53: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:26:61: 'weekend'
                    {
                    match("weekend"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SATURDAY"

    // $ANTLR start "HOUR"
    public final void mHOUR() throws RecognitionException {
        try {
            int _type = HOUR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:28:7: ( 'hour' | 'hours' )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0=='h') ) {
                int LA66_1 = input.LA(2);

                if ( (LA66_1=='o') ) {
                    int LA66_2 = input.LA(3);

                    if ( (LA66_2=='u') ) {
                        int LA66_3 = input.LA(4);

                        if ( (LA66_3=='r') ) {
                            int LA66_4 = input.LA(5);

                            if ( (LA66_4=='s') ) {
                                alt66=2;
                            }
                            else {
                                alt66=1;}
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 66, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 66, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 66, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:28:9: 'hour'
                    {
                    match("hour"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:28:19: 'hours'
                    {
                    match("hours"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HOUR"

    // $ANTLR start "DAY"
    public final void mDAY() throws RecognitionException {
        try {
            int _type = DAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:29:7: ( 'day' | 'days' )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0=='d') ) {
                int LA67_1 = input.LA(2);

                if ( (LA67_1=='a') ) {
                    int LA67_2 = input.LA(3);

                    if ( (LA67_2=='y') ) {
                        int LA67_3 = input.LA(4);

                        if ( (LA67_3=='s') ) {
                            alt67=2;
                        }
                        else {
                            alt67=1;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 67, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:29:9: 'day'
                    {
                    match("day"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:29:19: 'days'
                    {
                    match("days"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DAY"

    // $ANTLR start "WEEK"
    public final void mWEEK() throws RecognitionException {
        try {
            int _type = WEEK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:30:7: ( 'week' | 'weeks' )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0=='w') ) {
                int LA68_1 = input.LA(2);

                if ( (LA68_1=='e') ) {
                    int LA68_2 = input.LA(3);

                    if ( (LA68_2=='e') ) {
                        int LA68_3 = input.LA(4);

                        if ( (LA68_3=='k') ) {
                            int LA68_4 = input.LA(5);

                            if ( (LA68_4=='s') ) {
                                alt68=2;
                            }
                            else {
                                alt68=1;}
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 68, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 68, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:30:9: 'week'
                    {
                    match("week"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:30:19: 'weeks'
                    {
                    match("weeks"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WEEK"

    // $ANTLR start "MONTH"
    public final void mMONTH() throws RecognitionException {
        try {
            int _type = MONTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:31:7: ( 'month' | 'months' )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0=='m') ) {
                int LA69_1 = input.LA(2);

                if ( (LA69_1=='o') ) {
                    int LA69_2 = input.LA(3);

                    if ( (LA69_2=='n') ) {
                        int LA69_3 = input.LA(4);

                        if ( (LA69_3=='t') ) {
                            int LA69_4 = input.LA(5);

                            if ( (LA69_4=='h') ) {
                                int LA69_5 = input.LA(6);

                                if ( (LA69_5=='s') ) {
                                    alt69=2;
                                }
                                else {
                                    alt69=1;}
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 69, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 69, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 69, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:31:9: 'month'
                    {
                    match("month"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:31:19: 'months'
                    {
                    match("months"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MONTH"

    // $ANTLR start "YEAR"
    public final void mYEAR() throws RecognitionException {
        try {
            int _type = YEAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:32:7: ( 'year' | 'years' )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0=='y') ) {
                int LA70_1 = input.LA(2);

                if ( (LA70_1=='e') ) {
                    int LA70_2 = input.LA(3);

                    if ( (LA70_2=='a') ) {
                        int LA70_3 = input.LA(4);

                        if ( (LA70_3=='r') ) {
                            int LA70_4 = input.LA(5);

                            if ( (LA70_4=='s') ) {
                                alt70=2;
                            }
                            else {
                                alt70=1;}
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 70, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 70, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 70, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:32:9: 'year'
                    {
                    match("year"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:32:19: 'years'
                    {
                    match("years"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "YEAR"

    // $ANTLR start "TODAY"
    public final void mTODAY() throws RecognitionException {
        try {
            int _type = TODAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:34:11: ( 'today' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:34:13: 'today'
            {
            match("today"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TODAY"

    // $ANTLR start "TOMORROW"
    public final void mTOMORROW() throws RecognitionException {
        try {
            int _type = TOMORROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:35:11: ( 'tomorow' | 'tomorrow' | 'tommorow' | 'tommorrow' )
            int alt71=4;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:35:13: 'tomorow'
                    {
                    match("tomorow"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:35:27: 'tomorrow'
                    {
                    match("tomorrow"); 


                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:35:42: 'tommorow'
                    {
                    match("tommorow"); 


                    }
                    break;
                case 4 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:35:55: 'tommorrow'
                    {
                    match("tommorrow"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TOMORROW"

    // $ANTLR start "YESTERDAY"
    public final void mYESTERDAY() throws RecognitionException {
        try {
            int _type = YESTERDAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:36:11: ( 'yesterday' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:36:13: 'yesterday'
            {
            match("yesterday"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "YESTERDAY"

    // $ANTLR start "AM"
    public final void mAM() throws RecognitionException {
        try {
            int _type = AM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:40:4: ( 'am' | 'a.m.' | 'a' )
            int alt72=3;
            int LA72_0 = input.LA(1);

            if ( (LA72_0=='a') ) {
                switch ( input.LA(2) ) {
                case 'm':
                    {
                    alt72=1;
                    }
                    break;
                case '.':
                    {
                    alt72=2;
                    }
                    break;
                default:
                    alt72=3;}

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:40:6: 'am'
                    {
                    match("am"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:40:13: 'a.m.'
                    {
                    match("a.m."); 


                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:40:22: 'a'
                    {
                    match('a'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AM"

    // $ANTLR start "PM"
    public final void mPM() throws RecognitionException {
        try {
            int _type = PM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:41:4: ( 'pm' | 'p.m.' | 'p' )
            int alt73=3;
            int LA73_0 = input.LA(1);

            if ( (LA73_0=='p') ) {
                switch ( input.LA(2) ) {
                case 'm':
                    {
                    alt73=1;
                    }
                    break;
                case '.':
                    {
                    alt73=2;
                    }
                    break;
                default:
                    alt73=3;}

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:41:6: 'pm'
                    {
                    match("pm"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:41:13: 'p.m.'
                    {
                    match("p.m."); 


                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:41:22: 'p'
                    {
                    match('p'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PM"

    // $ANTLR start "T"
    public final void mT() throws RecognitionException {
        try {
            int _type = T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:42:4: ( 't' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:42:6: 't'
            {
            match('t'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T"

    // $ANTLR start "MILITARY_HOUR_SUFFIX"
    public final void mMILITARY_HOUR_SUFFIX() throws RecognitionException {
        try {
            int _type = MILITARY_HOUR_SUFFIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:44:22: ( 'h' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:44:24: 'h'
            {
            match('h'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MILITARY_HOUR_SUFFIX"

    // $ANTLR start "MIDNIGHT"
    public final void mMIDNIGHT() throws RecognitionException {
        try {
            int _type = MIDNIGHT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:46:10: ( 'midnight' | 'mid-night' )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0=='m') ) {
                int LA74_1 = input.LA(2);

                if ( (LA74_1=='i') ) {
                    int LA74_2 = input.LA(3);

                    if ( (LA74_2=='d') ) {
                        int LA74_3 = input.LA(4);

                        if ( (LA74_3=='n') ) {
                            alt74=1;
                        }
                        else if ( (LA74_3=='-') ) {
                            alt74=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 74, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 74, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 74, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:46:12: 'midnight'
                    {
                    match("midnight"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:46:25: 'mid-night'
                    {
                    match("mid-night"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MIDNIGHT"

    // $ANTLR start "NOON"
    public final void mNOON() throws RecognitionException {
        try {
            int _type = NOON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:47:10: ( 'noon' | 'afternoon' | 'after-noon' )
            int alt75=3;
            int LA75_0 = input.LA(1);

            if ( (LA75_0=='n') ) {
                alt75=1;
            }
            else if ( (LA75_0=='a') ) {
                int LA75_2 = input.LA(2);

                if ( (LA75_2=='f') ) {
                    int LA75_3 = input.LA(3);

                    if ( (LA75_3=='t') ) {
                        int LA75_4 = input.LA(4);

                        if ( (LA75_4=='e') ) {
                            int LA75_5 = input.LA(5);

                            if ( (LA75_5=='r') ) {
                                int LA75_6 = input.LA(6);

                                if ( (LA75_6=='n') ) {
                                    alt75=2;
                                }
                                else if ( (LA75_6=='-') ) {
                                    alt75=3;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 75, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 75, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 75, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 75, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 75, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:47:12: 'noon'
                    {
                    match("noon"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:47:25: 'afternoon'
                    {
                    match("afternoon"); 


                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:47:39: 'after-noon'
                    {
                    match("after-noon"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOON"

    // $ANTLR start "MORNING"
    public final void mMORNING() throws RecognitionException {
        try {
            int _type = MORNING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:48:10: ( 'morning' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:48:12: 'morning'
            {
            match("morning"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MORNING"

    // $ANTLR start "NIGHT"
    public final void mNIGHT() throws RecognitionException {
        try {
            int _type = NIGHT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:49:10: ( 'night' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:49:12: 'night'
            {
            match("night"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NIGHT"

    // $ANTLR start "UTC"
    public final void mUTC() throws RecognitionException {
        try {
            int _type = UTC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:51:6: ( 'utc' | 'gmt' | 'z' )
            int alt76=3;
            switch ( input.LA(1) ) {
            case 'u':
                {
                alt76=1;
                }
                break;
            case 'g':
                {
                alt76=2;
                }
                break;
            case 'z':
                {
                alt76=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:51:8: 'utc'
                    {
                    match("utc"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:51:17: 'gmt'
                    {
                    match("gmt"); 


                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:51:26: 'z'
                    {
                    match('z'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UTC"

    // $ANTLR start "EST"
    public final void mEST() throws RecognitionException {
        try {
            int _type = EST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:52:6: ( 'est' | 'edt' | 'et' )
            int alt77=3;
            int LA77_0 = input.LA(1);

            if ( (LA77_0=='e') ) {
                switch ( input.LA(2) ) {
                case 's':
                    {
                    alt77=1;
                    }
                    break;
                case 'd':
                    {
                    alt77=2;
                    }
                    break;
                case 't':
                    {
                    alt77=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 77, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:52:8: 'est'
                    {
                    match("est"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:52:17: 'edt'
                    {
                    match("edt"); 


                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:52:26: 'et'
                    {
                    match("et"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EST"

    // $ANTLR start "PST"
    public final void mPST() throws RecognitionException {
        try {
            int _type = PST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:53:6: ( 'pst' | 'pdt' | 'pt' )
            int alt78=3;
            int LA78_0 = input.LA(1);

            if ( (LA78_0=='p') ) {
                switch ( input.LA(2) ) {
                case 's':
                    {
                    alt78=1;
                    }
                    break;
                case 'd':
                    {
                    alt78=2;
                    }
                    break;
                case 't':
                    {
                    alt78=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 78, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:53:8: 'pst'
                    {
                    match("pst"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:53:17: 'pdt'
                    {
                    match("pdt"); 


                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:53:26: 'pt'
                    {
                    match("pt"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PST"

    // $ANTLR start "CST"
    public final void mCST() throws RecognitionException {
        try {
            int _type = CST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:54:6: ( 'cst' | 'cdt' | 'ct' )
            int alt79=3;
            int LA79_0 = input.LA(1);

            if ( (LA79_0=='c') ) {
                switch ( input.LA(2) ) {
                case 's':
                    {
                    alt79=1;
                    }
                    break;
                case 'd':
                    {
                    alt79=2;
                    }
                    break;
                case 't':
                    {
                    alt79=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 79, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:54:8: 'cst'
                    {
                    match("cst"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:54:17: 'cdt'
                    {
                    match("cdt"); 


                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:54:26: 'ct'
                    {
                    match("ct"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CST"

    // $ANTLR start "MST"
    public final void mMST() throws RecognitionException {
        try {
            int _type = MST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:55:6: ( 'mst' | 'mdt' | 'mt' )
            int alt80=3;
            int LA80_0 = input.LA(1);

            if ( (LA80_0=='m') ) {
                switch ( input.LA(2) ) {
                case 's':
                    {
                    alt80=1;
                    }
                    break;
                case 'd':
                    {
                    alt80=2;
                    }
                    break;
                case 't':
                    {
                    alt80=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 80, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:55:8: 'mst'
                    {
                    match("mst"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:55:17: 'mdt'
                    {
                    match("mdt"); 


                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:55:26: 'mt'
                    {
                    match("mt"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MST"

    // $ANTLR start "AKST"
    public final void mAKST() throws RecognitionException {
        try {
            int _type = AKST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:56:6: ( 'akst' | 'akdt' | 'akt' )
            int alt81=3;
            int LA81_0 = input.LA(1);

            if ( (LA81_0=='a') ) {
                int LA81_1 = input.LA(2);

                if ( (LA81_1=='k') ) {
                    switch ( input.LA(3) ) {
                    case 's':
                        {
                        alt81=1;
                        }
                        break;
                    case 'd':
                        {
                        alt81=2;
                        }
                        break;
                    case 't':
                        {
                        alt81=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 81, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 81, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:56:8: 'akst'
                    {
                    match("akst"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:56:17: 'akdt'
                    {
                    match("akdt"); 


                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:56:26: 'akt'
                    {
                    match("akt"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AKST"

    // $ANTLR start "HAST"
    public final void mHAST() throws RecognitionException {
        try {
            int _type = HAST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:57:6: ( 'hast' | 'hadt' | 'hat' | 'hst' )
            int alt82=4;
            int LA82_0 = input.LA(1);

            if ( (LA82_0=='h') ) {
                int LA82_1 = input.LA(2);

                if ( (LA82_1=='a') ) {
                    switch ( input.LA(3) ) {
                    case 's':
                        {
                        alt82=1;
                        }
                        break;
                    case 'd':
                        {
                        alt82=2;
                        }
                        break;
                    case 't':
                        {
                        alt82=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 82, 2, input);

                        throw nvae;
                    }

                }
                else if ( (LA82_1=='s') ) {
                    alt82=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 82, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:57:8: 'hast'
                    {
                    match("hast"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:57:17: 'hadt'
                    {
                    match("hadt"); 


                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:57:26: 'hat'
                    {
                    match("hat"); 


                    }
                    break;
                case 4 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:57:34: 'hst'
                    {
                    match("hst"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HAST"

    // $ANTLR start "INT_00"
    public final void mINT_00() throws RecognitionException {
        try {
            int _type = INT_00;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:61:8: ( '00' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:61:10: '00'
            {
            match("00"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_00"

    // $ANTLR start "INT_01"
    public final void mINT_01() throws RecognitionException {
        try {
            int _type = INT_01;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:62:8: ( '01' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:62:10: '01'
            {
            match("01"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_01"

    // $ANTLR start "INT_02"
    public final void mINT_02() throws RecognitionException {
        try {
            int _type = INT_02;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:63:8: ( '02' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:63:10: '02'
            {
            match("02"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_02"

    // $ANTLR start "INT_03"
    public final void mINT_03() throws RecognitionException {
        try {
            int _type = INT_03;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:64:8: ( '03' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:64:10: '03'
            {
            match("03"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_03"

    // $ANTLR start "INT_04"
    public final void mINT_04() throws RecognitionException {
        try {
            int _type = INT_04;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:65:8: ( '04' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:65:10: '04'
            {
            match("04"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_04"

    // $ANTLR start "INT_05"
    public final void mINT_05() throws RecognitionException {
        try {
            int _type = INT_05;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:66:8: ( '05' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:66:10: '05'
            {
            match("05"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_05"

    // $ANTLR start "INT_06"
    public final void mINT_06() throws RecognitionException {
        try {
            int _type = INT_06;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:67:8: ( '06' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:67:10: '06'
            {
            match("06"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_06"

    // $ANTLR start "INT_07"
    public final void mINT_07() throws RecognitionException {
        try {
            int _type = INT_07;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:68:8: ( '07' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:68:10: '07'
            {
            match("07"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_07"

    // $ANTLR start "INT_08"
    public final void mINT_08() throws RecognitionException {
        try {
            int _type = INT_08;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:69:8: ( '08' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:69:10: '08'
            {
            match("08"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_08"

    // $ANTLR start "INT_09"
    public final void mINT_09() throws RecognitionException {
        try {
            int _type = INT_09;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:70:8: ( '09' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:70:10: '09'
            {
            match("09"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_09"

    // $ANTLR start "INT_0"
    public final void mINT_0() throws RecognitionException {
        try {
            int _type = INT_0;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:71:8: ( '0' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:71:10: '0'
            {
            match('0'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_0"

    // $ANTLR start "INT_1"
    public final void mINT_1() throws RecognitionException {
        try {
            int _type = INT_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:72:8: ( '1' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:72:10: '1'
            {
            match('1'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_1"

    // $ANTLR start "INT_2"
    public final void mINT_2() throws RecognitionException {
        try {
            int _type = INT_2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:73:8: ( '2' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:73:10: '2'
            {
            match('2'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_2"

    // $ANTLR start "INT_3"
    public final void mINT_3() throws RecognitionException {
        try {
            int _type = INT_3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:74:8: ( '3' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:74:10: '3'
            {
            match('3'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_3"

    // $ANTLR start "INT_4"
    public final void mINT_4() throws RecognitionException {
        try {
            int _type = INT_4;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:75:8: ( '4' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:75:10: '4'
            {
            match('4'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_4"

    // $ANTLR start "INT_5"
    public final void mINT_5() throws RecognitionException {
        try {
            int _type = INT_5;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:76:8: ( '5' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:76:10: '5'
            {
            match('5'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_5"

    // $ANTLR start "INT_6"
    public final void mINT_6() throws RecognitionException {
        try {
            int _type = INT_6;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:77:8: ( '6' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:77:10: '6'
            {
            match('6'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_6"

    // $ANTLR start "INT_7"
    public final void mINT_7() throws RecognitionException {
        try {
            int _type = INT_7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:78:8: ( '7' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:78:10: '7'
            {
            match('7'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_7"

    // $ANTLR start "INT_8"
    public final void mINT_8() throws RecognitionException {
        try {
            int _type = INT_8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:79:8: ( '8' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:79:10: '8'
            {
            match('8'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_8"

    // $ANTLR start "INT_9"
    public final void mINT_9() throws RecognitionException {
        try {
            int _type = INT_9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:80:8: ( '9' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:80:10: '9'
            {
            match('9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_9"

    // $ANTLR start "INT_10"
    public final void mINT_10() throws RecognitionException {
        try {
            int _type = INT_10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:81:8: ( '10' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:81:10: '10'
            {
            match("10"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_10"

    // $ANTLR start "INT_11"
    public final void mINT_11() throws RecognitionException {
        try {
            int _type = INT_11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:82:8: ( '11' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:82:10: '11'
            {
            match("11"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_11"

    // $ANTLR start "INT_12"
    public final void mINT_12() throws RecognitionException {
        try {
            int _type = INT_12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:83:8: ( '12' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:83:10: '12'
            {
            match("12"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_12"

    // $ANTLR start "INT_13"
    public final void mINT_13() throws RecognitionException {
        try {
            int _type = INT_13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:84:8: ( '13' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:84:10: '13'
            {
            match("13"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_13"

    // $ANTLR start "INT_14"
    public final void mINT_14() throws RecognitionException {
        try {
            int _type = INT_14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:85:8: ( '14' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:85:10: '14'
            {
            match("14"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_14"

    // $ANTLR start "INT_15"
    public final void mINT_15() throws RecognitionException {
        try {
            int _type = INT_15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:86:8: ( '15' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:86:10: '15'
            {
            match("15"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_15"

    // $ANTLR start "INT_16"
    public final void mINT_16() throws RecognitionException {
        try {
            int _type = INT_16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:87:8: ( '16' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:87:10: '16'
            {
            match("16"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_16"

    // $ANTLR start "INT_17"
    public final void mINT_17() throws RecognitionException {
        try {
            int _type = INT_17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:88:8: ( '17' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:88:10: '17'
            {
            match("17"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_17"

    // $ANTLR start "INT_18"
    public final void mINT_18() throws RecognitionException {
        try {
            int _type = INT_18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:89:8: ( '18' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:89:10: '18'
            {
            match("18"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_18"

    // $ANTLR start "INT_19"
    public final void mINT_19() throws RecognitionException {
        try {
            int _type = INT_19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:90:8: ( '19' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:90:10: '19'
            {
            match("19"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_19"

    // $ANTLR start "INT_20"
    public final void mINT_20() throws RecognitionException {
        try {
            int _type = INT_20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:91:8: ( '20' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:91:10: '20'
            {
            match("20"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_20"

    // $ANTLR start "INT_21"
    public final void mINT_21() throws RecognitionException {
        try {
            int _type = INT_21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:92:8: ( '21' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:92:10: '21'
            {
            match("21"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_21"

    // $ANTLR start "INT_22"
    public final void mINT_22() throws RecognitionException {
        try {
            int _type = INT_22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:93:8: ( '22' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:93:10: '22'
            {
            match("22"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_22"

    // $ANTLR start "INT_23"
    public final void mINT_23() throws RecognitionException {
        try {
            int _type = INT_23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:94:8: ( '23' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:94:10: '23'
            {
            match("23"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_23"

    // $ANTLR start "INT_24"
    public final void mINT_24() throws RecognitionException {
        try {
            int _type = INT_24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:95:8: ( '24' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:95:10: '24'
            {
            match("24"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_24"

    // $ANTLR start "INT_25"
    public final void mINT_25() throws RecognitionException {
        try {
            int _type = INT_25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:96:8: ( '25' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:96:10: '25'
            {
            match("25"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_25"

    // $ANTLR start "INT_26"
    public final void mINT_26() throws RecognitionException {
        try {
            int _type = INT_26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:97:8: ( '26' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:97:10: '26'
            {
            match("26"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_26"

    // $ANTLR start "INT_27"
    public final void mINT_27() throws RecognitionException {
        try {
            int _type = INT_27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:98:8: ( '27' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:98:10: '27'
            {
            match("27"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_27"

    // $ANTLR start "INT_28"
    public final void mINT_28() throws RecognitionException {
        try {
            int _type = INT_28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:99:8: ( '28' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:99:10: '28'
            {
            match("28"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_28"

    // $ANTLR start "INT_29"
    public final void mINT_29() throws RecognitionException {
        try {
            int _type = INT_29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:100:8: ( '29' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:100:10: '29'
            {
            match("29"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_29"

    // $ANTLR start "INT_30"
    public final void mINT_30() throws RecognitionException {
        try {
            int _type = INT_30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:101:8: ( '30' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:101:10: '30'
            {
            match("30"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_30"

    // $ANTLR start "INT_31"
    public final void mINT_31() throws RecognitionException {
        try {
            int _type = INT_31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:102:8: ( '31' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:102:10: '31'
            {
            match("31"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_31"

    // $ANTLR start "INT_32"
    public final void mINT_32() throws RecognitionException {
        try {
            int _type = INT_32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:103:8: ( '32' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:103:10: '32'
            {
            match("32"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_32"

    // $ANTLR start "INT_33"
    public final void mINT_33() throws RecognitionException {
        try {
            int _type = INT_33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:104:8: ( '33' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:104:10: '33'
            {
            match("33"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_33"

    // $ANTLR start "INT_34"
    public final void mINT_34() throws RecognitionException {
        try {
            int _type = INT_34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:105:8: ( '34' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:105:10: '34'
            {
            match("34"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_34"

    // $ANTLR start "INT_35"
    public final void mINT_35() throws RecognitionException {
        try {
            int _type = INT_35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:106:8: ( '35' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:106:10: '35'
            {
            match("35"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_35"

    // $ANTLR start "INT_36"
    public final void mINT_36() throws RecognitionException {
        try {
            int _type = INT_36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:107:8: ( '36' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:107:10: '36'
            {
            match("36"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_36"

    // $ANTLR start "INT_37"
    public final void mINT_37() throws RecognitionException {
        try {
            int _type = INT_37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:108:8: ( '37' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:108:10: '37'
            {
            match("37"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_37"

    // $ANTLR start "INT_38"
    public final void mINT_38() throws RecognitionException {
        try {
            int _type = INT_38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:109:8: ( '38' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:109:10: '38'
            {
            match("38"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_38"

    // $ANTLR start "INT_39"
    public final void mINT_39() throws RecognitionException {
        try {
            int _type = INT_39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:110:8: ( '39' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:110:10: '39'
            {
            match("39"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_39"

    // $ANTLR start "INT_40"
    public final void mINT_40() throws RecognitionException {
        try {
            int _type = INT_40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:111:8: ( '40' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:111:10: '40'
            {
            match("40"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_40"

    // $ANTLR start "INT_41"
    public final void mINT_41() throws RecognitionException {
        try {
            int _type = INT_41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:112:8: ( '41' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:112:10: '41'
            {
            match("41"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_41"

    // $ANTLR start "INT_42"
    public final void mINT_42() throws RecognitionException {
        try {
            int _type = INT_42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:113:8: ( '42' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:113:10: '42'
            {
            match("42"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_42"

    // $ANTLR start "INT_43"
    public final void mINT_43() throws RecognitionException {
        try {
            int _type = INT_43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:114:8: ( '43' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:114:10: '43'
            {
            match("43"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_43"

    // $ANTLR start "INT_44"
    public final void mINT_44() throws RecognitionException {
        try {
            int _type = INT_44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:115:8: ( '44' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:115:10: '44'
            {
            match("44"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_44"

    // $ANTLR start "INT_45"
    public final void mINT_45() throws RecognitionException {
        try {
            int _type = INT_45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:116:8: ( '45' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:116:10: '45'
            {
            match("45"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_45"

    // $ANTLR start "INT_46"
    public final void mINT_46() throws RecognitionException {
        try {
            int _type = INT_46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:117:8: ( '46' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:117:10: '46'
            {
            match("46"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_46"

    // $ANTLR start "INT_47"
    public final void mINT_47() throws RecognitionException {
        try {
            int _type = INT_47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:118:8: ( '47' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:118:10: '47'
            {
            match("47"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_47"

    // $ANTLR start "INT_48"
    public final void mINT_48() throws RecognitionException {
        try {
            int _type = INT_48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:119:8: ( '48' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:119:10: '48'
            {
            match("48"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_48"

    // $ANTLR start "INT_49"
    public final void mINT_49() throws RecognitionException {
        try {
            int _type = INT_49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:120:8: ( '49' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:120:10: '49'
            {
            match("49"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_49"

    // $ANTLR start "INT_50"
    public final void mINT_50() throws RecognitionException {
        try {
            int _type = INT_50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:121:8: ( '50' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:121:10: '50'
            {
            match("50"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_50"

    // $ANTLR start "INT_51"
    public final void mINT_51() throws RecognitionException {
        try {
            int _type = INT_51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:122:8: ( '51' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:122:10: '51'
            {
            match("51"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_51"

    // $ANTLR start "INT_52"
    public final void mINT_52() throws RecognitionException {
        try {
            int _type = INT_52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:123:8: ( '52' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:123:10: '52'
            {
            match("52"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_52"

    // $ANTLR start "INT_53"
    public final void mINT_53() throws RecognitionException {
        try {
            int _type = INT_53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:124:8: ( '53' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:124:10: '53'
            {
            match("53"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_53"

    // $ANTLR start "INT_54"
    public final void mINT_54() throws RecognitionException {
        try {
            int _type = INT_54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:125:8: ( '54' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:125:10: '54'
            {
            match("54"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_54"

    // $ANTLR start "INT_55"
    public final void mINT_55() throws RecognitionException {
        try {
            int _type = INT_55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:126:8: ( '55' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:126:10: '55'
            {
            match("55"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_55"

    // $ANTLR start "INT_56"
    public final void mINT_56() throws RecognitionException {
        try {
            int _type = INT_56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:127:8: ( '56' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:127:10: '56'
            {
            match("56"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_56"

    // $ANTLR start "INT_57"
    public final void mINT_57() throws RecognitionException {
        try {
            int _type = INT_57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:128:8: ( '57' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:128:10: '57'
            {
            match("57"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_57"

    // $ANTLR start "INT_58"
    public final void mINT_58() throws RecognitionException {
        try {
            int _type = INT_58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:129:8: ( '58' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:129:10: '58'
            {
            match("58"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_58"

    // $ANTLR start "INT_59"
    public final void mINT_59() throws RecognitionException {
        try {
            int _type = INT_59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:130:8: ( '59' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:130:10: '59'
            {
            match("59"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_59"

    // $ANTLR start "INT_60"
    public final void mINT_60() throws RecognitionException {
        try {
            int _type = INT_60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:131:8: ( '60' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:131:10: '60'
            {
            match("60"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_60"

    // $ANTLR start "INT_61"
    public final void mINT_61() throws RecognitionException {
        try {
            int _type = INT_61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:132:8: ( '61' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:132:10: '61'
            {
            match("61"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_61"

    // $ANTLR start "INT_62"
    public final void mINT_62() throws RecognitionException {
        try {
            int _type = INT_62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:133:8: ( '62' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:133:10: '62'
            {
            match("62"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_62"

    // $ANTLR start "INT_63"
    public final void mINT_63() throws RecognitionException {
        try {
            int _type = INT_63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:134:8: ( '63' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:134:10: '63'
            {
            match("63"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_63"

    // $ANTLR start "INT_64"
    public final void mINT_64() throws RecognitionException {
        try {
            int _type = INT_64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:135:8: ( '64' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:135:10: '64'
            {
            match("64"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_64"

    // $ANTLR start "INT_65"
    public final void mINT_65() throws RecognitionException {
        try {
            int _type = INT_65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:136:8: ( '65' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:136:10: '65'
            {
            match("65"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_65"

    // $ANTLR start "INT_66"
    public final void mINT_66() throws RecognitionException {
        try {
            int _type = INT_66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:137:8: ( '66' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:137:10: '66'
            {
            match("66"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_66"

    // $ANTLR start "INT_67"
    public final void mINT_67() throws RecognitionException {
        try {
            int _type = INT_67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:138:8: ( '67' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:138:10: '67'
            {
            match("67"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_67"

    // $ANTLR start "INT_68"
    public final void mINT_68() throws RecognitionException {
        try {
            int _type = INT_68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:139:8: ( '68' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:139:10: '68'
            {
            match("68"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_68"

    // $ANTLR start "INT_69"
    public final void mINT_69() throws RecognitionException {
        try {
            int _type = INT_69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:140:8: ( '69' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:140:10: '69'
            {
            match("69"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_69"

    // $ANTLR start "INT_70"
    public final void mINT_70() throws RecognitionException {
        try {
            int _type = INT_70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:141:8: ( '70' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:141:10: '70'
            {
            match("70"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_70"

    // $ANTLR start "INT_71"
    public final void mINT_71() throws RecognitionException {
        try {
            int _type = INT_71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:142:8: ( '71' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:142:10: '71'
            {
            match("71"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_71"

    // $ANTLR start "INT_72"
    public final void mINT_72() throws RecognitionException {
        try {
            int _type = INT_72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:143:8: ( '72' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:143:10: '72'
            {
            match("72"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_72"

    // $ANTLR start "INT_73"
    public final void mINT_73() throws RecognitionException {
        try {
            int _type = INT_73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:144:8: ( '73' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:144:10: '73'
            {
            match("73"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_73"

    // $ANTLR start "INT_74"
    public final void mINT_74() throws RecognitionException {
        try {
            int _type = INT_74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:145:8: ( '74' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:145:10: '74'
            {
            match("74"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_74"

    // $ANTLR start "INT_75"
    public final void mINT_75() throws RecognitionException {
        try {
            int _type = INT_75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:146:8: ( '75' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:146:10: '75'
            {
            match("75"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_75"

    // $ANTLR start "INT_76"
    public final void mINT_76() throws RecognitionException {
        try {
            int _type = INT_76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:147:8: ( '76' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:147:10: '76'
            {
            match("76"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_76"

    // $ANTLR start "INT_77"
    public final void mINT_77() throws RecognitionException {
        try {
            int _type = INT_77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:148:8: ( '77' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:148:10: '77'
            {
            match("77"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_77"

    // $ANTLR start "INT_78"
    public final void mINT_78() throws RecognitionException {
        try {
            int _type = INT_78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:149:8: ( '78' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:149:10: '78'
            {
            match("78"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_78"

    // $ANTLR start "INT_79"
    public final void mINT_79() throws RecognitionException {
        try {
            int _type = INT_79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:150:8: ( '79' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:150:10: '79'
            {
            match("79"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_79"

    // $ANTLR start "INT_80"
    public final void mINT_80() throws RecognitionException {
        try {
            int _type = INT_80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:151:8: ( '80' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:151:10: '80'
            {
            match("80"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_80"

    // $ANTLR start "INT_81"
    public final void mINT_81() throws RecognitionException {
        try {
            int _type = INT_81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:152:8: ( '81' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:152:10: '81'
            {
            match("81"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_81"

    // $ANTLR start "INT_82"
    public final void mINT_82() throws RecognitionException {
        try {
            int _type = INT_82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:153:8: ( '82' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:153:10: '82'
            {
            match("82"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_82"

    // $ANTLR start "INT_83"
    public final void mINT_83() throws RecognitionException {
        try {
            int _type = INT_83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:154:8: ( '83' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:154:10: '83'
            {
            match("83"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_83"

    // $ANTLR start "INT_84"
    public final void mINT_84() throws RecognitionException {
        try {
            int _type = INT_84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:155:8: ( '84' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:155:10: '84'
            {
            match("84"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_84"

    // $ANTLR start "INT_85"
    public final void mINT_85() throws RecognitionException {
        try {
            int _type = INT_85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:156:8: ( '85' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:156:10: '85'
            {
            match("85"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_85"

    // $ANTLR start "INT_86"
    public final void mINT_86() throws RecognitionException {
        try {
            int _type = INT_86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:157:8: ( '86' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:157:10: '86'
            {
            match("86"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_86"

    // $ANTLR start "INT_87"
    public final void mINT_87() throws RecognitionException {
        try {
            int _type = INT_87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:158:8: ( '87' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:158:10: '87'
            {
            match("87"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_87"

    // $ANTLR start "INT_88"
    public final void mINT_88() throws RecognitionException {
        try {
            int _type = INT_88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:159:8: ( '88' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:159:10: '88'
            {
            match("88"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_88"

    // $ANTLR start "INT_89"
    public final void mINT_89() throws RecognitionException {
        try {
            int _type = INT_89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:160:8: ( '89' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:160:10: '89'
            {
            match("89"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_89"

    // $ANTLR start "INT_90"
    public final void mINT_90() throws RecognitionException {
        try {
            int _type = INT_90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:161:8: ( '90' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:161:10: '90'
            {
            match("90"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_90"

    // $ANTLR start "INT_91"
    public final void mINT_91() throws RecognitionException {
        try {
            int _type = INT_91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:162:8: ( '91' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:162:10: '91'
            {
            match("91"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_91"

    // $ANTLR start "INT_92"
    public final void mINT_92() throws RecognitionException {
        try {
            int _type = INT_92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:163:8: ( '92' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:163:10: '92'
            {
            match("92"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_92"

    // $ANTLR start "INT_93"
    public final void mINT_93() throws RecognitionException {
        try {
            int _type = INT_93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:164:8: ( '93' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:164:10: '93'
            {
            match("93"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_93"

    // $ANTLR start "INT_94"
    public final void mINT_94() throws RecognitionException {
        try {
            int _type = INT_94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:165:8: ( '94' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:165:10: '94'
            {
            match("94"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_94"

    // $ANTLR start "INT_95"
    public final void mINT_95() throws RecognitionException {
        try {
            int _type = INT_95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:166:8: ( '95' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:166:10: '95'
            {
            match("95"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_95"

    // $ANTLR start "INT_96"
    public final void mINT_96() throws RecognitionException {
        try {
            int _type = INT_96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:167:8: ( '96' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:167:10: '96'
            {
            match("96"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_96"

    // $ANTLR start "INT_97"
    public final void mINT_97() throws RecognitionException {
        try {
            int _type = INT_97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:168:8: ( '97' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:168:10: '97'
            {
            match("97"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_97"

    // $ANTLR start "INT_98"
    public final void mINT_98() throws RecognitionException {
        try {
            int _type = INT_98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:169:8: ( '98' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:169:10: '98'
            {
            match("98"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_98"

    // $ANTLR start "INT_99"
    public final void mINT_99() throws RecognitionException {
        try {
            int _type = INT_99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:170:8: ( '99' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:170:10: '99'
            {
            match("99"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_99"

    // $ANTLR start "ST"
    public final void mST() throws RecognitionException {
        try {
            int _type = ST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:172:4: ( 'st' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:172:6: 'st'
            {
            match("st"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ST"

    // $ANTLR start "ND"
    public final void mND() throws RecognitionException {
        try {
            int _type = ND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:173:4: ( 'nd' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:173:6: 'nd'
            {
            match("nd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ND"

    // $ANTLR start "RD"
    public final void mRD() throws RecognitionException {
        try {
            int _type = RD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:174:4: ( 'rd' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:174:6: 'rd'
            {
            match("rd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RD"

    // $ANTLR start "TH"
    public final void mTH() throws RecognitionException {
        try {
            int _type = TH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:175:4: ( 'th' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:175:6: 'th'
            {
            match("th"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TH"

    // $ANTLR start "ONE"
    public final void mONE() throws RecognitionException {
        try {
            int _type = ONE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:177:11: ( 'one' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:177:13: 'one'
            {
            match("one"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ONE"

    // $ANTLR start "TWO"
    public final void mTWO() throws RecognitionException {
        try {
            int _type = TWO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:178:11: ( 'two' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:178:13: 'two'
            {
            match("two"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TWO"

    // $ANTLR start "THREE"
    public final void mTHREE() throws RecognitionException {
        try {
            int _type = THREE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:179:11: ( 'three' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:179:13: 'three'
            {
            match("three"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THREE"

    // $ANTLR start "FOUR"
    public final void mFOUR() throws RecognitionException {
        try {
            int _type = FOUR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:180:11: ( 'four' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:180:13: 'four'
            {
            match("four"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOUR"

    // $ANTLR start "FIVE"
    public final void mFIVE() throws RecognitionException {
        try {
            int _type = FIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:181:11: ( 'five' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:181:13: 'five'
            {
            match("five"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FIVE"

    // $ANTLR start "SIX"
    public final void mSIX() throws RecognitionException {
        try {
            int _type = SIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:182:11: ( 'six' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:182:13: 'six'
            {
            match("six"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SIX"

    // $ANTLR start "SEVEN"
    public final void mSEVEN() throws RecognitionException {
        try {
            int _type = SEVEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:183:11: ( 'seven' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:183:13: 'seven'
            {
            match("seven"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEVEN"

    // $ANTLR start "EIGHT"
    public final void mEIGHT() throws RecognitionException {
        try {
            int _type = EIGHT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:184:11: ( 'eight' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:184:13: 'eight'
            {
            match("eight"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EIGHT"

    // $ANTLR start "NINE"
    public final void mNINE() throws RecognitionException {
        try {
            int _type = NINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:185:11: ( 'nine' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:185:13: 'nine'
            {
            match("nine"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NINE"

    // $ANTLR start "TEN"
    public final void mTEN() throws RecognitionException {
        try {
            int _type = TEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:186:11: ( 'ten' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:186:13: 'ten'
            {
            match("ten"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TEN"

    // $ANTLR start "ELEVEN"
    public final void mELEVEN() throws RecognitionException {
        try {
            int _type = ELEVEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:187:11: ( 'eleven' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:187:13: 'eleven'
            {
            match("eleven"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELEVEN"

    // $ANTLR start "TWELVE"
    public final void mTWELVE() throws RecognitionException {
        try {
            int _type = TWELVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:188:11: ( 'twelve' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:188:13: 'twelve'
            {
            match("twelve"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TWELVE"

    // $ANTLR start "THIRTEEN"
    public final void mTHIRTEEN() throws RecognitionException {
        try {
            int _type = THIRTEEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:189:11: ( 'thirteen' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:189:13: 'thirteen'
            {
            match("thirteen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THIRTEEN"

    // $ANTLR start "FOURTEEN"
    public final void mFOURTEEN() throws RecognitionException {
        try {
            int _type = FOURTEEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:190:11: ( 'fourteen' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:190:13: 'fourteen'
            {
            match("fourteen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOURTEEN"

    // $ANTLR start "FIFTEEN"
    public final void mFIFTEEN() throws RecognitionException {
        try {
            int _type = FIFTEEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:191:11: ( 'fifteen' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:191:13: 'fifteen'
            {
            match("fifteen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FIFTEEN"

    // $ANTLR start "SIXTEEN"
    public final void mSIXTEEN() throws RecognitionException {
        try {
            int _type = SIXTEEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:192:11: ( 'sixteen' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:192:13: 'sixteen'
            {
            match("sixteen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SIXTEEN"

    // $ANTLR start "SEVENTEEN"
    public final void mSEVENTEEN() throws RecognitionException {
        try {
            int _type = SEVENTEEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:193:11: ( 'seventeen' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:193:13: 'seventeen'
            {
            match("seventeen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEVENTEEN"

    // $ANTLR start "EIGHTEEN"
    public final void mEIGHTEEN() throws RecognitionException {
        try {
            int _type = EIGHTEEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:194:11: ( 'eighteen' | 'eightteen' )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0=='e') ) {
                int LA83_1 = input.LA(2);

                if ( (LA83_1=='i') ) {
                    int LA83_2 = input.LA(3);

                    if ( (LA83_2=='g') ) {
                        int LA83_3 = input.LA(4);

                        if ( (LA83_3=='h') ) {
                            int LA83_4 = input.LA(5);

                            if ( (LA83_4=='t') ) {
                                int LA83_5 = input.LA(6);

                                if ( (LA83_5=='e') ) {
                                    alt83=1;
                                }
                                else if ( (LA83_5=='t') ) {
                                    alt83=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 83, 5, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 83, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 83, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 83, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 83, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:194:13: 'eighteen'
                    {
                    match("eighteen"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:194:26: 'eightteen'
                    {
                    match("eightteen"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EIGHTEEN"

    // $ANTLR start "NINETEEN"
    public final void mNINETEEN() throws RecognitionException {
        try {
            int _type = NINETEEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:195:11: ( 'nineteen' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:195:13: 'nineteen'
            {
            match("nineteen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NINETEEN"

    // $ANTLR start "TWENTY"
    public final void mTWENTY() throws RecognitionException {
        try {
            int _type = TWENTY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:196:11: ( 'twenty' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:196:13: 'twenty'
            {
            match("twenty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TWENTY"

    // $ANTLR start "THIRTY"
    public final void mTHIRTY() throws RecognitionException {
        try {
            int _type = THIRTY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:197:11: ( 'thirty' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:197:13: 'thirty'
            {
            match("thirty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THIRTY"

    // $ANTLR start "FIRST"
    public final void mFIRST() throws RecognitionException {
        try {
            int _type = FIRST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:199:16: ( 'first' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:199:18: 'first'
            {
            match("first"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FIRST"

    // $ANTLR start "SECOND"
    public final void mSECOND() throws RecognitionException {
        try {
            int _type = SECOND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:200:16: ( 'second' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:200:18: 'second'
            {
            match("second"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SECOND"

    // $ANTLR start "THIRD"
    public final void mTHIRD() throws RecognitionException {
        try {
            int _type = THIRD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:201:16: ( 'third' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:201:18: 'third'
            {
            match("third"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THIRD"

    // $ANTLR start "FOURTH"
    public final void mFOURTH() throws RecognitionException {
        try {
            int _type = FOURTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:202:16: ( 'fourth' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:202:18: 'fourth'
            {
            match("fourth"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOURTH"

    // $ANTLR start "FIFTH"
    public final void mFIFTH() throws RecognitionException {
        try {
            int _type = FIFTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:203:16: ( 'fifth' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:203:18: 'fifth'
            {
            match("fifth"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FIFTH"

    // $ANTLR start "SIXTH"
    public final void mSIXTH() throws RecognitionException {
        try {
            int _type = SIXTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:204:16: ( 'sixth' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:204:18: 'sixth'
            {
            match("sixth"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SIXTH"

    // $ANTLR start "SEVENTH"
    public final void mSEVENTH() throws RecognitionException {
        try {
            int _type = SEVENTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:205:16: ( 'seventh' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:205:18: 'seventh'
            {
            match("seventh"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEVENTH"

    // $ANTLR start "EIGHTH"
    public final void mEIGHTH() throws RecognitionException {
        try {
            int _type = EIGHTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:206:16: ( 'eigth' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:206:18: 'eigth'
            {
            match("eigth"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EIGHTH"

    // $ANTLR start "NINTH"
    public final void mNINTH() throws RecognitionException {
        try {
            int _type = NINTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:207:16: ( 'ninth' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:207:18: 'ninth'
            {
            match("ninth"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NINTH"

    // $ANTLR start "TENTH"
    public final void mTENTH() throws RecognitionException {
        try {
            int _type = TENTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:208:16: ( 'tenth' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:208:18: 'tenth'
            {
            match("tenth"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TENTH"

    // $ANTLR start "ELEVENTH"
    public final void mELEVENTH() throws RecognitionException {
        try {
            int _type = ELEVENTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:209:16: ( 'eleventh' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:209:18: 'eleventh'
            {
            match("eleventh"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELEVENTH"

    // $ANTLR start "TWELFTH"
    public final void mTWELFTH() throws RecognitionException {
        try {
            int _type = TWELFTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:210:16: ( 'twelfth' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:210:18: 'twelfth'
            {
            match("twelfth"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TWELFTH"

    // $ANTLR start "THIRTEENTH"
    public final void mTHIRTEENTH() throws RecognitionException {
        try {
            int _type = THIRTEENTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:211:16: ( 'thirteenth' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:211:18: 'thirteenth'
            {
            match("thirteenth"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THIRTEENTH"

    // $ANTLR start "FOURTEENTH"
    public final void mFOURTEENTH() throws RecognitionException {
        try {
            int _type = FOURTEENTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:212:16: ( 'fourteenth' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:212:18: 'fourteenth'
            {
            match("fourteenth"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOURTEENTH"

    // $ANTLR start "FIFTEENTH"
    public final void mFIFTEENTH() throws RecognitionException {
        try {
            int _type = FIFTEENTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:213:16: ( 'fifteenth' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:213:18: 'fifteenth'
            {
            match("fifteenth"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FIFTEENTH"

    // $ANTLR start "SIXTEENTH"
    public final void mSIXTEENTH() throws RecognitionException {
        try {
            int _type = SIXTEENTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:214:16: ( 'sixteenth' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:214:18: 'sixteenth'
            {
            match("sixteenth"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SIXTEENTH"

    // $ANTLR start "SEVENTEENTH"
    public final void mSEVENTEENTH() throws RecognitionException {
        try {
            int _type = SEVENTEENTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:215:16: ( 'seventeenth' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:215:18: 'seventeenth'
            {
            match("seventeenth"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEVENTEENTH"

    // $ANTLR start "EIGHTEENTH"
    public final void mEIGHTEENTH() throws RecognitionException {
        try {
            int _type = EIGHTEENTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:216:16: ( 'eighteenth' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:216:18: 'eighteenth'
            {
            match("eighteenth"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EIGHTEENTH"

    // $ANTLR start "NINETEENTH"
    public final void mNINETEENTH() throws RecognitionException {
        try {
            int _type = NINETEENTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:217:16: ( 'nineteenth' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:217:18: 'nineteenth'
            {
            match("nineteenth"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NINETEENTH"

    // $ANTLR start "TWENTIETH"
    public final void mTWENTIETH() throws RecognitionException {
        try {
            int _type = TWENTIETH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:218:16: ( 'twentieth' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:218:18: 'twentieth'
            {
            match("twentieth"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TWENTIETH"

    // $ANTLR start "THIRTIETH"
    public final void mTHIRTIETH() throws RecognitionException {
        try {
            int _type = THIRTIETH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:219:16: ( 'thirtieth' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:219:18: 'thirtieth'
            {
            match("thirtieth"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THIRTIETH"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:223:7: ( ':' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:223:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:224:7: ( ',' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:224:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "DASH"
    public final void mDASH() throws RecognitionException {
        try {
            int _type = DASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:225:7: ( '-' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:225:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DASH"

    // $ANTLR start "SLASH"
    public final void mSLASH() throws RecognitionException {
        try {
            int _type = SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:226:7: ( '/' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:226:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SLASH"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:227:7: ( '.' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:227:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:228:7: ( '+' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:228:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "SINGLE_QUOTE"
    public final void mSINGLE_QUOTE() throws RecognitionException {
        try {
            int _type = SINGLE_QUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:229:14: ( '\\'' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:229:16: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SINGLE_QUOTE"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:231:10: ( 'in' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:231:12: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "THE"
    public final void mTHE() throws RecognitionException {
        try {
            int _type = THE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:232:10: ( 'the' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:232:12: 'the'
            {
            match("the"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THE"

    // $ANTLR start "AT"
    public final void mAT() throws RecognitionException {
        try {
            int _type = AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:233:10: ( 'at' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:233:12: 'at'
            {
            match("at"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AT"

    // $ANTLR start "ON"
    public final void mON() throws RecognitionException {
        try {
            int _type = ON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:234:10: ( 'on' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:234:12: 'on'
            {
            match("on"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ON"

    // $ANTLR start "OF"
    public final void mOF() throws RecognitionException {
        try {
            int _type = OF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:235:10: ( 'of' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:235:12: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OF"

    // $ANTLR start "THIS"
    public final void mTHIS() throws RecognitionException {
        try {
            int _type = THIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:236:10: ( 'this' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:236:12: 'this'
            {
            match("this"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THIS"

    // $ANTLR start "LAST"
    public final void mLAST() throws RecognitionException {
        try {
            int _type = LAST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:237:10: ( 'last' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:237:12: 'last'
            {
            match("last"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LAST"

    // $ANTLR start "NEXT"
    public final void mNEXT() throws RecognitionException {
        try {
            int _type = NEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:238:10: ( 'next' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:238:12: 'next'
            {
            match("next"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEXT"

    // $ANTLR start "PAST"
    public final void mPAST() throws RecognitionException {
        try {
            int _type = PAST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:239:10: ( 'past' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:239:12: 'past'
            {
            match("past"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PAST"

    // $ANTLR start "COMING"
    public final void mCOMING() throws RecognitionException {
        try {
            int _type = COMING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:240:10: ( 'coming' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:240:12: 'coming'
            {
            match("coming"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMING"

    // $ANTLR start "UPCOMING"
    public final void mUPCOMING() throws RecognitionException {
        try {
            int _type = UPCOMING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:241:10: ( 'upcoming' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:241:12: 'upcoming'
            {
            match("upcoming"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UPCOMING"

    // $ANTLR start "FROM"
    public final void mFROM() throws RecognitionException {
        try {
            int _type = FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:242:10: ( 'from' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:242:12: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FROM"

    // $ANTLR start "NOW"
    public final void mNOW() throws RecognitionException {
        try {
            int _type = NOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:243:10: ( 'now' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:243:12: 'now'
            {
            match("now"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOW"

    // $ANTLR start "AGO"
    public final void mAGO() throws RecognitionException {
        try {
            int _type = AGO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:244:10: ( 'ago' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:244:12: 'ago'
            {
            match("ago"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AGO"

    // $ANTLR start "BEFORE"
    public final void mBEFORE() throws RecognitionException {
        try {
            int _type = BEFORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:245:10: ( 'before' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:245:12: 'before'
            {
            match("before"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BEFORE"

    // $ANTLR start "AFTER"
    public final void mAFTER() throws RecognitionException {
        try {
            int _type = AFTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:246:10: ( 'after' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:246:12: 'after'
            {
            match("after"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AFTER"

    // $ANTLR start "WHITE_SPACE"
    public final void mWHITE_SPACE() throws RecognitionException {
        try {
            int _type = WHITE_SPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:249:3: ( ( DOT | SPACE )+ )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:249:5: ( DOT | SPACE )+
            {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:249:5: ( DOT | SPACE )+
            int cnt84=0;
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( ((LA84_0>='\t' && LA84_0<='\n')||LA84_0=='\r'||LA84_0==' '||LA84_0=='.') ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' '||input.LA(1)=='.' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt84 >= 1 ) break loop84;
                        EarlyExitException eee =
                            new EarlyExitException(84, input);
                        throw eee;
                }
                cnt84++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHITE_SPACE"

    // $ANTLR start "UNKNOWN_WORD"
    public final void mUNKNOWN_WORD() throws RecognitionException {
        try {
            int _type = UNKNOWN_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:253:3: ( ( 'a' .. 'z' )+ )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:253:5: ( 'a' .. 'z' )+
            {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:253:5: ( 'a' .. 'z' )+
            int cnt85=0;
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( ((LA85_0>='a' && LA85_0<='z')) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:253:6: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;

            	default :
            	    if ( cnt85 >= 1 ) break loop85;
                        EarlyExitException eee =
                            new EarlyExitException(85, input);
                        throw eee;
                }
                cnt85++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNKNOWN_WORD"

    // $ANTLR start "UNKNOWN_CHAR"
    public final void mUNKNOWN_CHAR() throws RecognitionException {
        try {
            int _type = UNKNOWN_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:257:3: ( . )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:257:5: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNKNOWN_CHAR"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:260:16: ( '0' .. '9' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:260:18: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "SPACE"
    public final void mSPACE() throws RecognitionException {
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:262:16: ( ' ' | '\\t' | '\\n' | '\\r' )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "SPACE"

    public void mTokens() throws RecognitionException {
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:8: ( JANUARY | FEBRUARY | MARCH | APRIL | MAY | JUNE | JULY | AUGUST | SEPTEMBER | OCTOBER | NOVEMBER | DECEMBER | SUNDAY | MONDAY | TUESDAY | WEDNESDAY | THURSDAY | FRIDAY | SATURDAY | HOUR | DAY | WEEK | MONTH | YEAR | TODAY | TOMORROW | YESTERDAY | AM | PM | T | MILITARY_HOUR_SUFFIX | MIDNIGHT | NOON | MORNING | NIGHT | UTC | EST | PST | CST | MST | AKST | HAST | INT_00 | INT_01 | INT_02 | INT_03 | INT_04 | INT_05 | INT_06 | INT_07 | INT_08 | INT_09 | INT_0 | INT_1 | INT_2 | INT_3 | INT_4 | INT_5 | INT_6 | INT_7 | INT_8 | INT_9 | INT_10 | INT_11 | INT_12 | INT_13 | INT_14 | INT_15 | INT_16 | INT_17 | INT_18 | INT_19 | INT_20 | INT_21 | INT_22 | INT_23 | INT_24 | INT_25 | INT_26 | INT_27 | INT_28 | INT_29 | INT_30 | INT_31 | INT_32 | INT_33 | INT_34 | INT_35 | INT_36 | INT_37 | INT_38 | INT_39 | INT_40 | INT_41 | INT_42 | INT_43 | INT_44 | INT_45 | INT_46 | INT_47 | INT_48 | INT_49 | INT_50 | INT_51 | INT_52 | INT_53 | INT_54 | INT_55 | INT_56 | INT_57 | INT_58 | INT_59 | INT_60 | INT_61 | INT_62 | INT_63 | INT_64 | INT_65 | INT_66 | INT_67 | INT_68 | INT_69 | INT_70 | INT_71 | INT_72 | INT_73 | INT_74 | INT_75 | INT_76 | INT_77 | INT_78 | INT_79 | INT_80 | INT_81 | INT_82 | INT_83 | INT_84 | INT_85 | INT_86 | INT_87 | INT_88 | INT_89 | INT_90 | INT_91 | INT_92 | INT_93 | INT_94 | INT_95 | INT_96 | INT_97 | INT_98 | INT_99 | ST | ND | RD | TH | ONE | TWO | THREE | FOUR | FIVE | SIX | SEVEN | EIGHT | NINE | TEN | ELEVEN | TWELVE | THIRTEEN | FOURTEEN | FIFTEEN | SIXTEEN | SEVENTEEN | EIGHTEEN | NINETEEN | TWENTY | THIRTY | FIRST | SECOND | THIRD | FOURTH | FIFTH | SIXTH | SEVENTH | EIGHTH | NINTH | TENTH | ELEVENTH | TWELFTH | THIRTEENTH | FOURTEENTH | FIFTEENTH | SIXTEENTH | SEVENTEENTH | EIGHTEENTH | NINETEENTH | TWENTIETH | THIRTIETH | COLON | COMMA | DASH | SLASH | DOT | PLUS | SINGLE_QUOTE | IN | THE | AT | ON | OF | THIS | LAST | NEXT | PAST | COMING | UPCOMING | FROM | NOW | AGO | BEFORE | AFTER | WHITE_SPACE | UNKNOWN_WORD | UNKNOWN_CHAR )
        int alt86=224;
        alt86 = dfa86.predict(input);
        switch (alt86) {
            case 1 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:10: JANUARY
                {
                mJANUARY(); 

                }
                break;
            case 2 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:18: FEBRUARY
                {
                mFEBRUARY(); 

                }
                break;
            case 3 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:27: MARCH
                {
                mMARCH(); 

                }
                break;
            case 4 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:33: APRIL
                {
                mAPRIL(); 

                }
                break;
            case 5 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:39: MAY
                {
                mMAY(); 

                }
                break;
            case 6 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:43: JUNE
                {
                mJUNE(); 

                }
                break;
            case 7 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:48: JULY
                {
                mJULY(); 

                }
                break;
            case 8 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:53: AUGUST
                {
                mAUGUST(); 

                }
                break;
            case 9 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:60: SEPTEMBER
                {
                mSEPTEMBER(); 

                }
                break;
            case 10 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:70: OCTOBER
                {
                mOCTOBER(); 

                }
                break;
            case 11 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:78: NOVEMBER
                {
                mNOVEMBER(); 

                }
                break;
            case 12 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:87: DECEMBER
                {
                mDECEMBER(); 

                }
                break;
            case 13 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:96: SUNDAY
                {
                mSUNDAY(); 

                }
                break;
            case 14 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:103: MONDAY
                {
                mMONDAY(); 

                }
                break;
            case 15 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:110: TUESDAY
                {
                mTUESDAY(); 

                }
                break;
            case 16 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:118: WEDNESDAY
                {
                mWEDNESDAY(); 

                }
                break;
            case 17 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:128: THURSDAY
                {
                mTHURSDAY(); 

                }
                break;
            case 18 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:137: FRIDAY
                {
                mFRIDAY(); 

                }
                break;
            case 19 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:144: SATURDAY
                {
                mSATURDAY(); 

                }
                break;
            case 20 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:153: HOUR
                {
                mHOUR(); 

                }
                break;
            case 21 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:158: DAY
                {
                mDAY(); 

                }
                break;
            case 22 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:162: WEEK
                {
                mWEEK(); 

                }
                break;
            case 23 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:167: MONTH
                {
                mMONTH(); 

                }
                break;
            case 24 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:173: YEAR
                {
                mYEAR(); 

                }
                break;
            case 25 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:178: TODAY
                {
                mTODAY(); 

                }
                break;
            case 26 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:184: TOMORROW
                {
                mTOMORROW(); 

                }
                break;
            case 27 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:193: YESTERDAY
                {
                mYESTERDAY(); 

                }
                break;
            case 28 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:203: AM
                {
                mAM(); 

                }
                break;
            case 29 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:206: PM
                {
                mPM(); 

                }
                break;
            case 30 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:209: T
                {
                mT(); 

                }
                break;
            case 31 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:211: MILITARY_HOUR_SUFFIX
                {
                mMILITARY_HOUR_SUFFIX(); 

                }
                break;
            case 32 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:232: MIDNIGHT
                {
                mMIDNIGHT(); 

                }
                break;
            case 33 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:241: NOON
                {
                mNOON(); 

                }
                break;
            case 34 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:246: MORNING
                {
                mMORNING(); 

                }
                break;
            case 35 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:254: NIGHT
                {
                mNIGHT(); 

                }
                break;
            case 36 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:260: UTC
                {
                mUTC(); 

                }
                break;
            case 37 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:264: EST
                {
                mEST(); 

                }
                break;
            case 38 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:268: PST
                {
                mPST(); 

                }
                break;
            case 39 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:272: CST
                {
                mCST(); 

                }
                break;
            case 40 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:276: MST
                {
                mMST(); 

                }
                break;
            case 41 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:280: AKST
                {
                mAKST(); 

                }
                break;
            case 42 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:285: HAST
                {
                mHAST(); 

                }
                break;
            case 43 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:290: INT_00
                {
                mINT_00(); 

                }
                break;
            case 44 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:297: INT_01
                {
                mINT_01(); 

                }
                break;
            case 45 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:304: INT_02
                {
                mINT_02(); 

                }
                break;
            case 46 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:311: INT_03
                {
                mINT_03(); 

                }
                break;
            case 47 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:318: INT_04
                {
                mINT_04(); 

                }
                break;
            case 48 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:325: INT_05
                {
                mINT_05(); 

                }
                break;
            case 49 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:332: INT_06
                {
                mINT_06(); 

                }
                break;
            case 50 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:339: INT_07
                {
                mINT_07(); 

                }
                break;
            case 51 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:346: INT_08
                {
                mINT_08(); 

                }
                break;
            case 52 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:353: INT_09
                {
                mINT_09(); 

                }
                break;
            case 53 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:360: INT_0
                {
                mINT_0(); 

                }
                break;
            case 54 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:366: INT_1
                {
                mINT_1(); 

                }
                break;
            case 55 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:372: INT_2
                {
                mINT_2(); 

                }
                break;
            case 56 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:378: INT_3
                {
                mINT_3(); 

                }
                break;
            case 57 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:384: INT_4
                {
                mINT_4(); 

                }
                break;
            case 58 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:390: INT_5
                {
                mINT_5(); 

                }
                break;
            case 59 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:396: INT_6
                {
                mINT_6(); 

                }
                break;
            case 60 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:402: INT_7
                {
                mINT_7(); 

                }
                break;
            case 61 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:408: INT_8
                {
                mINT_8(); 

                }
                break;
            case 62 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:414: INT_9
                {
                mINT_9(); 

                }
                break;
            case 63 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:420: INT_10
                {
                mINT_10(); 

                }
                break;
            case 64 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:427: INT_11
                {
                mINT_11(); 

                }
                break;
            case 65 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:434: INT_12
                {
                mINT_12(); 

                }
                break;
            case 66 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:441: INT_13
                {
                mINT_13(); 

                }
                break;
            case 67 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:448: INT_14
                {
                mINT_14(); 

                }
                break;
            case 68 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:455: INT_15
                {
                mINT_15(); 

                }
                break;
            case 69 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:462: INT_16
                {
                mINT_16(); 

                }
                break;
            case 70 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:469: INT_17
                {
                mINT_17(); 

                }
                break;
            case 71 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:476: INT_18
                {
                mINT_18(); 

                }
                break;
            case 72 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:483: INT_19
                {
                mINT_19(); 

                }
                break;
            case 73 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:490: INT_20
                {
                mINT_20(); 

                }
                break;
            case 74 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:497: INT_21
                {
                mINT_21(); 

                }
                break;
            case 75 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:504: INT_22
                {
                mINT_22(); 

                }
                break;
            case 76 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:511: INT_23
                {
                mINT_23(); 

                }
                break;
            case 77 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:518: INT_24
                {
                mINT_24(); 

                }
                break;
            case 78 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:525: INT_25
                {
                mINT_25(); 

                }
                break;
            case 79 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:532: INT_26
                {
                mINT_26(); 

                }
                break;
            case 80 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:539: INT_27
                {
                mINT_27(); 

                }
                break;
            case 81 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:546: INT_28
                {
                mINT_28(); 

                }
                break;
            case 82 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:553: INT_29
                {
                mINT_29(); 

                }
                break;
            case 83 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:560: INT_30
                {
                mINT_30(); 

                }
                break;
            case 84 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:567: INT_31
                {
                mINT_31(); 

                }
                break;
            case 85 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:574: INT_32
                {
                mINT_32(); 

                }
                break;
            case 86 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:581: INT_33
                {
                mINT_33(); 

                }
                break;
            case 87 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:588: INT_34
                {
                mINT_34(); 

                }
                break;
            case 88 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:595: INT_35
                {
                mINT_35(); 

                }
                break;
            case 89 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:602: INT_36
                {
                mINT_36(); 

                }
                break;
            case 90 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:609: INT_37
                {
                mINT_37(); 

                }
                break;
            case 91 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:616: INT_38
                {
                mINT_38(); 

                }
                break;
            case 92 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:623: INT_39
                {
                mINT_39(); 

                }
                break;
            case 93 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:630: INT_40
                {
                mINT_40(); 

                }
                break;
            case 94 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:637: INT_41
                {
                mINT_41(); 

                }
                break;
            case 95 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:644: INT_42
                {
                mINT_42(); 

                }
                break;
            case 96 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:651: INT_43
                {
                mINT_43(); 

                }
                break;
            case 97 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:658: INT_44
                {
                mINT_44(); 

                }
                break;
            case 98 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:665: INT_45
                {
                mINT_45(); 

                }
                break;
            case 99 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:672: INT_46
                {
                mINT_46(); 

                }
                break;
            case 100 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:679: INT_47
                {
                mINT_47(); 

                }
                break;
            case 101 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:686: INT_48
                {
                mINT_48(); 

                }
                break;
            case 102 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:693: INT_49
                {
                mINT_49(); 

                }
                break;
            case 103 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:700: INT_50
                {
                mINT_50(); 

                }
                break;
            case 104 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:707: INT_51
                {
                mINT_51(); 

                }
                break;
            case 105 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:714: INT_52
                {
                mINT_52(); 

                }
                break;
            case 106 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:721: INT_53
                {
                mINT_53(); 

                }
                break;
            case 107 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:728: INT_54
                {
                mINT_54(); 

                }
                break;
            case 108 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:735: INT_55
                {
                mINT_55(); 

                }
                break;
            case 109 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:742: INT_56
                {
                mINT_56(); 

                }
                break;
            case 110 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:749: INT_57
                {
                mINT_57(); 

                }
                break;
            case 111 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:756: INT_58
                {
                mINT_58(); 

                }
                break;
            case 112 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:763: INT_59
                {
                mINT_59(); 

                }
                break;
            case 113 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:770: INT_60
                {
                mINT_60(); 

                }
                break;
            case 114 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:777: INT_61
                {
                mINT_61(); 

                }
                break;
            case 115 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:784: INT_62
                {
                mINT_62(); 

                }
                break;
            case 116 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:791: INT_63
                {
                mINT_63(); 

                }
                break;
            case 117 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:798: INT_64
                {
                mINT_64(); 

                }
                break;
            case 118 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:805: INT_65
                {
                mINT_65(); 

                }
                break;
            case 119 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:812: INT_66
                {
                mINT_66(); 

                }
                break;
            case 120 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:819: INT_67
                {
                mINT_67(); 

                }
                break;
            case 121 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:826: INT_68
                {
                mINT_68(); 

                }
                break;
            case 122 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:833: INT_69
                {
                mINT_69(); 

                }
                break;
            case 123 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:840: INT_70
                {
                mINT_70(); 

                }
                break;
            case 124 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:847: INT_71
                {
                mINT_71(); 

                }
                break;
            case 125 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:854: INT_72
                {
                mINT_72(); 

                }
                break;
            case 126 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:861: INT_73
                {
                mINT_73(); 

                }
                break;
            case 127 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:868: INT_74
                {
                mINT_74(); 

                }
                break;
            case 128 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:875: INT_75
                {
                mINT_75(); 

                }
                break;
            case 129 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:882: INT_76
                {
                mINT_76(); 

                }
                break;
            case 130 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:889: INT_77
                {
                mINT_77(); 

                }
                break;
            case 131 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:896: INT_78
                {
                mINT_78(); 

                }
                break;
            case 132 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:903: INT_79
                {
                mINT_79(); 

                }
                break;
            case 133 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:910: INT_80
                {
                mINT_80(); 

                }
                break;
            case 134 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:917: INT_81
                {
                mINT_81(); 

                }
                break;
            case 135 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:924: INT_82
                {
                mINT_82(); 

                }
                break;
            case 136 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:931: INT_83
                {
                mINT_83(); 

                }
                break;
            case 137 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:938: INT_84
                {
                mINT_84(); 

                }
                break;
            case 138 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:945: INT_85
                {
                mINT_85(); 

                }
                break;
            case 139 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:952: INT_86
                {
                mINT_86(); 

                }
                break;
            case 140 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:959: INT_87
                {
                mINT_87(); 

                }
                break;
            case 141 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:966: INT_88
                {
                mINT_88(); 

                }
                break;
            case 142 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:973: INT_89
                {
                mINT_89(); 

                }
                break;
            case 143 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:980: INT_90
                {
                mINT_90(); 

                }
                break;
            case 144 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:987: INT_91
                {
                mINT_91(); 

                }
                break;
            case 145 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:994: INT_92
                {
                mINT_92(); 

                }
                break;
            case 146 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1001: INT_93
                {
                mINT_93(); 

                }
                break;
            case 147 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1008: INT_94
                {
                mINT_94(); 

                }
                break;
            case 148 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1015: INT_95
                {
                mINT_95(); 

                }
                break;
            case 149 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1022: INT_96
                {
                mINT_96(); 

                }
                break;
            case 150 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1029: INT_97
                {
                mINT_97(); 

                }
                break;
            case 151 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1036: INT_98
                {
                mINT_98(); 

                }
                break;
            case 152 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1043: INT_99
                {
                mINT_99(); 

                }
                break;
            case 153 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1050: ST
                {
                mST(); 

                }
                break;
            case 154 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1053: ND
                {
                mND(); 

                }
                break;
            case 155 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1056: RD
                {
                mRD(); 

                }
                break;
            case 156 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1059: TH
                {
                mTH(); 

                }
                break;
            case 157 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1062: ONE
                {
                mONE(); 

                }
                break;
            case 158 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1066: TWO
                {
                mTWO(); 

                }
                break;
            case 159 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1070: THREE
                {
                mTHREE(); 

                }
                break;
            case 160 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1076: FOUR
                {
                mFOUR(); 

                }
                break;
            case 161 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1081: FIVE
                {
                mFIVE(); 

                }
                break;
            case 162 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1086: SIX
                {
                mSIX(); 

                }
                break;
            case 163 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1090: SEVEN
                {
                mSEVEN(); 

                }
                break;
            case 164 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1096: EIGHT
                {
                mEIGHT(); 

                }
                break;
            case 165 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1102: NINE
                {
                mNINE(); 

                }
                break;
            case 166 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1107: TEN
                {
                mTEN(); 

                }
                break;
            case 167 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1111: ELEVEN
                {
                mELEVEN(); 

                }
                break;
            case 168 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1118: TWELVE
                {
                mTWELVE(); 

                }
                break;
            case 169 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1125: THIRTEEN
                {
                mTHIRTEEN(); 

                }
                break;
            case 170 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1134: FOURTEEN
                {
                mFOURTEEN(); 

                }
                break;
            case 171 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1143: FIFTEEN
                {
                mFIFTEEN(); 

                }
                break;
            case 172 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1151: SIXTEEN
                {
                mSIXTEEN(); 

                }
                break;
            case 173 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1159: SEVENTEEN
                {
                mSEVENTEEN(); 

                }
                break;
            case 174 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1169: EIGHTEEN
                {
                mEIGHTEEN(); 

                }
                break;
            case 175 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1178: NINETEEN
                {
                mNINETEEN(); 

                }
                break;
            case 176 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1187: TWENTY
                {
                mTWENTY(); 

                }
                break;
            case 177 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1194: THIRTY
                {
                mTHIRTY(); 

                }
                break;
            case 178 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1201: FIRST
                {
                mFIRST(); 

                }
                break;
            case 179 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1207: SECOND
                {
                mSECOND(); 

                }
                break;
            case 180 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1214: THIRD
                {
                mTHIRD(); 

                }
                break;
            case 181 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1220: FOURTH
                {
                mFOURTH(); 

                }
                break;
            case 182 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1227: FIFTH
                {
                mFIFTH(); 

                }
                break;
            case 183 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1233: SIXTH
                {
                mSIXTH(); 

                }
                break;
            case 184 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1239: SEVENTH
                {
                mSEVENTH(); 

                }
                break;
            case 185 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1247: EIGHTH
                {
                mEIGHTH(); 

                }
                break;
            case 186 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1254: NINTH
                {
                mNINTH(); 

                }
                break;
            case 187 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1260: TENTH
                {
                mTENTH(); 

                }
                break;
            case 188 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1266: ELEVENTH
                {
                mELEVENTH(); 

                }
                break;
            case 189 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1275: TWELFTH
                {
                mTWELFTH(); 

                }
                break;
            case 190 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1283: THIRTEENTH
                {
                mTHIRTEENTH(); 

                }
                break;
            case 191 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1294: FOURTEENTH
                {
                mFOURTEENTH(); 

                }
                break;
            case 192 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1305: FIFTEENTH
                {
                mFIFTEENTH(); 

                }
                break;
            case 193 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1315: SIXTEENTH
                {
                mSIXTEENTH(); 

                }
                break;
            case 194 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1325: SEVENTEENTH
                {
                mSEVENTEENTH(); 

                }
                break;
            case 195 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1337: EIGHTEENTH
                {
                mEIGHTEENTH(); 

                }
                break;
            case 196 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1348: NINETEENTH
                {
                mNINETEENTH(); 

                }
                break;
            case 197 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1359: TWENTIETH
                {
                mTWENTIETH(); 

                }
                break;
            case 198 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1369: THIRTIETH
                {
                mTHIRTIETH(); 

                }
                break;
            case 199 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1379: COLON
                {
                mCOLON(); 

                }
                break;
            case 200 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1385: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 201 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1391: DASH
                {
                mDASH(); 

                }
                break;
            case 202 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1396: SLASH
                {
                mSLASH(); 

                }
                break;
            case 203 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1402: DOT
                {
                mDOT(); 

                }
                break;
            case 204 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1406: PLUS
                {
                mPLUS(); 

                }
                break;
            case 205 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1411: SINGLE_QUOTE
                {
                mSINGLE_QUOTE(); 

                }
                break;
            case 206 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1424: IN
                {
                mIN(); 

                }
                break;
            case 207 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1427: THE
                {
                mTHE(); 

                }
                break;
            case 208 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1431: AT
                {
                mAT(); 

                }
                break;
            case 209 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1434: ON
                {
                mON(); 

                }
                break;
            case 210 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1437: OF
                {
                mOF(); 

                }
                break;
            case 211 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1440: THIS
                {
                mTHIS(); 

                }
                break;
            case 212 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1445: LAST
                {
                mLAST(); 

                }
                break;
            case 213 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1450: NEXT
                {
                mNEXT(); 

                }
                break;
            case 214 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1455: PAST
                {
                mPAST(); 

                }
                break;
            case 215 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1460: COMING
                {
                mCOMING(); 

                }
                break;
            case 216 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1467: UPCOMING
                {
                mUPCOMING(); 

                }
                break;
            case 217 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1476: FROM
                {
                mFROM(); 

                }
                break;
            case 218 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1481: NOW
                {
                mNOW(); 

                }
                break;
            case 219 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1485: AGO
                {
                mAGO(); 

                }
                break;
            case 220 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1489: BEFORE
                {
                mBEFORE(); 

                }
                break;
            case 221 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1496: AFTER
                {
                mAFTER(); 

                }
                break;
            case 222 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1502: WHITE_SPACE
                {
                mWHITE_SPACE(); 

                }
                break;
            case 223 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1514: UNKNOWN_WORD
                {
                mUNKNOWN_WORD(); 

                }
                break;
            case 224 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateLexer.g:1:1527: UNKNOWN_CHAR
                {
                mUNKNOWN_CHAR(); 

                }
                break;

        }

    }


    protected DFA57 dfa57 = new DFA57(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA86 dfa86 = new DFA86(this);
    static final String DFA57_eotS =
        "\3\uffff\1\6\1\10\2\uffff\1\12\3\uffff";
    static final String DFA57_eofS =
        "\13\uffff";
    static final String DFA57_minS =
        "\1\164\1\150\1\165\1\162\1\163\2\uffff\1\144\3\uffff";
    static final String DFA57_maxS =
        "\1\164\1\150\1\165\2\163\2\uffff\1\144\3\uffff";
    static final String DFA57_acceptS =
        "\5\uffff\1\4\1\3\1\uffff\1\2\1\1\1\5";
    static final String DFA57_specialS =
        "\13\uffff}>";
    static final String[] DFA57_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4\1\5",
            "\1\7",
            "",
            "",
            "\1\11",
            "",
            "",
            ""
    };

    static final short[] DFA57_eot = DFA.unpackEncodedString(DFA57_eotS);
    static final short[] DFA57_eof = DFA.unpackEncodedString(DFA57_eofS);
    static final char[] DFA57_min = DFA.unpackEncodedStringToUnsignedChars(DFA57_minS);
    static final char[] DFA57_max = DFA.unpackEncodedStringToUnsignedChars(DFA57_maxS);
    static final short[] DFA57_accept = DFA.unpackEncodedString(DFA57_acceptS);
    static final short[] DFA57_special = DFA.unpackEncodedString(DFA57_specialS);
    static final short[][] DFA57_transition;

    static {
        int numStates = DFA57_transitionS.length;
        DFA57_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA57_transition[i] = DFA.unpackEncodedString(DFA57_transitionS[i]);
        }
    }

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = DFA57_eot;
            this.eof = DFA57_eof;
            this.min = DFA57_min;
            this.max = DFA57_max;
            this.accept = DFA57_accept;
            this.special = DFA57_special;
            this.transition = DFA57_transition;
        }
        public String getDescription() {
            return "24:1: THURSDAY : ( 'thursday' ( 's' )? | 'thur' ( DOT )? | 'thu' ( DOT )? | 'thus' ( DOT )? | 'thurs' ( DOT )? );";
        }
    }
    static final String DFA71_eotS =
        "\15\uffff";
    static final String DFA71_eofS =
        "\15\uffff";
    static final String DFA71_minS =
        "\1\164\1\157\2\155\1\162\2\157\1\162\2\uffff\1\157\2\uffff";
    static final String DFA71_maxS =
        "\1\164\1\157\1\155\1\157\1\162\1\157\2\162\2\uffff\1\162\2\uffff";
    static final String DFA71_acceptS =
        "\10\uffff\1\1\1\2\1\uffff\1\3\1\4";
    static final String DFA71_specialS =
        "\15\uffff}>";
    static final String[] DFA71_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\5\1\uffff\1\4",
            "\1\6",
            "\1\7",
            "\1\10\2\uffff\1\11",
            "\1\12",
            "",
            "",
            "\1\13\2\uffff\1\14",
            "",
            ""
    };

    static final short[] DFA71_eot = DFA.unpackEncodedString(DFA71_eotS);
    static final short[] DFA71_eof = DFA.unpackEncodedString(DFA71_eofS);
    static final char[] DFA71_min = DFA.unpackEncodedStringToUnsignedChars(DFA71_minS);
    static final char[] DFA71_max = DFA.unpackEncodedStringToUnsignedChars(DFA71_maxS);
    static final short[] DFA71_accept = DFA.unpackEncodedString(DFA71_acceptS);
    static final short[] DFA71_special = DFA.unpackEncodedString(DFA71_specialS);
    static final short[][] DFA71_transition;

    static {
        int numStates = DFA71_transitionS.length;
        DFA71_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA71_transition[i] = DFA.unpackEncodedString(DFA71_transitionS[i]);
        }
    }

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = DFA71_eot;
            this.eof = DFA71_eof;
            this.min = DFA71_min;
            this.max = DFA71_max;
            this.accept = DFA71_accept;
            this.special = DFA71_special;
            this.transition = DFA71_transition;
        }
        public String getDescription() {
            return "35:1: TOMORROW : ( 'tomorow' | 'tomorrow' | 'tommorow' | 'tommorrow' );";
        }
    }
    static final String DFA86_eotS =
        "\1\uffff\3\55\1\73\4\55\1\123\1\55\1\130\1\55\1\133\2\55\1\143\2"+
        "\55\1\167\1\u0082\1\u008d\1\u0098\1\u00a3\1\u00ae\1\u00b9\1\u00c4"+
        "\1\u00cf\1\u00da\1\55\4\uffff\1\u00e0\2\uffff\3\55\3\uffff\2\55"+
        "\1\uffff\11\55\1\u00f8\2\55\1\73\1\uffff\2\55\1\u00ff\4\55\1\u0106"+
        "\2\55\1\u010a\1\u010b\2\55\1\u0111\4\55\1\u011a\3\55\1\uffff\4\55"+
        "\1\uffff\1\55\1\133\1\uffff\2\55\1\u012b\4\55\1\uffff\2\55\1\u0132"+
        "\4\55\1\u0137\1\55\156\uffff\1\u0139\10\uffff\1\u013a\2\55\1\u013e"+
        "\1\u0140\1\u0142\1\u0144\1\u0147\5\55\1\u014e\1\u0150\1\u0154\2"+
        "\55\2\u00f8\1\uffff\1\u0159\1\u015b\3\55\1\u015f\1\uffff\1\u0160"+
        "\1\u0162\2\55\1\u0167\1\u016a\1\uffff\1\u016c\1\u016e\1\u016f\2"+
        "\uffff\1\u0171\1\55\1\u0173\2\55\1\uffff\1\55\1\u0179\1\u017b\1"+
        "\u017d\1\u0180\2\55\1\u0184\1\uffff\2\55\1\u0188\1\55\1\u018c\1"+
        "\u018f\4\55\2\u0194\2\55\2\u012b\1\uffff\1\55\1\143\1\55\1\143\2"+
        "\u0132\1\uffff\2\55\2\u0137\1\uffff\1\55\2\uffff\3\55\1\uffff\1"+
        "\u0140\1\uffff\1\u0142\1\uffff\1\55\1\uffff\1\55\1\u0147\1\uffff"+
        "\1\u01a4\1\u01a6\1\u01a7\3\55\1\uffff\1\u0150\1\uffff\1\55\1\u0154"+
        "\1\55\1\uffff\2\55\1\uffff\1\55\1\uffff\1\55\1\uffff\1\55\2\u015f"+
        "\2\uffff\1\u0162\1\uffff\3\55\1\u0167\1\uffff\1\55\1\u016a\1\uffff"+
        "\1\55\1\uffff\1\55\2\uffff\1\55\1\uffff\1\u01bc\1\uffff\1\55\1\u01bf"+
        "\1\55\1\u01c1\1\55\1\uffff\1\u017b\1\uffff\1\u017d\1\uffff\2\u0180"+
        "\1\uffff\2\55\1\u01c8\1\uffff\3\55\1\uffff\3\55\1\uffff\1\55\1\u018f"+
        "\1\uffff\1\u01d3\1\u01d5\2\u0194\1\uffff\1\u01d7\1\55\1\u01d9\5"+
        "\55\1\u01df\2\55\1\u0140\1\u0142\2\55\1\uffff\1\55\2\uffff\1\55"+
        "\1\u01e7\1\u01e8\1\u014e\1\55\1\u01ec\2\55\1\u0159\1\55\1\u01f2"+
        "\1\55\1\u01f5\4\55\1\u01fa\2\55\1\uffff\1\u01fd\1\55\1\uffff\1\u01ff"+
        "\1\uffff\2\55\1\u0180\1\u0203\1\55\1\u0207\1\uffff\1\u0208\5\55"+
        "\1\u0210\2\55\1\u01d3\1\uffff\1\u01d5\1\uffff\1\u01d7\1\uffff\1"+
        "\55\1\uffff\1\55\1\u0217\1\u0218\2\55\1\uffff\3\55\1\u0147\1\55"+
        "\1\u0220\1\55\2\uffff\1\55\1\u0154\1\u01ec\1\uffff\2\55\1\u0159"+
        "\1\u015b\1\55\1\uffff\2\55\1\uffff\1\u022b\1\u0167\2\55\1\uffff"+
        "\2\55\1\uffff\1\55\1\uffff\3\55\1\uffff\1\55\1\u0236\1\55\2\uffff"+
        "\3\55\1\u023c\1\55\1\u023e\1\55\1\uffff\6\55\2\uffff\1\u0247\1\u0248"+
        "\1\u0249\1\u013e\1\55\1\u0147\1\55\1\uffff\1\u024e\1\u014e\1\u0154"+
        "\1\u024f\1\55\1\u015b\3\55\1\u0254\1\uffff\1\u0167\1\55\1\u0257"+
        "\1\u016e\3\55\1\u017d\2\55\1\uffff\1\55\1\u0260\3\55\1\uffff\1\u0264"+
        "\1\uffff\2\55\1\u016a\5\55\3\uffff\1\u013e\1\u0144\1\u026e\1\55"+
        "\2\uffff\1\u0157\3\55\1\uffff\1\u016a\1\55\1\uffff\1\u016e\1\u0171"+
        "\1\u0277\1\u0179\1\u017d\1\u0180\1\u027b\1\55\1\uffff\2\u0260\1"+
        "\55\1\uffff\3\55\1\u0281\1\u0283\1\55\1\u0285\1\u0144\1\55\1\uffff"+
        "\1\u0287\1\u01bc\1\u0162\1\u028a\1\u016a\1\u028b\1\u0171\1\55\1"+
        "\uffff\1\u0179\1\u0180\1\55\1\uffff\1\u028e\1\u0260\1\u028f\1\u018f"+
        "\1\u0291\1\uffff\1\55\1\uffff\1\u0283\1\uffff\1\u0293\1\uffff\1"+
        "\u0162\1\55\2\uffff\1\u0295\1\u0296\2\uffff\1\u018f\1\uffff\1\u0297"+
        "\1\uffff\1\u0298\4\uffff";
    static final String DFA86_eofS =
        "\u0299\uffff";
    static final String DFA86_minS =
        "\1\0\1\141\1\145\3\141\1\143\1\144\2\141\1\145\1\141\1\145\1\141"+
        "\1\160\1\155\1\141\2\144\12\60\1\144\4\uffff\1\11\2\uffff\1\156"+
        "\1\141\1\145\3\uffff\1\156\1\154\1\uffff\1\142\1\151\1\165\1\146"+
        "\1\162\1\156\1\144\2\164\1\141\1\162\1\147\1\141\1\uffff\1\164\1"+
        "\144\1\141\1\157\1\143\1\156\1\164\1\141\1\170\1\164\2\141\1\157"+
        "\1\147\1\141\1\170\1\143\1\171\1\145\1\141\1\144\1\145\1\156\1\uffff"+
        "\1\144\1\165\1\144\1\164\1\uffff\2\141\1\uffff\2\164\1\141\1\163"+
        "\2\143\1\164\1\uffff\2\164\1\141\1\147\1\145\2\164\1\141\1\155\156"+
        "\uffff\1\141\10\uffff\1\141\1\163\1\146\5\141\1\155\1\162\1\145"+
        "\1\164\1\163\3\141\1\156\1\55\2\141\1\uffff\2\141\1\145\2\164\1"+
        "\141\1\uffff\2\141\1\145\1\157\2\141\1\uffff\3\141\2\uffff\1\141"+
        "\1\156\1\141\1\150\1\145\1\uffff\1\164\4\141\1\145\1\162\1\141\1"+
        "\uffff\1\141\1\155\1\141\1\154\2\141\1\153\1\162\2\164\2\141\1\162"+
        "\1\164\2\141\1\uffff\1\164\1\141\1\157\3\141\1\uffff\1\150\1\166"+
        "\2\141\1\uffff\1\151\2\uffff\1\164\1\157\1\141\1\uffff\1\141\1\uffff"+
        "\1\141\1\uffff\1\165\1\uffff\2\141\1\uffff\3\141\1\145\1\164\1\150"+
        "\1\uffff\1\141\1\uffff\2\141\1\150\1\uffff\2\151\1\uffff\1\154\1"+
        "\uffff\1\163\1\uffff\1\162\2\141\2\uffff\1\141\1\uffff\2\156\2\141"+
        "\1\uffff\1\162\1\141\1\uffff\1\145\1\uffff\1\142\2\uffff\1\155\1"+
        "\uffff\1\141\1\uffff\1\164\1\141\1\150\1\141\1\155\1\uffff\1\141"+
        "\1\uffff\1\141\1\uffff\2\141\1\uffff\1\145\1\144\1\141\1\uffff\1"+
        "\171\1\162\1\157\1\uffff\1\146\1\164\1\150\1\uffff\1\145\1\141\1"+
        "\uffff\4\141\1\uffff\1\141\1\145\1\141\1\155\1\164\1\150\1\145\1"+
        "\156\1\141\2\162\3\141\1\171\1\uffff\1\145\2\uffff\1\145\3\141\1"+
        "\171\1\141\1\156\1\147\1\141\1\164\1\55\1\155\1\141\1\144\1\171"+
        "\1\144\1\145\1\141\1\145\1\142\1\uffff\1\141\1\145\1\uffff\1\141"+
        "\1\uffff\1\142\3\141\1\145\1\141\1\uffff\1\141\1\157\1\162\1\145"+
        "\1\164\1\151\1\141\1\163\1\156\1\141\1\uffff\1\141\1\uffff\1\141"+
        "\1\uffff\1\162\1\uffff\1\151\2\141\1\156\1\147\1\uffff\1\145\1\171"+
        "\1\162\1\141\1\145\1\141\1\156\2\uffff\1\163\2\141\1\uffff\1\147"+
        "\1\150\2\141\1\157\1\uffff\1\142\1\145\1\uffff\3\141\1\156\1\uffff"+
        "\1\162\1\145\1\uffff\1\145\1\uffff\1\145\1\171\1\141\1\uffff\1\145"+
        "\1\141\1\145\2\uffff\1\167\2\157\1\141\1\150\1\141\1\145\1\uffff"+
        "\3\144\1\156\2\145\2\uffff\4\141\1\171\1\141\1\156\1\uffff\4\141"+
        "\1\164\1\141\1\157\2\145\1\141\1\uffff\1\141\1\171\2\141\1\162\1"+
        "\156\1\162\1\141\1\171\1\156\1\uffff\1\164\1\141\2\167\1\157\1\uffff"+
        "\1\141\1\uffff\1\164\3\141\1\147\1\156\1\145\1\150\3\uffff\3\141"+
        "\1\150\2\uffff\1\141\1\156\1\162\1\156\1\uffff\1\141\1\150\1\uffff"+
        "\7\141\1\150\1\uffff\2\141\1\167\1\uffff\1\150\2\171\2\141\1\156"+
        "\2\141\1\150\1\uffff\7\141\1\150\1\uffff\2\141\1\150\1\uffff\5\141"+
        "\1\uffff\1\150\1\uffff\1\141\1\uffff\1\141\1\uffff\1\141\1\150\2"+
        "\uffff\2\141\2\uffff\1\141\1\uffff\1\141\1\uffff\1\141\4\uffff";
    static final String DFA86_maxS =
        "\1\uffff\1\165\1\162\1\164\1\172\1\165\1\156\1\157\1\145\1\172\1"+
        "\145\1\172\1\145\1\172\1\164\1\155\1\172\2\164\12\71\1\144\4\uffff"+
        "\1\56\2\uffff\1\156\1\141\1\145\3\uffff\2\156\1\uffff\1\142\1\157"+
        "\1\165\1\166\1\171\1\162\1\144\2\164\1\172\1\162\1\147\1\172\1\uffff"+
        "\2\164\1\172\1\157\1\166\1\156\1\164\1\172\1\170\1\164\2\172\1\167"+
        "\1\156\1\172\1\170\1\143\1\171\1\145\1\172\1\155\1\157\1\156\1\uffff"+
        "\1\145\1\165\2\164\1\uffff\1\163\1\172\1\uffff\2\164\1\172\1\163"+
        "\2\143\1\164\1\uffff\2\164\1\172\1\147\1\145\2\164\1\172\1\155\156"+
        "\uffff\1\172\10\uffff\1\172\1\163\1\146\5\172\1\155\1\162\1\145"+
        "\1\164\1\163\3\172\2\156\2\172\1\uffff\2\172\1\145\2\164\1\172\1"+
        "\uffff\2\172\1\145\1\157\2\172\1\uffff\3\172\2\uffff\1\172\1\156"+
        "\1\172\1\150\1\164\1\uffff\1\164\4\172\1\145\1\163\1\172\1\uffff"+
        "\1\141\1\157\1\172\1\156\2\172\1\153\1\162\2\164\2\172\1\162\1\164"+
        "\2\172\1\uffff\1\164\1\172\1\157\3\172\1\uffff\1\164\1\166\2\172"+
        "\1\uffff\1\151\2\uffff\1\164\1\157\1\141\1\uffff\1\172\1\uffff\1"+
        "\172\1\uffff\1\165\1\uffff\1\141\1\172\1\uffff\3\172\1\150\1\164"+
        "\1\150\1\uffff\1\172\1\uffff\1\141\1\172\1\150\1\uffff\2\151\1\uffff"+
        "\1\154\1\uffff\1\163\1\uffff\1\162\2\172\2\uffff\1\172\1\uffff\2"+
        "\156\1\141\1\172\1\uffff\1\162\1\172\1\uffff\1\150\1\uffff\1\142"+
        "\2\uffff\1\155\1\uffff\1\172\1\uffff\1\164\1\172\1\150\1\172\1\155"+
        "\1\uffff\1\172\1\uffff\1\172\1\uffff\2\172\1\uffff\1\145\1\164\1"+
        "\172\1\uffff\1\171\1\162\1\157\1\uffff\1\166\1\164\1\150\1\uffff"+
        "\1\145\1\172\1\uffff\4\172\1\uffff\1\172\1\145\1\172\1\155\1\164"+
        "\1\150\1\145\1\156\1\172\2\162\2\172\1\141\1\171\1\uffff\1\150\2"+
        "\uffff\1\145\3\172\1\171\1\172\1\156\1\147\1\172\1\164\1\172\1\155"+
        "\1\172\1\144\1\171\1\144\1\145\1\172\1\145\1\142\1\uffff\1\172\1"+
        "\145\1\uffff\1\172\1\uffff\1\142\1\141\2\172\1\171\1\172\1\uffff"+
        "\1\172\2\162\1\145\1\164\1\171\1\172\1\163\1\156\1\172\1\uffff\1"+
        "\172\1\uffff\1\172\1\uffff\1\162\1\uffff\1\151\2\172\1\156\1\147"+
        "\1\uffff\1\145\1\171\1\162\1\172\1\145\1\172\1\156\2\uffff\1\163"+
        "\2\172\1\uffff\1\147\1\150\2\172\1\157\1\uffff\1\142\1\150\1\uffff"+
        "\2\172\1\141\1\156\1\uffff\1\162\1\145\1\uffff\1\145\1\uffff\1\145"+
        "\1\171\1\141\1\uffff\1\145\1\172\1\145\2\uffff\1\167\1\157\1\162"+
        "\1\172\1\150\1\172\1\145\1\uffff\3\144\1\156\2\145\2\uffff\4\172"+
        "\1\171\1\172\1\156\1\uffff\4\172\1\164\1\172\1\157\2\145\1\172\1"+
        "\uffff\1\172\1\171\2\172\1\162\1\156\1\162\1\172\1\171\1\156\1\uffff"+
        "\1\164\1\172\2\167\1\157\1\uffff\1\172\1\uffff\1\164\1\141\1\172"+
        "\1\141\1\147\1\156\1\145\1\150\3\uffff\3\172\1\150\2\uffff\1\172"+
        "\1\156\1\162\1\156\1\uffff\1\172\1\150\1\uffff\7\172\1\150\1\uffff"+
        "\2\172\1\167\1\uffff\1\150\2\171\2\172\1\156\2\172\1\150\1\uffff"+
        "\7\172\1\150\1\uffff\2\172\1\150\1\uffff\5\172\1\uffff\1\150\1\uffff"+
        "\1\172\1\uffff\1\172\1\uffff\1\172\1\150\2\uffff\2\172\2\uffff\1"+
        "\172\1\uffff\1\172\1\uffff\1\172\4\uffff";
    static final String DFA86_acceptS =
        "\36\uffff\1\u00c7\1\u00c8\1\u00c9\1\u00ca\1\uffff\1\u00cc\1\u00cd"+
        "\3\uffff\1\u00de\1\u00df\1\u00e0\2\uffff\1\u00df\15\uffff\1\34\27"+
        "\uffff\1\36\4\uffff\1\37\2\uffff\1\35\7\uffff\1\44\11\uffff\1\53"+
        "\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\77\1\100\1"+
        "\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\66\1\111\1\112"+
        "\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1\122\1\67\1\123\1\124"+
        "\1\125\1\126\1\127\1\130\1\131\1\132\1\133\1\134\1\70\1\135\1\136"+
        "\1\137\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\71\1\147\1\150"+
        "\1\151\1\152\1\153\1\154\1\155\1\156\1\157\1\160\1\72\1\161\1\162"+
        "\1\163\1\164\1\165\1\166\1\167\1\170\1\171\1\172\1\73\1\173\1\174"+
        "\1\175\1\176\1\177\1\u0080\1\u0081\1\u0082\1\u0083\1\u0084\1\74"+
        "\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c"+
        "\1\u008d\1\u008e\1\75\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1"+
        "\u0094\1\u0095\1\u0096\1\u0097\1\u0098\1\76\1\uffff\1\u00c7\1\u00c8"+
        "\1\u00c9\1\u00ca\1\u00cb\1\u00de\1\u00cc\1\u00cd\24\uffff\1\50\6"+
        "\uffff\1\u00d0\6\uffff\1\u0099\3\uffff\1\u00d1\1\u00d2\5\uffff\1"+
        "\u009a\10\uffff\1\u009c\20\uffff\1\46\6\uffff\1\45\4\uffff\1\47"+
        "\1\uffff\1\u009b\1\u00ce\3\uffff\1\1\1\uffff\1\6\1\uffff\1\7\1\uffff"+
        "\1\2\2\uffff\1\22\6\uffff\1\3\1\uffff\1\5\3\uffff\1\16\2\uffff\1"+
        "\40\1\uffff\1\4\1\uffff\1\10\3\uffff\1\51\1\u00db\1\uffff\1\11\4"+
        "\uffff\1\15\2\uffff\1\23\1\uffff\1\u00a2\1\uffff\1\12\1\u009d\1"+
        "\uffff\1\13\1\uffff\1\u00da\5\uffff\1\14\1\uffff\1\25\1\uffff\1"+
        "\17\2\uffff\1\21\3\uffff\1\u00cf\3\uffff\1\u009e\3\uffff\1\u00a6"+
        "\2\uffff\1\20\4\uffff\1\52\17\uffff\1\u00d9\1\uffff\1\u00a0\1\u00a1"+
        "\24\uffff\1\41\2\uffff\1\u00a5\1\uffff\1\u00d5\6\uffff\1\u00d3\12"+
        "\uffff\1\26\1\uffff\1\24\1\uffff\1\30\1\uffff\1\u00d6\5\uffff\1"+
        "\u00d4\7\uffff\1\u00b6\1\u00b2\3\uffff\1\27\5\uffff\1\u00dd\2\uffff"+
        "\1\u00a3\4\uffff\1\u00b7\2\uffff\1\43\1\uffff\1\u00ba\3\uffff\1"+
        "\u009f\3\uffff\1\u00b4\1\31\7\uffff\1\u00bb\6\uffff\1\u00a4\1\u00b9"+
        "\7\uffff\1\u00b5\12\uffff\1\u00b3\12\uffff\1\u00b1\5\uffff\1\u00a8"+
        "\1\uffff\1\u00b0\10\uffff\1\u00a7\1\u00d7\1\u00dc\4\uffff\1\u00ab"+
        "\1\42\4\uffff\1\u00b8\2\uffff\1\u00ac\10\uffff\1\32\3\uffff\1\u00bd"+
        "\11\uffff\1\u00aa\10\uffff\1\u00af\3\uffff\1\u00a9\5\uffff\1\u00d8"+
        "\1\uffff\1\u00ae\1\uffff\1\u00bc\1\uffff\1\u00c0\2\uffff\1\u00ad"+
        "\1\u00c1\2\uffff\1\u00c6\1\u00c5\1\uffff\1\33\1\uffff\1\u00bf\1"+
        "\uffff\1\u00c4\1\u00be\1\u00c3\1\u00c2";
    static final String DFA86_specialS =
        "\1\0\u0298\uffff}>";
    static final String[] DFA86_transitionS = {
            "\11\52\2\50\2\52\1\50\22\52\1\50\6\52\1\44\3\52\1\43\1\37\1"+
            "\40\1\42\1\41\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1"+
            "\34\1\36\46\52\1\4\1\47\1\22\1\10\1\21\1\2\1\17\1\13\1\45\1"+
            "\1\1\51\1\46\1\3\1\7\1\6\1\15\1\51\1\35\1\5\1\11\1\16\1\51\1"+
            "\12\1\51\1\14\1\20\uff85\52",
            "\1\53\23\uffff\1\54",
            "\1\56\3\uffff\1\61\5\uffff\1\60\2\uffff\1\57",
            "\1\62\2\uffff\1\66\4\uffff\1\64\5\uffff\1\63\3\uffff\1\65\1"+
            "\67",
            "\5\55\1\74\1\77\3\55\1\75\1\55\1\72\2\55\1\70\3\55\1\76\1\71"+
            "\5\55",
            "\1\102\3\uffff\1\100\3\uffff\1\104\12\uffff\1\103\1\101",
            "\1\105\2\uffff\1\107\7\uffff\1\106",
            "\1\112\1\113\3\uffff\1\111\5\uffff\1\110",
            "\1\115\3\uffff\1\114",
            "\4\55\1\122\2\55\1\117\6\55\1\120\5\55\1\116\1\55\1\121\3\55",
            "\1\124",
            "\1\126\15\55\1\125\3\55\1\127\7\55",
            "\1\131",
            "\1\137\2\55\1\135\10\55\1\132\5\55\1\134\1\136\6\55",
            "\1\141\3\uffff\1\140",
            "\1\142",
            "\32\55",
            "\1\145\4\uffff\1\147\2\uffff\1\150\6\uffff\1\144\1\146",
            "\1\152\12\uffff\1\154\3\uffff\1\151\1\153",
            "\1\155\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1\165\1\166",
            "\1\170\1\171\1\172\1\173\1\174\1\175\1\176\1\177\1\u0080\1"+
            "\u0081",
            "\1\u0083\1\u0084\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089\1"+
            "\u008a\1\u008b\1\u008c",
            "\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1"+
            "\u0095\1\u0096\1\u0097",
            "\1\u0099\1\u009a\1\u009b\1\u009c\1\u009d\1\u009e\1\u009f\1"+
            "\u00a0\1\u00a1\1\u00a2",
            "\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1"+
            "\u00ab\1\u00ac\1\u00ad",
            "\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1"+
            "\u00b6\1\u00b7\1\u00b8",
            "\1\u00ba\1\u00bb\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\u00c0\1"+
            "\u00c1\1\u00c2\1\u00c3",
            "\1\u00c5\1\u00c6\1\u00c7\1\u00c8\1\u00c9\1\u00ca\1\u00cb\1"+
            "\u00cc\1\u00cd\1\u00ce",
            "\1\u00d0\1\u00d1\1\u00d2\1\u00d3\1\u00d4\1\u00d5\1\u00d6\1"+
            "\u00d7\1\u00d8\1\u00d9",
            "\1\u00db",
            "",
            "",
            "",
            "",
            "\2\u00e1\2\uffff\1\u00e1\22\uffff\1\u00e1\15\uffff\1\u00e1",
            "",
            "",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "",
            "",
            "",
            "\1\u00e7",
            "\1\u00e9\1\uffff\1\u00e8",
            "",
            "\1\u00ea",
            "\1\u00eb\5\uffff\1\u00ec",
            "\1\u00ed",
            "\1\u00ef\13\uffff\1\u00f0\3\uffff\1\u00ee",
            "\1\u00f1\6\uffff\1\u00f2",
            "\1\u00f3\3\uffff\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\32\55",
            "\1\u00f9",
            "\1\u00fa",
            "\32\55",
            "",
            "\1\u00fb",
            "\1\u00fd\16\uffff\1\u00fc\1\u00fe",
            "\32\55",
            "\1\u0100",
            "\1\u0103\14\uffff\1\u0101\5\uffff\1\u0102",
            "\1\u0104",
            "\1\u0105",
            "\32\55",
            "\1\u0107",
            "\1\u0108",
            "\4\55\1\u0109\25\55",
            "\32\55",
            "\1\u010d\6\uffff\1\u010c\1\u010e",
            "\1\u010f\6\uffff\1\u0110",
            "\32\55",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\4\55\1\u0119\3\55\1\u0118\10\55\1\u0117\2\55\1\u0116\5\55",
            "\1\u011b\10\uffff\1\u011c",
            "\1\u011e\11\uffff\1\u011d",
            "\1\u011f",
            "",
            "\1\u0120\1\u0121",
            "\1\u0122",
            "\1\u0124\16\uffff\1\u0123\1\u0125",
            "\1\u0126",
            "",
            "\1\u0127\21\uffff\1\u0128",
            "\32\55",
            "",
            "\1\u0129",
            "\1\u012a",
            "\32\55",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "",
            "\1\u0130",
            "\1\u0131",
            "\32\55",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\32\55",
            "\1\u0138",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\32\55",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\32\55",
            "\1\u013b",
            "\1\u013c",
            "\24\55\1\u013d\5\55",
            "\4\55\1\u013f\25\55",
            "\30\55\1\u0141\1\55",
            "\21\55\1\u0143\10\55",
            "\3\55\1\u0145\16\55\1\u0146\7\55",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\2\55\1\u014d\27\55",
            "\22\55\1\u014f\7\55",
            "\3\55\1\u0151\16\55\1\u0152\1\u0153\6\55",
            "\1\u0155",
            "\1\u0157\100\uffff\1\u0156",
            "\32\55",
            "\32\55",
            "",
            "\10\55\1\u0158\21\55",
            "\24\55\1\u015a\5\55",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\32\55",
            "",
            "\32\55",
            "\23\55\1\u0161\6\55",
            "\1\u0163",
            "\1\u0164",
            "\3\55\1\u0165\16\55\1\u0166\7\55",
            "\22\55\1\u0169\1\55\1\u0168\5\55",
            "",
            "\23\55\1\u016b\6\55",
            "\16\55\1\u016d\13\55",
            "\32\55",
            "",
            "",
            "\4\55\1\u0170\25\55",
            "\1\u0172",
            "\32\55",
            "\1\u0174",
            "\1\u0175\16\uffff\1\u0176",
            "",
            "\1\u0177",
            "\4\55\1\u0178\25\55",
            "\22\55\1\u017a\7\55",
            "\22\55\1\u017c\7\55",
            "\21\55\1\u017e\1\u017f\7\55",
            "\1\u0181",
            "\1\u0182\1\u0183",
            "\32\55",
            "",
            "\1\u0185",
            "\1\u0187\1\uffff\1\u0186",
            "\32\55",
            "\1\u0189\1\uffff\1\u018a",
            "\23\55\1\u018b\6\55",
            "\15\55\1\u018d\4\55\1\u018e\7\55",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\32\55",
            "\32\55",
            "\1\u0195",
            "\1\u0196",
            "\32\55",
            "\32\55",
            "",
            "\1\u0197",
            "\32\55",
            "\1\u0198",
            "\32\55",
            "\32\55",
            "\32\55",
            "",
            "\1\u0199\13\uffff\1\u019a",
            "\1\u019b",
            "\32\55",
            "\32\55",
            "",
            "\1\u019c",
            "",
            "",
            "\1\u019d",
            "\1\u019e",
            "\1\u019f",
            "",
            "\22\55\1\u01a0\7\55",
            "",
            "\22\55\1\u01a1\7\55",
            "",
            "\1\u01a2",
            "",
            "\1\u01a3",
            "\32\55",
            "",
            "\32\55",
            "\23\55\1\u01a5\6\55",
            "\32\55",
            "\1\u01a8\2\uffff\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "",
            "\32\55",
            "",
            "\1\u01ac",
            "\32\55",
            "\1\u01ad",
            "",
            "\1\u01ae",
            "\1\u01af",
            "",
            "\1\u01b0",
            "",
            "\1\u01b1",
            "",
            "\1\u01b2",
            "\32\55",
            "\32\55",
            "",
            "",
            "\4\55\1\u01b3\25\55",
            "",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "\32\55",
            "",
            "\1\u01b7",
            "\32\55",
            "",
            "\1\u01b8\2\uffff\1\u01b9",
            "",
            "\1\u01ba",
            "",
            "",
            "\1\u01bb",
            "",
            "\32\55",
            "",
            "\1\u01bd",
            "\23\55\1\u01be\6\55",
            "\1\u01c0",
            "\32\55",
            "\1\u01c2",
            "",
            "\32\55",
            "",
            "\3\55\1\u01c3\26\55",
            "",
            "\22\55\1\u01c4\7\55",
            "\32\55",
            "",
            "\1\u01c5",
            "\1\u01c7\17\uffff\1\u01c6",
            "\32\55",
            "",
            "\1\u01c9",
            "\1\u01ca",
            "\1\u01cb",
            "",
            "\1\u01cd\17\uffff\1\u01cc",
            "\1\u01ce",
            "\1\u01cf",
            "",
            "\1\u01d0",
            "\32\55",
            "",
            "\4\55\1\u01d1\15\55\1\u01d2\7\55",
            "\22\55\1\u01d4\7\55",
            "\32\55",
            "\32\55",
            "",
            "\22\55\1\u01d6\7\55",
            "\1\u01d8",
            "\32\55",
            "\1\u01da",
            "\1\u01db",
            "\1\u01dc",
            "\1\u01dd",
            "\1\u01de",
            "\32\55",
            "\1\u01e0",
            "\1\u01e1",
            "\32\55",
            "\32\55",
            "\1\u01e2",
            "\1\u01e3",
            "",
            "\1\u01e4\2\uffff\1\u01e5",
            "",
            "",
            "\1\u01e6",
            "\32\55",
            "\32\55",
            "\4\55\1\u01e9\25\55",
            "\1\u01ea",
            "\22\55\1\u01eb\7\55",
            "\1\u01ed",
            "\1\u01ee",
            "\22\55\1\u01ef\7\55",
            "\1\u01f0",
            "\1\u01bc\63\uffff\15\55\1\u01f1\14\55",
            "\1\u01f3",
            "\23\55\1\u01f4\6\55",
            "\1\u01f6",
            "\1\u01f7",
            "\1\u01f8",
            "\1\u01f9",
            "\32\55",
            "\1\u01fb",
            "\1\u01fc",
            "",
            "\32\55",
            "\1\u01fe",
            "",
            "\32\55",
            "",
            "\1\u0200",
            "\1\u0201",
            "\3\55\1\u0202\26\55",
            "\32\55",
            "\1\u0204\3\uffff\1\u0206\17\uffff\1\u0205",
            "\32\55",
            "",
            "\32\55",
            "\1\u0209\2\uffff\1\u020a",
            "\1\u020b",
            "\1\u020c",
            "\1\u020d",
            "\1\u020f\17\uffff\1\u020e",
            "\32\55",
            "\1\u0211",
            "\1\u0212",
            "\32\55",
            "",
            "\32\55",
            "",
            "\32\55",
            "",
            "\1\u0213",
            "",
            "\1\u0214",
            "\4\55\1\u0215\16\55\1\u0216\6\55",
            "\32\55",
            "\1\u0219",
            "\1\u021a",
            "",
            "\1\u021b",
            "\1\u021c",
            "\1\u021d",
            "\22\55\1\u021e\7\55",
            "\1\u021f",
            "\32\55",
            "\1\u0221",
            "",
            "",
            "\1\u0222",
            "\22\55\1\u0223\7\55",
            "\32\55",
            "",
            "\1\u0224",
            "\1\u0225",
            "\32\55",
            "\22\55\1\u0226\7\55",
            "\1\u0227",
            "",
            "\1\u0228",
            "\1\u0229\2\uffff\1\u022a",
            "",
            "\32\55",
            "\22\55\1\u022c\7\55",
            "\1\u022d",
            "\1\u022e",
            "",
            "\1\u022f",
            "\1\u0230",
            "",
            "\1\u0231",
            "",
            "\1\u0232",
            "\1\u0233",
            "\1\u0234",
            "",
            "\1\u0235",
            "\32\55",
            "\1\u0237",
            "",
            "",
            "\1\u0238",
            "\1\u0239",
            "\1\u023a\2\uffff\1\u023b",
            "\32\55",
            "\1\u023d",
            "\32\55",
            "\1\u023f",
            "",
            "\1\u0240",
            "\1\u0241",
            "\1\u0242",
            "\1\u0243",
            "\1\u0244",
            "\1\u0245",
            "",
            "",
            "\23\55\1\u0246\6\55",
            "\32\55",
            "\32\55",
            "\22\55\1\u024a\7\55",
            "\1\u024b",
            "\32\55",
            "\1\u024c",
            "",
            "\23\55\1\u024d\6\55",
            "\32\55",
            "\32\55",
            "\32\55",
            "\1\u0250",
            "\32\55",
            "\1\u0251",
            "\1\u0252",
            "\1\u0253",
            "\32\55",
            "",
            "\32\55",
            "\1\u0255",
            "\23\55\1\u0256\6\55",
            "\22\55\1\u0258\7\55",
            "\1\u0259",
            "\1\u025a",
            "\1\u025b",
            "\22\55\1\u025c\7\55",
            "\1\u025d",
            "\1\u025e",
            "",
            "\1\u025f",
            "\32\55",
            "\1\u0261",
            "\1\u0262",
            "\1\u0263",
            "",
            "\32\55",
            "",
            "\1\u0265",
            "\1\u0266",
            "\32\55",
            "\1\u0267",
            "\1\u0268",
            "\1\u0269",
            "\1\u026a",
            "\1\u026b",
            "",
            "",
            "",
            "\32\55",
            "\22\55\1\u026c\7\55",
            "\23\55\1\u026d\6\55",
            "\1\u026f",
            "",
            "",
            "\32\55",
            "\1\u0270",
            "\1\u0271",
            "\1\u0272",
            "",
            "\22\55\1\u0273\7\55",
            "\1\u0274",
            "",
            "\32\55",
            "\22\55\1\u0275\7\55",
            "\23\55\1\u0276\6\55",
            "\22\55\1\u0278\7\55",
            "\32\55",
            "\22\55\1\u0279\7\55",
            "\23\55\1\u027a\6\55",
            "\1\u027c",
            "",
            "\32\55",
            "\32\55",
            "\1\u027d",
            "",
            "\1\u027e",
            "\1\u027f",
            "\1\u0280",
            "\32\55",
            "\23\55\1\u0282\6\55",
            "\1\u0284",
            "\32\55",
            "\32\55",
            "\1\u0286",
            "",
            "\32\55",
            "\32\55",
            "\22\55\1\u0288\7\55",
            "\23\55\1\u0289\6\55",
            "\32\55",
            "\32\55",
            "\32\55",
            "\1\u028c",
            "",
            "\32\55",
            "\32\55",
            "\1\u028d",
            "",
            "\32\55",
            "\32\55",
            "\32\55",
            "\22\55\1\u0290\7\55",
            "\32\55",
            "",
            "\1\u0292",
            "",
            "\32\55",
            "",
            "\32\55",
            "",
            "\32\55",
            "\1\u0294",
            "",
            "",
            "\32\55",
            "\32\55",
            "",
            "",
            "\32\55",
            "",
            "\32\55",
            "",
            "\32\55",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA86_eot = DFA.unpackEncodedString(DFA86_eotS);
    static final short[] DFA86_eof = DFA.unpackEncodedString(DFA86_eofS);
    static final char[] DFA86_min = DFA.unpackEncodedStringToUnsignedChars(DFA86_minS);
    static final char[] DFA86_max = DFA.unpackEncodedStringToUnsignedChars(DFA86_maxS);
    static final short[] DFA86_accept = DFA.unpackEncodedString(DFA86_acceptS);
    static final short[] DFA86_special = DFA.unpackEncodedString(DFA86_specialS);
    static final short[][] DFA86_transition;

    static {
        int numStates = DFA86_transitionS.length;
        DFA86_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA86_transition[i] = DFA.unpackEncodedString(DFA86_transitionS[i]);
        }
    }

    class DFA86 extends DFA {

        public DFA86(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 86;
            this.eot = DFA86_eot;
            this.eof = DFA86_eof;
            this.min = DFA86_min;
            this.max = DFA86_max;
            this.accept = DFA86_accept;
            this.special = DFA86_special;
            this.transition = DFA86_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( JANUARY | FEBRUARY | MARCH | APRIL | MAY | JUNE | JULY | AUGUST | SEPTEMBER | OCTOBER | NOVEMBER | DECEMBER | SUNDAY | MONDAY | TUESDAY | WEDNESDAY | THURSDAY | FRIDAY | SATURDAY | HOUR | DAY | WEEK | MONTH | YEAR | TODAY | TOMORROW | YESTERDAY | AM | PM | T | MILITARY_HOUR_SUFFIX | MIDNIGHT | NOON | MORNING | NIGHT | UTC | EST | PST | CST | MST | AKST | HAST | INT_00 | INT_01 | INT_02 | INT_03 | INT_04 | INT_05 | INT_06 | INT_07 | INT_08 | INT_09 | INT_0 | INT_1 | INT_2 | INT_3 | INT_4 | INT_5 | INT_6 | INT_7 | INT_8 | INT_9 | INT_10 | INT_11 | INT_12 | INT_13 | INT_14 | INT_15 | INT_16 | INT_17 | INT_18 | INT_19 | INT_20 | INT_21 | INT_22 | INT_23 | INT_24 | INT_25 | INT_26 | INT_27 | INT_28 | INT_29 | INT_30 | INT_31 | INT_32 | INT_33 | INT_34 | INT_35 | INT_36 | INT_37 | INT_38 | INT_39 | INT_40 | INT_41 | INT_42 | INT_43 | INT_44 | INT_45 | INT_46 | INT_47 | INT_48 | INT_49 | INT_50 | INT_51 | INT_52 | INT_53 | INT_54 | INT_55 | INT_56 | INT_57 | INT_58 | INT_59 | INT_60 | INT_61 | INT_62 | INT_63 | INT_64 | INT_65 | INT_66 | INT_67 | INT_68 | INT_69 | INT_70 | INT_71 | INT_72 | INT_73 | INT_74 | INT_75 | INT_76 | INT_77 | INT_78 | INT_79 | INT_80 | INT_81 | INT_82 | INT_83 | INT_84 | INT_85 | INT_86 | INT_87 | INT_88 | INT_89 | INT_90 | INT_91 | INT_92 | INT_93 | INT_94 | INT_95 | INT_96 | INT_97 | INT_98 | INT_99 | ST | ND | RD | TH | ONE | TWO | THREE | FOUR | FIVE | SIX | SEVEN | EIGHT | NINE | TEN | ELEVEN | TWELVE | THIRTEEN | FOURTEEN | FIFTEEN | SIXTEEN | SEVENTEEN | EIGHTEEN | NINETEEN | TWENTY | THIRTY | FIRST | SECOND | THIRD | FOURTH | FIFTH | SIXTH | SEVENTH | EIGHTH | NINTH | TENTH | ELEVENTH | TWELFTH | THIRTEENTH | FOURTEENTH | FIFTEENTH | SIXTEENTH | SEVENTEENTH | EIGHTEENTH | NINETEENTH | TWENTIETH | THIRTIETH | COLON | COMMA | DASH | SLASH | DOT | PLUS | SINGLE_QUOTE | IN | THE | AT | ON | OF | THIS | LAST | NEXT | PAST | COMING | UPCOMING | FROM | NOW | AGO | BEFORE | AFTER | WHITE_SPACE | UNKNOWN_WORD | UNKNOWN_CHAR );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA86_0 = input.LA(1);

                        s = -1;
                        if ( (LA86_0=='j') ) {s = 1;}

                        else if ( (LA86_0=='f') ) {s = 2;}

                        else if ( (LA86_0=='m') ) {s = 3;}

                        else if ( (LA86_0=='a') ) {s = 4;}

                        else if ( (LA86_0=='s') ) {s = 5;}

                        else if ( (LA86_0=='o') ) {s = 6;}

                        else if ( (LA86_0=='n') ) {s = 7;}

                        else if ( (LA86_0=='d') ) {s = 8;}

                        else if ( (LA86_0=='t') ) {s = 9;}

                        else if ( (LA86_0=='w') ) {s = 10;}

                        else if ( (LA86_0=='h') ) {s = 11;}

                        else if ( (LA86_0=='y') ) {s = 12;}

                        else if ( (LA86_0=='p') ) {s = 13;}

                        else if ( (LA86_0=='u') ) {s = 14;}

                        else if ( (LA86_0=='g') ) {s = 15;}

                        else if ( (LA86_0=='z') ) {s = 16;}

                        else if ( (LA86_0=='e') ) {s = 17;}

                        else if ( (LA86_0=='c') ) {s = 18;}

                        else if ( (LA86_0=='0') ) {s = 19;}

                        else if ( (LA86_0=='1') ) {s = 20;}

                        else if ( (LA86_0=='2') ) {s = 21;}

                        else if ( (LA86_0=='3') ) {s = 22;}

                        else if ( (LA86_0=='4') ) {s = 23;}

                        else if ( (LA86_0=='5') ) {s = 24;}

                        else if ( (LA86_0=='6') ) {s = 25;}

                        else if ( (LA86_0=='7') ) {s = 26;}

                        else if ( (LA86_0=='8') ) {s = 27;}

                        else if ( (LA86_0=='9') ) {s = 28;}

                        else if ( (LA86_0=='r') ) {s = 29;}

                        else if ( (LA86_0==':') ) {s = 30;}

                        else if ( (LA86_0==',') ) {s = 31;}

                        else if ( (LA86_0=='-') ) {s = 32;}

                        else if ( (LA86_0=='/') ) {s = 33;}

                        else if ( (LA86_0=='.') ) {s = 34;}

                        else if ( (LA86_0=='+') ) {s = 35;}

                        else if ( (LA86_0=='\'') ) {s = 36;}

                        else if ( (LA86_0=='i') ) {s = 37;}

                        else if ( (LA86_0=='l') ) {s = 38;}

                        else if ( (LA86_0=='b') ) {s = 39;}

                        else if ( ((LA86_0>='\t' && LA86_0<='\n')||LA86_0=='\r'||LA86_0==' ') ) {s = 40;}

                        else if ( (LA86_0=='k'||LA86_0=='q'||LA86_0=='v'||LA86_0=='x') ) {s = 41;}

                        else if ( ((LA86_0>='\u0000' && LA86_0<='\b')||(LA86_0>='\u000B' && LA86_0<='\f')||(LA86_0>='\u000E' && LA86_0<='\u001F')||(LA86_0>='!' && LA86_0<='&')||(LA86_0>='(' && LA86_0<='*')||(LA86_0>=';' && LA86_0<='`')||(LA86_0>='{' && LA86_0<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 86, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}