package com.ynz.CodeCharllenge.numbers;

import java.util.Scanner;

/**
 * reverse a number:  given 2455, output 5542
 */
public class ReverseNumber {

    public static void main(String[] args) {
        //int input = 2455;
        System.out.println("please enter an integer number: ");
        int input = new Scanner(System.in).nextInt();

        System.out.println("output: " + reverse(input));
    }

    static int reverse(int number) {
        int target = number;
        int reversed = 0;

        do {
            int remainder = target % 10;
            reversed = reversed * 10 + remainder;
            target = target / 10;
        } while (target > 0);

        return reversed;
    }

}
