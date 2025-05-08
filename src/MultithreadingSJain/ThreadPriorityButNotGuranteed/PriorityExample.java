package MultithreadingSJain.ThreadPriorityButNotGuranteed;
public class PriorityExample {
    public static void main(String[] args) {
        Thread lowPriorityThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Low priority thread");
                Thread.yield(); // Hint to scheduler to give other threads a chance
            }
        });

        Thread highPriorityThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("High priority thread");
                Thread.yield();
            }
        });

        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);
        highPriorityThread.setPriority(Thread.MAX_PRIORITY);

        highPriorityThread.start();
        lowPriorityThread.start();
    }
}