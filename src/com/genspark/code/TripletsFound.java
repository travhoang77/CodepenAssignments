package com.genspark.code;

import java.util.Arrays;

public class TripletsFound {

    static boolean tripletExists(int arr[], int n)
    {
        boolean found = false;

        // sort array elements
        Arrays.sort(arr);

        for (int i=0; i<n-1; i++)
        {
            // initialize left and right
            int l = i + 1;
            int r = n - 1;
            int x = arr[i];
            while (l < r)
            {
                if (x + arr[l] + arr[r] == 0)
                {


                    l++;
                    r--;
                    found = true;
                }

                // If sum of three elements is less
                // than zero then increment in left
                else if (x + arr[l] + arr[r] < 0)
                    l++;

                    // if sum is greater than zero than
                    // decrement in right side
                else
                    r--;
            }
        }

        return found;
    }
}
