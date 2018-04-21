package interview.cracking.stack;

public class SortStack {

    public static <T extends Comparable> Stack<T> sort(Stack<T> stack) {
        if (stack.isEmpty()) {
            return stack;
        }

        Stack<T> sortedStack = new OrdinaryStack<>();

        T nonSortedElement = stack.pop();
        while (nonSortedElement != null) {
            T sortedElement = sortedStack.peek();

            if (sortedElement == null) {
                sortedStack.push(nonSortedElement);
                nonSortedElement = stack.pop();
                continue;
            }

            if (sortedElement.compareTo(nonSortedElement) < 0) {
                stack.push(sortedStack.pop());
                continue;
            }

            sortedStack.push(nonSortedElement);
            nonSortedElement = stack.pop();
        }

        return sortedStack;
    }

}
