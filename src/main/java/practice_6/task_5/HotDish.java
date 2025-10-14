package practice_6.task_5;

public class HotDish implements Dish{

    private int temperature;

    public HotDish(int temperature) {
        this.temperature = temperature;
    }


    @Override
    public void description() {
        System.out.println("Горячее блюдо, температура " + temperature + " градусов");
    }
}
