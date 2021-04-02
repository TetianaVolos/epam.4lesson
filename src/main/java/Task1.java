public class Task1 {

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     *  IllegalArgumentException
     */
    public static boolean isSorted(int[] array, SortOrder order) {
        boolean result = true;

        if (array == null || array.length == 0) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < array.length; i++) {
            if (i + 1 == array.length) {
                break;
            }
            if (order == SortOrder.ASC && array[i] > array[i + 1]) {
                    result = false;
                    break;
                }
            if (order == SortOrder.DESC && array[i] < array[i + 1]) {
                    result = false;
                    break;
            }
        }
        return result;
    }
}

