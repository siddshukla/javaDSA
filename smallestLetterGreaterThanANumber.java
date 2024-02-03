import java.util.Scanner;

public class smallestLetterGreaterThanANumber {
    public static void main(String[] args) {
        char[] arr={'a','c','d','g','j'};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the character");
        String n=sc.next();
        System.out.println("the character is:"+smallestLetter(arr,n.charAt(0)));
    }
    public static char smallestLetter( char[] arr,char n){
        int a=0;
        int b= arr.length-1;
        while (a<=b){
            int mid =a+(b-a)/2;
            if (arr[mid]>n){
                b=mid-1;
            }
            else{
                a=mid+1;
            }
        }
        return arr[a%arr.length];
    }
}
