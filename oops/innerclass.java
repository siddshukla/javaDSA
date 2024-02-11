package oops;

 class innerclass {
    class inner{
        int n;
        inner(int n){
            this.n=n;
        }
    }

    public static void main(String[] args) {
        innerclass.inner n=new innerclass().new inner(6);
        System.out.println(n.n);
    }
}
