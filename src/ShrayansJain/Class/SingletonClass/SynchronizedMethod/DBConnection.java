package ShrayansJain.Class.SingletonClass.SynchronizedMethod;

public class DBConnection {
    private static DBConnection conObject;
    private  DBConnection(){

    }
    synchronized public static DBConnection getInstance(){//here only one thread can create object at a time but still issue with lock and unlock multiple time

        if(conObject==null){
            conObject=new DBConnection();
        }
        return conObject;
    }
}
