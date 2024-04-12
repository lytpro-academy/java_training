package collections.set.treeset;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String args[]){
        //Creating and adding elements
        Set<String> al=new TreeSet();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        //Traversing elements
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
