package practice_2;

public class Teacher {
    /*
     * Создайте класс Teacher с полями name и subject. Реализуйте конструктор, геттеры и сеттеры, и метод printInfo(),
     * выводящий информацию о учителе и предмете. В main измените предмет и выведите обновлённую информацию.
     */
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void printInfo() {
        System.out.println("Учитель: " + name + " Предмет: " + subject);
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Дмитрий;", "Химия");
        teacher.setSubject("Физика");
        teacher.printInfo();
    }


}
