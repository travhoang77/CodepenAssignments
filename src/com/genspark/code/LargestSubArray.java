package com.genspark.code;

import java.util.stream.IntStream;

public class LargestSubArray {
    Integer[] findSubArray(int[] arr, int n)
    {
        int sum = 0;
        int maxsize = -1, startindex = 0;
        int endindex = 0;

        // Pick a starting point as i

        for (int i = 0; i < n - 1; i++) {
            sum = (arr[i] == 0) ? -1 : 1;



            for (int j = i + 1; j < n; j++) {
                if (arr[j] == 0)
                    sum += -1;
                else
                    sum += 1;

                if (sum == 0 && maxsize < j - i + 1) {
                    maxsize = j - i + 1;
                    startindex = i;
                }
            }
        }

        if (maxsize == -1)
            return null;
        else
           return  IntStream.range(startindex, endindex + 1)
                   .mapToObj(i -> arr[i])
                   .toArray(Integer[]::new);

    }
}
