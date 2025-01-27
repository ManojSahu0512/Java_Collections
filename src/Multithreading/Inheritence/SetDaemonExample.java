package Multithreading.Inheritence;

public class SetDaemonExample extends Thread{


    @Override
    public void run(){
        while (true){
            System.out.println("Hello World!!");

        }

    }

    public static void main(String[] args) throws InterruptedException{
        SetDaemonExample t1=new SetDaemonExample();
        t1.setDaemon(true);
        t1.start();
        System.out.println("Main done");

    }
}
