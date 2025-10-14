package practice_2;

public class Car {
    /*
     Создайте класс Car с полями brand (строка) и year (целое число). Реализуйте конструктор с двумя параметрами,
      геттеры и сеттеры для обоих полей, метод print(), выводящий информацию о марке и годе выпуска.
      В main создайте объект, установите значения через конструктор, измените год через сеттер, выведите информацию.
     */

    private String brand;
    private int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void print() {
        System.out.println("Марка автомобиля: " + brand + ". Год выпуска автомобиля: " + year);
    }

    public static void main(String[] args) {
        Car car = new Car("Volvo", 2014);
        car.setYear(2019);
        car.print();
    }
}
