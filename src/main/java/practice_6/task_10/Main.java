package practice_6.task_10;

public class Main {
    public static void main(String[] args) {
        Museum museum = new Museum();

//        Exhibit exhibit = new Manuscript();
        Exhibit exhibit = new Sculpture();

        museum.setExhibit(exhibit);
        museum.describeExhibit();


    }
}
