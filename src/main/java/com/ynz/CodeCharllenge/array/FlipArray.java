package com.ynz.CodeCharllenge.array;

import java.util.Arrays;

/**
 * Flip an array of numbers
 * <p>
 * for the for loop
 * watch out: condition 2 defines the condition for executing the code block
 */
public class FlipArray {
    private static final int[] numbs = {3, 6, 9};

    public static void main(String[] args) {
        System.out.printf("original array %s \n", Arrays.toString(numbs));
        System.out.printf("after array flipping %s \n", Arrays.toString(flip(numbs)));
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
}
