package MultithreadingSJain.ConcurrencyCanAchieved.LockBasedMechanism.Synchronized;

public class Main {
    public static void main(String[] args) {
        SharedResource resource1=new SharedResource();


        Thread t1=new Thread(()->{
            System.out.println("Thread1 calling produce method");
            resource1.produce();
        });
        SharedResource resource2=new SharedResource();

        Thread t2=new Thread(()->{
            System.out.println("Thread2 calling produce method");
            resource2.produce();
        });

        t1.start();
        t2.start();


    }
}
//Thread1 calling produce method
//Lock acquired
//Thread2 calling produce method
//Lock acquired
//Lock released
//Lock released

//both can acquire lock at same time because here we are calling produce method with different-different object
//Monitor lock is placed on object