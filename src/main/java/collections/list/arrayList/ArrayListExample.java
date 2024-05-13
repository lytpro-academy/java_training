package collections.list.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList();
        list1.add("Tom"); // 0
        list1.add("Bob");
        list1.add("Harry"); // 2
        list1.add("Jack");
        list1.add("Jack"); // 4
        list1.add(null);

        list1.get(2);

        list1.add(6,"Marius");
        list1.size();
        list1.remove(2);
        list1.contains("Bob");

        list1.stream().forEach(System.out::println);

        for(String ls:list1) {
            System.out.println(ls);
        }

        Iterator itr = list1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }


    // index 0   1    2       3   4   5   6
    //       Tom Bob  Harry

}
