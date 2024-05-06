package basics;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // toString() method
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    // equals() method
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Person person = (Person) obj;
        return age == person.age && Objects.equals(name, person.name);
    }

    // hashCode() method
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    // getClass() method
    public void printClassName() {
        System.out.println("Class of this object: " + getClass().getName());
    }

    // clone() method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Person(this.name, this.age);
    }

    // finalize() method
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalizing Person object");
        super.finalize();
    }

    // wait() method
    public synchronized void customWait() throws InterruptedException {
        wait();
    }

    // notify() method
    public synchronized void customNotify() {
        notify();
    }

    // notifyAll() method
    public synchronized void customNotifyAll() {
        notifyAll();
    }

    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);
        Person person3 = new Person("Alice", 30);

        // toString() demonstration
        System.out.println(person1);  // Output: Person{name='Alice', age=30}

        // equals() demonstration
        System.out.println(person1.equals(person2));  // Output: false
        System.out.println(person1.equals(person3));  // Output: true

        // hashCode() demonstration
        System.out.println(person1.hashCode());  // Output: Some hash code

        // getClass() demonstration
        person1.printClassName();  // Output: Class of this object: Person

        // clone() demonstration
        Person clonedPerson = (Person) person1.clone();
        System.out.println("Cloned Person: " + clonedPerson);  // Output: Cloned Person: Person{name='Alice', age=30}

        // finalize() demonstration
        person1 = null;
        System.gc();  // Request garbage collection

        // wait(), notify(), and notifyAll() demonstration
        Thread thread1 = new Thread(() -> {
            try {
                person2.customWait();
                System.out.println("Thread 1 woke up");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            person2.customNotify();
        });

        thread1.start();
        Thread.sleep(1000);  // Wait for thread1 to start waiting
        thread2.start();  // Notify thread1 to wake up
    }
}
