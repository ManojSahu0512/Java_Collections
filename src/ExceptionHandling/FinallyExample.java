package ExceptionHandling;

public class FinallyExample {
    public static void main(String[] args) {

        try{
            int data=25/0;
            System.out.println(data);
        }catch(NullPointerException e){
            System.out.println("Error"+e);
        }
        finally{
            System.out.println("Finally excecuted ");
        }
        System.out.println("rest of the code...");





    }
}

