package practice_6.task_6;

public class Aquarium {
    private SeaCreature creature;

    public void setCreature(SeaCreature creature) {
        this.creature = creature;
    }

    public void showSeaCreatureBehavior() {
        creature.behavior();
        creature.move();
    }



}
