package interview.cracking.stack;

import org.junit.Assert;
import org.junit.Test;

public class QueueViaStacksTest {

    @Test
    public void test() {
        QueueViaStacks<Integer> queue = new QueueViaStacks<>();

        queue.push(3);
        queue.push(4);
        queue.push(1);

        Assert.assertEquals(3, queue.peek().intValue());
        Assert.assertEquals(3, queue.pop().intValue());
        Assert.assertEquals(4, queue.pop().intValue());

        queue.push(5);

        Assert.assertEquals(1, queue.peek().intValue());
        Assert.assertEquals(1, queue.pop().intValue());
        Assert.assertEquals(5, queue.pop().intValue());
        Assert.assertNull(queue.peek());
        Assert.assertNull(queue.pop());
    }

}