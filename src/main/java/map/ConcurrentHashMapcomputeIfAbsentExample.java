package map;

import java.util.*;

/**
 * A hash table supporting full concurrency of retrievals and high expected concurrency for updates. This class obeys
 * the same functional specification as Hashtable and includes versions of methods corresponding to each
 * method of Hashtable. However, even though all operations are thread-safe, retrieval operations do not entail
 * locking, and there is not any support for locking the entire table in a way that prevents all access. This class
 * is fully interoperable with Hashtable in programs that rely on its thread safety but not on its synchronization details
 * */
public class ConcurrentHashMapcomputeIfAbsentExample {
    public static void main(String[] args)
    {
        // crete a HashMap and add some values
        HashMap<String, Integer> mapcon
                = new HashMap<>();
        mapcon.put("k1", 100);
        mapcon.put("k2", 200);
        mapcon.put("k3", 300);
        mapcon.put("k4", 400);
        System.out.println("HashMap values :\n " + mapcon.toString());
        mapcon.computeIfAbsent("k5", k -> 200 + 300);
        mapcon.computeIfAbsent("k6", k -> 60 * 10);
        System.out.println("New HashMap after computeIfAbsent :\n "+ mapcon);
    }
}
