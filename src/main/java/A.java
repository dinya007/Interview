public class A {

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

    double x = Math.PI;

    public B() {
        print();
    }

    @Override
    public void print() {
        System.out.println(x);
    }
}