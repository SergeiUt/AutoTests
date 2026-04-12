package practice_12;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task1Test extends BaseTest {
    /**
     * Позитивный сценарий: положительные четные числа, ноль, отрицательные четные числа
     * Негативный сценарий: нечетные числа, отрицательные нечетные числа
     */

    @ParameterizedTest(name = "Число {0} должно вернуть true")
    @ValueSource(ints = {2, 4, 6, 0, -2, -4, -6})
    public void inputEvenNumber(int input) {
        assertTrue(task.isEven(input));
    }

    @ParameterizedTest(name = "Число {0} должно вернуть false")
    @ValueSource(ints = {1, 3, 5,-1, -3, -5})
    public void inputOddNumber(int input) {
        assertFalse(task.isEven(input));
    }


}
