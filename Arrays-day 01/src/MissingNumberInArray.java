public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] a={0,2,3,4,5,6};
        for(int i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1]-1){
                System.out.println(a[i+1]-1);
            }
        }
    }
}
