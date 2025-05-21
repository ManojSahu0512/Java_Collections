package ShrayansJain.MultithreadingSJain.ConcurrencyCanAchieved.LockBasedMechanism.CustomLock.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    boolean isAvailable = false;

    public void produce(ReentrantLock reentrantLock) {

        try {
            reentrantLock.lock();

            System.out.println("Lock acquired by: "+Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(10000);  //sleep method will not release the lock
        } catch (Exception e) {

        } finally {
            System.out.println("Lock released by "+Thread.currentThread().getName());
            reentrantLock.unlock();

        }
    }
}
//Thread1 calling produce method
//Thread2 calling produce method
//Lock acquired by: Thread-0
//Lock released by Thread-0
//Lock acquired by: Thread-1
//Lock released by Thread-1