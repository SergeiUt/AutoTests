package practice_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListTasks {

    // Task 1
    public static void addNumberToTheEnd() {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        numbers.add(6);
        System.out.println(numbers);

    }

    // Task 2
    public static void findEvenNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 22));

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }

    }

    //Task 3
    public static void findLongestString() {
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("1", "22", "hhfjhjdhksfjfdk", "333", "4444", "55555"));

        String result = "";
        for (String string : strings) {
            if (string.length() > result.length()) {
                result = string;
            }
        }
        System.out.println("Самая длинная строка в массиве: " + result);

    }

    //Task 4
    public static void findSumNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }


        System.out.println("Сумма всех чисел равна: " + sum);
    }

    //Task 5
    public static void findMaxNumber() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 37, 4, 5, 24));

        int maxNumber = Collections.max(numbers);

        System.out.println("Максимальное число: " + maxNumber);


        }



    public static void main(String[] args) {
        addNumberToTheEnd();
        findEvenNumbers();
        findLongestString();
        findSumNumbers();
        findMaxNumber();

    }
}
