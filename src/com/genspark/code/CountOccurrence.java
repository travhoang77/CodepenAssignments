package com.genspark.code;

import java.util.ArrayList;
import java.util.Collections;

public class CountOccurrence {
    //Please implement a function to find how many times a number occurs in a sorted array.
    //For instance, the output is 4 when the inputs are an array {1, 2, 3, 3, 3, 3, 4, 5} and the number 3 because 3 occurs 4 times in the given array.

    // Function to count occurrences
    static int countOccurrences(ArrayList<Integer> list, int x) {
        return Collections.frequency(list, x);
    }
}
