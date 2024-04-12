package collections.list.linkedlist;
import java.util.*;

public class LinkedList1 {
    public static void main(String args[]){

        List<String> al=new LinkedList<String>();
        al.add("Tom");
        al.add("Bob");
        al.add("Messi");
        al.add("Mbappe");

        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
