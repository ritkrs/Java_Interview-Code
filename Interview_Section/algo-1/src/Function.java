@FunctionalInterface
public interface Function<T, U, V> {
    public V apply(T t, U u);
 
    default void count() {
        // increment counter
    }
}