package practice_10.homework.part1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        // Task 1
        MathOperation add = (a, b) -> a + b;
        MathOperation subtract = (a, b) -> a - b;
        MathOperation multiply = (a, b) -> a * b;
        MathOperation divide = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("На ноль делить нельзя!");
            }
            return a / b;
        };

        System.out.println(add.operate(2,2));
        System.out.println(subtract.operate(24,20));
        System.out.println(multiply.operate(25,2));
        System.out.println(divide.operate(28,2));

        // Task 2
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };
        runnable.run();

        // Task 3
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(2));
        System.out.println(isEven.test(1));

        //Task 4
        Function<String, Integer> stringLength = s -> s.length();
        System.out.println(stringLength.apply("Город"));

        //Task 5
        Consumer<String> printString = str -> System.out.println(str);
        printString.accept("Hello, World!!!");



    }
}
