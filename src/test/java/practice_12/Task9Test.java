package practice_12;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task9Test extends BaseTest{
    /**
     * Позитивный сценарий:
     * "" -> 0
     * "    " -> 0
     * "один" -> 1
     * "один два три" -> 3
     * "1      2      3" -> 3
     * "'*' '*' '*' '*' '*'" -> 5

     * Негативный сценарий:
     * null -> NullPointerException
     */
    static Stream<Arguments> positiveCases() {
        return Stream.of(
                Arguments.of("", 0),
                Arguments.of("      ", 0),
                Arguments.of("один", 1),
                Arguments.of("один два три", 3),
                Arguments.of("1      2      3", 3),
                Arguments.of("'*' '*' '*' '*' '*'", 5));

    }

    @ParameterizedTest(name= "Количество слов в строке \"{0}\" равно --> {1}")
    @MethodSource("positiveCases")
    public void positiveCountWordsTest(String input, int expected) {
        assertEquals(expected, task.countWords(input));
    }

    @Test
    @DisplayName("Проверка на null")
    public void negativeNullTest() {
        assertThrows(NullPointerException.class, ()-> task.countWords(null));
    }

}
