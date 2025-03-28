package com.bridgelabz.SetInterface;

import java.util.HashSet;
import java.util.Set;

public class SubsetCheck {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
    }

    public static <T> boolean isSubset(Set<T> subset, Set<T> superset){
        return superset.containsAll(subset);
    }
}
