package ShrayansJain.MultithreadingSJain.Problem.BasicProblemsThreadCreationLifecycle;

/*
 * Daemon Thread: Create a daemon thread that runs in the background and
 * a user thread. Observe JVM behavior when the user thread completes.*/
public class DaemonThreadProblems {
    public static void main(String[] args) {
        Thread demanThread=new Thread(){
            @Override
            public void run(){
                try {
                    Thread.sleep(5000);//user thread already completed, so it will also complete without executing block
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("this is daemon thread: "+Thread.currentThread().getName());
            }
        };
        Thread userThread=new Thread(){
            @Override
            public void run(){

                System.out.println("this is user thread: "+Thread.currentThread().getName());
            }
        };
        demanThread.setDaemon(true);
        demanThread.start();

        userThread.start();



    }
}
