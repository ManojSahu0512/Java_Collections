package MultithreadingSJain.DaemonThread;

public class SharedResource {
    boolean isAvailable = false;

    public synchronized void produce() {
        System.out.println("Lock acquired");
        isAvailable = true;

        try {
            Thread.sleep(8000);  //sleep method will not release the lock
        } catch (Exception e) {

        }
        System.out.println("Lock released");
    }
}
