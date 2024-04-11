package collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("TOm");
        list.add("Bob");
        list.add(13);
        list.add(true);
        list.add(false);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }

        List<String> list1 = new ArrayList();
        list1.add("Tom");
        list1.add("Tom");
    }

}
