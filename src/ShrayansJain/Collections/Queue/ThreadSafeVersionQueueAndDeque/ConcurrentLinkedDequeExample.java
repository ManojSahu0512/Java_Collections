package ShrayansJain.Collections.Queue.ThreadSafeVersionQueueAndDeque;

import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDequeExample {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<Integer> cq=new ConcurrentLinkedDeque<>();
        cq.addFirst(10);
        cq.addLast(20);
        System.out.println(cq.removeLast());
    }
}
