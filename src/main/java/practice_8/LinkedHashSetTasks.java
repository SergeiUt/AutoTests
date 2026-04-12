package practice_8;

import java.util.LinkedHashSet;

public class LinkedHashSetTasks {

    // Task 1
    public static void createLinkedHashSet() {
        LinkedHashSet<String> strings = new LinkedHashSet<>();

        strings.add("5");
        strings.add("4");
        strings.add("3");
        strings.add("2");
        strings.add("1");

        System.out.println(strings);

    }

    // Task 2
    public static void addUnique(LinkedHashSet<String> set, String element) {
        if (!set.contains(element)) {
            set.add(element);
        }

    }

    public static void addElementToSet() {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        addUnique(set, "1");
        addUnique(set, "2");
        addUnique(set, "3");
        addUnique(set, "1");
        addUnique(set, "2");

        System.out.println(set);


    }




    public static void main(String[] args) {
//        createLinkedHashSet();
        addElementToSet();

    }
}
