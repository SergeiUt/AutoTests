package practice_14.task_1;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
public class EntityManager<T> {
    private final CopyOnWriteArrayList<T> entities = new
            CopyOnWriteArrayList<>();
    public void add(T entity) {
        entities.add(entity);
    }
    public boolean remove(T entity) {
        return entities.remove(entity);
    }
    public List<T> getAll() {
        return List.copyOf(entities);
    }
    // Фильтрация по возрасту (только если T -- User)
    public List<T> filterByAge(int min, int max) {
        return entities.stream()
                .filter(e -> e instanceof User)
                .map(e -> (User) e)
                .filter(user -> user.getAge() >= min &&
                        user.getAge() <= max)
                .map(user -> (T) user)
                .collect(Collectors.toList());
    }
    public List<T> filterByName(String name) {
        return entities.stream()
                .filter(e -> e instanceof User)
                .map(e -> (User) e)
                .filter(user ->
                        user.getName().equalsIgnoreCase(name))
                .map(user -> (T) user)
                .collect(Collectors.toList());
    }
    public List<T> filterByActivity(boolean active) {
        return entities.stream()
                .filter(e -> e instanceof User)
                .map(e -> (User) e)
                .filter(user -> user.isActive() == active)
                .map(user -> (T) user)
                .collect(Collectors.toList());
    }
}