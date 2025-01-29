package Multithreading.ExplicitLock;

import Multithreading.ExplicitLock.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount sbi2=new BankAccount();
        Runnable task=new Runnable() {
            @Override
            public void run() {
                sbi2.withdraw(50);

            }
        };
        Thread t1=new Thread(task,"Thread 1");
        Thread t2=new Thread(task,"Thread 2");
        t1.start();
        t2.start();
    }


}
