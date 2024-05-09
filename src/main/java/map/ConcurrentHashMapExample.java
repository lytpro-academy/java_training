package map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> synchronizedMap = Collections.synchronizedMap(map);

        //ConcurrentHashMap allows concurrent read operations with thread-safe write operations.
        // ConcurrentHashMap can be created and used as follows:
        Map<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
        // insert into map
        concurrentHashMap.put("Key", 1);
        // get from map
        int value = concurrentHashMap.get("Key");

        //Remember, iteration over a Synchronized HashMap (like any other synchronized collection) must happen
        // within a synchronized block to avoid inconsistent results, unless the caller can guarantee that no other
        // thread will access the map concurrently.

        synchronized (concurrentHashMap) {
            // Get an Iterator object for HashMap
            Iterator<String> iterator = concurrentHashMap.keySet().iterator();

            // Display each element in synchronized HashMap
            while (iterator.hasNext()) {
                String key = iterator.next();
                System.out.println("Key : "+ key + " and Value : "+ concurrentHashMap.get(key));
            }
        }

        //ConcurrentHashMap provides relatively high concurrency and avoids ConcurrentModificationException issues.
        // It's generally preferable over using a synchronized HashMap.
    }

}
