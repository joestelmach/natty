// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g 2010-02-03 22:32:57
 package com.natty.parse; 

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class DateWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INT", "HOURS", "MINUTES", "AM_PM", "SPAN", "MONTH_OF", "DAY_OF_WEEK", "DAY_OF_MONTH", "YEAR_OF", "SEEK_DIR", "SEEK_TYPE", "EXPLICIT_TIME", "EXPLICIT_DATE", "RELATIVE_DATE", "DATE_TIME", "AT", "COMMA", "ON", "TODAY", "TOMORROW", "YESTERDAY", "THIS", "LAST", "PAST", "NEXT", "COMING", "UPCOMING", "IN", "FROM_NOW", "AGO", "DAY", "WEEK", "MONTH", "YEAR", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "THE", "DASH", "SLASH", "COLON", "MIDNIGHT", "NOON", "AM", "PM", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN", "TWENTY", "THIRTY", "FIRST", "SECOND", "THIRD", "FOURTH", "FIFTH", "SIXTH", "SEVENTH", "EIGHTH", "NINTH", "TENTH", "ELEVENTH", "TWELFTH", "THIRTEENTH", "FOURTEENTH", "FIFTEENTH", "SIXTEENTH", "SEVENTEENTH", "EIGHTEENTH", "NINETEENTH", "TWENTIETH", "TWENTY_FIRST", "TWENTY_SECOND", "TWENTY_THIRD", "TWENTY_FOURTH", "TWENTY_FIFTH", "TWENTY_SIXTH", "TWENTY_SEVENTH", "TWENTY_EIGHTH", "TWENTY_NINTH", "THIRTIETH", "THIRTY_FIRST", "THREE_DIGIT", "FOUR_DIGIT", "PREFIXED_ONE_TO_NINE", "ONE_TO_NINE", "TEN_TO_TWELVE", "TWO_ZEROS", "ZERO", "THIRTEEN_TO_TWENTY_THREE", "TWENTY_FOUR_TO_THIRTY_ONE", "THIRTY_TWO_TO_FIFTY_NINE", "SIXTY_TO_NINETY_NINE", "AFTER", "BEFORE", "DIGIT", "WHITE_SPACE", "'of'", "'''", "'h'", "ERA", "SEEK_DIRECTION", "INTEGER"
    };
    public static final int NINETEEN=83;
    public static final int SEPTEMBER=46;
    public static final int WEEK=35;
    public static final int THIRTEEN_TO_TWENTY_THREE=124;
    public static final int WEDNESDAY=53;
    public static final int TWENTY_EIGHTH=113;
    public static final int TWENTY=84;
    public static final int FROM_NOW=32;
    public static final int APRIL=41;
    public static final int JULY=44;
    public static final int COMING=29;
    public static final int NINETEENTH=104;
    public static final int OCTOBER=47;
    public static final int DAY=34;
    public static final int ONE=65;
    public static final int MIDNIGHT=61;
    public static final int MARCH=40;
    public static final int EOF=-1;
    public static final int MONTH=36;
    public static final int PAST=27;
    public static final int SEVENTEEN=81;
    public static final int DATE_TIME=18;
    public static final int AM_PM=7;
    public static final int SIXTY_TO_NINETY_NINE=127;
    public static final int TWENTY_SEVENTH=112;
    public static final int TWENTY_FIFTH=110;
    public static final int EIGHTEENTH=103;
    public static final int SEEK_DIR=13;
    public static final int SPAN=8;
    public static final int THIS=25;
    public static final int NOON=62;
    public static final int THIRTIETH=115;
    public static final int LAST=26;
    public static final int EIGHTEEN=82;
    public static final int RELATIVE_DATE=17;
    public static final int TOMORROW=23;
    public static final int TWENTY_FOUR_TO_THIRTY_ONE=125;
    public static final int FOUR_DIGIT=118;
    public static final int ONE_TO_NINE=120;
    public static final int FOURTH=89;
    public static final int FIFTEENTH=100;
    public static final int TODAY=22;
    public static final int SECOND=87;
    public static final int NOVEMBER=48;
    public static final int SATURDAY=56;
    public static final int FOUR=68;
    public static final int SEVENTH=92;
    public static final int TEN=74;
    public static final int FEBRUARY=39;
    public static final int ON=21;
    public static final int MONDAY=51;
    public static final int DAY_OF_WEEK=10;
    public static final int SUNDAY=50;
    public static final int SEVEN=71;
    public static final int ELEVEN=75;
    public static final int THIRTEEN=77;
    public static final int INT=4;
    public static final int EXPLICIT_DATE=16;
    public static final int JUNE=43;
    public static final int UPCOMING=30;
    public static final int SIX=70;
    public static final int FIFTH=90;
    public static final int TWENTY_NINTH=114;
    public static final int THURSDAY=54;
    public static final int DECEMBER=49;
    public static final int AUGUST=45;
    public static final int PM=64;
    public static final int EXPLICIT_TIME=15;
    public static final int TUESDAY=52;
    public static final int T__132=132;
    public static final int THIRTY_TWO_TO_FIFTY_NINE=126;
    public static final int T__133=133;
    public static final int EIGHTH=93;
    public static final int T__134=134;
    public static final int THIRD=88;
    public static final int YEAR=37;
    public static final int THE=57;
    public static final int TENTH=95;
    public static final int MAY=42;
    public static final int TWENTY_FOURTH=109;
    public static final int THREE_DIGIT=117;
    public static final int MONTH_OF=9;
    public static final int WHITE_SPACE=131;
    public static final int SEEK_TYPE=14;
    public static final int ZERO=123;
    public static final int PREFIXED_ONE_TO_NINE=119;
    public static final int FRIDAY=55;
    public static final int EIGHT=72;
    public static final int AT=19;
    public static final int TWENTY_SIXTH=111;
    public static final int SLASH=59;
    public static final int IN=31;
    public static final int NINTH=94;
    public static final int COMMA=20;
    public static final int FIVE=69;
    public static final int THIRTY=85;
    public static final int TWENTIETH=105;
    public static final int TWENTY_SECOND=107;
    public static final int NEXT=28;
    public static final int TWO_ZEROS=122;
    public static final int DIGIT=130;
    public static final int AM=63;
    public static final int INTEGER=137;
    public static final int DASH=58;
    public static final int FOURTEENTH=99;
    public static final int SIXTEEN=80;
    public static final int YEAR_OF=12;
    public static final int TEN_TO_TWELVE=121;
    public static final int SEEK_DIRECTION=136;
    public static final int TWELVE=76;
    public static final int AGO=33;
    public static final int ELEVENTH=96;
    public static final int BEFORE=129;
    public static final int TWO=66;
    public static final int AFTER=128;
    public static final int SIXTEENTH=101;
    public static final int JANUARY=38;
    public static final int THIRTEENTH=98;
    public static final int COLON=60;
    public static final int MINUTES=6;
    public static final int ERA=135;
    public static final int DAY_OF_MONTH=11;
    public static final int FIFTEEN=79;
    public static final int TWELFTH=97;
    public static final int NINE=73;
    public static final int SIXTH=91;
    public static final int THREE=67;
    public static final int TWENTY_FIRST=106;
    public static final int FOURTEEN=78;
    public static final int TWENTY_THIRD=108;
    public static final int YESTERDAY=24;
    public static final int HOURS=5;
    public static final int SEVENTEENTH=102;
    public static final int FIRST=86;
    public static final int THIRTY_FIRST=116;

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:36:1: relative_date : ( ^( RELATIVE_DATE SEEK_DIRECTION RELATIVE_DATE ) | ^( RELATIVE_DATE SEEK_DIRECTION EXPLICIT_DATE ) | ^( RELATIVE_DATE SEEK_DIRECTION INTEGER ) | ^( RELATIVE_DATE SEEK_DIRECTION SEEK_TYPE INTEGER DAY_OF_WEEK ) | ^( RELATIVE_DATE SEEK_DIRECTION SEEK_TYPE INTEGER SPAN ) | ^( RELATIVE_DATE SEEK_DIRECTION SEEK_TYPE INTEGER MONTH ) );
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
        CommonTree SEEK_DIRECTION14=null;
        CommonTree INTEGER15=null;
        CommonTree MONTH16=null;

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:38:3: ( ^( RELATIVE_DATE SEEK_DIRECTION RELATIVE_DATE ) | ^( RELATIVE_DATE SEEK_DIRECTION EXPLICIT_DATE ) | ^( RELATIVE_DATE SEEK_DIRECTION INTEGER ) | ^( RELATIVE_DATE SEEK_DIRECTION SEEK_TYPE INTEGER DAY_OF_WEEK ) | ^( RELATIVE_DATE SEEK_DIRECTION SEEK_TYPE INTEGER SPAN ) | ^( RELATIVE_DATE SEEK_DIRECTION SEEK_TYPE INTEGER MONTH ) )
            int alt5=6;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:38:5: ^( RELATIVE_DATE SEEK_DIRECTION RELATIVE_DATE )
                    {
                    match(input,RELATIVE_DATE,FOLLOW_RELATIVE_DATE_in_relative_date137); 

                    match(input, Token.DOWN, null); 
                    match(input,SEEK_DIRECTION,FOLLOW_SEEK_DIRECTION_in_relative_date139); 
                    match(input,RELATIVE_DATE,FOLLOW_RELATIVE_DATE_in_relative_date141); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:41:5: ^( RELATIVE_DATE SEEK_DIRECTION EXPLICIT_DATE )
                    {
                    match(input,RELATIVE_DATE,FOLLOW_RELATIVE_DATE_in_relative_date156); 

                    match(input, Token.DOWN, null); 
                    match(input,SEEK_DIRECTION,FOLLOW_SEEK_DIRECTION_in_relative_date158); 
                    match(input,EXPLICIT_DATE,FOLLOW_EXPLICIT_DATE_in_relative_date160); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:44:5: ^( RELATIVE_DATE SEEK_DIRECTION INTEGER )
                    {
                    match(input,RELATIVE_DATE,FOLLOW_RELATIVE_DATE_in_relative_date175); 

                    match(input, Token.DOWN, null); 
                    SEEK_DIRECTION5=(CommonTree)match(input,SEEK_DIRECTION,FOLLOW_SEEK_DIRECTION_in_relative_date177); 
                    INTEGER6=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_relative_date179); 

                    match(input, Token.UP, null); 
                    dateTime.seek((SEEK_DIRECTION5!=null?SEEK_DIRECTION5.getText():null), (INTEGER6!=null?INTEGER6.getText():null));

                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:49:5: ^( RELATIVE_DATE SEEK_DIRECTION SEEK_TYPE INTEGER DAY_OF_WEEK )
                    {
                    match(input,RELATIVE_DATE,FOLLOW_RELATIVE_DATE_in_relative_date203); 

                    match(input, Token.DOWN, null); 
                    SEEK_DIRECTION7=(CommonTree)match(input,SEEK_DIRECTION,FOLLOW_SEEK_DIRECTION_in_relative_date205); 
                    SEEK_TYPE8=(CommonTree)match(input,SEEK_TYPE,FOLLOW_SEEK_TYPE_in_relative_date207); 
                    INTEGER9=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_relative_date209); 
                    DAY_OF_WEEK10=(CommonTree)match(input,DAY_OF_WEEK,FOLLOW_DAY_OF_WEEK_in_relative_date211); 

                    match(input, Token.UP, null); 
                    dateTime.seekToDayOfWeek((SEEK_DIRECTION7!=null?SEEK_DIRECTION7.getText():null), (SEEK_TYPE8!=null?SEEK_TYPE8.getText():null), (INTEGER9!=null?INTEGER9.getText():null), (DAY_OF_WEEK10!=null?DAY_OF_WEEK10.getText():null));

                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:54:5: ^( RELATIVE_DATE SEEK_DIRECTION SEEK_TYPE INTEGER SPAN )
                    {
                    match(input,RELATIVE_DATE,FOLLOW_RELATIVE_DATE_in_relative_date237); 

                    match(input, Token.DOWN, null); 
                    SEEK_DIRECTION11=(CommonTree)match(input,SEEK_DIRECTION,FOLLOW_SEEK_DIRECTION_in_relative_date239); 
                    match(input,SEEK_TYPE,FOLLOW_SEEK_TYPE_in_relative_date241); 
                    INTEGER12=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_relative_date243); 
                    SPAN13=(CommonTree)match(input,SPAN,FOLLOW_SPAN_in_relative_date245); 

                    match(input, Token.UP, null); 
                    dateTime.seekBySpan((SEEK_DIRECTION11!=null?SEEK_DIRECTION11.getText():null), (INTEGER12!=null?INTEGER12.getText():null), (SPAN13!=null?SPAN13.getText():null));

                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:59:5: ^( RELATIVE_DATE SEEK_DIRECTION SEEK_TYPE INTEGER MONTH )
                    {
                    match(input,RELATIVE_DATE,FOLLOW_RELATIVE_DATE_in_relative_date269); 

                    match(input, Token.DOWN, null); 
                    SEEK_DIRECTION14=(CommonTree)match(input,SEEK_DIRECTION,FOLLOW_SEEK_DIRECTION_in_relative_date271); 
                    match(input,SEEK_TYPE,FOLLOW_SEEK_TYPE_in_relative_date273); 
                    INTEGER15=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_relative_date275); 
                    MONTH16=(CommonTree)match(input,MONTH,FOLLOW_MONTH_in_relative_date277); 

                    match(input, Token.UP, null); 
                    dateTime.seekToMonth((SEEK_DIRECTION14!=null?SEEK_DIRECTION14.getText():null), (INTEGER15!=null?INTEGER15.getText():null), (MONTH16!=null?MONTH16.getText():null));

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:63:1: explicit_time : ^( EXPLICIT_TIME HOURS MINUTES ( AM_PM )? ) ;
    public final void explicit_time() throws RecognitionException {
        CommonTree HOURS17=null;
        CommonTree MINUTES18=null;
        CommonTree AM_PM19=null;

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:64:3: ( ^( EXPLICIT_TIME HOURS MINUTES ( AM_PM )? ) )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:64:5: ^( EXPLICIT_TIME HOURS MINUTES ( AM_PM )? )
            {
            match(input,EXPLICIT_TIME,FOLLOW_EXPLICIT_TIME_in_explicit_time302); 

            match(input, Token.DOWN, null); 
            HOURS17=(CommonTree)match(input,HOURS,FOLLOW_HOURS_in_explicit_time304); 
            MINUTES18=(CommonTree)match(input,MINUTES,FOLLOW_MINUTES_in_explicit_time306); 
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:64:35: ( AM_PM )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==AM_PM) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:64:35: AM_PM
                    {
                    AM_PM19=(CommonTree)match(input,AM_PM,FOLLOW_AM_PM_in_explicit_time308); 

                    }
                    break;

            }


            match(input, Token.UP, null); 
            dateTime.setExplicitTime((HOURS17!=null?HOURS17.getText():null), (MINUTES18!=null?MINUTES18.getText():null), (AM_PM19!=null?AM_PM19.getText():null));

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


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\14\uffff";
    static final String DFA5_eofS =
        "\14\uffff";
    static final String DFA5_minS =
        "\1\21\1\2\1\u0088\1\16\3\uffff\1\u0089\1\10\3\uffff";
    static final String DFA5_maxS =
        "\1\21\1\2\1\u0088\1\u0089\3\uffff\1\u0089\1\44\3\uffff";
    static final String DFA5_acceptS =
        "\4\uffff\1\1\1\2\1\3\2\uffff\1\4\1\5\1\6";
    static final String DFA5_specialS =
        "\14\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\7\1\uffff\1\5\1\4\167\uffff\1\6",
            "",
            "",
            "",
            "\1\10",
            "\1\12\1\uffff\1\11\31\uffff\1\13",
            "",
            "",
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
            return "36:1: relative_date : ( ^( RELATIVE_DATE SEEK_DIRECTION RELATIVE_DATE ) | ^( RELATIVE_DATE SEEK_DIRECTION EXPLICIT_DATE ) | ^( RELATIVE_DATE SEEK_DIRECTION INTEGER ) | ^( RELATIVE_DATE SEEK_DIRECTION SEEK_TYPE INTEGER DAY_OF_WEEK ) | ^( RELATIVE_DATE SEEK_DIRECTION SEEK_TYPE INTEGER SPAN ) | ^( RELATIVE_DATE SEEK_DIRECTION SEEK_TYPE INTEGER MONTH ) );";
        }
    }
 

    public static final BitSet FOLLOW_DATE_TIME_in_datetime47 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_date_in_datetime49 = new BitSet(new long[]{0x0000000000008008L});
    public static final BitSet FOLLOW_time_in_datetime51 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_relative_date_in_date67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_explicit_date_in_date74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_explicit_time_in_time89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPLICIT_DATE_in_explicit_date103 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MONTH_in_explicit_date105 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DAY_OF_MONTH_in_explicit_date107 = new BitSet(new long[]{0x0000002000000008L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_YEAR_in_explicit_date109 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ERA_in_explicit_date112 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RELATIVE_DATE_in_relative_date137 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SEEK_DIRECTION_in_relative_date139 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RELATIVE_DATE_in_relative_date141 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RELATIVE_DATE_in_relative_date156 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SEEK_DIRECTION_in_relative_date158 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_EXPLICIT_DATE_in_relative_date160 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RELATIVE_DATE_in_relative_date175 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SEEK_DIRECTION_in_relative_date177 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTEGER_in_relative_date179 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RELATIVE_DATE_in_relative_date203 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SEEK_DIRECTION_in_relative_date205 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_SEEK_TYPE_in_relative_date207 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTEGER_in_relative_date209 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_DAY_OF_WEEK_in_relative_date211 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RELATIVE_DATE_in_relative_date237 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SEEK_DIRECTION_in_relative_date239 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_SEEK_TYPE_in_relative_date241 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTEGER_in_relative_date243 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_SPAN_in_relative_date245 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RELATIVE_DATE_in_relative_date269 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SEEK_DIRECTION_in_relative_date271 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_SEEK_TYPE_in_relative_date273 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTEGER_in_relative_date275 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_MONTH_in_relative_date277 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPLICIT_TIME_in_explicit_time302 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_HOURS_in_explicit_time304 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_MINUTES_in_explicit_time306 = new BitSet(new long[]{0x0000000000000088L});
    public static final BitSet FOLLOW_AM_PM_in_explicit_time308 = new BitSet(new long[]{0x0000000000000008L});

}