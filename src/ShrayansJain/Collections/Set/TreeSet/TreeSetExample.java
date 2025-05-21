package ShrayansJain.Collections.Set.TreeSet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    //Internally it uses:TreeMap
    //it can not store null value
    public static void main(String[] args) {
        Set<Integer>  treeSet=new TreeSet<>();
        treeSet.add(2);
        treeSet.add(77);
        treeSet.add(82);
        treeSet.add(63);
        treeSet.add(5);

        Iterator<Integer> iterator=treeSet.iterator();

        while (iterator.hasNext()){
            int val=iterator.next();
            System.out.println(val);

        }
    }
}
