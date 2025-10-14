package practice_4.homeWork4.solvers;

import java.util.Scanner;

public class BreakTaskSolver {
    public static void main(String[] args) {
//        sumPositiveNumbers(); // 1
//        printNumbersWithoutDivideByThree();// 2
//        printOnlyPositiveNumbers(); //3
        inputStop();


    }

    public static void sumPositiveNumbers() {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number;

        while (true) {
            System.out.println("Введите число: ");
            number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            sum += number;

        }

        System.out.println("Сумма всех введенных положительных чисел равна " + sum);

    }

    public static void printNumbersWithoutDivideByThree() {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void printOnlyPositiveNumbers() {
        Scanner scanner = new Scanner(System.in);

        int number;

        while (true) {
            System.out.println("Введите любое число. Для завершения нажмите 0");
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            if (number < 0) {
                continue;
            }
            System.out.println("Введенное число " + number + " положительное");
        }
    }

    public static void inputStop() {
        Scanner scanner = new Scanner(System.in);

        String exit = "stop";

        while (true) {
            System.out.println("Введите команду! Для завершения программы введите stop");
            String command = scanner.nextLine();
            if (command.equals(exit)) {
                break;
            }
        }
        System.out.println("Программа успешно завершена!!!");
    }






}
