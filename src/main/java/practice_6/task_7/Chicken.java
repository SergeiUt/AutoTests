package practice_6.task_7;

public class Chicken implements Animal{
    @Override
    public void makeFunction() {
        System.out.println("Курица несет яйца.");
    }

    @Override
    public void care() {
        System.out.println("Курица требует корм с зерном.");
    }
}
