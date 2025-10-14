package practice_2;

public class StudentGroup {
    /*
     * Создайте класс StudentGroup с полями groupName и studentCount. Реализуйте конструктор, геттеры и сеттеры, и
     * метод printInfo(), выводящий информацию о группе и количестве студентов. В main измените число студентов и
     * выведите информацию.
     */

    private String groupName;
    private int studentCount;

    public StudentGroup(String groupName, int studentCount) {
        this.groupName = groupName;
        this.studentCount = studentCount;
    }

    public String getGroupName() {
        return groupName;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public void printInfo() {
        System.out.println("Группа: " + groupName + ". Кол-во студентов: " + studentCount);
    }

    public static void main(String[] args) {
        StudentGroup group = new StudentGroup("Математика", 25);
        group.setStudentCount(30);
        group.printInfo();
    }

}
