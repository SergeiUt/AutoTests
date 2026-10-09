package practice_8;

import java.util.ArrayDeque;

public class ArrayDequeTasks {

    //Task 1
    public static void createArrayDeque() {

        ArrayDeque<String> names = new ArrayDeque<>();
        names.add("Борис");
        names.add("Николай");
        names.add("Виктор");
        names.add("Андрей");

        System.out.println(names);

    }

    //Task 2
    public static void createStackArrayDeque() {

        ArrayDeque<String> names = new ArrayDeque<>();
        names.push("Борис");
        names.push("Николай");
        names.push("Виктор");
        names.push("Андрей");

        while (!names.isEmpty()) {
            System.out.println(names.pop());
        }
    }


    //Task 2
    public static void createDeque() {

        ArrayDeque<String> numbers = new ArrayDeque<>();
        numbers.addFirst("1");
        numbers.addFirst("5");
        numbers.addLast("3");
        numbers.addLast("4");
        numbers.addLast("8");
        numbers.addLast("2");
        numbers.addLast("6");

        System.out.println(numbers.removeFirst());
        System.out.println(numbers.removeLast());


    }


    public static void main(String[] args) {
//        createArrayDeque();
//        createStackArrayDeque();
//        createDeque();
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        System.out.println(arrayDeque.getClass());
        System.out.println(arrayDeque.hashCode());
//        System.out.println(arrayDeque.getClass());

    }
}
