package practice_6.task_7;

public class Farm {
    private Animal animal;

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void showAnimalBehavior() {
        animal.makeFunction();
        animal.care();
    }

}
