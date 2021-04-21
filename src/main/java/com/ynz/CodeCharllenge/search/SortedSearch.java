package com.ynz.CodeCharllenge.search;

/**
 * Implement function countNumbers that accepts a sorted array of unique integers and,
 * efficiently with respect to time used, counts the number of array elements that are less than the parameter lessThan.
 * <p>
 * For example, SortedSearch.countNumbers(new int[] { 1, 3, 5, 7 }, 4) should return 2
 * because there are two array elements less than 4.
 */
public class SortedSearch {

    public static int countNumbers(int[] sortedArray, int lessThan) {
        return biSearch(sortedArray, lessThan) + 1;
    }

    public static void main(String[] args) {
        System.out.println(SortedSearch.countNumbers(new int[]{1, 3, 5, 7}, 4));
    }

    public static int biSearch(int[] numbers, int target) {
        //initially, traversing the entire array.
        int low = 0;
        int high = numbers.length;

        while (low < high) {
            int mid = (low + high) / 2;

            //breaking condition
            if (target == numbers[mid] || target < numbers[mid] && target > numbers[mid - 1]) {
                return mid - 1;
            }

            if (target > numbers[mid] && target < numbers[mid + 1]) {
                return mid;
            }

            if (target < numbers[mid]) {
                high = mid - 1;
            }

            if (target > numbers[mid]) {
                low = mid + 1;
            }
        }

        return -1;
    }

}
