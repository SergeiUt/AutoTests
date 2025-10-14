package practice_6.task_5;

public class Drink implements Dish{
    private int volume;

    public Drink(int volume) {
        this.volume = volume;
    }

    @Override
    public void description() {
        System.out.println("Напиток, объём " + volume + " мл");
    }
}
