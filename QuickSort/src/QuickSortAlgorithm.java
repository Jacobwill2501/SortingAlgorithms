import java.util.Arrays;
import java.util.Random;

public class QuickSortAlgorithm {
    public static void main(String[] args) throws Exception {

        Random rd = new Random(); // creating Random object
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);// storing random integers in an array
        }

        // int[] array = { 3, 1, 2 };

        //arr = quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] input, int start, int end){

    }

}
