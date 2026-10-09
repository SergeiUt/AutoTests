package practice_8;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTasks {

    // Task 1
    public static void createAndPrintLinkedList() {
        LinkedList<String> strings = new LinkedList<>();

        strings.add("1");
        strings.add("5");
        strings.add("3");
        strings.add("4");
        strings.add("0");

        System.out.println(strings);

    }

    // Task 2
    public static void createQueueLinkedList() {
        LinkedList<String> tasks = new LinkedList<>();

        tasks.add("1 task");
        tasks.add("2 task");
        tasks.add("3 task");


        while (!tasks.isEmpty()) {
            System.out.println(tasks.poll());
        }


    }

    // Task 3
    public static void takeFirstAndLastElementLinkedList() {
        LinkedList<String> tasks = new LinkedList<>();

        tasks.add("1 task");
        tasks.add("2 task");
        tasks.add("3 task");
        tasks.add("4 task");
        tasks.add("5 task");


        if (!tasks.isEmpty()) {

            System.out.println(tasks.getFirst());
            System.out.println(tasks.getLast());
        }


    }

    // Task 4
    public static void sumOfElementsLinkedList() {
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Сумма элементов списка: " + sum);

    }

    // Task 5
    public static void listIterator() {
        LinkedList<String> list = new LinkedList<>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        ListIterator<String> it = list.listIterator();

        System.out.println("Проходим по порядку");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println();

        System.out.println("Проходим в обратном порядке");
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }

    }



    public static void main(String[] args) {

        createAndPrintLinkedList();
        createQueueLinkedList();
        takeFirstAndLastElementLinkedList();
        sumOfElementsLinkedList();
        listIterator();

    }
}
