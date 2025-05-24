package ShrayansJain.MultithreadingSJain.Problem.BasicProblemsThreadCreationLifecycle;

/*
* Write a program where a thread pauses for 2 seconds using Thread.sleep() and then prints a message.*/
public class ThreadPauses {
    public static void main(String[] args) {
        Thread thread=new Thread() {
            @Override
            public void run() {


                System.out.println("Thread is waiting");
                try {
                    Thread.sleep(5000);
                    System.out.println("5 second completed");
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        thread.start();


    }
}
