package Multithreading.Interface;

public class Word implements Runnable {
    @Override
    public void run(){
        for (; ;){
            System.out.println(Thread.currentThread().getName());
        }

    }
}
