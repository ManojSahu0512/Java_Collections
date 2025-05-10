package Coding.Queue.LinkedListGeneralPurpose;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingLinkedList {
    public static void main(String[] args) {
        // Create a queue using LinkedList implementation
        Queue<String>queue=new LinkedList<>();

        // Add elements (enqueue)
        queue.add("Alice");//// throws exception if full
        queue.offer("Bob");//returns false if full

        // Examine elements

        System.out.println("First Element:"+queue.peek());
        System.out.println("Queue size:"+queue.size());


        // Remove elements (dequeue)

        System.out.println("Removed:"+queue.remove());// Alice (throws exception if empty)
        System.out.println("Removed"+queue.poll());//// Bob (returns null if empty)
        System.out.println("Is empty? " + queue.isEmpty()); // true




    }
}
