package com.bridgelabz.ListInterface;

import java.util.*;

class RemoveDuplicates {
    // Method to remove duplicates while preserving order
    public static <T> List<T> removeDuplicates(List<T> list) {
        Set<T> seen = new HashSet<>();
        List<T> result = new ArrayList<>();

        for (T item : list) {
            if (seen.add(item)) { // Only add if not seen before
                result.add(item);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input list
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        // Remove duplicates and print the result
        List<Integer> uniqueList = removeDuplicates(list);
        System.out.println("List after removing duplicates: " + uniqueList);

        sc.close();
    }
}
