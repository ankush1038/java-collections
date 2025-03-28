package com.bridgelabz.InsurancePolicy;


import java.util.*;

public class PerformanceComparison {
    public static void comparePerformance(List<Policy> policies) {
        Set<Policy> hashSet = new HashSet<>();
        Set<Policy> linkedHashSet = new LinkedHashSet<>();
        Set<Policy> treeSet = new TreeSet<>();

        long start, end;

        start = System.nanoTime();
        hashSet.addAll(policies);
        end = System.nanoTime();
        System.out.println("HashSet Add Time: " + (end - start) + " ns");

        start = System.nanoTime();
        linkedHashSet.addAll(policies);
        end = System.nanoTime();
        System.out.println("LinkedHashSet Add Time: " + (end - start) + " ns");

        start = System.nanoTime();
        treeSet.addAll(policies);
        end = System.nanoTime();
        System.out.println("TreeSet Add Time: " + (end - start) + " ns");
    }
}

