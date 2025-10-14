package practice_6.task_9;

public class AmusementPark {
    private Attraction attraction;

    public void setAttraction(Attraction attraction) {
        this.attraction = attraction;
    }

    public void describeAttraction() {
        attraction.service();
    }

}
