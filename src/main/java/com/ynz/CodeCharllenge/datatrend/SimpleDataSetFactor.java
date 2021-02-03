package com.ynz.CodeCharllenge.datatrend;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * dataSet trend
 */
public class SimpleDataSetFactor {
    private List<Integer> detailList;

    public SimpleDataSetFactor(List<Integer> detailList) {
        this.detailList = detailList;
    }

    public boolean isIncremental() {
        Deque<Integer> queue = new LinkedList<>(detailList);

        boolean f = false;

        for (int i = 0; i < queue.size(); i++) {
            Integer b = queue.poll();
            if (queue.isEmpty()) break;
            Integer a = queue.peek();
            if (b == a) continue;
            if (b > queue.peek()) {
                f = false;
            } else {
                f = true;
            }
        }

        return f;
    }
}
