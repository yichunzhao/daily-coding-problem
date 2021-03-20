package com.ynz.CodeCharllenge.numbers;

import java.util.Scanner;

/**
 * Write a Java program to check if a given number is prime or not. Remember,
 * a prime number is a number which is not divisible by any other number, e.g. 3, 5, 7, 11, 13, 17, etc.
 * Be prepared for cross, e.g. checking till the square root of a number, etc.
 * <p>
 * Read more: https://javarevisited.blogspot.com/2017/07/top-50-java-programs-from-coding-Interviews.html#ixzz6pWGJBjAm
 */
public class PrimeNumber {

    public static void main(String[] args) {
        while (true) {
            System.out.println("please input an integer");
            int input = new Scanner(System.in).nextInt();
            System.out.printf("is %d a prime? %b \n ", input, isPrime(input));
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;

        //if can be divide by 2
        if (number % 2 == 0) return false;

        double root = Math.sqrt(number);
        int d = (int) root;
        if (root - d == 0.0D) return false;

        return true;
    }

}
