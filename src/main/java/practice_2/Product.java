package practice_2;

public class Product {
    /*
     * Создайте класс Product с полями name и price. Реализуйте конструктор, геттеры, сеттер для цены, метод
     * applyDiscount(discount) для применения скидки, и метод printInfo(), выводящий информацию о товаре и цене.
     * В main измените цену, примените скидку и выведите цену.
     */
    private final String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void applyDiscount(double discount) {
        price -= (discount/100) * price;
    }

    public void printInfo() {
        System.out.println("Товар: " + name + ". Цена: " + price);
    }


    public static void main(String[] args) {
        Product product = new Product("Milk", 100);
        product.setPrice(130);
        product.applyDiscount(50.0);
        product.printInfo();

    }

}
