package practice_11;

public class VolatileClass {
    private static volatile boolean stop = false;

    public static void main(String[] args) throws InterruptedException {
        Runnable counter = () -> {
            long count = 0;
            while (!stop) {
                count++;
            }
            System.out.println("Значение счетчика count равно : " + count);
        };

        Thread thread = new Thread(counter);
        thread.start();

        Thread.sleep(2000);
        stop = true;

        thread.join();
        System.out.println("Операция завершена");
    }
}
