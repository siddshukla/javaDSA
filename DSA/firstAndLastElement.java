package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class firstAndLastElement {
    public static void main(String[] args) {
        int[] arr={2,33,33,56,56,56,56,76,89,99};
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1=findFirstAndLast(arr,n);
        System.out.println(Arrays.toString(arr1));
    }
    static int[] findFirstAndLast(int[] arr, int n){
        int[] ans={-1,-1};
        int start=search(arr,n,true);
        int end=search(arr,n,false);
        ans[0]=start;
        ans[1]=end;
        return  ans;
    }
    static int search(int[] arr,int n,boolean findStartIndex){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid =start +(end-start)/2;
            if(arr[mid]>n){
                end=mid-1;
            }
            else if (arr[mid]<n) {
                start=mid+1;
            }
            else {
                ans =mid;
                if (findStartIndex){
                    end=mid-1;

                }
                else {
                    start=mid+1;
                }

            }
        }
        return ans;
    }
}
