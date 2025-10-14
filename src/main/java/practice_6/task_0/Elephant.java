package practice_6.task_0;

public class Elephant implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Ту-у-у-у-рру");
    }

    @Override
    public void move() {
        System.out.println("Слон пошёл");
    }

    @Override
    public String toString() {
        return "Слон";
    }
}
