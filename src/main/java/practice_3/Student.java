package practice_3;

public class Student {
    final static int Max_Years = 11;
    static int studentCount;

    static {
        studentCount = 0;
    }

    public int age;
    public String name;

    public Student(int someAge, String someName) {
        this.age = someAge;
        this.name = someName;
        studentCount++;
    }

    public void printInfo() {
        System.out.println("Привет!");
    }

    static void printMaxYears() {
        System.out.println(Max_Years);
    }





}
