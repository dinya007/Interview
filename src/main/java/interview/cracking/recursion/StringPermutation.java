package interview.cracking.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringPermutation {

    public static List<String> getAllPermutations(String string) {
        List<String> result = new ArrayList<>();

        if (string.length() == 2) {
            return Arrays.asList(string, new String(new char[]{string.charAt(1), string.charAt(0)}));
        }

        for (int i = 0; i < string.length(); i++) {
            List<String> allPermutations = getAllPermutations(getString(string, i));
            for (String permutation : allPermutations) {
                result.add(new String(new char[]{string.charAt(i)}) + permutation);

            }
        }

        return result;
    }

    private static String getString(String string, int cutIndex) {
        if (cutIndex < string.length()) {
            return string.substring(0, cutIndex) + string.substring(cutIndex + 1);
        } else {
            return string.substring(0, cutIndex);
        }
    }

}
