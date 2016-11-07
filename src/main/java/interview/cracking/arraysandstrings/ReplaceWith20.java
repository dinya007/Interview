package interview.cracking.arraysandstrings;

import java.util.Arrays;

public class ReplaceWith20 {

    public static void main(String[] args) {
        char[] prepareString = "abc def ghi".toCharArray();
        int n = prepareString.length;
        char[] string = new char[n + 2 * 2];
        System.arraycopy(prepareString, 0, string, 0, n);

        char[] result = replace(string, n);
        System.out.println(Arrays.deepToString(Arrays.asList(result).toArray()));
    }

    private static char[] replace(char[] string, int n) {
        int spaceCount = 0;
        for (int i = 0; i < n; i++) {
            if (string[i] == ' ') ++spaceCount;
        }

        int newLength = n + spaceCount * 2 - 1;

        for (int i = n - 1; i > 0; i--) {
            if (string[i] == ' ') {
                string[newLength] = '0';
                string[newLength - 1] = '2';
                string[newLength - 2] = '%';
                newLength -= 3;
            } else {
                string[newLength] = string[i];
                --newLength;
            }
        }
        return string;
    }

}
