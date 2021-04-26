package com.ynz.CodeCharllenge.sort;

import java.util.Arrays;

/**
 * Bubble sorting, each loop finding the max. value; and the max is shifted to the tail.
 * <p>
 * The outer-loop points to the total loops; in each loop, traversing all elements and finding out the maximal value.
 * <p>
 * so its time complexity approximates to the O(n2)
 */
public class BubbleSorting {
    private static int[] arr = {12, 8, 7, 5, 2};

    public static void main(String[] args) {
        System.out.printf("before sorting: %s \n", Arrays.toString(arr));
        System.out.printf("after sorting: %s \n", Arrays.toString(bubbleSort(arr)));
    }

    public static int[] bubbleSort(int[] arr) {
        int[] copy = Arrays.copyOf(arr, arr.length);

        int tailIndex = copy.length - 1;
        for (int i = 0; i <= tailIndex - 1; i++) {
            for (int j = 0; j <= tailIndex - 1 - i; j++) {
                if (copy[j] > copy[j + 1]) {
                    int tmp = copy[j + 1];
                    copy[j + 1] = copy[j];
                    copy[j] = tmp;
                }
            }
        }

        return copy;
    }

}
