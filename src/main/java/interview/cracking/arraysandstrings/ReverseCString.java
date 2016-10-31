package interview.cracking.arraysandstrings;

public class ReverseCString {

    private static char END_CHARACTER = '|';

    public static void main(String[] args) {
        char[] string = new char[]{'a','b','c','d',END_CHARACTER};

        int currentIndex = 1;
        int prevIndex = 0;

        if (string[currentIndex] == END_CHARACTER) return;

        do {
            swapTillStart(string, prevIndex, currentIndex);
            ++prevIndex;
            ++currentIndex;
        } while (string[currentIndex] != END_CHARACTER);

        print(string);

    }

    private static void swapTillStart(char[] string, int prevIndex, int currentIndex) {
        do {
            swap(string, currentIndex, prevIndex);
            --prevIndex;
            --currentIndex;
        } while (prevIndex != -1);
    }

    private static void swap(char[] array, int from, int to) {
        char swap = array[to];
        array[to] = array[from];
        array[from] = swap;
    }


    private static void print(char[] array) {
        StringBuilder result = new StringBuilder();
        for (Character character : array) {
            result.append(character).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
