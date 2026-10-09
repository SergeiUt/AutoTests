package practice_10.homework.part2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Task 1
        List<String> strings = Arrays.asList("123", "1234", "12345", "123456", "1234567");

        List<String> stringsMoreThanFive = strings.stream()
                .filter(str -> str.length() > 5)
                .toList();
        System.out.println(stringsMoreThanFive);

        //Task 2
        List<Integer> numbers = Arrays.asList(5, 25, 30, 3, 4, 7);

        List<Integer> numbersDivideByFive = numbers.stream()
                .filter(i -> i % 5 == 0)
                .toList();

        System.out.println(numbersDivideByFive);

        //Task 3
        List<String> stringNumbers = Arrays.asList("123", "1234", "12345", "123456", "1234567");

        List<Integer> lengthStringNumbers = stringNumbers.stream()
                .map(String::length)
                .toList();

        System.out.println(lengthStringNumbers);

        //Task 4
        List<Integer> num = Arrays.asList(4,7,9,3);

        List<Integer> numSquare = num.stream()
                .map(n -> n * n)
                .toList();

        System.out.println(numSquare);

        //Task 5
        List<Integer> nums = Arrays.asList(1,1,2,2,3,3,4,4);
//
        List<Integer> uniqueNums = nums.stream()
                .distinct()
                .toList();

        System.out.println(uniqueNums);
    }
}
