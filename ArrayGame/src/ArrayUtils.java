public class ArrayUtils {
    /**
     * Overloaded versions of printArray
     * Prints specified array, one element per line.
     */
    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            prn(array[i]);
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            prn(array[i]);
        }
    }

    public static void printArray(long[] array) {
        for (int i = 0; i < array.length; i++) {
            prn(array[i]);
        }
    }

    public static void printArray(float[] array) {
        for (int i = 0; i < array.length; i++) {
            prn(array[i]);
        }
    }

    public static void printArray(char[] array) {
        for (int i = 0; i < array.length; i++) {
            prn(array[i]);
        }
    }

    public static void printArray(boolean[] array) {
        for (int i = 0; i < array.length; i++) {
            prn(array[i]);
        }
    }

    /**
     * Overloaded versions of createFilledArray.
     * Creates and returns an array of specified size, filled with specified value.
     */
    public static double[] createFilledArray(int size, double value) {
        double[] array = new double[size];

        for (int i = 0; i < size; i++) {
            array[i] = value;
        }

        return array;
    }

    public static float[] createFilledArray(int size, float value) {
        float[] array = new float[size];

        for (int i = 0; i < size; i++) {
            array[i] = value;
        }

        return array;
    }

    public static long[] createFilledArray(int size, long value) {
        long[] array = new long[size];

        for (int i = 0; i < size; i++) {
            array[i] = value;
        }

        return array;
    }

    public static int[] createFilledArray(int size, int value) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = value;
        }

        return array;
    }

    public static char[] createFilledArray(int size, char value) {
        char[] array = new char[size];

        for (int i = 0; i < size; i++) {
            array[i] = value;
        }

        return array;
    }

    public static boolean[] createFilledArray(int size, boolean value) {
        boolean[] array = new boolean[size];

        for (int i = 0; i < size; i++) {
            array[i] = value;
        }

        return array;
    }

    public static <T> void prn( T text){
        System.out.println(text);
    }
    public static <T> void prnt( T text){
        System.out.print(text);
    }
}
