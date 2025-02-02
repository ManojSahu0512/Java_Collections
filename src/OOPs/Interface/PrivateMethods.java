package OOPs.Interface;

interface Printer {
    private void log(String message) {
        System.out.println("Log: " + message);
    }

    default void print() {
        log("Print method called.");
        System.out.println("Printing document...");

    }
}


class LaserPrinter implements Printer {

    }
public class PrivateMethods {
    public static void main(String[] args) {
        Printer printer = new LaserPrinter();
        printer.print();
    }
}
//Log: Print method called.
//Printing document...
