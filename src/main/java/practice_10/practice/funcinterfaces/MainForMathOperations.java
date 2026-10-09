package practice_10.practice.funcinterfaces;

public class MainForMathOperations {
    public static void main(String[] args) {
        MathOperations add = (x, y) -> x + y;
        MathOperations subtract = (x, y) -> x - y;
        MathOperations multiply = (x, y) -> x * y;
        MathOperations divide = (x, y) -> x / y;


        System.out.println(add.apply(2,3));
        System.out.println(subtract.apply(10,5));
        System.out.println(multiply.apply(5,8));
        System.out.println(divide.apply(25,5));
    }
}
