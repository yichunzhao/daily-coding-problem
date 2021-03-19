package com.ynz.CodeCharllenge.numbers;

/**
 * how to reverse a number? using string APIs
 */
public class ReverseNumberAnother {

    public static void main(String[] args) {
        int input = 256;
        System.out.printf("reversed number: %s \n", reverseNumber(input));

        int input1 = 0;
        System.out.printf("reversed number: %s \n", reverseNumber(input1));
    }

    public static int reverseNumber(int num) {
        String numStr = String.valueOf(num);
        StringBuilder sb = new StringBuilder(numStr);
        String reversedNum = sb.reverse().toString();
        return Integer.parseInt(reversedNum);
    }

}
