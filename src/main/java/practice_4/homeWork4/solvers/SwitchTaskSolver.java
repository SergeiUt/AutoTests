package practice_4.homeWork4.solvers;

import java.util.Scanner;

public class SwitchTaskSolver {


    public static void main(String[] args) {
//        dayOfWeek(); //1
//        ticketPrice(); //2
//        letterScore(); //3
//        commands(); //4
        calculator();
    }

    public static void dayOfWeek() {
        Scanner scanner = new Scanner(System.in);

        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Программа принимает с консоли число от 1 до 7");
                break;
        }

    }

    public static void ticketPrice() {
        Scanner scanner = new Scanner(System.in);

        int day = scanner.nextInt();

        switch (day) {
            case 1, 2, 3, 4, 5:
                System.out.println("Цена билета 300 рублей");
                break;
            case 6, 7:
                System.out.println("Цена билета 450 рублей");
                break;
            default:
                System.out.println("Программа принимает с консоли число от 1 до 7");
                break;
        }

    }

    public static void letterScore() {
        Scanner scanner = new Scanner(System.in);

        int result = scanner.nextInt();

        if (result >= 90 && result <= 100) {
            System.out.println("Оценка A");
        } else if (result >= 80 && result <= 89) {
            System.out.println("Оценка B");
        } else if (result >= 70 && result <= 79) {
            System.out.println("Оценка C");
        } else if (result >= 60 && result <= 69) {
            System.out.println("Оценка D");
        } else if (result <= 60 && result >=0) {
            System.out.println("Оценка F");
        } else {
            System.out.println("Программа принимает значения от 0 до 100");
        }



    }

    public static void commands() {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        switch (command) {
            case "start":
                System.out.println("Система запущена");
                break;
            case "stop":
                System.out.println("Система остановлена");
                break;
            case "restart":
                System.out.println("Перезагрузка системы");
                break;
            case "status":
                System.out.println("Актуальный статус ситсемы");
                break;
            default:
                System.out.println("Программа принимает следующие команды: start, stop, restart, status");
                break;
        }

    }

    public static void calculator() {

        Scanner scanner = new Scanner(System.in);

        String operator = scanner.nextLine();
        int first = scanner.nextInt();
        int second = scanner.nextInt();



        int result;

        switch (operator) {
            case "+":
                result = first + second;
                System.out.println(result);
                break;
            case "-":
                result = first - second;
                System.out.println(result);
                break;
            case "*":
                result = first * second;
                System.out.println(result);
                break;
            case "/":
                if (second == 0) {
                    System.out.println("Ошибка!!! На ноль делить нельзя!");
                    break;
                }
                result = first / second;
                System.out.println(result);
                break;
        }




    }




}
