package com.ynz.CodeCharllenge;

import java.util.Deque;
import java.util.LinkedList;
import java.util.stream.Collectors;

/**
 * How to reverse a String
 *
 * @author YNZ
 */
public class ReverseString {

    public static void main(String[] args) {
        String str = "Design Patterns";

        // method 1
        char[] chars = str.toCharArray();

        int i, j;
        char[] reversed = new char[chars.length];
        // for loop; var. initialisation; condition (true); var increment
        for (i = chars.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = chars[i];
        }

        System.out.println("" + String.valueOf(chars));
        System.out.println("" + String.valueOf(reversed));

        // method 2 using a stack
        Deque<Character> stack = new LinkedList<>();

        for (char c : chars) {
            stack.push(c);
        }

        //converting a Collection of Character into a String.
        String reversed1 = stack.stream().map(String::valueOf).collect(Collectors.joining(""));
        System.out.println(reversed1);
    }
}
