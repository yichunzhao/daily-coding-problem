package com.ynz.CodeCharllenge.printpattern;

import java.util.stream.IntStream;

public class PrintPyramidPattern {

    public static void main(String... args) {
        //print 5 layer
        int layer = 5;

        for (int i = 1; i < layer + 1; i++) {
            printRow(i);
        }
    }

    private static void printRow(int layer) {
        IntStream.range(0, layer).forEach(x -> System.out.print("*"));
        System.out.println("");
    }
}
