package ShrayansJain.MultithreadingSJain.Problem;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
    private Queue<Integer> sharedBuffer;
    private int bufferSize;

    public SharedResource(int bufferSize){
        sharedBuffer=new LinkedList<>();
        this.bufferSize=bufferSize;
    }

    public  synchronized void produce(int item) throws InterruptedException {
        //if Buffer is full, wait for the consumer to consume items
        while (sharedBuffer.size()==bufferSize){
            System.out.println("Buffer is full, Producer is waiting for consumer");
            wait();
        }
        sharedBuffer.add(item);
        System.out.println("Produced: "+item);
        //Notify the consumer that there are items to consume now
        notify();

    }

    public synchronized int consume() throws InterruptedException {
        //Buffer is empty,wait for the producer to produce items
        while (sharedBuffer.isEmpty()){
            System.out.println("Buffer is empty, consumer is waiting for producer");
            wait();
        }
        int item=sharedBuffer.poll();
        System.out.println("Consumed: "+item);
        //Notify the producer that there is space in the buffer now
        notify();
        return item;
    }
}
