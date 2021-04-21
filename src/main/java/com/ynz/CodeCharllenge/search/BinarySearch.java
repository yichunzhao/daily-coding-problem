package com.ynz.CodeCharllenge.search;

import java.util.Arrays;

/**
 * divide and conquer.
 */
public class BinarySearch {

    private static final int arr[] = {12, 33, 55, 787, 44, 23, 369, 2012};

    public static void main(String[] args) {
        Arrays.sort(arr);
        System.out.println("sorted:  " + Arrays.toString(arr));

        System.out.printf("target index: %s \n ", binarySearch(arr, 787));
        System.out.printf("target index: %s \n ", binarySearch(arr, 999));
        System.out.printf("target index: %s \n ", binarySearch(arr, 44));
    }

    private static int binarySearch(int[] arr, int target) {
        System.out.printf("find target ... %s \n ", target);

        int low = 0;
        int high = arr.length - 1;

        while (high >= low) {

            int mid = (low + high) / 2;
            System.out.printf("current mid number %s \n", mid);

            if (target == arr[mid]) return mid;

            if (target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

}
