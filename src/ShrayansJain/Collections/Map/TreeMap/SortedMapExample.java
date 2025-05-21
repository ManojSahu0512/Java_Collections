package ShrayansJain.Collections.Map.TreeMap;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {
    public static void main(String[] args) {
        SortedMap<Integer,String> map2=new TreeMap<>();//Natural order
        map2.put(21,"SJ");
        map2.put(11,"PJ");
        map2.put(13,"KJ");
        map2.put(5,"TJ");
        System.out.println(map2.headMap(13));// before 13 all key value exclude 13
        System.out.println(map2.tailMap(13));//include 13 also
        System.out.println(map2.firstKey());
        System.out.println(map2.lastKey());
    }
}
//{5=TJ, 11=PJ}
//{13=KJ, 21=SJ}
//5
//21
