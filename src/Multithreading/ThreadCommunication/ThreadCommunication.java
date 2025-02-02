package Multithreading.ThreadCommunication;

import java.util.PrimitiveIterator;

class SharedResource{
    private int data;
    private boolean hasData;
    public synchronized  void produce(int value) {
        while (hasData){
            try{
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        data=value;
        hasData=true;
        System.out.println("Produced: "+value);
        notify();

    }
    public synchronized int consume(){
        while (!hasData){
            try{
                wait();
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        hasData=false;
        System.out.println("Consumed: "+data);
        notify();
        return data;

    }
}
class Producer implements Runnable{
    private  SharedResource resourse;
    public Producer(SharedResource resourse){
        this.resourse=resourse;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            resourse.produce(i);

        }

    }
}

class Consumer implements Runnable{
    private  SharedResource resourse;
    public Consumer(SharedResource resourse){
        this.resourse=resourse;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            resourse.consume();

        }

    }
}

public class ThreadCommunication {
    public static void main(String[] args) {
        SharedResource resource =new SharedResource();

        Thread ProducerThread=new Thread(new Producer(resource));
        Thread ConsumerThread=new Thread(new Consumer(resource));
        ProducerThread.start();
        ConsumerThread.start();






    }
}


//Produced: 0
//Consumed: 0
//Produced: 1
//Consumed: 1
//Produced: 2
//Consumed: 2
//Produced: 3
//Consumed: 3
//Produced: 4
//Consumed: 4
//Produced: 5
//Consumed: 5
//Produced: 6
//Consumed: 6
//Produced: 7
//Consumed: 7
//Produced: 8
//Consumed: 8
//Produced: 9
//Consumed: 9