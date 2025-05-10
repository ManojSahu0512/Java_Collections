package MultithreadingSJain.ConcurrencyCanAchieved.LockBasedMechanism.CustomLock.StampedLock.ReadWriteSupports;




import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
    public static void main(String[] args) {
        SharedResource resource=new SharedResource();


        Thread t1=new Thread(()->{
            System.out.println("Thread1 calling produce method");
            resource.produce();//shared lock
        });

        Thread t2=new Thread(()->{
            System.out.println("Thread2 calling produce method");
            resource.produce();//shared lock
        });

Thread t3=new Thread(()->{
    System.out.println("Thread3 calling consume method");
    resource.consume();
});
        t1.start();
        t2.start();
        t3.start();


    }
}