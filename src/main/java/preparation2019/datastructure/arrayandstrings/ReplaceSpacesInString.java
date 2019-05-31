package preparation2019.datastructure.arrayandstrings;


public class ReplaceSpacesInString {

    public static void main(String[] args) {

    }

    public static Character[] replaceSpaces(Character[] string) {
        if (string == null) {
            return null;
        }

        int newStringSize = 0;

        for (Character character : string) {
            if (character != null && character == ' ') {
                newStringSize += 2;
            }
            ++newStringSize;
        }


        Character[] result = new Character[newStringSize];
        result[--newStringSize] = null;

        for (int i = string.length - 2; i >= 0; i--) {
            if (string[i] == ' ') {
                result[--newStringSize] = '0';
                result[--newStringSize] = '2';
                result[--newStringSize] = '%';
            } else {
                result[--newStringSize] = string[i];
            }
        }

        return result;
    }
}
