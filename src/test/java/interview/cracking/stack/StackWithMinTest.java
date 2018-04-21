package interview.cracking.stack;

import org.junit.Assert;
import org.junit.Test;

public class StackWithMinTest {

    @Test
    public void testStackWitMin() {
        StackWithMin<Integer> stack = new StackWithMin<>();

        stack.push(5);
        stack.push(2);
        stack.push(1);
        stack.push(4);

        Assert.assertEquals(1, stack.peekMin().intValue());
        Assert.assertEquals(4, stack.pop().intValue());
        Assert.assertEquals(1, stack.pop().intValue());
        Assert.assertEquals(2, stack.peekMin().intValue());
        Assert.assertEquals(2, stack.pop().intValue());
        Assert.assertEquals(5, stack.pop().intValue());
        Assert.assertNull(stack.pop());
    }
}