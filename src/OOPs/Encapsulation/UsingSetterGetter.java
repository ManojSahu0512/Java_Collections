package OOPs.Encapsulation;
class BankAccount{
    private String holderName;
    private double balance;

    //constructor
    public BankAccount(String holderName,double balance){
        this.balance=balance;
        this.holderName=holderName;

    }
    //setter
    public void setHolderName(String holderName){
        this.holderName=holderName;
    }
    public void setBalance(double balance){
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative!");
        }
    }
    //getter

    public String getHolderName(){
        return holderName;
    }
    public double getBalance(){
        return balance;
    }
    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }
}



public class UsingSetterGetter {
    public static void main(String[] args) {
        // Creating an object of BankAccount
        BankAccount account = new BankAccount("John Doe", 5000);

        // Accessing private variables using getters
        System.out.println("Account Holder: " + account.getHolderName());
        System.out.println("Initial Balance: $" + account.getBalance());

        // Modifying balance using encapsulated methods
        account.deposit(1000);
        account.withdraw(2000);
        System.out.println("Updated Balance: $" + account.getBalance());

        // Trying to set a negative balance (will be restricted)
        account.setBalance(-500);
    }
}
//Account Holder: John Doe
//Initial Balance: $5000.0
//Deposited: $1000.0
//Withdrawn: $2000.0
//Updated Balance: $4000.0
//Balance cannot be negative!