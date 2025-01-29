package Multithreading.ExplicitLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;
    private final Lock lock = new ReentrantLock();

    public  void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw amount " + amount);
        try {
            if (lock.tryLock(1000, TimeUnit.MICROSECONDS)) {
                if (balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + "Proceeding with withdrawal");
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println("Completed withdrawal Remaining balance" + balance);

                    } catch (Exception e) {

                    } finally {
                        lock.unlock();


                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " insufficient balance");

                }
            } else {
                System.out.println(Thread.currentThread().getName() + " could not acquire the lock please try again");

            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


//Thread 2 attempting to withdraw amount 50
//Thread 1 attempting to withdraw amount 50
//Thread 2Proceeding with withdrawal
//Thread 1 could not acquire the lock please try again
//Completed withdrawal Remaining balance50

