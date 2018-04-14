package interview.interviews;

import java.util.*;

public class FindMedianElementsInContinuouslyGrowingArray {

    public static void main(String[] args) {
        System.out.println(findMedianElements(Arrays.asList(4, 3, 1, 5, 2), 3));
        System.out.println(findMedianElements(Arrays.asList(Integer.MIN_VALUE, -4, -2, 5, 10), 3));
        System.out.println(findMedianElements(Arrays.asList(Integer.MIN_VALUE, -4, -2, 5, Integer.MAX_VALUE), 5));
        System.out.println(findMedianElements(Arrays.asList(283, 3, 34, 99, 22, 4, 16), 3));


        System.out.println(findLargestElements(Arrays.asList(4, 3, 1, 5, 2), 3));
        System.out.println(findLargestElements(Arrays.asList(283, 3, 34, 99, 22, 4, 16), 3));
    }

    private static Set<Integer> findLargestElements(Iterable<Integer> iterable, int requestedSize) {
        if (iterable == null) {
            return new TreeSet<>();
        }

        TreeSet<Integer> biggestNumbers = new TreeSet<>();

        for (Integer number : iterable) {
            if (biggestNumbers.contains(number)) {
                continue;
            }
            if (biggestNumbers.size() >= requestedSize && biggestNumbers.first() < number) {
                biggestNumbers.remove(biggestNumbers.first());
                biggestNumbers.add(number);
            } else if (biggestNumbers.size() < requestedSize) {
                biggestNumbers.add(number);
            }
        }

        return biggestNumbers;
    }

    private static Set<Integer> findMedianElements(Iterable<Integer> iterable, int requestedSize) {
        if (iterable == null) {
            return new HashSet<>();
        }

        SignedBeatSet bitSet = new SignedBeatSet();


        for (Integer integer : iterable) {
            bitSet.set(integer);
        }

        int size = bitSet.cardinality();
        int firstElement = bitSet.nextSetBit(Integer.MIN_VALUE);
        for (int i = 0; i < size / 2 - requestedSize / 2; i++) {
            firstElement = bitSet.nextSetBit(firstElement + 1);
        }

        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < requestedSize; i++) {
            result.add(firstElement);
            firstElement = bitSet.nextSetBit(firstElement + 1);
        }

        return result;
    }

    private static class SignedBeatSet {

        private final BitSet negativeBitSet;
        private final BitSet positiveBitSet;
        private final Integer rotation = Integer.MIN_VALUE;

        private SignedBeatSet() {
            negativeBitSet = new BitSet();
            positiveBitSet = new BitSet();
        }

        public int cardinality() {
            return negativeBitSet.cardinality() + positiveBitSet.cardinality();
        }

        public void set(int number) {
            if (number < 0) {
                negativeBitSet.set(number + rotation);
            } else {
                positiveBitSet.set(number);
            }
        }

        public int nextSetBit(int number) {
            if (number < 0) {
                int nextBit = negativeBitSet.nextSetBit(number + rotation);
                if (nextBit == -1) {
                    return positiveBitSet.nextSetBit(0);
                }
                return nextBit - rotation;
            } else {
                return positiveBitSet.nextSetBit(number);
            }
        }
    }

}
