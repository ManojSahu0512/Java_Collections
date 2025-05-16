package Set.HashSet;
//Key Features of HashSet
//Unordered Collection:
//
//Elements are stored based on their hash values, so the iteration order is not guaranteed and may vary.
//It does not maintain insertion order (for insertion order, you can use LinkedHashSet).
//Unique Elements Only:
//
//Duplicates are not allowed. Adding a duplicate element will simply overwrite the existing one.
//Constant Time Performance:
//
//Basic operations like add(), remove(), and contains() work in O(1) time on average because of hashing.
//Allows Null:
//
//HashSet permits one null element, but adding more than one has no effect.


import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetInteger {
    public static void main(String[] args) {
        Set<Integer> eleSet=new HashSet<>();

        //Adds the specified element to the set if it is not already present.
        eleSet.add(10);
        eleSet.add(20);
        eleSet.add(300);
        eleSet.add(500);

        //Adds all elements from the specified collection to the set.

        eleSet.addAll(Arrays.asList(10,20,20,20,30,30,40));

        System.out.println(eleSet);//[20, 500, 40, 10, 300, 30]

        //Removes the specified element from the set if present.
        boolean ifIsExitThenRemove= eleSet.remove(10);
        System.out.println(ifIsExitThenRemove);//true

        System.out.println(eleSet);//[20, 500, 40, 300, 30]

        //Removes all elements in the set that are present in the specified collection.

        eleSet.removeAll(Arrays.asList(20,30));

        System.out.println(eleSet);  //[500, 40, 300]

        //Removes all elements from the set.

        eleSet.clear();
        System.out.println(eleSet);  //[]

        //Querying Elements
        //Checks if the set contains the specified element.
        eleSet.add(10);
        eleSet.add(20);
        eleSet.add(30);
        eleSet.add(540);

        boolean isExist=eleSet.contains(10);
        System.out.println(isExist);  //true

        //Checks if the set contains all elements of the specified collection.
        boolean isExits=eleSet.containsAll(Arrays.asList(10,20));

        System.out.println(isExits);  //true

        //4. Size and Emptiness
        //Size

        int size=eleSet.size();
        System.out.println(size); //4
        System.out.println(eleSet); //[20, 10, 540, 30]

        //Iteration
        //Iterator<E> iterator()
        //Returns an iterator over the elements in the set.

        Iterator<Integer> itr=eleSet.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());

        }
        //20
        //10
        //540
        //30
        //Enhanced For-Loop:

        for(Integer num:eleSet){
            System.out.println(num);
        }

        //20
        //10
        //540
        //30

        //Conversion
        //Object[] toArray()
        //Converts the set to an array of Object.

        Object[] arr=eleSet.toArray();

        //Converts the set to an array of the specified type.

        Integer[] arr2=eleSet.toArray(new Integer[0]);

        //// Retain only certain elements
        eleSet.retainAll(Arrays.asList(10,20));
        System.out.println(eleSet);  //[20,10]



        //Stream Operations (Java 8 and above)
        //Stream<E> stream()
        //Returns a sequential stream of elements in the set.

        eleSet.add(33);
        eleSet.add(66);
        eleSet.add(55);

        eleSet.stream().forEach(System.out::println);

        //33
        //66
        //20
        //55
        //10

        //Stream<E> parallelStream()
        //Returns a parallel stream of elements in the set.

        eleSet.parallelStream().forEach(System.out::println);














    }
}
