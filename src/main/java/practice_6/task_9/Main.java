package practice_6.task_9;

public class Main {
    public static void main(String[] args) {
        AmusementPark park = new AmusementPark();

//        Attraction attraction = new RollerCoaster();
        Attraction attraction = new Carousel();

        park.setAttraction(attraction);
        park.describeAttraction();

    }
}
