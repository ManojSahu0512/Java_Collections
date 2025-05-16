package ShrayansJain.Reflection.Field;



import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Class eagleClass= Eagle.class;
        Field[] fields=eagleClass.getFields();

        for(Field field:fields){
            System.out.println("Method name:"+field.getName());
            System.out.println("Return Type:"+field.getType());
            System.out.println("ShrayansJain.Class Name:"+field.getDeclaringClass());
            System.out.println("******************");

        }
    }
}
