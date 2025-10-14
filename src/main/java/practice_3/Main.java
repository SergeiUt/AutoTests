package practice_3;

public class Main {
    public static void main(String[] args) {
        System.out.println(Student.studentCount);

        Student petya = new Student(23, "Петя");

        System.out.println(Student.studentCount);

        Student kolya = new Student(20, "Коля");

        System.out.println(Student.studentCount);



    }
}
