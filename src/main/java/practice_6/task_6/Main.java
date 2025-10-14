package practice_6.task_6;

public class Main {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();

//        SeaCreature creature = new Shark();
        SeaCreature creature = new Starfish();

        aquarium.setCreature(creature);
        aquarium.showSeaCreatureBehavior();

    }
}
