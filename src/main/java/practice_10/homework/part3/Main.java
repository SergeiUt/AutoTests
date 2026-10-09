package practice_10.homework.part3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Task 1
        List<Integer> numbers = Arrays.asList(23, 33, 45);

        int maximumNumber = numbers.stream()
                .max(Comparator.naturalOrder())
                .orElseThrow(() -> new RuntimeException("Список пустой"));

        System.out.println(maximumNumber);

        //Task 2
        List<Integer> numbers1 = Arrays.asList(23, 33, 45);

        int minimumNumber = numbers1.stream()
                .min(Comparator.naturalOrder())
                .orElseThrow(() -> new RuntimeException("Список пустой"));

        System.out.println(minimumNumber);

        //Task 3
        List<Integer> numbers2 = Arrays.asList(2, 2, 3);

        int sumNumbers = numbers2.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sumNumbers);

        //Task 4
        List<String> names = Arrays.asList("Борис", "Боб", "Билл", "Дмитрий", "Алёна");

        String name = names.stream()
                .filter(n -> n.startsWith("Б"))
                .findFirst()
                .orElse("Нет имени начинающегося на 'Б'");

        System.out.println(name);

        //Task 5
        List<Integer> numbers3 = Arrays.asList(2, 3);

        boolean isEven = numbers3.stream()
                .anyMatch(n -> n % 2 == 0);

        System.out.println(isEven);
    }


}
