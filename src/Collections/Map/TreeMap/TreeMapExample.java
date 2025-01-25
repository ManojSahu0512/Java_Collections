package Collections.Map.TreeMap;

//TreeMap in Java
//The TreeMap is a part of the java.util package and implements the Map interface. It is a sorted map that stores key-value pairs in a natural order (ascending order of the keys) or based on a custom comparator provided at map creation. The TreeMap is implemented using a Red-Black Tree, ensuring that the time complexity for operations such as put(), get(), remove(), etc., is O(log n).
//
//Key Features of TreeMap
//Sorted Order:
//
//Keys are stored in their natural order (e.g., ascending for numbers or alphabetical for strings) or based on a custom comparator.
//No Null Keys:
//
//TreeMap does not allow null keys, but it permits null values.
//NavigableMap Interface:
//
//TreeMap implements the NavigableMap interface, which provides methods to navigate the map (e.g., higherKey, lowerKey, floorKey, etc.).
//Efficient Lookups:
//
//All operations (insert, delete, lookup) are O(log n) due to the Red-Black Tree structure.

//Common Methods in TreeMap
//Method	Description
//put(K key, V value)	Inserts a key-value pair into the map.
//get(Object key)	Retrieves the value associated with the specified key.
//remove(Object key)	Removes the mapping for the specified key.
//firstKey()	Returns the first (lowest) key in the map.
//lastKey()	Returns the last (highest) key in the map.
//floorKey(K key)	Returns the greatest key less than or equal to the given key, or null if none.
//ceilingKey(K key)	Returns the smallest key greater than or equal to the given key, or null if none.
//headMap(K toKey, boolean inclusive)	Returns a view of the portion of the map whose keys are less than (or equal to) toKey.
//tailMap(K fromKey, boolean inclusive)	Returns a view of the portion of the map whose keys are greater than (or equal to) fromKey.
//subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive)	Returns a view of a portion of the map.
//keySet()	Returns a Set view of the keys in the map.
//values()	Returns a Collection view of the values in the map.
//entrySet()	Returns a Set view of the mappings in the map.

//Advantages of TreeMap
//Sorted Keys:
//
//Keys are always maintained in sorted order.
//Custom Comparators:
//
//A custom comparator can be used to define the sorting order.
//Efficient Navigation:
//
//Methods like headMap, tailMap, and subMap allow easy navigation within a range of keys.
//Thread-Safe Variants:
//
//Can be made thread-safe by wrapping with Collections.synchronizedMap().
//Disadvantages of TreeMap
//No Null Keys:
//
//Does not allow null keys (unlike HashMap which allows one null key).
//Slower than HashMap:
//
//Operations are O(log n) due to the Red-Black Tree, while HashMap has O(1) for most operations.

//Use Cases for TreeMap
//Sorted Data:
//
//Maintaining data in a sorted order (e.g., phonebook, leaderboard).
//Range Queries:
//
//Efficiently fetching subsets of data using methods like headMap and tailMap.
//Custom Sorting:
//
//Using a custom comparator for specialized sorting requirements.
//Navigation:
//
//Use cases requiring navigation to find keys close to a given key (e.g., floorKey, ceilingKey).
//TreeMap is an excellent choice when you need a Map implementation that maintains its keys in a sorted order and supports efficient navigation for range-based operations.

//TreeMap is an excellent choice when you need a Map implementation that maintains its keys in a sorted order and supports efficient navigation for range-based operations.


import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {


        // Create a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Add key-value pairs
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(4, "Four");
        treeMap.put(2, "Two");

        // Display the TreeMap (keys will be sorted)
        System.out.println("TreeMap: " + treeMap);

        // Access elements
        System.out.println("Value for key 3: " + treeMap.get(3));
        System.out.println("First Key: " + treeMap.firstKey());
        System.out.println("Last Key: " + treeMap.lastKey());

        // Use navigable methods
        System.out.println("Floor Key (<= 3): " + treeMap.floorKey(3));
        System.out.println("Ceiling Key (>= 3): " + treeMap.ceilingKey(3));

        // Iterate through the TreeMap
        for (var entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

    }
}
