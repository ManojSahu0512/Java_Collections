package ShrayansJain.MultithreadingSJain.Problem;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedBuffer=new SharedResource(3);
        //creating producer thread using lambda expression
        Thread producerThread=new Thread(()->{
            try{
                for(int i=1;i<=6;i++){
                 sharedBuffer.produce(i);
                }
            }catch (Exception e){

            }
        });

//ceating consumer thread using lambda expression
        Thread consumerThread=new Thread(()->{
           try {
              for(int i=1;i<=6;i++){
                 sharedBuffer.consume();
              }
           }catch (Exception e){

           }
        });
        producerThread.start();
        consumerThread.start();
    }
}
