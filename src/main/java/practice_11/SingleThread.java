package practice_11;

public class SingleThread {
    public static void main(String[] args) {
        Runnable program = () -> {
            for (int i=0; i < 5; i++) {
                System.out.println("Привет из потока!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Поток был прерван");;
                }
            }
        };

        Thread thread = new Thread(program);
        thread.start();


    }

}
