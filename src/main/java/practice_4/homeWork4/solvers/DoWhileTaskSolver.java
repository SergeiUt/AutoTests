package practice_4.homeWork4.solvers;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DoWhileTaskSolver {
    public static void main(String[] args) {
//        printPositiveNumber(); //1
//        checkPassword(); //2
//        printNumbers(); //3
//        exitCommand(); //4
        countDigits();


    }

    public static void printPositiveNumber() {
        Scanner scanner = new Scanner(System.in);

        int number;

        do {
            System.out.println("Введите положительное число: ");
            number = scanner.nextInt();
        } while (number <= 0);

        System.out.println("Положительное число: " + number);

    }

    public static void checkPassword() {
        Scanner scanner = new Scanner(System.in);

        String password = "12345";

        String inputPassword;

        do {
            System.out.println("Введите пароль: ");
            inputPassword = scanner.nextLine();
        } while (!inputPassword.equals(password));

        System.out.println("Вы успешно авторизованы!");

    }


    public static void printNumbers() {
        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 10);

    }

    public static void exitCommand() {
        Scanner scanner = new Scanner(System.in);

        String stop = "exit";
        String command;

        do {
            System.out.println("Введите команду: ");
            command = scanner.nextLine();
        } while(!command.equals(stop));

        System.out.println("Программа успешно завершена!");

    }

    public static void countDigits() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        int count = 0;

        do {
            count++;
            number /= 10;

        } while (number != 0);

        System.out.println("Количество цифр в введенном числе равно " + count);




    }








}
