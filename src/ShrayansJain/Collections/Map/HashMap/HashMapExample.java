package ShrayansJain.Collections.Map.HashMap;

import java.util.Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        //insertion order is not maintained
        Map<Integer, String> rollNumberVsNameMap = new HashMap<>();
        rollNumberVsNameMap.put(null, "TEST");//if key is not there or key is there but value is null then override
        rollNumberVsNameMap.put(0, null);
        rollNumberVsNameMap.put(1, "A");
        rollNumberVsNameMap.put(2, "B");

        //compute if present
        rollNumberVsNameMap.putIfAbsent(null, "test");
        rollNumberVsNameMap.putIfAbsent(0, "ZERO");
        rollNumberVsNameMap.putIfAbsent(3, "C");

        for (Map.Entry<Integer, String> entryMap : rollNumberVsNameMap.entrySet()) {
            Integer key = entryMap.getKey();
            String value = entryMap.getValue();
            System.out.println("Key:" + key + " Value:" + value);
        }

        //isEmpty
        System.out.println("isEmpty(): " + rollNumberVsNameMap.isEmpty());

        //size
        System.out.println("Size: " + rollNumberVsNameMap.size());

        //containsKey
        System.out.println("containsKey(3): " + rollNumberVsNameMap.containsKey(3));

        //get(key)
        System.out.println("get(1): " + rollNumberVsNameMap.get(1));

        //getOrDefault(key)
        System.out.println("get(9): " + rollNumberVsNameMap.getOrDefault(9, "Default value"));

        //remove(key)
        System.out.println("remove(null): " + rollNumberVsNameMap.remove(null));

        for (Map.Entry<Integer, String> entryMap1 : rollNumberVsNameMap.entrySet()) {
            Integer key1 = entryMap1.getKey();
            String value1 = entryMap1.getValue();
            System.out.println("Key: " + key1 + " value: " + value1);


        }

        //keySet()
        for (Integer key2 : rollNumberVsNameMap.keySet()) {
            System.out.println("Key: " + key2);
        }
        //values()
        Collection<String> values2 = rollNumberVsNameMap.values();

        for (String value2 : values2) {
            System.out.println("Value: " + value2);
        }


    }
}
//Key:null Value:TEST
//Key:0 Value:ZERO
//Key:1 Value:A
//Key:2 Value:B
//Key:3 Value:C
//isEmpty(): false
//Size: 5
//containsKey(3): true
//get(1): A
//get(9): Default value
//remove(null): TEST
//Key: 0 value: ZERO
//Key: 1 value: A
//Key: 2 value: B
//Key: 3 value: C
//Key: 0
//Key: 1
//Key: 2
//Key: 3
//Value: ZERO
//Value: A
//Value: B
//Value: C
