package practice_11;

public class TwoThreads {
    public static void main(String[] args) {
        Runnable programA = () -> {
            for (int i=0; i < 5; i++) {
                System.out.println("Привет из потока A!");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Поток A был прерван");;
                }
            }
        };

        Runnable programB = () -> {
            for (int i=0; i < 5; i++) {
                System.out.println("Привет из потока B!");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Поток B был прерван");;
                }
            }
        };

        Thread threadA = new Thread(programA);
        Thread threadB = new Thread(programB);
        threadA.start();
        threadB.start();
    }

}

