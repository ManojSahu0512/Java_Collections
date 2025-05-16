package ShrayansJain.Class.SingletonClass.LazyInitialization;

public class DBConnection {
    private static DBConnection connectionObject;//here we are not creating object first we will check
    private DBConnection(){

    }
    public static DBConnection getInstance(){
        if(connectionObject==null){
            connectionObject=new DBConnection();//here two thread can create two object
        }
        return connectionObject;
    }
}
