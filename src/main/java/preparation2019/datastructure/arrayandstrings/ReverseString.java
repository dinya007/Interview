package preparation2019.datastructure.arrayandstrings;

public class ReverseString {

    public static void reverse(Character[] string) {
        if (string == null || string[0] == null) {
            return;
        }

        int endIndex = 0;
        Character character = string[endIndex];
        while (character != null) {
            ++endIndex;
            character = string[endIndex];
        }

        --endIndex;

        int startIndex = 0;
        while (startIndex < endIndex) {
            Character tmp = string[endIndex];
            string[endIndex] = string[startIndex];
            string[startIndex] = tmp;
            ++startIndex;
            --endIndex;
        }
    }
}
