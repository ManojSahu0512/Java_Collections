package ShrayansJain.Collections.ComparatorVsComparable.Comparator;

import java.util.Arrays;

public class ComparatorExample {
    public static void main(String[] args) {
        Integer[] arr={1,10,4,8,3};
        Arrays.sort(arr,(Integer v1,Integer v2)->v1-v2);//internally it is doing swiping
        //it uses comparator and decide weather swap or not

        for(int v:arr){
            System.out.println(v);
        }


    }
}
