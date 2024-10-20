package com.csc;

import java.util.ArrayList;

public class FuzzyFinder {

  public int linearSearch(ArrayList<Fuzzy> arr) {
    for(int i = 0; i < arr.size(); i++) {
      if(arr.get(i).color.equals("gold")) {
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

      if(middleFuzzy.color.equals("gold")) {
        return middlePosition;
      }
      if(middleFuzzy.color.compareTo("gold") < 0) {
        low = middlePosition + 1;
      } else {
        high = middlePosition - 1;
      }
    }
    return -1;
  }
}
