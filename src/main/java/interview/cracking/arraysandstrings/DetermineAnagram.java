package interview.cracking.arraysandstrings;

public class DetermineAnagram {

    private static char[] string2 = "cab".toCharArray();

    public static boolean isAnagram(char[] string1, char[] string2) {
        if (string1 == null || string2 == null) throw new RuntimeException("String don't have to be null");

        byte[] usedChars = new byte[256];
        int uniqueCharsCount = 0;

        for (char symbol : string1) {
            if (usedChars[symbol] == 0) ++uniqueCharsCount;
            ++usedChars[symbol];
        }

        for (char symbol : string2) {
            --usedChars[symbol];
            if (usedChars[symbol] == 0) --uniqueCharsCount;
            if (usedChars[symbol] == -1) return false;
        }

        return uniqueCharsCount == 0;
    }


}
