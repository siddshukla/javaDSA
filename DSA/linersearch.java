package DSA;

import java.util.Scanner;

public class linersearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr={2,1,3,4,5,6,2,};
        int b=linearSearch(arr,a);
        if (b==1){
            System.out.println("found the element");
        }
        else {
            System.out.println("not fond the element");
        }
    }
    public static int linearSearch(int[] arr,int n){
        if (arr.length==0){
            return -1;
        }
        else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]==n){
                    return 1;
                }
                else{
                    continue;
                }
            }
        }
    return -1;
    }
}
