package practice_7.restaraunt_manager;

public class Main {
    public static void main(String[] args) {
        RestaurantManager manager = new RestaurantManager();

        manager.addNewOrder("Стейк");
        manager.addNewOrder("Котлета");
        manager.addNewOrder("Суп");

        manager.printOrders();

        manager.getNextOrderForProcess();
        manager.printOrders();

        manager.addNewOrder("Роллы");
        manager.printOrders();
        manager.deleteOrder("Суп");
        manager.printOrders();



    }
}
