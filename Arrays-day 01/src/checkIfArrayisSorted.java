public class checkIfArrayisSorted {
        public static boolean arraySortedOrNot(int[] arr, int n) {
            boolean c=false;
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]<arr[i+1]){

                    c=true;
                }
else{
    return false;
                }
            }
            return c;
        }

    public static void main(String[] args) {
        int[] a={1,2,3,4};
        int[] b={5,4,6,7,8};
        boolean res=arraySortedOrNot(a,4);
        boolean res2=arraySortedOrNot(b,4);
        System.out.println(res);
        System.out.println(res2);
    }
    }
