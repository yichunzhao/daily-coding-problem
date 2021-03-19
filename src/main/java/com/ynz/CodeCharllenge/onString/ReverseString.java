package com.ynz.CodeCharllenge.onString;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Given a string, find its reversed one.
 */
public class ReverseString {

    public static void main(String[] args) {
        String input = "I love this game";

        System.out.println(reverse(input));
    }

    public static String reverse(String input) {
        char[] chars = input.toCharArray();

        Deque<Character> stack = new LinkedList<>();

        for (char c : chars) {
            stack.push(c);
        }

        StringBuilder sb = new StringBuilder();
        stack.forEach(c -> sb.append(c));

        return sb.toString();
    }

}
