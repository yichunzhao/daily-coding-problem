package com.ynz.CodeCharllenge.numbers;

/**
 * tail recursion
 * <p>
 * instead of waiting until at the top of the stack, we may transfer the result from the current step to the next step
 */
public class CalFactorialByTailRecursion {

    public static void main(String[] args) {
        System.out.printf("20! = %d \n", factorials(20, 1));
        System.out.printf("6! = %d \n", factorials(6, 1));
    }

    public static long factorials(long n, long result) {
        if (n == 0) return 1;
        return n * factorials(n - 1, n * result);
    }

}
