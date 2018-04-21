package interview.cracking.stack;

public class SortStack {

    public static <T extends Comparable> Stack<T> sort(Stack<T> stack) {
        Stack<T> sortedStack = new OrdinaryStack<>();

        while (!stack.isEmpty()) {
            T nonSortedElement = stack.pop();

            while (!sortedStack.isEmpty() && sortedStack.peek().compareTo(nonSortedElement) < 0) {
                stack.push(sortedStack.pop());
            }

            sortedStack.push(nonSortedElement);
        }

        return sortedStack;
    }

}
