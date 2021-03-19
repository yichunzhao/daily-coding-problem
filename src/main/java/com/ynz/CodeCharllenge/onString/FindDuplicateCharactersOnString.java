package com.ynz.CodeCharllenge.onString;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharactersOnString {

    public static void main(String[] args) {
        String input = "reversing";
        Map<Character, Integer> result = findDuplicate(input);
        System.out.println("result: " + result);
    }

    static Map<Character, Integer> findDuplicate(String input) {
        Map<Character, Integer> characterCountMap = new HashMap<>();
        char[] chars = input.toCharArray();

        for (Character c : chars) {
            if (characterCountMap.containsKey(c)) {
                int count = characterCountMap.get(c);
                characterCountMap.put(c, count + 1);
            } else {
                characterCountMap.put(c, 1);
            }
        }

        characterCountMap.entrySet().removeIf(es -> es.getValue() <= 1);

        return characterCountMap;
    }
}
