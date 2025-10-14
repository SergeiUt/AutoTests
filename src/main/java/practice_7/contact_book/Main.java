package practice_7.contact_book;

public class Main {
    public static void main(String[] args) {
        ContactBook contactBook = new ContactBook();

        contactBook.addContact("Мария", 34543);
        contactBook.addContact("Паша", 34752);
        contactBook.addContact("Лия", 36352);

        contactBook.printContacts();

        contactBook.updatedPhone("Паша", 12345);
        contactBook.printContacts();


    }
}
