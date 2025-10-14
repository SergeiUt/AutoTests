package practice_6.task_0;

public class Zoo {
    private Animal animal;

    public void setAnimal(Animal animal) {
        this.animal = animal;

    }

    public void showAnimalBehavior() {
        animal.makeSound();
        animal.move();
        System.out.println();

    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Animal animal1 = new Bird();
        zoo.setAnimal(animal1);
        zoo.showAnimalBehavior();
        Animal animal2 = new Elephant();
        zoo.setAnimal(animal2);
        zoo.showAnimalBehavior();
    }
}
