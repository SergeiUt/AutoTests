package practice_6.task_10;

public class Museum {
    private Exhibit exhibit;

    public void setExhibit(Exhibit exhibit) {
        this.exhibit = exhibit;
    }

    public void describeExhibit() {
        exhibit.tellHistoryAndCare();
    }



}
