import java.util.Arrays;
import java.util.Random;

public class SelectionSortAlgorithm {
    public static void main(String[] args) {

        Random rd = new Random(); // creating Random object
        int[] arr = new int[25];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);// storing random integers in an array
        }

        // int[] array = { 3, 1, 2 };

        arr = selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] selectionSort(int[] arr) {

        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for (int i = 0; i <= lastUnsortedIndex; i++) {
                if (arr[i] > arr[largest]) {
                    largest = i;
                }
            }
            swap(arr, lastUnsortedIndex, largest);
        }

        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
