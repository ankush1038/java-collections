package com.bridgelabz.ListInterface;

import java.util.*;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 2, 2, 3, 4));
        List<Integer> result = removeDuplicates(list);
        System.out.println(result); // Output: [3, 1, 2, 4]
    }

    public static List<Integer> removeDuplicates(List<Integer> list) {
        List<Integer> result = new ArrayList<>();

        for (Integer num : list) {
            if (!result.contains(num)) { // Check if not already in result
                result.add(num);
            }
        }
        return result;
    }
}