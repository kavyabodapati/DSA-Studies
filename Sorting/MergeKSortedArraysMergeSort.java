import java.util.Arrays;

//You are given K sorted arrays. Your task is to merge them into a single sorted array.
//Ex: Input: [[1, 4, 7], [2, 5, 8], [3, 6, 9]] Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]
public class MergeKSortedArraysMergeSort {
public static int[] mergeKSorted(int[][] arrays){
    if(arrays.length==0){
        return new int[0];
    }
    int[] merged=arrays[0];
    for(int i=1;i< arrays.length;i++){
        merged=mergeTwoArrays(merged,arrays[i]);
    }
    return merged;
}
public static int[] mergeTwoArrays(int[] arr1,int[] arr2){
    int n1=arr1.length;
    int n2=arr2.length;
    int[] merged=new int[n1+n2];
    int i=0,j=0,k=0;
    while(i<n1&&j<n2){
        if(arr1[i]<=arr2[j]){
            merged[k++]=arr1[i++];
        }
        else{
            merged[k++]=arr2[j++];
        }
    }
    while(i<n1){
        merged[k++]=arr1[i++];
    }
    while(j<n2){
        merged[k++]=arr2[j++];
    }
    return merged;
}

    public static void main(String[] args) {
        int[][] a={{1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}};
        int[] marray=mergeKSorted(a);
        System.out.println(Arrays.toString(marray));
    }
}
