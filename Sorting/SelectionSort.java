import java.util.Arrays;

//Selection sort: finds min in the array nd sorts it to the first position nd continues in the sub array i.e., from the second index in the second pass nd so on nd swaps it
//used effectively to find min/max
//Ex: a={4,56,7,1}
public class SelectionSort {
    public static void ses(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }

            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }

    public static void main(String[] args) {
        int[] arr={4,56,7,1};
        ses(arr);
        System.out.println(Arrays.toString(arr));
        for (int i:arr)
            System.out.println(i);
    }
}
