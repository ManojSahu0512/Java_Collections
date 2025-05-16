package CoreJava.Java8Features.LambdaExpression;

import java.util.Map;
import java.util.TreeMap;

public class SortingUsingTree {
    public static void main(String[] args) {
        Map<Integer,String> m=new TreeMap<>();
        m.put(2,"z");
        m.put(3,"f");
        m.put(1,"y");
        System.out.println("Before manual sorting:"+m);
        Map<Integer,String> mn =new TreeMap<>((a,b)->b-a);
        mn.put(2,"z");
        mn.put(3,"f");
        mn.put(1,"y");
        System.out.println("After manual sorting in desc:"+mn);

    }
}
