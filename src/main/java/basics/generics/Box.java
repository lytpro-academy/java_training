package basics.generics;

/**
 * We define a generic class Box<T> that can hold a value of any type T.
 * We create instances of Box for Integer and String types, demonstrating how the same generic class can be used with
 * different data types.
 * We also use generics with the List interface to create a list of String objects. This allows us to ensure type
 * safety and avoid runtime errors when working with the list.
 * */
class Box<T> {
    private T value;

    // Constructor
    public Box(T value) {
        this.value = value;
    }

    // Getter and setter
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
