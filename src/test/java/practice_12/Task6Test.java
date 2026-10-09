package practice_12;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task6Test extends BaseTest {
    /**
     * Позитивный сценарий:
     *                  Корректные email -->  "test@example.com", "test@yandex.ru", "t@y.ru"
     * Негативный сценарий:
     *                  Некорректные email --> "test-example.com", "test@.com", "test@example.", "", "@example.com"
     *                  null
     */

    @ParameterizedTest(name= "Корректный email --> {0}")
    @ValueSource(strings = {"test@example.com", "test@yandex.ru", "t@y.ru"})
    public void validEmailCases(String email) {
        assertTrue(task.isValidEmail(email));
    }

    @ParameterizedTest(name= "Некорректный email --> {0}")
    @ValueSource(strings = {"test-example.com", "test@.com", "test@example.", "", "@example.com"})
    public void invalidEmailCases(String email) {
        assertFalse(task.isValidEmail(email));
    }

    @Test
    @DisplayName("Проверка на null")
    public void nullEmailCase() {
        assertFalse(task.isValidEmail(null));
    }


}
