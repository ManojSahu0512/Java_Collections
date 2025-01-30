package Multithreading.ThreadCommunication;

import java.util.PrimitiveIterator;

class SharedResource{
    private int data;
    private boolean hasBoolean;
    public void produce(int i){

    }
    public void consume(int i){

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
            System.out.println("Produced: "+i);
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
            resourse.consume(i);
            System.out.println("Produced: "+i);
        }

    }
}

public class ThreadCommunication {

}


//02:07