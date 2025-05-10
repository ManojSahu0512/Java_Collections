package MultithreadingSJain.ConcurrencyCanAchieved.LockBasedMechanism.CustomLock.ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    boolean isAvailable = false;

    public void produce(ReadWriteLock readWriteLock) {

        try {
            readWriteLock.readLock().lock();

            System.out.println("Read Lock acquired by: "+Thread.currentThread().getName());

            Thread.sleep(6000);  //sleep method will not release the lock
        } catch (Exception e) {

        } finally {
            readWriteLock.readLock().unlock();
            System.out.println("Read Lock released by"+Thread.currentThread().getName());
        }
    }
    public void consume(ReadWriteLock readWriteLock) {

        try {
            readWriteLock.writeLock().lock();

            System.out.println("Write Lock acquired by: "+Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(6000);  //sleep method will not release the lock
        } catch (Exception e) {

        } finally {
            readWriteLock.writeLock().unlock();
            System.out.println("Write Lock released by"+Thread.currentThread().getName());
        }
    }

}
