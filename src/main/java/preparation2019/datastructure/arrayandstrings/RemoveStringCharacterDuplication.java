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
        Integer insertIndex = null;

        while (currentValue != null) {
            while (nextValue != null) {
                ++next;
                nextValue = string[next];






                if (currentValue == nextValue && insertIndex == null) {
                    insertIndex = next;
                }
                string[insertIndex] = nextValue;

            }
            ++current;
            currentValue = string[current];
            insertIndex = 0;
            next = current;
            nextValue = currentValue;
        }
    }


}
