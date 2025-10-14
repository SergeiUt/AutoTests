package practice_2;

public class Book {
    /*
     * Создайте класс Book с полями title и author. Реализуйте конструктор, геттеры и сеттеры, и метод printInfo(),
     * выводящий название и автора книги. В main создайте книгу, измените автора и выведите информацию.
     */
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void printInfo() {
        System.out.println("Название книги: " + title + "; Автор: " + author);
    }

    public static void main(String[] args) {
        Book book = new Book("Мастер и Маргарита", "М.Булгаков");
        book.setAuthor("A.C.Пушкин");
        book.printInfo();
    }


}
