package ShrayansJain.MultithreadingSJain.ThreadPool.ThreadPoolExecutor;

import java.util.concurrent.*;

public class ThreadPoolExecutorExample {
    public static void main(String[] args) {
        ThreadPoolExecutor executor=new ThreadPoolExecutor
                (2,4,10,
                        TimeUnit.MINUTES,new ArrayBlockingQueue<>(2),
                        new CustomThreadFactory(), new CustomRejectHandler());

        for(int i=1;i<=4;i++){
            executor.submit(()->{
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Task processed by: "+Thread.currentThread().getName());
            });
        }
        executor.shutdown();
    }
}

class CustomThreadFactory implements ThreadFactory{

    @Override
    public Thread newThread(Runnable r) {
        Thread th=new Thread(r);
        th.setPriority(Thread.NORM_PRIORITY);
        th.setDaemon(false);
        return  th;

    }
}

class CustomRejectHandler implements RejectedExecutionHandler{

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("Task rejected: "+r.toString());

    }
}
//Task processed by: Thread-1
//Task processed by: Thread-0
//Task processed by: Thread-1
//Task processed by: Thread-0
//
//Process finished with exit code 0