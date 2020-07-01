
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
// indices:      0  1  2  3  4
        int[] numbers = {6, 5, 8, 7, 11};
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            MainProgram.swap(array, i, MainProgram.indexOfSmallestFrom(array, i));

        }

    }

    public static int smallest(int[] array) {

        int smallest = Integer.MAX_VALUE;

        for (int n : array) {
            if (n < smallest) {
                smallest = n;
            }
        }

        return smallest;
    }

    public static int indexOfSmallest(int[] array) {

        int smallest = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                index = i;
                smallest = array[i];
            }
        }

        return index;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {

        int smallest = Integer.MAX_VALUE;
        int index = 0;

        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < smallest) {
                index = i;
                smallest = array[i];
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {

        int segurar = array[index1];
        array[index1] = array[index2];
        array[index2] = segurar;

    }
}
