// $ANTLR 3.2 Sep 23, 2009 14:05:07 com/joestelmach/natty/generated/DateLexer.g 2010-05-23 23:39:17
 package com.joestelmach.natty.generated; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class DateLexer extends Lexer {
    public static final int NINETEEN=175;
    public static final int INT_08=55;
    public static final int INT_09=56;
    public static final int TWENTY=176;
    public static final int INT_02=49;
    public static final int INT_03=50;
    public static final int INT_00=47;
    public static final int INT_01=48;
    public static final int APRIL=8;
    public static final int INT_06=53;
    public static final int COMING=220;
    public static final int INT_07=54;
    public static final int INT_04=51;
    public static final int INT_05=52;
    public static final int NOW=223;
    public static final int EOF=-1;
    public static final int MONTH=27;
    public static final int EIGHTEENTH=195;
    public static final int THIS=215;
    public static final int NOON=37;
    public static final int TOMORROW=30;
    public static final int FIFTEENTH=192;
    public static final int TODAY=29;
    public static final int NOVEMBER=15;
    public static final int SEVENTH=184;
    public static final int FEBRUARY=6;
    public static final int T=34;
    public static final int SUNDAY=17;
    public static final int SEVEN=163;
    public static final int ELEVEN=167;
    public static final int THIRTEEN=169;
    public static final int UPCOMING=221;
    public static final int SIX=162;
    public static final int FIFTH=182;
    public static final int MORNING=38;
    public static final int DECEMBER=16;
    public static final int AUGUST=12;
    public static final int TUESDAY=19;
    public static final int INT_47=104;
    public static final int THIRD=180;
    public static final int INT_46=103;
    public static final int INT_45=102;
    public static final int INT_44=101;
    public static final int RD=201;
    public static final int INT_49=106;
    public static final int INT_48=105;
    public static final int THE=210;
    public static final int WHITE_SPACE=228;
    public static final int INT_42=99;
    public static final int INT_43=100;
    public static final int FRIDAY=22;
    public static final int INT_40=97;
    public static final int INT_41=98;
    public static final int AT=212;
    public static final int INT_34=91;
    public static final int INT_33=90;
    public static final int SINGLE_QUOTE=208;
    public static final int INT_36=93;
    public static final int INT_35=92;
    public static final int SLASH=206;
    public static final int INT_38=95;
    public static final int INT_37=94;
    public static final int INT_39=96;
    public static final int NINTH=186;
    public static final int TWENTIETH=197;
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
    public static final int TH=202;
    public static final int INT_22=79;
    public static final int FOURTEENTH=191;
    public static final int SIXTEEN=172;
    public static final int AGO=224;
    public static final int ELEVENTH=188;
    public static final int ST=199;
    public static final int TWO=158;
    public static final int INT_20=77;
    public static final int HOUR=24;
    public static final int INT_21=78;
    public static final int JANUARY=5;
    public static final int THIRTEENTH=190;
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
    public static final int FIFTEEN=171;
    public static final int NINE=165;
    public static final int THREE=159;
    public static final int FOURTEEN=170;
    public static final int INT_10=67;
    public static final int YESTERDAY=31;
    public static final int SEVENTEENTH=194;
    public static final int FIRST=178;
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
    public static final int NINETEENTH=196;
    public static final int OCTOBER=14;
    public static final int DAY=25;
    public static final int ONE=157;
    public static final int MIDNIGHT=36;
    public static final int INT_88=145;
    public static final int MARCH=7;
    public static final int INT_89=146;
    public static final int PAST=219;
    public static final int SEVENTEEN=173;
    public static final int INT_72=129;
    public static final int INT_71=128;
    public static final int INT_70=127;
    public static final int THAT=216;
    public static final int INT_76=133;
    public static final int INT_75=132;
    public static final int INT_74=131;
    public static final int INT_73=130;
    public static final int THIRTIETH=198;
    public static final int LAST=217;
    public static final int INT_79=136;
    public static final int INT_77=134;
    public static final int EIGHTEEN=174;
    public static final int INT_78=135;
    public static final int ND=200;
    public static final int INT_63=120;
    public static final int INT_62=119;
    public static final int INT_65=122;
    public static final int INT_64=121;
    public static final int FOURTH=181;
    public static final int SECOND=179;
    public static final int INT_61=118;
    public static final int INT_60=117;
    public static final int SATURDAY=23;
    public static final int FOUR=160;
    public static final int TEN=166;
    public static final int ON=213;
    public static final int MONDAY=18;
    public static final int JUNE=10;
    public static final int OF=214;
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
    public static final int OR=211;
    public static final int PM=33;
    public static final int FROM=222;
    public static final int INT_59=116;
    public static final int INT_57=114;
    public static final int INT_58=115;
    public static final int INT_55=112;
    public static final int EIGHTH=185;
    public static final int INT_56=113;
    public static final int YEAR=28;
    public static final int MAY=9;
    public static final int TENTH=187;
    public static final int INT_9=66;
    public static final int INT_8=65;
    public static final int INT_7=64;
    public static final int SPACE=227;
    public static final int INT_6=63;
    public static final int INT_5=62;
    public static final int UTC=40;
    public static final int INT_4=61;
    public static final int INT_3=60;
    public static final int AKST=45;
    public static final int INT_2=59;
    public static final int MST=44;
    public static final int INT_1=58;
    public static final int EIGHT=164;
    public static final int INT_0=57;
    public static final int CST=43;
    public static final int IN=209;
    public static final int PST=42;
    public static final int COMMA=204;
    public static final int FIVE=161;
    public static final int THIRTY=177;
    public static final int NEXT=218;
    public static final int DIGIT=229;
    public static final int DOT=4;
    public static final int MILITARY_HOUR_SUFFIX=35;
    public static final int EST=41;
    public static final int HAST=46;
    public static final int DASH=205;
    public static final int TWELVE=168;
    public static final int BEFORE=225;
    public static final int AFTER=226;
    public static final int SIXTEENTH=193;
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
    public static final int TWELFTH=189;
    public static final int INT_99=156;
    public static final int SIXTH=183;

    // delegates
    // delegators

    public DateLexer() {;} 
    public DateLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public DateLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "com/joestelmach/natty/generated/DateLexer.g"; }

    // $ANTLR start "JANUARY"
    public final void mJANUARY() throws RecognitionException {
        try {
            int _type = JANUARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/joestelmach/natty/generated/DateLexer.g:7:11: ( 'january' ( 's' )? | 'jan' ( DOT )? )
            int alt3=2;
            switch ( input.LA(1) ) {
            case 'j':
                {
                switch ( input.LA(2) ) {
                case 'a':
                    {
                    switch ( input.LA(3) ) {
                    case 'n':
                        {
                        switch ( input.LA(4) ) {
                        case 'u':
                            {
                            alt3=1;
                            }
                            break;
                        default:
                            alt3=2;}

                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // com/joestelmach/natty/generated/DateLexer.g:7:13: 'january' ( 's' )?
                    {
                    match("january"); 

                    // com/joestelmach/natty/generated/DateLexer.g:7:23: ( 's' )?
                    int alt1=2;
                    switch ( input.LA(1) ) {
                        case 's':
                            {
                            alt1=1;
                            }
                            break;
                    }

                    switch (alt1) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:7:23: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // com/joestelmach/natty/generated/DateLexer.g:7:32: 'jan' ( DOT )?
                    {
                    match("jan"); 

                    // com/joestelmach/natty/generated/DateLexer.g:7:38: ( DOT )?
                    int alt2=2;
                    switch ( input.LA(1) ) {
                        case '.':
                            {
                            alt2=1;
                            }
                            break;
                    }

                    switch (alt2) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:7:38: DOT
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
            // com/joestelmach/natty/generated/DateLexer.g:8:11: ( 'february' ( 's' )? | 'feb' ( DOT )? )
            int alt6=2;
            switch ( input.LA(1) ) {
            case 'f':
                {
                switch ( input.LA(2) ) {
                case 'e':
                    {
                    switch ( input.LA(3) ) {
                    case 'b':
                        {
                        switch ( input.LA(4) ) {
                        case 'r':
                            {
                            alt6=1;
                            }
                            break;
                        default:
                            alt6=2;}

                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // com/joestelmach/natty/generated/DateLexer.g:8:13: 'february' ( 's' )?
                    {
                    match("february"); 

                    // com/joestelmach/natty/generated/DateLexer.g:8:24: ( 's' )?
                    int alt4=2;
                    switch ( input.LA(1) ) {
                        case 's':
                            {
                            alt4=1;
                            }
                            break;
                    }

                    switch (alt4) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:8:24: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // com/joestelmach/natty/generated/DateLexer.g:8:32: 'feb' ( DOT )?
                    {
                    match("feb"); 

                    // com/joestelmach/natty/generated/DateLexer.g:8:38: ( DOT )?
                    int alt5=2;
                    switch ( input.LA(1) ) {
                        case '.':
                            {
                            alt5=1;
                            }
                            break;
                    }

                    switch (alt5) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:8:38: DOT
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
            // com/joestelmach/natty/generated/DateLexer.g:9:11: ( 'march' ( 'es' )? | 'mar' ( DOT )? )
            int alt9=2;
            switch ( input.LA(1) ) {
            case 'm':
                {
                switch ( input.LA(2) ) {
                case 'a':
                    {
                    switch ( input.LA(3) ) {
                    case 'r':
                        {
                        switch ( input.LA(4) ) {
                        case 'c':
                            {
                            alt9=1;
                            }
                            break;
                        default:
                            alt9=2;}

                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // com/joestelmach/natty/generated/DateLexer.g:9:13: 'march' ( 'es' )?
                    {
                    match("march"); 

                    // com/joestelmach/natty/generated/DateLexer.g:9:21: ( 'es' )?
                    int alt7=2;
                    switch ( input.LA(1) ) {
                        case 'e':
                            {
                            alt7=1;
                            }
                            break;
                    }

                    switch (alt7) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:9:21: 'es'
                            {
                            match("es"); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // com/joestelmach/natty/generated/DateLexer.g:9:32: 'mar' ( DOT )?
                    {
                    match("mar"); 

                    // com/joestelmach/natty/generated/DateLexer.g:9:38: ( DOT )?
                    int alt8=2;
                    switch ( input.LA(1) ) {
                        case '.':
                            {
                            alt8=1;
                            }
                            break;
                    }

                    switch (alt8) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:9:38: DOT
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
            // com/joestelmach/natty/generated/DateLexer.g:10:11: ( 'april' ( 's' )? | 'apr' ( DOT )? )
            int alt12=2;
            switch ( input.LA(1) ) {
            case 'a':
                {
                switch ( input.LA(2) ) {
                case 'p':
                    {
                    switch ( input.LA(3) ) {
                    case 'r':
                        {
                        switch ( input.LA(4) ) {
                        case 'i':
                            {
                            alt12=1;
                            }
                            break;
                        default:
                            alt12=2;}

                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // com/joestelmach/natty/generated/DateLexer.g:10:13: 'april' ( 's' )?
                    {
                    match("april"); 

                    // com/joestelmach/natty/generated/DateLexer.g:10:21: ( 's' )?
                    int alt10=2;
                    switch ( input.LA(1) ) {
                        case 's':
                            {
                            alt10=1;
                            }
                            break;
                    }

                    switch (alt10) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:10:21: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // com/joestelmach/natty/generated/DateLexer.g:10:32: 'apr' ( DOT )?
                    {
                    match("apr"); 

                    // com/joestelmach/natty/generated/DateLexer.g:10:38: ( DOT )?
                    int alt11=2;
                    switch ( input.LA(1) ) {
                        case '.':
                            {
                            alt11=1;
                            }
                            break;
                    }

                    switch (alt11) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:10:38: DOT
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
            // com/joestelmach/natty/generated/DateLexer.g:11:11: ( 'may' ( 's' )? )
            // com/joestelmach/natty/generated/DateLexer.g:11:13: 'may' ( 's' )?
            {
            match("may"); 

            // com/joestelmach/natty/generated/DateLexer.g:11:19: ( 's' )?
            int alt13=2;
            switch ( input.LA(1) ) {
                case 's':
                    {
                    alt13=1;
                    }
                    break;
            }

            switch (alt13) {
                case 1 :
                    // com/joestelmach/natty/generated/DateLexer.g:11:19: 's'
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
            // com/joestelmach/natty/generated/DateLexer.g:12:11: ( 'june' ( 's' )? | 'jun' ( DOT )? )
            int alt16=2;
            switch ( input.LA(1) ) {
            case 'j':
                {
                switch ( input.LA(2) ) {
                case 'u':
                    {
                    switch ( input.LA(3) ) {
                    case 'n':
                        {
                        switch ( input.LA(4) ) {
                        case 'e':
                            {
                            alt16=1;
                            }
                            break;
                        default:
                            alt16=2;}

                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // com/joestelmach/natty/generated/DateLexer.g:12:13: 'june' ( 's' )?
                    {
                    match("june"); 

                    // com/joestelmach/natty/generated/DateLexer.g:12:20: ( 's' )?
                    int alt14=2;
                    switch ( input.LA(1) ) {
                        case 's':
                            {
                            alt14=1;
                            }
                            break;
                    }

                    switch (alt14) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:12:20: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // com/joestelmach/natty/generated/DateLexer.g:12:32: 'jun' ( DOT )?
                    {
                    match("jun"); 

                    // com/joestelmach/natty/generated/DateLexer.g:12:38: ( DOT )?
                    int alt15=2;
                    switch ( input.LA(1) ) {
                        case '.':
                            {
                            alt15=1;
                            }
                            break;
                    }

                    switch (alt15) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:12:38: DOT
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
            // com/joestelmach/natty/generated/DateLexer.g:13:11: ( 'july' ( 's' )? | 'jul' ( DOT )? )
            int alt19=2;
            switch ( input.LA(1) ) {
            case 'j':
                {
                switch ( input.LA(2) ) {
                case 'u':
                    {
                    switch ( input.LA(3) ) {
                    case 'l':
                        {
                        switch ( input.LA(4) ) {
                        case 'y':
                            {
                            alt19=1;
                            }
                            break;
                        default:
                            alt19=2;}

                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // com/joestelmach/natty/generated/DateLexer.g:13:13: 'july' ( 's' )?
                    {
                    match("july"); 

                    // com/joestelmach/natty/generated/DateLexer.g:13:20: ( 's' )?
                    int alt17=2;
                    switch ( input.LA(1) ) {
                        case 's':
                            {
                            alt17=1;
                            }
                            break;
                    }

                    switch (alt17) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:13:20: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // com/joestelmach/natty/generated/DateLexer.g:13:32: 'jul' ( DOT )?
                    {
                    match("jul"); 

                    // com/joestelmach/natty/generated/DateLexer.g:13:38: ( DOT )?
                    int alt18=2;
                    switch ( input.LA(1) ) {
                        case '.':
                            {
                            alt18=1;
                            }
                            break;
                    }

                    switch (alt18) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:13:38: DOT
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
            // com/joestelmach/natty/generated/DateLexer.g:14:11: ( 'august' ( 's' )? | 'aug' ( DOT )? )
            int alt22=2;
            switch ( input.LA(1) ) {
            case 'a':
                {
                switch ( input.LA(2) ) {
                case 'u':
                    {
                    switch ( input.LA(3) ) {
                    case 'g':
                        {
                        switch ( input.LA(4) ) {
                        case 'u':
                            {
                            alt22=1;
                            }
                            break;
                        default:
                            alt22=2;}

                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // com/joestelmach/natty/generated/DateLexer.g:14:13: 'august' ( 's' )?
                    {
                    match("august"); 

                    // com/joestelmach/natty/generated/DateLexer.g:14:22: ( 's' )?
                    int alt20=2;
                    switch ( input.LA(1) ) {
                        case 's':
                            {
                            alt20=1;
                            }
                            break;
                    }

                    switch (alt20) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:14:22: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // com/joestelmach/natty/generated/DateLexer.g:14:32: 'aug' ( DOT )?
                    {
                    match("aug"); 

                    // com/joestelmach/natty/generated/DateLexer.g:14:38: ( DOT )?
                    int alt21=2;
                    switch ( input.LA(1) ) {
                        case '.':
                            {
                            alt21=1;
                            }
                            break;
                    }

                    switch (alt21) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:14:38: DOT
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
            // com/joestelmach/natty/generated/DateLexer.g:15:11: ( 'september' ( 's' )? | 'sep' ( DOT )? | 'sept' ( DOT )? )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 's':
                {
                switch ( input.LA(2) ) {
                case 'e':
                    {
                    switch ( input.LA(3) ) {
                    case 'p':
                        {
                        switch ( input.LA(4) ) {
                        case 't':
                            {
                            switch ( input.LA(5) ) {
                            case 'e':
                                {
                                alt26=1;
                                }
                                break;
                            default:
                                alt26=3;}

                            }
                            break;
                        default:
                            alt26=2;}

                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // com/joestelmach/natty/generated/DateLexer.g:15:13: 'september' ( 's' )?
                    {
                    match("september"); 

                    // com/joestelmach/natty/generated/DateLexer.g:15:25: ( 's' )?
                    int alt23=2;
                    switch ( input.LA(1) ) {
                        case 's':
                            {
                            alt23=1;
                            }
                            break;
                    }

                    switch (alt23) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:15:25: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // com/joestelmach/natty/generated/DateLexer.g:15:32: 'sep' ( DOT )?
                    {
                    match("sep"); 

                    // com/joestelmach/natty/generated/DateLexer.g:15:38: ( DOT )?
                    int alt24=2;
                    switch ( input.LA(1) ) {
                        case '.':
                            {
                            alt24=1;
                            }
                            break;
                    }

                    switch (alt24) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:15:38: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // com/joestelmach/natty/generated/DateLexer.g:15:45: 'sept' ( DOT )?
                    {
                    match("sept"); 

                    // com/joestelmach/natty/generated/DateLexer.g:15:52: ( DOT )?
                    int alt25=2;
                    switch ( input.LA(1) ) {
                        case '.':
                            {
                            alt25=1;
                            }
                            break;
                    }

                    switch (alt25) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:15:52: DOT
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
            // com/joestelmach/natty/generated/DateLexer.g:16:11: ( 'october' ( 's' )? | 'oct' ( DOT )? )
            int alt29=2;
            switch ( input.LA(1) ) {
            case 'o':
                {
                switch ( input.LA(2) ) {
                case 'c':
                    {
                    switch ( input.LA(3) ) {
                    case 't':
                        {
                        switch ( input.LA(4) ) {
                        case 'o':
                            {
                            alt29=1;
                            }
                            break;
                        default:
                            alt29=2;}

                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // com/joestelmach/natty/generated/DateLexer.g:16:13: 'october' ( 's' )?
                    {
                    match("october"); 

                    // com/joestelmach/natty/generated/DateLexer.g:16:23: ( 's' )?
                    int alt27=2;
                    switch ( input.LA(1) ) {
                        case 's':
                            {
                            alt27=1;
                            }
                            break;
                    }

                    switch (alt27) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:16:23: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // com/joestelmach/natty/generated/DateLexer.g:16:32: 'oct' ( DOT )?
                    {
                    match("oct"); 

                    // com/joestelmach/natty/generated/DateLexer.g:16:38: ( DOT )?
                    int alt28=2;
                    switch ( input.LA(1) ) {
                        case '.':
                            {
                            alt28=1;
                            }
                            break;
                    }

                    switch (alt28) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:16:38: DOT
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
            // com/joestelmach/natty/generated/DateLexer.g:17:11: ( 'november' ( 's' )? | 'nov' ( DOT )? )
            int alt32=2;
            switch ( input.LA(1) ) {
            case 'n':
                {
                switch ( input.LA(2) ) {
                case 'o':
                    {
                    switch ( input.LA(3) ) {
                    case 'v':
                        {
                        switch ( input.LA(4) ) {
                        case 'e':
                            {
                            alt32=1;
                            }
                            break;
                        default:
                            alt32=2;}

                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // com/joestelmach/natty/generated/DateLexer.g:17:13: 'november' ( 's' )?
                    {
                    match("november"); 

                    // com/joestelmach/natty/generated/DateLexer.g:17:24: ( 's' )?
                    int alt30=2;
                    switch ( input.LA(1) ) {
                        case 's':
                            {
                            alt30=1;
                            }
                            break;
                    }

                    switch (alt30) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:17:24: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // com/joestelmach/natty/generated/DateLexer.g:17:32: 'nov' ( DOT )?
                    {
                    match("nov"); 

                    // com/joestelmach/natty/generated/DateLexer.g:17:38: ( DOT )?
                    int alt31=2;
                    switch ( input.LA(1) ) {
                        case '.':
                            {
                            alt31=1;
                            }
                            break;
                    }

                    switch (alt31) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:17:38: DOT
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
            // com/joestelmach/natty/generated/DateLexer.g:18:11: ( 'december' ( 's' )? | 'dec' ( DOT )? )
            int alt35=2;
            switch ( input.LA(1) ) {
            case 'd':
                {
                switch ( input.LA(2) ) {
                case 'e':
                    {
                    switch ( input.LA(3) ) {
                    case 'c':
                        {
                        switch ( input.LA(4) ) {
                        case 'e':
                            {
                            alt35=1;
                            }
                            break;
                        default:
                            alt35=2;}

                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // com/joestelmach/natty/generated/DateLexer.g:18:13: 'december' ( 's' )?
                    {
                    match("december"); 

                    // com/joestelmach/natty/generated/DateLexer.g:18:24: ( 's' )?
                    int alt33=2;
                    switch ( input.LA(1) ) {
                        case 's':
                            {
                            alt33=1;
                            }
                            break;
                    }

                    switch (alt33) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:18:24: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // com/joestelmach/natty/generated/DateLexer.g:18:32: 'dec' ( DOT )?
                    {
                    match("dec"); 

                    // com/joestelmach/natty/generated/DateLexer.g:18:38: ( DOT )?
                    int alt34=2;
                    switch ( input.LA(1) ) {
                        case '.':
                            {
                            alt34=1;
                            }
                            break;
                    }

                    switch (alt34) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:18:38: DOT
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
            // com/joestelmach/natty/generated/DateLexer.g:20:11: ( 'sunday' ( 's' )? | 'sun' ( DOT )? | 'suns' ( DOT )? )
            int alt39=3;
            switch ( input.LA(1) ) {
            case 's':
                {
                switch ( input.LA(2) ) {
                case 'u':
                    {
                    switch ( input.LA(3) ) {
                    case 'n':
                        {
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
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 1, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // com/joestelmach/natty/generated/DateLexer.g:20:13: 'sunday' ( 's' )?
                    {
                    match("sunday"); 

                    // com/joestelmach/natty/generated/DateLexer.g:20:22: ( 's' )?
                    int alt36=2;
                    switch ( input.LA(1) ) {
                        case 's':
                            {
                            alt36=1;
                            }
                            break;
                    }

                    switch (alt36) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:20:22: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // com/joestelmach/natty/generated/DateLexer.g:20:32: 'sun' ( DOT )?
                    {
                    match("sun"); 

                    // com/joestelmach/natty/generated/DateLexer.g:20:38: ( DOT )?
                    int alt37=2;
                    switch ( input.LA(1) ) {
                        case '.':
                            {
                            alt37=1;
                            }
                            break;
                    }

                    switch (alt37) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:20:38: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // com/joestelmach/natty/generated/DateLexer.g:20:46: 'suns' ( DOT )?
                    {
                    match("suns"); 

                    // com/joestelmach/natty/generated/DateLexer.g:20:53: ( DOT )?
                    int alt38=2;
                    switch ( input.LA(1) ) {
                        case '.':
                            {
                            alt38=1;
                            }
                            break;
                    }

                    switch (alt38) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:20:53: DOT
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
            // com/joestelmach/natty/generated/DateLexer.g:21:11: ( 'monday' ( 's' )? | 'mon' ( DOT )? | 'mons' ( DOT )? )
            int alt43=3;
            switch ( input.LA(1) ) {
            case 'm':
                {
                switch ( input.LA(2) ) {
                case 'o':
                    {
                    switch ( input.LA(3) ) {
                    case 'n':
                        {
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
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 1, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // com/joestelmach/natty/generated/DateLexer.g:21:13: 'monday' ( 's' )?
                    {
                    match("monday"); 

                    // com/joestelmach/natty/generated/DateLexer.g:21:22: ( 's' )?
                    int alt40=2;
                    switch ( input.LA(1) ) {
                        case 's':
                            {
                            alt40=1;
                            }
                            break;
                    }

                    switch (alt40) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:21:22: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // com/joestelmach/natty/generated/DateLexer.g:21:32: 'mon' ( DOT )?
                    {
                    match("mon"); 

                    // com/joestelmach/natty/generated/DateLexer.g:21:38: ( DOT )?
                    int alt41=2;
                    switch ( input.LA(1) ) {
                        case '.':
                            {
                            alt41=1;
                            }
                            break;
                    }

                    switch (alt41) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:21:38: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // com/joestelmach/natty/generated/DateLexer.g:21:46: 'mons' ( DOT )?
                    {
                    match("mons"); 

                    // com/joestelmach/natty/generated/DateLexer.g:21:53: ( DOT )?
                    int alt42=2;
                    switch ( input.LA(1) ) {
                        case '.':
                            {
                            alt42=1;
                            }
                            break;
                    }

                    switch (alt42) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:21:53: DOT
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
            // com/joestelmach/natty/generated/DateLexer.g:22:11: ( 'tuesday' ( 's' )? | 'tues' ( DOT )? | 'tue' ( DOT )? )
            int alt47=3;
            switch ( input.LA(1) ) {
            case 't':
                {
                switch ( input.LA(2) ) {
                case 'u':
                    {
                    switch ( input.LA(3) ) {
                    case 'e':
                        {
                        switch ( input.LA(4) ) {
                        case 's':
                            {
                            switch ( input.LA(5) ) {
                            case 'd':
                                {
                                alt47=1;
                                }
                                break;
                            default:
                                alt47=2;}

                            }
                            break;
                        default:
                            alt47=3;}

                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // com/joestelmach/natty/generated/DateLexer.g:22:13: 'tuesday' ( 's' )?
                    {
                    match("tuesday"); 

                    // com/joestelmach/natty/generated/DateLexer.g:22:23: ( 's' )?
                    int alt44=2;
                    switch ( input.LA(1) ) {
                        case 's':
                            {
                            alt44=1;
                            }
                            break;
                    }

                    switch (alt44) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:22:23: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // com/joestelmach/natty/generated/DateLexer.g:22:32: 'tues' ( DOT )?
                    {
                    match("tues"); 

                    // com/joestelmach/natty/generated/DateLexer.g:22:39: ( DOT )?
                    int alt45=2;
                    switch ( input.LA(1) ) {
                        case '.':
                            {
                            alt45=1;
                            }
                            break;
                    }

                    switch (alt45) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:22:39: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // com/joestelmach/natty/generated/DateLexer.g:22:46: 'tue' ( DOT )?
                    {
                    match("tue"); 

                    // com/joestelmach/natty/generated/DateLexer.g:22:52: ( DOT )?
                    int alt46=2;
                    switch ( input.LA(1) ) {
                        case '.':
                            {
                            alt46=1;
                            }
                            break;
                    }

                    switch (alt46) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:22:52: DOT
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
            // com/joestelmach/natty/generated/DateLexer.g:23:11: ( 'wednesday' ( 's' )? | 'wed' ( DOT )? | 'weds' ( DOT )? )
            int alt51=3;
            switch ( input.LA(1) ) {
            case 'w':
                {
                switch ( input.LA(2) ) {
                case 'e':
                    {
                    switch ( input.LA(3) ) {
                    case 'd':
                        {
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
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // com/joestelmach/natty/generated/DateLexer.g:23:13: 'wednesday' ( 's' )?
                    {
                    match("wednesday"); 

                    // com/joestelmach/natty/generated/DateLexer.g:23:25: ( 's' )?
                    int alt48=2;
                    switch ( input.LA(1) ) {
                        case 's':
                            {
                            alt48=1;
                            }
                            break;
                    }

                    switch (alt48) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:23:25: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // com/joestelmach/natty/generated/DateLexer.g:23:32: 'wed' ( DOT )?
                    {
                    match("wed"); 

                    // com/joestelmach/natty/generated/DateLexer.g:23:38: ( DOT )?
                    int alt49=2;
                    switch ( input.LA(1) ) {
                        case '.':
                            {
                            alt49=1;
                            }
                            break;
                    }

                    switch (alt49) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:23:38: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // com/joestelmach/natty/generated/DateLexer.g:23:46: 'weds' ( DOT )?
                    {
                    match("weds"); 

                    // com/joestelmach/natty/generated/DateLexer.g:23:53: ( DOT )?
                    int alt50=2;
                    switch ( input.LA(1) ) {
                        case '.':
                            {
                            alt50=1;
                            }
                            break;
                    }

                    switch (alt50) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:23:53: DOT
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
            // com/joestelmach/natty/generated/DateLexer.g:24:11: ( 'thursday' ( 's' )? | 'thur' ( DOT )? | 'thu' ( DOT )? | 'thus' ( DOT )? | 'thurs' ( DOT )? )
            int alt57=5;
            alt57 = dfa57.predict(input);
            switch (alt57) {
                case 1 :
                    // com/joestelmach/natty/generated/DateLexer.g:24:13: 'thursday' ( 's' )?
                    {
                    match("thursday"); 

                    // com/joestelmach/natty/generated/DateLexer.g:24:24: ( 's' )?
                    int alt52=2;
                    switch ( input.LA(1) ) {
                        case 's':
                            {
                            alt52=1;
                            }
                            break;
                    }

                    switch (alt52) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:24:24: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // com/joestelmach/natty/generated/DateLexer.g:24:32: 'thur' ( DOT )?
                    {
                    match("thur"); 

                    // com/joestelmach/natty/generated/DateLexer.g:24:39: ( DOT )?
                    int alt53=2;
                    switch ( input.LA(1) ) {
                        case '.':
                            {
                            alt53=1;
                            }
                            break;
                    }

                    switch (alt53) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:24:39: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // com/joestelmach/natty/generated/DateLexer.g:24:46: 'thu' ( DOT )?
                    {
                    match("thu"); 

                    // com/joestelmach/natty/generated/DateLexer.g:24:52: ( DOT )?
                    int alt54=2;
                    switch ( input.LA(1) ) {
                        case '.':
                            {
                            alt54=1;
                            }
                            break;
                    }

                    switch (alt54) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:24:52: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // com/joestelmach/natty/generated/DateLexer.g:24:61: 'thus' ( DOT )?
                    {
                    match("thus"); 

                    // com/joestelmach/natty/generated/DateLexer.g:24:68: ( DOT )?
                    int alt55=2;
                    switch ( input.LA(1) ) {
                        case '.':
                            {
                            alt55=1;
                            }
                            break;
                    }

                    switch (alt55) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:24:68: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // com/joestelmach/natty/generated/DateLexer.g:24:75: 'thurs' ( DOT )?
                    {
                    match("thurs"); 

                    // com/joestelmach/natty/generated/DateLexer.g:24:83: ( DOT )?
                    int alt56=2;
                    switch ( input.LA(1) ) {
                        case '.':
                            {
                            alt56=1;
                            }
                            break;
                    }

                    switch (alt56) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:24:83: DOT
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
            // com/joestelmach/natty/generated/DateLexer.g:25:11: ( 'friday' ( 's' )? | 'fri' ( DOT )? | 'fris' ( DOT )? )
            int alt61=3;
            switch ( input.LA(1) ) {
            case 'f':
                {
                switch ( input.LA(2) ) {
                case 'r':
                    {
                    switch ( input.LA(3) ) {
                    case 'i':
                        {
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
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 61, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 1, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // com/joestelmach/natty/generated/DateLexer.g:25:13: 'friday' ( 's' )?
                    {
                    match("friday"); 

                    // com/joestelmach/natty/generated/DateLexer.g:25:22: ( 's' )?
                    int alt58=2;
                    switch ( input.LA(1) ) {
                        case 's':
                            {
                            alt58=1;
                            }
                            break;
                    }

                    switch (alt58) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:25:22: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // com/joestelmach/natty/generated/DateLexer.g:25:32: 'fri' ( DOT )?
                    {
                    match("fri"); 

                    // com/joestelmach/natty/generated/DateLexer.g:25:38: ( DOT )?
                    int alt59=2;
                    switch ( input.LA(1) ) {
                        case '.':
                            {
                            alt59=1;
                            }
                            break;
                    }

                    switch (alt59) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:25:38: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // com/joestelmach/natty/generated/DateLexer.g:25:46: 'fris' ( DOT )?
                    {
                    match("fris"); 

                    // com/joestelmach/natty/generated/DateLexer.g:25:53: ( DOT )?
                    int alt60=2;
                    switch ( input.LA(1) ) {
                        case '.':
                            {
                            alt60=1;
                            }
                            break;
                    }

                    switch (alt60) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:25:53: DOT
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
            // com/joestelmach/natty/generated/DateLexer.g:26:11: ( 'saturday' ( 's' )? | 'sat' ( DOT )? | 'sats' ( DOT )? | 'weekend' )
            int alt65=4;
            switch ( input.LA(1) ) {
            case 's':
                {
                switch ( input.LA(2) ) {
                case 'a':
                    {
                    switch ( input.LA(3) ) {
                    case 't':
                        {
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
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 65, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 1, input);

                    throw nvae;
                }

                }
                break;
            case 'w':
                {
                alt65=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // com/joestelmach/natty/generated/DateLexer.g:26:13: 'saturday' ( 's' )?
                    {
                    match("saturday"); 

                    // com/joestelmach/natty/generated/DateLexer.g:26:24: ( 's' )?
                    int alt62=2;
                    switch ( input.LA(1) ) {
                        case 's':
                            {
                            alt62=1;
                            }
                            break;
                    }

                    switch (alt62) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:26:24: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // com/joestelmach/natty/generated/DateLexer.g:26:32: 'sat' ( DOT )?
                    {
                    match("sat"); 

                    // com/joestelmach/natty/generated/DateLexer.g:26:38: ( DOT )?
                    int alt63=2;
                    switch ( input.LA(1) ) {
                        case '.':
                            {
                            alt63=1;
                            }
                            break;
                    }

                    switch (alt63) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:26:38: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // com/joestelmach/natty/generated/DateLexer.g:26:46: 'sats' ( DOT )?
                    {
                    match("sats"); 

                    // com/joestelmach/natty/generated/DateLexer.g:26:53: ( DOT )?
                    int alt64=2;
                    switch ( input.LA(1) ) {
                        case '.':
                            {
                            alt64=1;
                            }
                            break;
                    }

                    switch (alt64) {
                        case 1 :
                            // com/joestelmach/natty/generated/DateLexer.g:26:53: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // com/joestelmach/natty/generated/DateLexer.g:26:61: 'weekend'
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
            // com/joestelmach/natty/generated/DateLexer.g:28:7: ( 'hour' | 'hours' )
            int alt66=2;
            switch ( input.LA(1) ) {
            case 'h':
                {
                switch ( input.LA(2) ) {
                case 'o':
                    {
                    switch ( input.LA(3) ) {
                    case 'u':
                        {
                        switch ( input.LA(4) ) {
                        case 'r':
                            {
                            switch ( input.LA(5) ) {
                            case 's':
                                {
                                alt66=2;
                                }
                                break;
                            default:
                                alt66=1;}

                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 66, 3, input);

                            throw nvae;
                        }

                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 66, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 66, 1, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // com/joestelmach/natty/generated/DateLexer.g:28:9: 'hour'
                    {
                    match("hour"); 


                    }
                    break;
                case 2 :
                    // com/joestelmach/natty/generated/DateLexer.g:28:19: 'hours'
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
            // com/joestelmach/natty/generated/DateLexer.g:29:7: ( 'day' | 'days' )
            int alt67=2;
            switch ( input.LA(1) ) {
            case 'd':
                {
                switch ( input.LA(2) ) {
                case 'a':
                    {
                    switch ( input.LA(3) ) {
                    case 'y':
                        {
                        switch ( input.LA(4) ) {
                        case 's':
                            {
                            alt67=2;
                            }
                            break;
                        default:
                            alt67=1;}

                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 67, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 1, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // com/joestelmach/natty/generated/DateLexer.g:29:9: 'day'
                    {
                    match("day"); 


                    }
                    break;
                case 2 :
                    // com/joestelmach/natty/generated/DateLexer.g:29:19: 'days'
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
            // com/joestelmach/natty/generated/DateLexer.g:30:7: ( 'week' | 'weeks' )
            int alt68=2;
            switch ( input.LA(1) ) {
            case 'w':
                {
                switch ( input.LA(2) ) {
                case 'e':
                    {
                    switch ( input.LA(3) ) {
                    case 'e':
                        {
                        switch ( input.LA(4) ) {
                        case 'k':
                            {
                            switch ( input.LA(5) ) {
                            case 's':
                                {
                                alt68=2;
                                }
                                break;
                            default:
                                alt68=1;}

                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 68, 3, input);

                            throw nvae;
                        }

                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 68, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 1, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // com/joestelmach/natty/generated/DateLexer.g:30:9: 'week'
                    {
                    match("week"); 


                    }
                    break;
                case 2 :
                    // com/joestelmach/natty/generated/DateLexer.g:30:19: 'weeks'
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
            // com/joestelmach/natty/generated/DateLexer.g:31:7: ( 'month' | 'months' )
            int alt69=2;
            switch ( input.LA(1) ) {
            case 'm':
                {
                switch ( input.LA(2) ) {
                case 'o':
                    {
                    switch ( input.LA(3) ) {
                    case 'n':
                        {
                        switch ( input.LA(4) ) {
                        case 't':
                            {
                            switch ( input.LA(5) ) {
                            case 'h':
                                {
                                switch ( input.LA(6) ) {
                                case 's':
                                    {
                                    alt69=2;
                                    }
                                    break;
                                default:
                                    alt69=1;}

                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 69, 4, input);

                                throw nvae;
                            }

                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 69, 3, input);

                            throw nvae;
                        }

                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 69, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 1, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // com/joestelmach/natty/generated/DateLexer.g:31:9: 'month'
                    {
                    match("month"); 


                    }
                    break;
                case 2 :
                    // com/joestelmach/natty/generated/DateLexer.g:31:19: 'months'
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
            // com/joestelmach/natty/generated/DateLexer.g:32:7: ( 'year' | 'years' )
            int alt70=2;
            switch ( input.LA(1) ) {
            case 'y':
                {
                switch ( input.LA(2) ) {
                case 'e':
                    {
                    switch ( input.LA(3) ) {
                    case 'a':
                        {
                        switch ( input.LA(4) ) {
                        case 'r':
                            {
                            switch ( input.LA(5) ) {
                            case 's':
                                {
                                alt70=2;
                                }
                                break;
                            default:
                                alt70=1;}

                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 70, 3, input);

                            throw nvae;
                        }

                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 70, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 70, 1, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // com/joestelmach/natty/generated/DateLexer.g:32:9: 'year'
                    {
                    match("year"); 


                    }
                    break;
                case 2 :
                    // com/joestelmach/natty/generated/DateLexer.g:32:19: 'years'
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
            // com/joestelmach/natty/generated/DateLexer.g:34:11: ( 'today' )
            // com/joestelmach/natty/generated/DateLexer.g:34:13: 'today'
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
            // com/joestelmach/natty/generated/DateLexer.g:35:11: ( 'tomorow' | 'tomorrow' | 'tommorow' | 'tommorrow' )
            int alt71=4;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // com/joestelmach/natty/generated/DateLexer.g:35:13: 'tomorow'
                    {
                    match("tomorow"); 


                    }
                    break;
                case 2 :
                    // com/joestelmach/natty/generated/DateLexer.g:35:27: 'tomorrow'
                    {
                    match("tomorrow"); 


                    }
                    break;
                case 3 :
                    // com/joestelmach/natty/generated/DateLexer.g:35:42: 'tommorow'
                    {
                    match("tommorow"); 


                    }
                    break;
                case 4 :
                    // com/joestelmach/natty/generated/DateLexer.g:35:55: 'tommorrow'
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
            // com/joestelmach/natty/generated/DateLexer.g:36:11: ( 'yesterday' )
            // com/joestelmach/natty/generated/DateLexer.g:36:13: 'yesterday'
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
            // com/joestelmach/natty/generated/DateLexer.g:40:4: ( 'am' | 'a.m.' | 'a' )
            int alt72=3;
            switch ( input.LA(1) ) {
            case 'a':
                {
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
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // com/joestelmach/natty/generated/DateLexer.g:40:6: 'am'
                    {
                    match("am"); 


                    }
                    break;
                case 2 :
                    // com/joestelmach/natty/generated/DateLexer.g:40:13: 'a.m.'
                    {
                    match("a.m."); 


                    }
                    break;
                case 3 :
                    // com/joestelmach/natty/generated/DateLexer.g:40:22: 'a'
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
            // com/joestelmach/natty/generated/DateLexer.g:41:4: ( 'pm' | 'p.m.' | 'p' )
            int alt73=3;
            switch ( input.LA(1) ) {
            case 'p':
                {
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
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // com/joestelmach/natty/generated/DateLexer.g:41:6: 'pm'
                    {
                    match("pm"); 


                    }
                    break;
                case 2 :
                    // com/joestelmach/natty/generated/DateLexer.g:41:13: 'p.m.'
                    {
                    match("p.m."); 


                    }
                    break;
                case 3 :
                    // com/joestelmach/natty/generated/DateLexer.g:41:22: 'p'
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
            // com/joestelmach/natty/generated/DateLexer.g:42:4: ( 't' )
            // com/joestelmach/natty/generated/DateLexer.g:42:6: 't'
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
            // com/joestelmach/natty/generated/DateLexer.g:44:22: ( 'h' )
            // com/joestelmach/natty/generated/DateLexer.g:44:24: 'h'
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
            // com/joestelmach/natty/generated/DateLexer.g:46:10: ( 'midnight' | 'mid-night' )
            int alt74=2;
            switch ( input.LA(1) ) {
            case 'm':
                {
                switch ( input.LA(2) ) {
                case 'i':
                    {
                    switch ( input.LA(3) ) {
                    case 'd':
                        {
                        switch ( input.LA(4) ) {
                        case 'n':
                            {
                            alt74=1;
                            }
                            break;
                        case '-':
                            {
                            alt74=2;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 74, 3, input);

                            throw nvae;
                        }

                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 74, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 74, 1, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // com/joestelmach/natty/generated/DateLexer.g:46:12: 'midnight'
                    {
                    match("midnight"); 


                    }
                    break;
                case 2 :
                    // com/joestelmach/natty/generated/DateLexer.g:46:25: 'mid-night'
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
            // com/joestelmach/natty/generated/DateLexer.g:47:10: ( 'noon' | 'afternoon' | 'after-noon' )
            int alt75=3;
            switch ( input.LA(1) ) {
            case 'n':
                {
                alt75=1;
                }
                break;
            case 'a':
                {
                switch ( input.LA(2) ) {
                case 'f':
                    {
                    switch ( input.LA(3) ) {
                    case 't':
                        {
                        switch ( input.LA(4) ) {
                        case 'e':
                            {
                            switch ( input.LA(5) ) {
                            case 'r':
                                {
                                switch ( input.LA(6) ) {
                                case 'n':
                                    {
                                    alt75=2;
                                    }
                                    break;
                                case '-':
                                    {
                                    alt75=3;
                                    }
                                    break;
                                default:
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 75, 6, input);

                                    throw nvae;
                                }

                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 75, 5, input);

                                throw nvae;
                            }

                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 75, 4, input);

                            throw nvae;
                        }

                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 75, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 75, 2, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // com/joestelmach/natty/generated/DateLexer.g:47:12: 'noon'
                    {
                    match("noon"); 


                    }
                    break;
                case 2 :
                    // com/joestelmach/natty/generated/DateLexer.g:47:25: 'afternoon'
                    {
                    match("afternoon"); 


                    }
                    break;
                case 3 :
                    // com/joestelmach/natty/generated/DateLexer.g:47:39: 'after-noon'
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
            // com/joestelmach/natty/generated/DateLexer.g:48:10: ( 'morning' )
            // com/joestelmach/natty/generated/DateLexer.g:48:12: 'morning'
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
            // com/joestelmach/natty/generated/DateLexer.g:49:10: ( 'night' )
            // com/joestelmach/natty/generated/DateLexer.g:49:12: 'night'
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
            // com/joestelmach/natty/generated/DateLexer.g:51:6: ( 'utc' | 'gmt' | 'z' )
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
                    // com/joestelmach/natty/generated/DateLexer.g:51:8: 'utc'
                    {
                    match("utc"); 


                    }
                    break;
                case 2 :
                    // com/joestelmach/natty/generated/DateLexer.g:51:17: 'gmt'
                    {
                    match("gmt"); 


                    }
                    break;
                case 3 :
                    // com/joestelmach/natty/generated/DateLexer.g:51:26: 'z'
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
            // com/joestelmach/natty/generated/DateLexer.g:52:6: ( 'est' | 'edt' | 'et' )
            int alt77=3;
            switch ( input.LA(1) ) {
            case 'e':
                {
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
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // com/joestelmach/natty/generated/DateLexer.g:52:8: 'est'
                    {
                    match("est"); 


                    }
                    break;
                case 2 :
                    // com/joestelmach/natty/generated/DateLexer.g:52:17: 'edt'
                    {
                    match("edt"); 


                    }
                    break;
                case 3 :
                    // com/joestelmach/natty/generated/DateLexer.g:52:26: 'et'
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
            // com/joestelmach/natty/generated/DateLexer.g:53:6: ( 'pst' | 'pdt' | 'pt' )
            int alt78=3;
            switch ( input.LA(1) ) {
            case 'p':
                {
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
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // com/joestelmach/natty/generated/DateLexer.g:53:8: 'pst'
                    {
                    match("pst"); 


                    }
                    break;
                case 2 :
                    // com/joestelmach/natty/generated/DateLexer.g:53:17: 'pdt'
                    {
                    match("pdt"); 


                    }
                    break;
                case 3 :
                    // com/joestelmach/natty/generated/DateLexer.g:53:26: 'pt'
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
            // com/joestelmach/natty/generated/DateLexer.g:54:6: ( 'cst' | 'cdt' | 'ct' )
            int alt79=3;
            switch ( input.LA(1) ) {
            case 'c':
                {
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
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // com/joestelmach/natty/generated/DateLexer.g:54:8: 'cst'
                    {
                    match("cst"); 


                    }
                    break;
                case 2 :
                    // com/joestelmach/natty/generated/DateLexer.g:54:17: 'cdt'
                    {
                    match("cdt"); 


                    }
                    break;
                case 3 :
                    // com/joestelmach/natty/generated/DateLexer.g:54:26: 'ct'
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
            // com/joestelmach/natty/generated/DateLexer.g:55:6: ( 'mst' | 'mdt' | 'mt' )
            int alt80=3;
            switch ( input.LA(1) ) {
            case 'm':
                {
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
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // com/joestelmach/natty/generated/DateLexer.g:55:8: 'mst'
                    {
                    match("mst"); 


                    }
                    break;
                case 2 :
                    // com/joestelmach/natty/generated/DateLexer.g:55:17: 'mdt'
                    {
                    match("mdt"); 


                    }
                    break;
                case 3 :
                    // com/joestelmach/natty/generated/DateLexer.g:55:26: 'mt'
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
            // com/joestelmach/natty/generated/DateLexer.g:56:6: ( 'akst' | 'akdt' | 'akt' )
            int alt81=3;
            switch ( input.LA(1) ) {
            case 'a':
                {
                switch ( input.LA(2) ) {
                case 'k':
                    {
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
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 81, 1, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // com/joestelmach/natty/generated/DateLexer.g:56:8: 'akst'
                    {
                    match("akst"); 


                    }
                    break;
                case 2 :
                    // com/joestelmach/natty/generated/DateLexer.g:56:17: 'akdt'
                    {
                    match("akdt"); 


                    }
                    break;
                case 3 :
                    // com/joestelmach/natty/generated/DateLexer.g:56:26: 'akt'
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
            // com/joestelmach/natty/generated/DateLexer.g:57:6: ( 'hast' | 'hadt' | 'hat' | 'hst' )
            int alt82=4;
            switch ( input.LA(1) ) {
            case 'h':
                {
                switch ( input.LA(2) ) {
                case 'a':
                    {
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
                    break;
                case 's':
                    {
                    alt82=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 82, 1, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // com/joestelmach/natty/generated/DateLexer.g:57:8: 'hast'
                    {
                    match("hast"); 


                    }
                    break;
                case 2 :
                    // com/joestelmach/natty/generated/DateLexer.g:57:17: 'hadt'
                    {
                    match("hadt"); 


                    }
                    break;
                case 3 :
                    // com/joestelmach/natty/generated/DateLexer.g:57:26: 'hat'
                    {
                    match("hat"); 


                    }
                    break;
                case 4 :
                    // com/joestelmach/natty/generated/DateLexer.g:57:34: 'hst'
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
            // com/joestelmach/natty/generated/DateLexer.g:61:8: ( '00' )
            // com/joestelmach/natty/generated/DateLexer.g:61:10: '00'
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
            // com/joestelmach/natty/generated/DateLexer.g:62:8: ( '01' )
            // com/joestelmach/natty/generated/DateLexer.g:62:10: '01'
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
            // com/joestelmach/natty/generated/DateLexer.g:63:8: ( '02' )
            // com/joestelmach/natty/generated/DateLexer.g:63:10: '02'
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
            // com/joestelmach/natty/generated/DateLexer.g:64:8: ( '03' )
            // com/joestelmach/natty/generated/DateLexer.g:64:10: '03'
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
            // com/joestelmach/natty/generated/DateLexer.g:65:8: ( '04' )
            // com/joestelmach/natty/generated/DateLexer.g:65:10: '04'
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
            // com/joestelmach/natty/generated/DateLexer.g:66:8: ( '05' )
            // com/joestelmach/natty/generated/DateLexer.g:66:10: '05'
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
            // com/joestelmach/natty/generated/DateLexer.g:67:8: ( '06' )
            // com/joestelmach/natty/generated/DateLexer.g:67:10: '06'
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
            // com/joestelmach/natty/generated/DateLexer.g:68:8: ( '07' )
            // com/joestelmach/natty/generated/DateLexer.g:68:10: '07'
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
            // com/joestelmach/natty/generated/DateLexer.g:69:8: ( '08' )
            // com/joestelmach/natty/generated/DateLexer.g:69:10: '08'
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
            // com/joestelmach/natty/generated/DateLexer.g:70:8: ( '09' )
            // com/joestelmach/natty/generated/DateLexer.g:70:10: '09'
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
            // com/joestelmach/natty/generated/DateLexer.g:71:8: ( '0' )
            // com/joestelmach/natty/generated/DateLexer.g:71:10: '0'
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
            // com/joestelmach/natty/generated/DateLexer.g:72:8: ( '1' )
            // com/joestelmach/natty/generated/DateLexer.g:72:10: '1'
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
            // com/joestelmach/natty/generated/DateLexer.g:73:8: ( '2' )
            // com/joestelmach/natty/generated/DateLexer.g:73:10: '2'
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
            // com/joestelmach/natty/generated/DateLexer.g:74:8: ( '3' )
            // com/joestelmach/natty/generated/DateLexer.g:74:10: '3'
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
            // com/joestelmach/natty/generated/DateLexer.g:75:8: ( '4' )
            // com/joestelmach/natty/generated/DateLexer.g:75:10: '4'
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
            // com/joestelmach/natty/generated/DateLexer.g:76:8: ( '5' )
            // com/joestelmach/natty/generated/DateLexer.g:76:10: '5'
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
            // com/joestelmach/natty/generated/DateLexer.g:77:8: ( '6' )
            // com/joestelmach/natty/generated/DateLexer.g:77:10: '6'
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
            // com/joestelmach/natty/generated/DateLexer.g:78:8: ( '7' )
            // com/joestelmach/natty/generated/DateLexer.g:78:10: '7'
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
            // com/joestelmach/natty/generated/DateLexer.g:79:8: ( '8' )
            // com/joestelmach/natty/generated/DateLexer.g:79:10: '8'
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
            // com/joestelmach/natty/generated/DateLexer.g:80:8: ( '9' )
            // com/joestelmach/natty/generated/DateLexer.g:80:10: '9'
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
            // com/joestelmach/natty/generated/DateLexer.g:81:8: ( '10' )
            // com/joestelmach/natty/generated/DateLexer.g:81:10: '10'
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
            // com/joestelmach/natty/generated/DateLexer.g:82:8: ( '11' )
            // com/joestelmach/natty/generated/DateLexer.g:82:10: '11'
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
            // com/joestelmach/natty/generated/DateLexer.g:83:8: ( '12' )
            // com/joestelmach/natty/generated/DateLexer.g:83:10: '12'
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
            // com/joestelmach/natty/generated/DateLexer.g:84:8: ( '13' )
            // com/joestelmach/natty/generated/DateLexer.g:84:10: '13'
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
            // com/joestelmach/natty/generated/DateLexer.g:85:8: ( '14' )
            // com/joestelmach/natty/generated/DateLexer.g:85:10: '14'
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
            // com/joestelmach/natty/generated/DateLexer.g:86:8: ( '15' )
            // com/joestelmach/natty/generated/DateLexer.g:86:10: '15'
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
            // com/joestelmach/natty/generated/DateLexer.g:87:8: ( '16' )
            // com/joestelmach/natty/generated/DateLexer.g:87:10: '16'
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
            // com/joestelmach/natty/generated/DateLexer.g:88:8: ( '17' )
            // com/joestelmach/natty/generated/DateLexer.g:88:10: '17'
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
            // com/joestelmach/natty/generated/DateLexer.g:89:8: ( '18' )
            // com/joestelmach/natty/generated/DateLexer.g:89:10: '18'
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
            // com/joestelmach/natty/generated/DateLexer.g:90:8: ( '19' )
            // com/joestelmach/natty/generated/DateLexer.g:90:10: '19'
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
            // com/joestelmach/natty/generated/DateLexer.g:91:8: ( '20' )
            // com/joestelmach/natty/generated/DateLexer.g:91:10: '20'
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
            // com/joestelmach/natty/generated/DateLexer.g:92:8: ( '21' )
            // com/joestelmach/natty/generated/DateLexer.g:92:10: '21'
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
            // com/joestelmach/natty/generated/DateLexer.g:93:8: ( '22' )
            // com/joestelmach/natty/generated/DateLexer.g:93:10: '22'
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
            // com/joestelmach/natty/generated/DateLexer.g:94:8: ( '23' )
            // com/joestelmach/natty/generated/DateLexer.g:94:10: '23'
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
            // com/joestelmach/natty/generated/DateLexer.g:95:8: ( '24' )
            // com/joestelmach/natty/generated/DateLexer.g:95:10: '24'
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
            // com/joestelmach/natty/generated/DateLexer.g:96:8: ( '25' )
            // com/joestelmach/natty/generated/DateLexer.g:96:10: '25'
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
            // com/joestelmach/natty/generated/DateLexer.g:97:8: ( '26' )
            // com/joestelmach/natty/generated/DateLexer.g:97:10: '26'
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
            // com/joestelmach/natty/generated/DateLexer.g:98:8: ( '27' )
            // com/joestelmach/natty/generated/DateLexer.g:98:10: '27'
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
            // com/joestelmach/natty/generated/DateLexer.g:99:8: ( '28' )
            // com/joestelmach/natty/generated/DateLexer.g:99:10: '28'
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
            // com/joestelmach/natty/generated/DateLexer.g:100:8: ( '29' )
            // com/joestelmach/natty/generated/DateLexer.g:100:10: '29'
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
            // com/joestelmach/natty/generated/DateLexer.g:101:8: ( '30' )
            // com/joestelmach/natty/generated/DateLexer.g:101:10: '30'
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
            // com/joestelmach/natty/generated/DateLexer.g:102:8: ( '31' )
            // com/joestelmach/natty/generated/DateLexer.g:102:10: '31'
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
            // com/joestelmach/natty/generated/DateLexer.g:103:8: ( '32' )
            // com/joestelmach/natty/generated/DateLexer.g:103:10: '32'
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
            // com/joestelmach/natty/generated/DateLexer.g:104:8: ( '33' )
            // com/joestelmach/natty/generated/DateLexer.g:104:10: '33'
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
            // com/joestelmach/natty/generated/DateLexer.g:105:8: ( '34' )
            // com/joestelmach/natty/generated/DateLexer.g:105:10: '34'
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
            // com/joestelmach/natty/generated/DateLexer.g:106:8: ( '35' )
            // com/joestelmach/natty/generated/DateLexer.g:106:10: '35'
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
            // com/joestelmach/natty/generated/DateLexer.g:107:8: ( '36' )
            // com/joestelmach/natty/generated/DateLexer.g:107:10: '36'
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
            // com/joestelmach/natty/generated/DateLexer.g:108:8: ( '37' )
            // com/joestelmach/natty/generated/DateLexer.g:108:10: '37'
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
            // com/joestelmach/natty/generated/DateLexer.g:109:8: ( '38' )
            // com/joestelmach/natty/generated/DateLexer.g:109:10: '38'
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
            // com/joestelmach/natty/generated/DateLexer.g:110:8: ( '39' )
            // com/joestelmach/natty/generated/DateLexer.g:110:10: '39'
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
            // com/joestelmach/natty/generated/DateLexer.g:111:8: ( '40' )
            // com/joestelmach/natty/generated/DateLexer.g:111:10: '40'
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
            // com/joestelmach/natty/generated/DateLexer.g:112:8: ( '41' )
            // com/joestelmach/natty/generated/DateLexer.g:112:10: '41'
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
            // com/joestelmach/natty/generated/DateLexer.g:113:8: ( '42' )
            // com/joestelmach/natty/generated/DateLexer.g:113:10: '42'
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
            // com/joestelmach/natty/generated/DateLexer.g:114:8: ( '43' )
            // com/joestelmach/natty/generated/DateLexer.g:114:10: '43'
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
            // com/joestelmach/natty/generated/DateLexer.g:115:8: ( '44' )
            // com/joestelmach/natty/generated/DateLexer.g:115:10: '44'
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
            // com/joestelmach/natty/generated/DateLexer.g:116:8: ( '45' )
            // com/joestelmach/natty/generated/DateLexer.g:116:10: '45'
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
            // com/joestelmach/natty/generated/DateLexer.g:117:8: ( '46' )
            // com/joestelmach/natty/generated/DateLexer.g:117:10: '46'
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
            // com/joestelmach/natty/generated/DateLexer.g:118:8: ( '47' )
            // com/joestelmach/natty/generated/DateLexer.g:118:10: '47'
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
            // com/joestelmach/natty/generated/DateLexer.g:119:8: ( '48' )
            // com/joestelmach/natty/generated/DateLexer.g:119:10: '48'
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
            // com/joestelmach/natty/generated/DateLexer.g:120:8: ( '49' )
            // com/joestelmach/natty/generated/DateLexer.g:120:10: '49'
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
            // com/joestelmach/natty/generated/DateLexer.g:121:8: ( '50' )
            // com/joestelmach/natty/generated/DateLexer.g:121:10: '50'
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
            // com/joestelmach/natty/generated/DateLexer.g:122:8: ( '51' )
            // com/joestelmach/natty/generated/DateLexer.g:122:10: '51'
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
            // com/joestelmach/natty/generated/DateLexer.g:123:8: ( '52' )
            // com/joestelmach/natty/generated/DateLexer.g:123:10: '52'
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
            // com/joestelmach/natty/generated/DateLexer.g:124:8: ( '53' )
            // com/joestelmach/natty/generated/DateLexer.g:124:10: '53'
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
            // com/joestelmach/natty/generated/DateLexer.g:125:8: ( '54' )
            // com/joestelmach/natty/generated/DateLexer.g:125:10: '54'
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
            // com/joestelmach/natty/generated/DateLexer.g:126:8: ( '55' )
            // com/joestelmach/natty/generated/DateLexer.g:126:10: '55'
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
            // com/joestelmach/natty/generated/DateLexer.g:127:8: ( '56' )
            // com/joestelmach/natty/generated/DateLexer.g:127:10: '56'
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
            // com/joestelmach/natty/generated/DateLexer.g:128:8: ( '57' )
            // com/joestelmach/natty/generated/DateLexer.g:128:10: '57'
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
            // com/joestelmach/natty/generated/DateLexer.g:129:8: ( '58' )
            // com/joestelmach/natty/generated/DateLexer.g:129:10: '58'
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
            // com/joestelmach/natty/generated/DateLexer.g:130:8: ( '59' )
            // com/joestelmach/natty/generated/DateLexer.g:130:10: '59'
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
            // com/joestelmach/natty/generated/DateLexer.g:131:8: ( '60' )
            // com/joestelmach/natty/generated/DateLexer.g:131:10: '60'
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
            // com/joestelmach/natty/generated/DateLexer.g:132:8: ( '61' )
            // com/joestelmach/natty/generated/DateLexer.g:132:10: '61'
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
            // com/joestelmach/natty/generated/DateLexer.g:133:8: ( '62' )
            // com/joestelmach/natty/generated/DateLexer.g:133:10: '62'
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
            // com/joestelmach/natty/generated/DateLexer.g:134:8: ( '63' )
            // com/joestelmach/natty/generated/DateLexer.g:134:10: '63'
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
            // com/joestelmach/natty/generated/DateLexer.g:135:8: ( '64' )
            // com/joestelmach/natty/generated/DateLexer.g:135:10: '64'
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
            // com/joestelmach/natty/generated/DateLexer.g:136:8: ( '65' )
            // com/joestelmach/natty/generated/DateLexer.g:136:10: '65'
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
            // com/joestelmach/natty/generated/DateLexer.g:137:8: ( '66' )
            // com/joestelmach/natty/generated/DateLexer.g:137:10: '66'
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
            // com/joestelmach/natty/generated/DateLexer.g:138:8: ( '67' )
            // com/joestelmach/natty/generated/DateLexer.g:138:10: '67'
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
            // com/joestelmach/natty/generated/DateLexer.g:139:8: ( '68' )
            // com/joestelmach/natty/generated/DateLexer.g:139:10: '68'
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
            // com/joestelmach/natty/generated/DateLexer.g:140:8: ( '69' )
            // com/joestelmach/natty/generated/DateLexer.g:140:10: '69'
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
            // com/joestelmach/natty/generated/DateLexer.g:141:8: ( '70' )
            // com/joestelmach/natty/generated/DateLexer.g:141:10: '70'
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
            // com/joestelmach/natty/generated/DateLexer.g:142:8: ( '71' )
            // com/joestelmach/natty/generated/DateLexer.g:142:10: '71'
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
            // com/joestelmach/natty/generated/DateLexer.g:143:8: ( '72' )
            // com/joestelmach/natty/generated/DateLexer.g:143:10: '72'
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
            // com/joestelmach/natty/generated/DateLexer.g:144:8: ( '73' )
            // com/joestelmach/natty/generated/DateLexer.g:144:10: '73'
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
            // com/joestelmach/natty/generated/DateLexer.g:145:8: ( '74' )
            // com/joestelmach/natty/generated/DateLexer.g:145:10: '74'
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
            // com/joestelmach/natty/generated/DateLexer.g:146:8: ( '75' )
            // com/joestelmach/natty/generated/DateLexer.g:146:10: '75'
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
            // com/joestelmach/natty/generated/DateLexer.g:147:8: ( '76' )
            // com/joestelmach/natty/generated/DateLexer.g:147:10: '76'
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
            // com/joestelmach/natty/generated/DateLexer.g:148:8: ( '77' )
            // com/joestelmach/natty/generated/DateLexer.g:148:10: '77'
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
            // com/joestelmach/natty/generated/DateLexer.g:149:8: ( '78' )
            // com/joestelmach/natty/generated/DateLexer.g:149:10: '78'
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
            // com/joestelmach/natty/generated/DateLexer.g:150:8: ( '79' )
            // com/joestelmach/natty/generated/DateLexer.g:150:10: '79'
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
            // com/joestelmach/natty/generated/DateLexer.g:151:8: ( '80' )
            // com/joestelmach/natty/generated/DateLexer.g:151:10: '80'
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
            // com/joestelmach/natty/generated/DateLexer.g:152:8: ( '81' )
            // com/joestelmach/natty/generated/DateLexer.g:152:10: '81'
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
            // com/joestelmach/natty/generated/DateLexer.g:153:8: ( '82' )
            // com/joestelmach/natty/generated/DateLexer.g:153:10: '82'
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
            // com/joestelmach/natty/generated/DateLexer.g:154:8: ( '83' )
            // com/joestelmach/natty/generated/DateLexer.g:154:10: '83'
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
            // com/joestelmach/natty/generated/DateLexer.g:155:8: ( '84' )
            // com/joestelmach/natty/generated/DateLexer.g:155:10: '84'
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
            // com/joestelmach/natty/generated/DateLexer.g:156:8: ( '85' )
            // com/joestelmach/natty/generated/DateLexer.g:156:10: '85'
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
            // com/joestelmach/natty/generated/DateLexer.g:157:8: ( '86' )
            // com/joestelmach/natty/generated/DateLexer.g:157:10: '86'
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
            // com/joestelmach/natty/generated/DateLexer.g:158:8: ( '87' )
            // com/joestelmach/natty/generated/DateLexer.g:158:10: '87'
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
            // com/joestelmach/natty/generated/DateLexer.g:159:8: ( '88' )
            // com/joestelmach/natty/generated/DateLexer.g:159:10: '88'
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
            // com/joestelmach/natty/generated/DateLexer.g:160:8: ( '89' )
            // com/joestelmach/natty/generated/DateLexer.g:160:10: '89'
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
            // com/joestelmach/natty/generated/DateLexer.g:161:8: ( '90' )
            // com/joestelmach/natty/generated/DateLexer.g:161:10: '90'
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
            // com/joestelmach/natty/generated/DateLexer.g:162:8: ( '91' )
            // com/joestelmach/natty/generated/DateLexer.g:162:10: '91'
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
            // com/joestelmach/natty/generated/DateLexer.g:163:8: ( '92' )
            // com/joestelmach/natty/generated/DateLexer.g:163:10: '92'
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
            // com/joestelmach/natty/generated/DateLexer.g:164:8: ( '93' )
            // com/joestelmach/natty/generated/DateLexer.g:164:10: '93'
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
            // com/joestelmach/natty/generated/DateLexer.g:165:8: ( '94' )
            // com/joestelmach/natty/generated/DateLexer.g:165:10: '94'
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
            // com/joestelmach/natty/generated/DateLexer.g:166:8: ( '95' )
            // com/joestelmach/natty/generated/DateLexer.g:166:10: '95'
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
            // com/joestelmach/natty/generated/DateLexer.g:167:8: ( '96' )
            // com/joestelmach/natty/generated/DateLexer.g:167:10: '96'
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
            // com/joestelmach/natty/generated/DateLexer.g:168:8: ( '97' )
            // com/joestelmach/natty/generated/DateLexer.g:168:10: '97'
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
            // com/joestelmach/natty/generated/DateLexer.g:169:8: ( '98' )
            // com/joestelmach/natty/generated/DateLexer.g:169:10: '98'
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
            // com/joestelmach/natty/generated/DateLexer.g:170:8: ( '99' )
            // com/joestelmach/natty/generated/DateLexer.g:170:10: '99'
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

    // $ANTLR start "ONE"
    public final void mONE() throws RecognitionException {
        try {
            int _type = ONE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/joestelmach/natty/generated/DateLexer.g:172:11: ( 'one' )
            // com/joestelmach/natty/generated/DateLexer.g:172:13: 'one'
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
            // com/joestelmach/natty/generated/DateLexer.g:173:11: ( 'two' )
            // com/joestelmach/natty/generated/DateLexer.g:173:13: 'two'
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
            // com/joestelmach/natty/generated/DateLexer.g:174:11: ( 'three' )
            // com/joestelmach/natty/generated/DateLexer.g:174:13: 'three'
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
            // com/joestelmach/natty/generated/DateLexer.g:175:11: ( 'four' )
            // com/joestelmach/natty/generated/DateLexer.g:175:13: 'four'
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
            // com/joestelmach/natty/generated/DateLexer.g:176:11: ( 'five' )
            // com/joestelmach/natty/generated/DateLexer.g:176:13: 'five'
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
            // com/joestelmach/natty/generated/DateLexer.g:177:11: ( 'six' )
            // com/joestelmach/natty/generated/DateLexer.g:177:13: 'six'
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
            // com/joestelmach/natty/generated/DateLexer.g:178:11: ( 'seven' )
            // com/joestelmach/natty/generated/DateLexer.g:178:13: 'seven'
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
            // com/joestelmach/natty/generated/DateLexer.g:179:11: ( 'eight' )
            // com/joestelmach/natty/generated/DateLexer.g:179:13: 'eight'
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
            // com/joestelmach/natty/generated/DateLexer.g:180:11: ( 'nine' )
            // com/joestelmach/natty/generated/DateLexer.g:180:13: 'nine'
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
            // com/joestelmach/natty/generated/DateLexer.g:181:11: ( 'ten' )
            // com/joestelmach/natty/generated/DateLexer.g:181:13: 'ten'
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
            // com/joestelmach/natty/generated/DateLexer.g:182:11: ( 'eleven' )
            // com/joestelmach/natty/generated/DateLexer.g:182:13: 'eleven'
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
            // com/joestelmach/natty/generated/DateLexer.g:183:11: ( 'twelve' )
            // com/joestelmach/natty/generated/DateLexer.g:183:13: 'twelve'
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
            // com/joestelmach/natty/generated/DateLexer.g:184:11: ( 'thirteen' )
            // com/joestelmach/natty/generated/DateLexer.g:184:13: 'thirteen'
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
            // com/joestelmach/natty/generated/DateLexer.g:185:11: ( 'fourteen' )
            // com/joestelmach/natty/generated/DateLexer.g:185:13: 'fourteen'
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
            // com/joestelmach/natty/generated/DateLexer.g:186:11: ( 'fifteen' )
            // com/joestelmach/natty/generated/DateLexer.g:186:13: 'fifteen'
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
            // com/joestelmach/natty/generated/DateLexer.g:187:11: ( 'sixteen' )
            // com/joestelmach/natty/generated/DateLexer.g:187:13: 'sixteen'
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
            // com/joestelmach/natty/generated/DateLexer.g:188:11: ( 'seventeen' )
            // com/joestelmach/natty/generated/DateLexer.g:188:13: 'seventeen'
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
            // com/joestelmach/natty/generated/DateLexer.g:189:11: ( 'eighteen' | 'eightteen' )
            int alt83=2;
            switch ( input.LA(1) ) {
            case 'e':
                {
                switch ( input.LA(2) ) {
                case 'i':
                    {
                    switch ( input.LA(3) ) {
                    case 'g':
                        {
                        switch ( input.LA(4) ) {
                        case 'h':
                            {
                            switch ( input.LA(5) ) {
                            case 't':
                                {
                                switch ( input.LA(6) ) {
                                case 'e':
                                    {
                                    alt83=1;
                                    }
                                    break;
                                case 't':
                                    {
                                    alt83=2;
                                    }
                                    break;
                                default:
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 83, 5, input);

                                    throw nvae;
                                }

                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 83, 4, input);

                                throw nvae;
                            }

                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 83, 3, input);

                            throw nvae;
                        }

                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 83, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 83, 1, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // com/joestelmach/natty/generated/DateLexer.g:189:13: 'eighteen'
                    {
                    match("eighteen"); 


                    }
                    break;
                case 2 :
                    // com/joestelmach/natty/generated/DateLexer.g:189:26: 'eightteen'
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
            // com/joestelmach/natty/generated/DateLexer.g:190:11: ( 'nineteen' )
            // com/joestelmach/natty/generated/DateLexer.g:190:13: 'nineteen'
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
            // com/joestelmach/natty/generated/DateLexer.g:191:11: ( 'twenty' )
            // com/joestelmach/natty/generated/DateLexer.g:191:13: 'twenty'
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
            // com/joestelmach/natty/generated/DateLexer.g:192:11: ( 'thirty' )
            // com/joestelmach/natty/generated/DateLexer.g:192:13: 'thirty'
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
            // com/joestelmach/natty/generated/DateLexer.g:194:16: ( 'first' )
            // com/joestelmach/natty/generated/DateLexer.g:194:18: 'first'
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
            // com/joestelmach/natty/generated/DateLexer.g:195:16: ( 'second' )
            // com/joestelmach/natty/generated/DateLexer.g:195:18: 'second'
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
            // com/joestelmach/natty/generated/DateLexer.g:196:16: ( 'third' )
            // com/joestelmach/natty/generated/DateLexer.g:196:18: 'third'
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
            // com/joestelmach/natty/generated/DateLexer.g:197:16: ( 'fourth' )
            // com/joestelmach/natty/generated/DateLexer.g:197:18: 'fourth'
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
            // com/joestelmach/natty/generated/DateLexer.g:198:16: ( 'fifth' )
            // com/joestelmach/natty/generated/DateLexer.g:198:18: 'fifth'
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
            // com/joestelmach/natty/generated/DateLexer.g:199:16: ( 'sixth' )
            // com/joestelmach/natty/generated/DateLexer.g:199:18: 'sixth'
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
            // com/joestelmach/natty/generated/DateLexer.g:200:16: ( 'seventh' )
            // com/joestelmach/natty/generated/DateLexer.g:200:18: 'seventh'
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
            // com/joestelmach/natty/generated/DateLexer.g:201:16: ( 'eighth' )
            // com/joestelmach/natty/generated/DateLexer.g:201:18: 'eighth'
            {
            match("eighth"); 


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
            // com/joestelmach/natty/generated/DateLexer.g:202:16: ( 'ninth' )
            // com/joestelmach/natty/generated/DateLexer.g:202:18: 'ninth'
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
            // com/joestelmach/natty/generated/DateLexer.g:203:16: ( 'tenth' )
            // com/joestelmach/natty/generated/DateLexer.g:203:18: 'tenth'
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
            // com/joestelmach/natty/generated/DateLexer.g:204:16: ( 'eleventh' )
            // com/joestelmach/natty/generated/DateLexer.g:204:18: 'eleventh'
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
            // com/joestelmach/natty/generated/DateLexer.g:205:16: ( 'twelfth' )
            // com/joestelmach/natty/generated/DateLexer.g:205:18: 'twelfth'
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
            // com/joestelmach/natty/generated/DateLexer.g:206:16: ( 'thirteenth' )
            // com/joestelmach/natty/generated/DateLexer.g:206:18: 'thirteenth'
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
            // com/joestelmach/natty/generated/DateLexer.g:207:16: ( 'fourteenth' )
            // com/joestelmach/natty/generated/DateLexer.g:207:18: 'fourteenth'
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
            // com/joestelmach/natty/generated/DateLexer.g:208:16: ( 'fifteenth' )
            // com/joestelmach/natty/generated/DateLexer.g:208:18: 'fifteenth'
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
            // com/joestelmach/natty/generated/DateLexer.g:209:16: ( 'sixteenth' )
            // com/joestelmach/natty/generated/DateLexer.g:209:18: 'sixteenth'
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
            // com/joestelmach/natty/generated/DateLexer.g:210:16: ( 'seventeenth' )
            // com/joestelmach/natty/generated/DateLexer.g:210:18: 'seventeenth'
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
            // com/joestelmach/natty/generated/DateLexer.g:211:16: ( 'eighteenth' )
            // com/joestelmach/natty/generated/DateLexer.g:211:18: 'eighteenth'
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
            // com/joestelmach/natty/generated/DateLexer.g:212:16: ( 'nineteenth' )
            // com/joestelmach/natty/generated/DateLexer.g:212:18: 'nineteenth'
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
            // com/joestelmach/natty/generated/DateLexer.g:213:16: ( 'twentieth' )
            // com/joestelmach/natty/generated/DateLexer.g:213:18: 'twentieth'
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
            // com/joestelmach/natty/generated/DateLexer.g:214:16: ( 'thirtieth' )
            // com/joestelmach/natty/generated/DateLexer.g:214:18: 'thirtieth'
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

    // $ANTLR start "ST"
    public final void mST() throws RecognitionException {
        try {
            int _type = ST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/joestelmach/natty/generated/DateLexer.g:217:4: ( 'st' )
            // com/joestelmach/natty/generated/DateLexer.g:217:6: 'st'
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
            // com/joestelmach/natty/generated/DateLexer.g:218:4: ( 'nd' )
            // com/joestelmach/natty/generated/DateLexer.g:218:6: 'nd'
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
            // com/joestelmach/natty/generated/DateLexer.g:219:4: ( 'rd' )
            // com/joestelmach/natty/generated/DateLexer.g:219:6: 'rd'
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
            // com/joestelmach/natty/generated/DateLexer.g:220:4: ( 'th' )
            // com/joestelmach/natty/generated/DateLexer.g:220:6: 'th'
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

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/joestelmach/natty/generated/DateLexer.g:224:7: ( ':' )
            // com/joestelmach/natty/generated/DateLexer.g:224:9: ':'
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
            // com/joestelmach/natty/generated/DateLexer.g:225:7: ( ',' )
            // com/joestelmach/natty/generated/DateLexer.g:225:9: ','
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
            // com/joestelmach/natty/generated/DateLexer.g:226:7: ( '-' )
            // com/joestelmach/natty/generated/DateLexer.g:226:9: '-'
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
            // com/joestelmach/natty/generated/DateLexer.g:227:7: ( '/' )
            // com/joestelmach/natty/generated/DateLexer.g:227:9: '/'
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
            // com/joestelmach/natty/generated/DateLexer.g:228:7: ( '.' )
            // com/joestelmach/natty/generated/DateLexer.g:228:9: '.'
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
            // com/joestelmach/natty/generated/DateLexer.g:229:7: ( '+' )
            // com/joestelmach/natty/generated/DateLexer.g:229:9: '+'
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
            // com/joestelmach/natty/generated/DateLexer.g:230:14: ( '\\'' )
            // com/joestelmach/natty/generated/DateLexer.g:230:16: '\\''
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
            // com/joestelmach/natty/generated/DateLexer.g:232:10: ( 'in' )
            // com/joestelmach/natty/generated/DateLexer.g:232:12: 'in'
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
            // com/joestelmach/natty/generated/DateLexer.g:233:10: ( 'the' )
            // com/joestelmach/natty/generated/DateLexer.g:233:12: 'the'
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

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/joestelmach/natty/generated/DateLexer.g:234:10: ( 'or' )
            // com/joestelmach/natty/generated/DateLexer.g:234:12: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "AT"
    public final void mAT() throws RecognitionException {
        try {
            int _type = AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/joestelmach/natty/generated/DateLexer.g:235:10: ( 'at' )
            // com/joestelmach/natty/generated/DateLexer.g:235:12: 'at'
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
            // com/joestelmach/natty/generated/DateLexer.g:236:10: ( 'on' )
            // com/joestelmach/natty/generated/DateLexer.g:236:12: 'on'
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
            // com/joestelmach/natty/generated/DateLexer.g:237:10: ( 'of' )
            // com/joestelmach/natty/generated/DateLexer.g:237:12: 'of'
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
            // com/joestelmach/natty/generated/DateLexer.g:238:10: ( 'this' )
            // com/joestelmach/natty/generated/DateLexer.g:238:12: 'this'
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

    // $ANTLR start "THAT"
    public final void mTHAT() throws RecognitionException {
        try {
            int _type = THAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/joestelmach/natty/generated/DateLexer.g:239:10: ( 'that' )
            // com/joestelmach/natty/generated/DateLexer.g:239:12: 'that'
            {
            match("that"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THAT"

    // $ANTLR start "LAST"
    public final void mLAST() throws RecognitionException {
        try {
            int _type = LAST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/joestelmach/natty/generated/DateLexer.g:240:10: ( 'last' )
            // com/joestelmach/natty/generated/DateLexer.g:240:12: 'last'
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
            // com/joestelmach/natty/generated/DateLexer.g:241:10: ( 'next' )
            // com/joestelmach/natty/generated/DateLexer.g:241:12: 'next'
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
            // com/joestelmach/natty/generated/DateLexer.g:242:10: ( 'past' )
            // com/joestelmach/natty/generated/DateLexer.g:242:12: 'past'
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
            // com/joestelmach/natty/generated/DateLexer.g:243:10: ( 'coming' )
            // com/joestelmach/natty/generated/DateLexer.g:243:12: 'coming'
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
            // com/joestelmach/natty/generated/DateLexer.g:244:10: ( 'upcoming' )
            // com/joestelmach/natty/generated/DateLexer.g:244:12: 'upcoming'
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
            // com/joestelmach/natty/generated/DateLexer.g:245:10: ( 'from' )
            // com/joestelmach/natty/generated/DateLexer.g:245:12: 'from'
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
            // com/joestelmach/natty/generated/DateLexer.g:246:10: ( 'now' )
            // com/joestelmach/natty/generated/DateLexer.g:246:12: 'now'
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
            // com/joestelmach/natty/generated/DateLexer.g:247:10: ( 'ago' )
            // com/joestelmach/natty/generated/DateLexer.g:247:12: 'ago'
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
            // com/joestelmach/natty/generated/DateLexer.g:248:10: ( 'before' )
            // com/joestelmach/natty/generated/DateLexer.g:248:12: 'before'
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
            // com/joestelmach/natty/generated/DateLexer.g:249:10: ( 'after' )
            // com/joestelmach/natty/generated/DateLexer.g:249:12: 'after'
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
            // com/joestelmach/natty/generated/DateLexer.g:252:3: ( ( DOT | SPACE )+ )
            // com/joestelmach/natty/generated/DateLexer.g:252:5: ( DOT | SPACE )+
            {
            // com/joestelmach/natty/generated/DateLexer.g:252:5: ( DOT | SPACE )+
            int cnt84=0;
            loop84:
            do {
                int alt84=2;
                switch ( input.LA(1) ) {
                case '\t':
                case '\n':
                case '\r':
                case ' ':
                case '.':
                    {
                    alt84=1;
                    }
                    break;

                }

                switch (alt84) {
            	case 1 :
            	    // com/joestelmach/natty/generated/DateLexer.g:
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

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // com/joestelmach/natty/generated/DateLexer.g:255:16: ( '0' .. '9' )
            // com/joestelmach/natty/generated/DateLexer.g:255:18: '0' .. '9'
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
            // com/joestelmach/natty/generated/DateLexer.g:257:16: ( ' ' | '\\t' | '\\n' | '\\r' )
            // com/joestelmach/natty/generated/DateLexer.g:
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
        // com/joestelmach/natty/generated/DateLexer.g:1:8: ( JANUARY | FEBRUARY | MARCH | APRIL | MAY | JUNE | JULY | AUGUST | SEPTEMBER | OCTOBER | NOVEMBER | DECEMBER | SUNDAY | MONDAY | TUESDAY | WEDNESDAY | THURSDAY | FRIDAY | SATURDAY | HOUR | DAY | WEEK | MONTH | YEAR | TODAY | TOMORROW | YESTERDAY | AM | PM | T | MILITARY_HOUR_SUFFIX | MIDNIGHT | NOON | MORNING | NIGHT | UTC | EST | PST | CST | MST | AKST | HAST | INT_00 | INT_01 | INT_02 | INT_03 | INT_04 | INT_05 | INT_06 | INT_07 | INT_08 | INT_09 | INT_0 | INT_1 | INT_2 | INT_3 | INT_4 | INT_5 | INT_6 | INT_7 | INT_8 | INT_9 | INT_10 | INT_11 | INT_12 | INT_13 | INT_14 | INT_15 | INT_16 | INT_17 | INT_18 | INT_19 | INT_20 | INT_21 | INT_22 | INT_23 | INT_24 | INT_25 | INT_26 | INT_27 | INT_28 | INT_29 | INT_30 | INT_31 | INT_32 | INT_33 | INT_34 | INT_35 | INT_36 | INT_37 | INT_38 | INT_39 | INT_40 | INT_41 | INT_42 | INT_43 | INT_44 | INT_45 | INT_46 | INT_47 | INT_48 | INT_49 | INT_50 | INT_51 | INT_52 | INT_53 | INT_54 | INT_55 | INT_56 | INT_57 | INT_58 | INT_59 | INT_60 | INT_61 | INT_62 | INT_63 | INT_64 | INT_65 | INT_66 | INT_67 | INT_68 | INT_69 | INT_70 | INT_71 | INT_72 | INT_73 | INT_74 | INT_75 | INT_76 | INT_77 | INT_78 | INT_79 | INT_80 | INT_81 | INT_82 | INT_83 | INT_84 | INT_85 | INT_86 | INT_87 | INT_88 | INT_89 | INT_90 | INT_91 | INT_92 | INT_93 | INT_94 | INT_95 | INT_96 | INT_97 | INT_98 | INT_99 | ONE | TWO | THREE | FOUR | FIVE | SIX | SEVEN | EIGHT | NINE | TEN | ELEVEN | TWELVE | THIRTEEN | FOURTEEN | FIFTEEN | SIXTEEN | SEVENTEEN | EIGHTEEN | NINETEEN | TWENTY | THIRTY | FIRST | SECOND | THIRD | FOURTH | FIFTH | SIXTH | SEVENTH | EIGHTH | NINTH | TENTH | ELEVENTH | TWELFTH | THIRTEENTH | FOURTEENTH | FIFTEENTH | SIXTEENTH | SEVENTEENTH | EIGHTEENTH | NINETEENTH | TWENTIETH | THIRTIETH | ST | ND | RD | TH | COLON | COMMA | DASH | SLASH | DOT | PLUS | SINGLE_QUOTE | IN | THE | OR | AT | ON | OF | THIS | THAT | LAST | NEXT | PAST | COMING | UPCOMING | FROM | NOW | AGO | BEFORE | AFTER | WHITE_SPACE )
        int alt85=224;
        alt85 = dfa85.predict(input);
        switch (alt85) {
            case 1 :
                // com/joestelmach/natty/generated/DateLexer.g:1:10: JANUARY
                {
                mJANUARY(); 

                }
                break;
            case 2 :
                // com/joestelmach/natty/generated/DateLexer.g:1:18: FEBRUARY
                {
                mFEBRUARY(); 

                }
                break;
            case 3 :
                // com/joestelmach/natty/generated/DateLexer.g:1:27: MARCH
                {
                mMARCH(); 

                }
                break;
            case 4 :
                // com/joestelmach/natty/generated/DateLexer.g:1:33: APRIL
                {
                mAPRIL(); 

                }
                break;
            case 5 :
                // com/joestelmach/natty/generated/DateLexer.g:1:39: MAY
                {
                mMAY(); 

                }
                break;
            case 6 :
                // com/joestelmach/natty/generated/DateLexer.g:1:43: JUNE
                {
                mJUNE(); 

                }
                break;
            case 7 :
                // com/joestelmach/natty/generated/DateLexer.g:1:48: JULY
                {
                mJULY(); 

                }
                break;
            case 8 :
                // com/joestelmach/natty/generated/DateLexer.g:1:53: AUGUST
                {
                mAUGUST(); 

                }
                break;
            case 9 :
                // com/joestelmach/natty/generated/DateLexer.g:1:60: SEPTEMBER
                {
                mSEPTEMBER(); 

                }
                break;
            case 10 :
                // com/joestelmach/natty/generated/DateLexer.g:1:70: OCTOBER
                {
                mOCTOBER(); 

                }
                break;
            case 11 :
                // com/joestelmach/natty/generated/DateLexer.g:1:78: NOVEMBER
                {
                mNOVEMBER(); 

                }
                break;
            case 12 :
                // com/joestelmach/natty/generated/DateLexer.g:1:87: DECEMBER
                {
                mDECEMBER(); 

                }
                break;
            case 13 :
                // com/joestelmach/natty/generated/DateLexer.g:1:96: SUNDAY
                {
                mSUNDAY(); 

                }
                break;
            case 14 :
                // com/joestelmach/natty/generated/DateLexer.g:1:103: MONDAY
                {
                mMONDAY(); 

                }
                break;
            case 15 :
                // com/joestelmach/natty/generated/DateLexer.g:1:110: TUESDAY
                {
                mTUESDAY(); 

                }
                break;
            case 16 :
                // com/joestelmach/natty/generated/DateLexer.g:1:118: WEDNESDAY
                {
                mWEDNESDAY(); 

                }
                break;
            case 17 :
                // com/joestelmach/natty/generated/DateLexer.g:1:128: THURSDAY
                {
                mTHURSDAY(); 

                }
                break;
            case 18 :
                // com/joestelmach/natty/generated/DateLexer.g:1:137: FRIDAY
                {
                mFRIDAY(); 

                }
                break;
            case 19 :
                // com/joestelmach/natty/generated/DateLexer.g:1:144: SATURDAY
                {
                mSATURDAY(); 

                }
                break;
            case 20 :
                // com/joestelmach/natty/generated/DateLexer.g:1:153: HOUR
                {
                mHOUR(); 

                }
                break;
            case 21 :
                // com/joestelmach/natty/generated/DateLexer.g:1:158: DAY
                {
                mDAY(); 

                }
                break;
            case 22 :
                // com/joestelmach/natty/generated/DateLexer.g:1:162: WEEK
                {
                mWEEK(); 

                }
                break;
            case 23 :
                // com/joestelmach/natty/generated/DateLexer.g:1:167: MONTH
                {
                mMONTH(); 

                }
                break;
            case 24 :
                // com/joestelmach/natty/generated/DateLexer.g:1:173: YEAR
                {
                mYEAR(); 

                }
                break;
            case 25 :
                // com/joestelmach/natty/generated/DateLexer.g:1:178: TODAY
                {
                mTODAY(); 

                }
                break;
            case 26 :
                // com/joestelmach/natty/generated/DateLexer.g:1:184: TOMORROW
                {
                mTOMORROW(); 

                }
                break;
            case 27 :
                // com/joestelmach/natty/generated/DateLexer.g:1:193: YESTERDAY
                {
                mYESTERDAY(); 

                }
                break;
            case 28 :
                // com/joestelmach/natty/generated/DateLexer.g:1:203: AM
                {
                mAM(); 

                }
                break;
            case 29 :
                // com/joestelmach/natty/generated/DateLexer.g:1:206: PM
                {
                mPM(); 

                }
                break;
            case 30 :
                // com/joestelmach/natty/generated/DateLexer.g:1:209: T
                {
                mT(); 

                }
                break;
            case 31 :
                // com/joestelmach/natty/generated/DateLexer.g:1:211: MILITARY_HOUR_SUFFIX
                {
                mMILITARY_HOUR_SUFFIX(); 

                }
                break;
            case 32 :
                // com/joestelmach/natty/generated/DateLexer.g:1:232: MIDNIGHT
                {
                mMIDNIGHT(); 

                }
                break;
            case 33 :
                // com/joestelmach/natty/generated/DateLexer.g:1:241: NOON
                {
                mNOON(); 

                }
                break;
            case 34 :
                // com/joestelmach/natty/generated/DateLexer.g:1:246: MORNING
                {
                mMORNING(); 

                }
                break;
            case 35 :
                // com/joestelmach/natty/generated/DateLexer.g:1:254: NIGHT
                {
                mNIGHT(); 

                }
                break;
            case 36 :
                // com/joestelmach/natty/generated/DateLexer.g:1:260: UTC
                {
                mUTC(); 

                }
                break;
            case 37 :
                // com/joestelmach/natty/generated/DateLexer.g:1:264: EST
                {
                mEST(); 

                }
                break;
            case 38 :
                // com/joestelmach/natty/generated/DateLexer.g:1:268: PST
                {
                mPST(); 

                }
                break;
            case 39 :
                // com/joestelmach/natty/generated/DateLexer.g:1:272: CST
                {
                mCST(); 

                }
                break;
            case 40 :
                // com/joestelmach/natty/generated/DateLexer.g:1:276: MST
                {
                mMST(); 

                }
                break;
            case 41 :
                // com/joestelmach/natty/generated/DateLexer.g:1:280: AKST
                {
                mAKST(); 

                }
                break;
            case 42 :
                // com/joestelmach/natty/generated/DateLexer.g:1:285: HAST
                {
                mHAST(); 

                }
                break;
            case 43 :
                // com/joestelmach/natty/generated/DateLexer.g:1:290: INT_00
                {
                mINT_00(); 

                }
                break;
            case 44 :
                // com/joestelmach/natty/generated/DateLexer.g:1:297: INT_01
                {
                mINT_01(); 

                }
                break;
            case 45 :
                // com/joestelmach/natty/generated/DateLexer.g:1:304: INT_02
                {
                mINT_02(); 

                }
                break;
            case 46 :
                // com/joestelmach/natty/generated/DateLexer.g:1:311: INT_03
                {
                mINT_03(); 

                }
                break;
            case 47 :
                // com/joestelmach/natty/generated/DateLexer.g:1:318: INT_04
                {
                mINT_04(); 

                }
                break;
            case 48 :
                // com/joestelmach/natty/generated/DateLexer.g:1:325: INT_05
                {
                mINT_05(); 

                }
                break;
            case 49 :
                // com/joestelmach/natty/generated/DateLexer.g:1:332: INT_06
                {
                mINT_06(); 

                }
                break;
            case 50 :
                // com/joestelmach/natty/generated/DateLexer.g:1:339: INT_07
                {
                mINT_07(); 

                }
                break;
            case 51 :
                // com/joestelmach/natty/generated/DateLexer.g:1:346: INT_08
                {
                mINT_08(); 

                }
                break;
            case 52 :
                // com/joestelmach/natty/generated/DateLexer.g:1:353: INT_09
                {
                mINT_09(); 

                }
                break;
            case 53 :
                // com/joestelmach/natty/generated/DateLexer.g:1:360: INT_0
                {
                mINT_0(); 

                }
                break;
            case 54 :
                // com/joestelmach/natty/generated/DateLexer.g:1:366: INT_1
                {
                mINT_1(); 

                }
                break;
            case 55 :
                // com/joestelmach/natty/generated/DateLexer.g:1:372: INT_2
                {
                mINT_2(); 

                }
                break;
            case 56 :
                // com/joestelmach/natty/generated/DateLexer.g:1:378: INT_3
                {
                mINT_3(); 

                }
                break;
            case 57 :
                // com/joestelmach/natty/generated/DateLexer.g:1:384: INT_4
                {
                mINT_4(); 

                }
                break;
            case 58 :
                // com/joestelmach/natty/generated/DateLexer.g:1:390: INT_5
                {
                mINT_5(); 

                }
                break;
            case 59 :
                // com/joestelmach/natty/generated/DateLexer.g:1:396: INT_6
                {
                mINT_6(); 

                }
                break;
            case 60 :
                // com/joestelmach/natty/generated/DateLexer.g:1:402: INT_7
                {
                mINT_7(); 

                }
                break;
            case 61 :
                // com/joestelmach/natty/generated/DateLexer.g:1:408: INT_8
                {
                mINT_8(); 

                }
                break;
            case 62 :
                // com/joestelmach/natty/generated/DateLexer.g:1:414: INT_9
                {
                mINT_9(); 

                }
                break;
            case 63 :
                // com/joestelmach/natty/generated/DateLexer.g:1:420: INT_10
                {
                mINT_10(); 

                }
                break;
            case 64 :
                // com/joestelmach/natty/generated/DateLexer.g:1:427: INT_11
                {
                mINT_11(); 

                }
                break;
            case 65 :
                // com/joestelmach/natty/generated/DateLexer.g:1:434: INT_12
                {
                mINT_12(); 

                }
                break;
            case 66 :
                // com/joestelmach/natty/generated/DateLexer.g:1:441: INT_13
                {
                mINT_13(); 

                }
                break;
            case 67 :
                // com/joestelmach/natty/generated/DateLexer.g:1:448: INT_14
                {
                mINT_14(); 

                }
                break;
            case 68 :
                // com/joestelmach/natty/generated/DateLexer.g:1:455: INT_15
                {
                mINT_15(); 

                }
                break;
            case 69 :
                // com/joestelmach/natty/generated/DateLexer.g:1:462: INT_16
                {
                mINT_16(); 

                }
                break;
            case 70 :
                // com/joestelmach/natty/generated/DateLexer.g:1:469: INT_17
                {
                mINT_17(); 

                }
                break;
            case 71 :
                // com/joestelmach/natty/generated/DateLexer.g:1:476: INT_18
                {
                mINT_18(); 

                }
                break;
            case 72 :
                // com/joestelmach/natty/generated/DateLexer.g:1:483: INT_19
                {
                mINT_19(); 

                }
                break;
            case 73 :
                // com/joestelmach/natty/generated/DateLexer.g:1:490: INT_20
                {
                mINT_20(); 

                }
                break;
            case 74 :
                // com/joestelmach/natty/generated/DateLexer.g:1:497: INT_21
                {
                mINT_21(); 

                }
                break;
            case 75 :
                // com/joestelmach/natty/generated/DateLexer.g:1:504: INT_22
                {
                mINT_22(); 

                }
                break;
            case 76 :
                // com/joestelmach/natty/generated/DateLexer.g:1:511: INT_23
                {
                mINT_23(); 

                }
                break;
            case 77 :
                // com/joestelmach/natty/generated/DateLexer.g:1:518: INT_24
                {
                mINT_24(); 

                }
                break;
            case 78 :
                // com/joestelmach/natty/generated/DateLexer.g:1:525: INT_25
                {
                mINT_25(); 

                }
                break;
            case 79 :
                // com/joestelmach/natty/generated/DateLexer.g:1:532: INT_26
                {
                mINT_26(); 

                }
                break;
            case 80 :
                // com/joestelmach/natty/generated/DateLexer.g:1:539: INT_27
                {
                mINT_27(); 

                }
                break;
            case 81 :
                // com/joestelmach/natty/generated/DateLexer.g:1:546: INT_28
                {
                mINT_28(); 

                }
                break;
            case 82 :
                // com/joestelmach/natty/generated/DateLexer.g:1:553: INT_29
                {
                mINT_29(); 

                }
                break;
            case 83 :
                // com/joestelmach/natty/generated/DateLexer.g:1:560: INT_30
                {
                mINT_30(); 

                }
                break;
            case 84 :
                // com/joestelmach/natty/generated/DateLexer.g:1:567: INT_31
                {
                mINT_31(); 

                }
                break;
            case 85 :
                // com/joestelmach/natty/generated/DateLexer.g:1:574: INT_32
                {
                mINT_32(); 

                }
                break;
            case 86 :
                // com/joestelmach/natty/generated/DateLexer.g:1:581: INT_33
                {
                mINT_33(); 

                }
                break;
            case 87 :
                // com/joestelmach/natty/generated/DateLexer.g:1:588: INT_34
                {
                mINT_34(); 

                }
                break;
            case 88 :
                // com/joestelmach/natty/generated/DateLexer.g:1:595: INT_35
                {
                mINT_35(); 

                }
                break;
            case 89 :
                // com/joestelmach/natty/generated/DateLexer.g:1:602: INT_36
                {
                mINT_36(); 

                }
                break;
            case 90 :
                // com/joestelmach/natty/generated/DateLexer.g:1:609: INT_37
                {
                mINT_37(); 

                }
                break;
            case 91 :
                // com/joestelmach/natty/generated/DateLexer.g:1:616: INT_38
                {
                mINT_38(); 

                }
                break;
            case 92 :
                // com/joestelmach/natty/generated/DateLexer.g:1:623: INT_39
                {
                mINT_39(); 

                }
                break;
            case 93 :
                // com/joestelmach/natty/generated/DateLexer.g:1:630: INT_40
                {
                mINT_40(); 

                }
                break;
            case 94 :
                // com/joestelmach/natty/generated/DateLexer.g:1:637: INT_41
                {
                mINT_41(); 

                }
                break;
            case 95 :
                // com/joestelmach/natty/generated/DateLexer.g:1:644: INT_42
                {
                mINT_42(); 

                }
                break;
            case 96 :
                // com/joestelmach/natty/generated/DateLexer.g:1:651: INT_43
                {
                mINT_43(); 

                }
                break;
            case 97 :
                // com/joestelmach/natty/generated/DateLexer.g:1:658: INT_44
                {
                mINT_44(); 

                }
                break;
            case 98 :
                // com/joestelmach/natty/generated/DateLexer.g:1:665: INT_45
                {
                mINT_45(); 

                }
                break;
            case 99 :
                // com/joestelmach/natty/generated/DateLexer.g:1:672: INT_46
                {
                mINT_46(); 

                }
                break;
            case 100 :
                // com/joestelmach/natty/generated/DateLexer.g:1:679: INT_47
                {
                mINT_47(); 

                }
                break;
            case 101 :
                // com/joestelmach/natty/generated/DateLexer.g:1:686: INT_48
                {
                mINT_48(); 

                }
                break;
            case 102 :
                // com/joestelmach/natty/generated/DateLexer.g:1:693: INT_49
                {
                mINT_49(); 

                }
                break;
            case 103 :
                // com/joestelmach/natty/generated/DateLexer.g:1:700: INT_50
                {
                mINT_50(); 

                }
                break;
            case 104 :
                // com/joestelmach/natty/generated/DateLexer.g:1:707: INT_51
                {
                mINT_51(); 

                }
                break;
            case 105 :
                // com/joestelmach/natty/generated/DateLexer.g:1:714: INT_52
                {
                mINT_52(); 

                }
                break;
            case 106 :
                // com/joestelmach/natty/generated/DateLexer.g:1:721: INT_53
                {
                mINT_53(); 

                }
                break;
            case 107 :
                // com/joestelmach/natty/generated/DateLexer.g:1:728: INT_54
                {
                mINT_54(); 

                }
                break;
            case 108 :
                // com/joestelmach/natty/generated/DateLexer.g:1:735: INT_55
                {
                mINT_55(); 

                }
                break;
            case 109 :
                // com/joestelmach/natty/generated/DateLexer.g:1:742: INT_56
                {
                mINT_56(); 

                }
                break;
            case 110 :
                // com/joestelmach/natty/generated/DateLexer.g:1:749: INT_57
                {
                mINT_57(); 

                }
                break;
            case 111 :
                // com/joestelmach/natty/generated/DateLexer.g:1:756: INT_58
                {
                mINT_58(); 

                }
                break;
            case 112 :
                // com/joestelmach/natty/generated/DateLexer.g:1:763: INT_59
                {
                mINT_59(); 

                }
                break;
            case 113 :
                // com/joestelmach/natty/generated/DateLexer.g:1:770: INT_60
                {
                mINT_60(); 

                }
                break;
            case 114 :
                // com/joestelmach/natty/generated/DateLexer.g:1:777: INT_61
                {
                mINT_61(); 

                }
                break;
            case 115 :
                // com/joestelmach/natty/generated/DateLexer.g:1:784: INT_62
                {
                mINT_62(); 

                }
                break;
            case 116 :
                // com/joestelmach/natty/generated/DateLexer.g:1:791: INT_63
                {
                mINT_63(); 

                }
                break;
            case 117 :
                // com/joestelmach/natty/generated/DateLexer.g:1:798: INT_64
                {
                mINT_64(); 

                }
                break;
            case 118 :
                // com/joestelmach/natty/generated/DateLexer.g:1:805: INT_65
                {
                mINT_65(); 

                }
                break;
            case 119 :
                // com/joestelmach/natty/generated/DateLexer.g:1:812: INT_66
                {
                mINT_66(); 

                }
                break;
            case 120 :
                // com/joestelmach/natty/generated/DateLexer.g:1:819: INT_67
                {
                mINT_67(); 

                }
                break;
            case 121 :
                // com/joestelmach/natty/generated/DateLexer.g:1:826: INT_68
                {
                mINT_68(); 

                }
                break;
            case 122 :
                // com/joestelmach/natty/generated/DateLexer.g:1:833: INT_69
                {
                mINT_69(); 

                }
                break;
            case 123 :
                // com/joestelmach/natty/generated/DateLexer.g:1:840: INT_70
                {
                mINT_70(); 

                }
                break;
            case 124 :
                // com/joestelmach/natty/generated/DateLexer.g:1:847: INT_71
                {
                mINT_71(); 

                }
                break;
            case 125 :
                // com/joestelmach/natty/generated/DateLexer.g:1:854: INT_72
                {
                mINT_72(); 

                }
                break;
            case 126 :
                // com/joestelmach/natty/generated/DateLexer.g:1:861: INT_73
                {
                mINT_73(); 

                }
                break;
            case 127 :
                // com/joestelmach/natty/generated/DateLexer.g:1:868: INT_74
                {
                mINT_74(); 

                }
                break;
            case 128 :
                // com/joestelmach/natty/generated/DateLexer.g:1:875: INT_75
                {
                mINT_75(); 

                }
                break;
            case 129 :
                // com/joestelmach/natty/generated/DateLexer.g:1:882: INT_76
                {
                mINT_76(); 

                }
                break;
            case 130 :
                // com/joestelmach/natty/generated/DateLexer.g:1:889: INT_77
                {
                mINT_77(); 

                }
                break;
            case 131 :
                // com/joestelmach/natty/generated/DateLexer.g:1:896: INT_78
                {
                mINT_78(); 

                }
                break;
            case 132 :
                // com/joestelmach/natty/generated/DateLexer.g:1:903: INT_79
                {
                mINT_79(); 

                }
                break;
            case 133 :
                // com/joestelmach/natty/generated/DateLexer.g:1:910: INT_80
                {
                mINT_80(); 

                }
                break;
            case 134 :
                // com/joestelmach/natty/generated/DateLexer.g:1:917: INT_81
                {
                mINT_81(); 

                }
                break;
            case 135 :
                // com/joestelmach/natty/generated/DateLexer.g:1:924: INT_82
                {
                mINT_82(); 

                }
                break;
            case 136 :
                // com/joestelmach/natty/generated/DateLexer.g:1:931: INT_83
                {
                mINT_83(); 

                }
                break;
            case 137 :
                // com/joestelmach/natty/generated/DateLexer.g:1:938: INT_84
                {
                mINT_84(); 

                }
                break;
            case 138 :
                // com/joestelmach/natty/generated/DateLexer.g:1:945: INT_85
                {
                mINT_85(); 

                }
                break;
            case 139 :
                // com/joestelmach/natty/generated/DateLexer.g:1:952: INT_86
                {
                mINT_86(); 

                }
                break;
            case 140 :
                // com/joestelmach/natty/generated/DateLexer.g:1:959: INT_87
                {
                mINT_87(); 

                }
                break;
            case 141 :
                // com/joestelmach/natty/generated/DateLexer.g:1:966: INT_88
                {
                mINT_88(); 

                }
                break;
            case 142 :
                // com/joestelmach/natty/generated/DateLexer.g:1:973: INT_89
                {
                mINT_89(); 

                }
                break;
            case 143 :
                // com/joestelmach/natty/generated/DateLexer.g:1:980: INT_90
                {
                mINT_90(); 

                }
                break;
            case 144 :
                // com/joestelmach/natty/generated/DateLexer.g:1:987: INT_91
                {
                mINT_91(); 

                }
                break;
            case 145 :
                // com/joestelmach/natty/generated/DateLexer.g:1:994: INT_92
                {
                mINT_92(); 

                }
                break;
            case 146 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1001: INT_93
                {
                mINT_93(); 

                }
                break;
            case 147 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1008: INT_94
                {
                mINT_94(); 

                }
                break;
            case 148 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1015: INT_95
                {
                mINT_95(); 

                }
                break;
            case 149 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1022: INT_96
                {
                mINT_96(); 

                }
                break;
            case 150 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1029: INT_97
                {
                mINT_97(); 

                }
                break;
            case 151 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1036: INT_98
                {
                mINT_98(); 

                }
                break;
            case 152 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1043: INT_99
                {
                mINT_99(); 

                }
                break;
            case 153 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1050: ONE
                {
                mONE(); 

                }
                break;
            case 154 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1054: TWO
                {
                mTWO(); 

                }
                break;
            case 155 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1058: THREE
                {
                mTHREE(); 

                }
                break;
            case 156 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1064: FOUR
                {
                mFOUR(); 

                }
                break;
            case 157 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1069: FIVE
                {
                mFIVE(); 

                }
                break;
            case 158 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1074: SIX
                {
                mSIX(); 

                }
                break;
            case 159 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1078: SEVEN
                {
                mSEVEN(); 

                }
                break;
            case 160 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1084: EIGHT
                {
                mEIGHT(); 

                }
                break;
            case 161 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1090: NINE
                {
                mNINE(); 

                }
                break;
            case 162 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1095: TEN
                {
                mTEN(); 

                }
                break;
            case 163 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1099: ELEVEN
                {
                mELEVEN(); 

                }
                break;
            case 164 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1106: TWELVE
                {
                mTWELVE(); 

                }
                break;
            case 165 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1113: THIRTEEN
                {
                mTHIRTEEN(); 

                }
                break;
            case 166 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1122: FOURTEEN
                {
                mFOURTEEN(); 

                }
                break;
            case 167 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1131: FIFTEEN
                {
                mFIFTEEN(); 

                }
                break;
            case 168 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1139: SIXTEEN
                {
                mSIXTEEN(); 

                }
                break;
            case 169 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1147: SEVENTEEN
                {
                mSEVENTEEN(); 

                }
                break;
            case 170 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1157: EIGHTEEN
                {
                mEIGHTEEN(); 

                }
                break;
            case 171 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1166: NINETEEN
                {
                mNINETEEN(); 

                }
                break;
            case 172 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1175: TWENTY
                {
                mTWENTY(); 

                }
                break;
            case 173 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1182: THIRTY
                {
                mTHIRTY(); 

                }
                break;
            case 174 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1189: FIRST
                {
                mFIRST(); 

                }
                break;
            case 175 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1195: SECOND
                {
                mSECOND(); 

                }
                break;
            case 176 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1202: THIRD
                {
                mTHIRD(); 

                }
                break;
            case 177 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1208: FOURTH
                {
                mFOURTH(); 

                }
                break;
            case 178 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1215: FIFTH
                {
                mFIFTH(); 

                }
                break;
            case 179 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1221: SIXTH
                {
                mSIXTH(); 

                }
                break;
            case 180 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1227: SEVENTH
                {
                mSEVENTH(); 

                }
                break;
            case 181 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1235: EIGHTH
                {
                mEIGHTH(); 

                }
                break;
            case 182 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1242: NINTH
                {
                mNINTH(); 

                }
                break;
            case 183 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1248: TENTH
                {
                mTENTH(); 

                }
                break;
            case 184 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1254: ELEVENTH
                {
                mELEVENTH(); 

                }
                break;
            case 185 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1263: TWELFTH
                {
                mTWELFTH(); 

                }
                break;
            case 186 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1271: THIRTEENTH
                {
                mTHIRTEENTH(); 

                }
                break;
            case 187 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1282: FOURTEENTH
                {
                mFOURTEENTH(); 

                }
                break;
            case 188 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1293: FIFTEENTH
                {
                mFIFTEENTH(); 

                }
                break;
            case 189 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1303: SIXTEENTH
                {
                mSIXTEENTH(); 

                }
                break;
            case 190 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1313: SEVENTEENTH
                {
                mSEVENTEENTH(); 

                }
                break;
            case 191 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1325: EIGHTEENTH
                {
                mEIGHTEENTH(); 

                }
                break;
            case 192 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1336: NINETEENTH
                {
                mNINETEENTH(); 

                }
                break;
            case 193 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1347: TWENTIETH
                {
                mTWENTIETH(); 

                }
                break;
            case 194 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1357: THIRTIETH
                {
                mTHIRTIETH(); 

                }
                break;
            case 195 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1367: ST
                {
                mST(); 

                }
                break;
            case 196 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1370: ND
                {
                mND(); 

                }
                break;
            case 197 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1373: RD
                {
                mRD(); 

                }
                break;
            case 198 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1376: TH
                {
                mTH(); 

                }
                break;
            case 199 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1379: COLON
                {
                mCOLON(); 

                }
                break;
            case 200 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1385: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 201 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1391: DASH
                {
                mDASH(); 

                }
                break;
            case 202 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1396: SLASH
                {
                mSLASH(); 

                }
                break;
            case 203 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1402: DOT
                {
                mDOT(); 

                }
                break;
            case 204 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1406: PLUS
                {
                mPLUS(); 

                }
                break;
            case 205 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1411: SINGLE_QUOTE
                {
                mSINGLE_QUOTE(); 

                }
                break;
            case 206 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1424: IN
                {
                mIN(); 

                }
                break;
            case 207 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1427: THE
                {
                mTHE(); 

                }
                break;
            case 208 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1431: OR
                {
                mOR(); 

                }
                break;
            case 209 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1434: AT
                {
                mAT(); 

                }
                break;
            case 210 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1437: ON
                {
                mON(); 

                }
                break;
            case 211 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1440: OF
                {
                mOF(); 

                }
                break;
            case 212 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1443: THIS
                {
                mTHIS(); 

                }
                break;
            case 213 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1448: THAT
                {
                mTHAT(); 

                }
                break;
            case 214 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1453: LAST
                {
                mLAST(); 

                }
                break;
            case 215 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1458: NEXT
                {
                mNEXT(); 

                }
                break;
            case 216 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1463: PAST
                {
                mPAST(); 

                }
                break;
            case 217 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1468: COMING
                {
                mCOMING(); 

                }
                break;
            case 218 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1475: UPCOMING
                {
                mUPCOMING(); 

                }
                break;
            case 219 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1484: FROM
                {
                mFROM(); 

                }
                break;
            case 220 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1489: NOW
                {
                mNOW(); 

                }
                break;
            case 221 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1493: AGO
                {
                mAGO(); 

                }
                break;
            case 222 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1497: BEFORE
                {
                mBEFORE(); 

                }
                break;
            case 223 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1504: AFTER
                {
                mAFTER(); 

                }
                break;
            case 224 :
                // com/joestelmach/natty/generated/DateLexer.g:1:1510: WHITE_SPACE
                {
                mWHITE_SPACE(); 

                }
                break;

        }

    }


    protected DFA57 dfa57 = new DFA57(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA85 dfa85 = new DFA85(this);
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
    static final String DFA85_eotS =
        "\4\uffff\1\64\4\uffff\1\115\1\uffff\1\121\1\uffff\1\123\4\uffff"+
        "\1\146\1\161\1\174\1\u0087\1\u0092\1\u009d\1\u00a8\1\u00b3\1\u00be"+
        "\1\u00c9\5\uffff\1\u00ca\35\uffff\1\u00dd\11\uffff\1\u00e8\u008b"+
        "\uffff\1\u00f6\5\uffff\1\u00fb\21\uffff\1\u0103\6\uffff\1\u0108"+
        "\7\uffff\1\u0110\7\uffff\1\u0116\6\uffff\1\u011c\1\u011e\12\uffff"+
        "\1\u0129\22\uffff\1\u0134\1\uffff\1\u0137\2\uffff\1\u013a\5\uffff"+
        "\1\u013f\5\uffff\1\u0142\1\u0144\1\u0127\2\uffff\1\u0147\7\uffff";
    static final String DFA85_eofS =
        "\u0148\uffff";
    static final String DFA85_minS =
        "\1\11\1\141\1\145\1\141\1\146\1\141\1\143\1\144\1\141\2\145\1\141"+
        "\1\145\1\141\1\160\1\uffff\2\144\12\60\5\uffff\1\11\7\uffff\1\154"+
        "\1\uffff\1\151\1\165\1\146\1\162\1\156\5\uffff\1\164\3\uffff\1\143"+
        "\2\uffff\1\170\2\uffff\1\145\2\uffff\1\157\1\147\5\uffff\1\141\1"+
        "\144\1\145\1\156\1\uffff\1\144\3\uffff\1\141\5\uffff\1\147\1\145"+
        "\165\uffff\1\162\1\uffff\1\164\3\uffff\1\164\1\uffff\1\145\1\uffff"+
        "\1\145\1\uffff\1\164\6\uffff\1\145\2\uffff\1\162\6\uffff\1\154\1"+
        "\164\1\uffff\1\153\2\uffff\1\150\1\166\1\164\1\145\2\uffff\1\162"+
        "\1\156\1\145\1\uffff\1\164\1\uffff\1\144\1\uffff\1\146\1\164\2\uffff"+
        "\1\145\1\164\2\145\1\uffff\1\145\1\uffff\1\55\1\164\1\145\1\uffff"+
        "\1\145\1\uffff\1\145\3\uffff\1\151\1\uffff\1\145\1\156\1\145\1\uffff"+
        "\1\156\1\uffff\1\145\1\uffff\1\156\2\145\4\uffff\1\145\3\uffff\1"+
        "\164\1\156\1\164\1\145\1\uffff\1\164\3\156\2\uffff\1\164\2\uffff"+
        "\1\156\2\uffff\3\164\2\uffff\1\164\7\uffff";
    static final String DFA85_maxS =
        "\1\172\1\165\1\162\1\164\2\165\1\162\1\157\1\145\1\167\1\145\1\163"+
        "\1\145\2\164\1\uffff\2\164\12\71\5\uffff\1\56\7\uffff\1\156\1\uffff"+
        "\1\157\1\165\1\166\1\171\1\162\5\uffff\1\164\3\uffff\1\166\2\uffff"+
        "\1\170\2\uffff\1\145\2\uffff\1\167\1\156\5\uffff\1\165\1\155\1\157"+
        "\1\156\1\uffff\1\145\3\uffff\1\163\5\uffff\1\147\1\145\165\uffff"+
        "\1\162\1\uffff\1\164\3\uffff\1\164\1\uffff\1\145\1\uffff\1\145\1"+
        "\uffff\1\164\6\uffff\1\164\2\uffff\1\163\6\uffff\1\156\1\164\1\uffff"+
        "\1\153\2\uffff\1\150\1\166\1\164\1\150\2\uffff\1\162\1\156\1\150"+
        "\1\uffff\1\164\1\uffff\1\164\1\uffff\1\166\1\164\2\uffff\1\145\1"+
        "\164\1\145\1\150\1\uffff\1\145\1\uffff\1\156\1\164\1\145\1\uffff"+
        "\1\145\1\uffff\1\171\3\uffff\1\171\1\uffff\1\164\1\156\1\145\1\uffff"+
        "\1\156\1\uffff\1\150\1\uffff\1\156\2\145\4\uffff\1\145\3\uffff\1"+
        "\164\1\156\1\164\1\145\1\uffff\1\164\3\156\2\uffff\1\164\2\uffff"+
        "\1\156\2\uffff\3\164\2\uffff\1\164\7\uffff";
    static final String DFA85_acceptS =
        "\17\uffff\1\44\14\uffff\1\u00c5\1\u00c7\1\u00c8\1\u00c9\1\u00ca"+
        "\1\uffff\1\u00cc\1\u00cd\1\u00ce\1\u00d6\1\u00de\1\u00e0\1\1\1\uffff"+
        "\1\2\5\uffff\1\40\1\50\1\4\1\10\1\34\1\uffff\1\51\1\u00d1\1\u00dd"+
        "\1\uffff\1\15\1\23\1\uffff\1\u00c3\1\12\1\uffff\1\u00d0\1\u00d3"+
        "\2\uffff\1\u00c4\1\u00d7\1\14\1\25\1\17\4\uffff\1\36\1\uffff\1\24"+
        "\1\52\1\37\1\uffff\1\35\1\46\1\u00d8\1\u00da\1\45\2\uffff\1\47\1"+
        "\u00d9\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1"+
        "\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\66\1"+
        "\111\1\112\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1\122\1\67"+
        "\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\132\1\133\1\134\1\70"+
        "\1\135\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\71"+
        "\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157\1\160\1\72"+
        "\1\161\1\162\1\163\1\164\1\165\1\166\1\167\1\170\1\171\1\172\1\73"+
        "\1\173\1\174\1\175\1\176\1\177\1\u0080\1\u0081\1\u0082\1\u0083\1"+
        "\u0084\1\74\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a\1\u008b"+
        "\1\u008c\1\u008d\1\u008e\1\75\1\u008f\1\u0090\1\u0091\1\u0092\1"+
        "\u0093\1\u0094\1\u0095\1\u0096\1\u0097\1\u0098\1\76\1\u00cb\1\6"+
        "\1\7\1\22\1\u00db\1\uffff\1\u009d\1\uffff\1\u00ae\1\3\1\5\1\uffff"+
        "\1\42\1\uffff\1\11\1\uffff\1\u00af\1\uffff\1\u0099\1\u00d2\1\13"+
        "\1\41\1\u00dc\1\43\1\uffff\1\21\1\u009b\1\uffff\1\u00cf\1\u00d5"+
        "\1\u00c6\1\31\1\32\1\u009a\2\uffff\1\20\1\uffff\1\30\1\33\4\uffff"+
        "\1\16\1\27\3\uffff\1\u009e\1\uffff\1\u00b6\1\uffff\1\u00d4\2\uffff"+
        "\1\u00b7\1\u00a2\4\uffff\1\u009c\1\uffff\1\u00b2\3\uffff\1\u00b3"+
        "\1\uffff\1\u00a1\1\uffff\1\u00b0\1\u00a4\1\u00b9\1\uffff\1\26\3"+
        "\uffff\1\u00b1\1\uffff\1\u00df\1\uffff\1\u009f\3\uffff\1\u00ad\1"+
        "\u00c2\1\u00ac\1\u00c1\1\uffff\1\u00aa\1\u00b5\1\u00a0\4\uffff\1"+
        "\u00b4\4\uffff\1\u00b8\1\u00a3\1\uffff\1\u00bc\1\u00a7\1\uffff\1"+
        "\u00bd\1\u00a8\3\uffff\1\u00bb\1\u00a6\1\uffff\1\u00c0\1\u00ab\1"+
        "\u00ba\1\u00a5\1\u00bf\1\u00be\1\u00a9";
    static final String DFA85_specialS =
        "\u0148\uffff}>";
    static final String[] DFA85_transitionS = {
            "\2\47\2\uffff\1\47\22\uffff\1\47\6\uffff\1\43\3\uffff\1\42\1"+
            "\36\1\37\1\41\1\40\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1"+
            "\32\1\33\1\35\46\uffff\1\4\1\46\1\21\1\10\1\20\1\2\1\17\1\13"+
            "\1\44\1\1\1\uffff\1\45\1\3\1\7\1\6\1\15\1\uffff\1\34\1\5\1\11"+
            "\1\16\1\uffff\1\12\1\uffff\1\14\1\17",
            "\1\50\23\uffff\1\51",
            "\1\52\3\uffff\1\55\5\uffff\1\54\2\uffff\1\53",
            "\1\56\2\uffff\1\61\4\uffff\1\60\5\uffff\1\57\3\uffff\2\61",
            "\1\65\1\70\3\uffff\1\66\4\uffff\1\62\3\uffff\1\67\1\63",
            "\1\73\3\uffff\1\71\3\uffff\1\74\12\uffff\1\75\1\72",
            "\1\76\2\uffff\1\101\7\uffff\1\77\3\uffff\1\100",
            "\1\104\1\105\3\uffff\1\103\5\uffff\1\102",
            "\1\107\3\uffff\1\106",
            "\1\114\2\uffff\1\111\6\uffff\1\112\5\uffff\1\110\1\uffff\1"+
            "\113",
            "\1\116",
            "\1\120\15\uffff\1\117\3\uffff\1\120",
            "\1\122",
            "\1\125\2\uffff\1\124\16\uffff\2\124",
            "\1\126\3\uffff\1\17",
            "",
            "\1\127\4\uffff\1\130\2\uffff\1\131\6\uffff\2\127",
            "\1\132\12\uffff\1\133\3\uffff\2\132",
            "\1\134\1\135\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145",
            "\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157\1\160",
            "\1\162\1\163\1\164\1\165\1\166\1\167\1\170\1\171\1\172\1\173",
            "\1\175\1\176\1\177\1\u0080\1\u0081\1\u0082\1\u0083\1\u0084"+
            "\1\u0085\1\u0086",
            "\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e\1"+
            "\u008f\1\u0090\1\u0091",
            "\1\u0093\1\u0094\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1"+
            "\u009a\1\u009b\1\u009c",
            "\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u00a4\1"+
            "\u00a5\1\u00a6\1\u00a7",
            "\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae\1\u00af\1"+
            "\u00b0\1\u00b1\1\u00b2",
            "\1\u00b4\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1"+
            "\u00bb\1\u00bc\1\u00bd",
            "\1\u00bf\1\u00c0\1\u00c1\1\u00c2\1\u00c3\1\u00c4\1\u00c5\1"+
            "\u00c6\1\u00c7\1\u00c8",
            "",
            "",
            "",
            "",
            "",
            "\2\47\2\uffff\1\47\22\uffff\1\47\15\uffff\1\47",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00cc\1\uffff\1\u00cb",
            "",
            "\1\u00cd\5\uffff\1\u00ce",
            "\1\u00cf",
            "\1\u00d1\13\uffff\1\u00d2\3\uffff\1\u00d0",
            "\1\u00d3\6\uffff\1\u00d4",
            "\1\u00d5\3\uffff\1\u00d6",
            "",
            "",
            "",
            "",
            "",
            "\1\u00d7",
            "",
            "",
            "",
            "\1\u00da\14\uffff\1\u00d8\5\uffff\1\u00d9",
            "",
            "",
            "\1\u00db",
            "",
            "",
            "\1\u00dc",
            "",
            "",
            "\1\u00df\6\uffff\1\u00de\1\u00e0",
            "\1\u00e1\6\uffff\1\u00e2",
            "",
            "",
            "",
            "",
            "",
            "\1\u00e7\3\uffff\1\u00e6\3\uffff\1\u00e5\10\uffff\1\u00e4\2"+
            "\uffff\1\u00e3",
            "\1\u00e9\10\uffff\1\u00ea",
            "\1\u00ec\11\uffff\1\u00eb",
            "\1\u00ed",
            "",
            "\1\u00ee\1\u00ef",
            "",
            "",
            "",
            "\1\u00f0\21\uffff\1\u00f1",
            "",
            "",
            "",
            "",
            "",
            "\1\u00f2",
            "\1\u00f3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00f4",
            "",
            "\1\u00f5",
            "",
            "",
            "",
            "\1\u00f7",
            "",
            "\1\u00f8",
            "",
            "\1\u00f9",
            "",
            "\1\u00fa",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00fc\16\uffff\1\u00fd",
            "",
            "",
            "\1\u00fe\1\u00ff",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0100\1\uffff\1\u0101",
            "\1\u0102",
            "",
            "\1\u0104",
            "",
            "",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0109\2\uffff\1\u010a",
            "",
            "",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d\2\uffff\1\u010e",
            "",
            "\1\u010f",
            "",
            "\1\u0112\17\uffff\1\u0111",
            "",
            "\1\u0114\17\uffff\1\u0113",
            "\1\u0115",
            "",
            "",
            "\1\73",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119\2\uffff\1\u011a",
            "",
            "\1\u011b",
            "",
            "\1\u00df\100\uffff\1\u00df",
            "\1\u011d",
            "\1\u011f",
            "",
            "\1\u0120",
            "",
            "\1\u0121\3\uffff\1\u0123\17\uffff\1\u0122",
            "",
            "",
            "",
            "\1\u0125\17\uffff\1\u0124",
            "",
            "\1\u0126\2\uffff\1\u0128\13\uffff\1\u0127",
            "\1\u012a",
            "\1\u012b",
            "",
            "\1\u012c",
            "",
            "\1\u012d\2\uffff\1\u012e",
            "",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "",
            "",
            "",
            "",
            "\1\u0132",
            "",
            "",
            "",
            "\1\u0133",
            "\1\u0135",
            "\1\u0136",
            "\1\u0138",
            "",
            "\1\u0139",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "",
            "",
            "\1\u013e",
            "",
            "",
            "\1\u0140",
            "",
            "",
            "\1\u0141",
            "\1\u0143",
            "\1\u0145",
            "",
            "",
            "\1\u0146",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA85_eot = DFA.unpackEncodedString(DFA85_eotS);
    static final short[] DFA85_eof = DFA.unpackEncodedString(DFA85_eofS);
    static final char[] DFA85_min = DFA.unpackEncodedStringToUnsignedChars(DFA85_minS);
    static final char[] DFA85_max = DFA.unpackEncodedStringToUnsignedChars(DFA85_maxS);
    static final short[] DFA85_accept = DFA.unpackEncodedString(DFA85_acceptS);
    static final short[] DFA85_special = DFA.unpackEncodedString(DFA85_specialS);
    static final short[][] DFA85_transition;

    static {
        int numStates = DFA85_transitionS.length;
        DFA85_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA85_transition[i] = DFA.unpackEncodedString(DFA85_transitionS[i]);
        }
    }

    class DFA85 extends DFA {

        public DFA85(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 85;
            this.eot = DFA85_eot;
            this.eof = DFA85_eof;
            this.min = DFA85_min;
            this.max = DFA85_max;
            this.accept = DFA85_accept;
            this.special = DFA85_special;
            this.transition = DFA85_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( JANUARY | FEBRUARY | MARCH | APRIL | MAY | JUNE | JULY | AUGUST | SEPTEMBER | OCTOBER | NOVEMBER | DECEMBER | SUNDAY | MONDAY | TUESDAY | WEDNESDAY | THURSDAY | FRIDAY | SATURDAY | HOUR | DAY | WEEK | MONTH | YEAR | TODAY | TOMORROW | YESTERDAY | AM | PM | T | MILITARY_HOUR_SUFFIX | MIDNIGHT | NOON | MORNING | NIGHT | UTC | EST | PST | CST | MST | AKST | HAST | INT_00 | INT_01 | INT_02 | INT_03 | INT_04 | INT_05 | INT_06 | INT_07 | INT_08 | INT_09 | INT_0 | INT_1 | INT_2 | INT_3 | INT_4 | INT_5 | INT_6 | INT_7 | INT_8 | INT_9 | INT_10 | INT_11 | INT_12 | INT_13 | INT_14 | INT_15 | INT_16 | INT_17 | INT_18 | INT_19 | INT_20 | INT_21 | INT_22 | INT_23 | INT_24 | INT_25 | INT_26 | INT_27 | INT_28 | INT_29 | INT_30 | INT_31 | INT_32 | INT_33 | INT_34 | INT_35 | INT_36 | INT_37 | INT_38 | INT_39 | INT_40 | INT_41 | INT_42 | INT_43 | INT_44 | INT_45 | INT_46 | INT_47 | INT_48 | INT_49 | INT_50 | INT_51 | INT_52 | INT_53 | INT_54 | INT_55 | INT_56 | INT_57 | INT_58 | INT_59 | INT_60 | INT_61 | INT_62 | INT_63 | INT_64 | INT_65 | INT_66 | INT_67 | INT_68 | INT_69 | INT_70 | INT_71 | INT_72 | INT_73 | INT_74 | INT_75 | INT_76 | INT_77 | INT_78 | INT_79 | INT_80 | INT_81 | INT_82 | INT_83 | INT_84 | INT_85 | INT_86 | INT_87 | INT_88 | INT_89 | INT_90 | INT_91 | INT_92 | INT_93 | INT_94 | INT_95 | INT_96 | INT_97 | INT_98 | INT_99 | ONE | TWO | THREE | FOUR | FIVE | SIX | SEVEN | EIGHT | NINE | TEN | ELEVEN | TWELVE | THIRTEEN | FOURTEEN | FIFTEEN | SIXTEEN | SEVENTEEN | EIGHTEEN | NINETEEN | TWENTY | THIRTY | FIRST | SECOND | THIRD | FOURTH | FIFTH | SIXTH | SEVENTH | EIGHTH | NINTH | TENTH | ELEVENTH | TWELFTH | THIRTEENTH | FOURTEENTH | FIFTEENTH | SIXTEENTH | SEVENTEENTH | EIGHTEENTH | NINETEENTH | TWENTIETH | THIRTIETH | ST | ND | RD | TH | COLON | COMMA | DASH | SLASH | DOT | PLUS | SINGLE_QUOTE | IN | THE | OR | AT | ON | OF | THIS | THAT | LAST | NEXT | PAST | COMING | UPCOMING | FROM | NOW | AGO | BEFORE | AFTER | WHITE_SPACE );";
        }
    }
 

}