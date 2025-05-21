package ShrayansJain.Collections.Queue.PriorityQueue.MaximumPriorityQueue;


import java.util.PriorityQueue;

public class MaxPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxPQ=new PriorityQueue<>((Integer a, Integer b)->b-a);//
        maxPQ.add(5);
        maxPQ.add(2);
        maxPQ.add(8);
        maxPQ.add(1);
        //print
        maxPQ.forEach((Integer num)-> System.out.println(num));

        //remove top element from the PQ and print
        while (!maxPQ.isEmpty()){

            int value=maxPQ.poll();
            System.out.println("remove from top:"+value);
        }


    }
}
