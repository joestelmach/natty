package com.joestelmach.natty.grammar;

import org.junit.Test;

public class HolidayGrammarTest extends AbstractGrammarTest {
  
  @Test
  public void names() throws Exception {
    _ruleName = "holiday_name";
    
    assertAST("april fool's day", "APRIL_FOOLS_DAY");
    assertAST("april fools day", "APRIL_FOOLS_DAY");
    assertAST("april fool day", "APRIL_FOOLS_DAY");
    
    assertAST("black friday", "BLACK_FRIDAY");
    assertAST("black fri", "BLACK_FRIDAY");
    assertAST("black fri.", "BLACK_FRIDAY");
    
    assertAST("christmas", "CHRISTMAS");
    assertAST("christmas day", "CHRISTMAS");
    
    assertAST("christmas eve", "CHRISTMAS_EVE");
    assertAST("christmas eve.", "CHRISTMAS_EVE");
    assertAST("christmas evening", "CHRISTMAS_EVE");
    
    assertAST("columbus day", "COLUMBUS_DAY");
    
    assertAST("earth day", "EARTH_DAY");
    
    assertAST("easter", "EASTER");
    assertAST("easter day", "EASTER");
    assertAST("easter sunday", "EASTER");
    
    assertAST("father's day", "FATHERS_DAY");
    assertAST("fathers day", "FATHERS_DAY");
    
    assertAST("flag day", "FLAG_DAY");
    
    assertAST("good friday", "GOOD_FRIDAY");
    assertAST("good fri", "GOOD_FRIDAY");
    assertAST("good fri.", "GOOD_FRIDAY");
    
    assertAST("groundhog day", "GROUNDHOG_DAY");
    assertAST("groundhogs day", "GROUNDHOG_DAY");
    assertAST("groundhog's day", "GROUNDHOG_DAY");
    
    assertAST("halloween", "HALLOWEEN");
    assertAST("haloween", "HALLOWEEN");
    assertAST("halloween day", "HALLOWEEN");
    
    assertAST("independence day", "INDEPENDENCE_DAY");
    
    assertAST("kwanzaa", "KWANZAA");
    assertAST("kwanza", "KWANZAA");
    assertAST("kwanzaa day", "KWANZAA");
    
    assertAST("labor day", "LABOR_DAY");
    
    assertAST("martin luther king day", "MLK_DAY");
    assertAST("martin luther king jr.'s day", "MLK_DAY");
    assertAST("martin luther king jr. day", "MLK_DAY");
    assertAST("martin luther king jr day", "MLK_DAY");
    assertAST("mlk day", "MLK_DAY");
    
    assertAST("memorial day", "MEMORIAL_DAY");
    
    assertAST("memorial day", "MEMORIAL_DAY");
    
    assertAST("mothers day", "MOTHERS_DAY");
    assertAST("mother's day", "MOTHERS_DAY");
    
    assertAST("new year's day", "NEW_YEARS_DAY");
    assertAST("new years day", "NEW_YEARS_DAY");
    assertAST("new years", "NEW_YEARS_DAY");
    
    assertAST("new year's eve", "NEW_YEARS_EVE");
    assertAST("new years eve", "NEW_YEARS_EVE");
    assertAST("new years eve.", "NEW_YEARS_EVE");
    
    assertAST("patriot day", "PATRIOT_DAY");
    
    assertAST("president's day", "PRESIDENTS_DAY");
    assertAST("presidents day", "PRESIDENTS_DAY");
    assertAST("president day", "PRESIDENTS_DAY");
    
    assertAST("st. patricks day", "ST_PATRICKS_DAY");
    assertAST("st patrick's day", "ST_PATRICKS_DAY");
    assertAST("saint patrick's day", "ST_PATRICKS_DAY");
    assertAST("saint paddy's day", "ST_PATRICKS_DAY");
    assertAST("saint paddys day", "ST_PATRICKS_DAY");
    
    assertAST("tax day", "TAX_DAY");
    
    assertAST("thanksgiving", "THANKSGIVING");
    assertAST("thanksgiving day", "THANKSGIVING");
    
    assertAST("election day", "ELECTION_DAY");
    
    assertAST("valentine's day", "VALENTINES_DAY");
    assertAST("valentines day", "VALENTINES_DAY");
    assertAST("valentine day", "VALENTINES_DAY");
    
    assertAST("veterans day", "VETERANS_DAY");
    assertAST("veteran's day", "VETERANS_DAY");
    assertAST("veteran day", "VETERANS_DAY");
  }
  
  @Test
  public void statments() throws Exception {
    _ruleName = "holiday";
    
    assertAST("april fool's day", "(SEEK > by_day 1 APRIL_FOOLS_DAY)");
    
    assertAST("next christmas", "(SEEK > by_week 1 CHRISTMAS)");
    assertAST("coming christmas", "(SEEK > by_day 1 CHRISTMAS)");
    assertAST("upcoming christmas", "(SEEK > by_day 1 CHRISTMAS)");
    
    assertAST("last halloween", "(SEEK < by_week 1 HALLOWEEN)");
    assertAST("past halloween", "(SEEK < by_day 1 HALLOWEEN)");
    
    assertAST("in three christmases", "(SEEK > by_day 3 CHRISTMAS)");
    
    assertAST("three christmases from now", "(SEEK > by_day 3 CHRISTMAS)");
    assertAST("3 christmases ago", "(SEEK < by_day 3 CHRISTMAS)");
    assertAST("2 april fool's days ago", "(SEEK < by_day 2 APRIL_FOOLS_DAY)");
    
    assertAST("in 10 thanksgivings", "(SEEK > by_day 10 THANKSGIVING)");
    
    assertAST("thanksgiving 2011", "(EXPLICIT_SEEK THANKSGIVING (YEAR_OF 2011))");
    assertAST("christmas, '95", "(EXPLICIT_SEEK CHRISTMAS (YEAR_OF 95))");
  }
}
