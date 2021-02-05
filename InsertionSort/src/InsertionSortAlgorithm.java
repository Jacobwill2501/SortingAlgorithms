import java.util.Arrays;
import java.util.Random;

public class InsertionSortAlgorithm {
    public static void main(String[] args) throws Exception {

        Random rd = new Random(); // creating Random object
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);// storing random integers in an array
        }

        // int[] array = { 3, 1, 2 };

        arr = insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] insertionSort(int[] arr) {

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++) {
            int newElement = arr[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && arr[i - 1] > newElement; i--) {
                arr[i] = arr[i - 1];
            }
            arr[i] = newElement;
        }

        return arr;
    }

}
