package MultithreadingSJain.ThreadCreationLifeCycle;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResourceObj=new SharedResource();
        Thread producerThread=new Thread(()->{
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            sharedResourceObj.addItem();
        });

        Thread consumserThread=new Thread(()->{
            sharedResourceObj.consumeItem();
        });
        producerThread.start();
        consumserThread.start();
    }
}
