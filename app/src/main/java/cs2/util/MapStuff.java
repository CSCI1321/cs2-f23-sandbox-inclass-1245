package cs2.util;

import java.util.HashMap;
import java.util.Map;

public class MapStuff {
  public static void main(String[] args) {
    Map<String, Double> m = new HashMap<String, Double>();
    m.put("pi", Math.PI);
    m.put("two", 2.0);
    m.put("Hello", 0.5);
    m.put("goodbye", 0.5);
    System.out.println(m);
    System.out.println(m.size());
    System.out.println(m.get("pi"));
    m.remove("two");
    System.out.println(m);
    System.out.println(m.containsKey("Hello"));
    System.out.println(m.containsValue(0.0));
    m.put("pi", 3.0);
    System.out.println(m);
    System.out.println(m.keySet());
    System.out.println(m.values());
  }
}
