package MultithreadingSJain.ConcurrencyCanAchieved.LockBasedMechanism.CustomLock.SemaphoreLock;

import java.util.concurrent.Semaphore;

public class SharedResource {
    boolean isAvailable = false;
    Semaphore semaphoreLock = new Semaphore(2);//2 threads can acquire lock at a time

    public void producer() {
        try {
            semaphoreLock.acquire();
            System.out.println("Lock acquired by " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000);
        } catch (Exception e) {

        } finally {
            semaphoreLock.release();
            System.out.println("Lock released by " + Thread.currentThread().getName());
        }

    }

}
//Lock acquired by Thread-1
//Lock acquired by Thread-0
//Lock acquired by Thread-2
//Lock released by Thread-1
//Lock released by Thread-0
//Lock acquired by Thread-3
//Lock released by Thread-2
//Lock released by Thread-3