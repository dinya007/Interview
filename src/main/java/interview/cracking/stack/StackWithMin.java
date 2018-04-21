package interview.cracking.stack;

public class StackWithMin<T extends Comparable<T>> extends OrdinaryStack<T> {

    private final Stack<T> minStack = new OrdinaryStack<>();

    @Override
    public void push(T element) {
        T min = minStack.peek();

        if (min == null) {
            minStack.push(element);
        } else if (min.compareTo(element) >= 0) {
            minStack.push(element);
        }

        super.push(element);
    }

    @Override
    public T pop() {
        T result = super.pop();
        if (result != null && result.equals(minStack.peek())) {
            return minStack.pop();
        }
        return result;
    }

    public T peekMin() {
        return minStack.peek();
    }

}

