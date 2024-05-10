package innerClasses.non_static;

// This is a class which is a non-static member of an outer class.
public class OuterClass {
    class InnerClass {
        public void printText() {
            System.out.println("This is an inner class");
        }
    }
}
