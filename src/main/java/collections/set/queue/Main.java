package collections.set.queue;

import java.util.*;

/**
 *
 * Java provides the Queue interface for handling queue data structure. The Queue interface inherits the Collection
 * interface and provides a set of methods.
 * Some of the commonly used methods include:
 * boolean add(object): This method is used to add an element at the tail of the queue. Returns true if the element
 * is added successfully.
 * boolean offer(object): This method is used to insert the element at the tail of the queue. It's preferred over the
 * add method since it doesn't throw an exception when the capacity of the queue is full.
 * Object remove(): This method removes and returns the head of the queue. Throws an exception if the queue is empty.
 * Object poll(): This method removes and returns the head of the queue. It returns null if the queue is empty.
 * Object peek(): This method is used to retrieves, but does not remove, the head of this queue, or returns null if
 * this queue is empty.
 */
public class Main {
    public static void main(String args[]) {
        // Create and initialize a Queue using a LinkedList
        Queue<String> queue = new LinkedList<>();

        // Adding new elements to the Queue (The Enqueue operation)
        queue.add("John");
        queue.add("Jim");
        queue.add("Jane");

        System.out.println("Queue: " + queue);

        // Removing an element from the Queue using poll()
        // The Dequeue operation
        String name = queue.poll();
        System.out.println("Removed from Queue: " + name + "\nNew Queue: " + queue);

        // Getting the element at the front of the
        // Queue without removing it using element()
        name = queue.element();
        System.out.println("Element at front of the Queue: " + name);
    }
}