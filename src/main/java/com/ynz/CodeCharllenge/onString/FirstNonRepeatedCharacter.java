package com.ynz.CodeCharllenge.onString;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * find the first non-repeated character in a string.
 * <p>
 * "hello", -> h
 * "swiss", -> w
 */
public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {
        String input = "swiss";
        System.out.println("occur-map: " + occurrences(input));
        System.out.printf("the first non-repeated character in %s is %c ", input, firstNoRepeatedCharacter(occurrences(input)));
    }

    private static Character firstNoRepeatedCharacter(Map<Character, Integer> map) {
        Character result = null;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result = entry.getKey();
                break;
            }
        }

        return result;
    }

    private static Map<Character, Integer> occurrences(String str) {
        if (str == null || str.isEmpty()) throw new IllegalArgumentException("null or empty string not allowed");
        Map<Character, Integer> charOccurrencesMap = new LinkedHashMap<>();
        char[] chars = str.toLowerCase().toCharArray();
        for (char c : chars) {
            Integer count = charOccurrencesMap.get(c);
            if (count != null) {
                charOccurrencesMap.put(c, ++count);
            } else {
                charOccurrencesMap.put(c, 1);
            }
        }

        return charOccurrencesMap;
    }

}
