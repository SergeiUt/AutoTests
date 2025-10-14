package practice_3;

public class LibraryTest {



    public static void main(String[] args) {
        Library lib = new Library("Название книги", "Автор", 1998, "фантастика");
        System.out.println(lib.category);
        System.out.println(lib.author);
//        System.out.println(lib.bookTitle);
        System.out.println(lib.year);



    }

}
