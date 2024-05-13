package collections.list.linkedlist;
import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1); // 5
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5); // 1

        // Print the original list
        System.out.println("Original LinkedList: " + list);

        // Reverse the LinkedList
        reverseLinkedList(list);

        // Print the reversed list
        System.out.println("Reversed LinkedList: " + list);
    }

    public static void reverseLinkedList(LinkedList<Integer> list) {
        // Fetching the size of the input LinkedList
        int size = list.size();

        // For loop which runs for half the size of the LinkedList.
        // We run this loop only till half the size because we are swapping elements in pairs, one from the front and one from the back.
        for (int i = 0; i < size / 2; i++) {

            // Storing the value at the i-th index.
            // This value will be overridden in the next line so we save it in a temporary variable.
            int temp = list.get(i);  // 1

            // Setting the i-th element with the value of the (size - i - 1)-th element.
            // This effectively moves the (size - i - 1)-th element to the i-th position.
            //       0,     5
            list.set(i, list.get(size - i - 1));

            // Setting the (size - i - 1)-th element with the value stored in the temporary variable.
            // This effectively moves the previously held i-th element to the (size - i - 1)th position.
            //       4 , 1
            list.set(size - i - 1, temp);
        }
        // By this point, we've swapped every element in the first half of the list with its corresponding element in the second half of the list.
        // As a result, the list has been reversed.
    }
}
