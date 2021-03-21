package com.ynz.CodeCharllenge.onString;

import java.util.Map;
import java.util.TreeMap;

/**
 * A string is said to be an anagram if it contains the same characters and same length,
 * but in a different order, e.g. army and Mary are anagrams.
 * <p>
 * the key point:  the number of each char should be the same
 */
public class StringAnagram {

    public static void main(String[] args) {
        printResult("aaab", "bbaa");
        printResult("army", "Mary");

        printResult("fill", "fil");
        printResult("a", "a");

        printResult("word", "wrdo");

        printResult("stop", "pots");
        printResult("aabb", "bbaa");
    }

    private static void printResult(String str1, String str2) {
        System.out.printf("is %s and %s Anagram? %b \n", str1, str2, isAnagram(str1, str2));
    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1 == null || str2 == null) throw new IllegalArgumentException("cannot compare null values");
        if (str1.isEmpty() || str2.isEmpty()) throw new IllegalArgumentException("cannot compare empty strings");

        if (str1.length() != str2.length()) return false;

        //if two strings having the same length and the same content, return false.
        if (str1.equals(str2)) return false;

        Map<Character, Integer> str1CharacterCountMap = characterCount(str1);
        Map<Character, Integer> str2CharacterCountMap = characterCount(str2);

        //if two string contains different set of characters, they are not anagram.
        if (!str1CharacterCountMap.keySet().equals(str2CharacterCountMap.keySet())) return false;

        //character frequencies are the same
        for (Character ch : str1CharacterCountMap.keySet()) {
            if (str1CharacterCountMap.get(ch) != str2CharacterCountMap.get(ch)) {
                return false;
            }
        }

        //the same char set and the same freq.
        return true;
    }

    private static Map<Character, Integer> characterCount(String str) {
        char[] chars = str.toLowerCase().toCharArray();
        Map<Character, Integer> characterCountMap = new TreeMap<>();

        for (char c : chars) {
            if (characterCountMap.containsKey(c)) {
                int count = characterCountMap.get(c);
                characterCountMap.put(c, ++count);
            } else {
                characterCountMap.put(c, 1);
            }
        }

        return characterCountMap;
    }

}
