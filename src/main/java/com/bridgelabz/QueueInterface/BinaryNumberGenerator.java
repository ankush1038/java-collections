package com.bridgelabz.QueueInterface;

import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
import java.util.List;

public class BinaryNumberGenerator {

    public static List<String> generateBinaryNumbers(int N) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        // Enqueue the first binary number
        queue.add("1");

        for (int i = 0; i < N; i++) {
            // Remove the front element and store it in the result
            String current = queue.remove();
            result.add(current);

            // Generate the next two binary numbers and enqueue them
            queue.add(current + "0");
            queue.add(current + "1");
        }

        return result;
    }

    public static void main(String[] args) {
        int N = 5;
        List<String> binaryNumbers = generateBinaryNumbers(N);

        System.out.println("First " + N + " Binary Numbers: " + binaryNumbers);
    }
}

