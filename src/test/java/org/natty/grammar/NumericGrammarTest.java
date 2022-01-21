package org.natty.grammar;

import org.junit.Test;

public class NumericGrammarTest extends AbstractGrammarTest {
  
  @Test
  public void int_00_to_23_optional_prefix() throws Exception {
    _ruleName = "int_00_to_23_optional_prefix";
    
    assertAST("00", "00");
    assertAST("01", "01");
    assertAST("02", "02");
    assertAST("03", "03");
    assertAST("04", "04");
    assertAST("05", "05");
    assertAST("06", "06");
    assertAST("07", "07");
    assertAST("08", "08");
    assertAST("09", "09");
    assertAST("10", "10");
    assertAST("11", "11");
    assertAST("12", "12");
    assertAST("13", "13");
    assertAST("14", "14");
    assertAST("15", "15");
    assertAST("16", "16");
    assertAST("17", "17");
    assertAST("18", "18");
    assertAST("19", "19");
    assertAST("20", "20");
    assertAST("21", "21");
    assertAST("22", "22");
    assertAST("23", "23");
  }
  
  @Test
  public void test_int_00_to_59_mandatory_prefix() throws Exception {
    _ruleName = "int_00_to_59_mandatory_prefix";
    
    assertAST("00", "00");
    assertAST("01", "01");
    assertAST("02", "02");
    assertAST("03", "03");
    assertAST("04", "04");
    assertAST("05", "05");
    assertAST("06", "06");
    assertAST("07", "07");
    assertAST("08", "08");
    assertAST("09", "09");
    assertAST("10", "10");
    assertAST("11", "11");
    assertAST("12", "12");
    assertAST("13", "13");
    assertAST("14", "14");
    assertAST("15", "15");
    assertAST("16", "16");
    assertAST("17", "17");
    assertAST("18", "18");
    assertAST("19", "19");
    assertAST("20", "20");
    assertAST("21", "21");
    assertAST("22", "22");
    assertAST("23", "23");
    assertAST("24", "24");
    assertAST("25", "25");
    assertAST("26", "26");
    assertAST("27", "27");
    assertAST("28", "28");
    assertAST("29", "29");
    assertAST("30", "30");
    assertAST("31", "31");
    assertAST("32", "32");
    assertAST("33", "33");
    assertAST("34", "34");
    assertAST("35", "35");
    assertAST("36", "36");
    assertAST("37", "37");
    assertAST("38", "38");
    assertAST("39", "39");
    assertAST("40", "40");
    assertAST("41", "41");
    assertAST("42", "42");
    assertAST("43", "43");
    assertAST("44", "44");
    assertAST("45", "45");
    assertAST("46", "46");
    assertAST("47", "47");
    assertAST("48", "48");
    assertAST("49", "49");
    assertAST("50", "50");
    assertAST("51", "51");
    assertAST("52", "52");
    assertAST("53", "53");
    assertAST("54", "54");
    assertAST("55", "55");
    assertAST("56", "56");
    assertAST("57", "57");
    assertAST("58", "58");
    assertAST("59", "59");
    /*
    "0" FAIL 
    "1" FAIL 
    "2" FAIL
    "3" FAIL
    "4" FAIL
    "5" FAIL
    "6" FAIL
    "7" FAIL
    "8" FAIL
    "9" FAIL 
    "60" FAIL
    */
  }
  
  @Test
  public void test_int_00_to_99_mandatory_prefix() throws Exception {
    _ruleName = "int_00_to_99_mandatory_prefix";
    
    assertAST("00", "00");
    assertAST("01", "01");
    assertAST("02", "02");
    assertAST("03", "03");
    assertAST("04", "04");
    assertAST("05", "05");
    assertAST("06", "06");
    assertAST("07", "07");
    assertAST("08", "08");
    assertAST("09", "09");
    assertAST("10", "10");
    assertAST("11", "11");
    assertAST("12", "12");
    assertAST("13", "13");
    assertAST("14", "14");
    assertAST("15", "15");
    assertAST("16", "16");
    assertAST("17", "17");
    assertAST("18", "18");
    assertAST("19", "19");
    assertAST("20", "20");
    assertAST("21", "21");
    assertAST("22", "22");
    assertAST("23", "23");
    assertAST("24", "24");
    assertAST("25", "25");
    assertAST("26", "26");
    assertAST("27", "27");
    assertAST("28", "28");
    assertAST("29", "29");
    assertAST("30", "30");
    assertAST("31", "31");
    assertAST("32", "32");
    assertAST("33", "33");
    assertAST("34", "34");
    assertAST("35", "35");
    assertAST("36", "36");
    assertAST("37", "37");
    assertAST("38", "38");
    assertAST("39", "39");
    assertAST("40", "40");
    assertAST("41", "41");
    assertAST("42", "42");
    assertAST("43", "43");
    assertAST("44", "44");
    assertAST("45", "45");
    assertAST("46", "46");
    assertAST("47", "47");
    assertAST("48", "48");
    assertAST("49", "49");
    assertAST("50", "50");
    assertAST("51", "51");
    assertAST("52", "52");
    assertAST("53", "53");
    assertAST("54", "54");
    assertAST("55", "55");
    assertAST("56", "56");
    assertAST("57", "57");
    assertAST("58", "58");
    assertAST("59", "59");
    assertAST("60", "60");
    assertAST("61", "61");
    assertAST("62", "62");
    assertAST("63", "63");
    assertAST("64", "64");
    assertAST("65", "65");
    assertAST("66", "66");
    assertAST("67", "67");
    assertAST("68", "68");
    assertAST("69", "69");
    assertAST("70", "70");
    assertAST("71", "71");
    assertAST("72", "72");
    assertAST("73", "73");
    assertAST("74", "74");
    assertAST("75", "75");
    assertAST("76", "76");
    assertAST("77", "77");
    assertAST("78", "78");
    assertAST("79", "79");
    assertAST("80", "80");
    assertAST("81", "81");
    assertAST("82", "82");
    assertAST("83", "83");
    assertAST("84", "84");
    assertAST("85", "85");
    assertAST("86", "86");
    assertAST("87", "87");
    assertAST("88", "88");
    assertAST("89", "89");
    assertAST("90", "90");
    assertAST("91", "91");
    assertAST("92", "92");
    assertAST("93", "93");
    assertAST("94", "94");
    assertAST("95", "95");
    assertAST("96", "96");
    assertAST("97", "97");
    assertAST("98", "98");
    assertAST("99", "99");
    /*
    "0" FAIL 
    "1" FAIL 
    "2" FAIL
    "3" FAIL
    "4" FAIL
    "5" FAIL
    "6" FAIL
    "7" FAIL
    "8" FAIL
    "9" FAIL 
    "100" FAIL
    */
  }
  
  @Test
  public void int_1_to_9() throws Exception {
    _ruleName = "int_1_to_9";
    
    assertAST("1", "1");
    assertAST("2", "2");
    assertAST("3", "3");
    assertAST("4", "4");
    assertAST("5", "5");
    assertAST("6", "6");
    assertAST("7", "7");
    assertAST("8", "8");
    assertAST("9", "9");
    /*
    FAIL: 
    0
    00
    01
    02
    03
    04
    05
    06
    07
    08
    09
     */
  }
  
  @Test
  public void int_01_to_12() throws Exception {
    _ruleName = "int_01_to_12";
    
    assertAST("01", "01");
    assertAST("02", "02");
    assertAST("03", "03");
    assertAST("04", "04");
    assertAST("05", "05");
    assertAST("06", "06");
    assertAST("07", "07");
    assertAST("08", "08");
    assertAST("09", "09");
    assertAST("10", "10");
    assertAST("11", "11");
    assertAST("12", "12");
    /*
    FAIL: 
    0
    00
    1
    2
    3
    4
    5
    6
    7
    8
    9
     */
  }
  
  
  @Test
  public void int_13_to_23() throws Exception {
    _ruleName = "int_13_to_23";
    
    assertAST("13", "13");
    assertAST("14", "14");
    assertAST("15", "15");
    assertAST("16", "16");
    assertAST("17", "17");
    assertAST("18", "18");
    assertAST("19", "19");
    assertAST("20", "20");
    assertAST("21", "21");
    assertAST("22", "22");
    assertAST("23", "23");
  }
  
  @Test
  public void int_24_to_31() throws Exception {
    _ruleName = "int_24_to_31";
    
    assertAST("24", "24");
    assertAST("25", "25");
    assertAST("26", "26");
    assertAST("27", "27");
    assertAST("28", "28");
    assertAST("29", "29");
    assertAST("30", "30");
    assertAST("31", "31");
  }
  
  @Test
  public void int_32_to_59() throws Exception {
    _ruleName = "int_32_to_59";
    
    assertAST("32", "32");
    assertAST("33", "33");
    assertAST("34", "34");
    assertAST("35", "35");
    assertAST("36", "36");
    assertAST("37", "37");
    assertAST("38", "38");
    assertAST("39", "39");
    assertAST("40", "40");
    assertAST("41", "41");
    assertAST("42", "42");
    assertAST("43", "43");
    assertAST("44", "44");
    assertAST("45", "45");
    assertAST("46", "46");
    assertAST("47", "47");
    assertAST("48", "48");
    assertAST("49", "49");
    assertAST("50", "50");
    assertAST("51", "51");
    assertAST("52", "52");
    assertAST("53", "53");
    assertAST("54", "54");
    assertAST("55", "55");
    assertAST("56", "56");
    assertAST("57", "57");
    assertAST("58", "58");
    assertAST("59", "59");
  }
  
  @Test
  public void int_60_to_99() throws Exception {
    _ruleName = "int_60_to_99";
    
    assertAST("60", "60");
    assertAST("61", "61");
    assertAST("62", "62");
    assertAST("63", "63");
    assertAST("64", "64");
    assertAST("65", "65");
    assertAST("66", "66");
    assertAST("67", "67");
    assertAST("68", "68");
    assertAST("69", "69");
    assertAST("70", "70");
    assertAST("71", "71");
    assertAST("72", "72");
    assertAST("73", "73");
    assertAST("74", "74");
    assertAST("75", "75");
    assertAST("76", "76");
    assertAST("77", "77");
    assertAST("78", "78");
    assertAST("79", "79");
    assertAST("80", "80");
    assertAST("81", "81");
    assertAST("82", "82");
    assertAST("83", "83");
    assertAST("84", "84");
    assertAST("85", "85");
    assertAST("86", "86");
    assertAST("87", "87");
    assertAST("88", "88");
    assertAST("89", "89");
    assertAST("90", "90");
    assertAST("91", "91");
    assertAST("92", "92");
    assertAST("93", "93");
    assertAST("94", "94");
    assertAST("95", "95");
    assertAST("96", "96");
    assertAST("97", "97");
    assertAST("98", "98");
    assertAST("99", "99");
  }
  
  @Test
  public void int_01_to_12_optional_prefix() throws Exception {
    _ruleName = "int_01_to_12_optional_prefix";
    
    assertAST("01", "01");
    assertAST("1", "1");
    assertAST("02", "02");
    assertAST("2", "2");
    assertAST("03", "03");
    assertAST("3", "3");
    assertAST("04", "04");
    assertAST("4", "4");
    assertAST("05", "05");
    assertAST("5", "5");
    assertAST("06", "06");
    assertAST("6", "6");
    assertAST("07", "07");
    assertAST("7", "7");
    assertAST("08", "08");
    assertAST("8", "8");
    assertAST("09", "09");
    assertAST("9", "9");
    assertAST("10", "10");
    assertAST("11", "11");
    assertAST("12", "12");
  }
  
  @Test
  public void int_01_to_31_optional_prefix() throws Exception {
    _ruleName = "int_01_to_31_optional_prefix";
    
    assertAST("01", "01");
    assertAST("1", "1");
    assertAST("02", "02");
    assertAST("2", "2");
    assertAST("03", "03");
    assertAST("3", "3");
    assertAST("04", "04");
    assertAST("4", "4");
    assertAST("05", "05");
    assertAST("5", "5");
    assertAST("06", "06");
    assertAST("6", "6");
    assertAST("07", "07");
    assertAST("7", "7");
    assertAST("08", "08");
    assertAST("8", "8");
    assertAST("09", "09");
    assertAST("9", "9");
    assertAST("10", "10");
    assertAST("11", "11");
    assertAST("12", "12");
    assertAST("13", "13");
    assertAST("14", "14");
    assertAST("15", "15");
    assertAST("16", "16");
    assertAST("17", "17");
    assertAST("18", "18");
    assertAST("19", "19");
    assertAST("20", "20");
    assertAST("21", "21");
    assertAST("22", "22");
    assertAST("23", "23");
    assertAST("24", "24");
    assertAST("25", "25");
    assertAST("26", "26");
    assertAST("27", "27");
    assertAST("28", "28");
    assertAST("29", "29");
    assertAST("30", "30");
    assertAST("31", "31");
  }
  
  @Test
  public void int_four_digits() throws Exception {
    _ruleName = "int_four_digits";
    
    assertAST("0000", "0000");
    assertAST("0100", "0100");
    assertAST("0020", "0020");
    assertAST("0003", "0003");
    assertAST("9999", "9999");
    assertAST("5050", "5050");
    //"000" FAIL
    //"33" FAIL
    //"2" FAIL
  }
  
  @Test
  public void spelled_or_int_01_to_31_optional_prefix() throws Exception {
    _ruleName = "spelled_or_int_01_to_31_optional_prefix";
    
    assertAST("one", "1");
    assertAST("two", "2");
    assertAST("three", "3");
    assertAST("four", "4");
    assertAST("five", "5");
    assertAST("six", "6");
    assertAST("seven", "7");
    assertAST("eight", "8");
    assertAST("nine", "9");
    assertAST("ten", "10");
    assertAST("eleven", "11");
    assertAST("twelve", "12");
    assertAST("thirteen", "13");
    assertAST("fourteen", "14");
    assertAST("fifteen", "15");
    assertAST("sixteen", "16");
    assertAST("seventeen", "17");
    assertAST("eighteen", "18");
    assertAST("nineteen", "19");
    assertAST("twenty", "20");
    assertAST("twenty one", "21");
    assertAST("twenty-one", "21");
    assertAST("twenty two", "22");
    assertAST("twenty-two", "22");
    assertAST("twenty three", "23");
    assertAST("twenty-three", "23");
    assertAST("twenty four", "24");
    assertAST("twenty-four", "24");
    assertAST("twenty five", "25");
    assertAST("twenty-five", "25");
    assertAST("twenty six", "26");
    assertAST("twenty-six", "26");
    assertAST("twenty seven", "27");
    assertAST("twenty-seven", "27");
    assertAST("twenty-eight", "28");
    assertAST("twenty nine", "29");
    assertAST("twenty-nine", "29");
    assertAST("thirty", "30");
    assertAST("thirty one", "31");
    assertAST("thirty-one", "31");
    assertAST("01", "01");
    assertAST("1", "1");
    assertAST("02", "02");
    assertAST("2", "2");
    assertAST("03", "03");
    assertAST("3", "3");
    assertAST("04", "04");
    assertAST("4", "4");
    assertAST("05", "05");
    assertAST("5", "5");
    assertAST("06", "06");
    assertAST("6", "6");
    assertAST("07", "07");
    assertAST("7", "7");
    assertAST("08", "08");
    assertAST("8", "8");
    assertAST("09", "09");
    assertAST("9", "9");
    assertAST("10", "10");
    assertAST("11", "11");
    assertAST("12", "12");
    assertAST("13", "13");
    assertAST("14", "14");
    assertAST("15", "15");
    assertAST("16", "16");
    assertAST("17", "17");
    assertAST("18", "18");
    assertAST("19", "19");
    assertAST("20", "20");
    assertAST("21", "21");
    assertAST("22", "22");
    assertAST("23", "23");
    assertAST("24", "24");
    assertAST("25", "25");
    assertAST("26", "26");
    assertAST("27", "27");
    assertAST("28", "28");
    assertAST("29", "29");
    assertAST("30", "30");
    assertAST("31", "31");
    //assertAST("zero", FAIL
  }
  
  @Test
  public void spelled_or_int_optional_prefix() throws Exception {
    _ruleName = "spelled_or_int_optional_prefix";
    
    assertAST("1", "1");
    assertAST("01", "01");
    assertAST("60", "60");
    assertAST("99", "99");
    assertAST("one", "1");
    assertAST("two", "2");
    //"00" FAIL
    //"0" FAIL
    //"zero" FAIL
  }
  
  @Test
  public void spelled_one_to_thirty_one() throws Exception {
    _ruleName = "spelled_one_to_thirty_one";
    
    assertAST("one", "1");
    assertAST("two", "2");
    assertAST("three", "3");
    assertAST("four", "4");
    assertAST("five", "5");
    assertAST("six", "6");
    assertAST("seven", "7");
    assertAST("eight", "8");
    assertAST("nine", "9");
    assertAST("ten", "10");
    assertAST("eleven", "11");
    assertAST("twelve", "12");
    assertAST("thirteen", "13");
    assertAST("fourteen", "14");
    assertAST("fifteen", "15");
    assertAST("sixteen", "16");
    assertAST("seventeen", "17");
    assertAST("eighteen", "18");
    assertAST("nineteen", "19");
    assertAST("twenty", "20");
    assertAST("twenty one", "21");
    assertAST("twenty-one", "21");
    assertAST("twenty two", "22");
    assertAST("twenty-two", "22");
    assertAST("twenty three", "23");
    assertAST("twenty-three", "23");
    assertAST("twenty four", "24");
    assertAST("twenty-four", "24");
    assertAST("twenty five", "25");
    assertAST("twenty-five", "25");
    assertAST("twenty six", "26");
    assertAST("twenty-six", "26");
    assertAST("twenty seven", "27");
    assertAST("twenty-seven", "27");
    assertAST("twenty-eight", "28");
    assertAST("twenty nine", "29");
    assertAST("twenty-nine", "29");
    assertAST("thirty", "30");
    assertAST("thirty one", "31");
    assertAST("thirty-one", "31");
        
    //"zero" FAIL
    //"thirty two" FAIL
    //"thirty-two" FAIL
  }
  
  @Test
  public void spelled_first_to_thirty_first() throws Exception {
    _ruleName = "spelled_first_to_thirty_first";
    
    assertAST("first", "1");
    assertAST("1st", "1");
    assertAST("second", "2");
    assertAST("2nd", "2");
    assertAST("third", "3");
    assertAST("3rd", "3");
    assertAST("fourth", "4");
    assertAST("4th", "4");
    assertAST("fifth", "5");
    assertAST("5th", "5");
    assertAST("sixth", "6");
    assertAST("6th", "6");
    assertAST("seventh", "7");
    assertAST("7th", "7");
    assertAST("eighth", "8");
    assertAST("8th", "8");
    assertAST("ninth", "9");
    assertAST("9th", "9");
    assertAST("tenth", "10");
    assertAST("10th", "10");
    assertAST("eleventh", "11");
    assertAST("11th", "11");
    assertAST("twelfth", "12");
    assertAST("12th", "12");
    assertAST("thirteenth", "13");
    assertAST("13th", "13");
    assertAST("fourteenth", "14");
    assertAST("14th", "14");
    assertAST("fifteenth", "15");
    assertAST("15th", "15");
    assertAST("sixteenth", "16");
    assertAST("16th", "16");
    assertAST("seventeenth", "17");
    assertAST("17th", "17");
    assertAST("eighteenth", "18");
    assertAST("18th", "18");
    assertAST("nineteenth", "19");
    assertAST("19th", "19");
    assertAST("twentieth", "20");
    assertAST("20th", "20");
    assertAST("twenty-first", "21");
    assertAST("twenty first", "21");
    assertAST("21st", "21");
    assertAST("twenty-second", "22");
    assertAST("twenty second", "22");
    assertAST("22nd", "22");
    assertAST("twenty-third", "23");
    assertAST("twenty third", "23");
    assertAST("23rd", "23");
    assertAST("twenty-fourth", "24");
    assertAST("twenty fourth", "24");
    assertAST("24th", "24");
    assertAST("twenty-fifth", "25");
    assertAST("twenty fifth", "25");
    assertAST("25th", "25");
    assertAST("twenty-sixth", "26");
    assertAST("twenty sixth", "26");
    assertAST("26th", "26");
    assertAST("twenty-seventh", "27");
    assertAST("twenty seventh", "27");
    assertAST("27th", "27");
    assertAST("twenty-eighth", "28");
    assertAST("twenty eighth", "28");
    assertAST("28th", "28");
    assertAST("twenty-ninth", "29");
    assertAST("twenty ninth", "29");
    assertAST("29th", "29");
    assertAST("thirtieth", "30");
    assertAST("30th", "30");
    assertAST("thirty-first", "31");
    assertAST("thirty first", "31");
    assertAST("31st", "31");
  }
}
