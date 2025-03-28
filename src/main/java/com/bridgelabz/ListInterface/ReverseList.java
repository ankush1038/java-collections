package com.bridgelabz.ListInterface;

import java.util.*;
public class ReverseList {
    // Method to reverse an ArrayList
    public static <T> void reverseArrayList(ArrayList<T> list) {
        int left = 0, right = list.size() - 1;
        while (left < right) {
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }

    // Method to reverse using linkedlist
    public static <T> void reverseLinkedList(LinkedList<T> list) {
        int left = 0, right = list.size() - 1;
        while (left < right) {
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input for ArrayList
        System.out.println("Enter the number of elements for ArrayList: ");
        int n = sc.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Enter the elements : ");
        for (int i =0; i<n;i++){
            arrayList.add(sc.nextInt());
        }

        // Reverse and printArrayList
        reverseArrayList(arrayList);
        System.out.println("Reversed ArrayList : " + arrayList);

        // Input for LinkedList
        System.out.println("Enter the number of elements for LinkedList:");
        int m = sc.nextInt();
        LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.println("Enter the elements:");
        for (int i = 0; i < m; i++) {
            linkedList.add(sc.nextInt());
        }

        // Reverse and print LinkedList
        reverseLinkedList(linkedList);
        System.out.println("Reversed LinkedList: " + linkedList);

        sc.close();
    }

}
