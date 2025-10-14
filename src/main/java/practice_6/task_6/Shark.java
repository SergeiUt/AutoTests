package practice_6.task_6;

public class Shark implements SeaCreature{
    @Override
    public void behavior() {
        System.out.println("Акула очень агрессивная!!!");
    }

    @Override
    public void move() {
        System.out.println("Акула очень быстро плавает!!!");
    }
}
