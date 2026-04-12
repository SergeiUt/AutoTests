package practice_12;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task4Test extends BaseTest {
    /**
     * Позитивный сценарий:
     *              [1,3,6,8,7,45] -> 45
     *              [5] -> 5
     *              [-1, -23, -456] -> -1
     * Негативный сценарий: [] -> исключение
     */

    static Stream<Arguments> positiveCases() {
        return Stream.of(
                Arguments.of(new int[]{1,3,6,8,7,45}, 45),
                Arguments.of(new int[]{5}, 5),
                Arguments.of(new int[]{-1, -23, -456}, -1));

    }

    @ParameterizedTest(name = "В массиве {0} максимум равен {1}")
    @MethodSource("positiveCases")
    public void findMaxValueTest(int[] input, int expected) {
        assertEquals(expected, task.findMax(input));
    }

    @Test
    @DisplayName("Пустой массив выбрасывает исключение")
    public void emptyArrayThrowsException() {
        assertThrows(NoSuchElementException.class, () ->
                task.findMax(new int[]{}));
    }


}
