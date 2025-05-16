package Set.TreeSet;

//TreeSet in Java
//The TreeSet is a part of the Java DSA.Collections Framework and implements the NavigableSet interface, which extends the SortedSet interface. It is a collection that stores elements in a sorted and ascending order. Internally, it uses a TreeMap to store elements.

//Key Features of TreeSet

//Sorted Order: Stores elements in their natural order (ascending order) or as defined by a custom Comparator.
//No Duplicates: Ensures that no duplicate elements are stored.
//NavigableSet Methods: Provides methods to navigate the set (like lower(), higher(), floor(), ceiling()).
//Null Handling: Does not allow null elements (throws NullPointerException for any operation involving null).
//Logarithmic Time Complexity: Basic operations such as add, remove, and contains take O(log n) time due to the use of a Red-Black Tree.


//Constructors

//TreeSet(): Creates an empty TreeSet that uses natural ordering of its elements.
//TreeSet(Comparator<? super E> comparator): Creates an empty TreeSet that uses the specified comparator for sorting.
//TreeSet(Collection<? extends E> c): Creates a TreeSet containing all elements from the given collection, sorted in their natural order.
//TreeSet(SortedSet<E> s): Creates a TreeSet with the elements from the specified sorted set.

//Common Methods
//TreeSet inherits methods from NavigableSet, SortedSet, and Set. Some commonly used methods are:
//
//Adding Elements
//boolean add(E e): Adds the specified element to the set if it is not already present.
//Removing Elements
//boolean remove(Object o): Removes the specified element from the set if it exists.
//void clear(): Removes all elements from the set.

//Querying Elements

//boolean contains(Object o): Checks if the set contains the specified element.
//E first(): Returns the first (lowest) element in the set.
//E last(): Returns the last (highest) element in the set.
//int size(): Returns the number of elements in the set.
//boolean isEmpty(): Checks if the set is empty.

//Navigation
//E lower(E e): Returns the greatest element less than the given element.
//E higher(E e): Returns the least element greater than the given element.
//E floor(E e): Returns the greatest element less than or equal to the given element.
//E ceiling(E e): Returns the least element greater than or equal to the given element.
//NavigableSet<E> subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive): Returns a view of a portion of the set.
//Iterator<E> descendingIterator(): Returns an iterator in descending order.

//Subsets
//SortedSet<E> subSet(E fromElement, E toElement): Returns a subset between two elements (inclusive of the first, exclusive of the second).
//SortedSet<E> headSet(E toElement): Returns a subset of elements less than the specified element.
//SortedSet<E> tailSet(E fromElement): Returns a subset of elements greater than or equal to the specified element.

//Use Cases
//Maintaining elements in sorted order.
//Scenarios where quick access to the smallest/largest element is required.
//Implementing range queries (e.g., finding all elements in a given range).

//Advantages
//Automatically sorts elements.
//Provides efficient navigation methods (e.g., lower(), higher()).
//Suitable for range-based operations.

//Disadvantages
//Slower performance compared to HashSet and LinkedHashSet for basic operations.
//Does not allow null elements.

//When to Use TreeSet
//Use TreeSet when:

//You need a collection that is always sorted.
//You need to efficiently perform range queries or navigational operations.
//Duplicates are not allowed, and order matters.

import java.util.TreeSet;

public class TreeSetInteger {
    public static void main(String[] args) {

        TreeSet<Integer> elements=new TreeSet<>();

        elements.add(10);
        elements.add(10);
        elements.add(20);
        elements.add(1);
        //elements.add(null);  //Not Allowed
        System.out.println(elements); //[1,10,20]

        //// Retrieve first and last elements
        System.out.println("First Element: " + elements.first());  //1
        System.out.println("Last Element: " + elements.last());    //20

        elements.add(25);
        elements.add(11);
        elements.add(9);

        // Navigation
        System.out.println("Lower than 15: " + elements.lower(15));
        System.out.println("Higher than 15: " + elements.higher(15));
        System.out.println("Floor of 12: " + elements.floor(12));
        System.out.println("Ceiling of 12: " + elements.ceiling(12));
        //Lower than 15: 11
        //Higher than 15: 20
        //Floor of 12: 11
        //Ceiling of 12: 20

        elements.remove(10);
        System.out.println("After removing 10: " + elements);//After removing 10: [1, 9, 11, 20, 25]

        System.out.println("Subset (5 to 20): " + elements.subSet(5, true, 20, true));
        //Subset (5 to 20): [9, 11, 20]






    }
}
