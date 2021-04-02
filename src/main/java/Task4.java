public class Task4 {

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     * IllegalArgumentException
     */
    public static double sumGeometricElements(int a1, double t, int alim) {
        if (t >= 1 || t <= 0 || a1 <= 0 || alim <= 0 || alim >= a1) {
            throw new IllegalArgumentException();
        }


        double result = 0;
        int an = a1;
        while (an > alim) {
            result += an;
            an *= t;
        }
        return result;
    }
}

