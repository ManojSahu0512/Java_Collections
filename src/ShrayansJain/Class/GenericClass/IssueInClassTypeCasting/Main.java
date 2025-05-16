package ShrayansJain.Class.GenericClass.IssueInClassTypeCasting;

public class Main {
    public static void main(String[] args) {
        Print printObj=new Print();
        printObj.setPrintValue(1);
        Object printValue=printObj.getPrintValue();
        //we can not use printValue directly, we have to typecast it, else it will be compiler error.
        if((int)printValue==1){
            //do something
        }

    }
}
