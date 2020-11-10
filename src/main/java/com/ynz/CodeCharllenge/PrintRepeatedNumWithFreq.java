package com.ynz.CodeCharllenge;

import java.util.Map;
import java.util.TreeMap;

/**
 * 10 20 10 40 50 20 20
 * <p>
 * print all the repeated numbers with frequency in an Array
 * <p>
 * delete all the duplicate data from the list. So the final array will be with all distinct values
 * <p>
 * Final array: 10 20 40 50
 */
public class PrintRepeatedNumWithFreq {
    public static int[] ints = {10, 20, 10, 40, 50, 20, 20};

    public static void main(String[] args) {
        Map<Integer, Integer> numberFreqMap = new TreeMap<>();

        for (int num : ints) {
            Integer count = numberFreqMap.get(num);
            if (count != null) {
                numberFreqMap.put(num, ++count);
            } else {
                numberFreqMap.put(num, 1);
            }
        }

        System.out.println("number-freq: " + numberFreqMap);
        System.out.println("final array: " + numberFreqMap.keySet());
    }
}
