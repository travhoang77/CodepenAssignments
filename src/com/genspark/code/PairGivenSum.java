package com.genspark.code;

import java.util.HashMap;
import java.util.Map;

public class PairGivenSum {

    public static boolean pairExists(int[] nums, int target)
    {
        // create an empty HashMap
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++)
        {

            if (map.containsKey(target - nums[i]))
            {
                //pair found
                return true;
            }

            map.put(nums[i], i);
        }

        // we reach here if the pair is not found
        return false;
    }

}
