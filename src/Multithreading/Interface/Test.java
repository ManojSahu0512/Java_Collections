package Multithreading.Interface;

public class Test {
    public static void main(String[] args) {
        Word word=new Word();
        Thread t1=new Thread(word);
        t1.start();
        for(; ;){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
