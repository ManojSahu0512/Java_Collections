package ShrayansJain.Collections.Map.TreeMap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapExample {
    public static void main(String[] args) {
        NavigableMap<Integer,String>navigableMap=new TreeMap<>();
        navigableMap.put(1,"A");
        navigableMap.put(21,"B");
        navigableMap.put(23,"C");
        navigableMap.put(141,"D");
        navigableMap.put(35,"E");
        System.out.println(navigableMap.lowerEntry(23));//less than 23 return or null  21,B
        System.out.println(navigableMap.lowerKey(23));//21
        System.out.println(navigableMap.floorEntry(24));//23,C


        //21=B
        //21
        //23=C
    }
}
