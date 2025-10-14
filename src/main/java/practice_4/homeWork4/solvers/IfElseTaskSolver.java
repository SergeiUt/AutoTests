package practice_4.homeWork4.solvers;

import java.util.Scanner;

public class IfElseTaskSolver {


    public static void main(String[] args) {
//        isPositiveNumber(); //1
//        findMax(); //2
//        printScore(); //3
//        isEven(); //4
//        printDiscount(); //5
        printResults();


    }

    public static void isPositiveNumber() {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Число положительное");
        } else if (number < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число равно нулю");
        }

    }

    public static void findMax() {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();

//        System.out.println(Math.max(first, second)); // решение через max

        if (first > second) {
            System.out.println(first);
        } else {
            System.out.println(second);
        }

    }

    public static void printScore() {
        Scanner scanner = new Scanner(System.in);

        int score = scanner.nextInt();

        switch (score) {
            case 5:
                System.out.println("Отлично");
                break;
            case 4:
                System.out.println("Хорошо");
                break;
            case 3:
                System.out.println("Удовлетворительно");
                break;
            case 2, 1:
                System.out.println("Неудовлетворительно");
                break;
            default:
                System.out.println("Программа принимает число от 1 до 5");
                break;
        }
    }

    public static void isEven() {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }
    }

    public static void printDiscount() {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("Скидка 25%");
        } else if (age >= 65) {
            System.out.println("Скидка 30%");
        } else {
            System.out.println("Без скидки");
        }

    }

    public static void printResults() {
        Scanner scanner = new Scanner(System.in);

        int result = scanner.nextInt();

        if (result >= 90 && result <= 100) {
            System.out.println("Отлично");
        } else if (result >= 75 && result <= 89) {
            System.out.println("Хорошо");
        } else if (result >= 60 && result <= 74) {
            System.out.println("Удовлетворительно");
        } else if (result <= 60 && result >=0) {
            System.out.println("Неудовлетворительно");
        } else {
            System.out.println("Программа принимает значения от 0 до 100");
        }

    }







}
