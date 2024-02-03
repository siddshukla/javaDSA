package DSA;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr={2,1,3,4,10,88,54,36};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblesort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j <=i; j++) {
                if (arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                else {
                    continue;
                }
            }
        }
    }
}
