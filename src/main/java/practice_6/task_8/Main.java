package practice_6.task_8;

public class Main {
    public static void main(String[] args) {
        BotanicalGarden garden = new BotanicalGarden();

//        Plant plant = new Orchid();
        Plant plant = new Cactus();

        garden.setPlant(plant);
        garden.carePlant();

    }
}
