package com.ynz.CodeCharllenge.numbers;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * 1
 * 2*1
 * 3*2*1
 * 4*3*2*1
 */
public class ShowFactorial {

    public static void main(String[] args) {
        System.out.println("print out 1-10 factorials");

        Map<Integer, Integer> integerFactorialMap = new HashMap<>();

        IntStream.rangeClosed(1, 10).forEach(i -> {
            //finding previous factorial result
            Integer f = integerFactorialMap.get(i - 1);

            if (f == null) {
                //f value not existed, only when at the first num.
                integerFactorialMap.put(i, 1);
            } else {
                f *= i;
                integerFactorialMap.put(i, f);
            }
        });

        System.out.println("factorials");
        System.out.println(integerFactorialMap);
    }

    /**
     * using iteration to calculate individual factorial;
     *
     * @param n a Integer number
     * @return its factorial result.
     */
    public static int factorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
