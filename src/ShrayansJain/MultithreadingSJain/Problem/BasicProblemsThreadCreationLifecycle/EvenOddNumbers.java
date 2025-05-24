package ShrayansJain.MultithreadingSJain.Problem.BasicProblemsThreadCreationLifecycle;
/*
* Even & Odd Numbers: Create two threads, one prints even numbers and the other prints odd numbers up to 10.
*  Synchronize them to print in order (1, 2, 3, 4, ...).*/
public class EvenOddNumbers {
    private static final int MAX = 10;
    private static int counter = 1;
    private static final Object lock = new Object();

    public static void main(String[] args) {
        //Thread for odd number
        Thread oddThread = new Thread(() -> {
            while (counter <= MAX) {
                synchronized (lock) {
                    if (counter % 2 != 0) {
                        System.out.println("Odd Thread: " + counter);
                        counter++;
                        lock.notify();// Wake up even thread released monitor lock
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }

                }
            }
        });

        Thread evenThread = new Thread(() -> {
            while (counter <= MAX) {
                synchronized (lock) {
                    if (counter % 2 == 0) {
                        System.out.println("Even Thread: " + counter);
                        counter++;
                        lock.notify();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }

        });
        oddThread.start();
        evenThread.start();

    }
}
//Odd Thread: 1
//Even Thread: 2
//Odd Thread: 3
//Even Thread: 4
//Odd Thread: 5
//Even Thread: 6
//Odd Thread: 7
//Even Thread: 8
//Odd Thread: 9
//Even Thread: 10