package interview.cracking.stack;

public class QueueViaStacks<T> {

    private final Stack<T> firstStack = new OrdinaryStack<>();
    private final Stack<T> secondStack = new OrdinaryStack<>();


    public void push(T element) {
        firstStack.push(element);
    }

    public T pop() {
        transferElements();
        return secondStack.pop();
    }

    public T peek() {
        transferElements();
        return secondStack.peek();
    }

    private void transferElements() {
        if (secondStack.isEmpty()) {
            T element = firstStack.pop();
            while (element != null) {
                secondStack.push(element);
                element = firstStack.pop();
            }
        }
    }

}
