package Multithreading.Inheritence;

public class MyThread2 extends Thread{

        public MyThread2(String name) {
        super(name); // Call the Thread class constructor to set the name
    }
    @Override
    public void run(){

        for (int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+ " is running");
            Thread.yield();// giving chance to execute other thread also
        }


    }

    public static void main(String[] args) throws InterruptedException{
        MyThread2 t1=new MyThread2("t1");
        MyThread2 t2=new MyThread2("t2");
        t1.start();
        t2.start();

    }
}
