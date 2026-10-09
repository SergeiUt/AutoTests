package practice_12;

import org.junit.jupiter.api.BeforeEach;

public class BaseTest {
    protected Tasks task;

    @BeforeEach
    public void setUp() {
        task = new Tasks();
    }
}
