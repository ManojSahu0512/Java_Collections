package ShrayansJain.Class.ENUMClass.Normal;

public class Main {
    public static void main(String[] args) {
        /*Common functions which is used
        values()
        -Ordinal()
        valueOf()
        name()
        -
        * */
        //1. uses of Values() and ordinal()
        for(EnumSample sample: EnumSample.values()){
            System.out.println(sample.ordinal());
        }
        //2. usage of ValueOf and name()
        EnumSample enumVariable=EnumSample.valueOf("FRIDAY");
        System.out.println(enumVariable.name());
        //0
        //1
        //2
        //3
        //4
        //5
        //6
        //FRIDAY
    }
}
