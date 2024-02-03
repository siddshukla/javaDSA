package DSA;

import java.util.Scanner;

public class orderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr={10,9,8,7,6,5,4,2,0};
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int search=orderAgnosticSearch(arr,n);
        if (search==-1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Element is found at position:"+search);
        }
    }
    static int orderAgnosticSearch(int[] Arr,int n){
        int start=0;
        int end= Arr.length-1;

        boolean isAsc=Arr[start]<Arr[end];
        while (start<=end){
            int mid=start+(end-start)/2;
            if (Arr[mid]==n){
                return mid;
            }
            else if (isAsc){
                if (Arr[mid]>n){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if (Arr[mid]<n){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
