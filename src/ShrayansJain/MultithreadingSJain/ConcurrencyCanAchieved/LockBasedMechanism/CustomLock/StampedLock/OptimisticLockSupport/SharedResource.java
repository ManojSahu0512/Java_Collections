package ShrayansJain.MultithreadingSJain.ConcurrencyCanAchieved.LockBasedMechanism.CustomLock.StampedLock.OptimisticLockSupport;

import java.util.concurrent.locks.StampedLock;

public class SharedResource {

    int a = 10;
    StampedLock stampedLock = new StampedLock();

    public void produce() {
        long stamp = stampedLock.tryOptimisticRead();


        try {

            System.out.println("Taken Optimise read" + Thread.currentThread().getName());
            a = 11;
            Thread.sleep(6000);
            if (stampedLock.validate(stamp)) {
                System.out.println("updated a value successfully");
            } else {
                System.out.println("rollback of work");
                a = 10;
            }
        } catch (Exception e) {

        }

    }

    public void consume() {
        long stamp = stampedLock.writeLock();
        System.out.println("Write lock acquired by: " + Thread.currentThread().getName());
        try {
            System.out.println("Performing work:");
            a = 9;
        } finally {
            stampedLock.unlock(stamp);
            System.out.println("Write lock released by " + Thread.currentThread().getName());
        }
    }


}
