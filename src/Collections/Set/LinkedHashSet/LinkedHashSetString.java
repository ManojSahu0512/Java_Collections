package Set.LinkedHashSet;
//The LinkedHashSet is a collection class in Java that combines the unique-element storage of a HashSet with the predictable iteration order of a LinkedList. It is part of the java.util package and implements the Set interface.
//Key Features of LinkedHashSet
//Maintains Insertion Order: Unlike HashSet, which is unordered, LinkedHashSet maintains the order in which elements were inserted.
//No Duplicates: Ensures that no duplicate elements are stored.
//Constant-Time Operations: Provides O(1) time complexity for basic operations like add, remove, and contains, similar to HashSet.
//Allows Null: Supports one null element.
//Uses LinkedHashMap Internally: The LinkedHashSet is implemented using a LinkedHashMap to maintain the insertion order.


//Constructors
//LinkedHashSet(): Creates an empty LinkedHashSet with a default initial capacity of 16 and a load factor of 0.75.
//LinkedHashSet(int initialCapacity): Creates a LinkedHashSet with the specified initial capacity.
//LinkedHashSet(int initialCapacity, float loadFactor): Creates a LinkedHashSet with the specified initial capacity and load factor.
//LinkedHashSet(Collection<? extends E> c): Creates a LinkedHashSet containing all elements of the specified collection, in the order they are returned by the collection's iterator.

//Common Methods
//LinkedHashSet inherits methods from HashSet, AbstractSet, and Set. Here are the key methods:
//
//Adding Elements
//boolean add(E e): Adds the specified element if it is not already present.
//boolean addAll(Collection<? extends E> c): Adds all elements from the specified collection to this set.
//Removing Elements
//boolean remove(Object o): Removes the specified element if it exists.
//void clear(): Removes all elements from the set.
//boolean removeAll(Collection<?> c): Removes all elements from the set that are in the specified collection.
//Querying Elements
//boolean contains(Object o): Checks if the set contains the specified element.
//int size(): Returns the number of elements in the set.
//boolean isEmpty(): Checks if the set is empty.
//Iteration
//Iterator<E> iterator(): Returns an iterator over the elements in the set, in the order of insertion.
//Advantages
//Predictable iteration order (unlike HashSet).
//Fast performance for basic operations (similar to HashSet).
//Easy to use for unique collections with order preservation.
//Disadvantages
//Slightly higher memory usage compared to HashSet due to maintaining insertion order.
//When to Use LinkedHashSet
//Use LinkedHashSet when:
//
//You need a set that ensures no duplicates.
//You want to maintain the order in which elements are added.
//Performance is critical, but ordering matters.

import java.util.Arrays;
import java.util.LinkedHashSet;

public class LinkedHashSetString {
    public static void main(String[] args) {
        LinkedHashSet<String> elements=new LinkedHashSet<>();
        elements.add("Apple");
        elements.add("Mango");
        System.out.println(elements);//[Apple, Mango]

        elements.add("Apple");

        System.out.println(elements); //[Apple, Mango]

        //Adding Elements
        //boolean add(E e): Adds the specified element if it is not already present.
        //boolean addAll(Collection<? extends E> c): Adds all elements from the specified collection to this set.
        elements.add("Cherry");
        elements.add("Cherry");
        System.out.println(elements); //[Apple, Mango, Cherry]

        //Removing Elements
        //boolean remove(Object o): Removes the specified element if it exists.
        //void clear(): Removes all elements from the set.
        //boolean removeAll(Collection<?> c): Removes all elements from the set that are in the specified collection.

        boolean remove=elements.remove("Cherry");
        System.out.println(remove);  //true
        System.out.println(elements);  //[Apple, Mango]

        boolean removeAlls=elements.removeAll(Arrays.asList("Apple","Mango"));

        System.out.println(removeAlls);  //true


        //Querying Elements
        //boolean contains(Object o): Checks if the set contains the specified element.
        //int size(): Returns the number of elements in the set.
        //boolean isEmpty(): Checks if the set is empty.
        elements.add("Grapes");
        elements.add("Papaya");
        elements.add("Berry");

        boolean isExits=elements.contains("Berry");
        System.out.println(isExits);  //true

        //Iteration
        //Iterator<E> iterator(): Returns an iterator over the elements in the set, in the order of insertion.












    }
}
