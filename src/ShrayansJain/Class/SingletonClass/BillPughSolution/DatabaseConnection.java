package ShrayansJain.Class.SingletonClass.BillPughSolution;

public class DatabaseConnection {
    private DatabaseConnection(){//object can not be created outside the class

    }
    private static class DBConnectionHelper{//this class will not get loaded at the time of application start similar to eager initialization when they are used then only they will consume memory
        private static final DatabaseConnection INSTANCE_OBJECT=new DatabaseConnection();

    }
    public static DatabaseConnection getInstance(){
        return DBConnectionHelper.INSTANCE_OBJECT;
    }
}
