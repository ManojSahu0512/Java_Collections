package CoreJava.ClassAndObjects;

class Account{
    int accNo;
    String name;
    float balance;
    public void OpenAccount(int accNo,String name,float balance){
        this.accNo=accNo;
        this.name=name;
        this.balance=balance;
    }

    public void deposit(float amount){
        balance+=amount;
        System.out.println(amount+" Amount deposited !!");

    }
    public void withdraw(float amount){
        balance-=amount;
        System.out.println(amount+" Amount withdraw !!");
        System.out.println("Remaining balance is: "+balance);

    }
    public void checkBalance(){
        System.out.println("Balance is "+this.balance);

    }
}


public class BankOperations {
    public static void main(String[] args) {
        Account custmer1=new Account();
        custmer1.OpenAccount(100113,"Manoj Sahu",103300);
        custmer1.checkBalance();
        custmer1.deposit(10404);
        custmer1.checkBalance();
        custmer1.withdraw(400);
        custmer1.checkBalance();


    }
}
