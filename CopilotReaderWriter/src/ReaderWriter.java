import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReaderWriter {
    private static final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private static String SHARED_RESOURCE = "Hello, World!";

    public static void main(String[] args) {
        Thread reader1 = new Thread(() -> {
            lock.readLock().lock();
            System.out.println("Reader 1 reads: " + SHARED_RESOURCE);
            lock.readLock().unlock();
        });

        Thread reader2 = new Thread(() -> {
            lock.readLock().lock();
            System.out.println("Reader 2 reads: " + SHARED_RESOURCE);
            lock.readLock().unlock();
        });

        Thread writer = new Thread(() -> {
            lock.writeLock().lock();
            SHARED_RESOURCE = "Goodbye, World!";
            System.out.println("Writer writes: " + SHARED_RESOURCE);
            lock.writeLock().unlock();
        });

        reader1.start();
        reader2.start();
        writer.start();
    }
}
