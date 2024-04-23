package designPatterns.structural.adapter;


/**
 * The Adapter pattern allows incompatible interfaces to work together. It acts as a bridge between two incompatible
 * interfaces by converting the interface of a class into another interface that a client expects.
 *
 * The Adapter pattern is useful when integrating new functionality into existing systems, especially when the existing
 * system has a different interface than the one required by the client. It's commonly used in libraries or APIs to
 * provide compatibility with different versions or standards.
 * */
class Adapter implements Target {
    private Adaptee adaptee;

    Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
