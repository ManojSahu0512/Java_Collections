package ShrayansJain.MultithreadingSJain.ThreadPool.ThreadPoolExecutor.Future;

import java.util.concurrent.*;

public class Example2 {
    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor=new ThreadPoolExecutor(1,1,1, TimeUnit.HOURS,
                new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        Future<?> futureObj=poolExecutor.submit(()->{
            try{
                Thread.sleep(7000);
                System.out.println("This is the task,which thread will execute");
            }catch (Exception e){
                System.out.println("");
            }
        });
        System.out.println("Is done?"+futureObj.isDone());
        try{
          futureObj.get(2,TimeUnit.SECONDS);

        }catch (TimeoutException e){
            System.out.println("Timeout Happened");

        }
        catch (Exception e){

        }
        try{
            futureObj.get();
        }catch (Exception e){

        }
        System.out.println("is Done:"+futureObj.isDone());
        System.out.println("is Cancelled "+futureObj.isCancelled());
    }
}
//Is done?false
//Timeout Happened
//This is the task,which thread will execute
//is Done:true
//is Cancelled false