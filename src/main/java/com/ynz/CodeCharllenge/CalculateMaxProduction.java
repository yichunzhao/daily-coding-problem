package com.ynz.CodeCharllenge;

import java.math.BigDecimal;

public class CalculateMaxProduction {
    //prob. of win
    private static final BigDecimal p = new BigDecimal("0.6");

    //fraction of payment
    private static final BigDecimal f = new BigDecimal("0.126");

    //init principal
    private static final BigDecimal z = BigDecimal.valueOf(100_000);

    //total operations
    private static final BigDecimal n = new BigDecimal("30");

    //sum of new principal
    private static BigDecimal sum = new BigDecimal(0);

    public static void main(String[] args) {
        int winN = p.multiply(n).intValue();
        System.out.println("winN = " + winN);
        System.out.println("Z = " + z);

        sum = sum.add(z);

        System.out.println("sum = " + sum);

        for (int i = 0; i < winN; i++) {
            BigDecimal input = sum.multiply(f);
            sum = sum.subtract(input);
            BigDecimal income = calculateIncomeEachOperation(input);
            sum = sum.add(income);
        }

        System.out.println("final: " + sum);

    }

    private static BigDecimal calculateIncomeEachOperation(BigDecimal input) {
        return input.multiply(new BigDecimal("2"));
    }

}
