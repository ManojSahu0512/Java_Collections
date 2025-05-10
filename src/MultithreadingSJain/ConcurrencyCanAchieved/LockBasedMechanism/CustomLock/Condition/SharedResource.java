package MultithreadingSJain.ConcurrencyCanAchieved.LockBasedMechanism.CustomLock.Condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    boolean isAvailable=false;
    ReentrantLock reentrantLock=new ReentrantLock();
    Condition condition=reentrantLock.newCondition();

    public void producer(){
        try{
            reentrantLock.lock();
            System.out.println("Produce lock acquired by: "+Thread.currentThread().getName());
            if(isAvailable){
                //alreday available , thread has to wait for it to consume
                System.out.println("Produce thread is waiting: "+Thread.currentThread().getName());
                condition.await();
            }
            isAvailable=true;
            condition.signal();
        }catch (Exception e){

        }
        finally {
            reentrantLock.unlock();
            System.out.println("Produce lock release by "+Thread.currentThread().getName());
        }
    }
    public void consume(){
        try{
            Thread.sleep(1000);
            reentrantLock.lock();
            System.out.println("Consume Lock acquired by: "+Thread.currentThread().getName());
            if (isAvailable){
                //already not available, thread has to wait for it to produced
                System.out.println("Consumer thread is waiting: "+Thread.currentThread().getName());
                condition.await();
            }
            isAvailable=false;
            condition.signal();


        }catch (Exception e){

        }
        finally {
            reentrantLock.unlock();
            System.out.println("Consume Lock is released by: "+Thread.currentThread().getName());
        }
    }

}
