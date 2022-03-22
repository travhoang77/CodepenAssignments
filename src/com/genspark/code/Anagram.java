package com.genspark.code;

import java.util.Arrays;

import static java.util.Arrays.*;

public class Anagram {
    //If two English words have the same characters and the occurrence number of each character??
    public static boolean isAnagram(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }
        char[] a1 = string1.toCharArray();
        char[] a2 = string2.toCharArray();
        sort(a1);
        sort(a2);
        return Arrays.equals(a1, a2);
    }
}
