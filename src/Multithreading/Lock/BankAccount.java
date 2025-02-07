package Multithreading.Lock;

/**
 * @author manoj
 *
 * */
public class BankAccount {
    private int balance=100;

    public synchronized void withdraw(int amount)  {
        System.out.println(Thread.currentThread().getName()+ " attempting to withdraw amount "+amount);
        if(balance>=amount){
           //
            System.out.println(Thread.currentThread().getName()+"Proceeding with withdrawal");
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){

            }
            balance-=amount;
            System.out.println("Completed withdrawal Remaining balance"+balance);
        }
        else{
            System.out.println(Thread.currentThread().getName()+" insufficient balance");
        }
    }
}
//Thread 1 attempting to withdraw amount 50
//Thread 1Proceeding with withdrawal
//Completed withdrawal Remaining balance50
//Thread 2 attempting to withdraw amount 50
//Thread 2Proceeding with withdrawal
//Completed withdrawal Remaining balance0