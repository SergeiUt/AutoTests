package practice_7.contact_book;

import java.util.HashMap;

public class ContactBook {


    // ключ-значение (имя-телефон)
    private HashMap<String, Integer> contacts; // В реальной задаче лучше использовать String вместо Integer

    public ContactBook() {
        this.contacts = new HashMap<>();
    }

    // добавить контакт
    public void addContact(String name, Integer phone) {
        contacts.put(name, phone);
    }

    // поиск контакта по имени
    public Integer getPhone(String name) {
        return contacts.get(name);
    }


    //обновление контакта по имени
    public void updatedPhone(String name, Integer updatedPhone) {
        contacts.put(name, updatedPhone);
    }

    public void printContacts() {
        System.out.println("Все контакты: ");
        contacts.forEach(
                (name, phone) -> {
                    System.out.println("имя: " + name + ", телефон " + phone);
                }
        );
        System.out.println();
    }


}
