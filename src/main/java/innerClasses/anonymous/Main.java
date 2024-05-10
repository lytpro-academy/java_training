package innerClasses.anonymous;

public class Main {
    public static void main(String[] args) {
        AnonymousClass instance = new AnonymousClass() {
            void doSomething() {
                System.out.println("This is an anonymous inner class");
            }
        };

        instance.doSomething();
    }
}
