package ShrayansJain.Collections.Set.HashSet.ThreadSafeVersionConcurrentHashMap;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    //use this class to achieve thread safe --->ConcurrentHashMap in this we have newKeySet() method
    public static void main(String[] args) {
        ConcurrentHashMap concurrentHashMap=new ConcurrentHashMap<>();
        Set<Integer> threadSafeSet=concurrentHashMap.newKeySet();

        threadSafeSet.add(1);
        threadSafeSet.add(2);
        Iterator<Integer> iterator=threadSafeSet.iterator();
        while (iterator.hasNext()){
            int val=iterator.next();
            if(val==1){
                //iterator.remove();//we can remove

                //this is thread safe, so I can do two operation ,if it was not thread safe then it will throw error
                threadSafeSet.add(9);//we should be able to add in the set as its thread safe

            }
        }
        threadSafeSet.forEach((Integer num)-> System.out.println(num));
    }
}
