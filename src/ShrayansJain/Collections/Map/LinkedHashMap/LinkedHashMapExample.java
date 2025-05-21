package ShrayansJain.Collections.Map.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    //similar to HashMap but maintain insertion and Access(Frequently use element present at first) order and used Double LinkedList
    //Not Thread safe no version available for this so we have to manually make it this collection thread safe this:
    //Map<Integer,String> linkedHashMap=Collections.synchronizedMap(new LinkedHashMap<>());

    public static void main(String[] args) {
        System.out.println("------------below is LinkedHashMap output----------");
        Map<Integer,String> linkedHashMap=new LinkedHashMap<>();//new HashMap<>(16,.75F,true)//access order true
        linkedHashMap.put(1,"A");
        linkedHashMap.put(21,"B");
        linkedHashMap.put(23,"C");
        linkedHashMap.put(141,"D");
        linkedHashMap.put(35,"E");

        linkedHashMap.forEach((Integer key,String value)-> System.out.println(key+":"+value));

        System.out.println("----------Below is normal hashmap output-------------");

        Map<Integer,String>hashMap=new HashMap<>();
        hashMap.put(1,"A");
        hashMap.put(21,"B");
        hashMap.put(23,"C");
        hashMap.put(141,"D");
        hashMap.put(35,"E");

        for(Map.Entry<Integer,String>entry:hashMap.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }



    }
}
//------------below is LinkedHashMap output----------
//1:A
//21:B
//23:C
//141:D
//35:E
//----------Below is normal hashmap output-------------
//1:A
//35:E
//21:B
//23:C
//141:D
//
