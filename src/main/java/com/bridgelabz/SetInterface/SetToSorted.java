package com.bridgelabz.SetInterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetToSorted {
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

        return sortedList;
    }
}
