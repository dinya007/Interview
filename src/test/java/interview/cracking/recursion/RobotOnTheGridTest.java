package interview.cracking.recursion;

import org.junit.Assert;
import org.junit.Test;

public class RobotOnTheGridTest {

    @Test
    public void testMove1() {
        Assert.assertEquals(2, RobotOnTheGrid.move(0, 0, 2));
    }

    @Test
    public void testMove2() {
        Assert.assertEquals(6, RobotOnTheGrid.move(0, 0, 3));
    }

    @Test
    public void testMove3() {
        Assert.assertEquals(20, RobotOnTheGrid.move(0, 0, 4));
    }

}