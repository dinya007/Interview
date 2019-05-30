package preparation2019.datastructure.arrayandstrings;

import org.junit.Assert;
import org.junit.Test;

public class StringUniqueCharactersTest {

    @Test
    public void testIsAllCharactersUniqueViaArrayTrue() {
        Assert.assertTrue(StringUniqueCharacters.isAllCharactersUniqueViaArray("bacdef".toCharArray()));
    }

    @Test
    public void testIsAllCharactersUniqueViaArrayFalse() {
        Assert.assertFalse(StringUniqueCharacters.isAllCharactersUniqueViaArray("bacdebf".toCharArray()));
    }

    @Test
    public void testIsAllCharactersUniqueViaBitArrayTrue() {
        Assert.assertTrue(StringUniqueCharacters.isAllCharactersUniqueViaBitArray("bacdef".toCharArray()));
    }

    @Test
    public void testIsAllCharactersUniqueViaBitArrayFalse() {
        Assert.assertFalse(StringUniqueCharacters.isAllCharactersUniqueViaBitArray("bacdebf".toCharArray()));
    }
}