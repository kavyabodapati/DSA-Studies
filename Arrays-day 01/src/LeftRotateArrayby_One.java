public class LeftRotateArrayby_One {
    public static void rotateArrayByOne(int[] nums) {
        int[] k=new int[nums.length];
        int lst=k.length;
        int index=0;
        for(int i=1;i<nums.length;i++){
            k[index++]=nums[i];

        }
        k[index]=nums[0];
        for(int i:k){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        rotateArrayByOne(a);
    }
}
