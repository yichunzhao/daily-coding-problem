package com.ynz.CodeCharllenge.numbers;

/**
 * Factorials
 * <p>
 * 4!= 24
 * 5!= 120
 */
public class CalFactorials {

    public static void main(String[] args) {
        System.out.printf("4! = %d \n", factorials(4));
        System.out.printf("5! = %d \n", factorials(5));
    }

    public static int factorials(int n) {
        //breaking condition
        if (n == 0) return 1;
        return n * factorials(n - 1);
    }

}
