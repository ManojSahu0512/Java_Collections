package MultithreadingSJain.ConcurrencyCanAchieved.LockBasedMechanism.CustomLock.Condition;

public class Main {
    public static void main(String[] args) {

        SharedResource resource=new SharedResource();
        Thread t1=new Thread(()->{
            for(int i=0;i<2;i++){
                resource.producer();
            }
        });
        Thread t2=new Thread(()->{
            for(int i=0;i<2;i++){
                resource.consume();
            }
        });
        t1.start();
        t2.start();
    }
}
//Produce lock acquired by: Thread-0
//Produce lock release by Thread-0
//Produce lock acquired by: Thread-0
//Produce thread is waiting: Thread-0
//Consume Lock acquired by: Thread-1
//Consumer thread is waiting: Thread-1