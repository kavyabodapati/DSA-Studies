public class removeDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int index=1;

for(int i=1;i<nums.length;i++){
    if(nums[i]!=nums[i-1]){
        nums[index]=nums[i];
        index++;

    }


}
//for(int i:nums){
//    System.out.println(i);
//}
return index;
    }

    public static void main(String[] args) {
        int[] a={-2, 2, 4, 4, 4, 4, 5, 5};
        int res=removeDuplicates(a);
        System.out.println(res);
    }
}
