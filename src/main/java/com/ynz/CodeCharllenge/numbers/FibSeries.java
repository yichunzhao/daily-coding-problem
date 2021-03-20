package com.ynz.CodeCharllenge.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1. Fibonacci series (solution)
 * Write a simple Java program which will print Fibonacci series, e.g. 1 1 2 3 5 8 13 ... .
 * up to a given number. We prepare for cross questions like using iteration over recursion
 * and how to optimize the solution using caching and memoization.
 * <p>
 * <p>
 * f(n) = f(n-1)+f(n-2); f(0)=0, f(1)=1; n>1
 */
public class FibSeries {
    private static final int f0 = 0;
    private static final int f1 = 1;

    private static final List<Integer> fibNumbers = new ArrayList<>();

    public static void main(String[] args) {

        fibNumber(f1, f0);
        System.out.println(fibNumbers);
    }

    static void fibNumber(int fn_1, int fn_2) {
        //initial states of the Fib series.
        if (fn_1 == f1 && fn_2 == f0) {
            fibNumbers.addAll(Arrays.asList(fn_2, fn_1));
        }

        int tmp = fn_1;
        fn_1 += fn_2;

        fibNumbers.add(fn_1);
        fn_2 = tmp;

        if (fn_1 > 1_000_000) return;

        fibNumber(fn_1, fn_2);
    }

}
