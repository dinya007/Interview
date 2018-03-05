package interview.cracking.algorithm;

public class Utils {

    public  static boolean checkSort(int[] array) {
        int lastValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < lastValue) {
                return false;
            }
            lastValue = array[i];
        }
        return true;
    }

}
