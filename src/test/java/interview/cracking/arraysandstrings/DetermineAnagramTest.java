package interview.cracking.arraysandstrings;

import org.junit.Assert;
import org.junit.Test;

public class DetermineAnagramTest {
    @Test
    public void isAnagram() throws Exception {
        Assert.assertTrue(DetermineAnagram.isAnagram("abc".toCharArray(), "cab".toCharArray()));
        Assert.assertFalse(DetermineAnagram.isAnagram("abcc".toCharArray(), "cab".toCharArray()));
        Assert.assertFalse(DetermineAnagram.isAnagram("a".toCharArray(), "cab".toCharArray()));
    }

}