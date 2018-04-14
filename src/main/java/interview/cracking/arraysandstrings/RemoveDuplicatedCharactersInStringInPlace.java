package interview.cracking.arraysandstrings;

import java.util.ArrayList;

public class RemoveDuplicatedCharactersInStringInPlace {

    public static void main(String[] args) {
        char[] string = new char[]{'a', 'a', 'd', 'b', 'c', 'b', 'a', '0'};

        if (string == null || string.length < 2) {
            print(string);
        }

        int tail = 1;

        for (int i = 1; i < string.length - 1; i++) {
            int j;
            for (j = 0; j < tail; j++) {
                if (string[i] == string[j]) {
                    break;
                }
            }
            if (j == tail) {
                string[tail] = string[i];
                tail++;
            }
        }
        string[tail] = '0';

        print(string);
    }

    private static void print(char[] array) {
        ArrayList<Object> list = new ArrayList<>();
        for (char c : array) {
            if (c == '0') {
                break;
            }
            list.add(c);
        }
        System.out.println(list);
    }


}
