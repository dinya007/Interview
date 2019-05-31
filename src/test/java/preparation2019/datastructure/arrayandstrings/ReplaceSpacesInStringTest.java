package preparation2019.datastructure.arrayandstrings;

import org.junit.Assert;
import org.junit.Test;

public class ReplaceSpacesInStringTest {

    @Test
    public void testReplaceSpaces1() {
        Assert.assertArrayEquals(new Character[]{'a', 'b', '%', '2', '0', 'c', 'd', '%', '2', '0', null},
                ReplaceSpacesInString.replaceSpaces(new Character[]{'a', 'b', ' ', 'c', 'd', ' ', null}));
    }

    @Test
    public void testReplaceSpaces() {
        Assert.assertArrayEquals(new Character[]{'%', '2', '0', '%', '2', '0', null},
                ReplaceSpacesInString.replaceSpaces(new Character[]{' ', ' ', null}));
    }

}