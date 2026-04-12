package practice_12;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task11Test extends BaseTest{
    /**
     * Позитивный сценарий:
     * [1,2,3,4,5,6,7,8] --> [2,4,6,8]
     * [1,3,5,9] --> []
     * [] --> []

     */

    static Stream<Arguments> evenNumberTestCases() {
        return Stream.of(
                Arguments.of(
                        Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8),
                        Arrays.asList(2, 4, 6, 8),
                        "filterEvenNumbersFromAllNumbersListTest"
                ),
                Arguments.of(
                        Arrays.asList(1, 3, 5, 9),
                        List.of(),
                        "filterEvenNumbersFromOddNumbersListTest"
                ),
                Arguments.of(
                        List.of(),
                        List.of(),
                        "filterEvenNumbersFromEmptyListTest"
                )
        );
    }

    @ParameterizedTest(name = "{2}")
    @MethodSource("evenNumberTestCases")
    public void filterEvenNumbersTest(List<Integer> input,
                                      List<Integer> expected,
                                      String testName) {
        assertEquals(expected, task.filterEvenNumbers(input));
    }

}
