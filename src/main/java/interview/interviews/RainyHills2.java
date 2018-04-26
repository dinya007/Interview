package interview.interviews;

import java.util.List;

public class RainyHills2 {

    public static int calculate(List<Integer> hills) {
        if (hills == null || hills.isEmpty()) {
            return 0;
        }

        int leftMaxValue = 0;
        int rightMaxValue = 0;
        int leftPointer = 0;
        int rightPointer = hills.size() - 1;
        int counter = 0;

        while (leftPointer < rightPointer) {
            if (hills.get(leftPointer) >= leftMaxValue) {
                leftMaxValue = hills.get(leftPointer);
            }

            if (hills.get(rightPointer) > rightMaxValue) {
                rightMaxValue = hills.get(rightPointer);
            }

            if (leftMaxValue >= rightMaxValue) {
                counter += rightMaxValue - hills.get(rightPointer);
                --rightPointer;
            } else {
                counter += leftMaxValue - hills.get(leftPointer);
                ++leftPointer;
            }
        }

        return counter;
    }
}
