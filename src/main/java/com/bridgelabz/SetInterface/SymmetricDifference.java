package com.bridgelabz.SetInterface;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {

    public static <T> Set<T> getSymmetricDifference(Set<T> set1, Set<T> set2) {
        Set<T> symmetricDifference = new HashSet<>(set1);

        // Add all elements from set2 to the symmetric difference set
        symmetricDifference.addAll(set2);

        Set<T> intersection = new HashSet<>(set1);

        // Retain only elements that are present in both sets
        intersection.retainAll(set2);

        // Remove the intersection elements from the symmetric difference set
        symmetricDifference.removeAll(intersection);

        return symmetricDifference;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        Set<Integer> result = getSymmetricDifference(set1, set2);

        System.out.println("Symmetric Difference: " + result);
    }
}

