public class FindPeakElement {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        int res=bs(a);
        System.out.println("peak element is"+res);
    }
    public static int bs(int[] nums){
        int low=0;
        int high=nums.length-1;
        while(low<high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > nums[mid + 1]) {
                high=mid;
            }

            else
                low=mid+1;


        }
        return low;
    }
}
