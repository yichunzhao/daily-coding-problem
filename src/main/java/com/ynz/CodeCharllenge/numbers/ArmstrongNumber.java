package com.ynz.CodeCharllenge.numbers;

import java.util.Arrays;
import java.util.List;

/**
 * A number is called an Armstrong number if it is equal to the cube of its every digit.
 * For example, 153 is an Armstrong number because of 153= 1+ 125+27, which is equal to 1^3+5^3+3^3.
 * You need to write a program to check if the given number is Armstrong number or not.
 */
public class ArmstrongNumber {

    public static void main(String[] args) {
        List<Integer> armstrongNumbers = Arrays.asList(153, 370, 371, 407);

        armstrongNumbers.forEach(a -> System.out.println("is input a Armstrong number? " + isArmstrongNumber(a)));
    }

    public static boolean isArmstrongNumber(int num) {
        String numStr = String.valueOf(num);
        char[] digits = numStr.toCharArray();
        int sumOfPowerThree = 0;
        for (char c : digits) {
            int value = Integer.parseInt(String.valueOf(c));
            sumOfPowerThree += Math.pow(value, 3);
        }

        return sumOfPowerThree == num;
    }

}
