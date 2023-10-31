package cs2.generics;

import java.util.ArrayList;

public class GenericStuff {
  
  public static ArrayList<Integer> arrayToList(int[] a) {
    ArrayList<Integer> lst = new ArrayList<Integer>();
    for(int i=0; i<a.length; i++) {
      lst.add(a[i]);
    }
    return lst;
  }

  public static <T> ArrayList<T> arrayToList(T[] a) {
    ArrayList<T> lst = new ArrayList<T>();
    for(int i=0; i<a.length; i++) {
      lst.add(a[i]);
    }
    return lst;
  }

  public static void main(String[] args) {
    int[] x = {1,2,3,5};
    Double[] y = {1.2, 5.4, 3.2};
    System.out.println(x);
    System.out.println(arrayToList(x));

    System.out.println(y);
    System.out.println(arrayToList(y));
  }



}
