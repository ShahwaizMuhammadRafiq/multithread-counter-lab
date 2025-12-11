public class CounterDemo {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        // Thread 1 increments counter
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
            System.out.println("Thread 1 completed.");
        });

        // Thread 2 increments counter
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
            System.out.println("Thread 2 completed.");
        });

        // start both threads
        t1.start();
        t2.start();

        // wait for both threads (join)
        t1.join();
        t2.join();

        // final result
        System.out.println("Final Counter Value: " + counter.getValue());
    }
}