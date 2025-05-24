package ShrayansJain.MultithreadingSJain.Problem.SynchronizationProblems;

/*
* Bank Account: Simulate a bank account with deposit() and withdraw() methods.
*  Ensure operations are thread-safe.
 */
class Bank{
    int amount =1000;
    public synchronized void  deposit(){
        amount=amount+100;
    }
    public synchronized void withdraw(){
        amount=amount-200;

    }

        }
public class BankAccountProblem {
    public static void main(String[] args) {

        Bank bank=new Bank();
        Thread depositThread=new Thread(()->{
           bank.deposit();
        });

        Thread withdrawThread=new Thread(()->{
            bank.withdraw();
        });


    }

}

