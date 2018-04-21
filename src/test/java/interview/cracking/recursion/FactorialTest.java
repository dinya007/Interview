package interview.cracking.recursion;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void testFactorial1() {
        Assert.assertEquals(1, Factorial.factorial(1));
    }

    @Test
    public void testFactorial2() {
        Assert.assertEquals(2, Factorial.factorial(2));
    }

    @Test
    public void testFactorial3() {
        Assert.assertEquals(6, Factorial.factorial(3));
    }

    @Test
    public void testFactorial4() {
        Assert.assertEquals(24, Factorial.factorial(4));
    }

}