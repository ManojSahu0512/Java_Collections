package ShrayansJain.Operators.TypeCheckOperators;

public class InstanceOfExample {
    public static void main(String[] args) {
        Parent obj=new Child2();
        System.out.println(obj instanceof Child2);//true
        System.out.println(obj instanceof Child1);//false
        Child1 child1=new Child1();
        System.out.println(child1 instanceof Parent);//true
        String val="hello";
        System.out.println(val instanceof String);//true
        //Object unknownObj=new RandomClass();
        //System.out.println(unknownObj instanceof Child1);  false

    }
}
