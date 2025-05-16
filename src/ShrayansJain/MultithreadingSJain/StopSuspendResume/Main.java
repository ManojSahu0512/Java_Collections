package ShrayansJain.MultithreadingSJain.StopSuspendResume;

public class Main {
    public static void main(String[] args) {
        SharedResource resource=new SharedResource();
        System.out.println("Main thread started");

        Thread t1=new Thread(()->{
            System.out.println("Thread1 calling produce method");
            resource.produce();
        });
        Thread t2=new Thread(()->{
            try{
                Thread.sleep(1000);//thread2 is waiting 1 second so thread1 can acquire lock

            }catch (Exception e){

            }
            System.out.println("Thread2 is calling the produce method");
            resource.produce();
        });
        t1.start();
        t2.start();

        try{
            Thread.sleep(3000);//here giving 3 second to complete all above step before calling suspend method
        }catch (Exception e){

        }
        System.out.println("Thread1 is suspended (before releasing lock)");
        t1.suspend();//deprecated method not recommended to use

        try{
            Thread.sleep(3000);//here giving 3 second to complete all above step before calling suspend method
        }catch (Exception e){

        }
        t1.resume();
        System.out.println("Main thread is finishing its work");

    }
}
//Main thread started
//Thread1 calling produce method
//Lock acquired
//Thread2 is calling the produce method
//Thread1 is suspended (before releasing lock)
//Main thread is finishing its work
//Lock released
//Lock acquired
//Lock released
//
//Process finished with exit code 0