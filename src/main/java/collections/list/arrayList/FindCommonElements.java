package collections.list.arrayList;

import java.util.ArrayList;

public class FindCommonElements {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        // Make a copy of list1
        ArrayList<Integer> common = new ArrayList<>(list1);

        // Retain only those elements in the copy that are present in list2
        common.retainAll(list2);

        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);
        System.out.println("Common elements: " + common);
    }
}
