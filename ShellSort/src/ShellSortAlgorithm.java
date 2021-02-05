import java.util.Arrays;
import java.util.Random;

public class ShellSortAlgorithm {
    public static void main(String[] args) throws Exception {

        Random rd = new Random(); // creating Random object
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);// storing random integers in an array
        }

        // int[] arr = { 20, 35, -15, 7, 55, 1, -22 };

        arr = shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] shellSort(int[] arr) {

        for (int gap = arr.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < arr.length; i++) {
                int newElement = arr[i];
                int j = i;

                while (j >= gap && arr[j - gap] > newElement) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }

                arr[j] = newElement;
            }

        }

        return arr;
    }

}
