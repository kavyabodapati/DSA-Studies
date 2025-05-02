public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] a={0,1,1,0,0,1,1,1,0};
        int count=0;
        int max=0;
        for(int i:a){
            if(i==1){
                count++;
                max=Math.max(count,max);
            }
            else
                count=0;
        }
        System.out.println(max);
    }
}
