package Multithreading.Inheritence;

public class MyThreadMethods extends Thread{

    public MyThreadMethods(String name) {
        super(name); // Call the Thread class constructor to set the name
    }
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            String a="A";
            for (int j=0;j<10000;j++){
                a=a+" ";

            }
            System.out.println(Thread.currentThread().getName()+"- Priority: "+Thread.currentThread().getPriority()+ "-Count "+i);
            try{
                Thread.sleep(100);
            }catch (Exception e){
                System.out.println(e);


            }
        }
    }

    public static void main(String[] args) throws InterruptedException{
        MyThreadMethods l= new MyThreadMethods("Low priority Thread");
        MyThreadMethods m= new MyThreadMethods("Medium priority Thread");
        MyThreadMethods h= new MyThreadMethods("High priority Thread");
        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);
        l.start();
        m.start();
        h.start();

    }
}
