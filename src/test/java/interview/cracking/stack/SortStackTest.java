package interview.cracking.stack;

import org.junit.Assert;
import org.junit.Test;

public class SortStackTest {

    @Test
    public void test() {
        Stack<Integer> stack = new OrdinaryStack<>();
        stack.push(5);
        stack.push(6);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        Stack<Integer> sortedStack = SortStack.sort(stack);

        Assert.assertEquals(1, sortedStack.pop().intValue());
        Assert.assertEquals(2, sortedStack.pop().intValue());
        Assert.assertEquals(4, sortedStack.pop().intValue());
        Assert.assertEquals(5, sortedStack.pop().intValue());
        Assert.assertEquals(6, sortedStack.pop().intValue());
    }

}