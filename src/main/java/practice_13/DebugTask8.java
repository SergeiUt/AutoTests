package practice_13;

import static java.lang.Math.round;

/**
 * Код должен сравнить два числа, но почему-то результат не соответствует ожиданиям.
 */


public class DebugTask8 {
    public static void main(String[] args) {
        double a = 0.1 * 3;
        double b = 0.3;
        double t = 0.0000000000000001;
        if (Math.abs(a-b) < t) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}