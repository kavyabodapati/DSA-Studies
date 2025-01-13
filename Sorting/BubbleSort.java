//Bubble Sort Algorithm:
//Start at the beginning of the array.
//Compare the first element with the second. If the first element is larger, swap them.
//Move to the next pair of elements and repeat the process until the end of the array.
//After one pass through the array, the largest element will have "bubbled" up to the end of the array.
//Repeat the process for the remaining unsorted portion of the array (excluding the last sorted element).
//Continue until no swaps are needed, meaning the array is sorted.
import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={1,8,2,6,5};
        bus(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bus(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped=false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swapped=true;
                }

            }
            if (!swapped) {
                break;
            }
        }
    }
//    public static void bubbleSortDescending(int[] arr){
//        int n=arr.length;
//        for(int i=)
//    }
}
