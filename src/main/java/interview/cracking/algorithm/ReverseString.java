package interview.cracking.algorithm;

public class ReverseString {


    public static void main(String[] args) {
        String string1 = "string";
        String string2 = "sting";

        System.out.println(reverseString(string1));
        System.out.println(reverseString(string2));

        System.out.println(reverseStringRecursively(string1));
        System.out.println(reverseStringRecursively(string2));
    }

    private static String reverseStringRecursively(String string) {
        if (string == null || string.isEmpty()) {
            return string;
        }

        return reverseStringRecursively(string.substring(1)) + string.charAt(0);
    }

    private static String reverseString(String string) {
        if (string == null || string.isEmpty()) {
            return string;
        }


        char[] chars = string.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i < j) {
            char tmp = chars[i];
            chars[i] = chars[j];
            chars[j] = tmp;
            i++;
            j--;
        }
        return new String(chars);
    }

}
