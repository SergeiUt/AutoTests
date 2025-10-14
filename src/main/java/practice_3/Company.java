package practice_3;

public class Company {
    /*
     * Создайте класс Company с полями:
     * static String companyName — общее название для всех сотрудников
     * final int employeeID — уникальный идентификатор (нельзя менять)
     * String employeeName — имя сотрудника Реализуйте конструктор, принимающий employeeID и employeeName,
     * статический метод printCompanyName(), геттеры и сеттеры для employeeName. В main: создайте несколько сотрудников,
     * измените companyName и проверьте, что она изменилась для всех. Попробуйте изменить employeeID — должно быть невозможно.
     */
    static String companyName = "Facebook";
    final int employeeID;
    String employeeName;

    public Company(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public static void printCompanyName() {
        System.out.println("Название компании: " + companyName);
    }

    public static void main(String[] args) {
        Company empl1 = new Company(1, "Паша");
        Company empl2 = new Company(2, "Саша");

        printCompanyName();

        companyName = "Meta";

        printCompanyName();

        empl2.setEmployeeName("Даша");
        System.out.println(empl2.getEmployeeName());






    }



}
