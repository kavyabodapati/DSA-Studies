public class Reverse {
    public static void main(String args[]){
        int[] a={1,2,3,4,5};
        int temp=0;
        int n= a.length-1;
        for(int i=0;i<a.length/2;i++){
            temp=a[i];
            a[i]=a[n-i];
            a[n-i]=temp;
        }
        for(int i:a) {
            System.out.println(i);
        }
    }
}
