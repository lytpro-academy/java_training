package collections.set.queue;

import java.util.Stack;

/**
 * This problem is a classic interview question. The idea is to use the first stack for enqueuing and the second stack
 * for dequeuing. For the enqueue operation, we simply push the items to the first stack. For the dequeue operation,
 * we reverse the stack sequence by popping all the elements from the first stack and pushing to the second stack,
 * then popping the top element from the second stack.
 */
public class ImplementQueueWithTwoStacks {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int item) {
        stack1.push(item);
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        moveStack1ToStack2();

        return stack2.pop();
    }

    private void moveStack1ToStack2() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        ImplementQueueWithTwoStacks queue = new ImplementQueueWithTwoStacks();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.dequeue()); // Output: 1
        System.out.println(queue.dequeue()); // Output: 2
        queue.enqueue(4);
        System.out.println(queue.dequeue()); // Output: 3
        System.out.println(queue.dequeue()); // Output: 4
    }
}
