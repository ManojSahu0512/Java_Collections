package Coding.Queue.PriorityQueue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueUsingPriorityQueue {
    public static void main(String[] args) {
        // Create a queue using priorityQueue implementation
        Queue<String> priorityQueue = new PriorityQueue<>();

        // Add elements (enqueue)
        priorityQueue.add("Alice");//// throws exception if full
        priorityQueue.offer("Bob");//returns false if full

        // Examine elements

        System.out.println("First Element:"+priorityQueue.peek());
        System.out.println("Queue size:"+priorityQueue.size());


        // Remove elements (dequeue)

        System.out.println("Removed:"+priorityQueue.remove());// Alice (throws exception if empty)
        System.out.println("Removed"+priorityQueue.poll());//// Bob (returns null if empty)
        System.out.println("Is empty? " + priorityQueue.isEmpty()); // true




    }
}
