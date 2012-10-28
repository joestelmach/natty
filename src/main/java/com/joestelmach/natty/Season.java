package com.joestelmach.natty;

import java.util.HashMap;
import java.util.Map;

public enum Season {
  WINTER("Winter Solstice"),
  SPRING("Vernal Equinox"),
  SUMMER("Summer Solstice"),
  FALL("Autumnal Equinox");
  
  private String summary;
  private static final Map<String, Season> lookup;
  static {
    lookup = new HashMap<String, Season>();
    for(Season h:values()) {
      lookup.put(h.getSummary(), h);
    }
  }

  Season(String summary) {
    this.summary = summary;
  }

  public String getSummary() {
    return summary;
  }

  public static Season fromSummary(String summary) {
    if(summary == null) return null;
    return lookup.get(summary);
  }
}
