package interview.cracking.stack;

public class OrdinaryStack<T> implements Stack<T> {

    private Node<T> first;

    @Override
    public void push(T element) {
        if (first == null) {
            first = new Node<>(element, null);
        } else {
            first = new Node<>(element, first);
        }
    }

    @Override
    public T pop() {
        if (first == null) {
            return null;
        }

        T result = first.data;
        first = first.previous;

        return result;
    }

    @Override
    public T peek() {
        if (first == null) {
            return null;
        }
        return first.data;
    }


}
