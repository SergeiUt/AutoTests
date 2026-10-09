package practice_9.generics;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.println(item);
        }
    }


    public static void main(String[] args) {

        // Task 1
        Box<Integer> number = new Box<>();
        number.setItem(2);
        System.out.println(number.getItem());

        Box<String> word = new Box<>();
        word.setItem("Cat");
        System.out.println(word.getItem());

        //Task 2
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] letters = {"a", "b", "c", "d"};

        printArray(numbers);
        System.out.println();
        printArray(letters);

        //Task 3

        Pair<String, Integer> pair = new Pair<>();
        pair.setTree("Дерево");
        pair.setVector(487);

        System.out.println("T --> " + pair.getTree());
        System.out.println("V --> " + pair.getVector());

    }
}
