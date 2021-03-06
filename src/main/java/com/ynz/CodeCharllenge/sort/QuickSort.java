package com.ynz.CodeCharllenge.sort;


import java.util.Arrays;

/**
 * Quick sort is a divide and conquer strategy as a way to improve the performance.
 * <p>
 * we assume the index=0 as the pivot; left pointer = pivot+1; and right pointer = array.length-1
 * <p>
 * The key point is the divide, i.e. partition, which return a splitting point.
 * <p>
 * principles:
 * 1) ref. to left pointer, if left < right, and left value < pivot; then moving forward to the next bucket. otherwise, stop and quit.
 * 2) ref. to right pointer, if right > left , and right value > pivot; then moving backward to the next bucket. otherwise, stop and quit.
 * 3) the rest case must be: left value > pivot meanwhile right value < pivot; then swap them.
 * 4) the right is the splitting point.
 * <p>
 * reference:
 * https://runestone.academy/runestone/books/published/pythonds/SortSearch/TheQuickSort.html?fbclid=IwAR1nbBg5kPMB69qfJ-9zipzwr3HBln4WGQN2bzK5uN_aTiM4m9bhR39C-VA
 */
public class QuickSort {

    private static final int[] arr = {7, 8, 7, 4, 10, 3, 5};

    public static void main(String[] args) {
        System.out.printf("original array: %s \n", Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.printf("after quickSorted:  %s \n", Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int first, int last) {
        if (first < last) {
            int splitting = partition(arr, first, last);

            quickSort(arr, first, splitting - 1);
            quickSort(arr, splitting + 1, last);
        }
    }

    public static int partition(int[] arr, int first, int last) {
        int pivot = first;

        boolean done = false;
        int left = first + 1;
        int right = last;

        while (!done) {

            while (left <= right && arr[left] <= arr[pivot]) {
                left += 1;
            }

            while (right >= left && arr[right] >= arr[pivot]) {
                right -= 1;
            }

            if (right < left) {
                done = true;
            } else {
                swap(arr, left, right);
            }
        }

        swap(arr, pivot, right);

        return right;
    }

    public static void swap(int[] arr, int source, int target) {
        int tmp = arr[source];
        arr[source] = arr[target];
        arr[target] = tmp;
    }

}
