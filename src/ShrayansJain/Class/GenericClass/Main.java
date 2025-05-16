package ShrayansJain.Class.GenericClass;

public class Main {
    public static void main(String[] args) {
        //we need to mention datatype while creating object of generic class
        Print<Integer> printObj1 = new Print<Integer>();
        printObj1.setPrintValue(1);
        Integer printValue = printObj1.getPrintValue();
        if (printValue == 1) {
            //do somethings
        }
    }
}
