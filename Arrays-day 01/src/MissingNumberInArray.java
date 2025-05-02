public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] a = {0, 2, 3, 4, 1, 6};
        int res = missingNumber(a);
        System.out.println(res);
//        for(int i=0;i<a.length-1;i++){
//            if(a[i]!=a[i+1]-1){
//                System.out.println(a[i+1]-1);
//            }
//        }
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int esum = n * (n + 1) / 2;
        int asum = 0;
        for (int i : nums) {
            asum += i;
        }
        return esum - asum;
    }
}
