package practice_6.task_7;

public class Cow implements Animal{
    @Override
    public void makeFunction() {
        System.out.println("Корова даёт молоко.");
    }

    @Override
    public void care() {
        System.out.println("Корова нуждается в выпасе.");
    }
}
