package map;
import java.util.*;

/***
 * Java LinkedHashMap class is Hashtable and Linked list implementation of the Map interface, with predictable
 * iteration order. It inherits HashMap class and implements the Map interface.
 *
 * Key Notes:
 * Java LinkedHashMap contains values based on the key.
 * Java LinkedHashMap contains unique elements.
 * Java LinkedHashMap may have one null key and multiple null values.
 * Java LinkedHashMap is non synchronized.
 * Java LinkedHashMap maintains insertion order.
 * The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.
 */
public class LinkedHashMapExample {
    public static void main(String args[]){

        Map<Integer,String> hm=new LinkedHashMap();

        hm.put(100,"Amit");
        hm.put(101,"Vijay");
        hm.put(102,"Rahul");

        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
