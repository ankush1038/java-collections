package com.bridgelabz.MapInterface;

import java.util.*;

public class InvertMap {
    public static void main(String[] args) {
        Map<String, Integer> inputMap = new HashMap<>();

        // Adding key-value pairs to the input map
        inputMap.put("A", 1);
        inputMap.put("B", 2);
        inputMap.put("C", 1);

        Map<Integer, List<String>> invertedMap = invertMap(inputMap);

        // Printing the inverted map
        System.out.println(invertedMap);
    }

    public static <K, V> Map<V, List<K>> invertMap(Map<K, V> map) {
        Map<V, List<K>> inverted = new HashMap<>();

        for (Map.Entry<K, V> entry : map.entrySet()) {
            V value = entry.getValue();
            K key = entry.getKey();

            // If the value is not present in the inverted map, add a new list
            if (!inverted.containsKey(value)) {
                inverted.put(value, new ArrayList<>());
            }

            // Add the key to the corresponding list for the value
             inverted.get(value).add(key);
        }
        return inverted;
    }
}
