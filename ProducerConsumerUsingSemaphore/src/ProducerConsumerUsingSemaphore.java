
import java.util.concurrent.Semaphore;


class ProducerConsumerUsingSemaphore {

    private static final int BUF_SIZE = 5;
    private static int[] buffer = new int[BUF_SIZE];
    private static int add = 0;
    private static int rem = 0;

    private static Semaphore mutex = new Semaphore(1); // Binary semaphore for mutual exclusion
    private static Semaphore empty = new Semaphore(BUF_SIZE); // Represents empty slots
    private static Semaphore full = new Semaphore(0); // Represents filled slots

    private static final int TOTAL_PRODUCE = 25;
    private static final int TOTAL_CONSUME = 25;

    public static void main(String[] args) {
        Thread producerThread = new Thread(ProducerConsumerUsingSemaphore::producer);
        Thread consumerThread = new Thread(ProducerConsumerUsingSemaphore::consumer);

        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Parent quitting");
    }

    public static void producer() {
        for(int i = 0 ; i < TOTAL_PRODUCE; i++) {
            try {
                empty.acquire(); // Wait until there's an empty slot
                mutex.acquire(); // Acquire the lock

                /* Perform the insert operation in a slot */
                buffer[add] = (int) (Math.random() * 100); // Simulated data insertion
                System.out.println("Producer: inserted " + buffer[add]);
                add = (add + 1) % BUF_SIZE;

                mutex.release(); // Release the lock
                full.release(); // Increment 'full'
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void consumer() {
        int consumedCount = 0;
        while (consumedCount < TOTAL_CONSUME) {
            try {
                full.acquire(); // Wait until there's a full slot
                mutex.acquire(); // Acquire the lock

                /* Perform the remove operation from a slot */
                int value = buffer[rem];
                System.out.println("Consumer: consumed " + value);
                rem = (rem + 1) % BUF_SIZE;
                consumedCount++;

                mutex.release(); // Release the lock
                empty.release(); // Increment 'empty'
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
