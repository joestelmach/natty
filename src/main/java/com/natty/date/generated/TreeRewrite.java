// $ANTLR 3.2 Sep 23, 2009 14:05:07 /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/TreeRewrite.g 2010-02-25 13:59:19
 package com.natty.date.generated; 

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class TreeRewrite extends TreeRewriter {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DOT", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "HOUR", "DAY", "WEEK", "MONTH", "YEAR", "TODAY", "TOMORROW", "YESTERDAY", "AM", "PM", "T", "MILITARY_HOUR_SUFFIX", "MIDNIGHT", "NOON", "MORNING", "NIGHT", "UTC", "EST", "PST", "CST", "MST", "AKST", "HAST", "INT_00", "INT_01", "INT_02", "INT_03", "INT_04", "INT_05", "INT_06", "INT_07", "INT_08", "INT_09", "INT_0", "INT_1", "INT_2", "INT_3", "INT_4", "INT_5", "INT_6", "INT_7", "INT_8", "INT_9", "INT_10", "INT_11", "INT_12", "INT_13", "INT_14", "INT_15", "INT_16", "INT_17", "INT_18", "INT_19", "INT_20", "INT_21", "INT_22", "INT_23", "INT_24", "INT_25", "INT_26", "INT_27", "INT_28", "INT_29", "INT_30", "INT_31", "INT_32", "INT_33", "INT_34", "INT_35", "INT_36", "INT_37", "INT_38", "INT_39", "INT_40", "INT_41", "INT_42", "INT_43", "INT_44", "INT_45", "INT_46", "INT_47", "INT_48", "INT_49", "INT_50", "INT_51", "INT_52", "INT_53", "INT_54", "INT_55", "INT_56", "INT_57", "INT_58", "INT_59", "INT_60", "INT_61", "INT_62", "INT_63", "INT_64", "INT_65", "INT_66", "INT_67", "INT_68", "INT_69", "INT_70", "INT_71", "INT_72", "INT_73", "INT_74", "INT_75", "INT_76", "INT_77", "INT_78", "INT_79", "INT_80", "INT_81", "INT_82", "INT_83", "INT_84", "INT_85", "INT_86", "INT_87", "INT_88", "INT_89", "INT_90", "INT_91", "INT_92", "INT_93", "INT_94", "INT_95", "INT_96", "INT_97", "INT_98", "INT_99", "ST", "ND", "RD", "TH", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN", "TWENTY", "THIRTY", "FIRST", "SECOND", "THIRD", "FOURTH", "FIFTH", "SIXTH", "SEVENTH", "EIGHTH", "NINTH", "TENTH", "ELEVENTH", "TWELFTH", "THIRTEENTH", "FOURTEENTH", "FIFTEENTH", "SIXTEENTH", "SEVENTEENTH", "EIGHTEENTH", "NINETEENTH", "TWENTIETH", "THIRTIETH", "COLON", "COMMA", "DASH", "SLASH", "PLUS", "SINGLE_QUOTE", "IN", "THE", "OR", "AT", "ON", "OF", "THIS", "THAT", "LAST", "NEXT", "PAST", "COMING", "UPCOMING", "FROM", "NOW", "AGO", "BEFORE", "AFTER", "SPACE", "WHITE_SPACE", "UNKNOWN_CHAR", "UNKNOWN", "DIGIT", "INT", "MONTH_OF_YEAR", "DAY_OF_MONTH", "DAY_OF_WEEK", "YEAR_OF", "DATE_TIME", "DATE_TIME_ALTERNATIVE", "EXPLICIT_DATE", "RELATIVE_DATE", "SEEK", "DIRECTION", "SEEK_BY", "SPAN", "WEEK_INDEX", "EXPLICIT_TIME", "HOURS_OF_DAY", "MINUTES_OF_HOUR", "SECONDS_OF_MINUTE", "AM_PM", "ZONE", "ZONE_OFFSET", "LIST"
    };
    public static final int DIRECTION=242;
    public static final int NINETEEN=179;
    public static final int UNKNOWN_CHAR=229;
    public static final int INT_08=55;
    public static final int INT_09=56;
    public static final int TWENTY=180;
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
    public static final int AM_PM=250;
    public static final int EIGHTEENTH=199;
    public static final int SPAN=244;
    public static final int THIS=215;
    public static final int NOON=37;
    public static final int TOMORROW=30;
    public static final int FIFTEENTH=196;
    public static final int TODAY=29;
    public static final int NOVEMBER=15;
    public static final int MONTH_OF_YEAR=233;
    public static final int SEVENTH=188;
    public static final int FEBRUARY=6;
    public static final int T=34;
    public static final int DAY_OF_WEEK=235;
    public static final int SUNDAY=17;
    public static final int SEVEN=167;
    public static final int ELEVEN=171;
    public static final int THIRTEEN=173;
    public static final int EXPLICIT_DATE=239;
    public static final int INT=232;
    public static final int UPCOMING=221;
    public static final int SIX=166;
    public static final int FIFTH=186;
    public static final int MORNING=38;
    public static final int DECEMBER=16;
    public static final int AUGUST=12;
    public static final int SECONDS_OF_MINUTE=249;
    public static final int TUESDAY=19;
    public static final int THIRD=184;
    public static final int INT_47=104;
    public static final int INT_46=103;
    public static final int INT_45=102;
    public static final int INT_44=101;
    public static final int RD=159;
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
    public static final int NINTH=190;
    public static final int ZONE=251;
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
    public static final int AGO=224;
    public static final int ELEVENTH=192;
    public static final int ST=157;
    public static final int TWO=162;
    public static final int HOUR=24;
    public static final int INT_20=77;
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
    public static final int DAY_OF_MONTH=234;
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
    public static final int PAST=219;
    public static final int SEVENTEEN=177;
    public static final int DATE_TIME=237;
    public static final int INT_72=129;
    public static final int INT_71=128;
    public static final int INT_70=127;
    public static final int THAT=216;
    public static final int INT_76=133;
    public static final int INT_75=132;
    public static final int INT_74=131;
    public static final int INT_73=130;
    public static final int MINUTES_OF_HOUR=248;
    public static final int THIRTIETH=202;
    public static final int LAST=217;
    public static final int INT_79=136;
    public static final int INT_77=134;
    public static final int EIGHTEEN=178;
    public static final int INT_78=135;
    public static final int ND=158;
    public static final int RELATIVE_DATE=240;
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
    public static final int ON=213;
    public static final int MONDAY=18;
    public static final int JUNE=10;
    public static final int LIST=253;
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
    public static final int DATE_TIME_ALTERNATIVE=238;
    public static final int OR=211;
    public static final int ZONE_OFFSET=252;
    public static final int SEEK_BY=243;
    public static final int PM=33;
    public static final int EXPLICIT_TIME=246;
    public static final int FROM=222;
    public static final int INT_59=116;
    public static final int INT_57=114;
    public static final int INT_58=115;
    public static final int INT_55=112;
    public static final int EIGHTH=189;
    public static final int INT_56=113;
    public static final int HOURS_OF_DAY=247;
    public static final int YEAR=28;
    public static final int MAY=9;
    public static final int TENTH=191;
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
    public static final int EIGHT=168;
    public static final int INT_0=57;
    public static final int CST=43;
    public static final int IN=209;
    public static final int PST=42;
    public static final int UNKNOWN=230;
    public static final int COMMA=204;
    public static final int FIVE=165;
    public static final int THIRTY=181;
    public static final int NEXT=218;
    public static final int DIGIT=231;
    public static final int DOT=4;
    public static final int MILITARY_HOUR_SUFFIX=35;
    public static final int EST=41;
    public static final int HAST=46;
    public static final int DASH=205;
    public static final int YEAR_OF=236;
    public static final int TWELVE=172;
    public static final int WEEK_INDEX=245;
    public static final int BEFORE=225;
    public static final int AFTER=226;
    public static final int SIXTEENTH=197;
    public static final int SEEK=241;
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

    // delegates
    // delegators


        public TreeRewrite(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public TreeRewrite(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return TreeRewrite.tokenNames; }
    public String getGrammarFileName() { return "/Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/TreeRewrite.g"; }


    public static class topdown_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "topdown"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/TreeRewrite.g:12:1: topdown : ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_WEEK INT ) ^( DAY_OF_WEEK dow= INT ) ) -> ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_WEEK $dow) ) ;
    public final TreeRewrite.topdown_return topdown() throws RecognitionException {
        TreeRewrite.topdown_return retval = new TreeRewrite.topdown_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree dow=null;
        CommonTree SEEK1=null;
        CommonTree DIRECTION2=null;
        CommonTree SEEK_BY3=null;
        CommonTree INT4=null;
        CommonTree DAY_OF_WEEK5=null;
        CommonTree INT6=null;
        CommonTree DAY_OF_WEEK7=null;

        CommonTree dow_tree=null;
        CommonTree SEEK1_tree=null;
        CommonTree DIRECTION2_tree=null;
        CommonTree SEEK_BY3_tree=null;
        CommonTree INT4_tree=null;
        CommonTree DAY_OF_WEEK5_tree=null;
        CommonTree INT6_tree=null;
        CommonTree DAY_OF_WEEK7_tree=null;
        RewriteRuleNodeStream stream_DIRECTION=new RewriteRuleNodeStream(adaptor,"token DIRECTION");
        RewriteRuleNodeStream stream_SEEK_BY=new RewriteRuleNodeStream(adaptor,"token SEEK_BY");
        RewriteRuleNodeStream stream_DAY_OF_WEEK=new RewriteRuleNodeStream(adaptor,"token DAY_OF_WEEK");
        RewriteRuleNodeStream stream_INT=new RewriteRuleNodeStream(adaptor,"token INT");
        RewriteRuleNodeStream stream_SEEK=new RewriteRuleNodeStream(adaptor,"token SEEK");

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/TreeRewrite.g:13:3: ( ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_WEEK INT ) ^( DAY_OF_WEEK dow= INT ) ) -> ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_WEEK $dow) ) )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/TreeRewrite.g:13:5: ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_WEEK INT ) ^( DAY_OF_WEEK dow= INT ) )
            {
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            _last = (CommonTree)input.LT(1);
            SEEK1=(CommonTree)match(input,SEEK,FOLLOW_SEEK_in_topdown54); if (state.failed) return retval; 
            if ( state.backtracking==1 ) stream_SEEK.add(SEEK1);


            if ( state.backtracking==1 )
            if ( _first_0==null ) _first_0 = SEEK1;
            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            DIRECTION2=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_topdown56); if (state.failed) return retval; 
            if ( state.backtracking==1 ) stream_DIRECTION.add(DIRECTION2);

            _last = (CommonTree)input.LT(1);
            SEEK_BY3=(CommonTree)match(input,SEEK_BY,FOLLOW_SEEK_BY_in_topdown58); if (state.failed) return retval; 
            if ( state.backtracking==1 ) stream_SEEK_BY.add(SEEK_BY3);

            _last = (CommonTree)input.LT(1);
            INT4=(CommonTree)match(input,INT,FOLLOW_INT_in_topdown60); if (state.failed) return retval; 
            if ( state.backtracking==1 ) stream_INT.add(INT4);

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            _last = (CommonTree)input.LT(1);
            DAY_OF_WEEK5=(CommonTree)match(input,DAY_OF_WEEK,FOLLOW_DAY_OF_WEEK_in_topdown63); if (state.failed) return retval; 
            if ( state.backtracking==1 ) stream_DAY_OF_WEEK.add(DAY_OF_WEEK5);


            if ( state.backtracking==1 )
            if ( _first_1==null ) _first_1 = DAY_OF_WEEK5;
            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            INT6=(CommonTree)match(input,INT,FOLLOW_INT_in_topdown65); if (state.failed) return retval; 
            if ( state.backtracking==1 ) stream_INT.add(INT6);


            match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_2;
            }

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            _last = (CommonTree)input.LT(1);
            DAY_OF_WEEK7=(CommonTree)match(input,DAY_OF_WEEK,FOLLOW_DAY_OF_WEEK_in_topdown69); if (state.failed) return retval; 
            if ( state.backtracking==1 ) stream_DAY_OF_WEEK.add(DAY_OF_WEEK7);


            if ( state.backtracking==1 )
            if ( _first_1==null ) _first_1 = DAY_OF_WEEK7;
            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            dow=(CommonTree)match(input,INT,FOLLOW_INT_in_topdown73); if (state.failed) return retval; 
            if ( state.backtracking==1 ) stream_INT.add(dow);


            match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_2;
            }


            match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
            }



            // AST REWRITE
            // elements: SEEK_BY, SEEK, DIRECTION, DAY_OF_WEEK, INT, dow
            // token labels: dow
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==1 ) {
            retval.tree = root_0;
            RewriteRuleNodeStream stream_dow=new RewriteRuleNodeStream(adaptor,"token dow",dow);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 14:7: -> ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_WEEK $dow) )
            {
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/TreeRewrite.g:14:10: ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_WEEK $dow) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_SEEK.nextNode(), root_1);

                adaptor.addChild(root_1, stream_DIRECTION.nextNode());
                adaptor.addChild(root_1, stream_SEEK_BY.nextNode());
                adaptor.addChild(root_1, stream_INT.nextNode());
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/TreeRewrite.g:14:39: ^( DAY_OF_WEEK $dow)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_DAY_OF_WEEK.nextNode(), root_2);

                adaptor.addChild(root_2, stream_dow.nextNode());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            input.replaceChildren(adaptor.getParent(retval.start),
                                  adaptor.getChildIndex(retval.start),
                                  adaptor.getChildIndex(_last),
                                  retval.tree);}
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "topdown"

    // Delegated rules


 

    public static final BitSet FOLLOW_SEEK_in_topdown54 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIRECTION_in_topdown56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_SEEK_BY_in_topdown58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_INT_in_topdown60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_DAY_OF_WEEK_in_topdown63 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_topdown65 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DAY_OF_WEEK_in_topdown69 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_topdown73 = new BitSet(new long[]{0x0000000000000008L});

}