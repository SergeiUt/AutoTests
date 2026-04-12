package practice_12;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task7Test extends BaseTest {
    /**
     * Позитивный сценарий:
     * 0 -> 1
     * 1 -> 1
     * 3 -> 6
     * 5 -> 120
     * 9 -> 362880
     * Негативный сценарий:
     * -1 -> IllegalArgumentException
     * -56 -> IllegalArgumentException
     */

    static Stream<Arguments> positiveCases() {
        return Stream.of(
                Arguments.of(0, 1),
                Arguments.of(1, 1),
                Arguments.of(3, 6),
                Arguments.of(5, 120),
                Arguments.of(9, 362880));

    }

    @ParameterizedTest(name = "Факториал числа {0} равен {1}")
    @MethodSource("positiveCases")
    public void positiveCasesTests(int input, int expected) {
        assertEquals(expected, task.factorial(input));
    }

    @ParameterizedTest(name = "Число {0} выбрасывает исключение IllegalArgumentException (\"Negative numbers not allowed\")")
    @ValueSource(ints = {-1, -56})
    public void negativeCasesTests(int input) {
        assertThrows(IllegalArgumentException.class, () -> task.factorial(input));
    }


}
