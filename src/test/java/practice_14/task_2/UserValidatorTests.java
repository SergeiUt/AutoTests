package practice_14.task_2;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


class UserValidatorTests {
    private final UserValidator validator = new UserValidator();
    @BeforeEach
    void enableValidation() {
        UserValidator.validationEnabled = true;
    }
    @Test
    void testValidUser() {
        User user = new User("Alice", 30, "alice@example.com");
        assertDoesNotThrow(() -> validator.validate(user));
    }
    @Test
    void testInvalidNameEmpty() {
        User user = new User("", 25, "test@example.com");
        assertThrows(InvalidUserException.class, () ->
                validator.validate(user));
    }
    @Test
    void testInvalidNameLowercase() {
        User user = new User("john", 25, "test@example.com");
        assertThrows(InvalidUserException.class, () ->
                validator.validate(user));
    }
    @Test
    void testInvalidAgeTooYoung() {
        User user = new User("Tom", 15, "tom@example.com");
        assertThrows(InvalidUserException.class, () ->
                validator.validate(user));
    }
    @Test
    void testInvalidAgeTooOld() {
        User user = new User("Tom", 120, "tom@example.com");
        assertThrows(InvalidUserException.class, () ->
                validator.validate(user));
    }
    @Test
    void testInvalidEmail() {
        User user = new User("Tom", 30, "invalid-email");
        assertThrows(InvalidUserException.class, () ->
                validator.validate(user));
    }
    @Test
    void testValidationDisabled() {
        UserValidator.validationEnabled = false;
        User user = new User("john", 12, "bad@");
        assertDoesNotThrow(() -> validator.validate(user));
    }
}
