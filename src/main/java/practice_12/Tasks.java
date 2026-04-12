package practice_12;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Tasks {
    //Task1
    public boolean isEven(int number) {
        return number % 2 == 0;
    }


    //Task2
    public int countVowels(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        return (int) input.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();
    }

    //Task3
    public String reverse(String input) {
        if (input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }

    //Task4
    public int findMax(int[] numbers) {
        return Arrays.stream(numbers).max().orElseThrow();
    }

    //Task5
    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    //Task6
    public boolean isValidEmail(String email) {
        return email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$");
    }

    //Task7
    public int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative numbers not allowed");
        return (n == 0) ? 1 : n * factorial(n - 1);
    }

    //Task8
    public int findSecondMax(int[] numbers) {
        return Arrays.stream(numbers).distinct().sorted().skip(numbers.length - 2).findFirst().orElseThrow();
    }

    //Task9
    public int countWords(String sentence) {
        return sentence.trim().isEmpty() ? 0 : sentence.split("\\s+").length;
    }

    //Task10
    public boolean isValidPhoneNumber(String phone) {
        return phone.matches("\\+\\d{1,3} \\d{10}");
    }

    //Task11
    public List<Integer> filterEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }

    //Task12
    public List<String> sortByLength(List<String> words) {
        return words.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
    }

    //Task13
    public boolean isAnagram(String str1, String str2) {
        if (str1 == null || str2 == null) return false;
        char[] arr1 = str1.toLowerCase().replaceAll("\\s", "").toCharArray();
        char[] arr2 = str2.toLowerCase().replaceAll("\\s", "").toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    //Task14
    public double findAverage(int[] numbers) {
        return Arrays.stream(numbers).average().orElseThrow();
    }

    //Task15
    public List<Integer> mapToLengths(List<String> words) {
        return words.stream().map(String::length).collect(Collectors.toList());
    }

    //Task16
    public String[] splitString(String input, String delimiter) {
        return input.split(delimiter);
    }

    //Task17
    public boolean isValidPassword(String password) {
        if (password == null || password.length() < 8) return false;
        return password.matches("^(?=.*[A-Z])(?=.*\\d).+$");
    }

    //Task18
    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }


    //Task19
    public boolean isValidJson(String json) {
        try {
            new ObjectMapper().readTree(json);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //Task20
    public boolean hasDuplicates(int[] numbers) {
        return Arrays.stream(numbers).distinct().count() != numbers.length;
    }
}
