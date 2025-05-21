package ShrayansJain.MultithreadingSJain.ConcurrencyCanAchieved.LockBasedMechanism.CustomLock.StampedLock.ReadWriteSupports;


import java.util.concurrent.locks.StampedLock;

public class SharedResource {
    boolean isAvailable = false;
    StampedLock stampedLock=new StampedLock();

    public void produce() {
        long stamp=stampedLock.readLock();

        try {

            System.out.println("Read Lock acquired by: "+Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(6000);  //sleep method will not release the lock
        } catch (Exception e) {

        } finally {
            stampedLock.unlock(stamp);
            System.out.println("Read Lock released by"+Thread.currentThread().getName());
        }
    }
    public void consume() {
        long stamp=stampedLock.writeLock();

        try {


            System.out.println("Write Lock acquired by: "+Thread.currentThread().getName());
            isAvailable = false;
            Thread.sleep(6000);  //sleep method will not release the lock
        } catch (Exception e) {

        } finally {
            stampedLock.unlock(stamp);
            System.out.println("Write Lock released by"+Thread.currentThread().getName());
        }
    }

}
