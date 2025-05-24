package ShrayansJain.MultithreadingSJain.Problem.BasicProblemsThreadCreationLifecycle;
/*
* Hello World Thread: Create two threads, one prints "Hello" and
*  the other prints "World". Ensure they run sequentially (first "Hello", then "World").*/
public class HelloWorldThreads {

    public static void main(String[] args) {
        // Thread 1: Prints "Hello"
        Thread thread1 = new Thread(() -> {
            System.out.println("Hello");
        });

        // Thread 2: Prints "World"
        Thread thread2 = new Thread(() -> {
            System.out.println("World");
        });

        // Start Thread1 and wait for it to finish
        thread1.start();
        try {
            thread1.join(); // Main thread waits for thread1 to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Start Thread2 after Thread1 finishes
        thread2.start();
    }
}
//Hello
//World
