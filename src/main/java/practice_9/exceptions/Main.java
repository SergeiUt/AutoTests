package practice_9.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    // Task 1
    public static void openFile() {
        try {
            FileReader fileReader = new FileReader("data.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

    // Task 2
    public static void divideFunction(int x, int y) {
        try {
            int result = x / y;
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя!");
        }

    }

    // Task 3
    public static void validAge(int age) throws MyAgeException {

        if (age < 0 || age > 150) {
            throw new MyAgeException(age + " --> Возраст не подходит");
        }

        System.out.println(age + " --> Возраст подходит!");
    }

    // Task 3
    public static void validEmail(String email) throws ValidEmailException {

        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);

        if (!matcher.matches()) {
            throw new ValidEmailException("Адрес электронной почты невалидный! --> " + email);
        } else {
            System.out.println("Электронная почта валидная!  --> "  + email);
        }


    }


    public static void main(String[] args) {
        openFile();
        divideFunction(3,0);
        try {
            validAge(170);
        } catch (MyAgeException e) {
            System.out.println(e.getMessage());;
        }
        try {
            validEmail("dom.com");
        } catch (ValidEmailException e) {
            System.out.println(e.getMessage());
        }

    }
}
