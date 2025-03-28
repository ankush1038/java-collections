package com.bridgelabz.SetInterface;

import java.util.*;

public class SetToSorted {
    // Main method
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(3);
        set.add(9);
        set.add(1);

        List<Integer> sortedList = convertToSortedList(set);
        System.out.println("Sorted List: " + sortedList);
    }

    public static List<Integer> convertToSortedList(Set<Integer> set){
        List<Integer> sortedList = new ArrayList<>(set);

        // Sort the list in ascending order
        Collections.sort(sortedList);

        return sortedList;
    }
}
