package reflection;

public class MyClass {
    private static int id;
    private String name;

    public void myMethod() {
        System.out.println("My Method");
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.myMethod();
    }
}
