package ShrayansJain.MultithreadingSJain.Problem.BasicProblemsThreadCreationLifecycle;
/*
* Write a program where three threads print their names. Use Thread.currentThread().getName().*/
public class ThreadNames {
    public static void main(String[] args) {
        Thread thread1=new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        });
        Thread thread2=new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        });
        Thread thread3=new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        });

        thread1.start();
        thread2.start();
        thread3.start();


    }
}
//Thread-0
//Thread-1
//Thread-2