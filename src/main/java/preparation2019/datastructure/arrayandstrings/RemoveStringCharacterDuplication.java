package preparation2019.datastructure.arrayandstrings;

public class RemoveStringCharacterDuplication {

    public static void removeDuplications(Character[] string) {
        if (string == null) {
            return;
        }

        int current = 0;
        Character currentValue = string[current];
        int next = current;
        Character nextValue = currentValue;
        int insertIndex = 1;

        while (currentValue != null) {
            while (nextValue != null) {
                ++next;
                nextValue = string[next];
                if (currentValue != nextValue) {
                    string[insertIndex] = nextValue;
                    ++insertIndex;
                }
            }
            ++current;
            currentValue = string[current];
            insertIndex = current + 1;
            next = current;
            nextValue = currentValue;
        }
    }


}
