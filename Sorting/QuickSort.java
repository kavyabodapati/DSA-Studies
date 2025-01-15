//Quick Sort when pivot is given as input in main
// it is adding pivot into the array even if pivot is not present in the input array
import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {
    public static int[] quickSort(int[] arr,int pivot){
        if(arr.length<=1){
            return arr;
        }
        ArrayList<Integer>larr=new ArrayList<>();
        ArrayList<Integer>rarr=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]<pivot){
                larr.add(arr[i]);
            }
            else if(arr[i]>pivot){
                rarr.add(arr[i]);
            }
        }
//        covert arraylists to arrays
        int[] left=larr.stream().mapToInt(Integer::intValue).toArray();
        int[] right=rarr.stream().mapToInt(Integer::intValue).toArray();
        left=quickSort(left,left.length>0?left[left.length/2]:0);
        right=quickSort(right,right.length>0?right[right.length/2]:0);
        int[] result=new int[left.length+right.length+1];
        System.arraycopy(left,0,result,0,left.length);
       result[left.length]=pivot;
        System.arraycopy(right,0,result,left.length+1,right.length);
        return result;
    }

    public static void main(String[] args) {
        int[] a={65,2,45,0,2,6,3};
        int p=35;
        int[] sorted=quickSort(a,p);
        System.out.println(Arrays.toString(sorted));
    }
}
