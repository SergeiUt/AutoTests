package practice_6.task_5;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        Dish dish = new HotDish(45);
//        Dish dish = new Drink(350);
        menu.setDish(dish);
        menu.tellAboutDish();

    }
}
