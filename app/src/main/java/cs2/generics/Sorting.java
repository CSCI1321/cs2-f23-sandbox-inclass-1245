package cs2.generics;

public class Sorting {
  
  public static <T extends Comparable> void bubbleSort(T[] a) {
    for(int j=0; j<a.length; j++) {
      for(int i=0; i<a.length-1; i++) {
        if(a[i].compareTo(a[i+1]) > 0) { //Should I swap?
          T tmp = a[i];
          a[i] = a[i+1];
          a[i+1] = tmp;
        }
      }
    }
  }

  public static void main(String[] args) {
    Integer[] x = new Integer[10];
    for(int i=0; i<x.length; i++) {
      x[i] = (int)(Math.random() * 100);
    }
    for(int i=0; i<x.length; i++) { System.out.print(x[i] + ","); }
    System.out.println();
    bubbleSort(x);
    for(int i=0; i<x.length; i++) { System.out.print(x[i] + ","); }
    System.out.println();
  }


}