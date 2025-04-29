public class RotatateArrayByK {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int k=3;
        int n=a.length;

int[] s=new int[a.length];
        for(int i=0;i<k;i++){
            s[i]=a[n-k+i];
        }
        for(int i=k;i<n;i++){
            s[i]=a[i-k];
        }
        for(int i:s){
            System.out.println(i);
        }
    }
}
