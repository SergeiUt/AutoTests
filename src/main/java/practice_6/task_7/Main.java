package practice_6.task_7;

public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm();

//        Animal animal = new Cow();
        Animal animal = new Chicken();

        farm.setAnimal(animal);
        farm.showAnimalBehavior();

    }

}
