package practice_2;

public class Laptop {
    /*
     * Создайте класс Laptop с полями brand и price. Реализуйте конструктор, геттеры и сеттеры, и метод printInfo(),
     * выводящий информацию о ноутбуке и его цене. В main измените цену и выведите информацию.
     */
    private String brand;
    private double price;

    public Laptop(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printInfo() {
        System.out.println("Ноутбук: " + brand + "; Цена: " + price +" руб.");
    }


    public static void main(String[] args) {
        Laptop laptop = new Laptop("HP", 50000.0);
        laptop.setPrice(45000.0);
        laptop.printInfo();

    }

}
