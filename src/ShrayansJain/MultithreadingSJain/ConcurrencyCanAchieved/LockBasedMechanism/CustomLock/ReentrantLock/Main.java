package ShrayansJain.MultithreadingSJain.ConcurrencyCanAchieved.LockBasedMechanism.CustomLock.ReentrantLock;



import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        ReentrantLock reentrantLock=new ReentrantLock();

        SharedResource resource1=new SharedResource();

        Thread t1=new Thread(()->{
            System.out.println("Thread1 calling produce method");
            resource1.produce(reentrantLock);
        });
        SharedResource resource2=new SharedResource();

        Thread t2=new Thread(()->{
            System.out.println("Thread2 calling produce method");
            resource2.produce(reentrantLock);
        });

        t1.start();
        t2.start();


    }
}
//Thread1 calling produce method
//Thread2 calling produce method
//Lock acquired by: Thread-0
//Lock released by
//Lock acquired by: Thread-1
//Lock released by