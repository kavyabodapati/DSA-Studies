import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort2 {
    public static int[] quickSort(int[] arr,int pivot){
        if(arr.length<=1){
            return arr;
        }
        int[] left=new int[arr.length];
        int[] right=new int[arr.length];
        int lindex=0,rindex=0;

        for(int i:arr){
            if(i<pivot){
                left[lindex++]=i;
            }
            else if(i>pivot){
                right[rindex++]=i;
            }
        }

        left=quickSort(Arrays.copyOfRange(left,0,lindex),pivot);
        right=quickSort(Arrays.copyOfRange(right,0,rindex),pivot);
        int[] result=new int[left.length+right.length];
        System.arraycopy(left,0,result,0,left.length);

        System.arraycopy(right,0,result,left.length,right.length);
        return result;
    }

    public static void main(String[] args) {
        int[] a={65,2,45,0,2,6,3};
        int p=35;
        int[] sorted=quickSort(a,p);
        System.out.println(Arrays.toString(sorted));
    }
}
