package preparation2019.datastructure.arrayandstrings;

public class StringUniqueCharacters {

    public static boolean isAllCharactersUniqueViaArray(char[] string) {
        boolean[] checks = new boolean[256];
        for (char character : string) {
            if (checks[(int) character]) {
                return false;
            }
            checks[(int) character] = true;
        }
        return true;
    }

    public static boolean isAllCharactersUniqueViaBitArray(char[] string) {
        int checks = 0;
        for (char character : string) {
            int newCharacter = 1 << (character - 1);
            if ((checks & newCharacter) != 0) {
                return false;
            }
            checks |= newCharacter;
        }
        return true;
    }

}
