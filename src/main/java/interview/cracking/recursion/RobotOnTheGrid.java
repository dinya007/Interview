package interview.cracking.recursion;

public class RobotOnTheGrid {

    public static int move(int i, int j, int max) {
        int result = 0;

        if (i < max - 1) {
            result += move(i + 1, j, max);
        } else {
            return 1;
        }

        if (j < max - 1) {
            result += move(i, j + 1, max);
        } else {
            return 1;
        }

        return result;
    }

}
