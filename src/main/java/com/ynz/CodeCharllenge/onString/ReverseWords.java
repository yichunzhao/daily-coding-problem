package com.ynz.CodeCharllenge.onString;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * reverse words in String
 */
public class ReverseWords {

    public static void main(String[] args) {
        String str = "I love this game";
        System.out.println(str);
        String[] words = str.split("\\s");

        List<String> listString = Arrays.asList(words);
        Collections.reverse(listString);

        String reversedWords = String.join(" ", listString);
        System.out.println(reversedWords);
    }

}
