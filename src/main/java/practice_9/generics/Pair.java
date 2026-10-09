package practice_9.generics;

public class Pair<T,V> {
    private T tree;
    private V vector;

    public T getTree() {
        return tree;
    }

    public void setTree(T tree) {
        this.tree = tree;
    }

    public V getVector() {
        return vector;
    }

    public void setVector(V vector) {
        this.vector = vector;
    }
}
