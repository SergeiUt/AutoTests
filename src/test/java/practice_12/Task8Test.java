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

public class Task8Test extends BaseTest {
    /**
     * Позитивный сценарий:
     * [23, 56] -> 23
     * [2, 4, 6, 8, 10] -> 8
     * [-2, -4, -6, -8, -10] -> -4

     * Негативный сценарий:
     * [2] -> IllegalArgumentException
     * [2, 2, 2, 2, 2] -> NoSuchElementException
     * [] -> IllegalArgumentException
     */

    static Stream<Arguments> positiveCases() {
        return Stream.of(
                Arguments.of(new int[] {23, 56}, 23),
                Arguments.of(new int[] {2, 4, 6, 8, 10}, 8),
                Arguments.of(new int[] {-2, -4, -6, -8, -10}, -4));
    }

    @ParameterizedTest(name="Второй максимум в массиве {0} равен {1}")
    @MethodSource("positiveCases")
    public void positiveFindSecondMaxTest(int[] ints, int expected) {
        assertEquals(expected, task.findSecondMax(ints));
    }

    @Test
    @DisplayName("Массив из одинаковых чисел")
    public void negativeArrayWithSameNumbers() {
        assertThrows(NoSuchElementException.class, () -> task.findSecondMax(new int[] {2, 2, 2, 2}));
    }

    @Test
    @DisplayName("Пустой массив")
    public void negativeArrayWithEmptyArray() {
        assertThrows(IllegalArgumentException.class, () -> task.findSecondMax(new int[] {}));
    }

    @Test
    @DisplayName("Массив с одним числом")
    public void negativeArrayWithOneNumber() {
        assertThrows(IllegalArgumentException.class, () -> task.findSecondMax(new int[] {2}));
    }

}
