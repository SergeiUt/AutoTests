package practice_4.homeWork4.solvers;

import java.util.Scanner;

public class WhileTaskSolver {
    public static void main(String[] args) {
//        printFactorial(); // 1
//        printAllEvenNumbers(); // 2
        reverse();


    }

    public static void printFactorial() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        int result = 1;
        int i = 1;

        while (i <= number) {
            result *= i;
            i++;
        }
        System.out.println("Факториал числа " + number + " равен " + result);
    }

    public static void printAllEvenNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        int i = 1;

        while (i <= number) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static void reverse() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите положительное число: ");
        int number = scanner.nextInt();

        while (number >= 1) {
            System.out.println(number);
            number--;
        }


    }


}
