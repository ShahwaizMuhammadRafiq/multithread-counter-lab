class Counter {
    private int value = 0;

    // synchronized ensures thread-safety
    public synchronized void increment() {
        value++;
    }

    public int getValue() {
        return value;
    }
}

