package ShrayansJain.Collections.Set.LinkedHashSet;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    //internally it uses: LinkedHashMap
    //Not thread safe
    //Thread safe manually---->Set<Integer>set= Collections.synchronizedSet(new LinkedHashSet<>());
    public static void main(String[] args) {

        Set<Integer> intSet=new LinkedHashSet<>();
        intSet.add(2);
        intSet.add(77);
        intSet.add(82);
        intSet.add(63);
        intSet.add(5);

        Iterator<Integer> iterator=intSet.iterator();
        while (iterator.hasNext()){
            int val=iterator.next();

            System.out.println(val);
        }
    }
}
