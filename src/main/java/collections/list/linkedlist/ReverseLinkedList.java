package collections.list.linkedlist;
import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Print the original list
        System.out.println("Original LinkedList: " + list);

        // Reverse the LinkedList
        reverseLinkedList(list);

        // Print the reversed list
        System.out.println("Reversed LinkedList: " + list);
    }

    public static void reverseLinkedList(LinkedList<Integer> list) {
        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            // Swap elements at positions i and size - i - 1
            int temp = list.get(i);
            list.set(i, list.get(size - i - 1));
            list.set(size - i - 1, temp);
        }
    }
}
