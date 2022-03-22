package com.genspark.code;

public class InversionCount {

    //If an element at the left side is greater than another element at the right side, they form a
    //reversed pair in an array. How do you get a count of reversed pairs?
    //For example, there are five reversed pairs in the array {7, 5, 6, 4}, which are (7, 5), (7, 6), (7, 4), (5, 4), and (6, 4).

    public static long getInversionsCount(int[] arr, int n) {
        return mergeSort(arr, 0, n - 1);
    }

    private static long merge(int[] arr, int left, int mid, int right) {
        int i = left, j = mid, k = 0;
        int invCount = 0;
        int[] temp = new int[(right - left + 1)];

        while ((i < mid) && (j <= right)) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                ++k;
                ++i;
            }
            else {
                temp[k] = arr[j];
                invCount += (mid - i);
                ++k;
                ++j;
            }
        }

        while (i < mid) {
            temp[k] = arr[i];
            ++k;
            ++i;
        }

        while (j <= right) {
            temp[k] = arr[j];
            ++k;
            ++j;
        }

        for (i = left, k = 0; i <= right; i++, k++) {
            arr[i] = temp[k];
        }

        return invCount;
    }
    private static long mergeSort(int[] arr, int left, int right) {
        long invCount = 0;

        if (right > left) {
            int mid = (right + left) / 2;

            invCount = mergeSort(arr, left, mid);
            invCount += mergeSort(arr, mid + 1, right);
            invCount += merge(arr, left, mid + 1, right);
        }
        return invCount;
    }
}
