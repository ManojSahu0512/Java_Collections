package ExceptionHandling;

public class Propagation {
    public void m(){
        int data=50/0;
    }
    public void n(){
        m();
    }
    public void p(){
        try{
            n();
        }catch (Exception e){
            System.out.println("exception handled"+e);
        }
    }
    public static void main(String args[]){
        Propagation obj=new Propagation();
        obj.p();
        System.out.println("Normal flow");

    }

}

