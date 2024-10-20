package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFuzzyFinder {

  FuzzyFinder finder;
  FuzzyListGenerator generator;
  ArrayList<Fuzzy> sortedFuzzies;
  ArrayList<Fuzzy> randomFuzzies;

  @BeforeEach
  void setUp() {
    finder = new FuzzyFinder();
    generator = new FuzzyListGenerator();
    sortedFuzzies = generator.sortedRainbowFuzzies();
    randomFuzzies = generator.randomizedRainbowFuzzies();
  }

    @Test
    void testLinearSearchSorted() {
        // Linear search on sorted fuzzies
        int result = finder.linearSearch(sortedFuzzies);
        assertTrue(result >= 0 && sortedFuzzies.get(result).color.equals("gold"));
    }

    @Test
    void testBinarySearchSorted() {
        // Binary search on sorted fuzzies
        int result = finder.binarySearch(sortedFuzzies);
        assertTrue(result >= 0 && sortedFuzzies.get(result).color.equals("gold"));
    }

    @Test
    void testLinearSearchRandom() {
        // Linear search on random fuzzies
        int result = finder.linearSearch(randomFuzzies);
        assertTrue(result >= 0 && randomFuzzies.get(result).color.equals("gold"));
    }

    @Test
    void testBinarySearchRandom() {
        // Binary search on random fuzzies (this should fail since the list is not sorted)
        int result = finder.binarySearch(randomFuzzies);
        assertEquals(-1, result); // Binary search should return -1 as the list is unsorted
    }
}
