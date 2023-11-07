package cs2.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetStuff {
  public static void main(String[] args) {
    Set<String> s = new HashSet<String>();
    s.add("Hello");
    s.add("goodbye");
    s.add("What?");
    s.add("goodbye");
    System.out.println(s);
    System.out.println(s.size());
    s.remove("What?");
    System.out.println(s);
    System.out.println(s.size());
    System.out.println(s.contains("Hello"));
    System.out.println(s.contains("What?"));
    
    HashSet<String> t = new HashSet<String>();
    t.add("Hello");
    t.add("there");
    t.add("you");
    System.out.println("t=" + t);
    s.addAll(t);
    System.out.println(s);
    s.retainAll(t);
    System.out.println(s);
    s.add("second");
    s.removeAll(t);
    System.out.println(s);

    HashSet<String> u = new HashSet<String>();
    Iterator<String> iter = t.iterator();
    while(iter.hasNext()) {
      String element = iter.next();
      System.out.println(element);
      u.add(element.toUpperCase());
    }
    System.out.println(u);
  }
}
