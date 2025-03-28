package com.bridgelabz.InsurancePolicy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        PolicyManager manager = new PolicyManager();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        // Adding policies
        manager.addPolicy(new Policy("P101", "Ankush", sdf.parse("2025-05-20"), "Health", 12000));
        manager.addPolicy(new Policy("P102", "Ansh", sdf.parse("2024-04-15"), "Auto", 15000));
        manager.addPolicy(new Policy("P103", "Aditya", sdf.parse("2024-04-25"), "Home", 10000));
        manager.addPolicy(new Policy("P102", "Jashan", sdf.parse("2024-07-10"), "Auto", 18000));

        // Display all policies
        System.out.println("All Policies: " + manager.getAllPolicies());

        // Policies expiring soon
        System.out.println("Policies Expiring Soon: " + manager.getExpiringSoon());

        // Policies by coverage type
        System.out.println("Auto Policies: " + manager.getPoliciesByCoverage("Auto"));

        // Finding duplicate policies
        System.out.println("Duplicate Policies: " + manager.getDuplicatePolicies());

        // Performance comparison
        List<Policy> policyList = new ArrayList<>(manager.getAllPolicies());
        PerformanceComparison.comparePerformance(policyList);
    }
}

