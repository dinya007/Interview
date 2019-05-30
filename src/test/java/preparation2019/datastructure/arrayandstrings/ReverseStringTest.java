package preparation2019.datastructure.arrayandstrings;

import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTest {

    @Test
    public void testReverseForOne() {
        Character[] array = {'a', null};

        ReverseString.reverse(array);

        Assert.assertArrayEquals(new Character[]{ 'a', null}, array);
    }

    @Test
    public void testReverseForOdd() {
        Character[] array = {'a', 'b', 'c', null};

        ReverseString.reverse(array);

        Assert.assertArrayEquals(new Character[]{'c', 'b', 'a', null}, array);
    }

    @Test
    public void testReverseForEven() {
        Character[] array = {'a', 'b', 'c', 'd', null};

        ReverseString.reverse(array);

        Assert.assertArrayEquals(new Character[]{'d','c', 'b', 'a', null}, array);
    }

}