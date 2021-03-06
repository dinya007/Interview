package interview.interviews;

import java.util.Arrays;
import java.util.List;

public class RainyHills1 {

    public static int calculate(List<Integer> hills) {
        if (hills == null || hills.isEmpty()) {
            return 0;
        }

        Integer startValue = null;
        int[] counters = new int[hills.size()];

        for (int i = 0; i < hills.size(); i++) {
            if (startValue != null && (hills.get(i) <= startValue)) {
                counters[i] += startValue - hills.get(i);
            }

            if (startValue != null && (hills.get(i) > startValue)) {
                startValue = null;
            }

            if (startValue == null && (i != hills.size() - 1) && (hills.get(i + 1) < hills.get(i))) {
                startValue = hills.get(i);
            }
        }

        startValue = 0;

        for (int i = hills.size() - 1; i >= 0; i--) {
            if (startValue != null && (hills.get(i) <= startValue)) {
                counters[i] = Math.min(counters[i], startValue - hills.get(i));
            }

            if (startValue != null && (hills.get(i) > startValue)) {
                counters[i] = 0;
                startValue = null;
            }

            if (startValue == null && (i != 0) && (hills.get(i - 1) < hills.get(i))) {
                startValue = hills.get(i);
            }
        }

        return Arrays.stream(counters).sum();
    }

}
