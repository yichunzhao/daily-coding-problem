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
    }

    private static boolean isPalindrome(int input) {
        //convert input integer into a string
        String integerString = String.valueOf(input);
        String reversed = reverse(integerString);
        int reversedInput = Integer.parseInt(reversed);
        return reversedInput == input;
    }

    private static String reverse(String str) {
        Deque<Character> stack = new LinkedList<>();
        char[] chars = str.toCharArray();
        for (char c : chars) {
            stack.push(c);
        }

        return stack.stream().map(c -> String.valueOf(c)).collect(Collectors.joining());
    }
}
