import java.util.Scanner;

public class ceilingNumber {
    public static void main(String[] args) {
// the first criteria is that, array must be in either ascending or descending order
        int[] arr={2,3,4,5,6,10,13,17,19,56,69,77,887,90000,};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to search");
        int n= sc.nextInt();
        int search=binarysearch(arr,n);
        if (search==-1){
            System.out.println("not present");
        }
        else {
            System.out.println("the ceiling of a number "+n+"is:"+arr[search]);
        }
    }
    static int binarysearch(int[] arr,int n){
        int a=0;
        int b= arr.length-1;
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
        return a;
    }
}
