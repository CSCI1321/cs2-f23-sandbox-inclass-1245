package cs2.util;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class TextAnalysis {
  public static HashSet<String> getWords(String filename) {
    HashSet<String> words = new HashSet<String>();
    try {
      File f = new File(filename);
      Scanner fin = new Scanner(f);
      while(fin.hasNextLine()) {
        String line = fin.nextLine();
        String[] parts = line.split("\\s");
        for(int i=0; i<parts.length; i++) {
          String withoutPeriods = parts[i].replaceAll("[^A-Za-z]","");
          words.add(withoutPeriods.toLowerCase());
        }
      }
    } catch(Exception e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
    }
    return words;
  }
  public static HashMap<String,Integer> countWords(String filename) {
    HashMap<String,Integer> words = new HashMap<String,Integer>();
    try {
      File f = new File(filename);
      Scanner fin = new Scanner(f);
      while(fin.hasNextLine()) {
        String line = fin.nextLine();
        String[] parts = line.split("\\s");
        for(int i=0; i<parts.length; i++) {
          String cleanWord = parts[i].replaceAll("[^A-Za-z]","");
          //words.add(cleanWord.toLowerCase());
          cleanWord = cleanWord.toLowerCase();
          if(words.containsKey(cleanWord)) {
            words.put(cleanWord, 1 + words.get(cleanWord));
          } else {
            words.put(cleanWord, 1);
          }
        }
      }
    } catch(Exception e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
    }
    words.remove("");
    return words;
  }
  public static void main(String[] args) {
    HashMap<String, Integer> tempestMap = countWords("tempest.txt");
    System.out.println(tempestMap);
    System.out.println(tempestMap.size());

    Iterator<String> it = tempestMap.keySet().iterator();
    while(it.hasNext()) {
      String key = it.next();
      if(tempestMap.get(key) > 100) {
        System.out.println(key + ": " + tempestMap.get(key));
      }
    }

    for(String key : tempestMap.keySet()) {
      if(tempestMap.get(key) > 100) {
        System.out.println(key + ": " + tempestMap.get(key));
      }
    }
    /*
    for(Map.Entry<String,Integer> entr : tempestMap) {
      if(entr.getValue() > 100) {
        System.out.println(entr.getKey());
      }
    }*/


    /*
    HashSet<String> tempestWords = getWords("tempest.txt");
    HashSet<String> midsummerWords = getWords("midsummer.txt");
    System.out.println(tempestWords.size());
    System.out.println(midsummerWords.size());

    HashSet<String> tempestCopy = (HashSet<String>)tempestWords.clone();

    tempestCopy.removeAll(midsummerWords);
    System.out.println(tempestCopy);
    System.out.println(tempestCopy.size());
    midsummerWords.removeAll(tempestWords);
    System.out.println(midsummerWords);
    System.out.println(midsummerWords.size());
    */
  }

}
