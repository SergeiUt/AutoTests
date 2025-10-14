package practice_3;

public class Person {
    /*
     * Создайте класс Person с полями:
     * private String firstName
     * private String lastName
     * private final String ssn — номер социального страхования Реализуйте конструктор для всех трёх полей,
     * геттеры для всех полей, сеттеры только для firstName и lastName, метод printPersonInfo() — выводит:
     * "Имя: Иван, Фамилия: Иванов, SSN: 123-45-6789". В main: создайте несколько объектов, измените имя у одного
     * и выведите информацию.
     */
    private String firstName;
    private String lastName;
    private final String ssn;

    public Person(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void printPersonInfo() {
        System.out.println("Имя: " + firstName + " Фамилия: " + lastName + " Hомер социального страхования: " + ssn);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Пётр;", "Королёв;", "454-45-7889");
        Person person2 = new Person("Иван;", "Круглов;", "478-45-7289");
        Person person3 = new Person("Алексей;", "Иванов;", "994-45-7479");

        person1.setFirstName("Андрей;");
        person1.printPersonInfo();
        person2.printPersonInfo();
        person3.printPersonInfo();

    }









}
