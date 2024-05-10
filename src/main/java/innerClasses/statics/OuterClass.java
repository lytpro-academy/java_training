package innerClasses.statics;

//This is a static class defined at the member level.
public class OuterClass {
    static class NestedClass {
        public void printText() {
            System.out.println("This is a static nested class");
        }
    }
}
