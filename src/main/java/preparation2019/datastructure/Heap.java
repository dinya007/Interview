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

    public static <T extends Comparable<T>> Heap<T> buildHeap(List<T> array) {
        return new Heap<>(array);
    }

    public void push(T element) {
        if (element == null) {
            throw new IllegalArgumentException();
        }
        heap.add(element);
        siftUp(heap.size() - 1);
    }

    public T poll() {
        if (heap.isEmpty()) {
            return null;
        }

        T result = heap.get(0);
        int lastElementIndex = heap.size() - 1;
        heap.set(0, heap.get(lastElementIndex));
        heap.remove(lastElementIndex);

        if (!heap.isEmpty()) {
            siftDown(0);
        }
        return result;
    }

    private void siftUp(int index) {
        int parentIndex = (index - 1) / 2;
        while (index > 0) {
            if (heap.get(parentIndex).compareTo(heap.get(index)) < 0) {
                swap(parentIndex, index);
                index = parentIndex;
                parentIndex = (index - 1) / 2;
            } else {
                return;
            }
        }
    }


    private void siftDown(int index) {
        int leftChildIndex = 2 * index + 1;
        int rightChildIndex = 2 * index + 2;
        T indexValue = heap.get(index);

        int maxChildIndex;
        if (exists(rightChildIndex)) {
            T leftChildValue = heap.get(leftChildIndex);
            T rightChildValue = heap.get(rightChildIndex);
            if (leftChildValue.compareTo(rightChildValue) > 0) {
                maxChildIndex = leftChildIndex;
            } else if (rightChildValue.compareTo(leftChildValue) > 0) {
                maxChildIndex = rightChildIndex;
            } else {
                return;
            }
        } else if (exists(leftChildIndex) && heap.get(leftChildIndex).compareTo(indexValue) >= 0) {
            maxChildIndex = leftChildIndex;
        } else {
            return;
        }

        swap(index, maxChildIndex);
        siftDown(maxChildIndex);
    }

    private boolean exists(int index) {
        return index < heap.size();
    }


    private void swap(int firstElement, int secondElement) {
        T firstElementValue = heap.get(firstElement);
        heap.set(firstElement, heap.get(secondElement));
        heap.set(secondElement, firstElementValue);
    }

    @Override
    public String toString() {
        return "Heap{" +
                "heap=" + heap +
                '}';
    }
}
