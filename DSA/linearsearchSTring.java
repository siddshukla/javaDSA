package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class linearsearchSTring{
    public static void main(String[] args) {
        String name="siddharth shukla";
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        boolean a=search(name,c);
        System.out.println(a);
        if (a==true){
            System.out.println("found");
        }
        else {
            System.out.println("not found");
        }
    }
    static boolean search(String str ,char a){
        if (str.length() ==0){
        return false;

        }
        for (char ch:str.toCharArray()) {
            if (a==ch){
                return true;
            }
            else{
                continue;
            }
        }
        return false;
    }
}
