package com.ynz.CodeCharllenge;

import java.util.Deque;
import java.util.LinkedList;

/**
 * This problem was asked by Amazon.
 * <p>
 * Given a string, find the length of the smallest window that contains every distinct character.
 * Characters may appear more than once in the window.
 * <p>
 * For example, given "jiujitsu", you should return 5, corresponding to the final five letters.
 */
public class findLengthSmallest {
    static String target = "jiujitsu";
    static Deque<Character> queue = new LinkedList<>();

    public static void main(String[] args) {

        for (Character c : target.toCharArray()) {
            if (queue.isEmpty()) queue.offer(c);
            if (!queue.contains(c)) queue.offer(c);
            System.out.println("window: " + queue);
        }

    }
}
