package practice_6.task_4;

public class Dog implements Pet{
    @Override
    public void feed() {
        System.out.println("Моя собака ест только сухой корм");
    }

    @Override
    public void move() {
        System.out.println("Моя собака очень любит гулять");
    }
}
