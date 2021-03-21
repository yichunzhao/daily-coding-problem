package com.ynz.CodeCharllenge.array;

import java.util.Arrays;

/**
 * Flip an array of numbers
 * <p>
 * for the for loop
 * watch out: condition 2 defines the condition for executing the code block
 *
 * and flip first k elements of array
 */
public class FlipArray {
    private static final int[] numbs = {3, 6, 9};
    private static final int[] numbs1 = {3, 6, 9, 12, 14, 16};

    public static void main(String[] args) {
        System.out.printf("original array %s \n", Arrays.toString(numbs));
        System.out.printf("after array flipping %s \n", Arrays.toString(flip(numbs)));

        System.out.printf("original array %s \n", Arrays.toString(numbs1));
        System.out.printf("after flipping k %s \n", Arrays.toString(flipK(numbs1, 3)));
    }

    private static int[] flip(int[] arr) {
        if (arr == null) throw new IllegalArgumentException("bad request: null input");
        if (arr.length == 0) throw new IllegalArgumentException("bad request: empty array");

        int[] flipped = new int[arr.length];

        int i, j;
        for (i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            flipped[j] = arr[i];
        }

        return flipped;
    }

    /**
     * flip the first k elements of this array
     *
     * @param arr int[] an array of int
     * @param k   flipping the first k elements of this array.
     * @return int[]
     */
    private static int[] flipK(int[] arr, int k) {
        if (arr == null) throw new IllegalArgumentException("bad request: null input");
        if (arr.length == 0) throw new IllegalArgumentException("bad request: empty array");
        if (k > arr.length || k <= 0) throw new IllegalArgumentException("bad request: beyond the scope of arr");

        int[] tmp = new int[k];

        for (int i = 0; i < k; i++) {
            tmp[i] = arr[i];
        }

        int[] flipped = flip(tmp);

        int[] copy = Arrays.copyOfRange(arr, 0, arr.length);

        for (int i = 0; i < k; i++) {
            copy[i] = flipped[i];
        }

        return copy;
    }

}
