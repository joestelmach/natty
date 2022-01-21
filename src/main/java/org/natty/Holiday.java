package org.natty;

import java.util.HashMap;
import java.util.Map;

public enum Holiday {
  APRIL_FOOLS_DAY("April Fool's Day"),
  BLACK_FRIDAY("Black Friday"),
  CHRISTMAS("Christmas Day"),
  CHRISTMAS_EVE("Christmas Eve"),
  COLUMBUS_DAY("Columbus Day (US-OPM)"),
  EARTH_DAY("Earth Day"),
  EASTER("Easter Sunday"),
  FATHERS_DAY("Father's Day"),
  FLAG_DAY("Flag Day"),
  GOOD_FRIDAY("Good Friday"),
  GROUNDHOG_DAY("Groundhog's Day"),
  HALLOWEEN("Halloween"),
  INDEPENDENCE_DAY("Independence Day"),
  KWANZAA("Kwanzaa"),
  LABOR_DAY("Labor Day"),
  MLK_DAY("Martin Luther King Jr.'s Day"),
  MEMORIAL_DAY("Memorial Day"),
  MOTHERS_DAY("Mother's Day"),
  NEW_YEARS_DAY("New Year's Day"),
  NEW_YEARS_EVE("New Year's Eve"),
  PATRIOT_DAY("Patriot Day"),
  PRESIDENTS_DAY("President's Day"),
  ST_PATRICKS_DAY("St. Patrick's Day"),
  TAX_DAY("Tax Day"),
  THANKSGIVING("Thanksgiving Day"),
  ELECTION_DAY("US General Election"),
  VALENTINES_DAY("Valentine's Day"),
  VETERANS_DAY("Veteran's Day");

  private String summary;
  private static final Map<String, Holiday> lookup;
  static {
    lookup = new HashMap<String, Holiday>();
    for(Holiday h:values()) {
      lookup.put(h.getSummary(), h);
    }
  }

  Holiday(String summary) {
    this.summary = summary;
  }

  public String getSummary() {
    return summary;
  }

  public static Holiday fromSummary(String summary) {
    if(summary == null) return null;
    return lookup.get(summary);
  }
}
