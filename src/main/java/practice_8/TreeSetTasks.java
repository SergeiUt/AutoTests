package practice_8;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetTasks {

    // Task 1
    public static void createTreeSet() {

        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(11);
        set.add(4);
        set.add(134);
        set.add(46);
        set.add(2);

        System.out.println(set);


    }

    public static void addUnique(TreeSet<String> set, String element) {
        if (!set.contains(element)) {
            set.add(element);
        }

    }

    // Task 2
    public static void addElementToTreeSet() {
        TreeSet<String> set = new TreeSet<>();
        set.add("1");
        set.add("11");
        set.add("4");
//        set.add("4");
//        set.add("4");
//        set.add("4");
//        set.add("4");
        addUnique(set, "Оля");
        addUnique(set, "Оля");

        System.out.println(set);

    }

    public static void minMaxValueOfTreeSet() {

        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(10);
        set.add(15);
        set.add(20);
        set.add(40);


        int number = 13;
        System.out.println("Наименьший элемент, строго больше заданного: " + set.higher(number));
        System.out.println("Наибольший элемент, строго меньше заданного: " + set.lower(number));


    }


    public static void main(String[] args) {
//        createTreeSet();
//        addElementToTreeSet();
        minMaxValueOfTreeSet();


    }
}
