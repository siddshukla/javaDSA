package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch2D {
    public static void main(String[] args) {
        int[][] arr={
                {1, 2, 3},
                {43, 54, 69},
                {47, 58, 73}
        };
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1=binarysearch2d(arr,n);
        System.out.println("the element found at position:"+Arrays.toString(arr1));

    }
    //row-column matrix
    static int[] binarysearch2d(int[][] arr,int n){
        int r=0;
        int c=arr.length-1;
        while (r< arr.length&&c>=0){
            if (n==arr[r][c]){
                return new  int[]{r,c};
            } else if (arr[r][c]<n) {
                r++;
            }
            else {
                c--;
            }
        }
      return new int[]{-1,-1};
    }
    //sorted matrix

}
