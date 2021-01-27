import java.util.Arrays;
import java.util.Random;

public class BubbleSortAlgorithm {
    public static void main(String[] args) throws Exception {

        Random rd = new Random(); // creating Random object
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);// storing random integers in an array
        }

        int[] array = { 3, 1, 2 };

        arr = bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static int[] bubbleSort(int[] arr) {
        int endSortPartition = arr.length - 1;

        // if array 1 or 0 in length, it is already sorted
        if (endSortPartition + 1 < 2) {
            System.out.println("Length of 1 or 0, SORTED");
            return arr;
        }

        // SORTING
        while (endSortPartition != 0) { // once 0 is reached, array is sorted so end loop
            int swapNumber = 0;

            for (int i = 0; i < endSortPartition; i++) { // iterate through each index in array
                if (arr[i] > arr[i + 1]) { // if left is greater than right, bubble left value to the right
                    swap(arr, i, i + 1);
                    swapNumber++; // add to show a swap has been done
                }
            }

            // if no swaps are done, then the array is sorted
            if (swapNumber == 0) {
                System.out.println("No swaps made, SORTED");
                return arr;
            }

            // reduce end position of the unsorted partition
            endSortPartition--;
        }

        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
