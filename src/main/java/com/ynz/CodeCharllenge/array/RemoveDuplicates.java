package com.ynz.CodeCharllenge.array;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * removing duplicates from a List
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        Integer[] ints = {10, 20, 20, 30, 30, 40, 50, 50};
        List<Integer> intList = Arrays.asList(ints);
        System.out.printf("original list: %s \n ", intList);
        System.out.println("after removing: " + remove(intList));
    }

    public static <T> Set<T> remove(List<T> inputs) {
        if (inputs == null || inputs.isEmpty()) throw new IllegalArgumentException("the input List is null or empty!");
        return new LinkedHashSet<>(inputs);
    }

}
