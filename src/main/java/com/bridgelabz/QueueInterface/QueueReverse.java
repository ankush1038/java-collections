package com.bridgelabz.QueueInterface;

import  java.util.*;
public class QueueReverse {
    public static void main(String[] args) {
        Queue<Integer> queue =  new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Original Queue: " + queue);

        reverseQueue(queue);

        System.out.println("Reversed Queue: " + queue);
    }

    public static <T> void reverseQueue(Queue<T> queue){
        Stack<T> stack = new Stack<>();

        while (!queue.isEmpty()){
            stack.push(queue.remove());
        }

        while (!stack.isEmpty()){
            queue.add(stack.pop());
        }
    }
}
