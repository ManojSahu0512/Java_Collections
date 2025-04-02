package Java8Features.Stream;

import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperation {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,2,3,4,5,6,7,44435,9,9,4,4,66,4445);
        List<Integer> filterList=list.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println(filterList);//[10, 2, 4, 6, 4, 4, 66]
        filterList.stream().map(x->x/2);
        List<Integer> mappedList=filterList.stream().map(x->x/2).collect(Collectors.toList());
        System.out.println(mappedList);//[5, 1, 2, 3, 2, 2, 33]
        List<Integer> filterMapList2=list.stream().filter(x->x%2==0).map(x->x/2).collect(Collectors.toList());

        System.out.println(filterMapList2);//[5, 1, 2, 3, 2, 2, 33]

        List<Integer> filterMapDistinctList2=list.stream().filter(x->x%2==0).map(x->x/2).distinct().collect(Collectors.toList());
        System.out.println(filterMapDistinctList2);//[5, 1, 2, 3, 33]
        List<Integer> filterMapDistinctSortedList2=list.stream().filter(x->x%2==0).map(x->x/2).distinct().sorted().collect(Collectors.toList());

        System.out.println(filterMapDistinctSortedList2);//[1, 2, 3, 5, 33]
        List<Integer> filterMapDistinctDescSortedList2=list.stream().filter(x->x%2==0).map(x->x/2).distinct().sorted((a,b)->b-a).collect(Collectors.toList());

        System.out.println(filterMapDistinctDescSortedList2);//[33, 5, 3, 2, 1]

        List<Integer> filterMapDistinctDescSortedList2Limit3=list.stream().filter(x->x%2==0).map(x->x/2).distinct().sorted((a,b)->b-a).limit(4).collect(Collectors.toList());
        System.out.println(filterMapDistinctDescSortedList2Limit3);
        List<Integer> filterMapDistinctDescSortedList2Limit3Skip=list.stream().filter(x->x%2==0).map(x->x/2).distinct().sorted((a,b)->b-a).limit(2).skip(1).collect(Collectors.toList());
        System.out.println(filterMapDistinctDescSortedList2Limit3Skip);

        List<Integer> collect= Stream.iterate(0,x->x+1).peek(x-> System.out.println(x)).limit(101).skip(1).collect(Collectors.toList());
        System.out.println(collect);











    }

}
