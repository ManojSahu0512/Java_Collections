package ShrayansJain.Reflection.InvokingMethodUsingReflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Class eagleClass=Class.forName("Eagle");
        Object eagleObject=eagleClass.newInstance();//invoke constructor
        Method flyMethod=eagleClass.getMethod("fly",int.class,boolean.class,String.class);
        flyMethod.invoke(eagleObject,1,true,"hello");
    }
}
