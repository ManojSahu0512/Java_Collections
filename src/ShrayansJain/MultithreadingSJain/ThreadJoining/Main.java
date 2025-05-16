package ShrayansJain.MultithreadingSJain.ThreadJoining;

import ShrayansJain.MultithreadingSJain.StopSuspendResume.SharedResource;

public class Main {
    public static void main(String[] args) {
        SharedResource resource=new SharedResource();
        System.out.println("Main thread started");

        Thread t1=new Thread(()->{
            System.out.println("Thread1 calling produce method");
            resource.produce();
        });

        t1.start();

        try{
            System.out.println("Main thread is waiting for thread1 to finish now");
            t1.join();
        }catch (Exception e){

        }
        System.out.println("Main thread is finishing its work");

    }
}
//Main thread started
//Main thread is waiting for thread1 to finish now
//Thread1 calling produce method
//Lock acquired
//Lock released
//Main thread is finishing its work