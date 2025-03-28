package com.bridgelabz.ListInterface;

import java.util.*;

class ListRotator {
    // Method to rotate a list by k positions
    public static <T> void rotateList(List<T> list, int k) {
        int n = list.size();
        k = k % n; // Handle cases where k > n
        if (k < 0) k += n; // Handle negative rotations

        List<T> temp = new ArrayList<>(list.subList(k, n)); // Elements after k
        temp.addAll(list.subList(0, k)); // Elements before k
        list.clear();
        list.addAll(temp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for list
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        // Input for rotation
        System.out.println("Enter the number of positions to rotate:");
        int k = sc.nextInt();

        // Rotate and print list
        rotateList(list, k);
        System.out.println("Rotated List: " + list);

        sc.close();
    }
}


