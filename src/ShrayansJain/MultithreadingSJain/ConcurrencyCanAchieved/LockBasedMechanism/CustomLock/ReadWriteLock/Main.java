package ShrayansJain.MultithreadingSJain.ConcurrencyCanAchieved.LockBasedMechanism.CustomLock.ReadWriteLock;


import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
    public static void main(String[] args) {
        SharedResource resource=new SharedResource();
        ReadWriteLock lock=new ReentrantReadWriteLock();

        Thread t1=new Thread(()->{
            System.out.println("Thread1 calling produce method");
            resource.produce(lock);//shared lock
        });

        Thread t2=new Thread(()->{
            System.out.println("Thread2 calling produce method");
            resource.produce(lock);//shared lock
        });
SharedResource resource1=new SharedResource();
Thread t3=new Thread(()->{
    System.out.println("Thread3 calling consume method");
    resource1.consume(lock);
});
        t1.start();
        t2.start();
        t3.start();


    }
}
//Thread1 calling produce method
//Thread3 calling consume method
//Thread2 calling produce method
//Read Lock acquired by: Thread-1
//Read Lock acquired by: Thread-0
//Read Lock released byThread-1
//Read Lock released byThread-0
//Write Lock acquired by: Thread-2
//Write Lock released byThread-2