package MultithreadingSJain.ConcurrencyCanAchieved.LockBasedMechanism.CustomLock.StampedLock.OptimisticLockSupport;

public class Main {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();


        Thread t1 = new Thread(() -> {
            System.out.println("Thread1 calling produce method");
            resource.produce();//shared lock
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Thread2 calling produce method");
            resource.consume();
        });

        t1.start();
        t2.start();


    }
}