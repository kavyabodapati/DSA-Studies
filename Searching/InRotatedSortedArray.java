//find the index of target in the rotated sorted array Ex:Input: arr = [4, 5, 6, 7, 0, 1, 2], target = 0
//Output: 4
//Approach: rendu sorted arrays unnay ye side di search cheyyali anedi we need to decide..
//so first ye side sort undo check cheyyali then the target should in the range of either low,mid or mid,high
// based on it we'll take the sides.
public class InRotatedSortedArray {
public static int bs(int[] nums,int target){
    int low=0;
    int high=nums.length-1;
    while(low<=high){
        int mid=low+(high-low)/2;
        if(nums[mid]==target){
            return mid;
        }
        if(nums[low]<=nums[mid]){//left side is sorted
            if(nums[low]<=target&&target<nums[mid])//if the target lies in the range
                high=mid-1;//search in left side
            else
                low=mid+1;//search in right side
        }
        else {//right side is sorted
            if (nums[high] >= target && target > nums[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
    }
    return -1;
}

    public static void main(String[] args) {
        int[] arr={4,5,6,0,1,2,3};
        int target=4;
        int res=bs(arr,target);
        System.out.println("kiki"+res);
    }
}
