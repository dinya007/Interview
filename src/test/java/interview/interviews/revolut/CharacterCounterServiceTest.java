package interview.interviews.revolut;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.stream.IntStream;

public class CharacterCounterServiceTest {

    @Test
    public void testCountSuccess() {
        Map<Character, Integer> result = CharacterCounterService.count(IntStream.range(0, Integer.MAX_VALUE).mapToObj(val -> 'A'));

        System.out.println(result.get('A'));
        Assert.assertEquals(1, result.size());
        Assert.assertEquals(Integer.MAX_VALUE, result.get('A').intValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCountWhenInputStringIsNull() {
        CharacterCounterService.count(null);
    }

}