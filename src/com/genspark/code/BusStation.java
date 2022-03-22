package com.genspark.code;

import java.util.Arrays;

public class BusStation {

    public static int findPlatformsRequired(int[] arr, int[] dep, int n)
    {
        int platform_needed = 0;
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i = 0, j = 0;

        int maxPlatforms = 0;
        while (i < n && j < n)
        {
            if (arr[i] < dep[j])
            {
                platform_needed++;
                i++;
                if (platform_needed > maxPlatforms)
                    maxPlatforms = platform_needed;
            }
            else
            {
                platform_needed--;
                j++;
            }
        }
        return maxPlatforms;
    }
}
