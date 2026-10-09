package practice_8;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetTasks {

    // Task 1
    public static void createHashSet() {
        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println(numbers);
     }

    // Task 2
    public static void checkNumberInHashSet() {
        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        int num = 15;
        if (numbers.contains(num)) {
            System.out.println("Такое число уже есть");
        } else {
            System.out.println("Такого числа еще не было");
        }

    }

    // Task 3
    public static void listToSet() {
        List<String> listOfStrings = Arrays.asList("1","1","1","5","5");
        Set<String> setStrings  = removeDuplicates(listOfStrings);
        System.out.println(setStrings);
    }

    public static Set<String> removeDuplicates(List<String> input) {
        return new HashSet<>(input);

    }

    // Task 4
    public static void checkNameInHashSet() {
        HashSet<String> names = new HashSet<>();

        names.add("Mark");
        names.add("Bob");
        names.add("Kate");
        names.add("Mari");

        String name = "Sergei";
        if (names.contains(name)) {
            System.out.println("Такое имя уже есть в множестве");
        } else {
            System.out.println("Такого имени еще нет в множестве");
        }

    }



    public static void main(String[] args) {
//        createHashSet();
//        checkNumberInHashSet();
//        listToSet();
        checkNameInHashSet();


    }
}
