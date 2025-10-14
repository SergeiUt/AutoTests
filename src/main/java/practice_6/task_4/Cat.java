package practice_6.task_4;

public class Cat implements Pet {
    @Override
    public void feed() {
        System.out.println("Моя кошка ест только влажный корм");
    }

    @Override
    public void move() {
        System.out.println("Моя кошка очень любит играть с мячиком");
    }
}
