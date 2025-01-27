package Multithreading.Inheritence;
public class MyThread1 extends Thread{

//    public MyThread1(String name) {
//        super(name); // Call the Thread class constructor to set the name
//    }
    @Override
    public void run(){

        try{
            Thread.sleep(100);
            System.out.println("Thread is running...");
        }catch (InterruptedException e){
            System.out.println("Thread interrupted: "+e);
        }

    }

    public static void main(String[] args) throws InterruptedException{
        MyThread1 t1=new MyThread1();
        t1.start();
        t1.interrupt();//Thread interrupted: java.lang.InterruptedException: sleep interrupted


    }
}
