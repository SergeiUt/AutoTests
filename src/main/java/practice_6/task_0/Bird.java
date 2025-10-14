package practice_6.task_0;

public class Bird implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Кар-кар");
    }

    @Override
    public void move() {
        System.out.println("Птица полетела!!!");

    }

    @Override
    public String toString() {
        return "Птица";
    }
}
