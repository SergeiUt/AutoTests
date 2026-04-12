package practice_10.practice.streamapi;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;

public class SortedUniqueElements {
    //есть список с дублирующими значениями
    //вывести все уникальные значения в отсортированном порядке
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 3, 4, 5, 2, 1);

        List<Integer> uniqueSorted =  numbers.stream()
                .distinct()
                .peek(n -> System.out.println("Distinct: " + n))
                .sorted()
                .peek(n -> System.out.println("Sorted: " + n))
                .toList();

        System.out.println(uniqueSorted);
    }




}
