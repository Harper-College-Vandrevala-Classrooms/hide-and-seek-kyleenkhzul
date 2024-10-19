package com.csc;

import java.util.ArrayList;

public class FuzzyFinder {

  public int linearSearch(ArrayList<Fuzzy> arr) {
    for(int i = 0; i < arr.size(); i++) {
      if(arr.get(i).equals("gold")) {
        return i;
      }
    }
    return -1;
  }

  public int binarySearch(ArrayList<Fuzzy> arr) {
    int low = 0;
    int high = arr.size()-1;

    while(low <= high) {
      int middlePosition = (high+low) / 2;
      Fuzzy middleFuzzy = arr.get(middlePosition);

      if(middleFuzzy.equals("gold")) {
        return middlePosition;
      }
      if()
    }
    return -1;
  }
  public static void main(String args[]) {
    System.out.println("In addition to your search functions, you can write a main function if you wish!");
  }
}
