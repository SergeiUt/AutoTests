package practice_6.task_4;

public class PetManagement {
    private Pet pet;

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void petCare() {
        pet.feed();
        pet.move();
    }

}
