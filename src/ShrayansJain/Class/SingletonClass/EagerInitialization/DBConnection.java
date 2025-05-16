package ShrayansJain.Class.SingletonClass.EagerInitialization;

public class DBConnection {
    private static DBConnection connectionObj=new DBConnection();//as soon as application started this obj will create because this is static
    private DBConnection(){

    }
    public static DBConnection getInstance(){
        return connectionObj;
    }
}
