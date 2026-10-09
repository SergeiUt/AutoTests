package practice_12;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task5Test extends BaseTest {
    /**
     * Позитивный сценарий:
     *              Високосные (2020, 2000, 1600) -> true
     * Негативный сценарий:
     *                  обычные годы -> false
     *                  года, которые делятся на 100 и не делятся на 400 -> false
     */

    @ParameterizedTest(name="Год {0} високосный")
    @ValueSource(ints = {2020, 2000, 1600})
    public void positiveCases(int year) {
        assertTrue(task.isLeapYear(year));
    }

    @ParameterizedTest(name="Год {0} не високосный")
    @ValueSource(ints= {2025, 2022, 1900, 2100})
    public void negativeCases(int year) {
        assertFalse(task.isLeapYear(year));
    }

}
