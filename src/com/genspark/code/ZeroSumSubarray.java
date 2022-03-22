package com.genspark.code;

import java.util.HashSet;
import java.util.Set;

public class ZeroSumSubarray {
    public static boolean subArrayExists(int[] arr)
    {
        // Creates an empty hashset hs
        Set<Integer> hs = new HashSet<Integer>();

        int sum = 0;

        for (int i = 0; i < arr.length; i++)
        {

            sum += arr[i];

            if (arr[i] == 0 || sum == 0 || hs.contains(sum))
                return true;

            // Add sum to hash set
            hs.add(sum);
        }

        return false;
    }
}
