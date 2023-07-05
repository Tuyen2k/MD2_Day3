package thu_hanh;

public class FindMinimum {
    public static void main(String[] args) {
        int[] array = {54, 3, 5, 5, 48, 55};
        int min = minimum(array);
        System.out.println("Minimum in array: " + min);
    }

    public static int minimum(int[] array) {
        int min = array[0];
        for (int value : array) {
            if (min > value) {
                min = value;
            }
        }
        return min;
    }
}
