package DSA.Queue.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueUsingArrayDeque {
    public static void main(String[] args) {
        // Create a queue using LinkedList implementation
        Queue<String> arrayDequeQueue = new ArrayDeque<>();

        // Add elements (enqueue)
        arrayDequeQueue.add("Alice");//// throws exception if full
        arrayDequeQueue.offer("Bob");//returns false if full

        // Examine elements

        System.out.println("First Element:"+arrayDequeQueue.peek());
        System.out.println("Queue size:"+arrayDequeQueue.size());


        // Remove elements (dequeue)

        System.out.println("Removed:"+arrayDequeQueue.remove());// Alice (throws exception if empty)
        System.out.println("Removed"+arrayDequeQueue.poll());//// Bob (returns null if empty)
        System.out.println("Is empty? " + arrayDequeQueue.isEmpty()); // true




    }
}
