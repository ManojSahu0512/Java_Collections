package DSA.Collections.Map.ConcurrentHashMap;

//The ConcurrentHashMap is a thread-safe implementation of the Map interface introduced in Java 1.5 as part of the java.util.concurrent package. It allows concurrent access by multiple threads without compromising performance or consistency.
//

//Key Features of ConcurrentHashMap
//Thread Safety:
//
//Multiple threads can safely access the map without explicit synchronization.
//Uses a fine-grained locking mechanism (lock striping) to improve concurrency and reduce contention.
//No Null Keys/Values:
//
//Unlike HashMap, it does not allow null keys or null values.
//High Performance:
//
//Designed for use in highly concurrent environments.
//Provides better performance than Hashtable by avoiding synchronized blocks for the entire map.
//Partial Iteration Consistency:
//
//Iterators returned by ConcurrentHashMap are weakly consistent:
//They do not throw ConcurrentModificationException.
//They reflect the state of the map at the time of creation and may reflect updates after that.
//Segment-Based Locking:
//
//Divides the map into segments and allows multiple threads to operate on different segments concurrently.


//Key Methods in ConcurrentHashMap
//Method	Description
//put(K key, V value)	Associates the specified value with the specified key.
//get(Object key)	Returns the value associated with the specified key.
//remove(Object key)	Removes the key-value pair for the specified key.
//containsKey(Object key)	Checks if the map contains the specified key.
//containsValue(Object value)	Checks if the map contains the specified value.
//size()	Returns the number of key-value mappings in the map.
//isEmpty()	Checks if the map is empty.
//keySet()	Returns a Set view of the keys in the map.
//values()	Returns a Collection view of the values in the map.
//entrySet()	Returns a Set view of the mappings in the map.
//compute(K key, BiFunction...)	Computes a value for the given key using the specified function.
//computeIfAbsent(K key, Function...)	Computes a value if the key is absent using the specified function.
//computeIfPresent(K key, BiFunction...)	Computes a value if the key is present using the specified function.
//forEach(long parallelismThreshold, BiConsumer...)	Performs the given action for each entry in the map.

//Advantages of ConcurrentHashMap
//High Concurrency:
//
//Allows concurrent read and write operations without locking the entire map.
//No Explicit Synchronization:
//
//Reduces boilerplate code as no explicit synchronized blocks are needed.
//Weakly Consistent Iterators:
//
//Iterators do not block modifications, making them ideal for concurrent use cases.
//Efficient for Large Datasets:
//
//Performance scales better than synchronized collections like Hashtable.


//Use Cases for ConcurrentHashMap
//Multi-threaded Environments:
//
//Suitable for concurrent applications like web servers or multi-threaded caching.
//Dynamic Data:
//
//Use when map data is frequently updated by multiple threads (e.g., real-time dashboards).
//Thread-safe Caches:
//
//Ideal for building caches or registries that need high throughput.
//The ConcurrentHashMap is a powerful and efficient choice for concurrent programming, offering both safety and performance.

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {

        // Creating a ConcurrentHashMap
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        // Adding key-value pairs
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        // Accessing a value
        System.out.println("Value for key 2: " + map.get(2));

        // Checking if a key exists
        System.out.println("Contains key 3? " + map.containsKey(3));
        // Removing a key-value pair
        map.remove(1);
        System.out.println("Map after removing key 1: " + map);

        // Iterating over the map
        System.out.println("Key-Value pairs:");
        map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

        // Computing a value if key is absent
        map.computeIfAbsent(4, k -> "Four");
        System.out.println("Map after computeIfAbsent: " + map);

        // Computing a value if key is present
        map.computeIfPresent(2, (key, val) -> val + " Updated");
        System.out.println("Map after computeIfPresent: " + map);

    }
}
