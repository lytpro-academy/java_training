package garbagecollection;

public class FinalizeExample {
    static class MyObject {
        // Finalize method to perform cleanup
        @Override
        protected void finalize() throws Throwable {
            System.out.println("Object is being finalized");
            // Perform cleanup or release resources here
            super.finalize();
        }
    }

    public static void main(String[] args) {
        MyObject obj1 = new MyObject(); // Object 1
        MyObject obj2 = new MyObject(); // Object 2

        // Assigning obj1 reference to obj2
        obj2 = obj1; // Now, obj2 refers to the same object as obj1

        // Making obj1 eligible for garbage collection
        obj1 = null; // Removing the reference to the original object

        // Garbage collection may occur at this point
        // The unreferenced object previously referred to by obj1 is now eligible for garbage collection
    }
}
