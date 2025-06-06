package Multithreading.ExplicitLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairnessLockExample {
    private final Lock lock = new ReentrantLock(true); // Fair lock

    public void accessResource() {
        lock.lock(); // Acquire the lock
        try {
            // Print statements are synchronized with the lock
            System.out.println(Thread.currentThread().getName() + " acquired the lock");
            Thread.sleep(1000); // Simulate resource access
            System.out.println(Thread.currentThread().getName() + " released the lock");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore interrupt status
        } finally {
            lock.unlock(); // Release the lock
        }
    }

    public static void main(String[] args) {
        FairnessLockExample example = new FairnessLockExample();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                example.accessResource();
            }
        };

        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");
        Thread t3 = new Thread(task, "Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}

//Thread 1 acquired the lock
//Thread 1 released the lock
//Thread 2 acquired the lock
//Thread 2 released the lock
//Thread 3 acquired the lock
//Thread 3 released the lock
