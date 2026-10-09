package practice_8;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class LinkedHashMapTasks {

    // Task 1
    public static void createLinkedHashMap() {
        LinkedHashMap<String, String> phonebook = new LinkedHashMap<>();
        phonebook.put("Анатолий", "124567");
        phonebook.put("Антон", "124321");
        phonebook.put("Аркадий", "124578");
        phonebook.put("Агафон", "124000");
        phonebook.put("Антип", "100567");

        System.out.println(phonebook);

    }

    // Task 2
    public static void findContactLinkedHashMap() {
        LinkedHashMap<String, String> phonebook = new LinkedHashMap<>();
        phonebook.put("Анатолий", "124567");
        phonebook.put("Антон", "124321");
        phonebook.put("Аркадий", "124578");
        phonebook.put("Агафон", "124000");
        phonebook.put("Антип", "100567");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = scanner.nextLine();

        if (phonebook.containsKey(name)) {
            System.out.println("Номер телефона: " + phonebook.get(name));
        } else {
            System.out.println("Контакт не найден");
        }

    }



    public static void main(String[] args) {
//        createLinkedHashMap();
        findContactLinkedHashMap();

    }
}
