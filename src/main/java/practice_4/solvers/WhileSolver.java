package practice_4.solvers;

import java.util.Scanner;

public class WhileSolver {
    public static void main(String[] args) {
//        printAllNumbersBefore10();
//        commandReader();
        System.out.println(sumOfDigits(123));

    }

    public static void printAllNumbersBefore10() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public static void commandReader() {
        Scanner scanner = new Scanner(System.in);
        String command = "";
        while (!command.equals("exit")) {
            System.out.print("Введите команду: ");
            command = scanner.nextLine();
        }
        System.out.println("Программа завершена");
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int a = number % 10;
            number = number / 10;
            sum += a;
        }
        return sum;
    }

}
