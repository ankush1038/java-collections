package com.bridgelabz.InsurancePolicy;


import java.util.*;

public class PolicyUtils {
    public static Set<Policy> getExpiringSoon(Set<Policy> policies) {
        Set<Policy> expiringSoon = new HashSet<>();
        Date today = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(today);
        calendar.add(Calendar.DAY_OF_YEAR, 30);
        Date thresholdDate = calendar.getTime();

        for (Policy policy : policies) {
            if (policy.getExpiryDate().before(thresholdDate)) {
                 expiringSoon.add(policy);
            }
        }
        return expiringSoon;
    }

    public static Set<Policy> findDuplicates(Set<Policy> policies) {
        Map<String, Integer> countMap = new HashMap<>();
        Set<Policy> duplicates = new HashSet<>();

        for (Policy policy : policies) {
            countMap.put(policy.getPolicyNumber(), countMap.getOrDefault(policy.getPolicyNumber(), 0) + 1);
        }

        for (Policy policy : policies) {
            if (countMap.get(policy.getPolicyNumber()) > 1) {
                duplicates.add(policy);
            }
        }
        return duplicates;
    }
}

