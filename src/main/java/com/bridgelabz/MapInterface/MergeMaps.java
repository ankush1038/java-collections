package com.bridgelabz.MapInterface;

import java.util.*;

public class MergeMaps {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        // Adding key-value pairs to the first map
        map1.put("A", 1);
        map1.put("B", 2);

        // Adding key-value pairs to the second map
        map2.put("B", 3);
        map2.put("C", 4);

        Map<String, Integer> mergedMap = mergeMaps(map1, map2);

        // Printing the merged map
        System.out.println(mergedMap);
    }

    public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> merged = new HashMap<>(map1);

        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();

            // If key exists, sum values; otherwise, add new key-value pair
            merged.put(key, merged.getOrDefault(key, 0) + value);
        }
        return merged;
    }
}
