package practice_12;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task2Test extends BaseTest {

    /**
     * Позитивный сценарий: строки с гласными, строки с гласными в upper case, пустая строка, строки без гласных
     * "hello", "java", "AEIOU", ""
     * Негативный сценарий: null
     */

    static Stream<Arguments> validString() {
        return Stream.of(
                Arguments.of("hello", 2),
                Arguments.of("java", 2),
                Arguments.of("AEIOU", 5),
                Arguments.of("", 0),
                Arguments.of("ncvmp", 0));

    }

    @ParameterizedTest(name = "В строке {0} количество гласных должно быть {1}")
    @MethodSource("validString")
    public void positiveCases(String input, int expected) {
        assertEquals(expected, task.countVowels(input));

    }

    @Test
    @DisplayName("Input cannot be null")
    public void inputCannotContainsNullValue() {
        assertThrows(IllegalArgumentException.class, () -> task.countVowels(null));
    }

}
