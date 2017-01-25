public class A {

    static {
        System.out.println("A");
    }
    public A (){
        print();
    }

    public static void main(String[] args) {
        new B();
    }

    public void print() {
        System.out.println("A");
    }

}

class B extends A {

    static {
        System.out.println("B");
    }
    double x = Math.PI;

    {

    }

    public B() {
        print();
    }

    @Override
    public void print() {
        System.out.println(x);
    }
}