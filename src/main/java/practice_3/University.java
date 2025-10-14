package practice_3;

public class University {
    /*
     * Создайте класс University с полями:
     * static String universityName — общее имя университета
     * final int studentID — уникальный ID
     * String studentName Реализуйте конструктор для studentID и studentName, статический метод
     * changeUniversityName(String newName), геттер для studentName, метод printStudentInfo() —
     * выводит имя, ID и университет. В main: создайте 3 студента, измените название университета и выведите данные.
     */

    static String universityName = "Oxford";
    final int studentID;
    String studentName;

    public University(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public static void changeUniversityName(String newName) {
        universityName = newName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void printStudentInfo() {
        System.out.println("Университет: " + universityName + "; Имя студента: " + studentName + "; ID студента: " + studentID);
    }

    public static void main(String[] args) {
        University student1 = new University(1, "Андрей");
        University student2 = new University(2, "Дима");
        University student3 = new University(3, "Сергей");

        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();

        changeUniversityName("МГУ");

        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();

    }

}
