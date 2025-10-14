package practice_4.solvers;

import java.util.Random;
import java.util.Scanner;

public class DoWhileSolver {

    public static void main(String[] args) {
        findNumber(1000);
//        findMin();
//        checkCredentials();
    }


    public static void findNumber(int bound) {
        Scanner scanner = new Scanner(System.in);

        int random = new Random().nextInt(bound);

        int number;
        do {
            System.out.print("Угадайте число: ");
            number = scanner.nextInt();
            if (number > random) {
                System.out.println("Меньше!");
            }
            else if (number < random) {
                System.out.println("Больше!");
            }
        } while (number != random);

        System.out.println("Верно");

    }


    public static void findMin() {
        Scanner scanner = new Scanner(System.in);

        int number;
        int min = 2147483647;

        do {
            System.out.print("Введите число: ");
            number = scanner.nextInt();
            if (number < min && number >= 0) min = number;

        } while (number >= 0);

        System.out.println("Минимально число: " + min);



    }

    public static void checkCredentials() {

        Scanner scanner = new Scanner(System.in);
        String login;
        String password;

        do {
            System.out.print("Введите логин: ");
            login = scanner.nextLine();
            System.out.print("Введите пароль: ");
            password = scanner.nextLine();
        } while (!login.equals("admin") && !password.equals(""));
        System.out.println("Доступ разрешен");

    }



}
