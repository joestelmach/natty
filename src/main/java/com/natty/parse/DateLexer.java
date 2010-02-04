// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g 2010-02-03 14:35:57
 package com.natty.parse; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class DateLexer extends Lexer {
    public static final int NINETEEN=85;
    public static final int SEPTEMBER=52;
    public static final int WEEK=41;
    public static final int THIRTEEN_TO_TWENTY_THREE=126;
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
    public static final int MARCH=46;
    public static final int EOF=-1;
    public static final int MONTH=42;
    public static final int PAST=34;
    public static final int SEVENTEEN=83;
    public static final int DATE_TIME=18;
    public static final int AM_PM=7;
    public static final int SIXTY_TO_NINETY_NINE=129;
    public static final int TWENTY_SEVENTH=114;
    public static final int TWENTY_FIFTH=112;
    public static final int EIGHTEENTH=105;
    public static final int SEEK_DIR=13;
    public static final int SPAN=8;
    public static final int THIS=32;
    public static final int NOON=31;
    public static final int THIRTIETH=117;
    public static final int LAST=33;
    public static final int EIGHTEEN=84;
    public static final int RELATIVE_DATE=17;
    public static final int TOMORROW=23;
    public static final int TWENTY_FOUR_TO_THIRTY_ONE=127;
    public static final int FOUR_DIGIT=120;
    public static final int ONE_TO_NINE=123;
    public static final int FOURTH=91;
    public static final int FIFTEENTH=102;
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
    public static final int THIRTY_TWO_TO_FIFTY_NINE=128;
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
    public static final int TEN_TO_TWELVE=124;
    public static final int ONE_ZERO=125;
    public static final int TWELVE=78;
    public static final int AGO=40;
    public static final int ELEVENTH=98;
    public static final int BEFORE=28;
    public static final int TWO=68;
    public static final int AFTER=27;
    public static final int SIXTEENTH=103;
    public static final int JANUARY=44;
    public static final int THIRTEENTH=100;
    public static final int MINUTES=6;
    public static final int COLON=29;
    public static final int DAY_OF_MONTH=11;
    public static final int FIFTEEN=81;
    public static final int TWELFTH=99;
    public static final int NINE=75;
    public static final int SIXTH=93;
    public static final int THREE=69;
    public static final int TWENTY_FIRST=108;
    public static final int FOURTEEN=80;
    public static final int TWENTY_THIRD=110;
    public static final int YESTERDAY=24;
    public static final int HOURS=5;
    public static final int SEVENTEENTH=104;
    public static final int FIRST=88;
    public static final int THIRTY_FIRST=118;

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

    // $ANTLR start "T__132"
    public final void mT__132() throws RecognitionException {
        try {
            int _type = T__132;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:5:8: ( '\\'' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:5:10: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__132"

    // $ANTLR start "MIDNIGHT"
    public final void mMIDNIGHT() throws RecognitionException {
        try {
            int _type = MIDNIGHT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:361:10: ( 'midnight' | 'mid-night' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='m') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='i') ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2=='d') ) {
                        int LA1_3 = input.LA(4);

                        if ( (LA1_3=='n') ) {
                            alt1=1;
                        }
                        else if ( (LA1_3=='-') ) {
                            alt1=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:361:12: 'midnight'
                    {
                    match("midnight"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:361:25: 'mid-night'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:362:10: ( 'noon' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:362:12: 'noon'
            {
            match("noon"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOON"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:364:5: ( 'in' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:364:7: 'in'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:365:5: ( 'the' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:365:7: 'the'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:366:5: ( 'at' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:366:7: 'at'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:367:5: ( 'on' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:367:7: 'on'
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

    // $ANTLR start "THIS"
    public final void mTHIS() throws RecognitionException {
        try {
            int _type = THIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:370:10: ( 'this' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:370:12: 'this'
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

    // $ANTLR start "AFTER"
    public final void mAFTER() throws RecognitionException {
        try {
            int _type = AFTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:371:10: ( 'after' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:371:12: 'after'
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

    // $ANTLR start "BEFORE"
    public final void mBEFORE() throws RecognitionException {
        try {
            int _type = BEFORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:372:10: ( 'before' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:372:12: 'before'
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

    // $ANTLR start "LAST"
    public final void mLAST() throws RecognitionException {
        try {
            int _type = LAST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:373:10: ( 'last' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:373:12: 'last'
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

    // $ANTLR start "PAST"
    public final void mPAST() throws RecognitionException {
        try {
            int _type = PAST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:374:10: ( 'past' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:374:12: 'past'
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

    // $ANTLR start "NEXT"
    public final void mNEXT() throws RecognitionException {
        try {
            int _type = NEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:375:10: ( 'next' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:375:12: 'next'
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

    // $ANTLR start "COMING"
    public final void mCOMING() throws RecognitionException {
        try {
            int _type = COMING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:376:10: ( 'coming' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:376:12: 'coming'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:377:10: ( 'upcoming' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:377:12: 'upcoming'
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

    // $ANTLR start "FROM_NOW"
    public final void mFROM_NOW() throws RecognitionException {
        try {
            int _type = FROM_NOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:378:10: ( 'from now' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:378:12: 'from now'
            {
            match("from now"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FROM_NOW"

    // $ANTLR start "AGO"
    public final void mAGO() throws RecognitionException {
        try {
            int _type = AGO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:379:10: ( 'ago' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:379:12: 'ago'
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

    // $ANTLR start "JANUARY"
    public final void mJANUARY() throws RecognitionException {
        try {
            int _type = JANUARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:382:11: ( 'january' | 'jan' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='j') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='a') ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2=='n') ) {
                        int LA2_3 = input.LA(4);

                        if ( (LA2_3=='u') ) {
                            alt2=1;
                        }
                        else {
                            alt2=2;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:382:13: 'january'
                    {
                    match("january"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:382:27: 'jan'
                    {
                    match("jan"); 


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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:383:11: ( 'february' | 'feb' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='f') ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='e') ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2=='b') ) {
                        int LA3_3 = input.LA(4);

                        if ( (LA3_3=='r') ) {
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:383:13: 'february'
                    {
                    match("february"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:383:27: 'feb'
                    {
                    match("feb"); 


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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:384:11: ( 'march' | 'mar' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='m') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='a') ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2=='r') ) {
                        int LA4_3 = input.LA(4);

                        if ( (LA4_3=='c') ) {
                            alt4=1;
                        }
                        else {
                            alt4=2;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:384:13: 'march'
                    {
                    match("march"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:384:27: 'mar'
                    {
                    match("mar"); 


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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:385:11: ( 'april' | 'apr' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='a') ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='p') ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2=='r') ) {
                        int LA5_3 = input.LA(4);

                        if ( (LA5_3=='i') ) {
                            alt5=1;
                        }
                        else {
                            alt5=2;}
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:385:13: 'april'
                    {
                    match("april"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:385:27: 'apr'
                    {
                    match("apr"); 


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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:386:11: ( 'may' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:386:13: 'may'
            {
            match("may"); 


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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:387:11: ( 'june' | 'jun' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='j') ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1=='u') ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2=='n') ) {
                        int LA6_3 = input.LA(4);

                        if ( (LA6_3=='e') ) {
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:387:13: 'june'
                    {
                    match("june"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:387:27: 'jun'
                    {
                    match("jun"); 


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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:388:11: ( 'july' | 'jul' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='j') ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1=='u') ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2=='l') ) {
                        int LA7_3 = input.LA(4);

                        if ( (LA7_3=='y') ) {
                            alt7=1;
                        }
                        else {
                            alt7=2;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:388:13: 'july'
                    {
                    match("july"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:388:27: 'jul'
                    {
                    match("jul"); 


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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:389:11: ( 'august' | 'aug' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='a') ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1=='u') ) {
                    int LA8_2 = input.LA(3);

                    if ( (LA8_2=='g') ) {
                        int LA8_3 = input.LA(4);

                        if ( (LA8_3=='u') ) {
                            alt8=1;
                        }
                        else {
                            alt8=2;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:389:13: 'august'
                    {
                    match("august"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:389:27: 'aug'
                    {
                    match("aug"); 


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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:390:11: ( 'september' | 'sep' | 'sept' )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='s') ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1=='e') ) {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2=='p') ) {
                        int LA9_3 = input.LA(4);

                        if ( (LA9_3=='t') ) {
                            int LA9_4 = input.LA(5);

                            if ( (LA9_4=='e') ) {
                                alt9=1;
                            }
                            else {
                                alt9=3;}
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:390:13: 'september'
                    {
                    match("september"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:390:27: 'sep'
                    {
                    match("sep"); 


                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:390:35: 'sept'
                    {
                    match("sept"); 


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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:391:11: ( 'october' | 'oct' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='o') ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1=='c') ) {
                    int LA10_2 = input.LA(3);

                    if ( (LA10_2=='t') ) {
                        int LA10_3 = input.LA(4);

                        if ( (LA10_3=='o') ) {
                            alt10=1;
                        }
                        else {
                            alt10=2;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:391:13: 'october'
                    {
                    match("october"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:391:27: 'oct'
                    {
                    match("oct"); 


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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:392:11: ( 'november' | 'nov' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='n') ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1=='o') ) {
                    int LA11_2 = input.LA(3);

                    if ( (LA11_2=='v') ) {
                        int LA11_3 = input.LA(4);

                        if ( (LA11_3=='e') ) {
                            alt11=1;
                        }
                        else {
                            alt11=2;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:392:13: 'november'
                    {
                    match("november"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:392:27: 'nov'
                    {
                    match("nov"); 


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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:393:11: ( 'december' | 'dec' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='d') ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1=='e') ) {
                    int LA12_2 = input.LA(3);

                    if ( (LA12_2=='c') ) {
                        int LA12_3 = input.LA(4);

                        if ( (LA12_3=='e') ) {
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:393:13: 'december'
                    {
                    match("december"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:393:27: 'dec'
                    {
                    match("dec"); 


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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:396:11: ( 'sunday' | 'sundays' | 'sun' | 'suns' )
            int alt13=4;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:396:13: 'sunday'
                    {
                    match("sunday"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:396:27: 'sundays'
                    {
                    match("sundays"); 


                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:396:42: 'sun'
                    {
                    match("sun"); 


                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:396:51: 'suns'
                    {
                    match("suns"); 


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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:397:11: ( 'monday' | 'mondays' | 'mon' | 'mons' )
            int alt14=4;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:397:13: 'monday'
                    {
                    match("monday"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:397:27: 'mondays'
                    {
                    match("mondays"); 


                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:397:42: 'mon'
                    {
                    match("mon"); 


                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:397:51: 'mons'
                    {
                    match("mons"); 


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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:398:11: ( 'tuesday' | 'tuesdays' | 'tues' | 'tue' )
            int alt15=4;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:398:13: 'tuesday'
                    {
                    match("tuesday"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:398:27: 'tuesdays'
                    {
                    match("tuesdays"); 


                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:398:42: 'tues'
                    {
                    match("tues"); 


                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:398:51: 'tue'
                    {
                    match("tue"); 


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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:399:11: ( 'wednesday' | 'wednesdays' | 'wed' | 'weds' )
            int alt16=4;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:399:13: 'wednesday'
                    {
                    match("wednesday"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:399:27: 'wednesdays'
                    {
                    match("wednesdays"); 


                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:399:42: 'wed'
                    {
                    match("wed"); 


                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:399:51: 'weds'
                    {
                    match("weds"); 


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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:400:11: ( 'thursday' | 'thursdays' | 'thur' | 'thu' | 'thus' | 'thurs' )
            int alt17=6;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:400:13: 'thursday'
                    {
                    match("thursday"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:400:27: 'thursdays'
                    {
                    match("thursdays"); 


                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:400:42: 'thur'
                    {
                    match("thur"); 


                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:400:51: 'thu'
                    {
                    match("thu"); 


                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:400:59: 'thus'
                    {
                    match("thus"); 


                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:400:68: 'thurs'
                    {
                    match("thurs"); 


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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:401:11: ( 'friday' | 'fridays' | 'fri' | 'fris' )
            int alt18=4;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:401:13: 'friday'
                    {
                    match("friday"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:401:27: 'fridays'
                    {
                    match("fridays"); 


                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:401:42: 'fri'
                    {
                    match("fri"); 


                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:401:51: 'fris'
                    {
                    match("fris"); 


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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:402:11: ( 'saturday' | 'saturdays' | 'sat' | 'sats' )
            int alt19=4;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:402:13: 'saturday'
                    {
                    match("saturday"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:402:27: 'saturdays'
                    {
                    match("saturdays"); 


                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:402:42: 'sat'
                    {
                    match("sat"); 


                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:402:51: 'sats'
                    {
                    match("sats"); 


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

    // $ANTLR start "TODAY"
    public final void mTODAY() throws RecognitionException {
        try {
            int _type = TODAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:405:11: ( 'today' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:405:13: 'today'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:406:11: ( 'tomorow' | 'tomorrow' | 'tommorow' | 'tommorrow' )
            int alt20=4;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:406:13: 'tomorow'
                    {
                    match("tomorow"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:406:27: 'tomorrow'
                    {
                    match("tomorrow"); 


                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:406:42: 'tommorow'
                    {
                    match("tommorow"); 


                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:406:55: 'tommorrow'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:407:11: ( 'yesterday' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:407:13: 'yesterday'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:410:4: ( 'am' | 'a.m.' | 'a' )
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='a') ) {
                switch ( input.LA(2) ) {
                case 'm':
                    {
                    alt21=1;
                    }
                    break;
                case '.':
                    {
                    alt21=2;
                    }
                    break;
                default:
                    alt21=3;}

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:410:6: 'am'
                    {
                    match("am"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:410:13: 'a.m.'
                    {
                    match("a.m."); 


                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:410:22: 'a'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:411:4: ( 'pm' | 'p.m.' | 'p' )
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='p') ) {
                switch ( input.LA(2) ) {
                case 'm':
                    {
                    alt22=1;
                    }
                    break;
                case '.':
                    {
                    alt22=2;
                    }
                    break;
                default:
                    alt22=3;}

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:411:6: 'pm'
                    {
                    match("pm"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:411:13: 'p.m.'
                    {
                    match("p.m."); 


                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:411:22: 'p'
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

    // $ANTLR start "DAY"
    public final void mDAY() throws RecognitionException {
        try {
            int _type = DAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:414:7: ( 'day' | 'days' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='d') ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1=='a') ) {
                    int LA23_2 = input.LA(3);

                    if ( (LA23_2=='y') ) {
                        int LA23_3 = input.LA(4);

                        if ( (LA23_3=='s') ) {
                            alt23=2;
                        }
                        else {
                            alt23=1;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:414:9: 'day'
                    {
                    match("day"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:414:19: 'days'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:415:7: ( 'week' | 'weeks' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='w') ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1=='e') ) {
                    int LA24_2 = input.LA(3);

                    if ( (LA24_2=='e') ) {
                        int LA24_3 = input.LA(4);

                        if ( (LA24_3=='k') ) {
                            int LA24_4 = input.LA(5);

                            if ( (LA24_4=='s') ) {
                                alt24=2;
                            }
                            else {
                                alt24=1;}
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 24, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:415:9: 'week'
                    {
                    match("week"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:415:19: 'weeks'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:416:7: ( 'month' | 'months' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='m') ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1=='o') ) {
                    int LA25_2 = input.LA(3);

                    if ( (LA25_2=='n') ) {
                        int LA25_3 = input.LA(4);

                        if ( (LA25_3=='t') ) {
                            int LA25_4 = input.LA(5);

                            if ( (LA25_4=='h') ) {
                                int LA25_5 = input.LA(6);

                                if ( (LA25_5=='s') ) {
                                    alt25=2;
                                }
                                else {
                                    alt25=1;}
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 25, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 25, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:416:9: 'month'
                    {
                    match("month"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:416:19: 'months'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:417:7: ( 'year' | 'years' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='y') ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1=='e') ) {
                    int LA26_2 = input.LA(3);

                    if ( (LA26_2=='a') ) {
                        int LA26_3 = input.LA(4);

                        if ( (LA26_3=='r') ) {
                            int LA26_4 = input.LA(5);

                            if ( (LA26_4=='s') ) {
                                alt26=2;
                            }
                            else {
                                alt26=1;}
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 26, 3, input);

                            throw nvae;
                        }
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:417:9: 'year'
                    {
                    match("year"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:417:19: 'years'
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

    // $ANTLR start "ONE"
    public final void mONE() throws RecognitionException {
        try {
            int _type = ONE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:420:11: ( 'one' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:420:13: 'one'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:421:11: ( 'two' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:421:13: 'two'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:422:11: ( 'three' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:422:13: 'three'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:423:11: ( 'four' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:423:13: 'four'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:424:11: ( 'five' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:424:13: 'five'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:425:11: ( 'six' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:425:13: 'six'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:426:11: ( 'seven' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:426:13: 'seven'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:427:11: ( 'eight' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:427:13: 'eight'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:428:11: ( 'nine' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:428:13: 'nine'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:429:11: ( 'ten' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:429:13: 'ten'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:430:11: ( 'eleven' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:430:13: 'eleven'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:431:11: ( 'twelve' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:431:13: 'twelve'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:432:11: ( 'thirteen' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:432:13: 'thirteen'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:433:11: ( 'fourteen' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:433:13: 'fourteen'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:434:11: ( 'fifteen' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:434:13: 'fifteen'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:435:11: ( 'sixteen' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:435:13: 'sixteen'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:436:11: ( 'seventeen' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:436:13: 'seventeen'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:437:11: ( 'eighteen' | 'eightteen' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='e') ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1=='i') ) {
                    int LA27_2 = input.LA(3);

                    if ( (LA27_2=='g') ) {
                        int LA27_3 = input.LA(4);

                        if ( (LA27_3=='h') ) {
                            int LA27_4 = input.LA(5);

                            if ( (LA27_4=='t') ) {
                                int LA27_5 = input.LA(6);

                                if ( (LA27_5=='e') ) {
                                    alt27=1;
                                }
                                else if ( (LA27_5=='t') ) {
                                    alt27=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 27, 5, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 27, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 27, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:437:13: 'eighteen'
                    {
                    match("eighteen"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:437:26: 'eightteen'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:438:11: ( 'nineteen' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:438:13: 'nineteen'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:439:11: ( 'twenty' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:439:13: 'twenty'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:440:11: ( 'thirty' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:440:13: 'thirty'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:443:16: ( 'first' | '1st' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='f') ) {
                alt28=1;
            }
            else if ( (LA28_0=='1') ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:443:18: 'first'
                    {
                    match("first"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:443:34: '1st'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:444:16: ( 'second' | '2nd' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0=='s') ) {
                alt29=1;
            }
            else if ( (LA29_0=='2') ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:444:18: 'second'
                    {
                    match("second"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:444:34: '2nd'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:445:16: ( 'third' | '3rd' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='t') ) {
                alt30=1;
            }
            else if ( (LA30_0=='3') ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:445:18: 'third'
                    {
                    match("third"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:445:34: '3rd'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:446:16: ( 'fourth' | '4th' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0=='f') ) {
                alt31=1;
            }
            else if ( (LA31_0=='4') ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:446:18: 'fourth'
                    {
                    match("fourth"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:446:34: '4th'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:447:16: ( 'fifth' | '5th' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0=='f') ) {
                alt32=1;
            }
            else if ( (LA32_0=='5') ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:447:18: 'fifth'
                    {
                    match("fifth"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:447:34: '5th'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:448:16: ( 'sixth' | '6th' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0=='s') ) {
                alt33=1;
            }
            else if ( (LA33_0=='6') ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:448:18: 'sixth'
                    {
                    match("sixth"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:448:34: '6th'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:449:16: ( 'seventh' | '7th' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0=='s') ) {
                alt34=1;
            }
            else if ( (LA34_0=='7') ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:449:18: 'seventh'
                    {
                    match("seventh"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:449:34: '7th'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:450:16: ( 'eigth' | '8th' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0=='e') ) {
                alt35=1;
            }
            else if ( (LA35_0=='8') ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:450:18: 'eigth'
                    {
                    match("eigth"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:450:34: '8th'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:451:16: ( 'ninth' | '9th' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0=='n') ) {
                alt36=1;
            }
            else if ( (LA36_0=='9') ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:451:18: 'ninth'
                    {
                    match("ninth"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:451:34: '9th'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:452:16: ( 'tenth' | '10th' )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0=='t') ) {
                alt37=1;
            }
            else if ( (LA37_0=='1') ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:452:18: 'tenth'
                    {
                    match("tenth"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:452:34: '10th'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:453:16: ( 'eleventh' | '11th' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0=='e') ) {
                alt38=1;
            }
            else if ( (LA38_0=='1') ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:453:18: 'eleventh'
                    {
                    match("eleventh"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:453:34: '11th'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:454:16: ( 'twelfth' | '12th' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0=='t') ) {
                alt39=1;
            }
            else if ( (LA39_0=='1') ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:454:18: 'twelfth'
                    {
                    match("twelfth"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:454:34: '12th'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:455:16: ( 'thirteenth' | '13th' )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0=='t') ) {
                alt40=1;
            }
            else if ( (LA40_0=='1') ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:455:18: 'thirteenth'
                    {
                    match("thirteenth"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:455:34: '13th'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:456:16: ( 'fourteenth' | '14th' )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0=='f') ) {
                alt41=1;
            }
            else if ( (LA41_0=='1') ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:456:18: 'fourteenth'
                    {
                    match("fourteenth"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:456:34: '14th'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:457:16: ( 'fifteenth' | '15th' )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0=='f') ) {
                alt42=1;
            }
            else if ( (LA42_0=='1') ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:457:18: 'fifteenth'
                    {
                    match("fifteenth"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:457:34: '15th'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:458:16: ( 'sixteenth' | '16th' )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0=='s') ) {
                alt43=1;
            }
            else if ( (LA43_0=='1') ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:458:18: 'sixteenth'
                    {
                    match("sixteenth"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:458:34: '16th'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:459:16: ( 'seventeenth' | '17th' )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0=='s') ) {
                alt44=1;
            }
            else if ( (LA44_0=='1') ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:459:18: 'seventeenth'
                    {
                    match("seventeenth"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:459:34: '17th'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:460:16: ( 'eighteenth' | '18th' )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0=='e') ) {
                alt45=1;
            }
            else if ( (LA45_0=='1') ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:460:18: 'eighteenth'
                    {
                    match("eighteenth"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:460:34: '18th'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:461:16: ( 'nineteenth' | '19th' )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0=='n') ) {
                alt46=1;
            }
            else if ( (LA46_0=='1') ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:461:18: 'nineteenth'
                    {
                    match("nineteenth"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:461:34: '19th'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:462:16: ( 'twentieth' | '20th' )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0=='t') ) {
                alt47=1;
            }
            else if ( (LA47_0=='2') ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:462:18: 'twentieth'
                    {
                    match("twentieth"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:462:34: '20th'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:463:16: ( '21st' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:463:18: '21st'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:464:16: ( '22nd' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:464:18: '22nd'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:465:16: ( '23rd' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:465:18: '23rd'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:466:16: ( '24th' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:466:18: '24th'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:467:16: ( '25th' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:467:18: '25th'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:468:16: ( '26th' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:468:18: '26th'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:469:16: ( '27th' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:469:18: '27th'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:470:16: ( '28th' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:470:18: '28th'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:471:16: ( '29th' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:471:18: '29th'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:472:16: ( 'thirtieth' | '30th' )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0=='t') ) {
                alt48=1;
            }
            else if ( (LA48_0=='3') ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:472:18: 'thirtieth'
                    {
                    match("thirtieth"); 


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:472:32: '30th'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:473:16: ( '31st' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:473:18: '31st'
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

    // $ANTLR start "PREFIXED_ONE_TO_NINE"
    public final void mPREFIXED_ONE_TO_NINE() throws RecognitionException {
        try {
            int _type = PREFIXED_ONE_TO_NINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:476:22: ( ONE_ZERO '1' .. '9' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:476:24: ONE_ZERO '1' .. '9'
            {
            mONE_ZERO(); 
            matchRange('1','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PREFIXED_ONE_TO_NINE"

    // $ANTLR start "ONE_TO_NINE"
    public final void mONE_TO_NINE() throws RecognitionException {
        try {
            int _type = ONE_TO_NINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:479:13: ( '1' .. '9' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:479:15: '1' .. '9'
            {
            matchRange('1','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ONE_TO_NINE"

    // $ANTLR start "TEN_TO_TWELVE"
    public final void mTEN_TO_TWELVE() throws RecognitionException {
        try {
            int _type = TEN_TO_TWELVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:483:3: ( '1' '0' .. '2' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:483:5: '1' '0' .. '2'
            {
            match('1'); 
            matchRange('0','2'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TEN_TO_TWELVE"

    // $ANTLR start "THIRTEEN_TO_TWENTY_THREE"
    public final void mTHIRTEEN_TO_TWENTY_THREE() throws RecognitionException {
        try {
            int _type = THIRTEEN_TO_TWENTY_THREE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:488:3: ( '1' '3' .. '9' | '2' '0' .. '3' )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0=='1') ) {
                alt49=1;
            }
            else if ( (LA49_0=='2') ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:488:5: '1' '3' .. '9'
                    {
                    match('1'); 
                    matchRange('3','9'); 

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:489:5: '2' '0' .. '3'
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
    // $ANTLR end "THIRTEEN_TO_TWENTY_THREE"

    // $ANTLR start "TWENTY_FOUR_TO_THIRTY_ONE"
    public final void mTWENTY_FOUR_TO_THIRTY_ONE() throws RecognitionException {
        try {
            int _type = TWENTY_FOUR_TO_THIRTY_ONE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:494:3: ( '2' '4' .. '9' | '3' '0' .. '1' )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0=='2') ) {
                alt50=1;
            }
            else if ( (LA50_0=='3') ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:494:5: '2' '4' .. '9'
                    {
                    match('2'); 
                    matchRange('4','9'); 

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:495:5: '3' '0' .. '1'
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
    // $ANTLR end "TWENTY_FOUR_TO_THIRTY_ONE"

    // $ANTLR start "THIRTY_TWO_TO_FIFTY_NINE"
    public final void mTHIRTY_TWO_TO_FIFTY_NINE() throws RecognitionException {
        try {
            int _type = THIRTY_TWO_TO_FIFTY_NINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:500:3: ( '3' '2' .. '9' | '4' .. '5' DIGIT )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0=='3') ) {
                alt51=1;
            }
            else if ( ((LA51_0>='4' && LA51_0<='5')) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:500:5: '3' '2' .. '9'
                    {
                    match('3'); 
                    matchRange('2','9'); 

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:501:5: '4' .. '5' DIGIT
                    {
                    matchRange('4','5'); 
                    mDIGIT(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THIRTY_TWO_TO_FIFTY_NINE"

    // $ANTLR start "SIXTY_TO_NINETY_NINE"
    public final void mSIXTY_TO_NINETY_NINE() throws RecognitionException {
        try {
            int _type = SIXTY_TO_NINETY_NINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:506:3: ( '6' .. '9' DIGIT )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:506:5: '6' .. '9' DIGIT
            {
            matchRange('6','9'); 
            mDIGIT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SIXTY_TO_NINETY_NINE"

    // $ANTLR start "ONE_ZERO"
    public final void mONE_ZERO() throws RecognitionException {
        try {
            int _type = ONE_ZERO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:509:10: ( '0' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:509:12: '0'
            {
            match('0'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ONE_ZERO"

    // $ANTLR start "TWO_ZEROS"
    public final void mTWO_ZEROS() throws RecognitionException {
        try {
            int _type = TWO_ZEROS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:511:11: ( '00' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:511:13: '00'
            {
            match("00"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TWO_ZEROS"

    // $ANTLR start "THREE_DIGIT"
    public final void mTHREE_DIGIT() throws RecognitionException {
        try {
            int _type = THREE_DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:514:3: ( DIGIT DIGIT DIGIT )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:514:5: DIGIT DIGIT DIGIT
            {
            mDIGIT(); 
            mDIGIT(); 
            mDIGIT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THREE_DIGIT"

    // $ANTLR start "FOUR_DIGIT"
    public final void mFOUR_DIGIT() throws RecognitionException {
        try {
            int _type = FOUR_DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:518:3: ( DIGIT DIGIT DIGIT DIGIT )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:518:5: DIGIT DIGIT DIGIT DIGIT
            {
            mDIGIT(); 
            mDIGIT(); 
            mDIGIT(); 
            mDIGIT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOUR_DIGIT"

    // $ANTLR start "DASH"
    public final void mDASH() throws RecognitionException {
        try {
            int _type = DASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:521:7: ( '-' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:521:9: '-'
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:522:7: ( '/' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:522:9: '/'
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

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:523:7: ( ',' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:523:9: ','
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

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:524:7: ( ':' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:524:9: ':'
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

    // $ANTLR start "WHITE_SPACE"
    public final void mWHITE_SPACE() throws RecognitionException {
        try {
            int _type = WHITE_SPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:527:3: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:527:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:527:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt52=0;
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>='\t' && LA52_0<='\n')||LA52_0=='\r'||LA52_0==' ') ) {
                    alt52=1;
                }


                switch (alt52) {
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
            	    if ( cnt52 >= 1 ) break loop52;
                        EarlyExitException eee =
                            new EarlyExitException(52, input);
                        throw eee;
                }
                cnt52++;
            } while (true);

             _channel=HIDDEN; 

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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:531:3: ( '0' .. '9' )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:531:5: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    public void mTokens() throws RecognitionException {
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:8: ( T__132 | MIDNIGHT | NOON | IN | THE | AT | ON | THIS | AFTER | BEFORE | LAST | PAST | NEXT | COMING | UPCOMING | FROM_NOW | AGO | JANUARY | FEBRUARY | MARCH | APRIL | MAY | JUNE | JULY | AUGUST | SEPTEMBER | OCTOBER | NOVEMBER | DECEMBER | SUNDAY | MONDAY | TUESDAY | WEDNESDAY | THURSDAY | FRIDAY | SATURDAY | TODAY | TOMORROW | YESTERDAY | AM | PM | DAY | WEEK | MONTH | YEAR | ONE | TWO | THREE | FOUR | FIVE | SIX | SEVEN | EIGHT | NINE | TEN | ELEVEN | TWELVE | THIRTEEN | FOURTEEN | FIFTEEN | SIXTEEN | SEVENTEEN | EIGHTEEN | NINETEEN | TWENTY | THIRTY | FIRST | SECOND | THIRD | FOURTH | FIFTH | SIXTH | SEVENTH | EIGHTH | NINTH | TENTH | ELEVENTH | TWELFTH | THIRTEENTH | FOURTEENTH | FIFTEENTH | SIXTEENTH | SEVENTEENTH | EIGHTEENTH | NINETEENTH | TWENTIETH | TWENTY_FIRST | TWENTY_SECOND | TWENTY_THIRD | TWENTY_FOURTH | TWENTY_FIFTH | TWENTY_SIXTH | TWENTY_SEVENTH | TWENTY_EIGHTH | TWENTY_NINTH | THIRTIETH | THIRTY_FIRST | PREFIXED_ONE_TO_NINE | ONE_TO_NINE | TEN_TO_TWELVE | THIRTEEN_TO_TWENTY_THREE | TWENTY_FOUR_TO_THIRTY_ONE | THIRTY_TWO_TO_FIFTY_NINE | SIXTY_TO_NINETY_NINE | ONE_ZERO | TWO_ZEROS | THREE_DIGIT | FOUR_DIGIT | DASH | SLASH | COMMA | COLON | WHITE_SPACE )
        int alt53=113;
        alt53 = dfa53.predict(input);
        switch (alt53) {
            case 1 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:10: T__132
                {
                mT__132(); 

                }
                break;
            case 2 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:17: MIDNIGHT
                {
                mMIDNIGHT(); 

                }
                break;
            case 3 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:26: NOON
                {
                mNOON(); 

                }
                break;
            case 4 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:31: IN
                {
                mIN(); 

                }
                break;
            case 5 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:34: THE
                {
                mTHE(); 

                }
                break;
            case 6 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:38: AT
                {
                mAT(); 

                }
                break;
            case 7 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:41: ON
                {
                mON(); 

                }
                break;
            case 8 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:44: THIS
                {
                mTHIS(); 

                }
                break;
            case 9 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:49: AFTER
                {
                mAFTER(); 

                }
                break;
            case 10 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:55: BEFORE
                {
                mBEFORE(); 

                }
                break;
            case 11 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:62: LAST
                {
                mLAST(); 

                }
                break;
            case 12 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:67: PAST
                {
                mPAST(); 

                }
                break;
            case 13 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:72: NEXT
                {
                mNEXT(); 

                }
                break;
            case 14 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:77: COMING
                {
                mCOMING(); 

                }
                break;
            case 15 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:84: UPCOMING
                {
                mUPCOMING(); 

                }
                break;
            case 16 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:93: FROM_NOW
                {
                mFROM_NOW(); 

                }
                break;
            case 17 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:102: AGO
                {
                mAGO(); 

                }
                break;
            case 18 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:106: JANUARY
                {
                mJANUARY(); 

                }
                break;
            case 19 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:114: FEBRUARY
                {
                mFEBRUARY(); 

                }
                break;
            case 20 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:123: MARCH
                {
                mMARCH(); 

                }
                break;
            case 21 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:129: APRIL
                {
                mAPRIL(); 

                }
                break;
            case 22 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:135: MAY
                {
                mMAY(); 

                }
                break;
            case 23 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:139: JUNE
                {
                mJUNE(); 

                }
                break;
            case 24 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:144: JULY
                {
                mJULY(); 

                }
                break;
            case 25 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:149: AUGUST
                {
                mAUGUST(); 

                }
                break;
            case 26 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:156: SEPTEMBER
                {
                mSEPTEMBER(); 

                }
                break;
            case 27 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:166: OCTOBER
                {
                mOCTOBER(); 

                }
                break;
            case 28 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:174: NOVEMBER
                {
                mNOVEMBER(); 

                }
                break;
            case 29 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:183: DECEMBER
                {
                mDECEMBER(); 

                }
                break;
            case 30 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:192: SUNDAY
                {
                mSUNDAY(); 

                }
                break;
            case 31 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:199: MONDAY
                {
                mMONDAY(); 

                }
                break;
            case 32 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:206: TUESDAY
                {
                mTUESDAY(); 

                }
                break;
            case 33 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:214: WEDNESDAY
                {
                mWEDNESDAY(); 

                }
                break;
            case 34 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:224: THURSDAY
                {
                mTHURSDAY(); 

                }
                break;
            case 35 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:233: FRIDAY
                {
                mFRIDAY(); 

                }
                break;
            case 36 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:240: SATURDAY
                {
                mSATURDAY(); 

                }
                break;
            case 37 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:249: TODAY
                {
                mTODAY(); 

                }
                break;
            case 38 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:255: TOMORROW
                {
                mTOMORROW(); 

                }
                break;
            case 39 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:264: YESTERDAY
                {
                mYESTERDAY(); 

                }
                break;
            case 40 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:274: AM
                {
                mAM(); 

                }
                break;
            case 41 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:277: PM
                {
                mPM(); 

                }
                break;
            case 42 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:280: DAY
                {
                mDAY(); 

                }
                break;
            case 43 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:284: WEEK
                {
                mWEEK(); 

                }
                break;
            case 44 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:289: MONTH
                {
                mMONTH(); 

                }
                break;
            case 45 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:295: YEAR
                {
                mYEAR(); 

                }
                break;
            case 46 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:300: ONE
                {
                mONE(); 

                }
                break;
            case 47 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:304: TWO
                {
                mTWO(); 

                }
                break;
            case 48 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:308: THREE
                {
                mTHREE(); 

                }
                break;
            case 49 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:314: FOUR
                {
                mFOUR(); 

                }
                break;
            case 50 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:319: FIVE
                {
                mFIVE(); 

                }
                break;
            case 51 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:324: SIX
                {
                mSIX(); 

                }
                break;
            case 52 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:328: SEVEN
                {
                mSEVEN(); 

                }
                break;
            case 53 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:334: EIGHT
                {
                mEIGHT(); 

                }
                break;
            case 54 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:340: NINE
                {
                mNINE(); 

                }
                break;
            case 55 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:345: TEN
                {
                mTEN(); 

                }
                break;
            case 56 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:349: ELEVEN
                {
                mELEVEN(); 

                }
                break;
            case 57 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:356: TWELVE
                {
                mTWELVE(); 

                }
                break;
            case 58 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:363: THIRTEEN
                {
                mTHIRTEEN(); 

                }
                break;
            case 59 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:372: FOURTEEN
                {
                mFOURTEEN(); 

                }
                break;
            case 60 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:381: FIFTEEN
                {
                mFIFTEEN(); 

                }
                break;
            case 61 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:389: SIXTEEN
                {
                mSIXTEEN(); 

                }
                break;
            case 62 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:397: SEVENTEEN
                {
                mSEVENTEEN(); 

                }
                break;
            case 63 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:407: EIGHTEEN
                {
                mEIGHTEEN(); 

                }
                break;
            case 64 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:416: NINETEEN
                {
                mNINETEEN(); 

                }
                break;
            case 65 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:425: TWENTY
                {
                mTWENTY(); 

                }
                break;
            case 66 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:432: THIRTY
                {
                mTHIRTY(); 

                }
                break;
            case 67 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:439: FIRST
                {
                mFIRST(); 

                }
                break;
            case 68 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:445: SECOND
                {
                mSECOND(); 

                }
                break;
            case 69 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:452: THIRD
                {
                mTHIRD(); 

                }
                break;
            case 70 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:458: FOURTH
                {
                mFOURTH(); 

                }
                break;
            case 71 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:465: FIFTH
                {
                mFIFTH(); 

                }
                break;
            case 72 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:471: SIXTH
                {
                mSIXTH(); 

                }
                break;
            case 73 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:477: SEVENTH
                {
                mSEVENTH(); 

                }
                break;
            case 74 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:485: EIGHTH
                {
                mEIGHTH(); 

                }
                break;
            case 75 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:492: NINTH
                {
                mNINTH(); 

                }
                break;
            case 76 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:498: TENTH
                {
                mTENTH(); 

                }
                break;
            case 77 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:504: ELEVENTH
                {
                mELEVENTH(); 

                }
                break;
            case 78 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:513: TWELFTH
                {
                mTWELFTH(); 

                }
                break;
            case 79 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:521: THIRTEENTH
                {
                mTHIRTEENTH(); 

                }
                break;
            case 80 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:532: FOURTEENTH
                {
                mFOURTEENTH(); 

                }
                break;
            case 81 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:543: FIFTEENTH
                {
                mFIFTEENTH(); 

                }
                break;
            case 82 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:553: SIXTEENTH
                {
                mSIXTEENTH(); 

                }
                break;
            case 83 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:563: SEVENTEENTH
                {
                mSEVENTEENTH(); 

                }
                break;
            case 84 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:575: EIGHTEENTH
                {
                mEIGHTEENTH(); 

                }
                break;
            case 85 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:586: NINETEENTH
                {
                mNINETEENTH(); 

                }
                break;
            case 86 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:597: TWENTIETH
                {
                mTWENTIETH(); 

                }
                break;
            case 87 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:607: TWENTY_FIRST
                {
                mTWENTY_FIRST(); 

                }
                break;
            case 88 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:620: TWENTY_SECOND
                {
                mTWENTY_SECOND(); 

                }
                break;
            case 89 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:634: TWENTY_THIRD
                {
                mTWENTY_THIRD(); 

                }
                break;
            case 90 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:647: TWENTY_FOURTH
                {
                mTWENTY_FOURTH(); 

                }
                break;
            case 91 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:661: TWENTY_FIFTH
                {
                mTWENTY_FIFTH(); 

                }
                break;
            case 92 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:674: TWENTY_SIXTH
                {
                mTWENTY_SIXTH(); 

                }
                break;
            case 93 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:687: TWENTY_SEVENTH
                {
                mTWENTY_SEVENTH(); 

                }
                break;
            case 94 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:702: TWENTY_EIGHTH
                {
                mTWENTY_EIGHTH(); 

                }
                break;
            case 95 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:716: TWENTY_NINTH
                {
                mTWENTY_NINTH(); 

                }
                break;
            case 96 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:729: THIRTIETH
                {
                mTHIRTIETH(); 

                }
                break;
            case 97 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:739: THIRTY_FIRST
                {
                mTHIRTY_FIRST(); 

                }
                break;
            case 98 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:752: PREFIXED_ONE_TO_NINE
                {
                mPREFIXED_ONE_TO_NINE(); 

                }
                break;
            case 99 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:773: ONE_TO_NINE
                {
                mONE_TO_NINE(); 

                }
                break;
            case 100 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:785: TEN_TO_TWELVE
                {
                mTEN_TO_TWELVE(); 

                }
                break;
            case 101 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:799: THIRTEEN_TO_TWENTY_THREE
                {
                mTHIRTEEN_TO_TWENTY_THREE(); 

                }
                break;
            case 102 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:824: TWENTY_FOUR_TO_THIRTY_ONE
                {
                mTWENTY_FOUR_TO_THIRTY_ONE(); 

                }
                break;
            case 103 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:850: THIRTY_TWO_TO_FIFTY_NINE
                {
                mTHIRTY_TWO_TO_FIFTY_NINE(); 

                }
                break;
            case 104 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:875: SIXTY_TO_NINETY_NINE
                {
                mSIXTY_TO_NINETY_NINE(); 

                }
                break;
            case 105 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:896: ONE_ZERO
                {
                mONE_ZERO(); 

                }
                break;
            case 106 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:905: TWO_ZEROS
                {
                mTWO_ZEROS(); 

                }
                break;
            case 107 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:915: THREE_DIGIT
                {
                mTHREE_DIGIT(); 

                }
                break;
            case 108 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:927: FOUR_DIGIT
                {
                mFOUR_DIGIT(); 

                }
                break;
            case 109 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:938: DASH
                {
                mDASH(); 

                }
                break;
            case 110 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:943: SLASH
                {
                mSLASH(); 

                }
                break;
            case 111 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:949: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 112 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:955: COLON
                {
                mCOLON(); 

                }
                break;
            case 113 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:1:961: WHITE_SPACE
                {
                mWHITE_SPACE(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA53 dfa53 = new DFA53(this);
    static final String DFA13_eotS =
        "\3\uffff\1\6\4\uffff\1\12\2\uffff";
    static final String DFA13_eofS =
        "\13\uffff";
    static final String DFA13_minS =
        "\1\163\1\165\1\156\1\144\1\141\2\uffff\1\171\1\163\2\uffff";
    static final String DFA13_maxS =
        "\1\163\1\165\1\156\1\163\1\141\2\uffff\1\171\1\163\2\uffff";
    static final String DFA13_acceptS =
        "\5\uffff\1\4\1\3\2\uffff\1\2\1\1";
    static final String DFA13_specialS =
        "\13\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4\16\uffff\1\5",
            "\1\7",
            "",
            "",
            "\1\10",
            "\1\11",
            "",
            ""
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
            return "396:1: SUNDAY : ( 'sunday' | 'sundays' | 'sun' | 'suns' );";
        }
    }
    static final String DFA14_eotS =
        "\3\uffff\1\6\4\uffff\1\12\2\uffff";
    static final String DFA14_eofS =
        "\13\uffff";
    static final String DFA14_minS =
        "\1\155\1\157\1\156\1\144\1\141\2\uffff\1\171\1\163\2\uffff";
    static final String DFA14_maxS =
        "\1\155\1\157\1\156\1\163\1\141\2\uffff\1\171\1\163\2\uffff";
    static final String DFA14_acceptS =
        "\5\uffff\1\4\1\3\2\uffff\1\2\1\1";
    static final String DFA14_specialS =
        "\13\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4\16\uffff\1\5",
            "\1\7",
            "",
            "",
            "\1\10",
            "\1\11",
            "",
            ""
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
            return "397:1: MONDAY : ( 'monday' | 'mondays' | 'mon' | 'mons' );";
        }
    }
    static final String DFA15_eotS =
        "\3\uffff\1\5\1\7\4\uffff\1\13\2\uffff";
    static final String DFA15_eofS =
        "\14\uffff";
    static final String DFA15_minS =
        "\1\164\1\165\1\145\1\163\1\144\1\uffff\1\141\1\uffff\1\171\1\163"+
        "\2\uffff";
    static final String DFA15_maxS =
        "\1\164\1\165\1\145\1\163\1\144\1\uffff\1\141\1\uffff\1\171\1\163"+
        "\2\uffff";
    static final String DFA15_acceptS =
        "\5\uffff\1\4\1\uffff\1\3\2\uffff\1\2\1\1";
    static final String DFA15_specialS =
        "\14\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\6",
            "",
            "\1\10",
            "",
            "\1\11",
            "\1\12",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "398:1: TUESDAY : ( 'tuesday' | 'tuesdays' | 'tues' | 'tue' );";
        }
    }
    static final String DFA16_eotS =
        "\3\uffff\1\6\7\uffff\1\15\2\uffff";
    static final String DFA16_eofS =
        "\16\uffff";
    static final String DFA16_minS =
        "\1\167\1\145\1\144\1\156\1\145\2\uffff\1\163\1\144\1\141\1\171\1"+
        "\163\2\uffff";
    static final String DFA16_maxS =
        "\1\167\1\145\1\144\1\163\1\145\2\uffff\1\163\1\144\1\141\1\171\1"+
        "\163\2\uffff";
    static final String DFA16_acceptS =
        "\5\uffff\1\4\1\3\5\uffff\1\2\1\1";
    static final String DFA16_specialS =
        "\16\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4\4\uffff\1\5",
            "\1\7",
            "",
            "",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "399:1: WEDNESDAY : ( 'wednesday' | 'wednesdays' | 'wed' | 'weds' );";
        }
    }
    static final String DFA17_eotS =
        "\3\uffff\1\6\1\10\2\uffff\1\12\4\uffff\1\16\2\uffff";
    static final String DFA17_eofS =
        "\17\uffff";
    static final String DFA17_minS =
        "\1\164\1\150\1\165\1\162\1\163\2\uffff\1\144\1\uffff\1\141\1\uffff"+
        "\1\171\1\163\2\uffff";
    static final String DFA17_maxS =
        "\1\164\1\150\1\165\2\163\2\uffff\1\144\1\uffff\1\141\1\uffff\1\171"+
        "\1\163\2\uffff";
    static final String DFA17_acceptS =
        "\5\uffff\1\5\1\4\1\uffff\1\3\1\uffff\1\6\2\uffff\1\2\1\1";
    static final String DFA17_specialS =
        "\17\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4\1\5",
            "\1\7",
            "",
            "",
            "\1\11",
            "",
            "\1\13",
            "",
            "\1\14",
            "\1\15",
            "",
            ""
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
            return "400:1: THURSDAY : ( 'thursday' | 'thursdays' | 'thur' | 'thu' | 'thus' | 'thurs' );";
        }
    }
    static final String DFA18_eotS =
        "\3\uffff\1\6\4\uffff\1\12\2\uffff";
    static final String DFA18_eofS =
        "\13\uffff";
    static final String DFA18_minS =
        "\1\146\1\162\1\151\1\144\1\141\2\uffff\1\171\1\163\2\uffff";
    static final String DFA18_maxS =
        "\1\146\1\162\1\151\1\163\1\141\2\uffff\1\171\1\163\2\uffff";
    static final String DFA18_acceptS =
        "\5\uffff\1\4\1\3\2\uffff\1\2\1\1";
    static final String DFA18_specialS =
        "\13\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4\16\uffff\1\5",
            "\1\7",
            "",
            "",
            "\1\10",
            "\1\11",
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
            return "401:1: FRIDAY : ( 'friday' | 'fridays' | 'fri' | 'fris' );";
        }
    }
    static final String DFA19_eotS =
        "\3\uffff\1\6\6\uffff\1\14\2\uffff";
    static final String DFA19_eofS =
        "\15\uffff";
    static final String DFA19_minS =
        "\1\163\1\141\1\164\1\163\1\162\2\uffff\1\144\1\141\1\171\1\163\2"+
        "\uffff";
    static final String DFA19_maxS =
        "\1\163\1\141\1\164\1\165\1\162\2\uffff\1\144\1\141\1\171\1\163\2"+
        "\uffff";
    static final String DFA19_acceptS =
        "\5\uffff\1\4\1\3\4\uffff\1\2\1\1";
    static final String DFA19_specialS =
        "\15\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\5\1\uffff\1\4",
            "\1\7",
            "",
            "",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "",
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
            return "402:1: SATURDAY : ( 'saturday' | 'saturdays' | 'sat' | 'sats' );";
        }
    }
    static final String DFA20_eotS =
        "\15\uffff";
    static final String DFA20_eofS =
        "\15\uffff";
    static final String DFA20_minS =
        "\1\164\1\157\2\155\1\162\2\157\1\162\2\uffff\1\157\2\uffff";
    static final String DFA20_maxS =
        "\1\164\1\157\1\155\1\157\1\162\1\157\2\162\2\uffff\1\162\2\uffff";
    static final String DFA20_acceptS =
        "\10\uffff\1\1\1\2\1\uffff\1\3\1\4";
    static final String DFA20_specialS =
        "\15\uffff}>";
    static final String[] DFA20_transitionS = {
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

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "406:1: TOMORROW : ( 'tomorow' | 'tomorrow' | 'tommorow' | 'tommorrow' );";
        }
    }
    static final String DFA53_eotS =
        "\6\uffff\1\63\3\uffff\1\67\11\uffff\11\123\1\154\26\uffff\1\176"+
        "\24\uffff\3\u0090\7\u0095\2\uffff\4\u0095\6\u00a1\1\uffff\2\u00a1"+
        "\1\u00a9\1\uffff\1\u00a9\2\uffff\1\u00aa\3\uffff\1\u00ab\1\uffff"+
        "\1\u00ac\2\uffff\1\u00ad\13\uffff\1\u00b4\13\uffff\1\u00b9\10\uffff"+
        "\1\u00bc\35\uffff\1\u00bf\5\uffff\1\u00c4\20\uffff\1\u00d1\1\uffff"+
        "\1\u00d5\15\uffff\1\u00de\3\uffff\1\u00e2\1\uffff\1\u00e4\2\uffff"+
        "\1\u00e6\1\u00e7\1\u00e8\3\uffff\1\u00d4\3\uffff\1\u00ea\1\uffff";
    static final String DFA53_eofS =
        "\u00eb\uffff";
    static final String DFA53_minS =
        "\1\11\1\uffff\1\141\1\145\1\uffff\1\145\1\146\1\143\2\uffff\1\141"+
        "\2\uffff\1\145\3\141\2\145\1\151\12\60\6\uffff\1\162\1\156\1\157"+
        "\1\uffff\1\156\1\145\1\uffff\1\144\1\145\1\156\6\uffff\1\145\3\uffff"+
        "\1\151\1\uffff\1\165\1\146\1\uffff\1\154\1\143\2\uffff\1\170\2\uffff"+
        "\1\144\1\141\1\147\1\145\1\uffff\12\60\2\uffff\12\60\1\uffff\3\60"+
        "\1\uffff\1\60\2\uffff\1\60\3\uffff\1\60\1\uffff\1\60\2\uffff\1\164"+
        "\2\uffff\1\145\1\uffff\1\162\5\uffff\1\154\1\164\4\uffff\1\162\1"+
        "\uffff\1\164\3\uffff\1\145\1\164\4\uffff\1\150\1\166\2\uffff\1\60"+
        "\35\uffff\1\164\1\uffff\1\144\1\146\1\164\1\uffff\1\164\1\145\1"+
        "\156\1\145\1\uffff\1\164\1\145\2\uffff\1\145\1\uffff\1\145\1\uffff"+
        "\1\151\1\145\1\uffff\1\145\1\164\2\145\1\156\2\145\2\uffff\1\145"+
        "\1\156\1\145\1\uffff\1\156\1\145\2\uffff\1\164\3\156\1\164\1\145"+
        "\1\164\1\156\1\uffff\3\164\1\uffff\1\156\1\uffff\1\164\3\uffff\1"+
        "\164\1\uffff";
    static final String DFA53_maxS =
        "\1\171\1\uffff\2\157\1\uffff\1\167\1\165\1\156\2\uffff\1\141\2\uffff"+
        "\1\162\2\165\3\145\1\154\1\163\1\156\1\162\6\164\1\71\6\uffff\1"+
        "\171\1\156\1\166\1\uffff\1\156\1\165\1\uffff\1\155\1\157\1\156\6"+
        "\uffff\1\145\3\uffff\1\157\1\uffff\1\165\1\166\1\uffff\1\156\1\166"+
        "\2\uffff\1\170\2\uffff\1\145\1\163\1\147\1\145\1\uffff\12\164\2"+
        "\uffff\1\164\1\163\1\156\1\162\6\164\1\uffff\1\164\1\163\1\71\1"+
        "\uffff\1\71\2\uffff\1\71\3\uffff\1\71\1\uffff\1\71\2\uffff\1\164"+
        "\2\uffff\1\164\1\uffff\1\163\5\uffff\1\156\1\164\4\uffff\1\162\1"+
        "\uffff\1\164\3\uffff\1\145\1\164\4\uffff\1\164\1\166\2\uffff\1\71"+
        "\35\uffff\1\164\1\uffff\1\164\1\166\1\164\1\uffff\1\164\1\150\1"+
        "\156\1\150\1\uffff\1\164\1\145\2\uffff\1\145\1\uffff\1\171\1\uffff"+
        "\1\171\1\150\1\uffff\1\145\1\164\1\145\1\164\1\156\2\145\2\uffff"+
        "\1\145\1\156\1\150\1\uffff\1\156\1\145\2\uffff\1\164\3\156\1\164"+
        "\1\145\1\164\1\156\1\uffff\3\164\1\uffff\1\156\1\uffff\1\164\3\uffff"+
        "\1\164\1\uffff";
    static final String DFA53_acceptS =
        "\1\uffff\1\1\2\uffff\1\4\3\uffff\1\12\1\13\1\uffff\1\16\1\17\21"+
        "\uffff\1\155\1\156\1\157\1\160\1\161\1\2\3\uffff\1\15\2\uffff\1"+
        "\40\3\uffff\1\6\1\11\1\21\1\25\1\31\1\50\1\uffff\1\33\1\14\1\51"+
        "\1\uffff\1\23\2\uffff\1\22\2\uffff\1\36\1\44\1\uffff\1\35\1\52\4"+
        "\uffff\1\103\12\uffff\1\143\1\104\12\uffff\1\105\3\uffff\1\106\1"+
        "\uffff\1\107\1\110\1\uffff\1\111\1\112\1\113\1\uffff\1\151\1\uffff"+
        "\1\24\1\26\1\uffff\1\3\1\34\1\uffff\1\5\1\uffff\1\42\1\60\1\45\1"+
        "\46\1\57\2\uffff\1\56\1\7\1\20\1\43\1\uffff\1\62\1\uffff\1\27\1"+
        "\30\1\32\2\uffff\1\41\1\53\1\47\1\55\2\uffff\1\114\1\144\1\uffff"+
        "\1\115\1\116\1\117\1\145\1\120\1\121\1\122\1\123\1\124\1\125\1\126"+
        "\1\127\1\130\1\131\1\132\1\146\1\133\1\134\1\135\1\136\1\137\1\140"+
        "\1\141\1\147\1\150\1\152\1\142\1\37\1\54\1\uffff\1\10\3\uffff\1"+
        "\67\4\uffff\1\63\2\uffff\1\153\1\154\1\uffff\1\66\1\uffff\1\71\2"+
        "\uffff\1\61\7\uffff\1\102\1\101\3\uffff\1\64\2\uffff\1\77\1\65\10"+
        "\uffff\1\70\3\uffff\1\74\1\uffff\1\75\1\uffff\1\100\1\72\1\73\1"+
        "\uffff\1\76";
    static final String DFA53_specialS =
        "\u00eb\uffff}>";
    static final String[] DFA53_transitionS = {
            "\2\42\2\uffff\1\42\22\uffff\1\42\6\uffff\1\1\4\uffff\1\40\1"+
            "\36\1\uffff\1\37\1\35\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
            "\1\34\1\41\46\uffff\1\6\1\10\1\13\1\20\1\23\1\15\2\uffff\1\4"+
            "\1\16\1\uffff\1\11\1\2\1\3\1\7\1\12\2\uffff\1\17\1\5\1\14\1"+
            "\uffff\1\21\1\uffff\1\22",
            "",
            "\1\44\7\uffff\1\43\5\uffff\1\45",
            "\1\47\3\uffff\1\50\5\uffff\1\46",
            "",
            "\1\55\2\uffff\1\51\6\uffff\1\53\5\uffff\1\52\1\uffff\1\54",
            "\1\57\1\60\10\uffff\1\61\3\uffff\1\56\1\62",
            "\1\65\12\uffff\1\64",
            "",
            "",
            "\1\66",
            "",
            "",
            "\1\71\3\uffff\1\73\5\uffff\1\72\2\uffff\1\70",
            "\1\74\23\uffff\1\75",
            "\1\100\3\uffff\1\76\3\uffff\1\101\13\uffff\1\77",
            "\1\103\3\uffff\1\102",
            "\1\104",
            "\1\105",
            "\1\106\2\uffff\1\107",
            "\1\111\1\112\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1\122"+
            "\71\uffff\1\110",
            "\1\125\1\126\1\127\1\130\1\131\1\132\1\133\1\134\1\135\1\136"+
            "\64\uffff\1\124",
            "\1\140\1\141\10\142\70\uffff\1\137",
            "\12\144\72\uffff\1\143",
            "\12\144\72\uffff\1\145",
            "\12\147\72\uffff\1\146",
            "\12\147\72\uffff\1\150",
            "\12\147\72\uffff\1\151",
            "\12\147\72\uffff\1\152",
            "\1\153\11\155",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\156\6\uffff\1\157",
            "\1\160",
            "\1\161\6\uffff\1\162",
            "",
            "\1\163",
            "\1\164\3\uffff\1\165\10\uffff\1\167\2\uffff\1\166",
            "",
            "\1\170\10\uffff\1\171",
            "\1\173\11\uffff\1\172",
            "\1\174",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\175",
            "",
            "",
            "",
            "\1\u0080\5\uffff\1\177",
            "",
            "\1\u0081",
            "\1\u0083\13\uffff\1\110\3\uffff\1\u0082",
            "",
            "\1\u0085\1\uffff\1\u0084",
            "\1\124\14\uffff\1\u0086\5\uffff\1\u0087",
            "",
            "",
            "\1\u0088",
            "",
            "",
            "\1\u0089\1\u008a",
            "\1\u008c\21\uffff\1\u008b",
            "\1\u008d",
            "\1\u008e",
            "",
            "\12\u0091\72\uffff\1\u008f",
            "\12\u0091\72\uffff\1\u0092",
            "\12\u0091\72\uffff\1\u0093",
            "\12\u0091\72\uffff\1\u0094",
            "\12\u0091\72\uffff\1\u0096",
            "\12\u0091\72\uffff\1\u0097",
            "\12\u0091\72\uffff\1\u0098",
            "\12\u0091\72\uffff\1\u0099",
            "\12\u0091\72\uffff\1\u009a",
            "\12\u0091\72\uffff\1\u009b",
            "",
            "",
            "\12\u0091\72\uffff\1\u009c",
            "\12\u0091\71\uffff\1\u009d",
            "\12\u0091\64\uffff\1\u009e",
            "\12\u0091\70\uffff\1\u009f",
            "\12\u0091\72\uffff\1\u00a0",
            "\12\u0091\72\uffff\1\u00a2",
            "\12\u0091\72\uffff\1\u00a3",
            "\12\u0091\72\uffff\1\u00a4",
            "\12\u0091\72\uffff\1\u00a5",
            "\12\u0091\72\uffff\1\u00a6",
            "",
            "\12\u0091\72\uffff\1\u00a7",
            "\12\u0091\71\uffff\1\u00a8",
            "\12\u0091",
            "",
            "\12\u0091",
            "",
            "",
            "\12\u0091",
            "",
            "",
            "",
            "\12\u0091",
            "",
            "\12\u0091",
            "",
            "",
            "\1\u00ae",
            "",
            "",
            "\1\u00af\16\uffff\1\152",
            "",
            "\1\u00b1\1\u00b0",
            "",
            "",
            "",
            "",
            "",
            "\1\u00b2\1\uffff\1\u00b3",
            "\1\u008f",
            "",
            "",
            "",
            "",
            "\1\u00b5",
            "",
            "\1\u00b6",
            "",
            "",
            "",
            "\1\u00b7",
            "\1\u00b8",
            "",
            "",
            "",
            "",
            "\1\u00ba\13\uffff\1\151",
            "\1\u00bb",
            "",
            "",
            "\12\u00bd",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00be",
            "",
            "\1\137\17\uffff\1\u00c0",
            "\1\u0093\17\uffff\1\u00c1",
            "\1\u00c2",
            "",
            "\1\u00c3",
            "\1\u00c5\2\uffff\1\145",
            "\1\u00c6",
            "\1\u00c7\2\uffff\1\146",
            "",
            "\1\u00c8",
            "\1\u00c9",
            "",
            "",
            "\1\u00ca",
            "",
            "\1\u00cb\3\uffff\1\u00a7\17\uffff\1\u00cc",
            "",
            "\1\u009c\17\uffff\1\u00cd",
            "\1\u00ce\2\uffff\1\143",
            "",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d2",
            "\1\u00d3\16\uffff\1\u00d4",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "",
            "",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db\2\uffff\1\150",
            "",
            "\1\u00dc",
            "\1\u00dd",
            "",
            "",
            "\1\u0092",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u0097",
            "\1\u00e3",
            "\1\u0098",
            "\1\u00e5",
            "",
            "\1\u009b",
            "\1\u0094",
            "\1\u0096",
            "",
            "\1\u00e9",
            "",
            "\1\u009a",
            "",
            "",
            "",
            "\1\u0099",
            ""
    };

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__132 | MIDNIGHT | NOON | IN | THE | AT | ON | THIS | AFTER | BEFORE | LAST | PAST | NEXT | COMING | UPCOMING | FROM_NOW | AGO | JANUARY | FEBRUARY | MARCH | APRIL | MAY | JUNE | JULY | AUGUST | SEPTEMBER | OCTOBER | NOVEMBER | DECEMBER | SUNDAY | MONDAY | TUESDAY | WEDNESDAY | THURSDAY | FRIDAY | SATURDAY | TODAY | TOMORROW | YESTERDAY | AM | PM | DAY | WEEK | MONTH | YEAR | ONE | TWO | THREE | FOUR | FIVE | SIX | SEVEN | EIGHT | NINE | TEN | ELEVEN | TWELVE | THIRTEEN | FOURTEEN | FIFTEEN | SIXTEEN | SEVENTEEN | EIGHTEEN | NINETEEN | TWENTY | THIRTY | FIRST | SECOND | THIRD | FOURTH | FIFTH | SIXTH | SEVENTH | EIGHTH | NINTH | TENTH | ELEVENTH | TWELFTH | THIRTEENTH | FOURTEENTH | FIFTEENTH | SIXTEENTH | SEVENTEENTH | EIGHTEENTH | NINETEENTH | TWENTIETH | TWENTY_FIRST | TWENTY_SECOND | TWENTY_THIRD | TWENTY_FOURTH | TWENTY_FIFTH | TWENTY_SIXTH | TWENTY_SEVENTH | TWENTY_EIGHTH | TWENTY_NINTH | THIRTIETH | THIRTY_FIRST | PREFIXED_ONE_TO_NINE | ONE_TO_NINE | TEN_TO_TWELVE | THIRTEEN_TO_TWENTY_THREE | TWENTY_FOUR_TO_THIRTY_ONE | THIRTY_TWO_TO_FIFTY_NINE | SIXTY_TO_NINETY_NINE | ONE_ZERO | TWO_ZEROS | THREE_DIGIT | FOUR_DIGIT | DASH | SLASH | COMMA | COLON | WHITE_SPACE );";
        }
    }
 

}