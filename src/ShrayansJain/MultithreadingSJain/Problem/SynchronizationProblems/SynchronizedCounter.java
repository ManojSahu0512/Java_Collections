package ShrayansJain.MultithreadingSJain.Problem.SynchronizationProblems;

/*
 * Synchronized Counter: Implement a counter shared by multiple threads.
 * Use synchronized to ensure thread safety.*/

class Counter{
    private  int  counter=0;

    public  int getCounter() {
        return counter;
    }

    public  void setCounter(int counter) {
        this.counter = counter;
    }
    public synchronized void  incrementCounter(){
         counter++;
        System.out.println(Thread.currentThread().getName()+":"+counter);
    }
}

public class SynchronizedCounter {
    public static void main(String[] args) throws InterruptedException {

        Counter counter=new Counter();
        Thread th1=new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                counter.incrementCounter();
            }
        });
        Thread th2=new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                counter.incrementCounter();
            }
        });

        th1.start();
        th2.start();
        th1.join();

    }
}
