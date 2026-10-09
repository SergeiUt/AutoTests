package practice_11;

public class Counter {
    private int count = 0;

    public int getCount() {
        return count;
    }

    public synchronized void increment() {
        count++;
    }

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Runnable program = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };

        Thread thread1 = new Thread(program);
        Thread thread2 = new Thread(program);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Значение счетчика: " + counter.getCount());

    }


}
