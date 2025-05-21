package ShrayansJain.Collections.Queue.PriorityQueue.MinimumPriorityQueue;

import java.util.PriorityQueue;

public class MinimumPriorityQueueExample {
    public static void main(String[] args) {
        //minimum priority queue, used to solve problems of min heap.
        PriorityQueue<Integer> minPQ=new PriorityQueue<>();//((Integer a,Integer b)->b-a) for descending
        minPQ.add(5);
        minPQ.add(2);
        minPQ.add(8);
        minPQ.add(1);
        //print
        minPQ.forEach((Integer num)-> System.out.println(num));

        //remove top element from the PQ and print
        while (!minPQ.isEmpty()){

            int value=minPQ.poll();
            System.out.println("remove from top:"+value);
        }

    }
}
