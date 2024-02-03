package oops;

public class wrapperclasses {
    public static void main(String[] args) {
        int a=10;
        int b=30;
        Integer num=45;//wrapper class
        String s=num.toString();
        wrapperclasses s1=new wrapperclasses();
        s1.swap(a,b);
        System.out.println(a+" "+b);

    }
     void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
}
class a{
    int a=4;
    int b=5;

}
