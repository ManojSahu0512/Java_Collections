package MultithreadingSJain.DaemonThread;

import MultithreadingSJain.StopSuspendResume.SharedResource;

public class Main {
    public static void main(String[] args) {
        SharedResource resource=new SharedResource();
        System.out.println("Main thread started");

        Thread t1=new Thread(()->{
            System.out.println("Thread1 calling produce method");
            resource.produce();
        });
        t1.setDaemon(true);
        t1.start();
        System.out.println("Main thread is finishing its work");



    }
}