package com.genspark.code;

public class Palindrome {

    public static boolean isPalindrome(String string1, String string2) {
        if(string1.length() != string2.length()) return false;

        StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder input1
        input1.append(string1);

        // reverse StringBuilder input1
        input1.reverse();

        return input1.equals(string2);
    }
}
