public class Task3 {

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     * IllegalArgumentException
     */
    public static int multiArithmeticElements(int a1, int t, int n) {
        if (n <= 0) {
            throw new IllegalArgumentException();
        }
        int result = a1;
        int[] progression = new int[n-1];
        for (int i = 0; i < n-1; i++) {
            progression[i] = a1 + t;
            a1 += t;
        }

        for (int a : progression) {
            result *= a;
        }
        return result;
    }
}

