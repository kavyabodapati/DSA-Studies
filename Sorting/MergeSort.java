import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] arr,int left, int right){


        if(left<right) {
            int mid = left + (right - left) / 2;


            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr,left,mid,right);
        }
    }
    public static void merge(int[] arr,int left,int mid,int right){
        int n1=mid-left+1;
        int n2=right-mid;
        int[] leftarray=new int[n1];
        int[] rightarray=new int[n2];
        for(int i=0;i<leftarray.length;i++){
            leftarray[i]=arr[left+i];
        }
        for(int j=0;j<rightarray.length;j++){
            rightarray[j]=arr[mid+1+j];
        }
        int i=0,j=0,k=left;
        while(i<n1&&j<n2){
            if(leftarray[i]<=rightarray[j]){
                arr[k]=leftarray[i];
                i++;
            }
            else{
                arr[k]=rightarray[j];
                j++;
            }
            k++;

        }
        while (i<n1)
            arr[k++]=leftarray[i++];
        while (j<n2)
            arr[k++]=rightarray[j++];
    }

    public static void main(String[] args) {
        int[] a={40,6,2,35,7,90,21};
        mergeSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
