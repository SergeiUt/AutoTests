package practice_14.task_1;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
class EntityManagerTests {
    @Test
    void testAddAndGetAll() {
        EntityManager<User> manager = new EntityManager<>();
        User user = new User("Alice", 30, true);
        manager.add(user);
        List<User> users = manager.getAll();
        assertEquals(1, users.size());
        assertEquals("Alice", users.get(0).getName());
    }
    @Test
    void testRemove() {
        EntityManager<User> manager = new EntityManager<>();
        User user = new User("Bob", 25, false);
        manager.add(user);
        assertTrue(manager.remove(user));
        assertFalse(manager.remove(user));
    }
    @Test
    void testFilterByAge() {
        EntityManager<User> manager = new EntityManager<>();
        manager.add(new User("Tom", 20, true));
        manager.add(new User("Jerry", 35, false));
        manager.add(new User("Spike", 50, true));
        List<User> result = manager.filterByAge(30, 40);
        assertEquals(1, result.size());
        assertEquals("Jerry", result.get(0).getName());
    }
    @Test
    void testFilterByName() {
        EntityManager<User> manager = new EntityManager<>();
        manager.add(new User("Anna", 28, true));
        manager.add(new User("anna", 31, false));
        List<User> result = manager.filterByName("Anna");
        assertEquals(2, result.size());
    }
    @Test
    void testFilterByActivity() {
        EntityManager<User> manager = new EntityManager<>();
        manager.add(new User("Mike", 33, true));
        manager.add(new User("Leo", 41, false));
        List<User> result = manager.filterByActivity(true);
        assertEquals(1, result.size());
        assertEquals("Mike", result.get(0).getName());
    }
}
