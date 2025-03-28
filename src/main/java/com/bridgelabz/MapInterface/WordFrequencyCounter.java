package com.bridgelabz.MapInterface;

import java.io.IOException;
import java.util.HashMap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class WordFrequencyCounter {
    public static void main(String[] args) throws IOException {
        String filename = ""; // Change this to your file path
        HashMap<String, Integer> wordCount = new HashMap<>();

        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;

        while ((line = br.readLine()) != null) {
            line = line.toLowerCase().replaceAll("[^a-z0-9 ]", ""); // Convert to lowercase and remove punctuation
            String[] words = line.split("\\s+");

            for (String word : words) {
                if (!word.isEmpty()) {
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }
        }
        br.close();

        System.out.println(wordCount);
    }
}

