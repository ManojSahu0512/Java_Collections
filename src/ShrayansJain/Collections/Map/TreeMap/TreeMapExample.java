package ShrayansJain.Collections.Map.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    //Natural order soring or using comparator (ascending or descending order)
    //based on self balance binary search tree// Red-Black tree
    public static void main(String[] args) {
        Map<Integer,String>map1=new TreeMap<>((Integer key1,Integer key2)->key2-key1);
        map1.put(21,"SJ");
        map1.put(11,"PJ");
        map1.put(13,"KJ");
        map1.put(5,"TJ");

         //for decreasing order
        map1.forEach((Integer key,String value)-> System.out.println("key:"+key+" value:"+value));

        System.out.println("----------------------");
        Map<Integer,String>map2=new TreeMap<>();//Natural order
        map2.put(21,"SJ");
        map2.put(11,"PJ");
        map2.put(13,"KJ");
        map2.put(5,"TJ");
        map2.forEach((Integer key,String value)-> System.out.println("key:"+key+" value:"+value));



    }
}
//key:21 value:SJ
//key:13 value:KJ
//key:11 value:PJ
//key:5 value:TJ
//----------------------
//key:5 value:TJ
//key:11 value:PJ
//key:13 value:KJ
//key:21 value:SJ