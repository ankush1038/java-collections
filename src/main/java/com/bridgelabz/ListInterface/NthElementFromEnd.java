package com.bridgelabz.ListInterface;

import java.util.LinkedList;

public class NthElementFromEnd {

    public static <T> T findNthFromEnd(LinkedList<T> list, int N) {
        // Edge case: if the list is empty or N is invalid
        if (list == null || list.isEmpty() || N <= 0 || N > list.size()) {
            return null; // or throw exception
        }

        // Initialize two pointers
        int firstIndex = 0;
        int secondIndex = 0;

        // Move the first pointer N steps ahead
        while (firstIndex < N) {
            firstIndex++;
        }

        // Now move both pointers together until the first pointer reaches the end
        while (firstIndex < list.size()) {
            firstIndex++;
            secondIndex++;
        }

        // The second pointer will now be at the Nth element from the end
        return list.get(secondIndex);
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int N = 2;
        String result = findNthFromEnd(list, N);
        System.out.println("The " + N + "th element from the end is: " + result);
    }
}

