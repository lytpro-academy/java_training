package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * A map contains values on the basis of key, i.e. key and value pair. Each key and value pair is known as an entry.
 * A Map contains unique keys.
 * A Map is useful if you have to search, update or delete elements on the basis of a key.
 * A Map doesn't allow duplicate keys, but you can have duplicate values. HashMap and LinkedHashMap allow null keys
 * and values, but TreeMap doesn't allow any null key or value.
 *
 * HashMap: Java HashMap class implements the Map interface which allows us to store key and value pair, where keys
 * should be unique. If you try to insert the duplicate key, it will replace the element of the corresponding key.
 * It is easy to perform operations using the key index like updation, deletion, etc. HashMap class is found in
 * the java.util package.
 * HashMap in Java is like the legacy Hashtable class, but it is not synchronized. It allows us to store the null
 * elements as well, but there should be only one null key. Since Java 5, it is denoted as HashMap<K,V>, where K stands
 * for key and V for value. It inherits the AbstractMap class and implements the Map interface.
 *
 * Key Notes:
 * Java HashMap contains values based on the key.
 * Java HashMap contains only unique keys.
 * Java HashMap may have one null key and multiple null values.
 * Java HashMap is non synchronized.
 * Java HashMap maintains no order.
 * The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.
 * */
public class MapExample {
    public static void main(String[] args) {
        //A Map can't be traversed, so you need to convert it into Set using keySet() or entrySet() method.
        Map<Integer,String> map1=new HashMap();
        map1.put(100,"Amit");
        map1.put(101,"Vijay");
        map1.put(102,"Rahul");
        map1.put(100,"Ravi");

        map1.get(105);

        //Elements can traverse in any order
        for(Map.Entry m:map1.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
