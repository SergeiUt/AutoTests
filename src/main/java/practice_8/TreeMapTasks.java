package practice_8;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTasks {

    // Task 1
    public static void createTreeMap() {

        TreeMap<String, Integer> students = new TreeMap<>();

        students.put("Алексей", 35);
        students.put("Виктор", 23);
        students.put("Ольга", 65);
        students.put("Петр", 77);
        students.put("Альбина", 95);

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println("У студента " + entry.getKey() + " количество баллов " + entry.getValue());
        }


    }

    //Task 2
    public static void findMinMaxKeyTreeMap() {

        TreeMap<Integer, String> students = new TreeMap<>();

        students.put(35,"Алексей");
        students.put(83,"Виктор");
        students.put(25,"Ольга");
        students.put(77,"Петр");
        students.put(95,"Альбина");

        System.out.println("Минимальный ключ: " + students.firstKey());
        System.out.println("Максимальный ключ: " + students.lastKey());


    }

    //Task 3
    public static void findHigherKeyTreeMap() {

        TreeMap<Integer, String> employees = new TreeMap<>();

        employees.put(35,"Алексей");
        employees.put(83,"Виктор");
        employees.put(25,"Ольга");
        employees.put(77,"Петр");
        employees.put(95,"Альбина");


        int id = 33;
        if (!employees.isEmpty()) {
            System.out.println("Ближайший больший id: " + employees.higherKey(id));
        }




    }


    public static void main(String[] args) {
//        createTreeMap();
//        findMinMaxKeyTreeMap();
        findHigherKeyTreeMap();

    }
}
