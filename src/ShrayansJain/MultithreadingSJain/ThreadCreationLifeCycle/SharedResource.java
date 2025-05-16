package ShrayansJain.MultithreadingSJain.ThreadCreationLifeCycle;

public class SharedResource {
    boolean  isItemPresent=false;
    public synchronized void addItem(){
        isItemPresent=true;
        System.out.println("Producer thread calling the notify method");
        notifyAll();
    }
    public synchronized void consumeItem(){

        System.out.println("Consumer thread inside consumerItem method");
        if(!isItemPresent){

            try{
                System.out.println("counsumer thread is waiting...");
                wait();//release all the monitor lock
            }catch (Exception e){
                //excepting handling goes here
            }
            System.out.println("Consumer thread consumed the item");
            isItemPresent=false;
        }
    }
}
