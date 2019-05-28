package preparation2019.datastructure;

import java.util.List;

public class Heap<T extends Comparable<T>> {

    final List<T> heap;

    private Heap(List<T> array) {
        heap = array;
        for (int i = array.size() / 2 - 1; i >= 0; i--) {
            siftDown(i);
        }
    }

    public void siftUp(int index) {

    }

    public void siftDown(int index) {
        int leftChildIndex = 2 * index + 1;
        int rightChildIndex = 2 * index + 2;
        T indexValue = heap.get(index);

        int maxChildIndex;
        if (leftChildIndex < heap.size() && rightChildIndex < heap.size()) {
            T leftChildValue = heap.get(leftChildIndex);
            T rightChildValue = heap.get(rightChildIndex);
            if (leftChildValue.compareTo(rightChildValue) >= 0) {
                maxChildIndex = leftChildIndex;
            } else if (rightChildValue.compareTo(leftChildValue) > 0) {
                maxChildIndex = rightChildIndex;
            } else {
                return;
            }
        } else if (leftChildIndex < heap.size() && heap.get(leftChildIndex).compareTo(indexValue) >= 0) {
            maxChildIndex = leftChildIndex;
        } else {
            return;
        }

        swap(index, maxChildIndex);
        siftDown(maxChildIndex);
    }

    private void swap(int firstElement, int secondElement) {
        T firstElementValue = heap.get(firstElement);
        heap.set(firstElement, heap.get(secondElement));
        heap.set(secondElement, firstElementValue);
    }

    public static <T extends Comparable<T>> Heap buildHeap(List<T> array) {
        return new Heap<>(array);
    }

    @Override
    public String toString() {
        return "Heap{" +
                "heap=" + heap +
                '}';
    }
}
