package practice_12;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class Task3Test extends BaseTest {

    /**
     * Позитивный сценарий:
     *              " авто" -> "отва"
     *              "r" -> "r"
     *              "" -> ""
     *              "Авто" -> "отвА"
     *              "345" -> "543"
     * Негативный сценарий: null -> null
     */

    static Stream<Arguments> validReverseString() {
        return Stream.of(
                Arguments.of("авто", "отва"),
                Arguments.of("r", "r"),
                Arguments.of("", ""),
                Arguments.of("Авто", "отвА"),
                Arguments.of("345", "543"));

    }

    @ParameterizedTest(name = "Строка {0} переворачивается в строку {1}")
    @MethodSource("validReverseString")
    public void checkReverseStringPositiveCases(String input, String expected) {
        assertEquals(expected, task.reverse(input));
    }

    @Test
    @DisplayName("null должен возвращать null")
    public void nullReverseToNull() {
        assertNull(task.reverse(null));
    }

}
