// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g 2010-02-09 21:15:39
 package com.natty.parse; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class DateLexer extends Lexer {
    public static final int DIRECTION=13;
    public static final int NINETEEN=107;
    public static final int WEEK=62;
    public static final int SEPTEMBER=38;
    public static final int WEDNESDAY=67;
    public static final int INT_24_TO_31=86;
    public static final int TWENTY_EIGHTH=132;
    public static final int TWENTY=108;
    public static final int INT_00=82;
    public static final int JULY=36;
    public static final int APRIL=33;
    public static final int COMING=57;
    public static final int NINETEENTH=123;
    public static final int OCTOBER=39;
    public static final int NOW=60;
    public static final int ONE=89;
    public static final int DAY=26;
    public static final int MIDNIGHT=80;
    public static final int MARCH=32;
    public static final int EOF=-1;
    public static final int MONTH=63;
    public static final int PAST=56;
    public static final int SEVENTEEN=105;
    public static final int DATE_TIME=9;
    public static final int AM_PM=20;
    public static final int TWENTY_SEVENTH=131;
    public static final int TWENTY_FIFTH=129;
    public static final int EIGHTEENTH=122;
    public static final int MINUTES_OF_HOUR=19;
    public static final int SPAN=15;
    public static final int THIS=54;
    public static final int NOON=79;
    public static final int THIRTIETH=134;
    public static final int INT_60_TO_99=88;
    public static final int LAST=53;
    public static final int EIGHTEEN=106;
    public static final int INT_01_TO_12=84;
    public static final int TOMORROW=72;
    public static final int RELATIVE_DATE=11;
    public static final int FOURTH=51;
    public static final int FIFTEENTH=119;
    public static final int TODAY=71;
    public static final int SECOND=49;
    public static final int NOVEMBER=40;
    public static final int SATURDAY=70;
    public static final int FOUR=92;
    public static final int MONTH_OF_YEAR=5;
    public static final int SEVENTH=111;
    public static final int TEN=98;
    public static final int FEBRUARY=31;
    public static final int ON=24;
    public static final int MONDAY=65;
    public static final int THIRTEEN=101;
    public static final int ELEVEN=99;
    public static final int SEVEN=95;
    public static final int DAY_OF_WEEK=7;
    public static final int SUNDAY=64;
    public static final int JUNE=35;
    public static final int INT=4;
    public static final int EXPLICIT_DATE=10;
    public static final int OF=29;
    public static final int SIX=94;
    public static final int UPCOMING=58;
    public static final int FIFTH=52;
    public static final int TWENTY_NINTH=133;
    public static final int THURSDAY=68;
    public static final int DECEMBER=41;
    public static final int SEEK_BY=14;
    public static final int AUGUST=37;
    public static final int PM=78;
    public static final int EXPLICIT_TIME=17;
    public static final int FROM=59;
    public static final int TUESDAY=66;
    public static final int EIGHTH=112;
    public static final int HOURS_OF_DAY=18;
    public static final int THIRD=50;
    public static final int YEAR=44;
    public static final int THE=25;
    public static final int TENTH=114;
    public static final int MAY=34;
    public static final int TWENTY_FOURTH=128;
    public static final int WHITE_SPACE=21;
    public static final int EIGHT=96;
    public static final int FRIDAY=69;
    public static final int INT_0=81;
    public static final int TWENTY_SIXTH=130;
    public static final int AT=22;
    public static final int SINGLE_QUOTE=42;
    public static final int SLASH=46;
    public static final int IN=43;
    public static final int UNKNOWN=137;
    public static final int NINTH=113;
    public static final int COMMA=23;
    public static final int FIVE=93;
    public static final int THIRTY=109;
    public static final int TWENTIETH=124;
    public static final int TWENTY_SECOND=126;
    public static final int NEXT=55;
    public static final int INT_13_TO_23=85;
    public static final int DOT=136;
    public static final int MILITARY_HOUR_SUFFIX=75;
    public static final int INT_32_TO_59=87;
    public static final int AM=77;
    public static final int DASH=45;
    public static final int FOURTEENTH=118;
    public static final int SIXTEEN=104;
    public static final int INT_6_TO_9=83;
    public static final int YEAR_OF=8;
    public static final int TWELVE=100;
    public static final int WEEK_INDEX=16;
    public static final int AGO=61;
    public static final int ELEVENTH=115;
    public static final int BEFORE=28;
    public static final int TWO=90;
    public static final int INT_1_TO_5=47;
    public static final int AFTER=27;
    public static final int HOUR=76;
    public static final int SIXTEENTH=120;
    public static final int JANUARY=30;
    public static final int THIRTEENTH=117;
    public static final int SEEK=12;
    public static final int COLON=74;
    public static final int DAY_OF_MONTH=6;
    public static final int FIFTEEN=103;
    public static final int TWELFTH=116;
    public static final int NINE=97;
    public static final int SIXTH=110;
    public static final int THREE=91;
    public static final int TWENTY_FIRST=125;
    public static final int FOURTEEN=102;
    public static final int TWENTY_THIRD=127;
    public static final int YESTERDAY=73;
    public static final int SEVENTEENTH=121;
    public static final int FIRST=48;
    public static final int THIRTY_FIRST=135;

    // delegates
    // delegators

    public DateLexer() {;} 
    public DateLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public DateLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g"; }

    // $ANTLR start "JANUARY"
    public final void mJANUARY() throws RecognitionException {
        try {
            int _type = JANUARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:415:11: ( 'january' ( 's' )? | 'jan' ( DOT )? )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:415:13: 'january' ( 's' )?
                    {
                    match("january"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:415:23: ( 's' )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0=='s') ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:415:23: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:415:32: 'jan' ( DOT )?
                    {
                    match("jan"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:415:38: ( DOT )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='.') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:415:38: DOT
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:416:11: ( 'february' ( 's' )? | 'feb' ( DOT )? )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:416:13: 'february' ( 's' )?
                    {
                    match("february"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:416:24: ( 's' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='s') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:416:24: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:416:32: 'feb' ( DOT )?
                    {
                    match("feb"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:416:38: ( DOT )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='.') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:416:38: DOT
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:417:11: ( 'march' ( 's' )? | 'mar' ( DOT )? )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:417:13: 'march' ( 's' )?
                    {
                    match("march"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:417:21: ( 's' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='s') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:417:21: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:417:32: 'mar' ( DOT )?
                    {
                    match("mar"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:417:38: ( DOT )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='.') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:417:38: DOT
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:418:11: ( 'april' ( 's' )? | 'apr' ( DOT )? )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:418:13: 'april' ( 's' )?
                    {
                    match("april"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:418:21: ( 's' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='s') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:418:21: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:418:32: 'apr' ( DOT )?
                    {
                    match("apr"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:418:38: ( DOT )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='.') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:418:38: DOT
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:419:11: ( 'may' ( 's' )? )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:419:13: 'may' ( 's' )?
            {
            match("may"); 

            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:419:19: ( 's' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='s') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:419:19: 's'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:420:11: ( 'june' ( 's' )? | 'jun' ( DOT )? )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:420:13: 'june' ( 's' )?
                    {
                    match("june"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:420:20: ( 's' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='s') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:420:20: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:420:32: 'jun' ( DOT )?
                    {
                    match("jun"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:420:38: ( DOT )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='.') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:420:38: DOT
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:421:11: ( 'july' ( 's' )? | 'jul' ( DOT )? )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:421:13: 'july' ( 's' )?
                    {
                    match("july"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:421:20: ( 's' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='s') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:421:20: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:421:32: 'jul' ( DOT )?
                    {
                    match("jul"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:421:38: ( DOT )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='.') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:421:38: DOT
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:422:11: ( 'august' ( 's' )? | 'aug' ( DOT )? )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:422:13: 'august' ( 's' )?
                    {
                    match("august"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:422:22: ( 's' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='s') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:422:22: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:422:32: 'aug' ( DOT )?
                    {
                    match("aug"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:422:38: ( DOT )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0=='.') ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:422:38: DOT
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:423:11: ( 'september' ( 's' )? | 'sep' ( DOT )? | 'sept' ( DOT )? )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:423:13: 'september' ( 's' )?
                    {
                    match("september"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:423:25: ( 's' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0=='s') ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:423:25: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:423:32: 'sep' ( DOT )?
                    {
                    match("sep"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:423:38: ( DOT )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0=='.') ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:423:38: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:423:45: 'sept' ( DOT )?
                    {
                    match("sept"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:423:52: ( DOT )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0=='.') ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:423:52: DOT
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:424:11: ( 'october' ( 's' )? | 'oct' ( DOT )? )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:424:13: 'october' ( 's' )?
                    {
                    match("october"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:424:23: ( 's' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0=='s') ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:424:23: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:424:32: 'oct' ( DOT )?
                    {
                    match("oct"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:424:38: ( DOT )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0=='.') ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:424:38: DOT
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:425:11: ( 'november' ( 's' )? | 'nov' ( DOT )? )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:425:13: 'november' ( 's' )?
                    {
                    match("november"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:425:24: ( 's' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0=='s') ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:425:24: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:425:32: 'nov' ( DOT )?
                    {
                    match("nov"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:425:38: ( DOT )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0=='.') ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:425:38: DOT
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:426:11: ( 'december' ( 's' )? | 'dec' ( DOT )? )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:426:13: 'december' ( 's' )?
                    {
                    match("december"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:426:24: ( 's' )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0=='s') ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:426:24: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:426:32: 'dec' ( DOT )?
                    {
                    match("dec"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:426:38: ( DOT )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0=='.') ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:426:38: DOT
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:428:11: ( 'sunday' ( 's' )? | 'sun' ( DOT )? | 'suns' ( DOT )? )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:428:13: 'sunday' ( 's' )?
                    {
                    match("sunday"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:428:22: ( 's' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0=='s') ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:428:22: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:428:32: 'sun' ( DOT )?
                    {
                    match("sun"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:428:38: ( DOT )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0=='.') ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:428:38: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:428:46: 'suns' ( DOT )?
                    {
                    match("suns"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:428:53: ( DOT )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0=='.') ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:428:53: DOT
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:429:11: ( 'monday' ( 's' )? | 'mon' ( DOT )? | 'mons' ( DOT )? )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:429:13: 'monday' ( 's' )?
                    {
                    match("monday"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:429:22: ( 's' )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0=='s') ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:429:22: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:429:32: 'mon' ( DOT )?
                    {
                    match("mon"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:429:38: ( DOT )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0=='.') ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:429:38: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:429:46: 'mons' ( DOT )?
                    {
                    match("mons"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:429:53: ( DOT )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0=='.') ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:429:53: DOT
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:430:11: ( 'tuesday' ( 's' )? | 'tues' ( DOT )? | 'tue' ( DOT )? )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:430:13: 'tuesday' ( 's' )?
                    {
                    match("tuesday"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:430:23: ( 's' )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0=='s') ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:430:23: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:430:32: 'tues' ( DOT )?
                    {
                    match("tues"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:430:39: ( DOT )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0=='.') ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:430:39: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:430:46: 'tue' ( DOT )?
                    {
                    match("tue"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:430:52: ( DOT )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0=='.') ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:430:52: DOT
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:431:11: ( 'wednesday' ( 's' )? | 'wed' ( DOT )? | 'weds' ( DOT )? )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:431:13: 'wednesday' ( 's' )?
                    {
                    match("wednesday"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:431:25: ( 's' )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0=='s') ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:431:25: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:431:32: 'wed' ( DOT )?
                    {
                    match("wed"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:431:38: ( DOT )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0=='.') ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:431:38: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:431:46: 'weds' ( DOT )?
                    {
                    match("weds"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:431:53: ( DOT )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0=='.') ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:431:53: DOT
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:432:11: ( 'thursday' ( 's' )? | 'thur' ( DOT )? | 'thu' ( DOT )? | 'thus' ( DOT )? | 'thurs' ( DOT )? )
            int alt57=5;
            alt57 = dfa57.predict(input);
            switch (alt57) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:432:13: 'thursday' ( 's' )?
                    {
                    match("thursday"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:432:24: ( 's' )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0=='s') ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:432:24: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:432:32: 'thur' ( DOT )?
                    {
                    match("thur"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:432:39: ( DOT )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0=='.') ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:432:39: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:432:46: 'thu' ( DOT )?
                    {
                    match("thu"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:432:52: ( DOT )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0=='.') ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:432:52: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:432:61: 'thus' ( DOT )?
                    {
                    match("thus"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:432:68: ( DOT )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0=='.') ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:432:68: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:432:75: 'thurs' ( DOT )?
                    {
                    match("thurs"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:432:83: ( DOT )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0=='.') ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:432:83: DOT
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:433:11: ( 'friday' ( 's' )? | 'fri' ( DOT )? | 'fris' ( DOT )? )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:433:13: 'friday' ( 's' )?
                    {
                    match("friday"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:433:22: ( 's' )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0=='s') ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:433:22: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:433:32: 'fri' ( DOT )?
                    {
                    match("fri"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:433:38: ( DOT )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0=='.') ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:433:38: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:433:46: 'fris' ( DOT )?
                    {
                    match("fris"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:433:53: ( DOT )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0=='.') ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:433:53: DOT
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:434:11: ( 'saturday' ( 's' )? | 'sat' ( DOT )? | 'sats' ( DOT )? | 'weekend' )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:434:13: 'saturday' ( 's' )?
                    {
                    match("saturday"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:434:24: ( 's' )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0=='s') ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:434:24: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:434:32: 'sat' ( DOT )?
                    {
                    match("sat"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:434:38: ( DOT )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0=='.') ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:434:38: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:434:46: 'sats' ( DOT )?
                    {
                    match("sats"); 

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:434:53: ( DOT )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0=='.') ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:434:53: DOT
                            {
                            mDOT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:434:61: 'weekend'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:436:7: ( 'hour' | 'hours' )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:436:9: 'hour'
                    {
                    match("hour"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:436:19: 'hours'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:437:7: ( 'day' | 'days' )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:437:9: 'day'
                    {
                    match("day"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:437:19: 'days'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:438:7: ( 'week' | 'weeks' )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:438:9: 'week'
                    {
                    match("week"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:438:19: 'weeks'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:439:7: ( 'month' | 'months' )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:439:9: 'month'
                    {
                    match("month"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:439:19: 'months'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:440:7: ( 'year' | 'years' )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:440:9: 'year'
                    {
                    match("year"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:440:19: 'years'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:442:11: ( 'today' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:442:13: 'today'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:443:11: ( 'tomorow' | 'tomorrow' | 'tommorow' | 'tommorrow' )
            int alt71=4;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:443:13: 'tomorow'
                    {
                    match("tomorow"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:443:27: 'tomorrow'
                    {
                    match("tomorrow"); 


                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:443:42: 'tommorow'
                    {
                    match("tommorow"); 


                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:443:55: 'tommorrow'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:444:11: ( 'yesterday' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:444:13: 'yesterday'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:448:4: ( 'am' | 'a.m.' | 'a' )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:448:6: 'am'
                    {
                    match("am"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:448:13: 'a.m.'
                    {
                    match("a.m."); 


                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:448:22: 'a'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:449:4: ( 'pm' | 'p.m.' | 'p' )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:449:6: 'pm'
                    {
                    match("pm"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:449:13: 'p.m.'
                    {
                    match("p.m."); 


                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:449:22: 'p'
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

    // $ANTLR start "MILITARY_HOUR_SUFFIX"
    public final void mMILITARY_HOUR_SUFFIX() throws RecognitionException {
        try {
            int _type = MILITARY_HOUR_SUFFIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:451:22: ( 'h' | 'H' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:453:10: ( 'midnight' | 'mid-night' )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:453:12: 'midnight'
                    {
                    match("midnight"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:453:25: 'mid-night'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:454:10: ( 'noon' | 'afternoon' | 'after-noon' )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:454:12: 'noon'
                    {
                    match("noon"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:454:21: 'afternoon'
                    {
                    match("afternoon"); 


                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:454:35: 'after-noon'
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

    // $ANTLR start "INT_60_TO_99"
    public final void mINT_60_TO_99() throws RecognitionException {
        try {
            int _type = INT_60_TO_99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:459:3: ( '6' .. '9' '0' .. '9' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:459:5: '6' .. '9' '0' .. '9'
            {
            matchRange('6','9'); 
            matchRange('0','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_60_TO_99"

    // $ANTLR start "INT_32_TO_59"
    public final void mINT_32_TO_59() throws RecognitionException {
        try {
            int _type = INT_32_TO_59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:463:3: ( '3' '2' .. '9' | '4' .. '5' '0' .. '9' )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0=='3') ) {
                alt76=1;
            }
            else if ( ((LA76_0>='4' && LA76_0<='5')) ) {
                alt76=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:463:5: '3' '2' .. '9'
                    {
                    match('3'); 
                    matchRange('2','9'); 

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:464:5: '4' .. '5' '0' .. '9'
                    {
                    matchRange('4','5'); 
                    matchRange('0','9'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_32_TO_59"

    // $ANTLR start "INT_24_TO_31"
    public final void mINT_24_TO_31() throws RecognitionException {
        try {
            int _type = INT_24_TO_31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:468:3: ( '2' '4' .. '9' | '3' '0' .. '1' )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0=='2') ) {
                alt77=1;
            }
            else if ( (LA77_0=='3') ) {
                alt77=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:468:5: '2' '4' .. '9'
                    {
                    match('2'); 
                    matchRange('4','9'); 

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:469:5: '3' '0' .. '1'
                    {
                    match('3'); 
                    matchRange('0','1'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_24_TO_31"

    // $ANTLR start "INT_13_TO_23"
    public final void mINT_13_TO_23() throws RecognitionException {
        try {
            int _type = INT_13_TO_23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:473:3: ( '1' '3' .. '9' | '2' '0' .. '3' )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0=='1') ) {
                alt78=1;
            }
            else if ( (LA78_0=='2') ) {
                alt78=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:473:5: '1' '3' .. '9'
                    {
                    match('1'); 
                    matchRange('3','9'); 

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:474:5: '2' '0' .. '3'
                    {
                    match('2'); 
                    matchRange('0','3'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_13_TO_23"

    // $ANTLR start "INT_01_TO_12"
    public final void mINT_01_TO_12() throws RecognitionException {
        try {
            int _type = INT_01_TO_12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:478:3: ( '0' '1' .. '9' | '1' '0' .. '2' )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0=='0') ) {
                alt79=1;
            }
            else if ( (LA79_0=='1') ) {
                alt79=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:478:5: '0' '1' .. '9'
                    {
                    match('0'); 
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:479:5: '1' '0' .. '2'
                    {
                    match('1'); 
                    matchRange('0','2'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_01_TO_12"

    // $ANTLR start "INT_00"
    public final void mINT_00() throws RecognitionException {
        try {
            int _type = INT_00;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:483:3: ( '00' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:483:5: '00'
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

    // $ANTLR start "INT_0"
    public final void mINT_0() throws RecognitionException {
        try {
            int _type = INT_0;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:487:3: ( '0' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:487:5: '0'
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

    // $ANTLR start "INT_1_TO_5"
    public final void mINT_1_TO_5() throws RecognitionException {
        try {
            int _type = INT_1_TO_5;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:491:3: ( '1' .. '5' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:491:5: '1' .. '5'
            {
            matchRange('1','5'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_1_TO_5"

    // $ANTLR start "INT_6_TO_9"
    public final void mINT_6_TO_9() throws RecognitionException {
        try {
            int _type = INT_6_TO_9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:495:3: ( '6' .. '9' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:495:5: '6' .. '9'
            {
            matchRange('6','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_6_TO_9"

    // $ANTLR start "ONE"
    public final void mONE() throws RecognitionException {
        try {
            int _type = ONE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:498:11: ( 'one' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:498:13: 'one'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:499:11: ( 'two' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:499:13: 'two'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:500:11: ( 'three' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:500:13: 'three'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:501:11: ( 'four' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:501:13: 'four'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:502:11: ( 'five' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:502:13: 'five'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:503:11: ( 'six' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:503:13: 'six'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:504:11: ( 'seven' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:504:13: 'seven'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:505:11: ( 'eight' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:505:13: 'eight'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:506:11: ( 'nine' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:506:13: 'nine'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:507:11: ( 'ten' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:507:13: 'ten'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:508:11: ( 'eleven' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:508:13: 'eleven'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:509:11: ( 'twelve' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:509:13: 'twelve'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:510:11: ( 'thirteen' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:510:13: 'thirteen'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:511:11: ( 'fourteen' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:511:13: 'fourteen'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:512:11: ( 'fifteen' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:512:13: 'fifteen'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:513:11: ( 'sixteen' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:513:13: 'sixteen'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:514:11: ( 'seventeen' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:514:13: 'seventeen'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:515:11: ( 'eighteen' | 'eightteen' )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0=='e') ) {
                int LA80_1 = input.LA(2);

                if ( (LA80_1=='i') ) {
                    int LA80_2 = input.LA(3);

                    if ( (LA80_2=='g') ) {
                        int LA80_3 = input.LA(4);

                        if ( (LA80_3=='h') ) {
                            int LA80_4 = input.LA(5);

                            if ( (LA80_4=='t') ) {
                                int LA80_5 = input.LA(6);

                                if ( (LA80_5=='e') ) {
                                    alt80=1;
                                }
                                else if ( (LA80_5=='t') ) {
                                    alt80=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 80, 5, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 80, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 80, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 80, 2, input);

                        throw nvae;
                    }
                }
                else {
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:515:13: 'eighteen'
                    {
                    match("eighteen"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:515:26: 'eightteen'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:516:11: ( 'nineteen' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:516:13: 'nineteen'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:517:11: ( 'twenty' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:517:13: 'twenty'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:518:11: ( 'thirty' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:518:13: 'thirty'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:520:16: ( 'first' | '1st' )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0=='f') ) {
                alt81=1;
            }
            else if ( (LA81_0=='1') ) {
                alt81=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:520:18: 'first'
                    {
                    match("first"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:520:34: '1st'
                    {
                    match("1st"); 


                    }
                    break;

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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:521:16: ( 'second' | '2nd' )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0=='s') ) {
                alt82=1;
            }
            else if ( (LA82_0=='2') ) {
                alt82=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:521:18: 'second'
                    {
                    match("second"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:521:34: '2nd'
                    {
                    match("2nd"); 


                    }
                    break;

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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:522:16: ( 'third' | '3rd' )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0=='t') ) {
                alt83=1;
            }
            else if ( (LA83_0=='3') ) {
                alt83=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:522:18: 'third'
                    {
                    match("third"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:522:34: '3rd'
                    {
                    match("3rd"); 


                    }
                    break;

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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:523:16: ( 'fourth' | '4th' )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0=='f') ) {
                alt84=1;
            }
            else if ( (LA84_0=='4') ) {
                alt84=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:523:18: 'fourth'
                    {
                    match("fourth"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:523:34: '4th'
                    {
                    match("4th"); 


                    }
                    break;

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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:524:16: ( 'fifth' | '5th' )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0=='f') ) {
                alt85=1;
            }
            else if ( (LA85_0=='5') ) {
                alt85=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:524:18: 'fifth'
                    {
                    match("fifth"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:524:34: '5th'
                    {
                    match("5th"); 


                    }
                    break;

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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:525:16: ( 'sixth' | '6th' )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0=='s') ) {
                alt86=1;
            }
            else if ( (LA86_0=='6') ) {
                alt86=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:525:18: 'sixth'
                    {
                    match("sixth"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:525:34: '6th'
                    {
                    match("6th"); 


                    }
                    break;

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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:526:16: ( 'seventh' | '7th' )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0=='s') ) {
                alt87=1;
            }
            else if ( (LA87_0=='7') ) {
                alt87=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:526:18: 'seventh'
                    {
                    match("seventh"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:526:34: '7th'
                    {
                    match("7th"); 


                    }
                    break;

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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:527:16: ( 'eigth' | '8th' )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0=='e') ) {
                alt88=1;
            }
            else if ( (LA88_0=='8') ) {
                alt88=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:527:18: 'eigth'
                    {
                    match("eigth"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:527:34: '8th'
                    {
                    match("8th"); 


                    }
                    break;

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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:528:16: ( 'ninth' | '9th' )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0=='n') ) {
                alt89=1;
            }
            else if ( (LA89_0=='9') ) {
                alt89=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:528:18: 'ninth'
                    {
                    match("ninth"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:528:34: '9th'
                    {
                    match("9th"); 


                    }
                    break;

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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:529:16: ( 'tenth' | '10th' )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0=='t') ) {
                alt90=1;
            }
            else if ( (LA90_0=='1') ) {
                alt90=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:529:18: 'tenth'
                    {
                    match("tenth"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:529:34: '10th'
                    {
                    match("10th"); 


                    }
                    break;

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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:530:16: ( 'eleventh' | '11th' )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0=='e') ) {
                alt91=1;
            }
            else if ( (LA91_0=='1') ) {
                alt91=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:530:18: 'eleventh'
                    {
                    match("eleventh"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:530:34: '11th'
                    {
                    match("11th"); 


                    }
                    break;

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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:531:16: ( 'twelfth' | '12th' )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0=='t') ) {
                alt92=1;
            }
            else if ( (LA92_0=='1') ) {
                alt92=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:531:18: 'twelfth'
                    {
                    match("twelfth"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:531:34: '12th'
                    {
                    match("12th"); 


                    }
                    break;

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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:532:16: ( 'thirteenth' | '13th' )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0=='t') ) {
                alt93=1;
            }
            else if ( (LA93_0=='1') ) {
                alt93=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }
            switch (alt93) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:532:18: 'thirteenth'
                    {
                    match("thirteenth"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:532:34: '13th'
                    {
                    match("13th"); 


                    }
                    break;

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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:533:16: ( 'fourteenth' | '14th' )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0=='f') ) {
                alt94=1;
            }
            else if ( (LA94_0=='1') ) {
                alt94=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:533:18: 'fourteenth'
                    {
                    match("fourteenth"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:533:34: '14th'
                    {
                    match("14th"); 


                    }
                    break;

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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:534:16: ( 'fifteenth' | '15th' )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0=='f') ) {
                alt95=1;
            }
            else if ( (LA95_0=='1') ) {
                alt95=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:534:18: 'fifteenth'
                    {
                    match("fifteenth"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:534:34: '15th'
                    {
                    match("15th"); 


                    }
                    break;

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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:535:16: ( 'sixteenth' | '16th' )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0=='s') ) {
                alt96=1;
            }
            else if ( (LA96_0=='1') ) {
                alt96=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }
            switch (alt96) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:535:18: 'sixteenth'
                    {
                    match("sixteenth"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:535:34: '16th'
                    {
                    match("16th"); 


                    }
                    break;

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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:536:16: ( 'seventeenth' | '17th' )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0=='s') ) {
                alt97=1;
            }
            else if ( (LA97_0=='1') ) {
                alt97=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }
            switch (alt97) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:536:18: 'seventeenth'
                    {
                    match("seventeenth"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:536:34: '17th'
                    {
                    match("17th"); 


                    }
                    break;

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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:537:16: ( 'eighteenth' | '18th' )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0=='e') ) {
                alt98=1;
            }
            else if ( (LA98_0=='1') ) {
                alt98=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }
            switch (alt98) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:537:18: 'eighteenth'
                    {
                    match("eighteenth"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:537:34: '18th'
                    {
                    match("18th"); 


                    }
                    break;

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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:538:16: ( 'nineteenth' | '19th' )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0=='n') ) {
                alt99=1;
            }
            else if ( (LA99_0=='1') ) {
                alt99=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }
            switch (alt99) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:538:18: 'nineteenth'
                    {
                    match("nineteenth"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:538:34: '19th'
                    {
                    match("19th"); 


                    }
                    break;

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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:539:16: ( 'twentieth' | '20th' )
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0=='t') ) {
                alt100=1;
            }
            else if ( (LA100_0=='2') ) {
                alt100=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }
            switch (alt100) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:539:18: 'twentieth'
                    {
                    match("twentieth"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:539:34: '20th'
                    {
                    match("20th"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TWENTIETH"

    // $ANTLR start "TWENTY_FIRST"
    public final void mTWENTY_FIRST() throws RecognitionException {
        try {
            int _type = TWENTY_FIRST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:540:16: ( '21st' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:540:18: '21st'
            {
            match("21st"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TWENTY_FIRST"

    // $ANTLR start "TWENTY_SECOND"
    public final void mTWENTY_SECOND() throws RecognitionException {
        try {
            int _type = TWENTY_SECOND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:541:16: ( '22nd' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:541:18: '22nd'
            {
            match("22nd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TWENTY_SECOND"

    // $ANTLR start "TWENTY_THIRD"
    public final void mTWENTY_THIRD() throws RecognitionException {
        try {
            int _type = TWENTY_THIRD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:542:16: ( '23rd' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:542:18: '23rd'
            {
            match("23rd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TWENTY_THIRD"

    // $ANTLR start "TWENTY_FOURTH"
    public final void mTWENTY_FOURTH() throws RecognitionException {
        try {
            int _type = TWENTY_FOURTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:543:16: ( '24th' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:543:18: '24th'
            {
            match("24th"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TWENTY_FOURTH"

    // $ANTLR start "TWENTY_FIFTH"
    public final void mTWENTY_FIFTH() throws RecognitionException {
        try {
            int _type = TWENTY_FIFTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:544:16: ( '25th' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:544:18: '25th'
            {
            match("25th"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TWENTY_FIFTH"

    // $ANTLR start "TWENTY_SIXTH"
    public final void mTWENTY_SIXTH() throws RecognitionException {
        try {
            int _type = TWENTY_SIXTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:545:16: ( '26th' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:545:18: '26th'
            {
            match("26th"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TWENTY_SIXTH"

    // $ANTLR start "TWENTY_SEVENTH"
    public final void mTWENTY_SEVENTH() throws RecognitionException {
        try {
            int _type = TWENTY_SEVENTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:546:16: ( '27th' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:546:18: '27th'
            {
            match("27th"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TWENTY_SEVENTH"

    // $ANTLR start "TWENTY_EIGHTH"
    public final void mTWENTY_EIGHTH() throws RecognitionException {
        try {
            int _type = TWENTY_EIGHTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:547:16: ( '28th' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:547:18: '28th'
            {
            match("28th"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TWENTY_EIGHTH"

    // $ANTLR start "TWENTY_NINTH"
    public final void mTWENTY_NINTH() throws RecognitionException {
        try {
            int _type = TWENTY_NINTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:548:16: ( '29th' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:548:18: '29th'
            {
            match("29th"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TWENTY_NINTH"

    // $ANTLR start "THIRTIETH"
    public final void mTHIRTIETH() throws RecognitionException {
        try {
            int _type = THIRTIETH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:549:16: ( 'thirtieth' | '30th' )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0=='t') ) {
                alt101=1;
            }
            else if ( (LA101_0=='3') ) {
                alt101=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }
            switch (alt101) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:549:18: 'thirtieth'
                    {
                    match("thirtieth"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:549:32: '30th'
                    {
                    match("30th"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THIRTIETH"

    // $ANTLR start "THIRTY_FIRST"
    public final void mTHIRTY_FIRST() throws RecognitionException {
        try {
            int _type = THIRTY_FIRST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:550:16: ( '31st' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:550:18: '31st'
            {
            match("31st"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THIRTY_FIRST"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:554:7: ( ':' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:554:9: ':'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:555:7: ( ',' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:555:9: ','
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:556:7: ( '-' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:556:9: '-'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:557:7: ( '/' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:557:9: '/'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:558:7: ( '.' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:558:9: '.'
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

    // $ANTLR start "SINGLE_QUOTE"
    public final void mSINGLE_QUOTE() throws RecognitionException {
        try {
            int _type = SINGLE_QUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:559:14: ( '\\'' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:559:16: '\\''
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:561:10: ( 'in' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:561:12: 'in'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:562:10: ( 'the' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:562:12: 'the'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:563:10: ( 'at' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:563:12: 'at'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:564:10: ( 'on' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:564:12: 'on'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:565:10: ( 'of' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:565:12: 'of'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:566:10: ( 'this' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:566:12: 'this'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:567:10: ( 'last' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:567:12: 'last'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:568:10: ( 'next' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:568:12: 'next'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:569:10: ( 'past' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:569:12: 'past'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:570:10: ( 'coming' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:570:12: 'coming'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:571:10: ( 'upcoming' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:571:12: 'upcoming'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:572:10: ( 'from' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:572:12: 'from'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:573:10: ( 'now' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:573:12: 'now'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:574:10: ( 'ago' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:574:12: 'ago'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:575:10: ( 'before' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:575:12: 'before'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:576:10: ( 'after' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:576:12: 'after'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:579:3: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:579:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:579:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt102=0;
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( ((LA102_0>='\t' && LA102_0<='\n')||LA102_0=='\r'||LA102_0==' ') ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt102 >= 1 ) break loop102;
                        EarlyExitException eee =
                            new EarlyExitException(102, input);
                        throw eee;
                }
                cnt102++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHITE_SPACE"

    // $ANTLR start "UNKNOWN"
    public final void mUNKNOWN() throws RecognitionException {
        try {
            int _type = UNKNOWN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:583:3: ( . )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:583:5: .
            {
            matchAny(); 
            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNKNOWN"

    public void mTokens() throws RecognitionException {
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:8: ( JANUARY | FEBRUARY | MARCH | APRIL | MAY | JUNE | JULY | AUGUST | SEPTEMBER | OCTOBER | NOVEMBER | DECEMBER | SUNDAY | MONDAY | TUESDAY | WEDNESDAY | THURSDAY | FRIDAY | SATURDAY | HOUR | DAY | WEEK | MONTH | YEAR | TODAY | TOMORROW | YESTERDAY | AM | PM | MILITARY_HOUR_SUFFIX | MIDNIGHT | NOON | INT_60_TO_99 | INT_32_TO_59 | INT_24_TO_31 | INT_13_TO_23 | INT_01_TO_12 | INT_00 | INT_0 | INT_1_TO_5 | INT_6_TO_9 | ONE | TWO | THREE | FOUR | FIVE | SIX | SEVEN | EIGHT | NINE | TEN | ELEVEN | TWELVE | THIRTEEN | FOURTEEN | FIFTEEN | SIXTEEN | SEVENTEEN | EIGHTEEN | NINETEEN | TWENTY | THIRTY | FIRST | SECOND | THIRD | FOURTH | FIFTH | SIXTH | SEVENTH | EIGHTH | NINTH | TENTH | ELEVENTH | TWELFTH | THIRTEENTH | FOURTEENTH | FIFTEENTH | SIXTEENTH | SEVENTEENTH | EIGHTEENTH | NINETEENTH | TWENTIETH | TWENTY_FIRST | TWENTY_SECOND | TWENTY_THIRD | TWENTY_FOURTH | TWENTY_FIFTH | TWENTY_SIXTH | TWENTY_SEVENTH | TWENTY_EIGHTH | TWENTY_NINTH | THIRTIETH | THIRTY_FIRST | COLON | COMMA | DASH | SLASH | DOT | SINGLE_QUOTE | IN | THE | AT | ON | OF | THIS | LAST | NEXT | PAST | COMING | UPCOMING | FROM | NOW | AGO | BEFORE | AFTER | WHITE_SPACE | UNKNOWN )
        int alt103=117;
        alt103 = dfa103.predict(input);
        switch (alt103) {
            case 1 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:10: JANUARY
                {
                mJANUARY(); 

                }
                break;
            case 2 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:18: FEBRUARY
                {
                mFEBRUARY(); 

                }
                break;
            case 3 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:27: MARCH
                {
                mMARCH(); 

                }
                break;
            case 4 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:33: APRIL
                {
                mAPRIL(); 

                }
                break;
            case 5 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:39: MAY
                {
                mMAY(); 

                }
                break;
            case 6 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:43: JUNE
                {
                mJUNE(); 

                }
                break;
            case 7 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:48: JULY
                {
                mJULY(); 

                }
                break;
            case 8 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:53: AUGUST
                {
                mAUGUST(); 

                }
                break;
            case 9 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:60: SEPTEMBER
                {
                mSEPTEMBER(); 

                }
                break;
            case 10 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:70: OCTOBER
                {
                mOCTOBER(); 

                }
                break;
            case 11 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:78: NOVEMBER
                {
                mNOVEMBER(); 

                }
                break;
            case 12 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:87: DECEMBER
                {
                mDECEMBER(); 

                }
                break;
            case 13 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:96: SUNDAY
                {
                mSUNDAY(); 

                }
                break;
            case 14 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:103: MONDAY
                {
                mMONDAY(); 

                }
                break;
            case 15 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:110: TUESDAY
                {
                mTUESDAY(); 

                }
                break;
            case 16 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:118: WEDNESDAY
                {
                mWEDNESDAY(); 

                }
                break;
            case 17 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:128: THURSDAY
                {
                mTHURSDAY(); 

                }
                break;
            case 18 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:137: FRIDAY
                {
                mFRIDAY(); 

                }
                break;
            case 19 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:144: SATURDAY
                {
                mSATURDAY(); 

                }
                break;
            case 20 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:153: HOUR
                {
                mHOUR(); 

                }
                break;
            case 21 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:158: DAY
                {
                mDAY(); 

                }
                break;
            case 22 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:162: WEEK
                {
                mWEEK(); 

                }
                break;
            case 23 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:167: MONTH
                {
                mMONTH(); 

                }
                break;
            case 24 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:173: YEAR
                {
                mYEAR(); 

                }
                break;
            case 25 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:178: TODAY
                {
                mTODAY(); 

                }
                break;
            case 26 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:184: TOMORROW
                {
                mTOMORROW(); 

                }
                break;
            case 27 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:193: YESTERDAY
                {
                mYESTERDAY(); 

                }
                break;
            case 28 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:203: AM
                {
                mAM(); 

                }
                break;
            case 29 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:206: PM
                {
                mPM(); 

                }
                break;
            case 30 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:209: MILITARY_HOUR_SUFFIX
                {
                mMILITARY_HOUR_SUFFIX(); 

                }
                break;
            case 31 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:230: MIDNIGHT
                {
                mMIDNIGHT(); 

                }
                break;
            case 32 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:239: NOON
                {
                mNOON(); 

                }
                break;
            case 33 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:244: INT_60_TO_99
                {
                mINT_60_TO_99(); 

                }
                break;
            case 34 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:257: INT_32_TO_59
                {
                mINT_32_TO_59(); 

                }
                break;
            case 35 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:270: INT_24_TO_31
                {
                mINT_24_TO_31(); 

                }
                break;
            case 36 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:283: INT_13_TO_23
                {
                mINT_13_TO_23(); 

                }
                break;
            case 37 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:296: INT_01_TO_12
                {
                mINT_01_TO_12(); 

                }
                break;
            case 38 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:309: INT_00
                {
                mINT_00(); 

                }
                break;
            case 39 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:316: INT_0
                {
                mINT_0(); 

                }
                break;
            case 40 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:322: INT_1_TO_5
                {
                mINT_1_TO_5(); 

                }
                break;
            case 41 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:333: INT_6_TO_9
                {
                mINT_6_TO_9(); 

                }
                break;
            case 42 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:344: ONE
                {
                mONE(); 

                }
                break;
            case 43 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:348: TWO
                {
                mTWO(); 

                }
                break;
            case 44 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:352: THREE
                {
                mTHREE(); 

                }
                break;
            case 45 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:358: FOUR
                {
                mFOUR(); 

                }
                break;
            case 46 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:363: FIVE
                {
                mFIVE(); 

                }
                break;
            case 47 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:368: SIX
                {
                mSIX(); 

                }
                break;
            case 48 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:372: SEVEN
                {
                mSEVEN(); 

                }
                break;
            case 49 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:378: EIGHT
                {
                mEIGHT(); 

                }
                break;
            case 50 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:384: NINE
                {
                mNINE(); 

                }
                break;
            case 51 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:389: TEN
                {
                mTEN(); 

                }
                break;
            case 52 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:393: ELEVEN
                {
                mELEVEN(); 

                }
                break;
            case 53 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:400: TWELVE
                {
                mTWELVE(); 

                }
                break;
            case 54 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:407: THIRTEEN
                {
                mTHIRTEEN(); 

                }
                break;
            case 55 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:416: FOURTEEN
                {
                mFOURTEEN(); 

                }
                break;
            case 56 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:425: FIFTEEN
                {
                mFIFTEEN(); 

                }
                break;
            case 57 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:433: SIXTEEN
                {
                mSIXTEEN(); 

                }
                break;
            case 58 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:441: SEVENTEEN
                {
                mSEVENTEEN(); 

                }
                break;
            case 59 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:451: EIGHTEEN
                {
                mEIGHTEEN(); 

                }
                break;
            case 60 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:460: NINETEEN
                {
                mNINETEEN(); 

                }
                break;
            case 61 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:469: TWENTY
                {
                mTWENTY(); 

                }
                break;
            case 62 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:476: THIRTY
                {
                mTHIRTY(); 

                }
                break;
            case 63 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:483: FIRST
                {
                mFIRST(); 

                }
                break;
            case 64 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:489: SECOND
                {
                mSECOND(); 

                }
                break;
            case 65 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:496: THIRD
                {
                mTHIRD(); 

                }
                break;
            case 66 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:502: FOURTH
                {
                mFOURTH(); 

                }
                break;
            case 67 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:509: FIFTH
                {
                mFIFTH(); 

                }
                break;
            case 68 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:515: SIXTH
                {
                mSIXTH(); 

                }
                break;
            case 69 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:521: SEVENTH
                {
                mSEVENTH(); 

                }
                break;
            case 70 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:529: EIGHTH
                {
                mEIGHTH(); 

                }
                break;
            case 71 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:536: NINTH
                {
                mNINTH(); 

                }
                break;
            case 72 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:542: TENTH
                {
                mTENTH(); 

                }
                break;
            case 73 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:548: ELEVENTH
                {
                mELEVENTH(); 

                }
                break;
            case 74 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:557: TWELFTH
                {
                mTWELFTH(); 

                }
                break;
            case 75 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:565: THIRTEENTH
                {
                mTHIRTEENTH(); 

                }
                break;
            case 76 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:576: FOURTEENTH
                {
                mFOURTEENTH(); 

                }
                break;
            case 77 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:587: FIFTEENTH
                {
                mFIFTEENTH(); 

                }
                break;
            case 78 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:597: SIXTEENTH
                {
                mSIXTEENTH(); 

                }
                break;
            case 79 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:607: SEVENTEENTH
                {
                mSEVENTEENTH(); 

                }
                break;
            case 80 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:619: EIGHTEENTH
                {
                mEIGHTEENTH(); 

                }
                break;
            case 81 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:630: NINETEENTH
                {
                mNINETEENTH(); 

                }
                break;
            case 82 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:641: TWENTIETH
                {
                mTWENTIETH(); 

                }
                break;
            case 83 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:651: TWENTY_FIRST
                {
                mTWENTY_FIRST(); 

                }
                break;
            case 84 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:664: TWENTY_SECOND
                {
                mTWENTY_SECOND(); 

                }
                break;
            case 85 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:678: TWENTY_THIRD
                {
                mTWENTY_THIRD(); 

                }
                break;
            case 86 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:691: TWENTY_FOURTH
                {
                mTWENTY_FOURTH(); 

                }
                break;
            case 87 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:705: TWENTY_FIFTH
                {
                mTWENTY_FIFTH(); 

                }
                break;
            case 88 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:718: TWENTY_SIXTH
                {
                mTWENTY_SIXTH(); 

                }
                break;
            case 89 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:731: TWENTY_SEVENTH
                {
                mTWENTY_SEVENTH(); 

                }
                break;
            case 90 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:746: TWENTY_EIGHTH
                {
                mTWENTY_EIGHTH(); 

                }
                break;
            case 91 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:760: TWENTY_NINTH
                {
                mTWENTY_NINTH(); 

                }
                break;
            case 92 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:773: THIRTIETH
                {
                mTHIRTIETH(); 

                }
                break;
            case 93 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:783: THIRTY_FIRST
                {
                mTHIRTY_FIRST(); 

                }
                break;
            case 94 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:796: COLON
                {
                mCOLON(); 

                }
                break;
            case 95 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:802: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 96 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:808: DASH
                {
                mDASH(); 

                }
                break;
            case 97 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:813: SLASH
                {
                mSLASH(); 

                }
                break;
            case 98 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:819: DOT
                {
                mDOT(); 

                }
                break;
            case 99 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:823: SINGLE_QUOTE
                {
                mSINGLE_QUOTE(); 

                }
                break;
            case 100 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:836: IN
                {
                mIN(); 

                }
                break;
            case 101 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:839: THE
                {
                mTHE(); 

                }
                break;
            case 102 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:843: AT
                {
                mAT(); 

                }
                break;
            case 103 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:846: ON
                {
                mON(); 

                }
                break;
            case 104 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:849: OF
                {
                mOF(); 

                }
                break;
            case 105 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:852: THIS
                {
                mTHIS(); 

                }
                break;
            case 106 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:857: LAST
                {
                mLAST(); 

                }
                break;
            case 107 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:862: NEXT
                {
                mNEXT(); 

                }
                break;
            case 108 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:867: PAST
                {
                mPAST(); 

                }
                break;
            case 109 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:872: COMING
                {
                mCOMING(); 

                }
                break;
            case 110 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:879: UPCOMING
                {
                mUPCOMING(); 

                }
                break;
            case 111 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:888: FROM
                {
                mFROM(); 

                }
                break;
            case 112 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:893: NOW
                {
                mNOW(); 

                }
                break;
            case 113 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:897: AGO
                {
                mAGO(); 

                }
                break;
            case 114 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:901: BEFORE
                {
                mBEFORE(); 

                }
                break;
            case 115 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:908: AFTER
                {
                mAFTER(); 

                }
                break;
            case 116 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:914: WHITE_SPACE
                {
                mWHITE_SPACE(); 

                }
                break;
            case 117 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:926: UNKNOWN
                {
                mUNKNOWN(); 

                }
                break;

        }

    }


    protected DFA57 dfa57 = new DFA57(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA103 dfa103 = new DFA103(this);
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
            return "432:1: THURSDAY : ( 'thursday' ( 's' )? | 'thur' ( DOT )? | 'thu' ( DOT )? | 'thus' ( DOT )? | 'thurs' ( DOT )? );";
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
            return "443:1: TOMORROW : ( 'tomorow' | 'tomorrow' | 'tommorow' | 'tommorrow' );";
        }
    }
    static final String DFA103_eotS =
        "\1\uffff\3\46\1\62\6\46\1\111\1\46\1\113\1\uffff\1\117\4\124\1\156"+
        "\1\46\1\124\3\117\6\uffff\5\46\26\uffff\1\u0090\25\uffff\1\u00a3"+
        "\1\uffff\1\u00a3\2\uffff\1\u00a3\1\u00a7\1\uffff\3\u00a7\5\u00a3"+
        "\1\u00a7\1\154\1\uffff\2\154\6\u00a7\36\uffff\1\u00be\3\uffff\1"+
        "\u00c3\16\uffff\1\u00c9\36\uffff\1\u00ce\7\uffff\1\u00d4\5\uffff"+
        "\1\u00d8\5\uffff\1\u00dd\1\u00df\7\uffff\1\u00e7\16\uffff\1\u00f0"+
        "\1\uffff\1\u00f2\1\uffff\1\u00f4\4\uffff\1\u00f8\3\uffff\1\u00fa"+
        "\1\u00fb\1\u00e6\1\uffff\1\u00fc\3\uffff";
    static final String DFA103_eofS =
        "\u00fd\uffff";
    static final String DFA103_minS =
        "\1\0\1\141\1\145\1\141\1\146\1\141\1\143\1\145\1\141\2\145\1\157"+
        "\1\145\1\141\1\uffff\6\60\1\151\4\60\6\uffff\1\156\1\141\1\157\1"+
        "\160\1\145\3\uffff\1\154\1\uffff\1\151\1\165\1\146\1\162\1\156\4"+
        "\uffff\1\164\2\uffff\1\143\2\uffff\1\170\1\uffff\1\145\1\uffff\1"+
        "\157\1\156\4\uffff\1\145\1\144\1\145\1\156\1\144\2\uffff\1\141\6"+
        "\uffff\1\164\1\uffff\1\163\2\uffff\2\164\1\uffff\1\163\1\156\1\162"+
        "\7\164\1\uffff\10\164\3\uffff\1\147\1\145\24\uffff\1\162\1\uffff"+
        "\1\164\2\uffff\1\164\1\145\1\uffff\1\145\1\164\5\uffff\1\145\2\uffff"+
        "\1\162\4\uffff\1\154\1\164\1\uffff\1\153\32\uffff\1\150\1\166\1"+
        "\164\1\145\2\uffff\1\162\1\156\1\145\1\uffff\1\164\1\144\1\uffff"+
        "\1\146\1\164\1\uffff\1\145\1\164\2\145\1\uffff\1\145\1\55\1\164"+
        "\2\145\1\uffff\1\145\1\uffff\1\151\1\uffff\1\145\1\156\1\145\1\156"+
        "\1\uffff\1\145\1\uffff\1\156\2\145\2\uffff\1\145\2\uffff\1\164\1"+
        "\156\1\164\1\145\1\164\3\156\1\uffff\1\164\1\uffff\1\156\1\uffff"+
        "\3\164\1\uffff\1\164\3\uffff";
    static final String DFA103_maxS =
        "\1\uffff\1\165\1\162\1\157\2\165\1\156\1\157\1\145\1\167\1\145\1"+
        "\157\1\145\1\141\1\uffff\1\164\1\162\1\164\1\156\1\163\1\71\1\154"+
        "\4\164\6\uffff\1\156\1\141\1\157\1\160\1\145\3\uffff\1\156\1\uffff"+
        "\1\157\1\165\1\166\1\171\1\156\4\uffff\1\164\2\uffff\1\166\2\uffff"+
        "\1\170\1\uffff\1\145\1\uffff\1\167\1\156\4\uffff\1\165\1\155\1\157"+
        "\1\156\1\145\2\uffff\1\163\6\uffff\1\164\1\uffff\1\163\2\uffff\2"+
        "\164\1\uffff\1\163\1\156\1\162\7\164\1\uffff\10\164\3\uffff\1\147"+
        "\1\145\24\uffff\1\162\1\uffff\1\164\2\uffff\1\164\1\145\1\uffff"+
        "\1\145\1\164\5\uffff\1\164\2\uffff\1\163\4\uffff\1\156\1\164\1\uffff"+
        "\1\153\32\uffff\1\164\1\166\1\164\1\150\2\uffff\1\162\1\156\1\150"+
        "\1\uffff\2\164\1\uffff\1\166\1\164\1\uffff\1\145\1\164\1\145\1\150"+
        "\1\uffff\1\145\1\156\1\164\2\145\1\uffff\1\171\1\uffff\1\171\1\uffff"+
        "\1\164\1\156\1\145\1\156\1\uffff\1\150\1\uffff\1\156\2\145\2\uffff"+
        "\1\145\2\uffff\1\164\1\156\1\164\1\145\1\164\3\156\1\uffff\1\164"+
        "\1\uffff\1\156\1\uffff\3\164\1\uffff\1\164\3\uffff";
    static final String DFA103_acceptS =
        "\16\uffff\1\36\13\uffff\1\136\1\137\1\140\1\141\1\142\1\143\5\uffff"+
        "\1\164\1\165\1\1\1\uffff\1\2\5\uffff\1\37\1\4\1\10\1\34\1\uffff"+
        "\1\146\1\161\1\uffff\1\15\1\23\1\uffff\1\12\1\uffff\1\150\2\uffff"+
        "\1\153\1\14\1\25\1\17\5\uffff\1\24\1\36\1\uffff\1\35\1\154\1\41"+
        "\1\104\1\51\1\42\1\uffff\1\101\1\uffff\1\50\1\102\2\uffff\1\100"+
        "\12\uffff\1\77\10\uffff\1\45\1\46\1\47\2\uffff\1\103\1\105\1\106"+
        "\1\107\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\152\1\155\1\156"+
        "\1\162\1\164\1\6\1\7\1\22\1\157\1\uffff\1\56\1\uffff\1\3\1\5\2\uffff"+
        "\1\11\2\uffff\1\52\1\147\1\13\1\40\1\160\1\uffff\1\21\1\54\1\uffff"+
        "\1\145\1\31\1\32\1\53\2\uffff\1\20\1\uffff\1\30\1\33\1\134\1\43"+
        "\1\135\1\126\1\122\1\44\1\123\1\124\1\125\1\127\1\130\1\131\1\132"+
        "\1\133\1\113\1\110\1\111\1\112\1\114\1\115\1\116\1\117\1\120\1\121"+
        "\4\uffff\1\16\1\27\3\uffff\1\57\2\uffff\1\151\2\uffff\1\63\4\uffff"+
        "\1\55\5\uffff\1\62\1\uffff\1\65\1\uffff\1\26\4\uffff\1\163\1\uffff"+
        "\1\60\3\uffff\1\76\1\75\1\uffff\1\73\1\61\10\uffff\1\64\1\uffff"+
        "\1\70\1\uffff\1\71\3\uffff\1\67\1\uffff\1\74\1\66\1\72";
    static final String DFA103_specialS =
        "\1\0\u00fc\uffff}>";
    static final String[] DFA103_transitionS = {
            "\11\46\2\45\2\46\1\45\22\46\1\45\6\46\1\37\4\46\1\33\1\34\1"+
            "\36\1\35\1\24\1\23\1\22\1\20\1\21\1\26\1\17\1\27\1\30\1\31\1"+
            "\32\15\46\1\16\30\46\1\4\1\44\1\42\1\10\1\25\1\2\1\46\1\13\1"+
            "\40\1\1\1\46\1\41\1\3\1\7\1\6\1\15\2\46\1\5\1\11\1\43\1\46\1"+
            "\12\1\46\1\14\uff86\46",
            "\1\47\23\uffff\1\50",
            "\1\51\3\uffff\1\54\5\uffff\1\53\2\uffff\1\52",
            "\1\55\7\uffff\1\57\5\uffff\1\56",
            "\1\63\1\65\10\uffff\1\60\3\uffff\1\64\1\61",
            "\1\70\3\uffff\1\66\3\uffff\1\71\13\uffff\1\67",
            "\1\72\2\uffff\1\74\7\uffff\1\73",
            "\1\77\3\uffff\1\76\5\uffff\1\75",
            "\1\101\3\uffff\1\100",
            "\1\106\2\uffff\1\103\6\uffff\1\104\5\uffff\1\102\1\uffff\1"+
            "\105",
            "\1\107",
            "\1\110",
            "\1\112",
            "\1\114",
            "",
            "\12\115\72\uffff\1\116",
            "\1\121\1\123\10\120\70\uffff\1\122",
            "\12\120\72\uffff\1\125",
            "\1\127\1\131\1\132\1\133\1\126\1\134\1\135\1\136\1\137\1\140"+
            "\64\uffff\1\130",
            "\1\142\1\144\1\145\1\141\1\146\1\147\1\150\1\151\1\152\1\153"+
            "\71\uffff\1\143",
            "\1\155\11\154",
            "\1\157\2\uffff\1\160",
            "\12\120\72\uffff\1\161",
            "\12\115\72\uffff\1\162",
            "\12\115\72\uffff\1\163",
            "\12\115\72\uffff\1\164",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "",
            "",
            "",
            "\1\u0082\1\uffff\1\u0081",
            "",
            "\1\u0083\5\uffff\1\u0084",
            "\1\u0085",
            "\1\u0087\13\uffff\1\143\3\uffff\1\u0086",
            "\1\u0088\6\uffff\1\u0089",
            "\1\u008a",
            "",
            "",
            "",
            "",
            "\1\u008b",
            "",
            "",
            "\1\130\14\uffff\1\u008c\5\uffff\1\u008d",
            "",
            "",
            "\1\u008e",
            "",
            "\1\u008f",
            "",
            "\1\u0092\6\uffff\1\u0091\1\u0093",
            "\1\u0094",
            "",
            "",
            "",
            "",
            "\1\u0098\3\uffff\1\u0097\10\uffff\1\u0096\2\uffff\1\u0095",
            "\1\u0099\10\uffff\1\u009a",
            "\1\u009c\11\uffff\1\u009b",
            "\1\u009d",
            "\1\u009e\1\u009f",
            "",
            "",
            "\1\u00a0\21\uffff\1\u00a1",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a2",
            "",
            "\1\u00a4",
            "",
            "",
            "\1\u00a5",
            "\1\u00a6",
            "",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "",
            "",
            "",
            "\1\u00ba",
            "\1\u00bb",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00bc",
            "",
            "\1\u00bd",
            "",
            "",
            "\1\u00bf",
            "\1\u00c0",
            "",
            "\1\u00c1",
            "\1\u00c2",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c4\16\uffff\1\164",
            "",
            "",
            "\1\u00c5\1\u00c6",
            "",
            "",
            "",
            "",
            "\1\u00c7\1\uffff\1\u00c8",
            "\1\u00b1",
            "",
            "\1\u00ca",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00cb\13\uffff\1\163",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00cf\2\uffff\1\161",
            "",
            "",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2\2\uffff\1\116",
            "",
            "\1\u00d3",
            "\1\122\17\uffff\1\u00d5",
            "",
            "\1\u00b3\17\uffff\1\u00d6",
            "\1\u00d7",
            "",
            "\1\70",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db\2\uffff\1\125",
            "",
            "\1\u00dc",
            "\1\u0092\100\uffff\1\u0092",
            "\1\u00de",
            "\1\u00e0",
            "\1\u00e1",
            "",
            "\1\u00e2\3\uffff\1\u00a2\17\uffff\1\u00e3",
            "",
            "\1\u00a6\17\uffff\1\u00e4",
            "",
            "\1\u00e5\16\uffff\1\u00e6",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "",
            "\1\u00eb\2\uffff\1\162",
            "",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "",
            "",
            "\1\u00ef",
            "",
            "",
            "\1\u00b2",
            "\1\u00f1",
            "\1\u00b5",
            "\1\u00f3",
            "\1\u00b6",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "",
            "\1\u00b4",
            "",
            "\1\u00f9",
            "",
            "\1\u00b9",
            "\1\u00b0",
            "\1\u00b8",
            "",
            "\1\u00b7",
            "",
            "",
            ""
    };

    static final short[] DFA103_eot = DFA.unpackEncodedString(DFA103_eotS);
    static final short[] DFA103_eof = DFA.unpackEncodedString(DFA103_eofS);
    static final char[] DFA103_min = DFA.unpackEncodedStringToUnsignedChars(DFA103_minS);
    static final char[] DFA103_max = DFA.unpackEncodedStringToUnsignedChars(DFA103_maxS);
    static final short[] DFA103_accept = DFA.unpackEncodedString(DFA103_acceptS);
    static final short[] DFA103_special = DFA.unpackEncodedString(DFA103_specialS);
    static final short[][] DFA103_transition;

    static {
        int numStates = DFA103_transitionS.length;
        DFA103_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA103_transition[i] = DFA.unpackEncodedString(DFA103_transitionS[i]);
        }
    }

    class DFA103 extends DFA {

        public DFA103(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 103;
            this.eot = DFA103_eot;
            this.eof = DFA103_eof;
            this.min = DFA103_min;
            this.max = DFA103_max;
            this.accept = DFA103_accept;
            this.special = DFA103_special;
            this.transition = DFA103_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( JANUARY | FEBRUARY | MARCH | APRIL | MAY | JUNE | JULY | AUGUST | SEPTEMBER | OCTOBER | NOVEMBER | DECEMBER | SUNDAY | MONDAY | TUESDAY | WEDNESDAY | THURSDAY | FRIDAY | SATURDAY | HOUR | DAY | WEEK | MONTH | YEAR | TODAY | TOMORROW | YESTERDAY | AM | PM | MILITARY_HOUR_SUFFIX | MIDNIGHT | NOON | INT_60_TO_99 | INT_32_TO_59 | INT_24_TO_31 | INT_13_TO_23 | INT_01_TO_12 | INT_00 | INT_0 | INT_1_TO_5 | INT_6_TO_9 | ONE | TWO | THREE | FOUR | FIVE | SIX | SEVEN | EIGHT | NINE | TEN | ELEVEN | TWELVE | THIRTEEN | FOURTEEN | FIFTEEN | SIXTEEN | SEVENTEEN | EIGHTEEN | NINETEEN | TWENTY | THIRTY | FIRST | SECOND | THIRD | FOURTH | FIFTH | SIXTH | SEVENTH | EIGHTH | NINTH | TENTH | ELEVENTH | TWELFTH | THIRTEENTH | FOURTEENTH | FIFTEENTH | SIXTEENTH | SEVENTEENTH | EIGHTEENTH | NINETEENTH | TWENTIETH | TWENTY_FIRST | TWENTY_SECOND | TWENTY_THIRD | TWENTY_FOURTH | TWENTY_FIFTH | TWENTY_SIXTH | TWENTY_SEVENTH | TWENTY_EIGHTH | TWENTY_NINTH | THIRTIETH | THIRTY_FIRST | COLON | COMMA | DASH | SLASH | DOT | SINGLE_QUOTE | IN | THE | AT | ON | OF | THIS | LAST | NEXT | PAST | COMING | UPCOMING | FROM | NOW | AGO | BEFORE | AFTER | WHITE_SPACE | UNKNOWN );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA103_0 = input.LA(1);

                        s = -1;
                        if ( (LA103_0=='j') ) {s = 1;}

                        else if ( (LA103_0=='f') ) {s = 2;}

                        else if ( (LA103_0=='m') ) {s = 3;}

                        else if ( (LA103_0=='a') ) {s = 4;}

                        else if ( (LA103_0=='s') ) {s = 5;}

                        else if ( (LA103_0=='o') ) {s = 6;}

                        else if ( (LA103_0=='n') ) {s = 7;}

                        else if ( (LA103_0=='d') ) {s = 8;}

                        else if ( (LA103_0=='t') ) {s = 9;}

                        else if ( (LA103_0=='w') ) {s = 10;}

                        else if ( (LA103_0=='h') ) {s = 11;}

                        else if ( (LA103_0=='y') ) {s = 12;}

                        else if ( (LA103_0=='p') ) {s = 13;}

                        else if ( (LA103_0=='H') ) {s = 14;}

                        else if ( (LA103_0=='6') ) {s = 15;}

                        else if ( (LA103_0=='3') ) {s = 16;}

                        else if ( (LA103_0=='4') ) {s = 17;}

                        else if ( (LA103_0=='2') ) {s = 18;}

                        else if ( (LA103_0=='1') ) {s = 19;}

                        else if ( (LA103_0=='0') ) {s = 20;}

                        else if ( (LA103_0=='e') ) {s = 21;}

                        else if ( (LA103_0=='5') ) {s = 22;}

                        else if ( (LA103_0=='7') ) {s = 23;}

                        else if ( (LA103_0=='8') ) {s = 24;}

                        else if ( (LA103_0=='9') ) {s = 25;}

                        else if ( (LA103_0==':') ) {s = 26;}

                        else if ( (LA103_0==',') ) {s = 27;}

                        else if ( (LA103_0=='-') ) {s = 28;}

                        else if ( (LA103_0=='/') ) {s = 29;}

                        else if ( (LA103_0=='.') ) {s = 30;}

                        else if ( (LA103_0=='\'') ) {s = 31;}

                        else if ( (LA103_0=='i') ) {s = 32;}

                        else if ( (LA103_0=='l') ) {s = 33;}

                        else if ( (LA103_0=='c') ) {s = 34;}

                        else if ( (LA103_0=='u') ) {s = 35;}

                        else if ( (LA103_0=='b') ) {s = 36;}

                        else if ( ((LA103_0>='\t' && LA103_0<='\n')||LA103_0=='\r'||LA103_0==' ') ) {s = 37;}

                        else if ( ((LA103_0>='\u0000' && LA103_0<='\b')||(LA103_0>='\u000B' && LA103_0<='\f')||(LA103_0>='\u000E' && LA103_0<='\u001F')||(LA103_0>='!' && LA103_0<='&')||(LA103_0>='(' && LA103_0<='+')||(LA103_0>=';' && LA103_0<='G')||(LA103_0>='I' && LA103_0<='`')||LA103_0=='g'||LA103_0=='k'||(LA103_0>='q' && LA103_0<='r')||LA103_0=='v'||LA103_0=='x'||(LA103_0>='z' && LA103_0<='\uFFFF')) ) {s = 38;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 103, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}