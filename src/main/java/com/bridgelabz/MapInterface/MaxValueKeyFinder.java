package com.bridgelabz.MapInterface;

import java.util.*;

public class MaxValueKeyFinder {
    public static void main(String[] args) {
        Map<String, Integer> inputMap = new HashMap<>();

        // Adding key-value pairs to the map
        inputMap.put("A", 10);
        inputMap.put("B", 20);
        inputMap.put("C", 15);

        String maxKey = findMaxKey(inputMap);

        // Printing the key with the highest value
        System.out.println(maxKey);
    }

    public static String findMaxKey(Map<String, Integer> map) {
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            String key = entry.getKey();

            // Update maxKey if a higher value is found
            if (value > maxValue) {
                maxValue = value;
                maxKey = key;
            }
        }
        return maxKey;
    }
}

