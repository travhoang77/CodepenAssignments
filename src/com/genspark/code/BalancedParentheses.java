package com.genspark.code;

public class BalancedParentheses {

    public static boolean isBalanced(String input) {
        int n = -1;
        while (input.length() != n){
            n = input.length();
            input = input.replaceAll("\\(\\)", "");
            input = input.replaceAll("\\[]", "");
            input = input.replaceAll("\\{}", "");
        }
        if (input.length() == 0) return true;
        else return false;
    }

}
