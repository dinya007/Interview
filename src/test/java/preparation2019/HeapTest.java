package preparation2019;

import org.junit.Assert;
import org.junit.Test;
import preparation2019.Heap;
import preparation2019.HeapType;

import java.util.ArrayList;
import java.util.Arrays;

import static preparation2019.Heap.buildHeap;

public class HeapTest {

    @Test
    public void testMaxBuildHeap1() {
        Heap<Integer> heap = buildHeap(HeapType.MAX, new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7, 8)));

        Assert.assertEquals(Arrays.asList(8, 7, 5, 6, 4, 3), heap.heap);
    }

    @Test
    public void testMaxBuildHeap2() {
        Heap<Integer> heap = buildHeap(HeapType.MAX, new ArrayList<>(Arrays.asList(3, 4, 6, 5, 6, 7, 8, 3)));

        Assert.assertEquals(Arrays.asList(8, 6, 7, 5, 4, 3, 6, 3), heap.heap);
    }

    @Test
    public void testMaxHeapPoll() {
        Heap<Integer> heap = buildHeap(HeapType.MAX, new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7, 8)));

        Assert.assertEquals(8, heap.poll().intValue());
        Assert.assertEquals(7, heap.poll().intValue());
        Assert.assertEquals(6, heap.poll().intValue());
        Assert.assertEquals(5, heap.poll().intValue());
        Assert.assertEquals(4, heap.poll().intValue());
        Assert.assertEquals(3, heap.poll().intValue());
        Assert.assertNull(heap.poll());
        Assert.assertNull(heap.poll());
    }

    @Test
    public void testMaxHeapPush() {
        Heap<Integer> heap = buildHeap(HeapType.MAX, new ArrayList<>(Arrays.asList(3, 4, 5)));

        heap.push(6);
        heap.push(8);
        heap.push(7);

        Assert.assertEquals(Arrays.asList(8, 6, 7, 4, 5, 3), heap.heap);
    }

    @Test
    public void testMinBuildHeap1() {
        Heap<Integer> heap = buildHeap(HeapType.MIN, new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7, 8)));

        Assert.assertEquals(Arrays.asList(8, 7, 5, 6, 4, 3), heap.heap);
    }

    @Test
    public void testMinBuildHeap2() {
        Heap<Integer> heap = buildHeap(HeapType.MIN, new ArrayList<>(Arrays.asList(3, 4, 6, 5, 6, 7, 8, 3)));

        Assert.assertEquals(Arrays.asList(8, 6, 7, 5, 4, 3, 6, 3), heap.heap);
    }

    @Test
    public void testMinHeapPoll() {
        Heap<Integer> heap = buildHeap(HeapType.MIN, new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7, 8)));

        Assert.assertEquals(8, heap.poll().intValue());
        Assert.assertEquals(7, heap.poll().intValue());
        Assert.assertEquals(6, heap.poll().intValue());
        Assert.assertEquals(5, heap.poll().intValue());
        Assert.assertEquals(4, heap.poll().intValue());
        Assert.assertEquals(3, heap.poll().intValue());
        Assert.assertNull(heap.poll());
        Assert.assertNull(heap.poll());
    }

    @Test
    public void testMinHeapPush() {
        Heap<Integer> heap = buildHeap(HeapType.MIN, new ArrayList<>(Arrays.asList(3, 4, 5)));

        heap.push(6);
        heap.push(8);
        heap.push(7);

        Assert.assertEquals(Arrays.asList(8, 6, 7, 4, 5, 3), heap.heap);
    }
}