package Map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

//The LinkedHashMap is a part of the Java Collections Framework, extending the HashMap class. It is used to store key-value pairs while maintaining the insertion order of elements. This makes it useful when you need predictable iteration order.

//Key Features of LinkedHashMap
//Maintains Insertion Order: Unlike HashMap, it keeps track of the order in which entries were added.
//Performance: Comparable to HashMap for most operations (O(1) for insertion, deletion, and lookup).
//Allows Null:
//One null key is allowed.
//Multiple null values are allowed.
//Iteration Order:
//Default: Insertion order.
//Can be configured to access order (LRU - Least Recently Used) with the accessOrder parameter.
//Not Thread-Safe: If thread-safety is required, you must synchronize externally or use Collections.synchronizedMap.
//Constructors of LinkedHashMap
//LinkedHashMap()
//Creates an empty LinkedHashMap with default initial capacity and load factor.
//
//LinkedHashMap(int initialCapacity)
//Creates a LinkedHashMap with the specified initial capacity.
//
//LinkedHashMap(int initialCapacity, float loadFactor)
//Creates a LinkedHashMap with the specified initial capacity and load factor.
//
//LinkedHashMap(int initialCapacity, float loadFactor, boolean accessOrder)
//Creates a LinkedHashMap with the specified initial capacity, load factor, and ordering mode:
//
//true: Access-order (Least Recently Used - LRU).
//false: Insertion-order (default).
//LinkedHashMap(Map<? extends K, ? extends V> m)
//Creates a LinkedHashMap with the same mappings as the given map.
//
//Common Methods in LinkedHashMap
//Basic Operations
//V put(K key, V value): Associates the specified value with the specified key.
//V get(Object key): Returns the value associated with the specified key.
//boolean containsKey(Object key): Checks if the map contains the specified key.
//boolean containsValue(Object value): Checks if the map contains the specified value.
//V remove(Object key): Removes the mapping for the specified key.
//void clear(): Removes all mappings.
//int size(): Returns the number of key-value mappings.
//Iteration Support
//Set<K> keySet(): Returns a set view of the keys.
//Collection<V> values(): Returns a collection view of the values.
//Set<Map.Entry<K, V>> entrySet(): Returns a set view of the key-value mappings.
//Custom Behavior
//protected boolean removeEldestEntry(Map.Entry<K, V> eldest): Determines whether the eldest entry should be removed. Override this method for custom eviction policies (used in LRU caches).

//When to Use LinkedHashMap
//When insertion order is essential (e.g., logs, user actions).
//When creating an LRU (Least Recently Used) cache.
//When maintaining predictable iteration order is required.

public class LinkedHashMapExample {
    public static void main(String[] args) {

        Map<String,Integer> nameRollNumber= new LinkedHashMap<>();

        nameRollNumber.put("One",1);
        nameRollNumber.put("two",2);
        nameRollNumber.put("Three",3);
        nameRollNumber.put("Four",4);
        nameRollNumber.put("Five",5);
        nameRollNumber.put("Six",6);
        System.out.println(nameRollNumber); //{One=1, two=2, Three=3, Four=4, Five=5, Six=6}

        //
        for (String key:nameRollNumber.keySet()){
            System.out.println("key is "+nameRollNumber.get(key));

        }
        //key is 1
        //key is 2
        //key is 3
        //key is 4
        //key is 5
        //key is 6


    }





}
