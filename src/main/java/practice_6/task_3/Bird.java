package practice_6.task_3;

public class Bird implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Птица чирикает");
    }

    @Override
    public void move() {
        System.out.println("Птица летает!");
    }
}
