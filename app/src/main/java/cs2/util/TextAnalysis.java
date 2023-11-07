package cs2.util;

import java.io.File;
import java.util.HashSet;
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
  public static void main(String[] args) {
    HashSet<String> tempestWords = getWords("tempest.txt");
    HashSet<String> midsummerWords = getWords("midsummer.txt");
    System.out.println(tempestWords.size());
    System.out.println(midsummerWords.size());
    tempestWords.removeAll(midsummerWords);
    System.out.println(tempestWords);
    System.out.println(tempestWords.size());

  }

}
