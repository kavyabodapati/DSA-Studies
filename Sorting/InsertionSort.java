public class InsertionSort {
    public static void ins(int[] arr){
        for(int i=0;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while (j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;

            }
            arr[j+1]=key;
//            for(int j=i+1;j<arr.length-i;i++){
//                if(arr[j]<arr[i]){
//                    int temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
        }
    }
    public static void main(String[] args) {
int[] arr={7,3,61,5,9};
ins(arr);
        for(int i:arr){
            System.out.print(i+" , ");
        }
    }
}
