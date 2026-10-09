package practice_10.practice.funcinterfaces;

@FunctionalInterface
public interface Checker {
    //Интерфейс проверяет, удовлетворяет ли число условию
    //Метод по умолчанию число, если оно проходит проверку

    boolean check(int number);

    default void printIfValid(int number) {
        if (check(number)) {
            System.out.println(number);
        }
    }
}
