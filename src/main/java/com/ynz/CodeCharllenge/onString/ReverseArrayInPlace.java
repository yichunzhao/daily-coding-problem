package com.ynz.CodeCharllenge.onString;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * reverse an array of strings, using indexing
 */
public class ReverseArrayInPlace {

    private static final String[] names = {"John", "Jammy", "Luke"};

    public static void main(String[] args) {
        System.out.printf("original names: %s \n", Arrays.deepToString(names));
        System.out.printf("reversed names: %s \n", Arrays.deepToString(reverse(names)));

        System.out.printf("reversed names by stack: %s \n", Arrays.deepToString(reverseAnother(names)));
    }

    private static String[] reverse(String[] strings) {
        if (strings == null || strings.length == 0) throw new IllegalArgumentException("null value or empty");

        String[] reversed = new String[strings.length];

        int i, j;
        for (i = 0, j = strings.length - 1; j > 0; i++, j--) {
            reversed[i] = strings[j];
        }

        return reversed;
    }

    private static String[] reverseAnother(String[] strings) {
        if (strings == null || strings.length == 0) throw new IllegalArgumentException("null value or empty");

        Deque<String> stack = new LinkedList<>();

        Arrays.stream(strings).forEach(s -> stack.push(s));

        return stack.toArray(new String[0]);
    }

}
