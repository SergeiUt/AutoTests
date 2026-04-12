package practice_12;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class Task10Test extends BaseTest {
    /**
     * Позитивный сценарий:
     *
     * "+9 9855675435" --> true
     * "+98 9855675435" --> true
     * "+987 9855675435" --> true

     * Негативный сценарий:
     * "9855675435" --> false
     * "+2345 9855675435" --> false
     * "+ 9855675435" --> false
     * "+fgd 9855675435" --> false
     * "" --> false
     * "+fgd 98556754355" --> false
     * null -> NullPointerException
     */

    @ParameterizedTest(name="Корректный номер телефона: {0}")
    @ValueSource(strings = {"+9 9855675435", "+98 9855675435", "+987 9855675435"})
    public void positiveValidTelephoneNumber(String input) {
        assertTrue(task.isValidPhoneNumber(input));
    }

    @ParameterizedTest(name="Некорректный номер телефона: {0}")
    @ValueSource(strings = {"9855675435",
            "+2345 9855675435",
            "+ 9855675435",
            "+fgd 9855675435",
            "",
            "+fgd 98556754355"
    })
    public void negativeInvalidTelephoneNumber(String input) {
        assertFalse(task.isValidPhoneNumber(input));
    }

    @Test
    @DisplayName("null возвращает NullPointerException")
    public void nullTelephoneNumberTest() {
        assertThrows(NullPointerException.class, () -> task.isValidPhoneNumber(null));
    }

}
