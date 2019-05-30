package preparation2019.datastructure.arrayandstrings;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class RemoveStringCharacterDuplicationTest {

    @Test
    public void testRemoveDuplications1() {
        Character[] array = {'a', 'a', 'b', 'c', 'b', 'c', 'd', null};

        RemoveStringCharacterDuplication.removeDuplications(array);

        System.out.println(Arrays.deepToString(array));
        Assert.assertArrayEquals(new Character[]{'a', 'b', 'c', 'd', null, null, null, null}, array);
    }

    @Test
    public void testRemoveDuplications2() {
        Character[] array = {'a', 'a', 'a', 'b', 'b', 'b', 'b', null};

        RemoveStringCharacterDuplication.removeDuplications(array);

        System.out.println(Arrays.deepToString(array));
        Assert.assertArrayEquals(new Character[]{'a', 'b', null, 'b', 'b', null, 'b', null}, array);
    }

    @Test
    public void testRemoveDuplications3() {
        Character[] array = {'a', 'a', 'a', null};

        RemoveStringCharacterDuplication.removeDuplications(array);

        System.out.println(Arrays.deepToString(array));
        Assert.assertArrayEquals(new Character[]{'a', null, 'a', null}, array);
    }
}