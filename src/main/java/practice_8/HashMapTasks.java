package practice_8;

import java.util.HashMap;
import java.util.Map;

public class HashMapTasks {

    // Task 1
    public static void createHashMap() {
        HashMap<String, Integer> names = new HashMap<>();
        names.put("Маша", 24);
        names.put("Кирилл", 54);
        names.put("Виктор", 15);
        names.put("Дима", 20);
        names.put("Вика", 5);


        for (Map.Entry<String, Integer> name : names.entrySet()) {
            System.out.println("Имя " + name.getKey() + " " + "Возраст " + name.getValue());
        }

    }

    // Task 2
    public static void findNameInHashMap() {
        HashMap<String, Integer> names = new HashMap<>();
        names.put("Маша", 24);
        names.put("Кирилл", 54);
        names.put("Виктор", 15);
        names.put("Дима", 20);
        names.put("Вика", 5);

        String name = "Вика";

        if (names.containsKey(name)) {
            System.out.println("Данное имя уже есть в словаре");
        } else {
            System.out.println("Такого имени еще не было");
        }


    }

    // Task 3
    public static void smallerThen18HashMap() {
        HashMap<String, Integer> names = new HashMap<>();
        names.put("Маша", 24);
        names.put("Кирилл", 54);
        names.put("Виктор", 15);
        names.put("Дима", 20);
        names.put("Вика", 5);


        for (Map.Entry<String, Integer> name : names.entrySet()) {
            if (name.getValue() < 18) {
                System.out.println("Этому человеку меньше 18 лет: " + name.getKey());
            }
        }


    }





    public static void main(String[] args) {
        createHashMap();
        findNameInHashMap();
        smallerThen18HashMap();

    }
}
