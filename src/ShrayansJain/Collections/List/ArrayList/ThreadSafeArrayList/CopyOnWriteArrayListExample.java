package ShrayansJain.Collections.List.ArrayList.ThreadSafeArrayList;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {
        List<Integer> list=new CopyOnWriteArrayList<>();
        list.add(0,100);
        System.out.println(list.get(0));//100
    }
}
