package preparation2019.datastructure;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static preparation2019.datastructure.Heap.buildHeap;

public class HeapTest {

    @Test
    public void testBuildHeap() {
        Heap heap = buildHeap(new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7, 8)));

        Assert.assertEquals(heap.heap, Arrays.asList(8, 7, 5, 6, 4, 3));
    }
}