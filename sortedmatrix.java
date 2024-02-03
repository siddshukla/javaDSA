public class sortedmatrix {
    public static void main(String[] args) {

    }
    static int[] binarysearch(int[][] arr,int row,int cStart,int cEnd,int n){
        while (cStart<=cEnd){
            int mid=cEnd+(cEnd-cStart)/2;
            if (arr[row][mid]==n){
                return new int[]{row,mid};
            }
            else if(arr[row][mid]<n) {
                cStart=mid+1;
            }
            else {
                cEnd=mid-1;

            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] arr,int n){
        int rows= arr.length;
        int cols= arr[0].length;
        return new int[]{-1,-1} ;
    }
}
