package designPatterns.structural.adapter;

// Adaptee interface that needs to be adapted
class Adaptee {
    void specificRequest() {
        System.out.println("Specific request from Adaptee");
    }
}
