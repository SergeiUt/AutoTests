package practice_6.task_3;

public class Zoo {

    private Animal animal;

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void showAnimalBehavior() {
        animal.makeSound();
        animal.move();
    }
}
