package ShrayansJain.Class.SingletonClass.DoubleLocking;

public class DatabaseConnection {
    private static volatile DatabaseConnection databaseConnectionObj;//Memory issue overcome with volatile but still issue is there because it is not using cache memory using actual memory
    private DatabaseConnection(){

    }
    public static DatabaseConnection getInstance(){
        if(databaseConnectionObj==null){// check1
            synchronized (DatabaseConnection.class){
                if (databaseConnectionObj==null){//check2
                    databaseConnectionObj=new DatabaseConnection();
                }
            }

        }
        return databaseConnectionObj;
    }
}
