package MultithreadingSJain.ThreadPool.ThreadPoolExecutor.Future;

import java.util.concurrent.*;

public class FutureExample {
    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor=new ThreadPoolExecutor(1,1,1, TimeUnit.HOURS,new ArrayBlockingQueue<>(2),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        //new thread will be created,and it will perform the task
        Future<?> futureObj=poolExecutor.submit(()->{
            System.out.println("this is the task,which thread will execute");
        });

        //caller is checking the status of the thread it created
        System.out.println(futureObj.isDone());

    }
}
