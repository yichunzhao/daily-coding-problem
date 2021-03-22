package com.ynz.CodeCharllenge.numbers;

import java.util.Deque;
import java.util.LinkedList;
import java.util.stream.Collectors;

/**
 * 1001 is a Palindrome; 2345 is not;
 */
public class IntegerPalindrome {

    public static void main(String[] args) {
        int input = 1001;
        System.out.printf("is %d a Palindrome? %b \n", input, isPalindrome(input));

        int input1 = 2345;
        System.out.printf("is %d a Palindrome? %b \n", input1, isPalindrome(input1));

        System.out.printf("using remainder operation to reverse a number. \n");

        System.out.printf("is %d a Palindrome? %b \n", input, isPalindrome(input));
        System.out.printf("is %d a Palindrome? %s \n", input1, isPalindromeAnother(input1));
    }

    private static boolean isPalindrome(int input) {
        if (input < 0) throw new IllegalArgumentException("negative int is not allowed");
        //convert input integer into a string
        String integerString = String.valueOf(input);
        String reversed = reverse(integerString);
        int reversedInput = Integer.parseInt(reversed);
        return reversedInput == input;
    }

    private static String reverse(String str) {
        if (str == null || str.isEmpty()) throw new IllegalArgumentException("requiring a non-blank string");
        Deque<Character> stack = new LinkedList<>();
        char[] chars = str.toCharArray();
        for (char c : chars) {
            stack.push(c);
        }

        return stack.stream().map(String::valueOf).collect(Collectors.joining());
    }

    private static int reverse(int input) {
        if (input < 0) throw new IllegalArgumentException("negative int is not allowed");

        int reversed = 0;
        int copy = input;

        do {
            int remainder = copy % 10;
            copy = copy / 10;
            reversed = reversed * 10 + remainder;
        } while (copy > 0);

        return reversed;
    }

    private static boolean isPalindromeAnother(int input) {
        if (input < 0) throw new IllegalArgumentException("negative int is not allowed");

        return reverse(input) == input;
    }

}
