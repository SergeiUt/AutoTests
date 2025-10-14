package practice_2;

public class Point {
    /*
     * Создайте класс Point с координатами x и y. Реализуйте конструктор, геттеры, сеттер только для x, и метод print(),
     * выводящий координаты. В main измените x, выведите новые координаты.
     */
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void print() {
        System.out.println("Координаты: x = " + x + "; y = " + y +";");
    }

    public static void main(String[] args) {
        Point point = new Point(25, 46);
        point.setX(12);
        point.print();
    }


}
