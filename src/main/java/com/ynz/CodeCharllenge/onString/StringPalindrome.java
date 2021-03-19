package com.ynz.CodeCharllenge.onString;

import java.util.Deque;
import java.util.LinkedList;
import java.util.stream.Collectors;

/**
 * You need to write a simple Java program to check if a given String is palindrome or not.
 * A Palindrome is a String which is equal to the reverse of itself, e.g.,
 * "Bob" is a palindrome because of the reverse of "Bob" is also "Bob."
 * Though be prepared with both recursive and iterative solution of this problem.
 */
public class StringPalindrome {

    public static void main(String[] args) {
        String input = "Bob";
        System.out.printf("is %s Palindrome? %b \n", input, isPalindrome(input));

        String input1 = "You";
        System.out.printf("is %s Palindrome? %b \n", input1, isPalindrome(input1));
    }

    public static boolean isPalindrome(String str) {
        String reversed = reverse(str);
        return str.equalsIgnoreCase(reversed);
    }

    private static String reverse(String str) {
        Deque<Character> stack = new LinkedList<>();
        char[] chars = str.toCharArray();
        for (char c : chars) {
            stack.push(c);
        }

        return stack.stream().map(String::valueOf).collect(Collectors.joining());
    }

}
