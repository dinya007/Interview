package preparation2019.datastructure.arrayandstrings;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class RemoveStringCharacterDuplicationTest {

    @Test
    public void testRemoveDuplications() {
        Character[] array = {'a', 'a', 'b', 'c', 'b', 'c', 'd', null};

        RemoveStringCharacterDuplication.removeDuplications(array);

        System.out.println(Arrays.deepToString(array));
        Assert.assertArrayEquals(new Character[]{'a','b','c', null}, array);
    }
}