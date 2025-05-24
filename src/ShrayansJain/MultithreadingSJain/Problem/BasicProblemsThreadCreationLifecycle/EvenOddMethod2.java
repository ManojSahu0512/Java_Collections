package ShrayansJain.MultithreadingSJain.Problem.BasicProblemsThreadCreationLifecycle;
class NumberPrinter {
    private int number = 1;
    private final int MAX = 100;

    public synchronized void printOdd() {
        while (number <= MAX) {
            while (number % 2 == 0) {
                try {
                    wait(); // wait if it's not odd
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            if (number <= MAX) {
                System.out.println("Odd: " + number);
                number++;
                notify(); // notify even thread
            }
        }
    }

    public synchronized void printEven() {
        while (number <= MAX) {
            while (number % 2 != 0) {
                try {
                    wait(); // wait if it's not even
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            if (number <= MAX) {
                System.out.println("Even: " + number);
                number++;
                notify(); // notify odd thread
            }
        }
    }
}
public class EvenOddMethod2 {
    public static void main(String[] args) {
        NumberPrinter printer = new NumberPrinter();

        Thread oddThread = new Thread(() -> printer.printOdd());
        Thread evenThread = new Thread(() -> printer.printEven());

        oddThread.start();
        evenThread.start();
    }
}
