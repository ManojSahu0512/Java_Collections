package ShrayansJain.Reflection.ReflectionOfMethod;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class eagleClass= Eagle.class;
        Method[] methods=eagleClass.getMethods();
        for(Method method:methods){
            System.out.println("Method name:"+method.getName());
            System.out.println("Return Type:"+method.getReturnType());
            System.out.println("ShrayansJain.Class Name:"+method.getDeclaringClass());
            System.out.println("******************");

        }
    }

}
//Method name:fly
//Return Type:void
//ShrayansJain.Class Name:class ShrayansJain.Reflection.ReflectionOfMethod.Eagle
//******************
//Method name:eat
//Return Type:void
//ShrayansJain.Class Name:class ShrayansJain.Reflection.ReflectionOfMethod.Eagle
//******************
//Method name:wait
//Return Type:void
//ShrayansJain.Class Name:class java.lang.Object
//******************
//Method name:wait
//Return Type:void
//ShrayansJain.Class Name:class java.lang.Object
//******************
//Method name:wait
//Return Type:void
//ShrayansJain.Class Name:class java.lang.Object
//******************
//Method name:equals
//Return Type:boolean
//ShrayansJain.Class Name:class java.lang.Object
//******************
//Method name:toString
//Return Type:class java.lang.CoreJava.String
//ShrayansJain.Class Name:class java.lang.Object
//******************
//Method name:hashCode
//Return Type:int
//ShrayansJain.Class Name:class java.lang.Object
//******************
//Method name:getClass
//Return Type:class java.lang.ShrayansJain.Class
//ShrayansJain.Class Name:class java.lang.Object
//******************
//Method name:notify
//Return Type:void
//ShrayansJain.Class Name:class java.lang.Object
//******************
//Method name:notifyAll
//Return Type:void
//ShrayansJain.Class Name:class java.lang.Object
//******************
//
//Process finished with exit code 0