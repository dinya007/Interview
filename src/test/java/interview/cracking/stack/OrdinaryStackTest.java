package interview.cracking.stack;

import org.junit.Assert;
import org.junit.Test;

public class OrdinaryStackTest {

    @Test
    public void testStack() {
        Stack<Integer> stack = new OrdinaryStack<>();

        stack.push(3);
        stack.push(4);
        stack.push(1);

        Assert.assertEquals(1, stack.pop().intValue());
        Assert.assertEquals(4, stack.pop().intValue());
        Assert.assertEquals(3, stack.pop().intValue());
        Assert.assertNull(stack.pop());
    }
}