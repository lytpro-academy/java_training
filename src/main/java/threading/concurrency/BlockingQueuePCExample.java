package threading.concurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * A BlockingQueue in Java is a queue that supports blocking operations. It extends the Queue interface and adds
 * methods that wait for the queue to become non-empty when retrieving an element and wait for space to become
 * available in the queue when adding an element. This blocking behavior makes BlockingQueue suitable for implementing
 * producer-consumer scenarios and other multithreaded applications where threads need to communicate and synchronize
 * access to shared data.
 * */
public class BlockingQueuePCExample {

    public static void main(String[] args) {

        BlockingQueue<String> queue=new ArrayBlockingQueue<>(5);
        Producer producer=new Producer(queue);
        Consumer consumer=new Consumer(queue);
        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();

    }

    static class Producer implements Runnable {
        BlockingQueue<String> queue=null;

        public Producer(BlockingQueue queue) {
            super();
            this.queue = queue;
        }

        @Override
        public void run() {

            try {
                System.out.println("Producing element 1");
                queue.put("Element 1");
                Thread.sleep(1000);
                System.out.println("Producing element 2");
                queue.put("Element 2");
                Thread.sleep(1000);
                System.out.println("Producing element 3");
                queue.put("Element 3");
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }

    static class Consumer implements Runnable {
        BlockingQueue<String> queue=null;

        public Consumer(BlockingQueue queue) {
            super();
            this.queue = queue;
        }

        @Override
        public void run() {
            while(true)
            {
                try {
                    System.out.println("Consumed "+queue.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
