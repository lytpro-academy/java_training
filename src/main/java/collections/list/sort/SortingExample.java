package collections.list.sort;
import java.util.*;

public class SortingExample {

    public static void main(String args[]){
        //Creating a list of fruits
        List<String> list1=new ArrayList();
        list1.add("Mango"); // 0
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Grapes"); // 3
        //Sorting the list
        Collections.sort(list1);
        //Traversing list through the for-each loop
        for(String fruit:list1)
            System.out.println(fruit);

        System.out.println("Sorting numbers...");
        //Creating a list of numbers
        List<Integer> list2=new ArrayList<Integer>();
        list2.add(21);
        list2.add(11);
        list2.add(51);
        list2.add(1);
        //Sorting the list
        Collections.sort(list2);
        //Traversing list through the for-each loop
        for(Integer number:list2)
            System.out.println(number);
    }
}
