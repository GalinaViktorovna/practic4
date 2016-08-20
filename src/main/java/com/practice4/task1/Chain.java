package com.practice4.task1;

import java.util.HashMap;
import java.util.Map;

public class Chain {
    private Map<Integer, Integer> colorCount = new HashMap<>();

    public int count(int N) {
        int result;
        if (N <= 2) return N;
        if (N == 3) return N + 1;

        int white = colorCount.containsKey(N - 1) ? colorCount.get(N - 1) : count(N - 1);
        int yellow = colorCount.containsKey(N - 2) ? colorCount.get(N - 2) : count(N - 2);
        int black = colorCount.containsKey(N - 3) ? colorCount.get(N - 3) : count(N - 3);

        colorCount.put(N - 1, white);
        colorCount.put(N - 2, yellow);
        colorCount.put(N - 3, black);

        result = white + yellow + black;

        return result;

    }

    public static void main(String[] args) {
        Chain chain = new Chain();
        System.out.println("Quantity of means = " + chain.count(12));
    }
}
