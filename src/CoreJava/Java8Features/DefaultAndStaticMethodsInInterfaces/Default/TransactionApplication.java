package CoreJava.Java8Features.DefaultAndStaticMethodsInInterfaces.Default;

interface TransactionLogger {
    // Abstract method to implement in service
    void logTransaction(String txnId, double amount);

    // Default method – common reusable behavior
    default void logAudit(String msg) {
        System.out.println("[AUDIT] " + msg);
    }

    // Static method – utility for formatting
    static String formatCurrency(double amount) {
        return String.format("₹%.2f", amount);
    }

}

class PaymentTransactionService implements TransactionLogger {

    @Override
    public void logTransaction(String txnId, double amount) {
        String formatted = TransactionLogger.formatCurrency(amount);
        System.out.println("Transaction ID: " + txnId + ", Amount: " + formatted);
        logAudit("Transaction logged at " + java.time.LocalDateTime.now());
    }
}

public class TransactionApplication {
    public static void main(String[] args) {
        PaymentTransactionService service = new PaymentTransactionService();
        service.logTransaction("TXN12345", 15000.50);
        // You can also call the static method independently
        System.out.println("Test format: " + TransactionLogger.formatCurrency(500.75));
    }
}
