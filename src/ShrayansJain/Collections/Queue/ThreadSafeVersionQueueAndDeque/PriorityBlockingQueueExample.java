package ShrayansJain.Collections.Queue.ThreadSafeVersionQueueAndDeque;

import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueExample {
    public static void main(String[] args) {

        PriorityBlockingQueue<Integer> pq=new PriorityBlockingQueue();
        pq.add(10);
        pq.add(20);
        System.out.println(pq.peek());


    }
}
