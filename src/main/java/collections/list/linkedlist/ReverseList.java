package collections.list.linkedlist;
import java.util.*;

public class ReverseList {
    public static void main(String args[]){

        LinkedList<String> ll=new LinkedList<String>();
        ll.add("Emeli");
        ll.add("Otoo");
        ll.add("Pojo");
        //Traversing the list of elements in reverse order
        Iterator i=ll.descendingIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

    }
}
