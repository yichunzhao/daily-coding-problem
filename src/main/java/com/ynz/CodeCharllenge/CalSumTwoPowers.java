package com.ynz.CodeCharllenge;

public class CalSumTwoPowers {

    public static void main(String[] args) {
        int base = 2;
        int sum = 0;

        double up = 3_000_000;
        double z = 100_000;

        for (int i = 0; i < 18; i++) {
            sum += Math.pow(base, i);
        }

        System.out.println("sum=" + sum);
        System.out.println("f= " + (up / (sum * z)));
    }
}
