package garbagecollection;

public class GarbageCollectionExample {

    public static void main(String[] args) {
        // Creating objects
        Object obj1 = new Object(); // Object 1
        Object obj2 = new Object(); // Object 2

        // Assigning obj1 reference to obj2
        obj2 = obj1; // Now, obj2 refers to the same object as obj1

        // Making obj1 eligible for garbage collection
        obj1 = null; // Removing the reference to the original object

        // Garbage collection may occur at this point
        // The unreferenced object previously referred to by obj1 is now eligible for garbage collection
    }

}
