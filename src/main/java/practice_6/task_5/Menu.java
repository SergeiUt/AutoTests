package practice_6.task_5;

public class Menu {
    private Dish dish;

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public void tellAboutDish() {
        dish.description();
    }



}
