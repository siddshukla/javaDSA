package oops;
//polymorphism-poly means manny and morphism means ways to represent
class demo1{
//    static methhod
    private int i=9;
    static void dem(){
        System.out.println("hello");
    }
     double s(){
        return i;
    }
}
class s1{
    class s2{
        s2(){
            System.out.println("hello inner class");
        }
    }
}
public class oops3 {
    public static void main(String[] args) {
        demo1.dem();
        demo1 d=new demo1();
        s1.s2 sc=new s1().new s2();
        System.out.println(d.s());

    }
}
