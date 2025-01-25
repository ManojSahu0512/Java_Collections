package Collections.Map.HashTable;

//A Hashtable is a legacy collection class in Java that implements the Map interface and stores data in key-value pairs. It is part of the java.util package and was one of the original collection classes introduced in Java.
//Key Features of Hashtable
//Thread-Safe:
//
//All methods in Hashtable are synchronized, making it thread-safe for use in multi-threaded environments.
//Because of synchronization, its performance is slower compared to non-synchronized alternatives like HashMap.
//No null Keys or Values:
//
//Unlike HashMap, Hashtable does not allow null as a key or value.
//Based on Hashing:
//
//It uses a hash table to store key-value pairs. The keys are hashed to compute an index where the value is stored.
//Legacy Class:
//
//It has been part of Java since version 1.0, and while still functional, it has largely been replaced by HashMap and ConcurrentHashMap in modern applications.



//Constructors
//Hashtable(): Creates a default, empty Hashtable.
//
//Hashtable(int initialCapacity): Creates a Hashtable with the specified initial capacity.
//
//Hashtable(int initialCapacity, float loadFactor): Creates a Hashtable with the specified initial capacity and load factor.
//
//Hashtable(Map<? extends K, ? extends V> t): Creates a Hashtable with mappings from the specified map.

import java.util.Hashtable;

//Common Methods
//Below is a list of commonly used methods in Hashtable:
//
//Method	Description
//put(K key, V value)	Adds a key-value pair to the Hashtable.
//get(Object key)	Retrieves the value associated with the specified key.
//remove(Object key)	Removes the key-value pair for the specified key.
//containsKey(Object key)	Checks if the Hashtable contains the specified key.
//containsValue(Object value)	Checks if the Hashtable contains the specified value.
//isEmpty()	Checks if the Hashtable is empty.
//size()	Returns the number of key-value pairs in the Hashtable.
//clear()	Removes all key-value pairs from the Hashtable.
//keys()	Returns an enumeration of the keys in the Hashtable.
//values()	Returns a collection of all the values in the Hashtable.
//clone()	Creates a shallow copy of the Hashtable.
//Example Code


// Advantages
//Thread-safe and synchronized.
//Simple implementation for storing and retrieving data using keys.
//
//Disadvantages
//Slower than HashMap because of synchronization.
//Does not allow null keys or values.
//Legacy class; alternatives like HashMap and ConcurrentHashMap are preferred in modern development.

//Use Cases
//Useful in multi-threaded applications where thread-safety is required.
//When null keys or values are not expected or allowed.

public class HashtableExample {
    public static void main(String[] args) {

        Hashtable<Integer, String> hashtable = new Hashtable<>();

        // Add key-value pairs
        hashtable.put(1, "Apple");
        hashtable.put(2, "Banana");
        hashtable.put(3, "Cherry");

        // Get value by key
        System.out.println("Value for key 2: " + hashtable.get(2));

        // Check if a key exists
        System.out.println("Contains key 3? " + hashtable.containsKey(3));

        // Check if a value exists
        System.out.println("Contains value 'Apple'? " + hashtable.containsValue("Apple"));

        // Remove a key-value pair
        hashtable.remove(1);

        // Iterate through keys and values
        hashtable.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Value: " + value);
        });

        // Check size
        System.out.println("Size of Hashtable: " + hashtable.size());

    }
}
