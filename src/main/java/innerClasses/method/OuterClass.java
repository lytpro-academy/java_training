package innerClasses.method;

// These classes are defined within a method of an outer class.
public class OuterClass {
    public void doSomething() {
        class MethodLocalInnerClass {
            public void printText() {
                System.out.println("This is a method-local inner class");
            }
        }

        MethodLocalInnerClass inner = new MethodLocalInnerClass();
        inner.printText();
    }
}
