public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] a={0,1,2,0,3,4};
        int index=0;
        int[] k=new int[a.length];
        for(int i=0;i<a.length;i++){

            if(a[i]!=0){

k[index]=a[i];
index++;
            }

        }
        for(int i:k){
            System.out.println(i);
        }
    }
}
