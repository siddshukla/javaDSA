package oops;

class box{
    private double m;
    double k=this.m;

    double l,b,h;
    box(){
        System.out.println(l+" "+b+" "+h);

    }
    box(double l,double b){
        this.l=l;
        this.b=b;
        System.out.println(this.l+" "+this.b);
    }
    box(double l,double b,double h,double m){
        this.l=l;
        this.b=b;
        this.h=h;
        this.m=m;
        System.out.println(this.l+" "+this.b+" "+this.h);
    }
    box(box b1){
        l=b1.l;
        b=b1.b;
        h=b1.h;
        System.out.println(l+" "+b+" "+h);
    }
}
public class inheritance {
    public static void main(String[] args) {
        box b1=new box();
        box b2=new box(3,4);
        box b3=new box(2,3,4,5);
        box b4=new box(b3);
        System.out.println(b3.k);

    }
}
