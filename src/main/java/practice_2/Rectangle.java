package practice_2;

public class Rectangle {
    /*
     * Создайте класс Rectangle с полями width и height. Реализуйте конструктор, геттеры для ширины и высоты,
     * сеттер только для ширины и метод calculateArea() для расчёта площади. В main создайте прямоугольник,
     * измените ширину и выведите площадь.
     */

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int calculateArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 7);
        rectangle.setWidth(2);
        int area = rectangle.calculateArea();
        System.out.println("Площадь прямоугольника: " + area);

    }


}
