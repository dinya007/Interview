package preparation2019.datastructure.arrayandstrings;

import java.util.HashMap;
import java.util.Map;

public class AnagramDetector {

    public static boolean isAnagram(String string1, String string2) {
        if (string1 == null || string2 == null) {
            return false;
        }

        Map<Character, Integer> counter = new HashMap<>();

        for (char character : string1.toCharArray()) {
            counter.merge(character, 1, Integer::sum);
        }

        for (char character : string2.toCharArray()) {
            Integer count = counter.get(character);
            if (count == null || count == 0) {
                return false;
            }

            --count;
            if (count == 0) {
                counter.remove(character);
            } else {
                counter.put(character, count);
            }
        }

        return counter.isEmpty();
    }

}
