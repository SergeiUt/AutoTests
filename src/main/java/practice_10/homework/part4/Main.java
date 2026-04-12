package practice_10.homework.part4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Task 1
        List<String> names = Arrays.asList("Борис", "Боб", "Виктор", "Дмитрий", "Галина", "Даниил");

        Map<String, List<String>> namesList = names.stream()
                .collect(Collectors.groupingBy(s -> s.substring(0,1)));


        System.out.println(namesList);

        //Task 2
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5 ,6, 7 ,8 ,9);

        Map<Boolean, List<Integer>> groupNumbers = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0)); //Collectors.partitioningBy()

        System.out.println(groupNumbers);
//

        //Task 3
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5 ,6, 7 ,8 ,9);

        double result = numbers1.stream()
                .collect(Collectors.averagingInt(n -> n));

        System.out.println(result);

    }
}
