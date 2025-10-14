package practice_6.task_3;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Animal animal1 = new Bird();
        Animal animal2 = new Elephant();

        zoo.setAnimal(animal1);
        zoo.showAnimalBehavior();
        zoo.setAnimal(animal2);
        zoo.showAnimalBehavior();



    }
}
