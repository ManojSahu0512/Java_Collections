package ShrayansJain.Collections.List.Vector;

import java.util.Vector;

public class VectorAlwaysThreadSafeInternallyExample {
    public static void main(String[] args) {
        //vector is thread safe internally apply lock and unlock but slower than ArrayList
        //Stack is child of vector
        Vector<Integer>obj=new Vector<>();
        obj.add(0,200);
        System.out.println(obj.get(0));
    }
}
//200
