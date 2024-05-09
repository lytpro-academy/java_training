package collections;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorExample {

    public static void main(String[] args) {
        List<Integer> listOne = new ArrayList<>(Arrays.asList(1, 2, 3));
        Iterator<Integer> itOne = listOne.iterator();

        /**
         * Fail-Fast Iterators: Fail-fast iterators are those which throw a ConcurrentModificationException if the
         * collection is modified while an iteration over it is in progress, excluding the iterator's own remove method.
         * They fail quickly and cleanly (hence, "fail-fast"), rather attempting to proceed in an unpredictable state.
         * Fail-fast behavior is seen in iterators of collections like ArrayList, HashSet, HashMap, etc.
         * from Java's Collections Framework.
         * */
       try {
           while(itOne.hasNext()){
               System.out.println(itOne.next());
               listOne.add(4);  // Concurrent Modification. Will throw ConcurrentModificationException
           }
        } catch (ConcurrentModificationException ex) {
           ex.printStackTrace();
        }

        /**
         * Fail-Safe Iterators: Fail-safe iterators are those which do not throw a ConcurrentModificationException if
         * the collection is modified while an iteration over it is in progress. This is because they work on a clone
         * of the collection, not on the original collection. So the original collection remains structurally unchanged.
         * Fail-safe behavior is seen in iterators of collections classes like CopyOnWriteArrayList,
         * CopyOnWriteArraySet, ConcurrentHashMap, etc.
         * */
        CopyOnWriteArrayList<Integer> listTwo = new CopyOnWriteArrayList<>(Arrays.asList(1, 2, 3));
        Iterator<Integer> itTwo = listTwo.iterator();

        while(itTwo.hasNext()){
            System.out.println(itTwo.next());
            listTwo.add(4);  // No exception will be thrown
        }
    }

}
