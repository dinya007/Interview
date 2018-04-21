package interview.cracking.stack;

public interface Stack<T> {

    void push(T element);

    T pop();

    T peek();

    default boolean isEmpty() {
        return peek() == null;
    }
}
