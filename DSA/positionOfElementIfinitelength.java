package DSA;

import java.util.Scanner;

public class positionOfElementIfinitelength {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,10,13,17,19,56,69,77,887,90000,};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to search");
        int n= sc.nextInt();
        int search=findAns(arr,n);
        System.out.println(search);
    }
    static int findAns(int[] arr,int n){
        int start=0;
        int end=1;
        while(n>arr[end]){
            int newstart=end+1;
            end=end+(end-start+1)*2;
            start=newstart;
        }
        return binarySearch(arr,n,start,end);
    }
    static int binarySearch(int[] arr,int n,int a,int b){

        while (a<=b){
            int mid =a+(b-a)/2;
            if (arr[mid]>n){
                b=mid-1;
            }
            else if (arr[mid]<n) {
                a=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
