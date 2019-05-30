package preparation2019;

public class TrackMedian {

    private final Heap<Integer> minHeap = Heap.buildHeap(HeapType.MIN);
    private final Heap<Integer> maxHeap = Heap.buildHeap(HeapType.MAX);

    public void add(int number) {
        Integer maxHeapRootValue = maxHeap.get();
        if (maxHeapRootValue != null && maxHeapRootValue >= number) {
            maxHeap.push(number);
        } else {
            minHeap.push(number);
        }
        balanceHeaps();
    }

    public Integer getMedian() {
        Heap<Integer> biggestHeap = maxHeap.size() >= minHeap.size() ? maxHeap : minHeap;
        if (biggestHeap.isEmpty()) {
            return null;
        }
        return biggestHeap.get();
    }

    private void balanceHeaps() {
        if ((maxHeap.size() - minHeap.size()) > 1) {
            minHeap.push(maxHeap.poll());
        } else if ((minHeap.size() - maxHeap.size()) > 1) {
            maxHeap.push(minHeap.poll());
        }
    }

}
