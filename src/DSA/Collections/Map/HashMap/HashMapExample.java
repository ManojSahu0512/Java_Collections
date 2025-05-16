package Map.HashMap;

//Map Collection in Java
//The Map interface in Java is a part of the Java DSA.Collections Framework and represents a collection of key-value pairs. It is used to store data where each key is unique, and each key maps to exactly one value.

//Key Features of Map
//Key-Value Pairs: Stores data as key-value pairs (Map.Entry objects).
//Unique Keys: Keys must be unique; duplicate keys are not allowed.
//One Value per Key: Each key maps to exactly one value.
//Null Handling:
//Most implementations allow one null key.
//Multiple null values are allowed.

//HashMap	Unordered, allows one null key and multiple null values, fast (O(1) operations).

//Common Methods in Map

//Basic Operations

//V put(K key, V value): Associates the specified value with the specified key in the map.
//V get(Object key): Returns the value to which the specified key is mapped.
//V remove(Object key): Removes the mapping for the specified key.
//boolean containsKey(Object key): Checks if the map contains the specified key.
//boolean containsValue(Object value): Checks if the map contains the specified value.
//int size(): Returns the number of key-value mappings.
//boolean isEmpty(): Checks if the map is empty.
//void clear(): Removes all mappings.
//Key, Value, and Entry Views
//Set<K> keySet(): Returns a set view of the keys in the map.
//Collection<V> values(): Returns a collection view of the values.
//Set<Map.Entry<K, V>> entrySet(): Returns a set view of the key-value mappings.


//Default Methods (Java 8+)

//V getOrDefault(Object key, V defaultValue): Returns the value mapped to the key or a default value if the key is not present.
//void forEach(BiConsumer<? super K, ? super V> action): Performs the specified action for each entry.
//V putIfAbsent(K key, V value): Puts the value if the key is absent.
//boolean remove(Object key, Object value): Removes the entry only if it matches the key-value pair.
//boolean replace(K key, V oldValue, V newValue): Replaces the value for the key only if it matches the old value.

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        Map<String,Integer> nameAgeMapping=new HashMap<>();
        nameAgeMapping.put("Manoj",24);
        nameAgeMapping.put("Vishal",26);
        nameAgeMapping.put("Amit",27);

        //fetching value using key

        System.out.println("Manoj age is:"+nameAgeMapping.get("Manoj")); //Manoj age is:24

        // Iterating over the map
        for(Map.Entry<String,Integer> entry:nameAgeMapping.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        //Amit:27
        //Vishal:26
        //Manoj:24

        //Contains
        boolean isKeyExist=nameAgeMapping.containsKey("Manoj");
        System.out.println(isKeyExist);//true
        boolean isValue=nameAgeMapping.containsValue(24);
        System.out.println(isValue);//true





    }
}
