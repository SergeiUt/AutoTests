package practice_1;

public class MathOperations {
    /* 1.
     * Создайте класс MathOperations с методами:
     * add(int x, int y) — возвращает сумму двух чисел
     * subtract(int x, int y) — разницу
     * multiply(int x, int y) — произведение
     * divide(int x, int y) — результат деления в double
     * В main вызовите каждый метод с произвольными числами и выведите результат.
     */
    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }
    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(int x, int y) {
        return (double) x / y;
    }


    /* 2.
     * Создайте метод findMax(int a, int b), который возвращает большее из двух чисел.
     * Вызовите метод в main и выведите результат.
     */

    public static int findMax(int a, int b) {
        return Math.max(a, b);
    }

    /* 3.
     * Создайте метод difference(int x, int y), который возвращает модуль разности двух чисел.
     * Проверьте метод в main.
     */

    public static int difference(int a, int b) {
        return Math.abs(a - b);
    }

    /* 4.
     * Создайте два метода:
     * squareArea(int side) — возвращает площадь квадрата
     * squarePerimeter(int side) — возвращает периметр
     * Вызовите оба метода в main с примером.
     */

    public static int squareArea(int side) {
        return side * side;
    }

    public static int squarePerimeter(int side) {
        return 4 * side;
    }

    /* 5.
     * Создайте метод convertSecondsToMinutes(int seconds), который возвращает количество минут (целых или дробных).
     * Вызовите метод в main и выведите результат.
     */

    public static double convertSecondsToMinutes(int seconds) {
        return (double) seconds / 60;
    }

    /* 6.
     * Создайте метод averageSpeed(double distance, double time), который возвращает среднюю скорость (distance / time).
     * Вызовите метод с разными значениями.
     */

    public static double averageSpeed(double distance, double time) {

        if (time == 0) {
            return 0.000000;
        } else {
            return distance / time;

        }

    }

    /* 7.
     * Создайте метод findHypotenuse(double a, double b) для вычисления гипотенузы по теореме Пифагора:
     * √(a² + b²)
     * Вызовите метод с несколькими наборами чисел.
     */

    public static double findHypotenuse(double a, double b) {
        return Math.sqrt((a * a) + (b * b));
    }


    /* 8.
     * Создайте метод circleCircumference(double radius), который возвращает длину окружности по формуле 2πr.
     * Проверьте работу на нескольких значениях.
     *
     */

    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    /* 9.
     * Создайте метод calculatePercentage(double total, double part) — возвращает, какой процент от общего составляет часть.
     * Пример: 25 из 200 → 12.5%
     *
     */

    public static double calculatePercentage(double total, double part) {
        if (total != 0) {
            return (part / total) * 100;
        }
        return 0;
    }

    /* 10
     * Создайте два метода:
     * celsiusToFahrenheit(double c) — перевод в Фаренгейты: C × 9 / 5 + 32
     * fahrenheitToCelsius(double f) — перевод в Цельсий: (F − 32) × 5 / 9
     * Проверьте оба метода в main.
     *
     */

    public static double celsiusToFahrenheit(double c) {
        return c * ((double) 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * ((double) 5 / 9);
    }

    public static void swap(int a, int b) {
        System.out.println("Число a: " + a);
        System.out.println("Число b: " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Число a теперь: " + a);
        System.out.println("Число b теперь: " + b);
    }




    public static void main(String[] args) {
//        int add1 = add(4,6);
//        int sub1 = subtract(45,34);
//        int mul1 = multiply(4,55);
//        double div1 = divide(65, 34);
//        int findMax1 = findMax(34,56);
//        int diff1 = difference(31,120);
//        int square = squareArea(7);
//        int perimeter = squarePerimeter(7);
//        double secondsToMinutes = convertSecondsToMinutes(76);
//        double speedAvg1 = averageSpeed(120, 45);
//        double speedAvg2 = averageSpeed(1234, 12);
//        double hypotenuse1 = findHypotenuse(3, 4);
//        double hypotenuse2 = findHypotenuse(45, 23);
//        double circle1 = circleCircumference(0);
//        double circle2 = circleCircumference(23);
//        double circle3 = circleCircumference(45645);
//        double calcPercentage1 = calculatePercentage(200, 25);
//        double calcPercentage2 = calculatePercentage(0, 25);
//        double celToFar = celsiusToFahrenheit(100);
//        double farToCel = fahrenheitToCelsius(451);
//        swap(5,10);

//        System.out.println(add1);
//        System.out.println(sub1);
//        System.out.println(mul1);
//        System.out.println(div1);
//        System.out.println(findMax1);
//        System.out.println(diff1);
//        System.out.println(square);
//        System.out.println(perimeter);
//        System.out.println(secondsToMinutes);
//        System.out.println(speedAvg1);
//        System.out.println(speedAvg2);
//        System.out.println(hypotenuse1);
//        System.out.println(hypotenuse2);
//        System.out.println(circle1);
//        System.out.println(circle2);
//        System.out.println(circle3);
//        System.out.println(calcPercentage1);
//        System.out.println(calcPercentage2);
//        System.out.println(celToFar);
//        System.out.println(farToCel);
        System.out.println(1234567676%16);
    }

}
