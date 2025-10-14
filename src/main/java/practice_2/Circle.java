package practice_2;

public class Circle {
    /*
     * Создайте класс Circle с полем radius. Реализуйте конструктор, геттер и сеттер, методы calculateArea() и
     * calculateCircumference(). В main измените радиус, выведите площадь и длину окружности.
     */
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(8.0);
        circle.setRadius(1.0);
        System.out.println("Площадь круга: " + circle.calculateArea());
        System.out.println("Длина окружности: " + circle.calculateCircumference());
    }


}
