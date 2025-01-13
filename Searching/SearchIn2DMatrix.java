//since the elements r sorted in the 2D array we can treat it as 1D
//in order to get the index in a 2D array : row=index/n;col=index%n; (since we can have mid as common we took mid as index to calculate)
public class SearchIn2DMatrix {
    public static void main(String[] args) {
        int[][] matrix={{1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}};
        int target=34;
        boolean res=bs(matrix,target);
        System.out.println("The target element is"+res);
    }
    public static boolean bs(int[][] nums,int target){
        int rows=nums.length;
        int cols=nums[0].length;
        int low=0;
        int high=rows*cols-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int row=mid/cols;
            int col=mid%cols;
            int value=nums[row][col];
            if(value==target){
                return true;
            }
            else if(value<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
}
