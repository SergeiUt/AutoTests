package practice_4.homeWork4.solvers;

import java.util.Scanner;

public class ForTaskSolver {
    public static void main(String[] args) {
//        divideByThree(); // 1
//        sumNumbers(); // 2
//        multiplyTable(); // 3
//        isPrimeNumber(); // 4
        printNumbers();

    }

    public static void divideByThree() {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void sumNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        System.out.println("Сумма чисел от 1 до " + number + " равна " + sum);

    }

    public static void multiplyTable() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число от 1 до 10: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }

    }

    public static void isPrimeNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");

        int number = scanner.nextInt();

        boolean isPrime = true;

        if (number < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                }
            }
        }

        if (isPrime) {
            System.out.println("Число простое");
        } else {
            System.out.println("Число не простое");
        }
    }

    public static void printNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }





}
