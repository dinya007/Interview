package interview.cracking.recursion;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class StringPermutationTest {

    @Test
    public void testGetAllPermutations1() {
        List<String> result = StringPermutation.getAllPermutations("ab");

        Assert.assertEquals(2, result.size());
        Assert.assertTrue(result.contains("ab"));
        Assert.assertTrue(result.contains("ba"));
    }

    @Test
    public void testGetAllPermutations2() {
        List<String> result = StringPermutation.getAllPermutations("abc");

        Assert.assertEquals(6, result.size());
        Assert.assertTrue(result.contains("abc"));
        Assert.assertTrue(result.contains("acb"));
        Assert.assertTrue(result.contains("bac"));
        Assert.assertTrue(result.contains("bca"));
        Assert.assertTrue(result.contains("cab"));
        Assert.assertTrue(result.contains("cba"));
    }
}