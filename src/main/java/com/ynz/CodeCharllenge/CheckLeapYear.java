package com.ynz.CodeCharllenge;

import java.util.Scanner;

/**
 * check if a year is a leap year.
 * <p>
 * if an year is multiple of 400 or multiple of 4 but not multiple of 100 then its a leap year.
 */
public class CheckLeapYear {

    public static void main(String[] args) {
        while (true) {
            System.out.println("please input a year: ");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            System.out.printf("is %s a leap year? %b \n", input, isLeapYear(input));
        }
    }

    private static boolean isLeapYear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) return true;
        return false;
    }

}
