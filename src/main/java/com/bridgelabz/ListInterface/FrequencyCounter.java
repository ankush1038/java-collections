package com.bridgelabz.ListInterface;

import java.util.*;

public class FrequencyCounter {
    public static Map<String, Integer> countFrequency(List<String> list){
        Map<String, Integer> frequencyMap = new HashMap<>();
            for (String item : list){
                 frequencyMap.put(item, frequencyMap.getOrDefault(item,0) + 1);
            }

        return frequencyMap;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input for frequency count
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        sc.nextLine();
        List<String> stringlist = new ArrayList<>();
        System.out.println("Enter the elements: ");
        for (int i=0;i<n;i++){
            stringlist.add(sc.nextLine());
        }

        // Count and print frequency
        Map<String,Integer> frequencyMap = countFrequency(stringlist);
        System.out.println("Element Frequencies : " + frequencyMap);

        sc.close();
    }
}
