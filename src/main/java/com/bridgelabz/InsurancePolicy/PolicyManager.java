package com.bridgelabz.InsurancePolicy;

import java.util.*;

public class PolicyManager {
    private Set<Policy> hashSetPolicies;
    private Set<Policy> linkedHashSetPolicies;
    private Set<Policy> treeSetPolicies;

    public PolicyManager() {
        hashSetPolicies = new HashSet<>();
        linkedHashSetPolicies = new LinkedHashSet<>();
        treeSetPolicies = new TreeSet<>();
    }

    public void addPolicy(Policy policy) {
        hashSetPolicies.add(policy);
        linkedHashSetPolicies.add(policy);
        treeSetPolicies.add(policy);
    }

    public Set<Policy> getAllPolicies() {
        return new HashSet<>(hashSetPolicies);
    }

    public Set<Policy> getPoliciesByCoverage(String coverageType) {
        Set<Policy> result = new HashSet<>();
        for (Policy policy : hashSetPolicies) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                result.add(policy);
            }
        }
        return result;
    }

    public Set<Policy> getExpiringSoon() {
        return PolicyUtils.getExpiringSoon(treeSetPolicies);
    }

    public Set<Policy> getDuplicatePolicies() {
        return PolicyUtils.findDuplicates(hashSetPolicies);
    }
}
