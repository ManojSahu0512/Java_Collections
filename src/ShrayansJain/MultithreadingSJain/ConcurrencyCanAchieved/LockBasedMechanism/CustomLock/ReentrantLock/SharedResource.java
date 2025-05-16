package ShrayansJain.MultithreadingSJain.ConcurrencyCanAchieved.LockBasedMechanism.CustomLock.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    boolean isAvailable = false;

    public void produce(ReentrantLock reentrantLock) {

        try {
            reentrantLock.lock();

            System.out.println("Lock acquired by: "+Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(6000);  //sleep method will not release the lock
        } catch (Exception e) {

        } finally {
            reentrantLock.unlock();
            System.out.println("Lock released by");
        }
    }
}
