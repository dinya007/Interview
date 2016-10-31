package interview.cracking.arraysandstrings;

public class RemoveNotUniqueCharactersInString {

    private static int checker = 0;
    private static int lastIndex = 0;

    public static void main(String[] args) {
        char[] string = new char[]{'a', 'a', 'd', 'b', 'c', 'b', 'a'};

        lastIndex = string.length - 1;

        for (int i = 0; i < lastIndex; i++) {
            char character = string[i];
            if (isDuplicated(character)) {
                System.out.println("duplicated character: " + character);
                swapWithLast(i, string);
                --i;
            }
        }

        for (int i = 0; i < string.length - lastIndex; i++) {
            System.out.println(string[i]);
        }

    }

    private static void swapWithLast(int index, char[] string) {
        char swapper = string[lastIndex];
        string[lastIndex] = string[index];
        string[index] = swapper;
        --lastIndex;
    }

    private static boolean isDuplicated(char character) {
        int value = character - 'a';
        if ((checker & (1 << value)) > 0) return true;
        checker |= (1 << value);
        return false;
    }

}
