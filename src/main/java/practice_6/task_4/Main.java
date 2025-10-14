package practice_6.task_4;

public class Main {
    public static void main(String[] args) {
        PetManagement management = new PetManagement();

//        Pet pet = new Cat();
        Pet pet = new Dog();
        management.setPet(pet);
        management.petCare();

    }
}
